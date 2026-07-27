package B0;

import D4.C0021v;
import D4.InterfaceC0022w;
import D4.X;
import D4.g0;
import E.C0028c;
import M.M;
import a.AbstractC0169a;
import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.location.LocationRequest;
import h2.C0482c;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.FlutterJNI;
import j5.u;
import j5.v;
import j5.w;
import java.io.File;
import java.net.Socket;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import n1.C1321h;
import n1.C1322i;

/* loaded from: classes.dex */
public final class i implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152a;

    /* renamed from: b, reason: collision with root package name */
    public Object f153b;

    /* renamed from: c, reason: collision with root package name */
    public Object f154c;

    /* renamed from: d, reason: collision with root package name */
    public Object f155d;

    /* renamed from: e, reason: collision with root package name */
    public Object f156e;

    public i(C0482c c0482c) {
        this.f152a = 1;
        this.f154c = new HashMap();
        this.f155d = new HashMap();
        this.f156e = new HashMap();
        this.f153b = c0482c;
    }

    public g a(j jVar) {
        X.k c2 = X.k.c(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        String str = jVar.f157a;
        if (str == null) {
            c2.j(1);
        } else {
            c2.f(1, str);
        }
        c2.t(2, jVar.f158b);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f153b;
        workDatabase_Impl.b();
        g gVar = null;
        String string = null;
        Cursor m6 = workDatabase_Impl.m(c2, null);
        try {
            int T2 = K1.b.T(m6, "work_spec_id");
            int T5 = K1.b.T(m6, "generation");
            int T6 = K1.b.T(m6, "system_id");
            if (m6.moveToFirst()) {
                if (!m6.isNull(T2)) {
                    string = m6.getString(T2);
                }
                gVar = new g(string, m6.getInt(T5), m6.getInt(T6));
            }
            return gVar;
        } finally {
            m6.close();
            c2.g();
        }
    }

    public File b(Context context) {
        ((l1.j) this.f154c).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER));
    }

    public void c(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f153b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f154c).q(gVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
        }
    }

    public void d(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((C0028c) this.f156e) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    public void e(LocationRequest locationRequest, C1322i c1322i, B1.o oVar) {
        B1.h hVar;
        ((B1.i) ((C0482c) this.f153b).f5783b).p();
        C1321h c1321h = c1322i.f11389c;
        if (c1321h == null) {
            hVar = null;
        } else {
            synchronized (((HashMap) this.f154c)) {
                try {
                    hVar = (B1.h) ((HashMap) this.f154c).get(c1321h);
                    if (hVar == null) {
                        hVar = new B1.h(c1322i);
                    }
                    ((HashMap) this.f154c).put(c1321h, hVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (hVar == null) {
            return;
        }
        B1.f j2 = ((C0482c) this.f153b).j();
        B1.j jVar = new B1.j(locationRequest, B1.j.f220l, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
        int i2 = B1.h.f216f;
        IInterface queryLocalInterface = hVar.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        IInterface dVar = queryLocalInterface instanceof E1.e ? (E1.e) queryLocalInterface : new E1.d(hVar, "com.google.android.gms.location.ILocationListener", 0);
        IInterface queryLocalInterface2 = oVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
        IInterface dVar2 = queryLocalInterface2 instanceof B1.e ? (B1.e) queryLocalInterface2 : new B1.d(oVar);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(j2.f211f);
        int i3 = B1.k.f232a;
        obtain.writeInt(1);
        int R5 = AbstractC0169a.R(obtain, 20293);
        AbstractC0169a.T(obtain, 1, 4);
        obtain.writeInt(1);
        AbstractC0169a.N(obtain, 2, jVar, 0);
        AbstractC0169a.M(obtain, 3, dVar == null ? null : dVar.asBinder());
        AbstractC0169a.M(obtain, 6, dVar2 != null ? dVar2.asBinder() : null);
        AbstractC0169a.S(obtain, R5);
        j2.f(obtain, 59);
    }

    public void f() {
        synchronized (((HashMap) this.f154c)) {
            try {
                for (B1.h hVar : ((HashMap) this.f154c).values()) {
                    if (hVar != null) {
                        B1.f j2 = ((C0482c) this.f153b).j();
                        int i2 = B1.h.f216f;
                        IInterface queryLocalInterface = hVar.queryLocalInterface("com.google.android.gms.location.ILocationListener");
                        IInterface dVar = queryLocalInterface instanceof E1.e ? (E1.e) queryLocalInterface : new E1.d(hVar, "com.google.android.gms.location.ILocationListener", 0);
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(j2.f211f);
                        int i3 = B1.k.f232a;
                        obtain.writeInt(1);
                        int R5 = AbstractC0169a.R(obtain, 20293);
                        AbstractC0169a.T(obtain, 1, 4);
                        obtain.writeInt(2);
                        IBinder iBinder = null;
                        if (dVar != null) {
                            iBinder = dVar.asBinder();
                        }
                        AbstractC0169a.M(obtain, 3, iBinder);
                        AbstractC0169a.S(obtain, R5);
                        j2.f(obtain, 59);
                    }
                }
                ((HashMap) this.f154c).clear();
            } finally {
            }
        }
        synchronized (((HashMap) this.f156e)) {
            try {
                Iterator it = ((HashMap) this.f156e).values().iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                }
                ((HashMap) this.f156e).clear();
            } finally {
            }
        }
        synchronized (((HashMap) this.f155d)) {
            try {
                Iterator it2 = ((HashMap) this.f155d).values().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                }
                ((HashMap) this.f155d).clear();
            } finally {
            }
        }
    }

    @Override // j5.v
    public u q() {
        return (k5.c) this.f156e;
    }

    @Override // j5.v
    public w s() {
        return (k5.d) this.f155d;
    }

    public String toString() {
        switch (this.f152a) {
            case 5:
                String socket = ((Socket) this.f153b).toString();
                kotlin.jvm.internal.i.d(socket, "toString(...)");
                return socket;
            default:
                return super.toString();
        }
    }

    public i(InterfaceC0022w interfaceC0022w, F4.o oVar, M m6) {
        this.f152a = 3;
        this.f153b = interfaceC0022w;
        this.f154c = m6;
        this.f155d = F4.i.a(Integer.MAX_VALUE, 0, 6);
        this.f156e = new C0482c(22);
        X x5 = (X) interfaceC0022w.g().o(C0021v.f545b);
        if (x5 != null) {
            ((g0) x5).H(false, true, new E4.d(oVar, 1, this));
        }
    }

    public i(WorkDatabase_Impl workDatabase_Impl) {
        this.f152a = 0;
        this.f153b = workDatabase_Impl;
        this.f154c = new b(workDatabase_Impl, 2);
        this.f155d = new h(workDatabase_Impl, 0);
        this.f156e = new h(workDatabase_Impl, 1);
    }

    public i(Socket socket) {
        this.f152a = 5;
        this.f153b = socket;
        this.f154c = new AtomicInteger();
        this.f155d = new k5.d(this);
        this.f156e = new k5.c(this);
    }

    public i(int i2) {
        this.f152a = i2;
        switch (i2) {
            case 4:
                break;
            default:
                l1.j jVar = new l1.j(5);
                W1.e eVar = new W1.e();
                this.f153b = new HashSet();
                this.f154c = jVar;
                this.f155d = eVar;
                break;
        }
    }
}
