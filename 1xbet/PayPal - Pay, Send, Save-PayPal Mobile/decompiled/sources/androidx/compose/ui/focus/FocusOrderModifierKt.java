package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0006\u0010\n\u001a4\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusOrder;", "", "Lkotlin/ExtensionFunctionType;", "focusOrderReceiver", "focusOrder", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusOrderModifierKt {
    @kotlin.Deprecated(message = "Use focusProperties() instead", replaceWith = @kotlin.ReplaceWith(expression = "this.focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties"}))
    public static final androidx.compose.ui.Modifier focusOrder(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusOrder, kotlin.Unit> function1) {
        final androidx.compose.ui.focus.FocusOrderToProperties focusOrderToProperties = new androidx.compose.ui.focus.FocusOrderToProperties(function1);
        return androidx.compose.ui.focus.FocusPropertiesKt.focusProperties(modifier, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusProperties, kotlin.Unit>() { // from class: androidx.compose.ui.focus.FocusOrderModifierKt$focusOrder$1
            public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.focus.FocusProperties focusProperties) {
                androidx.compose.ui.focus.FocusOrderToProperties.this.apply(focusProperties);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusProperties focusProperties) {
                getHighSpeedVideoFpsRanges(focusProperties);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
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
            public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.focus.FocusProperties focusProperties) {
                androidx.compose.ui.focus.FocusOrderToProperties.this.apply(focusProperties);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusProperties focusProperties) {
                getHighSpeedVideoFpsRangesFor(focusProperties);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        });
    }
}
