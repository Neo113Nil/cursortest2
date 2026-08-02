package M60;

import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private Function2<? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Unit> f17478a;

    /* renamed from: b, reason: collision with root package name */
    private Function1<? super String, Unit> f17479b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6511n<? super String, ? super Integer, ? super String, Unit> f17480c;

    public final void a(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17479b = listener;
    }

    public final void b(@NotNull Function2<? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17478a = listener;
    }

    public final void c(@NotNull InterfaceC6511n<? super String, ? super Integer, ? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17480c = listener;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(@NotNull ConsoleMessage consoleMessage) {
        InterfaceC6511n<? super String, ? super Integer, ? super String, Unit> interfaceC6511n;
        Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && (interfaceC6511n = this.f17480c) != null) {
            String message = consoleMessage.message();
            Intrinsics.checkNotNullExpressionValue(message, "message(...)");
            interfaceC6511n.invoke(message, Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.sourceId());
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(@NotNull PermissionRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(@NotNull PermissionRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        Function1<? super String, Unit> function1 = this.f17479b;
        if (function1 != null) {
            function1.invoke(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(@NotNull WebView webView, @NotNull ValueCallback<Uri[]> filePathCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
        Intrinsics.checkNotNullParameter(fileChooserParams, "fileChooserParams");
        Function2<? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Unit> function2 = this.f17478a;
        if (function2 == null) {
            return true;
        }
        function2.invoke(filePathCallback, fileChooserParams);
        return true;
    }
}
