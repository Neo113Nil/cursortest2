package com.unity3d.ads.core.domain.exposure;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class CommonAdViewerExposedFunctionsKt$omStartSession$1 implements com.unity3d.ads.adplayer.ExposedFunction {
    final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
    final /* synthetic */ com.unity3d.ads.core.domain.om.AndroidOmInteraction $omStartSession;

    CommonAdViewerExposedFunctionsKt$omStartSession$1(com.unity3d.ads.core.domain.om.AndroidOmInteraction androidOmInteraction, com.unity3d.ads.core.data.model.AdObject adObject) {
        this.$omStartSession = androidOmInteraction;
        this.$adObject = adObject;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1;
        int i;
        if (continuation instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) continuation;
            if ((commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Object obj2 = objArr[0];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    com.unity3d.ads.core.domain.om.AndroidOmInteraction androidOmInteraction = this.$omStartSession;
                    com.unity3d.ads.core.data.model.AdObject adObject = this.$adObject;
                    commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label = 1;
                    if (androidOmInteraction.invoke(adObject, (org.json.JSONObject) obj2, commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1(this, continuation);
        java.lang.Object obj3 = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
