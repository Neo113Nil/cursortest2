package c;

import a.AbstractC0018a;
import java.util.concurrent.Executors;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019a extends AbstractC0018a {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0019a f476g;

    /* renamed from: f, reason: collision with root package name */
    public final Object f477f;

    public C0019a(int i2) {
        switch (i2) {
            case 1:
                this.f477f = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0020b());
                break;
            default:
                this.f477f = new C0019a(1);
                break;
        }
    }
}
