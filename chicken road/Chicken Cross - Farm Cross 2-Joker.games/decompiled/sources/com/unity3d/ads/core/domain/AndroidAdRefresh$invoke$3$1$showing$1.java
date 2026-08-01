package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AndroidAdRefresh.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$showing$1", f = "AndroidAdRefresh.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AndroidAdRefresh$invoke$3$1$showing$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AdObjectState>, Object> {
    final /* synthetic */ AdObject $adObject;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidAdRefresh$invoke$3$1$showing$1(AdObject adObject, Continuation<? super AndroidAdRefresh$invoke$3$1$showing$1> continuation) {
        super(2, continuation);
        this.$adObject = adObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidAdRefresh$invoke$3$1$showing$1(this.$adObject, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AdObjectState> continuation) {
        return ((AndroidAdRefresh$invoke$3$1$showing$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: AndroidAdRefresh.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$showing$1$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<Object, Continuation<? super Boolean>, Object>, SuspendFunction {
        AnonymousClass1(Object obj) {
            super(2, obj, AdObjectState.class, "equals", "equals(Ljava/lang/Object;)Z", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return AndroidAdRefresh$invoke$3$1$showing$1.invokeSuspend$equals((AdObjectState) this.receiver, obj, continuation);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = FlowKt.first(this.$adObject.getState(), new AnonymousClass1(AdObjectState.SHOWING), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$equals(AdObjectState adObjectState, Object obj, Continuation continuation) {
        return Boxing.boxBoolean(adObjectState.equals(obj));
    }
}
