package H3;

import F3.y;
import F3.z;
import I3.C0179i;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class h extends y {

    /* renamed from: a, reason: collision with root package name */
    public volatile y f2323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2325c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F3.m f2326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M3.a f2327e;
    public final /* synthetic */ i f;

    public h(i iVar, boolean z3, boolean z5, F3.m mVar, M3.a aVar) {
        this.f = iVar;
        this.f2324b = z3;
        this.f2325c = z5;
        this.f2326d = mVar;
        this.f2327e = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0068, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[SYNTHETIC] */
    @Override // F3.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(N3.a aVar) {
        Iterator it;
        if (this.f2324b) {
            aVar.Q();
            return null;
        }
        y yVar = this.f2323a;
        if (yVar == null) {
            F3.m mVar = this.f2326d;
            i iVar = this.f;
            M3.a aVar2 = this.f2327e;
            mVar.getClass();
            Objects.requireNonNull(iVar, "skipPast must not be null");
            C0179i c0179i = mVar.f1554d;
            c0179i.getClass();
            if (iVar != C0179i.f2650m) {
                ConcurrentHashMap concurrentHashMap = c0179i.f2652l;
                Class cls = aVar2.f3616a;
                z zVar = (z) concurrentHashMap.get(cls);
                if (zVar == null) {
                    G3.a aVar3 = (G3.a) cls.getAnnotation(G3.a.class);
                    if (aVar3 != null) {
                        Class value = aVar3.value();
                        if (z.class.isAssignableFrom(value)) {
                            z zVar2 = (z) c0179i.f2651k.r(new M3.a(value)).k();
                            z zVar3 = (z) concurrentHashMap.putIfAbsent(cls, zVar2);
                            if (zVar3 != null) {
                                zVar2 = zVar3;
                            }
                        }
                    }
                    it = mVar.f1555e.iterator();
                    boolean z3 = false;
                    while (true) {
                        if (!it.hasNext()) {
                            z zVar4 = (z) it.next();
                            if (z3) {
                                y a5 = zVar4.a(mVar, aVar2);
                                if (a5 != null) {
                                    yVar = a5;
                                    break;
                                }
                            } else if (zVar4 == iVar) {
                                z3 = true;
                            }
                        } else {
                            if (z3) {
                                throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar2);
                            }
                            yVar = mVar.b(aVar2);
                        }
                    }
                    this.f2323a = yVar;
                }
            }
            iVar = c0179i;
            it = mVar.f1555e.iterator();
            boolean z32 = false;
            while (true) {
                if (!it.hasNext()) {
                }
            }
            this.f2323a = yVar;
        }
        return yVar.a(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0067, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[SYNTHETIC] */
    @Override // F3.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(N3.b bVar, Object obj) {
        Iterator it;
        if (this.f2325c) {
            bVar.n();
            return;
        }
        y yVar = this.f2323a;
        if (yVar == null) {
            F3.m mVar = this.f2326d;
            i iVar = this.f;
            M3.a aVar = this.f2327e;
            mVar.getClass();
            Objects.requireNonNull(iVar, "skipPast must not be null");
            C0179i c0179i = mVar.f1554d;
            c0179i.getClass();
            if (iVar != C0179i.f2650m) {
                ConcurrentHashMap concurrentHashMap = c0179i.f2652l;
                Class cls = aVar.f3616a;
                z zVar = (z) concurrentHashMap.get(cls);
                if (zVar == null) {
                    G3.a aVar2 = (G3.a) cls.getAnnotation(G3.a.class);
                    if (aVar2 != null) {
                        Class value = aVar2.value();
                        if (z.class.isAssignableFrom(value)) {
                            z zVar2 = (z) c0179i.f2651k.r(new M3.a(value)).k();
                            z zVar3 = (z) concurrentHashMap.putIfAbsent(cls, zVar2);
                            if (zVar3 != null) {
                                zVar2 = zVar3;
                            }
                        }
                    }
                    it = mVar.f1555e.iterator();
                    boolean z3 = false;
                    while (true) {
                        if (!it.hasNext()) {
                            z zVar4 = (z) it.next();
                            if (z3) {
                                y a5 = zVar4.a(mVar, aVar);
                                if (a5 != null) {
                                    yVar = a5;
                                    break;
                                }
                            } else if (zVar4 == iVar) {
                                z3 = true;
                            }
                        } else {
                            if (z3) {
                                throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
                            }
                            yVar = mVar.b(aVar);
                        }
                    }
                    this.f2323a = yVar;
                }
            }
            iVar = c0179i;
            it = mVar.f1555e.iterator();
            boolean z32 = false;
            while (true) {
                if (!it.hasNext()) {
                }
            }
            this.f2323a = yVar;
        }
        yVar.b(bVar, obj);
    }
}
