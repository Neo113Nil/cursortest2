package coil3.map;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcoil3/map/ResourceIntMapper;", "Lcoil3/map/Mapper;", "", "Lcoil3/Uri;", "<init>", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "map", "(ILcoil3/request/Options;)Lcoil3/Uri;", "p0", "Landroid/content/Context;", "p1", "", "getHighSpeedVideoFpsRangesFor", "(ILandroid/content/Context;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResourceIntMapper implements coil3.map.Mapper<java.lang.Integer, coil3.Uri> {
    @Override // coil3.map.Mapper
    public final /* synthetic */ coil3.Uri map(java.lang.Integer num, coil3.view.Options options) {
        return map(num.intValue(), options);
    }

    public final coil3.Uri map(int data, coil3.view.Options options) {
        if (!getHighSpeedVideoFpsRangesFor(data, options.getContext())) {
            return null;
        }
        java.lang.String packageName = options.getContext().getPackageName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("android.resource://");
        sb.append(packageName);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(data);
        return coil3.UriKt.toUri$default(sb.toString(), null, 1, null);
    }

    private static boolean getHighSpeedVideoFpsRangesFor(int p0, android.content.Context p1) {
        try {
            return p1.getResources().getResourceEntryName(p0) != null;
        } catch (android.content.res.Resources.NotFoundException unused) {
            return false;
        }
    }
}
