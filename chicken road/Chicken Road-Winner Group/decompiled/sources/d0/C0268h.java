package d0;

import K.T;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import d2.C0277g;
import java.math.BigInteger;
import kotlin.jvm.internal.j;
import v2.m;

/* renamed from: d0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268h implements Comparable {
    public static final C0268h f;

    /* renamed from: a, reason: collision with root package name */
    public final int f4838a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4839b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4840c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4841d;

    /* renamed from: e, reason: collision with root package name */
    public final C0277g f4842e = new C0277g(new T(3, this));

    static {
        new C0268h("", 0, 0, 0);
        f = new C0268h("", 0, 1, 0);
        new C0268h("", 1, 0, 0);
    }

    public C0268h(String str, int i3, int i4, int i5) {
        this.f4838a = i3;
        this.f4839b = i4;
        this.f4840c = i5;
        this.f4841d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0268h other = (C0268h) obj;
        j.e(other, "other");
        Object a3 = this.f4842e.a();
        j.d(a3, "<get-bigInteger>(...)");
        Object a4 = other.f4842e.a();
        j.d(a4, "<get-bigInteger>(...)");
        return ((BigInteger) a3).compareTo((BigInteger) a4);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0268h)) {
            return false;
        }
        C0268h c0268h = (C0268h) obj;
        return this.f4838a == c0268h.f4838a && this.f4839b == c0268h.f4839b && this.f4840c == c0268h.f4840c;
    }

    public final int hashCode() {
        return ((((527 + this.f4838a) * 31) + this.f4839b) * 31) + this.f4840c;
    }

    public final String toString() {
        String str;
        String str2 = this.f4841d;
        if (m.n0(str2)) {
            str = "";
        } else {
            str = TokenBuilder.TOKEN_DELIMITER + str2;
        }
        return this.f4838a + '.' + this.f4839b + '.' + this.f4840c + str;
    }
}
