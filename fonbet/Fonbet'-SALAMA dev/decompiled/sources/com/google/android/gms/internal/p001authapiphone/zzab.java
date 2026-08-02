package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import b3.AbstractC0780a;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.AbstractC0845w;
import com.google.android.gms.common.api.internal.C0844v;
import com.google.android.gms.common.api.internal.InterfaceC0841s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class zzab extends AbstractC0780a {
    public zzab(Activity activity) {
        super(activity);
    }

    public final Task<Void> startSmsRetriever() {
        C0844v a2 = AbstractC0845w.a();
        a2.f11196c = new InterfaceC0841s() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            @Override // com.google.android.gms.common.api.internal.InterfaceC0841s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(zzab.this, (TaskCompletionSource) obj2));
            }
        };
        a2.f11197d = new Feature[]{zzac.zzc};
        a2.f11194a = 1567;
        return doWrite(a2.e());
    }

    public final Task<Void> startSmsUserConsent(final String str) {
        C0844v a2 = AbstractC0845w.a();
        a2.f11196c = new InterfaceC0841s() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            @Override // com.google.android.gms.common.api.internal.InterfaceC0841s
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(zzab.this, (TaskCompletionSource) obj2));
            }
        };
        a2.f11197d = new Feature[]{zzac.zzd};
        a2.f11194a = 1568;
        return doWrite(a2.e());
    }

    public zzab(Context context) {
        super(context);
    }
}
