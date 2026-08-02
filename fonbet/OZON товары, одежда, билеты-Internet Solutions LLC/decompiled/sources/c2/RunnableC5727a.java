package c2;

import kotlin.jvm.functions.Function0;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC5727a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f56321b;

    public /* synthetic */ RunnableC5727a(Function0 function0, int i11) {
        this.f56320a = i11;
        this.f56321b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f56320a) {
            case 0:
                this.f56321b.invoke();
                break;
            default:
                this.f56321b.invoke();
                break;
        }
    }
}
