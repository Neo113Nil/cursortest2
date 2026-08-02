package org.betup.ui.fragment.login.compose;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.fragment.login.controller.AuthController;

/* compiled from: AuthContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.login.compose.AuthContentKt$AuthContent$4$1", f = "AuthContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class AuthContentKt$AuthContent$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AuthController $controller;
    final /* synthetic */ AuthScreen $initialScreen;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthContentKt$AuthContent$4$1(AuthScreen authScreen, AuthController authController, Continuation<? super AuthContentKt$AuthContent$4$1> continuation) {
        super(2, continuation);
        this.$initialScreen = authScreen;
        this.$controller = authController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AuthContentKt$AuthContent$4$1(this.$initialScreen, this.$controller, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AuthContentKt$AuthContent$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AuthScreen authScreen = this.$initialScreen;
        if (authScreen != null) {
            this.$controller.navigateTo(authScreen);
        }
        return Unit.INSTANCE;
    }
}
