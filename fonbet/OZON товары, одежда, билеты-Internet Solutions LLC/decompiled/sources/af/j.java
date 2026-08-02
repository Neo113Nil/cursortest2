package af;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.K;
import sf.p;

/* loaded from: classes6.dex */
public final class j extends p {

    /* renamed from: b, reason: collision with root package name */
    private boolean f36762b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f36763c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull K delegate, @NotNull Function1<? super IOException, Unit> onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.f36763c = (AbstractC7737t) onException;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // sf.p, sf.K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f36762b) {
            return;
        }
        try {
            super.close();
        } catch (IOException e11) {
            this.f36762b = true;
            this.f36763c.invoke(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // sf.p, sf.K, java.io.Flushable
    public final void flush() {
        if (this.f36762b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e11) {
            this.f36762b = true;
            this.f36763c.invoke(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // sf.p, sf.K
    public final void z0(@NotNull C9681g source, long j11) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f36762b) {
            source.skip(j11);
            return;
        }
        try {
            super.z0(source, j11);
        } catch (IOException e11) {
            this.f36762b = true;
            this.f36763c.invoke(e11);
        }
    }
}
