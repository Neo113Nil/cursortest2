package com.payair.logic.extensions;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "convertToString", "([B)Ljava/lang/String;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ByteArrayExtKt {
    public static final java.lang.String convertToString(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return new java.lang.String(bArr, kotlin.text.Charsets.UTF_8);
    }
}
