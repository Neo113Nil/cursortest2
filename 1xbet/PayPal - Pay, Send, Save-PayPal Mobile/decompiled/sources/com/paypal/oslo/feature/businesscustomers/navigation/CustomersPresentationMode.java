package com.paypal.oslo.feature.businesscustomers.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "", "Companion", "View", "Select", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode$Select;", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode$View;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface CustomersPresentationMode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Companion INSTANCE = com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Companion.getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode$Select$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View", com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode$View;", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes11.dex */
    public static final /* data */ class View implements com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View INSTANCE = new com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode$View$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.m12752$r8$lambda$q6XHoSm4vfO1kx2sp41hK6PFgU();
            }
        });

        public final int hashCode() {
            return 612942129;
        }

        private View() {
        }

        /* renamed from: $r8$lambda$q6XHoSm4vfO1kx2sp41hK6P-FgU, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m12752$r8$lambda$q6XHoSm4vfO1kx2sp41hK6PFgU() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "View";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode$Select;", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "", "requireEmail", "<init>", "(Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode$Select;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_customers_prodRelease", "(Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode$Select;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getRequireEmail", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Select implements com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select.Companion INSTANCE = new com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select.Companion(null);
        private final boolean requireEmail;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode$Select$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode$Select;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select> serializer() {
                return com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode$Select$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Select(int i, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode$Select$$serializer.INSTANCE.getDescriptor());
            }
            this.requireEmail = z;
        }

        public Select(boolean z) {
            this.requireEmail = z;
        }

        public final boolean getRequireEmail() {
            return this.requireEmail;
        }

        public final java.lang.String toString() {
            boolean z = this.requireEmail;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Select(requireEmail=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.requireEmail);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select) && this.requireEmail == ((com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select) other).requireEmail;
        }

        public final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select copy(boolean requireEmail) {
            return new com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select(requireEmail);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getRequireEmail() {
            return this.requireEmail;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select copy$default(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select select, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = select.requireEmail;
            }
            return select.copy(z);
        }
    }
}
