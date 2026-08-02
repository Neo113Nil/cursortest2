package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import com.haryanvi.netstream.R;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class z extends RecyclerView.Adapter<a> {

    @NonNull
    public final C0943a a;
    public final InterfaceC0946d<?> b;

    @Nullable
    public final AbstractC0948f c;
    public final j.c d;
    public final int e;

    public static class a extends RecyclerView.ViewHolder {
        public final TextView a;
        public final MaterialCalendarGridView b;

        public a(@NonNull LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.a = textView;
            ViewCompat.setAccessibilityHeading(textView, true);
            this.b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public z(@NonNull ContextThemeWrapper contextThemeWrapper, InterfaceC0946d interfaceC0946d, @NonNull C0943a c0943a, @Nullable AbstractC0948f abstractC0948f, j.c cVar) {
        w wVar = c0943a.a;
        w wVar2 = c0943a.b;
        w wVar3 = c0943a.d;
        if (wVar.a.compareTo(wVar3.a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (wVar3.a.compareTo(wVar2.a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * x.i) + (s.g(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.a = c0943a;
        this.b = interfaceC0946d;
        this.c = abstractC0948f;
        this.d = cVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        Calendar c = E.c(this.a.a.a);
        c.add(2, i);
        c.set(5, 1);
        Calendar c2 = E.c(c);
        c2.get(2);
        c2.get(1);
        c2.getMaximum(7);
        c2.getActualMaximum(5);
        c2.getTimeInMillis();
        return c2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull a aVar, int i) {
        a aVar2 = aVar;
        C0943a c0943a = this.a;
        Calendar c = E.c(c0943a.a.a);
        c.add(2, i);
        w wVar = new w(c);
        aVar2.a.setText(wVar.m());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !wVar.equals(materialCalendarGridView.a().a)) {
            x xVar = new x(wVar, this.b, c0943a, this.c);
            materialCalendarGridView.setNumColumns(wVar.d);
            materialCalendarGridView.setAdapter((ListAdapter) xVar);
        } else {
            materialCalendarGridView.invalidate();
            x a2 = materialCalendarGridView.a();
            InterfaceC0946d<?> interfaceC0946d = a2.b;
            Iterator<Long> it = a2.c.iterator();
            while (it.hasNext()) {
                a2.e(materialCalendarGridView, it.next().longValue());
            }
            if (interfaceC0946d != null) {
                Iterator<Long> it2 = interfaceC0946d.j().iterator();
                while (it2.hasNext()) {
                    a2.e(materialCalendarGridView, it2.next().longValue());
                }
                a2.c = interfaceC0946d.j();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new y(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!s.g(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.e));
        return new a(linearLayout, true);
    }
}
