package com.vungle.ads.fpd;

/* compiled from: Location.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0007J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0007J!\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015HÇ\u0001¨\u0006\u0018"}, d2 = {"Lcom/vungle/ads/fpd/Location;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "setCountry", "country", "", "setDma", "dma", "setRegionState", "regionState", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes6.dex */
public final class Location {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.fpd.Location.Companion INSTANCE = new com.vungle.ads.fpd.Location.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.vungle.ads.fpd.Location self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
    }

    @kotlin.Deprecated(message = "Will be deprecated", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public final com.vungle.ads.fpd.Location setCountry(java.lang.String country) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "country");
        return this;
    }

    @kotlin.Deprecated(message = "Will be deprecated", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public final com.vungle.ads.fpd.Location setDma(int dma) {
        return this;
    }

    @kotlin.Deprecated(message = "Will be deprecated", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public final com.vungle.ads.fpd.Location setRegionState(java.lang.String regionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regionState, "regionState");
        return this;
    }

    /* compiled from: Location.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/fpd/Location$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/Location;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.vungle.ads.fpd.Location> serializer() {
            return com.vungle.ads.fpd.Location$$serializer.INSTANCE;
        }
    }

    public Location() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Location(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }
}
