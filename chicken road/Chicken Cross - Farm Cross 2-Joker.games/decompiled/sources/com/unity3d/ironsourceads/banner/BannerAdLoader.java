package com.unity3d.ironsourceads.banner;

import com.ironsource.C4329b3;
import com.ironsource.C4464ic;
import com.ironsource.Cb;
import com.ironsource.InterfaceC4767zb;
import com.ironsource.O7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.Executor;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BannerAdLoader {
    public static final BannerAdLoader INSTANCE = new BannerAdLoader();

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f11655a = O7.f7826a.d();

    private BannerAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4767zb loadTask) {
        Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    @JvmStatic
    public static final void loadAd(BannerAdRequest adRequest, BannerAdLoaderListener listener) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f11655a, new C4329b3(adRequest, listener, C4464ic.e.a(IronSource.a.BANNER), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, Cb loadTaskProvider) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final InterfaceC4767zb a2 = loadTaskProvider.a();
        executor.execute(new Runnable() { // from class: com.unity3d.ironsourceads.banner.BannerAdLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BannerAdLoader.a(InterfaceC4767zb.this);
            }
        });
    }
}
