package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/material3/DefaultTooltipCaretShape;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/unit/DpSize;", "caretSize", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "J", "getCaretSize-MYxV2XQ", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultTooltipCaretShape implements androidx.compose.ui.graphics.Shape {
    public static final int $stable = 0;
    private final long caretSize;

    private DefaultTooltipCaretShape(long j) {
        this.caretSize = j;
    }

    public /* synthetic */ DefaultTooltipCaretShape(long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.material3.TooltipDefaults.INSTANCE.m4162getCaretSizeMYxV2XQ() : j, null);
    }

    /* renamed from: getCaretSize-MYxV2XQ, reason: not valid java name and from getter */
    public final long getCaretSize() {
        return this.caretSize;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final androidx.compose.ui.graphics.Outline mo1334createOutlinePq9zytI(long size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        float mo1418toPx0680j_4 = density.mo1418toPx0680j_4(androidx.compose.ui.unit.DpSize.m8699getWidthD9Ej5fM(this.caretSize));
        float mo1418toPx0680j_42 = density.mo1418toPx0680j_4(androidx.compose.ui.unit.DpSize.m8697getHeightD9Ej5fM(this.caretSize));
        Path.moveTo(0.0f, 0.0f);
        Path.lineTo(mo1418toPx0680j_4 / 2.0f, 0.0f);
        Path.lineTo(0.0f, mo1418toPx0680j_42);
        Path.lineTo((-mo1418toPx0680j_4) / 2.0f, 0.0f);
        Path.close();
        return new androidx.compose.ui.graphics.Outline.Generic(Path);
    }

    public /* synthetic */ DefaultTooltipCaretShape(long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }
}
