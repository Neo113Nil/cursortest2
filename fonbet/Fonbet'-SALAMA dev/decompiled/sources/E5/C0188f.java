package E5;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import n1.C1450e;
import q5.AbstractActivityC1559c;
import w1.C1718l0;
import w5.C1782b;
import w5.InterfaceC1783c;
import x5.InterfaceC1789a;
import x5.InterfaceC1790b;

/* renamed from: E5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0188f implements FlutterFirebasePlugin, InterfaceC1783c, InterfaceC1789a, InterfaceC0200s {

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f2361z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public A5.f f2362a;

    /* renamed from: b, reason: collision with root package name */
    public A5.s f2363b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractActivityC1559c f2364c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2365d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final C1450e f2366e = new C1450e(2);

    /* renamed from: f, reason: collision with root package name */
    public final C0195m f2367f = new C0195m();

    /* renamed from: x, reason: collision with root package name */
    public final C0196n f2368x = new C0196n();

    /* renamed from: y, reason: collision with root package name */
    public final C1718l0 f2369y = new C1718l0(3);

    public static FirebaseAuth b(C0197o c0197o) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(c0197o.f2391a));
        String str = c0197o.f2392b;
        if (str != null) {
            firebaseAuth.e(str);
        }
        String str2 = (String) F5.c.f2760c.get(c0197o.f2391a);
        if (str2 != null) {
            firebaseAuth.d(str2);
        }
        String str3 = c0197o.f2393c;
        if (str3 != null) {
            firebaseAuth.d(str3);
        }
        return firebaseAuth;
    }

    public final void c() {
        HashMap hashMap = this.f2365d;
        for (A5.j jVar : hashMap.keySet()) {
            A5.i iVar = (A5.i) hashMap.get(jVar);
            if (iVar != null) {
                iVar.b();
            }
            jVar.a(null);
        }
        hashMap.clear();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new A0.f(11, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(Y3.i iVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0187e(iVar, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    @Override // x5.InterfaceC1789a
    public final void onAttachedToActivity(InterfaceC1790b interfaceC1790b) {
        AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) ((Q3.o) interfaceC1790b).f5822a;
        this.f2364c = abstractActivityC1559c;
        this.f2366e.f15308b = abstractActivityC1559c;
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        A5.f fVar = c1782b.f18077c;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_auth", this);
        this.f2363b = new A5.s(fVar, "plugins.flutter.io/firebase_auth");
        InterfaceC0200s.a(fVar, this);
        C1450e.B(fVar, this.f2366e);
        C0195m c0195m = this.f2367f;
        B.b(fVar, c0195m);
        InterfaceC0204w.a(fVar, c0195m);
        y.a(fVar, this.f2368x);
        C1718l0.m(fVar, this.f2369y);
        this.f2362a = fVar;
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivity() {
        this.f2364c = null;
        this.f2366e.f15308b = null;
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f2364c = null;
        this.f2366e.f15308b = null;
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        this.f2363b.b(null);
        InterfaceC0200s.a(this.f2362a, null);
        C1450e.B(this.f2362a, null);
        B.b(this.f2362a, null);
        InterfaceC0204w.a(this.f2362a, null);
        y.a(this.f2362a, null);
        C1718l0.m(this.f2362a, null);
        this.f2363b = null;
        this.f2362a = null;
        c();
    }

    @Override // x5.InterfaceC1789a
    public final void onReattachedToActivityForConfigChanges(InterfaceC1790b interfaceC1790b) {
        AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) ((Q3.o) interfaceC1790b).f5822a;
        this.f2364c = abstractActivityC1559c;
        this.f2366e.f15308b = abstractActivityC1559c;
    }
}
