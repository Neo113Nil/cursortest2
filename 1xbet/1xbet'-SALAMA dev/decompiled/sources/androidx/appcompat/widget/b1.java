package androidx.appcompat.widget;

import E5.C0183a;
import W5.AbstractC0486a1;
import android.os.Handler;
import android.os.Messenger;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.firebase.auth.FirebaseAuth;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p098n4.C0934g;
import p098n4.C0940m;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8605b;

    public /* synthetic */ b1(Object obj, int i7) {
        this.f8604a = i7;
        this.f8605b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, u2.I] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        View viewD;
        int width;
        switch (this.f8604a) {
            case 0:
                ((Toolbar) this.f8605b).v();
                return;
            case 1:
                synchronized (((androidx.lifecycle.B) this.f8605b).f9561a) {
                    obj = ((androidx.lifecycle.B) this.f8605b).f9566f;
                    ((androidx.lifecycle.B) this.f8605b).f9566f = androidx.lifecycle.B.f9560k;
                    break;
                }
                ((androidx.lifecycle.B) this.f8605b).i(obj);
                return;
            case 2:
                ((com.google.android.gms.common.api.internal.D) this.f8605b).e();
                return;
            case 3:
                com.google.android.gms.common.api.g gVar = ((com.google.android.gms.common.api.internal.D) ((p145u1.c) this.f8605b).f16597b).f11105b;
                gVar.disconnect(gVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 4:
                ((com.google.android.gms.common.api.internal.M) this.f8605b).f11138x.f(new ConnectionResult(4));
                return;
            case 5:
                Worker worker = (Worker) this.f8605b;
                try {
                    worker.f9859f.i(worker.doWork());
                    return;
                } catch (Throwable th) {
                    worker.f9859f.j(th);
                    return;
                }
            case 6:
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f8605b;
                Iterator it = firebaseAuth.f11852d.iterator();
                while (it.hasNext()) {
                    ((C0183a) it.next()).a(firebaseAuth);
                }
                return;
            case 7:
                p038f0.d dVar = (p038f0.d) this.f8605b;
                int i7 = dVar.f12769l.f7941o;
                int i8 = dVar.f12768k;
                boolean z4 = i8 == 3;
                DrawerLayout drawerLayout = dVar.f12771n;
                if (z4) {
                    viewD = drawerLayout.d(3);
                    width = (viewD != null ? -viewD.getWidth() : 0) + i7;
                } else {
                    viewD = drawerLayout.d(5);
                    width = drawerLayout.getWidth() - i7;
                }
                if (viewD != null) {
                    if (((!z4 || viewD.getLeft() >= width) && (z4 || viewD.getLeft() <= width)) || drawerLayout.g(viewD) != 0) {
                        return;
                    }
                    p038f0.c cVar = (p038f0.c) viewD.getLayoutParams();
                    dVar.f12769l.v(viewD, width, viewD.getTop());
                    cVar.f12766c = true;
                    drawerLayout.invalidate();
                    View viewD2 = drawerLayout.d(i8 == 3 ? 5 : 3);
                    if (viewD2 != null) {
                        drawerLayout.b(viewD2);
                    }
                    if (drawerLayout.f9278H) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        drawerLayout.getChildAt(i9).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    drawerLayout.f9278H = true;
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f8605b).run();
                return;
            case 9:
                p057h5.a aVar = (p057h5.a) this.f8605b;
                A1.N n2 = aVar.f13588Q;
                if (n2 == null) {
                    return;
                }
                if (n2.t() != aVar.f13600f) {
                    aVar.j();
                }
                int iE = aVar.f13588Q.E();
                Handler handler = aVar.f13592U;
                if (iE == 2) {
                    handler.postDelayed(this, 200L);
                    return;
                } else {
                    if (iE != 3) {
                        return;
                    }
                    if (aVar.f13588Q.D()) {
                        handler.postDelayed(this, 500L);
                        return;
                    } else {
                        handler.postDelayed(this, 1000L);
                        return;
                    }
                }
            case 10:
                p058i.E e7 = (p058i.E) this.f8605b;
                p058i.r rVar = e7.f13616b;
                Menu menuV = e7.v();
                p086m.k kVar = menuV instanceof p086m.k ? (p086m.k) menuV : null;
                if (kVar != null) {
                    kVar.w();
                }
                try {
                    menuV.clear();
                    if (!rVar.onCreatePanelMenu(0, menuV) || !rVar.onPreparePanel(0, null, menuV)) {
                        menuV.clear();
                    }
                    if (kVar != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (kVar != null) {
                        kVar.v();
                    }
                }
                break;
            case 11:
                C0940m c0940m = ((p063i4.h) this.f8605b).f14005d;
                android.support.v4.media.session.t tVar = c0940m.f15461i;
                if (tVar.r0()) {
                    tVar.W(null, "Purging writes", new Object[0]);
                }
                p098n4.D d7 = c0940m.f15465n;
                d7.getClass();
                c0940m.m((List) d7.f15371g.j(new E2.l(d7, 4)));
                c0940m.a(C0934g.f15421d, -25);
                p083l4.s sVar = c0940m.f15455c;
                HashMap map = sVar.f15002n;
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    ((p083l4.q) it2.next()).f14978c.b("write_canceled", null);
                }
                ArrayList arrayList = sVar.f15001m;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((p083l4.n) it3.next()).f14968d.b("write_canceled", null);
                }
                map.clear();
                arrayList.clear();
                if (!sVar.b()) {
                    sVar.f14989G = false;
                }
                sVar.c();
                return;
            case 12:
                p083l4.s sVar2 = (p083l4.s) this.f8605b;
                sVar2.f14987E = null;
                sVar2.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!sVar2.e() || jCurrentTimeMillis <= sVar2.f14988F + 60000) {
                    sVar2.c();
                    return;
                } else {
                    sVar2.d("connection_idle");
                    return;
                }
            case 13:
                p117q0.h hVar = (p117q0.h) this.f8605b;
                hVar.f15751g.f15787e.remove(((Messenger) hVar.f15748d.f15314b).getBinder());
                return;
            case 14:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f8605b;
                String strB = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (TextUtils.isEmpty(strB)) {
                    p023d1.n.d().c(ConstraintTrackingWorker.f9893B, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.f9898z.i(new p023d1.j());
                    return;
                }
                ListenableWorker listenableWorkerA = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), strB, constraintTrackingWorker.f9895f);
                constraintTrackingWorker.f9894A = listenableWorkerA;
                if (listenableWorkerA == null) {
                    p023d1.n.d().b(ConstraintTrackingWorker.f9893B, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.f9898z.i(new p023d1.j());
                    return;
                }
                p088m1.i iVarL = p031e1.l.m0(constraintTrackingWorker.getApplicationContext()).f12552f.n().l(constraintTrackingWorker.getId().toString());
                if (iVarL == null) {
                    constraintTrackingWorker.f9898z.i(new p023d1.j());
                    return;
                }
                p060i1.c cVar2 = new p060i1.c(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
                cVar2.b(Collections.singletonList(iVarL));
                if (!cVar2.a(constraintTrackingWorker.getId().toString())) {
                    p023d1.n.d().b(ConstraintTrackingWorker.f9893B, AbstractC0486a1.h("Constraints not met for delegate ", strB, ". Requesting retry."), new Throwable[0]);
                    constraintTrackingWorker.f9898z.i(new p023d1.k());
                    return;
                }
                p023d1.n.d().b(ConstraintTrackingWorker.f9893B, p155w1.L.i("Constraints met for delegate ", strB), new Throwable[0]);
                try {
                    I3.b bVarStartWork = constraintTrackingWorker.f9894A.startWork();
                    bVarStartWork.addListener(new p083l4.x(9, constraintTrackingWorker, bVarStartWork), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th2) {
                    p023d1.n nVarD = p023d1.n.d();
                    String str = ConstraintTrackingWorker.f9893B;
                    nVarD.b(str, AbstractC0486a1.h("Delegated worker ", strB, " threw exception in startWork."), th2);
                    synchronized (constraintTrackingWorker.f9896x) {
                        try {
                            if (constraintTrackingWorker.f9897y) {
                                p023d1.n.d().b(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                                constraintTrackingWorker.f9898z.i(new p023d1.k());
                            } else {
                                constraintTrackingWorker.f9898z.i(new p023d1.j());
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            case 15:
                this.f8605b.a();
                return;
            case 16:
                p158w4.c cVar3 = (p158w4.c) this.f8605b;
                cVar3.getClass();
                try {
                    try {
                        try {
                            Socket socketD = cVar3.d();
                            synchronized (cVar3) {
                                cVar3.f18059b = socketD;
                                if (cVar3.f18058a == 5) {
                                    try {
                                        cVar3.f18059b.close();
                                        cVar3.f18059b = null;
                                    } catch (IOException e8) {
                                        throw new RuntimeException(e8);
                                    }
                                } else {
                                    DataInputStream dataInputStream = new DataInputStream(socketD.getInputStream());
                                    OutputStream outputStream = socketD.getOutputStream();
                                    outputStream.write(cVar3.f18065h.L());
                                    byte[] bArr = new byte[zzbbd.zzq.zzf];
                                    ArrayList arrayList2 = new ArrayList();
                                    boolean z7 = false;
                                    int i10 = 0;
                                    while (!z7) {
                                        int i11 = dataInputStream.read();
                                        if (i11 == -1) {
                                            throw new p158w4.d("Connection closed before handshake was complete");
                                        }
                                        byte b7 = (byte) i11;
                                        bArr[i10] = b7;
                                        int i12 = i10 + 1;
                                        if (b7 == 10 && bArr[i10 - 1] == 13) {
                                            String str2 = new String(bArr, p158w4.c.f18055m);
                                            if (str2.trim().equals("")) {
                                                z7 = true;
                                            } else {
                                                arrayList2.add(str2.trim());
                                            }
                                            bArr = new byte[zzbbd.zzq.zzf];
                                            i10 = 0;
                                        } else {
                                            if (i12 == 1000) {
                                                throw new p158w4.d("Unexpected long line in handshake: " + new String(bArr, p158w4.c.f18055m));
                                            }
                                            i10 = i12;
                                        }
                                    }
                                    C1050x1 c1050x1 = cVar3.f18065h;
                                    String str3 = (String) arrayList2.get(0);
                                    c1050x1.getClass();
                                    C1050x1.j0(str3);
                                    arrayList2.remove(0);
                                    HashMap map2 = new HashMap();
                                    Iterator it4 = arrayList2.iterator();
                                    while (it4.hasNext()) {
                                        String[] strArrSplit = ((String) it4.next()).split(": ", 2);
                                        String str4 = strArrSplit[0];
                                        Locale locale = Locale.US;
                                        map2.put(str4.toLowerCase(locale), strArrSplit[1].toLowerCase(locale));
                                    }
                                    cVar3.f18065h.getClass();
                                    C1050x1.i0(map2);
                                    p158w4.f fVar = cVar3.f18064g;
                                    fVar.getClass();
                                    fVar.f18079f = Channels.newChannel(outputStream);
                                    cVar3.f18063f.f18068a = dataInputStream;
                                    cVar3.f18058a = 3;
                                    cVar3.f18064g.f18080g.start();
                                    com.google.android.gms.common.internal.w wVar = cVar3.f18060c;
                                    ((p083l4.y) wVar.f11336c).f15034i.execute(new p083l4.w(wVar, 0));
                                    cVar3.f18063f.c();
                                }
                                cVar3.a();
                                return;
                            }
                        } catch (Throwable th4) {
                            cVar3.a();
                            throw th4;
                        }
                    } catch (p158w4.d e9) {
                        cVar3.f18060c.J(e9);
                    }
                } catch (Throwable th5) {
                    cVar3.f18060c.J(new p158w4.d("error while connecting: " + th5.getMessage(), th5));
                }
                break;
            case 17:
                p158w4.f fVar2 = (p158w4.f) this.f8605b;
                fVar2.getClass();
                while (!fVar2.f18076c && !Thread.interrupted()) {
                    try {
                        fVar2.f18079f.write((ByteBuffer) fVar2.f18074a.take());
                    } catch (IOException e10) {
                        p158w4.d dVar2 = new p158w4.d("IO Exception", e10);
                        p158w4.c cVar4 = fVar2.f18078e;
                        cVar4.f18060c.J(dVar2);
                        if (cVar4.f18058a == 3) {
                            cVar4.a();
                        }
                        cVar4.b();
                        return;
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
                for (int i13 = 0; i13 < fVar2.f18074a.size(); i13++) {
                    fVar2.f18079f.write((ByteBuffer) fVar2.f18074a.take());
                    break;
                }
                return;
            default:
                Carousel carousel = (Carousel) this.f8605b;
                carousel.f8770F.setProgress(0.0f);
                carousel.getClass();
                carousel.getClass();
                int i14 = carousel.f8769E;
                throw null;
        }
    }

    public String toString() {
        switch (this.f8604a) {
            case 8:
                return ((Runnable) this.f8605b).toString();
            default:
                return super.toString();
        }
    }
}
