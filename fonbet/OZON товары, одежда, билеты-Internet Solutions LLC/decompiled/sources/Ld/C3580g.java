package Ld;

import Ld.AbstractC3579f;
import Ld.y;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import yd.C10884b;

/* renamed from: Ld.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3580g implements y.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC3579f<Object, AbstractC3579f.a<Object>> f16768a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList<Object> f16769b;

    C3580g(AbstractC3579f<Object, AbstractC3579f.a<Object>> abstractC3579f, ArrayList<Object> arrayList) {
        this.f16768a = abstractC3579f;
        this.f16769b = arrayList;
    }

    @Override // Ld.y.c
    public final void a() {
    }

    @Override // Ld.y.c
    public final y.a b(Sd.b classId, C10884b source) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(source, "source");
        return this.f16768a.u(classId, source, this.f16769b);
    }
}
