package androidx.core.content;

/* loaded from: classes3.dex */
public class FileProvider extends android.content.ContentProvider {
    private static final java.lang.String ATTR_NAME = "name";
    private static final java.lang.String ATTR_PATH = "path";
    private static final java.lang.String DISPLAYNAME_FIELD = "displayName";
    private static final java.lang.String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final java.lang.String TAG_CACHE_PATH = "cache-path";
    private static final java.lang.String TAG_EXTERNAL = "external-path";
    private static final java.lang.String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final java.lang.String TAG_EXTERNAL_FILES = "external-files-path";
    private static final java.lang.String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final java.lang.String TAG_FILES_PATH = "files-path";
    private static final java.lang.String TAG_ROOT_PATH = "root-path";
    private java.lang.String mAuthority;
    private androidx.core.content.FileProvider.PathStrategy mLocalPathStrategy;
    private final java.lang.Object mLock;
    private final int mResourceId;
    private static final java.lang.String[] COLUMNS = {"_display_name", "_size"};
    private static final java.io.File DEVICE_ROOT = new java.io.File(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
    private static final java.util.HashMap<java.lang.String, androidx.core.content.FileProvider.PathStrategy> sCache = new java.util.HashMap<>();

    interface PathStrategy {
        android.net.Uri getHighResolutionOutputSizeshNQ4ISI(java.io.File file);

        java.io.File getHighSpeedVideoFpsRanges(android.net.Uri uri);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    public FileProvider() {
        this(0);
    }

    protected FileProvider(int i) {
        this.mLock = new java.lang.Object();
        this.mResourceId = i;
    }

    public static android.net.Uri getUriForFile(android.content.Context context, java.lang.String str, java.io.File file) {
        return getPathStrategy(context, str, 0).getHighResolutionOutputSizeshNQ4ISI(file);
    }

    public static android.net.Uri getUriForFile(android.content.Context context, java.lang.String str, java.io.File file, java.lang.String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }

    private static androidx.core.content.FileProvider.PathStrategy getPathStrategy(android.content.Context context, java.lang.String str, int i) {
        androidx.core.content.FileProvider.PathStrategy pathStrategy;
        java.util.HashMap<java.lang.String, androidx.core.content.FileProvider.PathStrategy> hashMap = sCache;
        synchronized (hashMap) {
            pathStrategy = hashMap.get(str);
            if (pathStrategy == null) {
                try {
                    try {
                        pathStrategy = parsePathStrategy(context, str, i);
                        hashMap.put(str, pathStrategy);
                    } catch (org.xmlpull.v1.XmlPullParserException e) {
                        throw new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    }
                } catch (java.io.IOException e2) {
                    throw new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return pathStrategy;
    }

    static android.content.res.XmlResourceParser getFileProviderPathsMetaData(android.content.Context context, java.lang.String str, android.content.pm.ProviderInfo providerInfo, int i) {
        if (providerInfo == null) {
            throw new java.lang.IllegalArgumentException("Couldn't find meta-data for provider with authority ".concat(java.lang.String.valueOf(str)));
        }
        if (providerInfo.metaData == null && i != 0) {
            providerInfo.metaData = new android.os.Bundle(1);
            providerInfo.metaData.putInt(META_DATA_FILE_PROVIDER_PATHS, i);
        }
        android.content.res.XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new java.lang.IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    private static androidx.core.content.FileProvider.PathStrategy parsePathStrategy(android.content.Context context, java.lang.String str, int i) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        androidx.core.content.FileProvider.SimplePathStrategy simplePathStrategy = new androidx.core.content.FileProvider.SimplePathStrategy(str);
        android.content.res.XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next == 1) {
                return simplePathStrategy;
            }
            if (next == 2) {
                java.lang.String name2 = fileProviderPathsMetaData.getName();
                java.io.File file = null;
                java.lang.String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                java.lang.String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, ATTR_PATH);
                if (TAG_ROOT_PATH.equals(name2)) {
                    file = DEVICE_ROOT;
                } else if (TAG_FILES_PATH.equals(name2)) {
                    file = context.getFilesDir();
                } else if (TAG_CACHE_PATH.equals(name2)) {
                    file = context.getCacheDir();
                } else if (TAG_EXTERNAL.equals(name2)) {
                    file = android.os.Environment.getExternalStorageDirectory();
                } else if (TAG_EXTERNAL_FILES.equals(name2)) {
                    java.io.File[] externalFilesDirs = androidx.core.content.ContextCompat.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    }
                } else if (TAG_EXTERNAL_CACHE.equals(name2)) {
                    java.io.File[] externalCacheDirs = androidx.core.content.ContextCompat.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        file = externalCacheDirs[0];
                    }
                } else if (TAG_EXTERNAL_MEDIA.equals(name2)) {
                    java.io.File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        file = externalMediaDirs[0];
                    }
                }
                if (file != null) {
                    java.io.File buildPath = buildPath(file, attributeValue2);
                    if (android.text.TextUtils.isEmpty(attributeValue)) {
                        throw new java.lang.IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        simplePathStrategy.getHighSpeedVideoFpsRanges.put(attributeValue, buildPath.getCanonicalFile());
                    } catch (java.io.IOException e) {
                        throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for ".concat(java.lang.String.valueOf(buildPath)), e);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private static int modeToMode(java.lang.String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new java.lang.IllegalArgumentException("Invalid mode: ".concat(java.lang.String.valueOf(str)));
    }

    private static java.io.File buildPath(java.io.File file, java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (str != null) {
                file = new java.io.File(file, str);
            }
        }
        return file;
    }

    private static java.lang.String[] copyOf(java.lang.String[] strArr, int i) {
        java.lang.String[] strArr2 = new java.lang.String[i];
        java.lang.System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    private static java.lang.Object[] copyOf(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = new java.lang.Object[i];
        java.lang.System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String removeTrailingSlash(java.lang.String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(android.content.Context context, android.content.pm.ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new java.lang.SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new java.lang.SecurityException("Provider must grant uri permissions");
        }
        if (providerInfo.authority == null || providerInfo.authority.trim().isEmpty()) {
            throw new java.lang.SecurityException("Provider must have a non-empty authority");
        }
        java.lang.String str = providerInfo.authority.split(";")[0];
        synchronized (this.mLock) {
            this.mAuthority = str;
        }
        java.util.HashMap<java.lang.String, androidx.core.content.FileProvider.PathStrategy> hashMap = sCache;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int i;
        java.io.File highSpeedVideoFpsRanges = getLocalPathStrategy().getHighSpeedVideoFpsRanges(uri);
        java.lang.String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        java.lang.String[] strArr3 = new java.lang.String[strArr.length];
        java.lang.Object[] objArr = new java.lang.Object[strArr.length];
        int i2 = 0;
        for (java.lang.String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? highSpeedVideoFpsRanges.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = java.lang.Long.valueOf(highSpeedVideoFpsRanges.length());
            }
            i2 = i;
        }
        java.lang.String[] copyOf = copyOf(strArr3, i2);
        java.lang.Object[] copyOf2 = copyOf(objArr, i2);
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        java.io.File highSpeedVideoFpsRanges = getLocalPathStrategy().getHighSpeedVideoFpsRanges(uri);
        int lastIndexOf = highSpeedVideoFpsRanges.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(highSpeedVideoFpsRanges.getName().substring(lastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM;
        }
        return com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getTypeAnonymous(android.net.Uri uri) {
        return com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("No external updates");
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return getLocalPathStrategy().getHighSpeedVideoFpsRanges(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) throws java.io.FileNotFoundException {
        return android.os.ParcelFileDescriptor.open(getLocalPathStrategy().getHighSpeedVideoFpsRanges(uri), modeToMode(str));
    }

    private androidx.core.content.FileProvider.PathStrategy getLocalPathStrategy() {
        androidx.core.content.FileProvider.PathStrategy pathStrategy;
        synchronized (this.mLock) {
            androidx.core.util.ObjectsCompat.requireNonNull(this.mAuthority, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            if (this.mLocalPathStrategy == null) {
                this.mLocalPathStrategy = getPathStrategy(getContext(), this.mAuthority, this.mResourceId);
            }
            pathStrategy = this.mLocalPathStrategy;
        }
        return pathStrategy;
    }

    static class SimplePathStrategy implements androidx.core.content.FileProvider.PathStrategy {
        final java.util.HashMap<java.lang.String, java.io.File> getHighSpeedVideoFpsRanges = new java.util.HashMap<>();
        private final java.lang.String getHighSpeedVideoSizes;

        SimplePathStrategy(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public final android.net.Uri getHighResolutionOutputSizeshNQ4ISI(java.io.File file) {
            java.lang.String substring;
            try {
                java.lang.String canonicalPath = file.getCanonicalPath();
                java.util.Map.Entry<java.lang.String, java.io.File> entry = null;
                for (java.util.Map.Entry<java.lang.String, java.io.File> entry2 : this.getHighSpeedVideoFpsRanges.entrySet()) {
                    java.lang.String path = entry2.getValue().getPath();
                    if (getHighSpeedVideoFpsRanges(canonicalPath, path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new java.lang.IllegalArgumentException("Failed to find configured root that contains ".concat(java.lang.String.valueOf(canonicalPath)));
                }
                java.lang.String path2 = entry.getValue().getPath();
                if (path2.endsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
                    substring = canonicalPath.substring(path2.length());
                } else {
                    substring = canonicalPath.substring(path2.length() + 1);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(android.net.Uri.encode(entry.getKey()));
                sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                sb.append(android.net.Uri.encode(substring, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR));
                return new android.net.Uri.Builder().scheme("content").authority(this.getHighSpeedVideoSizes).encodedPath(sb.toString()).build();
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for ".concat(java.lang.String.valueOf(file)));
            }
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public final java.io.File getHighSpeedVideoFpsRanges(android.net.Uri uri) {
            java.lang.String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            if (indexOf == -1) {
                throw new java.lang.IllegalArgumentException("Unable to find path from root: ".concat(java.lang.String.valueOf(uri)));
            }
            java.lang.String decode = android.net.Uri.decode(encodedPath.substring(1, indexOf));
            java.lang.String decode2 = android.net.Uri.decode(encodedPath.substring(indexOf + 1));
            java.io.File file = this.getHighSpeedVideoFpsRanges.get(decode);
            if (file == null) {
                throw new java.lang.IllegalArgumentException("Unable to find configured root for ".concat(java.lang.String.valueOf(uri)));
            }
            java.io.File file2 = new java.io.File(file, decode2);
            try {
                java.io.File canonicalFile = file2.getCanonicalFile();
                if (getHighSpeedVideoFpsRanges(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new java.lang.SecurityException("Resolved path jumped beyond configured root");
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for ".concat(java.lang.String.valueOf(file2)));
            }
        }

        private static boolean getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2) {
            java.lang.String removeTrailingSlash = androidx.core.content.FileProvider.removeTrailingSlash(str);
            java.lang.String removeTrailingSlash2 = androidx.core.content.FileProvider.removeTrailingSlash(str2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(removeTrailingSlash2);
            sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            return removeTrailingSlash.startsWith(sb.toString());
        }
    }
}
