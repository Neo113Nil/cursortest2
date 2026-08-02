package kotlinx.io.bytestring.unsafe;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ<\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlinx/io/bytestring/unsafe/UnsafeByteStringOperations;", "", "<init>", "()V", "", "array", "Lkotlinx/io/bytestring/ByteString;", "wrapUnsafe", "([B)Lkotlinx/io/bytestring/ByteString;", "byteString", "Lkotlin/Function1;", "", "block", "withByteArrayUnsafe", "(Lkotlinx/io/bytestring/ByteString;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UnsafeByteStringOperations {
    public static final kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations INSTANCE = new kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations();

    private UnsafeByteStringOperations() {
    }

    public final kotlinx.io.bytestring.ByteString wrapUnsafe(byte[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        return kotlinx.io.bytestring.ByteString.INSTANCE.wrap$kotlinx_io_bytestring(array);
    }

    public final void withByteArrayUnsafe(kotlinx.io.bytestring.ByteString byteString, kotlin.jvm.functions.Function1<? super byte[], kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        block.invoke(byteString.getGetHighSpeedVideoFpsRanges());
    }
}
