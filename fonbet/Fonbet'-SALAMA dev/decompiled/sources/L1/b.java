package L1;

import F1.h;
import java.util.ArrayDeque;
import n1.C1450e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4196a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f4197b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final e f4198c = new e();

    /* renamed from: d, reason: collision with root package name */
    public C1450e f4199d;

    /* renamed from: e, reason: collision with root package name */
    public int f4200e;

    /* renamed from: f, reason: collision with root package name */
    public int f4201f;

    /* renamed from: g, reason: collision with root package name */
    public long f4202g;

    public final long a(h hVar, int i7) {
        hVar.a(this.f4196a, 0, i7, false);
        long j = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j = (j << 8) | (r0[i8] & 255);
        }
        return j;
    }
}
