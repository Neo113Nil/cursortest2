package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J#\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H¦\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/TextAutoSize;", "", "Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/unit/TextUnit;", "getFontSize-Ci0_558", "(Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;JLandroidx/compose/ui/text/AnnotatedString;)J", "getFontSize", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TextAutoSize {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.TextAutoSize.Companion INSTANCE = androidx.compose.foundation.text.TextAutoSize.Companion.getHighSpeedVideoFpsRanges;

    boolean equals(java.lang.Object other);

    /* renamed from: getFontSize-Ci0_558 */
    long mo1979getFontSizeCi0_558(androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j, androidx.compose.ui.text.AnnotatedString annotatedString);

    int hashCode();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/text/TextAutoSize$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/TextUnit;", "minFontSize", "maxFontSize", "stepSize", "Landroidx/compose/foundation/text/TextAutoSize;", "StepBased-vU-0ePk", "(JJJ)Landroidx/compose/foundation/text/TextAutoSize;", "StepBased"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ androidx.compose.foundation.text.TextAutoSize.Companion getHighSpeedVideoFpsRanges = new androidx.compose.foundation.text.TextAutoSize.Companion();

        private Companion() {
        }

        /* renamed from: StepBased-vU-0ePk$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.foundation.text.TextAutoSize m2092StepBasedvU0ePk$default(androidx.compose.foundation.text.TextAutoSize.Companion companion, long j, long j2, long j3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = androidx.compose.foundation.text.TextAutoSizeDefaults.INSTANCE.m2095getMinFontSizeXSAIIZE();
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = androidx.compose.foundation.text.TextAutoSizeDefaults.INSTANCE.m2094getMaxFontSizeXSAIIZE();
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = androidx.compose.ui.unit.TextUnitKt.getSp(0.25d);
            }
            return companion.m2093StepBasedvU0ePk(j4, j5, j3);
        }

        /* renamed from: StepBased-vU-0ePk, reason: not valid java name */
        public final androidx.compose.foundation.text.TextAutoSize m2093StepBasedvU0ePk(long minFontSize, long maxFontSize, long stepSize) {
            return new androidx.compose.foundation.text.AutoSizeStepBased(minFontSize, maxFontSize, stepSize, null);
        }
    }
}
