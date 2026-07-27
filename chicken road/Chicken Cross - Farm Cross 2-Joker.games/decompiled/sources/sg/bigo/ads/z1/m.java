package sg.bigo.ads.z1;

/* loaded from: classes3.dex */
public final class m extends n implements Comparable {
    public final float e;

    public m(String str, float f) {
        super(str);
        this.e = f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Double.compare(this.e, ((m) obj).e);
    }

    @Override // sg.bigo.ads.z1.n
    public final String toString() {
        return "{\"Content\":\"" + this.f13447a + "\",\"progress\":\"" + this.e + "\"}";
    }
}
