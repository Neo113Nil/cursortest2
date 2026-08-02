package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aL\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022(\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\b¢\u0006\u0004\b\t\u0010\n"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "", "transformedQueryIndex", "Lkotlin/Function3;", "Landroidx/compose/foundation/text/input/internal/IndexTransformationType;", "Landroidx/compose/ui/text/TextRange;", "Lkotlin/ParameterName;", "onResult", "getIndexTransformationType", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;ILkotlin/jvm/functions/Function3;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransformedTextFieldStateKt {
    public static final <R> R getIndexTransformationType(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, int i, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.text.input.internal.IndexTransformationType, ? super androidx.compose.ui.text.TextRange, ? super androidx.compose.ui.text.TextRange, ? extends R> function3) {
        androidx.compose.foundation.text.input.internal.IndexTransformationType indexTransformationType;
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
        return function3.invoke(indexTransformationType, androidx.compose.ui.text.TextRange.m8027boximpl(m2270mapFromTransformedjx7JFs), androidx.compose.ui.text.TextRange.m8027boximpl(m2273mapToTransformedGEjPoXI));
    }
}
