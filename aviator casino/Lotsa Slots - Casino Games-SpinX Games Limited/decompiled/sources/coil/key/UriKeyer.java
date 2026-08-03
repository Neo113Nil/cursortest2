package coil.key;

/* compiled from: UriKeyer.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcoil/key/UriKeyer;", "Lcoil/key/Keyer;", "Landroid/net/Uri;", "<init>", "()V", com.ironsource.X3.i.W, "", "data", "options", "Lcoil/request/Options;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UriKeyer implements coil.key.Keyer<android.net.Uri> {
    @Override // coil.key.Keyer
    public java.lang.String key(android.net.Uri data, coil.request.Options options) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(data.getScheme(), "android.resource")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(data);
            sb.append('-');
            sb.append(coil.util.Utils.getNightMode(options.getContext().getResources().getConfiguration()));
            return sb.toString();
        }
        return data.toString();
    }
}
