package S0;

import Hj0.C3156m;
import S0.InterfaceC3967k;
import gd.InterfaceC6712a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3947c1 implements Iterable<Object>, InterfaceC6712a {

    /* renamed from: b, reason: collision with root package name */
    private int f25365b;

    /* renamed from: d, reason: collision with root package name */
    private int f25367d;

    /* renamed from: e, reason: collision with root package name */
    private int f25368e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25369f;

    /* renamed from: g, reason: collision with root package name */
    private int f25370g;

    /* renamed from: i, reason: collision with root package name */
    private HashMap<C3945c, V> f25372i;

    /* renamed from: j, reason: collision with root package name */
    private androidx.collection.C<androidx.collection.D> f25373j;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f25364a = new int[0];

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Object[] f25366c = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private ArrayList<C3945c> f25371h = new ArrayList<>();

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = Hj0.C3156m.p(r3.f25371h, r4.a(), r3.f25365b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A(@NotNull C3945c c3945c) {
        int p11;
        return c3945c.b() && p11 >= 0 && Intrinsics.d(this.f25371h.get(p11), c3945c);
    }

    public final void B(@NotNull int[] iArr, int i11, @NotNull Object[] objArr, int i12, @NotNull ArrayList<C3945c> arrayList, HashMap<C3945c, V> hashMap, androidx.collection.C<androidx.collection.D> c11) {
        this.f25364a = iArr;
        this.f25365b = i11;
        this.f25366c = objArr;
        this.f25367d = i12;
        this.f25371h = arrayList;
        this.f25372i = hashMap;
        this.f25373j = c11;
    }

    public final Object C(int i11) {
        int m11 = C3156m.m(this.f25364a, i11);
        int i12 = i11 + 1;
        return (i12 < this.f25365b ? C3156m.b(this.f25364a, i12) : this.f25366c.length) - m11 > 0 ? this.f25366c[m11] : InterfaceC3967k.a.a();
    }

    public final V D(int i11) {
        int i12;
        HashMap<C3945c, V> hashMap = this.f25372i;
        if (hashMap != null) {
            if (this.f25369f) {
                r.j("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            C3945c c11 = (i11 < 0 || i11 >= (i12 = this.f25365b)) ? null : C3156m.c(this.f25371h, i11, i12);
            if (c11 != null) {
                return hashMap.get(c11);
            }
        }
        return null;
    }

    @NotNull
    public final C3945c b() {
        int p11;
        if (this.f25369f) {
            r.j("use active SlotWriter to create an anchor location instead");
            throw null;
        }
        int i11 = this.f25365b;
        if (i11 <= 0) {
            B0.a("Parameter index is out of range");
            throw null;
        }
        ArrayList<C3945c> arrayList = this.f25371h;
        p11 = C3156m.p(arrayList, 0, i11);
        if (p11 >= 0) {
            return arrayList.get(p11);
        }
        C3945c c3945c = new C3945c(0);
        arrayList.add(-(p11 + 1), c3945c);
        return c3945c;
    }

    public final int c(@NotNull C3945c c3945c) {
        if (this.f25369f) {
            r.j("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (c3945c.b()) {
            return c3945c.a();
        }
        B0.a("Anchor refers to a group that was removed");
        throw null;
    }

    public final void e(@NotNull C3944b1 c3944b1) {
        int i11;
        if (c3944b1.x() != this || (i11 = this.f25368e) <= 0) {
            r.j("Unexpected reader close()");
            throw null;
        }
        this.f25368e = i11 - 1;
    }

    public final void h(@NotNull C3953e1 c3953e1, @NotNull int[] iArr, int i11, @NotNull Object[] objArr, int i12, @NotNull ArrayList<C3945c> arrayList, HashMap<C3945c, V> hashMap, androidx.collection.C<androidx.collection.D> c11) {
        if (c3953e1.Z() != this || !this.f25369f) {
            B0.a("Unexpected writer close()");
            throw null;
        }
        this.f25369f = false;
        B(iArr, i11, objArr, i12, arrayList, hashMap, c11);
    }

    public final void i() {
        this.f25373j = new androidx.collection.C<>();
    }

    public final boolean isEmpty() {
        return this.f25365b == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Object> iterator() {
        return new U(this, 0, this.f25365b);
    }

    public final void k() {
        this.f25372i = new HashMap<>();
    }

    public final boolean l() {
        return this.f25365b > 0 && C3156m.a(this.f25364a, 0);
    }

    @NotNull
    public final ArrayList<C3945c> m() {
        return this.f25371h;
    }

    public final androidx.collection.C<androidx.collection.D> n() {
        return this.f25373j;
    }

    @NotNull
    public final int[] o() {
        return this.f25364a;
    }

    public final int q() {
        return this.f25365b;
    }

    @NotNull
    public final Object[] r() {
        return this.f25366c;
    }

    public final int s() {
        return this.f25367d;
    }

    public final HashMap<C3945c, V> t() {
        return this.f25372i;
    }

    public final int u() {
        return this.f25370g;
    }

    public final boolean v() {
        return this.f25369f;
    }

    public final boolean w(int i11, @NotNull C3945c c3945c) {
        if (this.f25369f) {
            r.j("Writer is active");
            throw null;
        }
        if (i11 < 0 || i11 >= this.f25365b) {
            r.j("Invalid group index");
            throw null;
        }
        if (!A(c3945c)) {
            return false;
        }
        int d11 = C3156m.d(this.f25364a, i11) + i11;
        int a11 = c3945c.a();
        return i11 <= a11 && a11 < d11;
    }

    @NotNull
    public final C3944b1 x() {
        if (this.f25369f) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f25368e++;
        return new C3944b1(this);
    }

    @NotNull
    public final C3953e1 z() {
        if (this.f25369f) {
            r.j("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (this.f25368e > 0) {
            r.j("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f25369f = true;
        this.f25370g++;
        return new C3953e1(this);
    }
}
