package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AddressOverviewScreenKt$AddressOverviewSuccessContent$1$4$1 implements kotlin.jvm.functions.Function1<androidx.constraintlayout.compose.ConstrainScope, kotlin.Unit> {
    final /* synthetic */ androidx.constraintlayout.compose.ConstrainedLayoutReference getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.constraintlayout.compose.ConstrainedLayoutReference getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(androidx.constraintlayout.compose.ConstrainScope constrainScope) {
        androidx.constraintlayout.compose.ConstrainScope constrainScope2 = constrainScope;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constrainScope2, "");
        androidx.constraintlayout.compose.HorizontalAnchorable.m8964linkToVpY3zN4$default(constrainScope2.getTop(), this.getHighSpeedVideoFpsRangesFor.getBottom(), 0.0f, 0.0f, 6, (java.lang.Object) null);
        androidx.constraintlayout.compose.VerticalAnchorable.m9045linkToVpY3zN4$default(constrainScope2.getStart(), constrainScope2.getParent().getStart(), 0.0f, 0.0f, 6, null);
        androidx.constraintlayout.compose.VerticalAnchorable.m9045linkToVpY3zN4$default(constrainScope2.getEnd(), constrainScope2.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        androidx.constraintlayout.compose.HorizontalAnchorable.m8964linkToVpY3zN4$default(constrainScope2.getBottom(), this.getHighSpeedVideoFpsRanges.getTop(), 0.0f, 0.0f, 6, (java.lang.Object) null);
        constrainScope2.setHeight(androidx.constraintlayout.compose.Dimension.INSTANCE.getPreferredWrapContent());
        return kotlin.Unit.INSTANCE;
    }

    AddressOverviewScreenKt$AddressOverviewSuccessContent$1$4$1(androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference, androidx.constraintlayout.compose.ConstrainedLayoutReference constrainedLayoutReference2) {
        this.getHighSpeedVideoFpsRangesFor = constrainedLayoutReference;
        this.getHighSpeedVideoFpsRanges = constrainedLayoutReference2;
    }
}
