package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f9269c;

    public /* synthetic */ l(k kVar, int i3, int i4) {
        this.f9267a = i4;
        this.f9269c = kVar;
        this.f9268b = i3;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        switch (this.f9267a) {
            case 0:
                r rVar = (r) this.f9269c;
                int i3 = this.f9268b;
                if (!z3) {
                    io.flutter.plugin.editing.l lVar = rVar.f9306g;
                    if (lVar != null) {
                        lVar.b(i3);
                        break;
                    }
                } else {
                    T1.o oVar = (T1.o) rVar.f9307h.f1788b;
                    if (oVar != null) {
                        oVar.a("viewFocused", Integer.valueOf(i3), null);
                        break;
                    }
                }
                break;
            default:
                q qVar = (q) this.f9269c;
                int i4 = this.f9268b;
                if (!z3) {
                    io.flutter.plugin.editing.l lVar2 = qVar.f;
                    if (lVar2 != null) {
                        lVar2.b(i4);
                        break;
                    }
                } else {
                    T1.o oVar2 = (T1.o) qVar.f9289g.f1788b;
                    if (oVar2 != null) {
                        oVar2.a("viewFocused", Integer.valueOf(i4), null);
                        break;
                    }
                }
                break;
        }
    }
}
