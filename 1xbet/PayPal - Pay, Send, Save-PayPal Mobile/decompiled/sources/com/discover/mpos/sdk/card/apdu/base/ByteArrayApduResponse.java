package com.discover.mpos.sdk.card.apdu.base;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0004\u001a\u00020\u00028\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/base/ByteArrayApduResponse;", "Lcom/discover/mpos/sdk/card/apdu/base/ApduResponse;", "", "Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "content", "error", "<init>", "([BLcom/discover/mpos/sdk/card/apdu/error/ApduError;)V", "[B", "getContent", "()[B", "setContent", "([B)V", "Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "getError", "()Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "setError", "(Lcom/discover/mpos/sdk/card/apdu/error/ApduError;)V"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class ByteArrayApduResponse implements com.discover.mpos.sdk.card.apdu.base.ApduResponse<byte[], com.discover.mpos.sdk.card.apdu.error.ApduError> {
    private byte[] content;
    private com.discover.mpos.sdk.card.apdu.error.ApduError error;

    public ByteArrayApduResponse(byte[] bArr, com.discover.mpos.sdk.card.apdu.error.ApduError apduError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.content = bArr;
        this.error = apduError;
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final boolean isExecutionFailed() {
        return com.discover.mpos.sdk.card.apdu.base.ApduResponse.a.b(this);
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final boolean isSuccessful() {
        return com.discover.mpos.sdk.card.apdu.base.ApduResponse.a.a(this);
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final byte[] getContent() {
        return this.content;
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final void setContent(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.content = bArr;
    }

    public /* synthetic */ ByteArrayApduResponse(byte[] bArr, com.discover.mpos.sdk.card.apdu.error.ApduError apduError, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? null : apduError);
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final com.discover.mpos.sdk.card.apdu.error.ApduError getError() {
        return this.error;
    }

    @Override // com.discover.mpos.sdk.card.apdu.base.ApduResponse
    public final void setError(com.discover.mpos.sdk.card.apdu.error.ApduError apduError) {
        this.error = apduError;
    }
}
