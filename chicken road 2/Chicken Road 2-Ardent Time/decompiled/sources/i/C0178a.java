package i;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178a extends Q1.d {

    /* renamed from: b, reason: collision with root package name */
    public static volatile i.C0178a f3303b;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f3304a;

    public C0178a(int i2) {
        switch (i2) {
            case 1:
                this.f3304a = new java.lang.Object();
                java.util.concurrent.Executors.newFixedThreadPool(4, new i.ThreadFactoryC0179b());
                break;
            default:
                this.f3304a = new i.C0178a(1);
                break;
        }
    }
}
