package kotlinx.coroutines.flow.internal;

/* loaded from: classes5.dex */
public final class p<T> extends kotlinx.coroutines.internal.t<T> {
    @Override // kotlinx.coroutines.C0
    public final boolean w(Throwable th) {
        if (th instanceof m) {
            return true;
        }
        return o(th);
    }
}
