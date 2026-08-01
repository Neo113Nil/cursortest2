package sg.bigo.ads.z1;

/* loaded from: classes3.dex */
public final class d extends n implements Comparable {
    public final int e;

    public d(String str, int i) {
        super(str);
        this.e = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.e - ((d) obj).e;
    }

    @Override // sg.bigo.ads.z1.n
    public final String toString() {
        return "{\"Content\":\"" + this.f13447a + "\",\"pro_ms\":\"" + this.e + "\"}";
    }
}
