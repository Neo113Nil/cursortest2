package S6;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public final class n implements U6.b<Executor> {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final n f25935a = new n();
    }

    @Override // Pc.a
    public final Object get() {
        return new p(Executors.newSingleThreadExecutor());
    }
}
