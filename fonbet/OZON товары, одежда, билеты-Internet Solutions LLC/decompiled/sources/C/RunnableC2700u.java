package C;

import android.content.Context;
import androidx.concurrent.futures.b;
import java.util.concurrent.Executor;

/* renamed from: C.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC2700u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2703x f4243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f4245c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b.a f4247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f4248f;

    public /* synthetic */ RunnableC2700u(int i11, long j11, C2703x c2703x, Context context, b.a aVar, Executor executor) {
        this.f4243a = c2703x;
        this.f4244b = context;
        this.f4245c = executor;
        this.f4246d = i11;
        this.f4247e = aVar;
        this.f4248f = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.a aVar = this.f4247e;
        Executor executor = this.f4245c;
        C2703x.a(this.f4246d, this.f4248f, this.f4243a, this.f4244b, aVar, executor);
    }
}
