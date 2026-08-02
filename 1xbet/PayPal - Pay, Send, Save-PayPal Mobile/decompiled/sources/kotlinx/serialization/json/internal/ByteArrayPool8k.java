package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlinx/serialization/json/internal/ByteArrayPool8k;", "Lkotlinx/serialization/json/internal/ByteArrayPoolBase;", "<init>", "()V", "", "take", "()[B", "array", "", "release", "([B)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteArrayPool8k extends kotlinx.serialization.json.internal.ByteArrayPoolBase {
    public static final kotlinx.serialization.json.internal.ByteArrayPool8k INSTANCE = new kotlinx.serialization.json.internal.ByteArrayPool8k();

    private ByteArrayPool8k() {
    }

    public final byte[] take() {
        return super.take(8196);
    }

    public final void release(byte[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        releaseImpl(array);
    }
}
