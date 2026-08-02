package com.adobe.marketing.mobile.services.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0010\u0011\u0012"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/Presentation;", "T", "", "Lcom/adobe/marketing/mobile/services/ui/PresentationEventListener;", "p0", "<init>", "(Lcom/adobe/marketing/mobile/services/ui/PresentationEventListener;)V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/adobe/marketing/mobile/services/ui/PresentationEventListener;", "getListener", "()Lcom/adobe/marketing/mobile/services/ui/PresentationEventListener;", "Lcom/adobe/marketing/mobile/services/ui/Alert;", "Lcom/adobe/marketing/mobile/services/ui/FloatingButton;", "Lcom/adobe/marketing/mobile/services/ui/InAppMessage;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class Presentation<T extends com.adobe.marketing.mobile.services.ui.Presentation<T>> {
    public static final int $stable = 8;
    private final java.lang.String id;
    private final com.adobe.marketing.mobile.services.ui.PresentationEventListener<T> listener;

    private Presentation(com.adobe.marketing.mobile.services.ui.PresentationEventListener<T> presentationEventListener) {
        this.listener = presentationEventListener;
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        this.id = obj;
    }

    public final com.adobe.marketing.mobile.services.ui.PresentationEventListener<T> getListener() {
        return this.listener;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public /* synthetic */ Presentation(com.adobe.marketing.mobile.services.ui.PresentationEventListener presentationEventListener, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(presentationEventListener);
    }
}
