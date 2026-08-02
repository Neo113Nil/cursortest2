package com.miteksystems.misnap.core.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", com.miteksystems.misnap.core.MibiData.KEY_DEVICE_INFO}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DeviceInfoProvider {

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 32\u00020\u0001:\u0003435B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u001bR \u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u001d"}, d2 = {"Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo;", "", "", "id", "", "timestamp", "Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals;", com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME, "<init>", "(Ljava/lang/String;JLcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;JLcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "()J", "component3", "()Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals;", "copy", "(Ljava/lang/String;JLcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals;)Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "getId$annotations", "()V", util.h.xy.cb.b.f1091, "J", "getTimestamp", "getTimestamp$annotations", "c", "Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals;", "getAndroid", "getAndroid$annotations", "Companion", "$serializer", "Signals"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class DeviceInfo {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Companion INSTANCE = new com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String id;

        /* renamed from: b, reason: from kotlin metadata */
        private final long timestamp;

        /* renamed from: c, reason: from kotlin metadata */
        private final com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals android;

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000232B7\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010#\u001a\u00020\t\u0012\u0006\u0010'\u001a\u00020\t\u0012\u0006\u0010+\u001a\u00020\t¢\u0006\u0004\b,\u0010-Ba\b\u0017\u0012\u0006\u0010.\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\t\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b,\u00101J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R \u0010\u001b\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001d\u0010\u0012R \u0010#\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0010\u0012\u0004\b\"\u0010\u0014\u001a\u0004\b!\u0010\u0012R \u0010'\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u0010\u0012\u0004\b&\u0010\u0014\u001a\u0004\b%\u0010\u0012R \u0010+\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010\u0010\u0012\u0004\b*\u0010\u0014\u001a\u0004\b)\u0010\u0012¨\u00064"}, d2 = {"Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getOsVersion", "()Ljava/lang/String;", "getOsVersion$annotations", "()V", "osVersion", util.h.xy.cb.b.f1091, com.visa.cbp.getEncExpo.warmup, "getSdkLevel", "()I", "getSdkLevel$annotations", "sdkLevel", "c", "getTimeZone", "getTimeZone$annotations", "timeZone", "d", "getDevice", "getDevice$annotations", "device", "e", "getManufacturer", "getManufacturer$annotations", "manufacturer", "f", "getModel", "getModel$annotations", "model", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0})
        @kotlinx.serialization.Serializable
        public static final /* data */ class Signals {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals.Companion INSTANCE = new com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals.Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final java.lang.String osVersion;

            /* renamed from: b, reason: from kotlin metadata */
            private final int sdkLevel;

            /* renamed from: c, reason: from kotlin metadata */
            private final java.lang.String timeZone;

            /* renamed from: d, reason: from kotlin metadata */
            private final java.lang.String device;

            /* renamed from: e, reason: from kotlin metadata */
            private final java.lang.String manufacturer;

            /* renamed from: f, reason: from kotlin metadata */
            private final java.lang.String model;

            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ Signals(int i, @kotlinx.serialization.SerialName("osVersion") java.lang.String str, @kotlinx.serialization.SerialName("sdkLevel") int i2, @kotlinx.serialization.SerialName("timeZone") java.lang.String str2, @kotlinx.serialization.SerialName("device") java.lang.String str3, @kotlinx.serialization.SerialName("manufacturer") java.lang.String str4, @kotlinx.serialization.SerialName("model") java.lang.String str5, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (63 != (i & 63)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 63, com.miteksystems.misnap.core.internal.DeviceInfoProvider$DeviceInfo$Signals$$serializer.INSTANCE.getDescriptor());
                }
                this.osVersion = str;
                this.sdkLevel = i2;
                this.timeZone = str2;
                this.device = str3;
                this.manufacturer = str4;
                this.model = str5;
            }

            public Signals(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
                this.osVersion = str;
                this.sdkLevel = i;
                this.timeZone = str2;
                this.device = str3;
                this.manufacturer = str4;
                this.model = str5;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Signals(osVersion=");
                sb.append(this.osVersion);
                sb.append(", sdkLevel=");
                sb.append(this.sdkLevel);
                sb.append(", timeZone=");
                sb.append(this.timeZone);
                sb.append(", device=");
                sb.append(this.device);
                sb.append(", manufacturer=");
                sb.append(this.manufacturer);
                sb.append(", model=");
                sb.append(this.model);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return (((((((((this.osVersion.hashCode() * 31) + java.lang.Integer.hashCode(this.sdkLevel)) * 31) + this.timeZone.hashCode()) * 31) + this.device.hashCode()) * 31) + this.manufacturer.hashCode()) * 31) + this.model.hashCode();
            }

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals> serializer() {
                    return com.miteksystems.misnap.core.internal.DeviceInfoProvider$DeviceInfo$Signals$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals)) {
                    return false;
                }
                com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals signals = (com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.osVersion, signals.osVersion) && this.sdkLevel == signals.sdkLevel && kotlin.jvm.internal.Intrinsics.areEqual(this.timeZone, signals.timeZone) && kotlin.jvm.internal.Intrinsics.areEqual(this.device, signals.device) && kotlin.jvm.internal.Intrinsics.areEqual(this.manufacturer, signals.manufacturer) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, signals.model);
            }

            @kotlin.jvm.JvmStatic
            public static final void a(com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                output.encodeStringElement(serialDesc, 0, self.osVersion);
                output.encodeIntElement(serialDesc, 1, self.sdkLevel);
                output.encodeStringElement(serialDesc, 2, self.timeZone);
                output.encodeStringElement(serialDesc, 3, self.device);
                output.encodeStringElement(serialDesc, 4, self.manufacturer);
                output.encodeStringElement(serialDesc, 5, self.model);
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ DeviceInfo(int i, @kotlinx.serialization.SerialName("id") java.lang.String str, @kotlinx.serialization.SerialName("timestamp") long j, @kotlinx.serialization.SerialName("android") com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals signals, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.miteksystems.misnap.core.internal.DeviceInfoProvider$DeviceInfo$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.timestamp = j;
            this.android = signals;
        }

        @kotlinx.serialization.SerialName(com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME)
        public static /* synthetic */ void getAndroid$annotations() {
        }

        @kotlinx.serialization.SerialName("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @kotlinx.serialization.SerialName("timestamp")
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        public DeviceInfo(java.lang.String str, long j, com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals signals) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signals, "");
            this.id = str;
            this.timestamp = j;
            this.android = signals;
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "a", "(Lkotlinx/serialization/json/JsonBuilder;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit> {
            public static final com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.a Camera2StreamConfigurationMap = new com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.a();

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
                kotlinx.serialization.json.JsonBuilder jsonBuilder2 = jsonBuilder;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder2, "");
                jsonBuilder2.setIgnoreUnknownKeys(true);
                jsonBuilder2.setEncodeDefaults(true);
                return kotlin.Unit.INSTANCE;
            }

            a() {
                super(1);
            }
        }

        public final java.lang.String toString() {
            kotlinx.serialization.json.Json Json$default = kotlinx.serialization.json.JsonKt.Json$default(null, com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.a.Camera2StreamConfigurationMap, 1, null);
            Json$default.getSerializersModule();
            return Json$default.encodeToString(INSTANCE.serializer(), this);
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + java.lang.Long.hashCode(this.timestamp)) * 31) + this.android.hashCode();
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals getAndroid() {
            return this.android;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo)) {
                return false;
            }
            com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo deviceInfo = (com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, deviceInfo.id) && this.timestamp == deviceInfo.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.android, deviceInfo.android);
        }

        public final com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo copy(java.lang.String id, long timestamp, com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals android2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(android2, "");
            return new com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo(id, timestamp, android2);
        }

        /* renamed from: component3, reason: from getter */
        public final com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals getAndroid() {
            return this.android;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            output.encodeStringElement(serialDesc, 0, self.id);
            output.encodeLongElement(serialDesc, 1, self.timestamp);
            output.encodeSerializableElement(serialDesc, 2, com.miteksystems.misnap.core.internal.DeviceInfoProvider$DeviceInfo$Signals$$serializer.INSTANCE, self.android);
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo> serializer() {
                return com.miteksystems.misnap.core.internal.DeviceInfoProvider$DeviceInfo$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public static /* synthetic */ com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo copy$default(com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo deviceInfo, java.lang.String str, long j, com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals signals, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deviceInfo.id;
            }
            if ((i & 2) != 0) {
                j = deviceInfo.timestamp;
            }
            if ((i & 4) != 0) {
                signals = deviceInfo.android;
            }
            return deviceInfo.copy(str, j, signals);
        }
    }

    public final /* synthetic */ java.lang.String a(android.content.Context context) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.io.File file = new java.io.File(context.getCacheDir().getPath(), ".di");
        if (!file.exists() || kotlin.io.FilesKt.readText$default(file, null, 1, null).length() <= 0) {
            obj = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            kotlin.io.FilesKt.writeText$default(file, obj, null, 2, null);
        } else {
            obj = kotlin.io.FilesKt.readText$default(file, null, 1, null);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
        java.lang.String str2 = android.os.Build.DEVICE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
        java.lang.String str3 = android.os.Build.MANUFACTURER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
        java.lang.String str4 = android.os.Build.MODEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "");
        return new com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo(obj, currentTimeMillis, new com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals(str, i, id, str2, str3, str4)).toString();
    }
}
