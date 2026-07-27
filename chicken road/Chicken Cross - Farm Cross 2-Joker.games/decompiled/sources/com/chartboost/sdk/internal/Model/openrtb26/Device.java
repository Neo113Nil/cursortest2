package com.chartboost.sdk.internal.Model.openrtb26;

import com.chartboost.sdk.internal.Model.openrtb26.DeviceExt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.C4761z5;
import com.ironsource.L6;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b(\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0002dcB»\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B±\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010'J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010'J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u0010'J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010%J\u0012\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b4\u0010'J\u0012\u00105\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b5\u00106JÄ\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b9\u0010'J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b>\u0010?R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010@\u0012\u0004\bB\u0010C\u001a\u0004\bA\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010D\u0012\u0004\bF\u0010C\u001a\u0004\bE\u0010'R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010@\u0012\u0004\bH\u0010C\u001a\u0004\bG\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010D\u0012\u0004\bJ\u0010C\u001a\u0004\bI\u0010'R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010D\u0012\u0004\bL\u0010C\u001a\u0004\bK\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010D\u0012\u0004\bN\u0010C\u001a\u0004\bM\u0010'R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010D\u0012\u0004\bP\u0010C\u001a\u0004\bO\u0010'R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bR\u0010C\u001a\u0004\bQ\u0010%R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010@\u0012\u0004\bT\u0010C\u001a\u0004\bS\u0010%R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010U\u0012\u0004\bW\u0010C\u001a\u0004\bV\u00100R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010D\u0012\u0004\bY\u0010C\u001a\u0004\bX\u0010'R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010D\u0012\u0004\b[\u0010C\u001a\u0004\bZ\u0010'R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010@\u0012\u0004\b]\u0010C\u001a\u0004\b\\\u0010%R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010D\u0012\u0004\b_\u0010C\u001a\u0004\b^\u0010'R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010`\u0012\u0004\bb\u0010C\u001a\u0004\ba\u00106¨\u0006e"}, d2 = {"Lcom/chartboost/sdk/internal/Model/openrtb26/Device;", "", "", "lmt", "", L6.d0, "deviceType", L6.t, "model", L6.F, "osv", "h", "w", "", "pxRatio", "language", L6.R0, "connectionType", "ifa", "Lcom/chartboost/sdk/internal/Model/openrtb26/DeviceExt;", "ext", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/chartboost/sdk/internal/Model/openrtb26/DeviceExt;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/chartboost/sdk/internal/Model/openrtb26/DeviceExt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ChartboostMonetization_9_13_0_release", "(Lcom/chartboost/sdk/internal/Model/openrtb26/Device;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Float;", "component11", "component12", "component13", "component14", "component15", "()Lcom/chartboost/sdk/internal/Model/openrtb26/DeviceExt;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/chartboost/sdk/internal/Model/openrtb26/DeviceExt;)Lcom/chartboost/sdk/internal/Model/openrtb26/Device;", InAppPurchaseConstants.METHOD_TO_STRING, "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getLmt", "getLmt$annotations", "()V", "Ljava/lang/String;", "getUa", "getUa$annotations", "getDeviceType", "getDeviceType$annotations", "getMake", "getMake$annotations", "getModel", "getModel$annotations", "getOs", "getOs$annotations", "getOsv", "getOsv$annotations", "getH", "getH$annotations", "getW", "getW$annotations", "Ljava/lang/Float;", "getPxRatio", "getPxRatio$annotations", "getLanguage", "getLanguage$annotations", "getCarrier", "getCarrier$annotations", "getConnectionType", "getConnectionType$annotations", "getIfa", "getIfa$annotations", "Lcom/chartboost/sdk/internal/Model/openrtb26/DeviceExt;", "getExt", "getExt$annotations", k.M, "a", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class Device {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String carrier;
    private final Integer connectionType;
    private final Integer deviceType;
    private final DeviceExt ext;
    private final Integer h;
    private final String ifa;
    private final String language;
    private final Integer lmt;
    private final String make;
    private final String model;
    private final String os;
    private final String osv;
    private final Float pxRatio;
    private final String ua;
    private final Integer w;

    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<Device> serializer() {
            return a.f5114a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class a implements GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5114a;
        public static final SerialDescriptor b;

        static {
            a aVar = new a();
            f5114a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.Device", aVar, 15);
            pluginGeneratedSerialDescriptor.addElement("lmt", true);
            pluginGeneratedSerialDescriptor.addElement(L6.d0, true);
            pluginGeneratedSerialDescriptor.addElement("devicetype", true);
            pluginGeneratedSerialDescriptor.addElement(L6.t, true);
            pluginGeneratedSerialDescriptor.addElement("model", true);
            pluginGeneratedSerialDescriptor.addElement(L6.F, true);
            pluginGeneratedSerialDescriptor.addElement("osv", true);
            pluginGeneratedSerialDescriptor.addElement("h", true);
            pluginGeneratedSerialDescriptor.addElement("w", true);
            pluginGeneratedSerialDescriptor.addElement("pxratio", true);
            pluginGeneratedSerialDescriptor.addElement("language", true);
            pluginGeneratedSerialDescriptor.addElement(L6.R0, true);
            pluginGeneratedSerialDescriptor.addElement(C4761z5.e, true);
            pluginGeneratedSerialDescriptor.addElement("ifa", true);
            pluginGeneratedSerialDescriptor.addElement("ext", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Device deserialize(Decoder decoder) {
            String str;
            Integer num;
            String str2;
            DeviceExt deviceExt;
            int i;
            String str3;
            Float f;
            Integer num2;
            Integer num3;
            String str4;
            String str5;
            String str6;
            Integer num4;
            String str7;
            Integer num5;
            String str8;
            Integer num6;
            DeviceExt deviceExt2;
            Integer num7;
            String str9;
            DeviceExt deviceExt3;
            String str10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            if (beginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num8 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, intSerializer, null);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str11 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
                Integer num9 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
                String str12 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
                String str13 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
                String str14 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
                String str15 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
                Integer num10 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, intSerializer, null);
                Integer num11 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, intSerializer, null);
                Float f2 = (Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, FloatSerializer.INSTANCE, null);
                String str16 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
                str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
                Integer num12 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, intSerializer, null);
                str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
                deviceExt = (DeviceExt) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, DeviceExt.a.f5115a, null);
                i = 32767;
                str5 = str16;
                str3 = str11;
                num = num12;
                f = f2;
                num3 = num8;
                num4 = num10;
                num2 = num9;
                num5 = num11;
                str6 = str15;
                str8 = str12;
                str = str14;
                str7 = str13;
            } else {
                boolean z = true;
                String str17 = null;
                DeviceExt deviceExt4 = null;
                String str18 = null;
                String str19 = null;
                Float f3 = null;
                Integer num13 = null;
                Integer num14 = null;
                str = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                Integer num15 = null;
                String str23 = null;
                Integer num16 = null;
                int i2 = 0;
                Integer num17 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            num6 = num17;
                            deviceExt2 = deviceExt4;
                            num7 = num16;
                            str9 = str17;
                            z = false;
                            deviceExt4 = deviceExt2;
                            str17 = str9;
                            num16 = num7;
                            num17 = num6;
                        case 0:
                            num6 = num17;
                            deviceExt2 = deviceExt4;
                            Integer num18 = num16;
                            str9 = str17;
                            num7 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num18);
                            i2 |= 1;
                            deviceExt4 = deviceExt2;
                            str17 = str9;
                            num16 = num7;
                            num17 = num6;
                        case 1:
                            str18 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str18);
                            i2 |= 2;
                            deviceExt4 = deviceExt4;
                            num17 = num17;
                        case 2:
                            deviceExt3 = deviceExt4;
                            str10 = str18;
                            num17 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num17);
                            i2 |= 4;
                            deviceExt4 = deviceExt3;
                            str18 = str10;
                        case 3:
                            deviceExt3 = deviceExt4;
                            str10 = str18;
                            str17 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str17);
                            i2 |= 8;
                            deviceExt4 = deviceExt3;
                            str18 = str10;
                        case 4:
                            deviceExt3 = deviceExt4;
                            str10 = str18;
                            str22 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str22);
                            i2 |= 16;
                            deviceExt4 = deviceExt3;
                            str18 = str10;
                        case 5:
                            deviceExt3 = deviceExt4;
                            str10 = str18;
                            str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str);
                            i2 |= 32;
                            deviceExt4 = deviceExt3;
                            str18 = str10;
                        case 6:
                            deviceExt3 = deviceExt4;
                            str10 = str18;
                            str21 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str21);
                            i2 |= 64;
                            deviceExt4 = deviceExt3;
                            str18 = str10;
                        case 7:
                            deviceExt3 = deviceExt4;
                            str10 = str18;
                            num14 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, num14);
                            i2 |= 128;
                            deviceExt4 = deviceExt3;
                            str18 = str10;
                        case 8:
                            deviceExt3 = deviceExt4;
                            str10 = str18;
                            num13 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, num13);
                            i2 |= 256;
                            deviceExt4 = deviceExt3;
                            str18 = str10;
                        case 9:
                            deviceExt3 = deviceExt4;
                            str10 = str18;
                            f3 = (Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, FloatSerializer.INSTANCE, f3);
                            i2 |= 512;
                            deviceExt4 = deviceExt3;
                            str18 = str10;
                        case 10:
                            deviceExt3 = deviceExt4;
                            str10 = str18;
                            str20 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str20);
                            i2 |= 1024;
                            deviceExt4 = deviceExt3;
                            str18 = str10;
                        case 11:
                            deviceExt3 = deviceExt4;
                            str10 = str18;
                            str19 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str19);
                            i2 |= 2048;
                            deviceExt4 = deviceExt3;
                            str18 = str10;
                        case 12:
                            str10 = str18;
                            num15 = (Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, num15);
                            i2 |= 4096;
                            deviceExt4 = deviceExt4;
                            str23 = str23;
                            str18 = str10;
                        case 13:
                            str10 = str18;
                            deviceExt3 = deviceExt4;
                            str23 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str23);
                            i2 |= 8192;
                            deviceExt4 = deviceExt3;
                            str18 = str10;
                        case 14:
                            deviceExt4 = (DeviceExt) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, DeviceExt.a.f5115a, deviceExt4);
                            i2 |= 16384;
                            str18 = str18;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                num = num15;
                str2 = str19;
                deviceExt = deviceExt4;
                i = i2;
                str3 = str18;
                f = f3;
                num2 = num17;
                num3 = num16;
                str4 = str23;
                str5 = str20;
                str6 = str21;
                num4 = num14;
                str7 = str22;
                num5 = num13;
                str8 = str17;
            }
            beginStructure.endStructure(serialDescriptor);
            return new Device(i, num3, str3, num2, str8, str7, str, str6, num4, num5, f, str5, str2, num, str4, deviceExt, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer[] childSerializers() {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            KSerializer nullable = BuiltinSerializersKt.getNullable(intSerializer);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(DeviceExt.a.f5115a)};
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
        public final void serialize(Encoder encoder, Device value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = b;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            Device.write$Self$ChartboostMonetization_9_13_0_release(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    public Device() {
        this((Integer) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Float) null, (String) null, (String) null, (Integer) null, (String) null, (DeviceExt) null, 32767, (DefaultConstructorMarker) null);
    }

    @SerialName(L6.R0)
    public static /* synthetic */ void getCarrier$annotations() {
    }

    @SerialName(C4761z5.e)
    public static /* synthetic */ void getConnectionType$annotations() {
    }

    @SerialName("devicetype")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @SerialName("ext")
    public static /* synthetic */ void getExt$annotations() {
    }

    @SerialName("h")
    public static /* synthetic */ void getH$annotations() {
    }

    @SerialName("ifa")
    public static /* synthetic */ void getIfa$annotations() {
    }

    @SerialName("language")
    public static /* synthetic */ void getLanguage$annotations() {
    }

    @SerialName("lmt")
    public static /* synthetic */ void getLmt$annotations() {
    }

    @SerialName(L6.t)
    public static /* synthetic */ void getMake$annotations() {
    }

    @SerialName("model")
    public static /* synthetic */ void getModel$annotations() {
    }

    @SerialName(L6.F)
    public static /* synthetic */ void getOs$annotations() {
    }

    @SerialName("osv")
    public static /* synthetic */ void getOsv$annotations() {
    }

    @SerialName("pxratio")
    public static /* synthetic */ void getPxRatio$annotations() {
    }

    @SerialName(L6.d0)
    public static /* synthetic */ void getUa$annotations() {
    }

    @SerialName("w")
    public static /* synthetic */ void getW$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$ChartboostMonetization_9_13_0_release(Device self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.lmt != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.lmt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ua != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.ua);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.deviceType != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.deviceType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.make != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.make);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.model != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.model);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.os != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.os);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.osv != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.osv);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.h != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, IntSerializer.INSTANCE, self.h);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.w != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, IntSerializer.INSTANCE, self.w);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.pxRatio != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, FloatSerializer.INSTANCE, self.pxRatio);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.language != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.language);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.carrier != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.carrier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.connectionType != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, IntSerializer.INSTANCE, self.connectionType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.ifa != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.ifa);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 14) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 14, DeviceExt.a.f5115a, self.ext);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getLmt() {
        return this.lmt;
    }

    /* renamed from: component10, reason: from getter */
    public final Float getPxRatio() {
        return this.pxRatio;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component12, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getConnectionType() {
        return this.connectionType;
    }

    /* renamed from: component14, reason: from getter */
    public final String getIfa() {
        return this.ifa;
    }

    /* renamed from: component15, reason: from getter */
    public final DeviceExt getExt() {
        return this.ext;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUa() {
        return this.ua;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMake() {
        return this.make;
    }

    /* renamed from: component5, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOsv() {
        return this.osv;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getH() {
        return this.h;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getW() {
        return this.w;
    }

    public final Device copy(Integer lmt, String ua, Integer deviceType, String make, String model, String os, String osv, Integer h, Integer w, Float pxRatio, String language, String carrier, Integer connectionType, String ifa, DeviceExt ext) {
        return new Device(lmt, ua, deviceType, make, model, os, osv, h, w, pxRatio, language, carrier, connectionType, ifa, ext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Device)) {
            return false;
        }
        Device device = (Device) other;
        return Intrinsics.areEqual(this.lmt, device.lmt) && Intrinsics.areEqual(this.ua, device.ua) && Intrinsics.areEqual(this.deviceType, device.deviceType) && Intrinsics.areEqual(this.make, device.make) && Intrinsics.areEqual(this.model, device.model) && Intrinsics.areEqual(this.os, device.os) && Intrinsics.areEqual(this.osv, device.osv) && Intrinsics.areEqual(this.h, device.h) && Intrinsics.areEqual(this.w, device.w) && Intrinsics.areEqual((Object) this.pxRatio, (Object) device.pxRatio) && Intrinsics.areEqual(this.language, device.language) && Intrinsics.areEqual(this.carrier, device.carrier) && Intrinsics.areEqual(this.connectionType, device.connectionType) && Intrinsics.areEqual(this.ifa, device.ifa) && Intrinsics.areEqual(this.ext, device.ext);
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final Integer getConnectionType() {
        return this.connectionType;
    }

    public final Integer getDeviceType() {
        return this.deviceType;
    }

    public final DeviceExt getExt() {
        return this.ext;
    }

    public final Integer getH() {
        return this.h;
    }

    public final String getIfa() {
        return this.ifa;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getLmt() {
        return this.lmt;
    }

    public final String getMake() {
        return this.make;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final Float getPxRatio() {
        return this.pxRatio;
    }

    public final String getUa() {
        return this.ua;
    }

    public final Integer getW() {
        return this.w;
    }

    public int hashCode() {
        Integer num = this.lmt;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.ua;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.deviceType;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.make;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.model;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.os;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.osv;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.h;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.w;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f = this.pxRatio;
        int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
        String str6 = this.language;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.carrier;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num5 = this.connectionType;
        int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str8 = this.ifa;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        DeviceExt deviceExt = this.ext;
        return hashCode14 + (deviceExt != null ? deviceExt.hashCode() : 0);
    }

    public String toString() {
        return "Device(lmt=" + this.lmt + ", ua=" + this.ua + ", deviceType=" + this.deviceType + ", make=" + this.make + ", model=" + this.model + ", os=" + this.os + ", osv=" + this.osv + ", h=" + this.h + ", w=" + this.w + ", pxRatio=" + this.pxRatio + ", language=" + this.language + ", carrier=" + this.carrier + ", connectionType=" + this.connectionType + ", ifa=" + this.ifa + ", ext=" + this.ext + ")";
    }

    public /* synthetic */ Device(int i, Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, Integer num3, Integer num4, Float f, String str6, String str7, Integer num5, String str8, DeviceExt deviceExt, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i & 2) == 0) {
            this.ua = null;
        } else {
            this.ua = str;
        }
        if ((i & 4) == 0) {
            this.deviceType = null;
        } else {
            this.deviceType = num2;
        }
        if ((i & 8) == 0) {
            this.make = null;
        } else {
            this.make = str2;
        }
        if ((i & 16) == 0) {
            this.model = null;
        } else {
            this.model = str3;
        }
        if ((i & 32) == 0) {
            this.os = null;
        } else {
            this.os = str4;
        }
        if ((i & 64) == 0) {
            this.osv = null;
        } else {
            this.osv = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num3;
        }
        if ((i & 256) == 0) {
            this.w = null;
        } else {
            this.w = num4;
        }
        if ((i & 512) == 0) {
            this.pxRatio = null;
        } else {
            this.pxRatio = f;
        }
        if ((i & 1024) == 0) {
            this.language = null;
        } else {
            this.language = str6;
        }
        if ((i & 2048) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str7;
        }
        if ((i & 4096) == 0) {
            this.connectionType = null;
        } else {
            this.connectionType = num5;
        }
        if ((i & 8192) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str8;
        }
        if ((i & 16384) == 0) {
            this.ext = null;
        } else {
            this.ext = deviceExt;
        }
    }

    public Device(Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, Integer num3, Integer num4, Float f, String str6, String str7, Integer num5, String str8, DeviceExt deviceExt) {
        this.lmt = num;
        this.ua = str;
        this.deviceType = num2;
        this.make = str2;
        this.model = str3;
        this.os = str4;
        this.osv = str5;
        this.h = num3;
        this.w = num4;
        this.pxRatio = f;
        this.language = str6;
        this.carrier = str7;
        this.connectionType = num5;
        this.ifa = str8;
        this.ext = deviceExt;
    }

    public /* synthetic */ Device(Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, Integer num3, Integer num4, Float f, String str6, String str7, Integer num5, String str8, DeviceExt deviceExt, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : f, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : num5, (i & 8192) != 0 ? null : str8, (i & 16384) == 0 ? deviceExt : null);
    }
}
