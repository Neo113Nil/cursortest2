package E3;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1982c;

    public A(Object obj, Object obj2, Object obj3) {
        this.f1980a = obj;
        this.f1981b = obj2;
        this.f1982c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f1980a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f1981b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f1982c);
        return new IllegalArgumentException(sb.toString());
    }
}
