package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/OffsetMapping;", "", "", "offset", "originalToTransformed", "(I)I", "transformedToOriginal", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface OffsetMapping {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.input.OffsetMapping.Companion INSTANCE = androidx.compose.ui.text.input.OffsetMapping.Companion.getHighSpeedVideoSizes;

    int originalToTransformed(int offset);

    int transformedToOriginal(int offset);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/input/OffsetMapping$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/OffsetMapping;", "Identity", "Landroidx/compose/ui/text/input/OffsetMapping;", "getIdentity", "()Landroidx/compose/ui/text/input/OffsetMapping;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.text.input.OffsetMapping.Companion getHighSpeedVideoSizes = new androidx.compose.ui.text.input.OffsetMapping.Companion();
        private static final androidx.compose.ui.text.input.OffsetMapping Identity = new androidx.compose.ui.text.input.OffsetMapping() { // from class: androidx.compose.ui.text.input.OffsetMapping$Companion$Identity$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int originalToTransformed(int offset) {
                return offset;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int transformedToOriginal(int offset) {
                return offset;
            }
        };

        private Companion() {
        }

        public final androidx.compose.ui.text.input.OffsetMapping getIdentity() {
            return Identity;
        }
    }
}
