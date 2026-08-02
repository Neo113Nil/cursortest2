package com.dyneti.shared_interfaces;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006JA\u0010\u000f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\nH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/dyneti/shared_interfaces/DynetiNFC;", "", "Landroid/app/Activity;", "activity", "", "enableScanning", "(Landroid/app/Activity;)V", "disableScanning", "Landroid/content/Intent;", "intent", "Lkotlin/Function1;", "Lcom/dyneti/shared_interfaces/DynetiNFCCard;", "onRead", "", "onError", "handleIntent", "(Landroid/content/Intent;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "", "isAvailable", "(Landroid/content/Context;)Z", "Lcom/dyneti/shared_interfaces/DynetiLogger;", "dynetiLogger", "dynetiSetLogger", "(Lcom/dyneti/shared_interfaces/DynetiLogger;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface DynetiNFC {
    void disableScanning(android.app.Activity activity);

    void dynetiSetLogger(com.dyneti.shared_interfaces.DynetiLogger dynetiLogger);

    void enableScanning(android.app.Activity activity);

    void handleIntent(android.content.Intent intent, kotlin.jvm.functions.Function1<? super com.dyneti.shared_interfaces.DynetiNFCCard, kotlin.Unit> onRead, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError);

    boolean isAvailable(android.content.Context context);
}
