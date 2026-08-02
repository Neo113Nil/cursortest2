package M2;

import D2.r;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.ui.pinprogress.PinProgressWrapper;
import ru.ozon.fintech.ui.pinprogress.PinProgressWrapperState;

/* loaded from: classes8.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17273c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f17271a = i11;
        this.f17272b = obj;
        this.f17273c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17271a) {
            case 0:
                a this$0 = (a) this.f17272b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                r e11 = (r) this.f17273c;
                Intrinsics.checkNotNullParameter(e11, "$e");
                this$0.m().a(e11);
                break;
            case 1:
                vf.c.c("CronetUploadDataStream#postTaskToExecutor " + ((String) this.f17272b) + " running callback");
                ((Runnable) this.f17273c).run();
                break;
            default:
                PinProgressWrapper.bindState$lambda$1((PinProgressWrapper) this.f17272b, (PinProgressWrapperState) this.f17273c);
                break;
        }
    }
}
