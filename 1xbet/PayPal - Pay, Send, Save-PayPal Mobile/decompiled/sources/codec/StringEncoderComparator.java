package codec;

/* loaded from: classes7.dex */
public class StringEncoderComparator implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final codec.StringEncoder f2762a;

    @java.lang.Deprecated
    public StringEncoderComparator() {
        this.f2762a = null;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        try {
            return ((java.lang.Comparable) this.f2762a.encode(obj)).compareTo((java.lang.Comparable) this.f2762a.encode(obj2));
        } catch (codec.EncoderException unused) {
            return 0;
        }
    }

    public StringEncoderComparator(codec.StringEncoder stringEncoder) {
        this.f2762a = stringEncoder;
    }
}
