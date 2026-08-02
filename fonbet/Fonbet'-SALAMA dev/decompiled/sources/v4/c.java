package v4;

/* loaded from: classes2.dex */
public class c implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final c f17169b = new c("[MIN_NAME]");

    /* renamed from: c, reason: collision with root package name */
    public static final c f17170c = new c("[MAX_KEY]");

    /* renamed from: d, reason: collision with root package name */
    public static final c f17171d = new c(".priority");

    /* renamed from: e, reason: collision with root package name */
    public static final c f17172e = new c(".info");

    /* renamed from: a, reason: collision with root package name */
    public final String f17173a;

    public c(String str) {
        this.f17173a = str;
    }

    public static c b(String str) {
        Integer g3 = q4.k.g(str);
        if (g3 != null) {
            return new b(str, g3.intValue());
        }
        if (str.equals(".priority")) {
            return f17171d;
        }
        q4.k.c(!str.contains("/"));
        return new c(str);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(c cVar) {
        int i7 = 0;
        if (this == cVar) {
            return 0;
        }
        String str = this.f17173a;
        if (str.equals("[MIN_NAME]") || cVar.f17173a.equals("[MAX_KEY]")) {
            return -1;
        }
        String str2 = cVar.f17173a;
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
        int c3 = cVar.c();
        char[] cArr = q4.k.f15865a;
        int i8 = ((b) this).f17168f;
        int i9 = i8 < c3 ? -1 : i8 == c3 ? 0 : 1;
        if (i9 != 0) {
            return i9;
        }
        int length = str.length();
        int length2 = str2.length();
        if (length < length2) {
            i7 = -1;
        } else if (length != length2) {
            i7 = 1;
        }
        return i7;
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
        return this.f17173a.equals(((c) obj).f17173a);
    }

    public final int hashCode() {
        return this.f17173a.hashCode();
    }

    public String toString() {
        return e1.k.i(new StringBuilder("ChildKey(\""), this.f17173a, "\")");
    }
}
