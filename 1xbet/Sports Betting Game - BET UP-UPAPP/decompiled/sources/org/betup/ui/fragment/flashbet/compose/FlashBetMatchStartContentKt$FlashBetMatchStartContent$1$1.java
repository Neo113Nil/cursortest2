package org.betup.ui.fragment.flashbet.compose;

import android.content.Context;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.fragment.flashbet.FlashBetUiSoundEffect;

/* compiled from: FlashBetMatchStartContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$FlashBetMatchStartContent$1$1", f = "FlashBetMatchStartContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetMatchStartContentKt$FlashBetMatchStartContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $appContext;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetMatchStartContentKt$FlashBetMatchStartContent$1$1(Context context, Continuation<? super FlashBetMatchStartContentKt$FlashBetMatchStartContent$1$1> continuation) {
        super(2, continuation);
        this.$appContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetMatchStartContentKt$FlashBetMatchStartContent$1$1(this.$appContext, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetMatchStartContentKt$FlashBetMatchStartContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FlashBetUiSoundEffect flashBetUiSoundEffect = FlashBetUiSoundEffect.INSTANCE;
        Context context = this.$appContext;
        Intrinsics.checkNotNull(context);
        flashBetUiSoundEffect.prepare(context);
        return Unit.INSTANCE;
    }
}
