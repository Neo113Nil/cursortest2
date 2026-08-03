package coil.map;

/* compiled from: ResourceUriMapper.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\u000b"}, d2 = {"Lcoil/map/ResourceUriMapper;", "Lcoil/map/Mapper;", "Landroid/net/Uri;", "<init>", "()V", "map", "data", "options", "Lcoil/request/Options;", "isApplicable", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResourceUriMapper implements coil.map.Mapper<android.net.Uri, android.net.Uri> {
    @Override // coil.map.Mapper
    public android.net.Uri map(android.net.Uri data, coil.request.Options options) {
        if (!isApplicable(data)) {
            return null;
        }
        java.lang.String authority = data.getAuthority();
        if (authority == null) {
            authority = "";
        }
        android.content.res.Resources resourcesForApplication = options.getContext().getPackageManager().getResourcesForApplication(authority);
        java.util.List<java.lang.String> pathSegments = data.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier == 0) {
            throw new java.lang.IllegalStateException(("Invalid android.resource URI: " + data).toString());
        }
        return android.net.Uri.parse("android.resource://" + authority + kotlinx.io.files.FileSystemKt.UnixPathSeparator + identifier);
    }

    private final boolean isApplicable(android.net.Uri data) {
        java.lang.String authority;
        return kotlin.jvm.internal.Intrinsics.areEqual(data.getScheme(), "android.resource") && (authority = data.getAuthority()) != null && !kotlin.text.StringsKt.isBlank(authority) && data.getPathSegments().size() == 2;
    }
}
