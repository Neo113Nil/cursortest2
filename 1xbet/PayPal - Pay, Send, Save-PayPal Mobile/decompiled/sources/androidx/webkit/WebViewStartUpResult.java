package androidx.webkit;

/* loaded from: classes7.dex */
public interface WebViewStartUpResult {
    java.lang.Long getMaxTimePerTaskInUiThreadMillis();

    java.util.List<androidx.webkit.StartUpLocation> getNonUiThreadBlockingStartUpLocations();

    java.lang.Long getTotalTimeInUiThreadMillis();

    java.util.List<androidx.webkit.StartUpLocation> getUiThreadBlockingStartUpLocations();
}
