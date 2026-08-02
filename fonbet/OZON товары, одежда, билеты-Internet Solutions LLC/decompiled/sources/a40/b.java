package a40;

import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final C0690a f36264a = new C0690a();

        /* renamed from: a40.b$a$a, reason: collision with other inner class name */
        public static final class C0690a implements b {
            @Override // a40.b
            public final void callAsync(String parametersJson) {
                Intrinsics.checkNotNullParameter(parametersJson, "parametersJson");
            }

            @Override // a40.b
            public final String callSync(String parametersJson) {
                Intrinsics.checkNotNullParameter(parametersJson, "parametersJson");
                return "";
            }
        }

        @NotNull
        public static C0690a a() {
            return f36264a;
        }
    }

    @JavascriptInterface
    void callAsync(@NotNull String str);

    @JavascriptInterface
    @NotNull
    String callSync(@NotNull String str);
}
