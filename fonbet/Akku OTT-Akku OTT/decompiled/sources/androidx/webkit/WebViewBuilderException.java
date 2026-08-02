package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class WebViewBuilderException extends Exception {
    public WebViewBuilderException(@NonNull String str, @Nullable Throwable th) {
        super(str, th);
    }
}
