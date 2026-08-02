package com.google.android.gms.internal.auth_blockstore;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.b;
import com.google.android.gms.auth.blockstore.c;
import com.google.android.gms.auth.blockstore.d;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.AbstractC0847v;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzaa extends g {
    private static final a.g zza;
    private static final a.AbstractC0110a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzu zzuVar = new zzu();
        zzb = zzuVar;
        zzc = new a("Blockstore.API", zzuVar, gVar);
    }

    public zzaa(@NonNull Context context) {
        super(context, (a<a.d.c>) zzc, a.d.g, g.a.c);
    }

    public final Task<Boolean> deleteBytes(final com.google.android.gms.auth.blockstore.a aVar) {
        C0875q.h(aVar, "DeleteBytesRequest cannot be null");
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zzab.zzg};
        a.a = new r() { // from class: com.google.android.gms.internal.auth_blockstore.zzp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zza(new zzy(zzaa.this, (TaskCompletionSource) obj2), aVar);
            }
        };
        a.b = false;
        a.d = 1669;
        return doWrite(a.a());
    }

    public final Task<Boolean> isEndToEndEncryptionAvailable() {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zzab.zze};
        a.a = new r() { // from class: com.google.android.gms.internal.auth_blockstore.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zzb(new zzz(zzaa.this, (TaskCompletionSource) obj2));
            }
        };
        a.b = false;
        a.d = 1651;
        return doRead(a.a());
    }

    public final Task<byte[]> retrieveBytes() {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zzab.zza};
        a.a = new r() { // from class: com.google.android.gms.internal.auth_blockstore.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zzc(new zzx(zzaa.this, (TaskCompletionSource) obj2));
            }
        };
        a.b = false;
        a.d = 1570;
        return doRead(a.a());
    }

    public final Task<Integer> storeBytes(final d dVar) {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zzab.zzd, zzab.zzf};
        a.a = new r() { // from class: com.google.android.gms.internal.auth_blockstore.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zze(new zzv(zzaa.this, (TaskCompletionSource) obj2), dVar);
            }
        };
        a.d = 1645;
        a.b = false;
        return doWrite(a.a());
    }

    public final Task<c> retrieveBytes(final b bVar) {
        C0875q.h(bVar, "RetrieveBytesRequest cannot be null");
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zzab.zzh};
        a.a = new r() { // from class: com.google.android.gms.internal.auth_blockstore.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zzd(new zzw(zzaa.this, (TaskCompletionSource) obj2), bVar);
            }
        };
        a.b = false;
        a.d = 1668;
        return doRead(a.a());
    }
}
