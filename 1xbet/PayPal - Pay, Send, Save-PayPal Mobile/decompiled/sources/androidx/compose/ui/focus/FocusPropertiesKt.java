package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000¢\u0006\u0002\b\u0005*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u000b\u001a\u00020\b*\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0000¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "Landroidx/compose/ui/focus/FocusRequester;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "", "Lkotlin/ExtensionFunctionType;", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusProperties;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "focusProperties", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusPropertiesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusEnterExitScope, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI(final kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusDirection, androidx.compose.ui.focus.FocusRequester> function1) {
        return new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusEnterExitScope, kotlin.Unit>() { // from class: androidx.compose.ui.focus.FocusPropertiesKt$toUsingEnterExitScope$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusEnterExitScope focusEnterExitScope) {
                getHighSpeedVideoFpsRangesFor(focusEnterExitScope);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.focus.FocusEnterExitScope focusEnterExitScope) {
                androidx.compose.ui.focus.FocusRequester invoke = function1.invoke(androidx.compose.ui.focus.FocusDirection.m5642boximpl(focusEnterExitScope.getRequestedFocusDirection()));
                if (invoke == androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel()) {
                    focusEnterExitScope.cancelFocusChange();
                } else if (invoke != androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault()) {
                    androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(invoke, 0, 1, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        };
    }

    public static final androidx.compose.ui.Modifier focusProperties(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusProperties, kotlin.Unit> function1) {
        return modifier.then(new androidx.compose.ui.focus.FocusPropertiesElement(new androidx.compose.ui.focus.FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0(function1)));
    }
}
