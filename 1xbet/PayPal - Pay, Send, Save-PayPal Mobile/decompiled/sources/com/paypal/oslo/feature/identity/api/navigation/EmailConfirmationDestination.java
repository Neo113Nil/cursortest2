package com.paypal.oslo.feature.identity.api.navigation;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002()B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/EmailConfirmationDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "", "email", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/navigation/EmailConfirmationDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/navigation/EmailConfirmationDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getEmail", "getCode", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class EmailConfirmationDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    public static final java.lang.String FEATURE = "email_confirmation";
    public static final java.lang.String SCREEN_ID = "email_confirmation";
    private final java.lang.String code;
    private final java.lang.String email;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination.Companion(null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.Product PRODUCT = com.paypal.oslo.core.telemetry.analytics.schema.Product.IDENTITY;

    public /* synthetic */ EmailConfirmationDestination(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.email = str;
        this.code = str2;
    }

    public EmailConfirmationDestination(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.email = str;
        this.code = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_api_prodRelease(com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.email);
        output.encodeStringElement(serialDesc, 1, self.code);
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor("email_confirmation", new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(PRODUCT, "email_confirmation", "view"), null, 4, null);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/EmailConfirmationDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/navigation/EmailConfirmationDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "SCREEN_ID", "Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "PRODUCT", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "getPRODUCT", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "FEATURE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination> serializer() {
            return com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination$$serializer.INSTANCE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.Product getPRODUCT() {
            return com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination.PRODUCT;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.email;
        java.lang.String str2 = this.code;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailConfirmationDestination(email=");
        sb.append(str);
        sb.append(", code=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.email.hashCode() * 31) + this.code.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination)) {
            return false;
        }
        com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination emailConfirmationDestination = (com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.email, emailConfirmationDestination.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, emailConfirmationDestination.code);
    }

    public final com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination copy(java.lang.String email, java.lang.String code) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        return new com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination(email, code);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination copy$default(com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination emailConfirmationDestination, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = emailConfirmationDestination.email;
        }
        if ((i & 2) != 0) {
            str2 = emailConfirmationDestination.code;
        }
        return emailConfirmationDestination.copy(str, str2);
    }
}
