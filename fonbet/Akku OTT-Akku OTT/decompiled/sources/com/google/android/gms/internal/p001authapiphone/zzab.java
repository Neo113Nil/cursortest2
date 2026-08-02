package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.phone.a;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.internal.AbstractC0847v;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzab extends a {
    public zzab(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.auth.api.phone.a
    public final Task<Void> startSmsRetriever() {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(zzab.this, (TaskCompletionSource) obj2));
            }
        };
        a.c = new C0854d[]{zzac.zzc};
        a.d = 1567;
        return doWrite(a.a());
    }

    @Override // com.google.android.gms.auth.api.phone.a
    public final Task<Void> startSmsUserConsent(@Nullable final String str) {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(zzab.this, (TaskCompletionSource) obj2));
            }
        };
        a.c = new C0854d[]{zzac.zzd};
        a.d = 1568;
        return doWrite(a.a());
    }

    public zzab(Context context) {
        super(context);
    }
}
