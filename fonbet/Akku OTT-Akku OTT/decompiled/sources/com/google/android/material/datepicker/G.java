package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.haryanvi.netstream.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class G extends RecyclerView.Adapter<a> {
    public final j<?> a;

    public static class a extends RecyclerView.ViewHolder {
        public final TextView a;

        public a(TextView textView) {
            super(textView);
            this.a = textView;
        }
    }

    public G(j<?> jVar) {
        this.a = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.d.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull a aVar, int i) {
        a aVar2 = aVar;
        j<?> jVar = this.a;
        int i2 = jVar.d.a.c + i;
        aVar2.a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        TextView textView = aVar2.a;
        Context context = textView.getContext();
        textView.setContentDescription(E.d().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C0945c c0945c = jVar.j;
        Calendar d = E.d();
        C0944b c0944b = d.get(1) == i2 ? c0945c.f : c0945c.d;
        Iterator<Long> it = jVar.c.j().iterator();
        while (it.hasNext()) {
            d.setTimeInMillis(it.next().longValue());
            if (d.get(1) == i2) {
                c0944b = c0945c.e;
            }
        }
        c0944b.b(textView);
        textView.setOnClickListener(new F(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
