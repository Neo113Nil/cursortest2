package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/navigation/NavUriUtils;", "", "<init>", "()V", "", lib.android.paypal.com.magnessdk.g.n2, "allow", "encode", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "decode", "(Ljava/lang/String;)Ljava/lang/String;", "uriString", "Landroid/net/Uri;", "parse", "(Ljava/lang/String;)Landroid/net/Uri;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavUriUtils {
    public static final androidx.view.NavUriUtils INSTANCE = new androidx.view.NavUriUtils();

    private NavUriUtils() {
    }

    public static /* synthetic */ java.lang.String encode$default(androidx.view.NavUriUtils navUriUtils, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return navUriUtils.encode(str, str2);
    }

    public final java.lang.String encode(java.lang.String s, java.lang.String allow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        java.lang.String encode = android.net.Uri.encode(s, allow);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encode, "");
        return encode;
    }

    public final java.lang.String decode(java.lang.String s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        java.lang.String decode = android.net.Uri.decode(s);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "");
        return decode;
    }

    public final android.net.Uri parse(java.lang.String uriString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uriString, "");
        android.net.Uri parse = android.net.Uri.parse(uriString);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "");
        return parse;
    }
}
