package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdh {
    @EnsuresNonNull({"#1"})
    @Deprecated
    @Pure
    public static String zza(String str) {
        zzguk.zza(!TextUtils.isEmpty(str));
        return str;
    }
}
