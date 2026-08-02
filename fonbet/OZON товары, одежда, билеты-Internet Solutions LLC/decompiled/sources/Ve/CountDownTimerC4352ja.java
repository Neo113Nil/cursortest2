package Ve;

import android.os.CountDownTimer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ja, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CountDownTimerC4352ja extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC7737t f31352a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC7737t f31353b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CountDownTimerC4352ja(long j11, long j12, Function1 function1, Function0 onFinishTimerAction) {
        super(j11, j12);
        Intrinsics.checkNotNullParameter(onFinishTimerAction, "onFinishTimerAction");
        this.f31352a = (AbstractC7737t) function1;
        this.f31353b = (AbstractC7737t) onFinishTimerAction;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f31353b.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // android.os.CountDownTimer
    public final void onTick(long j11) {
        ?? r02 = this.f31352a;
        if (r02 != 0) {
            r02.invoke(Long.valueOf(j11));
        }
    }
}
