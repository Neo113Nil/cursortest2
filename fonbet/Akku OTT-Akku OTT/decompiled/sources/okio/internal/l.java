package okio.internal;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.C1190e;
import okio.K;

/* loaded from: classes5.dex */
public final class l extends okio.o {
    public final long a;
    public final boolean b;
    public long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(K delegate, long j, boolean z) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = j;
        this.b = z;
    }

    @Override // okio.o, okio.K
    public final long read(C1190e sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = this.c;
        long j3 = this.a;
        if (j2 > j3) {
            j = 0;
        } else if (this.b) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long read = super.read(sink, j);
        if (read != -1) {
            this.c += read;
        }
        long j5 = this.c;
        if ((j5 >= j3 || read != -1) && j5 <= j3) {
            return read;
        }
        if (read > 0 && j5 > j3) {
            long j6 = sink.b - (j5 - j3);
            C1190e c1190e = new C1190e();
            c1190e.o(sink);
            sink.write(c1190e, j6);
            c1190e.d();
        }
        StringBuilder b = androidx.compose.runtime.snapshots.m.b(j3, "expected ", " bytes but got ");
        b.append(this.c);
        throw new IOException(b.toString());
    }
}
