package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rc0 {

    /* JADX INFO: renamed from: a */
    public final Object f6817a;

    /* JADX INFO: renamed from: b */
    public final Object f6818b;

    /* JADX INFO: renamed from: c */
    public final Object f6819c;

    public rc0(Object obj, Object obj2, Object obj3) {
        this.f6817a = obj;
        this.f6818b = obj2;
        this.f6819c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m4337a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f6817a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f6818b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f6819c);
        return new IllegalArgumentException(sb.toString());
    }
}
