package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0002\u001a\u001bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/goldenboot/saga/zone/DefaultRelay;", "", "Lcom/goldenboot/saga/zone/DefaultRelay$BounceHandler;", "linearity", "", "subpixelTextPositioning", "<init>", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "injectMetric", "(IZ)Lcom/goldenboot/saga/zone/DefaultRelay;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "evictLayout", "I", "releaseHeader", "growPayload", "Z", "clipOrigin", "()Z", "ActivityMutator", "BounceHandler", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultRelay {
    private static final DefaultRelay clipOrigin;
    public static final int detachStream = 0;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final DefaultRelay releaseHeader;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final int linearity;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final boolean subpixelTextPositioning;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/goldenboot/saga/zone/DefaultRelay$ActivityMutator;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/DefaultRelay;", "Static", "Lcom/goldenboot/saga/zone/DefaultRelay;", "growPayload", "()Lcom/goldenboot/saga/zone/DefaultRelay;", "Animated", "evictLayout", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.DefaultRelay$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DefaultRelay evictLayout() {
            return DefaultRelay.clipOrigin;
        }

        public final DefaultRelay growPayload() {
            return DefaultRelay.releaseHeader;
        }

        private Companion() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        BounceHandler.Companion companion = BounceHandler.INSTANCE;
        releaseHeader = new DefaultRelay(companion.evictLayout(), false, defaultConstructorMarker);
        clipOrigin = new DefaultRelay(companion.growPayload(), true, defaultConstructorMarker);
    }

    public /* synthetic */ DefaultRelay(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    public static /* synthetic */ DefaultRelay detachStream(DefaultRelay defaultRelay, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = defaultRelay.linearity;
        }
        if ((i2 & 2) != 0) {
            z = defaultRelay.subpixelTextPositioning;
        }
        return defaultRelay.injectMetric(i, z);
    }

    /* renamed from: clipOrigin, reason: from getter */
    public final boolean getSubpixelTextPositioning() {
        return this.subpixelTextPositioning;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultRelay)) {
            return false;
        }
        DefaultRelay defaultRelay = (DefaultRelay) other;
        return BounceHandler.flushSample(this.linearity, defaultRelay.linearity) && this.subpixelTextPositioning == defaultRelay.subpixelTextPositioning;
    }

    public int hashCode() {
        return (BounceHandler.updateTimer(this.linearity) * 31) + Boolean.hashCode(this.subpixelTextPositioning);
    }

    public final DefaultRelay injectMetric(int linearity, boolean subpixelTextPositioning) {
        return new DefaultRelay(linearity, subpixelTextPositioning, null);
    }

    /* renamed from: releaseHeader, reason: from getter */
    public final int getLinearity() {
        return this.linearity;
    }

    public String toString() {
        return Intrinsics.areEqual(this, releaseHeader) ? "TextMotion.Static" : Intrinsics.areEqual(this, clipOrigin) ? "TextMotion.Animated" : "Invalid";
    }

    private DefaultRelay(int i, boolean z) {
        this.linearity = i;
        this.subpixelTextPositioning = z;
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcom/goldenboot/saga/zone/DefaultRelay$BounceHandler;", "", "", "value", "releaseHeader", "(I)I", "", "applyTask", "(I)Ljava/lang/String;", "updateTimer", "other", "", "clipOrigin", "(ILjava/lang/Object;)Z", "evictLayout", "I", "growPayload", "ActivityMutator", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BounceHandler {

        /* renamed from: evictLayout, reason: from kotlin metadata */
        private final int value;

        /* renamed from: growPayload, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int injectMetric = releaseHeader(1);
        private static final int detachStream = releaseHeader(2);
        private static final int releaseHeader = releaseHeader(3);

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/goldenboot/saga/zone/DefaultRelay$BounceHandler$ActivityMutator;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/DefaultRelay$BounceHandler;", "Linear", "I", "growPayload", "()I", "FontHinting", "evictLayout", "None", "injectMetric", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.goldenboot.saga.zone.DefaultRelay$BounceHandler$ActivityMutator, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int evictLayout() {
                return BounceHandler.detachStream;
            }

            public final int growPayload() {
                return BounceHandler.injectMetric;
            }

            public final int injectMetric() {
                return BounceHandler.releaseHeader;
            }

            private Companion() {
            }
        }

        private /* synthetic */ BounceHandler(int i) {
            this.value = i;
        }

        public static String applyTask(int i) {
            return flushSample(i, injectMetric) ? "Linearity.Linear" : flushSample(i, detachStream) ? "Linearity.FontHinting" : flushSample(i, releaseHeader) ? "Linearity.None" : "Invalid";
        }

        public static boolean clipOrigin(int i, Object obj) {
            return (obj instanceof BounceHandler) && i == ((BounceHandler) obj).getValue();
        }

        public static final /* synthetic */ BounceHandler detachStream(int i) {
            return new BounceHandler(i);
        }

        public static final boolean flushSample(int i, int i2) {
            return i == i2;
        }

        public static int updateTimer(int i) {
            return Integer.hashCode(i);
        }

        public boolean equals(Object obj) {
            return clipOrigin(this.value, obj);
        }

        public int hashCode() {
            return updateTimer(this.value);
        }

        /* renamed from: popBlueprint, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public String toString() {
            return applyTask(this.value);
        }

        private static int releaseHeader(int i) {
            return i;
        }
    }
}
