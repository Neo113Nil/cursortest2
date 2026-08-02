package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: x9 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0869x9 {

    /* JADX INFO: renamed from: a */
    public final String f8866a;

    /* JADX INFO: renamed from: b */
    public final Integer f8867b;

    /* JADX INFO: renamed from: c */
    public final C0596pw f8868c;

    /* JADX INFO: renamed from: d */
    public final long f8869d;

    /* JADX INFO: renamed from: e */
    public final long f8870e;

    /* JADX INFO: renamed from: f */
    public final Map f8871f;

    public C0869x9(String str, Integer num, C0596pw c0596pw, long j, long j2, HashMap map) {
        this.f8866a = str;
        this.f8867b = num;
        this.f8868c = c0596pw;
        this.f8869d = j;
        this.f8870e = j2;
        this.f8871f = map;
    }

    /* JADX INFO: renamed from: a */
    public final String m5610a(String str) {
        String str2 = (String) this.f8871f.get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: b */
    public final int m5611b(String str) {
        String str2 = (String) this.f8871f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: c */
    public final C0902y5 m5612c() {
        C0902y5 c0902y5 = new C0902y5();
        String str = this.f8866a;
        if (str == null) {
            C0270h1.m2192h("Null transportName");
            return null;
        }
        c0902y5.f9154a = str;
        c0902y5.f9155b = this.f8867b;
        C0596pw c0596pw = this.f8868c;
        if (c0596pw == null) {
            C0270h1.m2192h("Null encodedPayload");
            return null;
        }
        c0902y5.f9156c = c0596pw;
        c0902y5.f9157d = Long.valueOf(this.f8869d);
        c0902y5.f9158e = Long.valueOf(this.f8870e);
        c0902y5.f9159f = new HashMap(this.f8871f);
        return c0902y5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0869x9) {
            C0869x9 c0869x9 = (C0869x9) obj;
            if (this.f8866a.equals(c0869x9.f8866a)) {
                Integer num = c0869x9.f8867b;
                Integer num2 = this.f8867b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.f8868c.equals(c0869x9.f8868c) && this.f8869d == c0869x9.f8869d && this.f8870e == c0869x9.f8870e && this.f8871f.equals(c0869x9.f8871f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8866a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f8867b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f8868c.hashCode()) * 1000003;
        long j = this.f8869d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f8870e;
        return this.f8871f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f8866a + ", code=" + this.f8867b + ", encodedPayload=" + this.f8868c + ", eventMillis=" + this.f8869d + ", uptimeMillis=" + this.f8870e + ", autoMetadata=" + this.f8871f + "}";
    }
}
