package sspog;

/* loaded from: classes18.dex */
public final class SSPOGSuggestedAction {
    private final java.lang.String action;
    private final int errorCode;
    private final boolean includePackage;
    private final java.lang.String intent;
    private final java.lang.String message;
    private final java.lang.String messageKey;

    public SSPOGSuggestedAction(java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4) {
        this.intent = str;
        this.includePackage = z;
        this.message = str2;
        this.errorCode = i;
        this.action = str3;
        this.messageKey = str4;
    }

    public SSPOGSuggestedAction(sspog.SSPOGSuggestedAction sSPOGSuggestedAction) {
        if (sSPOGSuggestedAction != null) {
            this.intent = sSPOGSuggestedAction.intent;
            this.includePackage = sSPOGSuggestedAction.includePackage;
            this.message = sSPOGSuggestedAction.message;
            this.errorCode = sSPOGSuggestedAction.errorCode;
            this.action = sSPOGSuggestedAction.action;
            this.messageKey = sSPOGSuggestedAction.messageKey;
            return;
        }
        this.intent = null;
        this.includePackage = false;
        this.message = null;
        this.errorCode = 0;
        this.action = null;
        this.messageKey = null;
    }

    public final java.lang.String getIntent() {
        return this.intent;
    }

    public final boolean isIncludePackage() {
        return this.includePackage;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.String getAction() {
        return this.action;
    }

    public final java.lang.String getMessageKey() {
        return this.messageKey;
    }
}
