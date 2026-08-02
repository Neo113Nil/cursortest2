package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzdr extends zzeq {
    final /* synthetic */ Context zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzfb zzfbVar, Context context, Bundle bundle) {
        super(zzfbVar, true);
        this.zza = context;
        this.zzb = bundle;
        Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        try {
            Context context = this.zza;
            C0875q.g(context);
            String zza = com.google.android.gms.measurement.internal.zzhu.zza(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(zza)) {
                zza = com.google.android.gms.measurement.internal.zzhu.zza(context);
            }
            Boolean zzc = com.google.android.gms.measurement.internal.zzhu.zzc("google_analytics_force_disable_updates", resources, zza);
            zzfb zzfbVar = this.zzc;
            zzfbVar.zzR(zzfbVar.zzc(context, zzc == null || !zzc.booleanValue()));
            if (zzfbVar.zzQ() == null) {
                zzfbVar.zzO();
                return;
            }
            int a = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            zzdd zzddVar = new zzdd(133005L, Math.max(a, r0), Boolean.TRUE.equals(zzc) || DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false) < a, this.zzb, com.google.android.gms.measurement.internal.zzhu.zza(context));
            zzcr zzQ = zzfbVar.zzQ();
            C0875q.g(zzQ);
            zzQ.initialize(new b(context), zzddVar, this.zzh);
        } catch (Exception e) {
            this.zzc.zzN(e, true, false);
        }
    }
}
