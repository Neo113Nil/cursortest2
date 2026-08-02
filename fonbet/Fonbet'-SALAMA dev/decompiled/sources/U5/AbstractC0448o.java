package U5;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: U5.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0448o {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0449p f6562a;

    static {
        AbstractC0449p q0Var;
        AtomicReference atomicReference = new AtomicReference();
        try {
            q0Var = (AbstractC0449p) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(AbstractC0449p.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e7) {
            atomicReference.set(e7);
            q0Var = new q0();
        } catch (Exception e8) {
            throw new RuntimeException("Storage override failed to initialize", e8);
        }
        f6562a = q0Var;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            C0450q.f6571a.log(Level.FINE, "Storage override doesn't exist. Using default", th);
        }
    }
}
