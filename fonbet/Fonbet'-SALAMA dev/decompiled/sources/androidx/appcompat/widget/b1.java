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
import d1.C0957j;
import f0.C1065c;
import f0.C1066d;
import h5.C1209a;
import i.C1218E;
import i1.C1244c;
import i4.C1271h;
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
import l4.C1403n;
import l4.C1406q;
import n4.C1473g;
import n4.C1479m;
import w1.C1759x1;
import w4.C1777c;
import w4.C1778d;
import w4.C1780f;

/* loaded from: classes.dex */
public final class b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8604a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8605b;

    public /* synthetic */ b1(Object obj, int i7) {
        this.f8604a = i7;
        this.f8605b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, u2.I] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        View d7;
        int width;
        Socket d8;
        switch (this.f8604a) {
            case 0:
                ((Toolbar) this.f8605b).v();
                return;
            case 1:
                synchronized (((androidx.lifecycle.B) this.f8605b).f9561a) {
                    obj = ((androidx.lifecycle.B) this.f8605b).f9566f;
                    ((androidx.lifecycle.B) this.f8605b).f9566f = androidx.lifecycle.B.f9560k;
                }
                ((androidx.lifecycle.B) this.f8605b).i(obj);
                return;
            case 2:
                ((com.google.android.gms.common.api.internal.D) this.f8605b).e();
                return;
            case 3:
                com.google.android.gms.common.api.g gVar = ((com.google.android.gms.common.api.internal.D) ((u1.c) this.f8605b).f16591b).f11105b;
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
                C1066d c1066d = (C1066d) this.f8605b;
                int i7 = c1066d.f12763l.f7941o;
                int i8 = c1066d.f12762k;
                boolean z4 = i8 == 3;
                DrawerLayout drawerLayout = c1066d.f12765n;
                if (z4) {
                    d7 = drawerLayout.d(3);
                    width = (d7 != null ? -d7.getWidth() : 0) + i7;
                } else {
                    d7 = drawerLayout.d(5);
                    width = drawerLayout.getWidth() - i7;
                }
                if (d7 != null) {
                    if (((!z4 || d7.getLeft() >= width) && (z4 || d7.getLeft() <= width)) || drawerLayout.g(d7) != 0) {
                        return;
                    }
                    C1065c c1065c = (C1065c) d7.getLayoutParams();
                    c1066d.f12763l.v(d7, width, d7.getTop());
                    c1065c.f12760c = true;
                    drawerLayout.invalidate();
                    View d9 = drawerLayout.d(i8 == 3 ? 5 : 3);
                    if (d9 != null) {
                        drawerLayout.b(d9);
                    }
                    if (drawerLayout.f9278H) {
                        return;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        drawerLayout.getChildAt(i9).dispatchTouchEvent(obtain);
                    }
                    obtain.recycle();
                    drawerLayout.f9278H = true;
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f8605b).run();
                return;
            case 9:
                C1209a c1209a = (C1209a) this.f8605b;
                A1.N n2 = c1209a.f13582Q;
                if (n2 == null) {
                    return;
                }
                if (n2.t() != c1209a.f13594f) {
                    c1209a.j();
                }
                int E7 = c1209a.f13582Q.E();
                Handler handler = c1209a.f13586U;
                if (E7 == 2) {
                    handler.postDelayed(this, 200L);
                    return;
                } else {
                    if (E7 != 3) {
                        return;
                    }
                    if (c1209a.f13582Q.D()) {
                        handler.postDelayed(this, 500L);
                        return;
                    } else {
                        handler.postDelayed(this, 1000L);
                        return;
                    }
                }
            case 10:
                C1218E c1218e = (C1218E) this.f8605b;
                i.r rVar = c1218e.f13610b;
                Menu v6 = c1218e.v();
                m.k kVar = v6 instanceof m.k ? (m.k) v6 : null;
                if (kVar != null) {
                    kVar.w();
                }
                try {
                    v6.clear();
                    if (rVar.onCreatePanelMenu(0, v6)) {
                        if (!rVar.onPreparePanel(0, null, v6)) {
                        }
                        if (kVar == null) {
                            kVar.v();
                            return;
                        }
                        return;
                    }
                    v6.clear();
                    if (kVar == null) {
                    }
                } finally {
                    if (kVar != null) {
                        kVar.v();
                    }
                }
            case 11:
                C1479m c1479m = ((C1271h) this.f8605b).f13999d;
                android.support.v4.media.session.t tVar = c1479m.f15455i;
                if (tVar.r0()) {
                    tVar.W(null, "Purging writes", new Object[0]);
                }
                n4.D d10 = c1479m.f15459n;
                d10.getClass();
                c1479m.m((List) d10.f15365g.j(new E2.l(d10, 4)));
                c1479m.a(C1473g.f15415d, -25);
                l4.s sVar = c1479m.f15449c;
                HashMap hashMap = sVar.f14996n;
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    ((C1406q) it2.next()).f14972c.b("write_canceled", null);
                }
                ArrayList arrayList = sVar.f14995m;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((C1403n) it3.next()).f14962d.b("write_canceled", null);
                }
                hashMap.clear();
                arrayList.clear();
                if (!sVar.b()) {
                    sVar.f14983G = false;
                }
                sVar.c();
                return;
            case 12:
                l4.s sVar2 = (l4.s) this.f8605b;
                sVar2.f14981E = null;
                sVar2.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (!sVar2.e() || currentTimeMillis <= sVar2.f14982F + 60000) {
                    sVar2.c();
                    return;
                } else {
                    sVar2.d("connection_idle");
                    return;
                }
            case 13:
                q0.h hVar = (q0.h) this.f8605b;
                hVar.f15745g.f15781e.remove(((Messenger) hVar.f15742d.f15308b).getBinder());
                return;
            case 14:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f8605b;
                String b7 = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (TextUtils.isEmpty(b7)) {
                    d1.n.d().c(ConstraintTrackingWorker.f9893B, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.f9898z.i(new C0957j());
                    return;
                }
                ListenableWorker a2 = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), b7, constraintTrackingWorker.f9895f);
                constraintTrackingWorker.f9894A = a2;
                if (a2 == null) {
                    d1.n.d().b(ConstraintTrackingWorker.f9893B, "No worker to delegate to.", new Throwable[0]);
                    constraintTrackingWorker.f9898z.i(new C0957j());
                    return;
                }
                m1.i l7 = e1.l.m0(constraintTrackingWorker.getApplicationContext()).f12546f.n().l(constraintTrackingWorker.getId().toString());
                if (l7 == null) {
                    constraintTrackingWorker.f9898z.i(new C0957j());
                    return;
                }
                C1244c c1244c = new C1244c(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
                c1244c.b(Collections.singletonList(l7));
                if (!c1244c.a(constraintTrackingWorker.getId().toString())) {
                    d1.n.d().b(ConstraintTrackingWorker.f9893B, AbstractC0486a1.h("Constraints not met for delegate ", b7, ". Requesting retry."), new Throwable[0]);
                    constraintTrackingWorker.f9898z.i(new d1.k());
                    return;
                }
                d1.n.d().b(ConstraintTrackingWorker.f9893B, w1.L.i("Constraints met for delegate ", b7), new Throwable[0]);
                try {
                    I3.b startWork = constraintTrackingWorker.f9894A.startWork();
                    startWork.addListener(new l4.x(9, constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th2) {
                    d1.n d11 = d1.n.d();
                    String str = ConstraintTrackingWorker.f9893B;
                    d11.b(str, AbstractC0486a1.h("Delegated worker ", b7, " threw exception in startWork."), th2);
                    synchronized (constraintTrackingWorker.f9896x) {
                        try {
                            if (constraintTrackingWorker.f9897y) {
                                d1.n.d().b(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                                constraintTrackingWorker.f9898z.i(new d1.k());
                            } else {
                                constraintTrackingWorker.f9898z.i(new C0957j());
                            }
                            return;
                        } finally {
                        }
                    }
                }
            case 15:
                this.f8605b.a();
                return;
            case 16:
                C1777c c1777c = (C1777c) this.f8605b;
                c1777c.getClass();
                try {
                    try {
                        try {
                            d8 = c1777c.d();
                        } catch (Throwable th3) {
                            c1777c.a();
                            throw th3;
                        }
                    } catch (C1778d e7) {
                        c1777c.f18054c.J(e7);
                    }
                } catch (Throwable th4) {
                    c1777c.f18054c.J(new C1778d("error while connecting: " + th4.getMessage(), th4));
                }
                synchronized (c1777c) {
                    c1777c.f18053b = d8;
                    if (c1777c.f18052a == 5) {
                        try {
                            c1777c.f18053b.close();
                            c1777c.f18053b = null;
                        } catch (IOException e8) {
                            throw new RuntimeException(e8);
                        }
                    } else {
                        DataInputStream dataInputStream = new DataInputStream(d8.getInputStream());
                        OutputStream outputStream = d8.getOutputStream();
                        outputStream.write(c1777c.f18059h.L());
                        byte[] bArr = new byte[zzbbd.zzq.zzf];
                        ArrayList arrayList2 = new ArrayList();
                        boolean z7 = false;
                        int i10 = 0;
                        while (!z7) {
                            int read = dataInputStream.read();
                            if (read == -1) {
                                throw new C1778d("Connection closed before handshake was complete");
                            }
                            byte b8 = (byte) read;
                            bArr[i10] = b8;
                            int i11 = i10 + 1;
                            if (b8 == 10 && bArr[i10 - 1] == 13) {
                                String str2 = new String(bArr, C1777c.f18049m);
                                if (str2.trim().equals("")) {
                                    z7 = true;
                                } else {
                                    arrayList2.add(str2.trim());
                                }
                                bArr = new byte[zzbbd.zzq.zzf];
                                i10 = 0;
                            } else {
                                if (i11 == 1000) {
                                    throw new C1778d("Unexpected long line in handshake: " + new String(bArr, C1777c.f18049m));
                                }
                                i10 = i11;
                            }
                        }
                        C1759x1 c1759x1 = c1777c.f18059h;
                        String str3 = (String) arrayList2.get(0);
                        c1759x1.getClass();
                        C1759x1.j0(str3);
                        arrayList2.remove(0);
                        HashMap hashMap2 = new HashMap();
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            String[] split = ((String) it4.next()).split(": ", 2);
                            String str4 = split[0];
                            Locale locale = Locale.US;
                            hashMap2.put(str4.toLowerCase(locale), split[1].toLowerCase(locale));
                        }
                        c1777c.f18059h.getClass();
                        C1759x1.i0(hashMap2);
                        C1780f c1780f = c1777c.f18058g;
                        c1780f.getClass();
                        c1780f.f18073f = Channels.newChannel(outputStream);
                        c1777c.f18057f.f18062a = dataInputStream;
                        c1777c.f18052a = 3;
                        c1777c.f18058g.f18074g.start();
                        com.google.android.gms.common.internal.w wVar = c1777c.f18054c;
                        ((l4.y) wVar.f11336c).f15028i.execute(new l4.w(wVar, 0));
                        c1777c.f18057f.c();
                    }
                    c1777c.a();
                    return;
                }
            case 17:
                C1780f c1780f2 = (C1780f) this.f8605b;
                c1780f2.getClass();
                while (!c1780f2.f18070c && !Thread.interrupted()) {
                    try {
                        c1780f2.f18073f.write((ByteBuffer) c1780f2.f18068a.take());
                    } catch (IOException e9) {
                        C1778d c1778d = new C1778d("IO Exception", e9);
                        C1777c c1777c2 = c1780f2.f18072e;
                        c1777c2.f18054c.J(c1778d);
                        if (c1777c2.f18052a == 3) {
                            c1777c2.a();
                        }
                        c1777c2.b();
                        return;
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < c1780f2.f18068a.size(); i12++) {
                    c1780f2.f18073f.write((ByteBuffer) c1780f2.f18068a.take());
                }
                return;
            default:
                Carousel carousel = (Carousel) this.f8605b;
                carousel.f8770F.setProgress(0.0f);
                carousel.getClass();
                carousel.getClass();
                int i13 = carousel.f8769E;
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
