package sg.bigo.ads.I;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class l extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    public k f12328a;

    public l(Activity activity) {
        super(activity, R.style.BigoAd_Dialog_Fullscreen);
        setCanceledOnTouchOutside(true);
    }

    public final void a(k kVar) {
        this.f12328a = kVar;
        getWindow().setFlags(8, 8);
        show();
        getWindow().getDecorView().setSystemUiVisibility(5894);
        getWindow().clearFlags(8);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View a2 = AbstractC4944a.a(getContext(), R.layout.bigo_ad_dialog_reward_retain, null, false);
        setContentView(a2);
        a2.setOnClickListener(new h(this));
        a2.findViewById(R.id.bigo_ad_btn_resume).setOnClickListener(new i(this));
        a2.findViewById(R.id.bigo_ad_btn_skip).setOnClickListener(new j(this));
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        k kVar = this.f12328a;
        if (kVar != null) {
            kVar.d();
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        k kVar = this.f12328a;
        if (kVar != null) {
            kVar.c();
            this.f12328a = null;
        }
    }
}
