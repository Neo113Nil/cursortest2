package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionData;", "Landroidx/compose/runtime/tooling/CompositionInstance;", "findCompositionInstance", "(Landroidx/compose/runtime/tooling/CompositionData;)Landroidx/compose/runtime/tooling/CompositionInstance;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositionDataKt {
    public static final androidx.compose.runtime.tooling.CompositionInstance findCompositionInstance(androidx.compose.runtime.tooling.CompositionData compositionData) {
        if (compositionData instanceof androidx.compose.runtime.tooling.CompositionInstance) {
            return (androidx.compose.runtime.tooling.CompositionInstance) compositionData;
        }
        return null;
    }
}
