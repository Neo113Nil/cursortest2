package com.google.android.gms.ads.admanager;

import F2.M;
import F2.O0;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.common.internal.D;
import y2.C1796A;
import y2.j;
import y2.l;
import y2.y;
import z2.e;

/* loaded from: classes.dex */
public final class AdManagerAdView extends l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f10708b = 0;

    public AdManagerAdView(Context context) {
        super(context);
        D.j(context, "Context cannot be null");
    }

    public j[] getAdSizes() {
        return this.f18174a.f2622g;
    }

    public e getAppEventListener() {
        return this.f18174a.f2623h;
    }

    public y getVideoController() {
        return this.f18174a.f2618c;
    }

    public C1796A getVideoOptions() {
        return this.f18174a.j;
    }

    public void setAdSizes(j... jVarArr) {
        if (jVarArr == null || jVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f18174a.d(jVarArr);
    }

    public void setAppEventListener(e eVar) {
        this.f18174a.e(eVar);
    }

    public void setManualImpressionsEnabled(boolean z4) {
        O0 o02 = this.f18174a;
        o02.f2627m = z4;
        try {
            M m7 = o02.f2624i;
            if (m7 != null) {
                m7.zzN(z4);
            }
        } catch (RemoteException e7) {
            J2.j.i("#007 Could not call remote method.", e7);
        }
    }

    public void setVideoOptions(C1796A c1796a) {
        O0 o02 = this.f18174a;
        o02.j = c1796a;
        try {
            M m7 = o02.f2624i;
            if (m7 != null) {
                m7.zzU(c1796a == null ? null : new zzfx(c1796a));
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
