package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.i1;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* loaded from: classes4.dex */
public final class f0 implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f5247a;

    public f0(IAConfigManager iAConfigManager) {
        this.f5247a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        int i;
        m0 m0Var = (m0) obj;
        if (m0Var != null) {
            if (z) {
                IAConfigManager iAConfigManager = this.f5247a;
                IAConfigManager iAConfigManager2 = IAConfigManager.R;
                iAConfigManager.getClass();
                iAConfigManager.e = m0Var.c;
                iAConfigManager.d = m0Var.b;
                iAConfigManager.f5233a = m0Var.d;
                iAConfigManager.b = m0Var.e;
            } else {
                IAConfigManager.S = System.currentTimeMillis();
                IAConfigManager iAConfigManager3 = this.f5247a;
                iAConfigManager3.getClass();
                IAlog.a("Got new remote configuration from server:", new Object[0]);
                iAConfigManager3.e = m0Var.c;
                iAConfigManager3.d = m0Var.b;
                iAConfigManager3.f5233a = m0Var.d;
                iAConfigManager3.b = m0Var.e;
            }
        } else if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            IAConfigManager.S = System.currentTimeMillis();
        }
        if (z) {
            return;
        }
        IAConfigManager iAConfigManager4 = this.f5247a;
        IAConfigManager iAConfigManager5 = IAConfigManager.R;
        if (iAConfigManager5.e != null) {
            iAConfigManager4.a(true, (Exception) null);
        } else {
            iAConfigManager4.getClass();
            if ((exc instanceof InvalidAppIdException) || (exc instanceof FileNotFoundException) || (!(exc instanceof k1) ? !TextUtils.isEmpty(iAConfigManager4.c.trim()) : (i = ((k1) exc).f5498a) < 400 || i >= 500)) {
                iAConfigManager4.a(false, (Exception) new InvalidAppIdException());
            } else if (exc instanceof com.fyber.inneractive.sdk.network.b) {
                iAConfigManager4.a(false, exc);
            } else {
                iAConfigManager4.a(false, (Exception) new n0());
            }
        }
        if (iAConfigManager5.e != null) {
            IAConfigManager iAConfigManager6 = this.f5247a;
            if (iAConfigManager6.D == null) {
                iAConfigManager6.D = new com.fyber.inneractive.sdk.network.v0(new i0(iAConfigManager6), iAConfigManager6.g, new com.fyber.inneractive.sdk.config.global.m());
            }
            i1 i1Var = iAConfigManager6.D.f;
            if (i1Var == i1.RUNNING || i1Var == i1.QUEUED) {
                return;
            }
            iAConfigManager5.s.a(iAConfigManager6.D);
        }
    }
}
