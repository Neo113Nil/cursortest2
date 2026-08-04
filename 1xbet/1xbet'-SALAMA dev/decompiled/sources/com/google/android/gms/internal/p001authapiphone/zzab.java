package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.AbstractC0801w;
import com.google.android.gms.common.api.internal.C0800v;
import com.google.android.gms.common.api.internal.InterfaceC0797s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p013b3.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzab extends a {
    public zzab(Activity activity) {
        super(activity);
    }

    public final Task<Void> startSmsRetriever() {
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(this.zza, (TaskCompletionSource) obj2));
            }
        };
        c0800vA.f11197d = new Feature[]{zzac.zzc};
        c0800vA.f11194a = 1567;
        return doWrite(c0800vA.e());
    }

    public final Task<Void> startSmsUserConsent(final String str) {
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(this.zza, (TaskCompletionSource) obj2));
            }
        };
        c0800vA.f11197d = new Feature[]{zzac.zzd};
        c0800vA.f11194a = 1568;
        return doWrite(c0800vA.e());
    }

    public zzab(Context context) {
        super(context);
    }
}
