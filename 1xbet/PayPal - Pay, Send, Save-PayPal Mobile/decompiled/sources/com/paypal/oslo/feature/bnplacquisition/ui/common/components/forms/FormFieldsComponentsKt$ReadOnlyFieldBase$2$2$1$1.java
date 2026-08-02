package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FormFieldsComponentsKt$ReadOnlyFieldBase$2$2$1$1 implements kotlin.jvm.functions.Function1<androidx.constraintlayout.compose.ConstrainScope, kotlin.Unit> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.constraintlayout.compose.ConstrainedLayoutReference getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(androidx.constraintlayout.compose.ConstrainScope constrainScope) {
        androidx.constraintlayout.compose.ConstrainScope constrainScope2 = constrainScope;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constrainScope2, "");
        androidx.constraintlayout.compose.VerticalAnchorable.m9045linkToVpY3zN4$default(constrainScope2.getStart(), constrainScope2.getParent().getStart(), 0.0f, 0.0f, 6, null);
        androidx.constraintlayout.compose.VerticalAnchorable.m9045linkToVpY3zN4$default(constrainScope2.getEnd(), this.getHighResolutionOutputSizeshNQ4ISI.getStart(), this.getHighSpeedVideoFpsRanges == null ? com.paypal.pds.core.ConstantsKt.getSpacing0() : com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 4, null);
        if (this.Camera2StreamConfigurationMap) {
            androidx.constraintlayout.compose.HorizontalAnchorable.m8964linkToVpY3zN4$default(constrainScope2.getTop(), constrainScope2.getParent().getTop(), 0.0f, 0.0f, 6, (java.lang.Object) null);
        } else {
            androidx.constraintlayout.compose.HorizontalAnchorable.m8964linkToVpY3zN4$default(constrainScope2.getTop(), constrainScope2.getParent().getTop(), 0.0f, 0.0f, 6, (java.lang.Object) null);
            androidx.constraintlayout.compose.HorizontalAnchorable.m8964linkToVpY3zN4$default(constrainScope2.getBottom(), constrainScope2.getParent().getBottom(), 0.0f, 0.0f, 6, (java.lang.Object) null);
        }
        constrainScope2.setWidth(androidx.constraintlayout.compose.Dimension.INSTANCE.getMatchParent());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    FormFieldsComponentsKt$ReadOnlyFieldBase$2$2$1$1(androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = constrainedLayoutReference;
        this.getHighSpeedVideoFpsRanges = function2;
        this.Camera2StreamConfigurationMap = z;
    }
}
