package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes9.dex */
public final class zzbjm {
    public static final void zza(zzbjl zzbjlVar, zzbjj zzbjjVar) {
        if (zzbjjVar.zzb() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbjjVar.zzc())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbjlVar.zza(zzbjjVar.zzb(), zzbjjVar.zzc(), zzbjjVar.zza(), zzbjjVar.zzd());
    }
}
