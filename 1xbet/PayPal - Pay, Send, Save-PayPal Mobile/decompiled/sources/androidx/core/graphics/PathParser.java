package androidx.core.graphics;

/* loaded from: classes3.dex */
public final class PathParser {
    static float[] getHighSpeedVideoFpsRangesFor(float[] fArr, int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        int min = java.lang.Math.min(i, length);
        float[] fArr2 = new float[i];
        java.lang.System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static android.graphics.Path createPathFromPathData(java.lang.String str) {
        android.graphics.Path path = new android.graphics.Path();
        try {
            androidx.core.graphics.PathParser.PathDataNode.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (java.lang.RuntimeException e) {
            throw new java.lang.RuntimeException("Error in parsing ".concat(java.lang.String.valueOf(str)), e);
        }
    }

    public static androidx.core.graphics.PathParser.PathDataNode[] createNodesFromPathData(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        int i2 = 1;
        while (i2 < str.length()) {
            while (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                    break;
                }
                i2++;
            }
            java.lang.String trim = str.substring(i, i2).trim();
            if (!trim.isEmpty()) {
                arrayList.add(new androidx.core.graphics.PathParser.PathDataNode(trim.charAt(0), getHighSpeedVideoFpsRanges(trim)));
            }
            i = i2;
            i2++;
        }
        if (i2 - i == 1 && i < str.length()) {
            arrayList.add(new androidx.core.graphics.PathParser.PathDataNode(str.charAt(i), new float[0]));
        }
        return (androidx.core.graphics.PathParser.PathDataNode[]) arrayList.toArray(new androidx.core.graphics.PathParser.PathDataNode[0]);
    }

    public static androidx.core.graphics.PathParser.PathDataNode[] deepCopyNodes(androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr) {
        androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr2 = new androidx.core.graphics.PathParser.PathDataNode[pathDataNodeArr.length];
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr2[i] = new androidx.core.graphics.PathParser.PathDataNode(pathDataNodeArr[i]);
        }
        return pathDataNodeArr2;
    }

    public static boolean canMorph(androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr, androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            if (pathDataNodeArr[i].Camera2StreamConfigurationMap != pathDataNodeArr2[i].Camera2StreamConfigurationMap || pathDataNodeArr[i].getHighSpeedVideoFpsRanges.length != pathDataNodeArr2[i].getHighSpeedVideoFpsRanges.length) {
                return false;
            }
        }
        return true;
    }

    public static void updateNodes(androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr, androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr2) {
        for (int i = 0; i < pathDataNodeArr2.length; i++) {
            pathDataNodeArr[i].Camera2StreamConfigurationMap = pathDataNodeArr2[i].Camera2StreamConfigurationMap;
            for (int i2 = 0; i2 < pathDataNodeArr2[i].getHighSpeedVideoFpsRanges.length; i2++) {
                pathDataNodeArr[i].getHighSpeedVideoFpsRanges[i2] = pathDataNodeArr2[i].getHighSpeedVideoFpsRanges[i2];
            }
        }
    }

    static class ExtractFloatResult {
        boolean getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;

        ExtractFloatResult() {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[Catch: NumberFormatException -> 0x007f, LOOP:1: B:9:0x002b->B:21:0x005c, LOOP_END, TryCatch #0 {NumberFormatException -> 0x007f, blocks: (B:6:0x0011, B:8:0x0025, B:9:0x002b, B:11:0x0031, B:17:0x0041, B:21:0x005c, B:37:0x004a, B:40:0x0051, B:23:0x005f, B:25:0x0065, B:26:0x0071, B:29:0x0077, B:45:0x007a), top: B:5:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[Catch: NumberFormatException -> 0x007f, TryCatch #0 {NumberFormatException -> 0x007f, blocks: (B:6:0x0011, B:8:0x0025, B:9:0x002b, B:11:0x0031, B:17:0x0041, B:21:0x005c, B:37:0x004a, B:40:0x0051, B:23:0x005f, B:25:0x0065, B:26:0x0071, B:29:0x0077, B:45:0x007a), top: B:5:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static float[] getHighSpeedVideoFpsRanges(java.lang.String str) {
        int i;
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            androidx.core.graphics.PathParser.ExtractFloatResult extractFloatResult = new androidx.core.graphics.PathParser.ExtractFloatResult();
            int length = str.length();
            int i2 = 0;
            int i3 = 1;
            while (i3 < length) {
                extractFloatResult.getHighResolutionOutputSizeshNQ4ISI = false;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                for (int i4 = i3; i4 < str.length(); i4++) {
                    char charAt = str.charAt(i4);
                    if (charAt != ' ') {
                        if (charAt != 'E' && charAt != 'e') {
                            switch (charAt) {
                                case ',':
                                    break;
                                case '-':
                                    if (i4 != i3 && !z2) {
                                        extractFloatResult.getHighResolutionOutputSizeshNQ4ISI = true;
                                        break;
                                    }
                                    z2 = false;
                                    break;
                                case '.':
                                    if (z) {
                                        extractFloatResult.getHighResolutionOutputSizeshNQ4ISI = true;
                                        break;
                                    } else {
                                        z2 = false;
                                        z = true;
                                        break;
                                    }
                                default:
                                    z2 = false;
                                    break;
                            }
                        } else {
                            z2 = true;
                        }
                        if (!z3) {
                            extractFloatResult.getHighSpeedVideoSizes = i4;
                            i = extractFloatResult.getHighSpeedVideoSizes;
                            if (i3 < i) {
                                fArr[i2] = java.lang.Float.parseFloat(str.substring(i3, i));
                                i2++;
                            }
                            i3 = !extractFloatResult.getHighResolutionOutputSizeshNQ4ISI ? i : i + 1;
                        }
                    }
                    z2 = false;
                    z3 = true;
                    if (!z3) {
                    }
                }
                extractFloatResult.getHighSpeedVideoSizes = i4;
                i = extractFloatResult.getHighSpeedVideoSizes;
                if (i3 < i) {
                }
                if (!extractFloatResult.getHighResolutionOutputSizeshNQ4ISI) {
                }
            }
            return getHighSpeedVideoFpsRangesFor(fArr, i2);
        } catch (java.lang.NumberFormatException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("error in parsing \"");
            sb.append(str);
            sb.append("\"");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    public static void interpolatePathDataNodes(androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr, float f, androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr2, androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr3) {
        if (!interpolatePathDataNodes(pathDataNodeArr, pathDataNodeArr2, pathDataNodeArr3, f)) {
            throw new java.lang.IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    @java.lang.Deprecated
    public static boolean interpolatePathDataNodes(androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr, androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr2, androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr3, float f) {
        if (pathDataNodeArr.length != pathDataNodeArr2.length || pathDataNodeArr2.length != pathDataNodeArr3.length) {
            throw new java.lang.IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
            return false;
        }
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr[i].interpolatePathDataNode(pathDataNodeArr2[i], pathDataNodeArr3[i], f);
        }
        return true;
    }

    public static void nodesToPath(androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr, android.graphics.Path path) {
        float[] fArr = new float[6];
        char c = io.ktor.util.date.GMTDateParser.MINUTES;
        for (androidx.core.graphics.PathParser.PathDataNode pathDataNode : pathDataNodeArr) {
            androidx.core.graphics.PathParser.PathDataNode.getHighSpeedVideoFpsRangesFor(path, fArr, c, pathDataNode.Camera2StreamConfigurationMap, pathDataNode.getHighSpeedVideoFpsRanges);
            c = pathDataNode.Camera2StreamConfigurationMap;
        }
    }

    public static class PathDataNode {
        private char Camera2StreamConfigurationMap;
        private final float[] getHighSpeedVideoFpsRanges;

        public char getType() {
            return this.Camera2StreamConfigurationMap;
        }

        public float[] getParams() {
            return this.getHighSpeedVideoFpsRanges;
        }

        PathDataNode(char c, float[] fArr) {
            this.Camera2StreamConfigurationMap = c;
            this.getHighSpeedVideoFpsRanges = fArr;
        }

        PathDataNode(androidx.core.graphics.PathParser.PathDataNode pathDataNode) {
            this.Camera2StreamConfigurationMap = pathDataNode.Camera2StreamConfigurationMap;
            float[] fArr = pathDataNode.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = androidx.core.graphics.PathParser.getHighSpeedVideoFpsRangesFor(fArr, fArr.length);
        }

        @java.lang.Deprecated
        public static void nodesToPath(androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr, android.graphics.Path path) {
            androidx.core.graphics.PathParser.nodesToPath(pathDataNodeArr, path);
        }

        public void interpolatePathDataNode(androidx.core.graphics.PathParser.PathDataNode pathDataNode, androidx.core.graphics.PathParser.PathDataNode pathDataNode2, float f) {
            this.Camera2StreamConfigurationMap = pathDataNode.Camera2StreamConfigurationMap;
            int i = 0;
            while (true) {
                float[] fArr = pathDataNode.getHighSpeedVideoFpsRanges;
                if (i >= fArr.length) {
                    return;
                }
                this.getHighSpeedVideoFpsRanges[i] = (fArr[i] * (1.0f - f)) + (pathDataNode2.getHighSpeedVideoFpsRanges[i] * f);
                i++;
            }
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(android.graphics.Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            float f8 = f;
            float f9 = f5;
            float f10 = f6;
            float f11 = f7;
            while (true) {
                double radians = java.lang.Math.toRadians(f11);
                double cos = java.lang.Math.cos(radians);
                double sin = java.lang.Math.sin(radians);
                double d3 = f8;
                double d4 = f2;
                double d5 = f9;
                double d6 = ((d3 * cos) + (d4 * sin)) / d5;
                double d7 = f10;
                double d8 = (((-f8) * sin) + (d4 * cos)) / d7;
                float f12 = f10;
                double d9 = f4;
                double d10 = ((f3 * cos) + (d9 * sin)) / d5;
                double d11 = (((-f3) * sin) + (d9 * cos)) / d7;
                double d12 = d6 - d10;
                double d13 = d8 - d11;
                double d14 = (d6 + d10) / 2.0d;
                double d15 = (d8 + d11) / 2.0d;
                double d16 = (d12 * d12) + (d13 * d13);
                if (d16 == 0.0d) {
                    return;
                }
                double d17 = (1.0d / d16) - 0.25d;
                if (d17 < 0.0d) {
                    float sqrt = (float) (java.lang.Math.sqrt(d16) / 1.99999d);
                    f9 *= sqrt;
                    f10 = sqrt * f12;
                    f8 = f;
                    f11 = f7;
                } else {
                    double sqrt2 = java.lang.Math.sqrt(d17);
                    double d18 = d12 * sqrt2;
                    double d19 = sqrt2 * d13;
                    if (z == z2) {
                        d = d14 - d19;
                        d2 = d15 + d18;
                    } else {
                        d = d14 + d19;
                        d2 = d15 - d18;
                    }
                    double atan2 = java.lang.Math.atan2(d8 - d2, d6 - d);
                    double atan22 = java.lang.Math.atan2(d11 - d2, d10 - d) - atan2;
                    if (z2 != (atan22 >= 0.0d)) {
                        atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
                    }
                    double d20 = d * d5;
                    double d21 = d2 * d7;
                    Camera2StreamConfigurationMap(path, (d20 * cos) - (d21 * sin), (d20 * sin) + (d21 * cos), d5, d7, d3, d4, radians, atan2, atan22);
                    return;
                }
            }
        }

        private static void Camera2StreamConfigurationMap(android.graphics.Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
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
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d21 + (d18 * sin4)), (float) (d17 + (d19 * sin4)), (float) (d24 - (sin4 * d26)), (float) (d25 - (sin4 * d27)), (float) d24, (float) d25);
                i++;
                d17 = d25;
                d21 = d24;
                sin = sin;
                d20 = d22;
                d19 = d27;
                ceil = ceil;
                d18 = d26;
                cos = cos;
                d10 = d3;
                d16 = d23;
            }
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(android.graphics.Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            int i3;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            char c3 = c2;
            boolean z = false;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[2];
            float f18 = fArr[3];
            float f19 = fArr[4];
            float f20 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i2 = 7;
                    i = i2;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    i = i2;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    path.close();
                    path.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                default:
                    i = 2;
                    break;
            }
            float f21 = f15;
            float f22 = f16;
            float f23 = f19;
            float f24 = f20;
            int i4 = 0;
            char c4 = c;
            while (i4 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 == 'C') {
                        i3 = i4;
                        int i5 = i3 + 2;
                        int i6 = i3 + 3;
                        int i7 = i3 + 4;
                        int i8 = i3 + 5;
                        path.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i5], fArr2[i6], fArr2[i7], fArr2[i8]);
                        f21 = fArr2[i7];
                        float f25 = fArr2[i8];
                        float f26 = fArr2[i5];
                        float f27 = fArr2[i6];
                        f22 = f25;
                        f18 = f27;
                        f17 = f26;
                    } else if (c3 != 'H') {
                        if (c3 == 'Q') {
                            i3 = i4;
                            int i9 = i3 + 1;
                            int i10 = i3 + 2;
                            int i11 = i3 + 3;
                            path.quadTo(fArr2[i3], fArr2[i9], fArr2[i10], fArr2[i11]);
                            f = fArr2[i3];
                            f2 = fArr2[i9];
                            f21 = fArr2[i10];
                            f22 = fArr2[i11];
                        } else if (c3 == 'V') {
                            i3 = i4;
                            path.lineTo(f21, fArr2[i3]);
                            f22 = fArr2[i3];
                        } else if (c3 != 'a') {
                            if (c3 != 'c') {
                                if (c3 != 'h') {
                                    if (c3 != 'q') {
                                        if (c3 != 'v') {
                                            if (c3 != 'L') {
                                                if (c3 == 'M') {
                                                    f9 = fArr2[i4];
                                                    f10 = fArr2[i4 + 1];
                                                    if (i4 > 0) {
                                                        path.lineTo(f9, f10);
                                                    } else {
                                                        path.moveTo(f9, f10);
                                                        f21 = f9;
                                                        f22 = f10;
                                                    }
                                                } else if (c3 == 'S') {
                                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                        f21 = (f21 * 2.0f) - f17;
                                                        f22 = (f22 * 2.0f) - f18;
                                                    }
                                                    float f28 = f21;
                                                    int i12 = i4 + 1;
                                                    int i13 = i4 + 2;
                                                    int i14 = i4 + 3;
                                                    path.cubicTo(f28, f22, fArr2[i4], fArr2[i12], fArr2[i13], fArr2[i14]);
                                                    f = fArr2[i4];
                                                    f2 = fArr2[i12];
                                                    f3 = fArr2[i13];
                                                    f4 = fArr2[i14];
                                                } else if (c3 == 'T') {
                                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                        f21 = (f21 * 2.0f) - f17;
                                                        f22 = (f22 * 2.0f) - f18;
                                                    }
                                                    int i15 = i4 + 1;
                                                    path.quadTo(f21, f22, fArr2[i4], fArr2[i15]);
                                                    i3 = i4;
                                                    f18 = f22;
                                                    f17 = f21;
                                                    f21 = fArr2[i4];
                                                    f22 = fArr2[i15];
                                                } else if (c3 == 'l') {
                                                    int i16 = i4 + 1;
                                                    path.rLineTo(fArr2[i4], fArr2[i16]);
                                                    f21 += fArr2[i4];
                                                    f8 = fArr2[i16];
                                                } else if (c3 == 'm') {
                                                    float f29 = fArr2[i4];
                                                    f21 += f29;
                                                    float f30 = fArr2[i4 + 1];
                                                    f22 += f30;
                                                    if (i4 > 0) {
                                                        path.rLineTo(f29, f30);
                                                    } else {
                                                        path.rMoveTo(f29, f30);
                                                    }
                                                } else if (c3 == 's') {
                                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                        f11 = f21 - f17;
                                                        f12 = f22 - f18;
                                                    } else {
                                                        f11 = 0.0f;
                                                        f12 = 0.0f;
                                                    }
                                                    int i17 = i4 + 1;
                                                    int i18 = i4 + 2;
                                                    int i19 = i4 + 3;
                                                    path.rCubicTo(f11, f12, fArr2[i4], fArr2[i17], fArr2[i18], fArr2[i19]);
                                                    f5 = fArr2[i4] + f21;
                                                    f6 = fArr2[i17] + f22;
                                                    f21 += fArr2[i18];
                                                    f7 = fArr2[i19];
                                                } else if (c3 == 't') {
                                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                        f13 = f21 - f17;
                                                        f14 = f22 - f18;
                                                    } else {
                                                        f14 = 0.0f;
                                                        f13 = 0.0f;
                                                    }
                                                    int i20 = i4 + 1;
                                                    path.rQuadTo(f13, f14, fArr2[i4], fArr2[i20]);
                                                    float f31 = f13 + f21;
                                                    f18 = f14 + f22;
                                                    f21 = fArr2[i4] + f21;
                                                    f22 = fArr2[i20] + f22;
                                                    f17 = f31;
                                                }
                                                i3 = i4;
                                                f24 = f22;
                                                f23 = f21;
                                            } else {
                                                int i21 = i4 + 1;
                                                path.lineTo(fArr2[i4], fArr2[i21]);
                                                f9 = fArr2[i4];
                                                f10 = fArr2[i21];
                                            }
                                            f21 = f9;
                                            f22 = f10;
                                        } else {
                                            path.rLineTo(0.0f, fArr2[i4]);
                                            f8 = fArr2[i4];
                                        }
                                        f22 += f8;
                                    } else {
                                        int i22 = i4 + 1;
                                        int i23 = i4 + 2;
                                        int i24 = i4 + 3;
                                        path.rQuadTo(fArr2[i4], fArr2[i22], fArr2[i23], fArr2[i24]);
                                        f5 = fArr2[i4] + f21;
                                        f6 = fArr2[i22] + f22;
                                        f21 += fArr2[i23];
                                        f7 = fArr2[i24];
                                    }
                                    f22 += f7;
                                    f17 = f5;
                                    f18 = f6;
                                } else {
                                    path.rLineTo(fArr2[i4], 0.0f);
                                    f21 += fArr2[i4];
                                }
                                i3 = i4;
                            } else {
                                int i25 = i4 + 2;
                                int i26 = i4 + 3;
                                int i27 = i4 + 4;
                                int i28 = i4 + 5;
                                path.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                                float f32 = fArr2[i25];
                                float f33 = fArr2[i26];
                                f3 = fArr2[i27] + f21;
                                f4 = fArr2[i28] + f22;
                                f = f32 + f21;
                                f2 = f33 + f22;
                            }
                            f21 = f3;
                            f22 = f4;
                            i3 = i4;
                        } else {
                            int i29 = i4 + 5;
                            int i30 = i4 + 6;
                            i3 = i4;
                            getHighResolutionOutputSizeshNQ4ISI(path, f21, f22, fArr2[i29] + f21, fArr2[i30] + f22, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                            f21 += fArr2[i29];
                            f22 += fArr2[i30];
                        }
                        f17 = f;
                        f18 = f2;
                    } else {
                        i3 = i4;
                        path.lineTo(fArr2[i3], f22);
                        f21 = fArr2[i3];
                    }
                    i4 = i3 + i;
                    c4 = c2;
                    c3 = c4;
                    z = false;
                } else {
                    i3 = i4;
                    int i31 = i3 + 5;
                    int i32 = i3 + 6;
                    getHighResolutionOutputSizeshNQ4ISI(path, f21, f22, fArr2[i31], fArr2[i32], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                    f21 = fArr2[i31];
                    f22 = fArr2[i32];
                }
                f18 = f22;
                f17 = f21;
                i4 = i3 + i;
                c4 = c2;
                c3 = c4;
                z = false;
            }
            fArr[z ? 1 : 0] = f21;
            fArr[1] = f22;
            fArr[2] = f17;
            fArr[3] = f18;
            fArr[4] = f23;
            fArr[5] = f24;
        }
    }

    private PathParser() {
    }
}
