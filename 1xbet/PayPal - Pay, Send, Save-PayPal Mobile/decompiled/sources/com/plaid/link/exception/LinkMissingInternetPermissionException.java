package com.plaid.link.exception;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/plaid/link/exception/LinkMissingInternetPermissionException;", "Ljava/lang/IllegalStateException;", "Lkotlin/Camera2StreamConfigurationMap;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LinkMissingInternetPermissionException extends java.lang.IllegalStateException {
    public static final com.plaid.link.exception.LinkMissingInternetPermissionException INSTANCE = new com.plaid.link.exception.LinkMissingInternetPermissionException();

    private LinkMissingInternetPermissionException() {
        super("Please add the Internet permission to your manifest and then uninstall and reinstall your app. https://developer.android.com/training/basics/network-ops/connecting");
    }
}
