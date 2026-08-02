package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.b;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.AbstractC0847v;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0860b;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
final class zzab extends g implements zzg {
    private static final a.g zza;
    private static final a.AbstractC0110a zzb;
    private static final a zzc;
    private static final com.google.android.gms.common.logging.a zzd;
    private final Context zze;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new a("GoogleAuthService.API", zzvVar, gVar);
        zzd = new com.google.android.gms.common.logging.a("Auth", "GoogleAuthServiceClient");
    }

    public zzab(@NonNull Context context) {
        super(context, (a<a.d.c>) zzc, a.d.g, g.a.c);
        this.zze = context;
    }

    public static void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.l() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(C0860b.a(status))) {
            return;
        }
        zzd.b("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{com.google.android.gms.auth.g.c};
        a.a = new r() { // from class: com.google.android.gms.internal.auth.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        };
        a.d = 1513;
        return doWrite(a.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(@NonNull final b bVar) {
        C0875q.h(bVar, "request cannot be null.");
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{com.google.android.gms.auth.g.b};
        a.a = new r() { // from class: com.google.android.gms.internal.auth.zzu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                b bVar2 = bVar;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), bVar2);
            }
        };
        a.d = 1515;
        return doWrite(a.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(@NonNull final Account account, @NonNull final String str, final Bundle bundle) {
        C0875q.h(account, "Account name cannot be null!");
        C0875q.e(str, "Scope cannot be null!");
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{com.google.android.gms.auth.g.c};
        a.a = new r() { // from class: com.google.android.gms.internal.auth.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        };
        a.d = 1512;
        return doWrite(a.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(@NonNull final Account account) {
        C0875q.h(account, "account cannot be null.");
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{com.google.android.gms.auth.g.b};
        a.a = new r() { // from class: com.google.android.gms.internal.auth.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        };
        a.d = 1517;
        return doWrite(a.a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(@NonNull final String str) {
        C0875q.h(str, "Client package name cannot be null!");
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{com.google.android.gms.auth.g.b};
        a.a = new r() { // from class: com.google.android.gms.internal.auth.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        };
        a.d = 1514;
        return doWrite(a.a());
    }
}
