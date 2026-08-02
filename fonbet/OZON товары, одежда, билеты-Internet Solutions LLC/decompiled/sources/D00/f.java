package D00;

import D00.g;
import P00.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import kotlin.text.s;
import org.jetbrains.annotations.NotNull;
import x10.C10644a;

/* loaded from: classes7.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private C10644a f5204a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bd  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String] */
    @Override // D00.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g a(@NotNull List<? extends R00.f> incidents) {
        g gVar;
        g gVar2;
        ArrayList arrayList;
        g.b bVar;
        Intrinsics.checkNotNullParameter(incidents, "incidents");
        C10644a c10644a = this.f5204a;
        if (c10644a == null || !c10644a.a()) {
            return null;
        }
        if (incidents.isEmpty()) {
            gVar = null;
        } else {
            Intrinsics.checkNotNullParameter(incidents, "incidents");
            ArrayList arrayList2 = new ArrayList();
            for (R00.f fVar : incidents) {
                if (fVar instanceof R00.e) {
                    R00.e eVar = (R00.e) fVar;
                    String g10 = eVar.g();
                    if (g10 == null) {
                        g10 = eVar.d();
                    }
                    bVar = new g.b(g10, Nk.a.b("Widget is not supported: ", eVar.d()));
                } else {
                    if (fVar instanceof R00.d) {
                        R00.d dVar = (R00.d) fVar;
                        Throwable i11 = dVar.i();
                        String message = i11 != null ? i11.getMessage() : null;
                        if (dVar.h() != l.PARSE) {
                            bVar = null;
                        } else if (message == null) {
                            String g11 = dVar.g();
                            if (g11 == null) {
                                g11 = dVar.d();
                            }
                            bVar = new g.b(g11, " no message");
                        } else {
                            StringBuilder sb2 = new StringBuilder(message);
                            StringBuilder sb3 = new StringBuilder();
                            ArrayList arrayList3 = new ArrayList();
                            s L11 = h.L(sb2);
                            boolean z11 = false;
                            while (L11.hasNext()) {
                                char b11 = L11.b();
                                if (b11 == ' ') {
                                    if (sb3.length() > 0) {
                                        String sb4 = sb3.toString();
                                        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
                                        arrayList3.add(sb4);
                                        h.s(sb3);
                                    }
                                    z11 = false;
                                }
                                if (b11 == '$' || b11 == '\'') {
                                    z11 = true;
                                }
                                if (z11) {
                                    sb3.append(b11);
                                }
                            }
                            if (sb3.length() > 1) {
                                String sb5 = sb3.toString();
                                Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
                                arrayList3.add(sb5);
                                h.s(sb3);
                            }
                            int size = arrayList3.size();
                            String b12 = size != 1 ? size != 2 ? null : V.e.b(new Object[]{arrayList3.get(0), arrayList3.get(1)}, 2, "Отсутствует %s в %s", "format(...)") : V.e.b(new Object[]{arrayList3.get(0)}, 1, "Отсутствует %s", "format(...)");
                            if (b12 != null) {
                                String g12 = dVar.g();
                                if (g12 == null) {
                                    g12 = dVar.d();
                                }
                                bVar = new g.b(g12, b12);
                            } else {
                                String g13 = dVar.g();
                                if (g13 == null) {
                                    g13 = dVar.d();
                                }
                                bVar = new g.b(g13, message);
                            }
                        }
                    } else {
                        bVar = null;
                    }
                    if (bVar == null) {
                        arrayList2.add(bVar);
                    }
                }
                if (bVar == null) {
                }
            }
            gVar = null;
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                gVar2 = new g(arrayList2.size() > 1 ? arrayList2.size() < 4 ? V.e.b(new Object[]{Integer.valueOf(arrayList2.size())}, 1, "Произошло %s ошибки парсинга", "format(...)") : V.e.b(new Object[]{Integer.valueOf(arrayList2.size())}, 1, "Произошло %s ошибок парсинга", "format(...)") : G.g.c(((g.b) arrayList2.get(0)).b(), " ", ((g.b) arrayList2.get(0)).a()), arrayList2);
                arrayList = new ArrayList();
                for (Object obj : incidents) {
                    if (obj instanceof R00.d) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        R00.d dVar2 = (R00.d) it.next();
                        Throwable i12 = dVar2.i();
                        ?? message2 = i12 != null ? i12.getMessage() : gVar;
                        if (message2 == 0) {
                            message2 = "";
                        }
                        Object g14 = h.t(message2, "AuthorizationHeader is wrong", false) ? dVar2.g() : gVar;
                        if (g14 != null) {
                            arrayList4.add(g14);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (!C7714v.A(arrayList4, ((R00.d) next).g())) {
                            arrayList5.add(next);
                        }
                    }
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        Throwable i13 = ((R00.d) it3.next()).i();
                        if (i13 != null) {
                            H00.c.a(i13);
                        }
                    }
                }
                return gVar2;
            }
        }
        gVar2 = gVar;
        arrayList = new ArrayList();
        while (r0.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
        return gVar2;
    }

    @Override // D00.e
    public final void b(@NotNull C10644a incidentsNotifierChecker) {
        Intrinsics.checkNotNullParameter(incidentsNotifierChecker, "incidentsNotifierChecker");
        this.f5204a = incidentsNotifierChecker;
    }
}
