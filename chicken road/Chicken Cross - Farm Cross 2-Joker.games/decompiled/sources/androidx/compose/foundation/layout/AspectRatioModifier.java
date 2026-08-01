package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: AspectRatio.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B.\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0019\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0016J\u001c\u0010\"\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0015H\u0016J)\u0010$\u001a\u00020%*\u00020&2\u0006\u0010\u001f\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001aH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u001c\u0010+\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0016J\u001c\u0010,\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0015H\u0016J#\u0010-\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100J#\u00101\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00100J#\u00103\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00100J#\u00105\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00100R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FZLkotlin/jvm/functions/Function1;)V", "getAspectRatio", "()F", "getMatchHeightConstraintsFirst", "()Z", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class AspectRatioModifier extends InspectorValueInfo implements LayoutModifier {
    private final float aspectRatio;
    private final boolean matchHeightConstraintsFirst;

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioModifier(float f, boolean z, Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
        if (f <= 0.0f) {
            throw new IllegalArgumentException(("aspectRatio " + f + " must be > 0").toString());
        }
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo30measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m382findSizeToXhtMw = m382findSizeToXhtMw(j);
        if (!IntSize.m3998equalsimpl0(m382findSizeToXhtMw, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
            j = Constraints.INSTANCE.m3804fixedJhjzzOo(IntSize.m4000getWidthimpl(m382findSizeToXhtMw), IntSize.m3999getHeightimpl(m382findSizeToXhtMw));
        }
        final Placeable mo3121measureBRTryo0 = measurable.mo3121measureBRTryo0(j);
        return MeasureScope.layout$default(measure, mo3121measureBRTryo0.getWidth(), mo3121measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioModifier$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return MathKt.roundToInt(i * this.aspectRatio);
        }
        return measurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return MathKt.roundToInt(i * this.aspectRatio);
        }
        return measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return MathKt.roundToInt(i / this.aspectRatio);
        }
        return measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return MathKt.roundToInt(i / this.aspectRatio);
        }
        return measurable.maxIntrinsicHeight(i);
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m382findSizeToXhtMw(long j) {
        if (!this.matchHeightConstraintsFirst) {
            long m386tryMaxWidthJN0ABg$default = m386tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3998equalsimpl0(m386tryMaxWidthJN0ABg$default, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m386tryMaxWidthJN0ABg$default;
            }
            long m384tryMaxHeightJN0ABg$default = m384tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3998equalsimpl0(m384tryMaxHeightJN0ABg$default, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m384tryMaxHeightJN0ABg$default;
            }
            long m390tryMinWidthJN0ABg$default = m390tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3998equalsimpl0(m390tryMinWidthJN0ABg$default, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m390tryMinWidthJN0ABg$default;
            }
            long m388tryMinHeightJN0ABg$default = m388tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3998equalsimpl0(m388tryMinHeightJN0ABg$default, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m388tryMinHeightJN0ABg$default;
            }
            long m385tryMaxWidthJN0ABg = m385tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m3998equalsimpl0(m385tryMaxWidthJN0ABg, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m385tryMaxWidthJN0ABg;
            }
            long m383tryMaxHeightJN0ABg = m383tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m3998equalsimpl0(m383tryMaxHeightJN0ABg, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m383tryMaxHeightJN0ABg;
            }
            long m389tryMinWidthJN0ABg = m389tryMinWidthJN0ABg(j, false);
            if (!IntSize.m3998equalsimpl0(m389tryMinWidthJN0ABg, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m389tryMinWidthJN0ABg;
            }
            long m387tryMinHeightJN0ABg = m387tryMinHeightJN0ABg(j, false);
            if (!IntSize.m3998equalsimpl0(m387tryMinHeightJN0ABg, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m387tryMinHeightJN0ABg;
            }
        } else {
            long m384tryMaxHeightJN0ABg$default2 = m384tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3998equalsimpl0(m384tryMaxHeightJN0ABg$default2, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m384tryMaxHeightJN0ABg$default2;
            }
            long m386tryMaxWidthJN0ABg$default2 = m386tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3998equalsimpl0(m386tryMaxWidthJN0ABg$default2, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m386tryMaxWidthJN0ABg$default2;
            }
            long m388tryMinHeightJN0ABg$default2 = m388tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3998equalsimpl0(m388tryMinHeightJN0ABg$default2, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m388tryMinHeightJN0ABg$default2;
            }
            long m390tryMinWidthJN0ABg$default2 = m390tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m3998equalsimpl0(m390tryMinWidthJN0ABg$default2, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m390tryMinWidthJN0ABg$default2;
            }
            long m383tryMaxHeightJN0ABg2 = m383tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m3998equalsimpl0(m383tryMaxHeightJN0ABg2, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m383tryMaxHeightJN0ABg2;
            }
            long m385tryMaxWidthJN0ABg2 = m385tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m3998equalsimpl0(m385tryMaxWidthJN0ABg2, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m385tryMaxWidthJN0ABg2;
            }
            long m387tryMinHeightJN0ABg2 = m387tryMinHeightJN0ABg(j, false);
            if (!IntSize.m3998equalsimpl0(m387tryMinHeightJN0ABg2, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m387tryMinHeightJN0ABg2;
            }
            long m389tryMinWidthJN0ABg2 = m389tryMinWidthJN0ABg(j, false);
            if (!IntSize.m3998equalsimpl0(m389tryMinWidthJN0ABg2, IntSize.INSTANCE.m4005getZeroYbymL2g())) {
                return m389tryMinWidthJN0ABg2;
            }
        }
        return IntSize.INSTANCE.m4005getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m386tryMaxWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m385tryMaxWidthJN0ABg(j, z);
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m385tryMaxWidthJN0ABg(long j, boolean z) {
        int roundToInt;
        int m3796getMaxWidthimpl = Constraints.m3796getMaxWidthimpl(j);
        if (m3796getMaxWidthimpl != Integer.MAX_VALUE && (roundToInt = MathKt.roundToInt(m3796getMaxWidthimpl / this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(m3796getMaxWidthimpl, roundToInt);
            if (!z || ConstraintsKt.m3811isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m4005getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m384tryMaxHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m383tryMaxHeightJN0ABg(j, z);
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m383tryMaxHeightJN0ABg(long j, boolean z) {
        int roundToInt;
        int m3795getMaxHeightimpl = Constraints.m3795getMaxHeightimpl(j);
        if (m3795getMaxHeightimpl != Integer.MAX_VALUE && (roundToInt = MathKt.roundToInt(m3795getMaxHeightimpl * this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(roundToInt, m3795getMaxHeightimpl);
            if (!z || ConstraintsKt.m3811isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m4005getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m390tryMinWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m389tryMinWidthJN0ABg(j, z);
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m389tryMinWidthJN0ABg(long j, boolean z) {
        int m3798getMinWidthimpl = Constraints.m3798getMinWidthimpl(j);
        int roundToInt = MathKt.roundToInt(m3798getMinWidthimpl / this.aspectRatio);
        if (roundToInt > 0) {
            long IntSize = IntSizeKt.IntSize(m3798getMinWidthimpl, roundToInt);
            if (!z || ConstraintsKt.m3811isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m4005getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m388tryMinHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m387tryMinHeightJN0ABg(j, z);
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m387tryMinHeightJN0ABg(long j, boolean z) {
        int m3797getMinHeightimpl = Constraints.m3797getMinHeightimpl(j);
        int roundToInt = MathKt.roundToInt(m3797getMinHeightimpl * this.aspectRatio);
        if (roundToInt > 0) {
            long IntSize = IntSizeKt.IntSize(roundToInt, m3797getMinHeightimpl);
            if (!z || ConstraintsKt.m3811isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m4005getZeroYbymL2g();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        AspectRatioModifier aspectRatioModifier = other instanceof AspectRatioModifier ? (AspectRatioModifier) other : null;
        if (aspectRatioModifier == null) {
            return false;
        }
        return this.aspectRatio == aspectRatioModifier.aspectRatio && this.matchHeightConstraintsFirst == ((AspectRatioModifier) other).matchHeightConstraintsFirst;
    }

    public int hashCode() {
        return (Float.hashCode(this.aspectRatio) * 31) + Boolean.hashCode(this.matchHeightConstraintsFirst);
    }

    public String toString() {
        return "AspectRatioModifier(aspectRatio=" + this.aspectRatio + ')';
    }
}
