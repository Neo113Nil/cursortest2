package b5;

import a5.C4944b;
import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.activity.z;
import androidx.annotation.NonNull;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* renamed from: b5.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5546g {
    @NonNull
    public static TracingController a() {
        TracingController tracingController;
        tracingController = TracingController.getInstance();
        return tracingController;
    }

    @NonNull
    public static ClassLoader b() {
        ClassLoader webViewClassLoader;
        webViewClassLoader = WebView.getWebViewClassLoader();
        return webViewClassLoader;
    }

    @NonNull
    public static Looper c(@NonNull WebView webView) {
        Looper webViewLooper;
        webViewLooper = webView.getWebViewLooper();
        return webViewLooper;
    }

    public static boolean d(@NonNull TracingController tracingController) {
        boolean isTracing;
        isTracing = tracingController.isTracing();
        return isTracing;
    }

    public static void e(@NonNull String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static void f(@NonNull TracingController tracingController, @NonNull C4944b c4944b) {
        z.a();
        throw null;
    }

    public static boolean g(@NonNull TracingController tracingController, OutputStream outputStream, @NonNull Executor executor) {
        boolean stop;
        stop = tracingController.stop(outputStream, executor);
        return stop;
    }
}
