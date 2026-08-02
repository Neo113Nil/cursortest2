package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface WebViewStartUpResultBoundaryInterface {
    java.util.List<java.lang.Throwable> getAsyncStartUpLocations();

    java.util.List<java.lang.Throwable> getBlockingStartUpLocations();

    java.lang.Long getMaxTimePerTaskInUiThreadMillis();

    java.lang.Long getTotalTimeInUiThreadMillis();
}
