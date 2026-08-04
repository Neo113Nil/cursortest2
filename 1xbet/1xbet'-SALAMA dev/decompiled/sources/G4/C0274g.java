package G4;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: G4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0274g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p075k4.c f2976b;

    public C0274g(int i7, p075k4.c cVar) {
        this.f2975a = i7;
        this.f2976b = cVar;
    }

    public static C0274g a(int i7, HashMap map) {
        p075k4.c cVarD = H4.g.f3315a;
        for (Map.Entry entry : map.entrySet()) {
            cVarD = cVarD.D((H4.h) entry.getKey(), ((C0292z) entry.getValue()).f3044a);
        }
        return new C0274g(i7, cVarD);
    }
}
