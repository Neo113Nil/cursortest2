package D4;

import A.v;
import C4.i;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import y4.n;
import y4.o;
import y4.p;
import y4.z;

/* loaded from: classes.dex */
public final class f implements o {

    /* renamed from: a, reason: collision with root package name */
    public final i f976a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f977b;

    /* renamed from: c, reason: collision with root package name */
    public final int f978c;

    /* renamed from: d, reason: collision with root package name */
    public final v f979d;

    /* renamed from: e, reason: collision with root package name */
    public final C0.c f980e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f981g;

    /* renamed from: h, reason: collision with root package name */
    public final int f982h;
    public int i;

    public f(i iVar, ArrayList arrayList, int i, v vVar, C0.c cVar, int i5, int i6, int i7) {
        l.f("call", iVar);
        l.f("request", cVar);
        this.f976a = iVar;
        this.f977b = arrayList;
        this.f978c = i;
        this.f979d = vVar;
        this.f980e = cVar;
        this.f = i5;
        this.f981g = i6;
        this.f982h = i7;
    }

    public static f a(f fVar, int i, v vVar, C0.c cVar, int i5) {
        if ((i5 & 1) != 0) {
            i = fVar.f978c;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            vVar = fVar.f979d;
        }
        v vVar2 = vVar;
        if ((i5 & 4) != 0) {
            cVar = fVar.f980e;
        }
        C0.c cVar2 = cVar;
        int i7 = fVar.f;
        int i8 = fVar.f981g;
        int i9 = fVar.f982h;
        fVar.getClass();
        l.f("request", cVar2);
        return new f(fVar.f976a, fVar.f977b, i6, vVar2, cVar2, i7, i8, i9);
    }

    public final z b(C0.c cVar) {
        l.f("request", cVar);
        ArrayList arrayList = this.f977b;
        int size = arrayList.size();
        int i = this.f978c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        v vVar = this.f979d;
        if (vVar != null) {
            if (!((C4.e) vVar.f134c).b((n) cVar.f811b)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i5 = i + 1;
        f a5 = a(this, i5, null, cVar, 58);
        p pVar = (p) arrayList.get(i);
        z a6 = pVar.a(a5);
        if (a6 == null) {
            throw new NullPointerException("interceptor " + pVar + " returned null");
        }
        if (vVar != null && i5 < arrayList.size() && a5.i != 1) {
            throw new IllegalStateException(("network interceptor " + pVar + " must call proceed() exactly once").toString());
        }
        if (a6.f21454q != null) {
            return a6;
        }
        throw new IllegalStateException(("interceptor " + pVar + " returned a response with no body").toString());
    }
}
