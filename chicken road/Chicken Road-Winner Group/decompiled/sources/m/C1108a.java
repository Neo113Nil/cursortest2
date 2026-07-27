package m;

import java.util.concurrent.Executors;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1108a extends F2.b {

    /* renamed from: i, reason: collision with root package name */
    public static volatile C1108a f9933i;

    /* renamed from: h, reason: collision with root package name */
    public final Object f9934h;

    public C1108a(int i3) {
        switch (i3) {
            case 1:
                this.f9934h = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC1109b());
                break;
            default:
                this.f9934h = new C1108a(1);
                break;
        }
    }
}
