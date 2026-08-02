package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebStorageAdapter implements org.chromium.support_lib_boundary.WebStorageBoundaryInterface {
    final org.chromium.support_lib_boundary.WebStorageBoundaryInterface getHighSpeedVideoSizes;

    public WebStorageAdapter(org.chromium.support_lib_boundary.WebStorageBoundaryInterface webStorageBoundaryInterface) {
        this.getHighSpeedVideoSizes = webStorageBoundaryInterface;
    }

    @Override // org.chromium.support_lib_boundary.WebStorageBoundaryInterface
    public void deleteBrowsingData(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        this.getHighSpeedVideoSizes.deleteBrowsingData(executor, runnable);
    }

    @Override // org.chromium.support_lib_boundary.WebStorageBoundaryInterface
    public java.lang.String deleteBrowsingDataForSite(java.lang.String str, java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        return this.getHighSpeedVideoSizes.deleteBrowsingDataForSite(str, executor, runnable);
    }
}
