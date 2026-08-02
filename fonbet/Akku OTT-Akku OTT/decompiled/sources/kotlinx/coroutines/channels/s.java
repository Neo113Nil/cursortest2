package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlinx.coroutines.J;

/* loaded from: classes5.dex */
public final class s<E> extends h<E> implements t<E> {
    @Override // kotlinx.coroutines.AbstractC1044a
    public final void a0(Throwable th, boolean z) {
        if (this.d.m(th, false) || z) {
            return;
        }
        J.a(this.c, th);
    }

    @Override // kotlinx.coroutines.AbstractC1044a
    public final void b0(Unit unit) {
        this.d.g(null);
    }

    @Override // kotlinx.coroutines.channels.t
    public final s getChannel() {
        return this;
    }
}
