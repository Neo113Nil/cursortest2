package androidx.webkit;

/* loaded from: classes7.dex */
public final class WebViewAssetLoader {
    public static final java.lang.String DEFAULT_DOMAIN = "appassets.androidplatform.net";
    private final java.util.List<androidx.webkit.WebViewAssetLoader.PathMatcher> getHighSpeedVideoSizes;

    public interface PathHandler {
        android.webkit.WebResourceResponse handle(java.lang.String str);
    }

    public static final class AssetsPathHandler implements androidx.webkit.WebViewAssetLoader.PathHandler {
        private final androidx.webkit.internal.AssetHelper Camera2StreamConfigurationMap;

        public AssetsPathHandler(android.content.Context context) {
            this.Camera2StreamConfigurationMap = new androidx.webkit.internal.AssetHelper(context);
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public final android.webkit.WebResourceResponse handle(java.lang.String str) {
            try {
                return new android.webkit.WebResourceResponse(androidx.webkit.internal.AssetHelper.guessMimeType(str), null, this.Camera2StreamConfigurationMap.openAsset(str));
            } catch (java.io.IOException unused) {
                return new android.webkit.WebResourceResponse(null, null, null);
            }
        }
    }

    public static final class ResourcesPathHandler implements androidx.webkit.WebViewAssetLoader.PathHandler {
        private final androidx.webkit.internal.AssetHelper getHighSpeedVideoFpsRangesFor;

        public ResourcesPathHandler(android.content.Context context) {
            this.getHighSpeedVideoFpsRangesFor = new androidx.webkit.internal.AssetHelper(context);
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public final android.webkit.WebResourceResponse handle(java.lang.String str) {
            try {
                return new android.webkit.WebResourceResponse(androidx.webkit.internal.AssetHelper.guessMimeType(str), null, this.getHighSpeedVideoFpsRangesFor.openResource(str));
            } catch (android.content.res.Resources.NotFoundException | java.io.IOException unused) {
                return new android.webkit.WebResourceResponse(null, null, null);
            }
        }
    }

    public static final class InternalStoragePathHandler implements androidx.webkit.WebViewAssetLoader.PathHandler {
        private static final java.lang.String[] Camera2StreamConfigurationMap = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
        private final java.io.File getHighResolutionOutputSizeshNQ4ISI;

        public InternalStoragePathHandler(android.content.Context context, java.io.File file) {
            try {
                java.io.File file2 = new java.io.File(androidx.webkit.internal.AssetHelper.getCanonicalDirPath(file));
                this.getHighResolutionOutputSizeshNQ4ISI = file2;
                java.lang.String canonicalDirPath = androidx.webkit.internal.AssetHelper.getCanonicalDirPath(file2);
                java.lang.String canonicalDirPath2 = androidx.webkit.internal.AssetHelper.getCanonicalDirPath(context.getCacheDir());
                java.lang.String canonicalDirPath3 = androidx.webkit.internal.AssetHelper.getCanonicalDirPath(androidx.webkit.internal.AssetHelper.getDataDir(context));
                if ((canonicalDirPath.startsWith(canonicalDirPath2) || canonicalDirPath.startsWith(canonicalDirPath3)) && !canonicalDirPath.equals(canonicalDirPath2) && !canonicalDirPath.equals(canonicalDirPath3)) {
                    for (java.lang.String str : Camera2StreamConfigurationMap) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(canonicalDirPath3);
                        sb.append(str);
                        if (!canonicalDirPath.startsWith(sb.toString())) {
                        }
                    }
                    return;
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The given directory \"");
                sb2.append(file);
                sb2.append("\" doesn't exist under an allowed app internal storage directory");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to resolve the canonical path for the given directory: ");
                sb3.append(file.getPath());
                throw new java.lang.IllegalArgumentException(sb3.toString(), e);
            }
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public final android.webkit.WebResourceResponse handle(java.lang.String str) {
            java.io.File canonicalFileIfChild;
            try {
                canonicalFileIfChild = androidx.webkit.internal.AssetHelper.getCanonicalFileIfChild(this.getHighResolutionOutputSizeshNQ4ISI, str);
            } catch (java.io.IOException unused) {
            }
            if (canonicalFileIfChild != null) {
                return new android.webkit.WebResourceResponse(androidx.webkit.internal.AssetHelper.guessMimeType(str), null, androidx.webkit.internal.AssetHelper.openFile(canonicalFileIfChild));
            }
            new java.lang.Object[]{str, this.getHighResolutionOutputSizeshNQ4ISI};
            return new android.webkit.WebResourceResponse(null, null, null);
        }
    }

    static class PathMatcher {
        final boolean getHighResolutionOutputSizeshNQ4ISI;
        final java.lang.String getHighSpeedVideoFpsRanges;
        final java.lang.String getHighSpeedVideoFpsRangesFor;
        final androidx.webkit.WebViewAssetLoader.PathHandler getHighSpeedVideoSizes;

        PathMatcher(java.lang.String str, java.lang.String str2, boolean z, androidx.webkit.WebViewAssetLoader.PathHandler pathHandler) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new java.lang.IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
                throw new java.lang.IllegalArgumentException("Path should end with a slash '/'");
            }
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getHighSpeedVideoSizes = pathHandler;
        }
    }

    public static final class Builder {
        private boolean getHighSpeedVideoSizes;
        private java.lang.String getHighSpeedVideoFpsRangesFor = androidx.webkit.WebViewAssetLoader.DEFAULT_DOMAIN;
        private final java.util.List<androidx.core.util.Pair<java.lang.String, androidx.webkit.WebViewAssetLoader.PathHandler>> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

        public final androidx.webkit.WebViewAssetLoader.Builder setDomain(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
            return this;
        }

        public final androidx.webkit.WebViewAssetLoader.Builder setHttpAllowed(boolean z) {
            this.getHighSpeedVideoSizes = z;
            return this;
        }

        public final androidx.webkit.WebViewAssetLoader.Builder addPathHandler(java.lang.String str, androidx.webkit.WebViewAssetLoader.PathHandler pathHandler) {
            this.getHighSpeedVideoFpsRanges.add(androidx.core.util.Pair.create(str, pathHandler));
            return this;
        }

        public final androidx.webkit.WebViewAssetLoader build() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (androidx.core.util.Pair<java.lang.String, androidx.webkit.WebViewAssetLoader.PathHandler> pair : this.getHighSpeedVideoFpsRanges) {
                arrayList.add(new androidx.webkit.WebViewAssetLoader.PathMatcher(this.getHighSpeedVideoFpsRangesFor, pair.first, this.getHighSpeedVideoSizes, pair.second));
            }
            return new androidx.webkit.WebViewAssetLoader(arrayList);
        }
    }

    WebViewAssetLoader(java.util.List<androidx.webkit.WebViewAssetLoader.PathMatcher> list) {
        this.getHighSpeedVideoSizes = list;
    }

    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.net.Uri uri) {
        android.webkit.WebResourceResponse handle;
        java.util.Iterator<androidx.webkit.WebViewAssetLoader.PathMatcher> it = this.getHighSpeedVideoSizes.iterator();
        while (true) {
            androidx.webkit.WebViewAssetLoader.PathHandler pathHandler = null;
            if (!it.hasNext()) {
                return null;
            }
            androidx.webkit.WebViewAssetLoader.PathMatcher next = it.next();
            if ((!uri.getScheme().equals("http") || next.getHighResolutionOutputSizeshNQ4ISI) && ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(next.getHighSpeedVideoFpsRanges) && uri.getPath().startsWith(next.getHighSpeedVideoFpsRangesFor))) {
                pathHandler = next.getHighSpeedVideoSizes;
            }
            if (pathHandler != null && (handle = pathHandler.handle(uri.getPath().replaceFirst(next.getHighSpeedVideoFpsRangesFor, ""))) != null) {
                return handle;
            }
        }
    }
}
