package G1;

import a1.C0455b;
import c.C0514A;
import c.C0522a;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: G1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145p {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1925a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1926b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f1927c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1929e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0145p(int i, Object obj) {
        this(false);
        this.f1928d = i;
        this.f1929e = obj;
    }

    public final void d(boolean z3) {
        this.f1926b = z3;
        ArrayList arrayList = this.f1925a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0514A c0514a = (C0514A) obj;
            c0514a.f(c0514a.f7300e && z3);
        }
    }

    public C0145p(boolean z3) {
        this.f1925a = new ArrayList();
        this.f1926b = z3;
        this.f1927c = new CopyOnWriteArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0145p(C0455b c0455b) {
        this(true);
        this.f1928d = 1;
        this.f1929e = c0455b;
    }

    public final void a() {
    }

    public final void b(C0522a c0522a) {
    }

    public final void c(C0522a c0522a) {
    }
}
