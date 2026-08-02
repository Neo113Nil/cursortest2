package Dk0;

import android.view.View;
import ru.ozon.app.android.search.databinding.ActiveSearchbarBinding;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewHolder;
import ru.ozon.fintech.ui.input.InputView;
import ru.ozon.uni.android.input.textinput.domain.OzonTextInputLayoutDelegate;
import spay.sdk.view.otpTextView.SpayOtpTextView;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6751b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f6750a = i11;
        this.f6751b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z11) {
        switch (this.f6750a) {
            case 0:
                OzonTextInputLayoutDelegate._init_$lambda$0((OzonTextInputLayoutDelegate) this.f6751b, view, z11);
                break;
            case 1:
                SpayOtpTextView.a((SpayOtpTextView) this.f6751b, view, z11);
                break;
            case 2:
                ActiveSearchBarViewHolder.setupSearch$lambda$10((ActiveSearchbarBinding) this.f6751b, view, z11);
                break;
            default:
                InputView.focusChangeListener$lambda$15((InputView) this.f6751b, view, z11);
                break;
        }
    }
}
