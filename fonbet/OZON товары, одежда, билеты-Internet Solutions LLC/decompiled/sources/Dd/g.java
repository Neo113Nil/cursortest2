package Dd;

import Jd.InterfaceC3392b;
import Xd.C4885b;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;
import ud.EnumC10039q;
import ud.EnumC10040r;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f6576a = U.j(new Pair("PACKAGE", EnumSet.noneOf(EnumC10040r.class)), new Pair("TYPE", EnumSet.of(EnumC10040r.CLASS, EnumC10040r.FILE)), new Pair("ANNOTATION_TYPE", EnumSet.of(EnumC10040r.ANNOTATION_CLASS)), new Pair("TYPE_PARAMETER", EnumSet.of(EnumC10040r.TYPE_PARAMETER)), new Pair("FIELD", EnumSet.of(EnumC10040r.FIELD)), new Pair("LOCAL_VARIABLE", EnumSet.of(EnumC10040r.LOCAL_VARIABLE)), new Pair("PARAMETER", EnumSet.of(EnumC10040r.VALUE_PARAMETER)), new Pair("CONSTRUCTOR", EnumSet.of(EnumC10040r.CONSTRUCTOR)), new Pair("METHOD", EnumSet.of(EnumC10040r.FUNCTION, EnumC10040r.PROPERTY_GETTER, EnumC10040r.PROPERTY_SETTER)), new Pair("TYPE_USE", EnumSet.of(EnumC10040r.TYPE)));

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f6577b = U.j(new Pair("RUNTIME", EnumC10039q.RUNTIME), new Pair("CLASS", EnumC10039q.BINARY), new Pair("SOURCE", EnumC10039q.SOURCE));

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6578c = 0;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static Xd.k a(InterfaceC3392b interfaceC3392b) {
        EnumC10039q enumC10039q;
        Jd.m mVar = interfaceC3392b instanceof Jd.m ? (Jd.m) interfaceC3392b : null;
        if (mVar == null || (enumC10039q = (EnumC10039q) f6577b.get(mVar.e().b())) == null) {
            return null;
        }
        Sd.c topLevelFqName = s.a.f81922v;
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        Sd.c e11 = topLevelFqName.e();
        Sd.b bVar = new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)"));
        Sd.f f7 = Sd.f.f(enumC10039q.name());
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        return new Xd.k(bVar, f7);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @NotNull
    public static C4885b b(@NotNull List arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof Jd.m) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f6576a.get(((Jd.m) it.next()).e().b());
            if (iterable == null) {
                iterable = M.f71699a;
            }
            C7714v.p(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(C7714v.z(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            EnumC10040r enumC10040r = (EnumC10040r) it2.next();
            Sd.c topLevelFqName = s.a.f81921u;
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            Sd.c e11 = topLevelFqName.e();
            Sd.b bVar = new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)"));
            Sd.f f7 = Sd.f.f(enumC10040r.name());
            Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
            arrayList3.add(new Xd.k(bVar, f7));
        }
        return new C4885b(arrayList3, f.f6575a);
    }
}
