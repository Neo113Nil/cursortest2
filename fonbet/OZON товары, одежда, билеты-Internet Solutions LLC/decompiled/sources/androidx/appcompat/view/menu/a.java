package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public abstract class a implements m {

    /* renamed from: a, reason: collision with root package name */
    protected Context f37349a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f37350b;

    /* renamed from: c, reason: collision with root package name */
    protected g f37351c;

    /* renamed from: d, reason: collision with root package name */
    protected LayoutInflater f37352d;

    /* renamed from: e, reason: collision with root package name */
    private m.a f37353e;

    /* renamed from: f, reason: collision with root package name */
    private int f37354f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    private int f37355g = R.layout.abc_action_menu_item_layout;

    /* renamed from: h, reason: collision with root package name */
    protected n f37356h;

    /* renamed from: i, reason: collision with root package name */
    private int f37357i;

    public a(Context context) {
        this.f37349a = context;
        this.f37352d = LayoutInflater.from(context);
    }

    public abstract void a(i iVar, n.a aVar);

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z11) {
        m.a aVar = this.f37353e;
        if (aVar != null) {
            aVar.b(gVar, z11);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean d(i iVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.m
    public void e(boolean z11) {
        ViewGroup viewGroup = (ViewGroup) this.f37356h;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f37351c;
        int i11 = 0;
        if (gVar != null) {
            gVar.k();
            ArrayList<i> r11 = this.f37351c.r();
            int size = r11.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                i iVar = r11.get(i13);
                if (q(iVar)) {
                    View childAt = viewGroup.getChildAt(i12);
                    i g10 = childAt instanceof n.a ? ((n.a) childAt).g() : null;
                    View n11 = n(iVar, childAt, viewGroup);
                    if (iVar != g10) {
                        n11.setPressed(false);
                        n11.jumpDrawablesToCurrentState();
                    }
                    if (n11 != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) n11.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(n11);
                        }
                        ((ViewGroup) this.f37356h).addView(n11, i12);
                    }
                    i12++;
                }
            }
            i11 = i12;
        }
        while (i11 < viewGroup.getChildCount()) {
            if (!h(i11, viewGroup)) {
                i11++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void g(Context context, g gVar) {
        this.f37350b = context;
        LayoutInflater.from(context);
        this.f37351c = gVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public final int getId() {
        return this.f37357i;
    }

    protected abstract boolean h(int i11, ViewGroup viewGroup);

    @Override // androidx.appcompat.view.menu.m
    public final void i(m.a aVar) {
        this.f37353e = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean j(i iVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.m
    public boolean l(q qVar) {
        m.a aVar = this.f37353e;
        q qVar2 = qVar;
        if (aVar == null) {
            return false;
        }
        if (qVar == null) {
            qVar2 = this.f37351c;
        }
        return aVar.c(qVar2);
    }

    public final m.a m() {
        return this.f37353e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a aVar = view instanceof n.a ? (n.a) view : (n.a) this.f37352d.inflate(this.f37355g, viewGroup, false);
        a(iVar, aVar);
        return (View) aVar;
    }

    public n o(ViewGroup viewGroup) {
        if (this.f37356h == null) {
            n nVar = (n) this.f37352d.inflate(this.f37354f, viewGroup, false);
            this.f37356h = nVar;
            nVar.a(this.f37351c);
            e(true);
        }
        return this.f37356h;
    }

    public final void p() {
        this.f37357i = R.id.action_menu_presenter;
    }

    public abstract boolean q(i iVar);
}
