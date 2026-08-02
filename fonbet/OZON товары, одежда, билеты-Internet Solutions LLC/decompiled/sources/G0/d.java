package G0;

import K1.Q;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f9648a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f9649b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f9650c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9651d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9652e;

    /* renamed from: f, reason: collision with root package name */
    private final long f9653f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f9654g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final b f9655h;

    public d(int i11, String str, String str2, long j11, long j12, long j13, boolean z11, int i12) {
        j13 = (i12 & 32) != 0 ? System.currentTimeMillis() : j13;
        z11 = (i12 & 64) != 0 ? true : z11;
        this.f9648a = i11;
        this.f9649b = str;
        this.f9650c = str2;
        this.f9651d = j11;
        this.f9652e = j12;
        this.f9653f = j13;
        this.f9654g = z11;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        this.f9655h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? b.Replace : b.Delete : b.Insert;
    }

    public final boolean a() {
        return this.f9654g;
    }

    @NotNull
    public final a b() {
        if (this.f9655h != b.Delete) {
            return a.NotByUser;
        }
        long j11 = this.f9652e;
        if (!Q.e(j11)) {
            return a.NotByUser;
        }
        long j12 = this.f9651d;
        return Q.e(j12) ? ((int) (j12 >> 32)) > ((int) (j11 >> 32)) ? a.Start : a.End : (((int) (j12 >> 32)) == ((int) (j11 >> 32)) && ((int) (j12 >> 32)) == this.f9648a) ? a.Inner : a.NotByUser;
    }

    public final int c() {
        return this.f9648a;
    }

    public final long d() {
        return this.f9652e;
    }

    @NotNull
    public final String e() {
        return this.f9650c;
    }

    public final long f() {
        return this.f9651d;
    }

    @NotNull
    public final String g() {
        return this.f9649b;
    }

    @NotNull
    public final b h() {
        return this.f9655h;
    }

    public final long i() {
        return this.f9653f;
    }
}
