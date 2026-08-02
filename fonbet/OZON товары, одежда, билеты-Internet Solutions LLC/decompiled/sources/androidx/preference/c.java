package androidx.preference;

import B0.A0;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.preference.DialogPreference;
import androidx.preference.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public abstract class c extends ComponentCallbacksC5392m implements g.b, g.a, DialogPreference.a {

    /* renamed from: b, reason: collision with root package name */
    private g f44569b;

    /* renamed from: c, reason: collision with root package name */
    RecyclerView f44570c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f44571d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44572e;

    /* renamed from: a, reason: collision with root package name */
    private final C0813c f44568a = new C0813c();

    /* renamed from: f, reason: collision with root package name */
    private int f44573f = R.layout.preference_list_fragment;

    /* renamed from: g, reason: collision with root package name */
    private Handler f44574g = new a();

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f44575h = new b();

    final class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            c.this.t();
        }
    }

    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = c.this.f44570c;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* renamed from: androidx.preference.c$c, reason: collision with other inner class name */
    private class C0813c extends RecyclerView.n {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f44578a;

        /* renamed from: b, reason: collision with root package name */
        private int f44579b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f44580c = true;

        C0813c() {
        }

        private boolean c(View view, RecyclerView recyclerView) {
            RecyclerView.C childViewHolder = recyclerView.getChildViewHolder(view);
            if (!(childViewHolder instanceof h) || !((h) childViewHolder).g()) {
                return false;
            }
            boolean z11 = this.f44580c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z11;
            }
            RecyclerView.C childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
            return (childViewHolder2 instanceof h) && ((h) childViewHolder2).f();
        }

        public final void a(boolean z11) {
            this.f44580c = z11;
        }

        public final void b(int i11) {
            this.f44579b = i11;
            c.this.f44570c.invalidateItemDecorations();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.A a11) {
            if (c(view, recyclerView)) {
                rect.bottom = this.f44579b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a11) {
            if (this.f44578a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = recyclerView.getChildAt(i11);
                if (c(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f44578a.setBounds(0, height, width, this.f44579b + height);
                    this.f44578a.draw(canvas);
                }
            }
        }

        public final void setDivider(Drawable drawable) {
            if (drawable != null) {
                this.f44579b = drawable.getIntrinsicHeight();
            } else {
                this.f44579b = 0;
            }
            this.f44578a = drawable;
            c.this.f44570c.invalidateItemDecorations();
        }
    }

    public interface d {
        boolean a();
    }

    public interface e {
        boolean a();
    }

    public interface f {
        boolean a();
    }

    @Override // androidx.preference.DialogPreference.a
    public final Preference e(@NonNull String str) {
        g gVar = this.f44569b;
        if (gVar == null) {
            return null;
        }
        return gVar.a(str);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i11 = typedValue.resourceId;
        if (i11 == 0) {
            i11 = R.style.PreferenceThemeOverlay;
        }
        getActivity().getTheme().applyStyle(i11, false);
        g gVar = new g(getContext());
        this.f44569b = gVar;
        gVar.k(this);
        v(getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, G4.f.f9707h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f44573f = obtainStyledAttributes.getResourceId(0, this.f44573f);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z11 = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(getContext());
        View inflate = cloneInContext.inflate(this.f44573f, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        if (!getContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setAccessibilityDelegateCompat(new G4.e(recyclerView));
        }
        this.f44570c = recyclerView;
        C0813c c0813c = this.f44568a;
        recyclerView.addItemDecoration(c0813c);
        c0813c.setDivider(drawable);
        if (dimensionPixelSize != -1) {
            c0813c.b(dimensionPixelSize);
        }
        c0813c.a(z11);
        if (this.f44570c.getParent() == null) {
            viewGroup2.addView(this.f44570c);
        }
        this.f44574g.post(this.f44575h);
        return inflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        Handler handler = this.f44574g;
        handler.removeCallbacks(this.f44575h);
        handler.removeMessages(1);
        if (this.f44571d) {
            this.f44570c.setAdapter(null);
            PreferenceScreen g10 = this.f44569b.g();
            if (g10 != null) {
                g10.K();
            }
        }
        this.f44570c = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen g10 = this.f44569b.g();
        if (g10 != null) {
            Bundle bundle2 = new Bundle();
            g10.d(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        super.onStart();
        this.f44569b.l(this);
        this.f44569b.j(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        this.f44569b.l(null);
        this.f44569b.j(null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen g10;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (g10 = this.f44569b.g()) != null) {
            g10.c(bundle2);
        }
        if (this.f44571d) {
            t();
        }
        this.f44572e = true;
    }

    final void t() {
        PreferenceScreen g10 = this.f44569b.g();
        if (g10 != null) {
            this.f44570c.setAdapter(new androidx.preference.d(g10));
            g10.F();
        }
    }

    public final g u() {
        return this.f44569b;
    }

    public abstract void v(String str);

    public final void w(String str) {
        g gVar = this.f44569b;
        if (gVar == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        PreferenceScreen i11 = gVar.i(getContext());
        Preference preference = i11;
        if (str != null) {
            Preference l02 = i11.l0(str);
            boolean z11 = l02 instanceof PreferenceScreen;
            preference = l02;
            if (!z11) {
                throw new IllegalArgumentException(A0.b("Preference object with key ", str, " is not a PreferenceScreen"));
            }
        }
        PreferenceScreen preferenceScreen = (PreferenceScreen) preference;
        if (!this.f44569b.m(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        this.f44571d = true;
        if (this.f44572e) {
            Handler handler = this.f44574g;
            if (handler.hasMessages(1)) {
                return;
            }
            handler.obtainMessage(1).sendToTarget();
        }
    }
}
