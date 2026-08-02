package com.paypal.oslo.feature.identity.api.navigation;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0002+*B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB-\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J'\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/PasskeyEnrollmentDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "", "source", "", "returnResultOnSuccess", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/identity/api/navigation/PasskeyEnrollmentDestination;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/navigation/PasskeyEnrollmentDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getSource", "Z", "getReturnResultOnSuccess", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PasskeyEnrollmentDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination.Companion(null);
    private final boolean returnResultOnSuccess;
    private final java.lang.String source;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/PasskeyEnrollmentDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/navigation/PasskeyEnrollmentDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination> serializer() {
            return com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PasskeyEnrollmentDestination(int i, java.lang.String str, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        this.source = (i & 1) == 0 ? "settings" : str;
        if ((i & 2) == 0) {
            this.returnResultOnSuccess = false;
        } else {
            this.returnResultOnSuccess = z;
        }
    }

    public PasskeyEnrollmentDestination(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.source = str;
        this.returnResultOnSuccess = z;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_api_prodRelease(com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !kotlin.jvm.internal.Intrinsics.areEqual(self.source, "settings")) {
            output.encodeStringElement(serialDesc, 0, self.source);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.returnResultOnSuccess) {
            output.encodeBooleanElement(serialDesc, 1, self.returnResultOnSuccess);
        }
    }

    public /* synthetic */ PasskeyEnrollmentDestination(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "settings" : str, (i & 2) != 0 ? false : z);
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final boolean getReturnResultOnSuccess() {
        return this.returnResultOnSuccess;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(com.paypal.oslo.feature.identity.api.navigation.PasskeyDestinationAnalytics.SCREEN_ENROLLMENT, com.paypal.oslo.feature.identity.api.navigation.PasskeyDestinationAnalytics.INSTANCE.getViewPasskeyEnrollment(), null, 4, null);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.source;
        boolean z = this.returnResultOnSuccess;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyEnrollmentDestination(source=");
        sb.append(str);
        sb.append(", returnResultOnSuccess=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.source.hashCode() * 31) + java.lang.Boolean.hashCode(this.returnResultOnSuccess);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination)) {
            return false;
        }
        com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination passkeyEnrollmentDestination = (com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.source, passkeyEnrollmentDestination.source) && this.returnResultOnSuccess == passkeyEnrollmentDestination.returnResultOnSuccess;
    }

    public final com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination copy(java.lang.String source, boolean returnResultOnSuccess) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return new com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination(source, returnResultOnSuccess);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getReturnResultOnSuccess() {
        return this.returnResultOnSuccess;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination copy$default(com.paypal.oslo.feature.identity.api.navigation.PasskeyEnrollmentDestination passkeyEnrollmentDestination, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = passkeyEnrollmentDestination.source;
        }
        if ((i & 2) != 0) {
            z = passkeyEnrollmentDestination.returnResultOnSuccess;
        }
        return passkeyEnrollmentDestination.copy(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PasskeyEnrollmentDestination() {
        this((java.lang.String) null, false, 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
