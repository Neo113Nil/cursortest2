package androidx.compose.ui.graphics.vector;

/* compiled from: PathParser.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002\u001aX\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u001a\u001a\u0010\u001a\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u001a\r\u0010\u001e\u001a\u00020\t*\u00020\tH\u0082\b\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u001f"}, d2 = {"EmptyArray", "", "getEmptyArray", "()[F", "arcToBezier", "", "p", "Landroidx/compose/ui/graphics/Path;", "cx", "", "cy", "a", "b", "e1x", "e1y", "theta", "start", "sweep", "drawArc", "x0", "y0", "x1", "y1", "isMoreThanHalf", "", "isPositiveArc", "toPath", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "target", "toRadians", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PathParserKt {
    private static final float[] EmptyArray = new float[0];

    private static final double toRadians(double d) {
        return (d / 180) * 3.141592653589793d;
    }

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
        int i;
        int i2;
        androidx.compose.ui.graphics.vector.PathNode pathNode2;
        float f;
        float f2;
        float f3;
        float f4;
        float dy;
        float y1;
        float x2;
        float y2;
        float f5;
        float f6;
        float f7;
        float f8;
        float dy2;
        java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> list2 = list;
        androidx.compose.ui.graphics.Path path2 = path;
        int mo2004getFillTypeRgk1Os = path.mo2004getFillTypeRgk1Os();
        path.rewind();
        path2.mo2006setFillTypeoQ8Xj4U(mo2004getFillTypeRgk1Os);
        androidx.compose.ui.graphics.vector.PathNode pathNode3 = list.isEmpty() ? androidx.compose.ui.graphics.vector.PathNode.Close.INSTANCE : list2.get(0);
        int size = list.size();
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        int i3 = 0;
        while (i3 < size) {
            androidx.compose.ui.graphics.vector.PathNode pathNode4 = list2.get(i3);
            if (pathNode4 instanceof androidx.compose.ui.graphics.vector.PathNode.Close) {
                path.close();
                path2.moveTo(f14, f15);
                pathNode2 = pathNode4;
                f10 = f14;
                f12 = f10;
                f11 = f15;
                f13 = f11;
            } else if (pathNode4 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo) {
                androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo relativeMoveTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo) pathNode4;
                f12 += relativeMoveTo.getDx();
                f13 += relativeMoveTo.getDy();
                path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                pathNode2 = pathNode4;
                f14 = f12;
                f15 = f13;
            } else {
                if (pathNode4 instanceof androidx.compose.ui.graphics.vector.PathNode.MoveTo) {
                    androidx.compose.ui.graphics.vector.PathNode.MoveTo moveTo = (androidx.compose.ui.graphics.vector.PathNode.MoveTo) pathNode4;
                    float x = moveTo.getX();
                    float y = moveTo.getY();
                    path2.moveTo(moveTo.getX(), moveTo.getY());
                    f12 = x;
                    f14 = f12;
                    f13 = y;
                    f15 = f13;
                } else {
                    if (pathNode4 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo) {
                        androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo relativeLineTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo) pathNode4;
                        path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                        f12 += relativeLineTo.getDx();
                        dy2 = relativeLineTo.getDy();
                    } else if (pathNode4 instanceof androidx.compose.ui.graphics.vector.PathNode.LineTo) {
                        androidx.compose.ui.graphics.vector.PathNode.LineTo lineTo = (androidx.compose.ui.graphics.vector.PathNode.LineTo) pathNode4;
                        path2.lineTo(lineTo.getX(), lineTo.getY());
                        float x3 = lineTo.getX();
                        f13 = lineTo.getY();
                        f12 = x3;
                    } else if (pathNode4 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo) {
                        androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo relativeHorizontalTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo) pathNode4;
                        path2.relativeLineTo(relativeHorizontalTo.getDx(), f9);
                        f12 += relativeHorizontalTo.getDx();
                    } else if (pathNode4 instanceof androidx.compose.ui.graphics.vector.PathNode.HorizontalTo) {
                        androidx.compose.ui.graphics.vector.PathNode.HorizontalTo horizontalTo = (androidx.compose.ui.graphics.vector.PathNode.HorizontalTo) pathNode4;
                        path2.lineTo(horizontalTo.getX(), f13);
                        f12 = horizontalTo.getX();
                    } else if (pathNode4 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo) {
                        androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo relativeVerticalTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo) pathNode4;
                        path2.relativeLineTo(f9, relativeVerticalTo.getDy());
                        dy2 = relativeVerticalTo.getDy();
                    } else if (pathNode4 instanceof androidx.compose.ui.graphics.vector.PathNode.VerticalTo) {
                        androidx.compose.ui.graphics.vector.PathNode.VerticalTo verticalTo = (androidx.compose.ui.graphics.vector.PathNode.VerticalTo) pathNode4;
                        path2.lineTo(f12, verticalTo.getY());
                        f13 = verticalTo.getY();
                    } else {
                        if (pathNode4 instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo) {
                            androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo relativeCurveTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo) pathNode4;
                            pathNode = pathNode4;
                            path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                            f3 = relativeCurveTo.getDx2() + f12;
                            f4 = relativeCurveTo.getDy2() + f13;
                            f12 += relativeCurveTo.getDx3();
                            dy = relativeCurveTo.getDy3();
                        } else {
                            pathNode = pathNode4;
                            if (pathNode instanceof androidx.compose.ui.graphics.vector.PathNode.CurveTo) {
                                androidx.compose.ui.graphics.vector.PathNode.CurveTo curveTo = (androidx.compose.ui.graphics.vector.PathNode.CurveTo) pathNode;
                                path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                f3 = curveTo.getX2();
                                y1 = curveTo.getY2();
                                x2 = curveTo.getX3();
                                y2 = curveTo.getY3();
                            } else if (pathNode instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo) {
                                if (pathNode3.getIsCurve()) {
                                    f8 = f13 - f11;
                                    f7 = f12 - f10;
                                } else {
                                    f7 = 0.0f;
                                    f8 = 0.0f;
                                }
                                androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo) pathNode;
                                path.relativeCubicTo(f7, f8, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                f3 = relativeReflectiveCurveTo.getDx1() + f12;
                                f4 = relativeReflectiveCurveTo.getDy1() + f13;
                                f12 += relativeReflectiveCurveTo.getDx2();
                                dy = relativeReflectiveCurveTo.getDy2();
                            } else if (pathNode instanceof androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo) {
                                if (pathNode3.getIsCurve()) {
                                    float f16 = 2;
                                    f6 = (f16 * f13) - f11;
                                    f5 = (f12 * f16) - f10;
                                } else {
                                    f5 = f12;
                                    f6 = f13;
                                }
                                androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo reflectiveCurveTo = (androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo) pathNode;
                                path.cubicTo(f5, f6, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                f3 = reflectiveCurveTo.getX1();
                                y1 = reflectiveCurveTo.getY1();
                                x2 = reflectiveCurveTo.getX2();
                                y2 = reflectiveCurveTo.getY2();
                            } else if (pathNode instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo) {
                                androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo relativeQuadTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo) pathNode;
                                path2.relativeQuadraticBezierTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                f3 = relativeQuadTo.getDx1() + f12;
                                f4 = relativeQuadTo.getDy1() + f13;
                                f12 += relativeQuadTo.getDx2();
                                dy = relativeQuadTo.getDy2();
                            } else if (pathNode instanceof androidx.compose.ui.graphics.vector.PathNode.QuadTo) {
                                androidx.compose.ui.graphics.vector.PathNode.QuadTo quadTo = (androidx.compose.ui.graphics.vector.PathNode.QuadTo) pathNode;
                                path2.quadraticBezierTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                f3 = quadTo.getX1();
                                y1 = quadTo.getY1();
                                x2 = quadTo.getX2();
                                y2 = quadTo.getY2();
                            } else if (pathNode instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo) {
                                if (pathNode3.getIsQuad()) {
                                    f = f12 - f10;
                                    f2 = f13 - f11;
                                } else {
                                    f = 0.0f;
                                    f2 = 0.0f;
                                }
                                androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo) pathNode;
                                path2.relativeQuadraticBezierTo(f, f2, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                f3 = f + f12;
                                f4 = f2 + f13;
                                f12 += relativeReflectiveQuadTo.getDx();
                                dy = relativeReflectiveQuadTo.getDy();
                            } else {
                                if (pathNode instanceof androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo) {
                                    if (pathNode3.getIsQuad()) {
                                        float f17 = 2;
                                        f12 = (f12 * f17) - f10;
                                        f13 = (f17 * f13) - f11;
                                    }
                                    androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo reflectiveQuadTo = (androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo) pathNode;
                                    path2.quadraticBezierTo(f12, f13, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                    float x4 = reflectiveQuadTo.getX();
                                    pathNode2 = pathNode;
                                    f11 = f13;
                                    i = i3;
                                    i2 = size;
                                    f13 = reflectiveQuadTo.getY();
                                    f10 = f12;
                                    f12 = x4;
                                } else if (pathNode instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo) {
                                    androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo relativeArcTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo) pathNode;
                                    float arcStartDx = relativeArcTo.getArcStartDx() + f12;
                                    float arcStartDy = relativeArcTo.getArcStartDy() + f13;
                                    pathNode2 = pathNode;
                                    i = i3;
                                    i2 = size;
                                    drawArc(path, f12, f13, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                    f10 = arcStartDx;
                                    f12 = f10;
                                    f14 = f14;
                                    f15 = f15;
                                    f11 = arcStartDy;
                                    f13 = f11;
                                } else {
                                    float f18 = f14;
                                    float f19 = f15;
                                    i = i3;
                                    i2 = size;
                                    if (pathNode instanceof androidx.compose.ui.graphics.vector.PathNode.ArcTo) {
                                        androidx.compose.ui.graphics.vector.PathNode.ArcTo arcTo = (androidx.compose.ui.graphics.vector.PathNode.ArcTo) pathNode;
                                        pathNode2 = pathNode;
                                        drawArc(path, f12, f13, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                        f12 = arcTo.getArcStartX();
                                        f11 = arcTo.getArcStartY();
                                        f13 = f11;
                                        f14 = f18;
                                        f15 = f19;
                                        f10 = f12;
                                    } else {
                                        pathNode2 = pathNode;
                                        f14 = f18;
                                        f15 = f19;
                                    }
                                }
                                i3 = i + 1;
                                path2 = path;
                                size = i2;
                                pathNode3 = pathNode2;
                                f9 = 0.0f;
                                list2 = list;
                            }
                            pathNode2 = pathNode;
                            f12 = x2;
                            f13 = y2;
                            i = i3;
                            i2 = size;
                            f11 = y1;
                            f10 = f3;
                            i3 = i + 1;
                            path2 = path;
                            size = i2;
                            pathNode3 = pathNode2;
                            f9 = 0.0f;
                            list2 = list;
                        }
                        f13 += dy;
                        pathNode2 = pathNode;
                        f11 = f4;
                        i = i3;
                        i2 = size;
                        f10 = f3;
                        i3 = i + 1;
                        path2 = path;
                        size = i2;
                        pathNode3 = pathNode2;
                        f9 = 0.0f;
                        list2 = list;
                    }
                    f13 += dy2;
                }
                pathNode2 = pathNode4;
            }
            i = i3;
            i2 = size;
            i3 = i + 1;
            path2 = path;
            size = i2;
            pathNode3 = pathNode2;
            f9 = 0.0f;
            list2 = list;
        }
        return path;
    }

    private static final void drawArc(androidx.compose.ui.graphics.Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = (d7 / 180) * 3.141592653589793d;
        double cos = java.lang.Math.cos(d10);
        double sin = java.lang.Math.sin(d10);
        double d11 = ((d * cos) + (d2 * sin)) / d5;
        double d12 = (((-d) * sin) + (d2 * cos)) / d6;
        double d13 = ((d3 * cos) + (d4 * sin)) / d5;
        double d14 = (((-d3) * sin) + (d4 * cos)) / d6;
        double d15 = d11 - d13;
        double d16 = d12 - d14;
        double d17 = 2;
        double d18 = (d11 + d13) / d17;
        double d19 = (d12 + d14) / d17;
        double d20 = (d15 * d15) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (java.lang.Math.sqrt(d20) / 1.99999d);
            drawArc(path, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = java.lang.Math.sqrt(d21);
        double d22 = d15 * sqrt2;
        double d23 = sqrt2 * d16;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = java.lang.Math.atan2(d12 - d9, d11 - d8);
        double atan22 = java.lang.Math.atan2(d14 - d9, d13 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d8 * d5;
        double d25 = d9 * d6;
        arcToBezier(path, (d24 * cos) - (d25 * sin), (d24 * sin) + (d25 * cos), d5, d6, d, d2, d10, atan2, atan22);
    }

    private static final void arcToBezier(androidx.compose.ui.graphics.Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        double d11 = 4;
        int ceil = (int) java.lang.Math.ceil(java.lang.Math.abs((d9 * d11) / 3.141592653589793d));
        double cos = java.lang.Math.cos(d7);
        double sin = java.lang.Math.sin(d7);
        double cos2 = java.lang.Math.cos(d8);
        double sin2 = java.lang.Math.sin(d8);
        double d12 = -d10;
        double d13 = d12 * cos;
        double d14 = d4 * sin;
        double d15 = (d13 * sin2) - (d14 * cos2);
        double d16 = d12 * sin;
        double d17 = d4 * cos;
        double d18 = (sin2 * d16) + (cos2 * d17);
        double d19 = d9 / ceil;
        double d20 = d5;
        double d21 = d8;
        double d22 = d18;
        double d23 = d15;
        int i = 0;
        double d24 = d6;
        while (i < ceil) {
            double d25 = d21 + d19;
            double sin3 = java.lang.Math.sin(d25);
            double cos3 = java.lang.Math.cos(d25);
            int i2 = ceil;
            double d26 = (d + ((d10 * cos) * cos3)) - (d14 * sin3);
            double d27 = d2 + (d10 * sin * cos3) + (d17 * sin3);
            double d28 = (d13 * sin3) - (d14 * cos3);
            double d29 = (sin3 * d16) + (cos3 * d17);
            double d30 = d25 - d21;
            double tan = java.lang.Math.tan(d30 / 2);
            double sin4 = (java.lang.Math.sin(d30) * (java.lang.Math.sqrt(d11 + ((3.0d * tan) * tan)) - 1)) / 3;
            path.cubicTo((float) (d20 + (d23 * sin4)), (float) (d24 + (d22 * sin4)), (float) (d26 - (sin4 * d28)), (float) (d27 - (sin4 * d29)), (float) d26, (float) d27);
            i++;
            d19 = d19;
            sin = sin;
            d20 = d26;
            d16 = d16;
            d21 = d25;
            d22 = d29;
            d11 = d11;
            d23 = d28;
            cos = cos;
            ceil = i2;
            d24 = d27;
            d10 = d3;
        }
    }
}
