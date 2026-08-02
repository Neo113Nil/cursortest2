package A90;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.R;
import ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment;
import ru.ozon.fintech.preferences.ui.nativebridge.StatusResultView;
import ru.ozon.fintech.ui.input.FinInputView;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f573b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f572a = i11;
        this.f573b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit _init_$lambda$2;
        Object obj = this.f573b;
        switch (this.f572a) {
            case 0:
                return FintechCbdcFragment.t((FintechCbdcFragment) obj);
            case 1:
                int i11 = StatusResultView.f97006n;
                return Integer.valueOf(androidx.core.content.a.getColor((Context) obj, R.color.oz_semantic_text_secondary));
            default:
                _init_$lambda$2 = FinInputView._init_$lambda$2((FinInputView) obj);
                return _init_$lambda$2;
        }
    }
}
