package androidx.camera.view;

import C.S;
import C.Y;
import C.s0;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.I;
import androidx.camera.view.PreviewView;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.lifecycle.V;
import g0.C6604b;
import g0.C6605c;
import g0.ViewOnLayoutChangeListenerC6603a;
import h0.C6765b;
import i0.C6979b;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class PreviewView extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    private static final c f38503m = c.PERFORMANCE;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    c f38504a;

    /* renamed from: b, reason: collision with root package name */
    k f38505b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    final C6605c f38506c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    final g f38507d;

    /* renamed from: e, reason: collision with root package name */
    boolean f38508e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    final V<e> f38509f;

    /* renamed from: g, reason: collision with root package name */
    final AtomicReference<f> f38510g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    l f38511h;

    /* renamed from: i, reason: collision with root package name */
    H f38512i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    private final b f38513j;

    /* renamed from: k, reason: collision with root package name */
    private final ViewOnLayoutChangeListenerC6603a f38514k;

    /* renamed from: l, reason: collision with root package name */
    final Y.c f38515l;

    final class a implements Y.c {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // C.Y.c
        public final void a(@NonNull final s0 s0Var) {
            n nVar;
            boolean b11 = G.q.b();
            PreviewView previewView = PreviewView.this;
            if (!b11) {
                androidx.core.content.a.getMainExecutor(previewView.getContext()).execute(new Runnable() { // from class: androidx.camera.view.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((PreviewView.a) PreviewView.this.f38515l).a(s0Var);
                    }
                });
                return;
            }
            S.a("PreviewView", "Surface requested by Preview.");
            final I c11 = s0Var.c();
            previewView.f38512i = c11.e();
            previewView.f38511h.e(c11.k().k());
            s0Var.l(androidx.core.content.a.getMainExecutor(previewView.getContext()), new s0.e() { // from class: androidx.camera.view.i
                @Override // C.s0.e
                public final void c(s0.d dVar) {
                    k kVar;
                    PreviewView.a aVar = PreviewView.a.this;
                    aVar.getClass();
                    S.a("PreviewView", "Preview transformation info updated. " + dVar);
                    boolean z11 = c11.e().e() == 0;
                    PreviewView previewView2 = PreviewView.this;
                    previewView2.f38507d.h(dVar, s0Var.g(), z11);
                    if (dVar.d() == -1 || ((kVar = previewView2.f38505b) != null && (kVar instanceof n))) {
                        previewView2.f38508e = true;
                    } else {
                        previewView2.f38508e = false;
                    }
                    previewView2.d();
                }
            });
            k kVar = previewView.f38505b;
            c cVar = previewView.f38504a;
            if (!(kVar instanceof n) || PreviewView.g(s0Var, cVar)) {
                boolean g10 = PreviewView.g(s0Var, previewView.f38504a);
                g gVar = previewView.f38507d;
                if (g10) {
                    t tVar = new t(previewView, gVar);
                    tVar.f38589i = false;
                    tVar.f38591k = new AtomicReference<>();
                    nVar = tVar;
                } else {
                    nVar = new n(previewView, gVar);
                }
                previewView.f38505b = nVar;
            }
            f fVar = new f(c11.e(), previewView.f38509f, previewView.f38505b);
            previewView.f38510g.set(fVar);
            c11.c().c(androidx.core.content.a.getMainExecutor(previewView.getContext()), fVar);
            previewView.f38505b.e(s0Var, new j(this, fVar, c11));
            C6605c c6605c = previewView.f38506c;
            if (previewView.indexOfChild(c6605c) == -1) {
                previewView.addView(c6605c);
            }
        }
    }

    class b implements DisplayManager.DisplayListener {
        b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i11) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i11) {
            PreviewView previewView = PreviewView.this;
            Display display = previewView.getDisplay();
            if (display == null || display.getDisplayId() != i11) {
                return;
            }
            previewView.d();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i11) {
        }
    }

    public enum c {
        PERFORMANCE(0),
        COMPATIBLE(1);

        private final int mId;

        c(int i11) {
            this.mId = i11;
        }

        static c a(int i11) {
            for (c cVar : values()) {
                if (cVar.mId == i11) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException(Ej.b.a(i11, "Unknown implementation mode id "));
        }

        final int b() {
            return this.mId;
        }
    }

    public enum d {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        private final int mId;

        d(int i11) {
            this.mId = i11;
        }

        static d a(int i11) {
            for (d dVar : values()) {
                if (dVar.mId == i11) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException(Ej.b.a(i11, "Unknown scale type id "));
        }

        final int b() {
            return this.mId;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static final /* synthetic */ e[] $VALUES;
        public static final e IDLE;
        public static final e STREAMING;

        static {
            e eVar = new e("IDLE", 0);
            IDLE = eVar;
            e eVar2 = new e("STREAMING", 1);
            STREAMING = eVar2;
            $VALUES = new e[]{eVar, eVar2};
        }

        private e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [g0.a] */
    public PreviewView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        c cVar = f38503m;
        this.f38504a = cVar;
        g gVar = new g();
        this.f38507d = gVar;
        this.f38508e = true;
        this.f38509f = new V<>(e.IDLE);
        this.f38510g = new AtomicReference<>();
        this.f38511h = new l(gVar);
        this.f38513j = new b();
        this.f38514k = new View.OnLayoutChangeListener() { // from class: g0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                PreviewView.a(PreviewView.this, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f38515l = new a();
        G.q.a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = C6604b.f63686a;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        androidx.core.view.Y.B(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        try {
            f(d.a(obtainStyledAttributes.getInteger(1, gVar.c().b())));
            e(c.a(obtainStyledAttributes.getInteger(0, cVar.b())));
            obtainStyledAttributes.recycle();
            new C6765b(context, new TY.a(this));
            if (getBackground() == null) {
                setBackgroundColor(androidx.core.content.a.getColor(getContext(), R.color.black));
            }
            C6605c c6605c = new C6605c(context, null, 0, 0);
            c6605c.setBackgroundColor(-1);
            c6605c.setAlpha(0.0f);
            c6605c.setElevation(Float.MAX_VALUE);
            this.f38506c = c6605c;
            c6605c.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public static /* synthetic */ void a(PreviewView previewView, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i13 - i11 == i17 - i15 && i14 - i12 == i18 - i16) {
            return;
        }
        previewView.d();
        previewView.b();
    }

    private void b() {
        G.q.a();
        G.q.a();
        if (getDisplay() == null) {
            return;
        }
        getDisplay().getRotation();
        G.q.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        new Rational(getWidth(), getHeight());
        G.q.a();
        g gVar = this.f38507d;
        int ordinal = gVar.c().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            getLayoutDirection();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected scale type: ");
        G.q.a();
        sb2.append(gVar.c());
        throw new IllegalStateException(sb2.toString());
    }

    static boolean g(@NonNull s0 s0Var, @NonNull c cVar) {
        boolean equals = s0Var.c().e().q().equals("androidx.camera.camera2.legacy");
        boolean z11 = (C6979b.b(SurfaceViewStretchedQuirk.class) == null && C6979b.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (!equals && !z11) {
            int ordinal = cVar.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal != 1) {
                throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
            }
        }
        return true;
    }

    @NonNull
    public final Y.c c() {
        G.q.a();
        return this.f38515l;
    }

    final void d() {
        Display display;
        H h11;
        G.q.a();
        if (this.f38505b != null) {
            if (this.f38508e && (display = getDisplay()) != null && (h11 = this.f38512i) != null) {
                this.f38507d.f(h11.g(display.getRotation()), display.getRotation());
            }
            this.f38505b.f();
        }
        this.f38511h.d(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public final void e(@NonNull c cVar) {
        G.q.a();
        this.f38504a = cVar;
    }

    public final void f(@NonNull d dVar) {
        G.q.a();
        this.f38507d.g(dVar);
        d();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        DisplayManager displayManager = context == null ? null : (DisplayManager) context.getApplicationContext().getSystemService("display");
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f38513j, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f38514k);
        k kVar = this.f38505b;
        if (kVar != null) {
            kVar.b();
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f38514k);
        k kVar = this.f38505b;
        if (kVar != null) {
            kVar.c();
        }
        Context context = getContext();
        DisplayManager displayManager = context == null ? null : (DisplayManager) context.getApplicationContext().getSystemService("display");
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f38513j);
    }
}
