package H30;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f10565b;

    public /* synthetic */ j(Function0 function0, int i11) {
        this.f10564a = i11;
        this.f10565b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10564a) {
            case 0:
                this.f10565b.invoke();
                break;
            default:
                this.f10565b.invoke();
                break;
        }
    }
}
