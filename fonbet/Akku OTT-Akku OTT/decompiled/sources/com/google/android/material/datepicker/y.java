package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class y implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ z b;

    public y(z zVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = zVar;
        this.a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        x a = materialCalendarGridView.a();
        if (i < a.a() || i > a.c()) {
            return;
        }
        j.c cVar = this.b.d;
        long longValue = materialCalendarGridView.a().getItem(i).longValue();
        j jVar = j.this;
        if (jVar.d.c.c(longValue)) {
            jVar.c.a();
            Iterator it = jVar.a.iterator();
            while (it.hasNext()) {
                ((A) it.next()).a(jVar.c.k());
            }
            jVar.l.getAdapter().notifyDataSetChanged();
            RecyclerView recyclerView = jVar.k;
            if (recyclerView != null) {
                recyclerView.getAdapter().notifyDataSetChanged();
            }
        }
    }
}
