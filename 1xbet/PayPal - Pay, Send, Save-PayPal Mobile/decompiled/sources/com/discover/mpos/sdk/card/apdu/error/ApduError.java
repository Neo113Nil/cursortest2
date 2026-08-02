package com.discover.mpos.sdk.card.apdu.error;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "Lcom/discover/mpos/sdk/core/emv/EmvData;", "", "errorData", "<init>", "([B)V", "", "isContentMissing", "()Z", "isErrorCommandNotAllowedDisplayNotPresent", "isErrorCommandNotAllowedDisplayPresent", "toByteArray", "()[B", "", "toString", "()Ljava/lang/String;", "[B"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public class ApduError implements com.discover.mpos.sdk.core.emv.EmvData {
    private final byte[] errorData;

    public ApduError(byte[] bArr) {
        this.errorData = bArr;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.EmvData.DefaultImpls.toHexString(this);
    }

    public final boolean isErrorCommandNotAllowedDisplayPresent() {
        return com.discover.mpos.sdk.card.apdu.emv.StatusCodes.ERROR_COMMAND_NOT_ALLOWED_DISPLAY_PRESENT.a(toByteArray());
    }

    public final boolean isErrorCommandNotAllowedDisplayNotPresent() {
        return com.discover.mpos.sdk.card.apdu.emv.StatusCodes.ERROR_COMMAND_NOT_ALLOWED_DISPLAY_NOT_PRESENT.a(toByteArray());
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public byte[] toByteArray() {
        byte[] bArr = this.errorData;
        return bArr == null ? new byte[0] : bArr;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Apdu Error: ");
        sb.append(toHexString());
        return sb.toString();
    }

    public final boolean isContentMissing() {
        return this.errorData == null;
    }
}
