package androidx.webkit;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewCompat;
import java.util.List;

@WebViewCompat.ExperimentalAsyncStartUp
/* loaded from: classes3.dex */
public interface WebViewStartUpResult {
    @Nullable
    @SuppressLint({"NullableCollection"})
    List<BlockingStartUpLocation> getBlockingStartUpLocations();

    @Nullable
    @SuppressLint({"AutoBoxing"})
    Long getMaxTimePerTaskInUiThreadMillis();

    @Nullable
    @SuppressLint({"AutoBoxing"})
    Long getTotalTimeInUiThreadMillis();
}
