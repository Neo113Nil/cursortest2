package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface WebStorageBoundaryInterface {
    void deleteBrowsingData(java.util.concurrent.Executor executor, java.lang.Runnable runnable);

    java.lang.String deleteBrowsingDataForSite(java.lang.String str, java.util.concurrent.Executor executor, java.lang.Runnable runnable);
}
