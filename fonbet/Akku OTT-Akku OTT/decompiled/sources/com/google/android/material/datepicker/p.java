package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes4.dex */
public final class p implements View.OnClickListener {
    public final /* synthetic */ z a;
    public final /* synthetic */ j b;

    public p(j jVar, z zVar) {
        this.b = jVar;
        this.a = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.b;
        int findFirstVisibleItemPosition = ((LinearLayoutManager) jVar.l.getLayoutManager()).findFirstVisibleItemPosition() + 1;
        if (findFirstVisibleItemPosition < jVar.l.getAdapter().getItemCount()) {
            Calendar c = E.c(this.a.a.a.a);
            c.add(2, findFirstVisibleItemPosition);
            jVar.f(new w(c));
        }
    }
}
