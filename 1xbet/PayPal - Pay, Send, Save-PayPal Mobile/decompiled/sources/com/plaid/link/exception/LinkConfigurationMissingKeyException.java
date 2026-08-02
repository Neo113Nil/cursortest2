package com.plaid.link.exception;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/plaid/link/exception/LinkConfigurationMissingKeyException;", "Lcom/plaid/link/exception/InvalidLinkConfigurationException;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LinkConfigurationMissingKeyException extends com.plaid.link.exception.InvalidLinkConfigurationException {
    public static final com.plaid.link.exception.LinkConfigurationMissingKeyException INSTANCE = new com.plaid.link.exception.LinkConfigurationMissingKeyException();

    private LinkConfigurationMissingKeyException() {
        super("Please provide your Link Token https://plaid.com/docs/link/link-token-migration-guide/ or continue using the deprecated public key https://plaid.com/docs/link/maintain-legacy-integration/#plaid-link-for-android", null);
    }
}
