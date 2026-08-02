package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@TargetApi(17)
@zzadh
/* loaded from: classes.dex */
public final class zzamn {
    private static zzamn zzcua;
    String zzcpq;

    private zzamn() {
    }

    public static zzamn zzsb() {
        if (zzcua == null) {
            zzcua = new zzamn();
        }
        return zzcua;
    }
}
