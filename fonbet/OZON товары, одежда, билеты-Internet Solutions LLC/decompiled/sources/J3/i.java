package J3;

import java.io.IOException;

/* loaded from: classes.dex */
public interface i {

    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13792a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13793b;

        public a(int i11, int i12) {
            this.f13792a = i11;
            this.f13793b = i12;
        }

        public final boolean a(int i11) {
            return i11 != 1 && this.f13792a - this.f13793b > 1;
        }
    }

    /* loaded from: classes8.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f13794a;

        /* renamed from: b, reason: collision with root package name */
        public final long f13795b;

        public b(int i11, long j11) {
            G10.a.c(j11 >= 0);
            this.f13794a = i11;
            this.f13795b = j11;
        }
    }

    /* loaded from: classes8.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final IOException f13796a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13797b;

        public c(int i11, IOException iOException) {
            this.f13796a = iOException;
            this.f13797b = i11;
        }
    }

    long a(c cVar);

    int b(int i11);
}
