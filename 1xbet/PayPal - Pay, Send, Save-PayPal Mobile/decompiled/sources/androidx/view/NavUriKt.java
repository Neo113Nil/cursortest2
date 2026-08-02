package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "uriString", "Landroid/net/Uri;", "Landroidx/navigation/getHighSpeedVideoSizes;", "NavUri", "(Ljava/lang/String;)Landroid/net/Uri;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavUriKt {
    public static final android.net.Uri NavUri(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return androidx.view.NavUriUtils.INSTANCE.parse(str);
    }
}
