package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzach extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzach(Throwable th) {
        super(r3.toString(), th);
        String str;
        String simpleName = th.getClass().getSimpleName();
        if (th.getMessage() != null) {
            String message = th.getMessage();
            String.valueOf(message);
            str = ": ".concat(String.valueOf(message));
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 11 + str.length());
        sb.append("Unexpected ");
        sb.append(simpleName);
        sb.append(str);
    }
}
