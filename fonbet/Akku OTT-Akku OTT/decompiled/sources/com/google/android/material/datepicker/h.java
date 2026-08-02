package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes4.dex */
public final class h implements View.OnClickListener {
    public final /* synthetic */ z a;
    public final /* synthetic */ j b;

    public h(j jVar, z zVar) {
        this.b = jVar;
        this.a = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.b;
        int findLastVisibleItemPosition = ((LinearLayoutManager) jVar.l.getLayoutManager()).findLastVisibleItemPosition() - 1;
        if (findLastVisibleItemPosition >= 0) {
            Calendar c = E.c(this.a.a.a.a);
            c.add(2, findLastVisibleItemPosition);
            jVar.f(new w(c));
        }
    }
}
