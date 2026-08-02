package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class od {

    /* renamed from: a, reason: collision with root package name */
    public final com.facetec.sdk.na f3701a;
    public final int d;
    public final java.lang.String e;

    private od(com.facetec.sdk.na naVar, int i, java.lang.String str) {
        this.f3701a = naVar;
        this.d = i;
        this.e = str;
    }

    public static com.facetec.sdk.od b(java.lang.String str) throws java.io.IOException {
        com.facetec.sdk.na naVar;
        int i;
        java.lang.String str2;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new java.net.ProtocolException("Unexpected status line: ".concat(java.lang.String.valueOf(str)));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                naVar = com.facetec.sdk.na.HTTP_1_0;
            } else if (charAt == 1) {
                naVar = com.facetec.sdk.na.HTTP_1_1;
            } else {
                throw new java.net.ProtocolException("Unexpected status line: ".concat(java.lang.String.valueOf(str)));
            }
        } else if (str.startsWith("ICY ")) {
            naVar = com.facetec.sdk.na.HTTP_1_0;
            i = 4;
        } else {
            throw new java.net.ProtocolException("Unexpected status line: ".concat(java.lang.String.valueOf(str)));
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new java.net.ProtocolException("Unexpected status line: ".concat(java.lang.String.valueOf(str)));
        }
        try {
            int parseInt = java.lang.Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new java.net.ProtocolException("Unexpected status line: ".concat(java.lang.String.valueOf(str)));
                }
                str2 = str.substring(i + 4);
            }
            return new com.facetec.sdk.od(naVar, parseInt, str2);
        } catch (java.lang.NumberFormatException unused) {
            throw new java.net.ProtocolException("Unexpected status line: ".concat(java.lang.String.valueOf(str)));
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f3701a == com.facetec.sdk.na.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.d);
        if (this.e != null) {
            sb.append(' ');
            sb.append(this.e);
        }
        return sb.toString();
    }
}
