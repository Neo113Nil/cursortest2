package com.fyber.inneractive.sdk.click;

/* loaded from: classes3.dex */
public final class g extends com.fyber.inneractive.sdk.click.a {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.v0 f3574a;
    public boolean b;
    public com.fyber.inneractive.sdk.click.f c;
    public final com.fyber.inneractive.sdk.util.g1 d;
    public final com.fyber.inneractive.sdk.util.g e;
    public boolean f = false;

    public g(com.fyber.inneractive.sdk.click.f fVar, com.fyber.inneractive.sdk.util.g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        this.c = fVar;
        this.d = g1Var;
        this.e = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(android.net.Uri uri, com.fyber.inneractive.sdk.click.r rVar) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.web.v0 v0Var;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        if (rVar != null) {
            mVar = rVar.m;
            this.b = rVar.l;
            this.f3574a = rVar.k;
        } else {
            mVar = mVar2;
        }
        return mVar != mVar2 && com.fyber.inneractive.sdk.config.IAConfigManager.N.D.n() && (v0Var = this.f3574a) != null && v0Var.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    @Override // com.fyber.inneractive.sdk.click.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.click.b a(android.content.Context context, android.net.Uri uri, java.util.List list) {
        android.content.pm.PackageInfo packageInfo;
        com.fyber.inneractive.sdk.util.d0 d0Var;
        com.fyber.inneractive.sdk.web.v0 v0Var = this.f3574a;
        if (v0Var != null) {
            boolean z = this.b;
            if (v0Var.C) {
                com.fyber.inneractive.sdk.util.g0 g0Var = com.fyber.inneractive.sdk.util.g0.FAILED;
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Store controller is already open");
                context.getClass();
                d0Var = new com.fyber.inneractive.sdk.util.d0(g0Var, illegalStateException);
            } else {
                v0Var.C = true;
                try {
                    context.getClass();
                } catch (java.lang.Throwable unused) {
                }
                v0Var.D = true;
                if (v0Var.j.equals("invalid_task_id") && !v0Var.z) {
                    v0Var.d = z ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
                }
                v0Var.B = z;
                if (v0Var.A) {
                    v0Var.d("onInstallationSuccess();");
                } else if (!v0Var.z) {
                    java.lang.String str = v0Var.c;
                    if (!android.text.TextUtils.isEmpty(str)) {
                        packageInfo = com.fyber.inneractive.sdk.util.o.f4302a.getPackageManager().getPackageInfo(str, 0);
                        if (packageInfo == null) {
                            v0Var.d("onInstallationSuccess();");
                        } else if (z) {
                            v0Var.b.a(v0Var.c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f, v0Var.d, v0Var.h.f3757a));
                            v0Var.d("onShowInstallStarted();");
                        }
                    }
                    packageInfo = null;
                    if (packageInfo == null) {
                    }
                }
                try {
                    com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity.startActivity(context, v0Var.e);
                    d0Var = new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.OPENED_INTERNAL_STORE, null);
                } catch (android.content.ActivityNotFoundException e) {
                    d0Var = new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, e);
                }
            }
            java.lang.Throwable th = d0Var.b;
            if (th == null) {
                com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a(new com.fyber.inneractive.sdk.network.h1(new com.fyber.inneractive.sdk.click.e(this, list, uri), uri.toString()));
                return new com.fyber.inneractive.sdk.click.b(uri.toString(), com.fyber.inneractive.sdk.click.q.OPEN_INTERNAL_STORE, "IgniteGooglePlay", null);
            }
            if (list != null) {
                list.add(new com.fyber.inneractive.sdk.click.j(this.f3574a.k, false, com.fyber.inneractive.sdk.click.q.OPEN_INTERNAL_STORE, th.toString()));
            }
            return com.fyber.inneractive.sdk.click.r.a(uri.toString(), "IgniteGooglePlay", "mInternalStoreWebpageController.show has failed");
        }
        return com.fyber.inneractive.sdk.click.r.a(uri.toString(), "IgniteGooglePlay", "mInternalStoreWebpageController is null");
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void a() {
        this.f = true;
        this.c = null;
    }
}
