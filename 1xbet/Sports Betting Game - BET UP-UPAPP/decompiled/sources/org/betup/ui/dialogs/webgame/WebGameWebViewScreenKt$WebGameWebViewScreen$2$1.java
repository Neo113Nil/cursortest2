package org.betup.ui.dialogs.webgame;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: WebGameWebViewScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.webgame.WebGameWebViewScreenKt$WebGameWebViewScreen$2$1", f = "WebGameWebViewScreen.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class WebGameWebViewScreenKt$WebGameWebViewScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $isWebContentReady$delegate;
    final /* synthetic */ MutableState<Boolean> $keepLoaderVisible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebGameWebViewScreenKt$WebGameWebViewScreen$2$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super WebGameWebViewScreenKt$WebGameWebViewScreen$2$1> continuation) {
        super(2, continuation);
        this.$isWebContentReady$delegate = mutableState;
        this.$keepLoaderVisible$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebGameWebViewScreenKt$WebGameWebViewScreen$2$1(this.$isWebContentReady$delegate, this.$keepLoaderVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WebGameWebViewScreenKt$WebGameWebViewScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean WebGameWebViewScreen$lambda$4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WebGameWebViewScreen$lambda$4 = WebGameWebViewScreenKt.WebGameWebViewScreen$lambda$4(this.$isWebContentReady$delegate);
            if (WebGameWebViewScreen$lambda$4) {
                this.label = 1;
                if (DelayKt.delay(350L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WebGameWebViewScreenKt.WebGameWebViewScreen$lambda$8(this.$keepLoaderVisible$delegate, false);
        return Unit.INSTANCE;
    }
}
