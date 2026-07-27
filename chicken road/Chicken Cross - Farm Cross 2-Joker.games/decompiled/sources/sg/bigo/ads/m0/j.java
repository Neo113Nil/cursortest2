package sg.bigo.ads.m0;

import android.view.View;
import sg.bigo.ads.L0.n;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.PrivacyCheckBox;

/* loaded from: classes3.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrivacyCheckBox f13117a;

    public j(PrivacyCheckBox privacyCheckBox) {
        this.f13117a = privacyCheckBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PrivacyCheckBox privacyCheckBox = this.f13117a;
        boolean z = privacyCheckBox.f;
        boolean z2 = !z;
        privacyCheckBox.f = z2;
        n nVar = privacyCheckBox.n;
        if (nVar != null) {
            i iVar = (i) nVar;
            iVar.f13116a.setBackgroundResource(!z ? R.drawable.bigo_ad_btn_background : AbstractC5348a.f13109a ? R.drawable.bigo_ad_btn_background_white_dark : R.drawable.bigo_ad_btn_background_white);
            iVar.f13116a.setClickable(z2);
        }
        privacyCheckBox.invalidate();
    }
}
