package com.datadog.trace.core.tagprocessor;

/* loaded from: classes8.dex */
public class QueryObfuscator implements com.datadog.trace.core.tagprocessor.TagsPostProcessor {
    private static final com.datadog.trace.logger.Logger Camera2StreamConfigurationMap = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.core.tagprocessor.QueryObfuscator.class);
    private final com.google.re2j.Pattern getHighResolutionOutputSizeshNQ4ISI;

    public QueryObfuscator(java.lang.String str) {
        com.google.re2j.Pattern pattern = null;
        if ("".equals(str)) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            return;
        }
        str = str == null ? "(?i)(?:(?:\"|%22)?)(?:(?:old[-_]?|new[-_]?)?p(?:ass)?w(?:or)?d(?:1|2)?|pass(?:[-_]?phrase)?|secret|(?:api[-_]?|private[-_]?|public[-_]?|access[-_]?|secret[-_]?|app(?:lication)?[-_]?)key(?:[-_]?id)?|token|consumer[-_]?(?:id|key|secret)|sign(?:ed|ature)?|auth(?:entication|orization)?)(?:(?:\\s|%20)*(?:=|%3D)[^&]+|(?:\"|%22)(?:\\s|%20)*(?::|%3A)(?:\\s|%20)*(?:\"|%22)(?:%2[^2]|%[^2]|[^\"%])+(?:\"|%22))|(?:bearer(?:\\s|%20)+[a-z0-9._\\-]+|token(?::|%3A)[a-z0-9]{13}|gh[opsu]_[0-9a-zA-Z]{36}|ey[I-L](?:[\\w=-]|%3D)+\\.ey[I-L](?:[\\w=-]|%3D)+(?:\\.(?:[\\w.+/=-]|%3D|%2F|%2B)+)?|-{5}BEGIN(?:[a-z\\s]|%20)+PRIVATE(?:\\s|%20)KEY-{5}[^\\-]+-{5}END(?:[a-z\\s]|%20)+PRIVATE(?:\\s|%20)KEY(?:-{5})?(?:\\n|%0A)?|(?:ssh-(?:rsa|dss)|ecdsa-[a-z0-9]+-[a-z0-9]+)(?:\\s|%20|%09)+(?:[a-z0-9/.+]|%2F|%5C|%2B){100,}(?:=|%3D)*(?:(?:\\s|%20|%09)+[a-z0-9._-]+)?)" : str;
        try {
            pattern = com.google.re2j.Pattern.compile(str);
        } catch (com.google.re2j.PatternSyntaxException e) {
            Camera2StreamConfigurationMap.error("Could not compile given query obfuscation regex: {}", str, e);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = pattern;
    }

    @Override // com.datadog.trace.core.tagprocessor.TagsPostProcessor
    public java.util.Map<java.lang.String, java.lang.Object> processTags(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.lang.Object obj = map.get(com.datadog.trace.api.DDTags.HTTP_QUERY);
        if (obj instanceof java.lang.CharSequence) {
            java.lang.String obj2 = obj.toString();
            com.google.re2j.Pattern pattern = this.getHighResolutionOutputSizeshNQ4ISI;
            if (pattern != null) {
                com.google.re2j.Matcher matcher = pattern.matcher(obj2);
                while (matcher.find()) {
                    obj2 = com.datadog.trace.util.Strings.replace(obj2, matcher.group(), "<redacted>");
                }
            }
            map.put(com.datadog.trace.api.DDTags.HTTP_QUERY, obj2);
            java.lang.Object obj3 = map.get("http.url");
            if (obj3 instanceof java.lang.CharSequence) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(obj3);
                sb.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
                sb.append((java.lang.Object) obj2);
                map.put("http.url", sb.toString());
            }
        }
        return map;
    }
}
