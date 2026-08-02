package androidx.camera.video.internal.utils;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/camera/video/internal/utils/StorageUtil;", "", "<init>", "()V", "Ljava/io/File;", "file", "", "getAvailableBytes", "(Ljava/io/File;)J", "", "path", "(Ljava/lang/String;)J", "Landroid/net/Uri;", "uri", "getAvailableBytesForMediaStoreUri", "(Landroid/net/Uri;)J", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "formatSize", "(J)Ljava/lang/String;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "isStorageFullException", "(Ljava/lang/Throwable;)Z", "NO_SPACE_LEFT_MESSAGE", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StorageUtil {
    public static final androidx.camera.video.internal.utils.StorageUtil INSTANCE = new androidx.camera.video.internal.utils.StorageUtil();
    public static final java.lang.String NO_SPACE_LEFT_MESSAGE = "No space left on device";

    private StorageUtil() {
    }

    @kotlin.jvm.JvmStatic
    public static final long getAvailableBytes(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        java.lang.String path = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
        return getAvailableBytes(path);
    }

    @kotlin.jvm.JvmStatic
    public static final long getAvailableBytes(java.lang.String path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return new android.os.StatFs(path).getAvailableBytes();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r1.equals(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r4 = android.os.Environment.getExternalStorageDirectory();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        return getAvailableBytes(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r1.equals("external_primary") != false) goto L21;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long getAvailableBytesForMediaStoreUri(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(uri.getScheme(), "content")) {
            throw new java.lang.IllegalStateException("Not a content uri: ".concat(java.lang.String.valueOf(uri)).toString());
        }
        java.lang.String str = uri.getPathSegments().get(0);
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1921573490) {
                if (hashCode != -1820761141) {
                    if (hashCode == 570410685 && str.equals("internal")) {
                        java.io.File dataDirectory = android.os.Environment.getDataDirectory();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataDirectory, "");
                        return getAvailableBytes(dataDirectory);
                    }
                }
            }
        }
        androidx.camera.core.Logger.w("StorageUtil", "Unknown MediaStore URI: ".concat(java.lang.String.valueOf(uri)));
        return Long.MAX_VALUE;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String formatSize(long bytes) {
        if (bytes < 0) {
            throw new java.lang.IllegalArgumentException("Bytes cannot be negative".toString());
        }
        java.lang.String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("#.##");
        double d = bytes;
        int i = 0;
        double d2 = d;
        while (d2 >= 1024.0d && i < 4) {
            d2 /= 1024.0d;
            i++;
        }
        if (i == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(decimalFormat.format(d2));
            sb.append(' ');
            sb.append(strArr[i]);
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        while (i >= 0) {
            double pow = java.lang.Math.pow(1024.0d, i);
            double floor = java.lang.Math.floor(d / pow);
            if (floor > 0.0d) {
                sb2.append(decimalFormat.format(floor));
                sb2.append(" ");
                sb2.append(strArr[i]);
                sb2.append(" ");
                d -= floor * pow;
            }
            i--;
        }
        return kotlin.text.StringsKt.trim(sb2).toString();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isStorageFullException(java.lang.Throwable throwable) {
        while (throwable != null) {
            java.lang.String message = throwable.getMessage();
            if (message != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) NO_SPACE_LEFT_MESSAGE, false, 2, (java.lang.Object) null)) {
                return true;
            }
            throwable = throwable.getCause();
        }
        return false;
    }
}
