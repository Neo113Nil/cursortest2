package com.google.android.gms.internal.ads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgjx extends zzgka {
    private static final Long zza = -1L;
    private final zzgff zzb;
    private final Context zzc;
    private final Map zzd;

    zzgjx(zzaya zzayaVar, zzgiw zzgiwVar, zzgff zzgffVar, Context context, Map map, zzgrh zzgrhVar) {
        super("VfejF6jLqZSis5lDsrO62jUDAXJqP6cPz4mgjtZND5tZ2P5VWHtedQvP3pauMLAi", "2mDHoFGLT7ybGaRwjjkTGPAVzRPlkIteOrAkiSTAkLw=", zzayaVar, zzgiwVar, zzgrhVar.zza(Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
        this.zzb = zzgffVar;
        this.zzc = context;
        this.zzd = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    protected final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        zzgff zzgffVar = this.zzb;
        Object[] objArr = (Object[]) method.invoke("", Integer.valueOf(zzgffVar.ordinal()), this.zzc, zzguh.zza(this.zzd.get("up"), true));
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzayaVar) {
            if (zzgffVar == zzgff.QUERY) {
                Object obj = objArr2[0];
                Long l = zza;
                zzayaVar.zzq(((Long) zzguh.zza(obj, l)).longValue());
                zzayaVar.zzr(((Long) zzguh.zza(objArr2[1], l)).longValue());
            }
            zzayaVar.zzg(((Long) objArr2[2]).longValue());
            zzayaVar.zzQ(((Long) objArr2[3]).longValue());
        }
    }
}
