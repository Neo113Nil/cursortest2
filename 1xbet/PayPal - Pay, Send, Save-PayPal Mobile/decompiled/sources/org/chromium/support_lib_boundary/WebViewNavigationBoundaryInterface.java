package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface WebViewNavigationBoundaryInterface extends org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface {
    boolean didCommit();

    boolean didCommitErrorPage();

    java.lang.reflect.InvocationHandler getPage();

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
