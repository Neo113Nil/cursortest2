package androidx.camera.core.impl;

import C.InterfaceC2688h;
import D.a;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.I;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import spay.sdk.domain.model.FraudMonInfo;

/* loaded from: classes8.dex */
public final class M implements a.InterfaceC0122a {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f38136a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private final Object f38137b;

    /* renamed from: c, reason: collision with root package name */
    private int f38138c;

    /* renamed from: d, reason: collision with root package name */
    private final A.a f38139d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f38140e;

    /* renamed from: f, reason: collision with root package name */
    private int f38141f;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private I.a f38142a = null;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f38143b;

        /* renamed from: c, reason: collision with root package name */
        private final b f38144c;

        /* renamed from: d, reason: collision with root package name */
        private final c f38145d;

        a(@NonNull Executor executor, @NonNull b bVar, @NonNull c cVar) {
            this.f38143b = executor;
            this.f38144c = bVar;
            this.f38145d = cVar;
        }

        final I.a a() {
            return this.f38142a;
        }

        final void b() {
            try {
                this.f38143b.execute(new Z.u(this.f38144c, 2));
            } catch (RejectedExecutionException e11) {
                C.S.d("CameraStateRegistry", "Unable to notify camera to configure.", e11);
            }
        }

        final void c() {
            try {
                this.f38143b.execute(new GE.b(this.f38145d, 3));
            } catch (RejectedExecutionException e11) {
                C.S.d("CameraStateRegistry", "Unable to notify camera to open.", e11);
            }
        }

        final I.a d(I.a aVar) {
            I.a aVar2 = this.f38142a;
            this.f38142a = aVar;
            return aVar2;
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public M(@NonNull A.a aVar) {
        Object obj = new Object();
        this.f38137b = obj;
        this.f38140e = new HashMap();
        this.f38138c = 1;
        synchronized (obj) {
            this.f38139d = aVar;
            this.f38141f = this.f38138c;
        }
    }

    private a b(@NonNull String str) {
        HashMap hashMap = this.f38140e;
        for (InterfaceC2688h interfaceC2688h : hashMap.keySet()) {
            if (str.equals(((H) interfaceC2688h.b()).b())) {
                return (a) hashMap.get(interfaceC2688h);
            }
        }
        return null;
    }

    private void e() {
        boolean f7 = C.S.f("CameraStateRegistry");
        StringBuilder sb2 = this.f38136a;
        if (f7) {
            sb2.setLength(0);
            sb2.append("Recalculating open cameras:\n");
            sb2.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb2.append("-------------------------------------------------------------------\n");
        }
        int i11 = 0;
        for (Map.Entry entry : this.f38140e.entrySet()) {
            if (C.S.f("CameraStateRegistry")) {
                sb2.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC2688h) entry.getKey()).toString(), ((a) entry.getValue()).a() != null ? ((a) entry.getValue()).a().toString() : FraudMonInfo.UNKNOWN));
            }
            I.a a11 = ((a) entry.getValue()).a();
            if (a11 != null && a11.a()) {
                i11++;
            }
        }
        if (C.S.f("CameraStateRegistry")) {
            sb2.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb2.append(Cm.e.c("Open count: ", i11, " (Max allowed: ", ")", this.f38138c));
            C.S.a("CameraStateRegistry", sb2.toString());
        }
        this.f38141f = Math.max(this.f38138c - i11, 0);
    }

    private static void g(InterfaceC2688h interfaceC2688h, I.a aVar) {
        if (U4.a.b()) {
            U4.a.c(aVar.ordinal(), "CX:State[" + interfaceC2688h + "]");
        }
    }

    @Override // D.a.InterfaceC0122a
    public final void a(int i11, int i12) {
        synchronized (this.f38137b) {
            boolean z11 = true;
            this.f38138c = i12 == 2 ? 2 : 1;
            boolean z12 = i11 != 2 && i12 == 2;
            if (i11 != 2 || i12 == 2) {
                z11 = false;
            }
            if (z12 || z11) {
                e();
            }
        }
    }

    public final boolean c() {
        synchronized (this.f38137b) {
            try {
                Iterator it = this.f38140e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((a) ((Map.Entry) it.next()).getValue()).a() == I.a.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(@NonNull InterfaceC2688h interfaceC2688h, @NonNull I.a aVar, boolean z11) {
        I.a d11;
        a aVar2;
        synchronized (this.f38137b) {
            try {
                int i11 = this.f38141f;
                HashMap hashMap = null;
                if (aVar == I.a.RELEASED) {
                    a aVar3 = (a) this.f38140e.remove(interfaceC2688h);
                    if (aVar3 != null) {
                        e();
                        d11 = aVar3.a();
                    } else {
                        d11 = null;
                    }
                } else {
                    a aVar4 = (a) this.f38140e.get(interfaceC2688h);
                    x2.i.e(aVar4, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    d11 = aVar4.d(aVar);
                    I.a aVar5 = I.a.OPENING;
                    if (aVar == aVar5) {
                        x2.i.f("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", (aVar != null && aVar.a()) || d11 == aVar5);
                    }
                    if (d11 != aVar) {
                        g(interfaceC2688h, aVar);
                        e();
                    }
                }
                if (d11 == aVar) {
                    return;
                }
                if (this.f38139d.b() == 2 && aVar == I.a.CONFIGURED) {
                    String c11 = this.f38139d.c(((I) interfaceC2688h).e().b());
                    if (c11 != null) {
                        aVar2 = b(c11);
                        if (i11 >= 1 && this.f38141f > 0) {
                            hashMap = new HashMap();
                            for (Map.Entry entry : this.f38140e.entrySet()) {
                                if (((a) entry.getValue()).a() == I.a.PENDING_OPEN) {
                                    hashMap.put((InterfaceC2688h) entry.getKey(), (a) entry.getValue());
                                }
                            }
                        } else if (aVar == I.a.PENDING_OPEN && this.f38141f > 0) {
                            hashMap = new HashMap();
                            hashMap.put(interfaceC2688h, (a) this.f38140e.get(interfaceC2688h));
                        }
                        if (hashMap != null && !z11) {
                            hashMap.remove(interfaceC2688h);
                        }
                        if (hashMap != null) {
                            Iterator it = hashMap.values().iterator();
                            while (it.hasNext()) {
                                ((a) it.next()).c();
                            }
                        }
                        if (aVar2 == null) {
                            aVar2.b();
                            return;
                        }
                        return;
                    }
                }
                aVar2 = null;
                if (i11 >= 1) {
                }
                if (aVar == I.a.PENDING_OPEN) {
                    hashMap = new HashMap();
                    hashMap.put(interfaceC2688h, (a) this.f38140e.get(interfaceC2688h));
                }
                if (hashMap != null) {
                    hashMap.remove(interfaceC2688h);
                }
                if (hashMap != null) {
                }
                if (aVar2 == null) {
                }
            } finally {
            }
        }
    }

    public final void f(@NonNull InterfaceC2688h interfaceC2688h, @NonNull Executor executor, @NonNull b bVar, @NonNull c cVar) {
        synchronized (this.f38137b) {
            x2.i.f("Camera is already registered: " + interfaceC2688h, !this.f38140e.containsKey(interfaceC2688h));
            this.f38140e.put(interfaceC2688h, new a(executor, bVar, cVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:4:0x0005, B:6:0x001c, B:8:0x0033, B:11:0x003c, B:13:0x0052, B:15:0x0056, B:17:0x005c, B:23:0x0072, B:25:0x007a, B:28:0x0085, B:31:0x0099, B:32:0x009c, B:37:0x006a), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:4:0x0005, B:6:0x001c, B:8:0x0033, B:11:0x003c, B:13:0x0052, B:15:0x0056, B:17:0x005c, B:23:0x0072, B:25:0x007a, B:28:0x0085, B:31:0x0099, B:32:0x009c, B:37:0x006a), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(@NonNull InterfaceC2688h interfaceC2688h) {
        boolean z11;
        synchronized (this.f38137b) {
            try {
                a aVar = (a) this.f38140e.get(interfaceC2688h);
                x2.i.e(aVar, "Camera must first be registered with registerCamera()");
                z11 = true;
                if (C.S.f("CameraStateRegistry")) {
                    this.f38136a.setLength(0);
                    StringBuilder sb2 = this.f38136a;
                    Locale locale = Locale.US;
                    Integer valueOf = Integer.valueOf(this.f38141f);
                    I.a a11 = aVar.a();
                    sb2.append(String.format(locale, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", interfaceC2688h, valueOf, Boolean.valueOf(a11 != null && a11.a()), aVar.a()));
                }
                if (this.f38141f <= 0) {
                    I.a a12 = aVar.a();
                    if (!(a12 != null && a12.a())) {
                        z11 = false;
                        if (C.S.f("CameraStateRegistry")) {
                            StringBuilder sb3 = this.f38136a;
                            Locale locale2 = Locale.US;
                            sb3.append(" --> ".concat(z11 ? "SUCCESS" : "FAIL"));
                            C.S.a("CameraStateRegistry", this.f38136a.toString());
                        }
                        if (z11) {
                            e();
                        }
                    }
                }
                I.a aVar2 = I.a.OPENING;
                aVar.d(aVar2);
                g(interfaceC2688h, aVar2);
                if (C.S.f("CameraStateRegistry")) {
                }
                if (z11) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(@NonNull String str, String str2) {
        boolean z11;
        boolean z12;
        synchronized (this.f38137b) {
            try {
                boolean z13 = true;
                if (this.f38139d.b() != 2) {
                    return true;
                }
                a b11 = b(str);
                I.a a11 = b11 != null ? b11.a() : null;
                a b12 = str2 != null ? b(str2) : null;
                I.a a12 = b12 != null ? b12.a() : null;
                I.a aVar = I.a.OPEN;
                if (!aVar.equals(a11) && !I.a.CONFIGURED.equals(a11)) {
                    z11 = false;
                    if (!aVar.equals(a12) && !I.a.CONFIGURED.equals(a12)) {
                        z12 = false;
                        if (z11 || !z12) {
                            z13 = false;
                        }
                        return z13;
                    }
                    z12 = true;
                    if (z11) {
                    }
                    z13 = false;
                    return z13;
                }
                z11 = true;
                if (!aVar.equals(a12)) {
                    z12 = false;
                    if (z11) {
                    }
                    z13 = false;
                    return z13;
                }
                z12 = true;
                if (z11) {
                }
                z13 = false;
                return z13;
            } finally {
            }
        }
    }
}
