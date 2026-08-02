package com.plaid.link.exception;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/plaid/link/exception/LinkNoNetworkException;", "Ljava/lang/IllegalStateException;", "Lkotlin/Camera2StreamConfigurationMap;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LinkNoNetworkException extends java.lang.IllegalStateException {
    public static final com.plaid.link.exception.LinkNoNetworkException INSTANCE = new com.plaid.link.exception.LinkNoNetworkException();

    private LinkNoNetworkException() {
        super("No network is available, please check your internet connection before opening Link again.");
    }
}
