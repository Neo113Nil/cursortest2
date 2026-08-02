package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final a f42233a;

    private static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private final View f42234a;

        a(View view) {
            this.f42234a = view;
        }

        void a() {
            View view = this.f42234a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        void b() {
            View view;
            View view2 = this.f42234a;
            if (view2 == null) {
                return;
            }
            if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
                view2.requestFocus();
                view = view2;
            } else {
                view = view2.getRootView().findFocus();
            }
            if (view == null) {
                view = view2.getRootView().findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new Ec0.b(view, 4));
        }
    }

    private static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private View f42235b;

        b(@NonNull View view) {
            super(view);
            this.f42235b = view;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.core.view.O] */
        @Override // androidx.core.view.I.a
        final void a() {
            int ime;
            View view = this.f42235b;
            WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.O
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i11) {
                    atomicBoolean.set((i11 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r42);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r42);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
        }

        @Override // androidx.core.view.I.a
        final void b() {
            int ime;
            View view = this.f42235b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            }
            super.b();
        }
    }

    private static class c {
    }

    public I(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f42233a = new b(view);
        } else {
            this.f42233a = new a(view);
        }
    }

    public final void a() {
        this.f42233a.a();
    }

    public final void b() {
        this.f42233a.b();
    }
}
