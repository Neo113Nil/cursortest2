package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0086 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0086 ¢\u0006\u0004\b\u000e\u0010\r"}, d2 = {"Landroidx/datastore/core/NativeSharedCounter;", "", "<init>", "()V", "", "fd", "nativeTruncateFile", "(I)I", "", "nativeCreateSharedCounter", "(I)J", "address", "nativeGetCounterValue", "(J)I", "nativeIncrementAndGetCounterValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int fd);

    public final native int nativeGetCounterValue(long address);

    public final native int nativeIncrementAndGetCounterValue(long address);

    public final native int nativeTruncateFile(int fd);
}
