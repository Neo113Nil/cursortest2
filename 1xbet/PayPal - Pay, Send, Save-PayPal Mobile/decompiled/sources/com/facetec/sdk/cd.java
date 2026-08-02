package com.facetec.sdk;

/* loaded from: classes8.dex */
final class cd {
    cd() {
    }

    static java.lang.String e(java.lang.String str) {
        int nextInt = new java.util.Random().nextInt(8);
        int i = nextInt + 2;
        java.lang.String replace = java.util.UUID.randomUUID().toString().replace("-", "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(replace.substring(0, 1));
        sb.append(i);
        sb.append(replace.substring(2));
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj.substring(0, i));
        sb2.append(str);
        sb2.append(obj.substring(nextInt + 3));
        return sb2.toString();
    }

    static java.lang.String c(java.lang.String str) {
        int nextInt = new java.util.Random().nextInt(8);
        int i = nextInt + 2;
        java.lang.String replace = java.util.UUID.randomUUID().toString().replace("-", "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(replace.substring(0, 1));
        sb.append(i);
        sb.append(replace.substring(2));
        java.lang.String obj = sb.toString();
        int length = (replace.length() - 1) - i;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj.substring(0, i));
        sb2.append(str.charAt(0));
        sb2.append(obj.substring(nextInt + 3));
        java.lang.String obj2 = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj2.substring(0, length));
        sb3.append(str.charAt(1));
        sb3.append(obj2.substring(length + 1));
        return sb3.toString();
    }

    static boolean d(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected() & (activeNetworkInfo.getType() == 1)) {
                return true;
            }
        }
        return false;
    }
}
