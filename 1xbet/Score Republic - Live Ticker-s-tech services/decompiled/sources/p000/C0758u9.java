package p000;

/* JADX INFO: renamed from: u9 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0758u9 extends AbstractC0322ih {

    /* JADX INFO: renamed from: a */
    public final C0647r9 f7707a;

    public C0758u9(C0647r9 c0647r9) {
        this.f7707a = c0647r9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0322ih)) {
            return false;
        }
        AbstractC0322ih abstractC0322ih = (AbstractC0322ih) obj;
        Object obj2 = EnumC0286hh.f3208j;
        if (obj2.equals(obj2)) {
            return this.f7707a.equals(((C0758u9) abstractC0322ih).f7707a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7707a.hashCode() ^ ((EnumC0286hh.f3208j.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC0286hh.f3208j + ", androidClientInfo=" + this.f7707a + "}";
    }
}
