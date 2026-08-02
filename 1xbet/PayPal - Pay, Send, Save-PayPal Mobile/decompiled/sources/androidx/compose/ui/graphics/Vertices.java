package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010\u0017\n\u0002\b\u0003\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\t\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/ui/graphics/Vertices;", "", "Landroidx/compose/ui/graphics/VertexMode;", "vertexMode", "", "Landroidx/compose/ui/geometry/Offset;", "positions", "textureCoordinates", "Landroidx/compose/ui/graphics/Color;", "colors", "", "indices", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/List;)[I", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;)[F", com.visa.cbp.getEncExpo.warmup, "getVertexMode-c2xauaI", "()I", "[F", "getPositions", "()[F", "getTextureCoordinates", "[I", "getColors", "()[I", "", "[S", "getIndices", "()[S"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Vertices {
    public static final int $stable = 8;
    private final int[] colors;
    private final short[] indices;
    private final float[] positions;
    private final float[] textureCoordinates;
    private final int vertexMode;

    private Vertices(int i, java.util.List<androidx.compose.ui.geometry.Offset> list, java.util.List<androidx.compose.ui.geometry.Offset> list2, java.util.List<androidx.compose.ui.graphics.Color> list3, java.util.List<java.lang.Integer> list4) {
        this.vertexMode = i;
        if (list2.size() != list.size()) {
            androidx.compose.ui.graphics.InlineClassHelperKt.throwIllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            androidx.compose.ui.graphics.InlineClassHelperKt.throwIllegalArgumentException("positions and colors lengths must match.");
        }
        int size = list4.size();
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = list4.get(i2).intValue();
            if (intValue < 0 || intValue >= list.size()) {
                androidx.compose.ui.graphics.InlineClassHelperKt.throwIllegalArgumentException("indices values must be valid indices in the positions list.");
                break;
            }
        }
        this.positions = getHighResolutionOutputSizeshNQ4ISI(list);
        this.textureCoordinates = getHighResolutionOutputSizeshNQ4ISI(list2);
        this.colors = getHighSpeedVideoFpsRangesFor(list3);
        int size2 = list4.size();
        short[] sArr = new short[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            sArr[i3] = (short) list4.get(i3).intValue();
        }
        this.indices = sArr;
    }

    /* renamed from: getVertexMode-c2xauaI, reason: not valid java name and from getter */
    public final int getVertexMode() {
        return this.vertexMode;
    }

    public final float[] getPositions() {
        return this.positions;
    }

    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    public final int[] getColors() {
        return this.colors;
    }

    public final short[] getIndices() {
        return this.indices;
    }

    private static int[] getHighSpeedVideoFpsRangesFor(java.util.List<androidx.compose.ui.graphics.Color> p0) {
        int size = p0.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(p0.get(i).m6006unboximpl());
        }
        return iArr;
    }

    private static float[] getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.compose.ui.geometry.Offset> p0) {
        float intBitsToFloat;
        int size = p0.size() * 2;
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            long m5762unboximpl = p0.get(i / 2).m5762unboximpl();
            if (i % 2 == 0) {
                intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m5762unboximpl >> 32));
            } else {
                intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m5762unboximpl & 4294967295L));
            }
            fArr[i] = intBitsToFloat;
        }
        return fArr;
    }

    public /* synthetic */ Vertices(int i, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, list3, list4);
    }
}
