package v4;

/* JADX INFO: loaded from: classes2.dex */
public class c implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f17175b = new c("[MIN_NAME]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f17176c = new c("[MAX_KEY]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f17177d = new c(".priority");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f17178e = new c(".info");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17179a;

    public c(String str) {
        this.f17179a = str;
    }

    public static c b(String str) {
        Integer numG = p120q4.k.g(str);
        if (numG != null) {
            return new b(str, numG.intValue());
        }
        if (str.equals(".priority")) {
            return f17177d;
        }
        p120q4.k.c(!str.contains("/"));
        return new c(str);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(c cVar) {
        int i7;
        int i8 = 0;
        if (this == cVar) {
            return 0;
        }
        String str = this.f17179a;
        if (str.equals("[MIN_NAME]") || cVar.f17179a.equals("[MAX_KEY]")) {
            return -1;
        }
        String str2 = cVar.f17179a;
        if (str2.equals("[MIN_NAME]") || str.equals("[MAX_KEY]")) {
            return 1;
        }
        if (!(this instanceof b)) {
            if (cVar instanceof b) {
                return 1;
            }
            return str.compareTo(str2);
        }
        if (!(cVar instanceof b)) {
            return -1;
        }
        int iC = cVar.c();
        char[] cArr = p120q4.k.f15871a;
        int i9 = ((b) this).f17174f;
        if (i9 < iC) {
            i7 = -1;
        } else {
            i7 = i9 == iC ? 0 : 1;
        }
        if (i7 != 0) {
            return i7;
        }
        int length = str.length();
        int length2 = str2.length();
        if (length < length2) {
            i8 = -1;
        } else if (length != length2) {
            i8 = 1;
        }
        return i8;
    }

    public int c() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.f17179a.equals(((c) obj).f17179a);
    }

    public final int hashCode() {
        return this.f17179a.hashCode();
    }

    public String toString() {
        return p031e1.k.i(new StringBuilder("ChildKey(\""), this.f17179a, "\")");
    }
}
