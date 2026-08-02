package com.google.android.gms.internal.appset;

import U2.a;
import U2.b;
import U2.c;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0845w;
import com.google.android.gms.common.api.internal.C0844v;
import com.google.android.gms.common.api.internal.InterfaceC0841s;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes.dex */
public final class zzp extends l implements a {
    private static final h zza;
    private static final com.google.android.gms.common.api.a zzb;
    private static final i zzc;
    private final Context zzd;
    private final d zze;

    static {
        h hVar = new h();
        zza = hVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new i("AppSet.API", zznVar, hVar);
    }

    public zzp(Context context, d dVar) {
        super(context, null, zzc, e.f11086o, k.f11205c);
        this.zzd = context;
        this.zze = dVar;
    }

    @Override // U2.a
    public final Task<b> getAppSetIdInfo() {
        if (this.zze.d(this.zzd, 212800000) != 0) {
            return Tasks.forException(new j(new Status(17, null, null, null)));
        }
        C0844v a2 = AbstractC0845w.a();
        a2.f11197d = new Feature[]{c.f6401a};
        a2.f11196c = new InterfaceC0841s() { // from class: com.google.android.gms.internal.appset.zzm
            @Override // com.google.android.gms.common.api.internal.InterfaceC0841s
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzd) obj).getService()).zzc(new com.google.android.gms.appset.zza(null, null), new zzo(zzp.this, (TaskCompletionSource) obj2));
            }
        };
        a2.f11195b = false;
        a2.f11194a = 27601;
        return doRead(a2.e());
    }
}
