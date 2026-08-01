package com.unity3d.ads.adplayer;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: FullScreenWebViewDisplay.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/adplayer/DisplayMessage;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1", f = "FullScreenWebViewDisplay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1 extends SuspendLambda implements Function2<FlowCollector<? super DisplayMessage>, Continuation<? super Unit>, Object> {
    final /* synthetic */ CancellableContinuation<Unit> $continuation;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, CancellableContinuation<? super Unit> cancellableContinuation, Continuation<? super FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1> continuation) {
        super(2, continuation);
        this.this$0 = fullScreenWebViewDisplay;
        this.$continuation = cancellableContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this.this$0, this.$continuation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super DisplayMessage> flowCollector, Continuation<? super Unit> continuation) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: FullScreenWebViewDisplay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1", f = "FullScreenWebViewDisplay.kt", i = {0, 1}, l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 135}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CancellableContinuation<Unit> $continuation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, CancellableContinuation<? super Unit> cancellableContinuation, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fullScreenWebViewDisplay;
            this.$continuation = cancellableContinuation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$continuation, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00b9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            AdObject adObject;
            AdObject adObject2;
            LoadEvent loadEvent;
            AdPlayer adPlayer;
            Flow<LoadEvent> onLoadEvent;
            MutableSharedFlow<DisplayMessage> displayMessages;
            String str;
            CoroutineScope coroutineScope2;
            ISDKDispatchers dispatchers;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                adObject = this.this$0.getAdObject();
                if ((adObject != null ? adObject.getWebViewLessLoadingRequiredData() : null) != null) {
                    adObject2 = this.this$0.getAdObject();
                    if (adObject2 == null || (adPlayer = adObject2.getAdPlayer()) == null || (onLoadEvent = adPlayer.getOnLoadEvent()) == null) {
                        loadEvent = null;
                        if (loadEvent instanceof LoadEvent.Error) {
                            this.this$0.setResult(0);
                            dispatchers = this.this$0.getDispatchers();
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(dispatchers.getDefault()), null, null, new C16291(this.this$0, null), 3, null);
                            this.this$0.finish();
                            CancellableContinuation.DefaultImpls.cancel$default(this.$continuation, null, 1, null);
                        }
                    } else {
                        this.L$0 = coroutineScope;
                        this.label = 1;
                        obj = FlowKt.single(onLoadEvent, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                str = this.this$0.opportunityId;
                this.L$0 = coroutineScope;
                this.label = 2;
                if (displayMessages.emit(new DisplayMessage.WebViewInstanceRequest(str), this) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope2 = coroutineScope;
                CoroutineScopeKt.ensureActive(coroutineScope2);
                CancellableContinuation<Unit> cancellableContinuation = this.$continuation;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8079constructorimpl(Unit.INSTANCE));
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                CoroutineScopeKt.ensureActive(coroutineScope2);
                CancellableContinuation<Unit> cancellableContinuation2 = this.$continuation;
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuation2.resumeWith(Result.m8079constructorimpl(Unit.INSTANCE));
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            loadEvent = (LoadEvent) obj;
            if (loadEvent instanceof LoadEvent.Error) {
            }
            displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
            str = this.this$0.opportunityId;
            this.L$0 = coroutineScope;
            this.label = 2;
            if (displayMessages.emit(new DisplayMessage.WebViewInstanceRequest(str), this) != coroutine_suspended) {
            }
        }

        /* compiled from: FullScreenWebViewDisplay.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1", f = "FullScreenWebViewDisplay.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C16291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C16291(FullScreenWebViewDisplay fullScreenWebViewDisplay, Continuation<? super C16291> continuation) {
                super(2, continuation);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C16291(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C16291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                    str = this.this$0.opportunityId;
                    this.label = 1;
                    if (displayMessages.emit(new DisplayMessage.DisplayError(str, "Error loading webView"), this) == coroutine_suspended) {
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
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ISDKDispatchers dispatchers;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.this$0);
        dispatchers = this.this$0.getDispatchers();
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, dispatchers.getDefault(), null, new AnonymousClass1(this.this$0, this.$continuation, null), 2, null);
        return Unit.INSTANCE;
    }
}
