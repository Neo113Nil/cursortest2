package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004*\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Path$Direction;", "computeDirection", "(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path$Direction;", "", "contours", "divide", "(Landroidx/compose/ui/graphics/Path;Ljava/util/List;)Ljava/util/List;", "destination", "reverse", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/PathSegment$Type;", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/graphics/PathSegment$Type;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PathGeometryKt {
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.graphics.Path.Direction computeDirection(androidx.compose.ui.graphics.Path path) {
        float cubicArea;
        androidx.compose.ui.graphics.PathIterator it = path.iterator();
        float[] fArr = new float[8];
        androidx.compose.ui.graphics.PathSegment.Type next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr, 0, 2, null);
        boolean z = true;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        while (next$default != androidx.compose.ui.graphics.PathSegment.Type.Done) {
            switch (androidx.compose.ui.graphics.PathGeometryKt.WhenMappings.$EnumSwitchMapping$0[next$default.ordinal()]) {
                case 1:
                    if (!z) {
                        if (f >= 0.0f) {
                            return androidx.compose.ui.graphics.Path.Direction.Clockwise;
                        }
                        return androidx.compose.ui.graphics.Path.Direction.CounterClockwise;
                    }
                    f4 = fArr[0];
                    f5 = fArr[1];
                    z = false;
                    next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr, 0, 2, null);
                case 2:
                    float f6 = fArr[0];
                    float f7 = fArr[1];
                    f2 = fArr[2];
                    f3 = fArr[3];
                    cubicArea = androidx.compose.ui.graphics.BezierKt.cubicArea(f6, f7, f6, f7, f2, f3, f2, f3);
                    f += cubicArea;
                    next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr, 0, 2, null);
                case 3:
                    float f8 = fArr[0];
                    float f9 = fArr[1];
                    float f10 = fArr[2];
                    float f11 = fArr[3];
                    f2 = fArr[4];
                    f3 = fArr[5];
                    cubicArea = androidx.compose.ui.graphics.BezierKt.cubicArea(f8, f9, f8 + ((f10 - f8) * 0.6666667f), f9 + ((f11 - f9) * 0.6666667f), f2 + ((f10 - f2) * 0.6666667f), f3 + ((f11 - f3) * 0.6666667f), f2, f3);
                    f += cubicArea;
                    next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr, 0, 2, null);
                case 4:
                case 5:
                    f += androidx.compose.ui.graphics.BezierKt.cubicArea(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7]);
                    f2 = fArr[6];
                    f3 = fArr[7];
                    next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr, 0, 2, null);
                case 6:
                    if (java.lang.Math.abs(f2 - f4) >= 1.05E-6f || java.lang.Math.abs(f3 - f5) >= 1.05E-6f) {
                        f += androidx.compose.ui.graphics.BezierKt.cubicArea(f2, f3, f2, f3, f4, f5, f4, f5);
                        f2 = f4;
                        f3 = f5;
                    }
                    next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr, 0, 2, null);
                    break;
                case 7:
                    if (f >= 0.0f) {
                    }
                    break;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        if (f >= 0.0f) {
        }
    }

    public static /* synthetic */ java.util.List divide$default(androidx.compose.ui.graphics.Path path, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = new java.util.ArrayList();
        }
        return divide(path, list);
    }

    public static final java.util.List<androidx.compose.ui.graphics.Path> divide(androidx.compose.ui.graphics.Path path, java.util.List<androidx.compose.ui.graphics.Path> list) {
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        androidx.compose.ui.graphics.PathIterator it = path.iterator();
        float[] fArr = new float[8];
        androidx.compose.ui.graphics.PathSegment.Type next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr, 0, 2, null);
        boolean z = true;
        boolean z2 = true;
        while (next$default != androidx.compose.ui.graphics.PathSegment.Type.Done) {
            switch (androidx.compose.ui.graphics.PathGeometryKt.WhenMappings.$EnumSwitchMapping$0[next$default.ordinal()]) {
                case 1:
                    if (!z2 && !z) {
                        list.add(Path);
                        Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
                    }
                    Path.moveTo(fArr[0], fArr[1]);
                    z2 = false;
                    z = true;
                    next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr, 0, 2, null);
                case 2:
                    Path.lineTo(fArr[2], fArr[3]);
                    z = false;
                    next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr, 0, 2, null);
                case 3:
                    Path.quadraticTo(fArr[2], fArr[3], fArr[4], fArr[5]);
                    z = false;
                    next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr, 0, 2, null);
                case 4:
                case 7:
                case 5:
                    Path.cubicTo(fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7]);
                    z = false;
                    next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr, 0, 2, null);
                case 6:
                    Path.close();
                    next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr, 0, 2, null);
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        if (!z2 && !z) {
            list.add(Path);
        }
        return list;
    }

    public static /* synthetic */ androidx.compose.ui.graphics.Path reverse$default(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Path path2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            path2 = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        }
        return reverse(path, path2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final androidx.compose.ui.graphics.Path reverse(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Path path2) {
        int i;
        boolean z;
        float[] fArr;
        androidx.compose.ui.graphics.PathIterator it = path.iterator();
        int calculateSize = it.calculateSize(false);
        java.util.ArrayList arrayList = new java.util.ArrayList(calculateSize);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(calculateSize);
        float[] fArr2 = new float[8];
        for (androidx.compose.ui.graphics.PathSegment.Type next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr2, 0, 2, null); next$default != androidx.compose.ui.graphics.PathSegment.Type.Done; next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr2, 0, 2, null)) {
            arrayList.add(next$default);
            if (next$default != androidx.compose.ui.graphics.PathSegment.Type.Close) {
                float[] copyOf = java.util.Arrays.copyOf(fArr2, getHighSpeedVideoFpsRangesFor(next$default));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                arrayList2.add(copyOf);
            }
        }
        int size = arrayList2.size();
        boolean z2 = false;
        boolean z3 = true;
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            if (z3) {
                int i2 = size - 1;
                fArr = (float[]) arrayList2.get(i2);
                int lastIndex = kotlin.collections.ArraysKt.getLastIndex(fArr);
                path2.moveTo(fArr[lastIndex - 1], fArr[lastIndex]);
                i = i2;
                z = false;
            } else {
                i = size;
                z = z3;
                fArr = (float[]) arrayList2.get(size);
            }
            switch (androidx.compose.ui.graphics.PathGeometryKt.WhenMappings.$EnumSwitchMapping$0[((androidx.compose.ui.graphics.PathSegment.Type) arrayList.get(size2)).ordinal()]) {
                case 1:
                    if (z2) {
                        path2.close();
                        z2 = false;
                    }
                    z3 = true;
                    size = i;
                case 2:
                    path2.lineTo(fArr[0], fArr[1]);
                    i--;
                    size = i;
                    z3 = z;
                case 3:
                    path2.quadraticTo(fArr[2], fArr[3], fArr[0], fArr[1]);
                    i--;
                    size = i;
                    z3 = z;
                case 4:
                case 7:
                    size = i;
                    z3 = z;
                case 5:
                    path2.cubicTo(fArr[4], fArr[5], fArr[2], fArr[3], fArr[0], fArr[1]);
                    i--;
                    size = i;
                    z3 = z;
                case 6:
                    z2 = true;
                    size = i;
                    z3 = z;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        if (z2) {
            path2.close();
        }
        return path2;
    }

    private static final int getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.PathSegment.Type type) {
        switch (androidx.compose.ui.graphics.PathGeometryKt.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 6;
            case 4:
            case 5:
                return 8;
            case 6:
            case 7:
                return 0;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.graphics.PathSegment.Type.values().length];
            try {
                iArr[androidx.compose.ui.graphics.PathSegment.Type.Move.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.graphics.PathSegment.Type.Line.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.graphics.PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.graphics.PathSegment.Type.Conic.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.compose.ui.graphics.PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.compose.ui.graphics.PathSegment.Type.Close.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.compose.ui.graphics.PathSegment.Type.Done.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
