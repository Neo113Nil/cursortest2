package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {0}, l = {151}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class AndroidFullscreenWebViewAdPlayer$show$11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $defaultIntentFlags;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ CompletableDeferred<Unit> $listenerStarted;
    final /* synthetic */ int $selectedIntentFlags;
    final /* synthetic */ ShowOptions $showOptions;
    final /* synthetic */ Context $startContext;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFullscreenWebViewAdPlayer$show$11(CompletableDeferred<Unit> completableDeferred, Context context, Intent intent, int i, int i2, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, Continuation<? super AndroidFullscreenWebViewAdPlayer$show$11> continuation) {
        super(2, continuation);
        this.$listenerStarted = completableDeferred;
        this.$startContext = context;
        this.$intent = intent;
        this.$selectedIntentFlags = i;
        this.$defaultIntentFlags = i2;
        this.this$0 = androidFullscreenWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AndroidFullscreenWebViewAdPlayer$show$11 androidFullscreenWebViewAdPlayer$show$11 = new AndroidFullscreenWebViewAdPlayer$show$11(this.$listenerStarted, this.$startContext, this.$intent, this.$selectedIntentFlags, this.$defaultIntentFlags, this.this$0, this.$showOptions, continuation);
        androidFullscreenWebViewAdPlayer$show$11.L$0 = obj;
        return androidFullscreenWebViewAdPlayer$show$11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AndroidFullscreenWebViewAdPlayer$show$11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m8079constructorimpl;
        Intent intent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.L$0 = (CoroutineScope) this.L$0;
            this.label = 1;
            if (this.$listenerStarted.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Context context = this.$startContext;
        Intent intent2 = this.$intent;
        try {
            Result.Companion companion = Result.INSTANCE;
            context.startActivity(intent2);
            m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        int i2 = this.$selectedIntentFlags;
        int i3 = this.$defaultIntentFlags;
        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
        Context context2 = this.$startContext;
        ShowOptions showOptions = this.$showOptions;
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            if (i2 != i3) {
                intent = androidFullscreenWebViewAdPlayer.getIntent(context2, (AndroidShowOptions) showOptions, i3);
                context2.startActivity(intent);
            } else {
                throw m8082exceptionOrNullimpl;
            }
        }
        return Unit.INSTANCE;
    }
}
