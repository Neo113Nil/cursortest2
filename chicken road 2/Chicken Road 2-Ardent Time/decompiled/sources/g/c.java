package g;

/* loaded from: classes.dex */
public final class c implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.l f2919b;

    public /* synthetic */ c(g.l lVar, int i2) {
        this.f2918a = i2;
        this.f2919b = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2918a) {
            case 0:
                g.g gVar = (g.g) this.f2919b;
                if (gVar.i()) {
                    java.util.ArrayList arrayList = gVar.f2935h;
                    if (arrayList.size() > 0 && !((g.f) arrayList.get(0)).f2926a.f3086u) {
                        android.view.View view = gVar.f2942o;
                        if (view != null && view.isShown()) {
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((g.f) it.next()).f2926a.c();
                            }
                            break;
                        } else {
                            gVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                g.s sVar = (g.s) this.f2919b;
                if (sVar.i()) {
                    h.L l2 = sVar.f3025h;
                    if (!l2.f3086u) {
                        android.view.View view2 = sVar.f3030m;
                        if (view2 != null && view2.isShown()) {
                            l2.c();
                            break;
                        } else {
                            sVar.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
