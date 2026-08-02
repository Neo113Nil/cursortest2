package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/VisualTransformation;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/TransformedText;", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface VisualTransformation {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.input.VisualTransformation.Companion INSTANCE = androidx.compose.ui.text.input.VisualTransformation.Companion.getHighSpeedVideoFpsRangesFor;

    androidx.compose.ui.text.input.TransformedText filter(androidx.compose.ui.text.AnnotatedString text);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/input/VisualTransformation$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/VisualTransformation;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Landroidx/compose/ui/text/input/VisualTransformation;", "getNone", "()Landroidx/compose/ui/text/input/VisualTransformation;", "getNone$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.text.input.VisualTransformation.Companion getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.text.input.VisualTransformation.Companion();
        private static final androidx.compose.ui.text.input.VisualTransformation None = new androidx.compose.ui.text.input.VisualTransformation() { // from class: androidx.compose.ui.text.input.VisualTransformation$Companion$$ExternalSyntheticLambda0
            @Override // androidx.compose.ui.text.input.VisualTransformation
            public final androidx.compose.ui.text.input.TransformedText filter(androidx.compose.ui.text.AnnotatedString annotatedString) {
                return androidx.compose.ui.text.input.VisualTransformation.Companion.m8281$r8$lambda$lVQGMqHtfjmEwPaE6dqnfDBlU(annotatedString);
            }
        };

        public static /* synthetic */ void getNone$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.ui.text.input.VisualTransformation getNone() {
            return None;
        }

        /* renamed from: $r8$lambda$lVQGM-qHtfjm-EwPaE6dqnfDBlU, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.text.input.TransformedText m8281$r8$lambda$lVQGMqHtfjmEwPaE6dqnfDBlU(androidx.compose.ui.text.AnnotatedString annotatedString) {
            return new androidx.compose.ui.text.input.TransformedText(annotatedString, androidx.compose.ui.text.input.OffsetMapping.INSTANCE.getIdentity());
        }
    }
}
