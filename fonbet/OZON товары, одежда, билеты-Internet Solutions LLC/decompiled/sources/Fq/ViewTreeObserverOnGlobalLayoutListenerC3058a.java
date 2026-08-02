package Fq;

import android.app.Activity;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.common.filterWidgets.common.KeyboardVisibilityHelper;

/* renamed from: Fq.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class ViewTreeObserverOnGlobalLayoutListenerC3058a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f9542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f9543c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9544d;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3058a(Object obj, Activity activity, Function1 function1, int i11) {
        this.f9541a = i11;
        this.f9544d = obj;
        this.f9542b = activity;
        this.f9543c = function1;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f9541a) {
            case 0:
                KeyboardVisibilityHelper.register$lambda$0((KeyboardVisibilityHelper) this.f9544d, this.f9542b, this.f9543c);
                break;
            default:
                ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.util.KeyboardVisibilityHelper.register$lambda$1((ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.util.KeyboardVisibilityHelper) this.f9544d, this.f9542b, this.f9543c);
                break;
        }
    }
}
