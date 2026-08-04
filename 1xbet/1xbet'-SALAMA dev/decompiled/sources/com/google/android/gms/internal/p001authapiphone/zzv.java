package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0801w;
import com.google.android.gms.common.api.internal.C0800v;
import com.google.android.gms.common.api.internal.InterfaceC0797s;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zzv extends l {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new i("SmsCodeBrowser.API", zztVar, hVar);
    }

    public zzv(Activity activity) {
        super(activity, activity, zzc, e.f11086o, k.f11205c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11197d = new Feature[]{zzac.zzb};
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(this.zza, (TaskCompletionSource) obj2));
            }
        };
        c0800vA.f11194a = 1566;
        return doWrite(c0800vA.e());
    }

    public zzv(Context context) {
        super(context, null, zzc, e.f11086o, k.f11205c);
    }
}
