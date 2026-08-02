package org.betup.ui.dialogs.presentation.bridge;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.google.android.gms.appinvite.PreviewActivity;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PresentationWebViewBridgeImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\b\u0010\u0010\u001a\u00020\u000eH\u0007J\b\u0010\u0011\u001a\u00020\u000eH\u0007J\b\u0010\u0012\u001a\u00020\u0005H\u0007J\b\u0010\u0013\u001a\u00020\u0007H\u0007J\b\u0010\u0014\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lorg/betup/ui/dialogs/presentation/bridge/PresentationWebViewBridgeImpl;", "", "handler", "Lorg/betup/ui/dialogs/presentation/bridge/PresentationWebViewBridgeHandler;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "", "allowRemindLater", "", "allowSkip", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/dialogs/presentation/bridge/PresentationWebViewBridgeHandler;Ljava/lang/String;ZZ)V", "mainHandler", "Landroid/os/Handler;", PreviewActivity.ON_CLICK_LISTENER_CLOSE, "", "skip", "later", "remindLater", "getLanguage", "isRemindLaterEnabled", "isSkipEnabled", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresentationWebViewBridgeImpl {
    public static final int $stable = 8;
    private final boolean allowRemindLater;
    private final boolean allowSkip;
    private final PresentationWebViewBridgeHandler handler;
    private final String languageCode;
    private final Handler mainHandler;

    public PresentationWebViewBridgeImpl(PresentationWebViewBridgeHandler handler, String languageCode, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        this.handler = handler;
        this.languageCode = languageCode;
        this.allowRemindLater = z;
        this.allowSkip = z2;
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$0(PresentationWebViewBridgeImpl presentationWebViewBridgeImpl) {
        presentationWebViewBridgeImpl.handler.onClose();
    }

    @JavascriptInterface
    public final void close() {
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.presentation.bridge.PresentationWebViewBridgeImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                PresentationWebViewBridgeImpl.close$lambda$0(PresentationWebViewBridgeImpl.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void skip$lambda$1(PresentationWebViewBridgeImpl presentationWebViewBridgeImpl) {
        presentationWebViewBridgeImpl.handler.onSkip();
    }

    @JavascriptInterface
    public final void skip() {
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.presentation.bridge.PresentationWebViewBridgeImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                PresentationWebViewBridgeImpl.skip$lambda$1(PresentationWebViewBridgeImpl.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void later$lambda$2(PresentationWebViewBridgeImpl presentationWebViewBridgeImpl) {
        presentationWebViewBridgeImpl.handler.onRemindLater();
    }

    @JavascriptInterface
    public final void later() {
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.presentation.bridge.PresentationWebViewBridgeImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                PresentationWebViewBridgeImpl.later$lambda$2(PresentationWebViewBridgeImpl.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void remindLater$lambda$3(PresentationWebViewBridgeImpl presentationWebViewBridgeImpl) {
        presentationWebViewBridgeImpl.handler.onRemindLater();
    }

    @JavascriptInterface
    public final void remindLater() {
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.presentation.bridge.PresentationWebViewBridgeImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PresentationWebViewBridgeImpl.remindLater$lambda$3(PresentationWebViewBridgeImpl.this);
            }
        });
    }

    @JavascriptInterface
    /* renamed from: getLanguage, reason: from getter */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    @JavascriptInterface
    /* renamed from: isRemindLaterEnabled, reason: from getter */
    public final boolean getAllowRemindLater() {
        return this.allowRemindLater;
    }

    @JavascriptInterface
    /* renamed from: isSkipEnabled, reason: from getter */
    public final boolean getAllowSkip() {
        return this.allowSkip;
    }
}
