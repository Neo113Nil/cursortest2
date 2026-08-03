package com.vungle.ads.internal.signals;

/* compiled from: SignaledAd.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002GHBO\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB\u001b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0002\u0010\u0010J\u0006\u00104\u001a\u000205J\u0010\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00107\u001a\u00020\u0007HÆ\u0003J$\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u001f\u0010=\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010>J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001J!\u0010A\u001a\u0002052\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FHÇ\u0001R$\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010 \u0012\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015R$\u0010#\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R$\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b,\u0010\u0013\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR$\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b/\u0010\u0013\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u0013\u001a\u0004\b3\u0010\u0015¨\u0006I"}, d2 = {"Lcom/vungle/ads/internal/signals/SignaledAd;", "", "seen1", "", "templateSignals", "", "timeSinceLastAdLoad", "", "eventId", "timeBetweenAdAvailabilityAndPlayAd", com.helpshift.util.ConfigValues.SCREEN_ORIENTATION, "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLjava/lang/String;JILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "lastAdLoadTime", "loadAdTime", "(Ljava/lang/Long;J)V", "adAvailabilityCallbackTime", "getAdAvailabilityCallbackTime$annotations", "()V", "getAdAvailabilityCallbackTime", "()J", "setAdAvailabilityCallbackTime", "(J)V", "getEventId$annotations", "getEventId", "()Ljava/lang/String;", "setEventId", "(Ljava/lang/String;)V", "getLastAdLoadTime$annotations", "getLastAdLoadTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLoadAdTime$annotations", "getLoadAdTime", "playAdTime", "getPlayAdTime$annotations", "getPlayAdTime", "setPlayAdTime", "getScreenOrientation$annotations", "getScreenOrientation", "()I", "setScreenOrientation", "(I)V", "getTemplateSignals$annotations", "getTemplateSignals", "setTemplateSignals", "getTimeBetweenAdAvailabilityAndPlayAd$annotations", "getTimeBetweenAdAvailabilityAndPlayAd", "setTimeBetweenAdAvailabilityAndPlayAd", "getTimeSinceLastAdLoad$annotations", "getTimeSinceLastAdLoad", "calculateTimeBetweenAdAvailabilityAndPlayAd", "", "component1", "component2", "copy", "(Ljava/lang/Long;J)Lcom/vungle/ads/internal/signals/SignaledAd;", "equals", "", "other", "getTimeDifference", "(Ljava/lang/Long;J)J", "hashCode", "toString", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes6.dex */
public final /* data */ class SignaledAd {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.signals.SignaledAd.Companion INSTANCE = new com.vungle.ads.internal.signals.SignaledAd.Companion(null);
    private long adAvailabilityCallbackTime;
    private java.lang.String eventId;
    private final java.lang.Long lastAdLoadTime;
    private final long loadAdTime;
    private long playAdTime;
    private int screenOrientation;
    private java.lang.String templateSignals;
    private long timeBetweenAdAvailabilityAndPlayAd;
    private final long timeSinceLastAdLoad;

    public SignaledAd() {
        this(null, 0L, 3, null);
    }

    public static /* synthetic */ com.vungle.ads.internal.signals.SignaledAd copy$default(com.vungle.ads.internal.signals.SignaledAd signaledAd, java.lang.Long l, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = signaledAd.lastAdLoadTime;
        }
        if ((i & 2) != 0) {
            j = signaledAd.loadAdTime;
        }
        return signaledAd.copy(l, j);
    }

    @kotlinx.serialization.Transient
    public static /* synthetic */ void getAdAvailabilityCallbackTime$annotations() {
    }

    @kotlinx.serialization.SerialName("107")
    public static /* synthetic */ void getEventId$annotations() {
    }

    @kotlinx.serialization.Transient
    public static /* synthetic */ void getLastAdLoadTime$annotations() {
    }

    @kotlinx.serialization.Transient
    public static /* synthetic */ void getLoadAdTime$annotations() {
    }

    @kotlinx.serialization.Transient
    public static /* synthetic */ void getPlayAdTime$annotations() {
    }

    @kotlinx.serialization.SerialName("108")
    public static /* synthetic */ void getScreenOrientation$annotations() {
    }

    @kotlinx.serialization.SerialName("500")
    public static /* synthetic */ void getTemplateSignals$annotations() {
    }

    @kotlinx.serialization.SerialName("110")
    public static /* synthetic */ void getTimeBetweenAdAvailabilityAndPlayAd$annotations() {
    }

    @kotlinx.serialization.SerialName("109")
    public static /* synthetic */ void getTimeSinceLastAdLoad$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getLastAdLoadTime() {
        return this.lastAdLoadTime;
    }

    /* renamed from: component2, reason: from getter */
    public final long getLoadAdTime() {
        return this.loadAdTime;
    }

    public final com.vungle.ads.internal.signals.SignaledAd copy(java.lang.Long lastAdLoadTime, long loadAdTime) {
        return new com.vungle.ads.internal.signals.SignaledAd(lastAdLoadTime, loadAdTime);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.vungle.ads.internal.signals.SignaledAd)) {
            return false;
        }
        com.vungle.ads.internal.signals.SignaledAd signaledAd = (com.vungle.ads.internal.signals.SignaledAd) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.lastAdLoadTime, signaledAd.lastAdLoadTime) && this.loadAdTime == signaledAd.loadAdTime;
    }

    public int hashCode() {
        java.lang.Long l = this.lastAdLoadTime;
        return ((l == null ? 0 : l.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.loadAdTime);
    }

    public java.lang.String toString() {
        return "SignaledAd(lastAdLoadTime=" + this.lastAdLoadTime + ", loadAdTime=" + this.loadAdTime + ')';
    }

    /* compiled from: SignaledAd.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/signals/SignaledAd$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/signals/SignaledAd;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.vungle.ads.internal.signals.SignaledAd> serializer() {
            return com.vungle.ads.internal.signals.SignaledAd$$serializer.INSTANCE;
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SignaledAd(int i, @kotlinx.serialization.SerialName("500") java.lang.String str, @kotlinx.serialization.SerialName("109") long j, @kotlinx.serialization.SerialName("107") java.lang.String str2, @kotlinx.serialization.SerialName("110") long j2, @kotlinx.serialization.SerialName("108") int i2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 2, com.vungle.ads.internal.signals.SignaledAd$$serializer.INSTANCE.getDescriptor());
        }
        this.lastAdLoadTime = 0L;
        this.loadAdTime = 0L;
        if ((i & 1) == 0) {
            this.templateSignals = null;
        } else {
            this.templateSignals = str;
        }
        this.timeSinceLastAdLoad = j;
        if ((i & 4) == 0) {
            this.eventId = null;
        } else {
            this.eventId = str2;
        }
        if ((i & 8) == 0) {
            this.timeBetweenAdAvailabilityAndPlayAd = 0L;
        } else {
            this.timeBetweenAdAvailabilityAndPlayAd = j2;
        }
        if ((i & 16) == 0) {
            this.screenOrientation = 0;
        } else {
            this.screenOrientation = i2;
        }
        this.adAvailabilityCallbackTime = 0L;
        this.playAdTime = 0L;
        this.timeSinceLastAdLoad = getTimeDifference(0L, 0L);
    }

    public SignaledAd(java.lang.Long l, long j) {
        this.lastAdLoadTime = l;
        this.loadAdTime = j;
        this.timeSinceLastAdLoad = getTimeDifference(l, j);
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.vungle.ads.internal.signals.SignaledAd self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.templateSignals != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.templateSignals);
        }
        output.encodeLongElement(serialDesc, 1, self.timeSinceLastAdLoad);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.eventId != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.eventId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.timeBetweenAdAvailabilityAndPlayAd != 0) {
            output.encodeLongElement(serialDesc, 3, self.timeBetweenAdAvailabilityAndPlayAd);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.screenOrientation == 0) {
            return;
        }
        output.encodeIntElement(serialDesc, 4, self.screenOrientation);
    }

    public /* synthetic */ SignaledAd(java.lang.Long l, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? 0L : j);
    }

    public final java.lang.Long getLastAdLoadTime() {
        return this.lastAdLoadTime;
    }

    public final long getLoadAdTime() {
        return this.loadAdTime;
    }

    public final java.lang.String getTemplateSignals() {
        return this.templateSignals;
    }

    public final void setTemplateSignals(java.lang.String str) {
        this.templateSignals = str;
    }

    public final long getTimeSinceLastAdLoad() {
        return this.timeSinceLastAdLoad;
    }

    public final java.lang.String getEventId() {
        return this.eventId;
    }

    public final void setEventId(java.lang.String str) {
        this.eventId = str;
    }

    public final long getTimeBetweenAdAvailabilityAndPlayAd() {
        return this.timeBetweenAdAvailabilityAndPlayAd;
    }

    public final void setTimeBetweenAdAvailabilityAndPlayAd(long j) {
        this.timeBetweenAdAvailabilityAndPlayAd = j;
    }

    public final int getScreenOrientation() {
        return this.screenOrientation;
    }

    public final void setScreenOrientation(int i) {
        this.screenOrientation = i;
    }

    public final long getAdAvailabilityCallbackTime() {
        return this.adAvailabilityCallbackTime;
    }

    public final void setAdAvailabilityCallbackTime(long j) {
        this.adAvailabilityCallbackTime = j;
    }

    public final long getPlayAdTime() {
        return this.playAdTime;
    }

    public final void setPlayAdTime(long j) {
        this.playAdTime = j;
    }

    public final void calculateTimeBetweenAdAvailabilityAndPlayAd() {
        this.timeBetweenAdAvailabilityAndPlayAd = getTimeDifference(java.lang.Long.valueOf(this.adAvailabilityCallbackTime), this.playAdTime);
    }

    private final long getTimeDifference(java.lang.Long lastAdLoadTime, long loadAdTime) {
        if (lastAdLoadTime == null) {
            return -1L;
        }
        long longValue = loadAdTime - lastAdLoadTime.longValue();
        if (longValue < 0) {
            return -1L;
        }
        return longValue;
    }
}
