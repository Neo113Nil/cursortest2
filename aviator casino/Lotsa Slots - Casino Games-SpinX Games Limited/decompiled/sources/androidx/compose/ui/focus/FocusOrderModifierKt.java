package androidx.compose.ui.focus;

/* compiled from: FocusOrderModifier.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007¨\u0006\t"}, d2 = {"focusOrder", "Landroidx/compose/ui/Modifier;", "focusOrderReceiver", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusOrder;", "", "Lkotlin/ExtensionFunctionType;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusOrderModifierKt {
    @kotlin.Deprecated(message = "Use focusProperties() instead", replaceWith = @kotlin.ReplaceWith(expression = "this.focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties"}))
    public static final androidx.compose.ui.Modifier focusOrder(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusOrder, kotlin.Unit> function1) {
        final androidx.compose.ui.focus.FocusOrderToProperties focusOrderToProperties = new androidx.compose.ui.focus.FocusOrderToProperties(function1);
        return androidx.compose.ui.focus.FocusPropertiesKt.focusProperties(modifier, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusProperties, kotlin.Unit>() { // from class: androidx.compose.ui.focus.FocusOrderModifierKt$focusOrder$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusProperties focusProperties) {
                invoke2(focusProperties);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.focus.FocusProperties focusProperties) {
                androidx.compose.ui.focus.FocusOrderToProperties.this.apply(focusProperties);
            }
        });
    }

    @kotlin.Deprecated(message = "Use focusRequester() instead", replaceWith = @kotlin.ReplaceWith(expression = "this.focusRequester(focusRequester)", imports = {"androidx.compose.ui.focus.focusRequester"}))
    public static final androidx.compose.ui.Modifier focusOrder(androidx.compose.ui.Modifier modifier, androidx.compose.ui.focus.FocusRequester focusRequester) {
        return androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(modifier, focusRequester);
    }

    @kotlin.Deprecated(message = "Use focusProperties() and focusRequester() instead", replaceWith = @kotlin.ReplaceWith(expression = "this.focusRequester(focusRequester).focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties, androidx.compose.ui.focus.focusRequester"}))
    public static final androidx.compose.ui.Modifier focusOrder(androidx.compose.ui.Modifier modifier, androidx.compose.ui.focus.FocusRequester focusRequester, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusOrder, kotlin.Unit> function1) {
        final androidx.compose.ui.focus.FocusOrderToProperties focusOrderToProperties = new androidx.compose.ui.focus.FocusOrderToProperties(function1);
        return androidx.compose.ui.focus.FocusPropertiesKt.focusProperties(androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(modifier, focusRequester), new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusProperties, kotlin.Unit>() { // from class: androidx.compose.ui.focus.FocusOrderModifierKt$focusOrder$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusProperties focusProperties) {
                invoke2(focusProperties);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.focus.FocusProperties focusProperties) {
                androidx.compose.ui.focus.FocusOrderToProperties.this.apply(focusProperties);
            }
        });
    }
}
