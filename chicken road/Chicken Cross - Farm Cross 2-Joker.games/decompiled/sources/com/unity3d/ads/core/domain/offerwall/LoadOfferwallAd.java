package com.unity3d.ads.core.domain.offerwall;

import com.unity3d.ads.core.data.manager.OfferwallManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadOfferwallAd.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086B¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/offerwall/LoadOfferwallAd;", "", "offerwallManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "<init>", "(Lcom/unity3d/ads/core/data/manager/OfferwallManager;)V", "invoke", "", "placementName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadOfferwallAd {
    private final OfferwallManager offerwallManager;

    public LoadOfferwallAd(OfferwallManager offerwallManager) {
        Intrinsics.checkNotNullParameter(offerwallManager, "offerwallManager");
        this.offerwallManager = offerwallManager;
    }

    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        Object loadAd = this.offerwallManager.loadAd(str, continuation);
        return loadAd == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? loadAd : Unit.INSTANCE;
    }
}
