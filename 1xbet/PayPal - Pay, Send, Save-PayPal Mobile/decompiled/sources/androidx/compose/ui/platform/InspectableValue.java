package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/InspectableValue;", "", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "getInspectableElements", "()Lkotlin/sequences/Sequence;", "inspectableElements", "", "getNameFallback", "()Ljava/lang/String;", "nameFallback", "getValueOverride", "()Ljava/lang/Object;", "valueOverride"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InspectableValue {
    default java.lang.String getNameFallback() {
        return null;
    }

    default java.lang.Object getValueOverride() {
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static kotlin.sequences.Sequence<androidx.compose.ui.platform.ValueElement> getInspectableElements(androidx.compose.ui.platform.InspectableValue inspectableValue) {
            return androidx.compose.ui.platform.InspectableValue.super.getInspectableElements();
        }

        @java.lang.Deprecated
        public static java.lang.String getNameFallback(androidx.compose.ui.platform.InspectableValue inspectableValue) {
            return androidx.compose.ui.platform.InspectableValue.super.getNameFallback();
        }

        @java.lang.Deprecated
        public static java.lang.Object getValueOverride(androidx.compose.ui.platform.InspectableValue inspectableValue) {
            return androidx.compose.ui.platform.InspectableValue.super.getValueOverride();
        }
    }

    default kotlin.sequences.Sequence<androidx.compose.ui.platform.ValueElement> getInspectableElements() {
        return kotlin.sequences.SequencesKt.emptySequence();
    }
}
