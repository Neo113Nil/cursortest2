package androidx.media3.ui;

import Aw.ViewOnClickListenerC2448a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.d;
import androidx.media3.ui.y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import ch.C5834e;
import com.google.common.collect.AbstractC5880y;
import j3.AbstractC7252H;
import j3.C7253I;
import j3.C7254J;
import j3.C7255K;
import j3.C7256L;
import j3.C7259a;
import j3.C7272n;
import j3.y;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import m3.N;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public final class d extends FrameLayout {

    /* renamed from: Y0, reason: collision with root package name */
    private static final float[] f44254Y0;

    /* renamed from: A, reason: collision with root package name */
    private final ImageView f44255A;

    /* renamed from: A0, reason: collision with root package name */
    private final String f44256A0;

    /* renamed from: B, reason: collision with root package name */
    private final ImageView f44257B;

    /* renamed from: B0, reason: collision with root package name */
    private final Drawable f44258B0;

    /* renamed from: C, reason: collision with root package name */
    private final ImageView f44259C;

    /* renamed from: C0, reason: collision with root package name */
    private final Drawable f44260C0;

    /* renamed from: D, reason: collision with root package name */
    private final ImageView f44261D;

    /* renamed from: D0, reason: collision with root package name */
    private final String f44262D0;

    /* renamed from: E, reason: collision with root package name */
    private final View f44263E;

    /* renamed from: E0, reason: collision with root package name */
    private final String f44264E0;

    /* renamed from: F, reason: collision with root package name */
    private final View f44265F;

    /* renamed from: F0, reason: collision with root package name */
    private final Drawable f44266F0;

    /* renamed from: G, reason: collision with root package name */
    private final View f44267G;

    /* renamed from: G0, reason: collision with root package name */
    private final Drawable f44268G0;

    /* renamed from: H, reason: collision with root package name */
    private final TextView f44269H;

    /* renamed from: H0, reason: collision with root package name */
    private final String f44270H0;

    /* renamed from: I, reason: collision with root package name */
    private final TextView f44271I;

    /* renamed from: I0, reason: collision with root package name */
    private final String f44272I0;

    /* renamed from: J, reason: collision with root package name */
    private final y f44273J;

    /* renamed from: J0, reason: collision with root package name */
    private j3.y f44274J0;

    /* renamed from: K, reason: collision with root package name */
    private final StringBuilder f44275K;

    /* renamed from: K0, reason: collision with root package name */
    private boolean f44276K0;

    /* renamed from: L, reason: collision with root package name */
    private final Formatter f44277L;

    /* renamed from: L0, reason: collision with root package name */
    private boolean f44278L0;

    /* renamed from: M, reason: collision with root package name */
    private final AbstractC7252H.b f44279M;

    /* renamed from: M0, reason: collision with root package name */
    private boolean f44280M0;

    /* renamed from: N, reason: collision with root package name */
    private final AbstractC7252H.c f44281N;

    /* renamed from: N0, reason: collision with root package name */
    private boolean f44282N0;

    /* renamed from: O, reason: collision with root package name */
    private final MW.a f44283O;

    /* renamed from: O0, reason: collision with root package name */
    private int f44284O0;

    /* renamed from: P, reason: collision with root package name */
    private final Drawable f44285P;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f44286P0;

    /* renamed from: Q, reason: collision with root package name */
    private final Drawable f44287Q;

    /* renamed from: Q0, reason: collision with root package name */
    private int f44288Q0;

    /* renamed from: R, reason: collision with root package name */
    private final Drawable f44289R;

    /* renamed from: R0, reason: collision with root package name */
    private int f44290R0;

    /* renamed from: S, reason: collision with root package name */
    private final Drawable f44291S;

    /* renamed from: S0, reason: collision with root package name */
    private long[] f44292S0;

    /* renamed from: T0, reason: collision with root package name */
    private boolean[] f44293T0;

    /* renamed from: U0, reason: collision with root package name */
    private long[] f44294U0;

    /* renamed from: V0, reason: collision with root package name */
    private boolean[] f44295V0;

    /* renamed from: W0, reason: collision with root package name */
    private long f44296W0;

    /* renamed from: X0, reason: collision with root package name */
    private boolean f44297X0;

    /* renamed from: a, reason: collision with root package name */
    private final v f44298a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f44299b;

    /* renamed from: c, reason: collision with root package name */
    private final b f44300c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<?> f44301d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f44302e;

    /* renamed from: f, reason: collision with root package name */
    private final Method f44303f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f44304g;

    /* renamed from: h, reason: collision with root package name */
    private final Method f44305h;

    /* renamed from: i, reason: collision with root package name */
    private final Method f44306i;

    /* renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArrayList<j> f44307j;

    /* renamed from: k, reason: collision with root package name */
    private final RecyclerView f44308k;

    /* renamed from: l, reason: collision with root package name */
    private final e f44309l;

    /* renamed from: m, reason: collision with root package name */
    private final c f44310m;

    /* renamed from: n, reason: collision with root package name */
    private final g f44311n;

    /* renamed from: o, reason: collision with root package name */
    private final a f44312o;

    /* renamed from: p, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.c f44313p;

    /* renamed from: q, reason: collision with root package name */
    private final PopupWindow f44314q;

    /* renamed from: r, reason: collision with root package name */
    private final int f44315r;

    /* renamed from: r0, reason: collision with root package name */
    private final Drawable f44316r0;

    /* renamed from: s, reason: collision with root package name */
    private final ImageView f44317s;

    /* renamed from: s0, reason: collision with root package name */
    private final String f44318s0;

    /* renamed from: t, reason: collision with root package name */
    private final ImageView f44319t;

    /* renamed from: t0, reason: collision with root package name */
    private final String f44320t0;

    /* renamed from: u, reason: collision with root package name */
    private final ImageView f44321u;

    /* renamed from: u0, reason: collision with root package name */
    private final String f44322u0;

    /* renamed from: v, reason: collision with root package name */
    private final View f44323v;

    /* renamed from: v0, reason: collision with root package name */
    private final Drawable f44324v0;

    /* renamed from: w, reason: collision with root package name */
    private final View f44325w;

    /* renamed from: w0, reason: collision with root package name */
    private final Drawable f44326w0;

    /* renamed from: x, reason: collision with root package name */
    private final TextView f44327x;

    /* renamed from: x0, reason: collision with root package name */
    private final float f44328x0;

    /* renamed from: y, reason: collision with root package name */
    private final TextView f44329y;

    /* renamed from: y0, reason: collision with root package name */
    private final float f44330y0;

    /* renamed from: z, reason: collision with root package name */
    private final ImageView f44331z;

    /* renamed from: z0, reason: collision with root package name */
    private final String f44332z0;

    /* loaded from: classes8.dex */
    private final class a extends i {
        a() {
            super();
        }

        private boolean j(C7255K c7255k) {
            for (int i11 = 0; i11 < this.f44353a.size(); i11++) {
                if (c7255k.f68973D.containsKey(this.f44353a.get(i11).f44350a.a())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.ui.d.i
        public final void h(f fVar) {
            fVar.f44347a.setText(R.string.exo_track_selection_auto);
            j3.y yVar = d.this.f44274J0;
            yVar.getClass();
            fVar.f44348b.setVisibility(j(yVar.m()) ? 4 : 0);
            fVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar = d.this;
                    if (dVar.f44274J0 == null || !dVar.f44274J0.l(29)) {
                        return;
                    }
                    C7255K m11 = dVar.f44274J0.m();
                    j3.y yVar2 = dVar.f44274J0;
                    int i11 = N.f74289a;
                    yVar2.h(m11.a().G(1).Q(1, false).F());
                    dVar.f44309l.g(1, dVar.getResources().getString(R.string.exo_track_selection_auto));
                    dVar.f44314q.dismiss();
                }
            });
        }

        @Override // androidx.media3.ui.d.i
        public final void i(String str) {
            d.this.f44309l.g(1, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void k(List<h> list) {
            this.f44353a = list;
            d dVar = d.this;
            j3.y yVar = dVar.f44274J0;
            yVar.getClass();
            C7255K m11 = yVar.m();
            if (((AbstractCollection) list).isEmpty()) {
                dVar.f44309l.g(1, dVar.getResources().getString(R.string.exo_track_selection_none));
                return;
            }
            if (!j(m11)) {
                dVar.f44309l.g(1, dVar.getResources().getString(R.string.exo_track_selection_auto));
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                h hVar = (h) list.get(i11);
                if (hVar.f44350a.f(hVar.f44351b)) {
                    dVar.f44309l.g(1, hVar.f44352c);
                    return;
                }
            }
        }
    }

    /* loaded from: classes8.dex */
    private final class b implements y.c, y.a, View.OnClickListener, PopupWindow.OnDismissListener {
        b() {
        }

        @Override // j3.y.c
        public final void Q(j3.y yVar, y.b bVar) {
            boolean b11 = bVar.b(4, 5, 13);
            d dVar = d.this;
            if (b11) {
                dVar.q0();
            }
            if (bVar.b(4, 5, 7, 13)) {
                dVar.r0();
            }
            if (bVar.b(8, 13)) {
                dVar.s0();
            }
            if (bVar.b(9, 13)) {
                dVar.u0();
            }
            if (bVar.b(8, 9, 11, 0, 16, 17, 13)) {
                dVar.p0();
            }
            if (bVar.b(11, 0, 13)) {
                dVar.v0();
            }
            if (bVar.b(12, 13)) {
                d.X(dVar);
            }
            if (bVar.b(2, 13)) {
                dVar.w0();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d dVar = d.this;
            j3.y yVar = dVar.f44274J0;
            if (yVar == null) {
                return;
            }
            dVar.f44298a.K();
            if (dVar.f44319t == view) {
                if (yVar.l(9)) {
                    yVar.I();
                    return;
                }
                return;
            }
            if (dVar.f44317s == view) {
                if (yVar.l(7)) {
                    yVar.C();
                    return;
                }
                return;
            }
            if (dVar.f44323v == view) {
                if (yVar.P() == 4 || !yVar.l(12)) {
                    return;
                }
                yVar.y();
                return;
            }
            if (dVar.f44325w == view) {
                if (yVar.l(11)) {
                    yVar.V();
                    return;
                }
                return;
            }
            if (dVar.f44321u == view) {
                if (N.c0(yVar, dVar.f44280M0)) {
                    N.I(yVar);
                    return;
                } else {
                    N.H(yVar);
                    return;
                }
            }
            if (dVar.f44331z == view) {
                if (yVar.l(15)) {
                    yVar.S(C5834e.a(yVar.w(), dVar.f44290R0));
                    return;
                }
                return;
            }
            if (dVar.f44255A == view) {
                if (yVar.l(14)) {
                    yVar.o(!yVar.U());
                    return;
                }
                return;
            }
            if (dVar.f44263E == view) {
                dVar.f44298a.J();
                dVar.a0(dVar.f44309l, dVar.f44263E);
                return;
            }
            if (dVar.f44265F == view) {
                dVar.f44298a.J();
                dVar.a0(dVar.f44310m, dVar.f44265F);
            } else if (dVar.f44267G == view) {
                dVar.f44298a.J();
                dVar.a0(dVar.f44312o, dVar.f44267G);
            } else if (dVar.f44257B == view) {
                dVar.f44298a.J();
                dVar.a0(dVar.f44311n, dVar.f44257B);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            d dVar = d.this;
            if (dVar.f44297X0) {
                dVar.f44298a.K();
            }
        }

        @Override // androidx.media3.ui.y.a
        public final void onScrubMove(y yVar, long j11) {
            d dVar = d.this;
            if (dVar.f44271I != null) {
                dVar.f44271I.setText(N.E(dVar.f44275K, dVar.f44277L, j11));
            }
            if (dVar.g0(dVar.f44274J0)) {
                d.q(dVar, dVar.f44274J0, j11);
            }
        }

        @Override // androidx.media3.ui.y.a
        public final void onScrubStart(y yVar, long j11) {
            d dVar = d.this;
            dVar.f44282N0 = true;
            if (dVar.f44271I != null) {
                dVar.f44271I.setText(N.E(dVar.f44275K, dVar.f44277L, j11));
            }
            dVar.f44298a.J();
            if (dVar.f44274J0 == null || !dVar.f44286P0) {
                return;
            }
            if (d.l(dVar, dVar.f44274J0)) {
                try {
                    Method method = dVar.f44302e;
                    method.getClass();
                    method.invoke(dVar.f44274J0, Boolean.TRUE);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e11) {
                    throw new RuntimeException(e11);
                }
            }
            if (d.n(dVar, dVar.f44274J0)) {
                try {
                    Method method2 = dVar.f44305h;
                    method2.getClass();
                    method2.invoke(dVar.f44274J0, Boolean.TRUE);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e12) {
                    throw new RuntimeException(e12);
                }
            }
            StringBuilder sb2 = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
            j3.y yVar2 = dVar.f44274J0;
            yVar2.getClass();
            sb2.append(yVar2.getClass());
            m3.s.f("PlayerControlView", sb2.toString());
        }

        @Override // androidx.media3.ui.y.a
        public final void onScrubStop(y yVar, long j11, boolean z11) {
            d dVar = d.this;
            dVar.f44282N0 = false;
            if (dVar.f44274J0 != null) {
                if (!z11) {
                    d.q(dVar, dVar.f44274J0, j11);
                }
                if (d.l(dVar, dVar.f44274J0)) {
                    try {
                        Method method = dVar.f44302e;
                        method.getClass();
                        method.invoke(dVar.f44274J0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e11) {
                        throw new RuntimeException(e11);
                    }
                } else if (d.n(dVar, dVar.f44274J0)) {
                    try {
                        Method method2 = dVar.f44305h;
                        method2.getClass();
                        method2.invoke(dVar.f44274J0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e12) {
                        throw new RuntimeException(e12);
                    }
                }
            }
            dVar.f44298a.K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    final class c extends RecyclerView.g<f> {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f44335a;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f44336b;

        /* renamed from: c, reason: collision with root package name */
        private int f44337c;

        public c(String[] strArr, float[] fArr) {
            this.f44335a = strArr;
            this.f44336b = fArr;
        }

        public static /* synthetic */ void f(c cVar, int i11) {
            int i12 = cVar.f44337c;
            d dVar = d.this;
            if (i11 != i12) {
                d.N(dVar, cVar.f44336b[i11]);
            }
            dVar.f44314q.dismiss();
        }

        public final String g() {
            return this.f44335a[this.f44337c];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final int getItemCount() {
            return this.f44335a.length;
        }

        public final void h(float f7) {
            int i11 = 0;
            float f11 = Float.MAX_VALUE;
            int i12 = 0;
            while (true) {
                float[] fArr = this.f44336b;
                if (i11 >= fArr.length) {
                    this.f44337c = i12;
                    return;
                }
                float abs = Math.abs(f7 - fArr[i11]);
                if (abs < f11) {
                    i12 = i11;
                    f11 = abs;
                }
                i11++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void onBindViewHolder(f fVar, final int i11) {
            f fVar2 = fVar;
            String[] strArr = this.f44335a;
            if (i11 < strArr.length) {
                fVar2.f44347a.setText(strArr[i11]);
            }
            if (i11 == this.f44337c) {
                fVar2.itemView.setSelected(true);
                fVar2.f44348b.setVisibility(0);
            } else {
                fVar2.itemView.setSelected(false);
                fVar2.f44348b.setVisibility(4);
            }
            fVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.c.f(d.c.this, i11);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final f onCreateViewHolder(ViewGroup viewGroup, int i11) {
            return new f(LayoutInflater.from(d.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.ui.d$d, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    final class C0807d extends RecyclerView.C {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f44339a;

        /* renamed from: b, reason: collision with root package name */
        private final TextView f44340b;

        /* renamed from: c, reason: collision with root package name */
        private final ImageView f44341c;

        public C0807d(View view) {
            super(view);
            this.f44339a = (TextView) view.findViewById(R.id.exo_main_text);
            this.f44340b = (TextView) view.findViewById(R.id.exo_sub_text);
            this.f44341c = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d.C0807d.this.i();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i() {
            d.M(d.this, getBindingAdapterPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    class e extends RecyclerView.g<C0807d> {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f44343a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f44344b;

        /* renamed from: c, reason: collision with root package name */
        private final Drawable[] f44345c;

        public e(String[] strArr, Drawable[] drawableArr) {
            this.f44343a = strArr;
            this.f44344b = new String[strArr.length];
            this.f44345c = drawableArr;
        }

        private boolean h(int i11) {
            d dVar = d.this;
            if (dVar.f44274J0 == null) {
                return false;
            }
            if (i11 == 0) {
                return dVar.f44274J0.l(13);
            }
            if (i11 != 1) {
                return true;
            }
            return dVar.f44274J0.l(30) && dVar.f44274J0.l(29);
        }

        public final boolean f() {
            return h(1) || h(0);
        }

        public final void g(int i11, String str) {
            this.f44344b[i11] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final int getItemCount() {
            return this.f44343a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final long getItemId(int i11) {
            return i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void onBindViewHolder(C0807d c0807d, int i11) {
            C0807d c0807d2 = c0807d;
            if (h(i11)) {
                c0807d2.itemView.setLayoutParams(new RecyclerView.p(-1, -2));
            } else {
                c0807d2.itemView.setLayoutParams(new RecyclerView.p(0, 0));
            }
            c0807d2.f44339a.setText(this.f44343a[i11]);
            String[] strArr = this.f44344b;
            if (strArr[i11] == null) {
                c0807d2.f44340b.setVisibility(8);
            } else {
                c0807d2.f44340b.setText(strArr[i11]);
            }
            Drawable[] drawableArr = this.f44345c;
            if (drawableArr[i11] == null) {
                c0807d2.f44341c.setVisibility(8);
            } else {
                c0807d2.f44341c.setImageDrawable(drawableArr[i11]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final C0807d onCreateViewHolder(ViewGroup viewGroup, int i11) {
            d dVar = d.this;
            return dVar.new C0807d(LayoutInflater.from(dVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    /* loaded from: classes8.dex */
    private static class f extends RecyclerView.C {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f44347a;

        /* renamed from: b, reason: collision with root package name */
        public final View f44348b;

        public f(View view) {
            super(view);
            this.f44347a = (TextView) view.findViewById(R.id.exo_text);
            this.f44348b = view.findViewById(R.id.exo_check);
        }
    }

    /* loaded from: classes8.dex */
    private final class g extends i {
        g() {
            super();
        }

        @Override // androidx.media3.ui.d.i, androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void onBindViewHolder(f fVar, int i11) {
            super.onBindViewHolder(fVar, i11);
            if (i11 > 0) {
                h hVar = this.f44353a.get(i11 - 1);
                fVar.f44348b.setVisibility(hVar.f44350a.f(hVar.f44351b) ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.d.i
        public final void h(f fVar) {
            fVar.f44347a.setText(R.string.exo_track_selection_none);
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= this.f44353a.size()) {
                    break;
                }
                h hVar = this.f44353a.get(i12);
                if (hVar.f44350a.f(hVar.f44351b)) {
                    i11 = 4;
                    break;
                }
                i12++;
            }
            fVar.f44348b.setVisibility(i11);
            fVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar = d.this;
                    if (dVar.f44274J0 == null || !dVar.f44274J0.l(29)) {
                        return;
                    }
                    dVar.f44274J0.h(dVar.f44274J0.m().a().G(3).L().N().P().F());
                    dVar.f44314q.dismiss();
                }
            });
        }

        @Override // androidx.media3.ui.d.i
        public final void i(String str) {
        }

        public final void j(List<h> list) {
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                h hVar = list.get(i11);
                if (hVar.f44350a.f(hVar.f44351b)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            d dVar = d.this;
            if (dVar.f44257B != null) {
                dVar.f44257B.setImageDrawable(z11 ? dVar.f44258B0 : dVar.f44260C0);
                dVar.f44257B.setContentDescription(z11 ? dVar.f44262D0 : dVar.f44264E0);
            }
            this.f44353a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final C7256L.a f44350a;

        /* renamed from: b, reason: collision with root package name */
        public final int f44351b;

        /* renamed from: c, reason: collision with root package name */
        public final String f44352c;

        public h(C7256L c7256l, int i11, int i12, String str) {
            this.f44350a = c7256l.a().get(i11);
            this.f44351b = i12;
            this.f44352c = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    abstract class i extends RecyclerView.g<f> {

        /* renamed from: a, reason: collision with root package name */
        protected List<h> f44353a = new ArrayList();

        protected i() {
        }

        protected final void f() {
            this.f44353a = Collections.EMPTY_LIST;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: g */
        public void onBindViewHolder(f fVar, int i11) {
            final j3.y yVar = d.this.f44274J0;
            if (yVar == null) {
                return;
            }
            if (i11 == 0) {
                h(fVar);
                return;
            }
            final h hVar = this.f44353a.get(i11 - 1);
            final C7253I a11 = hVar.f44350a.a();
            boolean z11 = yVar.m().f68973D.get(a11) != null && hVar.f44350a.f(hVar.f44351b);
            fVar.f44347a.setText(hVar.f44352c);
            fVar.f44348b.setVisibility(z11 ? 0 : 4);
            fVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.i iVar = d.i.this;
                    iVar.getClass();
                    j3.y yVar2 = yVar;
                    if (yVar2.l(29)) {
                        C7255K.b a12 = yVar2.m().a();
                        d.h hVar2 = hVar;
                        yVar2.h(a12.M(new C7254J(a11, AbstractC5880y.B(Integer.valueOf(hVar2.f44351b)))).Q(hVar2.f44350a.c(), false).F());
                        iVar.i(hVar2.f44352c);
                        d.this.f44314q.dismiss();
                    }
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final int getItemCount() {
            if (this.f44353a.isEmpty()) {
                return 0;
            }
            return this.f44353a.size() + 1;
        }

        protected abstract void h(f fVar);

        protected abstract void i(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final f onCreateViewHolder(ViewGroup viewGroup, int i11) {
            return new f(LayoutInflater.from(d.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    @Deprecated
    public interface j {
        void q();
    }

    static {
        j3.r.a("media3.ui");
        f44254Y0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:28:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02fe  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        Class cls;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i22;
        int i23;
        boolean z18;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls2;
        Method method4;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        View findViewById;
        View findViewById2;
        View findViewById3;
        y yVar;
        y yVar2;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        ImageView imageView7;
        View view;
        ImageView imageView8;
        View view2;
        ImageView imageView9;
        ImageView imageView10;
        ImageView imageView11;
        boolean z19;
        Class cls3 = Boolean.TYPE;
        this.f44280M0 = true;
        this.f44284O0 = 5000;
        this.f44290R0 = 0;
        this.f44288Q0 = m.e.DEFAULT_DRAG_ANIMATION_DURATION;
        int i24 = R.layout.exo_player_control_view;
        int i25 = R.drawable.exo_styled_controls_play;
        int i26 = R.drawable.exo_styled_controls_next;
        int i27 = R.drawable.exo_styled_controls_previous;
        int i28 = R.drawable.exo_styled_controls_simple_rewind;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, x4.c.f105021d, 0, 0);
            try {
                i24 = obtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                i25 = obtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                int resourceId = obtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                i26 = obtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                int resourceId2 = obtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                int resourceId3 = obtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                i28 = obtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId4 = obtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                cls = cls3;
                int resourceId5 = obtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId6 = obtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                int resourceId7 = obtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                i17 = obtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                int resourceId8 = obtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                int resourceId9 = obtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                int resourceId10 = obtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                int resourceId11 = obtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                int resourceId12 = obtainStyledAttributes.getResourceId(42, R.drawable.exo_styled_controls_vr);
                this.f44284O0 = obtainStyledAttributes.getInt(32, this.f44284O0);
                this.f44290R0 = obtainStyledAttributes.getInt(19, 0);
                boolean z21 = obtainStyledAttributes.getBoolean(29, true);
                boolean z22 = obtainStyledAttributes.getBoolean(26, true);
                boolean z23 = obtainStyledAttributes.getBoolean(28, true);
                boolean z24 = obtainStyledAttributes.getBoolean(27, true);
                boolean z25 = obtainStyledAttributes.getBoolean(30, false);
                boolean z26 = obtainStyledAttributes.getBoolean(31, false);
                boolean z27 = obtainStyledAttributes.getBoolean(33, false);
                this.f44286P0 = obtainStyledAttributes.getBoolean(39, false);
                this.f44288Q0 = N.i(obtainStyledAttributes.getInt(38, this.f44288Q0), 16, 1000);
                boolean z28 = obtainStyledAttributes.getBoolean(2, true);
                obtainStyledAttributes.recycle();
                z11 = z28;
                i27 = resourceId3;
                i21 = resourceId10;
                i23 = resourceId11;
                z17 = z21;
                z18 = z22;
                z14 = z25;
                z12 = z27;
                i15 = resourceId6;
                i13 = resourceId;
                i14 = resourceId2;
                i16 = resourceId7;
                i22 = resourceId12;
                z13 = z26;
                i19 = resourceId9;
                z16 = z23;
                i11 = resourceId5;
                i18 = resourceId8;
                z15 = z24;
                i12 = resourceId4;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            cls = cls3;
            i11 = R.drawable.exo_styled_controls_fullscreen_enter;
            i12 = R.drawable.exo_styled_controls_fullscreen_exit;
            i13 = R.drawable.exo_styled_controls_pause;
            i14 = R.drawable.exo_styled_controls_simple_fastforward;
            i15 = R.drawable.exo_styled_controls_repeat_off;
            i16 = R.drawable.exo_styled_controls_repeat_one;
            i17 = R.drawable.exo_styled_controls_repeat_all;
            i18 = R.drawable.exo_styled_controls_shuffle_on;
            i19 = R.drawable.exo_styled_controls_shuffle_off;
            i21 = R.drawable.exo_styled_controls_subtitle_on;
            z11 = true;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = true;
            z16 = true;
            z17 = true;
            i22 = R.drawable.exo_styled_controls_vr;
            i23 = R.drawable.exo_styled_controls_subtitle_off;
            z18 = true;
        }
        int i29 = i25;
        int i31 = i26;
        int i32 = i28;
        LayoutInflater.from(context).inflate(i24, this);
        setDescendantFocusability(262144);
        this.f44300c = new b();
        this.f44307j = new CopyOnWriteArrayList<>();
        this.f44279M = new AbstractC7252H.b();
        this.f44281N = new AbstractC7252H.c();
        StringBuilder sb2 = new StringBuilder();
        this.f44275K = sb2;
        this.f44277L = new Formatter(sb2, Locale.getDefault());
        this.f44292S0 = new long[0];
        this.f44293T0 = new boolean[0];
        this.f44294U0 = new long[0];
        this.f44295V0 = new boolean[0];
        this.f44283O = new MW.a(this, 5);
        try {
            method = ExoPlayer.class.getMethod("setScrubbingModeEnabled", cls);
            try {
                method2 = ExoPlayer.class.getMethod("isScrubbingModeEnabled", new Class[0]);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
                Method method5 = method;
                this.f44301d = ExoPlayer.class;
                this.f44302e = method5;
                this.f44303f = method2;
                cls2 = Class.forName("androidx.media3.transformer.CompositionPlayer");
                method3 = cls2.getMethod("setScrubbingModeEnabled", cls);
                try {
                    method4 = cls2.getMethod("isScrubbingModeEnabled", new Class[0]);
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    method4 = null;
                    this.f44304g = cls2;
                    this.f44305h = method3;
                    this.f44306i = method4;
                    this.f44269H = (TextView) findViewById(R.id.exo_duration);
                    this.f44271I = (TextView) findViewById(R.id.exo_position);
                    imageView = (ImageView) findViewById(R.id.exo_subtitle);
                    this.f44257B = imageView;
                    if (imageView != null) {
                    }
                    imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
                    this.f44259C = imageView2;
                    ViewOnClickListenerC2448a viewOnClickListenerC2448a = new ViewOnClickListenerC2448a(this, 18);
                    if (imageView2 != null) {
                    }
                    imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
                    this.f44261D = imageView3;
                    ViewOnClickListenerC2448a viewOnClickListenerC2448a2 = new ViewOnClickListenerC2448a(this, 18);
                    if (imageView3 != null) {
                    }
                    findViewById = findViewById(R.id.exo_settings);
                    this.f44263E = findViewById;
                    if (findViewById != null) {
                    }
                    findViewById2 = findViewById(R.id.exo_playback_speed);
                    this.f44265F = findViewById2;
                    if (findViewById2 != null) {
                    }
                    findViewById3 = findViewById(R.id.exo_audio_track);
                    this.f44267G = findViewById3;
                    if (findViewById3 != null) {
                    }
                    yVar = (y) findViewById(R.id.exo_progress);
                    View findViewById4 = findViewById(R.id.exo_progress_placeholder);
                    if (yVar != null) {
                    }
                    yVar2 = this.f44273J;
                    if (yVar2 != null) {
                    }
                    Resources resources = context.getResources();
                    this.f44299b = resources;
                    imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
                    this.f44321u = imageView4;
                    if (imageView4 != null) {
                    }
                    imageView5 = (ImageView) findViewById(R.id.exo_prev);
                    this.f44317s = imageView5;
                    if (imageView5 != null) {
                    }
                    imageView6 = (ImageView) findViewById(R.id.exo_next);
                    this.f44319t = imageView6;
                    if (imageView6 != null) {
                    }
                    Typeface e11 = androidx.core.content.res.g.e(R.font.roboto_medium_numbers, context);
                    imageView7 = (ImageView) findViewById(R.id.exo_rew);
                    TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
                    if (imageView7 != null) {
                    }
                    view = this.f44325w;
                    if (view != null) {
                    }
                    imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
                    TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
                    if (imageView8 != null) {
                    }
                    view2 = this.f44323v;
                    if (view2 != null) {
                    }
                    imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
                    this.f44331z = imageView9;
                    if (imageView9 != null) {
                    }
                    imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
                    this.f44255A = imageView10;
                    if (imageView10 != null) {
                    }
                    this.f44328x0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                    this.f44330y0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                    imageView11 = (ImageView) findViewById(R.id.exo_vr);
                    if (imageView11 != null) {
                    }
                    v vVar = new v(this);
                    this.f44298a = vVar;
                    vVar.L(z11);
                    e eVar = new e(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
                    this.f44309l = eVar;
                    this.f44315r = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
                    RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
                    this.f44308k = recyclerView;
                    recyclerView.setAdapter(eVar);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                    PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
                    this.f44314q = popupWindow;
                    popupWindow.setOnDismissListener(this.f44300c);
                    this.f44297X0 = true;
                    this.f44313p = new ru.ozon.android.messenger.framework.analytics.c(getResources());
                    this.f44258B0 = resources.getDrawable(i21, context.getTheme());
                    this.f44260C0 = resources.getDrawable(i23, context.getTheme());
                    this.f44262D0 = resources.getString(R.string.exo_controls_cc_enabled_description);
                    this.f44264E0 = resources.getString(R.string.exo_controls_cc_disabled_description);
                    this.f44311n = new g();
                    this.f44312o = new a();
                    this.f44310m = new c(resources.getStringArray(R.array.exo_controls_playback_speeds), f44254Y0);
                    this.f44285P = resources.getDrawable(i29, context.getTheme());
                    this.f44287Q = resources.getDrawable(i13, context.getTheme());
                    this.f44266F0 = resources.getDrawable(i12, context.getTheme());
                    this.f44268G0 = resources.getDrawable(i11, context.getTheme());
                    this.f44289R = resources.getDrawable(i15, context.getTheme());
                    this.f44291S = resources.getDrawable(i16, context.getTheme());
                    this.f44316r0 = resources.getDrawable(i17, context.getTheme());
                    this.f44324v0 = resources.getDrawable(i18, context.getTheme());
                    this.f44326w0 = resources.getDrawable(i19, context.getTheme());
                    this.f44270H0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
                    this.f44272I0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
                    this.f44318s0 = resources.getString(R.string.exo_controls_repeat_off_description);
                    this.f44320t0 = resources.getString(R.string.exo_controls_repeat_one_description);
                    this.f44322u0 = resources.getString(R.string.exo_controls_repeat_all_description);
                    this.f44332z0 = resources.getString(R.string.exo_controls_shuffle_on_description);
                    this.f44256A0 = resources.getString(R.string.exo_controls_shuffle_off_description);
                    vVar.M((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
                    vVar.M(this.f44323v, z18);
                    vVar.M(this.f44325w, z17);
                    vVar.M(imageView5, z16);
                    vVar.M(imageView6, z15);
                    vVar.M(imageView10, z14);
                    vVar.M(this.f44257B, z13);
                    vVar.M(imageView11, z12);
                    vVar.M(imageView9, this.f44290R0 != 0 ? true : z19);
                    addOnLayoutChangeListener(new LW.c(this, 1));
                }
                this.f44304g = cls2;
                this.f44305h = method3;
                this.f44306i = method4;
                this.f44269H = (TextView) findViewById(R.id.exo_duration);
                this.f44271I = (TextView) findViewById(R.id.exo_position);
                imageView = (ImageView) findViewById(R.id.exo_subtitle);
                this.f44257B = imageView;
                if (imageView != null) {
                }
                imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
                this.f44259C = imageView2;
                ViewOnClickListenerC2448a viewOnClickListenerC2448a3 = new ViewOnClickListenerC2448a(this, 18);
                if (imageView2 != null) {
                }
                imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
                this.f44261D = imageView3;
                ViewOnClickListenerC2448a viewOnClickListenerC2448a22 = new ViewOnClickListenerC2448a(this, 18);
                if (imageView3 != null) {
                }
                findViewById = findViewById(R.id.exo_settings);
                this.f44263E = findViewById;
                if (findViewById != null) {
                }
                findViewById2 = findViewById(R.id.exo_playback_speed);
                this.f44265F = findViewById2;
                if (findViewById2 != null) {
                }
                findViewById3 = findViewById(R.id.exo_audio_track);
                this.f44267G = findViewById3;
                if (findViewById3 != null) {
                }
                yVar = (y) findViewById(R.id.exo_progress);
                View findViewById42 = findViewById(R.id.exo_progress_placeholder);
                if (yVar != null) {
                }
                yVar2 = this.f44273J;
                if (yVar2 != null) {
                }
                Resources resources2 = context.getResources();
                this.f44299b = resources2;
                imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
                this.f44321u = imageView4;
                if (imageView4 != null) {
                }
                imageView5 = (ImageView) findViewById(R.id.exo_prev);
                this.f44317s = imageView5;
                if (imageView5 != null) {
                }
                imageView6 = (ImageView) findViewById(R.id.exo_next);
                this.f44319t = imageView6;
                if (imageView6 != null) {
                }
                Typeface e112 = androidx.core.content.res.g.e(R.font.roboto_medium_numbers, context);
                imageView7 = (ImageView) findViewById(R.id.exo_rew);
                TextView textView3 = (TextView) findViewById(R.id.exo_rew_with_amount);
                if (imageView7 != null) {
                }
                view = this.f44325w;
                if (view != null) {
                }
                imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
                TextView textView22 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
                if (imageView8 != null) {
                }
                view2 = this.f44323v;
                if (view2 != null) {
                }
                imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
                this.f44331z = imageView9;
                if (imageView9 != null) {
                }
                imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
                this.f44255A = imageView10;
                if (imageView10 != null) {
                }
                this.f44328x0 = resources2.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                this.f44330y0 = resources2.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                imageView11 = (ImageView) findViewById(R.id.exo_vr);
                if (imageView11 != null) {
                }
                v vVar2 = new v(this);
                this.f44298a = vVar2;
                vVar2.L(z11);
                e eVar2 = new e(new String[]{resources2.getString(R.string.exo_controls_playback_speed), resources2.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources2.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources2.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
                this.f44309l = eVar2;
                this.f44315r = resources2.getDimensionPixelSize(R.dimen.exo_settings_offset);
                RecyclerView recyclerView2 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
                this.f44308k = recyclerView2;
                recyclerView2.setAdapter(eVar2);
                recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
                PopupWindow popupWindow2 = new PopupWindow((View) recyclerView2, -2, -2, true);
                this.f44314q = popupWindow2;
                popupWindow2.setOnDismissListener(this.f44300c);
                this.f44297X0 = true;
                this.f44313p = new ru.ozon.android.messenger.framework.analytics.c(getResources());
                this.f44258B0 = resources2.getDrawable(i21, context.getTheme());
                this.f44260C0 = resources2.getDrawable(i23, context.getTheme());
                this.f44262D0 = resources2.getString(R.string.exo_controls_cc_enabled_description);
                this.f44264E0 = resources2.getString(R.string.exo_controls_cc_disabled_description);
                this.f44311n = new g();
                this.f44312o = new a();
                this.f44310m = new c(resources2.getStringArray(R.array.exo_controls_playback_speeds), f44254Y0);
                this.f44285P = resources2.getDrawable(i29, context.getTheme());
                this.f44287Q = resources2.getDrawable(i13, context.getTheme());
                this.f44266F0 = resources2.getDrawable(i12, context.getTheme());
                this.f44268G0 = resources2.getDrawable(i11, context.getTheme());
                this.f44289R = resources2.getDrawable(i15, context.getTheme());
                this.f44291S = resources2.getDrawable(i16, context.getTheme());
                this.f44316r0 = resources2.getDrawable(i17, context.getTheme());
                this.f44324v0 = resources2.getDrawable(i18, context.getTheme());
                this.f44326w0 = resources2.getDrawable(i19, context.getTheme());
                this.f44270H0 = resources2.getString(R.string.exo_controls_fullscreen_exit_description);
                this.f44272I0 = resources2.getString(R.string.exo_controls_fullscreen_enter_description);
                this.f44318s0 = resources2.getString(R.string.exo_controls_repeat_off_description);
                this.f44320t0 = resources2.getString(R.string.exo_controls_repeat_one_description);
                this.f44322u0 = resources2.getString(R.string.exo_controls_repeat_all_description);
                this.f44332z0 = resources2.getString(R.string.exo_controls_shuffle_on_description);
                this.f44256A0 = resources2.getString(R.string.exo_controls_shuffle_off_description);
                vVar2.M((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
                vVar2.M(this.f44323v, z18);
                vVar2.M(this.f44325w, z17);
                vVar2.M(imageView5, z16);
                vVar2.M(imageView6, z15);
                vVar2.M(imageView10, z14);
                vVar2.M(this.f44257B, z13);
                vVar2.M(imageView11, z12);
                vVar2.M(imageView9, this.f44290R0 != 0 ? true : z19);
                addOnLayoutChangeListener(new LW.c(this, 1));
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused3) {
            method = null;
        }
        Method method52 = method;
        this.f44301d = ExoPlayer.class;
        this.f44302e = method52;
        this.f44303f = method2;
        try {
            cls2 = Class.forName("androidx.media3.transformer.CompositionPlayer");
            try {
                method3 = cls2.getMethod("setScrubbingModeEnabled", cls);
                method4 = cls2.getMethod("isScrubbingModeEnabled", new Class[0]);
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                method3 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            method3 = null;
            cls2 = null;
        }
        this.f44304g = cls2;
        this.f44305h = method3;
        this.f44306i = method4;
        this.f44269H = (TextView) findViewById(R.id.exo_duration);
        this.f44271I = (TextView) findViewById(R.id.exo_position);
        imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.f44257B = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.f44300c);
        }
        imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f44259C = imageView2;
        ViewOnClickListenerC2448a viewOnClickListenerC2448a32 = new ViewOnClickListenerC2448a(this, 18);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(viewOnClickListenerC2448a32);
        }
        imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f44261D = imageView3;
        ViewOnClickListenerC2448a viewOnClickListenerC2448a222 = new ViewOnClickListenerC2448a(this, 18);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(viewOnClickListenerC2448a222);
        }
        findViewById = findViewById(R.id.exo_settings);
        this.f44263E = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this.f44300c);
        }
        findViewById2 = findViewById(R.id.exo_playback_speed);
        this.f44265F = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this.f44300c);
        }
        findViewById3 = findViewById(R.id.exo_audio_track);
        this.f44267G = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this.f44300c);
        }
        yVar = (y) findViewById(R.id.exo_progress);
        View findViewById422 = findViewById(R.id.exo_progress_placeholder);
        if (yVar != null) {
            this.f44273J = yVar;
        } else if (findViewById422 != null) {
            androidx.media3.ui.b bVar = new androidx.media3.ui.b(context, attributeSet, R.style.ExoStyledControls_TimeBar);
            bVar.setId(R.id.exo_progress);
            bVar.setLayoutParams(findViewById422.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById422.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById422);
            viewGroup.removeView(findViewById422);
            viewGroup.addView(bVar, indexOfChild);
            this.f44273J = bVar;
        } else {
            this.f44273J = null;
        }
        yVar2 = this.f44273J;
        if (yVar2 != null) {
            yVar2.addListener(this.f44300c);
        }
        Resources resources22 = context.getResources();
        this.f44299b = resources22;
        imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.f44321u = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(this.f44300c);
        }
        imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.f44317s = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources22.getDrawable(i27, context.getTheme()));
            imageView5.setOnClickListener(this.f44300c);
        }
        imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.f44319t = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources22.getDrawable(i31, context.getTheme()));
            imageView6.setOnClickListener(this.f44300c);
        }
        Typeface e1122 = androidx.core.content.res.g.e(R.font.roboto_medium_numbers, context);
        imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView32 = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources22.getDrawable(i32, context.getTheme()));
            this.f44325w = imageView7;
            this.f44329y = null;
        } else if (textView32 != null) {
            textView32.setTypeface(e1122);
            this.f44329y = textView32;
            this.f44325w = textView32;
        } else {
            this.f44329y = null;
            this.f44325w = null;
        }
        view = this.f44325w;
        if (view != null) {
            view.setOnClickListener(this.f44300c);
        }
        imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView222 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources22.getDrawable(i14, context.getTheme()));
            this.f44323v = imageView8;
            this.f44327x = null;
        } else if (textView222 != null) {
            textView222.setTypeface(e1122);
            this.f44327x = textView222;
            this.f44323v = textView222;
        } else {
            this.f44327x = null;
            this.f44323v = null;
        }
        view2 = this.f44323v;
        if (view2 != null) {
            view2.setOnClickListener(this.f44300c);
        }
        imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f44331z = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(this.f44300c);
        }
        imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f44255A = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.f44300c);
        }
        this.f44328x0 = resources22.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f44330y0 = resources22.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        imageView11 = (ImageView) findViewById(R.id.exo_vr);
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources22.getDrawable(i22, context.getTheme()));
            z19 = false;
            o0(imageView11, false);
        } else {
            z19 = false;
        }
        v vVar22 = new v(this);
        this.f44298a = vVar22;
        vVar22.L(z11);
        e eVar22 = new e(new String[]{resources22.getString(R.string.exo_controls_playback_speed), resources22.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources22.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources22.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.f44309l = eVar22;
        this.f44315r = resources22.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView22 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f44308k = recyclerView22;
        recyclerView22.setAdapter(eVar22);
        recyclerView22.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow22 = new PopupWindow((View) recyclerView22, -2, -2, true);
        this.f44314q = popupWindow22;
        popupWindow22.setOnDismissListener(this.f44300c);
        this.f44297X0 = true;
        this.f44313p = new ru.ozon.android.messenger.framework.analytics.c(getResources());
        this.f44258B0 = resources22.getDrawable(i21, context.getTheme());
        this.f44260C0 = resources22.getDrawable(i23, context.getTheme());
        this.f44262D0 = resources22.getString(R.string.exo_controls_cc_enabled_description);
        this.f44264E0 = resources22.getString(R.string.exo_controls_cc_disabled_description);
        this.f44311n = new g();
        this.f44312o = new a();
        this.f44310m = new c(resources22.getStringArray(R.array.exo_controls_playback_speeds), f44254Y0);
        this.f44285P = resources22.getDrawable(i29, context.getTheme());
        this.f44287Q = resources22.getDrawable(i13, context.getTheme());
        this.f44266F0 = resources22.getDrawable(i12, context.getTheme());
        this.f44268G0 = resources22.getDrawable(i11, context.getTheme());
        this.f44289R = resources22.getDrawable(i15, context.getTheme());
        this.f44291S = resources22.getDrawable(i16, context.getTheme());
        this.f44316r0 = resources22.getDrawable(i17, context.getTheme());
        this.f44324v0 = resources22.getDrawable(i18, context.getTheme());
        this.f44326w0 = resources22.getDrawable(i19, context.getTheme());
        this.f44270H0 = resources22.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f44272I0 = resources22.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f44318s0 = resources22.getString(R.string.exo_controls_repeat_off_description);
        this.f44320t0 = resources22.getString(R.string.exo_controls_repeat_one_description);
        this.f44322u0 = resources22.getString(R.string.exo_controls_repeat_all_description);
        this.f44332z0 = resources22.getString(R.string.exo_controls_shuffle_on_description);
        this.f44256A0 = resources22.getString(R.string.exo_controls_shuffle_off_description);
        vVar22.M((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        vVar22.M(this.f44323v, z18);
        vVar22.M(this.f44325w, z17);
        vVar22.M(imageView5, z16);
        vVar22.M(imageView6, z15);
        vVar22.M(imageView10, z14);
        vVar22.M(this.f44257B, z13);
        vVar22.M(imageView11, z12);
        vVar22.M(imageView9, this.f44290R0 != 0 ? true : z19);
        addOnLayoutChangeListener(new LW.c(this, 1));
    }

    static void M(d dVar, int i11) {
        View view = dVar.f44263E;
        if (i11 == 0) {
            view.getClass();
            dVar.a0(dVar.f44310m, view);
        } else if (i11 != 1) {
            dVar.f44314q.dismiss();
        } else {
            view.getClass();
            dVar.a0(dVar.f44312o, view);
        }
    }

    static void N(d dVar, float f7) {
        j3.y yVar = dVar.f44274J0;
        if (yVar == null || !yVar.l(13)) {
            return;
        }
        j3.y yVar2 = dVar.f44274J0;
        yVar2.b(new j3.x(f7, yVar2.d().f69346b));
    }

    static void X(d dVar) {
        j3.y yVar = dVar.f44274J0;
        if (yVar == null) {
            return;
        }
        float f7 = yVar.d().f69345a;
        c cVar = dVar.f44310m;
        cVar.h(f7);
        String g10 = cVar.g();
        e eVar = dVar.f44309l;
        eVar.g(0, g10);
        dVar.o0(dVar.f44263E, eVar.f());
    }

    public static void a(d dVar, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        dVar.getClass();
        int i19 = i14 - i12;
        int i21 = i18 - i16;
        if (i13 - i11 == i17 - i15 && i19 == i21) {
            return;
        }
        PopupWindow popupWindow = dVar.f44314q;
        if (popupWindow.isShowing()) {
            dVar.t0();
            int width = dVar.getWidth() - popupWindow.getWidth();
            int i22 = dVar.f44315r;
            popupWindow.update(view, width - i22, (-popupWindow.getHeight()) - i22, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(RecyclerView.g<?> gVar, View view) {
        this.f44308k.setAdapter(gVar);
        t0();
        this.f44297X0 = false;
        PopupWindow popupWindow = this.f44314q;
        popupWindow.dismiss();
        this.f44297X0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i11 = this.f44315r;
        popupWindow.showAsDropDown(view, width - i11, (-popupWindow.getHeight()) - i11);
    }

    private AbstractC5880y<h> b0(C7256L c7256l, int i11) {
        AbstractC5880y.a aVar = new AbstractC5880y.a();
        AbstractC5880y<C7256L.a> a11 = c7256l.a();
        for (int i12 = 0; i12 < a11.size(); i12++) {
            C7256L.a aVar2 = a11.get(i12);
            if (aVar2.c() == i11) {
                for (int i13 = 0; i13 < aVar2.f69035a; i13++) {
                    if (aVar2.g(i13)) {
                        C7272n b11 = aVar2.b(i13);
                        if ((b11.f69117e & 2) == 0) {
                            aVar.e(new h(c7256l, i12, i13, this.f44313p.d(b11)));
                        }
                    }
                }
            }
        }
        return aVar.j();
    }

    public static void c(d dVar) {
        boolean z11 = dVar.f44276K0;
        boolean z12 = !z11;
        if (z11 == z12) {
            return;
        }
        dVar.f44276K0 = z12;
        String str = dVar.f44272I0;
        Drawable drawable = dVar.f44268G0;
        String str2 = dVar.f44270H0;
        Drawable drawable2 = dVar.f44266F0;
        ImageView imageView = dVar.f44259C;
        if (imageView != null) {
            if (z11) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            }
        }
        ImageView imageView2 = dVar.f44261D;
        if (imageView2 == null) {
            return;
        }
        if (z11) {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        } else {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[Catch: InvocationTargetException -> 0x002e, IllegalAccessException -> 0x0030, TRY_LEAVE, TryCatch #2 {IllegalAccessException -> 0x0030, InvocationTargetException -> 0x002e, blocks: (B:29:0x0004, B:31:0x0008, B:5:0x0017, B:11:0x0034, B:13:0x0038, B:17:0x0047), top: B:28:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0017 A[Catch: InvocationTargetException -> 0x002e, IllegalAccessException -> 0x0030, TryCatch #2 {IllegalAccessException -> 0x0030, InvocationTargetException -> 0x002e, blocks: (B:29:0x0004, B:31:0x0008, B:5:0x0017, B:11:0x0034, B:13:0x0038, B:17:0x0047), top: B:28:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g0(j3.y yVar) {
        boolean z11;
        Class<?> cls;
        if (yVar != null) {
            try {
                Class<?> cls2 = this.f44301d;
                if (cls2 != null && cls2.isAssignableFrom(yVar.getClass())) {
                    z11 = true;
                    if (z11) {
                        Method method = this.f44303f;
                        method.getClass();
                        Object invoke = method.invoke(yVar, new Object[0]);
                        invoke.getClass();
                        if (!((Boolean) invoke).booleanValue()) {
                        }
                        return true;
                    }
                    if (yVar == null && (cls = this.f44304g) != null && cls.isAssignableFrom(yVar.getClass())) {
                        Method method2 = this.f44306i;
                        method2.getClass();
                        Object invoke2 = method2.invoke(yVar, new Object[0]);
                        invoke2.getClass();
                        if (((Boolean) invoke2).booleanValue()) {
                            return true;
                        }
                    }
                    return false;
                }
            } catch (IllegalAccessException e11) {
                e = e11;
                throw new RuntimeException(e);
            } catch (InvocationTargetException e12) {
                e = e12;
                throw new RuntimeException(e);
            }
        }
        z11 = false;
        if (z11) {
        }
        if (yVar == null && (cls = this.f44304g) != null && cls.isAssignableFrom(yVar.getClass())) {
        }
        return false;
    }

    static boolean l(d dVar, j3.y yVar) {
        if (yVar != null) {
            Class<?> cls = dVar.f44301d;
            return cls != null && cls.isAssignableFrom(yVar.getClass());
        }
        dVar.getClass();
        return false;
    }

    static boolean n(d dVar, j3.y yVar) {
        if (yVar != null) {
            Class<?> cls = dVar.f44304g;
            return cls != null && cls.isAssignableFrom(yVar.getClass());
        }
        dVar.getClass();
        return false;
    }

    private void o0(View view, boolean z11) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.f44328x0 : this.f44330y0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (h0() && this.f44278L0) {
            j3.y yVar = this.f44274J0;
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
            Resources resources = this.f44299b;
            View view = this.f44325w;
            if (z14) {
                j3.y yVar2 = this.f44274J0;
                int Y11 = (int) ((yVar2 != null ? yVar2.Y() : 5000L) / 1000);
                TextView textView = this.f44329y;
                if (textView != null) {
                    textView.setText(String.valueOf(Y11));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, Y11, Integer.valueOf(Y11)));
                }
            }
            View view2 = this.f44323v;
            if (z15) {
                j3.y yVar3 = this.f44274J0;
                int v11 = (int) ((yVar3 != null ? yVar3.v() : 15000L) / 1000);
                TextView textView2 = this.f44327x;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(v11));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, v11, Integer.valueOf(v11)));
                }
            }
            o0(this.f44317s, z13);
            o0(view, z14);
            o0(view2, z15);
            o0(this.f44319t, z12);
            y yVar4 = this.f44273J;
            if (yVar4 != null) {
                yVar4.setEnabled(z11);
            }
        }
    }

    static void q(d dVar, j3.y yVar, long j11) {
        dVar.getClass();
        if (yVar.l(5)) {
            yVar.seekTo(j11);
        }
        dVar.r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        ImageView imageView;
        if (h0() && this.f44278L0 && (imageView = this.f44321u) != null) {
            boolean c02 = N.c0(this.f44274J0, this.f44280M0);
            Drawable drawable = c02 ? this.f44285P : this.f44287Q;
            int i11 = c02 ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f44299b.getString(i11));
            o0(imageView, N.b0(this.f44274J0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        long j11;
        long j12;
        if (h0() && this.f44278L0) {
            j3.y yVar = this.f44274J0;
            if (yVar == null || !yVar.l(16)) {
                j11 = 0;
                j12 = 0;
            } else {
                j11 = yVar.O() + this.f44296W0;
                j12 = yVar.x() + this.f44296W0;
            }
            TextView textView = this.f44271I;
            if (textView != null && !this.f44282N0) {
                textView.setText(N.E(this.f44275K, this.f44277L, j11));
            }
            y yVar2 = this.f44273J;
            if (yVar2 != null) {
                yVar2.setPosition(j11);
                if (g0(yVar)) {
                    j12 = j11;
                }
                yVar2.setBufferedPosition(j12);
            }
            MW.a aVar = this.f44283O;
            removeCallbacks(aVar);
            int P11 = yVar == null ? 1 : yVar.P();
            if (yVar != null && yVar.isPlaying()) {
                long min = Math.min(yVar2 != null ? yVar2.getPreferredUpdateDelay() : 1000L, 1000 - (j11 % 1000));
                float f7 = yVar.d().f69345a;
                postDelayed(aVar, N.j(f7 > 0.0f ? (long) (min / f7) : 1000L, this.f44288Q0, 1000L));
            } else {
                if (P11 == 4 || P11 == 1) {
                    return;
                }
                postDelayed(aVar, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        ImageView imageView;
        if (h0() && this.f44278L0 && (imageView = this.f44331z) != null) {
            if (this.f44290R0 == 0) {
                o0(imageView, false);
                return;
            }
            j3.y yVar = this.f44274J0;
            String str = this.f44318s0;
            Drawable drawable = this.f44289R;
            if (yVar == null || !yVar.l(15)) {
                o0(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            o0(imageView, true);
            int w11 = yVar.w();
            if (w11 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (w11 == 1) {
                imageView.setImageDrawable(this.f44291S);
                imageView.setContentDescription(this.f44320t0);
            } else {
                if (w11 != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f44316r0);
                imageView.setContentDescription(this.f44322u0);
            }
        }
    }

    private void t0() {
        RecyclerView recyclerView = this.f44308k;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i11 = this.f44315r;
        int min = Math.min(recyclerView.getMeasuredWidth(), width - (i11 * 2));
        PopupWindow popupWindow = this.f44314q;
        popupWindow.setWidth(min);
        popupWindow.setHeight(Math.min(getHeight() - (i11 * 2), recyclerView.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        ImageView imageView;
        if (h0() && this.f44278L0 && (imageView = this.f44255A) != null) {
            j3.y yVar = this.f44274J0;
            if (!this.f44298a.z(imageView)) {
                o0(imageView, false);
                return;
            }
            String str = this.f44256A0;
            Drawable drawable = this.f44326w0;
            if (yVar == null || !yVar.l(14)) {
                o0(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            o0(imageView, true);
            if (yVar.U()) {
                drawable = this.f44324v0;
            }
            imageView.setImageDrawable(drawable);
            if (yVar.U()) {
                str = this.f44332z0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        long j11;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        j3.y yVar = this.f44274J0;
        if (yVar == null) {
            return;
        }
        long j12 = 0;
        this.f44296W0 = 0L;
        AbstractC7252H G11 = yVar.l(17) ? yVar.G() : AbstractC7252H.EMPTY;
        long j13 = -9223372036854775807L;
        if (G11.isEmpty()) {
            if (yVar.l(16)) {
                long q11 = yVar.q();
                if (q11 != -9223372036854775807L) {
                    j11 = N.Q(q11);
                    i11 = 0;
                }
            }
            j11 = 0;
            i11 = 0;
        } else {
            int R11 = yVar.R();
            int i14 = R11;
            long j14 = 0;
            i11 = 0;
            while (i14 <= R11) {
                if (i14 == R11) {
                    this.f44296W0 = N.g0(j14);
                }
                AbstractC7252H.c cVar = this.f44281N;
                G11.getWindow(i14, cVar);
                if (cVar.f68958m == j13) {
                    break;
                }
                int i15 = cVar.f68959n;
                while (i15 <= cVar.f68960o) {
                    AbstractC7252H.b bVar = this.f44279M;
                    G11.getPeriod(i15, bVar);
                    C7259a c7259a = bVar.f68943g;
                    c7259a.getClass();
                    long j15 = j12;
                    int i16 = 0;
                    while (i16 < c7259a.f69048a) {
                        bVar.d(i16);
                        long j16 = j13;
                        long j17 = bVar.f68941e;
                        if (j17 >= j15) {
                            long[] jArr = this.f44292S0;
                            i12 = R11;
                            if (i11 == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f44292S0 = Arrays.copyOf(jArr, length);
                                this.f44293T0 = Arrays.copyOf(this.f44293T0, length);
                            }
                            this.f44292S0[i11] = N.g0(j17 + j14);
                            boolean[] zArr = this.f44293T0;
                            C7259a.C1129a a11 = bVar.f68943g.a(i16);
                            int i17 = a11.f69050a;
                            if (i17 == -1) {
                                i13 = i16;
                                z12 = true;
                                z11 = true;
                            } else {
                                int i18 = 0;
                                while (i18 < i17) {
                                    int i19 = a11.f69054e[i18];
                                    i13 = i16;
                                    z11 = true;
                                    if (i19 == 0 || i19 == 1) {
                                        z12 = true;
                                        break;
                                    } else {
                                        i18++;
                                        i16 = i13;
                                    }
                                }
                                i13 = i16;
                                z11 = true;
                                z12 = false;
                            }
                            zArr[i11] = z12 ^ z11;
                            i11++;
                        } else {
                            i12 = R11;
                            i13 = i16;
                        }
                        i16 = i13 + 1;
                        j13 = j16;
                        R11 = i12;
                    }
                    i15++;
                    j12 = j15;
                }
                j14 += cVar.f68958m;
                i14++;
                j12 = j12;
                R11 = R11;
            }
            j11 = j14;
        }
        long g02 = N.g0(j11);
        TextView textView = this.f44269H;
        if (textView != null) {
            textView.setText(N.E(this.f44275K, this.f44277L, g02));
        }
        y yVar2 = this.f44273J;
        if (yVar2 != null) {
            yVar2.setDuration(g02);
            long[] jArr2 = this.f44294U0;
            int length2 = jArr2.length;
            int i21 = i11 + length2;
            long[] jArr3 = this.f44292S0;
            if (i21 > jArr3.length) {
                this.f44292S0 = Arrays.copyOf(jArr3, i21);
                this.f44293T0 = Arrays.copyOf(this.f44293T0, i21);
            }
            System.arraycopy(jArr2, 0, this.f44292S0, i11, length2);
            System.arraycopy(this.f44295V0, 0, this.f44293T0, i11, length2);
            yVar2.setAdGroupTimesMs(this.f44292S0, this.f44293T0, i21);
        }
        r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        g gVar = this.f44311n;
        gVar.f();
        a aVar = this.f44312o;
        aVar.f();
        j3.y yVar = this.f44274J0;
        ImageView imageView = this.f44257B;
        if (yVar != null && yVar.l(30) && this.f44274J0.l(29)) {
            C7256L i11 = this.f44274J0.i();
            aVar.k(b0(i11, 1));
            if (this.f44298a.z(imageView)) {
                gVar.j(b0(i11, 3));
            } else {
                gVar.j(AbstractC5880y.v());
            }
        }
        o0(imageView, gVar.getItemCount() > 0);
        o0(this.f44263E, this.f44309l.f());
    }

    @Deprecated
    public final void Y(j jVar) {
        jVar.getClass();
        this.f44307j.add(jVar);
    }

    public final boolean Z(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        j3.y yVar = this.f44274J0;
        if (yVar == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (yVar.P() == 4 || !yVar.l(12)) {
                return true;
            }
            yVar.y();
            return true;
        }
        if (keyCode == 89 && yVar.l(11)) {
            yVar.V();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            if (N.c0(yVar, this.f44280M0)) {
                N.I(yVar);
                return true;
            }
            N.H(yVar);
            return true;
        }
        if (keyCode == 87) {
            if (!yVar.l(9)) {
                return true;
            }
            yVar.I();
            return true;
        }
        if (keyCode == 88) {
            if (!yVar.l(7)) {
                return true;
            }
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

    public final int c0() {
        return this.f44284O0;
    }

    public final void d0() {
        this.f44298a.B();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return Z(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e0() {
        this.f44298a.C();
    }

    public final boolean f0() {
        return this.f44298a.D();
    }

    public final boolean h0() {
        return getVisibility() == 0;
    }

    final void i0() {
        Iterator<j> it = this.f44307j.iterator();
        while (it.hasNext()) {
            j next = it.next();
            getVisibility();
            next.q();
        }
    }

    final void j0() {
        ImageView imageView = this.f44321u;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public final void k0(j3.y yVar) {
        G10.a.h(Looper.myLooper() == Looper.getMainLooper());
        G10.a.c(yVar == null || yVar.H() == Looper.getMainLooper());
        j3.y yVar2 = this.f44274J0;
        if (yVar2 == yVar) {
            return;
        }
        b bVar = this.f44300c;
        if (yVar2 != null) {
            yVar2.j(bVar);
        }
        this.f44274J0 = yVar;
        if (yVar != null) {
            yVar.t(bVar);
        }
        n0();
    }

    public final void l0(int i11) {
        this.f44284O0 = i11;
        v vVar = this.f44298a;
        if (vVar.D()) {
            vVar.K();
        }
    }

    public final void m0() {
        this.f44298a.P();
    }

    final void n0() {
        q0();
        p0();
        s0();
        u0();
        w0();
        j3.y yVar = this.f44274J0;
        if (yVar != null) {
            float f7 = yVar.d().f69345a;
            c cVar = this.f44310m;
            cVar.h(f7);
            String g10 = cVar.g();
            e eVar = this.f44309l;
            eVar.g(0, g10);
            o0(this.f44263E, eVar.f());
        }
        v0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v vVar = this.f44298a;
        vVar.F();
        this.f44278L0 = true;
        if (vVar.D()) {
            vVar.K();
        }
        n0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v vVar = this.f44298a;
        vVar.G();
        this.f44278L0 = false;
        removeCallbacks(this.f44283O);
        vVar.J();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f44298a.H(i11, i12, i13, i14);
    }
}
