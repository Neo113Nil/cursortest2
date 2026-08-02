package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.s;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class j<S> extends B<S> {

    @StyleRes
    public int b;

    @Nullable
    public InterfaceC0946d<S> c;

    @Nullable
    public C0943a d;

    @Nullable
    public AbstractC0948f e;

    @Nullable
    public w f;
    public d i;
    public C0945c j;
    public RecyclerView k;
    public RecyclerView l;
    public View m;
    public View n;
    public View o;
    public View p;

    public class a extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(null);
        }
    }

    public class b extends C {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, int i, int i2) {
            super(context, i, false);
            this.a = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
            int i = this.a;
            j jVar = j.this;
            if (i == 0) {
                iArr[0] = jVar.l.getWidth();
                iArr[1] = jVar.l.getWidth();
            } else {
                iArr[0] = jVar.l.getHeight();
                iArr[1] = jVar.l.getHeight();
            }
        }
    }

    public class c {
        public c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final d b;
        public static final /* synthetic */ d[] c;

        static {
            d dVar = new d("DAY", 0);
            a = dVar;
            d dVar2 = new d("YEAR", 1);
            b = dVar2;
            c = new d[]{dVar, dVar2};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) c.clone();
        }
    }

    @Override // com.google.android.material.datepicker.B
    public final void e(@NonNull s.c cVar) {
        this.a.add(cVar);
    }

    public final void f(w wVar) {
        z zVar = (z) this.l.getAdapter();
        int n = zVar.a.a.n(wVar);
        int n2 = n - zVar.a.a.n(this.f);
        boolean z = Math.abs(n2) > 3;
        boolean z2 = n2 > 0;
        this.f = wVar;
        if (z && z2) {
            this.l.scrollToPosition(n - 3);
            this.l.post(new i(this, n));
        } else if (!z) {
            this.l.post(new i(this, n));
        } else {
            this.l.scrollToPosition(n + 3);
            this.l.post(new i(this, n));
        }
    }

    public final void g(d dVar) {
        this.i = dVar;
        if (dVar == d.b) {
            this.k.getLayoutManager().scrollToPosition(this.f.c - ((G) this.k.getAdapter()).a.d.a.c);
            this.o.setVisibility(0);
            this.p.setVisibility(8);
            this.m.setVisibility(8);
            this.n.setVisibility(8);
            return;
        }
        if (dVar == d.a) {
            this.o.setVisibility(8);
            this.p.setVisibility(0);
            this.m.setVisibility(0);
            this.n.setVisibility(0);
            f(this.f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.b = bundle.getInt("THEME_RES_ID_KEY");
        this.c = (InterfaceC0946d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.d = (C0943a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.e = (AbstractC0948f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f = (w) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.b);
        this.j = new C0945c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        w wVar = this.d.a;
        if (s.g(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.haryanvi.netstream.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.haryanvi.netstream.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.haryanvi.netstream.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.haryanvi.netstream.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.haryanvi.netstream.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.haryanvi.netstream.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = x.i;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.haryanvi.netstream.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.haryanvi.netstream.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.haryanvi.netstream.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.haryanvi.netstream.R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new a());
        int i4 = this.d.e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new C0949g(i4) : new C0949g()));
        gridView.setNumColumns(wVar.d);
        gridView.setEnabled(false);
        this.l = (RecyclerView) inflate.findViewById(com.haryanvi.netstream.R.id.mtrl_calendar_months);
        this.l.setLayoutManager(new b(getContext(), i2, i2));
        this.l.setTag("MONTHS_VIEW_GROUP_TAG");
        z zVar = new z(contextThemeWrapper, this.c, this.d, this.e, new c());
        this.l.setAdapter(zVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.haryanvi.netstream.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(com.haryanvi.netstream.R.id.mtrl_calendar_year_selector_frame);
        this.k = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.k.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.k.setAdapter(new G(this));
            this.k.addItemDecoration(new l(this));
        }
        if (inflate.findViewById(com.haryanvi.netstream.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.haryanvi.netstream.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.setAccessibilityDelegate(materialButton, new m(this));
            View findViewById = inflate.findViewById(com.haryanvi.netstream.R.id.month_navigation_previous);
            this.m = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.haryanvi.netstream.R.id.month_navigation_next);
            this.n = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.o = inflate.findViewById(com.haryanvi.netstream.R.id.mtrl_calendar_year_selector_frame);
            this.p = inflate.findViewById(com.haryanvi.netstream.R.id.mtrl_calendar_day_selector_frame);
            g(d.a);
            materialButton.setText(this.f.m());
            this.l.addOnScrollListener(new n(this, zVar, materialButton));
            materialButton.setOnClickListener(new o(this));
            this.n.setOnClickListener(new p(this, zVar));
            this.m.setOnClickListener(new h(this, zVar));
        }
        if (!s.g(contextThemeWrapper, R.attr.windowFullscreen)) {
            new PagerSnapHelper().attachToRecyclerView(this.l);
        }
        this.l.scrollToPosition(zVar.a.a.n(this.f));
        ViewCompat.setAccessibilityDelegate(this.l, new k());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.e);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f);
    }
}
