package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "boxATopLeft", "boxABottomRight", "boxBTopLeft", "boxBBottomRight", "", "inARow-zwwh4xc", "(JJJJ)Z", "inARow"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionRegistrarImplKt {
    /* renamed from: inARow-zwwh4xc, reason: not valid java name */
    public static final boolean m2434inARowzwwh4xc(long j, long j2, long j3, long j4) {
        int i = (int) (j2 & 4294967295L);
        float intBitsToFloat = java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
        int i3 = (int) (j2 >> 32);
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat(i3);
        int i4 = (int) (j >> 32);
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat(i4);
        int i5 = (int) (j4 & 4294967295L);
        float intBitsToFloat5 = java.lang.Float.intBitsToFloat(i5);
        int i6 = (int) (j3 & 4294967295L);
        float intBitsToFloat6 = java.lang.Float.intBitsToFloat(i6);
        int i7 = (int) (j4 >> 32);
        float intBitsToFloat7 = java.lang.Float.intBitsToFloat(i7);
        int i8 = (int) (j3 >> 32);
        float intBitsToFloat8 = java.lang.Float.intBitsToFloat(i8);
        float max = java.lang.Math.max(0.0f, java.lang.Math.min(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i5)) - java.lang.Math.max(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i6)));
        float max2 = java.lang.Math.max(0.0f, java.lang.Math.min(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i7)) - java.lang.Math.max(java.lang.Float.intBitsToFloat(i4), java.lang.Float.intBitsToFloat(i8)));
        return ((max > ((intBitsToFloat - intBitsToFloat2) * 0.5f) ? 1 : (max == ((intBitsToFloat - intBitsToFloat2) * 0.5f) ? 0 : -1)) >= 0 || (max > ((intBitsToFloat5 - intBitsToFloat6) * 0.5f) ? 1 : (max == ((intBitsToFloat5 - intBitsToFloat6) * 0.5f) ? 0 : -1)) >= 0) && ((max2 > ((intBitsToFloat3 - intBitsToFloat4) * 0.5f) ? 1 : (max2 == ((intBitsToFloat3 - intBitsToFloat4) * 0.5f) ? 0 : -1)) < 0 && (max2 > ((intBitsToFloat7 - intBitsToFloat8) * 0.5f) ? 1 : (max2 == ((intBitsToFloat7 - intBitsToFloat8) * 0.5f) ? 0 : -1)) < 0);
    }
}
