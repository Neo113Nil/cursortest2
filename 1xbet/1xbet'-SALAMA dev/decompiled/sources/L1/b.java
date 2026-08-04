package L1;

import F1.h;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4196a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f4197b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f4198c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p096n1.e f4199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4202g;

    public final long a(h hVar, int i7) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f4196a;
        hVar.a(bArr, 0, i7, false);
        long j = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j = (j << 8) | ((long) (bArr[i8] & 255));
        }
        return j;
    }
}
