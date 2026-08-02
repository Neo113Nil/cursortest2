package K7;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class l extends i {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f15305b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f15306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(r rVar, TaskCompletionSource taskCompletionSource, i iVar) {
        super(taskCompletionSource);
        this.f15306c = rVar;
        this.f15305b = iVar;
    }

    @Override // K7.i
    public final void a() {
        r.m(this.f15306c, this.f15305b);
    }
}
