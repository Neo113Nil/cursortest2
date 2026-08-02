package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.app.B;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C5064i;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.i0;
import androidx.collection.Z;
import androidx.core.content.res.g;
import androidx.core.view.C5326k0;
import androidx.core.view.C5330m0;
import androidx.core.view.C5337q;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i.C6977a;
import j.C7232a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
final class l extends androidx.appcompat.app.j implements g.a, LayoutInflater.Factory2 {

    /* renamed from: E0, reason: collision with root package name */
    private static final Z<String, Integer> f37139E0 = new Z<>();

    /* renamed from: F0, reason: collision with root package name */
    private static final int[] f37140F0 = {R.attr.windowBackground};

    /* renamed from: G0, reason: collision with root package name */
    private static final boolean f37141G0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    private boolean f37142A;

    /* renamed from: A0, reason: collision with root package name */
    private Rect f37143A0;

    /* renamed from: B, reason: collision with root package name */
    private boolean f37144B;

    /* renamed from: B0, reason: collision with root package name */
    private y f37145B0;

    /* renamed from: C, reason: collision with root package name */
    ViewGroup f37146C;

    /* renamed from: C0, reason: collision with root package name */
    private OnBackInvokedDispatcher f37147C0;

    /* renamed from: D, reason: collision with root package name */
    private TextView f37148D;

    /* renamed from: D0, reason: collision with root package name */
    private OnBackInvokedCallback f37149D0;

    /* renamed from: E, reason: collision with root package name */
    private View f37150E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f37151F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f37152G;

    /* renamed from: H, reason: collision with root package name */
    boolean f37153H;

    /* renamed from: I, reason: collision with root package name */
    boolean f37154I;

    /* renamed from: J, reason: collision with root package name */
    boolean f37155J;

    /* renamed from: K, reason: collision with root package name */
    boolean f37156K;

    /* renamed from: L, reason: collision with root package name */
    boolean f37157L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f37158M;

    /* renamed from: N, reason: collision with root package name */
    private n[] f37159N;

    /* renamed from: O, reason: collision with root package name */
    private n f37160O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f37161P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f37162Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f37163R;

    /* renamed from: S, reason: collision with root package name */
    boolean f37164S;

    /* renamed from: X, reason: collision with root package name */
    private Configuration f37165X;

    /* renamed from: Y, reason: collision with root package name */
    private int f37166Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f37167Z;

    /* renamed from: k, reason: collision with root package name */
    final Object f37168k;

    /* renamed from: l, reason: collision with root package name */
    final Context f37169l;

    /* renamed from: m, reason: collision with root package name */
    Window f37170m;

    /* renamed from: n, reason: collision with root package name */
    private i f37171n;

    /* renamed from: o, reason: collision with root package name */
    final androidx.appcompat.app.h f37172o;

    /* renamed from: p, reason: collision with root package name */
    AbstractC5051a f37173p;

    /* renamed from: q, reason: collision with root package name */
    androidx.appcompat.view.g f37174q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f37175r;

    /* renamed from: r0, reason: collision with root package name */
    private int f37176r0;

    /* renamed from: s, reason: collision with root package name */
    private androidx.appcompat.widget.E f37177s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f37178s0;

    /* renamed from: t, reason: collision with root package name */
    private c f37179t;

    /* renamed from: t0, reason: collision with root package name */
    private C0713l f37180t0;

    /* renamed from: u, reason: collision with root package name */
    private o f37181u;

    /* renamed from: u0, reason: collision with root package name */
    private j f37182u0;

    /* renamed from: v, reason: collision with root package name */
    androidx.appcompat.view.b f37183v;

    /* renamed from: v0, reason: collision with root package name */
    boolean f37184v0;

    /* renamed from: w, reason: collision with root package name */
    ActionBarContextView f37185w;

    /* renamed from: w0, reason: collision with root package name */
    int f37186w0;

    /* renamed from: x, reason: collision with root package name */
    PopupWindow f37187x;

    /* renamed from: x0, reason: collision with root package name */
    private final Runnable f37188x0;

    /* renamed from: y, reason: collision with root package name */
    Runnable f37189y;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f37190y0;

    /* renamed from: z, reason: collision with root package name */
    C5326k0 f37191z;

    /* renamed from: z0, reason: collision with root package name */
    private Rect f37192z0;

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l lVar = l.this;
            if ((lVar.f37186w0 & 1) != 0) {
                lVar.b0(0);
            }
            if ((lVar.f37186w0 & 4096) != 0) {
                lVar.b0(108);
            }
            lVar.f37184v0 = false;
            lVar.f37186w0 = 0;
        }
    }

    /* loaded from: classes8.dex */
    private class b implements InterfaceC5052b {
        b() {
        }
    }

    /* loaded from: classes8.dex */
    private final class c implements m.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final void b(@NonNull androidx.appcompat.view.menu.g gVar, boolean z11) {
            l.this.W(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final boolean c(@NonNull androidx.appcompat.view.menu.g gVar) {
            Window.Callback callback = l.this.f37170m.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* loaded from: classes8.dex */
    class d implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f37195a;

        final class a extends C5330m0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC5328l0
            public final void onAnimationEnd() {
                d dVar = d.this;
                l.this.f37185w.setVisibility(8);
                l lVar = l.this;
                PopupWindow popupWindow = lVar.f37187x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (lVar.f37185w.getParent() instanceof View) {
                    Y.A((View) lVar.f37185w.getParent());
                }
                lVar.f37185w.l();
                lVar.f37191z.f(null);
                lVar.f37191z = null;
                Y.A(lVar.f37146C);
            }
        }

        public d(b.a aVar) {
            this.f37195a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public final boolean a(androidx.appcompat.view.b bVar, androidx.appcompat.view.menu.g gVar) {
            return this.f37195a.a(bVar, gVar);
        }

        @Override // androidx.appcompat.view.b.a
        public final boolean b(androidx.appcompat.view.b bVar, androidx.appcompat.view.menu.i iVar) {
            return this.f37195a.b(bVar, iVar);
        }

        @Override // androidx.appcompat.view.b.a
        public final void c(androidx.appcompat.view.b bVar) {
            this.f37195a.c(bVar);
            l lVar = l.this;
            if (lVar.f37187x != null) {
                lVar.f37170m.getDecorView().removeCallbacks(lVar.f37189y);
            }
            if (lVar.f37185w != null) {
                C5326k0 c5326k0 = lVar.f37191z;
                if (c5326k0 != null) {
                    c5326k0.b();
                }
                C5326k0 b11 = Y.b(lVar.f37185w);
                b11.a(0.0f);
                lVar.f37191z = b11;
                b11.f(new a());
            }
            androidx.appcompat.app.h hVar = lVar.f37172o;
            if (hVar != null) {
                hVar.onSupportActionModeFinished(lVar.f37183v);
            }
            lVar.f37183v = null;
            Y.A(lVar.f37146C);
            lVar.t0();
        }

        @Override // androidx.appcompat.view.b.a
        public final boolean d(androidx.appcompat.view.b bVar, androidx.appcompat.view.menu.g gVar) {
            Y.A(l.this.f37146C);
            return this.f37195a.d(bVar, gVar);
        }
    }

    /* loaded from: classes8.dex */
    static class e {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class f {
        static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static androidx.core.os.i b(Configuration configuration) {
            return androidx.core.os.i.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(androidx.core.os.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.h()));
        }

        static void d(Configuration configuration, androidx.core.os.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.h()));
        }
    }

    /* loaded from: classes8.dex */
    static class g {
        static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            int i11 = configuration.colorMode & 3;
            int i12 = configuration2.colorMode & 3;
            if (i11 != i12) {
                configuration3.colorMode |= i12;
            }
            int i13 = configuration.colorMode & 12;
            int i14 = configuration2.colorMode & 12;
            if (i13 != i14) {
                configuration3.colorMode |= i14;
            }
        }
    }

    /* loaded from: classes8.dex */
    static class h {
        static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, androidx.appcompat.app.u] */
        static OnBackInvokedCallback b(Object obj, final l lVar) {
            Objects.requireNonNull(lVar);
            ?? r02 = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.u
                public final void onBackInvoked() {
                    l.this.k0();
                }
            };
            r.a(obj).registerOnBackInvokedCallback(1000000, r02);
            return r02;
        }

        static void c(Object obj, Object obj2) {
            r.a(obj).unregisterOnBackInvokedCallback(q.a(obj2));
        }
    }

    class i extends androidx.appcompat.view.i {

        /* renamed from: b, reason: collision with root package name */
        private B.e f37198b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f37199c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f37200d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f37201e;

        i(Window.Callback callback) {
            super(callback);
        }

        public final boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f37200d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f37200d = false;
            }
        }

        public final void c(Window.Callback callback) {
            try {
                this.f37199c = true;
                callback.onContentChanged();
            } finally {
                this.f37199c = false;
            }
        }

        public final void d(Window.Callback callback, int i11, androidx.appcompat.view.menu.g gVar) {
            try {
                this.f37201e = true;
                callback.onPanelClosed(i11, gVar);
            } finally {
                this.f37201e = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f37200d ? a().dispatchKeyEvent(keyEvent) : l.this.a0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (super.dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
            return l.this.l0(keyEvent.getKeyCode(), keyEvent);
        }

        final void e(B.e eVar) {
            this.f37198b = eVar;
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f37199c) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i11, Menu menu) {
            if (i11 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i11, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public final View onCreatePanelView(int i11) {
            View a11;
            B.e eVar = this.f37198b;
            return (eVar == null || (a11 = eVar.a(i11)) == null) ? super.onCreatePanelView(i11) : a11;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public final boolean onMenuOpened(int i11, Menu menu) {
            super.onMenuOpened(i11, menu);
            l.this.m0(i11);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public final void onPanelClosed(int i11, Menu menu) {
            if (this.f37201e) {
                a().onPanelClosed(i11, menu);
            } else {
                super.onPanelClosed(i11, menu);
                l.this.n0(i11);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public final boolean onPreparePanel(int i11, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i11 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.O(true);
            }
            B.e eVar = this.f37198b;
            if (eVar != null) {
                eVar.b(i11);
            }
            boolean onPreparePanel = super.onPreparePanel(i11, view, menu);
            if (gVar != null) {
                gVar.O(false);
            }
            return onPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i11) {
            androidx.appcompat.view.menu.g gVar = l.this.f0(0).f37218h;
            if (gVar != null) {
                super.onProvideKeyboardShortcuts(list, gVar, i11);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i11);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i11) {
            l lVar = l.this;
            if (!lVar.i0() || i11 != 0) {
                return super.onWindowStartingActionMode(callback, i11);
            }
            f.a aVar = new f.a(lVar.f37169l, callback);
            androidx.appcompat.view.b Q11 = lVar.Q(aVar);
            if (Q11 != null) {
                return aVar.e(Q11);
            }
            return null;
        }
    }

    /* loaded from: classes8.dex */
    private class j extends k {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f37203c;

        j(@NonNull Context context) {
            super();
            this.f37203c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.l.k
        final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.l.k
        public final void c() {
            l.this.g();
        }

        public final int e() {
            return e.a(this.f37203c) ? 2 : 1;
        }
    }

    /* loaded from: classes8.dex */
    abstract class k {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f37205a;

        final class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                k.this.c();
            }
        }

        k() {
        }

        final void a() {
            BroadcastReceiver broadcastReceiver = this.f37205a;
            if (broadcastReceiver != null) {
                try {
                    l.this.f37169l.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f37205a = null;
            }
        }

        abstract IntentFilter b();

        abstract void c();

        final void d() {
            a();
            IntentFilter b11 = b();
            if (b11.countActions() == 0) {
                return;
            }
            if (this.f37205a == null) {
                this.f37205a = new a();
            }
            l.this.f37169l.registerReceiver(this.f37205a, b11);
        }
    }

    /* renamed from: androidx.appcompat.app.l$l, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    private class C0713l extends k {

        /* renamed from: c, reason: collision with root package name */
        private final D f37208c;

        C0713l(@NonNull D d11) {
            super();
            this.f37208c = d11;
        }

        @Override // androidx.appcompat.app.l.k
        final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.l.k
        public final void c() {
            l.this.g();
        }

        public final int e() {
            return this.f37208c.b() ? 2 : 1;
        }
    }

    /* loaded from: classes8.dex */
    private class m extends ContentFrameLayout {
        public m(androidx.appcompat.view.d dVar) {
            super(dVar, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return l.this.a0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x11 = (int) motionEvent.getX();
                int y11 = (int) motionEvent.getY();
                if (x11 < -5 || y11 < -5 || x11 > getWidth() + 5 || y11 > getHeight() + 5) {
                    l lVar = l.this;
                    lVar.X(lVar.f0(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i11) {
            setBackgroundDrawable(C7232a.a(getContext(), i11));
        }
    }

    protected static final class n {

        /* renamed from: a, reason: collision with root package name */
        int f37211a;

        /* renamed from: b, reason: collision with root package name */
        int f37212b;

        /* renamed from: c, reason: collision with root package name */
        int f37213c;

        /* renamed from: d, reason: collision with root package name */
        int f37214d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f37215e;

        /* renamed from: f, reason: collision with root package name */
        View f37216f;

        /* renamed from: g, reason: collision with root package name */
        View f37217g;

        /* renamed from: h, reason: collision with root package name */
        androidx.appcompat.view.menu.g f37218h;

        /* renamed from: i, reason: collision with root package name */
        androidx.appcompat.view.menu.e f37219i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.d f37220j;

        /* renamed from: k, reason: collision with root package name */
        boolean f37221k;

        /* renamed from: l, reason: collision with root package name */
        boolean f37222l;

        /* renamed from: m, reason: collision with root package name */
        boolean f37223m;

        /* renamed from: n, reason: collision with root package name */
        boolean f37224n;

        /* renamed from: o, reason: collision with root package name */
        boolean f37225o;

        /* renamed from: p, reason: collision with root package name */
        Bundle f37226p;
    }

    /* loaded from: classes8.dex */
    private final class o implements m.a {
        o() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final void b(@NonNull androidx.appcompat.view.menu.g gVar, boolean z11) {
            androidx.appcompat.view.menu.g q11 = gVar.q();
            boolean z12 = q11 != gVar;
            if (z12) {
                gVar = q11;
            }
            l lVar = l.this;
            n e02 = lVar.e0(gVar);
            if (e02 != null) {
                if (!z12) {
                    lVar.X(e02, z11);
                } else {
                    lVar.V(e02.f37211a, e02, q11);
                    lVar.X(e02, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final boolean c(@NonNull androidx.appcompat.view.menu.g gVar) {
            Window.Callback callback;
            if (gVar != gVar.q()) {
                return true;
            }
            l lVar = l.this;
            if (!lVar.f37153H || (callback = lVar.f37170m.getCallback()) == null || lVar.f37164S) {
                return true;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    l(androidx.appcompat.app.g gVar, androidx.appcompat.app.g gVar2) {
        this(gVar, null, gVar2, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean S(boolean z11, boolean z12) {
        int i11;
        Configuration configuration;
        androidx.core.os.i b11;
        int i12;
        boolean z13;
        Activity activity;
        if (this.f37164S) {
            return false;
        }
        int i13 = this.f37166Y;
        if (i13 == -100) {
            i13 = androidx.appcompat.app.j.m();
        }
        int i14 = i13;
        Context context = this.f37169l;
        int j02 = j0(i14, context);
        int i15 = Build.VERSION.SDK_INT;
        androidx.core.os.i U10 = i15 < 33 ? U(context) : null;
        if (!z12 && U10 != null) {
            U10 = f.b(context.getResources().getConfiguration());
        }
        Configuration Y11 = Y(context, j02, U10, null, false);
        boolean z14 = this.f37178s0;
        Object obj = this.f37168k;
        boolean z15 = true;
        if (!z14 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i11 = 0;
                configuration = this.f37165X;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i16 = configuration.uiMode & 48;
                int i17 = Y11.uiMode & 48;
                androidx.core.os.i b12 = f.b(configuration);
                b11 = U10 != null ? null : f.b(Y11);
                i12 = i16 == i17 ? UserVerificationMethods.USER_VERIFY_NONE : 0;
                if (b11 != null && !b12.equals(b11)) {
                    i12 |= 8196;
                }
                if (((~i11) & i12) != 0 && z11 && this.f37162Q && ((f37141G0 || this.f37163R) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        if (Build.VERSION.SDK_INT >= 31 && (i12 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(Y11.getLayoutDirection());
                        }
                        androidx.core.app.b.d(activity);
                        z13 = true;
                        if (!z13 || i12 == 0) {
                            z15 = z13;
                        } else {
                            boolean z16 = (i11 & i12) == i12;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i17;
                            if (b11 != null) {
                                f.d(configuration2, b11);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i18 = this.f37167Z;
                            if (i18 != 0) {
                                context.setTheme(i18);
                                context.getTheme().applyStyle(this.f37167Z, true);
                            }
                            if (z16 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof J) {
                                    if (((J) activity2).getLifecycle().b().a(AbstractC5434v.b.CREATED)) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f37163R && !this.f37164S) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z15 && (obj instanceof androidx.appcompat.app.g)) {
                            if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                ((androidx.appcompat.app.g) obj).onNightModeChanged(j02);
                            }
                            if ((i12 & 4) != 0) {
                                ((androidx.appcompat.app.g) obj).onLocalesChanged(U10);
                            }
                        }
                        if (b11 != null) {
                            f.c(f.b(context.getResources().getConfiguration()));
                        }
                        if (i14 == 0) {
                            if (this.f37180t0 == null) {
                                this.f37180t0 = new C0713l(D.a(context));
                            }
                            this.f37180t0.d();
                        } else {
                            C0713l c0713l = this.f37180t0;
                            if (c0713l != null) {
                                c0713l.a();
                            }
                        }
                        if (i14 == 3) {
                            if (this.f37182u0 == null) {
                                this.f37182u0 = new j(context);
                            }
                            this.f37182u0.d();
                        } else {
                            j jVar = this.f37182u0;
                            if (jVar != null) {
                                jVar.a();
                            }
                        }
                        return z15;
                    }
                }
                z13 = false;
                if (z13) {
                }
                z15 = z13;
                if (z15) {
                    if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    }
                    if ((i12 & 4) != 0) {
                    }
                }
                if (b11 != null) {
                }
                if (i14 == 0) {
                }
                if (i14 == 3) {
                }
                return z15;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i15 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f37176r0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e11) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e11);
                this.f37176r0 = 0;
            }
        }
        this.f37178s0 = true;
        i11 = this.f37176r0;
        configuration = this.f37165X;
        if (configuration == null) {
        }
        int i162 = configuration.uiMode & 48;
        int i172 = Y11.uiMode & 48;
        androidx.core.os.i b122 = f.b(configuration);
        if (U10 != null) {
        }
        if (i162 == i172) {
        }
        if (b11 != null) {
            i12 |= 8196;
        }
        if (((~i11) & i12) != 0) {
            activity = (Activity) obj;
            if (!activity.isChild()) {
            }
        }
        z13 = false;
        if (z13) {
        }
        z15 = z13;
        if (z15) {
        }
        if (b11 != null) {
        }
        if (i14 == 0) {
        }
        if (i14 == 3) {
        }
        return z15;
    }

    private void T(@NonNull Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f37170m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof i) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        i iVar = new i(callback);
        this.f37171n = iVar;
        window.setCallback(iVar);
        b0 u11 = b0.u(this.f37169l, null, f37140F0);
        Drawable h11 = u11.h(0);
        if (h11 != null) {
            window.setBackgroundDrawable(h11);
        }
        u11.x();
        this.f37170m = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f37147C0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f37149D0) != null) {
            h.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f37149D0 = null;
        }
        Object obj = this.f37168k;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f37147C0 = h.a(activity);
                t0();
            }
        }
        this.f37147C0 = null;
        t0();
    }

    static androidx.core.os.i U(@NonNull Context context) {
        androidx.core.os.i r11;
        if (Build.VERSION.SDK_INT >= 33 || (r11 = androidx.appcompat.app.j.r()) == null) {
            return null;
        }
        androidx.core.os.i b11 = f.b(context.getApplicationContext().getResources().getConfiguration());
        androidx.core.os.i a11 = A.a(r11, b11);
        return a11.f() ? b11 : a11;
    }

    @NonNull
    private static Configuration Y(@NonNull Context context, int i11, androidx.core.os.i iVar, Configuration configuration, boolean z11) {
        int i12 = i11 != 1 ? i11 != 2 ? z11 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i12 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            f.d(configuration2, iVar);
        }
        return configuration2;
    }

    private void c0() {
        ViewGroup viewGroup;
        if (this.f37144B) {
            return;
        }
        int[] iArr = C6977a.f65656j;
        Context context = this.f37169l;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            G(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            G(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            G(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            G(10);
        }
        this.f37156K = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        d0();
        this.f37170m.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f37157L) {
            viewGroup = this.f37155J ? (ViewGroup) from.inflate(ru.ozon.app.android.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(ru.ozon.app.android.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f37156K) {
            viewGroup = (ViewGroup) from.inflate(ru.ozon.app.android.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f37154I = false;
            this.f37153H = false;
        } else if (this.f37153H) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ru.ozon.app.android.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(context, typedValue.resourceId) : context).inflate(ru.ozon.app.android.R.layout.abc_screen_toolbar, (ViewGroup) null);
            androidx.appcompat.widget.E e11 = (androidx.appcompat.widget.E) viewGroup.findViewById(ru.ozon.app.android.R.id.decor_content_parent);
            this.f37177s = e11;
            e11.d(this.f37170m.getCallback());
            if (this.f37154I) {
                this.f37177s.j(109);
            }
            if (this.f37151F) {
                this.f37177s.j(2);
            }
            if (this.f37152G) {
                this.f37177s.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb2.append(this.f37153H);
            sb2.append(", windowActionBarOverlay: ");
            sb2.append(this.f37154I);
            sb2.append(", android:windowIsFloating: ");
            sb2.append(this.f37156K);
            sb2.append(", windowActionModeOverlay: ");
            sb2.append(this.f37155J);
            sb2.append(", windowNoTitle: ");
            throw new IllegalArgumentException(Pk0.a.a(" }", sb2, this.f37157L));
        }
        Y.J(viewGroup, new androidx.appcompat.app.m(this));
        if (this.f37177s == null) {
            this.f37148D = (TextView) viewGroup.findViewById(ru.ozon.app.android.R.id.title);
        }
        int i11 = i0.f37951d;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e12) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e12);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e13) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e13);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ru.ozon.app.android.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f37170m.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f37170m.setContentView(viewGroup);
        contentFrameLayout.g(new androidx.appcompat.app.n(this));
        this.f37146C = viewGroup;
        Object obj = this.f37168k;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f37175r;
        if (!TextUtils.isEmpty(title)) {
            androidx.appcompat.widget.E e14 = this.f37177s;
            if (e14 != null) {
                e14.g(title);
            } else {
                AbstractC5051a abstractC5051a = this.f37173p;
                if (abstractC5051a != null) {
                    abstractC5051a.t(title);
                } else {
                    TextView textView = this.f37148D;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f37146C.findViewById(R.id.content);
        View decorView = this.f37170m.getDecorView();
        contentFrameLayout2.h(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.e());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.f());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.c());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.d());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.a());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.b());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f37144B = true;
        n f02 = f0(0);
        if (this.f37164S || f02.f37218h != null) {
            return;
        }
        h0(108);
    }

    private void d0() {
        if (this.f37170m == null) {
            Object obj = this.f37168k;
            if (obj instanceof Activity) {
                T(((Activity) obj).getWindow());
            }
        }
        if (this.f37170m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private void g0() {
        c0();
        if (this.f37153H && this.f37173p == null) {
            Object obj = this.f37168k;
            if (obj instanceof Activity) {
                this.f37173p = new E((Activity) obj, this.f37154I);
            } else if (obj instanceof Dialog) {
                this.f37173p = new E((Dialog) obj);
            }
            AbstractC5051a abstractC5051a = this.f37173p;
            if (abstractC5051a != null) {
                abstractC5051a.l(this.f37190y0);
            }
        }
    }

    private void h0(int i11) {
        this.f37186w0 = (1 << i11) | this.f37186w0;
        if (this.f37184v0) {
            return;
        }
        View decorView = this.f37170m.getDecorView();
        Runnable runnable = this.f37188x0;
        int i12 = Y.f42258g;
        decorView.postOnAnimation(runnable);
        this.f37184v0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0132, code lost:
    
        if (r3 != null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void o0(n nVar, KeyEvent keyEvent) {
        int i11;
        ViewGroup.LayoutParams layoutParams;
        if (nVar.f37223m || this.f37164S) {
            return;
        }
        int i12 = nVar.f37211a;
        Context context = this.f37169l;
        if (i12 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f37170m.getCallback();
        if (callback != null && !callback.onMenuOpened(i12, nVar.f37218h)) {
            X(nVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !q0(nVar, keyEvent)) {
            return;
        }
        ViewGroup viewGroup = nVar.f37215e;
        if (viewGroup == null || nVar.f37224n) {
            if (viewGroup == null) {
                g0();
                AbstractC5051a abstractC5051a = this.f37173p;
                Context e11 = abstractC5051a != null ? abstractC5051a.e() : null;
                if (e11 != null) {
                    context = e11;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(ru.ozon.app.android.R.attr.actionBarPopupTheme, typedValue, true);
                int i13 = typedValue.resourceId;
                if (i13 != 0) {
                    newTheme.applyStyle(i13, true);
                }
                newTheme.resolveAttribute(ru.ozon.app.android.R.attr.panelMenuListTheme, typedValue, true);
                int i14 = typedValue.resourceId;
                if (i14 != 0) {
                    newTheme.applyStyle(i14, true);
                } else {
                    newTheme.applyStyle(ru.ozon.app.android.R.style.Theme_AppCompat_CompactMenu, true);
                }
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(newTheme);
                nVar.f37220j = dVar;
                TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C6977a.f65656j);
                nVar.f37212b = obtainStyledAttributes.getResourceId(86, 0);
                nVar.f37214d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                nVar.f37215e = new m(nVar.f37220j);
                nVar.f37213c = 81;
            } else if (nVar.f37224n && viewGroup.getChildCount() > 0) {
                nVar.f37215e.removeAllViews();
            }
            View view = nVar.f37217g;
            if (view == null) {
                if (nVar.f37218h != null) {
                    if (this.f37181u == null) {
                        this.f37181u = new o();
                    }
                    o oVar = this.f37181u;
                    if (nVar.f37219i == null) {
                        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(nVar.f37220j);
                        nVar.f37219i = eVar;
                        eVar.i(oVar);
                        nVar.f37218h.b(nVar.f37219i);
                    }
                    View view2 = (View) nVar.f37219i.h(nVar.f37215e);
                    nVar.f37216f = view2;
                }
                nVar.f37224n = true;
                return;
            }
            nVar.f37216f = view;
            if (nVar.f37216f != null && (nVar.f37217g != null || nVar.f37219i.a().getCount() > 0)) {
                ViewGroup.LayoutParams layoutParams2 = nVar.f37216f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                nVar.f37215e.setBackgroundResource(nVar.f37212b);
                ViewParent parent = nVar.f37216f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(nVar.f37216f);
                }
                nVar.f37215e.addView(nVar.f37216f, layoutParams2);
                if (!nVar.f37216f.hasFocus()) {
                    nVar.f37216f.requestFocus();
                }
            }
            nVar.f37224n = true;
            return;
        }
        View view3 = nVar.f37217g;
        if (view3 != null && (layoutParams = view3.getLayoutParams()) != null && layoutParams.width == -1) {
            i11 = -1;
            nVar.f37222l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i11, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = nVar.f37213c;
            layoutParams3.windowAnimations = nVar.f37214d;
            windowManager.addView(nVar.f37215e, layoutParams3);
            nVar.f37223m = true;
            if (i12 != 0) {
                t0();
                return;
            }
            return;
        }
        i11 = -2;
        nVar.f37222l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i11, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = nVar.f37213c;
        layoutParams32.windowAnimations = nVar.f37214d;
        windowManager.addView(nVar.f37215e, layoutParams32);
        nVar.f37223m = true;
        if (i12 != 0) {
        }
    }

    private boolean p0(n nVar, int i11, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.g gVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((nVar.f37221k || q0(nVar, keyEvent)) && (gVar = nVar.f37218h) != null) {
            return gVar.performShortcut(i11, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cc, code lost:
    
        if (r13.f37218h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean q0(n nVar, KeyEvent keyEvent) {
        androidx.appcompat.widget.E e11;
        androidx.appcompat.widget.E e12;
        Resources.Theme theme;
        androidx.appcompat.widget.E e13;
        androidx.appcompat.widget.E e14;
        if (!this.f37164S) {
            if (nVar.f37221k) {
                return true;
            }
            n nVar2 = this.f37160O;
            if (nVar2 != null && nVar2 != nVar) {
                X(nVar2, false);
            }
            Window.Callback callback = this.f37170m.getCallback();
            int i11 = nVar.f37211a;
            if (callback != null) {
                nVar.f37217g = callback.onCreatePanelView(i11);
            }
            boolean z11 = i11 == 0 || i11 == 108;
            if (z11 && (e14 = this.f37177s) != null) {
                e14.h();
            }
            if (nVar.f37217g == null && (!z11 || !(this.f37173p instanceof B))) {
                androidx.appcompat.view.menu.g gVar = nVar.f37218h;
                if (gVar == null || nVar.f37225o) {
                    if (gVar == null) {
                        Context context = this.f37169l;
                        if ((i11 == 0 || i11 == 108) && this.f37177s != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(ru.ozon.app.android.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(ru.ozon.app.android.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(ru.ozon.app.android.R.attr.actionBarWidgetTheme, typedValue, true);
                                theme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (theme == null) {
                                    theme = context.getResources().newTheme();
                                    theme.setTo(theme2);
                                }
                                theme.applyStyle(typedValue.resourceId, true);
                            }
                            if (theme != null) {
                                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                                dVar.getTheme().setTo(theme);
                                context = dVar;
                            }
                        }
                        androidx.appcompat.view.menu.g gVar2 = new androidx.appcompat.view.menu.g(context);
                        gVar2.F(this);
                        androidx.appcompat.view.menu.g gVar3 = nVar.f37218h;
                        if (gVar2 != gVar3) {
                            if (gVar3 != null) {
                                gVar3.A(nVar.f37219i);
                            }
                            nVar.f37218h = gVar2;
                            androidx.appcompat.view.menu.e eVar = nVar.f37219i;
                            if (eVar != null) {
                                gVar2.b(eVar);
                            }
                        }
                    }
                    if (z11 && (e12 = this.f37177s) != null) {
                        if (this.f37179t == null) {
                            this.f37179t = new c();
                        }
                        e12.e(nVar.f37218h, this.f37179t);
                    }
                    nVar.f37218h.Q();
                    if (callback.onCreatePanelMenu(i11, nVar.f37218h)) {
                        nVar.f37225o = false;
                    } else {
                        androidx.appcompat.view.menu.g gVar4 = nVar.f37218h;
                        if (gVar4 != null) {
                            if (gVar4 != null) {
                                gVar4.A(nVar.f37219i);
                            }
                            nVar.f37218h = null;
                        }
                        if (z11 && (e11 = this.f37177s) != null) {
                            e11.e(null, this.f37179t);
                        }
                    }
                }
                nVar.f37218h.Q();
                Bundle bundle = nVar.f37226p;
                if (bundle != null) {
                    nVar.f37218h.B(bundle);
                    nVar.f37226p = null;
                }
                if (!callback.onPreparePanel(0, nVar.f37217g, nVar.f37218h)) {
                    if (z11 && (e13 = this.f37177s) != null) {
                        e13.e(null, this.f37179t);
                    }
                    nVar.f37218h.P();
                    return false;
                }
                nVar.f37218h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                nVar.f37218h.P();
            }
            nVar.f37221k = true;
            nVar.f37222l = false;
            this.f37160O = nVar;
            return true;
        }
        return false;
    }

    private void s0() {
        if (this.f37144B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.app.j
    public final void A() {
        c0();
    }

    @Override // androidx.appcompat.app.j
    public final void B() {
        g0();
        AbstractC5051a abstractC5051a = this.f37173p;
        if (abstractC5051a != null) {
            abstractC5051a.r(true);
        }
    }

    @Override // androidx.appcompat.app.j
    public final void C() {
        S(true, false);
    }

    @Override // androidx.appcompat.app.j
    public final void D() {
        g0();
        AbstractC5051a abstractC5051a = this.f37173p;
        if (abstractC5051a != null) {
            abstractC5051a.r(false);
        }
    }

    @Override // androidx.appcompat.app.j
    public final boolean G(int i11) {
        if (i11 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i11 = 108;
        } else if (i11 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i11 = 109;
        }
        if (this.f37157L && i11 == 108) {
            return false;
        }
        if (this.f37153H && i11 == 1) {
            this.f37153H = false;
        }
        if (i11 == 1) {
            s0();
            this.f37157L = true;
            return true;
        }
        if (i11 == 2) {
            s0();
            this.f37151F = true;
            return true;
        }
        if (i11 == 5) {
            s0();
            this.f37152G = true;
            return true;
        }
        if (i11 == 10) {
            s0();
            this.f37155J = true;
            return true;
        }
        if (i11 == 108) {
            s0();
            this.f37153H = true;
            return true;
        }
        if (i11 != 109) {
            return this.f37170m.requestFeature(i11);
        }
        s0();
        this.f37154I = true;
        return true;
    }

    @Override // androidx.appcompat.app.j
    public final void I(int i11) {
        c0();
        ViewGroup viewGroup = (ViewGroup) this.f37146C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f37169l).inflate(i11, viewGroup);
        this.f37171n.c(this.f37170m.getCallback());
    }

    @Override // androidx.appcompat.app.j
    public final void J(View view) {
        c0();
        ViewGroup viewGroup = (ViewGroup) this.f37146C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f37171n.c(this.f37170m.getCallback());
    }

    @Override // androidx.appcompat.app.j
    public final void K(View view, ViewGroup.LayoutParams layoutParams) {
        c0();
        ViewGroup viewGroup = (ViewGroup) this.f37146C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f37171n.c(this.f37170m.getCallback());
    }

    @Override // androidx.appcompat.app.j
    public final void M(int i11) {
        if (this.f37166Y != i11) {
            this.f37166Y = i11;
            if (this.f37162Q) {
                S(true, true);
            }
        }
    }

    @Override // androidx.appcompat.app.j
    public final void N(Toolbar toolbar) {
        Object obj = this.f37168k;
        if (obj instanceof Activity) {
            g0();
            AbstractC5051a abstractC5051a = this.f37173p;
            if (abstractC5051a instanceof E) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f37174q = null;
            if (abstractC5051a != null) {
                abstractC5051a.h();
            }
            this.f37173p = null;
            if (toolbar != null) {
                B b11 = new B(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f37175r, this.f37171n);
                this.f37173p = b11;
                this.f37171n.e(b11.f37053c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f37171n.e(null);
            }
            v();
        }
    }

    @Override // androidx.appcompat.app.j
    public final void O(int i11) {
        this.f37167Z = i11;
    }

    @Override // androidx.appcompat.app.j
    public final void P(CharSequence charSequence) {
        this.f37175r = charSequence;
        androidx.appcompat.widget.E e11 = this.f37177s;
        if (e11 != null) {
            e11.g(charSequence);
            return;
        }
        AbstractC5051a abstractC5051a = this.f37173p;
        if (abstractC5051a != null) {
            abstractC5051a.t(charSequence);
            return;
        }
        TextView textView = this.f37148D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    @Override // androidx.appcompat.app.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.appcompat.view.b Q(@NonNull b.a aVar) {
        androidx.appcompat.view.b bVar;
        androidx.appcompat.view.b bVar2;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar3 = this.f37183v;
        if (bVar3 != null) {
            bVar3.c();
        }
        d dVar = new d(aVar);
        g0();
        AbstractC5051a abstractC5051a = this.f37173p;
        androidx.appcompat.app.h hVar = this.f37172o;
        if (abstractC5051a != null) {
            androidx.appcompat.view.b u11 = abstractC5051a.u(dVar);
            this.f37183v = u11;
            if (u11 != null && hVar != null) {
                hVar.onSupportActionModeStarted(u11);
            }
        }
        if (this.f37183v == null) {
            C5326k0 c5326k0 = this.f37191z;
            if (c5326k0 != null) {
                c5326k0.b();
            }
            androidx.appcompat.view.b bVar4 = this.f37183v;
            if (bVar4 != null) {
                bVar4.c();
            }
            if (hVar != null && !this.f37164S) {
                try {
                    bVar = hVar.onWindowStartingSupportActionMode(dVar);
                } catch (AbstractMethodError unused) {
                }
                if (bVar == null) {
                    this.f37183v = bVar;
                } else {
                    if (this.f37185w == null) {
                        boolean z11 = this.f37156K;
                        Context context = this.f37169l;
                        if (z11) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(ru.ozon.app.android.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                androidx.appcompat.view.d dVar2 = new androidx.appcompat.view.d(context, 0);
                                dVar2.getTheme().setTo(newTheme);
                                context = dVar2;
                            }
                            this.f37185w = new ActionBarContextView(context);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, ru.ozon.app.android.R.attr.actionModePopupWindowStyle);
                            this.f37187x = popupWindow;
                            androidx.core.widget.j.b(popupWindow, 2);
                            this.f37187x.setContentView(this.f37185w);
                            this.f37187x.setWidth(-1);
                            context.getTheme().resolveAttribute(ru.ozon.app.android.R.attr.actionBarSize, typedValue, true);
                            this.f37185w.e(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.f37187x.setHeight(-2);
                            this.f37189y = new androidx.appcompat.app.o(this);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.f37146C.findViewById(ru.ozon.app.android.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                g0();
                                AbstractC5051a abstractC5051a2 = this.f37173p;
                                Context e11 = abstractC5051a2 != null ? abstractC5051a2.e() : null;
                                if (e11 != null) {
                                    context = e11;
                                }
                                viewStubCompat.b(LayoutInflater.from(context));
                                this.f37185w = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (this.f37185w != null) {
                        C5326k0 c5326k02 = this.f37191z;
                        if (c5326k02 != null) {
                            c5326k02.b();
                        }
                        this.f37185w.l();
                        androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(this.f37185w.getContext(), this.f37185w, dVar);
                        if (dVar.a(eVar, eVar.e())) {
                            eVar.k();
                            this.f37185w.i(eVar);
                            this.f37183v = eVar;
                            if (r0()) {
                                this.f37185w.setAlpha(0.0f);
                                C5326k0 b11 = Y.b(this.f37185w);
                                b11.a(1.0f);
                                this.f37191z = b11;
                                b11.f(new p(this));
                            } else {
                                this.f37185w.setAlpha(1.0f);
                                this.f37185w.setVisibility(0);
                                if (this.f37185w.getParent() instanceof View) {
                                    Y.A((View) this.f37185w.getParent());
                                }
                            }
                            if (this.f37187x != null) {
                                this.f37170m.getDecorView().post(this.f37189y);
                            }
                        } else {
                            this.f37183v = null;
                        }
                    }
                }
                bVar2 = this.f37183v;
                if (bVar2 != null && hVar != null) {
                    hVar.onSupportActionModeStarted(bVar2);
                }
                t0();
                this.f37183v = this.f37183v;
            }
            bVar = null;
            if (bVar == null) {
            }
            bVar2 = this.f37183v;
            if (bVar2 != null) {
                hVar.onSupportActionModeStarted(bVar2);
            }
            t0();
            this.f37183v = this.f37183v;
        }
        t0();
        return this.f37183v;
    }

    final void V(int i11, n nVar, androidx.appcompat.view.menu.g gVar) {
        if (gVar == null) {
            if (nVar == null && i11 >= 0) {
                n[] nVarArr = this.f37159N;
                if (i11 < nVarArr.length) {
                    nVar = nVarArr[i11];
                }
            }
            if (nVar != null) {
                gVar = nVar.f37218h;
            }
        }
        if ((nVar == null || nVar.f37223m) && !this.f37164S) {
            this.f37171n.d(this.f37170m.getCallback(), i11, gVar);
        }
    }

    final void W(@NonNull androidx.appcompat.view.menu.g gVar) {
        if (this.f37158M) {
            return;
        }
        this.f37158M = true;
        this.f37177s.k();
        Window.Callback callback = this.f37170m.getCallback();
        if (callback != null && !this.f37164S) {
            callback.onPanelClosed(108, gVar);
        }
        this.f37158M = false;
    }

    final void X(n nVar, boolean z11) {
        ViewGroup viewGroup;
        androidx.appcompat.widget.E e11;
        if (z11 && nVar.f37211a == 0 && (e11 = this.f37177s) != null && e11.c()) {
            W(nVar.f37218h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f37169l.getSystemService("window");
        if (windowManager != null && nVar.f37223m && (viewGroup = nVar.f37215e) != null) {
            windowManager.removeView(viewGroup);
            if (z11) {
                V(nVar.f37211a, nVar, null);
            }
        }
        nVar.f37221k = false;
        nVar.f37222l = false;
        nVar.f37223m = false;
        nVar.f37216f = null;
        nVar.f37224n = true;
        if (this.f37160O == nVar) {
            this.f37160O = null;
        }
        if (nVar.f37211a == 0) {
            t0();
        }
    }

    final void Z() {
        androidx.appcompat.widget.E e11 = this.f37177s;
        if (e11 != null) {
            e11.k();
        }
        if (this.f37187x != null) {
            this.f37170m.getDecorView().removeCallbacks(this.f37189y);
            if (this.f37187x.isShowing()) {
                try {
                    this.f37187x.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f37187x = null;
        }
        C5326k0 c5326k0 = this.f37191z;
        if (c5326k0 != null) {
            c5326k0.b();
        }
        androidx.appcompat.view.menu.g gVar = f0(0).f37218h;
        if (gVar != null) {
            gVar.close();
        }
    }

    @Override // androidx.appcompat.view.menu.g.a
    public final void a(@NonNull androidx.appcompat.view.menu.g gVar) {
        androidx.appcompat.widget.E e11 = this.f37177s;
        if (e11 == null || !e11.a() || (ViewConfiguration.get(this.f37169l).hasPermanentMenuKey() && !this.f37177s.i())) {
            n f02 = f0(0);
            f02.f37224n = true;
            X(f02, false);
            o0(f02, null);
            return;
        }
        Window.Callback callback = this.f37170m.getCallback();
        if (this.f37177s.c()) {
            this.f37177s.f();
            if (this.f37164S) {
                return;
            }
            callback.onPanelClosed(108, f0(0).f37218h);
            return;
        }
        if (callback == null || this.f37164S) {
            return;
        }
        if (this.f37184v0 && (1 & this.f37186w0) != 0) {
            View decorView = this.f37170m.getDecorView();
            Runnable runnable = this.f37188x0;
            decorView.removeCallbacks(runnable);
            ((a) runnable).run();
        }
        n f03 = f0(0);
        androidx.appcompat.view.menu.g gVar2 = f03.f37218h;
        if (gVar2 == null || f03.f37225o || !callback.onPreparePanel(0, f03.f37217g, gVar2)) {
            return;
        }
        callback.onMenuOpened(108, f03.f37218h);
        this.f37177s.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean a0(KeyEvent keyEvent) {
        View decorView;
        boolean z11;
        boolean z12;
        Object obj = this.f37168k;
        if (((!(obj instanceof C5337q.a) && !(obj instanceof w)) || (decorView = this.f37170m.getDecorView()) == null || !C5337q.a(decorView, keyEvent)) && (keyEvent.getKeyCode() != 82 || !this.f37171n.b(this.f37170m.getCallback(), keyEvent))) {
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.f37161P = (keyEvent.getFlags() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        n f02 = f0(0);
                        if (!f02.f37223m) {
                            q0(f02, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f37183v == null) {
                        n f03 = f0(0);
                        androidx.appcompat.widget.E e11 = this.f37177s;
                        Context context = this.f37169l;
                        if (e11 == null || !e11.a() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            boolean z13 = f03.f37223m;
                            if (z13 || f03.f37222l) {
                                X(f03, true);
                                z11 = z13;
                            } else {
                                if (f03.f37221k) {
                                    if (f03.f37225o) {
                                        f03.f37221k = false;
                                        z12 = q0(f03, keyEvent);
                                    } else {
                                        z12 = true;
                                    }
                                    if (z12) {
                                        o0(f03, keyEvent);
                                        z11 = true;
                                    }
                                }
                                z11 = false;
                            }
                            if (z11) {
                                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        } else {
                            if (this.f37177s.c()) {
                                z11 = this.f37177s.f();
                            } else {
                                if (!this.f37164S && q0(f03, keyEvent)) {
                                    z11 = this.f37177s.b();
                                }
                                z11 = false;
                            }
                            if (z11) {
                            }
                        }
                    }
                }
                return false;
            }
            if (!k0()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public final boolean b(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull androidx.appcompat.view.menu.i iVar) {
        n e02;
        Window.Callback callback = this.f37170m.getCallback();
        if (callback == null || this.f37164S || (e02 = e0(gVar.q())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(e02.f37211a, iVar);
    }

    final void b0(int i11) {
        n f02 = f0(i11);
        if (f02.f37218h != null) {
            Bundle bundle = new Bundle();
            f02.f37218h.D(bundle);
            if (bundle.size() > 0) {
                f02.f37226p = bundle;
            }
            f02.f37218h.Q();
            f02.f37218h.clear();
        }
        f02.f37225o = true;
        f02.f37224n = true;
        if ((i11 == 108 || i11 == 0) && this.f37177s != null) {
            n f03 = f0(0);
            f03.f37221k = false;
            q0(f03, null);
        }
    }

    @Override // androidx.appcompat.app.j
    public final void e(View view, ViewGroup.LayoutParams layoutParams) {
        c0();
        ((ViewGroup) this.f37146C.findViewById(R.id.content)).addView(view, layoutParams);
        this.f37171n.c(this.f37170m.getCallback());
    }

    final n e0(androidx.appcompat.view.menu.g gVar) {
        n[] nVarArr = this.f37159N;
        int length = nVarArr != null ? nVarArr.length : 0;
        for (int i11 = 0; i11 < length; i11++) {
            n nVar = nVarArr[i11];
            if (nVar != null && nVar.f37218h == gVar) {
                return nVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.j
    final void f() {
        final Context context = this.f37169l;
        if (androidx.appcompat.app.j.w(context) && androidx.appcompat.app.j.r() != null && !androidx.appcompat.app.j.r().equals(androidx.appcompat.app.j.s())) {
            androidx.appcompat.app.j.f37123a.execute(new Runnable() { // from class: androidx.appcompat.app.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.R(context);
                }
            });
        }
        S(true, true);
    }

    protected final n f0(int i11) {
        n[] nVarArr = this.f37159N;
        if (nVarArr == null || nVarArr.length <= i11) {
            n[] nVarArr2 = new n[i11 + 1];
            if (nVarArr != null) {
                System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
            }
            this.f37159N = nVarArr2;
            nVarArr = nVarArr2;
        }
        n nVar = nVarArr[i11];
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n();
        nVar2.f37211a = i11;
        nVar2.f37224n = false;
        nVarArr[i11] = nVar2;
        return nVar2;
    }

    @Override // androidx.appcompat.app.j
    public final boolean g() {
        return S(true, true);
    }

    @Override // androidx.appcompat.app.j
    @NonNull
    public final Context h(@NonNull Context context) {
        this.f37162Q = true;
        int i11 = this.f37166Y;
        if (i11 == -100) {
            i11 = androidx.appcompat.app.j.m();
        }
        int j02 = j0(i11, context);
        if (androidx.appcompat.app.j.w(context)) {
            androidx.appcompat.app.j.R(context);
        }
        androidx.core.os.i U10 = U(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(Y(context, j02, U10, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(Y(context, j02, U10, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f37141G0) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f7 = configuration3.fontScale;
                float f11 = configuration4.fontScale;
                if (f7 != f11) {
                    configuration.fontScale = f11;
                }
                int i12 = configuration3.mcc;
                int i13 = configuration4.mcc;
                if (i12 != i13) {
                    configuration.mcc = i13;
                }
                int i14 = configuration3.mnc;
                int i15 = configuration4.mnc;
                if (i14 != i15) {
                    configuration.mnc = i15;
                }
                f.a(configuration3, configuration4, configuration);
                int i16 = configuration3.touchscreen;
                int i17 = configuration4.touchscreen;
                if (i16 != i17) {
                    configuration.touchscreen = i17;
                }
                int i18 = configuration3.keyboard;
                int i19 = configuration4.keyboard;
                if (i18 != i19) {
                    configuration.keyboard = i19;
                }
                int i21 = configuration3.keyboardHidden;
                int i22 = configuration4.keyboardHidden;
                if (i21 != i22) {
                    configuration.keyboardHidden = i22;
                }
                int i23 = configuration3.navigation;
                int i24 = configuration4.navigation;
                if (i23 != i24) {
                    configuration.navigation = i24;
                }
                int i25 = configuration3.navigationHidden;
                int i26 = configuration4.navigationHidden;
                if (i25 != i26) {
                    configuration.navigationHidden = i26;
                }
                int i27 = configuration3.orientation;
                int i28 = configuration4.orientation;
                if (i27 != i28) {
                    configuration.orientation = i28;
                }
                int i29 = configuration3.screenLayout & 15;
                int i31 = configuration4.screenLayout & 15;
                if (i29 != i31) {
                    configuration.screenLayout |= i31;
                }
                int i32 = configuration3.screenLayout & 192;
                int i33 = configuration4.screenLayout & 192;
                if (i32 != i33) {
                    configuration.screenLayout |= i33;
                }
                int i34 = configuration3.screenLayout & 48;
                int i35 = configuration4.screenLayout & 48;
                if (i34 != i35) {
                    configuration.screenLayout |= i35;
                }
                int i36 = configuration3.screenLayout & 768;
                int i37 = configuration4.screenLayout & 768;
                if (i36 != i37) {
                    configuration.screenLayout |= i37;
                }
                g.a(configuration3, configuration4, configuration);
                int i38 = configuration3.uiMode & 15;
                int i39 = configuration4.uiMode & 15;
                if (i38 != i39) {
                    configuration.uiMode |= i39;
                }
                int i41 = configuration3.uiMode & 48;
                int i42 = configuration4.uiMode & 48;
                if (i41 != i42) {
                    configuration.uiMode |= i42;
                }
                int i43 = configuration3.screenWidthDp;
                int i44 = configuration4.screenWidthDp;
                if (i43 != i44) {
                    configuration.screenWidthDp = i44;
                }
                int i45 = configuration3.screenHeightDp;
                int i46 = configuration4.screenHeightDp;
                if (i45 != i46) {
                    configuration.screenHeightDp = i46;
                }
                int i47 = configuration3.smallestScreenWidthDp;
                int i48 = configuration4.smallestScreenWidthDp;
                if (i47 != i48) {
                    configuration.smallestScreenWidthDp = i48;
                }
                int i49 = configuration3.densityDpi;
                int i51 = configuration4.densityDpi;
                if (i49 != i51) {
                    configuration.densityDpi = i51;
                }
            }
        }
        Configuration Y11 = Y(context, j02, U10, configuration, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, ru.ozon.app.android.R.style.Theme_AppCompat_Empty);
        dVar.a(Y11);
        try {
            if (context.getTheme() != null) {
                g.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return dVar;
    }

    public final boolean i0() {
        return this.f37142A;
    }

    @Override // androidx.appcompat.app.j
    public final <T extends View> T j(int i11) {
        c0();
        return (T) this.f37170m.findViewById(i11);
    }

    final int j0(int i11, @NonNull Context context) {
        if (i11 != -100) {
            if (i11 == -1) {
                return i11;
            }
            if (i11 != 0) {
                if (i11 == 1 || i11 == 2) {
                    return i11;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f37182u0 == null) {
                    this.f37182u0 = new j(context);
                }
                return this.f37182u0.e();
            }
            if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                if (this.f37180t0 == null) {
                    this.f37180t0 = new C0713l(D.a(context));
                }
                return this.f37180t0.e();
            }
        }
        return -1;
    }

    final boolean k0() {
        boolean z11 = this.f37161P;
        this.f37161P = false;
        n f02 = f0(0);
        if (!f02.f37223m) {
            androidx.appcompat.view.b bVar = this.f37183v;
            if (bVar != null) {
                bVar.c();
                return true;
            }
            g0();
            AbstractC5051a abstractC5051a = this.f37173p;
            if (abstractC5051a == null || !abstractC5051a.b()) {
                return false;
            }
        } else if (!z11) {
            X(f02, true);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.app.j
    public final Context l() {
        return this.f37169l;
    }

    final boolean l0(int i11, KeyEvent keyEvent) {
        g0();
        AbstractC5051a abstractC5051a = this.f37173p;
        if (abstractC5051a == null || !abstractC5051a.i(i11, keyEvent)) {
            n nVar = this.f37160O;
            if (nVar == null || !p0(nVar, keyEvent.getKeyCode(), keyEvent)) {
                if (this.f37160O == null) {
                    n f02 = f0(0);
                    q0(f02, keyEvent);
                    boolean p02 = p0(f02, keyEvent.getKeyCode(), keyEvent);
                    f02.f37221k = false;
                    if (p02) {
                    }
                }
                return false;
            }
            n nVar2 = this.f37160O;
            if (nVar2 != null) {
                nVar2.f37222l = true;
                return true;
            }
        }
        return true;
    }

    final void m0(int i11) {
        if (i11 == 108) {
            g0();
            AbstractC5051a abstractC5051a = this.f37173p;
            if (abstractC5051a != null) {
                abstractC5051a.c(true);
            }
        }
    }

    @Override // androidx.appcompat.app.j
    public final InterfaceC5052b n() {
        return new b();
    }

    final void n0(int i11) {
        if (i11 == 108) {
            g0();
            AbstractC5051a abstractC5051a = this.f37173p;
            if (abstractC5051a != null) {
                abstractC5051a.c(false);
                return;
            }
            return;
        }
        if (i11 == 0) {
            n f02 = f0(i11);
            if (f02.f37223m) {
                X(f02, false);
            }
        }
    }

    @Override // androidx.appcompat.app.j
    public final int o() {
        return this.f37166Y;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f37145B0 == null) {
            int[] iArr = C6977a.f65656j;
            Context context2 = this.f37169l;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f37145B0 = new y();
            } else {
                try {
                    this.f37145B0 = (y) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f37145B0 = new y();
                }
            }
        }
        y yVar = this.f37145B0;
        int i11 = h0.f37937a;
        return yVar.f(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.j
    public final MenuInflater q() {
        if (this.f37174q == null) {
            g0();
            AbstractC5051a abstractC5051a = this.f37173p;
            this.f37174q = new androidx.appcompat.view.g(abstractC5051a != null ? abstractC5051a.e() : this.f37169l);
        }
        return this.f37174q;
    }

    final boolean r0() {
        ViewGroup viewGroup;
        return this.f37144B && (viewGroup = this.f37146C) != null && viewGroup.isLaidOut();
    }

    @Override // androidx.appcompat.app.j
    public final AbstractC5051a t() {
        g0();
        return this.f37173p;
    }

    final void t0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z11 = false;
            if (this.f37147C0 != null && (f0(0).f37223m || this.f37183v != null)) {
                z11 = true;
            }
            if (z11 && this.f37149D0 == null) {
                this.f37149D0 = h.b(this.f37147C0, this);
            } else {
                if (z11 || (onBackInvokedCallback = this.f37149D0) == null) {
                    return;
                }
                h.c(this.f37147C0, onBackInvokedCallback);
                this.f37149D0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.j
    public final void u() {
        LayoutInflater from = LayoutInflater.from(this.f37169l);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof l) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    final int u0(C5353y0 c5353y0) {
        boolean z11;
        boolean z12;
        int l11 = c5353y0.l();
        ActionBarContextView actionBarContextView = this.f37185w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z11 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37185w.getLayoutParams();
            if (this.f37185w.isShown()) {
                if (this.f37192z0 == null) {
                    this.f37192z0 = new Rect();
                    this.f37143A0 = new Rect();
                }
                Rect rect = this.f37192z0;
                Rect rect2 = this.f37143A0;
                rect.set(c5353y0.j(), c5353y0.l(), c5353y0.k(), c5353y0.i());
                i0.a(this.f37146C, rect, rect2);
                int i11 = rect.top;
                int i12 = rect.left;
                int i13 = rect.right;
                C5353y0 n11 = Y.n(this.f37146C);
                int j11 = n11 == null ? 0 : n11.j();
                int k11 = n11 == null ? 0 : n11.k();
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z12 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z12 = true;
                }
                Context context = this.f37169l;
                if (i11 <= 0 || this.f37150E != null) {
                    View view = this.f37150E;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != j11 || marginLayoutParams2.rightMargin != k11) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = j11;
                            marginLayoutParams2.rightMargin = k11;
                            this.f37150E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(context);
                    this.f37150E = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = j11;
                    layoutParams.rightMargin = k11;
                    this.f37146C.addView(this.f37150E, -1, layoutParams);
                }
                View view3 = this.f37150E;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    View view4 = this.f37150E;
                    view4.setBackgroundColor((view4.getWindowSystemUiVisibility() & 8192) != 0 ? androidx.core.content.a.getColor(context, ru.ozon.app.android.R.color.abc_decor_view_status_guard_light) : androidx.core.content.a.getColor(context, ru.ozon.app.android.R.color.abc_decor_view_status_guard));
                }
                if (!this.f37155J && r5) {
                    l11 = 0;
                }
                z11 = r5;
                r5 = z12;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z11 = false;
            } else {
                z11 = false;
                r5 = false;
            }
            if (r5) {
                this.f37185w.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f37150E;
        if (view5 != null) {
            view5.setVisibility(z11 ? 0 : 8);
        }
        return l11;
    }

    @Override // androidx.appcompat.app.j
    public final void v() {
        if (this.f37173p != null) {
            g0();
            if (this.f37173p.f()) {
                return;
            }
            h0(0);
        }
    }

    @Override // androidx.appcompat.app.j
    public final void x(Configuration configuration) {
        if (this.f37153H && this.f37144B) {
            g0();
            AbstractC5051a abstractC5051a = this.f37173p;
            if (abstractC5051a != null) {
                abstractC5051a.g();
            }
        }
        C5064i b11 = C5064i.b();
        Context context = this.f37169l;
        b11.g(context);
        this.f37165X = new Configuration(context.getResources().getConfiguration());
        S(false, false);
    }

    @Override // androidx.appcompat.app.j
    public final void y() {
        String str;
        this.f37162Q = true;
        S(false, true);
        d0();
        Object obj = this.f37168k;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = androidx.core.app.j.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e11) {
                    throw new IllegalArgumentException(e11);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC5051a abstractC5051a = this.f37173p;
                if (abstractC5051a == null) {
                    this.f37190y0 = true;
                } else {
                    abstractC5051a.l(true);
                }
            }
            androidx.appcompat.app.j.d(this);
        }
        this.f37165X = new Configuration(this.f37169l.getResources().getConfiguration());
        this.f37163R = true;
    }

    @Override // androidx.appcompat.app.j
    public final void z() {
        Object obj = this.f37168k;
        boolean z11 = obj instanceof Activity;
        if (z11) {
            androidx.appcompat.app.j.E(this);
        }
        if (this.f37184v0) {
            this.f37170m.getDecorView().removeCallbacks(this.f37188x0);
        }
        this.f37164S = true;
        int i11 = this.f37166Y;
        Z<String, Integer> z12 = f37139E0;
        if (i11 != -100 && z11 && ((Activity) obj).isChangingConfigurations()) {
            z12.put(obj.getClass().getName(), Integer.valueOf(this.f37166Y));
        } else {
            z12.remove(obj.getClass().getName());
        }
        AbstractC5051a abstractC5051a = this.f37173p;
        if (abstractC5051a != null) {
            abstractC5051a.h();
        }
        C0713l c0713l = this.f37180t0;
        if (c0713l != null) {
            c0713l.a();
        }
        j jVar = this.f37182u0;
        if (jVar != null) {
            jVar.a();
        }
    }

    l(Dialog dialog, androidx.appcompat.app.h hVar) {
        this(dialog.getContext(), dialog.getWindow(), hVar, dialog);
    }

    private l(Context context, Window window, androidx.appcompat.app.h hVar, Object obj) {
        Z<String, Integer> z11;
        Integer num;
        androidx.appcompat.app.g gVar = null;
        this.f37191z = null;
        this.f37142A = true;
        this.f37166Y = -100;
        this.f37188x0 = new a();
        this.f37169l = context;
        this.f37172o = hVar;
        this.f37168k = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof androidx.appcompat.app.g) {
                        gVar = (androidx.appcompat.app.g) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (gVar != null) {
                this.f37166Y = gVar.getDelegate().o();
            }
        }
        if (this.f37166Y == -100 && (num = (z11 = f37139E0).get(this.f37168k.getClass().getName())) != null) {
            this.f37166Y = num.intValue();
            z11.remove(this.f37168k.getClass().getName());
        }
        if (window != null) {
            T(window);
        }
        C5064i.h();
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
