package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class Helper {
    public static final java.lang.String TAG = "Knot:Helper";

    public static java.lang.String encodeImage(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public static java.lang.String escapeJs(java.lang.String str) {
        return str == null ? "" : str.replace("'", "\\'");
    }

    public static java.lang.String formatCookiesForPuppeteer(java.util.List<com.knotapi.knot.utilities.Cookie> list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<com.knotapi.knot.utilities.Cookie> it = list.iterator();
        while (it.hasNext()) {
            org.json.JSONObject json = it.next().toJson();
            if (json != null) {
                jSONArray.put(json);
            }
        }
        return jSONArray.toString();
    }

    public static java.lang.String getDomain(java.lang.String str) {
        try {
            java.lang.String str2 = str.replaceFirst("^(https?://)?", "").split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)[0].split(io.ktor.sse.ServerSentEventKt.COLON)[0];
            return str2.startsWith("www.") ? str2.substring(4) : str2;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static com.google.gson.JsonElement getJsonParam(com.knotapi.knot.models.Bot bot, java.lang.String str, java.lang.String str2) {
        com.google.gson.JsonElement parseString;
        if (bot == null || !bot.getGlobalSettings().has(str)) {
            return null;
        }
        java.lang.String asString = bot.getGlobalSettings().get(str).getAsString();
        if (!isValidJson(asString) || (parseString = com.google.gson.JsonParser.parseString(asString)) == null || !parseString.isJsonObject()) {
            return null;
        }
        com.google.gson.JsonObject asJsonObject = parseString.getAsJsonObject();
        if (asJsonObject.has(str2)) {
            return asJsonObject.get(str2);
        }
        return null;
    }

    public static boolean isElementInArray(com.google.gson.JsonElement jsonElement, com.google.gson.JsonArray jsonArray) {
        if (jsonElement == null || jsonArray == null) {
            return false;
        }
        if (!jsonElement.isJsonArray()) {
            return isSingleElementInArray(jsonElement, jsonArray);
        }
        java.util.Iterator<com.google.gson.JsonElement> it = jsonElement.getAsJsonArray().iterator();
        while (it.hasNext()) {
            if (isSingleElementInArray(it.next(), jsonArray)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSingleElementInArray(com.google.gson.JsonElement jsonElement, com.google.gson.JsonArray jsonArray) {
        if (jsonElement != null && jsonElement.isJsonPrimitive()) {
            java.lang.String trim = jsonElement.getAsString().trim();
            if (trim.isEmpty()) {
                return false;
            }
            java.util.Iterator<com.google.gson.JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                com.google.gson.JsonElement next = it.next();
                if (next != null && next.isJsonPrimitive()) {
                    java.lang.String trim2 = next.getAsString().trim();
                    if (!trim2.isEmpty() && trim.contains(trim2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isUrlMatch(java.lang.String str, java.lang.String str2, boolean z) {
        try {
            if (!z) {
                return str.equals(str2);
            }
            try {
                return java.util.regex.Pattern.compile(str2).matcher(str).matches();
            } catch (java.util.regex.PatternSyntaxException unused) {
                return false;
            }
        } catch (java.lang.Exception unused2) {
            return false;
        }
    }

    public static boolean isValidJson(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            try {
                new org.json.JSONObject(str);
                return true;
            } catch (org.json.JSONException unused) {
                return false;
            }
        } catch (org.json.JSONException unused2) {
            new org.json.JSONArray(str);
            return true;
        }
    }

    public static boolean isValidURL(java.lang.String str) {
        return str != null && android.util.Patterns.WEB_URL.matcher(str).matches();
    }

    private static boolean isValidUUID(java.lang.String str) {
        try {
            java.util.UUID.fromString(str);
            return true;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean matchesAnyCondition(com.google.gson.JsonElement jsonElement, java.lang.String str) {
        if (str == null || str.isEmpty() || jsonElement == null) {
            return false;
        }
        if (!jsonElement.isJsonArray()) {
            return isElementInArray(jsonElement, null);
        }
        return isElementInArray(new com.google.gson.JsonPrimitive(str), jsonElement.getAsJsonArray());
    }

    public static java.util.Map<java.lang.String, java.lang.String> parseCookies(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (str != null && !str.isEmpty()) {
            for (java.lang.String str2 : str.split("(?<=; )|(?<=;)|(?=;)|(?<=;)(?=\\s*)")) {
                java.lang.String[] split = str2.split("=");
                if (split.length == 2) {
                    hashMap.put(split[0].trim(), split[1].trim());
                }
            }
        }
        return hashMap;
    }

    public static void resetCookies(java.lang.String str) {
        try {
            android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                java.lang.String string = jSONObject.getString("domainUrls");
                java.lang.String domain = getDomain(string);
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : parseCookies(jSONObject.getString("cookies")).entrySet()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    sb.append("; domain=");
                    sb.append(domain);
                    sb.append("; path=/;");
                    cookieManager.setCookie(string, sb.toString());
                }
            }
            cookieManager.flush();
        } catch (org.json.JSONException unused) {
        }
    }

    public static java.lang.String safe(java.lang.String str) {
        return str == null ? "" : str;
    }

    public static java.lang.String safeGetString(int i, java.lang.String str, androidx.fragment.app.Fragment fragment) {
        try {
            return fragment.isAdded() ? fragment.getString(i) : str;
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "MerchantWebViewFragment.safeGetString");
            return str;
        }
    }

    public static java.lang.String sanitizeInput(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return "";
        }
        java.lang.String replace = str.replace("%2D", "-");
        if (!"sessionId".equals(str2) && !"clientId".equals(str2)) {
            if ("entryPoint".equals(str2)) {
                return replace.replaceAll("[^a-zA-Z0-9 &.-]", "");
            }
        } else if (!isValidUUID(replace)) {
            return "";
        }
        return replace;
    }
}
