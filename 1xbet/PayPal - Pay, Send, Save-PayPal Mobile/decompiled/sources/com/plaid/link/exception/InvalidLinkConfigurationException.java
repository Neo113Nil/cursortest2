package com.plaid.link.exception;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007\u0082\u0001\t\b\t\n\u000b\f\r\u000e\u000f\u0010"}, d2 = {"Lcom/plaid/link/exception/InvalidLinkConfigurationException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/getHighSpeedVideoSizes;", "", "userMessage", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "Lcom/plaid/link/exception/LinkConfigurationInvalidCountryCodeException;", "Lcom/plaid/link/exception/LinkConfigurationInvalidInstitutionIdException;", "Lcom/plaid/link/exception/LinkConfigurationInvalidLanguageException;", "Lcom/plaid/link/exception/LinkConfigurationMalformedLinkTokenException;", "Lcom/plaid/link/exception/LinkConfigurationMissingKeyException;", "Lcom/plaid/link/exception/LinkConfigurationMissingTokenException;", "Lcom/plaid/link/exception/LinkConfigurationNoClientNameException;", "Lcom/plaid/link/exception/LinkConfigurationNoProductException;", "Lcom/plaid/link/exception/LinkNoConfigurationException;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class InvalidLinkConfigurationException extends java.lang.IllegalArgumentException {
    private final java.lang.String userMessage;

    public /* synthetic */ InvalidLinkConfigurationException(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private InvalidLinkConfigurationException(java.lang.String str) {
        super(str);
        this.userMessage = str;
    }
}
