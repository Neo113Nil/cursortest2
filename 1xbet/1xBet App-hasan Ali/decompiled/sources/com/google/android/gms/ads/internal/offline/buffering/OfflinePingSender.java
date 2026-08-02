package com.google.android.gms.ads.internal.offline.buffering;

import Q2.C0357f;
import Q2.C0375o;
import Q2.C0379q;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.InterfaceC0590Fb;
import f2.C1948f;
import f2.C1951i;
import f2.k;
import f2.l;

/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC0590Fb f7436q;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C0375o c0375o = C0379q.f.f5049b;
        BinderC0610Ia binderC0610Ia = new BinderC0610Ia();
        c0375o.getClass();
        this.f7436q = (InterfaceC0590Fb) new C0357f(context, binderC0610Ia).d(context, false);
    }

    @Override // androidx.work.Worker
    public final l doWork() {
        try {
            this.f7436q.g();
            return new k(C1948f.f16993c);
        } catch (RemoteException unused) {
            return new C1951i();
        }
    }
}
