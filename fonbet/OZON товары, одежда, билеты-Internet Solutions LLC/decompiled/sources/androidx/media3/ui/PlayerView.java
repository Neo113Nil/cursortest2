package androidx.media3.ui;

import a3.RunnableC4928b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.d;
import j3.AbstractC7252H;
import j3.C7256L;
import j3.Q;
import j3.y;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import l3.C7856b;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public class PlayerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final b f44165a;

    /* renamed from: b, reason: collision with root package name */
    private final AspectRatioFrameLayout f44166b;

    /* renamed from: c, reason: collision with root package name */
    private final View f44167c;

    /* renamed from: d, reason: collision with root package name */
    private final View f44168d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f44169e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f44170f;

    /* renamed from: g, reason: collision with root package name */
    private final ImageView f44171g;

    /* renamed from: h, reason: collision with root package name */
    private final SubtitleView f44172h;

    /* renamed from: i, reason: collision with root package name */
    private final View f44173i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f44174j;

    /* renamed from: k, reason: collision with root package name */
    private final d f44175k;

    /* renamed from: l, reason: collision with root package name */
    private final Handler f44176l;

    /* renamed from: m, reason: collision with root package name */
    private final Class<?> f44177m;

    /* renamed from: n, reason: collision with root package name */
    private final Method f44178n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f44179o;

    /* renamed from: p, reason: collision with root package name */
    private j3.y f44180p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f44181q;

    /* renamed from: r, reason: collision with root package name */
    private int f44182r;

    /* renamed from: s, reason: collision with root package name */
    private int f44183s;

    /* renamed from: t, reason: collision with root package name */
    private Drawable f44184t;

    /* renamed from: u, reason: collision with root package name */
    private int f44185u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f44186v;

    /* renamed from: w, reason: collision with root package name */
    private int f44187w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f44188x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f44189y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f44190z;

    /* loaded from: classes8.dex */
    private static class a {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    private final class b implements y.c, View.OnClickListener, d.j {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC7252H.b f44191a = new AbstractC7252H.b();

        /* renamed from: b, reason: collision with root package name */
        private Object f44192b;

        public b() {
        }

        @Override // j3.y.c
        public final void W(int i11, int i12) {
            if (Build.VERSION.SDK_INT == 34) {
                boolean z11 = PlayerView.this.f44168d instanceof SurfaceView;
            }
        }

        @Override // j3.y.c
        public final void a0(int i11, y.d dVar, y.d dVar2) {
            PlayerView playerView = PlayerView.this;
            if (playerView.x() && playerView.f44189y) {
                playerView.w();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PlayerView.this.F();
        }

        @Override // j3.y.c
        public final void onPlayWhenReadyChanged(boolean z11, int i11) {
            PlayerView playerView = PlayerView.this;
            playerView.H();
            PlayerView.i(playerView);
        }

        @Override // j3.y.c
        public final void onPlaybackStateChanged(int i11) {
            PlayerView playerView = PlayerView.this;
            playerView.H();
            PlayerView.h(playerView);
            PlayerView.i(playerView);
        }

        @Override // j3.y.c
        public final void onRenderedFirstFrame() {
            PlayerView playerView = PlayerView.this;
            if (playerView.f44167c != null) {
                playerView.f44167c.setVisibility(4);
                if (playerView.u()) {
                    PlayerView.d(playerView);
                } else {
                    playerView.v();
                }
            }
        }

        @Override // j3.y.c
        public final void onTracksChanged(C7256L c7256l) {
            PlayerView playerView = PlayerView.this;
            j3.y yVar = playerView.f44180p;
            yVar.getClass();
            AbstractC7252H G11 = yVar.l(17) ? yVar.G() : AbstractC7252H.EMPTY;
            if (G11.isEmpty()) {
                this.f44192b = null;
            } else {
                boolean l11 = yVar.l(30);
                AbstractC7252H.b bVar = this.f44191a;
                if (!l11 || yVar.i().b()) {
                    Object obj = this.f44192b;
                    if (obj != null) {
                        int indexOfPeriod = G11.getIndexOfPeriod(obj);
                        if (indexOfPeriod != -1) {
                            if (yVar.R() == G11.getPeriod(indexOfPeriod, bVar).f68939c) {
                                return;
                            }
                        }
                        this.f44192b = null;
                    }
                } else {
                    this.f44192b = G11.getPeriod(yVar.r(), bVar, true).f68938b;
                }
            }
            playerView.J(false);
        }

        @Override // j3.y.c
        public final void onVideoSizeChanged(Q q11) {
            if (q11.equals(Q.f69042d)) {
                return;
            }
            PlayerView playerView = PlayerView.this;
            if (playerView.f44180p == null || playerView.f44180p.P() == 1) {
                return;
            }
            playerView.G();
        }

        @Override // androidx.media3.ui.d.j
        public final void q() {
            PlayerView.this.I();
        }

        @Override // j3.y.c
        public final void x(C7856b c7856b) {
            PlayerView playerView = PlayerView.this;
            if (playerView.f44172h != null) {
                playerView.f44172h.a(c7856b.f72637a);
            }
        }
    }

    /* loaded from: classes8.dex */
    private static final class c {
        c(int i11) {
        }
    }

    public PlayerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        if (!L() || this.f44180p == null) {
            return;
        }
        d dVar = this.f44175k;
        if (!dVar.f0()) {
            y(true);
        } else if (this.f44190z) {
            dVar.d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        j3.y yVar = this.f44180p;
        Q M11 = yVar != null ? yVar.M() : Q.f69042d;
        int i11 = M11.f69043a;
        int i12 = M11.f69044b;
        float f7 = this.f44169e ? 0.0f : (i12 == 0 || i11 == 0) ? 0.0f : (i11 * M11.f69045c) / i12;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f44166b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.a(f7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r5.f44180p.n() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void H() {
        boolean z11;
        View view = this.f44173i;
        if (view != null) {
            j3.y yVar = this.f44180p;
            if (yVar != null && yVar.P() == 2) {
                z11 = true;
                int i11 = this.f44185u;
                if (i11 != 2) {
                    if (i11 == 1) {
                    }
                }
                view.setVisibility(z11 ? 0 : 8);
            }
            z11 = false;
            view.setVisibility(z11 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        d dVar = this.f44175k;
        if (dVar == null || !this.f44181q) {
            setContentDescription(null);
        } else if (dVar.f0()) {
            setContentDescription(this.f44190z ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(boolean z11) {
        byte[] bArr;
        Drawable drawable;
        j3.y yVar = this.f44180p;
        boolean z12 = false;
        boolean z13 = (yVar == null || !yVar.l(30) || yVar.i().b()) ? false : true;
        boolean z14 = this.f44186v;
        ImageView imageView = this.f44171g;
        View view = this.f44167c;
        if (!z14 && (!z13 || z11)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            v();
        }
        if (z13) {
            j3.y yVar2 = this.f44180p;
            boolean z15 = yVar2 != null && yVar2.l(30) && yVar2.i().c(2);
            boolean u11 = u();
            if (!z15 && !u11) {
                if (view != null) {
                    view.setVisibility(0);
                }
                v();
            }
            ImageView imageView2 = this.f44170f;
            boolean z16 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (u11 && !z15 && z16) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    K();
                }
            } else if (z15 && !u11 && z16) {
                v();
            }
            if (!z15 && !u11 && this.f44182r != 0) {
                G10.a.i(imageView);
                if (yVar != null && yVar.l(18) && (bArr = yVar.W().f69282i) != null) {
                    z12 = z(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (z12 || z(this.f44184t)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    private void K() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f44170f;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float f7 = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f44183s == 1) {
            f7 = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f44166b) != null) {
            aspectRatioFrameLayout.a(f7);
        }
        imageView.setScaleType(scaleType);
    }

    private boolean L() {
        if (!this.f44181q) {
            return false;
        }
        G10.a.i(this.f44175k);
        return true;
    }

    public static void a(PlayerView playerView, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(playerView.getResources(), bitmap);
        ImageView imageView = playerView.f44170f;
        if (imageView != null) {
            imageView.setImageDrawable(bitmapDrawable);
            playerView.K();
        }
        j3.y yVar = playerView.f44180p;
        if (yVar != null && yVar.l(30) && yVar.i().c(2)) {
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.K();
        }
        View view = playerView.f44167c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static void b(PlayerView playerView, Method method, Object[] objArr) {
        if (method.getName().equals("onImageAvailable")) {
            playerView.f44176l.post(new RunnableC4928b(1, playerView, (Bitmap) objArr[1]));
        }
    }

    static void d(PlayerView playerView) {
        ImageView imageView = playerView.f44170f;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    static void h(PlayerView playerView) {
        TextView textView = playerView.f44174j;
        if (textView != null) {
            j3.y yVar = playerView.f44180p;
            if (yVar != null) {
                yVar.a();
            }
            textView.setVisibility(8);
        }
    }

    static void i(PlayerView playerView) {
        if (playerView.x() && playerView.f44189y) {
            playerView.w();
        } else {
            playerView.y(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u() {
        j3.y yVar = this.f44180p;
        return yVar != null && this.f44179o != null && yVar.l(30) && yVar.i().c(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        ImageView imageView = this.f44170f;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x() {
        j3.y yVar = this.f44180p;
        return yVar != null && yVar.l(16) && this.f44180p.e() && this.f44180p.n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r4.n() == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void y(boolean z11) {
        if (!(x() && this.f44189y) && L()) {
            d dVar = this.f44175k;
            boolean z12 = true;
            boolean z13 = dVar.f0() && dVar.c0() <= 0;
            j3.y yVar = this.f44180p;
            if (yVar != null) {
                int P11 = yVar.P();
                if (this.f44188x && (!this.f44180p.l(17) || !this.f44180p.G().isEmpty())) {
                    if (P11 != 1 && P11 != 4) {
                        j3.y yVar2 = this.f44180p;
                        yVar2.getClass();
                    }
                }
                z12 = false;
            }
            if ((z11 || z13 || z12) && L()) {
                dVar.l0(z12 ? 0 : this.f44187w);
                dVar.m0();
            }
        }
    }

    private boolean z(Drawable drawable) {
        ImageView imageView = this.f44171g;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f7 = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f44182r == 2) {
                    f7 = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f44166b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.a(f7);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final void A() {
        if (!this.f44186v) {
            this.f44186v = true;
            J(false);
        }
    }

    public final void B(j3.y yVar) {
        G10.a.h(Looper.myLooper() == Looper.getMainLooper());
        G10.a.c(yVar == null || yVar.H() == Looper.getMainLooper());
        j3.y yVar2 = this.f44180p;
        if (yVar2 == yVar) {
            return;
        }
        Method method = this.f44178n;
        Class<?> cls = this.f44177m;
        View view = this.f44168d;
        b bVar = this.f44165a;
        if (yVar2 != null) {
            yVar2.j(bVar);
            if (yVar2.l(27)) {
                if (view instanceof TextureView) {
                    yVar2.s((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    yVar2.T((SurfaceView) view);
                }
            }
            if (cls != null && cls.isAssignableFrom(yVar2.getClass())) {
                try {
                    method.getClass();
                    method.invoke(yVar2, null);
                } catch (IllegalAccessException | InvocationTargetException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        SubtitleView subtitleView = this.f44172h;
        if (subtitleView != null) {
            subtitleView.a(null);
        }
        this.f44180p = yVar;
        if (L()) {
            this.f44175k.k0(yVar);
        }
        H();
        TextView textView = this.f44174j;
        if (textView != null) {
            j3.y yVar3 = this.f44180p;
            if (yVar3 != null) {
                yVar3.a();
            }
            textView.setVisibility(8);
        }
        J(true);
        if (yVar == null) {
            w();
            return;
        }
        if (yVar.l(27)) {
            if (view instanceof TextureView) {
                yVar.J((TextureView) view);
            } else if (view instanceof SurfaceView) {
                yVar.g((SurfaceView) view);
            }
            if (!yVar.l(30) || yVar.i().d()) {
                G();
            }
        }
        if (subtitleView != null && yVar.l(28)) {
            subtitleView.a(yVar.E().f72637a);
        }
        yVar.t(bVar);
        if (cls != null && cls.isAssignableFrom(yVar.getClass())) {
            try {
                method.getClass();
                Object obj = this.f44179o;
                obj.getClass();
                method.invoke(yVar, obj);
            } catch (IllegalAccessException | InvocationTargetException e12) {
                throw new RuntimeException(e12);
            }
        }
        y(false);
    }

    public final void C(int i11) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f44166b;
        G10.a.i(aspectRatioFrameLayout);
        aspectRatioFrameLayout.b(i11);
    }

    public final void D(int i11) {
        View view = this.f44167c;
        if (view != null) {
            view.setBackgroundColor(i11);
        }
    }

    public final void E() {
        setClickable(hasOnClickListeners());
        if (this.f44181q) {
            this.f44181q = false;
            boolean L11 = L();
            d dVar = this.f44175k;
            if (L11) {
                dVar.k0(this.f44180p);
            } else if (dVar != null) {
                dVar.d0();
                dVar.k0(null);
            }
            I();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        j3.y yVar = this.f44180p;
        if (yVar != null && yVar.l(16) && this.f44180p.e()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z11 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        d dVar = this.f44175k;
        if (z11 && L() && !dVar.f0()) {
            y(true);
            return true;
        }
        if ((L() && dVar.Z(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            y(true);
            return true;
        }
        if (z11 && L()) {
            y(true);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!L() || this.f44180p == null) {
            return false;
        }
        y(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        F();
        return super.performClick();
    }

    public final j3.y s() {
        return this.f44180p;
    }

    @Override // android.view.View
    public final void setVisibility(int i11) {
        super.setVisibility(i11);
        View view = this.f44168d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i11);
        }
    }

    public final View t() {
        return this.f44168d;
    }

    public final void w() {
        d dVar = this.f44175k;
        if (dVar != null) {
            dVar.d0();
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z15;
        boolean z16;
        int i21;
        int i22;
        boolean z17;
        Class<ExoPlayer> cls;
        Object obj;
        Method method;
        b bVar = new b();
        this.f44165a = bVar;
        this.f44176l = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f44166b = null;
            this.f44167c = null;
            this.f44168d = null;
            this.f44169e = false;
            this.f44170f = null;
            this.f44171g = null;
            this.f44172h = null;
            this.f44173i = null;
            this.f44174j = null;
            this.f44175k = null;
            this.f44177m = null;
            this.f44178n = null;
            this.f44179o = null;
            ImageView imageView = new ImageView(context);
            Resources resources = getResources();
            imageView.setImageDrawable(resources.getDrawable(2131231742, context.getTheme()));
            imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, x4.c.f105022e, i11, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(42);
                int color = obtainStyledAttributes.getColor(42, 0);
                int resourceId = obtainStyledAttributes.getResourceId(22, R.layout.exo_player_view);
                boolean z18 = obtainStyledAttributes.getBoolean(50, true);
                int i23 = obtainStyledAttributes.getInt(3, 1);
                int resourceId2 = obtainStyledAttributes.getResourceId(9, 0);
                int i24 = obtainStyledAttributes.getInt(15, 0);
                boolean z19 = obtainStyledAttributes.getBoolean(51, true);
                int i25 = obtainStyledAttributes.getInt(45, 1);
                int i26 = obtainStyledAttributes.getInt(28, 0);
                z11 = z19;
                i12 = obtainStyledAttributes.getInt(38, 5000);
                boolean z21 = obtainStyledAttributes.getBoolean(14, true);
                boolean z22 = obtainStyledAttributes.getBoolean(4, true);
                int integer = obtainStyledAttributes.getInteger(35, 0);
                this.f44186v = obtainStyledAttributes.getBoolean(16, this.f44186v);
                boolean z23 = obtainStyledAttributes.getBoolean(13, true);
                obtainStyledAttributes.recycle();
                z14 = z23;
                z12 = z21;
                z16 = z18;
                i19 = color;
                i13 = resourceId;
                i15 = resourceId2;
                i17 = i26;
                z13 = z22;
                i14 = integer;
                i21 = i23;
                z15 = hasValue;
                i18 = i25;
                i16 = i24;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i12 = 5000;
            i13 = R.layout.exo_player_view;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = true;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
            i18 = 1;
            i19 = 0;
            z15 = false;
            z16 = true;
            i21 = 1;
        }
        LayoutInflater.from(context).inflate(i13, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f44166b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.b(i17);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.f44167c = findViewById;
        if (findViewById != null && z15) {
            findViewById.setBackgroundColor(i19);
        }
        if (aspectRatioFrameLayout != null && i18 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i18 == 2) {
                this.f44168d = new TextureView(context);
            } else if (i18 == 3) {
                try {
                    int i27 = M3.j.f17339l;
                    this.f44168d = (View) M3.j.class.getConstructor(Context.class).newInstance(context);
                    z17 = true;
                    this.f44168d.setLayoutParams(layoutParams);
                    this.f44168d.setOnClickListener(bVar);
                    i22 = 0;
                    this.f44168d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f44168d, 0);
                } catch (Exception e11) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            } else if (i18 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (Build.VERSION.SDK_INT >= 34) {
                    a.a(surfaceView);
                }
                this.f44168d = surfaceView;
            } else {
                try {
                    int i28 = L3.s.f16426a;
                    this.f44168d = (View) L3.s.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e12) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e12);
                }
            }
            z17 = false;
            this.f44168d.setLayoutParams(layoutParams);
            this.f44168d.setOnClickListener(bVar);
            i22 = 0;
            this.f44168d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f44168d, 0);
        } else {
            i22 = 0;
            this.f44168d = null;
            z17 = false;
        }
        this.f44169e = z17;
        if (Build.VERSION.SDK_INT == 34) {
            new c(i22);
        }
        this.f44170f = (ImageView) findViewById(R.id.exo_image);
        this.f44183s = i16;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            obj = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: x4.b
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method2, Object[] objArr) {
                    PlayerView.b(PlayerView.this, method2, objArr);
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            obj = null;
            method = null;
        }
        this.f44177m = cls;
        this.f44178n = method;
        this.f44179o = obj;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f44171g = imageView2;
        this.f44182r = (!z16 || i21 == 0 || imageView2 == null) ? i22 : i21;
        if (i15 != 0) {
            this.f44184t = androidx.core.content.a.getDrawable(getContext(), i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f44172h = subtitleView;
        if (subtitleView != null) {
            subtitleView.b();
            subtitleView.c();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.f44173i = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f44185u = i14;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f44174j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        d dVar = (d) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (dVar != null) {
            this.f44175k = dVar;
        } else if (findViewById3 != null) {
            d dVar2 = new d(context, attributeSet);
            this.f44175k = dVar2;
            dVar2.setId(R.id.exo_controller);
            dVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(dVar2, indexOfChild);
        } else {
            this.f44175k = null;
        }
        d dVar3 = this.f44175k;
        this.f44187w = dVar3 != null ? i12 : i22;
        this.f44190z = z12;
        this.f44188x = z13;
        this.f44189y = z14;
        this.f44181q = (!z11 || dVar3 == null) ? i22 : 1;
        if (dVar3 != null) {
            dVar3.e0();
            this.f44175k.Y(this.f44165a);
        }
        if (z11) {
            setClickable(true);
        }
        I();
    }
}
