package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public final class s extends com.fyber.inneractive.sdk.mraid.f {
    public s(java.util.LinkedHashMap linkedHashMap, com.fyber.inneractive.sdk.web.i0 i0Var, com.fyber.inneractive.sdk.util.g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.mraid.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        android.view.ViewGroup viewGroup;
        com.fyber.inneractive.sdk.web.m mVar;
        com.fyber.inneractive.sdk.web.j1 j1Var;
        int a2 = a("w");
        int a3 = a(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS);
        int a4 = a("offsetX");
        int a5 = a("offsetY");
        boolean equals = "true".equals(this.b.get("allowOffscreen"));
        if (a2 <= 0) {
            a2 = this.c.Z;
        }
        if (a3 <= 0) {
            a3 = this.c.a0;
        }
        com.fyber.inneractive.sdk.web.i0 i0Var = this.c;
        com.fyber.inneractive.sdk.web.m mVar2 = i0Var.b;
        if (mVar2 == null) {
            return;
        }
        try {
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) mVar2.getRootView().findViewById(android.R.id.content);
            i0Var.R = viewGroup2;
            if (viewGroup2 == null) {
                com.fyber.inneractive.sdk.util.IAlog.f("Couldn't find content in the view tree", new java.lang.Object[0]);
                i0Var.a(com.fyber.inneractive.sdk.mraid.k.RESIZE, "Ad can be resized only if it's state is default or resized.");
                return;
            }
            if (i0Var.O == com.fyber.inneractive.sdk.web.z.DISABLED) {
                return;
            }
            com.fyber.inneractive.sdk.mraid.f0 f0Var = i0Var.N;
            if (f0Var != com.fyber.inneractive.sdk.mraid.f0.DEFAULT && f0Var != com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
                i0Var.a(com.fyber.inneractive.sdk.mraid.k.RESIZE, "Ad can be resized only if it's state is default or resized.");
                return;
            }
            if (a2 < 0 && a3 < 0) {
                i0Var.a(com.fyber.inneractive.sdk.mraid.k.RESIZE, "Creative size passed to resize() was invalid.");
                return;
            }
            i0Var.X = false;
            com.fyber.inneractive.sdk.web.j1 j1Var2 = i0Var.g;
            if (j1Var2 != null) {
                ((com.fyber.inneractive.sdk.web.b0) j1Var2).b(false);
            }
            com.fyber.inneractive.sdk.web.d0 d0Var = i0Var.P;
            if (d0Var == com.fyber.inneractive.sdk.web.d0.ALWAYS_VISIBLE || (!i0Var.X && d0Var != com.fyber.inneractive.sdk.web.d0.ALWAYS_HIDDEN)) {
                i0Var.c(true);
            }
            i0Var.d(false);
            i0Var.e0 = com.fyber.inneractive.sdk.util.o.b(a3);
            i0Var.d0 = com.fyber.inneractive.sdk.util.o.b(a2);
            if (!equals) {
                int i = (a4 + a2) - i0Var.Z;
                if (i > 0) {
                    a4 -= i;
                }
                if (a4 < 0) {
                    a4 = 0;
                }
                int i2 = (a5 + a3) - i0Var.a0;
                if (i2 > 0) {
                    a5 -= i2;
                }
                if (a5 < 0) {
                    a5 = 0;
                }
            }
            if (i0Var.b != null) {
                int b = com.fyber.inneractive.sdk.util.o.b(a2);
                int b2 = com.fyber.inneractive.sdk.util.o.b(a3);
                com.fyber.inneractive.sdk.web.m mVar3 = i0Var.b;
                android.view.ViewGroup.LayoutParams layoutParams = mVar3.getLayoutParams();
                layoutParams.width = b;
                layoutParams.height = b2;
                mVar3.setLayoutParams(layoutParams);
                com.fyber.inneractive.sdk.util.o.a(i0Var.b, 17);
                com.fyber.inneractive.sdk.web.m mVar4 = i0Var.b;
                android.view.ViewGroup.LayoutParams layoutParams2 = mVar4.getLayoutParams();
                if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.leftMargin = a4;
                    marginLayoutParams.topMargin = a5;
                    marginLayoutParams.rightMargin = 0;
                    marginLayoutParams.bottomMargin = 0;
                    mVar4.setLayoutParams(marginLayoutParams);
                }
            }
            com.fyber.inneractive.sdk.mraid.f0 f0Var2 = i0Var.N;
            com.fyber.inneractive.sdk.mraid.f0 f0Var3 = com.fyber.inneractive.sdk.mraid.f0.RESIZED;
            if (f0Var2 != f0Var3) {
                i0Var.N = f0Var3;
                i0Var.a(new com.fyber.inneractive.sdk.mraid.d0(f0Var3));
                int i3 = i0Var.d0;
                if (i3 != -1 && i0Var.e0 != -1) {
                    i0Var.a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i3), com.fyber.inneractive.sdk.util.o.c(i0Var.e0)));
                }
            }
            i0Var.a(com.fyber.inneractive.sdk.mraid.k.RESIZE);
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) i0Var.b.getParent();
            if (viewGroup3 != null) {
                android.view.View findViewById = viewGroup3.findViewById(com.fyber.inneractive.sdk.R.id.ia_identifier_overlay);
                if (findViewById instanceof android.view.ViewGroup) {
                    viewGroup = (android.view.ViewGroup) findViewById;
                    mVar = i0Var.b;
                    if (mVar != null && viewGroup != null) {
                        viewGroup.setLayoutParams(mVar.getLayoutParams());
                    }
                    j1Var = i0Var.g;
                    if (j1Var == null) {
                        ((com.fyber.inneractive.sdk.web.b0) j1Var).c();
                        return;
                    }
                    return;
                }
            }
            viewGroup = null;
            mVar = i0Var.b;
            if (mVar != null) {
                viewGroup.setLayoutParams(mVar.getLayoutParams());
            }
            j1Var = i0Var.g;
            if (j1Var == null) {
            }
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Couldn't find content in the view tree", new java.lang.Object[0]);
            i0Var.a(com.fyber.inneractive.sdk.mraid.k.RESIZE, "Ad can be resized only if it's state is default or resized.");
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final boolean b() {
        return true;
    }
}
