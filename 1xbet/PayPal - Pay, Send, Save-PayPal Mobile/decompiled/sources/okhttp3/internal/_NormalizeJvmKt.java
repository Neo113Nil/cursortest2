package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "string", "normalizeNfc", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class _NormalizeJvmKt {
    public static final java.lang.String normalizeNfc(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String normalize = java.text.Normalizer.normalize(str, java.text.Normalizer.Form.NFC);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(normalize, "");
        return normalize;
    }
}
