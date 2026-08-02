package io.ktor.utils.io.core;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f*\n\u0010\r\"\u00020\u00042\u00020\u0004"}, d2 = {"T", "", io.ktor.http.ContentDisposition.Parameters.Size, "Lkotlin/Function1;", "", "block", "withMemory", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "index", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "storeIntAt", "([BII)V", "Memory"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MemoryKt {
    @kotlin.Deprecated(message = "ByteArray instead", replaceWith = @kotlin.ReplaceWith(expression = "ByteArray", imports = {}))
    public static /* synthetic */ void Memory$annotations() {
    }

    public static final <T> T withMemory(int i, kotlin.jvm.functions.Function1<? super byte[], ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return function1.invoke(new byte[i]);
    }

    public static final void storeIntAt(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }
}
