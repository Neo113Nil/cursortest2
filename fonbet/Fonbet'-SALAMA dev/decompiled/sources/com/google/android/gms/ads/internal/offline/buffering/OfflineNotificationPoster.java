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
import d1.C0954g;
import d1.C0957j;
import d1.l;
import d1.m;
import o3.BinderC1507b;

/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: x, reason: collision with root package name */
    public final zzbsh f10793x;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C0247p c0247p = C0252s.f2717f.f2719b;
        zzbok zzbokVar = new zzbok();
        c0247p.getClass();
        this.f10793x = (zzbsh) new C0227f(context, zzbokVar).d(context, false);
    }

    @Override // androidx.work.Worker
    public final m doWork() {
        try {
            this.f10793x.zzj(new BinderC1507b(getApplicationContext()), new zza(getInputData().b("uri"), getInputData().b("gws_query_id"), getInputData().b("image_url")));
            return new l(C0954g.f12356c);
        } catch (RemoteException unused) {
            return new C0957j();
        }
    }
}
