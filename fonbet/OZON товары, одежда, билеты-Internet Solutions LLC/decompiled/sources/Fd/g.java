package Fd;

import Jd.InterfaceC3391a;
import ie.C7056e;
import ie.InterfaceC7060i;
import java.util.Iterator;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.I;
import org.jetbrains.annotations.NotNull;
import qd.s;
import ud.InterfaceC10025c;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public final class g implements InterfaceC10030h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f9388a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Jd.d f9389b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9390c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC7060i<InterfaceC3391a, InterfaceC10025c> f9391d;

    public g(@NotNull k c11, @NotNull Jd.d annotationOwner, boolean z11) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        this.f9388a = c11;
        this.f9389b = annotationOwner;
        this.f9390c = z11;
        this.f9391d = ((C7056e) c11.a().u()).j(new f(this));
    }

    static Ed.g b(g gVar, InterfaceC3391a annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        int i11 = Dd.e.f6574e;
        return Dd.e.e(gVar.f9388a, annotation, gVar.f9390c);
    }

    @Override // ud.InterfaceC10030h
    public final boolean K0(@NotNull Sd.c cVar) {
        return InterfaceC10030h.b.b(this, cVar);
    }

    @Override // ud.InterfaceC10030h
    public final boolean isEmpty() {
        return this.f9389b.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<InterfaceC10025c> iterator() {
        Jd.d dVar = this.f9389b;
        I v11 = kotlin.sequences.l.v(C7714v.w(dVar.getAnnotations()), this.f9391d);
        int i11 = Dd.e.f6574e;
        return kotlin.sequences.l.j(kotlin.sequences.l.z(v11, Dd.e.a(s.a.f81913m, dVar, this.f9388a))).iterator();
    }

    @Override // ud.InterfaceC10030h
    public final InterfaceC10025c j(@NotNull Sd.c fqName) {
        InterfaceC10025c invoke;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Jd.d dVar = this.f9389b;
        InterfaceC3391a j11 = dVar.j(fqName);
        if (j11 != null && (invoke = this.f9391d.invoke(j11)) != null) {
            return invoke;
        }
        int i11 = Dd.e.f6574e;
        return Dd.e.a(fqName, dVar, this.f9388a);
    }
}
