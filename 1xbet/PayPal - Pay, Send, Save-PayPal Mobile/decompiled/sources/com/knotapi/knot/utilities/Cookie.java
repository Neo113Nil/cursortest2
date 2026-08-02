package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class Cookie {
    public static final java.lang.String TAG = "Knot:Cookie";
    public java.lang.String domain;
    public double expires;
    public boolean httpOnly;
    public boolean isSecure;

    /* renamed from: name, reason: collision with root package name */
    public java.lang.String f3953name;
    public java.lang.String path;
    public java.lang.String value;

    public Cookie(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, double d, boolean z, boolean z2) {
        this.f3953name = str;
        this.value = str2;
        this.path = str3;
        this.domain = str4;
        this.expires = d;
        this.isSecure = z;
        this.httpOnly = z2;
    }

    public static com.knotapi.knot.utilities.Cookie buildCookie(java.lang.String str, java.lang.String str2) {
        java.lang.String[] split = str.split("=", 2);
        java.lang.String str3 = null;
        if (split.length != 2) {
            return null;
        }
        java.lang.String trim = split[0].trim();
        java.lang.String[] split2 = split[1].split(";");
        java.lang.String trim2 = split2[0].trim();
        boolean z = false;
        boolean z2 = false;
        for (int i = 1; i < split2.length; i++) {
            java.lang.String lowerCase = split2[i].trim().toLowerCase();
            if (lowerCase.startsWith("domain=")) {
                str3 = lowerCase.substring(7).trim();
                if (str3.startsWith(".")) {
                    str3 = str3.substring(1);
                }
            } else if (!lowerCase.startsWith("path=")) {
                if (lowerCase.equals("secure")) {
                    z = true;
                } else if (lowerCase.equals("httponly")) {
                    z2 = true;
                }
            }
        }
        java.lang.String domain = str3 == null ? com.knotapi.knot.utilities.Helper.getDomain(str2) : str3;
        java.util.Calendar.getInstance().add(5, 7);
        return new com.knotapi.knot.utilities.Cookie(trim, trim2, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, domain, r12.getTime().getTime(), z, z2);
    }

    public static java.util.List<com.knotapi.knot.utilities.Cookie> mergeAll(java.util.List<com.knotapi.knot.utilities.Cookie> list, java.util.List<com.knotapi.knot.utilities.Cookie> list2) {
        try {
            for (com.knotapi.knot.utilities.Cookie cookie : list2) {
                java.util.Iterator<com.knotapi.knot.utilities.Cookie> it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        list.add(cookie);
                        break;
                    }
                    if (it.next().equals(cookie)) {
                        list.set(i, cookie);
                        break;
                    }
                    i++;
                }
            }
            return (java.util.List) list.stream().distinct().collect(java.util.stream.Collectors.toList());
        } catch (java.lang.Exception unused) {
            return list;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.knotapi.knot.utilities.Cookie cookie = (com.knotapi.knot.utilities.Cookie) obj;
        return java.util.Objects.equals(this.f3953name, cookie.getName()) && java.util.Objects.equals(this.domain, cookie.getDomain()) && java.util.Objects.equals(this.path, cookie.getPath());
    }

    public java.lang.String getDomain() {
        return this.domain;
    }

    public double getExpires() {
        return this.expires;
    }

    public java.lang.String getName() {
        return this.f3953name;
    }

    public java.lang.String getPath() {
        return this.path;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f3953name, this.domain, this.path);
    }

    public boolean isHttpOnly() {
        return this.httpOnly;
    }

    public boolean isSecure() {
        return this.isSecure;
    }

    public void setDomain(java.lang.String str) {
        this.domain = str;
    }

    public void setExpires(double d) {
        this.expires = d;
    }

    public void setHttpOnly(boolean z) {
        this.httpOnly = z;
    }

    public void setName(java.lang.String str) {
        this.f3953name = str;
    }

    public void setPath(java.lang.String str) {
        this.path = str;
    }

    public void setSecure(boolean z) {
        this.isSecure = z;
    }

    public void setValue(java.lang.String str) {
        this.value = str;
    }

    public org.json.JSONObject toJson() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("name", this.f3953name);
            jSONObject.put(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, this.value);
            jSONObject.put("domain", this.domain);
            jSONObject.put("path", this.path);
            jSONObject.put("secure", this.isSecure);
            jSONObject.put("httpOnly", this.httpOnly);
            jSONObject.put("expires", this.expires);
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Name: ");
        sb.append(this.f3953name);
        sb.append(", Domain: ");
        sb.append(this.domain);
        sb.append(", Path: ");
        sb.append(this.path);
        sb.append(", Value: ");
        sb.append(this.value);
        return sb.toString();
    }
}
