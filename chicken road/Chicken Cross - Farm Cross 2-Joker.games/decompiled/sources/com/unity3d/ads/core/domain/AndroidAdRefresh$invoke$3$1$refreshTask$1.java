package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdRefreshState;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidAdRefresh.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$refreshTask$1", f = "AndroidAdRefresh.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AndroidAdRefresh$invoke$3$1$refreshTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ AdObject $adObject;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidAdRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidAdRefresh$invoke$3$1$refreshTask$1(AndroidAdRefresh androidAdRefresh, AdObject adObject, Continuation<? super AndroidAdRefresh$invoke$3$1$refreshTask$1> continuation) {
        super(2, continuation);
        this.this$0 = androidAdRefresh;
        this.$adObject = adObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AndroidAdRefresh$invoke$3$1$refreshTask$1 androidAdRefresh$invoke$3$1$refreshTask$1 = new AndroidAdRefresh$invoke$3$1$refreshTask$1(this.this$0, this.$adObject, continuation);
        androidAdRefresh$invoke$3$1$refreshTask$1.L$0 = obj;
        return androidAdRefresh$invoke$3$1$refreshTask$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((AndroidAdRefresh$invoke$3$1$refreshTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m8079constructorimpl;
        boolean canUpdateRefreshData;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;
        Object performRefresh;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AndroidAdRefresh androidAdRefresh = this.this$0;
                AdObject adObject = this.$adObject;
                Result.Companion companion = Result.INSTANCE;
                ByteString opportunityId = adObject.getOpportunityId();
                this.label = 1;
                performRefresh = androidAdRefresh.performRefresh(opportunityId, this);
                if (performRefresh == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        AndroidAdRefresh androidAdRefresh2 = this.this$0;
        AdObject adObject2 = this.$adObject;
        if (Result.m8082exceptionOrNullimpl(m8079constructorimpl) != null) {
            canUpdateRefreshData = androidAdRefresh2.canUpdateRefreshData(adObject2.getState().getValue());
            if (canUpdateRefreshData && (webViewLessLoadingRequiredData = adObject2.getWebViewLessLoadingRequiredData()) != null) {
                webViewLessLoadingRequiredData.setAdRefreshState(AdRefreshState.REUSE_ERROR);
            }
        }
        return Result.m8078boximpl(m8079constructorimpl);
    }
}
