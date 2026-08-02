package com.datadog.trace.core.util;

/* loaded from: classes3.dex */
public class TagsMatcher {
    private final java.util.Map<java.lang.String, com.datadog.trace.core.util.Matcher> getHighResolutionOutputSizeshNQ4ISI;

    public static com.datadog.trace.core.util.TagsMatcher create(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> entrySet = map.entrySet();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : entrySet) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (com.datadog.trace.core.util.Matchers.Camera2StreamConfigurationMap(value)) {
                hashMap.put(key, new com.datadog.trace.core.util.Matchers.ExactMatcher(value));
            } else {
                hashMap.put(key, new com.datadog.trace.core.util.Matchers.PatternMatcher(com.datadog.trace.core.util.GlobPattern.globToRegexPattern(value)));
            }
        }
        return new com.datadog.trace.core.util.TagsMatcher(hashMap);
    }

    public TagsMatcher(java.util.Map<java.lang.String, com.datadog.trace.core.util.Matcher> map) {
        this.getHighResolutionOutputSizeshNQ4ISI = map;
    }

    public <T extends com.datadog.trace.core.CoreSpan<T>> boolean matches(T t) {
        for (java.util.Map.Entry entry : new java.util.HashSet(this.getHighResolutionOutputSizeshNQ4ISI.entrySet())) {
            java.lang.String str = (java.lang.String) t.getTag((java.lang.CharSequence) entry.getKey());
            if (str == null || !((com.datadog.trace.core.util.Matcher) entry.getValue()).matches(str)) {
                return false;
            }
        }
        return true;
    }
}
