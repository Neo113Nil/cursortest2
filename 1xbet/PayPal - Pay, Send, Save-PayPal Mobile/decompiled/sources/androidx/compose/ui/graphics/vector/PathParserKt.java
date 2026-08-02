package androidx.compose.ui.graphics.vector;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a_\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0015\"\u001a\u0010\u0017\u001a\u00020\u00168\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"", "Landroidx/compose/ui/graphics/vector/PathNode;", "Landroidx/compose/ui/graphics/Path;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "toPath", "(Ljava/util/List;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "", "p8", "p9", "", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/graphics/Path;DDDDDDDZZ)V", "(Landroidx/compose/ui/graphics/Path;DDDDDDDDD)V", "", "EmptyArray", "[F", "getEmptyArray", "()[F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PathParserKt {
    private static final float[] EmptyArray = new float[0];

    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    public static /* synthetic */ androidx.compose.ui.graphics.Path toPath$default(java.util.List list, androidx.compose.ui.graphics.Path path, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }

    public static final androidx.compose.ui.graphics.Path toPath(java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list, androidx.compose.ui.graphics.Path path) {
        androidx.compose.ui.graphics.vector.PathNode pathNode;
        float f;
        int i;
        int i2;
        float arcStartX;
        float arcStartY;
        float f2;
        float f3;
        float f4;
        float dy2;
        float x2;
        float y2;
        float f5;
        float f6;
        float dx1;
        float dy22;
        java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list2 = list;
        androidx.compose.ui.graphics.Path path2 = path;
        int mo5885getFillTypeRgk1Os = path.mo5885getFillTypeRgk1Os();
        path.rewind();
        path2.mo5887setFillTypeoQ8Xj4U(mo5885getFillTypeRgk1Os);
        androidx.compose.ui.graphics.vector.PathNode pathNode2 = list.isEmpty() ? androidx.compose.ui.graphics.vector.PathNode.Close.INSTANCE : list2.get(0);
        int size = list2.size();
        float f7 = 0.0f;
        int i3 = 0;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (i3 < size) {
            androidx.compose.ui.graphics.vector.PathNode pathNode3 = list2.get(i3);
            if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.Close) {
                path.close();
                pathNode = pathNode3;
                f = f7;
                i = i3;
                i2 = size;
                arcStartX = f12;
                arcStartY = f13;
            } else {
                if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo) {
                    androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo relativeMoveTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo) pathNode3;
                    f10 += relativeMoveTo.getDx();
                    f11 += relativeMoveTo.getDy();
                    path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                    f12 = f10;
                } else if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.MoveTo) {
                    androidx.compose.ui.graphics.vector.PathNode.MoveTo moveTo = (androidx.compose.ui.graphics.vector.PathNode.MoveTo) pathNode3;
                    float x = moveTo.getX();
                    float y = moveTo.getY();
                    path2.moveTo(moveTo.getX(), moveTo.getY());
                    f10 = x;
                    f12 = f10;
                    f11 = y;
                } else {
                    if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo) {
                        androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo relativeLineTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo) pathNode3;
                        path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                        f10 += relativeLineTo.getDx();
                        dy2 = relativeLineTo.getDy();
                    } else {
                        if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.LineTo) {
                            androidx.compose.ui.graphics.vector.PathNode.LineTo lineTo = (androidx.compose.ui.graphics.vector.PathNode.LineTo) pathNode3;
                            path2.lineTo(lineTo.getX(), lineTo.getY());
                            float x3 = lineTo.getX();
                            f11 = lineTo.getY();
                            f10 = x3;
                        } else if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo) {
                            androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo relativeHorizontalTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo) pathNode3;
                            path2.relativeLineTo(relativeHorizontalTo.getDx(), f7);
                            f10 += relativeHorizontalTo.getDx();
                        } else if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.HorizontalTo) {
                            androidx.compose.ui.graphics.vector.PathNode.HorizontalTo horizontalTo = (androidx.compose.ui.graphics.vector.PathNode.HorizontalTo) pathNode3;
                            path2.lineTo(horizontalTo.getX(), f11);
                            f10 = horizontalTo.getX();
                        } else if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo) {
                            androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo relativeVerticalTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo) pathNode3;
                            path2.relativeLineTo(f7, relativeVerticalTo.getDy());
                            dy2 = relativeVerticalTo.getDy();
                        } else if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.VerticalTo) {
                            androidx.compose.ui.graphics.vector.PathNode.VerticalTo verticalTo = (androidx.compose.ui.graphics.vector.PathNode.VerticalTo) pathNode3;
                            path2.lineTo(f10, verticalTo.getY());
                            f11 = verticalTo.getY();
                        } else {
                            if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo) {
                                androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo relativeCurveTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo) pathNode3;
                                path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                dx1 = relativeCurveTo.getDx2() + f10;
                                f8 = relativeCurveTo.getDy2() + f11;
                                f10 += relativeCurveTo.getDx3();
                                dy22 = relativeCurveTo.getDy3();
                            } else {
                                if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.CurveTo) {
                                    androidx.compose.ui.graphics.vector.PathNode.CurveTo curveTo = (androidx.compose.ui.graphics.vector.PathNode.CurveTo) pathNode3;
                                    path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                    f4 = curveTo.getX2();
                                    f8 = curveTo.getY2();
                                    x2 = curveTo.getX3();
                                    y2 = curveTo.getY3();
                                } else if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo) {
                                    if (pathNode2.getIsCurve()) {
                                        float f14 = f11 - f8;
                                        f5 = f10 - f9;
                                        f6 = f14;
                                    } else {
                                        f5 = f7;
                                        f6 = f5;
                                    }
                                    androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo) pathNode3;
                                    path.relativeCubicTo(f5, f6, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                    dx1 = relativeReflectiveCurveTo.getDx1() + f10;
                                    f8 = relativeReflectiveCurveTo.getDy1() + f11;
                                    f10 += relativeReflectiveCurveTo.getDx2();
                                    dy22 = relativeReflectiveCurveTo.getDy2();
                                } else if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo) {
                                    if (pathNode2.getIsCurve()) {
                                        f10 = (f10 * 2.0f) - f9;
                                        f11 = (f11 * 2.0f) - f8;
                                    }
                                    androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo reflectiveCurveTo = (androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo) pathNode3;
                                    path.cubicTo(f10, f11, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                    f4 = reflectiveCurveTo.getX1();
                                    f8 = reflectiveCurveTo.getY1();
                                    x2 = reflectiveCurveTo.getX2();
                                    y2 = reflectiveCurveTo.getY2();
                                } else if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo) {
                                    androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo relativeQuadTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo) pathNode3;
                                    path2.relativeQuadraticTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                    f9 = relativeQuadTo.getDx1() + f10;
                                    f8 = relativeQuadTo.getDy1() + f11;
                                    f10 += relativeQuadTo.getDx2();
                                    dy2 = relativeQuadTo.getDy2();
                                } else {
                                    if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.QuadTo) {
                                        androidx.compose.ui.graphics.vector.PathNode.QuadTo quadTo = (androidx.compose.ui.graphics.vector.PathNode.QuadTo) pathNode3;
                                        path2.quadraticTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                        float x1 = quadTo.getX1();
                                        float y1 = quadTo.getY1();
                                        float x22 = quadTo.getX2();
                                        f11 = quadTo.getY2();
                                        f10 = x22;
                                        pathNode = pathNode3;
                                        f = f7;
                                        i = i3;
                                        i2 = size;
                                        f9 = x1;
                                        f8 = y1;
                                    } else if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo) {
                                        if (pathNode2.getIsQuad()) {
                                            f2 = f10 - f9;
                                            f3 = f11 - f8;
                                        } else {
                                            f2 = f7;
                                            f3 = f2;
                                        }
                                        androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo) pathNode3;
                                        path2.relativeQuadraticTo(f2, f3, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                        f4 = f2 + f10;
                                        f10 += relativeReflectiveQuadTo.getDx();
                                        f8 = f3 + f11;
                                        f11 = relativeReflectiveQuadTo.getDy() + f11;
                                        pathNode = pathNode3;
                                        f = f7;
                                        i = i3;
                                        i2 = size;
                                        f9 = f4;
                                    } else if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo) {
                                        if (pathNode2.getIsQuad()) {
                                            f10 = (f10 * 2.0f) - f9;
                                            f11 = (f11 * 2.0f) - f8;
                                        }
                                        androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo reflectiveQuadTo = (androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo) pathNode3;
                                        path2.quadraticTo(f10, f11, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                        f9 = f10;
                                        pathNode = pathNode3;
                                        f = f7;
                                        i = i3;
                                        i2 = size;
                                        f10 = reflectiveQuadTo.getX();
                                        f8 = f11;
                                        f11 = reflectiveQuadTo.getY();
                                    } else if (pathNode3 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo) {
                                        androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo relativeArcTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo) pathNode3;
                                        float arcStartDx = relativeArcTo.getArcStartDx() + f10;
                                        float arcStartDy = relativeArcTo.getArcStartDy() + f11;
                                        pathNode = pathNode3;
                                        i = i3;
                                        f = 0.0f;
                                        i2 = size;
                                        getHighSpeedVideoSizes(path, f10, f11, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                        arcStartY = arcStartDy;
                                        arcStartX = arcStartDx;
                                    } else {
                                        pathNode = pathNode3;
                                        f = f7;
                                        i = i3;
                                        i2 = size;
                                        if (!(pathNode instanceof androidx.compose.ui.graphics.vector.PathNode.ArcTo)) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                        androidx.compose.ui.graphics.vector.PathNode.ArcTo arcTo = (androidx.compose.ui.graphics.vector.PathNode.ArcTo) pathNode;
                                        getHighSpeedVideoSizes(path, f10, f11, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                        arcStartX = arcTo.getArcStartX();
                                        arcStartY = arcTo.getArcStartY();
                                    }
                                    i3 = i + 1;
                                    path2 = path;
                                    pathNode2 = pathNode;
                                    f7 = f;
                                    size = i2;
                                    list2 = list;
                                }
                                f10 = x2;
                                f11 = y2;
                                pathNode = pathNode3;
                                f = f7;
                                i = i3;
                                i2 = size;
                                f9 = f4;
                                i3 = i + 1;
                                path2 = path;
                                pathNode2 = pathNode;
                                f7 = f;
                                size = i2;
                                list2 = list;
                            }
                            f11 += dy22;
                            f9 = dx1;
                        }
                        pathNode = pathNode3;
                        f = f7;
                        i = i3;
                        i2 = size;
                        i3 = i + 1;
                        path2 = path;
                        pathNode2 = pathNode;
                        f7 = f;
                        size = i2;
                        list2 = list;
                    }
                    f11 += dy2;
                    pathNode = pathNode3;
                    f = f7;
                    i = i3;
                    i2 = size;
                    i3 = i + 1;
                    path2 = path;
                    pathNode2 = pathNode;
                    f7 = f;
                    size = i2;
                    list2 = list;
                }
                f13 = f11;
                pathNode = pathNode3;
                f = f7;
                i = i3;
                i2 = size;
                i3 = i + 1;
                path2 = path;
                pathNode2 = pathNode;
                f7 = f;
                size = i2;
                list2 = list;
            }
            f8 = arcStartY;
            f11 = f8;
            f9 = arcStartX;
            f10 = f9;
            i3 = i + 1;
            path2 = path;
            pathNode2 = pathNode;
            f7 = f;
            size = i2;
            list2 = list;
        }
        return path;
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.ui.graphics.Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d;
        double d11 = d5;
        double d12 = d6;
        while (true) {
            double d13 = (d7 / 180.0d) * 3.141592653589793d;
            double cos = java.lang.Math.cos(d13);
            double sin = java.lang.Math.sin(d13);
            double d14 = ((d10 * cos) + (d2 * sin)) / d11;
            double d15 = (((-d10) * sin) + (d2 * cos)) / d12;
            double d16 = ((d3 * cos) + (d4 * sin)) / d11;
            double d17 = (((-d3) * sin) + (d4 * cos)) / d12;
            double d18 = d14 - d16;
            double d19 = d15 - d17;
            double d20 = (d14 + d16) / 2.0d;
            double d21 = (d15 + d17) / 2.0d;
            double d22 = (d18 * d18) + (d19 * d19);
            if (d22 == 0.0d) {
                return;
            }
            double d23 = (1.0d / d22) - 0.25d;
            if (d23 < 0.0d) {
                double sqrt = (float) (java.lang.Math.sqrt(d22) / 1.99999d);
                d11 *= sqrt;
                d12 *= sqrt;
                d10 = d;
            } else {
                double sqrt2 = java.lang.Math.sqrt(d23);
                double d24 = d18 * sqrt2;
                double d25 = sqrt2 * d19;
                if (z == z2) {
                    d8 = d20 - d25;
                    d9 = d21 + d24;
                } else {
                    d8 = d20 + d25;
                    d9 = d21 - d24;
                }
                double atan2 = java.lang.Math.atan2(d15 - d9, d14 - d8);
                double atan22 = java.lang.Math.atan2(d17 - d9, d16 - d8) - atan2;
                if (z2 != (atan22 >= 0.0d)) {
                    atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
                }
                double d26 = d8 * d11;
                double d27 = d9 * d12;
                getHighSpeedVideoSizes(path, (d26 * cos) - (d27 * sin), (d26 * sin) + (d27 * cos), d11, d12, d, d2, d13, atan2, atan22);
                return;
            }
        }
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.ui.graphics.Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        int ceil = (int) java.lang.Math.ceil(java.lang.Math.abs((d9 * 4.0d) / 3.141592653589793d));
        double cos = java.lang.Math.cos(d7);
        double sin = java.lang.Math.sin(d7);
        double cos2 = java.lang.Math.cos(d8);
        double sin2 = java.lang.Math.sin(d8);
        double d11 = -d10;
        double d12 = d11 * cos;
        double d13 = d4 * sin;
        double d14 = d11 * sin;
        double d15 = d4 * cos;
        double d16 = d9 / ceil;
        double d17 = d6;
        double d18 = (sin2 * d12) - (cos2 * d13);
        double d19 = (sin2 * d14) + (cos2 * d15);
        double d20 = d8;
        int i = 0;
        double d21 = d5;
        while (i < ceil) {
            double d22 = d20 + d16;
            double sin3 = java.lang.Math.sin(d22);
            double cos3 = java.lang.Math.cos(d22);
            double d23 = d16;
            double d24 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
            double d25 = d2 + (d10 * sin * cos3) + (d15 * sin3);
            double d26 = (d12 * sin3) - (d13 * cos3);
            double d27 = (sin3 * d14) + (cos3 * d15);
            double d28 = d22 - d20;
            double tan = java.lang.Math.tan(d28 / 2.0d);
            double sin4 = (java.lang.Math.sin(d28) * (java.lang.Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
            path.cubicTo((float) (d21 + (d18 * sin4)), (float) (d17 + (d19 * sin4)), (float) (d24 - (sin4 * d26)), (float) (d25 - (sin4 * d27)), (float) d24, (float) d25);
            i++;
            d17 = d25;
            ceil = ceil;
            sin = sin;
            d20 = d22;
            d19 = d27;
            cos = cos;
            d18 = d26;
            d10 = d3;
            d21 = d24;
            d16 = d23;
        }
    }
}
