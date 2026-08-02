package Fe0;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ce0.e f9450a;

    public e(@NotNull Ce0.e dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.f9450a = dao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        long currentTimeMillis;
        e eVar;
        List list;
        long j11;
        e eVar2;
        Iterator it;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f9449i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f9449i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f9447g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f9449i;
                if (i11 != 0) {
                    s.b(obj);
                    currentTimeMillis = System.currentTimeMillis();
                    dVar.f9444d = this;
                    dVar.f9446f = currentTimeMillis;
                    dVar.f9449i = 1;
                    obj = this.f9450a.d(dVar);
                    if (obj != aVar) {
                        eVar = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = dVar.f9446f;
                    it = dVar.f9445e;
                    eVar2 = dVar.f9444d;
                    s.b(obj);
                    while (it.hasNext()) {
                        De0.b bVar = (De0.b) it.next();
                        if (j11 - bVar.d() > 2592000000L && !bVar.f()) {
                            Ce0.e eVar3 = eVar2.f9450a;
                            dVar.f9444d = eVar2;
                            dVar.f9445e = it;
                            dVar.f9446f = j11;
                            dVar.f9449i = 2;
                            if (eVar3.e(bVar, dVar) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    return Unit.f71690a;
                }
                currentTimeMillis = dVar.f9446f;
                eVar = dVar.f9444d;
                s.b(obj);
                list = (List) obj;
                if (list.size() > 1) {
                    return Unit.f71690a;
                }
                j11 = currentTimeMillis;
                eVar2 = eVar;
                it = list.iterator();
                while (it.hasNext()) {
                }
                return Unit.f71690a;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f9447g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f9449i;
        if (i11 != 0) {
        }
        list = (List) obj2;
        if (list.size() > 1) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        e eVar;
        De0.b bVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f9443h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f9443h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f9441f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f9443h;
                if (i11 != 0) {
                    s.b(obj);
                    cVar2.f9439d = this;
                    cVar2.f9443h = 1;
                    obj = this.f9450a.c(str, cVar2);
                    if (obj != aVar) {
                        eVar = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        De0.b bVar2 = (De0.b) cVar2.f9439d;
                        s.b(obj);
                        return bVar2;
                    }
                    bVar = cVar2.f9440e;
                    eVar = (e) cVar2.f9439d;
                    s.b(obj);
                    cVar2.f9439d = bVar;
                    cVar2.f9440e = null;
                    cVar2.f9443h = 3;
                    return eVar.c(cVar2) == aVar ? aVar : bVar;
                }
                e eVar2 = (e) cVar2.f9439d;
                s.b(obj);
                eVar = eVar2;
                bVar = (De0.b) obj;
                if (bVar != null) {
                    return null;
                }
                cVar2.f9439d = eVar;
                cVar2.f9440e = bVar;
                cVar2.f9443h = 2;
                eVar.getClass();
                Object a11 = eVar.f9450a.a(De0.b.a(bVar, System.currentTimeMillis()), cVar2);
                if (a11 != aVar) {
                    a11 = Unit.f71690a;
                }
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f9441f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f9443h;
        if (i11 != 0) {
        }
        bVar = (De0.b) obj2;
        if (bVar != null) {
        }
    }

    public final Object d(@NotNull String url, @NotNull String file, boolean z11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        long currentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(file, "file");
        byte[] bytes = file.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        Object b11 = this.f9450a.b(new De0.b(url, bytes, currentTimeMillis, z11), dVar);
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (b11 != aVar) {
            b11 = Unit.f71690a;
        }
        return b11 == aVar ? b11 : Unit.f71690a;
    }
}
