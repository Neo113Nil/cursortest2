package com.ingo.sdk.kotlin.common.features.configuration.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000e"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/configuration/model/EmailConfiguration;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "availability", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingo/sdk/kotlin/common/features/configuration/model/EmailConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/features/configuration/model/EmailConfiguration;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getDescription", "getAvailability", "getEmail", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class EmailConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.features.configuration.model.EmailConfiguration.Companion INSTANCE = new com.ingo.sdk.kotlin.common.features.configuration.model.EmailConfiguration.Companion(null);
    private final java.lang.String availability;
    private final java.lang.String description;
    private final java.lang.String email;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/configuration/model/EmailConfiguration$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/features/configuration/model/EmailConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.features.configuration.model.EmailConfiguration> serializer() {
            return com.ingo.sdk.kotlin.common.features.configuration.model.EmailConfiguration$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ EmailConfiguration(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.ingo.sdk.kotlin.common.features.configuration.model.EmailConfiguration$$serializer.INSTANCE.getDescriptor());
        }
        this.description = str;
        this.availability = str2;
        this.email = str3;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.features.configuration.model.EmailConfiguration self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.description);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.availability);
        output.encodeStringElement(serialDesc, 2, self.email);
    }

    public EmailConfiguration(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.description = str;
        this.availability = str2;
        this.email = str3;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getAvailability() {
        return this.availability;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.description;
        java.lang.String str2 = this.availability;
        java.lang.String str3 = this.email;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailConfiguration(description=");
        sb.append(str);
        sb.append(", availability=");
        sb.append(str2);
        sb.append(", email=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.description.hashCode();
        java.lang.String str = this.availability;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.email.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.configuration.model.EmailConfiguration)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.configuration.model.EmailConfiguration emailConfiguration = (com.ingo.sdk.kotlin.common.features.configuration.model.EmailConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.description, emailConfiguration.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.availability, emailConfiguration.availability) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, emailConfiguration.email);
    }

    public final com.ingo.sdk.kotlin.common.features.configuration.model.EmailConfiguration copy(java.lang.String description, java.lang.String availability, java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        return new com.ingo.sdk.kotlin.common.features.configuration.model.EmailConfiguration(description, availability, email);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAvailability() {
        return this.availability;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.configuration.model.EmailConfiguration copy$default(com.ingo.sdk.kotlin.common.features.configuration.model.EmailConfiguration emailConfiguration, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = emailConfiguration.description;
        }
        if ((i & 2) != 0) {
            str2 = emailConfiguration.availability;
        }
        if ((i & 4) != 0) {
            str3 = emailConfiguration.email;
        }
        return emailConfiguration.copy(str, str2, str3);
    }
}
