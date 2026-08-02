package M7;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class q extends n {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f17521b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f17522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(w wVar, TaskCompletionSource taskCompletionSource, n nVar) {
        super(taskCompletionSource);
        this.f17522c = wVar;
        this.f17521b = nVar;
    }

    @Override // M7.n
    public final void b() {
        w.m(this.f17522c, this.f17521b);
    }
}
