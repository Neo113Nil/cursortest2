package androidx.webkit;

import androidx.webkit.WebNavigationClient;

@WebNavigationClient.ExperimentalNavigationCallback
/* loaded from: classes3.dex */
public interface Navigation {
    boolean didCommit();

    boolean didCommitErrorPage();

    Page getPage();

    int getStatusCode();

    boolean isBack();

    boolean isForward();

    boolean isHistory();

    boolean isReload();

    boolean isRestore();

    boolean isSameDocument();

    boolean wasInitiatedByPage();
}
