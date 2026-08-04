package p048g4;

import A1.K0;
import A1.W;
import A4.a;
import A4.b;
import A4.c;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements c, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13215a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13217c;

    public k() {
        p056h4.k kVar = p056h4.k.f13568a;
        this.f13216b = new HashMap();
        this.f13217c = new ArrayDeque();
    }

    @Override // A4.b
    public final void a(a aVar) {
        Set<Map.Entry> setEmptySet;
        switch (this.f13215a) {
            case 0:
                aVar.getClass();
                synchronized (this) {
                    try {
                        ArrayDeque arrayDeque = (ArrayDeque) this.f13217c;
                        if (arrayDeque != null) {
                            arrayDeque.add(aVar);
                            return;
                        }
                        synchronized (this) {
                            try {
                                Map map = (Map) ((HashMap) this.f13216b).get(Y3.b.class);
                                setEmptySet = map == null ? Collections.emptySet() : map.entrySet();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        for (Map.Entry entry : setEmptySet) {
                            ((Executor) entry.getValue()).execute(new K0(entry, aVar));
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                if (((Set) this.f13216b).contains(Y3.b.class)) {
                    ((b) this.f13217c).a(aVar);
                    return;
                }
                throw new W("Attempting to publish an undeclared event " + aVar + ".");
        }
    }

    public k(Set set, b bVar) {
        this.f13216b = set;
        this.f13217c = bVar;
    }
}
