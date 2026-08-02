package C1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class c<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f4299a;

    private c() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Function0 function0) {
        this.f4299a = (AbstractC7737t) function0;
    }

    @NotNull
    public final Function0<T> a() {
        return (Function0<T>) this.f4299a;
    }
}
