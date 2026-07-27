package sg.bigo.ads.d1;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.P;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class m extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f12736a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Activity activity) {
        super(activity, R.style.BigoAd_Feedback_Dialog_FullScreen);
        this.f12736a = nVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        n.b = false;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View findViewById;
        super.onCreate(bundle);
        View a2 = AbstractC4944a.a(getContext(), R.layout.bigo_ad_optionview_feedback, null, false);
        setContentView(a2);
        n nVar = this.f12736a;
        Window window = getWindow();
        nVar.getClass();
        if (window != null) {
            P.a(window);
        }
        if (!TextUtils.isEmpty(this.f12736a.f12737a.f12729a)) {
            View findViewById2 = findViewById(R.id.bigo_ad_btn_why_this_ad);
            findViewById2.setVisibility(0);
            findViewById2.setOnClickListener(new ViewOnClickListenerC5071g(this));
        }
        if (!TextUtils.isEmpty(this.f12736a.f12737a.b)) {
            View findViewById3 = findViewById(R.id.inter_option_btn_copy_ru_ad_marker);
            if (findViewById3 != null) {
                TextView textView = (TextView) findViewById3.findViewById(R.id.inter_option_text_copy_ru_ad_marker);
                if (textView != null) {
                    textView.setText(AbstractC4944a.a(getContext(), R.string.bigo_ad_feedback_copy_ad_id, this.f12736a.f12737a.b));
                }
                findViewById3.setVisibility(0);
                findViewById3.setOnClickListener(new ViewOnClickListenerC5072h(this, findViewById3));
            }
            if (findViewById3 != null && (findViewById = findViewById3.findViewById(R.id.inter_option_line)) != null) {
                findViewById.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(this.f12736a.f12737a.c)) {
            findViewById(R.id.inter_option_ll_ad_info).setVisibility(0);
            ((TextView) findViewById(R.id.inter_option_tv_ad_info)).setText(this.f12736a.f12737a.c);
        }
        if (!TextUtils.isEmpty(this.f12736a.f12737a.d)) {
            View findViewById4 = findViewById(R.id.bigo_ad_btn_ad_copy_link);
            findViewById4.setVisibility(0);
            findViewById4.setOnClickListener(new ViewOnClickListenerC5073i(this, findViewById4.getContext()));
        }
        if (!TextUtils.isEmpty(this.f12736a.f12737a.e)) {
            View findViewById5 = findViewById(R.id.bigo_ad_btn_rec_rule);
            findViewById5.setVisibility(0);
            findViewById5.setOnClickListener(new ViewOnClickListenerC5074j(this));
        }
        if (!TextUtils.isEmpty(this.f12736a.f12737a.f)) {
            View findViewById6 = findViewById(R.id.bigo_ad_btn_user_privacy);
            findViewById6.setVisibility(0);
            findViewById6.setOnClickListener(new ViewOnClickListenerC5075k(this));
        }
        a2.findViewById(R.id.bigo_ad_feedback_background).setOnClickListener(new ViewOnClickListenerC5076l(this));
    }
}
