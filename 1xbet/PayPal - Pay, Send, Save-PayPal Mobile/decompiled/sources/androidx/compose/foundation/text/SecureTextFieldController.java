package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001f"}, d2 = {"Landroidx/compose/foundation/text/SecureTextFieldController;", "", "Landroidx/compose/runtime/State;", "", "obfuscationMaskState", "<init>", "(Landroidx/compose/runtime/State;)V", "", "observeHideEvents", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "()V", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/State;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/text/PasswordInputTransformation;", "passwordInputTransformation", "Landroidx/compose/foundation/text/PasswordInputTransformation;", "getPasswordInputTransformation", "()Landroidx/compose/foundation/text/PasswordInputTransformation;", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "codepointTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "getCodepointTransformation", "()Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "Landroidx/compose/ui/Modifier;", "focusChangeModifier", "Landroidx/compose/ui/Modifier;", "getFocusChangeModifier", "()Landroidx/compose/ui/Modifier;", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/channels/Channel;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SecureTextFieldController {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.State<java.lang.Character> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.foundation.text.PasswordInputTransformation passwordInputTransformation = new androidx.compose.foundation.text.PasswordInputTransformation(new androidx.compose.foundation.text.SecureTextFieldController$passwordInputTransformation$1(this));
    private final androidx.compose.foundation.text.input.internal.CodepointTransformation codepointTransformation = new androidx.compose.foundation.text.input.internal.CodepointTransformation() { // from class: androidx.compose.foundation.text.SecureTextFieldController$$ExternalSyntheticLambda0
        @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
        public final int transform(int i, int i2) {
            int Camera2StreamConfigurationMap;
            Camera2StreamConfigurationMap = androidx.compose.foundation.text.SecureTextFieldController.Camera2StreamConfigurationMap(androidx.compose.foundation.text.SecureTextFieldController.this, i, i2);
            return Camera2StreamConfigurationMap;
        }
    };
    private final androidx.compose.ui.Modifier focusChangeModifier = androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.SecureTextFieldController$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.SecureTextFieldController.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.SecureTextFieldController.this, (androidx.compose.ui.focus.FocusState) obj);
            return highSpeedVideoFpsRangesFor;
        }
    });

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<kotlin.Unit> Camera2StreamConfigurationMap = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

    public SecureTextFieldController(androidx.compose.runtime.State<java.lang.Character> state) {
        this.getHighResolutionOutputSizeshNQ4ISI = state;
    }

    public final androidx.compose.foundation.text.PasswordInputTransformation getPasswordInputTransformation() {
        return this.passwordInputTransformation;
    }

    public final androidx.compose.foundation.text.input.internal.CodepointTransformation getCodepointTransformation() {
        return this.codepointTransformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Camera2StreamConfigurationMap(androidx.compose.foundation.text.SecureTextFieldController secureTextFieldController, int i, int i2) {
        return i == secureTextFieldController.passwordInputTransformation.getRevealCodepointIndex$foundation() ? i2 : secureTextFieldController.getHighResolutionOutputSizeshNQ4ISI.getValue().charValue();
    }

    public final androidx.compose.ui.Modifier getFocusChangeModifier() {
        return this.focusChangeModifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.SecureTextFieldController secureTextFieldController, androidx.compose.ui.focus.FocusState focusState) {
        if (!focusState.isFocused()) {
            secureTextFieldController.passwordInputTransformation.hide();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object observeHideEvents(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collectLatest = kotlinx.coroutines.flow.FlowKt.collectLatest(kotlinx.coroutines.flow.FlowKt.consumeAsFlow(this.Camera2StreamConfigurationMap), new androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2(this, null), continuation);
        return collectLatest == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collectLatest : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes() {
        if (kotlinx.coroutines.channels.ChannelResult.m24088isFailureimpl(this.Camera2StreamConfigurationMap.mo9266trySendJP2dKIU(kotlin.Unit.INSTANCE))) {
            this.passwordInputTransformation.hide();
        }
    }
}
