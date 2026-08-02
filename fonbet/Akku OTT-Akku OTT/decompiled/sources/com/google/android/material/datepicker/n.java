package com.google.android.material.datepicker;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class n extends RecyclerView.OnScrollListener {
    public final /* synthetic */ z a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ j c;

    public n(j jVar, z zVar, MaterialButton materialButton) {
        this.c = jVar;
        this.a = zVar;
        this.b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        C0943a c0943a = this.a.a;
        j jVar = this.c;
        int findFirstVisibleItemPosition = i < 0 ? ((LinearLayoutManager) jVar.l.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) jVar.l.getLayoutManager()).findLastVisibleItemPosition();
        Calendar c = E.c(c0943a.a.a);
        c.add(2, findFirstVisibleItemPosition);
        jVar.f = new w(c);
        Calendar c2 = E.c(c0943a.a.a);
        c2.add(2, findFirstVisibleItemPosition);
        c2.set(5, 1);
        Calendar c3 = E.c(c2);
        c3.get(2);
        c3.get(1);
        c3.getMaximum(7);
        c3.getActualMaximum(5);
        c3.getTimeInMillis();
        this.b.setText(E.b("yMMMM", Locale.getDefault()).format(new Date(c3.getTimeInMillis())));
    }
}
