package com.google.android.gms.internal.base;

import android.os.Build;

/* compiled from: com.google.android.gms:play-services-base@@18.7.2 */
/* loaded from: classes9.dex */
public final class zak {
    public static final int zaa;

    static {
        zaa = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
