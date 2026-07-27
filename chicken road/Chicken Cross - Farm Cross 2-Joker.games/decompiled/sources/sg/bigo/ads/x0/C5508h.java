package sg.bigo.ads.x0;

/* renamed from: sg.bigo.ads.x0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5508h extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f13385a;
    public final String b;

    public C5508h(int i, String str) {
        this.f13385a = i;
        this.b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }
}
