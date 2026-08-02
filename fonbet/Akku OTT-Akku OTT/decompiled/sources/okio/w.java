package okio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends AbstractC1195j {
    public final FileChannel e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z, FileChannel fileChannel) {
        super(z);
        Intrinsics.checkNotNullParameter(fileChannel, "fileChannel");
        this.e = fileChannel;
    }

    @Override // okio.AbstractC1195j
    public final synchronized void d() {
        this.e.close();
    }

    @Override // okio.AbstractC1195j
    public final synchronized void l() {
        this.e.force(true);
    }

    @Override // okio.AbstractC1195j
    public final synchronized int q(long j, byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.e.position(j);
        ByteBuffer wrap = ByteBuffer.wrap(array, i, i2);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = this.e.read(wrap);
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
        return this.e.size();
    }

    @Override // okio.AbstractC1195j
    public final synchronized void t(long j, byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.e.position(j);
        this.e.write(ByteBuffer.wrap(array, i, i2));
    }
}
