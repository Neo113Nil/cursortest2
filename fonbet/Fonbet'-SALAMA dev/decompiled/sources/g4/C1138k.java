package g4;

import A1.K0;
import A1.W;
import h4.EnumC1208k;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: g4.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1138k implements A4.c, A4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13209a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13210b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13211c;

    public C1138k() {
        EnumC1208k enumC1208k = EnumC1208k.f13562a;
        this.f13210b = new HashMap();
        this.f13211c = new ArrayDeque();
    }

    @Override // A4.b
    public final void a(A4.a aVar) {
        Set<Map.Entry> emptySet;
        switch (this.f13209a) {
            case 0:
                aVar.getClass();
                synchronized (this) {
                    try {
                        ArrayDeque arrayDeque = (ArrayDeque) this.f13211c;
                        if (arrayDeque != null) {
                            arrayDeque.add(aVar);
                            return;
                        }
                        synchronized (this) {
                            try {
                                Map map = (Map) ((HashMap) this.f13210b).get(Y3.b.class);
                                emptySet = map == null ? Collections.emptySet() : map.entrySet();
                            } finally {
                            }
                        }
                        for (Map.Entry entry : emptySet) {
                            ((Executor) entry.getValue()).execute(new K0(entry, aVar));
                        }
                        return;
                    } finally {
                    }
                }
            default:
                if (((Set) this.f13210b).contains(Y3.b.class)) {
                    ((A4.b) this.f13211c).a(aVar);
                    return;
                }
                throw new W("Attempting to publish an undeclared event " + aVar + ".");
        }
    }

    public C1138k(Set set, A4.b bVar) {
        this.f13210b = set;
        this.f13211c = bVar;
    }
}
