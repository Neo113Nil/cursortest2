package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;Bc\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011BU\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ^\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J(\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(HÇ\u0001¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0014R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u0016R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b8\u0010\u0016R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010\u001c"}, d2 = {"Lcom/zettle/sdk/core/user/Gratuity;", "", "", "seen1", "", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "", "currencyExponent", "minPaVersion", "type", "maxPercentage", "", "Lcom/zettle/sdk/core/user/GratuityType;", "types", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/zettle/sdk/core/user/Gratuity;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/Gratuity;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Boolean;", "getAvailable", "Ljava/lang/String;", "getCurrencyExponent", "getCurrencyExponent$annotations", "()V", "Ljava/lang/Integer;", "getMaxPercentage", "getMaxPercentage$annotations", "getMinPaVersion", "getMinPaVersion$annotations", "getType", "Ljava/util/List;", "getTypes", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class Gratuity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.Gratuity.Companion INSTANCE = new com.zettle.sdk.core.user.Gratuity.Companion(null);
    private final java.lang.Boolean available;
    private final java.lang.String currencyExponent;
    private final java.lang.Integer maxPercentage;
    private final java.lang.String minPaVersion;
    private final java.lang.String type;
    private final java.util.List<com.zettle.sdk.core.user.GratuityType> types;

    @kotlinx.serialization.SerialName("currency_exponent")
    public static /* synthetic */ void getCurrencyExponent$annotations() {
    }

    @kotlinx.serialization.SerialName("max_percentage")
    public static /* synthetic */ void getMaxPercentage$annotations() {
    }

    @kotlinx.serialization.SerialName("min_pa_version")
    public static /* synthetic */ void getMinPaVersion$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/Gratuity$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/Gratuity;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.Gratuity> serializer() {
            return com.zettle.sdk.core.user.Gratuity$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Gratuity(int i, java.lang.Boolean bool, @kotlinx.serialization.SerialName("currency_exponent") java.lang.String str, @kotlinx.serialization.SerialName("min_pa_version") java.lang.String str2, java.lang.String str3, @kotlinx.serialization.SerialName("max_percentage") java.lang.Integer num, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        this.available = (i & 1) == 0 ? java.lang.Boolean.TRUE : bool;
        if ((i & 2) == 0) {
            this.currencyExponent = null;
        } else {
            this.currencyExponent = str;
        }
        if ((i & 4) == 0) {
            this.minPaVersion = null;
        } else {
            this.minPaVersion = str2;
        }
        if ((i & 8) == 0) {
            this.type = null;
        } else {
            this.type = str3;
        }
        if ((i & 16) == 0) {
            this.maxPercentage = null;
        } else {
            this.maxPercentage = num;
        }
        if ((i & 32) == 0) {
            this.types = null;
        } else {
            this.types = list;
        }
    }

    public Gratuity(java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.util.List<com.zettle.sdk.core.user.GratuityType> list) {
        this.available = bool;
        this.currencyExponent = str;
        this.minPaVersion = str2;
        this.type = str3;
        this.maxPercentage = num;
        this.types = list;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.Gratuity self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !kotlin.jvm.internal.Intrinsics.areEqual(self.available, java.lang.Boolean.TRUE)) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.available);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.currencyExponent != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.currencyExponent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.minPaVersion != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.minPaVersion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.type != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.maxPercentage != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.maxPercentage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.types != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, new kotlinx.serialization.internal.ArrayListSerializer(com.zettle.sdk.core.user.GratuityType$$serializer.INSTANCE), self.types);
        }
    }

    public /* synthetic */ Gratuity(java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? java.lang.Boolean.TRUE : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) == 0 ? list : null);
    }

    public final java.lang.Boolean getAvailable() {
        return this.available;
    }

    public final java.lang.String getCurrencyExponent() {
        return this.currencyExponent;
    }

    public final java.lang.String getMinPaVersion() {
        return this.minPaVersion;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.Integer getMaxPercentage() {
        return this.maxPercentage;
    }

    public final java.util.List<com.zettle.sdk.core.user.GratuityType> getTypes() {
        return this.types;
    }

    public final java.lang.String toString() {
        java.lang.Boolean bool = this.available;
        java.lang.String str = this.currencyExponent;
        java.lang.String str2 = this.minPaVersion;
        java.lang.String str3 = this.type;
        java.lang.Integer num = this.maxPercentage;
        java.util.List<com.zettle.sdk.core.user.GratuityType> list = this.types;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Gratuity(available=");
        sb.append(bool);
        sb.append(", currencyExponent=");
        sb.append(str);
        sb.append(", minPaVersion=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(str3);
        sb.append(", maxPercentage=");
        sb.append(num);
        sb.append(", types=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.available;
        int hashCode = bool == null ? 0 : bool.hashCode();
        java.lang.String str = this.currencyExponent;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.minPaVersion;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.type;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.Integer num = this.maxPercentage;
        int hashCode5 = num == null ? 0 : num.hashCode();
        java.util.List<com.zettle.sdk.core.user.GratuityType> list = this.types;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.core.user.Gratuity)) {
            return false;
        }
        com.zettle.sdk.core.user.Gratuity gratuity = (com.zettle.sdk.core.user.Gratuity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.available, gratuity.available) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyExponent, gratuity.currencyExponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.minPaVersion, gratuity.minPaVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, gratuity.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxPercentage, gratuity.maxPercentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.types, gratuity.types);
    }

    public final com.zettle.sdk.core.user.Gratuity copy(java.lang.Boolean available, java.lang.String currencyExponent, java.lang.String minPaVersion, java.lang.String type, java.lang.Integer maxPercentage, java.util.List<com.zettle.sdk.core.user.GratuityType> types) {
        return new com.zettle.sdk.core.user.Gratuity(available, currencyExponent, minPaVersion, type, maxPercentage, types);
    }

    public final java.util.List<com.zettle.sdk.core.user.GratuityType> component6() {
        return this.types;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Integer getMaxPercentage() {
        return this.maxPercentage;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMinPaVersion() {
        return this.minPaVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyExponent() {
        return this.currencyExponent;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getAvailable() {
        return this.available;
    }

    public static /* synthetic */ com.zettle.sdk.core.user.Gratuity copy$default(com.zettle.sdk.core.user.Gratuity gratuity, java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = gratuity.available;
        }
        if ((i & 2) != 0) {
            str = gratuity.currencyExponent;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = gratuity.minPaVersion;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = gratuity.type;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            num = gratuity.maxPercentage;
        }
        java.lang.Integer num2 = num;
        if ((i & 32) != 0) {
            list = gratuity.types;
        }
        return gratuity.copy(bool, str4, str5, str6, num2, list);
    }

    public Gratuity() {
        this((java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 63, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
