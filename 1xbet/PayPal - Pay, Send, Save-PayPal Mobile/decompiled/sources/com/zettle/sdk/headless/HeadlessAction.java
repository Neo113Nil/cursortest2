package com.zettle.sdk.headless;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessAction;", "T", "", "<init>", "()V", "", "Lcom/zettle/sdk/core/permission/Prerequisite;", "requirements", "()Ljava/util/List;", "Payments", "Readers", "Lcom/zettle/sdk/headless/HeadlessAction$Payments;", "Lcom/zettle/sdk/headless/HeadlessAction$Readers;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class HeadlessAction<T> {
    private HeadlessAction() {
    }

    public java.util.List<com.zettle.sdk.core.permission.Prerequisite> requirements() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002:\u0004\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0004\r\u000e\u000f\u0010"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessAction$Readers;", "T", "Lcom/zettle/sdk/headless/HeadlessAction;", "<init>", "()V", "", "Lcom/zettle/sdk/core/permission/Prerequisite;", "requirements", "()Ljava/util/List;", "Discover", "Forget", "Pair", "PairedReaders", "Lcom/zettle/sdk/headless/HeadlessAction$Readers$Discover;", "Lcom/zettle/sdk/headless/HeadlessAction$Readers$Forget;", "Lcom/zettle/sdk/headless/HeadlessAction$Readers$Pair;", "Lcom/zettle/sdk/headless/HeadlessAction$Readers$PairedReaders;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Readers<T> extends com.zettle.sdk.headless.HeadlessAction<T> {
        private Readers() {
            super(null);
        }

        @Override // com.zettle.sdk.headless.HeadlessAction
        public java.util.List<com.zettle.sdk.core.permission.Prerequisite> requirements() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.zettle.sdk.core.permission.Prerequisite[]{new com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted(com.zettle.sdk.commons.network.Scope.Payment, false, 2, null), com.zettle.sdk.core.permission.Prerequisite.Permission.Bluetooth.INSTANCE, com.zettle.sdk.core.permission.Prerequisite.Permission.Location.INSTANCE, com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Location.INSTANCE});
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessAction$Readers$Discover;", "Lcom/zettle/sdk/headless/HeadlessAction$Readers;", "Lcom/zettle/sdk/headless/readers/DiscoverySession;", "", "Lcom/zettle/sdk/headless/readers/ConnectionType;", "connectionTypes", "<init>", "(Ljava/util/Set;)V", "Ljava/util/Set;", "getConnectionTypes", "()Ljava/util/Set;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Discover extends com.zettle.sdk.headless.HeadlessAction.Readers<com.zettle.sdk.headless.readers.DiscoverySession> {
            private final java.util.Set<com.zettle.sdk.headless.readers.ConnectionType> connectionTypes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Discover(java.util.Set<? extends com.zettle.sdk.headless.readers.ConnectionType> set) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
                this.connectionTypes = set;
            }

            public final java.util.Set<com.zettle.sdk.headless.readers.ConnectionType> getConnectionTypes() {
                return this.connectionTypes;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessAction$Readers$Pair;", "Lcom/zettle/sdk/headless/HeadlessAction$Readers;", "Lcom/zettle/sdk/headless/readers/PairingSession;", "Lcom/zettle/sdk/headless/readers/DiscoveredReader;", "reader", "<init>", "(Lcom/zettle/sdk/headless/readers/DiscoveredReader;)V", "Lcom/zettle/sdk/headless/readers/DiscoveredReader;", "getReader", "()Lcom/zettle/sdk/headless/readers/DiscoveredReader;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Pair extends com.zettle.sdk.headless.HeadlessAction.Readers<com.zettle.sdk.headless.readers.PairingSession> {
            private final com.zettle.sdk.headless.readers.DiscoveredReader reader;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Pair(com.zettle.sdk.headless.readers.DiscoveredReader discoveredReader) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(discoveredReader, "");
                this.reader = discoveredReader;
            }

            public final com.zettle.sdk.headless.readers.DiscoveredReader getReader() {
                return this.reader;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessAction$Readers$Forget;", "Lcom/zettle/sdk/headless/HeadlessAction$Readers;", "", "Lcom/zettle/sdk/headless/readers/PairedReader;", "reader", "<init>", "(Lcom/zettle/sdk/headless/readers/PairedReader;)V", "Lcom/zettle/sdk/headless/readers/PairedReader;", "getReader", "()Lcom/zettle/sdk/headless/readers/PairedReader;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Forget extends com.zettle.sdk.headless.HeadlessAction.Readers<kotlin.Unit> {
            private final com.zettle.sdk.headless.readers.PairedReader reader;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Forget(com.zettle.sdk.headless.readers.PairedReader pairedReader) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairedReader, "");
                this.reader = pairedReader;
            }

            public final com.zettle.sdk.headless.readers.PairedReader getReader() {
                return this.reader;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessAction$Readers$PairedReaders;", "Lcom/zettle/sdk/headless/HeadlessAction$Readers;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zettle/sdk/headless/readers/PairedReaders;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PairedReaders extends com.zettle.sdk.headless.HeadlessAction.Readers<kotlinx.coroutines.flow.Flow<? extends com.zettle.sdk.headless.readers.PairedReaders>> {
            public static final com.zettle.sdk.headless.HeadlessAction.Readers.PairedReaders INSTANCE = new com.zettle.sdk.headless.HeadlessAction.Readers.PairedReaders();

            private PairedReaders() {
                super(null);
            }
        }

        public /* synthetic */ Readers(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessAction$Payments;", "T", "Lcom/zettle/sdk/headless/HeadlessAction;", "<init>", "()V", "OfflinePaymentEvents", "StartPayment", "Lcom/zettle/sdk/headless/HeadlessAction$Payments$OfflinePaymentEvents;", "Lcom/zettle/sdk/headless/HeadlessAction$Payments$StartPayment;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Payments<T> extends com.zettle.sdk.headless.HeadlessAction<T> {

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessAction$Payments$StartPayment;", "Lcom/zettle/sdk/headless/HeadlessAction$Payments;", "Lcom/zettle/sdk/PaymentSession;", "Lcom/zettle/sdk/PaymentParameters;", "parameters", "<init>", "(Lcom/zettle/sdk/PaymentParameters;)V", "", "Lcom/zettle/sdk/core/permission/Prerequisite;", "requirements", "()Ljava/util/List;", "Lcom/zettle/sdk/PaymentParameters;", "getParameters", "()Lcom/zettle/sdk/PaymentParameters;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class StartPayment extends com.zettle.sdk.headless.HeadlessAction.Payments<com.zettle.sdk.PaymentSession> {
            private final com.zettle.sdk.PaymentParameters parameters;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartPayment(com.zettle.sdk.PaymentParameters paymentParameters) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentParameters, "");
                this.parameters = paymentParameters;
            }

            public final com.zettle.sdk.PaymentParameters getParameters() {
                return this.parameters;
            }

            @Override // com.zettle.sdk.headless.HeadlessAction
            public final java.util.List<com.zettle.sdk.core.permission.Prerequisite> requirements() {
                return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.zettle.sdk.core.permission.Prerequisite[]{new com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted(com.zettle.sdk.commons.network.Scope.Payment, false, 2, null), com.zettle.sdk.core.permission.Prerequisite.Permission.Bluetooth.INSTANCE, com.zettle.sdk.core.permission.Prerequisite.Permission.Location.INSTANCE, com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Location.INSTANCE});
            }
        }

        private Payments() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessAction$Payments$OfflinePaymentEvents;", "Lcom/zettle/sdk/headless/HeadlessAction$Payments;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zettle/sdk/OfflinePaymentEvent;", "<init>", "()V", "", "Lcom/zettle/sdk/core/permission/Prerequisite;", "requirements", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class OfflinePaymentEvents extends com.zettle.sdk.headless.HeadlessAction.Payments<kotlinx.coroutines.flow.Flow<? extends com.zettle.sdk.OfflinePaymentEvent>> {
            public static final com.zettle.sdk.headless.HeadlessAction.Payments.OfflinePaymentEvents INSTANCE = new com.zettle.sdk.headless.HeadlessAction.Payments.OfflinePaymentEvents();

            private OfflinePaymentEvents() {
                super(null);
            }

            @Override // com.zettle.sdk.headless.HeadlessAction
            public final java.util.List<com.zettle.sdk.core.permission.Prerequisite> requirements() {
                return kotlin.collections.CollectionsKt.listOf(new com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted(com.zettle.sdk.commons.network.Scope.Payment, false, 2, null));
            }
        }

        public /* synthetic */ Payments(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ HeadlessAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
