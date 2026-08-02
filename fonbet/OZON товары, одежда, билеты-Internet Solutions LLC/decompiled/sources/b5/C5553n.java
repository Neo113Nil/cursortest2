package b5;

import androidx.annotation.NonNull;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;

/* renamed from: b5.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5553n {

    /* renamed from: a, reason: collision with root package name */
    private final WebViewCookieManagerBoundaryInterface f55532a;

    public C5553n(@NonNull WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.f55532a = webViewCookieManagerBoundaryInterface;
    }

    @NonNull
    public final List<String> a(@NonNull String str) {
        return this.f55532a.getCookieInfo(str);
    }
}
