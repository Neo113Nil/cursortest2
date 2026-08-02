package my.com.softspace.ssfasstapsdk.pog;

/* loaded from: classes17.dex */
public class RecoverableAction {
    private final java.lang.String action;
    private final int errorCode;
    private final boolean includePackage;
    private final java.lang.String intent;
    private final java.lang.String message;
    private final java.lang.String messageKey;

    public RecoverableAction(java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4) {
        this.intent = str;
        this.includePackage = z;
        this.message = str2;
        this.errorCode = i;
        this.action = str3;
        this.messageKey = str4;
    }

    public java.lang.String getIntent() {
        return this.intent;
    }

    public boolean isIncludePackage() {
        return this.includePackage;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public java.lang.String getAction() {
        return this.action;
    }

    public java.lang.String getMessageKey() {
        return this.messageKey;
    }
}
