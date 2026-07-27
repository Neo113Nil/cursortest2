package com.moloco.sdk.internal.ortb.model;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4561o2;
import com.ironsource.C4761z5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.internal.ortb.model.C4783f;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0001\u0018\u0000 32\u00020\u0001:\u0002\u001a\u001eB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fBi\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010 \u0012\u0004\b#\u0010\u001f\u001a\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001c\u0012\u0004\b&\u0010\u001f\u001a\u0004\b%\u0010\u001dR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010\u001f\u001a\u0004\b)\u0010*R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001c\u0012\u0004\b\r\u0010\u001f\u001a\u0004\b,\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001c\u0012\u0004\b'\u0010\u001f\u001a\u0004\b$\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010\u001f\u001a\u0004\b.\u0010/R\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010-\u0012\u0004\b2\u0010\u001f\u001a\u0004\b1\u0010/¨\u00064"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/e;", "", "", "adm", "", "price", C4561o2.y, "Lcom/moloco/sdk/internal/ortb/model/f;", "ext", "crid", "bundle", "", "w", "h", "<init>", "(Ljava/lang/String;FLjava/lang/String;Lcom/moloco/sdk/internal/ortb/model/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;FLjava/lang/String;Lcom/moloco/sdk/internal/ortb/model/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/e;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "()V", "F", InneractiveMediationDefs.GENDER_MALE, "()F", C4761z5.q, "c", "e", "f", "d", "Lcom/moloco/sdk/internal/ortb/model/f;", "i", "()Lcom/moloco/sdk/internal/ortb/model/f;", com.mbridge.msdk.foundation.same.report.j.b, "g", "Ljava/lang/Integer;", "o", "()Ljava/lang/Integer;", "p", CampaignEx.JSON_KEY_AD_K, CmcdData.Factory.STREAM_TYPE_LIVE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* renamed from: com.moloco.sdk.internal.ortb.model.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4782e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String adm;

    /* renamed from: b, reason: from kotlin metadata */
    public final float price;

    /* renamed from: c, reason: from kotlin metadata */
    public final String burl;

    /* renamed from: d, reason: from kotlin metadata */
    public final C4783f ext;

    /* renamed from: e, reason: from kotlin metadata */
    public final String crid;

    /* renamed from: f, reason: from kotlin metadata */
    public final String bundle;

    /* renamed from: g, reason: from kotlin metadata */
    public final Integer w;
    public final Integer h;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    /* renamed from: com.moloco.sdk.internal.ortb.model.e$a */
    public /* synthetic */ class a implements GeneratedSerializer<C4782e> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10541a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f10541a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.Bid", aVar, 8);
            pluginGeneratedSerialDescriptor.addElement("adm", false);
            pluginGeneratedSerialDescriptor.addElement("price", false);
            pluginGeneratedSerialDescriptor.addElement(C4561o2.y, true);
            pluginGeneratedSerialDescriptor.addElement("ext", false);
            pluginGeneratedSerialDescriptor.addElement("crid", true);
            pluginGeneratedSerialDescriptor.addElement("bundle", true);
            pluginGeneratedSerialDescriptor.addElement("w", true);
            pluginGeneratedSerialDescriptor.addElement("h", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4782e deserialize(Decoder decoder) {
            Integer num;
            int i;
            String str;
            String str2;
            Integer num2;
            String str3;
            C4783f c4783f;
            String str4;
            float f;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            int i2 = 7;
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
                float decodeFloatElement = beginStructure.decodeFloatElement(serialDescriptor, 1);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
                C4783f c4783f2 = (C4783f) beginStructure.decodeSerializableElement(serialDescriptor, 3, C4783f.a.f10543a, null);
                String str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
                String str7 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num3 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
                num = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, intSerializer, null);
                num2 = num3;
                str4 = str7;
                c4783f = c4783f2;
                str2 = str6;
                str = str5;
                i = 255;
                f = decodeFloatElement;
                str3 = decodeStringElement;
            } else {
                float f2 = 0.0f;
                boolean z = true;
                Integer num4 = null;
                Integer num5 = null;
                String str8 = null;
                String str9 = null;
                C4783f c4783f3 = null;
                String str10 = null;
                int i3 = 0;
                String str11 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                        case 0:
                            i3 |= 1;
                            str8 = beginStructure.decodeStringElement(serialDescriptor, 0);
                            i2 = 7;
                        case 1:
                            f2 = beginStructure.decodeFloatElement(serialDescriptor, 1);
                            i3 |= 2;
                            i2 = 7;
                        case 2:
                            str9 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str9);
                            i3 |= 4;
                            i2 = 7;
                        case 3:
                            c4783f3 = (C4783f) beginStructure.decodeSerializableElement(serialDescriptor, 3, C4783f.a.f10543a, c4783f3);
                            i3 |= 8;
                            i2 = 7;
                        case 4:
                            str10 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str10);
                            i3 |= 16;
                        case 5:
                            str11 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str11);
                            i3 |= 32;
                        case 6:
                            num5 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num5);
                            i3 |= 64;
                        case 7:
                            num4 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IntSerializer.INSTANCE, num4);
                            i3 |= 128;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                num = num4;
                i = i3;
                str = str9;
                str2 = str10;
                num2 = num5;
                str3 = str8;
                c4783f = c4783f3;
                str4 = str11;
                f = f2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new C4782e(i, str3, f, str, c4783f, str2, str4, num2, num, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            KSerializer<?> nullable = BuiltinSerializersKt.getNullable(stringSerializer);
            KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
            KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, FloatSerializer.INSTANCE, nullable, C4783f.a.f10543a, nullable2, nullable3, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, C4782e value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            C4782e.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.e$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<C4782e> serializer() {
            return a.f10541a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C4782e(int i2, String str, float f, String str2, C4783f c4783f, String str3, String str4, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i2 & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 11, a.f10541a.getDescriptor());
        }
        this.adm = str;
        this.price = f;
        if ((i2 & 4) == 0) {
            this.burl = null;
        } else {
            this.burl = str2;
        }
        this.ext = c4783f;
        if ((i2 & 16) == 0) {
            this.crid = null;
        } else {
            this.crid = str3;
        }
        if ((i2 & 32) == 0) {
            this.bundle = null;
        } else {
            this.bundle = str4;
        }
        if ((i2 & 64) == 0) {
            this.w = null;
        } else {
            this.w = num;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void a(C4782e self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.adm);
        output.encodeFloatElement(serialDesc, 1, self.price);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.burl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.burl);
        }
        output.encodeSerializableElement(serialDesc, 3, C4783f.a.f10543a, self.ext);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.crid != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.crid);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.bundle != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.bundle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.w != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.w);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.h == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, IntSerializer.INSTANCE, self.h);
    }

    @SerialName("adm")
    public static /* synthetic */ void b() {
    }

    @SerialName("bundle")
    public static /* synthetic */ void d() {
    }

    @SerialName(C4561o2.y)
    public static /* synthetic */ void f() {
    }

    @SerialName("crid")
    public static /* synthetic */ void h() {
    }

    @SerialName("ext")
    public static /* synthetic */ void j() {
    }

    @SerialName("h")
    public static /* synthetic */ void l() {
    }

    @SerialName("price")
    public static /* synthetic */ void n() {
    }

    @SerialName("w")
    public static /* synthetic */ void p() {
    }

    /* renamed from: c, reason: from getter */
    public final String getBundle() {
        return this.bundle;
    }

    /* renamed from: e, reason: from getter */
    public final String getBurl() {
        return this.burl;
    }

    /* renamed from: g, reason: from getter */
    public final String getCrid() {
        return this.crid;
    }

    /* renamed from: i, reason: from getter */
    public final C4783f getExt() {
        return this.ext;
    }

    /* renamed from: k, reason: from getter */
    public final Integer getH() {
        return this.h;
    }

    /* renamed from: m, reason: from getter */
    public final float getPrice() {
        return this.price;
    }

    /* renamed from: o, reason: from getter */
    public final Integer getW() {
        return this.w;
    }

    /* renamed from: a, reason: from getter */
    public final String getAdm() {
        return this.adm;
    }

    public C4782e(String adm, float f, String str, C4783f ext, String str2, String str3, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(ext, "ext");
        this.adm = adm;
        this.price = f;
        this.burl = str;
        this.ext = ext;
        this.crid = str2;
        this.bundle = str3;
        this.w = num;
        this.h = num2;
    }

    public /* synthetic */ C4782e(String str, float f, String str2, C4783f c4783f, String str3, String str4, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, (i2 & 4) != 0 ? null : str2, c4783f, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : num2);
    }
}
