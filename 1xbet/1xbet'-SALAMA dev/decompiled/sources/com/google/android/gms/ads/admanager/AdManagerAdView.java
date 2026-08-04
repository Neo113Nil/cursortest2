package com.google.android.gms.ads.admanager;

import F2.M;
import F2.O0;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.common.internal.D;
import p167y2.A;
import p167y2.j;
import p167y2.l;
import p167y2.y;
import p172z2.e;

/* JADX INFO: loaded from: classes.dex */
public final class AdManagerAdView extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f10708b = 0;

    public AdManagerAdView(Context context) {
        super(context);
        D.j(context, "Context cannot be null");
    }

    public j[] getAdSizes() {
        return this.f18180a.f2622g;
    }

    public e getAppEventListener() {
        return this.f18180a.f2623h;
    }

    public y getVideoController() {
        return this.f18180a.f2618c;
    }

    public A getVideoOptions() {
        return this.f18180a.j;
    }

    public void setAdSizes(j... jVarArr) {
        if (jVarArr == null || jVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f18180a.d(jVarArr);
    }

    public void setAppEventListener(e eVar) {
        this.f18180a.e(eVar);
    }

    public void setManualImpressionsEnabled(boolean z4) {
        O0 o7 = this.f18180a;
        o7.f2627m = z4;
        try {
            M m7 = o7.f2624i;
            if (m7 != null) {
                m7.zzN(z4);
            }
        } catch (RemoteException e7) {
            J2.j.i("#007 Could not call remote method.", e7);
        }
    }

    public void setVideoOptions(A a2) {
        O0 o7 = this.f18180a;
        o7.j = a2;
        try {
            M m7 = o7.f2624i;
            if (m7 != null) {
                m7.zzU(a2 == null ? null : new zzfx(a2));
            }
        } catch (RemoteException e7) {
            J2.j.i("#007 Could not call remote method.", e7);
        }
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        D.j(context, "Context cannot be null");
    }
}
