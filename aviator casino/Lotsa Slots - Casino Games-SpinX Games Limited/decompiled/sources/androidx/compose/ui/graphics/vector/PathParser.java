package androidx.compose.ui.graphics.vector;

/* compiled from: PathParser.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0082\bJ\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0011\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000fH\u0082\bJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011J\u0010\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "()V", "nodeData", "", "nodes", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "addNodes", "", "cmd", "", "args", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "", "addPathNodes", "", "clear", "parsePathString", "pathData", "", "resizeNodeData", "dataCount", "toNodes", "toPath", "Landroidx/compose/ui/graphics/Path;", "target", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PathParser {
    private final java.util.ArrayList<androidx.compose.ui.graphics.vector.PathNode> nodes = new java.util.ArrayList<>();
    private float[] nodeData = new float[64];

    public final void clear() {
        this.nodes.clear();
    }

    public final androidx.compose.ui.graphics.vector.PathParser parsePathString(java.lang.String pathData) {
        int i;
        char charAt;
        int i2;
        this.nodes.clear();
        int length = pathData.length();
        int i3 = 0;
        while (i3 < length && kotlin.jvm.internal.Intrinsics.compare((int) pathData.charAt(i3), 32) <= 0) {
            i3++;
        }
        while (length > i3 && kotlin.jvm.internal.Intrinsics.compare((int) pathData.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i4 = 0;
        while (i3 < length) {
            while (true) {
                i = i3 + 1;
                charAt = pathData.charAt(i3);
                int i5 = charAt | ' ';
                if ((i5 - 97) * (i5 - 122) <= 0 && i5 != 101) {
                    break;
                }
                if (i >= length) {
                    charAt = 0;
                    break;
                }
                i3 = i;
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i4 = 0;
                    while (true) {
                        if (i >= length || kotlin.jvm.internal.Intrinsics.compare((int) pathData.charAt(i), 32) > 0) {
                            long nextFloat = androidx.compose.ui.graphics.vector.FastFloatParserKt.nextFloat(pathData, i, length);
                            i2 = (int) (nextFloat >>> 32);
                            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (nextFloat & 4294967295L));
                            if (!java.lang.Float.isNaN(intBitsToFloat)) {
                                float[] fArr = this.nodeData;
                                int i6 = i4 + 1;
                                fArr[i4] = intBitsToFloat;
                                if (i6 >= fArr.length) {
                                    float[] fArr2 = new float[i6 * 2];
                                    this.nodeData = fArr2;
                                    kotlin.collections.ArraysKt.copyInto(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i4 = i6;
                            }
                            while (i2 < length && pathData.charAt(i2) == ',') {
                                i2++;
                            }
                            if (i2 >= length || java.lang.Float.isNaN(intBitsToFloat)) {
                                break;
                            }
                            i = i2;
                        } else {
                            i++;
                        }
                    }
                    i = i2;
                }
                androidx.compose.ui.graphics.vector.PathNodeKt.addPathNodes(charAt, this.nodes, this.nodeData, i4);
            }
            i3 = i;
        }
        return this;
    }

    private final void resizeNodeData(int dataCount) {
        float[] fArr = this.nodeData;
        if (dataCount >= fArr.length) {
            float[] fArr2 = new float[dataCount * 2];
            this.nodeData = fArr2;
            kotlin.collections.ArraysKt.copyInto(fArr, fArr2, 0, 0, fArr.length);
        }
    }

    public final androidx.compose.ui.graphics.vector.PathParser addPathNodes(java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> nodes) {
        this.nodes.addAll(nodes);
        return this;
    }

    public final java.util.List<androidx.compose.ui.graphics.vector.PathNode> toNodes() {
        return this.nodes;
    }

    public static /* synthetic */ androidx.compose.ui.graphics.Path toPath$default(androidx.compose.ui.graphics.vector.PathParser pathParser, androidx.compose.ui.graphics.Path path, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    public final androidx.compose.ui.graphics.Path toPath(androidx.compose.ui.graphics.Path target) {
        return androidx.compose.ui.graphics.vector.PathParserKt.toPath(this.nodes, target);
    }

    private final void addNodes(char cmd, float[] args, int count) {
        androidx.compose.ui.graphics.vector.PathNodeKt.addPathNodes(cmd, this.nodes, args, count);
    }
}
