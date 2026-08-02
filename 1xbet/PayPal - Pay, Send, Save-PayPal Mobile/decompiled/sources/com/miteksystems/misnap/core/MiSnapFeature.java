package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapFeature;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "BARCODE", "ID", "DEPOSIT", "GENERIC", "FACE", "NFC", "VOICE", "ENHANCED_MANUAL", "DOCUMENT_CLASSIFICATION", "DOCUMENT_EXTRACTION"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public enum MiSnapFeature {
    BARCODE(com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE),
    ID("id"),
    DEPOSIT("deposit"),
    GENERIC("generic"),
    FACE("face"),
    NFC("nfc"),
    VOICE("voice"),
    ENHANCED_MANUAL("em"),
    DOCUMENT_CLASSIFICATION("odc"),
    DOCUMENT_EXTRACTION("ode");


    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String value;

    public final java.lang.String getValue() {
        return this.value;
    }

    MiSnapFeature(java.lang.String str) {
        this.value = str;
    }
}
