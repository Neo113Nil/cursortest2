package androidx.webkit.internal;

/* loaded from: classes2.dex */
public class AssetHelper {
    public static final java.lang.String DEFAULT_MIME_TYPE = "text/plain";
    private final android.content.Context mContext;

    public AssetHelper(android.content.Context context) {
        this.mContext = context;
    }

    private static java.io.InputStream handleSvgzStream(java.lang.String str, java.io.InputStream inputStream) throws java.io.IOException {
        return str.endsWith(".svgz") ? new java.util.zip.GZIPInputStream(inputStream) : inputStream;
    }

    private static java.lang.String removeLeadingSlash(java.lang.String str) {
        return (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
    }

    private int getFieldId(java.lang.String str, java.lang.String str2) {
        return this.mContext.getResources().getIdentifier(str2, str, this.mContext.getPackageName());
    }

    private int getValueType(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.mContext.getResources().getValue(i, typedValue, true);
        return typedValue.type;
    }

    public java.io.InputStream openResource(java.lang.String str) throws android.content.res.Resources.NotFoundException, java.io.IOException {
        java.lang.String removeLeadingSlash = removeLeadingSlash(str);
        java.lang.String[] split = removeLeadingSlash.split(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, -1);
        if (split.length != 2) {
            throw new java.lang.IllegalArgumentException("Incorrect resource path: " + removeLeadingSlash);
        }
        java.lang.String str2 = split[0];
        java.lang.String str3 = split[1];
        int lastIndexOf = str3.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str3 = str3.substring(0, lastIndexOf);
        }
        int fieldId = getFieldId(str2, str3);
        int valueType = getValueType(fieldId);
        if (valueType != 3) {
            throw new java.io.IOException(java.lang.String.format("Expected %s resource to be of TYPE_STRING but was %d", removeLeadingSlash, java.lang.Integer.valueOf(valueType)));
        }
        return handleSvgzStream(removeLeadingSlash, this.mContext.getResources().openRawResource(fieldId));
    }

    public java.io.InputStream openAsset(java.lang.String str) throws java.io.IOException {
        java.lang.String removeLeadingSlash = removeLeadingSlash(str);
        return handleSvgzStream(removeLeadingSlash, this.mContext.getAssets().open(removeLeadingSlash, 2));
    }

    public static java.io.InputStream openFile(java.io.File file) throws java.io.FileNotFoundException, java.io.IOException {
        return handleSvgzStream(file.getPath(), new java.io.FileInputStream(file));
    }

    public static java.io.File getCanonicalFileIfChild(java.io.File file, java.lang.String str) throws java.io.IOException {
        java.lang.String canonicalDirPath = getCanonicalDirPath(file);
        java.lang.String canonicalPath = new java.io.File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(canonicalDirPath)) {
            return new java.io.File(canonicalPath);
        }
        return null;
    }

    public static java.lang.String getCanonicalDirPath(java.io.File file) throws java.io.IOException {
        java.lang.String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.endsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING)) {
            return canonicalPath;
        }
        return canonicalPath + com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING;
    }

    public static java.io.File getDataDir(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.webkit.internal.ApiHelperForN.getDataDir(context);
        }
        return context.getCacheDir().getParentFile();
    }

    public static java.lang.String guessMimeType(java.lang.String str) {
        java.lang.String mimeFromFileName = androidx.webkit.internal.MimeUtil.getMimeFromFileName(str);
        return mimeFromFileName == null ? DEFAULT_MIME_TYPE : mimeFromFileName;
    }
}
