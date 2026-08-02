package com.discover.mpos.sdk.card.apdu.emv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0017\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000j\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/emv/StatusCodes;", "", "Lcom/discover/mpos/sdk/core/emv/EmvData;", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "statusWordSize", "checkStatus", "", "response", "", "toByteArray", "SUCCESS", "WARNING_SELECTED_FILE_DEACTIVATED", "WARNING_AUTHENTICATOIN_FAILED", "ERROR_WRONG_LENGTH", "ERROR_SECURITY_STATUS_NOT_SATISFIED", "ERROR_COMMAND_NOT_ALLOWED_AUTHENTICATION_METHOD_BLOCKED", "ERROR_COMMAND_NOT_ALLOWED_REFERENCE_DATA_NOT_USABLE", "ERROR_COMMAND_NOT_ALLOWED_CONDITIONS_NOT_SATISFIED", "ERROR_WRONG_PARAMETERS_FUNCTION_NOT_SUPPORTED", "ERROR_WRONG_PARAMETERS_APPLICATION_NOT_FOUND", "ERROR_WRONG_PARAMETERS_RECORD_NOT_FOUND", "ERROR_INCORRECT_PARAMETERS", "ERROR_INVALID_PARAMETERS", "ERROR_REFERENCE_DATA_NOT_FOUND", "ERROR_INSTRUCTION_NOT_SUPPORTED", "ERROR_CLASS_NOT_SUPPORTED", "ERROR_UNKNOWN", "ERROR_INTERNAL", "ERROR_COMMUNICATION", "ERROR_COMMAND_NOT_ALLOWED_DISPLAY_PRESENT", "ERROR_COMMAND_NOT_ALLOWED_DISPLAY_NOT_PRESENT", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.a.i, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public enum StatusCodes implements com.discover.mpos.sdk.core.emv.EmvData {
    SUCCESS(36864),
    WARNING_SELECTED_FILE_DEACTIVATED(25219),
    WARNING_AUTHENTICATOIN_FAILED(25344),
    ERROR_WRONG_LENGTH(26368),
    ERROR_SECURITY_STATUS_NOT_SATISFIED(27010),
    ERROR_COMMAND_NOT_ALLOWED_AUTHENTICATION_METHOD_BLOCKED(27011),
    ERROR_COMMAND_NOT_ALLOWED_REFERENCE_DATA_NOT_USABLE(27012),
    ERROR_COMMAND_NOT_ALLOWED_CONDITIONS_NOT_SATISFIED(27013),
    ERROR_WRONG_PARAMETERS_FUNCTION_NOT_SUPPORTED(27265),
    ERROR_WRONG_PARAMETERS_APPLICATION_NOT_FOUND(27266),
    ERROR_WRONG_PARAMETERS_RECORD_NOT_FOUND(27267),
    ERROR_INCORRECT_PARAMETERS(27270),
    ERROR_INVALID_PARAMETERS(27392),
    ERROR_REFERENCE_DATA_NOT_FOUND(27272),
    ERROR_INSTRUCTION_NOT_SUPPORTED(27904),
    ERROR_CLASS_NOT_SUPPORTED(28160),
    ERROR_UNKNOWN(28416),
    ERROR_INTERNAL(65535),
    ERROR_COMMUNICATION(org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER),
    ERROR_COMMAND_NOT_ALLOWED_DISPLAY_PRESENT(27014),
    ERROR_COMMAND_NOT_ALLOWED_DISPLAY_NOT_PRESENT(27015);

    private final int w = 2;
    private final int x;

    StatusCodes(int i) {
        this.x = i;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.EmvData.DefaultImpls.toHexString(this);
    }

    public final boolean a(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        int length = bArr.length;
        int i = this.w;
        if (length >= i) {
            return (com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(bArr[bArr.length - 1]) ^ ((com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(bArr[bArr.length - i]) << 8) ^ this.x)) == 0;
        }
        return false;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public final byte[] getB() {
        return com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toHexByteArray(this.x, this.w);
    }
}
