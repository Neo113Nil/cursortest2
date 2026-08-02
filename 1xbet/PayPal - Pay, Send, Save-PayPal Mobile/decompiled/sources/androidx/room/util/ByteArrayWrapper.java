package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\r"}, d2 = {"Landroidx/room/util/ByteArrayWrapper;", "", "", "array", "<init>", "([B)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "[B"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ByteArrayWrapper {
    public final byte[] array;

    public ByteArrayWrapper(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.array = bArr;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof androidx.room.util.ByteArrayWrapper) {
            return java.util.Arrays.equals(this.array, ((androidx.room.util.ByteArrayWrapper) other).array);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.array);
    }
}
