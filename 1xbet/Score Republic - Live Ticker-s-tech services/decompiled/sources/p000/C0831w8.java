package p000;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: renamed from: w8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0831w8 {

    /* JADX INFO: renamed from: b */
    public static final C0831w8 f8454b = new C0831w8(new IdentityHashMap());

    /* JADX INFO: renamed from: a */
    public final IdentityHashMap f8455a;

    public C0831w8(IdentityHashMap identityHashMap) {
        this.f8455a = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0831w8.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = ((C0831w8) obj).f8455a;
        IdentityHashMap identityHashMap2 = this.f8455a;
        if (identityHashMap2.size() != identityHashMap.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap2.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey()) || !AbstractC0875xf.m5649f(entry.getValue(), identityHashMap.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f8455a.entrySet()) {
            iHashCode += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return iHashCode;
    }

    public final String toString() {
        return this.f8455a.toString();
    }
}
