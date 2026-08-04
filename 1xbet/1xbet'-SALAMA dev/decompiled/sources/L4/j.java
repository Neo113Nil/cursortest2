package L4;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f4371d = new j(null, null, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f4373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4374c;

    public j(j jVar, String str, int i7) {
        this.f4373b = jVar;
        this.f4374c = str;
        this.f4372a = i7;
    }

    public final String toString() {
        int i7 = this.f4372a;
        if (i7 == 0) {
            return "";
        }
        String str = this.f4374c;
        if (i7 == 1) {
            return str;
        }
        return this.f4373b.toString() + "." + str;
    }
}
