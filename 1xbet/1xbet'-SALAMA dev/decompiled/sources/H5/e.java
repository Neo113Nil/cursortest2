package H5;

import A5.y;
import B4.C0070n;
import B4.EnumC0071o;
import B4.J;
import B4.K;
import B4.U;
import B4.V;
import B4.W;
import B4.Z;
import E5.C0184b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import p155w1.F0;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public class e implements FlutterFirebasePlugin, p159w5.c, p164x5.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final HashMap f3360y = new HashMap();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final HashMap f3361z = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A5.f f3363b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f3362a = new y(c.f3353d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f3364c = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f3365d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f3366e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f3367f = new HashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f3368x = new HashMap();

    public static FirebaseFirestore a(m mVar) {
        synchronized (f3360y) {
            try {
                FirebaseFirestore firebaseFirestoreB = b(mVar.f3384a, mVar.f3386c);
                if (firebaseFirestoreB != null) {
                    return firebaseFirestoreB;
                }
                FirebaseFirestore firebaseFirestoreE = FirebaseFirestore.e(Y3.i.f(mVar.f3384a), mVar.f3386c);
                firebaseFirestoreE.h(c(mVar));
                g(firebaseFirestoreE, mVar.f3386c);
                return firebaseFirestoreE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static FirebaseFirestore b(String str, String str2) {
        HashMap map = f3360y;
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    Y3.i iVar = ((b) entry.getValue()).f3351a.f11968g;
                    iVar.b();
                    if (iVar.f7664b.equals(str) && ((b) entry.getValue()).f3352b.equals(str2)) {
                        return (FirebaseFirestore) entry.getKey();
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static K c(m mVar) {
        J j = new J();
        String str = mVar.f3385b.f3399b;
        if (str != null) {
            j.f1099a = str;
        }
        Boolean bool = mVar.f3385b.f3400c;
        if (bool != null) {
            j.f1100b = bool.booleanValue();
        }
        Boolean bool2 = mVar.f3385b.f3398a;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                Long l7 = mVar.f3385b.f3401d;
                j.b(new W((l7 == null || l7.longValue() == -1) ? 104857600L : l7.longValue()));
            } else {
                V v6 = new V(0);
                U u4 = new U();
                u4.f1132a = v6;
                j.b(u4);
            }
        }
        return j.a();
    }

    public static void g(FirebaseFirestore firebaseFirestore, String str) {
        HashMap map = f3360y;
        synchronized (map) {
            try {
                if (((b) map.get(firebaseFirestore)) == null) {
                    map.put(firebaseFirestore, new b(firebaseFirestore, str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String d(String str, A5.i iVar) {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        e(str, lowerCase, iVar);
        return lowerCase;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new A0.f(21, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final void e(String str, String str2, A5.i iVar) {
        A5.j jVar = new A5.j(this.f3363b, p031e1.k.f(str, "/", str2), this.f3362a);
        jVar.a(iVar);
        this.f3366e.put(str2, jVar);
        this.f3367f.put(str2, iVar);
    }

    public final void f() {
        synchronized (this.f3366e) {
            try {
                Iterator it = this.f3366e.keySet().iterator();
                while (it.hasNext()) {
                    A5.j jVar = (A5.j) this.f3366e.get((String) it.next());
                    Objects.requireNonNull(jVar);
                    jVar.a(null);
                }
                this.f3366e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f3367f) {
            try {
                Iterator it2 = this.f3367f.keySet().iterator();
                while (it2.hasNext()) {
                    A5.i iVar = (A5.i) this.f3367f.get((String) it2.next());
                    Objects.requireNonNull(iVar);
                    iVar.b();
                }
                this.f3367f.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3368x.clear();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(Y3.i iVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new F5.d(2, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // p164x5.a
    public final void onAttachedToActivity(p164x5.b bVar) {
        this.f3364c.set((p121q5.c) ((Q3.o) bVar).f5822a);
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        this.f3363b = bVar.f18083c;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_firestore", this);
        A5.f fVar = this.f3363b;
        l lVar = l.f3383e;
        Object obj = null;
        final int i7 = 0;
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.loadBundle", lVar, obj, 1).M(new A5.b(this) { // from class: H5.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f3381b;

            {
                this.f3381b = this;
            }

            @Override // A5.b
            public final void i(Object obj2, V0 v6) {
                switch (i7) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        arrayList.add(0, this.f3381b.d("plugins.flutter.io/firebase_firestore/loadBundle", new I5.c(e.a((m) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        v6.f(arrayList);
                        break;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj2;
                        m mVar = (m) arrayList4.get(0);
                        String str = (String) arrayList4.get(1);
                        Boolean bool = (Boolean) arrayList4.get(2);
                        t tVar = (t) arrayList4.get(3);
                        s sVar = (s) arrayList4.get(4);
                        Boolean bool2 = (Boolean) arrayList4.get(5);
                        int i8 = p136t.e.f(2)[((Integer) arrayList4.get(6)).intValue()];
                        e eVar = this.f3381b;
                        Z zL0 = p003a.a.l0(e.a(mVar), str, bool.booleanValue(), tVar);
                        if (zL0 != null) {
                            EnumC0071o enumC0071oJ0 = p003a.a.j0(sVar.f3404b);
                            int iI0 = p003a.a.i0(i8);
                            I5.a aVar = new I5.a(1);
                            aVar.f3698f = zL0;
                            aVar.f3694b = bool2.booleanValue() ? 2 : 1;
                            aVar.f3695c = enumC0071oJ0;
                            aVar.f3696d = iI0;
                            arrayList3.add(0, eVar.d("plugins.flutter.io/firebase_firestore/query", aVar));
                            v6.f(arrayList3);
                        } else {
                            v6.f(p097n3.a.Z(new n("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                        }
                        break;
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj2;
                        m mVar2 = (m) arrayList6.get(0);
                        i iVar = (i) arrayList6.get(1);
                        Boolean bool3 = (Boolean) arrayList6.get(2);
                        int i9 = p136t.e.f(2)[((Integer) arrayList6.get(3)).intValue()];
                        e eVar2 = this.f3381b;
                        e.a(mVar2);
                        C0070n c0070nD = e.a(mVar2).d(iVar.f3375a);
                        EnumC0071o enumC0071oJ1 = p003a.a.j0(iVar.f3379e);
                        int iI1 = p003a.a.i0(i9);
                        I5.a aVar2 = new I5.a(0);
                        aVar2.f3698f = c0070nD;
                        aVar2.f3694b = bool3.booleanValue() ? 2 : 1;
                        aVar2.f3695c = enumC0071oJ1;
                        aVar2.f3696d = iI1;
                        arrayList5.add(0, eVar2.d("plugins.flutter.io/firebase_firestore/document", aVar2));
                        v6.f(arrayList5);
                        break;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj2;
                        m mVar3 = (m) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        e eVar3 = this.f3381b;
                        FirebaseFirestore firebaseFirestoreA = e.a(mVar3);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        I5.e eVar4 = new I5.e(new B1.c(9, eVar3, lowerCase), firebaseFirestoreA, lValueOf, lValueOf2);
                        eVar3.e("plugins.flutter.io/firebase_firestore/transaction", lowerCase, eVar4);
                        eVar3.f3368x.put(lowerCase, eVar4);
                        arrayList7.add(0, lowerCase);
                        v6.f(arrayList7);
                        break;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        m mVar4 = (m) ((ArrayList) obj2).get(0);
                        e eVar5 = this.f3381b;
                        FirebaseFirestore firebaseFirestoreA2 = e.a(mVar4);
                        C0184b c0184b = new C0184b();
                        c0184b.f2353c = firebaseFirestoreA2;
                        arrayList9.add(0, eVar5.d("plugins.flutter.io/firebase_firestore/snapshotsInSync", c0184b));
                        v6.f(arrayList9);
                        break;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj2;
                        String str2 = (String) arrayList11.get(0);
                        int i10 = p136t.e.f(2)[((Integer) arrayList11.get(1)).intValue()];
                        List list = (List) arrayList11.get(2);
                        I5.e eVar6 = (I5.e) this.f3381b.f3368x.get(str2);
                        Objects.requireNonNull(eVar6);
                        eVar6.f3713f = i10;
                        eVar6.f3714x = list;
                        eVar6.f3712e.release();
                        arrayList10.add(0, null);
                        v6.f(arrayList10);
                        break;
                    default:
                        ArrayList arrayList12 = (ArrayList) obj2;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new E4.p(this.f3381b, (m) arrayList12.get(0), (String) arrayList12.get(2), (String) arrayList12.get(1), new E5.r(new ArrayList(), v6, 20), 1));
                        break;
                }
            }
        });
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.namedQueryGet", lVar, obj, 1).M(new B1.f(this, 17));
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.clearPersistence", lVar, obj, 1).M(new B1.f(this, 19));
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.disableNetwork", lVar, obj, 1).M(new B1.f(this, 20));
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.enableNetwork", lVar, obj, 1).M(new B1.f(this, 21));
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.terminate", lVar, obj, 1).M(new B1.f(this, 22));
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.waitForPendingWrites", lVar, obj, 1).M(new B1.f(this, 23));
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.setIndexConfiguration", lVar, obj, 1).M(new B1.f(this, 24));
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.setLoggingEnabled", lVar, obj, 1).M(new B1.f(this, 25));
        final int i8 = 4;
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.snapshotsInSyncSetup", lVar, obj, 1).M(new A5.b(this) { // from class: H5.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f3381b;

            {
                this.f3381b = this;
            }

            @Override // A5.b
            public final void i(Object obj2, V0 v6) {
                switch (i8) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        arrayList.add(0, this.f3381b.d("plugins.flutter.io/firebase_firestore/loadBundle", new I5.c(e.a((m) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        v6.f(arrayList);
                        break;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj2;
                        m mVar = (m) arrayList4.get(0);
                        String str = (String) arrayList4.get(1);
                        Boolean bool = (Boolean) arrayList4.get(2);
                        t tVar = (t) arrayList4.get(3);
                        s sVar = (s) arrayList4.get(4);
                        Boolean bool2 = (Boolean) arrayList4.get(5);
                        int i9 = p136t.e.f(2)[((Integer) arrayList4.get(6)).intValue()];
                        e eVar = this.f3381b;
                        Z zL0 = p003a.a.l0(e.a(mVar), str, bool.booleanValue(), tVar);
                        if (zL0 != null) {
                            EnumC0071o enumC0071oJ0 = p003a.a.j0(sVar.f3404b);
                            int iI0 = p003a.a.i0(i9);
                            I5.a aVar = new I5.a(1);
                            aVar.f3698f = zL0;
                            aVar.f3694b = bool2.booleanValue() ? 2 : 1;
                            aVar.f3695c = enumC0071oJ0;
                            aVar.f3696d = iI0;
                            arrayList3.add(0, eVar.d("plugins.flutter.io/firebase_firestore/query", aVar));
                            v6.f(arrayList3);
                        } else {
                            v6.f(p097n3.a.Z(new n("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                        }
                        break;
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj2;
                        m mVar2 = (m) arrayList6.get(0);
                        i iVar = (i) arrayList6.get(1);
                        Boolean bool3 = (Boolean) arrayList6.get(2);
                        int i10 = p136t.e.f(2)[((Integer) arrayList6.get(3)).intValue()];
                        e eVar2 = this.f3381b;
                        e.a(mVar2);
                        C0070n c0070nD = e.a(mVar2).d(iVar.f3375a);
                        EnumC0071o enumC0071oJ1 = p003a.a.j0(iVar.f3379e);
                        int iI1 = p003a.a.i0(i10);
                        I5.a aVar2 = new I5.a(0);
                        aVar2.f3698f = c0070nD;
                        aVar2.f3694b = bool3.booleanValue() ? 2 : 1;
                        aVar2.f3695c = enumC0071oJ1;
                        aVar2.f3696d = iI1;
                        arrayList5.add(0, eVar2.d("plugins.flutter.io/firebase_firestore/document", aVar2));
                        v6.f(arrayList5);
                        break;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj2;
                        m mVar3 = (m) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        e eVar3 = this.f3381b;
                        FirebaseFirestore firebaseFirestoreA = e.a(mVar3);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        I5.e eVar4 = new I5.e(new B1.c(9, eVar3, lowerCase), firebaseFirestoreA, lValueOf, lValueOf2);
                        eVar3.e("plugins.flutter.io/firebase_firestore/transaction", lowerCase, eVar4);
                        eVar3.f3368x.put(lowerCase, eVar4);
                        arrayList7.add(0, lowerCase);
                        v6.f(arrayList7);
                        break;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        m mVar4 = (m) ((ArrayList) obj2).get(0);
                        e eVar5 = this.f3381b;
                        FirebaseFirestore firebaseFirestoreA2 = e.a(mVar4);
                        C0184b c0184b = new C0184b();
                        c0184b.f2353c = firebaseFirestoreA2;
                        arrayList9.add(0, eVar5.d("plugins.flutter.io/firebase_firestore/snapshotsInSync", c0184b));
                        v6.f(arrayList9);
                        break;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj2;
                        String str2 = (String) arrayList11.get(0);
                        int i11 = p136t.e.f(2)[((Integer) arrayList11.get(1)).intValue()];
                        List list = (List) arrayList11.get(2);
                        I5.e eVar6 = (I5.e) this.f3381b.f3368x.get(str2);
                        Objects.requireNonNull(eVar6);
                        eVar6.f3713f = i11;
                        eVar6.f3714x = list;
                        eVar6.f3712e.release();
                        arrayList10.add(0, null);
                        v6.f(arrayList10);
                        break;
                    default:
                        ArrayList arrayList12 = (ArrayList) obj2;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new E4.p(this.f3381b, (m) arrayList12.get(0), (String) arrayList12.get(2), (String) arrayList12.get(1), new E5.r(new ArrayList(), v6, 20), 1));
                        break;
                }
            }
        });
        final int i9 = 3;
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionCreate", lVar, obj, 1).M(new A5.b(this) { // from class: H5.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f3381b;

            {
                this.f3381b = this;
            }

            @Override // A5.b
            public final void i(Object obj2, V0 v6) {
                switch (i9) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        arrayList.add(0, this.f3381b.d("plugins.flutter.io/firebase_firestore/loadBundle", new I5.c(e.a((m) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        v6.f(arrayList);
                        break;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj2;
                        m mVar = (m) arrayList4.get(0);
                        String str = (String) arrayList4.get(1);
                        Boolean bool = (Boolean) arrayList4.get(2);
                        t tVar = (t) arrayList4.get(3);
                        s sVar = (s) arrayList4.get(4);
                        Boolean bool2 = (Boolean) arrayList4.get(5);
                        int i10 = p136t.e.f(2)[((Integer) arrayList4.get(6)).intValue()];
                        e eVar = this.f3381b;
                        Z zL0 = p003a.a.l0(e.a(mVar), str, bool.booleanValue(), tVar);
                        if (zL0 != null) {
                            EnumC0071o enumC0071oJ0 = p003a.a.j0(sVar.f3404b);
                            int iI0 = p003a.a.i0(i10);
                            I5.a aVar = new I5.a(1);
                            aVar.f3698f = zL0;
                            aVar.f3694b = bool2.booleanValue() ? 2 : 1;
                            aVar.f3695c = enumC0071oJ0;
                            aVar.f3696d = iI0;
                            arrayList3.add(0, eVar.d("plugins.flutter.io/firebase_firestore/query", aVar));
                            v6.f(arrayList3);
                        } else {
                            v6.f(p097n3.a.Z(new n("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                        }
                        break;
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj2;
                        m mVar2 = (m) arrayList6.get(0);
                        i iVar = (i) arrayList6.get(1);
                        Boolean bool3 = (Boolean) arrayList6.get(2);
                        int i11 = p136t.e.f(2)[((Integer) arrayList6.get(3)).intValue()];
                        e eVar2 = this.f3381b;
                        e.a(mVar2);
                        C0070n c0070nD = e.a(mVar2).d(iVar.f3375a);
                        EnumC0071o enumC0071oJ1 = p003a.a.j0(iVar.f3379e);
                        int iI1 = p003a.a.i0(i11);
                        I5.a aVar2 = new I5.a(0);
                        aVar2.f3698f = c0070nD;
                        aVar2.f3694b = bool3.booleanValue() ? 2 : 1;
                        aVar2.f3695c = enumC0071oJ1;
                        aVar2.f3696d = iI1;
                        arrayList5.add(0, eVar2.d("plugins.flutter.io/firebase_firestore/document", aVar2));
                        v6.f(arrayList5);
                        break;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj2;
                        m mVar3 = (m) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        e eVar3 = this.f3381b;
                        FirebaseFirestore firebaseFirestoreA = e.a(mVar3);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        I5.e eVar4 = new I5.e(new B1.c(9, eVar3, lowerCase), firebaseFirestoreA, lValueOf, lValueOf2);
                        eVar3.e("plugins.flutter.io/firebase_firestore/transaction", lowerCase, eVar4);
                        eVar3.f3368x.put(lowerCase, eVar4);
                        arrayList7.add(0, lowerCase);
                        v6.f(arrayList7);
                        break;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        m mVar4 = (m) ((ArrayList) obj2).get(0);
                        e eVar5 = this.f3381b;
                        FirebaseFirestore firebaseFirestoreA2 = e.a(mVar4);
                        C0184b c0184b = new C0184b();
                        c0184b.f2353c = firebaseFirestoreA2;
                        arrayList9.add(0, eVar5.d("plugins.flutter.io/firebase_firestore/snapshotsInSync", c0184b));
                        v6.f(arrayList9);
                        break;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj2;
                        String str2 = (String) arrayList11.get(0);
                        int i12 = p136t.e.f(2)[((Integer) arrayList11.get(1)).intValue()];
                        List list = (List) arrayList11.get(2);
                        I5.e eVar6 = (I5.e) this.f3381b.f3368x.get(str2);
                        Objects.requireNonNull(eVar6);
                        eVar6.f3713f = i12;
                        eVar6.f3714x = list;
                        eVar6.f3712e.release();
                        arrayList10.add(0, null);
                        v6.f(arrayList10);
                        break;
                    default:
                        ArrayList arrayList12 = (ArrayList) obj2;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new E4.p(this.f3381b, (m) arrayList12.get(0), (String) arrayList12.get(2), (String) arrayList12.get(1), new E5.r(new ArrayList(), v6, 20), 1));
                        break;
                }
            }
        });
        final int i10 = 5;
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionStoreResult", lVar, obj, 1).M(new A5.b(this) { // from class: H5.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f3381b;

            {
                this.f3381b = this;
            }

            @Override // A5.b
            public final void i(Object obj2, V0 v6) {
                switch (i10) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        arrayList.add(0, this.f3381b.d("plugins.flutter.io/firebase_firestore/loadBundle", new I5.c(e.a((m) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        v6.f(arrayList);
                        break;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj2;
                        m mVar = (m) arrayList4.get(0);
                        String str = (String) arrayList4.get(1);
                        Boolean bool = (Boolean) arrayList4.get(2);
                        t tVar = (t) arrayList4.get(3);
                        s sVar = (s) arrayList4.get(4);
                        Boolean bool2 = (Boolean) arrayList4.get(5);
                        int i11 = p136t.e.f(2)[((Integer) arrayList4.get(6)).intValue()];
                        e eVar = this.f3381b;
                        Z zL0 = p003a.a.l0(e.a(mVar), str, bool.booleanValue(), tVar);
                        if (zL0 != null) {
                            EnumC0071o enumC0071oJ0 = p003a.a.j0(sVar.f3404b);
                            int iI0 = p003a.a.i0(i11);
                            I5.a aVar = new I5.a(1);
                            aVar.f3698f = zL0;
                            aVar.f3694b = bool2.booleanValue() ? 2 : 1;
                            aVar.f3695c = enumC0071oJ0;
                            aVar.f3696d = iI0;
                            arrayList3.add(0, eVar.d("plugins.flutter.io/firebase_firestore/query", aVar));
                            v6.f(arrayList3);
                        } else {
                            v6.f(p097n3.a.Z(new n("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                        }
                        break;
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj2;
                        m mVar2 = (m) arrayList6.get(0);
                        i iVar = (i) arrayList6.get(1);
                        Boolean bool3 = (Boolean) arrayList6.get(2);
                        int i12 = p136t.e.f(2)[((Integer) arrayList6.get(3)).intValue()];
                        e eVar2 = this.f3381b;
                        e.a(mVar2);
                        C0070n c0070nD = e.a(mVar2).d(iVar.f3375a);
                        EnumC0071o enumC0071oJ1 = p003a.a.j0(iVar.f3379e);
                        int iI1 = p003a.a.i0(i12);
                        I5.a aVar2 = new I5.a(0);
                        aVar2.f3698f = c0070nD;
                        aVar2.f3694b = bool3.booleanValue() ? 2 : 1;
                        aVar2.f3695c = enumC0071oJ1;
                        aVar2.f3696d = iI1;
                        arrayList5.add(0, eVar2.d("plugins.flutter.io/firebase_firestore/document", aVar2));
                        v6.f(arrayList5);
                        break;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj2;
                        m mVar3 = (m) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        e eVar3 = this.f3381b;
                        FirebaseFirestore firebaseFirestoreA = e.a(mVar3);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        I5.e eVar4 = new I5.e(new B1.c(9, eVar3, lowerCase), firebaseFirestoreA, lValueOf, lValueOf2);
                        eVar3.e("plugins.flutter.io/firebase_firestore/transaction", lowerCase, eVar4);
                        eVar3.f3368x.put(lowerCase, eVar4);
                        arrayList7.add(0, lowerCase);
                        v6.f(arrayList7);
                        break;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        m mVar4 = (m) ((ArrayList) obj2).get(0);
                        e eVar5 = this.f3381b;
                        FirebaseFirestore firebaseFirestoreA2 = e.a(mVar4);
                        C0184b c0184b = new C0184b();
                        c0184b.f2353c = firebaseFirestoreA2;
                        arrayList9.add(0, eVar5.d("plugins.flutter.io/firebase_firestore/snapshotsInSync", c0184b));
                        v6.f(arrayList9);
                        break;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj2;
                        String str2 = (String) arrayList11.get(0);
                        int i13 = p136t.e.f(2)[((Integer) arrayList11.get(1)).intValue()];
                        List list = (List) arrayList11.get(2);
                        I5.e eVar6 = (I5.e) this.f3381b.f3368x.get(str2);
                        Objects.requireNonNull(eVar6);
                        eVar6.f3713f = i13;
                        eVar6.f3714x = list;
                        eVar6.f3712e.release();
                        arrayList10.add(0, null);
                        v6.f(arrayList10);
                        break;
                    default:
                        ArrayList arrayList12 = (ArrayList) obj2;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new E4.p(this.f3381b, (m) arrayList12.get(0), (String) arrayList12.get(2), (String) arrayList12.get(1), new E5.r(new ArrayList(), v6, 20), 1));
                        break;
                }
            }
        });
        final int i11 = 6;
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionGet", lVar, obj, 1).M(new A5.b(this) { // from class: H5.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f3381b;

            {
                this.f3381b = this;
            }

            @Override // A5.b
            public final void i(Object obj2, V0 v6) {
                switch (i11) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        arrayList.add(0, this.f3381b.d("plugins.flutter.io/firebase_firestore/loadBundle", new I5.c(e.a((m) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        v6.f(arrayList);
                        break;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj2;
                        m mVar = (m) arrayList4.get(0);
                        String str = (String) arrayList4.get(1);
                        Boolean bool = (Boolean) arrayList4.get(2);
                        t tVar = (t) arrayList4.get(3);
                        s sVar = (s) arrayList4.get(4);
                        Boolean bool2 = (Boolean) arrayList4.get(5);
                        int i12 = p136t.e.f(2)[((Integer) arrayList4.get(6)).intValue()];
                        e eVar = this.f3381b;
                        Z zL0 = p003a.a.l0(e.a(mVar), str, bool.booleanValue(), tVar);
                        if (zL0 != null) {
                            EnumC0071o enumC0071oJ0 = p003a.a.j0(sVar.f3404b);
                            int iI0 = p003a.a.i0(i12);
                            I5.a aVar = new I5.a(1);
                            aVar.f3698f = zL0;
                            aVar.f3694b = bool2.booleanValue() ? 2 : 1;
                            aVar.f3695c = enumC0071oJ0;
                            aVar.f3696d = iI0;
                            arrayList3.add(0, eVar.d("plugins.flutter.io/firebase_firestore/query", aVar));
                            v6.f(arrayList3);
                        } else {
                            v6.f(p097n3.a.Z(new n("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                        }
                        break;
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj2;
                        m mVar2 = (m) arrayList6.get(0);
                        i iVar = (i) arrayList6.get(1);
                        Boolean bool3 = (Boolean) arrayList6.get(2);
                        int i13 = p136t.e.f(2)[((Integer) arrayList6.get(3)).intValue()];
                        e eVar2 = this.f3381b;
                        e.a(mVar2);
                        C0070n c0070nD = e.a(mVar2).d(iVar.f3375a);
                        EnumC0071o enumC0071oJ1 = p003a.a.j0(iVar.f3379e);
                        int iI1 = p003a.a.i0(i13);
                        I5.a aVar2 = new I5.a(0);
                        aVar2.f3698f = c0070nD;
                        aVar2.f3694b = bool3.booleanValue() ? 2 : 1;
                        aVar2.f3695c = enumC0071oJ1;
                        aVar2.f3696d = iI1;
                        arrayList5.add(0, eVar2.d("plugins.flutter.io/firebase_firestore/document", aVar2));
                        v6.f(arrayList5);
                        break;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj2;
                        m mVar3 = (m) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        e eVar3 = this.f3381b;
                        FirebaseFirestore firebaseFirestoreA = e.a(mVar3);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        I5.e eVar4 = new I5.e(new B1.c(9, eVar3, lowerCase), firebaseFirestoreA, lValueOf, lValueOf2);
                        eVar3.e("plugins.flutter.io/firebase_firestore/transaction", lowerCase, eVar4);
                        eVar3.f3368x.put(lowerCase, eVar4);
                        arrayList7.add(0, lowerCase);
                        v6.f(arrayList7);
                        break;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        m mVar4 = (m) ((ArrayList) obj2).get(0);
                        e eVar5 = this.f3381b;
                        FirebaseFirestore firebaseFirestoreA2 = e.a(mVar4);
                        C0184b c0184b = new C0184b();
                        c0184b.f2353c = firebaseFirestoreA2;
                        arrayList9.add(0, eVar5.d("plugins.flutter.io/firebase_firestore/snapshotsInSync", c0184b));
                        v6.f(arrayList9);
                        break;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj2;
                        String str2 = (String) arrayList11.get(0);
                        int i14 = p136t.e.f(2)[((Integer) arrayList11.get(1)).intValue()];
                        List list = (List) arrayList11.get(2);
                        I5.e eVar6 = (I5.e) this.f3381b.f3368x.get(str2);
                        Objects.requireNonNull(eVar6);
                        eVar6.f3713f = i14;
                        eVar6.f3714x = list;
                        eVar6.f3712e.release();
                        arrayList10.add(0, null);
                        v6.f(arrayList10);
                        break;
                    default:
                        ArrayList arrayList12 = (ArrayList) obj2;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new E4.p(this.f3381b, (m) arrayList12.get(0), (String) arrayList12.get(2), (String) arrayList12.get(1), new E5.r(new ArrayList(), v6, 20), 1));
                        break;
                }
            }
        });
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceSet", lVar, obj, 1).M(new B1.f(this, 26));
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceUpdate", lVar, obj, 1).M(new B1.f(this, 27));
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceGet", lVar, obj, 1).M(new B1.f(this, 28));
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceDelete", lVar, obj, 1).M(new B1.f(this, 29));
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.queryGet", lVar, obj, 1).M(new k(this, 0));
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.aggregateQuery", lVar, obj, 1).M(new k(this, 1));
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.writeBatchCommit", lVar, obj, 1).M(new B1.f(this, 16));
        final int i12 = 1;
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.querySnapshot", lVar, obj, 1).M(new A5.b(this) { // from class: H5.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f3381b;

            {
                this.f3381b = this;
            }

            @Override // A5.b
            public final void i(Object obj2, V0 v6) {
                switch (i12) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        arrayList.add(0, this.f3381b.d("plugins.flutter.io/firebase_firestore/loadBundle", new I5.c(e.a((m) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        v6.f(arrayList);
                        break;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj2;
                        m mVar = (m) arrayList4.get(0);
                        String str = (String) arrayList4.get(1);
                        Boolean bool = (Boolean) arrayList4.get(2);
                        t tVar = (t) arrayList4.get(3);
                        s sVar = (s) arrayList4.get(4);
                        Boolean bool2 = (Boolean) arrayList4.get(5);
                        int i13 = p136t.e.f(2)[((Integer) arrayList4.get(6)).intValue()];
                        e eVar = this.f3381b;
                        Z zL0 = p003a.a.l0(e.a(mVar), str, bool.booleanValue(), tVar);
                        if (zL0 != null) {
                            EnumC0071o enumC0071oJ0 = p003a.a.j0(sVar.f3404b);
                            int iI0 = p003a.a.i0(i13);
                            I5.a aVar = new I5.a(1);
                            aVar.f3698f = zL0;
                            aVar.f3694b = bool2.booleanValue() ? 2 : 1;
                            aVar.f3695c = enumC0071oJ0;
                            aVar.f3696d = iI0;
                            arrayList3.add(0, eVar.d("plugins.flutter.io/firebase_firestore/query", aVar));
                            v6.f(arrayList3);
                        } else {
                            v6.f(p097n3.a.Z(new n("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                        }
                        break;
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj2;
                        m mVar2 = (m) arrayList6.get(0);
                        i iVar = (i) arrayList6.get(1);
                        Boolean bool3 = (Boolean) arrayList6.get(2);
                        int i14 = p136t.e.f(2)[((Integer) arrayList6.get(3)).intValue()];
                        e eVar2 = this.f3381b;
                        e.a(mVar2);
                        C0070n c0070nD = e.a(mVar2).d(iVar.f3375a);
                        EnumC0071o enumC0071oJ1 = p003a.a.j0(iVar.f3379e);
                        int iI1 = p003a.a.i0(i14);
                        I5.a aVar2 = new I5.a(0);
                        aVar2.f3698f = c0070nD;
                        aVar2.f3694b = bool3.booleanValue() ? 2 : 1;
                        aVar2.f3695c = enumC0071oJ1;
                        aVar2.f3696d = iI1;
                        arrayList5.add(0, eVar2.d("plugins.flutter.io/firebase_firestore/document", aVar2));
                        v6.f(arrayList5);
                        break;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj2;
                        m mVar3 = (m) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        e eVar3 = this.f3381b;
                        FirebaseFirestore firebaseFirestoreA = e.a(mVar3);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        I5.e eVar4 = new I5.e(new B1.c(9, eVar3, lowerCase), firebaseFirestoreA, lValueOf, lValueOf2);
                        eVar3.e("plugins.flutter.io/firebase_firestore/transaction", lowerCase, eVar4);
                        eVar3.f3368x.put(lowerCase, eVar4);
                        arrayList7.add(0, lowerCase);
                        v6.f(arrayList7);
                        break;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        m mVar4 = (m) ((ArrayList) obj2).get(0);
                        e eVar5 = this.f3381b;
                        FirebaseFirestore firebaseFirestoreA2 = e.a(mVar4);
                        C0184b c0184b = new C0184b();
                        c0184b.f2353c = firebaseFirestoreA2;
                        arrayList9.add(0, eVar5.d("plugins.flutter.io/firebase_firestore/snapshotsInSync", c0184b));
                        v6.f(arrayList9);
                        break;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj2;
                        String str2 = (String) arrayList11.get(0);
                        int i15 = p136t.e.f(2)[((Integer) arrayList11.get(1)).intValue()];
                        List list = (List) arrayList11.get(2);
                        I5.e eVar6 = (I5.e) this.f3381b.f3368x.get(str2);
                        Objects.requireNonNull(eVar6);
                        eVar6.f3713f = i15;
                        eVar6.f3714x = list;
                        eVar6.f3712e.release();
                        arrayList10.add(0, null);
                        v6.f(arrayList10);
                        break;
                    default:
                        ArrayList arrayList12 = (ArrayList) obj2;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new E4.p(this.f3381b, (m) arrayList12.get(0), (String) arrayList12.get(2), (String) arrayList12.get(1), new E5.r(new ArrayList(), v6, 20), 1));
                        break;
                }
            }
        });
        final int i13 = 2;
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceSnapshot", lVar, obj, 1).M(new A5.b(this) { // from class: H5.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f3381b;

            {
                this.f3381b = this;
            }

            @Override // A5.b
            public final void i(Object obj2, V0 v6) {
                switch (i13) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        arrayList.add(0, this.f3381b.d("plugins.flutter.io/firebase_firestore/loadBundle", new I5.c(e.a((m) arrayList2.get(0)), (byte[]) arrayList2.get(1))));
                        v6.f(arrayList);
                        break;
                    case 1:
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) obj2;
                        m mVar = (m) arrayList4.get(0);
                        String str = (String) arrayList4.get(1);
                        Boolean bool = (Boolean) arrayList4.get(2);
                        t tVar = (t) arrayList4.get(3);
                        s sVar = (s) arrayList4.get(4);
                        Boolean bool2 = (Boolean) arrayList4.get(5);
                        int i14 = p136t.e.f(2)[((Integer) arrayList4.get(6)).intValue()];
                        e eVar = this.f3381b;
                        Z zL0 = p003a.a.l0(e.a(mVar), str, bool.booleanValue(), tVar);
                        if (zL0 != null) {
                            EnumC0071o enumC0071oJ0 = p003a.a.j0(sVar.f3404b);
                            int iI0 = p003a.a.i0(i14);
                            I5.a aVar = new I5.a(1);
                            aVar.f3698f = zL0;
                            aVar.f3694b = bool2.booleanValue() ? 2 : 1;
                            aVar.f3695c = enumC0071oJ0;
                            aVar.f3696d = iI0;
                            arrayList3.add(0, eVar.d("plugins.flutter.io/firebase_firestore/query", aVar));
                            v6.f(arrayList3);
                        } else {
                            v6.f(p097n3.a.Z(new n("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null)));
                        }
                        break;
                    case 2:
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = (ArrayList) obj2;
                        m mVar2 = (m) arrayList6.get(0);
                        i iVar = (i) arrayList6.get(1);
                        Boolean bool3 = (Boolean) arrayList6.get(2);
                        int i15 = p136t.e.f(2)[((Integer) arrayList6.get(3)).intValue()];
                        e eVar2 = this.f3381b;
                        e.a(mVar2);
                        C0070n c0070nD = e.a(mVar2).d(iVar.f3375a);
                        EnumC0071o enumC0071oJ1 = p003a.a.j0(iVar.f3379e);
                        int iI1 = p003a.a.i0(i15);
                        I5.a aVar2 = new I5.a(0);
                        aVar2.f3698f = c0070nD;
                        aVar2.f3694b = bool3.booleanValue() ? 2 : 1;
                        aVar2.f3695c = enumC0071oJ1;
                        aVar2.f3696d = iI1;
                        arrayList5.add(0, eVar2.d("plugins.flutter.io/firebase_firestore/document", aVar2));
                        v6.f(arrayList5);
                        break;
                    case 3:
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = (ArrayList) obj2;
                        m mVar3 = (m) arrayList8.get(0);
                        Number number = (Number) arrayList8.get(1);
                        Number number2 = (Number) arrayList8.get(2);
                        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        e eVar3 = this.f3381b;
                        FirebaseFirestore firebaseFirestoreA = e.a(mVar3);
                        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                        I5.e eVar4 = new I5.e(new B1.c(9, eVar3, lowerCase), firebaseFirestoreA, lValueOf, lValueOf2);
                        eVar3.e("plugins.flutter.io/firebase_firestore/transaction", lowerCase, eVar4);
                        eVar3.f3368x.put(lowerCase, eVar4);
                        arrayList7.add(0, lowerCase);
                        v6.f(arrayList7);
                        break;
                    case 4:
                        ArrayList arrayList9 = new ArrayList();
                        m mVar4 = (m) ((ArrayList) obj2).get(0);
                        e eVar5 = this.f3381b;
                        FirebaseFirestore firebaseFirestoreA2 = e.a(mVar4);
                        C0184b c0184b = new C0184b();
                        c0184b.f2353c = firebaseFirestoreA2;
                        arrayList9.add(0, eVar5.d("plugins.flutter.io/firebase_firestore/snapshotsInSync", c0184b));
                        v6.f(arrayList9);
                        break;
                    case 5:
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = (ArrayList) obj2;
                        String str2 = (String) arrayList11.get(0);
                        int i16 = p136t.e.f(2)[((Integer) arrayList11.get(1)).intValue()];
                        List list = (List) arrayList11.get(2);
                        I5.e eVar6 = (I5.e) this.f3381b.f3368x.get(str2);
                        Objects.requireNonNull(eVar6);
                        eVar6.f3713f = i16;
                        eVar6.f3714x = list;
                        eVar6.f3712e.release();
                        arrayList10.add(0, null);
                        v6.f(arrayList10);
                        break;
                    default:
                        ArrayList arrayList12 = (ArrayList) obj2;
                        FlutterFirebasePlugin.cachedThreadPool.execute(new E4.p(this.f3381b, (m) arrayList12.get(0), (String) arrayList12.get(2), (String) arrayList12.get(1), new E5.r(new ArrayList(), v6, 20), 1));
                        break;
                }
            }
        });
        new F0(fVar, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.persistenceCacheIndexManagerRequest", lVar, obj, 1).M(new B1.f(this, 18));
    }

    @Override // p164x5.a
    public final void onDetachedFromActivity() {
        this.f3364c.set(null);
    }

    @Override // p164x5.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f3364c.set(null);
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        f();
        this.f3363b = null;
    }

    @Override // p164x5.a
    public final void onReattachedToActivityForConfigChanges(p164x5.b bVar) {
        this.f3364c.set((p121q5.c) ((Q3.o) bVar).f5822a);
    }
}
