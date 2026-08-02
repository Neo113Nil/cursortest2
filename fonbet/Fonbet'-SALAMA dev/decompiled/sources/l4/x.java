package l4;

import F2.M0;
import F2.k1;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.C0977k;
import e6.C1054c;
import i4.C1265b;
import i4.C1266c;
import i4.C1267d;
import i4.C1269f;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import m4.C1437a;
import m4.C1438b;
import n1.ExecutorC1453h;
import n4.C1478l;
import n4.C1479m;
import n4.J;
import s4.InterfaceC1597e;
import w4.C1778d;

/* loaded from: classes2.dex */
public final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15016a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15017b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15018c;

    public /* synthetic */ x(int i7, Object obj, Object obj2) {
        this.f15016a = i7;
        this.f15017b = obj;
        this.f15018c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str = null;
        switch (this.f15016a) {
            case 0:
                y yVar = (y) ((com.google.android.gms.common.internal.w) this.f15017b).f11336c;
                if (yVar.f15022c) {
                    return;
                }
                yVar.e();
                C1438b c1438b = yVar.f15024e;
                String str2 = (String) this.f15018c;
                if (c1438b != null) {
                    yVar.b(str2);
                    return;
                }
                if (str2.length() <= 6) {
                    try {
                        int parseInt = Integer.parseInt(str2);
                        if (parseInt > 0) {
                            yVar.d(parseInt);
                        }
                    } catch (NumberFormatException unused) {
                    }
                    if (str == null) {
                        yVar.b(str);
                        return;
                    }
                    return;
                }
                yVar.d(1);
                str = str2;
                if (str == null) {
                }
            case 1:
                C1778d c1778d = (C1778d) this.f15018c;
                Throwable cause = c1778d.getCause();
                com.google.android.gms.common.internal.w wVar = (com.google.android.gms.common.internal.w) this.f15017b;
                if (cause == null || !(c1778d.getCause() instanceof EOFException)) {
                    ((y) wVar.f11336c).j.W(c1778d, "WebSocket error.", new Object[0]);
                } else {
                    ((y) wVar.f11336c).j.W(null, "WebSocket reached EOF.", new Object[0]);
                }
                y.a((y) wVar.f11336c);
                return;
            case 2:
                ((C1437a) this.f15017b).f15267h = null;
                ((RunnableC1391b) this.f15018c).run();
                return;
            case 3:
                ExecutorC1453h executorC1453h = (ExecutorC1453h) this.f15018c;
                try {
                    ((Runnable) this.f15017b).run();
                    return;
                } finally {
                    executorC1453h.a();
                }
            case 4:
                ((C1478l) this.f15018c).f15439b.m(null, true, (C1265b) this.f15017b);
                return;
            case 5:
                C1478l c1478l = (C1478l) this.f15018c;
                C1054c c1054c = c1478l.f15440c;
                s4.h a2 = s4.h.a(c1478l.f15438a);
                C1479m c1479m = (C1479m) this.f15017b;
                c1479m.o(new J(c1479m, c1054c, a2));
                return;
            case 6:
                ((C1478l) this.f15018c).f15439b.m((C1266c) this.f15017b, false, null);
                return;
            case 7:
                TaskCompletionSource taskCompletionSource = ((q4.j) this.f15018c).f15864a;
                C1266c c1266c = (C1266c) this.f15017b;
                if (c1266c == null) {
                    taskCompletionSource.setResult(null);
                    return;
                }
                taskCompletionSource.setException(new C1267d("Firebase Database error: " + c1266c.f13990b));
                return;
            case 8:
                I4.j jVar = (I4.j) this.f15017b;
                ArrayList arrayList = (ArrayList) jVar.f3680d;
                boolean isEmpty = arrayList.isEmpty();
                MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f15018c;
                if (!isEmpty) {
                    android.support.v4.media.session.d a4 = mediaSessionCompat$Token.a();
                    if (a4 != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Bundle) it.next()).putBinder("extra_session_binder", a4.asBinder());
                        }
                    }
                    arrayList.clear();
                }
                ((q0.j) jVar.f3678b).setSessionToken((MediaSession.Token) mediaSessionCompat$Token.f8016b);
                return;
            case 9:
                synchronized (((ConstraintTrackingWorker) this.f15017b).f9896x) {
                    if (((ConstraintTrackingWorker) this.f15017b).f9897y) {
                        ((ConstraintTrackingWorker) this.f15017b).f9898z.i(new d1.k());
                    } else {
                        ((ConstraintTrackingWorker) this.f15017b).f9898z.k((I3.b) this.f15018c);
                    }
                }
                return;
            case 10:
                Iterator it2 = ((ArrayList) this.f15018c).iterator();
                while (it2.hasNext()) {
                    InterfaceC1597e interfaceC1597e = (InterfaceC1597e) it2.next();
                    C0977k c0977k = (C0977k) this.f15017b;
                    if (((android.support.v4.media.session.t) c0977k.f12442c).r0()) {
                        ((android.support.v4.media.session.t) c0977k.f12442c).W(null, "Raising " + interfaceC1597e.toString(), new Object[0]);
                    }
                    interfaceC1597e.a();
                }
                return;
            case 11:
                y2.g gVar = (y2.g) this.f15018c;
                try {
                    gVar.f18153b.zzg(k1.a(gVar.f18152a, (M0) this.f15017b));
                    return;
                } catch (RemoteException e7) {
                    J2.j.e("Failed to load ad.", e7);
                    return;
                }
            case 12:
                y2.l lVar = (y2.l) this.f15018c;
                try {
                    lVar.f18174a.b(((y2.i) this.f15017b).f18154a);
                    return;
                } catch (IllegalStateException e8) {
                    zzbtl.zza(lVar.getContext()).zzh(e8, "BaseAdView.loadAd");
                    return;
                }
            default:
                AdManagerAdView adManagerAdView = (AdManagerAdView) this.f15018c;
                z2.b bVar = (z2.b) this.f15017b;
                int i7 = AdManagerAdView.f10708b;
                try {
                    adManagerAdView.f18174a.b(bVar.f18154a);
                    return;
                } catch (IllegalStateException e9) {
                    zzbtl.zza(adManagerAdView.getContext()).zzh(e9, "AdManagerAdView.loadAd");
                    return;
                }
        }
    }

    public /* synthetic */ x(int i7, Object obj, Object obj2, boolean z4) {
        this.f15016a = i7;
        this.f15018c = obj;
        this.f15017b = obj2;
    }

    public x(q4.j jVar, C1266c c1266c, C1269f c1269f) {
        this.f15016a = 7;
        this.f15018c = jVar;
        this.f15017b = c1266c;
    }
}
