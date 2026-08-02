package C7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class q extends D7.o {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f4450b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f4451c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ u f4452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(u uVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, String str) {
        super(taskCompletionSource);
        this.f4452d = uVar;
        this.f4450b = taskCompletionSource2;
        this.f4451c = str;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [D7.h, android.os.IInterface] */
    @Override // D7.o
    protected final void a() {
        D7.n nVar;
        String str;
        Bundle h11;
        TaskCompletionSource taskCompletionSource = this.f4450b;
        u uVar = this.f4452d;
        try {
            ?? e11 = uVar.f4459a.e();
            str = uVar.f4460b;
            h11 = u.h();
            e11.o(str, h11, new s(uVar, new D7.n("OnCompleteUpdateCallback"), taskCompletionSource));
        } catch (RemoteException e12) {
            nVar = u.f4457e;
            nVar.c(e12, "completeUpdate(%s)", this.f4451c);
            taskCompletionSource.trySetException(new RuntimeException(e12));
        }
    }
}
