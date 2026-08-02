package L5;

/* loaded from: classes2.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public String f4417a;

    /* renamed from: b, reason: collision with root package name */
    public String f4418b;

    public L(String str, String str2) {
        this.f4417a = str;
        this.f4418b = str2;
    }

    public String a() {
        StringBuilder sb = new StringBuilder("Flutter-GMA-5.3.1");
        if (this.f4417a != null) {
            sb.append("_News-");
            sb.append(this.f4417a);
        }
        if (this.f4418b != null) {
            sb.append("_Game-");
            sb.append(this.f4418b);
        }
        return sb.toString();
    }
}
