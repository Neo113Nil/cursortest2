package com.chartboost.sdk.internal.Model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002'(B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006)"}, d2 = {"Lcom/chartboost/sdk/internal/Model/EndpointConfig;", "", "", "banner", "interstitial", "rewarded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ChartboostMonetization_9_13_0_release", "(Lcom/chartboost/sdk/internal/Model/EndpointConfig;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/chartboost/sdk/internal/Model/EndpointConfig;", InAppPurchaseConstants.METHOD_TO_STRING, "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBanner", "getInterstitial", "getRewarded", k.M, "a", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class EndpointConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String banner;
    private final String interstitial;
    private final String rewarded;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EndpointConfig a() {
            return new EndpointConfig("https://tracking.da.chartboost.com/unified/v1/sdk/banner", "https://tracking.da.chartboost.com/unified/v1/sdk/interstitial", "https://tracking.da.chartboost.com/unified/v1/sdk/rewarded");
        }

        public final KSerializer<EndpointConfig> serializer() {
            return a.f5105a;
        }

        public Companion() {
        }
    }

    public EndpointConfig() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ EndpointConfig copy$default(EndpointConfig endpointConfig, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = endpointConfig.banner;
        }
        if ((i & 2) != 0) {
            str2 = endpointConfig.interstitial;
        }
        if ((i & 4) != 0) {
            str3 = endpointConfig.rewarded;
        }
        return endpointConfig.copy(str, str2, str3);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$ChartboostMonetization_9_13_0_release(EndpointConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.banner, "")) {
            output.encodeStringElement(serialDesc, 0, self.banner);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.interstitial, "")) {
            output.encodeStringElement(serialDesc, 1, self.interstitial);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && Intrinsics.areEqual(self.rewarded, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 2, self.rewarded);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBanner() {
        return this.banner;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInterstitial() {
        return this.interstitial;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRewarded() {
        return this.rewarded;
    }

    public final EndpointConfig copy(String banner, String interstitial, String rewarded) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        return new EndpointConfig(banner, interstitial, rewarded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndpointConfig)) {
            return false;
        }
        EndpointConfig endpointConfig = (EndpointConfig) other;
        return Intrinsics.areEqual(this.banner, endpointConfig.banner) && Intrinsics.areEqual(this.interstitial, endpointConfig.interstitial) && Intrinsics.areEqual(this.rewarded, endpointConfig.rewarded);
    }

    public final String getBanner() {
        return this.banner;
    }

    public final String getInterstitial() {
        return this.interstitial;
    }

    public final String getRewarded() {
        return this.rewarded;
    }

    public int hashCode() {
        return (((this.banner.hashCode() * 31) + this.interstitial.hashCode()) * 31) + this.rewarded.hashCode();
    }

    public String toString() {
        return "EndpointConfig(banner=" + this.banner + ", interstitial=" + this.interstitial + ", rewarded=" + this.rewarded + ")";
    }

    public /* synthetic */ EndpointConfig(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.banner = "";
        } else {
            this.banner = str;
        }
        if ((i & 2) == 0) {
            this.interstitial = "";
        } else {
            this.interstitial = str2;
        }
        if ((i & 4) == 0) {
            this.rewarded = "";
        } else {
            this.rewarded = str3;
        }
    }

    public EndpointConfig(String banner, String interstitial, String rewarded) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        this.banner = banner;
        this.interstitial = interstitial;
        this.rewarded = rewarded;
    }

    public /* synthetic */ EndpointConfig(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
