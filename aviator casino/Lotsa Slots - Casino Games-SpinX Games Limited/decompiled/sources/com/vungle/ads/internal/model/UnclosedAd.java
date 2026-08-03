package com.vungle.ads.internal.model;

/* compiled from: UnclosedAd.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/UnclosedAd;", "", "seen1", "", "eventId", "", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getEventId$annotations", "()V", "getEventId", "()Ljava/lang/String;", "getSessionId$annotations", "getSessionId", "setSessionId", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes6.dex */
public final /* data */ class UnclosedAd {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.model.UnclosedAd.Companion INSTANCE = new com.vungle.ads.internal.model.UnclosedAd.Companion(null);
    private final java.lang.String eventId;
    private java.lang.String sessionId;

    public static /* synthetic */ com.vungle.ads.internal.model.UnclosedAd copy$default(com.vungle.ads.internal.model.UnclosedAd unclosedAd, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = unclosedAd.eventId;
        }
        if ((i & 2) != 0) {
            str2 = unclosedAd.sessionId;
        }
        return unclosedAd.copy(str, str2);
    }

    @kotlinx.serialization.SerialName("107")
    public static /* synthetic */ void getEventId$annotations() {
    }

    @kotlinx.serialization.SerialName("101")
    public static /* synthetic */ void getSessionId$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final com.vungle.ads.internal.model.UnclosedAd copy(java.lang.String eventId, java.lang.String sessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventId, "eventId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new com.vungle.ads.internal.model.UnclosedAd(eventId, sessionId);
    }

    public java.lang.String toString() {
        return "UnclosedAd(eventId=" + this.eventId + ", sessionId=" + this.sessionId + ')';
    }

    /* compiled from: UnclosedAd.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/UnclosedAd$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/UnclosedAd;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.vungle.ads.internal.model.UnclosedAd> serializer() {
            return com.vungle.ads.internal.model.UnclosedAd$$serializer.INSTANCE;
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ UnclosedAd(int i, @kotlinx.serialization.SerialName("107") java.lang.String str, @kotlinx.serialization.SerialName("101") java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.vungle.ads.internal.model.UnclosedAd$$serializer.INSTANCE.getDescriptor());
        }
        this.eventId = str;
        if ((i & 2) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str2;
        }
    }

    public UnclosedAd(java.lang.String eventId, java.lang.String sessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventId, "eventId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.eventId = eventId;
        this.sessionId = sessionId;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.vungle.ads.internal.model.UnclosedAd self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.eventId);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && kotlin.jvm.internal.Intrinsics.areEqual(self.sessionId, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 1, self.sessionId);
    }

    public final java.lang.String getEventId() {
        return this.eventId;
    }

    public /* synthetic */ UnclosedAd(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionId = str;
    }

    public boolean equals(java.lang.Object other) {
        if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other.getClass())) {
            return false;
        }
        com.vungle.ads.internal.model.UnclosedAd unclosedAd = (com.vungle.ads.internal.model.UnclosedAd) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.eventId, unclosedAd.eventId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, unclosedAd.sessionId);
    }

    public int hashCode() {
        return (this.eventId.hashCode() * 31) + this.sessionId.hashCode();
    }
}
