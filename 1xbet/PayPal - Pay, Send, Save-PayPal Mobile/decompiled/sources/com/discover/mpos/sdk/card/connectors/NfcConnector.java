package com.discover.mpos.sdk.card.connectors;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ$\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\u0006\b\u0001\u0012\u00020!\u0018\u00010\u001f2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H\u0016J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0002J\u0012\u0010'\u001a\u00020\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\bR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/discover/mpos/sdk/card/connectors/NfcConnector;", "Lcom/discover/mpos/sdk/card/connectors/CardConnector;", "()V", "connectionCounter", "Lcom/discover/mpos/sdk/core/performance/Benchmark;", "connectionTime", "", "getConnectionTime", "()J", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "executionTime", "getExecutionTime", "onConnectionEstablishedCallback", "Lcom/discover/mpos/sdk/card/connectors/CardConnector$OnConnectionEstablishedCallback;", "requestExecutionCounter", "tagTechnology", "Landroid/nfc/tech/IsoDep;", "attachTo", "", "activity", "Landroid/app/Activity;", "debugTag", "", "detachFrom", "execute", "Lcom/discover/mpos/sdk/card/apdu/base/ApduResponse;", "", "Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "request", "Lcom/discover/mpos/sdk/card/apdu/base/ApduRequest;", "onTagReceived", "tag", "Landroid/nfc/Tag;", "setOnConnectionEstablishedCallback", "NfcReaderCallback", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.connectors.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class NfcConnector implements com.discover.mpos.sdk.card.connectors.CardConnector {

    /* renamed from: a, reason: collision with root package name */
    android.nfc.tech.IsoDep f2978a;
    com.discover.mpos.sdk.card.connectors.CardConnector.OnConnectionEstablishedCallback b;
    final com.discover.mpos.sdk.core.performance.Benchmark c = new com.discover.mpos.sdk.core.performance.PerformanceCounter();
    private final com.discover.mpos.sdk.core.performance.Benchmark d = new com.discover.mpos.sdk.core.performance.PerformanceCounter();
    private boolean e;

    @Override // com.discover.mpos.sdk.card.connectors.CardConnector
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    @Override // com.discover.mpos.sdk.card.connectors.CardConnector
    public final void setEnabled(boolean z) {
        this.e = z;
        if (z) {
            this.c.reset();
            this.d.reset();
            return;
        }
        android.nfc.tech.IsoDep isoDep = this.f2978a;
        if (isoDep != null) {
            if (isoDep == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (isoDep.isConnected()) {
                android.nfc.tech.IsoDep isoDep2 = this.f2978a;
                if (isoDep2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                }
                isoDep2.close();
            }
        }
        this.c.stop();
    }

    @Override // com.discover.mpos.sdk.card.connectors.CardConnector
    public final long getConnectionTime() {
        return this.c.getTotalTime();
    }

    @Override // com.discover.mpos.sdk.card.connectors.CardConnector
    public final long getExecutionTime() {
        return this.d.getTotalTime();
    }

    @Override // com.discover.mpos.sdk.card.connectors.CardConnector
    public final com.discover.mpos.sdk.card.apdu.base.ApduResponse<byte[], ? extends com.discover.mpos.sdk.card.apdu.error.ApduError> execute(com.discover.mpos.sdk.card.apdu.base.ApduRequest<?> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        if (this.f2978a == null || !getE()) {
            return null;
        }
        new java.lang.Object[]{request};
        this.d.start();
        android.nfc.tech.IsoDep isoDep = this.f2978a;
        if (isoDep == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        }
        com.discover.mpos.sdk.card.apdu.base.ByteArrayApduResponse byteArrayApduResponse = new com.discover.mpos.sdk.card.apdu.base.ByteArrayApduResponse(isoDep.transceive(request.getK()), null, 2, null);
        this.d.stop();
        return getE() ? byteArrayApduResponse : null;
    }

    @Override // com.discover.mpos.sdk.card.connectors.CardConnector
    public final void setOnConnectionEstablishedCallback(com.discover.mpos.sdk.card.connectors.CardConnector.OnConnectionEstablishedCallback onConnectionEstablishedCallback) {
        this.b = onConnectionEstablishedCallback;
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/discover/mpos/sdk/card/connectors/NfcConnector$NfcReaderCallback;", "Landroid/nfc/NfcAdapter$ReaderCallback;", "(Lcom/discover/mpos/sdk/card/connectors/NfcConnector;)V", "onTagDiscovered", "", "tag", "Landroid/nfc/Tag;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.card.connectors.b$a */
    public final class a implements android.nfc.NfcAdapter.ReaderCallback {
        public a() {
        }

        @Override // android.nfc.NfcAdapter.ReaderCallback
        public final void onTagDiscovered(android.nfc.Tag tag) {
            new java.lang.Object[]{java.lang.Boolean.valueOf(com.discover.mpos.sdk.card.connectors.NfcConnector.this.getE())};
            if (!com.discover.mpos.sdk.card.connectors.NfcConnector.this.getE() || tag == null) {
                return;
            }
            com.discover.mpos.sdk.card.connectors.NfcConnector nfcConnector = com.discover.mpos.sdk.card.connectors.NfcConnector.this;
            nfcConnector.f2978a = android.nfc.tech.IsoDep.get(tag);
            android.nfc.tech.IsoDep isoDep = nfcConnector.f2978a;
            if (isoDep == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            }
            isoDep.connect();
            android.nfc.tech.IsoDep isoDep2 = nfcConnector.f2978a;
            if (isoDep2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            }
            isoDep2.isConnected();
            nfcConnector.c.start();
            com.discover.mpos.sdk.card.connectors.CardConnector.OnConnectionEstablishedCallback onConnectionEstablishedCallback = nfcConnector.b;
            if (onConnectionEstablishedCallback != null) {
                onConnectionEstablishedCallback.onConnectionSet();
            }
        }
    }
}
