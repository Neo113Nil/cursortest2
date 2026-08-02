package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: renamed from: qm */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0623qm {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0660rm f6536a;

    static {
        AbstractC0660rm bd1Var;
        AtomicReference atomicReference = new AtomicReference();
        try {
            bd1Var = (AbstractC0660rm) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(AbstractC0660rm.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            bd1Var = new bd1();
        } catch (Exception e2) {
            C0270h1.m2189e("Storage override failed to initialize", e2);
            return;
        }
        f6536a = bd1Var;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            C0697sm.f7148a.log(Level.FINE, "Storage override doesn't exist. Using default", th);
        }
    }
}
