package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "fName", "", "illegalDecoyCallException", "(Ljava/lang/String;)Ljava/lang/Void;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DecoyKt {
    @androidx.compose.runtime.ComposeCompilerApi
    public static final java.lang.Void illegalDecoyCallException(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Function ");
        sb.append(str);
        sb.append(" should have been replaced by compiler.");
        throw new java.lang.IllegalStateException(sb.toString());
    }
}
