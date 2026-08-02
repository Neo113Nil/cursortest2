package com.facetec.sdk;

/* loaded from: classes8.dex */
final class ce {
    private final com.facetec.sdk.da b;
    com.facetec.sdk.ea c;
    private final java.lang.ref.WeakReference<com.facetec.sdk.bf> e;
    private final boolean j;

    /* renamed from: a, reason: collision with root package name */
    private final android.os.Handler f3460a = new android.os.Handler(android.os.Looper.getMainLooper());
    private boolean g = false;
    private boolean h = false;
    final com.facetec.sdk.ea.d d = new com.facetec.sdk.ea.d() { // from class: com.facetec.sdk.ce.3
        @Override // com.facetec.sdk.ea.d
        public final void d(com.facetec.sdk.ea.b bVar) {
            com.facetec.sdk.ce.b(com.facetec.sdk.ce.this, bVar.c.optString(com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, ""));
        }

        @Override // com.facetec.sdk.ea.d
        public final void b(com.facetec.sdk.eh ehVar, java.lang.String str) {
            com.facetec.sdk.ce.c(com.facetec.sdk.ce.this, ehVar, str);
        }
    };

    ce(com.facetec.sdk.da daVar, boolean z, android.app.Activity activity) {
        this.b = daVar;
        this.j = z;
        this.e = new java.lang.ref.WeakReference<>((com.facetec.sdk.bf) activity);
    }

    private void d(final boolean z) {
        d();
        this.b.e(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ce.this.j(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(boolean z) {
        int bh;
        int intValue;
        int i = 0;
        if (this.j) {
            bh = com.facetec.sdk.dm.bi();
            intValue = com.facetec.sdk.dm.bk();
        } else {
            bh = com.facetec.sdk.dm.bh();
            intValue = ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 397802709, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -397802690)).intValue();
        }
        android.app.Activity activity = this.b.getActivity();
        if (z && intValue != 0) {
            i = intValue;
        } else if (!z && bh != 0) {
            i = bh;
        }
        if (i != 0) {
            com.facetec.sdk.dp.d(this.b.f3492a, i, new com.facetec.sdk.ce.AnonymousClass2(), true);
            return;
        }
        this.b.f3492a.getLayoutParams().width = (int) (this.b.f3492a.getLayoutParams().height * 0.875f);
        this.b.f3492a.requestLayout();
        android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(activity, com.facetec.sdk.R.drawable.facetec_internal_nfc);
        if (drawable != null) {
            this.b.f3492a.setImageDrawable(drawable);
        }
    }

    /* renamed from: com.facetec.sdk.ce$2, reason: invalid class name */
    final class AnonymousClass2 extends androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback {
        AnonymousClass2() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
            com.facetec.sdk.ce.this.b.e(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.ce.AnonymousClass2.this.a();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            com.facetec.sdk.dp.a(com.facetec.sdk.ce.this.b.f3492a);
        }
    }

    private void d() {
        this.b.f3492a.setImageDrawable(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(boolean z) {
        g();
        if (z) {
            android.view.ViewPropertyAnimator listener = this.b.c.animate().alpha(0.0f).setDuration(500L).setListener(null);
            com.facetec.sdk.da daVar = this.b;
            java.util.Objects.requireNonNull(daVar);
            listener.withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.ce.this.u();
                }
            })).start();
            return;
        }
        this.b.j(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ce.this.y();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        java.lang.Object[] objArr = {com.facetec.sdk.cc.STARTING, java.lang.Boolean.valueOf(this.j)};
        c((java.lang.String) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1451195755, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1451195748));
        this.b.c.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) this.b.getActivity();
        if (faceTecSessionActivity == null) {
            return;
        }
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM && com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            this.b.g.setVisibility(0);
        } else if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d == com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            faceTecSessionActivity.x.setVisibility(0);
            faceTecSessionActivity.x.setAlpha(0.0f);
        }
        if (com.facetec.sdk.ea.e(this.b.getActivity()) && !com.facetec.sdk.ea.b(faceTecSessionActivity)) {
            e(true);
            faceTecSessionActivity.B();
            java.lang.Object[] objArr = {com.facetec.sdk.cc.DISABLED, java.lang.Boolean.valueOf(this.j)};
            c((java.lang.String) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1451195755, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1451195748));
        } else {
            java.lang.Object[] objArr2 = {com.facetec.sdk.cc.STARTING, java.lang.Boolean.valueOf(this.j)};
            c((java.lang.String) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1451195755, com.facetec.sdk.gj.AnonymousClass19.a(), objArr2, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1451195748));
        }
        this.b.d.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
        this.b.a().animate().alpha(1.0f).setDuration(500L).setListener(null).start();
        c(true);
        this.b.a(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ce.this.w();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        d(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        g();
        this.b.f3492a.animate().alpha(0.0f).setDuration(500L).setListener(null).start();
        android.view.ViewPropertyAnimator listener = this.b.c.animate().alpha(0.0f).setDuration(500L).setListener(null);
        com.facetec.sdk.da daVar = this.b;
        java.util.Objects.requireNonNull(daVar);
        listener.withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ce.this.s();
            }
        })).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        java.lang.Object[] objArr = {com.facetec.sdk.cc.WEAK_CONNECTION, java.lang.Boolean.valueOf(this.j)};
        c((java.lang.String) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1451195755, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1451195748));
        this.b.f3492a.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
        this.b.c.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
        c(true);
        this.b.a(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ce.this.p();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        d(false);
    }

    final void a() {
        this.b.e(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ce.this.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        e(true);
        c(false);
        this.b.f3492a.animate().alpha(0.0f).setDuration(500L).setListener(null).start();
        android.view.ViewPropertyAnimator listener = this.b.c.animate().alpha(0.0f).setDuration(500L).setListener(null);
        com.facetec.sdk.da daVar = this.b;
        java.util.Objects.requireNonNull(daVar);
        listener.withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ce.this.t();
            }
        })).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        java.lang.Object[] objArr = {com.facetec.sdk.cc.SCANNING, java.lang.Boolean.valueOf(this.j)};
        c((java.lang.String) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1451195755, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1451195748));
        this.b.f3492a.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
        this.b.c.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
        this.b.a(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ce.this.q();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        d(true);
    }

    private void b() {
        this.b.e(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ce.this.l();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        e(true);
        c(false);
        android.view.ViewPropertyAnimator listener = this.b.d.animate().alpha(0.0f).setDuration(500L).setListener(null);
        com.facetec.sdk.da daVar = this.b;
        java.util.Objects.requireNonNull(daVar);
        listener.withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ce.this.m();
            }
        })).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        d();
        this.b.a().setVisibility(8);
        this.b.b.setVisibility(0);
    }

    private void c(boolean z) {
        float f = z ? 1.0f : 0.0f;
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) this.b.getActivity();
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            this.b.g.animate().alpha(f).setDuration(500L).setListener(null).start();
            this.b.g.setEnabled(z);
        } else {
            faceTecSessionActivity.x.animate().alpha(f).setDuration(500L).setListener(null).start();
            faceTecSessionActivity.x.setEnabled(z);
        }
    }

    private void c(final java.lang.String str) {
        if (this.b.getActivity() == null) {
            return;
        }
        this.b.e(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ce.this.d(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(java.lang.String str) {
        this.b.c.setText(str);
    }

    private void e(boolean z) {
        this.g = z;
        if (z) {
            j();
            b(true);
            this.b.e(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.ce.this.k();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.b.j.animate().alpha(0.0f).setDuration(500L).setListener(null).start();
    }

    private void b(boolean z) {
        this.h = z;
        if (z) {
            j();
            this.b.e(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.ce.this.n();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.b.j.a(false, this.b.j.getAlpha() > 0.0f);
    }

    private void j() {
        android.os.Handler handler = this.f3460a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        if (this.h || this.b.j.getAlpha() != 1.0f || this.b.j.isEnabled()) {
            return;
        }
        this.b.j.a(true, this.b.j.getAlpha() > 0.0f);
    }

    private void g() {
        int i;
        if (((com.facetec.sdk.FaceTecSessionActivity) this.e.get()).r) {
            return;
        }
        if (this.b.j.getAlpha() == 1.0f) {
            i = 0;
        } else {
            i = com.facetec.sdk.bd.b ? com.adjust.sdk.Constants.CONNECTION_TIMEOUT_VERIFY : 6000;
        }
        j();
        e(false);
        b(false);
        android.os.Handler handler = this.f3460a;
        com.facetec.sdk.da daVar = this.b;
        java.util.Objects.requireNonNull(daVar);
        handler.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ce.this.h();
            }
        }), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        if (this.g) {
            return;
        }
        android.view.ViewPropertyAnimator listener = this.b.j.animate().alpha(1.0f).setDuration(this.b.j.getAlpha() == 1.0f ? 0 : 500).setListener(null);
        com.facetec.sdk.da daVar = this.b;
        java.util.Objects.requireNonNull(daVar);
        listener.withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ce.this.f();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.h) {
            return;
        }
        int i = (this.b.j.getAlpha() == 1.0f && this.b.j.isEnabled()) ? 0 : 4000;
        b(false);
        android.os.Handler handler = this.f3460a;
        com.facetec.sdk.da daVar = this.b;
        java.util.Objects.requireNonNull(daVar);
        handler.postDelayed(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ce.this.i();
            }
        }), i);
    }

    final void d(boolean z, final boolean z2) {
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) this.e.get();
        if (faceTecSessionActivity.s || faceTecSessionActivity.t) {
            return;
        }
        if (this.c == null) {
            this.c = com.facetec.sdk.ea.b(faceTecSessionActivity, faceTecSessionActivity.A, com.facetec.sdk.bd.j);
        }
        if (this.c == null) {
            a(false);
            return;
        }
        if (faceTecSessionActivity.G) {
            return;
        }
        try {
            com.facetec.sdk.ea eaVar = this.c;
            java.lang.Class<?> cls = faceTecSessionActivity.getClass();
            java.lang.String str = faceTecSessionActivity.l;
            android.app.Activity activity = eaVar.e.get();
            if (activity == null) {
                com.facetec.sdk.t.a(faceTecSessionActivity, com.facetec.sdk.eh.Unknown, "did not start");
                a(false);
                return;
            }
            eaVar.d = str;
            android.content.Intent intent = new android.content.Intent(activity, cls);
            intent.addFlags(536870912);
            eaVar.f3539a.enableForegroundDispatch(activity, android.app.PendingIntent.getActivity(activity, 0, intent, com.facetec.sdk.ea.e()), null, new java.lang.String[][]{new java.lang.String[]{"android.nfc.tech.IsoDep"}});
            if (z || this.b.getActivity() == null) {
                return;
            }
            this.b.e(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.ce.this.i(z2);
                }
            });
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            com.facetec.sdk.t.a(faceTecSessionActivity, com.facetec.sdk.eh.Unknown, e.getMessage());
            a(false);
        }
    }

    final void e() {
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) this.e.get();
        c();
        b();
        faceTecSessionActivity.s = true;
        faceTecSessionActivity.I = true;
        faceTecSessionActivity.D();
    }

    private void a(boolean z) {
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) this.e.get();
        b();
        faceTecSessionActivity.s = true;
        faceTecSessionActivity.d(z);
    }

    final void c() {
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) this.e.get();
        if (this.c != null) {
            if (!faceTecSessionActivity.G) {
                try {
                    this.c.c();
                } catch (java.lang.Exception unused) {
                }
            }
            this.c = null;
        }
    }

    static /* synthetic */ void b(com.facetec.sdk.ce ceVar, java.lang.String str) {
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) ceVar.e.get();
        faceTecSessionActivity.t = false;
        ceVar.c();
        if (!str.isEmpty()) {
            com.facetec.sdk.t.a(faceTecSessionActivity, com.facetec.sdk.eh.Unknown, str);
        }
        ceVar.a(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r3.p > 5) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void c(final com.facetec.sdk.ce ceVar, com.facetec.sdk.eh ehVar, java.lang.String str) {
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) ceVar.e.get();
        faceTecSessionActivity.t = false;
        ceVar.c();
        com.facetec.sdk.t.a(faceTecSessionActivity, ehVar, str);
        if (ehVar == com.facetec.sdk.eh.ConnectionError || ehVar == com.facetec.sdk.eh.UnknownRetry) {
            com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity2 = (com.facetec.sdk.FaceTecSessionActivity) ceVar.e.get();
            if (!faceTecSessionActivity2.r) {
                faceTecSessionActivity2.p++;
                if (ceVar.b != null) {
                }
            }
            ceVar.d(true, false);
            ceVar.b.e(new java.lang.Runnable() { // from class: com.facetec.sdk.ce$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.ce.this.r();
                }
            });
            return;
        }
        ceVar.a(false);
    }
}
