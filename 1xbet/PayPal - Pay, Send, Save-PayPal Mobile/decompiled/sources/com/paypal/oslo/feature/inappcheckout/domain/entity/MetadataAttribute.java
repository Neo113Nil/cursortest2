package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0081\b\u0018\u0000 32\u00020\u0001:\u000243BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019JX\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0013J\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J'\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b\u0006\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b\u0007\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0019R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b1\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b2\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MetadataAttribute;", "", "", "minimumLength", "maximumLength", "", "isRequired", "isEditable", "", "regex", "labelKey", "group", "<init>", "(IIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "component3", "()Z", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "copy", "(IIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MetadataAttribute;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$inappcheckout_prodRelease", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MetadataAttribute;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getMinimumLength", "getMaximumLength", "Z", "Ljava/lang/String;", "getRegex", "getLabelKey", "getGroup", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class MetadataAttribute {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute.Companion(null);
    private final java.lang.String group;
    private final boolean isEditable;
    private final boolean isRequired;
    private final java.lang.String labelKey;
    private final int maximumLength;
    private final int minimumLength;
    private final java.lang.String regex;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MetadataAttribute$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MetadataAttribute;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute> serializer() {
            return com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MetadataAttribute(int i, int i2, int i3, boolean z, boolean z2, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 63, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE.getDescriptor());
        }
        this.minimumLength = i2;
        this.maximumLength = i3;
        this.isRequired = z;
        this.isEditable = z2;
        this.regex = str;
        this.labelKey = str2;
        if ((i & 64) == 0) {
            this.group = null;
        } else {
            this.group = str3;
        }
    }

    public MetadataAttribute(int i, int i2, boolean z, boolean z2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.minimumLength = i;
        this.maximumLength = i2;
        this.isRequired = z;
        this.isEditable = z2;
        this.regex = str;
        this.labelKey = str2;
        this.group = str3;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$inappcheckout_prodRelease(com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.minimumLength);
        output.encodeIntElement(serialDesc, 1, self.maximumLength);
        output.encodeBooleanElement(serialDesc, 2, self.isRequired);
        output.encodeBooleanElement(serialDesc, 3, self.isEditable);
        output.encodeStringElement(serialDesc, 4, self.regex);
        output.encodeStringElement(serialDesc, 5, self.labelKey);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.group != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.group);
        }
    }

    public /* synthetic */ MetadataAttribute(int i, int i2, boolean z, boolean z2, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, z, z2, str, str2, (i3 & 64) != 0 ? null : str3);
    }

    public final int getMinimumLength() {
        return this.minimumLength;
    }

    public final int getMaximumLength() {
        return this.maximumLength;
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final boolean isEditable() {
        return this.isEditable;
    }

    public final java.lang.String getRegex() {
        return this.regex;
    }

    public final java.lang.String getLabelKey() {
        return this.labelKey;
    }

    public final java.lang.String getGroup() {
        return this.group;
    }

    public final java.lang.String toString() {
        int i = this.minimumLength;
        int i2 = this.maximumLength;
        boolean z = this.isRequired;
        boolean z2 = this.isEditable;
        java.lang.String str = this.regex;
        java.lang.String str2 = this.labelKey;
        java.lang.String str3 = this.group;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MetadataAttribute(minimumLength=");
        sb.append(i);
        sb.append(", maximumLength=");
        sb.append(i2);
        sb.append(", isRequired=");
        sb.append(z);
        sb.append(", isEditable=");
        sb.append(z2);
        sb.append(", regex=");
        sb.append(str);
        sb.append(", labelKey=");
        sb.append(str2);
        sb.append(", group=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.minimumLength);
        int hashCode2 = java.lang.Integer.hashCode(this.maximumLength);
        int hashCode3 = java.lang.Boolean.hashCode(this.isRequired);
        int hashCode4 = java.lang.Boolean.hashCode(this.isEditable);
        int hashCode5 = this.regex.hashCode();
        int hashCode6 = this.labelKey.hashCode();
        java.lang.String str = this.group;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) other;
        return this.minimumLength == metadataAttribute.minimumLength && this.maximumLength == metadataAttribute.maximumLength && this.isRequired == metadataAttribute.isRequired && this.isEditable == metadataAttribute.isEditable && kotlin.jvm.internal.Intrinsics.areEqual(this.regex, metadataAttribute.regex) && kotlin.jvm.internal.Intrinsics.areEqual(this.labelKey, metadataAttribute.labelKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.group, metadataAttribute.group);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute copy(int minimumLength, int maximumLength, boolean isRequired, boolean isEditable, java.lang.String regex, java.lang.String labelKey, java.lang.String group) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(labelKey, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute(minimumLength, maximumLength, isRequired, isEditable, regex, labelKey, group);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getGroup() {
        return this.group;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getLabelKey() {
        return this.labelKey;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getRegex() {
        return this.regex;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEditable() {
        return this.isEditable;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaximumLength() {
        return this.maximumLength;
    }

    /* renamed from: component1, reason: from getter */
    public final int getMinimumLength() {
        return this.minimumLength;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute, int i, int i2, boolean z, boolean z2, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = metadataAttribute.minimumLength;
        }
        if ((i3 & 2) != 0) {
            i2 = metadataAttribute.maximumLength;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            z = metadataAttribute.isRequired;
        }
        boolean z3 = z;
        if ((i3 & 8) != 0) {
            z2 = metadataAttribute.isEditable;
        }
        boolean z4 = z2;
        if ((i3 & 16) != 0) {
            str = metadataAttribute.regex;
        }
        java.lang.String str4 = str;
        if ((i3 & 32) != 0) {
            str2 = metadataAttribute.labelKey;
        }
        java.lang.String str5 = str2;
        if ((i3 & 64) != 0) {
            str3 = metadataAttribute.group;
        }
        return metadataAttribute.copy(i, i4, z3, z4, str4, str5, str3);
    }
}
