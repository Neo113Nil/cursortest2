package com.paypal.oslo.feature.savings.di.navigation;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002)(B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/di/navigation/SavingsEducationalDetailsDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "", "title", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/di/navigation/SavingsEducationalDetailsDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$savings_prodRelease", "(Lcom/paypal/oslo/feature/savings/di/navigation/SavingsEducationalDetailsDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getTitle", "getContent", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SavingsEducationalDetailsDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination.Companion INSTANCE = new com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination.Companion(null);
    private final java.lang.String content;
    private final java.lang.String title;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/di/navigation/SavingsEducationalDetailsDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/savings/di/navigation/SavingsEducationalDetailsDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination> serializer() {
            return com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SavingsEducationalDetailsDestination(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.content = str2;
    }

    public SavingsEducationalDetailsDestination(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.content = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$savings_prodRelease(com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.content);
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getContent() {
        return this.content;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Education.SCREEN_ID, new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("savings", "savings", "view"), null, 4, null);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.content;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsEducationalDetailsDestination(title=");
        sb.append(str);
        sb.append(", content=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.title.hashCode() * 31) + this.content.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination)) {
            return false;
        }
        com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination savingsEducationalDetailsDestination = (com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, savingsEducationalDetailsDestination.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.content, savingsEducationalDetailsDestination.content);
    }

    public final com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination copy(java.lang.String title, java.lang.String content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return new com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination(title, content);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getContent() {
        return this.content;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination copy$default(com.paypal.oslo.feature.savings.di.navigation.SavingsEducationalDetailsDestination savingsEducationalDetailsDestination, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = savingsEducationalDetailsDestination.title;
        }
        if ((i & 2) != 0) {
            str2 = savingsEducationalDetailsDestination.content;
        }
        return savingsEducationalDetailsDestination.copy(str, str2);
    }
}
