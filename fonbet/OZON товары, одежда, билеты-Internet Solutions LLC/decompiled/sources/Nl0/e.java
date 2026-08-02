package Nl0;

import Je.InterfaceC3394a;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xb.C10695c;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final pb.d f19624a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Ol0.c f19625b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Ol0.i f19626c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final C10695c f19627d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final Ol0.e f19628e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final Pl0.i f19629f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final Za.d f19630g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final Je.d f19631h;

    public e(@NotNull pb.d packageManagerDataSource, @NotNull Ol0.c appInfoDefaultHostDataSource, @NotNull Ol0.i arbiterStoreDataSource, @NotNull C10695c masterHostApi, @NotNull Ol0.e arbiterMasterSelectionDataSource, @NotNull Pl0.i onDefaultHostChanged, @NotNull Za.d logger) {
        Intrinsics.checkNotNullParameter(packageManagerDataSource, "packageManagerDataSource");
        Intrinsics.checkNotNullParameter(appInfoDefaultHostDataSource, "appInfoDefaultHostDataSource");
        Intrinsics.checkNotNullParameter(arbiterStoreDataSource, "arbiterStoreDataSource");
        Intrinsics.checkNotNullParameter(masterHostApi, "masterHostApi");
        Intrinsics.checkNotNullParameter(arbiterMasterSelectionDataSource, "arbiterMasterSelectionDataSource");
        Intrinsics.checkNotNullParameter(onDefaultHostChanged, "onDefaultHostChanged");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f19624a = packageManagerDataSource;
        this.f19625b = appInfoDefaultHostDataSource;
        this.f19626c = arbiterStoreDataSource;
        this.f19627d = masterHostApi;
        this.f19628e = arbiterMasterSelectionDataSource;
        this.f19629f = onDefaultHostChanged;
        this.f19630g = logger.a(this);
        this.f19631h = Je.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        Object c11;
        e eVar;
        Throwable b11;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f19617g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f19617g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f19615e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f19617g;
                if (i11 != 0) {
                    s.b(obj);
                    cVar2.f19614d = this;
                    cVar2.f19617g = 1;
                    c11 = this.f19627d.c(list, cVar2);
                    if (c11 == aVar) {
                        return aVar;
                    }
                    eVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = cVar2.f19614d;
                    s.b(obj);
                    c11 = ((Sc.r) obj).getF26106a();
                }
                b11 = Sc.r.b(c11);
                if (b11 != null) {
                    return c11;
                }
                eVar.f19630g.b("Unable to get host list. Will be used empty host list", b11);
                return K.f71697a;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f19615e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f19617g;
        if (i11 != 0) {
        }
        b11 = Sc.r.b(c11);
        if (b11 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {all -> 0x0079, blocks: (B:25:0x0057, B:31:0x006d), top: B:24:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        Object obj;
        int i11;
        Je.d dVar;
        e eVar;
        InterfaceC3394a interfaceC3394a;
        Throwable th2;
        Object a11;
        try {
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i12 = bVar.f19613h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    bVar.f19613h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = bVar.f19611f;
                    obj = Wc.a.COROUTINE_SUSPENDED;
                    i11 = bVar.f19613h;
                    if (i11 != 0) {
                        s.b(obj2);
                        bVar.f19609d = this;
                        dVar = this.f19631h;
                        bVar.f19610e = dVar;
                        bVar.f19613h = 1;
                        if (dVar.a(bVar) != obj) {
                            eVar = this;
                        }
                        return obj;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3394a = (InterfaceC3394a) bVar.f19609d;
                        try {
                            s.b(obj2);
                            Unit unit = Unit.f71690a;
                            interfaceC3394a.c(null);
                            return unit;
                        } catch (Throwable th3) {
                            th2 = th3;
                            interfaceC3394a.c(null);
                            throw th2;
                        }
                    }
                    Je.d dVar2 = bVar.f19610e;
                    eVar = (e) bVar.f19609d;
                    s.b(obj2);
                    dVar = dVar2;
                    Ol0.i iVar = eVar.f19626c;
                    bVar.f19609d = dVar;
                    bVar.f19610e = null;
                    bVar.f19613h = 2;
                    a11 = W2.j.a(iVar.f20481a, new Ol0.f(), bVar);
                    if (a11 == obj) {
                        a11 = Unit.f71690a;
                    }
                    if (a11 != obj) {
                        interfaceC3394a = dVar;
                        Unit unit2 = Unit.f71690a;
                        interfaceC3394a.c(null);
                        return unit2;
                    }
                    return obj;
                }
            }
            Ol0.i iVar2 = eVar.f19626c;
            bVar.f19609d = dVar;
            bVar.f19610e = null;
            bVar.f19613h = 2;
            a11 = W2.j.a(iVar2.f20481a, new Ol0.f(), bVar);
            if (a11 == obj) {
            }
            if (a11 != obj) {
            }
            return obj;
        } catch (Throwable th4) {
            interfaceC3394a = dVar;
            th2 = th4;
            interfaceC3394a.c(null);
            throw th2;
        }
        bVar = new b(this, cVar);
        Object obj22 = bVar.f19611f;
        obj = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f19613h;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x010e, code lost:
    
        if (r10.invoke(r0) == r1) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013c A[Catch: all -> 0x015d, TRY_ENTER, TryCatch #7 {all -> 0x015d, blocks: (B:73:0x006e, B:74:0x016f, B:76:0x0177, B:79:0x0185, B:81:0x018b, B:86:0x01a8, B:87:0x01b4, B:89:0x01bc, B:92:0x01d1, B:96:0x007b, B:97:0x0134, B:101:0x013c, B:103:0x0148, B:106:0x0160), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0114 A[Catch: all -> 0x0091, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0091, blocks: (B:111:0x008c, B:113:0x0114, B:116:0x011f), top: B:110:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011f A[Catch: all -> 0x0091, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0091, blocks: (B:111:0x008c, B:113:0x0114, B:116:0x011f), top: B:110:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ff A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #3 {all -> 0x00a5, blocks: (B:123:0x00a1, B:124:0x00f7, B:126:0x00ff), top: B:122:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ed A[Catch: all -> 0x0202, TRY_LEAVE, TryCatch #2 {all -> 0x0202, blocks: (B:21:0x01e7, B:23:0x01ed, B:27:0x0206, B:28:0x020b, B:30:0x0211, B:33:0x0226, B:34:0x022a, B:36:0x0230, B:40:0x0243, B:42:0x0248, B:45:0x025d, B:51:0x0279, B:57:0x0285), top: B:20:0x01e7, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0177 A[Catch: all -> 0x015d, TRY_LEAVE, TryCatch #7 {all -> 0x015d, blocks: (B:73:0x006e, B:74:0x016f, B:76:0x0177, B:79:0x0185, B:81:0x018b, B:86:0x01a8, B:87:0x01b4, B:89:0x01bc, B:92:0x01d1, B:96:0x007b, B:97:0x0134, B:101:0x013c, B:103:0x0148, B:106:0x0160), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0185 A[Catch: all -> 0x015d, TRY_ENTER, TryCatch #7 {all -> 0x015d, blocks: (B:73:0x006e, B:74:0x016f, B:76:0x0177, B:79:0x0185, B:81:0x018b, B:86:0x01a8, B:87:0x01b4, B:89:0x01bc, B:92:0x01d1, B:96:0x007b, B:97:0x0134, B:101:0x013c, B:103:0x0148, B:106:0x0160), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r10v6, types: [Je.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r2v12, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v28, types: [Je.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r4v11, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r5v10, types: [Je.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        ?? r22;
        e eVar;
        d dVar2;
        Za.a aVar;
        Object a11;
        Object obj;
        ?? r52;
        InterfaceC3394a interfaceC3394a;
        e eVar2;
        Za.a aVar2;
        InterfaceC3394a interfaceC3394a2;
        List list;
        List list2;
        Object obj2;
        Za.a aVar3;
        InterfaceC3394a interfaceC3394a3;
        ?? r23;
        Object obj3;
        Za.a aVar4;
        InterfaceC3394a interfaceC3394a4;
        try {
            try {
                if (cVar instanceof d) {
                    dVar = (d) cVar;
                    int i11 = dVar.f19623i;
                    if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        dVar.f19623i = i11 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj4 = dVar.f19621g;
                        Wc.a aVar5 = Wc.a.COROUTINE_SUSPENDED;
                        r22 = dVar.f19623i;
                        switch (r22) {
                            case 0:
                                s.b(obj4);
                                dVar.f19618d = this;
                                ?? r102 = this.f19631h;
                                dVar.f19619e = r102;
                                dVar.f19623i = 1;
                                if (r102.a(dVar) != aVar5) {
                                    eVar = this;
                                    dVar2 = r102;
                                    try {
                                        eVar.f19630g.info("getMasterHost started");
                                        aVar = (Za.a) C7714v.M(eVar.f19625b.f20464a.invoke());
                                        Ol0.i iVar = eVar.f19626c;
                                        dVar.f19618d = eVar;
                                        dVar.f19619e = dVar2;
                                        dVar.f19620f = aVar;
                                        dVar.f19623i = 2;
                                        a11 = iVar.a(aVar, dVar);
                                        if (a11 != aVar5) {
                                            obj = dVar2;
                                            obj4 = a11;
                                            r52 = obj;
                                            if (((Boolean) obj4).booleanValue()) {
                                                Pl0.i iVar2 = eVar.f19629f;
                                                dVar.f19618d = eVar;
                                                dVar.f19619e = obj;
                                                dVar.f19620f = aVar;
                                                dVar.f19623i = 3;
                                                r52 = obj;
                                                break;
                                            }
                                            if (aVar != null) {
                                                eVar.f19630g.b("Default host is not null", null);
                                                r52.c(null);
                                                return aVar;
                                            }
                                            Ol0.i iVar3 = eVar.f19626c;
                                            dVar.f19618d = eVar;
                                            dVar.f19619e = r52;
                                            dVar.f19620f = null;
                                            dVar.f19623i = 4;
                                            obj4 = iVar3.b(dVar);
                                            if (obj4 != aVar5) {
                                                interfaceC3394a = r52;
                                                eVar2 = eVar;
                                                aVar2 = (Za.a) obj4;
                                                if (aVar2 == null) {
                                                    interfaceC3394a.c(null);
                                                    return aVar2;
                                                }
                                                List<String> a12 = eVar2.f19624a.a();
                                                if (a12.isEmpty()) {
                                                    eVar2.f19630g.b("Empty packages list", null);
                                                    Za.a aVar6 = (Za.a) eVar2.f19625b.f20465b.invoke();
                                                    interfaceC3394a.c(null);
                                                    return aVar6;
                                                }
                                                dVar.f19618d = eVar2;
                                                dVar.f19619e = interfaceC3394a;
                                                dVar.f19623i = 5;
                                                obj4 = eVar2.a(a12, dVar);
                                                interfaceC3394a2 = interfaceC3394a;
                                                if (obj4 == aVar5) {
                                                }
                                                list = (List) obj4;
                                                if (!list.isEmpty()) {
                                                    Za.a aVar7 = (Za.a) eVar2.f19625b.f20465b.invoke();
                                                    interfaceC3394a2.c(null);
                                                    return aVar7;
                                                }
                                                if (list.size() == 1) {
                                                    Za.a aVar8 = (Za.a) C7714v.K(list);
                                                    Ol0.i iVar4 = eVar2.f19626c;
                                                    dVar.f19618d = interfaceC3394a2;
                                                    dVar.f19619e = aVar8;
                                                    dVar.f19623i = 6;
                                                    Object a13 = W2.j.a(iVar4.f20481a, new Ol0.j(iVar4, aVar8, null), dVar);
                                                    if (a13 != aVar5) {
                                                        a13 = Unit.f71690a;
                                                    }
                                                    if (a13 != aVar5) {
                                                        aVar3 = aVar8;
                                                        interfaceC3394a3 = interfaceC3394a2;
                                                        interfaceC3394a3.c(null);
                                                        return aVar3;
                                                    }
                                                } else {
                                                    Za.a aVar9 = (Za.a) C7714v.M(list);
                                                    if (aVar9 == null) {
                                                        eVar2.f19630g.b("Unable to get arbiter", null);
                                                        Za.a aVar10 = (Za.a) eVar2.f19625b.f20465b.invoke();
                                                        interfaceC3394a2.c(null);
                                                        return aVar10;
                                                    }
                                                    Ol0.e eVar3 = eVar2.f19628e;
                                                    dVar.f19618d = eVar2;
                                                    dVar.f19619e = interfaceC3394a2;
                                                    dVar.f19620f = list;
                                                    dVar.f19623i = 7;
                                                    Object a14 = eVar3.a(aVar9, dVar);
                                                    if (a14 != aVar5) {
                                                        list2 = list;
                                                        obj2 = a14;
                                                        r23 = interfaceC3394a2;
                                                        try {
                                                            if (Eb.j.a(obj2)) {
                                                                eVar2.f19630g.b("Unable to get valid master from arbiter", null);
                                                                Za.a aVar11 = (Za.a) eVar2.f19625b.f20465b.invoke();
                                                                r23.c(null);
                                                                return aVar11;
                                                            }
                                                            try {
                                                                s.b(obj2);
                                                                String str = (String) obj2;
                                                                if (str.length() == 0) {
                                                                    eVar2.f19630g.error("Master package is empty", null);
                                                                    Za.a aVar12 = (Za.a) eVar2.f19625b.f20465b.invoke();
                                                                    r23.c(null);
                                                                    return aVar12;
                                                                }
                                                                Iterator it = list2.iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        obj3 = it.next();
                                                                        if (Intrinsics.d(((Za.a) obj3).a(), str)) {
                                                                        }
                                                                    } else {
                                                                        obj3 = null;
                                                                    }
                                                                }
                                                                Za.a aVar13 = (Za.a) obj3;
                                                                if (aVar13 == null) {
                                                                    eVar2.f19630g.error("Master host is empty", null);
                                                                    Za.a aVar14 = (Za.a) eVar2.f19625b.f20465b.invoke();
                                                                    r23.c(null);
                                                                    return aVar14;
                                                                }
                                                                Ol0.i iVar5 = eVar2.f19626c;
                                                                dVar.f19618d = r23;
                                                                dVar.f19619e = aVar13;
                                                                dVar.f19620f = null;
                                                                dVar.f19623i = 8;
                                                                Object a15 = W2.j.a(iVar5.f20481a, new Ol0.j(iVar5, aVar13, null), dVar);
                                                                if (a15 != Wc.a.COROUTINE_SUSPENDED) {
                                                                    a15 = Unit.f71690a;
                                                                }
                                                                if (a15 != aVar5) {
                                                                    aVar4 = aVar13;
                                                                    interfaceC3394a4 = r23;
                                                                    interfaceC3394a4.c(null);
                                                                    return aVar4;
                                                                }
                                                            } catch (Exception e11) {
                                                                eVar2.f19630g.error("Unable to get master from arbiter", e11);
                                                                Za.a aVar15 = (Za.a) eVar2.f19625b.f20465b.invoke();
                                                                r23.c(null);
                                                                return aVar15;
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            dVar = r23;
                                                            r22 = dVar;
                                                            r22.c(null);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        dVar = dVar2;
                                        th = th3;
                                        r22 = dVar;
                                        r22.c(null);
                                        throw th;
                                    }
                                }
                                return aVar5;
                            case 1:
                                ?? r24 = (InterfaceC3394a) dVar.f19619e;
                                e eVar4 = (e) dVar.f19618d;
                                s.b(obj4);
                                dVar2 = r24;
                                eVar = eVar4;
                                eVar.f19630g.info("getMasterHost started");
                                aVar = (Za.a) C7714v.M(eVar.f19625b.f20464a.invoke());
                                Ol0.i iVar6 = eVar.f19626c;
                                dVar.f19618d = eVar;
                                dVar.f19619e = dVar2;
                                dVar.f19620f = aVar;
                                dVar.f19623i = 2;
                                a11 = iVar6.a(aVar, dVar);
                                if (a11 != aVar5) {
                                }
                                return aVar5;
                            case 2:
                                aVar = (Za.a) dVar.f19620f;
                                obj = (InterfaceC3394a) dVar.f19619e;
                                eVar = (e) dVar.f19618d;
                                try {
                                    s.b(obj4);
                                    obj = obj;
                                    r52 = obj;
                                    if (((Boolean) obj4).booleanValue()) {
                                    }
                                    if (aVar != null) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    r22 = obj;
                                    r22.c(null);
                                    throw th;
                                }
                                break;
                            case 3:
                                aVar = (Za.a) dVar.f19620f;
                                ?? r53 = (InterfaceC3394a) dVar.f19619e;
                                eVar = (e) dVar.f19618d;
                                try {
                                    s.b(obj4);
                                    r52 = r53;
                                    if (aVar != null) {
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    dVar = r53;
                                    r22 = dVar;
                                    r22.c(null);
                                    throw th;
                                }
                                break;
                            case 4:
                                InterfaceC3394a interfaceC3394a5 = (InterfaceC3394a) dVar.f19619e;
                                eVar2 = (e) dVar.f19618d;
                                s.b(obj4);
                                interfaceC3394a = interfaceC3394a5;
                                aVar2 = (Za.a) obj4;
                                if (aVar2 == null) {
                                }
                                break;
                            case 5:
                                InterfaceC3394a interfaceC3394a6 = (InterfaceC3394a) dVar.f19619e;
                                eVar2 = (e) dVar.f19618d;
                                s.b(obj4);
                                interfaceC3394a2 = interfaceC3394a6;
                                list = (List) obj4;
                                if (!list.isEmpty()) {
                                }
                                break;
                            case 6:
                                aVar3 = (Za.a) dVar.f19619e;
                                interfaceC3394a3 = (InterfaceC3394a) dVar.f19618d;
                                s.b(obj4);
                                interfaceC3394a3.c(null);
                                return aVar3;
                            case 7:
                                List list3 = (List) dVar.f19620f;
                                ?? r42 = (InterfaceC3394a) dVar.f19619e;
                                eVar2 = (e) dVar.f19618d;
                                try {
                                    s.b(obj4);
                                    obj2 = ((Sc.r) obj4).getF26106a();
                                    list2 = list3;
                                    r23 = r42;
                                    if (Eb.j.a(obj2)) {
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    dVar = r42;
                                    r22 = dVar;
                                    r22.c(null);
                                    throw th;
                                }
                                break;
                            case 8:
                                aVar4 = (Za.a) dVar.f19619e;
                                interfaceC3394a4 = (InterfaceC3394a) dVar.f19618d;
                                s.b(obj4);
                                interfaceC3394a4.c(null);
                                return aVar4;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
                switch (r22) {
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
        dVar = new d(this, cVar);
        Object obj42 = dVar.f19621g;
        Wc.a aVar52 = Wc.a.COROUTINE_SUSPENDED;
        r22 = dVar.f19623i;
    }
}
