package game.betting133.sports1xbet.aqua_bootstrap;

import A0.C0058t;
import A0.RunnableC0049o;
import D2.e;
import P.AbstractC0329z;
import P.C0305m0;
import Q3.a;
import Q3.b;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import c.AbstractActivityC0531j;
import game.betting133.sports1xbet.aqua_application.AquaGuideDeckActivity;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class AquaLaunchBridgeActivity extends AbstractActivityC0531j {
    public static final /* synthetic */ int J = 0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f17165F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f17166G;

    /* renamed from: E, reason: collision with root package name */
    public final C0305m0 f17164E = AbstractC0329z.t(b.f5074k);

    /* renamed from: H, reason: collision with root package name */
    public final Handler f17167H = new Handler(Looper.getMainLooper());

    /* renamed from: I, reason: collision with root package name */
    public final RunnableC0049o f17168I = new RunnableC0049o(5, this);

    public final void j() {
        Intent intent = new Intent();
        intent.setClass(this, AquaGuideDeckActivity.class);
        startActivity(intent);
        finish();
    }

    public final void k() {
        b bVar;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        Object systemService = getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        boolean z3 = false;
        if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            boolean hasCapability = networkCapabilities.hasCapability(12);
            boolean hasCapability2 = networkCapabilities.hasCapability(16);
            if (hasCapability && hasCapability2) {
                z3 = true;
            }
        }
        if (z3) {
            bVar = b.f5075l;
        } else {
            if (z3) {
                throw new e();
            }
            bVar = b.f5076m;
        }
        this.f17164E.setValue(bVar);
        if (!z3 || this.f17165F) {
            return;
        }
        this.f17165F = true;
        this.f17167H.postDelayed(this.f17168I, 2500L);
    }

    @Override // c.AbstractActivityC0531j, d1.AbstractActivityC1910a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        InterfaceC2015a[] interfaceC2015aArr = {new a(this, i), new a(this, 1), new a(this, 2), new a(this, 3), new a(this, 4)};
        while (i < 5) {
            interfaceC2015aArr[i].invoke();
            i++;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        this.f17167H.removeCallbacks(this.f17168I);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onResume() {
        C0058t c0058t;
        super.onResume();
        boolean z3 = this.f17166G;
        if (z3) {
            this.f17166G = false;
            c0058t = new C0058t(0, this, AquaLaunchBridgeActivity.class, "enterGuideDmeanseckAndClose", "enterGuideDmeanseckAndClose()V", 0, 5);
        } else {
            if (z3) {
                throw new e();
            }
            c0058t = new C0058t(0, this, AquaLaunchBridgeActivity.class, "refreshCmeansableMood", "refreshCmeansableMood()V", 0, 6);
        }
        c0058t.invoke();
    }
}
