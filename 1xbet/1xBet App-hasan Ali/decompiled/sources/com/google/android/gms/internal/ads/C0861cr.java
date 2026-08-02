package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.cr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0861cr implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13049a;

    public /* synthetic */ C0861cr(int i) {
        this.f13049a = i;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        Qw vw;
        switch (this.f13049a) {
            case 0:
                return new C0817br();
            case 1:
                return C2308a.f18886a;
            case 2:
                C1085hr c1085hr = new C1085hr();
                c1085hr.f13810a = null;
                return c1085hr;
            case 3:
                return new C1622tr();
            case 4:
                C0606Hd c0606Hd = AbstractC0613Id.f;
                AbstractC1400ot.D(c0606Hd);
                return c0606Hd;
            case 5:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (unconfigurableExecutorService instanceof Qw) {
                    vw = (Qw) unconfigurableExecutorService;
                } else {
                    vw = unconfigurableExecutorService instanceof ScheduledExecutorService ? new Vw((ScheduledExecutorService) unconfigurableExecutorService) : new C0606Hd(unconfigurableExecutorService);
                }
                AbstractC1400ot.D(vw);
                return vw;
            case 6:
                Vw vw2 = AbstractC0613Id.f9543e;
                AbstractC1400ot.D(vw2);
                return vw2;
            case 7:
                C0606Hd c0606Hd2 = AbstractC0613Id.f;
                AbstractC1400ot.D(c0606Hd2);
                return c0606Hd2;
            default:
                return new ThreadFactoryC1159jd(1);
        }
    }
}
