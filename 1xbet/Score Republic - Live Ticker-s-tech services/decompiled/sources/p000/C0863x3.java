package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: x3 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0863x3 implements InterfaceC0826w3 {

    /* JADX INFO: renamed from: c */
    public static volatile C0863x3 f8772c;

    /* JADX INFO: renamed from: a */
    public final AppMeasurementSdk f8773a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f8774b;

    public C0863x3(AppMeasurementSdk appMeasurementSdk) {
        p80.m3863h(appMeasurementSdk);
        this.f8773a = appMeasurementSdk;
        this.f8774b = new ConcurrentHashMap();
    }

    @Override // p000.InterfaceC0826w3
    /* JADX INFO: renamed from: a */
    public final int mo4420a() {
        return this.f8773a.f1350a.m3433a("fiam");
    }

    @Override // p000.InterfaceC0826w3
    /* JADX INFO: renamed from: b */
    public final void mo4421b(String str) {
        mw1 mw1Var = this.f8773a.f1350a;
        mw1Var.m3434b(new aw1(mw1Var, str, (String) null, (Bundle) null));
    }

    @Override // p000.InterfaceC0826w3
    /* JADX INFO: renamed from: c */
    public final List mo4422c() {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f8773a.f1350a.m3436e("fiam", "")) {
            q01 q01Var = ou1.f5916a;
            p80.m3863h(bundle);
            C0789v3 c0789v3 = new C0789v3();
            String str = (String) oa2.m3663j(bundle, "origin", String.class, null);
            p80.m3863h(str);
            c0789v3.f8025a = str;
            String str2 = (String) oa2.m3663j(bundle, "name", String.class, null);
            p80.m3863h(str2);
            c0789v3.f8026b = str2;
            c0789v3.f8027c = oa2.m3663j(bundle, "value", Object.class, null);
            c0789v3.f8028d = (String) oa2.m3663j(bundle, "trigger_event_name", String.class, null);
            c0789v3.f8029e = ((Long) oa2.m3663j(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            c0789v3.f8030f = (String) oa2.m3663j(bundle, "timed_out_event_name", String.class, null);
            c0789v3.f8031g = (Bundle) oa2.m3663j(bundle, "timed_out_event_params", Bundle.class, null);
            c0789v3.f8032h = (String) oa2.m3663j(bundle, "triggered_event_name", String.class, null);
            c0789v3.f8033i = (Bundle) oa2.m3663j(bundle, "triggered_event_params", Bundle.class, null);
            c0789v3.f8034j = ((Long) oa2.m3663j(bundle, "time_to_live", Long.class, 0L)).longValue();
            c0789v3.f8035k = (String) oa2.m3663j(bundle, "expired_event_name", String.class, null);
            c0789v3.f8036l = (Bundle) oa2.m3663j(bundle, "expired_event_params", Bundle.class, null);
            c0789v3.f8038n = ((Boolean) oa2.m3663j(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            c0789v3.f8037m = ((Long) oa2.m3663j(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            c0789v3.f8039o = ((Long) oa2.m3663j(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(c0789v3);
        }
        return arrayList;
    }

    @Override // p000.InterfaceC0826w3
    /* JADX INFO: renamed from: d */
    public final void mo4423d(Object obj, String str) {
        if (ou1.m3796a(str) && ou1.m3798c(str, "_ln")) {
            mw1 mw1Var = this.f8773a.f1350a;
            mw1Var.m3434b(new yv1(mw1Var, str, "_ln", obj, true));
        }
    }

    @Override // p000.InterfaceC0826w3
    /* JADX INFO: renamed from: e */
    public final void mo4424e(C0789v3 c0789v3) {
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        q01 q01Var = ou1.f5916a;
        String str = c0789v3.f8025a;
        if (str.isEmpty()) {
            return;
        }
        Object obj = c0789v3.f8027c;
        if (obj != null) {
            Object obj2 = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        try {
                            Object object = objectInputStream.readObject();
                            objectOutputStream.close();
                            objectInputStream.close();
                            obj2 = object;
                        } catch (Throwable th2) {
                            th = th2;
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            if (objectInputStream == null) {
                                throw th;
                            }
                            objectInputStream.close();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectInputStream = null;
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
                if (obj2 == null) {
                    return;
                }
            } catch (Throwable th4) {
                th = th4;
                objectInputStream = null;
                objectOutputStream = null;
            }
        }
        if (ou1.m3796a(str) && ou1.m3798c(str, c0789v3.f8026b)) {
            String str2 = c0789v3.f8035k;
            if (str2 == null || (ou1.m3797b(c0789v3.f8036l, str2) && ou1.m3799d(str, c0789v3.f8035k, c0789v3.f8036l))) {
                String str3 = c0789v3.f8032h;
                if (str3 == null || (ou1.m3797b(c0789v3.f8033i, str3) && ou1.m3799d(str, c0789v3.f8032h, c0789v3.f8033i))) {
                    String str4 = c0789v3.f8030f;
                    if (str4 == null || (ou1.m3797b(c0789v3.f8031g, str4) && ou1.m3799d(str, c0789v3.f8030f, c0789v3.f8031g))) {
                        Bundle bundle = new Bundle();
                        bundle.putString("origin", c0789v3.f8025a);
                        String str5 = c0789v3.f8026b;
                        if (str5 != null) {
                            bundle.putString("name", str5);
                        }
                        Object obj3 = c0789v3.f8027c;
                        if (obj3 != null) {
                            oa2.m3662i(bundle, obj3);
                        }
                        String str6 = c0789v3.f8028d;
                        if (str6 != null) {
                            bundle.putString("trigger_event_name", str6);
                        }
                        bundle.putLong("trigger_timeout", c0789v3.f8029e);
                        String str7 = c0789v3.f8030f;
                        if (str7 != null) {
                            bundle.putString("timed_out_event_name", str7);
                        }
                        Bundle bundle2 = c0789v3.f8031g;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str8 = c0789v3.f8032h;
                        if (str8 != null) {
                            bundle.putString("triggered_event_name", str8);
                        }
                        Bundle bundle3 = c0789v3.f8033i;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", c0789v3.f8034j);
                        String str9 = c0789v3.f8035k;
                        if (str9 != null) {
                            bundle.putString("expired_event_name", str9);
                        }
                        Bundle bundle4 = c0789v3.f8036l;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", c0789v3.f8037m);
                        bundle.putBoolean("active", c0789v3.f8038n);
                        bundle.putLong("triggered_timestamp", c0789v3.f8039o);
                        mw1 mw1Var = this.f8773a.f1350a;
                        mw1Var.m3434b(new zv1(mw1Var, bundle));
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC0826w3
    /* JADX INFO: renamed from: f */
    public final void mo4425f(String str, String str2, Bundle bundle) {
        if (ou1.m3796a(str) && ou1.m3797b(bundle, str2) && ou1.m3799d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f8773a.logEvent(str, str2, bundle);
        }
    }

    @Override // p000.InterfaceC0826w3
    /* JADX INFO: renamed from: g */
    public final InterfaceC0752u3 mo4426g(b90 b90Var) {
        if (!ou1.m3796a("fiam")) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f8774b;
        if (concurrentHashMap.containsKey("fiam") && concurrentHashMap.get("fiam") != null) {
            return null;
        }
        concurrentHashMap.put("fiam", new hw1(this.f8773a, b90Var));
        return new b90(7, this);
    }
}
