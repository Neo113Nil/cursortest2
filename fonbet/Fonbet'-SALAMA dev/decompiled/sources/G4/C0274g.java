package G4;

import java.util.HashMap;
import java.util.Map;
import k4.AbstractC1341c;

/* renamed from: G4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0274g {

    /* renamed from: a, reason: collision with root package name */
    public final int f2975a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1341c f2976b;

    public C0274g(int i7, AbstractC1341c abstractC1341c) {
        this.f2975a = i7;
        this.f2976b = abstractC1341c;
    }

    public static C0274g a(int i7, HashMap hashMap) {
        AbstractC1341c abstractC1341c = H4.g.f3315a;
        for (Map.Entry entry : hashMap.entrySet()) {
            abstractC1341c = abstractC1341c.D((H4.h) entry.getKey(), ((C0292z) entry.getValue()).f3044a);
        }
        return new C0274g(i7, abstractC1341c);
    }
}
