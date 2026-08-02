package com.google.android.gms.internal.auth;

import V2.b;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0845w;
import com.google.android.gms.common.api.internal.C0844v;
import com.google.android.gms.common.api.internal.InterfaceC0841s;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import i3.C1263a;

/* loaded from: classes.dex */
final class zzab extends l implements zzg {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;
    private static final C1263a zzd;
    private final Context zze;

    static {
        h hVar = new h();
        zza = hVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new i("GoogleAuthService.API", zzvVar, hVar);
        zzd = new C1263a("Auth", "GoogleAuthServiceClient");
    }

    public zzab(Context context) {
        super(context, null, zzc, e.f11086o, k.f11205c);
        this.zze = context;
    }

    public static void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.j() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(D.n(status))) {
            return;
        }
        zzd.f("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        C0844v a2 = AbstractC0845w.a();
        a2.f11197d = new Feature[]{b.f6640c};
        a2.f11196c = new InterfaceC0841s() { // from class: com.google.android.gms.internal.auth.zzt
            @Override // com.google.android.gms.common.api.internal.InterfaceC0841s
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        };
        a2.f11194a = 1513;
        return doWrite(a2.e());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(final AccountChangeEventsRequest accountChangeEventsRequest) {
        D.j(accountChangeEventsRequest, "request cannot be null.");
        C0844v a2 = AbstractC0845w.a();
        a2.f11197d = new Feature[]{b.f6639b};
        a2.f11196c = new InterfaceC0841s() { // from class: com.google.android.gms.internal.auth.zzu
            @Override // com.google.android.gms.common.api.internal.InterfaceC0841s
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                AccountChangeEventsRequest accountChangeEventsRequest2 = accountChangeEventsRequest;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), accountChangeEventsRequest2);
            }
        };
        a2.f11194a = 1515;
        return doWrite(a2.e());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(final Account account, final String str, final Bundle bundle) {
        D.j(account, "Account name cannot be null!");
        D.f(str, "Scope cannot be null!");
        C0844v a2 = AbstractC0845w.a();
        a2.f11197d = new Feature[]{b.f6640c};
        a2.f11196c = new InterfaceC0841s() { // from class: com.google.android.gms.internal.auth.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC0841s
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        };
        a2.f11194a = 1512;
        return doWrite(a2.e());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(final Account account) {
        D.j(account, "account cannot be null.");
        C0844v a2 = AbstractC0845w.a();
        a2.f11197d = new Feature[]{b.f6639b};
        a2.f11196c = new InterfaceC0841s() { // from class: com.google.android.gms.internal.auth.zzr
            @Override // com.google.android.gms.common.api.internal.InterfaceC0841s
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        };
        a2.f11194a = 1517;
        return doWrite(a2.e());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(final String str) {
        D.j(str, "Client package name cannot be null!");
        C0844v a2 = AbstractC0845w.a();
        a2.f11197d = new Feature[]{b.f6639b};
        a2.f11196c = new InterfaceC0841s() { // from class: com.google.android.gms.internal.auth.zzq
            @Override // com.google.android.gms.common.api.internal.InterfaceC0841s
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        };
        a2.f11194a = 1514;
        return doWrite(a2.e());
    }
}
