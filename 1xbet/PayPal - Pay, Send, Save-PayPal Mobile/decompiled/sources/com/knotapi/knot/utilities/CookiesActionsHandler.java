package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class CookiesActionsHandler {
    private static final java.lang.String TAG = "CookieHelper";
    private static int maxRetries = 3;

    public static class CookieUpdateRule {
        boolean appendDomainDot;

        /* renamed from: name, reason: collision with root package name */
        java.lang.String f3954name;
        java.lang.String newDomain;
        java.lang.String refetchUrl;
        boolean secure;

        private CookieUpdateRule() {
            this.appendDomainDot = false;
            this.secure = false;
            this.refetchUrl = null;
        }
    }

    public static class FieldResult {

        /* renamed from: name, reason: collision with root package name */
        java.lang.String f3955name;
        java.lang.String pattern;

        private FieldResult() {
            this.f3955name = null;
            this.pattern = null;
        }
    }

    public static class RequiredCookie {
        java.lang.String cookieFetchUrl;
        java.lang.String domainPattern;
        java.lang.String domainPredicate;
        boolean isEncoded;
        java.lang.String nestedCookieName;
        java.lang.String nestedCookieNamePattern;
        boolean optionalForValidation;
        java.lang.String parentCookieName;
        java.lang.String parentCookieNamePattern;
        java.lang.String redirectUrl;
        java.lang.String valuePattern;
        java.lang.String valuePredicate;

        private RequiredCookie() {
        }
    }

    public static boolean canAddCookies(java.lang.String str, com.knotapi.knot.models.Bot bot) {
        try {
            com.google.gson.JsonObject asJsonObject = bot.getAllSettings().getAsJsonObject("cookiesActions");
            if (asJsonObject == null || !asJsonObject.has("collectCookies")) {
                return true;
            }
            java.util.Iterator<com.google.gson.JsonElement> it = asJsonObject.getAsJsonArray("collectCookies").iterator();
            while (it.hasNext()) {
                com.google.gson.JsonElement next = it.next();
                if (next.getAsString().contains(str)) {
                    return !next.getAsString().contains("!");
                }
            }
            return true;
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    public static boolean checkPredicateCookiesFound(java.util.List<com.knotapi.knot.utilities.Cookie> list, com.knotapi.knot.models.Bot bot) {
        try {
            com.google.gson.JsonObject asJsonObject = bot.getAllSettings().getAsJsonObject("cookiesActions");
            java.util.List<com.knotapi.knot.utilities.CookiesActionsHandler.RequiredCookie> arrayList = new java.util.ArrayList();
            if (asJsonObject.has("requiredCookies")) {
                arrayList = parseRequiredCookies(asJsonObject.getAsJsonArray("requiredCookies"));
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            boolean z = false;
            while (true) {
                boolean z2 = z;
                for (com.knotapi.knot.utilities.CookiesActionsHandler.RequiredCookie requiredCookie : arrayList) {
                    boolean isCookiePresent = isCookiePresent(list, requiredCookie);
                    if (requiredCookie.optionalForValidation) {
                        if (isCookiePresent) {
                            break;
                        }
                        z2 = true;
                    } else if (!isCookiePresent) {
                        return false;
                    }
                }
                return !z2 || z;
                z = true;
            }
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static java.lang.String decodeCookieValue(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return java.net.URLDecoder.decode(str, "UTF-8");
        } catch (java.io.UnsupportedEncodingException | java.lang.IllegalArgumentException unused) {
            return str;
        }
    }

    private static boolean fetchAndValidateCookies(com.knotapi.knot.models.Bot bot, java.util.List<com.knotapi.knot.utilities.Cookie> list) {
        java.lang.String str;
        java.util.List<com.knotapi.knot.utilities.Cookie> cookiesFromUrl;
        try {
            com.google.gson.JsonObject asJsonObject = bot.getAllSettings().getAsJsonObject("cookiesActions");
            java.util.List<com.knotapi.knot.utilities.CookiesActionsHandler.RequiredCookie> arrayList = new java.util.ArrayList();
            if (asJsonObject.has("requiredCookies")) {
                arrayList = parseRequiredCookies(asJsonObject.getAsJsonArray("requiredCookies"));
            }
            int i = 0;
            while (i < maxRetries) {
                i++;
                for (com.knotapi.knot.utilities.CookiesActionsHandler.RequiredCookie requiredCookie : arrayList) {
                    if (!isCookiePresent(list, requiredCookie) && (str = requiredCookie.cookieFetchUrl) != null && !str.isEmpty() && (cookiesFromUrl = getCookiesFromUrl(str)) != null) {
                        list.addAll(cookiesFromUrl);
                    }
                }
                if (checkPredicateCookiesFound(list, bot)) {
                    return true;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }

    public static java.util.List<com.knotapi.knot.utilities.Cookie> getCookies(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String cookie = android.webkit.CookieManager.getInstance().getCookie(str);
        if (cookie != null && !cookie.isEmpty()) {
            for (java.lang.String str2 : cookie.split(";")) {
                com.knotapi.knot.utilities.Cookie buildCookie = com.knotapi.knot.utilities.Cookie.buildCookie(str2, str);
                if (buildCookie != null) {
                    arrayList.add(buildCookie);
                }
            }
        }
        return arrayList;
    }

    public static java.util.List<com.knotapi.knot.utilities.Cookie> getCookiesFromUrl(java.lang.String str) {
        try {
            return getCookies(str);
        } catch (java.lang.Exception unused) {
            return new java.util.ArrayList();
        }
    }

    private static java.lang.String getNestedCookieValue(java.lang.String str, java.lang.String str2, java.util.regex.Pattern pattern) {
        try {
            com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(str).getAsJsonObject();
            if (pattern == null) {
                if (str2 == null || !asJsonObject.has(str2)) {
                    return null;
                }
                return asJsonObject.get(str2).getAsString();
            }
            for (java.lang.String str3 : asJsonObject.keySet()) {
                if (pattern.matcher(str3).matches()) {
                    return asJsonObject.get(str3).getAsString();
                }
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static boolean isCookiePresent(java.util.List<com.knotapi.knot.utilities.Cookie> list, com.knotapi.knot.utilities.CookiesActionsHandler.RequiredCookie requiredCookie) {
        java.lang.String str = requiredCookie.parentCookieNamePattern;
        java.util.regex.Pattern compile = str != null ? java.util.regex.Pattern.compile(str) : null;
        java.lang.String str2 = requiredCookie.domainPattern;
        java.util.regex.Pattern compile2 = str2 != null ? java.util.regex.Pattern.compile(str2) : null;
        java.lang.String str3 = requiredCookie.valuePattern;
        java.util.regex.Pattern compile3 = str3 != null ? java.util.regex.Pattern.compile(str3) : null;
        java.lang.String str4 = requiredCookie.nestedCookieNamePattern;
        java.util.regex.Pattern compile4 = str4 != null ? java.util.regex.Pattern.compile(str4) : null;
        java.util.Iterator<com.knotapi.knot.utilities.Cookie> it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                return false;
            }
            com.knotapi.knot.utilities.Cookie next = it.next();
            boolean matches = compile != null ? compile.matcher(next.getName()).matches() : requiredCookie.parentCookieName == null || next.getName().equals(requiredCookie.parentCookieName);
            if (compile2 != null) {
                z = compile2.matcher(next.getDomain()).matches();
            } else if (requiredCookie.domainPredicate == null || next.getDomain().equals(requiredCookie.domainPredicate)) {
                z = true;
            }
            if (matches && z) {
                boolean z2 = requiredCookie.isEncoded;
                java.lang.String value = next.getValue();
                if (z2) {
                    value = decodeCookieValue(value);
                }
                if (isValueMatches(requiredCookie, getNestedCookieValue(value, requiredCookie.nestedCookieName, compile4), compile3)) {
                    return true;
                }
            }
        }
    }

    public static boolean isUserLoggedIn(com.knotapi.knot.models.Bot bot, java.util.List<com.knotapi.knot.utilities.Cookie> list) {
        if (!bot.hasCookieActions()) {
            return false;
        }
        setMaxRetries(bot);
        return checkPredicateCookiesFound(list, bot) || fetchAndValidateCookies(bot, list);
    }

    private static boolean isValueMatches(com.knotapi.knot.utilities.CookiesActionsHandler.RequiredCookie requiredCookie, java.lang.String str, java.util.regex.Pattern pattern) {
        java.lang.String str2 = requiredCookie.valuePredicate;
        if (str2 == null && requiredCookie.valuePattern == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return pattern != null ? pattern.matcher(str).matches() : str.equals(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static java.util.List<com.knotapi.knot.utilities.CookiesActionsHandler.CookieUpdateRule> parseCookieUpdates(com.google.gson.JsonArray jsonArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.google.gson.JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            com.google.gson.JsonObject asJsonObject = it.next().getAsJsonObject();
            java.lang.String str = null;
            com.knotapi.knot.utilities.CookiesActionsHandler.CookieUpdateRule cookieUpdateRule = new com.knotapi.knot.utilities.CookiesActionsHandler.CookieUpdateRule();
            cookieUpdateRule.f3954name = asJsonObject.has("name") ? asJsonObject.get("name").getAsString() : null;
            cookieUpdateRule.newDomain = asJsonObject.has("newDomain") ? asJsonObject.get("newDomain").getAsString() : null;
            cookieUpdateRule.appendDomainDot = asJsonObject.has("appendDomainDot") && asJsonObject.get("appendDomainDot").getAsBoolean();
            cookieUpdateRule.secure = asJsonObject.has("secure") && asJsonObject.get("secure").getAsBoolean();
            if (asJsonObject.has("refetchUrl")) {
                str = asJsonObject.get("refetchUrl").getAsString();
            }
            cookieUpdateRule.refetchUrl = str;
            arrayList.add(cookieUpdateRule);
        }
        return arrayList;
    }

    private static com.knotapi.knot.utilities.CookiesActionsHandler.FieldResult parseField(com.google.gson.JsonObject jsonObject, java.lang.String str) {
        com.knotapi.knot.utilities.CookiesActionsHandler.FieldResult fieldResult = new com.knotapi.knot.utilities.CookiesActionsHandler.FieldResult();
        if (jsonObject.has(str)) {
            com.google.gson.JsonElement jsonElement = jsonObject.get(str);
            if (jsonElement.isJsonPrimitive()) {
                fieldResult.f3955name = jsonElement.getAsString();
                return fieldResult;
            }
            if (jsonElement.isJsonObject()) {
                com.google.gson.JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject.has("name")) {
                    fieldResult.f3955name = asJsonObject.get("name").getAsString();
                }
                if (asJsonObject.has("regex")) {
                    fieldResult.pattern = asJsonObject.get("regex").getAsString();
                }
            }
        }
        return fieldResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List<com.knotapi.knot.utilities.CookiesActionsHandler.RequiredCookie> parseRequiredCookies(com.google.gson.JsonArray jsonArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.google.gson.JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            com.google.gson.JsonObject asJsonObject = it.next().getAsJsonObject();
            com.knotapi.knot.utilities.CookiesActionsHandler.RequiredCookie requiredCookie = new com.knotapi.knot.utilities.CookiesActionsHandler.RequiredCookie();
            com.knotapi.knot.utilities.CookiesActionsHandler.FieldResult parseField = parseField(asJsonObject, "domain");
            com.knotapi.knot.utilities.CookiesActionsHandler.FieldResult parseField2 = parseField(asJsonObject, "parentCookieName");
            com.knotapi.knot.utilities.CookiesActionsHandler.FieldResult parseField3 = parseField(asJsonObject, "nestedCookieName");
            com.knotapi.knot.utilities.CookiesActionsHandler.FieldResult parseField4 = parseField(asJsonObject, "cookieFetchUrl");
            com.knotapi.knot.utilities.CookiesActionsHandler.FieldResult parseField5 = parseField(asJsonObject, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            java.lang.String str = parseField.f3955name;
            requiredCookie.domainPredicate = (str == null || str.isEmpty()) ? null : parseField.f3955name;
            java.lang.String str2 = parseField.pattern;
            requiredCookie.domainPattern = (str2 == null || str2.isEmpty()) ? null : parseField.pattern;
            java.lang.String str3 = parseField2.f3955name;
            requiredCookie.parentCookieName = (str3 == null || str3.isEmpty()) ? null : parseField2.f3955name;
            java.lang.String str4 = parseField2.pattern;
            requiredCookie.parentCookieNamePattern = (str4 == null || str4.isEmpty()) ? null : parseField2.pattern;
            java.lang.String str5 = parseField3.f3955name;
            requiredCookie.nestedCookieName = (str5 == null || str5.isEmpty()) ? null : parseField3.f3955name;
            java.lang.String str6 = parseField3.pattern;
            requiredCookie.nestedCookieNamePattern = (str6 == null || str6.isEmpty()) ? null : parseField3.pattern;
            java.lang.String str7 = parseField5.f3955name;
            requiredCookie.valuePredicate = (str7 == null || str7.isEmpty()) ? null : parseField5.f3955name;
            java.lang.String str8 = parseField5.pattern;
            requiredCookie.valuePattern = (str8 == null || str8.isEmpty()) ? null : parseField5.pattern;
            requiredCookie.cookieFetchUrl = parseField4.f3955name;
            boolean z = true;
            requiredCookie.isEncoded = asJsonObject.has("isEncoded") && asJsonObject.get("isEncoded").getAsBoolean();
            requiredCookie.redirectUrl = asJsonObject.has("redirectUrl") ? asJsonObject.get("redirectUrl").getAsString() : null;
            if (!asJsonObject.has("optionalForValidation") || !asJsonObject.get("optionalForValidation").getAsBoolean()) {
                z = false;
            }
            requiredCookie.optionalForValidation = z;
            arrayList.add(requiredCookie);
        }
        return arrayList;
    }

    private static void setMaxRetries(com.knotapi.knot.models.Bot bot) {
        try {
            if (bot.getAllSettings().has("cookiesActions")) {
                com.google.gson.JsonObject asJsonObject = bot.getAllSettings().getAsJsonObject("cookiesActions");
                if (asJsonObject.has("maxRetries")) {
                    maxRetries = asJsonObject.get("maxRetries").getAsInt();
                }
            }
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "CookiesActionsHandler.setMaxRetries");
        }
    }

    public static void updateCookies(com.knotapi.knot.webview.KnotView knotView, com.knotapi.knot.models.Bot bot) {
        try {
            com.google.gson.JsonObject asJsonObject = bot.getAllSettings().getAsJsonObject("cookiesActions");
            java.util.List<com.knotapi.knot.utilities.Cookie> cookies = knotView.getCookies();
            if (asJsonObject.has("cookieUpdates")) {
                for (com.knotapi.knot.utilities.CookiesActionsHandler.CookieUpdateRule cookieUpdateRule : parseCookieUpdates(asJsonObject.getAsJsonArray("cookieUpdates"))) {
                    for (com.knotapi.knot.utilities.Cookie cookie : cookies) {
                        if (cookie.getName().equals(cookieUpdateRule.f3954name)) {
                            java.lang.String str = cookieUpdateRule.refetchUrl;
                            if (str != null && !str.isEmpty()) {
                                java.util.List<com.knotapi.knot.utilities.Cookie> cookiesFromUrl = getCookiesFromUrl(cookieUpdateRule.refetchUrl);
                                if (cookiesFromUrl != null) {
                                    for (com.knotapi.knot.utilities.Cookie cookie2 : cookiesFromUrl) {
                                        if (cookie2.getName().equals(cookieUpdateRule.f3954name)) {
                                            cookies.add(cookie2);
                                        }
                                    }
                                }
                            }
                            java.lang.String str2 = cookieUpdateRule.newDomain;
                            if (str2 != null && !str2.isEmpty()) {
                                cookie.setDomain(cookieUpdateRule.newDomain);
                            }
                            if (cookieUpdateRule.appendDomainDot) {
                                java.lang.String domain = cookie.getDomain();
                                if (!domain.startsWith(".")) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(".");
                                    sb.append(domain);
                                    cookie.setDomain(sb.toString());
                                    cookie.getDomain();
                                }
                            }
                            if (cookieUpdateRule.secure) {
                                cookie.setSecure(true);
                            }
                        }
                    }
                }
                knotView.setCookies(cookies);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
