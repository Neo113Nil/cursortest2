package com.google.android.recaptcha.internal;

import java.util.concurrent.Executors;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1101n0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.L;
import kotlinx.coroutines.R0;
import kotlinx.coroutines.S0;
import kotlinx.coroutines.internal.C1086c;
import kotlinx.coroutines.internal.p;
import kotlinx.coroutines.scheduling.b;
import kotlinx.coroutines.scheduling.c;

/* loaded from: classes4.dex */
public final class zzbi {
    private final K zza;
    private final K zzb;
    private final K zzc;
    private final K zzd;

    public zzbi() {
        R0 a = S0.a();
        c cVar = C1049c0.a;
        this.zza = new C1086c(CoroutineContext.Element.DefaultImpls.plus(a, p.a));
        C1086c a2 = L.a(new C1101n0(Executors.newSingleThreadExecutor()));
        C1082i.c(a2, null, null, new zzbh(null), 3);
        this.zzb = a2;
        this.zzc = L.a(b.a);
        C1086c a3 = L.a(new C1101n0(Executors.newSingleThreadExecutor()));
        C1082i.c(a3, null, null, new zzbg(null), 3);
        this.zzd = a3;
    }

    public final K zza() {
        return this.zzc;
    }

    public final K zzb() {
        return this.zza;
    }

    public final K zzc() {
        return this.zzd;
    }

    public final K zzd() {
        return this.zzb;
    }
}
