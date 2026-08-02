package Kc0;

import De.C2862e;
import R2.InterfaceC3917k;
import Sc.InterfaceC4008j;
import Sc.s;
import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.C10754w;
import xe.H0;
import xe.InterfaceC10750u;
import xe.U;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC3917k<W2.f>> f15818a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2862e f15819b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15820c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC10750u<Boolean> f15821d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f15822e;

    public l() {
        throw null;
    }

    public l(InterfaceC4008j dataStore) {
        C2862e coroutineScope = td0.f.a();
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f15818a = dataStore;
        this.f15819b = coroutineScope;
        this.f15820c = Sc.k.b(e.f15799b);
        this.f15821d = C10754w.a();
        this.f15822e = new AtomicBoolean(false);
    }

    public static final f.a b(l lVar) {
        return (f.a) lVar.f15820c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r8.s(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        int i11;
        l lVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.f15803g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f15803g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = fVar.f15801e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = fVar.f15803g;
                if (i11 != 0) {
                    s.b(obj);
                    if (!((H0) this.f15821d).l0()) {
                        U a11 = C10727i.a(this.f15819b, null, null, new g(this, null), 3);
                        fVar.f15800d = this;
                        fVar.f15803g = 1;
                    }
                    lVar = this;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return obj;
                    }
                    lVar = fVar.f15800d;
                    s.b(obj);
                }
                InterfaceC10750u<Boolean> interfaceC10750u = lVar.f15821d;
                fVar.f15800d = null;
                fVar.f15803g = 2;
                Object s11 = interfaceC10750u.s(fVar);
                return s11 != aVar ? aVar : s11;
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f15801e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fVar.f15803g;
        if (i11 != 0) {
        }
        InterfaceC10750u<Boolean> interfaceC10750u2 = lVar.f15821d;
        fVar.f15800d = null;
        fVar.f15803g = 2;
        Object s112 = interfaceC10750u2.s(fVar);
        if (s112 != aVar2) {
        }
    }

    public final Object g(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return f(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (W2.j.a(r7, r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        l lVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f15809g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f15809g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f15807e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f15809g;
                if (i11 != 0) {
                    s.b(obj);
                    hVar.f15806d = this;
                    hVar.f15809g = 1;
                    if (f(hVar) != aVar) {
                        lVar = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                lVar = hVar.f15806d;
                s.b(obj);
                InterfaceC3917k<W2.f> value = lVar.f15818a.getValue();
                i iVar = new i(lVar, null);
                hVar.f15806d = null;
                hVar.f15809g = 2;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f15807e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f15809g;
        if (i11 != 0) {
        }
        InterfaceC3917k<W2.f> value2 = lVar.f15818a.getValue();
        i iVar2 = new i(lVar, null);
        hVar.f15806d = null;
        hVar.f15809g = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (W2.j.a(r7, r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        int i11;
        l lVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i12 = jVar.f15815g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f15815g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jVar.f15813e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = jVar.f15815g;
                if (i11 != 0) {
                    s.b(obj);
                    jVar.f15812d = this;
                    jVar.f15815g = 1;
                    if (f(jVar) != aVar) {
                        lVar = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                lVar = jVar.f15812d;
                s.b(obj);
                InterfaceC3917k<W2.f> value = lVar.f15818a.getValue();
                k kVar = new k(lVar, null);
                jVar.f15812d = null;
                jVar.f15815g = 2;
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f15813e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = jVar.f15815g;
        if (i11 != 0) {
        }
        InterfaceC3917k<W2.f> value2 = lVar.f15818a.getValue();
        k kVar2 = new k(lVar, null);
        jVar.f15812d = null;
        jVar.f15815g = 2;
    }
}
