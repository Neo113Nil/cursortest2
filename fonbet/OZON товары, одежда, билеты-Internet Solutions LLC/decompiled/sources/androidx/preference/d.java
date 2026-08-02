package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView;
import j.C7232a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class d extends RecyclerView.g<h> {

    /* renamed from: a, reason: collision with root package name */
    private PreferenceScreen f44582a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f44583b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f44584c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f44585d;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f44587f = new a();

    /* renamed from: e, reason: collision with root package name */
    private Handler f44586e = new Handler();

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.l();
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        int f44589a;

        /* renamed from: b, reason: collision with root package name */
        int f44590b;

        /* renamed from: c, reason: collision with root package name */
        String f44591c;

        b(Preference preference) {
            this.f44591c = preference.getClass().getName();
            this.f44589a = preference.k();
            this.f44590b = preference.v();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f44589a == bVar.f44589a && this.f44590b == bVar.f44590b && TextUtils.equals(this.f44591c, bVar.f44591c);
        }

        public final int hashCode() {
            return this.f44591c.hashCode() + ((((527 + this.f44589a) * 31) + this.f44590b) * 31);
        }
    }

    public d(PreferenceScreen preferenceScreen) {
        this.f44582a = preferenceScreen;
        preferenceScreen.b0(this);
        this.f44583b = new ArrayList();
        this.f44584c = new ArrayList();
        this.f44585d = new ArrayList();
        setHasStableIds(preferenceScreen.r0());
        l();
    }

    private ArrayList f(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int o02 = preferenceGroup.o0();
        int i11 = 0;
        for (int i12 = 0; i12 < o02; i12++) {
            Preference n02 = preferenceGroup.n0(i12);
            if (n02.B()) {
                if (!i(preferenceGroup) || i11 < preferenceGroup.m0()) {
                    arrayList.add(n02);
                } else {
                    arrayList2.add(n02);
                }
                if (n02 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) n02;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (i(preferenceGroup) && i(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        Iterator it = f(preferenceGroup2).iterator();
                        while (it.hasNext()) {
                            Preference preference = (Preference) it.next();
                            if (!i(preferenceGroup) || i11 < preferenceGroup.m0()) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i11++;
                        }
                    }
                } else {
                    i11++;
                }
            }
        }
        if (i(preferenceGroup) && i11 > preferenceGroup.m0()) {
            androidx.preference.a aVar = new androidx.preference.a(preferenceGroup.e(), arrayList2, preferenceGroup.h());
            aVar.d0(new e(this, preferenceGroup));
            arrayList.add(aVar);
        }
        return arrayList;
    }

    private void g(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        preferenceGroup.q0();
        int o02 = preferenceGroup.o0();
        for (int i11 = 0; i11 < o02; i11++) {
            Preference n02 = preferenceGroup.n0(i11);
            arrayList.add(n02);
            b bVar = new b(n02);
            ArrayList arrayList2 = this.f44585d;
            if (!arrayList2.contains(bVar)) {
                arrayList2.add(bVar);
            }
            if (n02 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) n02;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    g(arrayList, preferenceGroup2);
                }
            }
            n02.b0(this);
        }
    }

    private static boolean i(PreferenceGroup preferenceGroup) {
        return preferenceGroup.m0() != Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        return this.f44584c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final long getItemId(int i11) {
        if (hasStableIds()) {
            return h(i11).h();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i11) {
        b bVar = new b(h(i11));
        ArrayList arrayList = this.f44585d;
        int indexOf = arrayList.indexOf(bVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(bVar);
        return size;
    }

    public final Preference h(int i11) {
        if (i11 < 0 || i11 >= this.f44584c.size()) {
            return null;
        }
        return (Preference) this.f44584c.get(i11);
    }

    public final void j(Preference preference) {
        int indexOf = this.f44584c.indexOf(preference);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, preference);
        }
    }

    public final void k() {
        Handler handler = this.f44586e;
        Runnable runnable = this.f44587f;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }

    final void l() {
        Iterator it = this.f44583b.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).b0(null);
        }
        ArrayList arrayList = new ArrayList(this.f44583b.size());
        this.f44583b = arrayList;
        PreferenceScreen preferenceScreen = this.f44582a;
        g(arrayList, preferenceScreen);
        this.f44584c = f(preferenceScreen);
        notifyDataSetChanged();
        Iterator it2 = this.f44583b.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(@NonNull h hVar, int i11) {
        h(i11).I(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NonNull
    public final h onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11) {
        b bVar = (b) this.f44585d.get(i11);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, G4.f.f9700a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C7232a.a(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(bVar.f44589a, viewGroup, false);
        if (inflate.getBackground() == null) {
            int i12 = Y.f42258g;
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i13 = bVar.f44590b;
            if (i13 != 0) {
                from.inflate(i13, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new h(inflate);
    }
}
