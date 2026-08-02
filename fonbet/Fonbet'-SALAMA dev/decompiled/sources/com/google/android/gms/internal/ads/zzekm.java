package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzekm implements zzesh {
    private final zzgbn zza;
    private final zzfba zzb;
    private final int zzc;

    public zzekm(zzgbn zzgbnVar, zzfba zzfbaVar, zzfbp zzfbpVar, int i7) {
        this.zza = zzgbnVar;
        this.zzb = zzfbaVar;
        this.zzc = i7;
    }

    public static zzekn zzc(zzekm zzekmVar) {
        boolean equals;
        zzbbp zzbbpVar = zzbby.zzgW;
        C0254t c0254t = C0254t.f2723d;
        String str = null;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            zzfba zzfbaVar = zzekmVar.zzb;
            if (zzekmVar.zzc != 2) {
                String k02 = Q0.a.k0(zzfbaVar.zzd);
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzgX)).booleanValue()) {
                    equals = Arrays.asList(((String) c0254t.f2726c.zzb(zzbby.zzgY)).split(",")).contains(Q0.a.i0(k02));
                } else {
                    equals = Objects.equals(k02, "requester_type_2");
                }
                if (equals) {
                    str = zzfbp.zza();
                }
            }
        }
        return new zzekn(str);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzekl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzekm.zzc(zzekm.this);
            }
        });
    }
}
