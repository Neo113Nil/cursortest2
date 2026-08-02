package Na;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.C7704k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f18884c = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f18885a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7704k<byte[]> f18886b = new C7704k<>(10);

    @NotNull
    public final byte[] b() {
        ReentrantLock reentrantLock = this.f18885a;
        reentrantLock.lock();
        try {
            byte[] A11 = this.f18886b.A();
            if (A11 == null) {
                A11 = new byte[32768];
            }
            return A11;
        } finally {
            reentrantLock.unlock();
        }
    }
}
