package com.moloco.sdk.internal.ilrd;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.c;
import com.moloco.sdk.internal.services.I;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes7.dex */
public final class a {
    public static final C1471a g = new C1471a(null);
    public static final int h = 8;
    public static final String i = "IlrdActiveSession";

    /* renamed from: a, reason: collision with root package name */
    public final I f10486a;
    public final c b;
    public final Lazy c;
    public final long d;
    public final AtomicReference<b> e;
    public boolean f;

    /* renamed from: com.moloco.sdk.internal.ilrd.a$a, reason: collision with other inner class name */
    public static final class C1471a {
        public /* synthetic */ C1471a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1471a() {
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002\u0016\u0019B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u001fJ\u0010\u0010!\u001a\u00020 H×\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b#\u0010\u001aJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b-\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b.\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010*\u001a\u0004\b/\u0010\u001a¨\u00061"}, d2 = {"Lcom/moloco/sdk/internal/ilrd/a$b;", "", "", "lastEventReceivedTs", "", "banner", "mrec", "native", "interstitial", "rewarded", "<init>", "(JIIIII)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJIIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ilrd/a$b;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()J", "b", "()I", "c", "d", "e", "f", "(JIIIII)Lcom/moloco/sdk/internal/ilrd/a$b;", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "i", "I", "g", j.b, CampaignEx.JSON_KEY_AD_K, "h", CmcdData.Factory.STREAM_TYPE_LIVE, k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
    @Serializable
    public static final /* data */ class b {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int g = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long lastEventReceivedTs;

        /* renamed from: b, reason: from kotlin metadata */
        public final int banner;

        /* renamed from: c, reason: from kotlin metadata */
        public final int mrec;

        /* renamed from: d, reason: from kotlin metadata */
        public final int native;

        /* renamed from: e, reason: from kotlin metadata */
        public final int interstitial;

        /* renamed from: f, reason: from kotlin metadata */
        public final int rewarded;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        /* renamed from: com.moloco.sdk.internal.ilrd.a$b$a, reason: collision with other inner class name */
        public /* synthetic */ class C1472a implements GeneratedSerializer<b> {

            /* renamed from: a, reason: collision with root package name */
            public static final C1472a f10488a;
            public static final int b;
            private static final SerialDescriptor descriptor;

            static {
                C1472a c1472a = new C1472a();
                f10488a = c1472a;
                b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ilrd.IlrdActiveSession.ImpressionCounts", c1472a, 6);
                pluginGeneratedSerialDescriptor.addElement("lastEventReceivedTs", false);
                pluginGeneratedSerialDescriptor.addElement("banner", false);
                pluginGeneratedSerialDescriptor.addElement("mrec", false);
                pluginGeneratedSerialDescriptor.addElement("native", false);
                pluginGeneratedSerialDescriptor.addElement("interstitial", false);
                pluginGeneratedSerialDescriptor.addElement("rewarded", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b deserialize(Decoder decoder) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                long j;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
                if (beginStructure.decodeSequentially()) {
                    long decodeLongElement = beginStructure.decodeLongElement(serialDescriptor, 0);
                    int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 1);
                    int decodeIntElement2 = beginStructure.decodeIntElement(serialDescriptor, 2);
                    int decodeIntElement3 = beginStructure.decodeIntElement(serialDescriptor, 3);
                    int decodeIntElement4 = beginStructure.decodeIntElement(serialDescriptor, 4);
                    i3 = decodeIntElement;
                    i = beginStructure.decodeIntElement(serialDescriptor, 5);
                    i4 = decodeIntElement3;
                    i2 = decodeIntElement4;
                    i5 = decodeIntElement2;
                    i6 = 63;
                    j = decodeLongElement;
                } else {
                    boolean z = true;
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = 0;
                    long j2 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (z) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                        switch (decodeElementIndex) {
                            case -1:
                                z = false;
                                continue;
                            case 0:
                                j2 = beginStructure.decodeLongElement(serialDescriptor, 0);
                                i10 |= 1;
                                continue;
                            case 1:
                                i7 = beginStructure.decodeIntElement(serialDescriptor, 1);
                                i10 |= 2;
                                break;
                            case 2:
                                i9 = beginStructure.decodeIntElement(serialDescriptor, 2);
                                i10 |= 4;
                                break;
                            case 3:
                                i12 = beginStructure.decodeIntElement(serialDescriptor, 3);
                                i10 |= 8;
                                break;
                            case 4:
                                i8 = beginStructure.decodeIntElement(serialDescriptor, 4);
                                i10 |= 16;
                                break;
                            case 5:
                                i11 = beginStructure.decodeIntElement(serialDescriptor, 5);
                                i10 |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                    i = i11;
                    i2 = i8;
                    int i13 = i10;
                    i3 = i7;
                    long j3 = j2;
                    i4 = i12;
                    i5 = i9;
                    i6 = i13;
                    j = j3;
                }
                beginStructure.endStructure(serialDescriptor);
                return new b(i6, j, i3, i5, i4, i2, i, null);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                return new KSerializer[]{LongSerializer.INSTANCE, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer};
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, b value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
                b.a(value, beginStructure, serialDescriptor);
                beginStructure.endStructure(serialDescriptor);
            }
        }

        /* renamed from: com.moloco.sdk.internal.ilrd.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            public final KSerializer<b> serializer() {
                return C1472a.f10488a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ b(int i, long j, int i2, int i3, int i4, int i5, int i6, SerializationConstructorMarker serializationConstructorMarker) {
            if (63 != (i & 63)) {
                PluginExceptionsKt.throwMissingFieldException(i, 63, C1472a.f10488a.getDescriptor());
            }
            this.lastEventReceivedTs = j;
            this.banner = i2;
            this.mrec = i3;
            this.native = i4;
            this.interstitial = i5;
            this.rewarded = i6;
        }

        /* renamed from: a, reason: from getter */
        public final long getLastEventReceivedTs() {
            return this.lastEventReceivedTs;
        }

        /* renamed from: b, reason: from getter */
        public final int getBanner() {
            return this.banner;
        }

        /* renamed from: c, reason: from getter */
        public final int getMrec() {
            return this.mrec;
        }

        /* renamed from: d, reason: from getter */
        public final int getNative() {
            return this.native;
        }

        /* renamed from: e, reason: from getter */
        public final int getInterstitial() {
            return this.interstitial;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.lastEventReceivedTs == bVar.lastEventReceivedTs && this.banner == bVar.banner && this.mrec == bVar.mrec && this.native == bVar.native && this.interstitial == bVar.interstitial && this.rewarded == bVar.rewarded;
        }

        /* renamed from: f, reason: from getter */
        public final int getRewarded() {
            return this.rewarded;
        }

        public final int g() {
            return this.banner;
        }

        public final int h() {
            return this.interstitial;
        }

        public int hashCode() {
            return (((((((((Long.hashCode(this.lastEventReceivedTs) * 31) + Integer.hashCode(this.banner)) * 31) + Integer.hashCode(this.mrec)) * 31) + Integer.hashCode(this.native)) * 31) + Integer.hashCode(this.interstitial)) * 31) + Integer.hashCode(this.rewarded);
        }

        public final long i() {
            return this.lastEventReceivedTs;
        }

        public final int j() {
            return this.mrec;
        }

        public final int k() {
            return this.native;
        }

        public final int l() {
            return this.rewarded;
        }

        public String toString() {
            return "ImpressionCounts(lastEventReceivedTs=" + this.lastEventReceivedTs + ", banner=" + this.banner + ", mrec=" + this.mrec + ", native=" + this.native + ", interstitial=" + this.interstitial + ", rewarded=" + this.rewarded + ')';
        }

        public b(long j, int i, int i2, int i3, int i4, int i5) {
            this.lastEventReceivedTs = j;
            this.banner = i;
            this.mrec = i2;
            this.native = i3;
            this.interstitial = i4;
            this.rewarded = i5;
        }

        public final b a(long lastEventReceivedTs, int banner, int mrec, int r14, int interstitial, int rewarded) {
            return new b(lastEventReceivedTs, banner, mrec, r14, interstitial, rewarded);
        }

        public static /* synthetic */ b a(b bVar, long j, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            return bVar.a((i6 & 1) != 0 ? bVar.lastEventReceivedTs : j, (i6 & 2) != 0 ? bVar.banner : i, (i6 & 4) != 0 ? bVar.mrec : i2, (i6 & 8) != 0 ? bVar.native : i3, (i6 & 16) != 0 ? bVar.interstitial : i4, (i6 & 32) != 0 ? bVar.rewarded : i5);
        }

        @JvmStatic
        public static final /* synthetic */ void a(b self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeLongElement(serialDesc, 0, self.lastEventReceivedTs);
            output.encodeIntElement(serialDesc, 1, self.banner);
            output.encodeIntElement(serialDesc, 2, self.mrec);
            output.encodeIntElement(serialDesc, 3, self.native);
            output.encodeIntElement(serialDesc, 4, self.interstitial);
            output.encodeIntElement(serialDesc, 5, self.rewarded);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002\u0017\u001aB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÇ\u0001¢\u0006\u0004\b\u0017\u0010 J\u0010\u0010!\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\fH×\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010\u001f¨\u00060"}, d2 = {"Lcom/moloco/sdk/internal/ilrd/a$c;", "", "", "sessionId", "Lcom/moloco/sdk/internal/ilrd/a$b;", "impressionCounts", "", "isExpired", "", "sessionStartTs", "<init>", "(Ljava/lang/String;Lcom/moloco/sdk/internal/ilrd/a$b;ZJ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/moloco/sdk/internal/ilrd/a$b;ZJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ilrd/a$c;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "()Lcom/moloco/sdk/internal/ilrd/a$b;", "c", "()Z", "d", "()J", "(Ljava/lang/String;Lcom/moloco/sdk/internal/ilrd/a$b;ZJ)Lcom/moloco/sdk/internal/ilrd/a$c;", InAppPurchaseConstants.METHOD_TO_STRING, "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "Lcom/moloco/sdk/internal/ilrd/a$b;", "e", "Z", "h", "J", "g", k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
    @Serializable
    public static final /* data */ class c {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int e = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String sessionId;

        /* renamed from: b, reason: from kotlin metadata */
        public final b impressionCounts;

        /* renamed from: c, reason: from kotlin metadata */
        public final boolean isExpired;

        /* renamed from: d, reason: from kotlin metadata */
        public final long sessionStartTs;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        /* renamed from: com.moloco.sdk.internal.ilrd.a$c$a, reason: collision with other inner class name */
        public /* synthetic */ class C1474a implements GeneratedSerializer<c> {

            /* renamed from: a, reason: collision with root package name */
            public static final C1474a f10490a;
            public static final int b;
            private static final SerialDescriptor descriptor;

            static {
                C1474a c1474a = new C1474a();
                f10490a = c1474a;
                b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ilrd.IlrdActiveSession.SessionData", c1474a, 4);
                pluginGeneratedSerialDescriptor.addElement("sessionId", false);
                pluginGeneratedSerialDescriptor.addElement("impressionCounts", false);
                pluginGeneratedSerialDescriptor.addElement("isExpired", false);
                pluginGeneratedSerialDescriptor.addElement("sessionStartTs", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c deserialize(Decoder decoder) {
                int i;
                boolean z;
                long j;
                String str;
                b bVar;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
                if (beginStructure.decodeSequentially()) {
                    String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
                    b bVar2 = (b) beginStructure.decodeSerializableElement(serialDescriptor, 1, b.C1472a.f10488a, null);
                    str = decodeStringElement;
                    i = 15;
                    z = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                    bVar = bVar2;
                    j = beginStructure.decodeLongElement(serialDescriptor, 3);
                } else {
                    long j2 = 0;
                    boolean z2 = true;
                    int i2 = 0;
                    String str2 = null;
                    b bVar3 = null;
                    boolean z3 = false;
                    while (z2) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                        if (decodeElementIndex == -1) {
                            z2 = false;
                        } else if (decodeElementIndex == 0) {
                            str2 = beginStructure.decodeStringElement(serialDescriptor, 0);
                            i2 |= 1;
                        } else if (decodeElementIndex == 1) {
                            bVar3 = (b) beginStructure.decodeSerializableElement(serialDescriptor, 1, b.C1472a.f10488a, bVar3);
                            i2 |= 2;
                        } else if (decodeElementIndex == 2) {
                            z3 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                            i2 |= 4;
                        } else {
                            if (decodeElementIndex != 3) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            j2 = beginStructure.decodeLongElement(serialDescriptor, 3);
                            i2 |= 8;
                        }
                    }
                    i = i2;
                    z = z3;
                    j = j2;
                    str = str2;
                    bVar = bVar3;
                }
                beginStructure.endStructure(serialDescriptor);
                return new c(i, str, bVar, z, j, null);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{StringSerializer.INSTANCE, b.C1472a.f10488a, BooleanSerializer.INSTANCE, LongSerializer.INSTANCE};
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.SerializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, c value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
                c.a(value, beginStructure, serialDescriptor);
                beginStructure.endStructure(serialDescriptor);
            }
        }

        /* renamed from: com.moloco.sdk.internal.ilrd.a$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            public final KSerializer<c> serializer() {
                return C1474a.f10490a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ c(int i, String str, b bVar, boolean z, long j, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, C1474a.f10490a.getDescriptor());
            }
            this.sessionId = str;
            this.impressionCounts = bVar;
            this.isExpired = z;
            this.sessionStartTs = j;
        }

        /* renamed from: a, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* renamed from: b, reason: from getter */
        public final b getImpressionCounts() {
            return this.impressionCounts;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsExpired() {
            return this.isExpired;
        }

        /* renamed from: d, reason: from getter */
        public final long getSessionStartTs() {
            return this.sessionStartTs;
        }

        public final b e() {
            return this.impressionCounts;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return Intrinsics.areEqual(this.sessionId, cVar.sessionId) && Intrinsics.areEqual(this.impressionCounts, cVar.impressionCounts) && this.isExpired == cVar.isExpired && this.sessionStartTs == cVar.sessionStartTs;
        }

        public final String f() {
            return this.sessionId;
        }

        public final long g() {
            return this.sessionStartTs;
        }

        public final boolean h() {
            return this.isExpired;
        }

        public int hashCode() {
            return (((((this.sessionId.hashCode() * 31) + this.impressionCounts.hashCode()) * 31) + Boolean.hashCode(this.isExpired)) * 31) + Long.hashCode(this.sessionStartTs);
        }

        public String toString() {
            return "SessionData(sessionId=" + this.sessionId + ", impressionCounts=" + this.impressionCounts + ", isExpired=" + this.isExpired + ", sessionStartTs=" + this.sessionStartTs + ')';
        }

        public c(String sessionId, b impressionCounts, boolean z, long j) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(impressionCounts, "impressionCounts");
            this.sessionId = sessionId;
            this.impressionCounts = impressionCounts;
            this.isExpired = z;
            this.sessionStartTs = j;
        }

        public final c a(String sessionId, b impressionCounts, boolean isExpired, long sessionStartTs) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(impressionCounts, "impressionCounts");
            return new c(sessionId, impressionCounts, isExpired, sessionStartTs);
        }

        public static /* synthetic */ c a(c cVar, String str, b bVar, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.sessionId;
            }
            if ((i & 2) != 0) {
                bVar = cVar.impressionCounts;
            }
            b bVar2 = bVar;
            if ((i & 4) != 0) {
                z = cVar.isExpired;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                j = cVar.sessionStartTs;
            }
            return cVar.a(str, bVar2, z2, j);
        }

        @JvmStatic
        public static final /* synthetic */ void a(c self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.sessionId);
            output.encodeSerializableElement(serialDesc, 1, b.C1472a.f10488a, self.impressionCounts);
            output.encodeBooleanElement(serialDesc, 2, self.isExpired);
            output.encodeLongElement(serialDesc, 3, self.sessionStartTs);
        }
    }

    public a(I timeProvider, String str) {
        b e;
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f10486a = timeProvider;
        c cVar = null;
        if (str != null) {
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                cVar = (c) companion.decodeFromString(c.INSTANCE.serializer(), str);
            } catch (Exception e2) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "Error deserializing session data", e2, false, 8, null);
            }
        }
        this.b = cVar;
        this.c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ilrd.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.a(a.this);
            }
        });
        this.d = cVar != null ? cVar.g() : this.f10486a.a();
        this.e = new AtomicReference<>((cVar == null || (e = cVar.e()) == null) ? new b(-1L, 0, 0, 0, 0, 0) : e);
        this.f = cVar != null ? cVar.h() : false;
    }

    public static final String a(a aVar) {
        String f;
        c cVar = aVar.b;
        if (cVar != null && (f = cVar.f()) != null) {
            return f;
        }
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return uuid;
    }

    public final b b() {
        b bVar = this.e.get();
        Intrinsics.checkNotNullExpressionValue(bVar, "get(...)");
        return bVar;
    }

    public final String c() {
        return (String) this.c.getValue();
    }

    public final long d() {
        return this.d;
    }

    public final boolean e() {
        return this.f;
    }

    public final String f() {
        return Json.INSTANCE.encodeToString(c.INSTANCE.serializer(), new c(c(), b(), e(), this.d));
    }

    public String toString() {
        b b2 = b();
        return "IlrdActiveSession(id=" + c() + ", startTs=" + this.d + ", expired=" + e() + ", impressions=" + (b2.g() + b2.j() + b2.k() + b2.h() + b2.l()) + " [banner=" + b2.g() + ", mrec=" + b2.j() + ", native=" + b2.k() + ", interstitial=" + b2.h() + ", rewarded=" + b2.l() + "])";
    }

    public final void a(c.a ilrdData) {
        Intrinsics.checkNotNullParameter(ilrdData, "ilrdData");
        if (ilrdData instanceof c.a.b) {
            String adFormat = ((c.a.b) ilrdData).b().getAdFormat();
            Intrinsics.checkNotNullExpressionValue(adFormat, "getAdFormat(...)");
            String upperCase = adFormat.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            a(upperCase, "Applovin");
            return;
        }
        if (!(ilrdData instanceof c.a.C1475a)) {
            throw new NoWhenBranchMatchedException();
        }
        String adFormat2 = ((c.a.C1475a) ilrdData).b().getAdFormat();
        Intrinsics.checkNotNullExpressionValue(adFormat2, "getAdFormat(...)");
        String upperCase2 = adFormat2.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        a(upperCase2, "Ironsource");
    }

    public final boolean a(String str, String str2) {
        b a2;
        long a3 = this.f10486a.a();
        b bVar = this.e.get();
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) com.ironsource.mediationsdk.j.f8411a, false, 2, (Object) null)) {
            a2 = b.a(bVar, a3, bVar.g() + 1, 0, 0, 0, 0, 60, null);
        } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "MREC", false, 2, (Object) null)) {
            a2 = b.a(bVar, a3, 0, bVar.j() + 1, 0, 0, 0, 58, null);
        } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "NATIVE", false, 2, (Object) null)) {
            a2 = b.a(bVar, a3, 0, 0, bVar.k() + 1, 0, 0, 54, null);
        } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "INTER", false, 2, (Object) null)) {
            a2 = b.a(bVar, a3, 0, 0, 0, bVar.h() + 1, 0, 46, null);
        } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "REWARD", false, 2, (Object) null)) {
            a2 = b.a(bVar, a3, 0, 0, 0, 0, bVar.l() + 1, 30, null);
        } else {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, i, "Unknown ad format for " + str2 + ": " + str, null, false, 12, null);
            return false;
        }
        this.e.set(a2);
        return true;
    }

    public final void a() {
        this.f = true;
    }

    public /* synthetic */ a(I i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? null : str);
    }
}
