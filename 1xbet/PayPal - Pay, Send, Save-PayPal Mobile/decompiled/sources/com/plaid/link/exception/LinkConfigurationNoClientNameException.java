package com.plaid.link.exception;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/plaid/link/exception/LinkConfigurationNoClientNameException;", "Lcom/plaid/link/exception/InvalidLinkConfigurationException;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LinkConfigurationNoClientNameException extends com.plaid.link.exception.InvalidLinkConfigurationException {
    public static final com.plaid.link.exception.LinkConfigurationNoClientNameException INSTANCE = new com.plaid.link.exception.LinkConfigurationNoClientNameException();

    private LinkConfigurationNoClientNameException() {
        super("Client name must not be null or empty.", null);
    }
}
