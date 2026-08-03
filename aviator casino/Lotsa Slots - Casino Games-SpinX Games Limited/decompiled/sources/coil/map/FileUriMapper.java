package coil.map;

/* compiled from: FileUriMapper.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¨\u0006\f"}, d2 = {"Lcoil/map/FileUriMapper;", "Lcoil/map/Mapper;", "Landroid/net/Uri;", "Ljava/io/File;", "<init>", "()V", "map", "data", "options", "Lcoil/request/Options;", "isApplicable", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileUriMapper implements coil.map.Mapper<android.net.Uri, java.io.File> {
    @Override // coil.map.Mapper
    public java.io.File map(android.net.Uri data, coil.request.Options options) {
        if (!isApplicable(data)) {
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(data.getScheme(), "file")) {
            java.lang.String path = data.getPath();
            if (path != null) {
                return new java.io.File(path);
            }
            return null;
        }
        return new java.io.File(data.toString());
    }

    private final boolean isApplicable(android.net.Uri data) {
        if (coil.util.Utils.isAssetUri(data)) {
            return false;
        }
        java.lang.String scheme = data.getScheme();
        if (scheme != null && !kotlin.jvm.internal.Intrinsics.areEqual(scheme, "file")) {
            return false;
        }
        java.lang.String path = data.getPath();
        if (path == null) {
            path = "";
        }
        return kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) path, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 2, (java.lang.Object) null) && coil.util.Utils.getFirstPathSegment(data) != null;
    }
}
