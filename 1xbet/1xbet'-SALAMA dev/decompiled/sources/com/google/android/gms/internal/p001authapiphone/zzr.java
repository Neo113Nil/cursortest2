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
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends l {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new i("SmsCodeAutofill.API", zznVar, hVar);
    }

    public zzr(Activity activity) {
        super(activity, activity, zzc, e.f11086o, k.f11205c);
    }

    public final Task<Integer> checkPermissionState() {
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11197d = new Feature[]{zzac.zza};
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(this.zza, (TaskCompletionSource) obj2));
            }
        };
        c0800vA.f11194a = 1564;
        return doRead(c0800vA.e());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        D.i(str);
        D.a("The package name cannot be empty.", !str.isEmpty());
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11197d = new Feature[]{zzac.zza};
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(this.zza, (TaskCompletionSource) obj2));
            }
        };
        c0800vA.f11194a = 1565;
        return doRead(c0800vA.e());
    }

    public final Task<Void> startSmsCodeRetriever() {
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11197d = new Feature[]{zzac.zza};
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(this.zza, (TaskCompletionSource) obj2));
            }
        };
        c0800vA.f11194a = 1563;
        return doWrite(c0800vA.e());
    }

    public zzr(Context context) {
        super(context, null, zzc, e.f11086o, k.f11205c);
    }
}
