package coil3.map;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcoil3/map/PathMapper;", "Lcoil3/map/Mapper;", "Lokio/Path;", "Lcoil3/Uri;", "<init>", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "map", "(Lokio/Path;Lcoil3/request/Options;)Lcoil3/Uri;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PathMapper implements coil3.map.Mapper<okio.Path, coil3.Uri> {
    @Override // coil3.map.Mapper
    public final coil3.Uri map(okio.Path data, coil3.view.Options options) {
        return coil3.UriKt.Uri$default("file", null, data.toString(), null, null, null, 58, null);
    }
}
