package coil.map;

/* compiled from: HttpUrlMapper.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcoil/map/HttpUrlMapper;", "Lcoil/map/Mapper;", "Lokhttp3/HttpUrl;", "", "<init>", "()V", "map", "data", "options", "Lcoil/request/Options;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpUrlMapper implements coil.map.Mapper<okhttp3.HttpUrl, java.lang.String> {
    @Override // coil.map.Mapper
    public java.lang.String map(okhttp3.HttpUrl data, coil.request.Options options) {
        return data.getUrl();
    }
}
