package com.paypal.oslo.feature.savings.domain.model.savingshub.parser;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/BalanceFeatures;", "", "", "autoSave", "smartRoute", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/BalanceFeatures;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$savings_prodRelease", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/BalanceFeatures;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Boolean;", "getAutoSave", "getAutoSave$annotations", "()V", "getSmartRoute", "getSmartRoute$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class BalanceFeatures {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceFeatures.Companion INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceFeatures.Companion(null);
    private final java.lang.Boolean autoSave;
    private final java.lang.Boolean smartRoute;

    @kotlinx.serialization.SerialName("auto_save")
    public static /* synthetic */ void getAutoSave$annotations() {
    }

    @kotlinx.serialization.SerialName("smart_route")
    public static /* synthetic */ void getSmartRoute$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/BalanceFeatures$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/BalanceFeatures;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceFeatures> serializer() {
            return com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceFeatures$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BalanceFeatures(int i, java.lang.Boolean bool, java.lang.Boolean bool2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.autoSave = null;
        } else {
            this.autoSave = bool;
        }
        if ((i & 2) == 0) {
            this.smartRoute = null;
        } else {
            this.smartRoute = bool2;
        }
    }

    public BalanceFeatures(java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.autoSave = bool;
        this.smartRoute = bool2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$savings_prodRelease(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceFeatures self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.autoSave != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.autoSave);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.smartRoute != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.smartRoute);
        }
    }

    public /* synthetic */ BalanceFeatures(java.lang.Boolean bool, java.lang.Boolean bool2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }

    public final java.lang.Boolean getAutoSave() {
        return this.autoSave;
    }

    public final java.lang.Boolean getSmartRoute() {
        return this.smartRoute;
    }

    public final java.lang.String toString() {
        java.lang.Boolean bool = this.autoSave;
        java.lang.Boolean bool2 = this.smartRoute;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceFeatures(autoSave=");
        sb.append(bool);
        sb.append(", smartRoute=");
        sb.append(bool2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.autoSave;
        int hashCode = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.smartRoute;
        return (hashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceFeatures)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceFeatures balanceFeatures = (com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceFeatures) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.autoSave, balanceFeatures.autoSave) && kotlin.jvm.internal.Intrinsics.areEqual(this.smartRoute, balanceFeatures.smartRoute);
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceFeatures copy(java.lang.Boolean autoSave, java.lang.Boolean smartRoute) {
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceFeatures(autoSave, smartRoute);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getSmartRoute() {
        return this.smartRoute;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getAutoSave() {
        return this.autoSave;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceFeatures copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceFeatures balanceFeatures, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = balanceFeatures.autoSave;
        }
        if ((i & 2) != 0) {
            bool2 = balanceFeatures.smartRoute;
        }
        return balanceFeatures.copy(bool, bool2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BalanceFeatures() {
        this((java.lang.Boolean) null, (java.lang.Boolean) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
