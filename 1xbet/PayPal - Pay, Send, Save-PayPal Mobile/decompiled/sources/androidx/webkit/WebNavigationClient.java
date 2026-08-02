package androidx.webkit;

/* loaded from: classes7.dex */
public interface WebNavigationClient {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface ExperimentalNavigationCallback {
    }

    void onFirstContentfulPaint(androidx.webkit.Page page);

    void onNavigationCompleted(androidx.webkit.Navigation navigation);

    void onNavigationRedirected(androidx.webkit.Navigation navigation);

    void onNavigationStarted(androidx.webkit.Navigation navigation);

    void onPageDeleted(androidx.webkit.Page page);

    void onPageDomContentLoadedEventFired(androidx.webkit.Page page);

    void onPageLoadEventFired(androidx.webkit.Page page);
}
