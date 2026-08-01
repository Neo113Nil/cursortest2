package sg.bigo.ads.L0;

import android.view.View;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.PrivacyCheckBox;
import sg.bigo.ads.m0.AbstractC5348a;

/* loaded from: classes3.dex */
public final class o implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f12411a;
    public final /* synthetic */ PrivacyCheckBox b;

    public o(PrivacyCheckBox privacyCheckBox, View.OnClickListener onClickListener) {
        this.b = privacyCheckBox;
        this.f12411a = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PrivacyCheckBox privacyCheckBox = this.b;
        privacyCheckBox.f = !privacyCheckBox.f;
        privacyCheckBox.invalidate();
        PrivacyCheckBox privacyCheckBox2 = this.b;
        n nVar = privacyCheckBox2.n;
        if (nVar != null) {
            boolean z = privacyCheckBox2.f;
            sg.bigo.ads.m0.i iVar = (sg.bigo.ads.m0.i) nVar;
            iVar.f13116a.setBackgroundResource(z ? R.drawable.bigo_ad_btn_background : AbstractC5348a.f13109a ? R.drawable.bigo_ad_btn_background_white_dark : R.drawable.bigo_ad_btn_background_white);
            iVar.f13116a.setClickable(z);
        }
        View.OnClickListener onClickListener = this.f12411a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
