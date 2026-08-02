package Ak0;

import android.animation.ValueAnimator;
import ru.ozon.android.messenger.blocks.snackbar.view.TimerView;
import ru.ozon.app.android.uikit.view.input.MobilizationSmsCodeEditText;
import ru.ozon.uni.android.flashbar.animation.FlashbarAnimator;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1239b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f1238a = i11;
        this.f1239b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1238a) {
            case 0:
                FlashbarAnimator.start$lambda$1$lambda$0((FlashbarAnimator.InternalAnimListener) this.f1239b, valueAnimator);
                break;
            case 1:
                TimerView.b((TimerView) this.f1239b, valueAnimator);
                break;
            default:
                MobilizationSmsCodeEditText.lambda$6$lambda$5((MobilizationSmsCodeEditText) this.f1239b, valueAnimator);
                break;
        }
    }
}
