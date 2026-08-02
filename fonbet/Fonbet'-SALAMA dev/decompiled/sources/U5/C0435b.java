package U5;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;
import n3.AbstractC1464a;

/* renamed from: U5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0435b {

    /* renamed from: b, reason: collision with root package name */
    public static final C0435b f6454b = new C0435b(new IdentityHashMap());

    /* renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f6455a;

    public C0435b(IdentityHashMap identityHashMap) {
        this.f6455a = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0435b.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = this.f6455a;
        int size = identityHashMap.size();
        IdentityHashMap identityHashMap2 = ((C0435b) obj).f6455a;
        if (size != identityHashMap2.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !AbstractC1464a.t(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = 0;
        for (Map.Entry entry : this.f6455a.entrySet()) {
            i7 += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i7;
    }

    public final String toString() {
        return this.f6455a.toString();
    }
}
