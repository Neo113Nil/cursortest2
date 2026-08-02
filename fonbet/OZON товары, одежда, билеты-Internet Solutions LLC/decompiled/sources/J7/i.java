package J7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class i extends K7.i {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f14169b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f14170c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(k kVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f14170c = kVar;
        this.f14169b = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [K7.e, android.os.IInterface] */
    @Override // K7.i
    protected final void a() {
        K7.h hVar;
        String str;
        String str2;
        String unused;
        TaskCompletionSource taskCompletionSource = this.f14169b;
        k kVar = this.f14170c;
        try {
            ?? e11 = kVar.f14175a.e();
            str2 = kVar.f14176b;
            Bundle a11 = l.a();
            unused = kVar.f14176b;
            e11.w(str2, a11, new j(kVar, taskCompletionSource));
        } catch (RemoteException e12) {
            hVar = k.f14174c;
            str = kVar.f14176b;
            hVar.c(e12, "error requesting in-app review for %s", str);
            taskCompletionSource.trySetException(new RuntimeException(e12));
        }
    }
}
