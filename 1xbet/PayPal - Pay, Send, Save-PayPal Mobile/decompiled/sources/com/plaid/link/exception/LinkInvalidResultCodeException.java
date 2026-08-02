package com.plaid.link.exception;

@kotlin.Deprecated(message = "This exception will no longer be thrown, instead a LinkExit will be returned.")
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/plaid/link/exception/LinkInvalidResultCodeException;", "Ljava/lang/IllegalStateException;", "Lkotlin/Camera2StreamConfigurationMap;", "", "code", "<init>", "(I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkInvalidResultCodeException extends java.lang.IllegalStateException {
    public LinkInvalidResultCodeException(int i) {
        super("Unknown result code: ".concat(java.lang.String.valueOf(i)));
    }
}
