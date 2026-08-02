package androidx.compose.ui.spatial;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\bN\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001aH\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0080\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0012\u001a \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a(\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a \u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001c\u0010\u0016\u001a\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001d\u0010\u0012\u001a\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001e\u0010\u0012\u001a\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001f\u0010\u0012\u001a\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b \u0010\u0012\u001a\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b!\u0010\u0018\u001a(\u0010\"\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0080\b¢\u0006\u0004\b\"\u0010\u001b\u001a\u0018\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b$\u0010\u0012\u001a\u0018\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b%\u0010\u0012\u001a0\u0010*\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b*\u0010+\u001a\u0014\u0010,\u001a\u00020\u0003*\u00020\tH\u0080\b¢\u0006\u0004\b,\u0010-\u001aW\u00107\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0000H\u0000¢\u0006\u0004\b7\u00108\u001a?\u0010?\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0000H\u0000¢\u0006\u0004\b?\u0010@\"\u0014\u0010A\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u0010B\"\u0014\u0010C\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010B\"\u0014\u0010D\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u0010B\"\u0014\u0010E\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010B\"\u0014\u0010F\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010B\"\u0014\u0010G\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010B\"\u0014\u0010H\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010B\"\u0014\u0010I\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010B\"\u0014\u0010J\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\bJ\u0010B\"\u0014\u0010K\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\bK\u0010B\"\u001a\u0010L\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u001a\u0010P\u001a\u00020\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\bP\u0010M\u001a\u0004\bQ\u0010O\"\u001a\u0010R\u001a\u00020\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\bR\u0010M\u001a\u0004\bS\u0010O\"\u0014\u0010T\u001a\u00020\u00008\u0000X\u0081T¢\u0006\u0006\n\u0004\bT\u0010B\"\u0014\u0010U\u001a\u00020\u00008\u0000X\u0081T¢\u0006\u0006\n\u0004\bU\u0010B\"\u0014\u0010V\u001a\u00020\u00008\u0000X\u0081T¢\u0006\u0006\n\u0004\bV\u0010B\"\u0014\u0010W\u001a\u00020\u00008\u0000X\u0081T¢\u0006\u0006\n\u0004\bW\u0010B"}, d2 = {"", "x", "y", "", "packXY", "(II)J", "itemId", "parentId", "lastChildOffset", "", "updated", "focusable", "gesturable", "hasCallbacks", "packMeta", "(IIIZZZZ)J", com.adjust.sdk.Constants.REFERRER_API_META, "unpackMetaValue", "(J)I", "unpackMetaParentId", "unpackMetaLastChildOffset", "metaWithParentId", "(JI)J", "metaMarkUpdated", "(J)J", "metaUnMarkUpdated", "metaMarkFlags", "(JZZ)J", "metaWithLastChildOffset", "unpackMetaFocusable", "unpackMetaGesturable", "unpackMetaUpdated", "unpackMetaHasCallbacks", "metaMarkUpdatedIfHasCallbacks", "metaMarkUpdatedAndHasCallbacks", "xy", "unpackX", "unpackY", "srcLT", "srcRB", "destLT", "destRB", "rectIntersectsRect", "(JJJJ)Z", "toLong", "(Z)J", "axis", "queryL", "queryT", "queryR", "queryB", "l", "t", "r", util.h.xy.cb.b.f1091, "distanceScore", "(IIIIIIIII)I", "distanceMin", "distanceMax", "queryCrossAxisMax", "queryCrossAxisMin", "crossAxisMax", "crossAxisMin", "distanceScoreAlongAxis", "(IIIIII)I", "LongsPerItem", com.visa.cbp.getEncExpo.warmup, "InitialSize", "Lower10Bits", "MaxSupportedLastChildOffset", "BitOffsetForParentId", "BitOffsetForLastChildOffset", "BitOffsetForUpdated", "BitOffsetForFocusable", "BitOffsetForGesturable", "BitOffsetForHasCallbacks", "EverythingButLastChildOffset", "J", "getEverythingButLastChildOffset", "()J", "EverythingButParentId", "getEverythingButParentId", "TombStone", "getTombStone", "AxisNorth", "AxisSouth", "AxisWest", "AxisEast"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RectListKt {
    public static final int AxisEast = 3;
    public static final int AxisNorth = 0;
    public static final int AxisSouth = 1;
    public static final int AxisWest = 2;
    public static final int BitOffsetForFocusable = 61;
    public static final int BitOffsetForGesturable = 62;
    public static final int BitOffsetForHasCallbacks = 63;
    public static final int BitOffsetForLastChildOffset = 50;
    public static final int BitOffsetForParentId = 25;
    public static final int BitOffsetForUpdated = 60;
    public static final int InitialSize = 64;
    public static final int LongsPerItem = 3;
    public static final int Lower10Bits = 1023;
    public static final int MaxSupportedLastChildOffset = 1023;
    private static final long EverythingButLastChildOffset = kotlin.ULong.m23494constructorimpl(~kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(1023) << 50));
    private static final long EverythingButParentId = kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(33554431) << 25) ^ (-1));
    private static final long TombStone = (java.lang.Math.min(0, 1023) << 50) | 1125899906842623L;

    public static final long metaMarkFlags(long j, boolean z, boolean z2) {
        return (j & (-6917529027641081857L)) | ((z ? 1L : 0L) * kotlinx.coroutines.internal.LockFreeTaskQueueCore.CLOSED_MASK) | ((z2 ? 1L : 0L) * 4611686018427387904L);
    }

    public static final long metaMarkUpdated(long j) {
        return j | kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK;
    }

    public static final long metaMarkUpdatedAndHasCallbacks(long j, boolean z, boolean z2) {
        return (j & 8070450532247928831L) | ((z ? 1L : 0L) * kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK) | ((z2 ? 1L : 0L) * Long.MIN_VALUE);
    }

    public static final long metaMarkUpdatedIfHasCallbacks(long j) {
        return j | (((j >> 63) & 1) << 60);
    }

    public static final long metaUnMarkUpdated(long j) {
        return j & (-1152921504606846977L);
    }

    public static final long packXY(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final boolean rectIntersectsRect(long j, long j2, long j3, long j4) {
        return ((((j4 - j) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) | ((j2 - j3) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0;
    }

    public static final long toLong(boolean z) {
        return z ? 1L : 0L;
    }

    public static final int unpackMetaFocusable(long j) {
        return ((int) (j >> 61)) & 1;
    }

    public static final int unpackMetaGesturable(long j) {
        return ((int) (j >> 62)) & 1;
    }

    public static final int unpackMetaHasCallbacks(long j) {
        return ((int) (j >> 63)) & 1;
    }

    public static final int unpackMetaLastChildOffset(long j) {
        return ((int) (j >> 50)) & 1023;
    }

    public static final int unpackMetaParentId(long j) {
        return ((int) (j >> 25)) & 33554431;
    }

    public static final int unpackMetaUpdated(long j) {
        return ((int) (j >> 60)) & 1;
    }

    public static final int unpackMetaValue(long j) {
        return ((int) j) & 33554431;
    }

    public static final int unpackX(long j) {
        return (int) (j >> 32);
    }

    public static final int unpackY(long j) {
        return (int) j;
    }

    public static final long getEverythingButLastChildOffset() {
        return EverythingButLastChildOffset;
    }

    public static final long getEverythingButParentId() {
        return EverythingButParentId;
    }

    public static final long getTombStone() {
        return TombStone;
    }

    public static final long packMeta(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        long j = z4 ? 1L : 0L;
        return ((z ? 1L : 0L) << 60) | ((z3 ? 1L : 0L) << 62) | (j << 63) | ((z2 ? 1L : 0L) << 61) | (java.lang.Math.min(i3, 1023) << 50) | ((i2 & 33554431) << 25) | (i & 33554431);
    }

    public static final long metaWithParentId(long j, int i) {
        return (j & getEverythingButParentId()) | ((i & 33554431) << 25);
    }

    public static final long metaWithLastChildOffset(long j, int i) {
        return (j & getEverythingButLastChildOffset()) | (java.lang.Math.min(i, 1023) << 50);
    }

    public static final int distanceScore(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i == 0) {
            return distanceScoreAlongAxis(i3, i9, i4, i2, i8, i6);
        }
        if (i == 1) {
            return distanceScoreAlongAxis(i7, i5, i4, i2, i8, i6);
        }
        if (i == 2) {
            return distanceScoreAlongAxis(i2, i8, i5, i3, i9, i7);
        }
        if (i != 3) {
            return Integer.MAX_VALUE;
        }
        return distanceScoreAlongAxis(i6, i4, i5, i3, i9, i7);
    }

    public static final int distanceScoreAlongAxis(int i, int i2, int i3, int i4, int i5, int i6) {
        return ((i - i2) + 1) * ((((i3 - i4) + java.lang.Math.max(i4, i6)) - java.lang.Math.min(i3, i5)) + 1);
    }
}
