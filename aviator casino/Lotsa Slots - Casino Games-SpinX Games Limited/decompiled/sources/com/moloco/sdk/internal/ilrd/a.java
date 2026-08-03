package com.moloco.sdk.internal.ilrd;

/* loaded from: classes5.dex */
public final class a {
    public static final com.moloco.sdk.internal.ilrd.a.C0175a g = new com.moloco.sdk.internal.ilrd.a.C0175a(null);
    public static final int h = 8;
    public static final java.lang.String i = "IlrdActiveSession";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.J f6966a;
    public final com.moloco.sdk.internal.ilrd.a.c b;
    public final kotlin.Lazy c;
    public final long d;
    public final java.util.concurrent.atomic.AtomicReference<com.moloco.sdk.internal.ilrd.a.b> e;
    public boolean f;

    /* renamed from: com.moloco.sdk.internal.ilrd.a$a, reason: collision with other inner class name */
    public static final class C0175a {
        public /* synthetic */ C0175a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0175a() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002\u0016\u0019B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u001fJ\u0010\u0010!\u001a\u00020 H×\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b#\u0010\u001aJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b-\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b.\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010*\u001a\u0004\b/\u0010\u001a¨\u00061"}, d2 = {"Lcom/moloco/sdk/internal/ilrd/a$b;", "", "", "lastEventReceivedTs", "", "banner", "mrec", "native", "interstitial", "rewarded", "<init>", "(JIIIII)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJIIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ilrd/a$b;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()J", "b", "()I", "c", "d", "e", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "(JIIIII)Lcom/moloco/sdk/internal/ilrd/a$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "I", "g", "j", "k", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class b {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.moloco.sdk.internal.ilrd.a.b.Companion INSTANCE = new com.moloco.sdk.internal.ilrd.a.b.Companion(null);
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

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        /* renamed from: com.moloco.sdk.internal.ilrd.a$b$a, reason: collision with other inner class name */
        public /* synthetic */ class C0176a implements kotlinx.serialization.internal.GeneratedSerializer<com.moloco.sdk.internal.ilrd.a.b> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.moloco.sdk.internal.ilrd.a.b.C0176a f6968a;
            public static final int b;
            private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

            static {
                com.moloco.sdk.internal.ilrd.a.b.C0176a c0176a = new com.moloco.sdk.internal.ilrd.a.b.C0176a();
                f6968a = c0176a;
                b = 8;
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ilrd.IlrdActiveSession.ImpressionCounts", c0176a, 6);
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
            public final com.moloco.sdk.internal.ilrd.a.b deserialize(kotlinx.serialization.encoding.Decoder decoder) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                long j;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
                kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
                kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
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
                    j = decodeLongElement;
                    i6 = 63;
                } else {
                    long j2 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    boolean z = true;
                    while (z) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                        switch (decodeElementIndex) {
                            case -1:
                                z = false;
                                continue;
                            case 0:
                                j2 = beginStructure.decodeLongElement(serialDescriptor, 0);
                                i12 |= 1;
                                continue;
                            case 1:
                                i7 = beginStructure.decodeIntElement(serialDescriptor, 1);
                                i12 |= 2;
                                break;
                            case 2:
                                i11 = beginStructure.decodeIntElement(serialDescriptor, 2);
                                i12 |= 4;
                                break;
                            case 3:
                                i9 = beginStructure.decodeIntElement(serialDescriptor, 3);
                                i12 |= 8;
                                break;
                            case 4:
                                i10 = beginStructure.decodeIntElement(serialDescriptor, 4);
                                i12 |= 16;
                                break;
                            case 5:
                                i8 = beginStructure.decodeIntElement(serialDescriptor, 5);
                                i12 |= 32;
                                break;
                            default:
                                throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                    }
                    i = i8;
                    i2 = i10;
                    int i13 = i12;
                    i3 = i7;
                    long j3 = j2;
                    i4 = i9;
                    i5 = i11;
                    i6 = i13;
                    j = j3;
                }
                beginStructure.endStructure(serialDescriptor);
                return new com.moloco.sdk.internal.ilrd.a.b(i6, j, i3, i5, i4, i2, i, null);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
                kotlinx.serialization.internal.IntSerializer intSerializer = kotlinx.serialization.internal.IntSerializer.INSTANCE;
                return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.LongSerializer.INSTANCE, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer};
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
                return kotlinx.serialization.internal.GeneratedSerializer.CC.$default$typeParametersSerializers(this);
            }

            @Override // kotlinx.serialization.SerializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.moloco.sdk.internal.ilrd.a.b value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
                kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
                com.moloco.sdk.internal.ilrd.a.b.a(value, beginStructure, serialDescriptor);
                beginStructure.endStructure(serialDescriptor);
            }
        }

        /* renamed from: com.moloco.sdk.internal.ilrd.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.moloco.sdk.internal.ilrd.a.b> serializer() {
                return com.moloco.sdk.internal.ilrd.a.b.C0176a.f6968a;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ b(int i, long j, int i2, int i3, int i4, int i5, int i6, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (63 != (i & 63)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 63, com.moloco.sdk.internal.ilrd.a.b.C0176a.f6968a.getDescriptor());
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

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.moloco.sdk.internal.ilrd.a.b)) {
                return false;
            }
            com.moloco.sdk.internal.ilrd.a.b bVar = (com.moloco.sdk.internal.ilrd.a.b) other;
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
            return (((((((((kotlin.UByte$$ExternalSyntheticBackport0.m(this.lastEventReceivedTs) * 31) + this.banner) * 31) + this.mrec) * 31) + this.native) * 31) + this.interstitial) * 31) + this.rewarded;
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

        public java.lang.String toString() {
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

        public final com.moloco.sdk.internal.ilrd.a.b a(long lastEventReceivedTs, int banner, int mrec, int r14, int interstitial, int rewarded) {
            return new com.moloco.sdk.internal.ilrd.a.b(lastEventReceivedTs, banner, mrec, r14, interstitial, rewarded);
        }

        public static /* synthetic */ com.moloco.sdk.internal.ilrd.a.b a(com.moloco.sdk.internal.ilrd.a.b bVar, long j, int i, int i2, int i3, int i4, int i5, int i6, java.lang.Object obj) {
            return bVar.a((i6 & 1) != 0 ? bVar.lastEventReceivedTs : j, (i6 & 2) != 0 ? bVar.banner : i, (i6 & 4) != 0 ? bVar.mrec : i2, (i6 & 8) != 0 ? bVar.native : i3, (i6 & 16) != 0 ? bVar.interstitial : i4, (i6 & 32) != 0 ? bVar.rewarded : i5);
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void a(com.moloco.sdk.internal.ilrd.a.b self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeLongElement(serialDesc, 0, self.lastEventReceivedTs);
            output.encodeIntElement(serialDesc, 1, self.banner);
            output.encodeIntElement(serialDesc, 2, self.mrec);
            output.encodeIntElement(serialDesc, 3, self.native);
            output.encodeIntElement(serialDesc, 4, self.interstitial);
            output.encodeIntElement(serialDesc, 5, self.rewarded);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002\u0017\u001aB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÇ\u0001¢\u0006\u0004\b\u0017\u0010 J\u0010\u0010!\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\fH×\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010\u001f¨\u00060"}, d2 = {"Lcom/moloco/sdk/internal/ilrd/a$c;", "", "", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "Lcom/moloco/sdk/internal/ilrd/a$b;", "impressionCounts", "", "isExpired", "", "sessionStartTs", "<init>", "(Ljava/lang/String;Lcom/moloco/sdk/internal/ilrd/a$b;ZJ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/moloco/sdk/internal/ilrd/a$b;ZJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ilrd/a$c;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "()Lcom/moloco/sdk/internal/ilrd/a$b;", "c", "()Z", "d", "()J", "(Ljava/lang/String;Lcom/moloco/sdk/internal/ilrd/a$b;ZJ)Lcom/moloco/sdk/internal/ilrd/a$c;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "Lcom/moloco/sdk/internal/ilrd/a$b;", "e", "Z", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "J", "g", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class c {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.moloco.sdk.internal.ilrd.a.c.Companion INSTANCE = new com.moloco.sdk.internal.ilrd.a.c.Companion(null);
        public static final int e = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final java.lang.String sessionId;

        /* renamed from: b, reason: from kotlin metadata */
        public final com.moloco.sdk.internal.ilrd.a.b impressionCounts;

        /* renamed from: c, reason: from kotlin metadata */
        public final boolean isExpired;

        /* renamed from: d, reason: from kotlin metadata */
        public final long sessionStartTs;

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
        /* renamed from: com.moloco.sdk.internal.ilrd.a$c$a, reason: collision with other inner class name */
        public /* synthetic */ class C0178a implements kotlinx.serialization.internal.GeneratedSerializer<com.moloco.sdk.internal.ilrd.a.c> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.moloco.sdk.internal.ilrd.a.c.C0178a f6970a;
            public static final int b;
            private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

            static {
                com.moloco.sdk.internal.ilrd.a.c.C0178a c0178a = new com.moloco.sdk.internal.ilrd.a.c.C0178a();
                f6970a = c0178a;
                b = 8;
                kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ilrd.IlrdActiveSession.SessionData", c0178a, 4);
                pluginGeneratedSerialDescriptor.addElement(com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, false);
                pluginGeneratedSerialDescriptor.addElement("impressionCounts", false);
                pluginGeneratedSerialDescriptor.addElement("isExpired", false);
                pluginGeneratedSerialDescriptor.addElement("sessionStartTs", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.moloco.sdk.internal.ilrd.a.c deserialize(kotlinx.serialization.encoding.Decoder decoder) {
                int i;
                boolean z;
                long j;
                java.lang.String str;
                com.moloco.sdk.internal.ilrd.a.b bVar;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
                kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
                kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
                if (beginStructure.decodeSequentially()) {
                    java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
                    com.moloco.sdk.internal.ilrd.a.b bVar2 = (com.moloco.sdk.internal.ilrd.a.b) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.moloco.sdk.internal.ilrd.a.b.C0176a.f6968a, null);
                    str = decodeStringElement;
                    z = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                    bVar = bVar2;
                    j = beginStructure.decodeLongElement(serialDescriptor, 3);
                    i = 15;
                } else {
                    long j2 = 0;
                    java.lang.String str2 = null;
                    com.moloco.sdk.internal.ilrd.a.b bVar3 = null;
                    int i2 = 0;
                    boolean z2 = false;
                    boolean z3 = true;
                    while (z3) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                        if (decodeElementIndex == -1) {
                            z3 = false;
                        } else if (decodeElementIndex == 0) {
                            str2 = beginStructure.decodeStringElement(serialDescriptor, 0);
                            i2 |= 1;
                        } else if (decodeElementIndex == 1) {
                            bVar3 = (com.moloco.sdk.internal.ilrd.a.b) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.moloco.sdk.internal.ilrd.a.b.C0176a.f6968a, bVar3);
                            i2 |= 2;
                        } else if (decodeElementIndex == 2) {
                            z2 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                            i2 |= 4;
                        } else {
                            if (decodeElementIndex != 3) {
                                throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                            }
                            j2 = beginStructure.decodeLongElement(serialDescriptor, 3);
                            i2 |= 8;
                        }
                    }
                    i = i2;
                    z = z2;
                    j = j2;
                    str = str2;
                    bVar = bVar3;
                }
                beginStructure.endStructure(serialDescriptor);
                return new com.moloco.sdk.internal.ilrd.a.c(i, str, bVar, z, j, null);
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
                return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, com.moloco.sdk.internal.ilrd.a.b.C0176a.f6968a, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.LongSerializer.INSTANCE};
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
                return kotlinx.serialization.internal.GeneratedSerializer.CC.$default$typeParametersSerializers(this);
            }

            @Override // kotlinx.serialization.SerializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.moloco.sdk.internal.ilrd.a.c value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
                kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
                com.moloco.sdk.internal.ilrd.a.c.a(value, beginStructure, serialDescriptor);
                beginStructure.endStructure(serialDescriptor);
            }
        }

        /* renamed from: com.moloco.sdk.internal.ilrd.a$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.moloco.sdk.internal.ilrd.a.c> serializer() {
                return com.moloco.sdk.internal.ilrd.a.c.C0178a.f6970a;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ c(int i, java.lang.String str, com.moloco.sdk.internal.ilrd.a.b bVar, boolean z, long j, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 15, com.moloco.sdk.internal.ilrd.a.c.C0178a.f6970a.getDescriptor());
            }
            this.sessionId = str;
            this.impressionCounts = bVar;
            this.isExpired = z;
            this.sessionStartTs = j;
        }

        /* renamed from: a, reason: from getter */
        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        /* renamed from: b, reason: from getter */
        public final com.moloco.sdk.internal.ilrd.a.b getImpressionCounts() {
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

        public final com.moloco.sdk.internal.ilrd.a.b e() {
            return this.impressionCounts;
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.moloco.sdk.internal.ilrd.a.c)) {
                return false;
            }
            com.moloco.sdk.internal.ilrd.a.c cVar = (com.moloco.sdk.internal.ilrd.a.c) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, cVar.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.impressionCounts, cVar.impressionCounts) && this.isExpired == cVar.isExpired && this.sessionStartTs == cVar.sessionStartTs;
        }

        public final java.lang.String f() {
            return this.sessionId;
        }

        public final long g() {
            return this.sessionStartTs;
        }

        public final boolean h() {
            return this.isExpired;
        }

        public int hashCode() {
            return (((((this.sessionId.hashCode() * 31) + this.impressionCounts.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.isExpired)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.sessionStartTs);
        }

        public java.lang.String toString() {
            return "SessionData(sessionId=" + this.sessionId + ", impressionCounts=" + this.impressionCounts + ", isExpired=" + this.isExpired + ", sessionStartTs=" + this.sessionStartTs + ')';
        }

        public c(java.lang.String sessionId, com.moloco.sdk.internal.ilrd.a.b impressionCounts, boolean z, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionCounts, "impressionCounts");
            this.sessionId = sessionId;
            this.impressionCounts = impressionCounts;
            this.isExpired = z;
            this.sessionStartTs = j;
        }

        public final com.moloco.sdk.internal.ilrd.a.c a(java.lang.String sessionId, com.moloco.sdk.internal.ilrd.a.b impressionCounts, boolean isExpired, long sessionStartTs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionCounts, "impressionCounts");
            return new com.moloco.sdk.internal.ilrd.a.c(sessionId, impressionCounts, isExpired, sessionStartTs);
        }

        public static /* synthetic */ com.moloco.sdk.internal.ilrd.a.c a(com.moloco.sdk.internal.ilrd.a.c cVar, java.lang.String str, com.moloco.sdk.internal.ilrd.a.b bVar, boolean z, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cVar.sessionId;
            }
            if ((i & 2) != 0) {
                bVar = cVar.impressionCounts;
            }
            com.moloco.sdk.internal.ilrd.a.b bVar2 = bVar;
            if ((i & 4) != 0) {
                z = cVar.isExpired;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                j = cVar.sessionStartTs;
            }
            return cVar.a(str, bVar2, z2, j);
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void a(com.moloco.sdk.internal.ilrd.a.c self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.sessionId);
            output.encodeSerializableElement(serialDesc, 1, com.moloco.sdk.internal.ilrd.a.b.C0176a.f6968a, self.impressionCounts);
            output.encodeBooleanElement(serialDesc, 2, self.isExpired);
            output.encodeLongElement(serialDesc, 3, self.sessionStartTs);
        }
    }

    public a(com.moloco.sdk.internal.services.J timeProvider, java.lang.String str) {
        com.moloco.sdk.internal.ilrd.a.b e;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f6966a = timeProvider;
        com.moloco.sdk.internal.ilrd.a.c cVar = null;
        if (str != null) {
            try {
                kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                companion.getSerializersModule();
                cVar = (com.moloco.sdk.internal.ilrd.a.c) companion.decodeFromString(com.moloco.sdk.internal.ilrd.a.c.INSTANCE.serializer(), str);
            } catch (java.lang.Exception e2) {
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, i, "Error deserializing session data", e2, false, 8, null);
            }
        }
        this.b = cVar;
        this.c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.ilrd.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.ilrd.a.a(com.moloco.sdk.internal.ilrd.a.this);
            }
        });
        this.d = cVar != null ? cVar.g() : this.f6966a.a();
        this.e = new java.util.concurrent.atomic.AtomicReference<>((cVar == null || (e = cVar.e()) == null) ? new com.moloco.sdk.internal.ilrd.a.b(-1L, 0, 0, 0, 0, 0) : e);
        this.f = cVar != null ? cVar.h() : false;
    }

    public static final java.lang.String a(com.moloco.sdk.internal.ilrd.a aVar) {
        java.lang.String f;
        com.moloco.sdk.internal.ilrd.a.c cVar = aVar.b;
        if (cVar != null && (f = cVar.f()) != null) {
            return f;
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return uuid;
    }

    public final com.moloco.sdk.internal.ilrd.a.b b() {
        com.moloco.sdk.internal.ilrd.a.b bVar = this.e.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bVar, "get(...)");
        return bVar;
    }

    public final java.lang.String c() {
        return (java.lang.String) this.c.getValue();
    }

    public final long d() {
        return this.d;
    }

    public final boolean e() {
        return this.f;
    }

    public final java.lang.String f() {
        return kotlinx.serialization.json.Json.INSTANCE.encodeToString(com.moloco.sdk.internal.ilrd.a.c.INSTANCE.serializer(), new com.moloco.sdk.internal.ilrd.a.c(c(), b(), e(), this.d));
    }

    public java.lang.String toString() {
        com.moloco.sdk.internal.ilrd.a.b b2 = b();
        return "IlrdActiveSession(id=" + c() + ", startTs=" + this.d + ", expired=" + e() + ", impressions=" + (b2.g() + b2.j() + b2.k() + b2.h() + b2.l()) + " [banner=" + b2.g() + ", mrec=" + b2.j() + ", native=" + b2.k() + ", interstitial=" + b2.h() + ", rewarded=" + b2.l() + "])";
    }

    public final void a(com.moloco.sdk.internal.ilrd.d.a ilrdData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ilrdData, "ilrdData");
        if (ilrdData instanceof com.moloco.sdk.internal.ilrd.d.a.b) {
            java.lang.String adFormat = ((com.moloco.sdk.internal.ilrd.d.a.b) ilrdData).b().getAdFormat();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adFormat, "getAdFormat(...)");
            java.lang.String upperCase = adFormat.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            a(upperCase, "Applovin");
            return;
        }
        if (!(ilrdData instanceof com.moloco.sdk.internal.ilrd.d.a.C0180a)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String adFormat2 = ((com.moloco.sdk.internal.ilrd.d.a.C0180a) ilrdData).b().getAdFormat();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adFormat2, "getAdFormat(...)");
        java.lang.String upperCase2 = adFormat2.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        a(upperCase2, "Ironsource");
    }

    public final boolean a(java.lang.String str, java.lang.String str2) {
        com.moloco.sdk.internal.ilrd.a.b a2;
        long a3 = this.f6966a.a();
        com.moloco.sdk.internal.ilrd.a.b bVar = this.e.get();
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) com.ironsource.mediationsdk.j.f6439a, false, 2, (java.lang.Object) null)) {
            a2 = com.moloco.sdk.internal.ilrd.a.b.a(bVar, a3, bVar.g() + 1, 0, 0, 0, 0, 60, null);
        } else if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "MREC", false, 2, (java.lang.Object) null)) {
            a2 = com.moloco.sdk.internal.ilrd.a.b.a(bVar, a3, 0, bVar.j() + 1, 0, 0, 0, 58, null);
        } else if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "NATIVE", false, 2, (java.lang.Object) null)) {
            a2 = com.moloco.sdk.internal.ilrd.a.b.a(bVar, a3, 0, 0, bVar.k() + 1, 0, 0, 54, null);
        } else if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "INTER", false, 2, (java.lang.Object) null)) {
            a2 = com.moloco.sdk.internal.ilrd.a.b.a(bVar, a3, 0, 0, 0, bVar.h() + 1, 0, 46, null);
        } else if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "REWARD", false, 2, (java.lang.Object) null)) {
            a2 = com.moloco.sdk.internal.ilrd.a.b.a(bVar, a3, 0, 0, 0, 0, bVar.l() + 1, 30, null);
        } else {
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, i, "Unknown ad format for " + str2 + ": " + str, null, false, 12, null);
            return false;
        }
        this.e.set(a2);
        return true;
    }

    public final void a() {
        this.f = true;
    }

    public /* synthetic */ a(com.moloco.sdk.internal.services.J j, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? null : str);
    }
}
