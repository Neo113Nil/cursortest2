package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/UserExperienceDetails;", "", "", "autoReturnTimeInSec", "", "showFI", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/UserExperienceDetails;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$inappcheckout_prodRelease", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/UserExperienceDetails;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Integer;", "getAutoReturnTimeInSec", "Ljava/lang/Boolean;", "getShowFI", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class UserExperienceDetails {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.UserExperienceDetails.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.entity.UserExperienceDetails.Companion(null);
    private final java.lang.Integer autoReturnTimeInSec;
    private final java.lang.Boolean showFI;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/UserExperienceDetails$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/UserExperienceDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.domain.entity.UserExperienceDetails> serializer() {
            return com.paypal.oslo.feature.inappcheckout.domain.entity.UserExperienceDetails$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UserExperienceDetails(int i, java.lang.Integer num, java.lang.Boolean bool, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.inappcheckout.domain.entity.UserExperienceDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.autoReturnTimeInSec = num;
        this.showFI = bool;
    }

    public UserExperienceDetails(java.lang.Integer num, java.lang.Boolean bool) {
        this.autoReturnTimeInSec = num;
        this.showFI = bool;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$inappcheckout_prodRelease(com.paypal.oslo.feature.inappcheckout.domain.entity.UserExperienceDetails self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.autoReturnTimeInSec);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.showFI);
    }

    public final java.lang.Integer getAutoReturnTimeInSec() {
        return this.autoReturnTimeInSec;
    }

    public final java.lang.Boolean getShowFI() {
        return this.showFI;
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.autoReturnTimeInSec;
        java.lang.Boolean bool = this.showFI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserExperienceDetails(autoReturnTimeInSec=");
        sb.append(num);
        sb.append(", showFI=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.autoReturnTimeInSec;
        int hashCode = num == null ? 0 : num.hashCode();
        java.lang.Boolean bool = this.showFI;
        return (hashCode * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.UserExperienceDetails)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.UserExperienceDetails userExperienceDetails = (com.paypal.oslo.feature.inappcheckout.domain.entity.UserExperienceDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.autoReturnTimeInSec, userExperienceDetails.autoReturnTimeInSec) && kotlin.jvm.internal.Intrinsics.areEqual(this.showFI, userExperienceDetails.showFI);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.UserExperienceDetails copy(java.lang.Integer autoReturnTimeInSec, java.lang.Boolean showFI) {
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.UserExperienceDetails(autoReturnTimeInSec, showFI);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getShowFI() {
        return this.showFI;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getAutoReturnTimeInSec() {
        return this.autoReturnTimeInSec;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.UserExperienceDetails copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.UserExperienceDetails userExperienceDetails, java.lang.Integer num, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = userExperienceDetails.autoReturnTimeInSec;
        }
        if ((i & 2) != 0) {
            bool = userExperienceDetails.showFI;
        }
        return userExperienceDetails.copy(num, bool);
    }
}
