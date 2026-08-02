package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.haryanvi.netstream.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class x extends BaseAdapter {
    public static final int i = E.e(null).getMaximum(4);
    public static final int j = (E.e(null).getMaximum(7) + E.e(null).getMaximum(5)) - 1;
    public final w a;
    public final InterfaceC0946d<?> b;
    public Collection<Long> c;
    public C0945c d;
    public final C0943a e;

    @Nullable
    public final AbstractC0948f f;

    public x(w wVar, InterfaceC0946d<?> interfaceC0946d, C0943a c0943a, @Nullable AbstractC0948f abstractC0948f) {
        this.a = wVar;
        this.b = interfaceC0946d;
        this.e = c0943a;
        this.f = abstractC0948f;
        this.c = interfaceC0946d.j();
    }

    public final int a() {
        int i2 = this.e.e;
        w wVar = this.a;
        Calendar calendar = wVar.a;
        int i3 = calendar.get(7);
        if (i2 <= 0) {
            i2 = calendar.getFirstDayOfWeek();
        }
        int i4 = i3 - i2;
        return i4 < 0 ? i4 + wVar.d : i4;
    }

    @Override // android.widget.Adapter
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i2) {
        if (i2 < a() || i2 > c()) {
            return null;
        }
        int a = (i2 - a()) + 1;
        Calendar c = E.c(this.a.a);
        c.set(5, a);
        return Long.valueOf(c.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.a.e) - 1;
    }

    public final void d(@Nullable TextView textView, long j2, int i2) {
        boolean z;
        boolean z2;
        C0944b c0944b;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z3 = true;
        boolean z4 = E.d().getTimeInMillis() == j2;
        InterfaceC0946d<?> interfaceC0946d = this.b;
        Iterator<Pair<Long, Long>> it = interfaceC0946d.g().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Long l = it.next().first;
            if (l != null && l.longValue() == j2) {
                z = true;
                break;
            }
        }
        Iterator<Pair<Long, Long>> it2 = interfaceC0946d.g().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            Long l2 = it2.next().second;
            if (l2 != null && l2.longValue() == j2) {
                z2 = true;
                break;
            }
        }
        Calendar d = E.d();
        Calendar e = E.e(null);
        e.setTimeInMillis(j2);
        String format = d.get(1) == e.get(1) ? E.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j2)) : E.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j2));
        if (z4) {
            format = String.format(context.getString(R.string.mtrl_picker_today_description), format);
        }
        if (z) {
            format = String.format(context.getString(R.string.mtrl_picker_start_date_description), format);
        } else if (z2) {
            format = String.format(context.getString(R.string.mtrl_picker_end_date_description), format);
        }
        textView.setContentDescription(format);
        if (this.e.c.c(j2)) {
            textView.setEnabled(true);
            Iterator<Long> it3 = interfaceC0946d.j().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                } else {
                    if (E.a(j2) == E.a(it3.next().longValue())) {
                        break;
                    }
                }
            }
            textView.setSelected(z3);
            c0944b = z3 ? this.d.b : E.d().getTimeInMillis() == j2 ? this.d.c : this.d.a;
        } else {
            textView.setEnabled(false);
            c0944b = this.d.g;
        }
        if (this.f == null || i2 == -1) {
            c0944b.b(textView);
            return;
        }
        int i3 = this.a.c;
        c0944b.b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(format);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j2) {
        w l = w.l(j2);
        w wVar = this.a;
        if (l.equals(wVar)) {
            Calendar c = E.c(wVar.a);
            c.setTimeInMillis(j2);
            int i2 = c.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().a() + (i2 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j2, i2);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return j;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2 / this.a.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    @Override // android.widget.Adapter
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i2, @Nullable View view, @NonNull ViewGroup viewGroup) {
        int i3;
        Long item;
        Context context = viewGroup.getContext();
        if (this.d == null) {
            this.d = new C0945c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a = i2 - a();
        if (a >= 0) {
            w wVar = this.a;
            if (a < wVar.e) {
                i3 = a + 1;
                textView.setTag(wVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i3)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i2);
                if (item != null) {
                    return textView;
                }
                d(textView, item.longValue(), i3);
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        i3 = -1;
        item = getItem(i2);
        if (item != null) {
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
