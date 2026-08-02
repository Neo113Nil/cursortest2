package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007"}, d2 = {"Lcoil3/util/MimeTypeMap;", "", "<init>", "()V", "", "url", "getMimeTypeFromUrl", "(Ljava/lang/String;)Ljava/lang/String;", "extension", "getMimeTypeFromExtension"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MimeTypeMap {
    public static final coil3.content.MimeTypeMap INSTANCE = new coil3.content.MimeTypeMap();

    private MimeTypeMap() {
    }

    public final java.lang.String getMimeTypeFromUrl(java.lang.String url) {
        if (kotlin.text.StringsKt.isBlank(url)) {
            return null;
        }
        return getMimeTypeFromExtension(kotlin.text.StringsKt.substringAfterLast(kotlin.text.StringsKt.substringAfterLast$default(kotlin.text.StringsKt.substringBeforeLast$default(kotlin.text.StringsKt.substringBeforeLast$default(url, '#', (java.lang.String) null, 2, (java.lang.Object) null), '?', (java.lang.String) null, 2, (java.lang.Object) null), kotlinx.io.files.FileSystemKt.UnixPathSeparator, (java.lang.String) null, 2, (java.lang.Object) null), com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, ""));
    }

    public final java.lang.String getMimeTypeFromExtension(java.lang.String extension) {
        java.util.Map map;
        if (kotlin.text.StringsKt.isBlank(extension)) {
            return null;
        }
        java.lang.String lowerCase = extension.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        map = coil3.content.MimeTypesKt.getHighSpeedVideoFpsRanges;
        java.lang.String str = (java.lang.String) map.get(lowerCase);
        return str == null ? coil3.content.MimeTypes_androidKt.extensionFromMimeTypeMap(lowerCase) : str;
    }
}
