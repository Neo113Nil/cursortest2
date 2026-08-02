package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.y;
import androidx.recyclerview.widget.m;
import ch.C5834e;
import j3.AbstractC7252H;
import j3.C7259a;
import j3.y;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import jm.RunnableC7436a;
import m3.N;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class LegacyPlayerControlView extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    private final Drawable f44113A;

    /* renamed from: B, reason: collision with root package name */
    private final Drawable f44114B;

    /* renamed from: C, reason: collision with root package name */
    private final float f44115C;

    /* renamed from: D, reason: collision with root package name */
    private final float f44116D;

    /* renamed from: E, reason: collision with root package name */
    private final String f44117E;

    /* renamed from: F, reason: collision with root package name */
    private final String f44118F;

    /* renamed from: G, reason: collision with root package name */
    private j3.y f44119G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f44120H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f44121I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f44122J;

    /* renamed from: K, reason: collision with root package name */
    private int f44123K;

    /* renamed from: L, reason: collision with root package name */
    private int f44124L;

    /* renamed from: M, reason: collision with root package name */
    private int f44125M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f44126N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f44127O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f44128P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f44129Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f44130R;

    /* renamed from: S, reason: collision with root package name */
    private long f44131S;

    /* renamed from: a, reason: collision with root package name */
    private final a f44132a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f44133b;

    /* renamed from: c, reason: collision with root package name */
    private final View f44134c;

    /* renamed from: d, reason: collision with root package name */
    private final View f44135d;

    /* renamed from: e, reason: collision with root package name */
    private final View f44136e;

    /* renamed from: f, reason: collision with root package name */
    private final View f44137f;

    /* renamed from: g, reason: collision with root package name */
    private final View f44138g;

    /* renamed from: h, reason: collision with root package name */
    private final View f44139h;

    /* renamed from: i, reason: collision with root package name */
    private final ImageView f44140i;

    /* renamed from: j, reason: collision with root package name */
    private final ImageView f44141j;

    /* renamed from: k, reason: collision with root package name */
    private final View f44142k;

    /* renamed from: l, reason: collision with root package name */
    private final TextView f44143l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f44144m;

    /* renamed from: n, reason: collision with root package name */
    private final y f44145n;

    /* renamed from: o, reason: collision with root package name */
    private final StringBuilder f44146o;

    /* renamed from: p, reason: collision with root package name */
    private final Formatter f44147p;

    /* renamed from: q, reason: collision with root package name */
    private final AbstractC7252H.b f44148q;

    /* renamed from: r, reason: collision with root package name */
    private final AbstractC7252H.c f44149r;

    /* renamed from: r0, reason: collision with root package name */
    private long[] f44150r0;

    /* renamed from: s, reason: collision with root package name */
    private final RunnableC7436a f44151s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean[] f44152s0;

    /* renamed from: t, reason: collision with root package name */
    private final I.j f44153t;

    /* renamed from: t0, reason: collision with root package name */
    private long[] f44154t0;

    /* renamed from: u, reason: collision with root package name */
    private final Drawable f44155u;

    /* renamed from: u0, reason: collision with root package name */
    private boolean[] f44156u0;

    /* renamed from: v, reason: collision with root package name */
    private final Drawable f44157v;

    /* renamed from: v0, reason: collision with root package name */
    private long f44158v0;

    /* renamed from: w, reason: collision with root package name */
    private final Drawable f44159w;

    /* renamed from: w0, reason: collision with root package name */
    private long f44160w0;

    /* renamed from: x, reason: collision with root package name */
    private final String f44161x;

    /* renamed from: y, reason: collision with root package name */
    private final String f44162y;

    /* renamed from: z, reason: collision with root package name */
    private final String f44163z;

    private final class a implements y.c, y.a, View.OnClickListener {
        a() {
        }

        @Override // j3.y.c
        public final void Q(j3.y yVar, y.b bVar) {
            boolean b11 = bVar.b(4, 5);
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            if (b11) {
                legacyPlayerControlView.E();
            }
            if (bVar.b(4, 5, 7)) {
                legacyPlayerControlView.F();
            }
            if (bVar.a(8)) {
                legacyPlayerControlView.G();
            }
            if (bVar.a(9)) {
                legacyPlayerControlView.H();
            }
            if (bVar.b(8, 9, 11, 0, 13)) {
                legacyPlayerControlView.D();
            }
            if (bVar.b(11, 0)) {
                legacyPlayerControlView.I();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            j3.y yVar = legacyPlayerControlView.f44119G;
            if (yVar == null) {
                return;
            }
            if (legacyPlayerControlView.f44135d == view) {
                yVar.I();
                return;
            }
            if (legacyPlayerControlView.f44134c == view) {
                yVar.C();
                return;
            }
            if (legacyPlayerControlView.f44138g == view) {
                if (yVar.P() != 4) {
                    yVar.y();
                    return;
                }
                return;
            }
            if (legacyPlayerControlView.f44139h == view) {
                yVar.V();
                return;
            }
            if (legacyPlayerControlView.f44136e == view) {
                N.I(yVar);
                return;
            }
            if (legacyPlayerControlView.f44137f == view) {
                N.H(yVar);
            } else if (legacyPlayerControlView.f44140i == view) {
                yVar.S(C5834e.a(yVar.w(), legacyPlayerControlView.f44125M));
            } else if (legacyPlayerControlView.f44141j == view) {
                yVar.o(!yVar.U());
            }
        }

        @Override // androidx.media3.ui.y.a
        public final void onScrubMove(y yVar, long j11) {
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            if (legacyPlayerControlView.f44144m != null) {
                legacyPlayerControlView.f44144m.setText(N.E(legacyPlayerControlView.f44146o, legacyPlayerControlView.f44147p, j11));
            }
        }

        @Override // androidx.media3.ui.y.a
        public final void onScrubStart(y yVar, long j11) {
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            legacyPlayerControlView.f44122J = true;
            if (legacyPlayerControlView.f44144m != null) {
                legacyPlayerControlView.f44144m.setText(N.E(legacyPlayerControlView.f44146o, legacyPlayerControlView.f44147p, j11));
            }
        }

        @Override // androidx.media3.ui.y.a
        public final void onScrubStop(y yVar, long j11, boolean z11) {
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            legacyPlayerControlView.f44122J = false;
            if (z11 || legacyPlayerControlView.f44119G == null) {
                return;
            }
            LegacyPlayerControlView.e(legacyPlayerControlView, legacyPlayerControlView.f44119G, j11);
        }
    }

    public interface b {
        void q();
    }

    static {
        j3.r.a("media3.ui");
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f44121I = true;
        this.f44123K = 5000;
        this.f44125M = 0;
        this.f44124L = m.e.DEFAULT_DRAG_ANIMATION_DURATION;
        this.f44131S = -9223372036854775807L;
        this.f44126N = true;
        this.f44127O = true;
        this.f44128P = true;
        this.f44129Q = true;
        this.f44130R = false;
        int i11 = R.layout.exo_legacy_player_control_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, x4.c.f105020c, 0, 0);
            try {
                this.f44123K = obtainStyledAttributes.getInt(19, 5000);
                i11 = obtainStyledAttributes.getResourceId(5, R.layout.exo_legacy_player_control_view);
                this.f44125M = obtainStyledAttributes.getInt(8, 0);
                this.f44126N = obtainStyledAttributes.getBoolean(17, true);
                this.f44127O = obtainStyledAttributes.getBoolean(14, true);
                this.f44128P = obtainStyledAttributes.getBoolean(16, true);
                this.f44129Q = obtainStyledAttributes.getBoolean(15, true);
                this.f44130R = obtainStyledAttributes.getBoolean(18, false);
                this.f44124L = N.i(obtainStyledAttributes.getInt(20, this.f44124L), 16, 1000);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f44133b = new CopyOnWriteArrayList<>();
        this.f44148q = new AbstractC7252H.b();
        this.f44149r = new AbstractC7252H.c();
        StringBuilder sb2 = new StringBuilder();
        this.f44146o = sb2;
        this.f44147p = new Formatter(sb2, Locale.getDefault());
        this.f44150r0 = new long[0];
        this.f44152s0 = new boolean[0];
        this.f44154t0 = new long[0];
        this.f44156u0 = new boolean[0];
        a aVar = new a();
        this.f44132a = aVar;
        this.f44151s = new RunnableC7436a(this, 2);
        this.f44153t = new I.j(this, 4);
        LayoutInflater.from(context).inflate(i11, this);
        setDescendantFocusability(262144);
        y yVar = (y) findViewById(R.id.exo_progress);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (yVar != null) {
            this.f44145n = yVar;
        } else if (findViewById != null) {
            androidx.media3.ui.b bVar = new androidx.media3.ui.b(context, attributeSet, 0);
            bVar.setId(R.id.exo_progress);
            bVar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(bVar, indexOfChild);
            this.f44145n = bVar;
        } else {
            this.f44145n = null;
        }
        this.f44143l = (TextView) findViewById(R.id.exo_duration);
        this.f44144m = (TextView) findViewById(R.id.exo_position);
        y yVar2 = this.f44145n;
        if (yVar2 != null) {
            yVar2.addListener(aVar);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.f44136e = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(aVar);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.f44137f = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(aVar);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.f44134c = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(aVar);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.f44135d = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(aVar);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.f44139h = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(aVar);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.f44138g = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(aVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f44140i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(aVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f44141j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(aVar);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.f44142k = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setVisibility(8);
        }
        C(findViewById8, false, false);
        Resources resources = context.getResources();
        this.f44115C = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f44116D = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f44155u = resources.getDrawable(R.drawable.exo_legacy_controls_repeat_off, context.getTheme());
        this.f44157v = resources.getDrawable(R.drawable.exo_legacy_controls_repeat_one, context.getTheme());
        this.f44159w = resources.getDrawable(R.drawable.exo_legacy_controls_repeat_all, context.getTheme());
        this.f44113A = resources.getDrawable(R.drawable.exo_legacy_controls_shuffle_on, context.getTheme());
        this.f44114B = resources.getDrawable(R.drawable.exo_legacy_controls_shuffle_off, context.getTheme());
        this.f44161x = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f44162y = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f44163z = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f44117E = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f44118F = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.f44160w0 = -9223372036854775807L;
    }

    private void C(View view, boolean z11, boolean z12) {
        if (view == null) {
            return;
        }
        view.setEnabled(z12);
        view.setAlpha(z12 ? this.f44115C : this.f44116D);
        view.setVisibility(z11 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (y() && this.f44120H) {
            j3.y yVar = this.f44119G;
            if (yVar != null) {
                z11 = yVar.l(5);
                z13 = yVar.l(7);
                z14 = yVar.l(11);
                z15 = yVar.l(12);
                z12 = yVar.l(9);
            } else {
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
                z15 = false;
            }
            C(this.f44134c, this.f44128P, z13);
            C(this.f44139h, this.f44126N, z14);
            C(this.f44138g, this.f44127O, z15);
            C(this.f44135d, this.f44129Q, z12);
            y yVar2 = this.f44145n;
            if (yVar2 != null) {
                yVar2.setEnabled(z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        boolean z11;
        boolean z12;
        if (y() && this.f44120H) {
            boolean c02 = N.c0(this.f44119G, this.f44121I);
            View view = this.f44136e;
            if (view != null) {
                z11 = !c02 && view.isFocused();
                z12 = !c02 && view.isAccessibilityFocused();
                view.setVisibility(c02 ? 0 : 8);
            } else {
                z11 = false;
                z12 = false;
            }
            View view2 = this.f44137f;
            if (view2 != null) {
                z11 |= c02 && view2.isFocused();
                z12 |= c02 && view2.isAccessibilityFocused();
                view2.setVisibility(c02 ? 8 : 0);
            }
            if (z11) {
                boolean c03 = N.c0(this.f44119G, this.f44121I);
                if (c03 && view != null) {
                    view.requestFocus();
                } else if (!c03 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z12) {
                z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        long j11;
        long j12;
        if (y() && this.f44120H) {
            j3.y yVar = this.f44119G;
            if (yVar != null) {
                j11 = yVar.O() + this.f44158v0;
                j12 = yVar.x() + this.f44158v0;
            } else {
                j11 = 0;
                j12 = 0;
            }
            boolean z11 = j11 != this.f44160w0;
            this.f44160w0 = j11;
            TextView textView = this.f44144m;
            if (textView != null && !this.f44122J && z11) {
                textView.setText(N.E(this.f44146o, this.f44147p, j11));
            }
            y yVar2 = this.f44145n;
            if (yVar2 != null) {
                yVar2.setPosition(j11);
                yVar2.setBufferedPosition(j12);
            }
            RunnableC7436a runnableC7436a = this.f44151s;
            removeCallbacks(runnableC7436a);
            int P11 = yVar == null ? 1 : yVar.P();
            if (yVar != null && yVar.isPlaying()) {
                long min = Math.min(yVar2 != null ? yVar2.getPreferredUpdateDelay() : 1000L, 1000 - (j11 % 1000));
                float f7 = yVar.d().f69345a;
                postDelayed(runnableC7436a, N.j(f7 > 0.0f ? (long) (min / f7) : 1000L, this.f44124L, 1000L));
            } else {
                if (P11 == 4 || P11 == 1) {
                    return;
                }
                postDelayed(runnableC7436a, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        ImageView imageView;
        if (y() && this.f44120H && (imageView = this.f44140i) != null) {
            if (this.f44125M == 0) {
                C(imageView, false, false);
                return;
            }
            j3.y yVar = this.f44119G;
            String str = this.f44161x;
            Drawable drawable = this.f44155u;
            if (yVar == null) {
                C(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            C(imageView, true, true);
            int w11 = yVar.w();
            if (w11 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (w11 == 1) {
                imageView.setImageDrawable(this.f44157v);
                imageView.setContentDescription(this.f44162y);
            } else if (w11 == 2) {
                imageView.setImageDrawable(this.f44159w);
                imageView.setContentDescription(this.f44163z);
            }
            imageView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        ImageView imageView;
        if (y() && this.f44120H && (imageView = this.f44141j) != null) {
            j3.y yVar = this.f44119G;
            if (!this.f44130R) {
                C(imageView, false, false);
                return;
            }
            String str = this.f44118F;
            Drawable drawable = this.f44114B;
            if (yVar == null) {
                C(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            C(imageView, true, true);
            if (yVar.U()) {
                drawable = this.f44113A;
            }
            imageView.setImageDrawable(drawable);
            if (yVar.U()) {
                str = this.f44117E;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        long j11;
        int i11;
        int i12;
        boolean[] zArr;
        boolean z11;
        boolean z12;
        j3.y yVar = this.f44119G;
        if (yVar == null) {
            return;
        }
        long j12 = 0;
        this.f44158v0 = 0L;
        AbstractC7252H G11 = yVar.G();
        if (G11.isEmpty()) {
            j11 = 0;
            i11 = 0;
        } else {
            int R11 = yVar.R();
            int i13 = R11;
            long j13 = 0;
            i11 = 0;
            while (i13 <= R11) {
                if (i13 == R11) {
                    this.f44158v0 = N.g0(j13);
                }
                AbstractC7252H.c cVar = this.f44149r;
                G11.getWindow(i13, cVar);
                if (cVar.f68958m == -9223372036854775807L) {
                    break;
                }
                int i14 = cVar.f68959n;
                while (i14 <= cVar.f68960o) {
                    AbstractC7252H.b bVar = this.f44148q;
                    G11.getPeriod(i14, bVar);
                    C7259a c7259a = bVar.f68943g;
                    c7259a.getClass();
                    int i15 = 0;
                    while (i15 < c7259a.f69048a) {
                        bVar.d(i15);
                        long j14 = j12;
                        long j15 = bVar.f68941e;
                        if (j15 >= j14) {
                            long[] jArr = this.f44150r0;
                            i12 = R11;
                            if (i11 == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f44150r0 = Arrays.copyOf(jArr, length);
                                this.f44152s0 = Arrays.copyOf(this.f44152s0, length);
                            }
                            this.f44150r0[i11] = N.g0(j15 + j13);
                            boolean[] zArr2 = this.f44152s0;
                            C7259a.C1129a a11 = bVar.f68943g.a(i15);
                            int i16 = a11.f69050a;
                            if (i16 == -1) {
                                zArr = zArr2;
                                z12 = true;
                                z11 = true;
                            } else {
                                int i17 = 0;
                                while (i17 < i16) {
                                    int i18 = a11.f69054e[i17];
                                    zArr = zArr2;
                                    z11 = true;
                                    if (i18 == 0 || i18 == 1) {
                                        z12 = true;
                                        break;
                                    } else {
                                        i17++;
                                        zArr2 = zArr;
                                    }
                                }
                                zArr = zArr2;
                                z11 = true;
                                z12 = false;
                            }
                            zArr[i11] = z12 ^ z11;
                            i11++;
                        } else {
                            i12 = R11;
                        }
                        i15++;
                        R11 = i12;
                        j12 = 0;
                    }
                    i14++;
                    j12 = 0;
                }
                j13 += cVar.f68958m;
                i13++;
                R11 = R11;
                j12 = 0;
            }
            j11 = j13;
        }
        long g02 = N.g0(j11);
        TextView textView = this.f44143l;
        if (textView != null) {
            textView.setText(N.E(this.f44146o, this.f44147p, g02));
        }
        y yVar2 = this.f44145n;
        if (yVar2 != null) {
            yVar2.setDuration(g02);
            long[] jArr2 = this.f44154t0;
            int length2 = jArr2.length;
            int i19 = i11 + length2;
            long[] jArr3 = this.f44150r0;
            if (i19 > jArr3.length) {
                this.f44150r0 = Arrays.copyOf(jArr3, i19);
                this.f44152s0 = Arrays.copyOf(this.f44152s0, i19);
            }
            System.arraycopy(jArr2, 0, this.f44150r0, i11, length2);
            System.arraycopy(this.f44156u0, 0, this.f44152s0, i11, length2);
            yVar2.setAdGroupTimesMs(this.f44150r0, this.f44152s0, i19);
        }
        F();
    }

    static void e(LegacyPlayerControlView legacyPlayerControlView, j3.y yVar, long j11) {
        yVar.G();
        yVar.K(yVar.R(), j11);
        legacyPlayerControlView.F();
    }

    private void x() {
        I.j jVar = this.f44153t;
        removeCallbacks(jVar);
        int i11 = this.f44123K;
        if (i11 <= 0) {
            this.f44131S = -9223372036854775807L;
            return;
        }
        long j11 = i11;
        this.f44131S = SystemClock.uptimeMillis() + j11;
        if (this.f44120H) {
            postDelayed(jVar, j11);
        }
    }

    private void z() {
        View view;
        View view2;
        boolean c02 = N.c0(this.f44119G, this.f44121I);
        if (c02 && (view2 = this.f44136e) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (c02 || (view = this.f44137f) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    public final void A(j3.y yVar) {
        G10.a.h(Looper.myLooper() == Looper.getMainLooper());
        G10.a.c(yVar == null || yVar.H() == Looper.getMainLooper());
        j3.y yVar2 = this.f44119G;
        if (yVar2 == yVar) {
            return;
        }
        a aVar = this.f44132a;
        if (yVar2 != null) {
            yVar2.j(aVar);
        }
        this.f44119G = yVar;
        if (yVar != null) {
            yVar.t(aVar);
        }
        E();
        D();
        G();
        H();
        I();
    }

    public final void B() {
        View view;
        View view2;
        if (!y()) {
            setVisibility(0);
            Iterator<b> it = this.f44133b.iterator();
            while (it.hasNext()) {
                b next = it.next();
                getVisibility();
                next.q();
            }
            E();
            D();
            G();
            H();
            I();
            boolean c02 = N.c0(this.f44119G, this.f44121I);
            if (c02 && (view2 = this.f44136e) != null) {
                view2.requestFocus();
            } else if (!c02 && (view = this.f44137f) != null) {
                view.requestFocus();
            }
            z();
        }
        x();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        j3.y yVar = this.f44119G;
        if (yVar == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (yVar.P() == 4) {
                return true;
            }
            yVar.y();
            return true;
        }
        if (keyCode == 89) {
            yVar.V();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            if (N.c0(yVar, this.f44121I)) {
                N.I(yVar);
                return true;
            }
            N.H(yVar);
            return true;
        }
        if (keyCode == 87) {
            yVar.I();
            return true;
        }
        if (keyCode == 88) {
            yVar.C();
            return true;
        }
        if (keyCode == 126) {
            N.I(yVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        N.H(yVar);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f44153t);
        } else if (motionEvent.getAction() == 1) {
            x();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44120H = true;
        long j11 = this.f44131S;
        if (j11 != -9223372036854775807L) {
            long uptimeMillis = j11 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                w();
            } else {
                postDelayed(this.f44153t, uptimeMillis);
            }
        } else if (y()) {
            x();
        }
        E();
        D();
        G();
        H();
        I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44120H = false;
        removeCallbacks(this.f44151s);
        removeCallbacks(this.f44153t);
    }

    public final void w() {
        if (y()) {
            setVisibility(8);
            Iterator<b> it = this.f44133b.iterator();
            while (it.hasNext()) {
                b next = it.next();
                getVisibility();
                next.q();
            }
            removeCallbacks(this.f44151s);
            removeCallbacks(this.f44153t);
            this.f44131S = -9223372036854775807L;
        }
    }

    public final boolean y() {
        return getVisibility() == 0;
    }
}
