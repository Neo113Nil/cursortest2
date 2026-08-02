package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.j;
import java.util.Calendar;

/* loaded from: classes4.dex */
public final class F implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ G b;

    public F(G g, int i) {
        this.b = g;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j<?> jVar = this.b.a;
        w h = w.h(this.a, jVar.f.b);
        C0943a c0943a = jVar.d;
        w wVar = c0943a.b;
        w wVar2 = c0943a.a;
        Calendar calendar = h.a;
        if (calendar.compareTo(wVar2.a) < 0) {
            h = wVar2;
        } else if (calendar.compareTo(wVar.a) > 0) {
            h = wVar;
        }
        jVar.f(h);
        jVar.g(j.d.a);
    }
}
