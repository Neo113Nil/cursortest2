package A90;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.R;
import ru.ozon.fintech.preferences.ui.nativebridge.StatusResultView;
import ru.ozon.fintech.ui.input.FinInputView;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f575b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f574a = i11;
        this.f575b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit _init_$lambda$4;
        Object obj = this.f575b;
        switch (this.f574a) {
            case 0:
                return ru.ozon.fintech.preferences.presentation.cbdc.a.f0((ru.ozon.fintech.preferences.presentation.cbdc.a) obj);
            case 1:
                int i11 = StatusResultView.f97006n;
                return Integer.valueOf(androidx.core.content.a.getColor((Context) obj, R.color.oz_semantic_text_primary));
            case 2:
                return h90.g.k((h90.g) obj);
            default:
                _init_$lambda$4 = FinInputView._init_$lambda$4((FinInputView) obj);
                return _init_$lambda$4;
        }
    }
}
