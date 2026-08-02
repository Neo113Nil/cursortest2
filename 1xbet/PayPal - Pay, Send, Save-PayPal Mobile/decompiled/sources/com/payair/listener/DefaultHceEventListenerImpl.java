package com.payair.listener;

@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0016¢\u0006\u0004\b#\u0010$J/\u0010'\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%2\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001bH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010,J/\u0010/\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00122\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J7\u00105\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00122\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u0014H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001bH\u0016¢\u0006\u0004\b>\u0010*J\u000f\u0010?\u001a\u00020\u001bH\u0016¢\u0006\u0004\b?\u0010*J\u000f\u0010@\u001a\u00020\u001bH\u0016¢\u0006\u0004\b@\u0010*J!\u0010B\u001a\u00020\u001b2\u0006\u0010-\u001a\u0002012\b\u0010.\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u001bH\u0016¢\u0006\u0004\bD\u0010*J\u000f\u0010E\u001a\u00020\u001bH\u0016¢\u0006\u0004\bE\u0010*J\u000f\u0010F\u001a\u00020\u001bH\u0016¢\u0006\u0004\bF\u0010*R\"\u0010K\u001a\u00020\u00148\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010\u001f\"\u0004\bJ\u00109R\"\u0010\u001e\u001a\u00020\u00148\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bL\u0010H\u001a\u0004\bM\u0010\u001f\"\u0004\bN\u00109"}, d2 = {"Lcom/payair/listener/DefaultHceEventListenerImpl;", "Lcom/payair/listener/HceEventListenerImpl;", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSdk", "Lcom/payair/logic/storage/StorageService;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lcom/payair/db/Database;", "database", "Lcom/payair/logic/managers/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/payair/logic/storage/SchemeStorage;", "schemeStorage", "Lcom/payair/logic/storage/EnrollmentIdStorage;", "enrollmentIdStorage", "Lcom/payair/logic/managers/TokenRefreshManager;", "refreshManager", "<init>", "(Lcom/payair/logic/implementation/HceSDKInterface;Lcom/payair/logic/storage/StorageService;Lcom/payair/db/Database;Lcom/payair/logic/managers/CoroutineDispatcherProvider;Lcom/payair/logic/storage/SchemeStorage;Lcom/payair/logic/storage/EnrollmentIdStorage;Lcom/payair/logic/managers/TokenRefreshManager;)V", "", com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY, "", "isTransactionCompletedOnTheApplication", "", "amount", "Ljava/util/Currency;", "currency", "transactionOutcome", "", "onContactlessPaymentCompleted", "([BZLjava/lang/Long;Ljava/util/Currency;[B)V", "ignoreFailedTransaction", "()Z", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "onContactlessPaymentIncident", "([BLjava/lang/Exception;)V", "Lcom/payair/hce/ContactlessAbortResaon;", "contactlessAbortResaon", "onContactlessPaymentAborted", "([BLcom/payair/hce/ContactlessAbortResaon;Ljava/lang/Exception;)V", "onTransactionStopped", "()V", "onCardProvisionCompleted", "([B)V", "errorCode", "errorMessage", "onCardProvisionFailure", "([B[BLjava/lang/Exception;)V", "", "numberOfTransactionCredentials", "onReplenishCompleted", "([BI)V", "onReplenishFailed", "([B[B[BLjava/lang/Exception;)V", "isDeviceUnlock", "onShowAuthenticateScreen", "(Z)V", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "result", "onUserValidationObtained", "(Landroidx/biometric/BiometricPrompt$AuthenticationResult;)V", "sdkTooOldNeedReset", "onDeviceNotSecure", "onUploadUnlockKeys", "", "onAuthenticationError", "(ILjava/lang/CharSequence;)V", "onAuthenticationFailed", "transactionCanBeResumed", "onSdkUnregistered", "h", "Z", "getNeedsTransactionRestart$core_release", "setNeedsTransactionRestart$core_release", "needsTransactionRestart", "i", "getIgnoreFailedTransaction$core_release", "setIgnoreFailedTransaction$core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultHceEventListenerImpl extends com.payair.listener.HceEventListenerImpl {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.implementation.HceSDKInterface f4389a;
    public final com.payair.logic.storage.StorageService b;
    public final com.payair.db.Database c;
    public final com.payair.logic.managers.CoroutineDispatcherProvider d;
    public final com.payair.logic.storage.SchemeStorage e;
    public final com.payair.logic.storage.EnrollmentIdStorage f;
    public final com.payair.logic.managers.TokenRefreshManager g;

    /* renamed from: h, reason: from kotlin metadata */
    public boolean needsTransactionRestart;

    /* renamed from: i, reason: from kotlin metadata */
    public boolean ignoreFailedTransaction;

    public DefaultHceEventListenerImpl(com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.logic.storage.StorageService storageService, com.payair.db.Database database, com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider, com.payair.logic.storage.SchemeStorage schemeStorage, com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage, com.payair.logic.managers.TokenRefreshManager tokenRefreshManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(schemeStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollmentIdStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenRefreshManager, "");
        this.f4389a = hceSDKInterface;
        this.b = storageService;
        this.c = database;
        this.d = coroutineDispatcherProvider;
        this.e = schemeStorage;
        this.f = enrollmentIdStorage;
        this.g = tokenRefreshManager;
    }

    /* renamed from: getIgnoreFailedTransaction$core_release, reason: from getter */
    public final boolean getIgnoreFailedTransaction() {
        return this.ignoreFailedTransaction;
    }

    /* renamed from: getNeedsTransactionRestart$core_release, reason: from getter */
    public final boolean getNeedsTransactionRestart() {
        return this.needsTransactionRestart;
    }

    @Override // com.payair.hce.HCEEventListener
    public final boolean ignoreFailedTransaction() {
        boolean z = this.ignoreFailedTransaction;
        this.ignoreFailedTransaction = false;
        this.needsTransactionRestart = false;
        return z;
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onAuthenticationError(int errorCode, java.lang.CharSequence errorMessage) {
        java.lang.String str;
        this.needsTransactionRestart = false;
        if (errorMessage == null || (str = errorMessage.toString()) == null) {
            str = "";
        }
        com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("These are the two values: ");
        sb.append((java.lang.Object) errorMessage);
        sb.append(" ");
        sb.append(str);
        com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
        com.payair.listener.model.EventError eventError = new com.payair.listener.model.EventError(java.lang.String.valueOf(errorCode), str);
        com.paypal.android.logger.Logger log2 = com.payair.logging.LoggerKt.getLog();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("onAuthenticationCancelled called with eventError = [");
        sb2.append(eventError);
        sb2.append("]");
        com.paypal.android.logger.Logger.d$default(log2, sb2.toString(), null, null, 6, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onAuthenticationCancelled(eventError);
        }
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onAuthenticationFailed() {
        com.payair.listener.model.EventError eventError = new com.payair.listener.model.EventError("9999", "Authentication failed");
        com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onAuthenticationFailed called with eventError = [");
        sb.append(eventError);
        sb.append("]");
        com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onAuthenticationFailed(eventError);
        }
    }

    @Override // com.payair.listener.HceEventListenerImpl, com.payair.hce.HCEEventListener
    public final void onCardProvisionCompleted(byte[] tokenUniqueReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReference, "");
        java.lang.String convertToString = com.payair.logic.extensions.ByteArrayExtKt.convertToString(tokenUniqueReference);
        com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onCardProvisionCompleted called with networkTokenReference = [");
        sb.append(convertToString);
        sb.append("]");
        com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.d.getIOScope(), null, null, new com.payair.csdk.i0(this, tokenUniqueReference, convertToString, null), 3, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onCardProvisionedCompleted(convertToString);
        }
    }

    @Override // com.payair.listener.HceEventListenerImpl, com.payair.hce.HCEEventListener
    public final void onCardProvisionFailure(byte[] errorCode, byte[] errorMessage, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        com.payair.listener.model.EventError eventError = new com.payair.listener.model.EventError(com.payair.logic.extensions.ByteArrayExtKt.convertToString(errorCode), com.payair.logic.extensions.ByteArrayExtKt.convertToString(errorMessage));
        com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onCardProvisionFailure called with eventError = [");
        sb.append(eventError);
        sb.append("]");
        com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onCardProvisionFailure(eventError);
        }
    }

    @Override // com.payair.listener.HceEventListenerImpl, com.payair.hce.HCEEventListener
    public final void onContactlessPaymentAborted(byte[] tokenUniqueReference, com.payair.hce.ContactlessAbortResaon contactlessAbortResaon, java.lang.Exception exception) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactlessAbortResaon, "");
        java.lang.String convertToString = com.payair.logic.extensions.ByteArrayExtKt.convertToString(tokenUniqueReference);
        java.util.Iterator<E> it = com.payair.listener.model.TransactionStatus.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.payair.listener.model.TransactionStatus) obj).name(), contactlessAbortResaon.name())) {
                    break;
                }
            }
        }
        com.payair.listener.model.TransactionEventData transactionEventData = new com.payair.listener.model.TransactionEventData(false, null, null, (com.payair.listener.model.TransactionStatus) obj);
        com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onPaymentCompleted called with networkTokenReference = [");
        sb.append(convertToString);
        sb.append("], transactionEventData = [");
        sb.append(transactionEventData);
        sb.append("]");
        com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onPaymentAborted(convertToString, transactionEventData);
        }
    }

    @Override // com.payair.listener.HceEventListenerImpl, com.payair.hce.HCEEventListener
    public final void onContactlessPaymentCompleted(byte[] tokenUniqueReference, boolean isTransactionCompletedOnTheApplication, java.lang.Long amount, java.util.Currency currency, byte[] transactionOutcome) {
        com.payair.listener.model.TransactionStatus transactionStatus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionOutcome, "");
        java.lang.String convertToString = com.payair.logic.extensions.ByteArrayExtKt.convertToString(tokenUniqueReference);
        com.payair.listener.model.TransactionStatus[] values = com.payair.listener.model.TransactionStatus.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                transactionStatus = null;
                break;
            }
            transactionStatus = values[i];
            if (kotlin.jvm.internal.Intrinsics.areEqual(transactionStatus.name(), com.payair.logic.extensions.ByteArrayExtKt.convertToString(transactionOutcome))) {
                break;
            } else {
                i++;
            }
        }
        com.payair.listener.model.TransactionEventData transactionEventData = new com.payair.listener.model.TransactionEventData(isTransactionCompletedOnTheApplication, amount, currency, transactionStatus);
        com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onPaymentCompleted called with networkTokenReference = [");
        sb.append(convertToString);
        sb.append("], transactionEventData = [");
        sb.append(transactionEventData);
        sb.append("]");
        com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onPaymentCompleted(convertToString, transactionEventData);
        }
    }

    @Override // com.payair.listener.HceEventListenerImpl, com.payair.hce.HCEEventListener
    public final void onContactlessPaymentIncident(byte[] tokenUniqueReference, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReference, "");
        this.needsTransactionRestart = false;
        java.lang.String convertToString = com.payair.logic.extensions.ByteArrayExtKt.convertToString(tokenUniqueReference);
        com.payair.listener.model.TransactionEventData transactionEventData = new com.payair.listener.model.TransactionEventData(false, null, null, com.payair.listener.model.TransactionStatus.GENERAL_ERROR);
        com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onPaymentCompleted called with networkTokenReference = [");
        sb.append(convertToString);
        sb.append("], transactionEventData = [");
        sb.append(transactionEventData);
        sb.append("]");
        com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onPaymentCompleted(convertToString, transactionEventData);
        }
    }

    @Override // com.payair.listener.HceEventListenerImpl, com.payair.hce.HCEEventListener
    public final void onDeviceNotSecure() {
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onDeviceNotSecure();
        }
    }

    @Override // com.payair.listener.HceEventListenerImpl, com.payair.hce.HCEEventListener
    public final void onReplenishCompleted(byte[] tokenUniqueReference, int numberOfTransactionCredentials) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReference, "");
        java.lang.String convertToString = com.payair.logic.extensions.ByteArrayExtKt.convertToString(tokenUniqueReference);
        com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onReplenishCompleted called with networkTokenReference = [");
        sb.append(convertToString);
        sb.append("]");
        com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onReplenishCompleted(convertToString);
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.d.getIOScope(), null, null, new com.payair.csdk.j0(this, null), 3, null);
    }

    @Override // com.payair.listener.HceEventListenerImpl, com.payair.hce.HCEEventListener
    public final void onReplenishFailed(byte[] tokenUniqueReference, byte[] errorCode, byte[] errorMessage, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        java.lang.String convertToString = com.payair.logic.extensions.ByteArrayExtKt.convertToString(tokenUniqueReference);
        com.payair.listener.model.EventError eventError = new com.payair.listener.model.EventError(com.payair.logic.extensions.ByteArrayExtKt.convertToString(errorCode), com.payair.logic.extensions.ByteArrayExtKt.convertToString(errorMessage));
        com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onReplenishCompleted called with networkTokenReference = [");
        sb.append(convertToString);
        sb.append("], eventError = [");
        sb.append(eventError);
        sb.append("]");
        com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onReplenishFailed(eventError, convertToString);
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.d.getIOScope(), null, null, new com.payair.csdk.k0(this, null), 3, null);
    }

    @Override // com.payair.hce.HCEEventListener
    public final void onSdkUnregistered() {
        com.paypal.android.logger.Logger.w$default(com.payair.logging.LoggerKt.getLog(), "HCE disabled due to unsafe environment.", null, null, 6, null);
        this.b.clear();
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "onResetSDK called", null, null, 6, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onResetSDK();
        }
        this.c.clear();
    }

    @Override // com.payair.listener.HceEventListenerImpl, com.payair.hce.HCEEventListener
    public final void onShowAuthenticateScreen(boolean isDeviceUnlock) {
        if (isDeviceUnlock) {
            this.needsTransactionRestart = true;
        }
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "onPaymentAuthentication called", null, null, 6, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onPaymentAuthentication();
        }
    }

    @Override // com.payair.listener.HceEventListenerImpl, com.payair.hce.HCEEventListener
    public final void onUploadUnlockKeys() {
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onUploadUnlockKeys();
        }
    }

    @Override // com.payair.listener.HceEventListenerImpl, com.payair.hce.HCEEventListener
    public final void onUserValidationObtained(androidx.biometric.BiometricPrompt.AuthenticationResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "onPaymentAuthenticationSuccess called", null, null, 6, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onPaymentAuthenticationSuccess(result);
        }
        if (this.needsTransactionRestart) {
            com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "onTransactionRestartRequired called", null, null, 6, null);
            com.payair.listener.ClientListener d2 = this.f4389a.getD();
            if (d2 != null) {
                d2.onTransactionRestartRequired();
            }
            this.ignoreFailedTransaction = true;
        }
        this.needsTransactionRestart = false;
    }

    @Override // com.payair.listener.HceEventListenerImpl, com.payair.hce.HCEEventListener
    public final void sdkTooOldNeedReset() {
        this.b.clear();
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "onResetSDK called", null, null, 6, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onResetSDK();
        }
        this.c.clear();
    }

    public final void setIgnoreFailedTransaction$core_release(boolean z) {
        this.ignoreFailedTransaction = z;
    }

    public final void setNeedsTransactionRestart$core_release(boolean z) {
        this.needsTransactionRestart = z;
    }

    @Override // com.payair.hce.HCEEventListener
    public final void transactionCanBeResumed() {
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "onTransactionReadyToBeResumed called", null, null, 6, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onTransactionReadyToBeResumed();
        }
    }

    @Override // com.payair.listener.HceEventListenerImpl, com.payair.hce.HCEEventListener
    public final void onTransactionStopped() {
        com.payair.listener.model.TransactionEventData transactionEventData = new com.payair.listener.model.TransactionEventData(false, null, null, com.payair.listener.model.TransactionStatus.GENERAL_ERROR);
        com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onPaymentCompleted called with networkTokenReference = [null], transactionEventData = [");
        sb.append(transactionEventData);
        sb.append("]");
        com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
        com.payair.listener.ClientListener d = this.f4389a.getD();
        if (d != null) {
            d.onPaymentStopped(transactionEventData);
        }
    }
}
