package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BX\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\u0010\u0015J\u001d\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\u001d\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010(J\b\u00102\u001a\u000203H\u0016J\f\u00104\u001a\u00020\u0013*\u000205H\u0016J\u0019\u00106\u001a\u00020\u0007*\u00020%H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\u0007*\u00020%H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u00108J\u001c\u0010;\u001a\u00020-*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020-H\u0016J\u001c\u0010@\u001a\u00020-*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010A\u001a\u00020-H\u0016J)\u0010B\u001a\u00020C*\u00020D2\u0006\u0010=\u001a\u00020E2\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010GJ\u001c\u0010H\u001a\u00020-*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020-H\u0016J\u001c\u0010I\u001a\u00020-*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010A\u001a\u00020-H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Landroidx/compose/ui/draw/PainterModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Lkotlin/jvm/functions/Function1;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getAlpha", "()F", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "getSizeToIntrinsics", "()Z", "useIntrinsicSize", "getUseIntrinsicSize", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "equals", "other", "", "hashCode", "", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", InAppPurchaseConstants.METHOD_TO_STRING, "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "hasSpecifiedAndFiniteHeight", "hasSpecifiedAndFiniteHeight-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteWidth-uvyYCjk", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class PainterModifier extends InspectorValueInfo implements LayoutModifier, DrawModifier {
    private final Alignment alignment;
    private final float alpha;
    private final ColorFilter colorFilter;
    private final ContentScale contentScale;
    private final Painter painter;
    private final boolean sizeToIntrinsics;

    public final Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public /* synthetic */ PainterModifier(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z, (i & 4) != 0 ? Alignment.INSTANCE.getCenter() : alignment, (i & 8) != 0 ? ContentScale.INSTANCE.getInside() : contentScale, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? null : colorFilter, function1);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PainterModifier(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.getIntrinsicSize() != Size.INSTANCE.m1469getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo30measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable mo3121measureBRTryo0 = measurable.mo3121measureBRTryo0(m1319modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measure, mo3121measureBRTryo0.getWidth(), mo3121measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.draw.PainterModifier$measure$1
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
        if (getUseIntrinsicSize()) {
            long m1319modifyConstraintsZezNO4M = m1319modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m3798getMinWidthimpl(m1319modifyConstraintsZezNO4M), measurable.minIntrinsicWidth(i));
        }
        return measurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            long m1319modifyConstraintsZezNO4M = m1319modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m3798getMinWidthimpl(m1319modifyConstraintsZezNO4M), measurable.maxIntrinsicWidth(i));
        }
        return measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            long m1319modifyConstraintsZezNO4M = m1319modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m3797getMinHeightimpl(m1319modifyConstraintsZezNO4M), measurable.minIntrinsicHeight(i));
        }
        return measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            long m1319modifyConstraintsZezNO4M = m1319modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m3797getMinHeightimpl(m1319modifyConstraintsZezNO4M), measurable.maxIntrinsicHeight(i));
        }
        return measurable.maxIntrinsicHeight(i);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m1316calculateScaledSizeE7KxVPU(long dstSize) {
        float m1461getWidthimpl;
        float m1458getHeightimpl;
        if (!getUseIntrinsicSize()) {
            return dstSize;
        }
        if (!m1318hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.getIntrinsicSize())) {
            m1461getWidthimpl = Size.m1461getWidthimpl(dstSize);
        } else {
            m1461getWidthimpl = Size.m1461getWidthimpl(this.painter.getIntrinsicSize());
        }
        if (!m1317hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.getIntrinsicSize())) {
            m1458getHeightimpl = Size.m1458getHeightimpl(dstSize);
        } else {
            m1458getHeightimpl = Size.m1458getHeightimpl(this.painter.getIntrinsicSize());
        }
        long Size = SizeKt.Size(m1461getWidthimpl, m1458getHeightimpl);
        if (Size.m1461getWidthimpl(dstSize) != 0.0f && Size.m1458getHeightimpl(dstSize) != 0.0f) {
            return ScaleFactorKt.m3197timesUQTWf7w(Size, this.contentScale.mo3112computeScaleFactorH7hwNQA(Size, dstSize));
        }
        return Size.INSTANCE.m1470getZeroNHjbRc();
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m1319modifyConstraintsZezNO4M(long constraints) {
        int m3798getMinWidthimpl;
        int m3797getMinHeightimpl;
        boolean z = Constraints.m3792getHasBoundedWidthimpl(constraints) && Constraints.m3791getHasBoundedHeightimpl(constraints);
        boolean z2 = Constraints.m3794getHasFixedWidthimpl(constraints) && Constraints.m3793getHasFixedHeightimpl(constraints);
        if ((!getUseIntrinsicSize() && z) || z2) {
            return Constraints.m3787copyZbe2FdA$default(constraints, Constraints.m3796getMaxWidthimpl(constraints), 0, Constraints.m3795getMaxHeightimpl(constraints), 0, 10, null);
        }
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (m1318hasSpecifiedAndFiniteWidthuvyYCjk(intrinsicSize)) {
            m3798getMinWidthimpl = MathKt.roundToInt(Size.m1461getWidthimpl(intrinsicSize));
        } else {
            m3798getMinWidthimpl = Constraints.m3798getMinWidthimpl(constraints);
        }
        if (m1317hasSpecifiedAndFiniteHeightuvyYCjk(intrinsicSize)) {
            m3797getMinHeightimpl = MathKt.roundToInt(Size.m1458getHeightimpl(intrinsicSize));
        } else {
            m3797getMinHeightimpl = Constraints.m3797getMinHeightimpl(constraints);
        }
        long m1316calculateScaledSizeE7KxVPU = m1316calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m3810constrainWidthK40F9xA(constraints, m3798getMinWidthimpl), ConstraintsKt.m3809constrainHeightK40F9xA(constraints, m3797getMinHeightimpl)));
        return Constraints.m3787copyZbe2FdA$default(constraints, ConstraintsKt.m3810constrainWidthK40F9xA(constraints, MathKt.roundToInt(Size.m1461getWidthimpl(m1316calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m3809constrainHeightK40F9xA(constraints, MathKt.roundToInt(Size.m1458getHeightimpl(m1316calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        float m1461getWidthimpl;
        float m1458getHeightimpl;
        long m1470getZeroNHjbRc;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (m1318hasSpecifiedAndFiniteWidthuvyYCjk(intrinsicSize)) {
            m1461getWidthimpl = Size.m1461getWidthimpl(intrinsicSize);
        } else {
            m1461getWidthimpl = Size.m1461getWidthimpl(contentDrawScope.mo2122getSizeNHjbRc());
        }
        if (m1317hasSpecifiedAndFiniteHeightuvyYCjk(intrinsicSize)) {
            m1458getHeightimpl = Size.m1458getHeightimpl(intrinsicSize);
        } else {
            m1458getHeightimpl = Size.m1458getHeightimpl(contentDrawScope.mo2122getSizeNHjbRc());
        }
        long Size = SizeKt.Size(m1461getWidthimpl, m1458getHeightimpl);
        if (Size.m1461getWidthimpl(contentDrawScope.mo2122getSizeNHjbRc()) != 0.0f && Size.m1458getHeightimpl(contentDrawScope.mo2122getSizeNHjbRc()) != 0.0f) {
            m1470getZeroNHjbRc = ScaleFactorKt.m3197timesUQTWf7w(Size, this.contentScale.mo3112computeScaleFactorH7hwNQA(Size, contentDrawScope.mo2122getSizeNHjbRc()));
        } else {
            m1470getZeroNHjbRc = Size.INSTANCE.m1470getZeroNHjbRc();
        }
        long j = m1470getZeroNHjbRc;
        long mo1300alignKFBX0sM = this.alignment.mo1300alignKFBX0sM(IntSizeKt.IntSize(MathKt.roundToInt(Size.m1461getWidthimpl(j)), MathKt.roundToInt(Size.m1458getHeightimpl(j))), IntSizeKt.IntSize(MathKt.roundToInt(Size.m1461getWidthimpl(contentDrawScope.mo2122getSizeNHjbRc())), MathKt.roundToInt(Size.m1458getHeightimpl(contentDrawScope.mo2122getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float m3958getXimpl = IntOffset.m3958getXimpl(mo1300alignKFBX0sM);
        float m3959getYimpl = IntOffset.m3959getYimpl(mo1300alignKFBX0sM);
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        contentDrawScope2.getDrawContext().getTransform().translate(m3958getXimpl, m3959getYimpl);
        this.painter.m2197drawx_KDEd0(contentDrawScope2, j, this.alpha, this.colorFilter);
        contentDrawScope2.getDrawContext().getTransform().translate(-m3958getXimpl, -m3959getYimpl);
        contentDrawScope.drawContent();
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m1318hasSpecifiedAndFiniteWidthuvyYCjk(long j) {
        if (!Size.m1457equalsimpl0(j, Size.INSTANCE.m1469getUnspecifiedNHjbRc())) {
            float m1461getWidthimpl = Size.m1461getWidthimpl(j);
            if (!Float.isInfinite(m1461getWidthimpl) && !Float.isNaN(m1461getWidthimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m1317hasSpecifiedAndFiniteHeightuvyYCjk(long j) {
        if (!Size.m1457equalsimpl0(j, Size.INSTANCE.m1469getUnspecifiedNHjbRc())) {
            float m1458getHeightimpl = Size.m1458getHeightimpl(j);
            if (!Float.isInfinite(m1458getHeightimpl) && !Float.isNaN(m1458getHeightimpl)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return hashCode + (colorFilter != null ? colorFilter.hashCode() : 0);
    }

    public boolean equals(Object other) {
        PainterModifier painterModifier = other instanceof PainterModifier ? (PainterModifier) other : null;
        return painterModifier != null && Intrinsics.areEqual(this.painter, painterModifier.painter) && this.sizeToIntrinsics == painterModifier.sizeToIntrinsics && Intrinsics.areEqual(this.alignment, painterModifier.alignment) && Intrinsics.areEqual(this.contentScale, painterModifier.contentScale) && this.alpha == painterModifier.alpha && Intrinsics.areEqual(this.colorFilter, painterModifier.colorFilter);
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
