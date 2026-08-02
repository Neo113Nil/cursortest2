package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface WebViewStartUpConfigBoundaryInterface {
    java.util.concurrent.Executor getBackgroundExecutor();

    java.util.Set<java.lang.String> getProfileNamesToLoad();

    boolean shouldRunUiThreadStartUpTasks();
}
