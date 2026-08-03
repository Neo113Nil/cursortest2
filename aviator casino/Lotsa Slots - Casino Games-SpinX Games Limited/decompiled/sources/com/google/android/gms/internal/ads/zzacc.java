package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzacc extends java.io.IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzacc(java.lang.Throwable th) {
        super(r3.toString(), th);
        java.lang.String str;
        java.lang.String simpleName = th.getClass().getSimpleName();
        if (th.getMessage() != null) {
            java.lang.String message = th.getMessage();
            java.lang.String.valueOf(message);
            str = ": ".concat(java.lang.String.valueOf(message));
        } else {
            str = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(simpleName).length() + 11 + str.length());
        sb.append("Unexpected ");
        sb.append(simpleName);
        sb.append(str);
    }
}
