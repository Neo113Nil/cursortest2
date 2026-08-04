package com.google.android.gms.ads.internal.offline.buffering;

import F2.C0227f;
import F2.C0247p;
import F2.C0252s;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbsh;
import p023d1.g;
import p023d1.j;
import p023d1.l;
import p023d1.m;

/* JADX INFO: loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zzbsh f10794x;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C0247p c0247p = C0252s.f2717f.f2719b;
        zzbok zzbokVar = new zzbok();
        c0247p.getClass();
        this.f10794x = (zzbsh) new C0227f(context, zzbokVar).d(context, false);
    }

    @Override // androidx.work.Worker
    public final m doWork() {
        try {
            this.f10794x.zzh();
            return new l(g.f12362c);
        } catch (RemoteException unused) {
            return new j();
        }
    }
}
