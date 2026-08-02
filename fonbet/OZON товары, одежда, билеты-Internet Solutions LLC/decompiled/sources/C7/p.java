package C7;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class p extends D7.o {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4447b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f4448c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ u f4449d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(u uVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, String str) {
        super(taskCompletionSource);
        this.f4449d = uVar;
        this.f4447b = str;
        this.f4448c = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [D7.h, android.os.IInterface] */
    @Override // D7.o
    protected final void a() {
        D7.n nVar;
        String str;
        TaskCompletionSource taskCompletionSource = this.f4448c;
        String str2 = this.f4447b;
        u uVar = this.f4449d;
        try {
            ?? e11 = uVar.f4459a.e();
            str = uVar.f4460b;
            e11.l(str, u.a(uVar, str2), new t(uVar, taskCompletionSource, str2));
        } catch (RemoteException e12) {
            nVar = u.f4457e;
            nVar.c(e12, "requestUpdateInfo(%s)", str2);
            taskCompletionSource.trySetException(new RuntimeException(e12));
        }
    }
}
