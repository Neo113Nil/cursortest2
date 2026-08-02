package coil3.key;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcoil3/key/AndroidResourceUriKeyer;", "Lcoil3/key/Keyer;", "Lcoil3/Uri;", "<init>", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "", "key", "(Lcoil3/Uri;Lcoil3/request/Options;)Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidResourceUriKeyer implements coil3.key.Keyer<coil3.Uri> {
    @Override // coil3.key.Keyer
    public final java.lang.String key(coil3.Uri data, coil3.view.Options options) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(data.getScheme(), "android.resource")) {
            return null;
        }
        int nightMode = coil3.content.Utils_androidKt.getNightMode(options.getContext().getResources().getConfiguration());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(data);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(nightMode);
        return sb.toString();
    }
}
