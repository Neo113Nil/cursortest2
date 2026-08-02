package Z40;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeBaseViewWrapper;
import ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35375b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f35374a = i11;
        this.f35375b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean onViewCreated$lambda$4;
        boolean _init_$lambda$2;
        switch (this.f35374a) {
            case 0:
                onViewCreated$lambda$4 = OnboardingSlidesFragment.onViewCreated$lambda$4((OnboardingSlidesFragment) this.f35375b, view, motionEvent);
                return onViewCreated$lambda$4;
            case 1:
                _init_$lambda$2 = AspectsV4SizeBaseViewWrapper._init_$lambda$2((AspectsV4SizeBaseViewWrapper) this.f35375b, view, motionEvent);
                return _init_$lambda$2;
            default:
                if (motionEvent.getAction() == 1) {
                    ((AbstractC7737t) this.f35375b).invoke();
                }
                return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(Function0 function0) {
        this.f35374a = 2;
        this.f35375b = (AbstractC7737t) function0;
    }
}
