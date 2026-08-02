package org.betup.ui.dialogs.webgame.bridge;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetupWebGameBridgeImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lorg/betup/ui/dialogs/webgame/bridge/BetupWebGameBridgeImpl;", "", "handler", "Lorg/betup/ui/dialogs/webgame/bridge/BetupWebGameBridgeHandler;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/dialogs/webgame/bridge/BetupWebGameBridgeHandler;)V", "mainHandler", "Landroid/os/Handler;", "onBalanceUpdated", "", "payload", "", "onGameResult", "onNotEnoughMoney", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BetupWebGameBridgeImpl {
    public static final int $stable = 8;
    private final BetupWebGameBridgeHandler handler;
    private final Handler mainHandler;

    public BetupWebGameBridgeImpl(BetupWebGameBridgeHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handler = handler;
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBalanceUpdated$lambda$0(BetupWebGameBridgeImpl betupWebGameBridgeImpl, String str) {
        betupWebGameBridgeImpl.handler.onBalanceUpdatedJson(str);
    }

    @JavascriptInterface
    public final void onBalanceUpdated(final String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.webgame.bridge.BetupWebGameBridgeImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BetupWebGameBridgeImpl.onBalanceUpdated$lambda$0(BetupWebGameBridgeImpl.this, payload);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGameResult$lambda$1(BetupWebGameBridgeImpl betupWebGameBridgeImpl, String str) {
        betupWebGameBridgeImpl.handler.onGameResultJson(str);
    }

    @JavascriptInterface
    public final void onGameResult(final String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.webgame.bridge.BetupWebGameBridgeImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BetupWebGameBridgeImpl.onGameResult$lambda$1(BetupWebGameBridgeImpl.this, payload);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNotEnoughMoney$lambda$2(BetupWebGameBridgeImpl betupWebGameBridgeImpl, String str) {
        betupWebGameBridgeImpl.handler.onNotEnoughMoneyJson(str);
    }

    @JavascriptInterface
    public final void onNotEnoughMoney(final String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.mainHandler.post(new Runnable() { // from class: org.betup.ui.dialogs.webgame.bridge.BetupWebGameBridgeImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BetupWebGameBridgeImpl.onNotEnoughMoney$lambda$2(BetupWebGameBridgeImpl.this, payload);
            }
        });
    }
}
