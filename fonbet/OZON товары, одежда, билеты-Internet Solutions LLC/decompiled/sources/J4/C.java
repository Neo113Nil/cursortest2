package J4;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f13847c;

    public /* synthetic */ C(Object obj, Executor executor, int i11) {
        this.f13845a = i11;
        this.f13846b = obj;
        this.f13847c = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13845a) {
            case 0:
                Runnable command = (Runnable) this.f13846b;
                Intrinsics.checkNotNullParameter(command, "$command");
                D this$0 = (D) this.f13847c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    command.run();
                    return;
                } finally {
                    this$0.a();
                }
            default:
                Va.d.b((Va.d) this.f13846b, (Va.a) this.f13847c);
                return;
        }
    }
}
