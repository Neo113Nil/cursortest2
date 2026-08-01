package com.unity3d.ironsourceads.rewarded;

import com.ironsource.C4322ae;
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
public final class RewardedAdLoader {
    public static final RewardedAdLoader INSTANCE = new RewardedAdLoader();

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f11673a = O7.f7826a.d();

    private RewardedAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4767zb loadTask) {
        Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    @JvmStatic
    public static final void loadAd(RewardedAdRequest adRequest, RewardedAdLoaderListener listener) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f11673a, new C4322ae(adRequest, listener, C4464ic.e.a(IronSource.a.REWARDED_VIDEO), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, Cb loadTaskProvider) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final InterfaceC4767zb a2 = loadTaskProvider.a();
        executor.execute(new Runnable() { // from class: com.unity3d.ironsourceads.rewarded.RewardedAdLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RewardedAdLoader.a(InterfaceC4767zb.this);
            }
        });
    }
}
