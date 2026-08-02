package financial.atomic.transact.util;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"", "", "flags", "", "b64Encode", "([BI)Ljava/lang/String;", "(Ljava/lang/String;I)Ljava/lang/String;", "b64Decode", "([BI)[B"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class B64Kt {
    public static final byte[] b64Decode(byte[] bArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        byte[] decode = android.util.Base64.decode(bArr, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "");
        return decode;
    }

    public static /* synthetic */ byte[] b64Decode$default(byte[] bArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return b64Decode(bArr, i);
    }

    public static final java.lang.String b64Encode(byte[] bArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        byte[] encode = android.util.Base64.encode(bArr, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encode, "");
        return kotlin.text.StringsKt.decodeToString(encode);
    }

    public static /* synthetic */ java.lang.String b64Encode$default(byte[] bArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return b64Encode(bArr, i);
    }

    public static final java.lang.String b64Decode(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return kotlin.text.StringsKt.decodeToString(b64Decode(bytes, i));
    }

    public static /* synthetic */ java.lang.String b64Decode$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return b64Decode(str, i);
    }

    public static final java.lang.String b64Encode(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return b64Encode(bytes, i);
    }

    public static /* synthetic */ java.lang.String b64Encode$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return b64Encode(str, i);
    }
}
