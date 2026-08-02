package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: xz */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0895xz {

    /* JADX INFO: renamed from: a */
    public final String f9109a;

    /* JADX INFO: renamed from: b */
    public final Map f9110b;

    public C0895xz(String str, Map map) {
        this.f9109a = str;
        this.f9110b = map;
    }

    /* JADX INFO: renamed from: a */
    public static C0895xz m5717a(String str) {
        return new C0895xz(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0895xz)) {
            return false;
        }
        C0895xz c0895xz = (C0895xz) obj;
        return this.f9109a.equals(c0895xz.f9109a) && this.f9110b.equals(c0895xz.f9110b);
    }

    public final int hashCode() {
        return this.f9110b.hashCode() + (this.f9109a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f9109a + ", properties=" + this.f9110b.values() + "}";
    }
}
