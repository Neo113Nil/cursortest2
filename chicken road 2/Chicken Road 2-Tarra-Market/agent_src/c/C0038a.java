package c;

import a.AbstractC0009a;
import java.util.concurrent.Executors;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038a extends AbstractC0009a {

    /* renamed from: k, reason: collision with root package name */
    public static volatile C0038a f696k;

    /* renamed from: j, reason: collision with root package name */
    public final Object f697j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0038a(int i2) {
        super(16);
        switch (i2) {
            case 1:
                super(16);
                this.f697j = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0039b());
                break;
            default:
                this.f697j = new C0038a(1);
                break;
        }
    }
}
