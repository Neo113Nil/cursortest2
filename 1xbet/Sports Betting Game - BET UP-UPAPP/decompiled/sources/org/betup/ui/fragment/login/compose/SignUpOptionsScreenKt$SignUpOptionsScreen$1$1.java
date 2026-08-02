package org.betup.ui.fragment.login.compose;

import android.content.Context;
import androidx.compose.runtime.State;
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
import org.betup.utils.SnackbarHelper;

/* compiled from: SignUpOptionsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.login.compose.SignUpOptionsScreenKt$SignUpOptionsScreen$1$1", f = "SignUpOptionsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class SignUpOptionsScreenKt$SignUpOptionsScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ State<AuthController.LoginError> $loginError$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SignUpOptionsScreenKt$SignUpOptionsScreen$1$1(State<AuthController.LoginError> state, Context context, Continuation<? super SignUpOptionsScreenKt$SignUpOptionsScreen$1$1> continuation) {
        super(2, continuation);
        this.$loginError$delegate = state;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignUpOptionsScreenKt$SignUpOptionsScreen$1$1(this.$loginError$delegate, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignUpOptionsScreenKt$SignUpOptionsScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AuthController.LoginError SignUpOptionsScreen$lambda$1;
        String generalError;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            SignUpOptionsScreen$lambda$1 = SignUpOptionsScreenKt.SignUpOptionsScreen$lambda$1(this.$loginError$delegate);
            if (SignUpOptionsScreen$lambda$1 != null && (generalError = SignUpOptionsScreen$lambda$1.getGeneralError()) != null) {
                SnackbarHelper.showShort(this.$context, generalError);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
