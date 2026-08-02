package Ld;

import Ld.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yd.C10884b;

/* renamed from: Ld.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3577d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC3578e<Object, Object> f16758a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ HashMap<B, List<Object>> f16759b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y f16760c;

    /* renamed from: Ld.d$a */
    public final class a extends b {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3577d f16761d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3577d c3577d, B signature) {
            super(c3577d, signature);
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.f16761d = c3577d;
        }

        public final k d(int i11, Sd.b classId, C10884b source) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(source, "source");
            B signature = c();
            Intrinsics.checkNotNullParameter(signature, "signature");
            B b11 = new B(signature.a() + '@' + i11);
            C3577d c3577d = this.f16761d;
            List<Object> list = c3577d.f16759b.get(b11);
            if (list == null) {
                list = new ArrayList<>();
                c3577d.f16759b.put(b11, list);
            }
            return c3577d.f16758a.u(classId, source, list);
        }
    }

    /* renamed from: Ld.d$b */
    public class b implements y.c {

        /* renamed from: a, reason: collision with root package name */
        private final B f16762a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<Object> f16763b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3577d f16764c;

        public b(C3577d c3577d, B signature) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.f16764c = c3577d;
            this.f16762a = signature;
            this.f16763b = new ArrayList<>();
        }

        @Override // Ld.y.c
        public final void a() {
            ArrayList<Object> arrayList = this.f16763b;
            if (arrayList.isEmpty()) {
                return;
            }
            this.f16764c.f16759b.put(this.f16762a, arrayList);
        }

        @Override // Ld.y.c
        public final y.a b(Sd.b classId, C10884b source) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(source, "source");
            return this.f16764c.f16758a.u(classId, source, this.f16763b);
        }

        protected final B c() {
            return this.f16762a;
        }
    }

    C3577d(AbstractC3578e abstractC3578e, HashMap hashMap, y yVar, HashMap hashMap2) {
        this.f16758a = abstractC3578e;
        this.f16759b = hashMap;
        this.f16760c = yVar;
    }

    public final a a(Sd.f name, String desc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        String name2 = name.b();
        Intrinsics.checkNotNullExpressionValue(name2, "asString(...)");
        Intrinsics.checkNotNullParameter(name2, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new a(this, new B(U7.d.e(name2, desc)));
    }
}
