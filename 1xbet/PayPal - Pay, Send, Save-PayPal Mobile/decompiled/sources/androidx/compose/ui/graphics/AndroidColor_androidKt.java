package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "toColorLong-8_81llA", "(J)J", "toColorLong", "Landroidx/compose/ui/graphics/Color$Companion;", "colorLong", "fromColorLong", "(Landroidx/compose/ui/graphics/Color$Companion;J)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidColor_androidKt {
    /* renamed from: toColorLong-8_81llA, reason: not valid java name */
    public static final long m5860toColorLong8_81llA(long j) {
        long j2 = 63 & j;
        return java.lang.Long.compareUnsigned(kotlin.ULong.m23494constructorimpl(j2), 16L) < 0 ? j : kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(j & kotlin.ULong.m23494constructorimpl(-64L)) | kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(j2) - 1));
    }

    public static final long fromColorLong(androidx.compose.ui.graphics.Color.Companion companion, long j) {
        long j2 = 63 & j;
        if (j2 >= 16) {
            j = (j & (-64)) | (j2 + 1);
        }
        return androidx.compose.ui.graphics.Color.m5992constructorimpl(kotlin.ULong.m23494constructorimpl(j));
    }
}
