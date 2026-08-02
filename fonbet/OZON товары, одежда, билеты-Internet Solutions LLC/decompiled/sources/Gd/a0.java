package Gd;

import java.util.Collection;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import td.InterfaceC9839e;
import te.b;

/* loaded from: classes10.dex */
final class a0 implements b.c {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f10004a = new a0();

    @Override // te.b.c
    public final Iterable a(Object obj) {
        int i11 = d0.f10016p;
        Collection<je.N> o11 = ((InterfaceC9839e) obj).k().o();
        Intrinsics.checkNotNullExpressionValue(o11, "getSupertypes(...)");
        C7747g w11 = kotlin.sequences.l.w(C7714v.w(o11), b0.f10011a);
        Intrinsics.checkNotNullParameter(w11, "<this>");
        return new kotlin.sequences.x(w11);
    }
}
