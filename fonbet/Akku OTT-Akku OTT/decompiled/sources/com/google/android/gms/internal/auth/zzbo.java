package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.b;
import com.google.android.gms.auth.api.c;
import com.google.android.gms.auth.api.proxy.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.AbstractC0847v;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzbo extends g {
    public zzbo(@NonNull Activity activity, @Nullable c cVar) {
        super(activity, b.a, cVar == null ? c.b : cVar, g.a.c);
    }

    public final Task<String> getSpatulaHeader() {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.a = new r() { // from class: com.google.android.gms.internal.auth.zzbk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(zzbo.this, (TaskCompletionSource) obj2));
            }
        };
        a.d = 1520;
        return doRead(a.a());
    }

    public final Task<com.google.android.gms.auth.api.proxy.b> performProxyRequest(@NonNull final a aVar) {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.a = new r() { // from class: com.google.android.gms.internal.auth.zzbl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = zzbo.this;
                a aVar2 = aVar;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), aVar2);
            }
        };
        a.d = 1518;
        return doWrite(a.a());
    }

    public zzbo(@NonNull Context context, @Nullable c cVar) {
        super(context, b.a, cVar == null ? c.b : cVar, g.a.c);
    }
}
