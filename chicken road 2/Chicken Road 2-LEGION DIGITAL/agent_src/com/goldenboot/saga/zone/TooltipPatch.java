package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a@\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0011\u001a \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001a\u0010\u0019\u001a(\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0080\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a \u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001d\u0010\u0015\u001a\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001e\u0010\u0011\u001a\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001f\u0010\u0011\u001a\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b \u0010\u0011\u001a\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\"\u0010\u0011\u001a\u0018\u0010#\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b#\u0010\u0011\u001a0\u0010(\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b(\u0010)\u001a\u0014\u0010*\u001a\u00020\u0003*\u00020\tH\u0080\b¢\u0006\u0004\b*\u0010+\u001aW\u00105\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0000H\u0000¢\u0006\u0004\b5\u00106\u001a?\u0010=\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0000H\u0000¢\u0006\u0004\b=\u0010>\"\u0014\u0010@\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010?\"\u0014\u0010A\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u0010?\"\u0014\u0010B\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010?\"\u0014\u0010C\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010?\"\u0014\u0010F\u001a\u00020D8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010E\"\u0014\u0010G\u001a\u00020D8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010E\"\u0014\u0010H\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010E\"\u0014\u0010I\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010E\"\u0014\u0010J\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010E\"\u0014\u0010K\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010?\"\u0014\u0010L\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010?\"\u0014\u0010M\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010?\"\u0014\u0010N\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010?¨\u0006O"}, d2 = {"", "x", "y", "", "popBlueprint", "(II)J", "itemId", "parentId", "lastChildOffset", "", "updated", "focusable", "gesturable", "applyTask", "(IIIZZZ)J", "meta", "attachConfig", "(J)I", "notifyMessage", "reduceScope", "flushSample", "(JI)J", "updateTimer", "(JZ)J", "detachStream", "(J)J", "releaseHeader", "injectMetric", "(JZZ)J", "clipOrigin", "peekRevision", "serializeOffset", "connectPatch", "xy", "resetDelta", "inflateAdapter", "srcLT", "srcRB", "destLT", "destRB", "drawField", "(JJJJ)Z", "connectJob", "(Z)J", "axis", "queryL", "queryT", "queryR", "queryB", "l", "t", "r", "b", "evictLayout", "(IIIIIIIII)I", "distanceMin", "distanceMax", "queryCrossAxisMax", "queryCrossAxisMin", "crossAxisMax", "crossAxisMin", "growPayload", "(IIIIII)I", "I", "LongsPerItem", "InitialSize", "Lower26Bits", "Lower9Bits", "Lcom/goldenboot/saga/zone/BoxSlot;", "J", "EverythingButParentId", "EverythingButLastChildOffset", "PackedIntsLowestBit", "PackedIntsHighestBit", "TombStone", "AxisNorth", "AxisSouth", "AxisWest", "AxisEast", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TooltipPatch {
    public static final long applyTask = 2305843009213693951L;
    public static final long clipOrigin = -2301339409586323457L;
    public static final int connectJob = 2;
    public static final int detachStream = 511;
    public static final int drawField = 1;
    public static final int evictLayout = 3;
    private static final long flushSample = 4294967297L;
    public static final int growPayload = 64;
    public static final int injectMetric = 67108863;
    public static final int peekRevision = 3;
    public static final int popBlueprint = 0;
    public static final long releaseHeader = -4503599560261633L;
    private static final long updateTimer = -9223372034707292160L;

    public static final long applyTask(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        return ((z2 ? 1L : 0L) << 62) | ((z3 ? 1L : 0L) << 63) | ((z ? 1L : 0L) << 61) | ((i3 & detachStream) << 52) | ((i2 & injectMetric) << 26) | (i & injectMetric);
    }

    public static final int attachConfig(long j) {
        return ((int) j) & injectMetric;
    }

    public static final long clipOrigin(long j, int i) {
        return (j & clipOrigin) | ((i & detachStream) << 52);
    }

    public static final long connectJob(boolean z) {
        return z ? 1L : 0L;
    }

    public static final int connectPatch(long j) {
        return ((int) (j >> 61)) & 1;
    }

    public static final long detachStream(long j) {
        return j | 2305843009213693952L;
    }

    public static final boolean drawField(long j, long j2, long j3, long j4) {
        return ((((j4 - j) - 4294967297L) | ((j2 - j3) - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final int evictLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i == 0) {
            return growPayload(i3, i9, i4, i2, i8, i6);
        }
        if (i == 1) {
            return growPayload(i7, i5, i4, i2, i8, i6);
        }
        if (i == 2) {
            return growPayload(i2, i8, i5, i3, i9, i7);
        }
        if (i != 3) {
            return Integer.MAX_VALUE;
        }
        return growPayload(i6, i4, i5, i3, i9, i7);
    }

    public static final long flushSample(long j, int i) {
        return (j & releaseHeader) | ((i & injectMetric) << 26);
    }

    public static final int growPayload(int i, int i2, int i3, int i4, int i5, int i6) {
        return ((i - i2) + 1) * ((((i3 - i4) + Math.max(i4, i6)) - Math.min(i3, i5)) + 1);
    }

    public static final int inflateAdapter(long j) {
        return (int) j;
    }

    public static final long injectMetric(long j, boolean z, boolean z2) {
        return (j & 4611686018427387903L) | ((z ? 1L : 0L) * 4611686018427387904L) | ((z2 ? 1L : 0L) * Long.MIN_VALUE);
    }

    public static final int notifyMessage(long j) {
        return ((int) (j >> 26)) & injectMetric;
    }

    public static final int peekRevision(long j) {
        return ((int) (j >> 62)) & 1;
    }

    public static final long popBlueprint(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final int reduceScope(long j) {
        return ((int) (j >> 52)) & detachStream;
    }

    public static final long releaseHeader(long j) {
        return j & (-2305843009213693953L);
    }

    public static final int resetDelta(long j) {
        return (int) (j >> 32);
    }

    public static final int serializeOffset(long j) {
        return ((int) (j >> 63)) & 1;
    }

    public static final long updateTimer(long j, boolean z) {
        return (j & (-2305843009213693953L)) | ((z ? 1L : 0L) << 61);
    }
}
