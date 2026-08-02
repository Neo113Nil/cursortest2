package B1;

import A1.RunnableC0032m0;
import B4.H;
import B4.I;
import B4.K;
import B4.L;
import B4.T;
import B4.W;
import D3.q;
import E4.F;
import E4.RunnableC0181n;
import E4.z;
import E5.C0199q;
import E5.r;
import H5.s;
import android.util.Base64;
import b4.C0782b;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirestoreRegistrar;
import g4.C1145r;
import g4.InterfaceC1131d;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import w1.V0;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements v2.e, q, L4.n, InterfaceC1131d, Continuation, L4.o, A5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f982a;

    public /* synthetic */ f(int i7) {
        this.f982a = i7;
    }

    @Override // L4.o
    public void a(Object obj) {
    }

    @Override // L4.n
    public Object apply(Object obj) {
        K k7 = (K) obj;
        T t7 = k7.f1109e;
        return t7 != null ? t7 instanceof W : k7.f1107c ? new F(k7) : new z(k7);
    }

    public Constructor b() {
        switch (this.f982a) {
            case 14:
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(F1.k.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(F1.k.class).getConstructor(null);
        }
    }

    @Override // g4.InterfaceC1131d
    public Object e(C1145r c1145r) {
        L lambda$getComponents$0;
        lambda$getComponents$0 = FirestoreRegistrar.lambda$getComponents$0(c1145r);
        return lambda$getComponents$0;
    }

    @Override // D3.q
    public Object get() {
        byte[] bArr = new byte[12];
        j.f1003h.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // A5.b
    public void i(Object obj, V0 v02) {
        switch (this.f982a) {
            case 16:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0((H5.m) arrayList2.get(0), (List) arrayList2.get(1), new C0199q(arrayList, v02, 23), 12));
                break;
            case 17:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = (ArrayList) obj;
                H5.m mVar = (H5.m) arrayList4.get(0);
                String str = (String) arrayList4.get(1);
                s sVar = (s) arrayList4.get(2);
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0181n(mVar, str, new C0199q(arrayList3, v02, 24), sVar, 2));
                break;
            case 18:
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new A0.a((H5.m) arrayList6.get(0), t.e.f(3)[((Integer) arrayList6.get(1)).intValue()], new r(arrayList5, v02, 24), 1));
                break;
            case 19:
                ArrayList arrayList7 = new ArrayList();
                FlutterFirebasePlugin.cachedThreadPool.execute(new A0.f(18, (H5.m) ((ArrayList) obj).get(0), new r(arrayList7, v02, 25)));
                break;
            case 20:
                ArrayList arrayList8 = new ArrayList();
                FlutterFirebasePlugin.cachedThreadPool.execute(new A0.f(19, (H5.m) ((ArrayList) obj).get(0), new C0199q(arrayList8, v02, 25)));
                break;
            case zzbbd.zzt.zzm /* 21 */:
                ArrayList arrayList9 = new ArrayList();
                FlutterFirebasePlugin.cachedThreadPool.execute(new A0.f(22, (H5.m) ((ArrayList) obj).get(0), new r(arrayList9, v02, 26)));
                break;
            case 22:
                ArrayList arrayList10 = new ArrayList();
                FlutterFirebasePlugin.cachedThreadPool.execute(new A0.f(24, (H5.m) ((ArrayList) obj).get(0), new C0199q(arrayList10, v02, 26)));
                break;
            case 23:
                ArrayList arrayList11 = new ArrayList();
                FlutterFirebasePlugin.cachedThreadPool.execute(new A0.f(23, (H5.m) ((ArrayList) obj).get(0), new r(arrayList11, v02, 27)));
                break;
            case 24:
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0((H5.m) arrayList13.get(0), (String) arrayList13.get(1), new C0199q(arrayList12, v02, 27), 8));
                break;
            case 25:
                ArrayList arrayList14 = new ArrayList();
                FlutterFirebasePlugin.cachedThreadPool.execute(new A0.f(20, (Boolean) ((ArrayList) obj).get(0), new r(arrayList14, v02, 28)));
                break;
            case 26:
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0((H5.m) arrayList16.get(0), (H5.i) arrayList16.get(1), new C0199q(arrayList15, v02, 20), 10));
                break;
            case 27:
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0((H5.m) arrayList18.get(0), (H5.i) arrayList18.get(1), new r(arrayList17, v02, 21), 13));
                break;
            case 28:
                ArrayList arrayList19 = new ArrayList();
                ArrayList arrayList20 = (ArrayList) obj;
                H5.m mVar2 = (H5.m) arrayList20.get(0);
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0((H5.i) arrayList20.get(1), mVar2, new C0199q(arrayList19, v02, 21), 11));
                break;
            default:
                ArrayList arrayList21 = new ArrayList();
                ArrayList arrayList22 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0((H5.m) arrayList22.get(0), (H5.i) arrayList22.get(1), new r(arrayList21, v02, 22), 9));
                break;
        }
    }

    @Override // v2.e
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f982a) {
            case 0:
                bVar.getClass();
                break;
            case 1:
                bVar.getClass();
                break;
            case 2:
                bVar.getClass();
                break;
            case 3:
                bVar.getClass();
                break;
            case 4:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f982a) {
            case 9:
                return task.isSuccessful() ? Tasks.forResult(((C0782b) task.getResult()).f10129a) : Tasks.forException(task.getException());
            case 10:
                H4.k kVar = (H4.k) task.getResult();
                if (kVar.d()) {
                    return kVar;
                }
                if (kVar.e()) {
                    return null;
                }
                throw new I("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", H.UNAVAILABLE);
            default:
                return task.isSuccessful() ? Tasks.forResult(null) : Tasks.forException(task.getException());
        }
    }

    public /* synthetic */ f(H5.e eVar, int i7) {
        this.f982a = i7;
    }
}
