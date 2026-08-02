package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.AbstractC0847v;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzr extends g {
    private static final a.g zza;
    private static final a.AbstractC0110a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new a("SmsCodeAutofill.API", zznVar, gVar);
    }

    public zzr(Activity activity) {
        super(activity, (a<a.d.c>) zzc, a.d.g, g.a.c);
    }

    public final Task<Integer> checkPermissionState() {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zzac.zza};
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        a.d = 1564;
        return doRead(a.a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        C0875q.g(str);
        C0875q.b(!str.isEmpty(), "The package name cannot be empty.");
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zzac.zza};
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        a.d = 1565;
        return doRead(a.a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zzac.zza};
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        a.d = 1563;
        return doWrite(a.a());
    }

    public zzr(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.g, g.a.c);
    }
}
