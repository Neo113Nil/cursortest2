package androidx.compose.ui.graphics.vector;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "<init>", "()V", "", "clear", "", "pathData", "parsePathString", "(Ljava/lang/String;)Landroidx/compose/ui/graphics/vector/PathParser;", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "nodes", "pathStringToNodes", "(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;", "", "addPathNodes", "(Ljava/util/List;)Landroidx/compose/ui/graphics/vector/PathParser;", "toNodes", "()Ljava/util/List;", "Landroidx/compose/ui/graphics/Path;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "toPath", "(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/ArrayList;", "getHighSpeedVideoSizes", "", "[F", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PathParser {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private float[] Camera2StreamConfigurationMap = new float[64];

    public final void clear() {
        java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList = this.getHighSpeedVideoSizes;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final androidx.compose.ui.graphics.vector.PathParser parsePathString(java.lang.String pathData) {
        java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList = this.getHighSpeedVideoSizes;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
            this.getHighSpeedVideoSizes = arrayList;
        } else {
            arrayList.clear();
        }
        pathStringToNodes(pathData, arrayList);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.ArrayList pathStringToNodes$default(androidx.compose.ui.graphics.vector.PathParser pathParser, java.lang.String str, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            arrayList = new java.util.ArrayList();
        }
        return pathParser.pathStringToNodes(str, arrayList);
    }

    public final java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> pathStringToNodes(java.lang.String pathData, java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> nodes) {
        int i;
        char charAt;
        long nextFloat;
        float intBitsToFloat;
        int length = pathData.length();
        int i2 = 0;
        while (i2 < length && kotlin.jvm.internal.Intrinsics.compare((int) pathData.charAt(i2), 32) <= 0) {
            i2++;
        }
        while (length > i2 && kotlin.jvm.internal.Intrinsics.compare((int) pathData.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i3 = 0;
        while (i2 < length) {
            while (true) {
                i = i2 + 1;
                charAt = pathData.charAt(i2);
                int i4 = charAt | ' ';
                if ((i4 - 97) * (i4 - 122) <= 0 && i4 != 101) {
                    break;
                }
                if (i >= length) {
                    charAt = 0;
                    break;
                }
                i2 = i;
            }
            if (charAt != 0) {
                int i5 = charAt | ' ';
                if (i5 != 122) {
                    while (i < length && kotlin.jvm.internal.Intrinsics.compare((int) pathData.charAt(i), 32) <= 0) {
                        i++;
                    }
                    boolean z = i5 == 97;
                    int i6 = 0;
                    do {
                        if (z && 3 <= i6 && i6 < 5) {
                            nextFloat = androidx.compose.ui.graphics.vector.FastFloatParserKt.nextFloat(pathData, i, java.lang.Math.min(i + 1, length));
                        } else {
                            nextFloat = androidx.compose.ui.graphics.vector.FastFloatParserKt.nextFloat(pathData, i, length);
                        }
                        i = (int) (nextFloat >>> 32);
                        intBitsToFloat = java.lang.Float.intBitsToFloat((int) (nextFloat & 4294967295L));
                        if (!java.lang.Float.isNaN(intBitsToFloat)) {
                            float[] fArr = this.Camera2StreamConfigurationMap;
                            int i7 = i6 + 1;
                            fArr[i6] = intBitsToFloat;
                            if (i7 >= fArr.length) {
                                float[] fArr2 = new float[i7 * 2];
                                this.Camera2StreamConfigurationMap = fArr2;
                                kotlin.collections.ArraysKt.copyInto(fArr, fArr2, 0, 0, fArr.length);
                            }
                            i6 = i7;
                        }
                        while (i < length && (kotlin.jvm.internal.Intrinsics.compare((int) pathData.charAt(i), 32) <= 0 || pathData.charAt(i) == ',')) {
                            i++;
                        }
                        if (i >= length) {
                            break;
                        }
                    } while (!java.lang.Float.isNaN(intBitsToFloat));
                    i3 = i6;
                }
                androidx.compose.ui.graphics.vector.PathNodeKt.addPathNodes(charAt, nodes, this.Camera2StreamConfigurationMap, i3);
            }
            i2 = i;
        }
        return nodes;
    }

    public final androidx.compose.ui.graphics.vector.PathParser addPathNodes(java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> nodes) {
        java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList = this.getHighSpeedVideoSizes;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
            this.getHighSpeedVideoSizes = arrayList;
        }
        arrayList.addAll(nodes);
        return this;
    }

    public final java.util.List<androidx.compose.ui.graphics.vector.PathNode> toNodes() {
        java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList = this.getHighSpeedVideoSizes;
        return arrayList != null ? arrayList : kotlin.collections.CollectionsKt.emptyList();
    }

    public static /* synthetic */ androidx.compose.ui.graphics.Path toPath$default(androidx.compose.ui.graphics.vector.PathParser pathParser, androidx.compose.ui.graphics.Path path, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    public final androidx.compose.ui.graphics.Path toPath(androidx.compose.ui.graphics.Path target) {
        androidx.compose.ui.graphics.Path path;
        java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> arrayList = this.getHighSpeedVideoSizes;
        return (arrayList == null || (path = androidx.compose.ui.graphics.vector.PathParserKt.toPath(arrayList, target)) == null) ? androidx.compose.ui.graphics.AndroidPath_androidKt.Path() : path;
    }
}
