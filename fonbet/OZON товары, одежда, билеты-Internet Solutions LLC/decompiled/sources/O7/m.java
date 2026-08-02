package O7;

import O7.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final c f20027a;

    /* renamed from: b, reason: collision with root package name */
    private final l f20028b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20029c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    static abstract class a extends O7.a<String> {

        /* renamed from: c, reason: collision with root package name */
        final CharSequence f20030c;

        /* renamed from: d, reason: collision with root package name */
        final c f20031d;

        /* renamed from: g, reason: collision with root package name */
        int f20034g;

        /* renamed from: f, reason: collision with root package name */
        int f20033f = 0;

        /* renamed from: e, reason: collision with root package name */
        final boolean f20032e = false;

        protected a(m mVar, CharSequence charSequence) {
            this.f20031d = mVar.f20027a;
            this.f20034g = mVar.f20029c;
            this.f20030c = charSequence;
        }
    }

    private m(l lVar) {
        c cVar = c.d.f20014a;
        this.f20028b = lVar;
        this.f20027a = cVar;
        this.f20029c = Integer.MAX_VALUE;
    }

    public static m c(char c11) {
        return new m(new l(new c.b(c11)));
    }

    public final List<String> d(CharSequence charSequence) {
        charSequence.getClass();
        l lVar = this.f20028b;
        lVar.getClass();
        k kVar = new k(lVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (kVar.hasNext()) {
            arrayList.add(kVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
