package B0;

import W.K;
import W.L;
import a.AbstractC0169a;
import a2.C0180a;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.A;
import androidx.work.impl.WorkDatabase_Impl;
import com.chickyneer.roadway.R;
import f4.C0430g;
import f4.v;
import g4.AbstractC0476u;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import k1.C1211g;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m.C1263a;
import m.C1265c;
import org.json.JSONException;
import org.json.JSONObject;
import s0.u;
import s0.w;
import s0.x;
import y2.C1562g;
import z3.AbstractC1576a;

/* loaded from: classes.dex */
public final class t implements H2.c, G4.d, x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206a;

    /* renamed from: b, reason: collision with root package name */
    public Object f207b;

    /* renamed from: c, reason: collision with root package name */
    public Object f208c;

    public /* synthetic */ t(int i2) {
        this.f206a = i2;
    }

    @Override // H2.c
    public void b(Object obj) {
        switch (this.f206a) {
            case 3:
                B4.i iVar = (B4.i) this.f208c;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) iVar.f311b;
                G2.k kVar = (G2.k) this.f207b;
                concurrentLinkedQueue.remove(kVar);
                if (!((ConcurrentLinkedQueue) iVar.f311b).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + kVar.f977a);
                    break;
                }
                break;
            default:
                ((C1562g) this.f207b).a(((H2.k) ((f2.t) ((x1.e) this.f208c).f12266b).f5638c).encodeMessage(obj));
                break;
        }
    }

    public void c() {
        H2.g gVar = (H2.g) this.f208c;
        if (gVar != null) {
            if (!gVar.f1140a.getAndSet(true)) {
                B4.i iVar = gVar.f1141b;
                if (((AtomicReference) iVar.f312c).get() == gVar) {
                    B4.i iVar2 = (B4.i) iVar.f313d;
                    ((H2.f) iVar2.f311b).o((String) iVar2.f312c, null);
                }
            }
            this.f208c = null;
        }
        ((B4.i) this.f207b).T(null);
    }

    public void d(String str, String str2, String str3) {
        H2.g gVar = (H2.g) this.f208c;
        if (gVar == null || gVar.f1140a.get()) {
            return;
        }
        B4.i iVar = gVar.f1141b;
        if (((AtomicReference) iVar.f312c).get() != gVar) {
            return;
        }
        B4.i iVar2 = (B4.i) iVar.f313d;
        ((H2.f) iVar2.f311b).o((String) iVar2.f312c, ((H2.s) iVar2.f313d).c(str, str2, str3));
    }

    public View e(int i2, int i3, int i6, int i7) {
        L l2 = (L) this.f207b;
        int q5 = l2.q();
        int e3 = l2.e();
        int i8 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View p5 = l2.p(i2);
            int h3 = l2.h(p5);
            int t5 = l2.t(p5);
            K k3 = (K) this.f208c;
            k3.f3292b = q5;
            k3.f3293c = e3;
            k3.f3294d = h3;
            k3.f3295e = t5;
            if (i6 != 0) {
                k3.f3291a = i6;
                if (k3.a()) {
                    return p5;
                }
            }
            if (i7 != 0) {
                k3.f3291a = i7;
                if (k3.a()) {
                    view = p5;
                }
            }
            i2 += i8;
        }
        return view;
    }

    public File f() {
        if (((File) this.f207b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f207b) == null) {
                        K1.g gVar = (K1.g) this.f208c;
                        gVar.a();
                        this.f207b = new File(gVar.f1387a.getFilesDir(), "PersistedInstallation." + ((K1.g) this.f208c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f207b;
    }

    public String g(String str) {
        String str2 = (String) this.f208c;
        Resources resources = (Resources) this.f207b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public ArrayList h(String str) {
        X.k c2 = X.k.c(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            c2.j(1);
        } else {
            c2.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f207b;
        workDatabase_Impl.b();
        Cursor m6 = workDatabase_Impl.m(c2, null);
        try {
            ArrayList arrayList = new ArrayList(m6.getCount());
            while (m6.moveToNext()) {
                arrayList.add(m6.isNull(0) ? null : m6.getString(0));
            }
            return arrayList;
        } finally {
            m6.close();
            c2.g();
        }
    }

    @Override // G4.d
    public Object i(G4.e eVar, InterfaceC1218d interfaceC1218d) {
        Object i2 = ((G4.d) this.f207b).i(new N2.m(eVar, (P.d) this.f208c, 3), interfaceC1218d);
        return i2 == EnumC1260a.f11058a ? i2 : v.f5689a;
    }

    public void j(C0180a c0180a) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c0180a.f3848a);
            jSONObject.put("Status", O.j.b(c0180a.f3849b));
            jSONObject.put("AuthToken", c0180a.f3850c);
            jSONObject.put("RefreshToken", c0180a.f3851d);
            jSONObject.put("TokenCreationEpochInSecs", c0180a.f3853f);
            jSONObject.put("ExpiresInSecs", c0180a.f3852e);
            jSONObject.put("FisError", c0180a.f3854g);
            K1.g gVar = (K1.g) this.f208c;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f1387a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(f())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void k(AbstractC0169a abstractC0169a) {
        boolean z;
        A a6 = (A) this.f207b;
        synchronized (a6.f4512a) {
            z = a6.f4515d == A.f4511i;
            a6.f4515d = abstractC0169a;
        }
        if (z) {
            C1263a U2 = C1263a.U();
            B.a aVar = a6.f4519h;
            C1265c c1265c = U2.f11083g;
            if (c1265c.f11087i == null) {
                synchronized (c1265c.f11085g) {
                    try {
                        if (c1265c.f11087i == null) {
                            c1265c.f11087i = C1265c.U(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            c1265c.f11087i.post(aVar);
        }
        if (abstractC0169a instanceof w) {
            ((D0.k) this.f208c).k((w) abstractC0169a);
        } else if (abstractC0169a instanceof u) {
            ((D0.k) this.f208c).l(((u) abstractC0169a).f11797g);
        }
    }

    public C0180a l() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(f());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i2 = O.j.c(5)[optInt];
        if (i2 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i2 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new C0180a(optString, i2, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void m(String str, Map arguments) {
        kotlin.jvm.internal.i.e(arguments, "arguments");
        H2.g gVar = (H2.g) this.f208c;
        if (gVar != null) {
            Map Z2 = AbstractC0476u.Z(arguments, new C0430g("event", str));
            if (gVar.f1140a.get()) {
                return;
            }
            B4.i iVar = gVar.f1141b;
            if (((AtomicReference) iVar.f312c).get() != gVar) {
                return;
            }
            B4.i iVar2 = (B4.i) iVar.f313d;
            ((H2.f) iVar2.f311b).o((String) iVar2.f312c, ((H2.s) iVar2.f313d).a(Z2));
        }
    }

    public /* synthetic */ t(Object obj, int i2, Object obj2) {
        this.f206a = i2;
        this.f207b = obj2;
        this.f208c = obj;
    }

    public t(Context context) {
        this.f206a = 11;
        o1.u.g(context);
        Resources resources = context.getResources();
        this.f207b = resources;
        this.f208c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public t(IBinder iBinder) {
        this.f206a = 9;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f207b = new Messenger(iBinder);
            this.f208c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f208c = new C1211g(iBinder);
            this.f207b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public t(WorkDatabase_Impl workDatabase_Impl) {
        this.f206a = 0;
        this.f207b = workDatabase_Impl;
        this.f208c = new b(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 16);
    }

    public t() {
        this.f206a = 12;
        this.f207b = new A();
        this.f208c = new D0.k();
        k(x.f11799S);
    }

    public t(K1.g gVar) {
        this.f206a = 8;
        this.f208c = gVar;
    }

    public t(AbstractC1576a abstractC1576a) {
        this.f206a = 13;
        this.f207b = abstractC1576a;
    }

    public t(G4.d dVar, P.d dVar2) {
        this.f206a = 6;
        this.f207b = dVar;
        this.f208c = dVar2;
    }

    public t(L l2) {
        this.f206a = 7;
        this.f207b = l2;
        K k3 = new K();
        k3.f3291a = 0;
        this.f208c = k3;
    }

    public t(B4.i iVar) {
        this.f206a = 10;
        this.f207b = iVar;
        iVar.T(this);
    }
}
