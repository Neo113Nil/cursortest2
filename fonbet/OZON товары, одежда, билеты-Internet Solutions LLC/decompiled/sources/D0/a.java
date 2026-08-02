package D0;

import E0.b1;
import K1.Q;
import K1.S;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CharSequence f5185a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5186b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f5187c;

    /* renamed from: d, reason: collision with root package name */
    private final Pair<f, Q> f5188d;

    private a() {
        throw null;
    }

    public a(CharSequence charSequence, long j11, Q q11, int i11) {
        this(charSequence, j11, (i11 & 4) != 0 ? null : q11, (Pair) null);
    }

    public final boolean a(@NotNull CharSequence charSequence) {
        return kotlin.text.h.v(this.f5185a, charSequence);
    }

    public final Q b() {
        return this.f5187c;
    }

    public final Pair<f, Q> c() {
        return this.f5188d;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i11) {
        return this.f5185a.charAt(i11);
    }

    public final long d() {
        return this.f5186b;
    }

    @NotNull
    public final CharSequence e() {
        return this.f5185a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Q.d(this.f5186b, aVar.f5186b) && Intrinsics.d(this.f5187c, aVar.f5187c) && Intrinsics.d(this.f5188d, aVar.f5188d) && kotlin.text.h.v(this.f5185a, aVar.f5185a);
    }

    public final boolean f() {
        return this.f5188d == null;
    }

    public final void g(@NotNull char[] cArr, int i11, int i12, int i13) {
        b1.a(this.f5185a, cArr, i11, i12, i13);
    }

    public final int hashCode() {
        int hashCode = this.f5185a.hashCode() * 31;
        int i11 = Q.f15010c;
        int a11 = Pk0.c.a(hashCode, 31, this.f5186b);
        Q q11 = this.f5187c;
        int hashCode2 = (a11 + (q11 != null ? Long.hashCode(q11.k()) : 0)) * 31;
        Pair<f, Q> pair = this.f5188d;
        return hashCode2 + (pair != null ? pair.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5185a.length();
    }

    @Override // java.lang.CharSequence
    @NotNull
    public final CharSequence subSequence(int i11, int i12) {
        return this.f5185a.subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    @NotNull
    public final String toString() {
        return this.f5185a.toString();
    }

    public a(CharSequence charSequence, long j11, Q q11, Pair pair) {
        this.f5185a = charSequence instanceof a ? ((a) charSequence).f5185a : charSequence;
        this.f5186b = S.b(charSequence.length(), j11);
        this.f5187c = q11 != null ? Q.b(S.b(charSequence.length(), q11.k())) : null;
        this.f5188d = pair != null ? Pair.d(pair, Q.b(S.b(charSequence.length(), ((Q) pair.f()).k()))) : null;
    }
}
