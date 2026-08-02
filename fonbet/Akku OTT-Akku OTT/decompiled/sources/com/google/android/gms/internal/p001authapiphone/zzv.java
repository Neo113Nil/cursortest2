package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.AbstractC0847v;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzv extends g {
    private static final a.g zza;
    private static final a.AbstractC0110a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new a("SmsCodeBrowser.API", zztVar, gVar);
    }

    public zzv(Activity activity) {
        super(activity, (a<a.d.c>) zzc, a.d.g, g.a.c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zzac.zzb};
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(zzv.this, (TaskCompletionSource) obj2));
            }
        };
        a.d = 1566;
        return doWrite(a.a());
    }

    public zzv(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.g, g.a.c);
    }
}
