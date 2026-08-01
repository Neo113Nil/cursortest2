package com.moloco.sdk.internal.ortb.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002\u0011\u001fB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0013J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0013¨\u0006#"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/l;", "", "", "opacityRate", "<init>", "(Ljava/lang/Float;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/l;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/Float;", "(Ljava/lang/Float;)Lcom/moloco/sdk/internal/ortb/model/l;", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Float;", "b", "c", "()V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class l {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Float opacityRate;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements GeneratedSerializer<l> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10553a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f10553a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.CreativeRenderingCheckConfig", aVar, 1);
            pluginGeneratedSerialDescriptor.addElement("opacity_rate", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l deserialize(Decoder decoder) {
            Float f;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            int i = 1;
            SerializationConstructorMarker serializationConstructorMarker = null;
            if (beginStructure.decodeSequentially()) {
                f = (Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, FloatSerializer.INSTANCE, null);
            } else {
                boolean z = true;
                int i2 = 0;
                f = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else {
                        if (decodeElementIndex != 0) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        f = (Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, FloatSerializer.INSTANCE, f);
                        i2 = 1;
                    }
                }
                i = i2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new l(i, f, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, l value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            l.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.l$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<l> serializer() {
            return a.f10553a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this((Float) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    @SerialName("opacity_rate")
    public static /* synthetic */ void c() {
    }

    /* renamed from: a, reason: from getter */
    public final Float getOpacityRate() {
        return this.opacityRate;
    }

    public final Float b() {
        return this.opacityRate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof l) && Intrinsics.areEqual((Object) this.opacityRate, (Object) ((l) other).opacityRate);
    }

    public int hashCode() {
        Float f = this.opacityRate;
        if (f == null) {
            return 0;
        }
        return f.hashCode();
    }

    public String toString() {
        return "CreativeRenderingCheckConfig(opacityRate=" + this.opacityRate + ')';
    }

    public /* synthetic */ l(int i, Float f, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.opacityRate = null;
        } else {
            this.opacityRate = f;
        }
    }

    public final l a(Float opacityRate) {
        return new l(opacityRate);
    }

    public static /* synthetic */ l a(l lVar, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = lVar.opacityRate;
        }
        return lVar.a(f);
    }

    public l(Float f) {
        this.opacityRate = f;
    }

    @JvmStatic
    public static final /* synthetic */ void a(l self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.opacityRate == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, FloatSerializer.INSTANCE, self.opacityRate);
    }

    public /* synthetic */ l(Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f);
    }
}
