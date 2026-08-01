package com.moloco.sdk.internal.ortb.model;

import androidx.compose.material.OutlinedTextFieldKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.moloco.sdk.internal.ortb.model.q;
import io.ktor.http.ContentDisposition;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002\u0014\u0017B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010*\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010\u001a¨\u0006."}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/o;", "", "", ContentDisposition.Parameters.Size, "", "appIconUri", "Lcom/moloco/sdk/internal/ortb/model/q;", OutlinedTextFieldKt.BorderId, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/q;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/q;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/o;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "c", "()Lcom/moloco/sdk/internal/ortb/model/q;", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/q;)Lcom/moloco/sdk/internal/ortb/model/o;", InAppPurchaseConstants.METHOD_TO_STRING, "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "h", "i", "()V", "Ljava/lang/String;", "d", "e", "Lcom/moloco/sdk/internal/ortb/model/q;", "f", "g", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class o {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Integer size;

    /* renamed from: b, reason: from kotlin metadata */
    public final String appIconUri;

    /* renamed from: c, reason: from kotlin metadata */
    public final q border;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements GeneratedSerializer<o> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10559a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f10559a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.DECAppIconSerializable", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement(ContentDisposition.Parameters.Size, true);
            pluginGeneratedSerialDescriptor.addElement("app_icon_url", true);
            pluginGeneratedSerialDescriptor.addElement(OutlinedTextFieldKt.BorderId, true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o deserialize(Decoder decoder) {
            int i;
            Integer num;
            String str;
            q qVar;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            Integer num2 = null;
            if (beginStructure.decodeSequentially()) {
                Integer num3 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, null);
                String str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, null);
                num = num3;
                qVar = (q) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, q.a.f10563a, null);
                str = str2;
                i = 7;
            } else {
                boolean z = true;
                int i2 = 0;
                String str3 = null;
                q qVar2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        num2 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num2);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str3);
                        i2 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        qVar2 = (q) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, q.a.f10563a, qVar2);
                        i2 |= 4;
                    }
                }
                i = i2;
                num = num2;
                str = str3;
                qVar = qVar2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new o(i, num, str, qVar, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(q.a.f10563a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, o value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            o.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.o$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<o> serializer() {
            return a.f10559a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public o() {
        this((Integer) null, (String) null, (q) null, 7, (DefaultConstructorMarker) null);
    }

    @SerialName("app_icon_url")
    public static /* synthetic */ void e() {
    }

    @SerialName(OutlinedTextFieldKt.BorderId)
    public static /* synthetic */ void g() {
    }

    @SerialName(ContentDisposition.Parameters.Size)
    public static /* synthetic */ void i() {
    }

    /* renamed from: a, reason: from getter */
    public final Integer getSize() {
        return this.size;
    }

    /* renamed from: b, reason: from getter */
    public final String getAppIconUri() {
        return this.appIconUri;
    }

    /* renamed from: c, reason: from getter */
    public final q getBorder() {
        return this.border;
    }

    public final String d() {
        return this.appIconUri;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof o)) {
            return false;
        }
        o oVar = (o) other;
        return Intrinsics.areEqual(this.size, oVar.size) && Intrinsics.areEqual(this.appIconUri, oVar.appIconUri) && Intrinsics.areEqual(this.border, oVar.border);
    }

    public final q f() {
        return this.border;
    }

    public final Integer h() {
        return this.size;
    }

    public int hashCode() {
        Integer num = this.size;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.appIconUri;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        q qVar = this.border;
        return hashCode2 + (qVar != null ? qVar.hashCode() : 0);
    }

    public String toString() {
        return "DECAppIconSerializable(size=" + this.size + ", appIconUri=" + this.appIconUri + ", border=" + this.border + ')';
    }

    public /* synthetic */ o(int i, Integer num, String str, q qVar, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.size = null;
        } else {
            this.size = num;
        }
        if ((i & 2) == 0) {
            this.appIconUri = null;
        } else {
            this.appIconUri = str;
        }
        if ((i & 4) == 0) {
            this.border = null;
        } else {
            this.border = qVar;
        }
    }

    public final o a(Integer size, String appIconUri, q border) {
        return new o(size, appIconUri, border);
    }

    public static /* synthetic */ o a(o oVar, Integer num, String str, q qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            num = oVar.size;
        }
        if ((i & 2) != 0) {
            str = oVar.appIconUri;
        }
        if ((i & 4) != 0) {
            qVar = oVar.border;
        }
        return oVar.a(num, str, qVar);
    }

    @JvmStatic
    public static final /* synthetic */ void a(o self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.size != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.size);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.appIconUri != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.appIconUri);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.border == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, q.a.f10563a, self.border);
    }

    public o(Integer num, String str, q qVar) {
        this.size = num;
        this.appIconUri = str;
        this.border = qVar;
    }

    public /* synthetic */ o(Integer num, String str, q qVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : qVar);
    }
}
