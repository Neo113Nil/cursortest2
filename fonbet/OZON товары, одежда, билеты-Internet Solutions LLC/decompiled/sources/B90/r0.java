package B90;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer.AnswerViewHolder;

/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3190b;

    public /* synthetic */ r0(Object obj, int i11) {
        this.f3189a = i11;
        this.f3190b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3189a) {
            case 0:
                v0.p0((v0) this.f3190b);
                break;
            case 1:
                M2.a this$0 = (M2.a) this.f3190b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.m().a(new D2.r("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                break;
            default:
                AnswerViewHolder.highlightedAnimationRunnable$lambda$1((AnswerViewHolder) this.f3190b);
                break;
        }
    }
}
