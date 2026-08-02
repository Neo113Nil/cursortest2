package okio;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends AbstractC1195j {
    public final RandomAccessFile e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z, RandomAccessFile randomAccessFile) {
        super(z);
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.e = randomAccessFile;
    }

    @Override // okio.AbstractC1195j
    public final synchronized void d() {
        this.e.close();
    }

    @Override // okio.AbstractC1195j
    public final synchronized void l() {
        this.e.getFD().sync();
    }

    @Override // okio.AbstractC1195j
    public final synchronized int q(long j, byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.e.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = this.e.read(array, i, i2 - i3);
            if (read != -1) {
                i3 += read;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // okio.AbstractC1195j
    public final synchronized long s() {
        return this.e.length();
    }

    @Override // okio.AbstractC1195j
    public final synchronized void t(long j, byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.e.seek(j);
        this.e.write(array, i, i2);
    }
}
