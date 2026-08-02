package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.AbstractC0847v;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0878u;
import com.google.android.gms.common.internal.InterfaceC0879v;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class d extends g implements InterfaceC0879v {
    public static final com.google.android.gms.common.api.a a = new com.google.android.gms.common.api.a("ClientTelemetry.API", new c(), new a.g());

    public final Task<Void> a(final C0878u c0878u) {
        AbstractC0847v.a a2 = AbstractC0847v.a();
        a2.c = new C0854d[]{zaf.zaa};
        a2.b = false;
        a2.a = new r() { // from class: com.google.android.gms.common.internal.service.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                com.google.android.gms.common.api.a aVar = d.a;
                a aVar2 = (a) ((e) obj).getService();
                Parcel zaa = aVar2.zaa();
                zac.zac(zaa, C0878u.this);
                aVar2.zad(1, zaa);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        };
        return doBestEffortWrite(a2.a());
    }
}
