package V3;

import c4.C5743a;
import java.util.List;

/* loaded from: classes8.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f27970a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a> f27971b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f27972a;

        /* renamed from: b, reason: collision with root package name */
        public final long f27973b;

        /* renamed from: c, reason: collision with root package name */
        public final long f27974c;

        public a(String str, long j11, long j12) {
            this.f27972a = str;
            this.f27973b = j11;
            this.f27974c = j12;
        }
    }

    public c(long j11, List<a> list) {
        this.f27970a = j11;
        this.f27971b = list;
    }

    public final C5743a a(long j11) {
        long j12;
        List<a> list = this.f27971b;
        if (list.size() < 2) {
            return null;
        }
        long j13 = j11;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        long j17 = -1;
        boolean z11 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = list.get(size);
            boolean equals = "video/mp4".equals(aVar.f27972a) | z11;
            if (size == 0) {
                j13 -= aVar.f27974c;
                j12 = 0;
            } else {
                j12 = j13 - aVar.f27973b;
            }
            long j18 = j12;
            long j19 = j13;
            j13 = j18;
            if (!equals || j13 == j19) {
                z11 = equals;
            } else {
                j17 = j19 - j13;
                j16 = j13;
                z11 = false;
            }
            if (size == 0) {
                j14 = j13;
                j15 = j19;
            }
        }
        if (j16 == -1 || j17 == -1 || j14 == -1 || j15 == -1) {
            return null;
        }
        return new C5743a(j14, j15, this.f27970a, j16, j17);
    }
}
