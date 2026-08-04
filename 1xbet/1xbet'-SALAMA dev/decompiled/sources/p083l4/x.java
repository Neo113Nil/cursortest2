package p083l4;

import F2.M0;
import F2.k1;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.t;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import p023d1.k;
import p036e6.c;
import p063i4.f;
import p091m4.a;
import p091m4.b;
import p096n1.h;
import p098n4.C0939l;
import p098n4.C0940m;
import p098n4.J;
import p120q4.j;
import p134s4.e;
import p158w4.d;
import p167y2.g;
import p167y2.i;
import p167y2.l;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15024c;

    public /* synthetic */ x(int i7, Object obj, Object obj2) {
        this.f15022a = i7;
        this.f15023b = obj;
        this.f15024c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = null;
        switch (this.f15022a) {
            case 0:
                y yVar = (y) ((w) this.f15023b).f11336c;
                if (yVar.f15028c) {
                    return;
                }
                yVar.e();
                b bVar = yVar.f15030e;
                String str2 = (String) this.f15024c;
                if (bVar != null) {
                    yVar.b(str2);
                    return;
                }
                if (str2.length() <= 6) {
                    try {
                        int i7 = Integer.parseInt(str2);
                        if (i7 > 0) {
                            yVar.d(i7);
                        }
                    } catch (NumberFormatException unused) {
                        yVar.d(1);
                        str = str2;
                    }
                    break;
                } else {
                    yVar.d(1);
                    str = str2;
                }
                if (str != null) {
                    yVar.b(str);
                    return;
                }
                return;
            case 1:
                d dVar = (d) this.f15024c;
                Throwable cause = dVar.getCause();
                w wVar = (w) this.f15023b;
                if (cause == null || !(dVar.getCause() instanceof EOFException)) {
                    ((y) wVar.f11336c).j.W(dVar, "WebSocket error.", new Object[0]);
                } else {
                    ((y) wVar.f11336c).j.W(null, "WebSocket reached EOF.", new Object[0]);
                }
                y.a((y) wVar.f11336c);
                return;
            case 2:
                ((a) this.f15023b).f15273h = null;
                ((b) this.f15024c).run();
                return;
            case 3:
                h hVar = (h) this.f15024c;
                try {
                    ((Runnable) this.f15023b).run();
                    return;
                } finally {
                    hVar.a();
                }
            case 4:
                ((C0939l) this.f15024c).f15445b.m(null, true, (p063i4.b) this.f15023b);
                return;
            case 5:
                C0939l c0939l = (C0939l) this.f15024c;
                c cVar = c0939l.f15446c;
                p134s4.h hVarA = p134s4.h.a(c0939l.f15444a);
                C0940m c0940m = (C0940m) this.f15023b;
                c0940m.o(new J(c0940m, cVar, hVarA));
                return;
            case 6:
                ((C0939l) this.f15024c).f15445b.m((p063i4.c) this.f15023b, false, null);
                return;
            case 7:
                TaskCompletionSource taskCompletionSource = ((j) this.f15024c).f15870a;
                p063i4.c cVar2 = (p063i4.c) this.f15023b;
                if (cVar2 == null) {
                    taskCompletionSource.setResult(null);
                    return;
                }
                taskCompletionSource.setException(new p063i4.d("Firebase Database error: " + cVar2.f13996b));
                return;
            case 8:
                I4.j jVar = (I4.j) this.f15023b;
                ArrayList arrayList = (ArrayList) jVar.f3680d;
                boolean zIsEmpty = arrayList.isEmpty();
                MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f15024c;
                if (!zIsEmpty) {
                    android.support.v4.media.session.d dVarA = mediaSessionCompat$Token.a();
                    if (dVarA != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Bundle) it.next()).putBinder("extra_session_binder", dVarA.asBinder());
                        }
                    }
                    arrayList.clear();
                }
                ((p117q0.j) jVar.f3678b).setSessionToken((MediaSession.Token) mediaSessionCompat$Token.f8016b);
                return;
            case 9:
                synchronized (((ConstraintTrackingWorker) this.f15023b).f9896x) {
                    if (((ConstraintTrackingWorker) this.f15023b).f9897y) {
                        ((ConstraintTrackingWorker) this.f15023b).f9898z.i(new k());
                    } else {
                        ((ConstraintTrackingWorker) this.f15023b).f9898z.k((I3.b) this.f15024c);
                    }
                    break;
                }
                return;
            case 10:
                for (e eVar : (ArrayList) this.f15024c) {
                    p028d6.k kVar = (p028d6.k) this.f15023b;
                    if (((t) kVar.f12448c).r0()) {
                        ((t) kVar.f12448c).W(null, "Raising " + eVar.toString(), new Object[0]);
                    }
                    eVar.a();
                }
                return;
            case 11:
                g gVar = (g) this.f15024c;
                try {
                    gVar.f18159b.zzg(k1.a(gVar.f18158a, (M0) this.f15023b));
                    return;
                } catch (RemoteException e7) {
                    J2.j.e("Failed to load ad.", e7);
                    return;
                }
            case 12:
                l lVar = (l) this.f15024c;
                try {
                    lVar.f18180a.b(((i) this.f15023b).f18160a);
                    return;
                } catch (IllegalStateException e8) {
                    zzbtl.zza(lVar.getContext()).zzh(e8, "BaseAdView.loadAd");
                    return;
                }
            default:
                AdManagerAdView adManagerAdView = (AdManagerAdView) this.f15024c;
                p172z2.b bVar2 = (p172z2.b) this.f15023b;
                int i8 = AdManagerAdView.f10708b;
                try {
                    adManagerAdView.f18180a.b(bVar2.f18160a);
                    return;
                } catch (IllegalStateException e9) {
                    zzbtl.zza(adManagerAdView.getContext()).zzh(e9, "AdManagerAdView.loadAd");
                    return;
                }
        }
    }

    public /* synthetic */ x(int i7, Object obj, Object obj2, boolean z4) {
        this.f15022a = i7;
        this.f15024c = obj;
        this.f15023b = obj2;
    }

    public x(j jVar, p063i4.c cVar, f fVar) {
        this.f15022a = 7;
        this.f15024c = jVar;
        this.f15023b = cVar;
    }
}
