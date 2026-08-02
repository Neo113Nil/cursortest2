package De;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.M;

/* renamed from: De.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2862e implements M {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f6619a;

    public C2862e(@NotNull CoroutineContext coroutineContext) {
        this.f6619a = coroutineContext;
    }

    @Override // xe.M
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f6619a;
    }

    @NotNull
    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f6619a + ')';
    }
}
