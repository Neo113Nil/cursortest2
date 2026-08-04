package io.sentry.android.replay.util;

import C6.o;
import android.graphics.Rect;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntSize;
import java.lang.reflect.Field;
import java.util.List;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class NodesKt {
    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        h.e(layoutCoordinates, "<this>");
        if (layoutCoordinates2 == null) {
            layoutCoordinates2 = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        }
        float f7 = IntSize.getWidth-impl(layoutCoordinates2.getSize-YbymL2g());
        float f8 = IntSize.getHeight-impl(layoutCoordinates2.getSize-YbymL2g());
        androidx.compose.ui.geometry.Rect rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates2, layoutCoordinates, false, 2, (Object) null);
        float left = rectLocalBoundingBoxOf$default.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > f7) {
            left = f7;
        }
        float top = rectLocalBoundingBoxOf$default.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > f8) {
            top = f8;
        }
        float right = rectLocalBoundingBoxOf$default.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= f7) {
            f7 = right;
        }
        float bottom = rectLocalBoundingBoxOf$default.getBottom();
        float f9 = bottom >= 0.0f ? bottom : 0.0f;
        if (f9 <= f8) {
            f8 = f9;
        }
        if (left == f7 || top == f8) {
            return new Rect();
        }
        long j = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(left, top));
        long j3 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(f7, top));
        long j7 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(f7, f8));
        long j8 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(left, f8));
        float f10 = Offset.getX-impl(j);
        float f11 = Offset.getX-impl(j3);
        float f12 = Offset.getX-impl(j8);
        float f13 = Offset.getX-impl(j7);
        float fMin = Math.min(f10, Math.min(f11, Math.min(f12, f13)));
        float fMax = Math.max(f10, Math.max(f11, Math.max(f12, f13)));
        float f14 = Offset.getY-impl(j);
        float f15 = Offset.getY-impl(j3);
        float f16 = Offset.getY-impl(j8);
        float f17 = Offset.getY-impl(j7);
        return new Rect((int) fMin, (int) Math.min(f14, Math.min(f15, Math.min(f16, f17))), (int) fMax, (int) Math.max(f14, Math.max(f15, Math.max(f16, f17))));
    }

    private static final float fastCoerceAtLeast(float f7, float f8) {
        return f7 < f8 ? f8 : f7;
    }

    private static final float fastCoerceAtMost(float f7, float f8) {
        return f7 > f8 ? f8 : f7;
    }

    private static final float fastCoerceIn(float f7, float f8, float f9) {
        if (f7 < f8) {
            f7 = f8;
        }
        return f7 > f9 ? f9 : f7;
    }

    private static final float fastMaxOf(float f7, float f8, float f9, float f10) {
        return Math.max(f7, Math.max(f8, Math.max(f9, f10)));
    }

    private static final float fastMinOf(float f7, float f8, float f9, float f10) {
        return Math.min(f7, Math.min(f8, Math.min(f9, f10)));
    }

    public static final Painter findPainter(LayoutNode layoutNode) {
        h.e(layoutNode, "<this>");
        List modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        for (int i7 = 0; i7 < size; i7++) {
            Modifier modifier = ((ModifierInfo) modifierInfo.get(i7)).getModifier();
            if (o.p0(modifier.getClass().getName(), "Painter", false)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    if (obj instanceof Painter) {
                        return (Painter) obj;
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static final TextAttributes findTextAttributes(LayoutNode layoutNode) {
        h.e(layoutNode, "<this>");
        List modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        Color color = null;
        boolean z4 = false;
        for (int i7 = 0; i7 < size; i7++) {
            Modifier modifier = ((ModifierInfo) modifierInfo.get(i7)).getModifier();
            String name = modifier.getClass().getName();
            if (o.p0(name, "Text", false)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("color");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    ColorProducer colorProducer = obj instanceof ColorProducer ? (ColorProducer) obj : null;
                    color = colorProducer != null ? Color.box-impl(colorProducer.invoke-0d7_KjU()) : null;
                } catch (Throwable unused) {
                }
            } else if (o.p0(name, "Fill", false)) {
                z4 = true;
            }
        }
        return new TextAttributes(color, z4, null);
    }

    public static final boolean isMaskable(Painter painter) {
        h.e(painter, "<this>");
        String name = painter.getClass().getName();
        return (o.p0(name, "Vector", false) || o.p0(name, "Color", false) || o.p0(name, "Brush", false)) ? false : true;
    }
}
