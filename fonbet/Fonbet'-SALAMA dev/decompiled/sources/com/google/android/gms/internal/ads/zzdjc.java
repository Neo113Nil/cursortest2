package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import java.util.List;

/* loaded from: classes.dex */
final class zzdjc implements zzgay {
    final /* synthetic */ zzdjd zza;

    public zzdjc(zzdjd zzdjdVar) {
        this.zza = zzdjdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfs)).booleanValue()) {
            o.f1952C.f1961g.zzw(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzceb zzcebVar = (zzceb) list.get(0);
            if (zzcebVar != null) {
                this.zza.zzb(zzcebVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e7) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfs)).booleanValue()) {
                o.f1952C.f1961g.zzw(e7, "omid native display exp");
            }
        }
    }
}
