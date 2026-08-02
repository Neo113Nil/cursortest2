package J4;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class x implements io.reactivex.B<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Callable f13962a;

    x(Callable callable) {
        this.f13962a = callable;
    }

    @Override // io.reactivex.B
    public final void b(io.reactivex.z<Object> zVar) throws Exception {
        zVar.onSuccess(this.f13962a.call());
    }
}
