package com.adobe.marketing.mobile.services.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\n\u000b\f\r\u000e"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/ShowFailed;", "Lcom/adobe/marketing/mobile/services/ui/PresentationError;", "", "p0", "<init>", "(Ljava/lang/String;)V", "reason", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "Lcom/adobe/marketing/mobile/services/ui/AlreadyShown;", "Lcom/adobe/marketing/mobile/services/ui/ConflictingPresentation;", "Lcom/adobe/marketing/mobile/services/ui/DelegateGateNotMet;", "Lcom/adobe/marketing/mobile/services/ui/NoAttachableActivity;", "Lcom/adobe/marketing/mobile/services/ui/SuppressedByAppDeveloper;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class ShowFailed implements com.adobe.marketing.mobile.services.ui.PresentationError {
    public static final int $stable = 0;
    private final java.lang.String reason;

    private ShowFailed(java.lang.String str) {
        this.reason = str;
    }

    public final java.lang.String getReason() {
        return this.reason;
    }

    public /* synthetic */ ShowFailed(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
