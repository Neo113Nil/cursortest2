package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "extension", "extensionFromMimeTypeMap", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MimeTypes_androidKt {
    public static final java.lang.String extensionFromMimeTypeMap(java.lang.String str) {
        return android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
    }
}
