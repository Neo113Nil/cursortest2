package kotlin;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0019\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0007"}, d2 = {"", "", "bitCount", "rotateLeft", "(BI)B", "rotateRight", "", "(SI)S"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes17.dex */
class NumbersKt__NumbersKt extends kotlin.NumbersKt__NumbersJVMKt {
    public static final byte rotateLeft(byte b, int i) {
        int i2 = i & 7;
        return (byte) ((b << i2) | ((b & 255) >>> (8 - i2)));
    }

    public static final short rotateLeft(short s, int i) {
        int i2 = i & 15;
        return (short) ((s << i2) | ((65535 & s) >>> (16 - i2)));
    }

    public static final byte rotateRight(byte b, int i) {
        int i2 = i & 7;
        return (byte) ((b << (8 - i2)) | ((b & 255) >>> i2));
    }

    public static final short rotateRight(short s, int i) {
        int i2 = i & 15;
        return (short) ((s << (16 - i2)) | ((65535 & s) >>> i2));
    }
}
