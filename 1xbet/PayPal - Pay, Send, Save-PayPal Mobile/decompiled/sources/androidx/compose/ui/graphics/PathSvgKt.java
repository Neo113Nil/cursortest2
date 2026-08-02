package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "pathData", "", "addSvg", "(Landroidx/compose/ui/graphics/Path;Ljava/lang/String;)V", "", "asDocument", "toSvg", "(Landroidx/compose/ui/graphics/Path;Z)Ljava/lang/String;", "Landroidx/compose/ui/graphics/PathSegment$Type;", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/graphics/PathSegment$Type;Landroidx/compose/ui/graphics/PathSegment$Type;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PathSvgKt {
    public static final void addSvg(androidx.compose.ui.graphics.Path path, java.lang.String str) {
        new androidx.compose.ui.graphics.vector.PathParser().parsePathString(str).toPath(path);
    }

    public static final java.lang.String toSvg(androidx.compose.ui.graphics.Path path, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        androidx.compose.ui.geometry.Rect bounds = path.getBounds();
        if (z) {
            sb.append("<svg xmlns=\"http://www.w3.org/2000/svg\" ");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("viewBox=\"");
            sb2.append(bounds.getLeft());
            sb2.append(' ');
            sb2.append(bounds.getTop());
            sb2.append(' ');
            sb2.append(bounds.getRight() - bounds.getLeft());
            sb2.append(' ');
            sb2.append(bounds.getBottom() - bounds.getTop());
            sb2.append("\">");
            sb.append(sb2.toString());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        }
        androidx.compose.ui.graphics.PathIterator it = path.iterator();
        float[] fArr = new float[8];
        androidx.compose.ui.graphics.PathSegment.Type type = androidx.compose.ui.graphics.PathSegment.Type.Done;
        if (it.hasNext()) {
            if (z) {
                if (androidx.compose.ui.graphics.PathFillType.m6270equalsimpl0(path.mo5885getFillTypeRgk1Os(), androidx.compose.ui.graphics.PathFillType.INSTANCE.m6274getEvenOddRgk1Os())) {
                    sb.append("  <path fill-rule=\"evenodd\" d=\"");
                } else {
                    sb.append("  <path d=\"");
                }
            }
            while (it.hasNext()) {
                androidx.compose.ui.graphics.PathSegment.Type next$default = androidx.compose.ui.graphics.PathIterator.next$default(it, fArr, 0, 2, null);
                switch (androidx.compose.ui.graphics.PathSvgKt.WhenMappings.$EnumSwitchMapping$0[next$default.ordinal()]) {
                    case 1:
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.PathSegment.Type.Move, type));
                        sb3.append(fArr[0]);
                        sb3.append(' ');
                        sb3.append(fArr[1]);
                        sb.append(sb3.toString());
                        type = next$default;
                        break;
                    case 2:
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.PathSegment.Type.Line, type));
                        sb4.append(fArr[2]);
                        sb4.append(' ');
                        sb4.append(fArr[3]);
                        sb.append(sb4.toString());
                        type = next$default;
                        break;
                    case 3:
                        sb.append(getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.PathSegment.Type.Quadratic, type));
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                        sb5.append(fArr[2]);
                        sb5.append(' ');
                        sb5.append(fArr[3]);
                        sb5.append(' ');
                        sb5.append(fArr[4]);
                        sb5.append(' ');
                        sb5.append(fArr[5]);
                        sb.append(sb5.toString());
                        type = next$default;
                        break;
                    case 4:
                    case 7:
                        break;
                    case 5:
                        sb.append(getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.PathSegment.Type.Cubic, type));
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(fArr[2]);
                        sb6.append(' ');
                        sb6.append(fArr[3]);
                        sb6.append(' ');
                        sb.append(sb6.toString());
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(fArr[4]);
                        sb7.append(' ');
                        sb7.append(fArr[5]);
                        sb7.append(' ');
                        sb.append(sb7.toString());
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(fArr[6]);
                        sb8.append(' ');
                        sb8.append(fArr[7]);
                        sb.append(sb8.toString());
                        type = next$default;
                        break;
                    case 6:
                        sb.append(getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.PathSegment.Type.Close, type));
                        type = next$default;
                        break;
                    default:
                        throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            if (z) {
                sb.append("\"/>");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append('\n');
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            }
        }
        if (z) {
            sb.append("</svg>");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static /* synthetic */ java.lang.String toSvg$default(androidx.compose.ui.graphics.Path path, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toSvg(path, z);
    }

    private static final java.lang.String getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.PathSegment.Type type, androidx.compose.ui.graphics.PathSegment.Type type2) {
        if (type != type2) {
            int i = androidx.compose.ui.graphics.PathSvgKt.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                return "M";
            }
            if (i == 2) {
                return "L";
            }
            if (i == 3) {
                return com.visa.cbp.getEncExpo.updateVisuals;
            }
            if (i == 5) {
                return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA;
            }
            if (i == 6) {
                return "Z";
            }
            return "";
        }
        return " ";
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
