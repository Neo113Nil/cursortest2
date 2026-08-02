package Vf0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import R2.InterfaceC3917k;
import Sc.s;
import W2.f;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f.a<Set<String>> f32704a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC3917k<W2.f> f32705b;

    public e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32704a = W2.i.d("extra_headers");
        this.f32705b = f.a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        e eVar;
        W2.f fVar;
        Set set;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f32695g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f32695g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f32693e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f32695g;
                if (i11 != 0) {
                    s.b(obj);
                    InterfaceC2395h<W2.f> data = this.f32705b.getData();
                    bVar.f32692d = this;
                    bVar.f32695g = 1;
                    obj = C2399j.w(data, bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    eVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = bVar.f32692d;
                    s.b(obj);
                }
                fVar = (W2.f) obj;
                if (fVar != null || (set = (Set) fVar.c(eVar.f32704a)) == null) {
                    return (Serializable) U.c();
                }
                Set set2 = set;
                int h11 = U.h(C7714v.z(set2, 10));
                if (h11 < 16) {
                    h11 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    List l11 = kotlin.text.h.l((String) it.next(), new char[]{'='}, 0, 6);
                    Pair pair = new Pair((String) l11.get(0), (String) l11.get(1));
                    linkedHashMap.put(pair.e(), pair.f());
                }
                return linkedHashMap;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f32693e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f32695g;
        if (i11 != 0) {
        }
        fVar = (W2.f) obj2;
        if (fVar != null) {
        }
        return (Serializable) U.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (W2.j.a(r2.f32705b, new Vf0.d(r4, r2, null), r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        a aVar;
        int i11;
        e eVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i12 = aVar.f32691h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f32691h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f32689f;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f32691h;
                if (i11 != 0) {
                    s.b(obj);
                    aVar.f32687d = this;
                    aVar.f32688e = str;
                    aVar.f32691h = 1;
                    obj = f(aVar);
                    if (obj != obj2) {
                        eVar = this;
                    }
                    return obj2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                str = aVar.f32688e;
                eVar = aVar.f32687d;
                s.b(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (!Intrinsics.d(entry.getKey(), str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                aVar.f32687d = null;
                aVar.f32688e = null;
                aVar.f32691h = 2;
                eVar.getClass();
            }
        }
        aVar = new a(this, cVar);
        Object obj3 = aVar.f32689f;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f32691h;
        if (i11 != 0) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        while (r9.hasNext()) {
        }
        aVar.f32687d = null;
        aVar.f32688e = null;
        aVar.f32691h = 2;
        eVar.getClass();
    }

    public final Object d(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object a11 = W2.j.a(this.f32705b, new d(U.c(), this, null), (kotlin.coroutines.jvm.internal.c) dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    public final Serializable e(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return f(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (W2.j.a(r6.f32705b, new Vf0.d(r7, r6, null), r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(@NotNull Map map, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        Map map2;
        e eVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f32700h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f32700h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f32698f;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f32700h;
                if (i11 != 0) {
                    s.b(obj);
                    cVar2.f32696d = map;
                    cVar2.f32697e = this;
                    cVar2.f32700h = 1;
                    obj = f(cVar2);
                    if (obj != obj2) {
                        map2 = map;
                        eVar = this;
                    }
                    return obj2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                eVar = cVar2.f32697e;
                map2 = cVar2.f32696d;
                s.b(obj);
                LinkedHashMap m11 = U.m((Map) obj, map2);
                cVar2.f32696d = null;
                cVar2.f32697e = null;
                cVar2.f32700h = 2;
                eVar.getClass();
            }
        }
        cVar2 = new c(this, cVar);
        Object obj3 = cVar2.f32698f;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f32700h;
        if (i11 != 0) {
        }
        LinkedHashMap m112 = U.m((Map) obj3, map2);
        cVar2.f32696d = null;
        cVar2.f32697e = null;
        cVar2.f32700h = 2;
        eVar.getClass();
    }
}
