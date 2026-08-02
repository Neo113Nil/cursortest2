package L5;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4397a;

    public E(Map map) {
        this.f4397a = map;
    }

    public E(D2.c cVar) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : cVar.getAdapterStatusMap().entrySet()) {
            hashMap.put((String) entry.getKey(), new y((D2.b) entry.getValue()));
        }
        this.f4397a = hashMap;
    }
}
