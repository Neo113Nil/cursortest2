package F5;

import A1.RunnableC0032m0;
import E4.RunnableC0181n;
import E5.C0199q;
import E5.r;
import Y3.l;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0826c;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import w1.V0;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements A5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2766b;

    public /* synthetic */ e(c cVar, int i7) {
        this.f2765a = i7;
        this.f2766b = cVar;
    }

    @Override // A5.b
    public final void i(Object obj, V0 v02) {
        switch (this.f2765a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                final String str = (String) arrayList2.get(0);
                final Boolean bool = (Boolean) arrayList2.get(1);
                C0199q c0199q = new C0199q(arrayList, v02, 17);
                this.f2766b.getClass();
                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                final int i7 = 0;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: F5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        Boolean bool2 = bool;
                        String str2 = str;
                        switch (i7) {
                            case 0:
                                HashMap hashMap = c.f2760c;
                                try {
                                    Y3.i.f(str2).l(bool2);
                                    taskCompletionSource2.setResult(null);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource2.setException(e7);
                                    return;
                                }
                            default:
                                HashMap hashMap2 = c.f2760c;
                                try {
                                    Y3.i f7 = Y3.i.f(str2);
                                    boolean booleanValue = bool2.booleanValue();
                                    f7.b();
                                    if (f7.f7667e.compareAndSet(!booleanValue, booleanValue)) {
                                        boolean z4 = ComponentCallbacks2C0826c.f11168e.f11169a.get();
                                        if (booleanValue && z4) {
                                            f7.k(true);
                                        } else if (!booleanValue && z4) {
                                            f7.k(false);
                                        }
                                    }
                                    taskCompletionSource2.setResult(null);
                                    break;
                                } catch (Exception e8) {
                                    taskCompletionSource2.setException(e8);
                                }
                        }
                    }
                });
                c.d(taskCompletionSource, c0199q);
                break;
            case 1:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = (ArrayList) obj;
                final String str2 = (String) arrayList4.get(0);
                final Boolean bool2 = (Boolean) arrayList4.get(1);
                r rVar = new r(arrayList3, v02, 17);
                this.f2766b.getClass();
                final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                final int i8 = 1;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: F5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource2;
                        Boolean bool22 = bool2;
                        String str22 = str2;
                        switch (i8) {
                            case 0:
                                HashMap hashMap = c.f2760c;
                                try {
                                    Y3.i.f(str22).l(bool22);
                                    taskCompletionSource22.setResult(null);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            default:
                                HashMap hashMap2 = c.f2760c;
                                try {
                                    Y3.i f7 = Y3.i.f(str22);
                                    boolean booleanValue = bool22.booleanValue();
                                    f7.b();
                                    if (f7.f7667e.compareAndSet(!booleanValue, booleanValue)) {
                                        boolean z4 = ComponentCallbacks2C0826c.f11168e.f11169a.get();
                                        if (booleanValue && z4) {
                                            f7.k(true);
                                        } else if (!booleanValue && z4) {
                                            f7.k(false);
                                        }
                                    }
                                    taskCompletionSource22.setResult(null);
                                    break;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                }
                        }
                    }
                });
                c.d(taskCompletionSource2, rVar);
                break;
            case 2:
                ArrayList arrayList5 = new ArrayList();
                String str3 = (String) ((ArrayList) obj).get(0);
                C0199q c0199q2 = new C0199q(arrayList5, v02, 18);
                this.f2766b.getClass();
                TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new A0.f(12, str3, taskCompletionSource3));
                c.d(taskCompletionSource3, c0199q2);
                break;
            case 3:
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = (ArrayList) obj;
                String str4 = (String) arrayList7.get(0);
                i iVar = (i) arrayList7.get(1);
                r rVar2 = new r(arrayList6, v02, 18);
                c cVar = this.f2766b;
                cVar.getClass();
                TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0181n(cVar, iVar, str4, taskCompletionSource4, 1));
                c.d(taskCompletionSource4, rVar2);
                break;
            case 4:
                C0199q c0199q3 = new C0199q(new ArrayList(), v02, 19);
                final c cVar2 = this.f2766b;
                cVar2.getClass();
                final TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                final int i9 = 1;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: F5.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList arrayList8;
                        switch (i9) {
                            case 0:
                                TaskCompletionSource taskCompletionSource6 = taskCompletionSource5;
                                HashMap hashMap = c.f2760c;
                                c cVar3 = cVar2;
                                cVar3.getClass();
                                try {
                                    l a2 = l.a(cVar3.f2761a);
                                    if (a2 == null) {
                                        taskCompletionSource6.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                    } else {
                                        taskCompletionSource6.setResult(c.c(a2));
                                    }
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource6.setException(e7);
                                    return;
                                }
                            default:
                                c cVar4 = cVar2;
                                TaskCompletionSource taskCompletionSource7 = taskCompletionSource5;
                                HashMap hashMap2 = c.f2760c;
                                cVar4.getClass();
                                try {
                                    if (cVar4.f2762b) {
                                        Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                    } else {
                                        cVar4.f2762b = true;
                                    }
                                    synchronized (Y3.i.f7661k) {
                                        arrayList8 = new ArrayList(Y3.i.f7662l.values());
                                    }
                                    ArrayList arrayList9 = new ArrayList(arrayList8.size());
                                    Iterator it = arrayList8.iterator();
                                    while (it.hasNext()) {
                                        Y3.i iVar2 = (Y3.i) it.next();
                                        TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                                        FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(cVar4, iVar2, taskCompletionSource8, 6));
                                        arrayList9.add((j) Tasks.await(taskCompletionSource8.getTask()));
                                    }
                                    taskCompletionSource7.setResult(arrayList9);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource7.setException(e8);
                                    return;
                                }
                        }
                    }
                });
                c.d(taskCompletionSource5, c0199q3);
                break;
            default:
                r rVar3 = new r(new ArrayList(), v02, 19);
                final c cVar3 = this.f2766b;
                cVar3.getClass();
                final TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                final int i10 = 0;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: F5.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList arrayList8;
                        switch (i10) {
                            case 0:
                                TaskCompletionSource taskCompletionSource62 = taskCompletionSource6;
                                HashMap hashMap = c.f2760c;
                                c cVar32 = cVar3;
                                cVar32.getClass();
                                try {
                                    l a2 = l.a(cVar32.f2761a);
                                    if (a2 == null) {
                                        taskCompletionSource62.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                    } else {
                                        taskCompletionSource62.setResult(c.c(a2));
                                    }
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource62.setException(e7);
                                    return;
                                }
                            default:
                                c cVar4 = cVar3;
                                TaskCompletionSource taskCompletionSource7 = taskCompletionSource6;
                                HashMap hashMap2 = c.f2760c;
                                cVar4.getClass();
                                try {
                                    if (cVar4.f2762b) {
                                        Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                    } else {
                                        cVar4.f2762b = true;
                                    }
                                    synchronized (Y3.i.f7661k) {
                                        arrayList8 = new ArrayList(Y3.i.f7662l.values());
                                    }
                                    ArrayList arrayList9 = new ArrayList(arrayList8.size());
                                    Iterator it = arrayList8.iterator();
                                    while (it.hasNext()) {
                                        Y3.i iVar2 = (Y3.i) it.next();
                                        TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                                        FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(cVar4, iVar2, taskCompletionSource8, 6));
                                        arrayList9.add((j) Tasks.await(taskCompletionSource8.getTask()));
                                    }
                                    taskCompletionSource7.setResult(arrayList9);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource7.setException(e8);
                                    return;
                                }
                        }
                    }
                });
                c.d(taskCompletionSource6, rVar3);
                break;
        }
    }
}
