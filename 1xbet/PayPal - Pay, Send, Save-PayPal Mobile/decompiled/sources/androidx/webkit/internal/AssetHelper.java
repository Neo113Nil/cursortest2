package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class AssetHelper {
    public static final java.lang.String DEFAULT_MIME_TYPE = "text/plain";
    private final android.content.Context getHighSpeedVideoSizes;

    public AssetHelper(android.content.Context context) {
        this.getHighSpeedVideoSizes = context;
    }

    public static java.io.InputStream openFile(java.io.File file) throws java.io.FileNotFoundException, java.io.IOException {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        return file.getPath().endsWith(".svgz") ? new java.util.zip.GZIPInputStream(fileInputStream) : fileInputStream;
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
        if (canonicalPath.endsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
            return canonicalPath;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(canonicalPath);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        return sb.toString();
    }

    public static java.io.File getDataDir(android.content.Context context) {
        return androidx.webkit.internal.ApiHelperForN.getDataDir(context);
    }

    public static java.lang.String guessMimeType(java.lang.String str) {
        java.lang.String highSpeedVideoFpsRanges = androidx.webkit.internal.MimeUtil.getHighSpeedVideoFpsRanges(str);
        return highSpeedVideoFpsRanges == null ? "text/plain" : highSpeedVideoFpsRanges;
    }

    public java.io.InputStream openAsset(java.lang.String str) throws java.io.IOException {
        if (str.length() > 1 && str.charAt(0) == '/') {
            str = str.substring(1);
        }
        java.io.InputStream open = this.getHighSpeedVideoSizes.getAssets().open(str, 2);
        return str.endsWith(".svgz") ? new java.util.zip.GZIPInputStream(open) : open;
    }

    public java.io.InputStream openResource(java.lang.String str) throws android.content.res.Resources.NotFoundException, java.io.IOException {
        if (str.length() > 1 && str.charAt(0) == '/') {
            str = str.substring(1);
        }
        java.lang.String[] split = str.split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, -1);
        if (split.length != 2) {
            throw new java.lang.IllegalArgumentException("Incorrect resource path: ".concat(java.lang.String.valueOf(str)));
        }
        java.lang.String str2 = split[0];
        java.lang.String str3 = split[1];
        int lastIndexOf = str3.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str3 = str3.substring(0, lastIndexOf);
        }
        int identifier = this.getHighSpeedVideoSizes.getResources().getIdentifier(str3, str2, this.getHighSpeedVideoSizes.getPackageName());
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.getHighSpeedVideoSizes.getResources().getValue(identifier, typedValue, true);
        int i = typedValue.type;
        if (i != 3) {
            throw new java.io.IOException(java.lang.String.format("Expected %s resource to be of TYPE_STRING but was %d", str, java.lang.Integer.valueOf(i)));
        }
        java.io.InputStream openRawResource = this.getHighSpeedVideoSizes.getResources().openRawResource(identifier);
        return str.endsWith(".svgz") ? new java.util.zip.GZIPInputStream(openRawResource) : openRawResource;
    }
}
