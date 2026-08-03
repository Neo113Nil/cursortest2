package com.unity3d.ads.core.domain;

/* compiled from: CleanUpWhenOpportunityExpires.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1", f = "CleanUpWhenOpportunityExpires.kt", i = {}, l = {33, 34, 39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CleanUpWhenOpportunityExpires$invoke$job$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CleanUpWhenOpportunityExpires$invoke$job$1(com.unity3d.ads.core.data.model.AdObject adObject, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1> continuation) {
        super(2, continuation);
        this.$adObject = adObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1(this.$adObject, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.time.Duration value;
        long rawValue;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            value = this.$adObject.getTtl().getValue();
            if (value == null) {
                this.label = 1;
                obj = kotlinx.coroutines.flow.FlowKt.first(kotlinx.coroutines.flow.FlowKt.filterNotNull(this.$adObject.getTtl()), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            rawValue = value.getRawValue();
            this.label = 2;
            if (kotlinx.coroutines.DelayKt.m12291delayVtjQ1oo(rawValue, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (this.$adObject.getState().getValue() != com.unity3d.ads.core.data.model.AdObjectState.SHOWING) {
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.$adObject.getState().getValue() != com.unity3d.ads.core.data.model.AdObjectState.SHOWING) {
                this.label = 3;
                if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.NonCancellable.INSTANCE, new com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1.AnonymousClass1(this.$adObject, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        value = (kotlin.time.Duration) obj;
        rawValue = value.getRawValue();
        this.label = 2;
        if (kotlinx.coroutines.DelayKt.m12291delayVtjQ1oo(rawValue, this) == coroutine_suspended) {
        }
        if (this.$adObject.getState().getValue() != com.unity3d.ads.core.data.model.AdObjectState.SHOWING) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* compiled from: CleanUpWhenOpportunityExpires.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1", f = "CleanUpWhenOpportunityExpires.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.unity3d.ads.core.data.model.AdObject adObject, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$adObject = adObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1.AnonymousClass1(this.$adObject, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.$adObject.getState().setValue(com.unity3d.ads.core.data.model.AdObjectState.EXPIRED);
                this.label = 1;
                if (this.$adObject.getAdPlayer().destroy(this) == coroutine_suspended) {
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
}
