package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ LoadOfferwallAd $loadOfferwallAd;

    CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1(AdObject adObject, LoadOfferwallAd loadOfferwallAd) {
        this.$adObject = adObject;
        this.$loadOfferwallAd = loadOfferwallAd;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(objArr, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke2(Object[] objArr, Continuation<? super Unit> continuation) {
        CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1;
        int i;
        if (continuation instanceof CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) continuation;
            if ((commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = objArr[0];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    String optString = ((JSONObject) obj2).optString("placementName");
                    this.$adObject.setOfferwallAd(true);
                    this.$adObject.setOfferwallPlacementName(optString);
                    LoadOfferwallAd loadOfferwallAd = this.$loadOfferwallAd;
                    Intrinsics.checkNotNull(optString);
                    commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label = 1;
                    if (loadOfferwallAd.invoke(optString, commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1(this, continuation);
        Object obj3 = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
