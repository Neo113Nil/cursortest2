package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "proposedCursor", "cursor", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "transformedTextFieldState", "Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;", "calculateNextCursorPositionAndWedgeAffinity", "(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextPreparedSelectionKt {
    public static final long calculateNextCursorPositionAndWedgeAffinity(int i, int i2, androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState) {
        androidx.compose.foundation.text.input.internal.IndexTransformationType indexTransformationType;
        if (i == -1) {
            return androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2280constructorimpl(i2);
        }
        boolean z = i > i2;
        long m2270mapFromTransformedjx7JFs = transformedTextFieldState.m2270mapFromTransformedjx7JFs(i);
        long m2273mapToTransformedGEjPoXI = transformedTextFieldState.m2273mapToTransformedGEjPoXI(m2270mapFromTransformedjx7JFs);
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2270mapFromTransformedjx7JFs) && androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2273mapToTransformedGEjPoXI)) {
            indexTransformationType = androidx.compose.foundation.text.input.internal.IndexTransformationType.Untransformed;
        } else if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2270mapFromTransformedjx7JFs) && !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2273mapToTransformedGEjPoXI)) {
            indexTransformationType = androidx.compose.foundation.text.input.internal.IndexTransformationType.Replacement;
        } else if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2270mapFromTransformedjx7JFs) && !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2273mapToTransformedGEjPoXI)) {
            indexTransformationType = androidx.compose.foundation.text.input.internal.IndexTransformationType.Insertion;
        } else {
            indexTransformationType = androidx.compose.foundation.text.input.internal.IndexTransformationType.Deletion;
        }
        int i3 = androidx.compose.foundation.text.input.internal.selection.TextPreparedSelectionKt.WhenMappings.$EnumSwitchMapping$0[indexTransformationType.ordinal()];
        if (i3 == 1) {
            return androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2281constructorimpl(i, z ? androidx.compose.foundation.text.input.internal.WedgeAffinity.Start : androidx.compose.foundation.text.input.internal.WedgeAffinity.End);
        }
        if (i3 == 2) {
            return androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2280constructorimpl(i);
        }
        if (i3 == 3) {
            if (z) {
                return androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2281constructorimpl(androidx.compose.ui.text.TextRange.m8034getEndimpl(m2273mapToTransformedGEjPoXI), androidx.compose.foundation.text.input.internal.WedgeAffinity.Start);
            }
            return androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2281constructorimpl(androidx.compose.ui.text.TextRange.m8039getStartimpl(m2273mapToTransformedGEjPoXI), androidx.compose.foundation.text.input.internal.WedgeAffinity.End);
        }
        if (i3 != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (z) {
            if (i == androidx.compose.ui.text.TextRange.m8039getStartimpl(m2273mapToTransformedGEjPoXI)) {
                return androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2281constructorimpl(i, androidx.compose.foundation.text.input.internal.WedgeAffinity.Start);
            }
            return androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2281constructorimpl(androidx.compose.ui.text.TextRange.m8034getEndimpl(m2273mapToTransformedGEjPoXI), androidx.compose.foundation.text.input.internal.WedgeAffinity.End);
        }
        if (i == androidx.compose.ui.text.TextRange.m8034getEndimpl(m2273mapToTransformedGEjPoXI)) {
            return androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2281constructorimpl(i, androidx.compose.foundation.text.input.internal.WedgeAffinity.End);
        }
        return androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.m2281constructorimpl(androidx.compose.ui.text.TextRange.m8039getStartimpl(m2273mapToTransformedGEjPoXI), androidx.compose.foundation.text.input.internal.WedgeAffinity.Start);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.input.internal.IndexTransformationType.values().length];
            try {
                iArr[androidx.compose.foundation.text.input.internal.IndexTransformationType.Untransformed.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.input.internal.IndexTransformationType.Deletion.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.input.internal.IndexTransformationType.Replacement.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.foundation.text.input.internal.IndexTransformationType.Insertion.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
