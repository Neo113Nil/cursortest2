package com.chartboost.sdk.tracking;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes4.dex */
public final class TrackAd {

    /* renamed from: a, reason: collision with root package name */
    public final String f5133a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final AdSize h;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0015\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0017\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J,\u0010\u0018\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0016J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0016R\u001b\u0010\u0005\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006'"}, d2 = {"Lcom/chartboost/sdk/tracking/TrackAd$AdSize;", "", "", "Lcom/chartboost/sdk/tracking/Pixels;", "height", "width", "<init>", "(II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ChartboostMonetization_9_13_0_release", "(Lcom/chartboost/sdk/tracking/TrackAd$AdSize;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "copy", "(II)Lcom/chartboost/sdk/tracking/TrackAd$AdSize;", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHeight", "getWidth", k.M, "a", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class AdSize {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int height;
        private final int width;

        public static final class Companion {
            public Companion() {
            }

            public final KSerializer<AdSize> serializer() {
                return a.f5134a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ class a implements GeneratedSerializer {

            /* renamed from: a, reason: collision with root package name */
            public static final a f5134a;
            public static final SerialDescriptor b;

            static {
                a aVar = new a();
                f5134a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.tracking.TrackAd.AdSize", aVar, 2);
                pluginGeneratedSerialDescriptor.addElement("height", false);
                pluginGeneratedSerialDescriptor.addElement("width", false);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AdSize deserialize(Decoder decoder) {
                int i;
                int i2;
                int i3;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = b;
                CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
                if (beginStructure.decodeSequentially()) {
                    i = beginStructure.decodeIntElement(serialDescriptor, 0);
                    i2 = beginStructure.decodeIntElement(serialDescriptor, 1);
                    i3 = 3;
                } else {
                    boolean z = true;
                    i = 0;
                    int i4 = 0;
                    int i5 = 0;
                    while (z) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                        if (decodeElementIndex == -1) {
                            z = false;
                        } else if (decodeElementIndex == 0) {
                            i = beginStructure.decodeIntElement(serialDescriptor, 0);
                            i5 |= 1;
                        } else {
                            if (decodeElementIndex != 1) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            i4 = beginStructure.decodeIntElement(serialDescriptor, 1);
                            i5 |= 2;
                        }
                    }
                    i2 = i4;
                    i3 = i5;
                }
                beginStructure.endStructure(serialDescriptor);
                return new AdSize(i3, i, i2, null);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] childSerializers() {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                return new KSerializer[]{intSerializer, intSerializer};
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public KSerializer[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }

            @Override // kotlinx.serialization.SerializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, AdSize value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = b;
                CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
                AdSize.write$Self$ChartboostMonetization_9_13_0_release(value, beginStructure, serialDescriptor);
                beginStructure.endStructure(serialDescriptor);
            }
        }

        public /* synthetic */ AdSize(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, a.f5134a.getDescriptor());
            }
            this.height = i2;
            this.width = i3;
        }

        public static /* synthetic */ AdSize copy$default(AdSize adSize, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = adSize.height;
            }
            if ((i3 & 2) != 0) {
                i2 = adSize.width;
            }
            return adSize.copy(i, i2);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ChartboostMonetization_9_13_0_release(AdSize self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeIntElement(serialDesc, 0, self.height);
            output.encodeIntElement(serialDesc, 1, self.width);
        }

        /* renamed from: component1, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: component2, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        public final AdSize copy(int height, int width) {
            return new AdSize(height, width);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdSize)) {
                return false;
            }
            AdSize adSize = (AdSize) other;
            return this.height == adSize.height && this.width == adSize.width;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (Integer.hashCode(this.height) * 31) + Integer.hashCode(this.width);
        }

        public String toString() {
            return "AdSize(height=" + this.height + ", width=" + this.width + ")";
        }

        public AdSize(int i, int i2) {
            this.height = i;
            this.width = i2;
        }
    }

    public TrackAd(String location, String adType, String str, String adCreativeId, String adCreativeType, String adMarkup, String templateUrl, AdSize adSize) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adCreativeId, "adCreativeId");
        Intrinsics.checkNotNullParameter(adCreativeType, "adCreativeType");
        Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
        Intrinsics.checkNotNullParameter(templateUrl, "templateUrl");
        this.f5133a = location;
        this.b = adType;
        this.c = str;
        this.d = adCreativeId;
        this.e = adCreativeType;
        this.f = adMarkup;
        this.g = templateUrl;
        this.h = adSize;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final AdSize c() {
        return this.h;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.f5133a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackAd)) {
            return false;
        }
        TrackAd trackAd = (TrackAd) obj;
        return Intrinsics.areEqual(this.f5133a, trackAd.f5133a) && Intrinsics.areEqual(this.b, trackAd.b) && Intrinsics.areEqual(this.c, trackAd.c) && Intrinsics.areEqual(this.d, trackAd.d) && Intrinsics.areEqual(this.e, trackAd.e) && Intrinsics.areEqual(this.f, trackAd.f) && Intrinsics.areEqual(this.g, trackAd.g) && Intrinsics.areEqual(this.h, trackAd.h);
    }

    public final String f() {
        String str = this.c;
        if (str == null) {
            return null;
        }
        String substring = str.substring(0, RangesKt.coerceAtMost(str.length(), 20));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String g() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = ((this.f5133a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        AdSize adSize = this.h;
        return hashCode2 + (adSize != null ? adSize.hashCode() : 0);
    }

    public String toString() {
        return "TrackAd: location: " + this.f5133a + " adType: " + this.b + " adImpressionId: " + f() + " adCreativeId: " + this.d + " adCreativeType: " + this.e + " adMarkup: " + this.f + " templateUrl: " + this.g;
    }

    public /* synthetic */ TrackAd(String str, String str2, String str3, String str4, String str5, String str6, String str7, AdSize adSize, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? null : adSize);
    }
}
