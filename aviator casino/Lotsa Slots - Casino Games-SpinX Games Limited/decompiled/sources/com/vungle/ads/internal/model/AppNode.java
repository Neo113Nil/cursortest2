package com.vungle.ads.internal.model;

/* compiled from: AppNode.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B9\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/AppNode;", "", "seen1", "", "bundle", "", "ver", com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppId$annotations", "()V", "getAppId", "()Ljava/lang/String;", "getBundle", "getVer", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes6.dex */
public final /* data */ class AppNode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.model.AppNode.Companion INSTANCE = new com.vungle.ads.internal.model.AppNode.Companion(null);
    private final java.lang.String appId;
    private final java.lang.String bundle;
    private final java.lang.String ver;

    public static /* synthetic */ com.vungle.ads.internal.model.AppNode copy$default(com.vungle.ads.internal.model.AppNode appNode, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = appNode.bundle;
        }
        if ((i & 2) != 0) {
            str2 = appNode.ver;
        }
        if ((i & 4) != 0) {
            str3 = appNode.appId;
        }
        return appNode.copy(str, str2, str3);
    }

    @kotlinx.serialization.SerialName("id")
    public static /* synthetic */ void getAppId$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBundle() {
        return this.bundle;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getVer() {
        return this.ver;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    public final com.vungle.ads.internal.model.AppNode copy(java.lang.String bundle, java.lang.String ver, java.lang.String appId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ver, "ver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        return new com.vungle.ads.internal.model.AppNode(bundle, ver, appId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.vungle.ads.internal.model.AppNode)) {
            return false;
        }
        com.vungle.ads.internal.model.AppNode appNode = (com.vungle.ads.internal.model.AppNode) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.bundle, appNode.bundle) && kotlin.jvm.internal.Intrinsics.areEqual(this.ver, appNode.ver) && kotlin.jvm.internal.Intrinsics.areEqual(this.appId, appNode.appId);
    }

    public int hashCode() {
        return (((this.bundle.hashCode() * 31) + this.ver.hashCode()) * 31) + this.appId.hashCode();
    }

    public java.lang.String toString() {
        return "AppNode(bundle=" + this.bundle + ", ver=" + this.ver + ", appId=" + this.appId + ')';
    }

    /* compiled from: AppNode.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AppNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AppNode;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.vungle.ads.internal.model.AppNode> serializer() {
            return com.vungle.ads.internal.model.AppNode$$serializer.INSTANCE;
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AppNode(int i, java.lang.String str, java.lang.String str2, @kotlinx.serialization.SerialName("id") java.lang.String str3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.vungle.ads.internal.model.AppNode$$serializer.INSTANCE.getDescriptor());
        }
        this.bundle = str;
        this.ver = str2;
        this.appId = str3;
    }

    public AppNode(java.lang.String bundle, java.lang.String ver, java.lang.String appId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ver, "ver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        this.bundle = bundle;
        this.ver = ver;
        this.appId = appId;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.vungle.ads.internal.model.AppNode self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.bundle);
        output.encodeStringElement(serialDesc, 1, self.ver);
        output.encodeStringElement(serialDesc, 2, self.appId);
    }

    public final java.lang.String getAppId() {
        return this.appId;
    }

    public final java.lang.String getBundle() {
        return this.bundle;
    }

    public final java.lang.String getVer() {
        return this.ver;
    }
}
