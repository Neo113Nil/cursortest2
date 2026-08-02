package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0002\u001e\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0013\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal;", "", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "reason", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Lcom/zettle/sdk/feature/taptopay/core/FailureReason;)V", "reset", "()V", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "", "amount", "gratuity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;", "paymentProperties", "startTransaction", "(Ljava/lang/ref/WeakReference;JJLcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;", "signature", "uploadSignature", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;)V", "Lcom/zettle/sdk/commons/state/State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "getState", "()Lcom/zettle/sdk/commons/state/State;", "state", "Action", "State"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface TransactionInternal {
    void cancel(com.zettle.sdk.feature.taptopay.core.FailureReason reason);

    com.zettle.sdk.commons.state.State<com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State> getState();

    void reset();

    void startTransaction(java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity, long amount, long gratuity, com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference reference, com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties paymentProperties);

    void uploadSignature(com.zettle.sdk.feature.taptopay.core.transaction.models.Signature signature);

    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0012\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\u0011\u001c\u001d\u001e\u001f !\"#$%&'()*+,"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Approved", "Authorizing", "CardReadOk", "Failed", "FetchCvmLimits", "Finalized", "InTransaction", "Initial", "InitialisingTransaction", "PINEntrance", "PermissiveSignature", "PresentCard", "ReadingCard", "Recover", "Reinitialising", "RequestSignature", "Retry", "UploadingSignature", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Approved;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Authorizing;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$CardReadOk;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$FetchCvmLimits;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Finalized;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Initial;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InitialisingTransaction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$PINEntrance;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$PermissiveSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$PresentCard;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$ReadingCard;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Recover;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Reinitialising;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$RequestSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Retry;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$UploadingSignature;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class State {
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InTransaction;", "", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface InTransaction {
            com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig();

            com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo();
        }

        private State(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        /* renamed from: toString, reason: from getter */
        public java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Initial;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Initial extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Initial INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Initial();

            private Initial() {
                super("Initial", null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InitialisingTransaction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig$core_publicRelease", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo$core_publicRelease", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Ljava/lang/ref/WeakReference;", "getWeakReferenceActivity", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InitialisingTransaction extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity;

            public final java.lang.ref.WeakReference<android.app.Activity> getWeakReferenceActivity() {
                return this.weakReferenceActivity;
            }

            /* renamed from: getInfo$core_publicRelease, reason: from getter */
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            /* renamed from: getConfig$core_publicRelease, reason: from getter */
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitialisingTransaction(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("InitialisingTransaction", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.weakReferenceActivity = weakReference;
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Reinitialising;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig$core_publicRelease", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo$core_publicRelease", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Ljava/lang/ref/WeakReference;", "getWeakReferenceActivity", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Reinitialising extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity;

            public final java.lang.ref.WeakReference<android.app.Activity> getWeakReferenceActivity() {
                return this.weakReferenceActivity;
            }

            /* renamed from: getInfo$core_publicRelease, reason: from getter */
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            /* renamed from: getConfig$core_publicRelease, reason: from getter */
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Reinitialising(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("Reinitialising", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.weakReferenceActivity = weakReference;
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\t\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$PresentCard;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InTransaction;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Ljava/lang/ref/WeakReference;", "getWeakReferenceActivity", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PresentCard extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity;

            public final java.lang.ref.WeakReference<android.app.Activity> getWeakReferenceActivity() {
                return this.weakReferenceActivity;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PresentCard(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("PresentCard", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.weakReferenceActivity = weakReference;
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\t\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$FetchCvmLimits;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InTransaction;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Ljava/lang/ref/WeakReference;", "getWeakReferenceActivity", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FetchCvmLimits extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity;

            public final java.lang.ref.WeakReference<android.app.Activity> getWeakReferenceActivity() {
                return this.weakReferenceActivity;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchCvmLimits(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("FetchCvmLimits", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.weakReferenceActivity = weakReference;
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\t\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$ReadingCard;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InTransaction;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Ljava/lang/ref/WeakReference;", "getWeakReferenceActivity", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ReadingCard extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity;

            public final java.lang.ref.WeakReference<android.app.Activity> getWeakReferenceActivity() {
                return this.weakReferenceActivity;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReadingCard(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("ReadingCard", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.weakReferenceActivity = weakReference;
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\t\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$CardReadOk;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InTransaction;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Ljava/lang/ref/WeakReference;", "getWeakReferenceActivity", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CardReadOk extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity;

            public final java.lang.ref.WeakReference<android.app.Activity> getWeakReferenceActivity() {
                return this.weakReferenceActivity;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CardReadOk(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("CardReadOk", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.weakReferenceActivity = weakReference;
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$PINEntrance;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InTransaction;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "getOnlineHostRequestMessage", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "Ljava/lang/ref/WeakReference;", "getWeakReferenceActivity", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PINEntrance extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage;
            private final java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity;

            public final java.lang.ref.WeakReference<android.app.Activity> getWeakReferenceActivity() {
                return this.weakReferenceActivity;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage getOnlineHostRequestMessage() {
                return this.onlineHostRequestMessage;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PINEntrance(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("PINEntrance", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineHostRequestMessage, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.weakReferenceActivity = weakReference;
                this.onlineHostRequestMessage = onlineHostRequestMessage;
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\t\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Retry;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InTransaction;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Ljava/lang/ref/WeakReference;", "getWeakReferenceActivity", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Retry extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity;

            public final java.lang.ref.WeakReference<android.app.Activity> getWeakReferenceActivity() {
                return this.weakReferenceActivity;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Retry(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("Retry", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.weakReferenceActivity = weakReference;
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\r\u001a\u00020\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Authorizing;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InTransaction;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "Lcom/zettle/sdk/feature/taptopay/core/transaction/PinBlock;", "pinBlock", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;Lcom/zettle/sdk/feature/taptopay/core/transaction/PinBlock;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "getOnlineHostRequestMessage", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/PinBlock;", "getPinBlock", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/PinBlock;", "Ljava/lang/ref/WeakReference;", "getWeakReferenceActivity", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Authorizing extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage;
            private final com.zettle.sdk.feature.taptopay.core.transaction.PinBlock pinBlock;
            private final java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity;

            public /* synthetic */ Authorizing(java.lang.ref.WeakReference weakReference, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, com.zettle.sdk.feature.taptopay.core.transaction.PinBlock pinBlock, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(weakReference, onlineHostRequestMessage, (i & 4) != 0 ? null : pinBlock, transactionInfo, transactionConfig);
            }

            public final java.lang.ref.WeakReference<android.app.Activity> getWeakReferenceActivity() {
                return this.weakReferenceActivity;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage getOnlineHostRequestMessage() {
                return this.onlineHostRequestMessage;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.PinBlock getPinBlock() {
                return this.pinBlock;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Authorizing(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, com.zettle.sdk.feature.taptopay.core.transaction.PinBlock pinBlock, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("Authorizing", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineHostRequestMessage, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.weakReferenceActivity = weakReference;
                this.onlineHostRequestMessage = onlineHostRequestMessage;
                this.pinBlock = pinBlock;
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Recover;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InTransaction;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "getOnlineHostRequestMessage", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "Ljava/lang/ref/WeakReference;", "getWeakReferenceActivity", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Recover extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage;
            private final java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity;

            public final java.lang.ref.WeakReference<android.app.Activity> getWeakReferenceActivity() {
                return this.weakReferenceActivity;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage getOnlineHostRequestMessage() {
                return this.onlineHostRequestMessage;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Recover(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("Recover", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineHostRequestMessage, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.weakReferenceActivity = weakReference;
                this.onlineHostRequestMessage = onlineHostRequestMessage;
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Approved;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InTransaction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;", "tapToPayResult", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "getOnlineHostRequestMessage", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;", "getTapToPayResult", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Approved extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage;
            private final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload tapToPayResult;

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload getTapToPayResult() {
                return this.tapToPayResult;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage getOnlineHostRequestMessage() {
                return this.onlineHostRequestMessage;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Approved(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig, com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload resultPayload, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage) {
                super("Approved", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultPayload, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineHostRequestMessage, "");
                this.info = transactionInfo;
                this.config = transactionConfig;
                this.tapToPayResult = resultPayload;
                this.onlineHostRequestMessage = onlineHostRequestMessage;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$PermissiveSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InTransaction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "approvedPayload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "getApprovedPayload", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "getOnlineHostRequestMessage", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PermissiveSignature extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload approvedPayload;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage;

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage getOnlineHostRequestMessage() {
                return this.onlineHostRequestMessage;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload getApprovedPayload() {
                return this.approvedPayload;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PermissiveSignature(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload transactionApprovedPayload) {
                super("PermissiveSignature", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineHostRequestMessage, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionApprovedPayload, "");
                this.info = transactionInfo;
                this.config = transactionConfig;
                this.onlineHostRequestMessage = onlineHostRequestMessage;
                this.approvedPayload = transactionApprovedPayload;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$RequestSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InTransaction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "approvedPayload", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/CardInfo;", "cardInfo", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/CardInfo;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "getApprovedPayload", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/CardInfo;", "getCardInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/CardInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "getOnlineHostRequestMessage", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class RequestSignature extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload approvedPayload;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo cardInfo;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage;

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage getOnlineHostRequestMessage() {
                return this.onlineHostRequestMessage;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload getApprovedPayload() {
                return this.approvedPayload;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo getCardInfo() {
                return this.cardInfo;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RequestSignature(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload transactionApprovedPayload, com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo cardInfo) {
                super("RequestSignature", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineHostRequestMessage, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionApprovedPayload, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardInfo, "");
                this.info = transactionInfo;
                this.config = transactionConfig;
                this.onlineHostRequestMessage = onlineHostRequestMessage;
                this.approvedPayload = transactionApprovedPayload;
                this.cardInfo = cardInfo;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\f\u001a\u00020\u000b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$UploadingSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$InTransaction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;", "signature", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "approvedPayload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "getApprovedPayload$core_publicRelease", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "getOnlineHostRequestMessage", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;", "getSignature", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class UploadingSignature extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload approvedPayload;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.Signature signature;

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InTransaction
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage getOnlineHostRequestMessage() {
                return this.onlineHostRequestMessage;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.Signature getSignature() {
                return this.signature;
            }

            /* renamed from: getApprovedPayload$core_publicRelease, reason: from getter */
            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload getApprovedPayload() {
                return this.approvedPayload;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UploadingSignature(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, com.zettle.sdk.feature.taptopay.core.transaction.models.Signature signature, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload transactionApprovedPayload) {
                super("UploadingSignature", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineHostRequestMessage, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signature, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionApprovedPayload, "");
                this.info = transactionInfo;
                this.config = transactionConfig;
                this.onlineHostRequestMessage = onlineHostRequestMessage;
                this.signature = signature;
                this.approvedPayload = transactionApprovedPayload;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "reason", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;Lcom/zettle/sdk/feature/taptopay/core/FailureReason;Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "getOnlineHostRequestMessage", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/core/FailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage;
            private final com.zettle.sdk.feature.taptopay.core.FailureReason reason;

            public /* synthetic */ Failed(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig, com.zettle.sdk.feature.taptopay.core.FailureReason failureReason, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(transactionInfo, transactionConfig, failureReason, (i & 8) != 0 ? null : onlineHostRequestMessage);
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            public final com.zettle.sdk.feature.taptopay.core.FailureReason getReason() {
                return this.reason;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage getOnlineHostRequestMessage() {
                return this.onlineHostRequestMessage;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Failed(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig, com.zettle.sdk.feature.taptopay.core.FailureReason failureReason, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage) {
                super(r0.toString(), null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(");
                sb.append(failureReason);
                sb.append(")");
                this.info = transactionInfo;
                this.config = transactionConfig;
                this.reason = failureReason;
                this.onlineHostRequestMessage = onlineHostRequestMessage;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State$Finalized;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getReference", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Finalized extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State {
            private final java.lang.String reference;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Finalized(java.lang.String str) {
                super(r0.toString(), null);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Finalized(");
                sb.append(str);
                sb.append(")");
                this.reference = str;
            }

            public final java.lang.String getReference() {
                return this.reference;
            }
        }

        public /* synthetic */ State(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000f\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\u000e\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Attest", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, "CardAction", "CheckAttestation", "InitializingTransaction", "PINResultAction", "PresentCard", "ReadyToAttest", "Recover", "ReinitializeTapToPay", "SDKTransactionResultAction", "Stop", "TransactionRequestOnlineAuthentication", "TransactionResultAction", "TransactionUIAction", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$Attest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$Cancel;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CheckAttestation;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$InitializingTransaction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$PINResultAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$PresentCard;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$ReadyToAttest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$ReinitializeTapToPay;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$Stop;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionRequestOnlineAuthentication;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionUIAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Action {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoSizes;

        private Action(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
        }

        /* renamed from: toString, reason: from getter */
        public java.lang.String getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$Stop;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Stop extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Stop INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Stop();

            private Stop() {
                super("Stop", null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$ReadyToAttest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ReadyToAttest extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.ReadyToAttest INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.ReadyToAttest();

            private ReadyToAttest() {
                super("ReadyToAttest", null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CheckAttestation;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Ljava/lang/ref/WeakReference;", "getWeakReferenceActivity", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CheckAttestation extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity;

            public final java.lang.ref.WeakReference<android.app.Activity> getWeakReferenceActivity() {
                return this.weakReferenceActivity;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckAttestation(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("CheckAttestation", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.weakReferenceActivity = weakReference;
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$ReinitializeTapToPay;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Ljava/lang/ref/WeakReference;", "getWeakReferenceActivity", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ReinitializeTapToPay extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity;

            public final java.lang.ref.WeakReference<android.app.Activity> getWeakReferenceActivity() {
                return this.weakReferenceActivity;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReinitializeTapToPay(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("ReinitializeTapToPay", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.weakReferenceActivity = weakReference;
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$InitializingTransaction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Ljava/lang/ref/WeakReference;", "getWeakReferenceActivity", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InitializingTransaction extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity;

            public final java.lang.ref.WeakReference<android.app.Activity> getWeakReferenceActivity() {
                return this.weakReferenceActivity;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitializingTransaction(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("InitializingTransaction", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.weakReferenceActivity = weakReference;
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$PresentCard;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Ljava/lang/ref/WeakReference;", "getWeakReferenceActivity", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PresentCard extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
            private final java.lang.ref.WeakReference<android.app.Activity> weakReferenceActivity;

            public final java.lang.ref.WeakReference<android.app.Activity> getWeakReferenceActivity() {
                return this.weakReferenceActivity;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PresentCard(java.lang.ref.WeakReference<android.app.Activity> weakReference, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("PresentCard", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.weakReferenceActivity = weakReference;
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$Recover;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "config", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConfig", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Recover extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig config;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig getConfig() {
                return this.config;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Recover(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig transactionConfig) {
                super("Recover", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
                this.info = transactionInfo;
                this.config = transactionConfig;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$Cancel;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "paymentFailureReason", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/FailureReason;Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "getOnlineHostRequestMessage", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "getPaymentFailureReason", "()Lcom/zettle/sdk/feature/taptopay/core/FailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Cancel extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action {
            private final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage;
            private final com.zettle.sdk.feature.taptopay.core.FailureReason paymentFailureReason;

            public /* synthetic */ Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason failureReason, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(failureReason, (i & 2) != 0 ? null : onlineHostRequestMessage);
            }

            public final com.zettle.sdk.feature.taptopay.core.FailureReason getPaymentFailureReason() {
                return this.paymentFailureReason;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage getOnlineHostRequestMessage() {
                return this.onlineHostRequestMessage;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Cancel(com.zettle.sdk.feature.taptopay.core.FailureReason failureReason, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage) {
                super(r0.toString(), null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cancel(");
                sb.append(failureReason);
                sb.append(")");
                this.paymentFailureReason = failureReason;
                this.onlineHostRequestMessage = onlineHostRequestMessage;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "CardReadDuplicate", "CardReadError", "CardReadTimeout", "CardTapped", "NFCUnexpectedError", "UnknownCardEvent", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction$CardReadDuplicate;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction$CardReadError;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction$CardReadTimeout;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction$CardTapped;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction$NFCUnexpectedError;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction$UnknownCardEvent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class CardAction extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action {
            private final java.lang.String Camera2StreamConfigurationMap;

            private CardAction(java.lang.String str) {
                super("", null);
                this.Camera2StreamConfigurationMap = str;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action
            /* renamed from: toString, reason: from getter */
            public java.lang.String getGetHighSpeedVideoSizes() {
                return this.Camera2StreamConfigurationMap;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction$UnknownCardEvent;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class UnknownCardEvent extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.UnknownCardEvent INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.UnknownCardEvent();

                private UnknownCardEvent() {
                    super("UnknownCardEvent", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction$NFCUnexpectedError;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class NFCUnexpectedError extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.NFCUnexpectedError INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.NFCUnexpectedError();

                private NFCUnexpectedError() {
                    super("NFCUnexpectedError", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction$CardTapped;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class CardTapped extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardTapped INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardTapped();

                private CardTapped() {
                    super("CardTapped", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction$CardReadError;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class CardReadError extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardReadError INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardReadError();

                private CardReadError() {
                    super("CardReadError", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction$CardReadTimeout;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class CardReadTimeout extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardReadTimeout INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardReadTimeout();

                private CardReadTimeout() {
                    super("CardReadTimeout", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction$CardReadDuplicate;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$CardAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class CardReadDuplicate extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardReadDuplicate INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.CardAction.CardReadDuplicate();

                private CardReadDuplicate() {
                    super("CardReadDuplicate", null);
                }
            }

            public /* synthetic */ CardAction(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\u0002\r\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionUIAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoSizes", "EventCardReadOk", "UnknownEvent", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionUIAction$EventCardReadOk;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionUIAction$UnknownEvent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class TransactionUIAction extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action {

            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
            private final java.lang.String getHighSpeedVideoSizes;

            private TransactionUIAction(java.lang.String str) {
                super("", null);
                this.getHighSpeedVideoSizes = str;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action
            /* renamed from: toString, reason: from getter */
            public java.lang.String getGetHighSpeedVideoSizes() {
                return this.getHighSpeedVideoSizes;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionUIAction$UnknownEvent;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionUIAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class UnknownEvent extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction.UnknownEvent INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction.UnknownEvent();

                private UnknownEvent() {
                    super("UnknownEvent", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionUIAction$EventCardReadOk;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionUIAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class EventCardReadOk extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction.EventCardReadOk INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionUIAction.EventCardReadOk();

                private EventCardReadOk() {
                    super("EventCardReadOk", null);
                }
            }

            public /* synthetic */ TransactionUIAction(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\t\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "SDKTransactionCardError", "SDKTransactionDeclined", "SDKTransactionEndApplicationError", "SDKTransactionFailed", "SDKTransactionFailedAllowFallback", "SDKTransactionNoAppError", "SDKTransactionRequireCDCVM", "SDKTransactionSelectNextInterface", "SDKTransactionTryAgain", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionCardError;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionDeclined;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionEndApplicationError;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionFailed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionFailedAllowFallback;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionNoAppError;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionRequireCDCVM;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionSelectNextInterface;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionTryAgain;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class SDKTransactionResultAction extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action {

            /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            private SDKTransactionResultAction(java.lang.String str) {
                super("", null);
                this.getHighSpeedVideoFpsRangesFor = str;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action
            /* renamed from: toString, reason: from getter */
            public java.lang.String getGetHighSpeedVideoSizes() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionSelectNextInterface;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class SDKTransactionSelectNextInterface extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionSelectNextInterface INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionSelectNextInterface();

                private SDKTransactionSelectNextInterface() {
                    super("SDKTransactionSelectNextInterface", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionCardError;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class SDKTransactionCardError extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionCardError INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionCardError();

                private SDKTransactionCardError() {
                    super("SDKTransactionCardError", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionTryAgain;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class SDKTransactionTryAgain extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionTryAgain INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionTryAgain();

                private SDKTransactionTryAgain() {
                    super("SDKTransactionTryAgain", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionDeclined;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class SDKTransactionDeclined extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionDeclined INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionDeclined();

                private SDKTransactionDeclined() {
                    super("SDKTransactionDeclined", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionFailed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class SDKTransactionFailed extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionFailed INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionFailed();

                private SDKTransactionFailed() {
                    super("SDKTransactionFailed", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionEndApplicationError;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class SDKTransactionEndApplicationError extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionEndApplicationError INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionEndApplicationError();

                private SDKTransactionEndApplicationError() {
                    super("SDKTransactionEndApplicationError", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionFailedAllowFallback;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class SDKTransactionFailedAllowFallback extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionFailedAllowFallback INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionFailedAllowFallback();

                private SDKTransactionFailedAllowFallback() {
                    super("SDKTransactionFailedAllowFallback", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionRequireCDCVM;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class SDKTransactionRequireCDCVM extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionRequireCDCVM INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionRequireCDCVM();

                private SDKTransactionRequireCDCVM() {
                    super("SDKTransactionRequireCDCVM", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction$SDKTransactionNoAppError;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$SDKTransactionResultAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class SDKTransactionNoAppError extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionNoAppError INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.SDKTransactionResultAction.SDKTransactionNoAppError();

                private SDKTransactionNoAppError() {
                    super("SDKTransactionNoAppError", null);
                }
            }

            public /* synthetic */ SDKTransactionResultAction(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionRequestOnlineAuthentication;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "getOnlineHostRequestMessage", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TransactionRequestOnlineAuthentication extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action {
            private final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage;

            public final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage getOnlineHostRequestMessage() {
                return this.onlineHostRequestMessage;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TransactionRequestOnlineAuthentication(com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage) {
                super("TransactionRequestOnlineAuthentication", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineHostRequestMessage, "");
                this.onlineHostRequestMessage = onlineHostRequestMessage;
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "AppCommand", "Approved", "Declined", "Failed", "Finalized", "PermissiveSignature", "RequestSignature", "UploadSignature", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$Recover;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$AppCommand;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$Approved;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$Declined;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$Finalized;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$PermissiveSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$RequestSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$UploadSignature;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class TransactionResultAction extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action {

            /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            private TransactionResultAction(java.lang.String str) {
                super("", null);
                this.getHighResolutionOutputSizeshNQ4ISI = str;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action
            /* renamed from: toString, reason: from getter */
            public java.lang.String getGetHighSpeedVideoSizes() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$Approved;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;", "resultPayload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;", "getResultPayload", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Approved extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction {
                private final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload resultPayload;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Approved(com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload resultPayload) {
                    super("Approved", null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultPayload, "");
                    this.resultPayload = resultPayload;
                }

                public final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload getResultPayload() {
                    return this.resultPayload;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$PermissiveSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "transactionApprovedPayload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "getTransactionApprovedPayload", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class PermissiveSignature extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction {
                private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload transactionApprovedPayload;

                public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload getTransactionApprovedPayload() {
                    return this.transactionApprovedPayload;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public PermissiveSignature(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload transactionApprovedPayload) {
                    super("PermissiveSignature", null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionApprovedPayload, "");
                    this.transactionApprovedPayload = transactionApprovedPayload;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$RequestSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/CardInfo;", "cardInfo", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "transactionApprovedPayload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/CardInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/CardInfo;", "getCardInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/CardInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "getTransactionApprovedPayload", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class RequestSignature extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction {
                private final com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo cardInfo;
                private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload transactionApprovedPayload;

                public final com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo getCardInfo() {
                    return this.cardInfo;
                }

                public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload getTransactionApprovedPayload() {
                    return this.transactionApprovedPayload;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public RequestSignature(com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo cardInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload transactionApprovedPayload) {
                    super("RequestSignature", null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardInfo, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionApprovedPayload, "");
                    this.cardInfo = cardInfo;
                    this.transactionApprovedPayload = transactionApprovedPayload;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$UploadSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;", "signature", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;", "getSignature", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class UploadSignature extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction {
                private final com.zettle.sdk.feature.taptopay.core.transaction.models.Signature signature;

                public final com.zettle.sdk.feature.taptopay.core.transaction.models.Signature getSignature() {
                    return this.signature;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UploadSignature(com.zettle.sdk.feature.taptopay.core.transaction.models.Signature signature) {
                    super("UploadSignature", null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signature, "");
                    this.signature = signature;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$Declined;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionDeclinedPayload;", "transactionDeclined", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionDeclinedPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionDeclinedPayload;", "getTransactionDeclined", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionDeclinedPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Declined extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction {
                private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionDeclinedPayload transactionDeclined;

                public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionDeclinedPayload getTransactionDeclined() {
                    return this.transactionDeclined;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Declined(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionDeclinedPayload transactionDeclinedPayload) {
                    super("Declined", null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDeclinedPayload, "");
                    this.transactionDeclined = transactionDeclinedPayload;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$Finalized;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Finalized extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Finalized INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction.Finalized();

                private Finalized() {
                    super("Finalized", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction;", "Ljava/util/UUID;", com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_LOCAL_TRANSACTION_UUID, "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "reason", "<init>", "(Ljava/util/UUID;Lcom/zettle/sdk/feature/taptopay/core/FailureReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/core/FailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Failed extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction {
                private final com.zettle.sdk.feature.taptopay.core.FailureReason reason;

                public final com.zettle.sdk.feature.taptopay.core.FailureReason getReason() {
                    return this.reason;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Failed(java.util.UUID uuid, com.zettle.sdk.feature.taptopay.core.FailureReason failureReason) {
                    super(r0.toString(), null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(reason:");
                    sb.append(failureReason);
                    sb.append(", localId:");
                    sb.append(uuid);
                    sb.append(")");
                    this.reason = failureReason;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction$AppCommand;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$TransactionResultAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionAppCommandPayload;", "appCommand", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionAppCommandPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionAppCommandPayload;", "getAppCommand", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionAppCommandPayload;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class AppCommand extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.TransactionResultAction {
                public static final java.lang.String APP_COMMAND_ONLINE_PIN_CAPTURE = "ONLINE_PIN_CAPTURE";
                private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionAppCommandPayload appCommand;

                public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionAppCommandPayload getAppCommand() {
                    return this.appCommand;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AppCommand(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionAppCommandPayload transactionAppCommandPayload) {
                    super("AppCommand", null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionAppCommandPayload, "");
                    this.appCommand = transactionAppCommandPayload;
                }
            }

            public /* synthetic */ TransactionResultAction(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\u0002\r\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$PINResultAction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Cancelled", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$PINResultAction$Cancelled;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$PINResultAction$Completed;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class PINResultAction extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action {

            /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            private PINResultAction(java.lang.String str) {
                super("", null);
                this.getHighResolutionOutputSizeshNQ4ISI = str;
            }

            @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\n\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$PINResultAction$Completed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$PINResultAction;", "", "pinBlockKsn", "pinBlock", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getPinBlock", "()Ljava/lang/String;", "getPinBlockKsn"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Completed extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PINResultAction {
                private final java.lang.String pinBlock;
                private final java.lang.String pinBlockKsn;

                public final java.lang.String getPinBlock() {
                    return this.pinBlock;
                }

                public final java.lang.String getPinBlockKsn() {
                    return this.pinBlockKsn;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Completed(java.lang.String str, java.lang.String str2) {
                    super(r0.toString(), null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("PINResultAction.Completed(ksn=");
                    sb.append(str);
                    sb.append(")");
                    this.pinBlockKsn = str;
                    this.pinBlock = str2;
                }
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action
            /* renamed from: toString, reason: from getter */
            public java.lang.String getGetHighSpeedVideoSizes() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$PINResultAction$Cancelled;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$PINResultAction;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Cancelled extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PINResultAction {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PINResultAction.Cancelled INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.PINResultAction.Cancelled();

                private Cancelled() {
                    super("Cancelled", null);
                }
            }

            public /* synthetic */ PINResultAction(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\u0002\r\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$Attest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "FailAttestation", "SucceedAttestation", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$Attest$FailAttestation;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$Attest$SucceedAttestation;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class Attest extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action {

            /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
            private final java.lang.String getHighSpeedVideoFpsRanges;

            private Attest(java.lang.String str) {
                super("", null);
                this.getHighSpeedVideoFpsRanges = str;
            }

            @Override // com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action
            /* renamed from: toString, reason: from getter */
            public java.lang.String getGetHighSpeedVideoSizes() {
                return this.getHighSpeedVideoFpsRanges;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$Attest$SucceedAttestation;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$Attest;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class SucceedAttestation extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Attest {
                public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Attest.SucceedAttestation INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Attest.SucceedAttestation();

                private SucceedAttestation() {
                    super("SucceedAttestation", null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$Attest$FailAttestation;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$Action$Attest;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/ErrorReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class FailAttestation extends com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.Action.Attest {
                private final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason reason;

                /* JADX WARN: Illegal instructions before constructor call */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public FailAttestation(com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason errorReason) {
                    super(r0.toString(), null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("FailAttestation(");
                    sb.append(errorReason);
                    sb.append(")");
                    this.reason = errorReason;
                }

                public final com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason getReason() {
                    return this.reason;
                }
            }

            public /* synthetic */ Attest(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }
        }

        public /* synthetic */ Action(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }
}
