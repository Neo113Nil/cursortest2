package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00008\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0013\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0012\u001a7\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0010\u001a\u0019\u0010\u0016\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u001b\u0010\u001b\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001e\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001c\u001a\u001b\u0010 \u001a\u00020\u001f*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0018H\u0007¢\u0006\u0004\b \u0010!\u001a'\u0010$\u001a\u00020\u000e*\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u0000H\u0007¢\u0006\u0004\b$\u0010%\u001a \u0010(\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b(\u0010)\u001a\u0018\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b+\u0010\u0012\u001a\u0018\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b-\u0010\u0012\u001a\u0018\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b/\u0010\u0012\u001a\u0018\u00100\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b0\u0010\u0012\u001a\u0018\u00101\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b1\u0010\u0012\"\u0014\u00103\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u00102\"\u0014\u00107\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00108\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u00102\"\u0014\u00109\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u00102\"\u0014\u0010:\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u00102\"\u0014\u0010;\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u00102\"\u0014\u0010<\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u00102\"\u0014\u0010=\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u00102\"\u0014\u0010>\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u00102\"\u0014\u0010?\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u00102\"\u0014\u0010A\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u00102\"\u0014\u0010B\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u0010C\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u00102\"\u0014\u0010D\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u00102\"\u001a\u0010F\u001a\u0002048\u0000X\u0081T¢\u0006\f\n\u0004\b\u0013\u00106\u0012\u0004\b@\u0010E¨\u0006G"}, d2 = {"", "widthVal", "heightVal", "Lcom/goldenboot/saga/zone/DpadBuilder;", "resetDelta", "(II)V", "size", "", "inflateAdapter", "(I)Ljava/lang/Void;", "minWidth", "maxWidth", "minHeight", "maxHeight", "Lcom/goldenboot/saga/zone/PagerPlanner;", "popBlueprint", "(IIII)J", "releaseHeader", "(I)I", "reduceScope", "evictLayout", "otherConstraints", "flushSample", "(JJ)J", "Lcom/goldenboot/saga/zone/ScaleSaver;", "clipOrigin", "width", "applyTask", "(JI)I", "height", "updateTimer", "", "serializeOffset", "(JJ)Z", "horizontal", "vertical", "connectPatch", "(JII)J", "max", "value", "injectMetric", "(II)I", "index", "peekRevision", "bits", "detachStream", "bitOffset", "notifyMessage", "purgeNode", "connectJob", "I", "Infinity", "", "growPayload", "J", "FocusMask", "MinFocusBits", "MaxAllowedForMinFocusBits", "MinFocusMask", "MinNonFocusBits", "MaxAllowedForMinNonFocusBits", "MinNonFocusMask", "MaxFocusBits", "MaxAllowedForMaxFocusBits", "drawField", "MaxFocusMask", "MaxNonFocusBits", "MaxAllowedForMaxNonFocusBits", "MaxNonFocusMask", "()V", "MaxDimensionsAndFocusMask", "ui-unit"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SubscriberCache {
    private static final int applyTask = 18;
    private static final int clipOrigin = 15;
    private static final int connectJob = 13;
    private static final int detachStream = 32766;
    private static final int drawField = 262143;
    private static final int evictLayout = Integer.MAX_VALUE;
    private static final int flushSample = 65534;
    private static final long growPayload = 3;
    private static final int injectMetric = 16;
    private static final int peekRevision = 262142;
    private static final int popBlueprint = 8190;
    public static final long reduceScope = -8589934589L;
    private static final int releaseHeader = 65535;
    private static final int serializeOffset = 8191;
    private static final int updateTimer = 32767;

    public static final int applyTask(long j, int i) {
        int attachConfig = PagerPlanner.attachConfig(j);
        int notifyMessage = PagerPlanner.notifyMessage(j);
        if (i < attachConfig) {
            i = attachConfig;
        }
        return i > notifyMessage ? notifyMessage : i;
    }

    public static /* synthetic */ long attachConfig(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return connectPatch(j, i, i2);
    }

    public static final long clipOrigin(long j, long j2) {
        int i = (int) (j2 >> 32);
        int attachConfig = PagerPlanner.attachConfig(j);
        int notifyMessage = PagerPlanner.notifyMessage(j);
        if (i < attachConfig) {
            i = attachConfig;
        }
        if (i <= notifyMessage) {
            notifyMessage = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int connectPatch = PagerPlanner.connectPatch(j);
        int reduceScope2 = PagerPlanner.reduceScope(j);
        if (i2 < connectPatch) {
            i2 = connectPatch;
        }
        if (i2 <= reduceScope2) {
            reduceScope2 = i2;
        }
        return ScaleSaver.releaseHeader((notifyMessage << 32) | (reduceScope2 & 4294967295L));
    }

    private static final int connectJob(int i) {
        return (1 << (18 - i)) - 1;
    }

    public static final long connectPatch(long j, int i, int i2) {
        int attachConfig = PagerPlanner.attachConfig(j) + i;
        if (attachConfig < 0) {
            attachConfig = 0;
        }
        int notifyMessage = PagerPlanner.notifyMessage(j);
        if (notifyMessage != Integer.MAX_VALUE && (notifyMessage = notifyMessage + i) < 0) {
            notifyMessage = 0;
        }
        int connectPatch = PagerPlanner.connectPatch(j) + i2;
        if (connectPatch < 0) {
            connectPatch = 0;
        }
        int reduceScope2 = PagerPlanner.reduceScope(j);
        return evictLayout(attachConfig, notifyMessage, connectPatch, (reduceScope2 == Integer.MAX_VALUE || (reduceScope2 = reduceScope2 + i2) >= 0) ? reduceScope2 : 0);
    }

    private static final int detachStream(int i) {
        return (i >> 1) + (i & 1);
    }

    public static final long evictLayout(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            NavBarInitializer.injectMetric("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return popBlueprint(i, i2, i3, i4);
    }

    public static final long flushSample(long j, long j2) {
        int attachConfig = PagerPlanner.attachConfig(j);
        int notifyMessage = PagerPlanner.notifyMessage(j);
        int connectPatch = PagerPlanner.connectPatch(j);
        int reduceScope2 = PagerPlanner.reduceScope(j);
        int attachConfig2 = PagerPlanner.attachConfig(j2);
        if (attachConfig2 < attachConfig) {
            attachConfig2 = attachConfig;
        }
        if (attachConfig2 > notifyMessage) {
            attachConfig2 = notifyMessage;
        }
        int notifyMessage2 = PagerPlanner.notifyMessage(j2);
        if (notifyMessage2 >= attachConfig) {
            attachConfig = notifyMessage2;
        }
        if (attachConfig <= notifyMessage) {
            notifyMessage = attachConfig;
        }
        int connectPatch2 = PagerPlanner.connectPatch(j2);
        if (connectPatch2 < connectPatch) {
            connectPatch2 = connectPatch;
        }
        if (connectPatch2 > reduceScope2) {
            connectPatch2 = reduceScope2;
        }
        int reduceScope3 = PagerPlanner.reduceScope(j2);
        if (reduceScope3 >= connectPatch) {
            connectPatch = reduceScope3;
        }
        if (connectPatch <= reduceScope2) {
            reduceScope2 = connectPatch;
        }
        return evictLayout(attachConfig2, notifyMessage, connectPatch2, reduceScope2);
    }

    public static /* synthetic */ long growPayload(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return evictLayout(i, i2, i3, i4);
    }

    public static final Void inflateAdapter(int i) {
        throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
    }

    private static final int injectMetric(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    private static final int notifyMessage(int i) {
        return i + 15;
    }

    private static final int peekRevision(int i) {
        return ((i & 1) << 1) + (((i & 2) >> 1) * 3);
    }

    public static final long popBlueprint(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int releaseHeader2 = releaseHeader(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int releaseHeader3 = releaseHeader(i6);
        if (releaseHeader2 + releaseHeader3 > 31) {
            resetDelta(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = releaseHeader3 - 13;
        return PagerPlanner.growPayload(((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (releaseHeader3 + 2)) | ((i8 & (~(i8 >> 31))) << (releaseHeader3 + 33)));
    }

    private static final int purgeNode(int i) {
        return (1 << (i + 13)) - 1;
    }

    private static final int reduceScope(int i) {
        if (i < serializeOffset) {
            return peekRevision;
        }
        if (i < 32767) {
            return flushSample;
        }
        if (i < releaseHeader) {
            return detachStream;
        }
        if (i < drawField) {
            return popBlueprint;
        }
        inflateAdapter(i);
        throw new ShadowBroadcaster();
    }

    public static final int releaseHeader(int i) {
        if (i < serializeOffset) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < releaseHeader) {
            return 16;
        }
        return i < drawField ? applyTask : LayoutMap.flushSample;
    }

    public static final void resetDelta(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    public static final boolean serializeOffset(long j, long j2) {
        int attachConfig = PagerPlanner.attachConfig(j);
        int notifyMessage = PagerPlanner.notifyMessage(j);
        int i = (int) (j2 >> 32);
        if (attachConfig > i || i > notifyMessage) {
            return false;
        }
        int i2 = (int) (j2 & 4294967295L);
        return PagerPlanner.connectPatch(j) <= i2 && i2 <= PagerPlanner.reduceScope(j);
    }

    public static final int updateTimer(long j, int i) {
        int connectPatch = PagerPlanner.connectPatch(j);
        int reduceScope2 = PagerPlanner.reduceScope(j);
        if (i < connectPatch) {
            i = connectPatch;
        }
        return i > reduceScope2 ? reduceScope2 : i;
    }

    public static /* synthetic */ void drawField() {
    }
}
