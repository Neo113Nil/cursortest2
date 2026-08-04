package E5;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import p155w1.C1009l0;

/* JADX INFO: renamed from: E5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0188f implements FlutterFirebasePlugin, p159w5.c, p164x5.a, InterfaceC0200s {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final HashMap f2361z = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public A5.f f2362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A5.s f2363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p121q5.c f2364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f2365d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p096n1.e f2366e = new p096n1.e(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0195m f2367f = new C0195m();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0196n f2368x = new C0196n();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1009l0 f2369y = new C1009l0(3);

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
        HashMap map = this.f2365d;
        for (A5.j jVar : map.keySet()) {
            A5.i iVar = (A5.i) map.get(jVar);
            if (iVar != null) {
                iVar.b();
            }
            jVar.a(null);
        }
        map.clear();
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

    @Override // p164x5.a
    public final void onAttachedToActivity(p164x5.b bVar) {
        p121q5.c cVar = (p121q5.c) ((Q3.o) bVar).f5822a;
        this.f2364c = cVar;
        this.f2366e.f15314b = cVar;
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        A5.f fVar = bVar.f18083c;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_auth", this);
        this.f2363b = new A5.s(fVar, "plugins.flutter.io/firebase_auth");
        InterfaceC0200s.a(fVar, this);
        p096n1.e.B(fVar, this.f2366e);
        C0195m c0195m = this.f2367f;
        B.b(fVar, c0195m);
        InterfaceC0204w.a(fVar, c0195m);
        y.a(fVar, this.f2368x);
        C1009l0.m(fVar, this.f2369y);
        this.f2362a = fVar;
    }

    @Override // p164x5.a
    public final void onDetachedFromActivity() {
        this.f2364c = null;
        this.f2366e.f15314b = null;
    }

    @Override // p164x5.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f2364c = null;
        this.f2366e.f15314b = null;
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        this.f2363b.b(null);
        InterfaceC0200s.a(this.f2362a, null);
        p096n1.e.B(this.f2362a, null);
        B.b(this.f2362a, null);
        InterfaceC0204w.a(this.f2362a, null);
        y.a(this.f2362a, null);
        C1009l0.m(this.f2362a, null);
        this.f2363b = null;
        this.f2362a = null;
        c();
    }

    @Override // p164x5.a
    public final void onReattachedToActivityForConfigChanges(p164x5.b bVar) {
        p121q5.c cVar = (p121q5.c) ((Q3.o) bVar).f5822a;
        this.f2364c = cVar;
        this.f2366e.f15314b = cVar;
    }
}
