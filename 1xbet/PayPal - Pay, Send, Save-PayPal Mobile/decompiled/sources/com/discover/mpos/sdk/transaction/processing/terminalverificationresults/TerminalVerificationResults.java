package com.discover.mpos.sdk.transaction.processing.terminalverificationresults;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\bB\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR$\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001fX\u0082D¢\u0006\u0002\n\u0000R$\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\tR$\u0010'\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\tR$\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR$\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\tR$\u00100\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\tR$\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR$\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\tR$\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\tR$\u0010<\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR$\u0010?\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0007\"\u0004\bA\u0010\tR$\u0010B\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\tR$\u0010E\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\tR$\u0010H\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u0010\tR$\u0010K\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010\u0007\"\u0004\bM\u0010\tR$\u0010N\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010\u0007\"\u0004\bP\u0010\tR\u000e\u0010Q\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u001fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u001fX\u0082D¢\u0006\u0002\n\u0000R$\u0010U\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010\u0007\"\u0004\bW\u0010\tR$\u0010X\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010\u0007\"\u0004\bZ\u0010\tR$\u0010[\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010\u0007\"\u0004\b]\u0010\tR$\u0010^\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010\u0007\"\u0004\b`\u0010\t¨\u0006a"}, d2 = {"Lcom/discover/mpos/sdk/transaction/processing/terminalverificationresults/TerminalVerificationResults;", "Lcom/discover/mpos/sdk/core/emv/EmvByteInfoList;", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "applicationNotYetEffective", "getApplicationNotYetEffective", "()Z", "setApplicationNotYetEffective", "(Z)V", "cardAppearsOnTerminalExceptionFile", "getCardAppearsOnTerminalExceptionFile", "setCardAppearsOnTerminalExceptionFile", "cardHolderVerificationWasNotSuccessful", "getCardHolderVerificationWasNotSuccessful", "setCardHolderVerificationWasNotSuccessful", "cdaFailed", "getCdaFailed", "setCdaFailed", "ddaFailed", "getDdaFailed", "setDdaFailed", "defaultTdolUsed", "getDefaultTdolUsed", "setDefaultTdolUsed", "expiredApplication", "getExpiredApplication", "setExpiredApplication", "fifthByte", "Lcom/discover/mpos/sdk/core/data/ByteInfo;", "fifthTvrByte", "", "firstByte", "firstTvrByte", "fourthByte", "fourthTvrByte", "iccAndTerminalHaveDifferentApplicationVersions", "getIccAndTerminalHaveDifferentApplicationVersions", "setIccAndTerminalHaveDifferentApplicationVersions", "iccDataMissing", "getIccDataMissing", "setIccDataMissing", "issuerAuthenticationFailed", "getIssuerAuthenticationFailed", "setIssuerAuthenticationFailed", "lowerConsecutiveOfflineLimitExceeded", "getLowerConsecutiveOfflineLimitExceeded", "setLowerConsecutiveOfflineLimitExceeded", "merchantForcedTransactionOnline", "getMerchantForcedTransactionOnline", "setMerchantForcedTransactionOnline", "newCard", "getNewCard", "setNewCard", "offlineDataAuthenticationWasNotPerformed", "getOfflineDataAuthenticationWasNotPerformed", "setOfflineDataAuthenticationWasNotPerformed", "onlinePinEntered", "getOnlinePinEntered", "setOnlinePinEntered", "pinEntryRequiredAndPinPadNotPresentOrNotWorking", "getPinEntryRequiredAndPinPadNotPresentOrNotWorking", "setPinEntryRequiredAndPinPadNotPresentOrNotWorking", "pinEntryRequiredPinPadPresentButPinWasNotEntered", "getPinEntryRequiredPinPadPresentButPinWasNotEntered", "setPinEntryRequiredPinPadPresentButPinWasNotEntered", "pinTryLimitExceeded", "getPinTryLimitExceeded", "setPinTryLimitExceeded", "requestedServiceNotAllowedForCardProduct", "getRequestedServiceNotAllowedForCardProduct", "setRequestedServiceNotAllowedForCardProduct", "scriptProcessingFailedAfterFinalGenerateAC", "getScriptProcessingFailedAfterFinalGenerateAC", "setScriptProcessingFailedAfterFinalGenerateAC", "scriptProcessingFailedBeforeFinalGenerateAC", "getScriptProcessingFailedBeforeFinalGenerateAC", "setScriptProcessingFailedBeforeFinalGenerateAC", "sdaFailed", "getSdaFailed", "setSdaFailed", "secondByte", "secondTvrByte", "thirdByte", "thirdTvrByte", "transactionExceedsFloorLimit", "getTransactionExceedsFloorLimit", "setTransactionExceedsFloorLimit", "transactionSelectedRandomlyForOnlineProcessing", "getTransactionSelectedRandomlyForOnlineProcessing", "setTransactionSelectedRandomlyForOnlineProcessing", "unrecognisedCvm", "getUnrecognisedCvm", "setUnrecognisedCvm", "upperConsecutiveOfflineLimitExceeded", "getUpperConsecutiveOfflineLimitExceeded", "setUpperConsecutiveOfflineLimitExceeded", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.processing.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TerminalVerificationResults extends com.discover.mpos.sdk.core.emv.EmvByteInfoList {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.core.data.ByteInfo f3277a;
    public final com.discover.mpos.sdk.core.data.ByteInfo b;
    public final com.discover.mpos.sdk.core.data.ByteInfo c;
    public final com.discover.mpos.sdk.core.data.ByteInfo d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final com.discover.mpos.sdk.core.data.ByteInfo j;

    public TerminalVerificationResults() {
        super((java.util.List) null, 5, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        this.f = 1;
        this.g = 2;
        this.h = 3;
        this.i = 4;
        this.f3277a = getByteInfoList().get(this.e);
        this.b = getByteInfoList().get(1);
        this.c = getByteInfoList().get(2);
        this.j = getByteInfoList().get(4);
        this.d = getByteInfoList().get(3);
    }

    public final boolean a() {
        return this.f3277a.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.EIGHTH);
    }

    public final void a(boolean z) {
        this.f3277a.setBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.EIGHTH, z);
    }

    public final void b() {
        this.f3277a.setBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SIXTH, true);
    }

    public final boolean c() {
        return this.f3277a.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.FIFTH);
    }

    public final boolean d() {
        return this.f3277a.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.THIRD);
    }

    public final void e() {
        this.f3277a.setBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.THIRD, true);
    }

    public final void b(boolean z) {
        this.b.setBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.FIFTH, z);
    }
}
