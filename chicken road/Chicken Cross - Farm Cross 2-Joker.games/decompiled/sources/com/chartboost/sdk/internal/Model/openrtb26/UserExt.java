package com.chartboost.sdk.internal.Model.openrtb26;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.U3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001a¨\u00061"}, d2 = {"Lcom/chartboost/sdk/internal/Model/openrtb26/UserExt;", "", "", "consentFlag", "impDepth", "", "sessionDuration", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ChartboostMonetization_9_13_0_release", "(Lcom/chartboost/sdk/internal/Model/openrtb26/UserExt;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/chartboost/sdk/internal/Model/openrtb26/UserExt;", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getConsentFlag", "getConsentFlag$annotations", "()V", "getImpDepth", "getImpDepth$annotations", "Ljava/lang/Long;", "getSessionDuration", "getSessionDuration$annotations", k.M, "a", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class UserExt {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer consentFlag;
    private final Integer impDepth;
    private final Long sessionDuration;

    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UserExt> serializer() {
            return a.f5119a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5119a;
        public static final SerialDescriptor b;

        static {
            a aVar = new a();
            f5119a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.UserExt", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement(U3.j.b0, true);
            pluginGeneratedSerialDescriptor.addElement("impdepth", true);
            pluginGeneratedSerialDescriptor.addElement("sessionduration", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserExt deserialize(Decoder decoder) {
            int i;
            Integer num;
            Integer num2;
            Long l;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            Integer num3 = null;
            if (beginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num4 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, intSerializer, null);
                num2 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, intSerializer, null);
                l = (Long) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, null);
                i = 7;
                num = num4;
            } else {
                boolean z = true;
                int i2 = 0;
                Integer num5 = null;
                Long l2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        num3 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num3);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        num5 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num5);
                        i2 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        l2 = (Long) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, l2);
                        i2 |= 4;
                    }
                }
                i = i2;
                num = num3;
                num2 = num5;
                l = l2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new UserExt(i, num, num2, l, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE)};
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
        public final void serialize(Encoder encoder, UserExt value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            UserExt.write$Self$ChartboostMonetization_9_13_0_release(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    public UserExt() {
        this((Integer) null, (Integer) null, (Long) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserExt copy$default(UserExt userExt, Integer num, Integer num2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            num = userExt.consentFlag;
        }
        if ((i & 2) != 0) {
            num2 = userExt.impDepth;
        }
        if ((i & 4) != 0) {
            l = userExt.sessionDuration;
        }
        return userExt.copy(num, num2, l);
    }

    @SerialName(U3.j.b0)
    public static /* synthetic */ void getConsentFlag$annotations() {
    }

    @SerialName("impdepth")
    public static /* synthetic */ void getImpDepth$annotations() {
    }

    @SerialName("sessionduration")
    public static /* synthetic */ void getSessionDuration$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$ChartboostMonetization_9_13_0_release(UserExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.consentFlag != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.consentFlag);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.impDepth != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.impDepth);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.sessionDuration == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.sessionDuration);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getConsentFlag() {
        return this.consentFlag;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getImpDepth() {
        return this.impDepth;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getSessionDuration() {
        return this.sessionDuration;
    }

    public final UserExt copy(Integer consentFlag, Integer impDepth, Long sessionDuration) {
        return new UserExt(consentFlag, impDepth, sessionDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserExt)) {
            return false;
        }
        UserExt userExt = (UserExt) other;
        return Intrinsics.areEqual(this.consentFlag, userExt.consentFlag) && Intrinsics.areEqual(this.impDepth, userExt.impDepth) && Intrinsics.areEqual(this.sessionDuration, userExt.sessionDuration);
    }

    public final Integer getConsentFlag() {
        return this.consentFlag;
    }

    public final Integer getImpDepth() {
        return this.impDepth;
    }

    public final Long getSessionDuration() {
        return this.sessionDuration;
    }

    public int hashCode() {
        Integer num = this.consentFlag;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.impDepth;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.sessionDuration;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "UserExt(consentFlag=" + this.consentFlag + ", impDepth=" + this.impDepth + ", sessionDuration=" + this.sessionDuration + ")";
    }

    public /* synthetic */ UserExt(int i, Integer num, Integer num2, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.consentFlag = null;
        } else {
            this.consentFlag = num;
        }
        if ((i & 2) == 0) {
            this.impDepth = null;
        } else {
            this.impDepth = num2;
        }
        if ((i & 4) == 0) {
            this.sessionDuration = null;
        } else {
            this.sessionDuration = l;
        }
    }

    public UserExt(Integer num, Integer num2, Long l) {
        this.consentFlag = num;
        this.impDepth = num2;
        this.sessionDuration = l;
    }

    public /* synthetic */ UserExt(Integer num, Integer num2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : l);
    }
}
