package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00068\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0015"}, d2 = {"Lkotlinx/serialization/json/internal/ArrayAsSequence;", "", "", "buffer", "<init>", "([C)V", "", "index", "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "", "substring", "(II)Ljava/lang/String;", "newSize", "", "trim", "(I)V", "toString", "()Ljava/lang/String;", "[C", "getBuffer$kotlinx_serialization_json", "()[C", "length", com.visa.cbp.getEncExpo.warmup, "getLength", "()I", "setLength"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ArrayAsSequence implements java.lang.CharSequence {
    private final char[] buffer;
    private int length;

    public ArrayAsSequence(char[] cArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        this.buffer = cArr;
        this.length = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return get(i);
    }

    /* renamed from: getBuffer$kotlinx_serialization_json, reason: from getter */
    public final char[] getBuffer() {
        return this.buffer;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return getLength();
    }

    public final int getLength() {
        return this.length;
    }

    public final void setLength(int i) {
        this.length = i;
    }

    public final char get(int index) {
        return this.buffer[index];
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int startIndex, int endIndex) {
        return kotlin.text.StringsKt.concatToString(this.buffer, startIndex, java.lang.Math.min(endIndex, length()));
    }

    public final java.lang.String substring(int startIndex, int endIndex) {
        return kotlin.text.StringsKt.concatToString(this.buffer, startIndex, java.lang.Math.min(endIndex, length()));
    }

    public final void trim(int newSize) {
        setLength(java.lang.Math.min(this.buffer.length, newSize));
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return substring(0, length());
    }
}
