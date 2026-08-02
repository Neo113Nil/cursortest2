package androidx.webkit;

/* loaded from: classes7.dex */
public interface Navigation {
    boolean didCommit();

    boolean didCommitErrorPage();

    androidx.webkit.Page getPage();

    int getStatusCode();

    java.lang.String getUrl();

    boolean isBack();

    boolean isForward();

    boolean isHistory();

    boolean isReload();

    boolean isRestore();

    boolean isSameDocument();

    boolean wasInitiatedByPage();
}
