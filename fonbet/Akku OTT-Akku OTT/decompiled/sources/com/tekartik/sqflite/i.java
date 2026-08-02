package com.tekartik.sqflite;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.tekartik.sqflite.h;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar;
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                g gVar = (g) this.c;
                synchronized (jVar) {
                    try {
                        HashSet hashSet = new HashSet(jVar.e);
                        jVar.f.remove(gVar);
                        jVar.e.add(gVar);
                        f fVar = gVar.f;
                        if (fVar == null || (eVar = fVar.a) == null || !((h.a) eVar).a.i()) {
                            f fVar2 = gVar.f;
                            if ((fVar2 != null ? fVar2.a() : null) != null) {
                                HashMap hashMap = jVar.g;
                                f fVar3 = gVar.f;
                                hashMap.remove(fVar3 != null ? fVar3.a() : null);
                            }
                        }
                        jVar.e(gVar);
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            jVar.e((g) it.next());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                FlutterFirebaseMessagingPlugin.lambda$sendMessage$6((Map) this.b, (TaskCompletionSource) this.c);
                return;
        }
    }
}
