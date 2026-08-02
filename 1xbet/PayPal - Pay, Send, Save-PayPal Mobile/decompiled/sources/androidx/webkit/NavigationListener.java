package androidx.webkit;

/* loaded from: classes7.dex */
public interface NavigationListener {
    default void onFirstContentfulPaint(androidx.webkit.Page page, long j) {
    }

    default void onNavigationCompleted(androidx.webkit.Navigation navigation) {
    }

    default void onNavigationRedirected(androidx.webkit.Navigation navigation) {
    }

    default void onNavigationStarted(androidx.webkit.Navigation navigation) {
    }

    default void onPageDeleted(androidx.webkit.Page page) {
    }

    default void onPageDomContentLoadedEvent(androidx.webkit.Page page) {
    }

    default void onPageLoadEvent(androidx.webkit.Page page) {
    }
}
