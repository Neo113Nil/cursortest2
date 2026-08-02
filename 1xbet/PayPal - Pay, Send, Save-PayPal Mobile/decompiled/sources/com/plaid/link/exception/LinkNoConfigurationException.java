package com.plaid.link.exception;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/plaid/link/exception/LinkNoConfigurationException;", "Lcom/plaid/link/exception/InvalidLinkConfigurationException;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LinkNoConfigurationException extends com.plaid.link.exception.InvalidLinkConfigurationException {
    public static final com.plaid.link.exception.LinkNoConfigurationException INSTANCE = new com.plaid.link.exception.LinkNoConfigurationException();

    private LinkNoConfigurationException() {
        super("Please provide a LinkTokenConfiguration. We recommend upgrading to Link Tokens if you have not yet https://plaid.com/docs/link/link-token-migration-guide/", null);
    }
}
