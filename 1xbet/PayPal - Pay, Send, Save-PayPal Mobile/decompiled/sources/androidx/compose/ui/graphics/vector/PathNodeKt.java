package androidx.compose.ui.graphics.vector;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0010\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0012\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0011"}, d2 = {"", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "nodes", "", "args", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "", "addPathNodes", "(CLjava/util/ArrayList;[FI)V", "", "p0", "p1", "p2", "getHighSpeedVideoSizes", "(Ljava/util/List;[FI)V", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PathNodeKt {
    public static final void addPathNodes(char c, java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList, float[] fArr, int i) {
        int i2 = 0;
        switch (c) {
            case 'A':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList2 = arrayList;
                for (int i3 = 0; i3 <= i - 7; i3 += 7) {
                    arrayList2.add(new androidx.compose.ui.graphics.vector.PathNode.ArcTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], java.lang.Float.compare(fArr[i3 + 3], 0.0f) != 0, java.lang.Float.compare(fArr[i3 + 4], 0.0f) != 0, fArr[i3 + 5], fArr[i3 + 6]));
                }
                return;
            case 'C':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList3 = arrayList;
                while (i2 <= i - 6) {
                    arrayList3.add(new androidx.compose.ui.graphics.vector.PathNode.CurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                    i2 += 6;
                }
                return;
            case 'H':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList4 = arrayList;
                while (i2 <= i - 1) {
                    arrayList4.add(new androidx.compose.ui.graphics.vector.PathNode.HorizontalTo(fArr[i2]));
                    i2++;
                }
                return;
            case 'L':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList5 = arrayList;
                while (i2 <= i - 2) {
                    arrayList5.add(new androidx.compose.ui.graphics.vector.PathNode.LineTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'M':
                getHighSpeedVideoSizes(arrayList, fArr, i);
                return;
            case 'Q':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList6 = arrayList;
                while (i2 <= i - 4) {
                    arrayList6.add(new androidx.compose.ui.graphics.vector.PathNode.QuadTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 'S':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList7 = arrayList;
                while (i2 <= i - 4) {
                    arrayList7.add(new androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 'T':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList8 = arrayList;
                while (i2 <= i - 2) {
                    arrayList8.add(new androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'V':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList9 = arrayList;
                while (i2 <= i - 1) {
                    arrayList9.add(new androidx.compose.ui.graphics.vector.PathNode.VerticalTo(fArr[i2]));
                    i2++;
                }
                return;
            case 'Z':
            case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                arrayList.add(androidx.compose.ui.graphics.vector.PathNode.Close.INSTANCE);
                return;
            case 'a':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList10 = arrayList;
                for (int i4 = 0; i4 <= i - 7; i4 += 7) {
                    arrayList10.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo(fArr[i4], fArr[i4 + 1], fArr[i4 + 2], java.lang.Float.compare(fArr[i4 + 3], 0.0f) != 0, java.lang.Float.compare(fArr[i4 + 4], 0.0f) != 0, fArr[i4 + 5], fArr[i4 + 6]));
                }
                return;
            case 'c':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList11 = arrayList;
                while (i2 <= i - 6) {
                    arrayList11.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                    i2 += 6;
                }
                return;
            case 'h':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList12 = arrayList;
                while (i2 <= i - 1) {
                    arrayList12.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo(fArr[i2]));
                    i2++;
                }
                return;
            case 'l':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList13 = arrayList;
                while (i2 <= i - 2) {
                    arrayList13.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'm':
                Camera2StreamConfigurationMap(arrayList, fArr, i);
                return;
            case 'q':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList14 = arrayList;
                while (i2 <= i - 4) {
                    arrayList14.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 's':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList15 = arrayList;
                while (i2 <= i - 4) {
                    arrayList15.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                return;
            case 't':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList16 = arrayList;
                while (i2 <= i - 2) {
                    arrayList16.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                return;
            case 'v':
                java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList17 = arrayList;
                while (i2 <= i - 1) {
                    arrayList17.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo(fArr[i2]));
                    i2++;
                }
                return;
            default:
                throw new java.lang.IllegalArgumentException("Unknown command for: ".concat(java.lang.String.valueOf(c)));
        }
    }

    private static final void getHighSpeedVideoSizes(java.util.List<androidx.compose.ui.graphics.vector.PathNode> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new androidx.compose.ui.graphics.vector.PathNode.MoveTo(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new androidx.compose.ui.graphics.vector.PathNode.LineTo(fArr[i3], fArr[i3 + 1]));
            }
        }
    }

    private static final void Camera2StreamConfigurationMap(java.util.List<androidx.compose.ui.graphics.vector.PathNode> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo(fArr[i3], fArr[i3 + 1]));
            }
        }
    }
}
