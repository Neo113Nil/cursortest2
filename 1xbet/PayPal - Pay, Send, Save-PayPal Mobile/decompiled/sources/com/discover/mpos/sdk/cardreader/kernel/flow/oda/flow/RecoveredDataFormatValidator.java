package com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/flow/RecoveredDataFormatValidator;", "", "format", "", "(B)V", "", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "trailer", "debugTag", "", "isFormatOk", "", "recoveredFormat", "isHeaderWellFormatted", "recoveredHeader", "isTrailerWellFormatted", "recoveredTrailer", "isWellFormatted", "recoveredData", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/model/RecoveredDataFormat;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.b.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class RecoveredDataFormatValidator {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f3097a;
    private final byte[] b = {106};
    private final byte[] c = {org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};

    public RecoveredDataFormatValidator(byte b) {
        this.f3097a = new byte[]{b};
    }

    public final boolean a(com.discover.mpos.sdk.cardreader.kernel.flow.oda.model.RecoveredDataFormat recoveredDataFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recoveredDataFormat, "");
        byte[] a2 = recoveredDataFormat.a();
        boolean equals = java.util.Arrays.equals(a2, this.b);
        if (!equals) {
            new java.lang.Object[]{a2};
        }
        if (!equals) {
            return false;
        }
        byte[] c = recoveredDataFormat.c();
        boolean equals2 = java.util.Arrays.equals(c, this.c);
        if (!equals2) {
            new java.lang.Object[]{c};
        }
        if (!equals2) {
            return false;
        }
        byte[] b = recoveredDataFormat.b();
        boolean equals3 = java.util.Arrays.equals(b, this.f3097a);
        if (!equals3) {
            new java.lang.Object[]{this.f3097a, b};
        }
        return equals3;
    }
}
