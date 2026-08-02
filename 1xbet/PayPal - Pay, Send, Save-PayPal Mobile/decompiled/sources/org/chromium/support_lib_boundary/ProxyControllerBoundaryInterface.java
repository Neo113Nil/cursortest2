package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface ProxyControllerBoundaryInterface {
    void clearProxyOverride(java.lang.Runnable runnable, java.util.concurrent.Executor executor);

    void setProxyOverride(java.lang.String[][] strArr, java.lang.String[] strArr2, java.lang.Runnable runnable, java.util.concurrent.Executor executor);

    void setProxyOverride(java.lang.String[][] strArr, java.lang.String[] strArr2, java.lang.Runnable runnable, java.util.concurrent.Executor executor, boolean z);
}
