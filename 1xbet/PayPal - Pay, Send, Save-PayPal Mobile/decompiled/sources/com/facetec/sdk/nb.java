package com.facetec.sdk;

/* loaded from: classes8.dex */
public enum nb {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    final java.lang.String c;

    nb(java.lang.String str) {
        this.c = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.facetec.sdk.nb c(java.lang.String str) {
        char c;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == 79201641) {
            if (str.equals("SSLv3")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode != 79923350) {
            switch (hashCode) {
                case -503070503:
                    if (str.equals("TLSv1.1")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -503070502:
                    if (str.equals("TLSv1.2")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -503070501:
                    if (str.equals("TLSv1.3")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } else {
            if (str.equals("TLSv1")) {
                c = 4;
            }
            c = 65535;
        }
        if (c == 0) {
            return TLS_1_1;
        }
        if (c == 1) {
            return TLS_1_2;
        }
        if (c == 2) {
            return TLS_1_3;
        }
        if (c == 3) {
            return SSL_3_0;
        }
        if (c == 4) {
            return TLS_1_0;
        }
        throw new java.lang.IllegalArgumentException("Unexpected TLS version: ".concat(java.lang.String.valueOf(str)));
    }

    static java.util.List<com.facetec.sdk.nb> b(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(c(str));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }
}
