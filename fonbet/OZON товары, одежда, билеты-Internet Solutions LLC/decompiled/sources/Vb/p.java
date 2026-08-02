package Vb;

import Hf.A;
import Hf.AbstractC3139b;
import Hf.t;
import Hf.v;
import Hf.w;
import Hf.x;
import Hf.y;
import Hf.z;
import Ub.j;
import Ub.l;
import Ub.u;
import Wb.C4855a;
import Wb.C4856b;
import Wb.C4857c;
import Wb.C4858d;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p extends Ub.a {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f28491a = new ArrayList(0);

    /* loaded from: classes9.dex */
    public interface a {
        void a(@NonNull Ub.l lVar, @NonNull String str, int i11);
    }

    protected p() {
    }

    @NonNull
    public static p c() {
        return new p();
    }

    static void d(@NonNull Ub.l lVar, String str, @NonNull String str2, @NonNull AbstractC3139b abstractC3139b) {
        lVar.k();
        int length = lVar.length();
        u d11 = lVar.d();
        d11.a((char) 160);
        d11.a('\n');
        lVar.t().f().getClass();
        d11.b(str2);
        lVar.w();
        lVar.d().a((char) 160);
        q.f28498g.e(lVar.i(), str);
        lVar.E(abstractC3139b, length);
        lVar.q(abstractC3139b);
    }

    @Override // Ub.a, Ub.h
    public final void afterSetText(@NonNull TextView textView) {
        if (textView.getMovementMethod() == null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @NonNull
    public final void b(@NonNull a aVar) {
        this.f28491a.add(aVar);
    }

    @Override // Ub.a, Ub.h
    public final void beforeSetText(@NonNull TextView textView, @NonNull Spanned spanned) {
        Xb.i.a(textView, spanned);
        if (spanned instanceof Spannable) {
            Xb.l.a((Spannable) spanned, textView);
        }
    }

    @Override // Ub.a, Ub.h
    public final void configureSpansFactory(@NonNull j.a aVar) {
        C4856b c4856b = new C4856b();
        aVar.b(y.class, new Wb.h());
        aVar.b(Hf.i.class, new C4858d());
        aVar.b(Hf.c.class, new C4855a());
        aVar.b(Hf.e.class, new C4857c());
        aVar.b(Hf.j.class, c4856b);
        aVar.b(Hf.p.class, c4856b);
        aVar.b(t.class, new Wb.g());
        aVar.b(Hf.l.class, new Wb.e());
        aVar.b(Hf.q.class, new Wb.f());
        aVar.b(A.class, new Wb.i());
    }

    @Override // Ub.a, Ub.h
    public final void configureVisitor(@NonNull l.a aVar) {
        aVar.a(z.class, new g(this));
        aVar.a(y.class, new h());
        aVar.a(Hf.i.class, new i());
        aVar.a(Hf.c.class, new j());
        aVar.a(Hf.e.class, new k());
        aVar.a(Hf.j.class, new l());
        aVar.a(Hf.p.class, new m());
        aVar.a(Hf.o.class, new n());
        aVar.a(Hf.d.class, new s());
        aVar.a(v.class, new s());
        aVar.a(t.class, new o());
        aVar.a(A.class, new Vb.a());
        aVar.a(Hf.l.class, new b());
        aVar.a(x.class, new c());
        aVar.a(Hf.k.class, new d());
        aVar.a(w.class, new e());
        aVar.a(Hf.q.class, new f());
    }
}
