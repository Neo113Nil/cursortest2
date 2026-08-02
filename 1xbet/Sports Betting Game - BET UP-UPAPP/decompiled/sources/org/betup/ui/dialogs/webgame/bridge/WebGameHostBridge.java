package org.betup.ui.dialogs.webgame.bridge;

import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: WebGameHostBridge.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/betup/ui/dialogs/webgame/bridge/WebGameHostBridge;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "HOST_OBJECT_NAME", "", "refreshBalanceScript", "getRefreshBalanceScript", "()Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebGameHostBridge {
    public static final int $stable = 0;
    public static final String HOST_OBJECT_NAME = "BetupWebGameHost";
    public static final WebGameHostBridge INSTANCE = new WebGameHostBridge();
    private static final String refreshBalanceScript = "(function() {\n    try {\n        var host = window.BetupWebGameHost;\n        if (host && typeof host.refreshBalanceFromHost === 'function') {\n            host.refreshBalanceFromHost();\n        }\n    } catch (e) {}\n})();";

    private WebGameHostBridge() {
    }

    public final String getRefreshBalanceScript() {
        return refreshBalanceScript;
    }
}
