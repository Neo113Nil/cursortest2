package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat;

@WebViewCompat.ExperimentalAsyncStartUp
/* loaded from: classes3.dex */
public interface BlockingStartUpLocation {
    @NonNull
    String getStackInformation();
}
