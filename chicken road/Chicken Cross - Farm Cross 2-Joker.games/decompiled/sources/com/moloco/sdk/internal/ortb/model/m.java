package com.moloco.sdk.internal.ortb.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.moloco.sdk.internal.ortb.model.l;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002\u0013\u0016B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\u0017¨\u0006("}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/m;", "", "", "eventLink", "Lcom/moloco/sdk/internal/ortb/model/l;", "config", "<init>", "(Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/l;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/moloco/sdk/internal/ortb/model/l;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/m;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/String;", "b", "()Lcom/moloco/sdk/internal/ortb/model/l;", "(Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/l;)Lcom/moloco/sdk/internal/ortb/model/m;", InAppPurchaseConstants.METHOD_TO_STRING, "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "f", "()V", "Lcom/moloco/sdk/internal/ortb/model/l;", "c", "d", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class m {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String eventLink;

    /* renamed from: b, reason: from kotlin metadata */
    public final l config;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements GeneratedSerializer<m> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10555a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f10555a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.CreativeRenderingCheckEvent", aVar, 2);
            pluginGeneratedSerialDescriptor.addElement("event_link", true);
            pluginGeneratedSerialDescriptor.addElement("config", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m deserialize(Decoder decoder) {
            String str;
            l lVar;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            SerializationConstructorMarker serializationConstructorMarker = null;
            if (beginStructure.decodeSequentially()) {
                str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
                lVar = (l) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, l.a.f10553a, null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                str = null;
                l lVar2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str);
                        i2 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        lVar2 = (l) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, l.a.f10553a, lVar2);
                        i2 |= 2;
                    }
                }
                lVar = lVar2;
                i = i2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new m(i, str, lVar, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(l.a.f10553a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, m value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            m.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.m$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<m> serializer() {
            return a.f10555a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m() {
        this((String) null, (l) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    @SerialName("config")
    public static /* synthetic */ void d() {
    }

    @SerialName("event_link")
    public static /* synthetic */ void f() {
    }

    /* renamed from: a, reason: from getter */
    public final String getEventLink() {
        return this.eventLink;
    }

    /* renamed from: b, reason: from getter */
    public final l getConfig() {
        return this.config;
    }

    public final l c() {
        return this.config;
    }

    public final String e() {
        return this.eventLink;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return Intrinsics.areEqual(this.eventLink, mVar.eventLink) && Intrinsics.areEqual(this.config, mVar.config);
    }

    public int hashCode() {
        String str = this.eventLink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        l lVar = this.config;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    public String toString() {
        return "CreativeRenderingCheckEvent(eventLink=" + this.eventLink + ", config=" + this.config + ')';
    }

    public /* synthetic */ m(int i, String str, l lVar, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.eventLink = null;
        } else {
            this.eventLink = str;
        }
        if ((i & 2) == 0) {
            this.config = null;
        } else {
            this.config = lVar;
        }
    }

    public final m a(String eventLink, l config) {
        return new m(eventLink, config);
    }

    public static /* synthetic */ m a(m mVar, String str, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mVar.eventLink;
        }
        if ((i & 2) != 0) {
            lVar = mVar.config;
        }
        return mVar.a(str, lVar);
    }

    @JvmStatic
    public static final /* synthetic */ void a(m self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.eventLink != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.eventLink);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.config == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, l.a.f10553a, self.config);
    }

    public m(String str, l lVar) {
        this.eventLink = str;
        this.config = lVar;
    }

    public /* synthetic */ m(String str, l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : lVar);
    }
}
