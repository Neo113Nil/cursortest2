package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import game.betting133.sports1xbet.R;
import java.util.HashMap;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.Wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0711Wd extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f12042A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f12043B;

    /* renamed from: k, reason: collision with root package name */
    public final C0733Ze f12044k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f12045l;

    /* renamed from: m, reason: collision with root package name */
    public final View f12046m;

    /* renamed from: n, reason: collision with root package name */
    public final L7 f12047n;

    /* renamed from: o, reason: collision with root package name */
    public final RunnableC0704Vd f12048o;

    /* renamed from: p, reason: collision with root package name */
    public final long f12049p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0690Td f12050q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12051r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12052s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12053t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12054u;

    /* renamed from: v, reason: collision with root package name */
    public long f12055v;

    /* renamed from: w, reason: collision with root package name */
    public long f12056w;

    /* renamed from: x, reason: collision with root package name */
    public String f12057x;

    /* renamed from: y, reason: collision with root package name */
    public String[] f12058y;

    /* renamed from: z, reason: collision with root package name */
    public Bitmap f12059z;

    public C0711Wd(Context context, C0733Ze c0733Ze, int i, boolean z3, L7 l7, C0804be c0804be) {
        super(context);
        AbstractC0690Td textureViewSurfaceTextureListenerC0683Sd;
        L7 l72;
        AbstractC0690Td abstractC0690Td;
        this.f12044k = c0733Ze;
        this.f12047n = l7;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12045l = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        m3.v.e(c0733Ze.f12501k.f12887q);
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = c0733Ze.f12501k;
        Object obj = viewTreeObserverOnGlobalLayoutListenerC0805bf.f12887q.f1749l;
        C0848ce c0848ce = new C0848ce(context, viewTreeObserverOnGlobalLayoutListenerC0805bf.f12885o, viewTreeObserverOnGlobalLayoutListenerC0805bf.b1(), l7, viewTreeObserverOnGlobalLayoutListenerC0805bf.f12866T);
        if (i == 3) {
            abstractC0690Td = new C0642Me(context, c0848ce);
            l72 = l7;
        } else {
            if (i == 2) {
                viewTreeObserverOnGlobalLayoutListenerC0805bf.M().getClass();
                textureViewSurfaceTextureListenerC0683Sd = new TextureViewSurfaceTextureListenerC1117ie(context, c0848ce, c0733Ze, z3, c0804be);
                l72 = l7;
            } else {
                l72 = l7;
                textureViewSurfaceTextureListenerC0683Sd = new TextureViewSurfaceTextureListenerC0683Sd(context, c0733Ze, z3, viewTreeObserverOnGlobalLayoutListenerC0805bf.M().b(), new C0848ce(context, viewTreeObserverOnGlobalLayoutListenerC0805bf.f12885o, viewTreeObserverOnGlobalLayoutListenerC0805bf.b1(), l7, viewTreeObserverOnGlobalLayoutListenerC0805bf.f12866T));
            }
            abstractC0690Td = textureViewSurfaceTextureListenerC0683Sd;
        }
        this.f12050q = abstractC0690Td;
        View view = new View(context);
        this.f12046m = view;
        view.setBackgroundColor(0);
        frameLayout.addView(abstractC0690Td, new FrameLayout.LayoutParams(-1, -1, 17));
        A7 a7 = F7.J;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) rVar.f5056c.a(F7.f8688G)).booleanValue()) {
            k();
        }
        this.f12042A = new ImageView(context);
        this.f12049p = ((Long) rVar.f5056c.a(F7.f8715L)).longValue();
        boolean booleanValue = ((Boolean) rVar.f5056c.a(F7.f8700I)).booleanValue();
        this.f12054u = booleanValue;
        l72.b("spinner_used", true != booleanValue ? "0" : "1");
        this.f12048o = new RunnableC0704Vd(this);
        abstractC0690Td.v(this);
    }

    public final void a(int i, int i5, int i6, int i7) {
        if (T2.G.o()) {
            StringBuilder w5 = AbstractC2107A.w("Set video bounds to x:", i, ";y:", i5, ";w:");
            w5.append(i6);
            w5.append(";h:");
            w5.append(i7);
            T2.G.m(w5.toString());
        }
        if (i6 == 0 || i7 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        layoutParams.setMargins(i, i5, 0, 0);
        this.f12045l.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void b() {
        C0733Ze c0733Ze = this.f12044k;
        if (c0733Ze.e() == null || !this.f12052s || this.f12053t) {
            return;
        }
        c0733Ze.e().getWindow().clearFlags(128);
        this.f12052s = false;
    }

    public final void c(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        AbstractC0690Td abstractC0690Td = this.f12050q;
        Integer A3 = abstractC0690Td != null ? abstractC0690Td.A() : null;
        if (A3 != null) {
            hashMap.put("playerId", A3.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f12044k.a("onVideoEvent", hashMap);
    }

    public final void d() {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8753R1)).booleanValue()) {
            this.f12048o.a();
        }
        c("ended", new String[0]);
        b();
    }

    public final void e() {
        c("pause", new String[0]);
        b();
        this.f12051r = false;
    }

    public final void f() {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8753R1)).booleanValue()) {
            RunnableC0704Vd runnableC0704Vd = this.f12048o;
            runnableC0704Vd.f11887l = false;
            T2.H h3 = T2.L.f5672l;
            h3.removeCallbacks(runnableC0704Vd);
            h3.postDelayed(runnableC0704Vd, 250L);
        }
        C0733Ze c0733Ze = this.f12044k;
        if (c0733Ze.e() != null && !this.f12052s) {
            boolean z3 = (c0733Ze.e().getWindow().getAttributes().flags & 128) != 0;
            this.f12053t = z3;
            if (!z3) {
                c0733Ze.e().getWindow().addFlags(128);
                this.f12052s = true;
            }
        }
        this.f12051r = true;
    }

    public final void finalize() {
        try {
            this.f12048o.a();
            AbstractC0690Td abstractC0690Td = this.f12050q;
            if (abstractC0690Td != null) {
                AbstractC0613Id.f.execute(new K4(12, abstractC0690Td));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        AbstractC0690Td abstractC0690Td = this.f12050q;
        if (abstractC0690Td != null && this.f12056w == 0) {
            c("canplaythrough", "duration", String.valueOf(abstractC0690Td.k() / 1000.0f), "videoWidth", String.valueOf(abstractC0690Td.n()), "videoHeight", String.valueOf(abstractC0690Td.l()));
        }
    }

    public final void h() {
        this.f12046m.setVisibility(4);
        T2.L.f5672l.post(new RunnableC0697Ud(this, 0));
    }

    public final void i() {
        if (this.f12043B && this.f12059z != null) {
            ImageView imageView = this.f12042A;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.f12059z);
                imageView.invalidate();
                FrameLayout frameLayout = this.f12045l;
                frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.f12048o.a();
        this.f12056w = this.f12055v;
        T2.L.f5672l.post(new RunnableC0697Ud(this, 2));
    }

    public final void j(int i, int i5) {
        if (this.f12054u) {
            A7 a7 = F7.K;
            Q2.r rVar = Q2.r.f5053d;
            int max = Math.max(i / ((Integer) rVar.f5056c.a(a7)).intValue(), 1);
            int max2 = Math.max(i5 / ((Integer) rVar.f5056c.a(a7)).intValue(), 1);
            Bitmap bitmap = this.f12059z;
            if (bitmap != null && bitmap.getWidth() == max && this.f12059z.getHeight() == max2) {
                return;
            }
            this.f12059z = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.f12043B = false;
        }
    }

    public final void k() {
        AbstractC0690Td abstractC0690Td = this.f12050q;
        if (abstractC0690Td == null) {
            return;
        }
        TextView textView = new TextView(abstractC0690Td.getContext());
        Resources b3 = P2.o.f4767B.f4774g.b();
        textView.setText(String.valueOf(b3 == null ? "AdMob - " : b3.getString(R.string.watermark_label_prefix)).concat(abstractC0690Td.r()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.f12045l;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void l() {
        AbstractC0690Td abstractC0690Td = this.f12050q;
        if (abstractC0690Td == null) {
            return;
        }
        long i = abstractC0690Td.i();
        if (this.f12055v == i || i <= 0) {
            return;
        }
        float f = i / 1000.0f;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8741P1)).booleanValue()) {
            String valueOf = String.valueOf(f);
            String valueOf2 = String.valueOf(abstractC0690Td.q());
            String valueOf3 = String.valueOf(abstractC0690Td.o());
            String valueOf4 = String.valueOf(abstractC0690Td.p());
            String valueOf5 = String.valueOf(abstractC0690Td.j());
            P2.o.f4767B.f4776j.getClass();
            c("timeupdate", "time", valueOf, "totalBytes", valueOf2, "qoeCachedBytes", valueOf3, "qoeLoadedBytes", valueOf4, "droppedFrames", valueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            c("timeupdate", "time", String.valueOf(f));
        }
        this.f12055v = i;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        RunnableC0704Vd runnableC0704Vd = this.f12048o;
        if (z3) {
            runnableC0704Vd.f11887l = false;
            T2.H h3 = T2.L.f5672l;
            h3.removeCallbacks(runnableC0704Vd);
            h3.postDelayed(runnableC0704Vd, 250L);
        } else {
            runnableC0704Vd.a();
            this.f12056w = this.f12055v;
        }
        T2.L.f5672l.post(new RunnableC0704Vd(this, z3, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z3 = false;
        RunnableC0704Vd runnableC0704Vd = this.f12048o;
        if (i == 0) {
            runnableC0704Vd.f11887l = false;
            T2.H h3 = T2.L.f5672l;
            h3.removeCallbacks(runnableC0704Vd);
            h3.postDelayed(runnableC0704Vd, 250L);
            z3 = true;
        } else {
            runnableC0704Vd.a();
            this.f12056w = this.f12055v;
        }
        T2.L.f5672l.post(new RunnableC0704Vd(this, z3, 1));
    }
}
