package com.ingo.sdk.kotlin.common.features.configuration.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0012"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/configuration/model/MinimumInMinutesFeeConfiguration;", "", "", "minFeeDescription", "minFeeTitle", "", "minFeeInCents", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/ingo/sdk/kotlin/common/features/configuration/model/MinimumInMinutesFeeConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/features/configuration/model/MinimumInMinutesFeeConfiguration;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getMinFeeDescription", "getMinFeeTitle", "J", "getMinFeeInCents", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class MinimumInMinutesFeeConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration.Companion INSTANCE = new com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration.Companion(null);
    private final java.lang.String minFeeDescription;
    private final long minFeeInCents;
    private final java.lang.String minFeeTitle;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/configuration/model/MinimumInMinutesFeeConfiguration$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/features/configuration/model/MinimumInMinutesFeeConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration> serializer() {
            return com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MinimumInMinutesFeeConfiguration(int i, java.lang.String str, java.lang.String str2, long j, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration$$serializer.INSTANCE.getDescriptor());
        }
        this.minFeeDescription = str;
        this.minFeeTitle = str2;
        this.minFeeInCents = j;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.minFeeDescription);
        output.encodeStringElement(serialDesc, 1, self.minFeeTitle);
        output.encodeLongElement(serialDesc, 2, self.minFeeInCents);
    }

    public MinimumInMinutesFeeConfiguration(java.lang.String str, java.lang.String str2, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.minFeeDescription = str;
        this.minFeeTitle = str2;
        this.minFeeInCents = j;
    }

    public final java.lang.String getMinFeeDescription() {
        return this.minFeeDescription;
    }

    public final java.lang.String getMinFeeTitle() {
        return this.minFeeTitle;
    }

    public final long getMinFeeInCents() {
        return this.minFeeInCents;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.minFeeDescription;
        java.lang.String str2 = this.minFeeTitle;
        long j = this.minFeeInCents;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MinimumInMinutesFeeConfiguration(minFeeDescription=");
        sb.append(str);
        sb.append(", minFeeTitle=");
        sb.append(str2);
        sb.append(", minFeeInCents=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.minFeeDescription.hashCode() * 31) + this.minFeeTitle.hashCode()) * 31) + java.lang.Long.hashCode(this.minFeeInCents);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration minimumInMinutesFeeConfiguration = (com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.minFeeDescription, minimumInMinutesFeeConfiguration.minFeeDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.minFeeTitle, minimumInMinutesFeeConfiguration.minFeeTitle) && this.minFeeInCents == minimumInMinutesFeeConfiguration.minFeeInCents;
    }

    public final com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration copy(java.lang.String minFeeDescription, java.lang.String minFeeTitle, long minFeeInCents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minFeeDescription, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minFeeTitle, "");
        return new com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration(minFeeDescription, minFeeTitle, minFeeInCents);
    }

    /* renamed from: component3, reason: from getter */
    public final long getMinFeeInCents() {
        return this.minFeeInCents;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMinFeeTitle() {
        return this.minFeeTitle;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMinFeeDescription() {
        return this.minFeeDescription;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration copy$default(com.ingo.sdk.kotlin.common.features.configuration.model.MinimumInMinutesFeeConfiguration minimumInMinutesFeeConfiguration, java.lang.String str, java.lang.String str2, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = minimumInMinutesFeeConfiguration.minFeeDescription;
        }
        if ((i & 2) != 0) {
            str2 = minimumInMinutesFeeConfiguration.minFeeTitle;
        }
        if ((i & 4) != 0) {
            j = minimumInMinutesFeeConfiguration.minFeeInCents;
        }
        return minimumInMinutesFeeConfiguration.copy(str, str2, j);
    }
}
