package com.discover.mpos.sdk.transaction.processing.transactionstatusinformation;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/discover/mpos/sdk/transaction/processing/transactionstatusinformation/TransactionStatusInformation;", "Lcom/discover/mpos/sdk/core/emv/EmvByteInfoList;", "()V", "byteInfo", "Lcom/discover/mpos/sdk/core/data/ByteInfo;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "cardHolderVerificationWasPerformed", "getCardHolderVerificationWasPerformed", "()Z", "setCardHolderVerificationWasPerformed", "(Z)V", "cardRiskManagementWasPerformed", "getCardRiskManagementWasPerformed", "setCardRiskManagementWasPerformed", "issuerAuthenticationWasPerformed", "getIssuerAuthenticationWasPerformed", "setIssuerAuthenticationWasPerformed", "offlineDataAuthenticationWasPerformed", "getOfflineDataAuthenticationWasPerformed", "setOfflineDataAuthenticationWasPerformed", "scriptProcessingWasPerformed", "getScriptProcessingWasPerformed", "setScriptProcessingWasPerformed", "terminalRiskManagementWasPerformed", "getTerminalRiskManagementWasPerformed", "setTerminalRiskManagementWasPerformed", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.processing.c.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TransactionStatusInformation extends com.discover.mpos.sdk.core.emv.EmvByteInfoList {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.core.data.ByteInfo f3278a;

    public TransactionStatusInformation() {
        super((java.util.List) null, 2, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        this.f3278a = getByteInfoList().get(0);
    }

    public final void a() {
        this.f3278a.setBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SEVENTH, true);
    }
}
