package com.paypal.pds.components.textinput;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a3\u0010\u0007\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "createKeyboardActionCallback", "(Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KeyboardActionAdapterKt {
    public static final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> createKeyboardActionCallback(final androidx.compose.foundation.text.KeyboardOptions keyboardOptions, final androidx.compose.foundation.text.KeyboardActions keyboardActions, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardActions, "");
        composer.startReplaceGroup(-1330662834);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1330662834, i, -1, "com.paypal.pds.components.textinput.createKeyboardActionCallback (KeyboardActionAdapter.kt:52)");
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(keyboardActions, androidx.compose.foundation.text.KeyboardActions.INSTANCE.getDefault())) {
            boolean z = true;
            boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(keyboardOptions)) || (i & 6) == 4;
            if ((((i & 112) ^ 48) <= 32 || !composer.changed(keyboardActions)) && (i & 48) != 32) {
                z = false;
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.textinput.KeyboardActionAdapterKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.textinput.KeyboardActionAdapterKt.m22090$r8$lambda$yMwXjTgimXnSgTZLN4zJAVgaCo(androidx.compose.foundation.text.KeyboardOptions.this, keyboardActions, (kotlin.jvm.functions.Function0) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return function1;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return null;
    }

    /* renamed from: $r8$lambda$yMw-XjTgimXnSgTZLN4zJAVgaCo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22090$r8$lambda$yMwXjTgimXnSgTZLN4zJAVgaCo(androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        com.paypal.pds.components.textinput.KeyboardActionScopeImpl keyboardActionScopeImpl = new com.paypal.pds.components.textinput.KeyboardActionScopeImpl(function0);
        int imeAction = keyboardOptions.getImeAction();
        kotlin.jvm.functions.Function1<androidx.compose.foundation.text.KeyboardActionScope, kotlin.Unit> onDone = androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8214getDoneeUduSuo()) ? keyboardActions.getOnDone() : androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8215getGoeUduSuo()) ? keyboardActions.getOnGo() : androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8216getNexteUduSuo()) ? keyboardActions.getOnNext() : androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8218getPreviouseUduSuo()) ? keyboardActions.getOnPrevious() : androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8219getSearcheUduSuo()) ? keyboardActions.getOnSearch() : androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(imeAction, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8220getSendeUduSuo()) ? keyboardActions.getOnSend() : null;
        if (onDone != null) {
            onDone.invoke(keyboardActionScopeImpl);
        } else {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }
}
