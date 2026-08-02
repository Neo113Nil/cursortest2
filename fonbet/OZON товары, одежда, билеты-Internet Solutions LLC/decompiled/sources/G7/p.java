package G7;

import M7.x;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class p extends M7.n {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ byte[] f9745b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Long f9746c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f9747d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f9748e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ r f9749f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(r rVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l11, TaskCompletionSource taskCompletionSource2, d dVar) {
        super(taskCompletionSource);
        this.f9749f = rVar;
        this.f9745b = bArr;
        this.f9746c = l11;
        this.f9747d = taskCompletionSource2;
        this.f9748e = dVar;
    }

    @Override // M7.n
    public final void a(Exception exc) {
        if (exc instanceof x) {
            super.a(new c(-9, exc));
        } else {
            super.a(exc);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [M7.j, android.os.IInterface] */
    @Override // M7.n
    protected final void b() {
        M7.m mVar;
        TaskCompletionSource taskCompletionSource = this.f9747d;
        r rVar = this.f9749f;
        try {
            rVar.f9755c.e().u(r.a(rVar, this.f9745b, this.f9746c), new q(rVar, taskCompletionSource));
        } catch (RemoteException e11) {
            mVar = rVar.f9753a;
            mVar.c(e11, "requestIntegrityToken(%s)", this.f9748e);
            taskCompletionSource.trySetException(new c(-100, e11));
        }
    }
}
