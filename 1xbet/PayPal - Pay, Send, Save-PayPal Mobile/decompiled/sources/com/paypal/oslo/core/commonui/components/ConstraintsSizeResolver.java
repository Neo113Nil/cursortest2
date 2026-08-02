package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ>\u0010\u0013\u001a\u00028\u0000\"\n\b\u0000\u0010\u000f*\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00028\u00002\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00028\u0000\"\n\b\u0000\u0010\u000f*\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00028\u00002\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0005¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/ConstraintsSizeResolver;", "Lcom/paypal/oslo/core/commonui/components/SizeResolver;", "Landroidx/compose/ui/Modifier;", "Lcoil3/compose/ConstraintsSizeResolver;", "coilDelegate", "<init>", "(Lcoil3/compose/ConstraintsSizeResolver;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", "", "predicate", "all", "(Lkotlin/jvm/functions/Function1;)Z", "any", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "other", "then", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "getHighSpeedVideoSizes", "Lcoil3/compose/ConstraintsSizeResolver;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ConstraintsSizeResolver extends com.paypal.oslo.core.commonui.components.SizeResolver implements androidx.compose.ui.Modifier {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final coil3.compose.ConstraintsSizeResolver getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintsSizeResolver(coil3.compose.ConstraintsSizeResolver constraintsSizeResolver) {
        super(constraintsSizeResolver);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraintsSizeResolver, "");
        this.getHighSpeedVideoFpsRangesFor = constraintsSizeResolver;
    }

    @Override // androidx.compose.ui.Modifier
    public final androidx.compose.ui.Modifier then(androidx.compose.ui.Modifier other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return this.getHighSpeedVideoFpsRangesFor.then(other);
    }

    @Override // androidx.compose.ui.Modifier
    public final <R> R foldOut(R initial, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        return (R) this.getHighSpeedVideoFpsRangesFor.foldOut(initial, operation);
    }

    @Override // androidx.compose.ui.Modifier
    public final <R> R foldIn(R initial, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        return (R) this.getHighSpeedVideoFpsRangesFor.foldIn(initial, operation);
    }

    @Override // androidx.compose.ui.Modifier
    public final boolean any(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        return this.getHighSpeedVideoFpsRangesFor.any(predicate);
    }

    @Override // androidx.compose.ui.Modifier
    public final boolean all(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        return this.getHighSpeedVideoFpsRangesFor.all(predicate);
    }
}
