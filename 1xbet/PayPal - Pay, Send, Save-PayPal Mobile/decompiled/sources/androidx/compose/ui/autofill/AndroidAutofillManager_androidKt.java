package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidAutofillManager_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRanges(androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnAutofillText()) || semanticsConfiguration.getProps$ui().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnFillData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnAutofillText()) || semanticsConfiguration.getProps$ui().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnFillData()) || semanticsConfiguration.getProps$ui().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentType()) || semanticsConfiguration.getProps$ui().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDataType());
    }
}
