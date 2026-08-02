package bc;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: bc.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5629e extends AbstractC5626b {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f55866a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f55867b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f55868c;

    /* renamed from: d, reason: collision with root package name */
    private final C5633i f55869d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f55870e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f55871f;

    C5629e(@NonNull C5627c c5627c) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f55871f = new HashMap(2);
        this.f55866a = c5627c.f55857a;
        this.f55867b = c5627c.f55858b;
        this.f55868c = c5627c.f55859c;
        this.f55869d = c5627c.f55860d;
        this.f55870e = handler;
    }

    @Override // bc.AbstractC5626b
    public final void a(@NonNull C5625a c5625a) {
        Future future = (Future) this.f55871f.remove(c5625a);
        if (future != null) {
            future.cancel(true);
        }
        this.f55870e.removeCallbacksAndMessages(c5625a);
    }

    @Override // bc.AbstractC5626b
    public final void b(@NonNull C5625a c5625a) {
        HashMap hashMap = this.f55871f;
        if (((Future) hashMap.get(c5625a)) == null) {
            hashMap.put(c5625a, this.f55866a.submit(new RunnableC5628d(this, c5625a)));
        }
    }
}
