package sg.bigo.ads.common.form.render;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.share.internal.ShareConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.O.c;
import sg.bigo.ads.O.d;
import sg.bigo.ads.P.n;
import sg.bigo.ads.P.o;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.HeightScrollView;
import sg.bigo.ads.common.view.MixtureTextView;
import sg.bigo.ads.common.view.PrivacyCheckBox;
import sg.bigo.ads.controller.form.AdFormActivity;
import sg.bigo.ads.l0.AbstractC5291b;
import sg.bigo.ads.l0.C5292c;
import sg.bigo.ads.l0.C5294e;
import sg.bigo.ads.m0.AbstractC5348a;
import sg.bigo.ads.m0.C5353f;
import sg.bigo.ads.m0.InterfaceC5352e;
import sg.bigo.ads.m0.ViewOnClickListenerC5354g;
import sg.bigo.ads.m0.h;
import sg.bigo.ads.m0.i;
import sg.bigo.ads.m0.j;
import sg.bigo.ads.m0.k;
import sg.bigo.ads.m0.m;
import sg.bigo.ads.n0.e;
import sg.bigo.ads.s1.b;

/* loaded from: classes3.dex */
public abstract class a {
    public static int a(Context context, n nVar) {
        o[] oVarArr = nVar.e;
        o oVar = (oVarArr == null || oVarArr.length <= 0) ? null : oVarArr[0];
        if (oVar == null) {
            return 0;
        }
        double c = AbstractC4963u.c(context);
        int i = oVar.b;
        int i2 = oVar.f12487a;
        double d = 1.0d;
        if (i2 != 0) {
            double d2 = i / i2;
            if (d2 >= 0.25d && d2 <= 1.0d) {
                d = d2;
            } else if (d2 < 0.25d) {
                d = 0.25d;
            }
        }
        return (int) (c * d);
    }

    public static void a(RelativeLayout relativeLayout, Context context, n nVar, C5353f c5353f) {
        GradientDrawable gradientDrawable;
        ViewGroup viewGroup = (ViewGroup) relativeLayout.findViewById(R.id.inter_privacy_notice_container);
        View a2 = AbstractC4944a.a(context, AbstractC5348a.a(4), null, false);
        if (a2 == null || viewGroup == null) {
            return;
        }
        X.a(a2, viewGroup, null, -1);
        TextView textView = (TextView) a2.findViewById(R.id.bigo_ad_form_btn_cancel);
        if (textView != null) {
            if (context == null) {
                gradientDrawable = null;
            } else {
                boolean z = AbstractC5348a.f13109a;
                int i = z ? -14931661 : -1;
                int i2 = z ? -10456960 : -4009768;
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setStroke(AbstractC4963u.a(context, 1), i2);
                gradientDrawable.setColor(i);
                gradientDrawable.setCornerRadius(AbstractC4963u.a(context, 8));
            }
            textView.setBackground(gradientDrawable);
            textView.setText(AbstractC5291b.a(context, R.string.bigo_ad_form_cancel));
            textView.setOnClickListener(new ViewOnClickListenerC5354g(a2, c5353f));
        }
        TextView textView2 = (TextView) a2.findViewById(R.id.bigo_ad_form_btn_agree);
        if (textView2 != null) {
            textView2.setText(AbstractC5291b.a(context, R.string.bigo_ad_form_agree));
            textView2.setOnClickListener(new h(a2, relativeLayout, context, nVar, c5353f));
        }
        PrivacyCheckBox privacyCheckBox = (PrivacyCheckBox) a2.findViewById(R.id.inter_form_check_box);
        if (privacyCheckBox != null && textView2 != null) {
            privacyCheckBox.setOnCheckChangeListener(new i(textView2));
        }
        a(a2, nVar, (Map) null, c5353f);
    }

    public static void a(ViewGroup viewGroup, Context context, n nVar, C5353f c5353f, int i) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_submit_success_container);
        boolean z = false;
        View a2 = AbstractC4944a.a(context, AbstractC5348a.a(7), null, false);
        if (viewGroup2 == null || a2 == null) {
            return;
        }
        X.a(a2, viewGroup2, null, -1);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.inter_form_icon_layout);
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(4);
        }
        HeightScrollView heightScrollView = (HeightScrollView) viewGroup.findViewById(R.id.inter_form_scroll);
        if (heightScrollView != null) {
            heightScrollView.setVisibility(4);
        }
        c cVar = nVar.m;
        TextView textView = (TextView) a2.findViewById(R.id.inter_feedback_title);
        if (textView != null) {
            textView.setText(cVar.f12469a);
        }
        TextView textView2 = (TextView) a2.findViewById(R.id.inter_feedback_dec);
        if (textView2 != null) {
            textView2.setText(cVar.b);
        }
        Button button = (Button) a2.findViewById(R.id.inter_feedback_cta);
        if (button != null) {
            button.setText(cVar.c);
            button.setOnClickListener(new m(c5353f, cVar));
        }
        if (c5353f == null || i == 5) {
            return;
        }
        if (c5353f.g.get() != null) {
            AdFormActivity adFormActivity = (AdFormActivity) ((InterfaceC5352e) c5353f.g.get());
            adFormActivity.d = true;
            sg.bigo.ads.e.h hVar = adFormActivity.f12717a;
            if (hVar != null) {
                hVar.v = true;
            }
        }
        n nVar2 = c5353f.b;
        e eVar = c5353f.c;
        PrivacyCheckBox privacyCheckBox = eVar.g;
        if (privacyCheckBox != null && privacyCheckBox.f) {
            z = true;
        }
        HashMap a3 = AbstractC5291b.a(nVar2, z, eVar.a());
        C5294e c5294e = C5294e.c;
        if (c5294e.b == null) {
            return;
        }
        b.a(1, i, "");
        c5294e.b.a(a3, new C5292c(c5353f, a3, i));
    }

    public static PrivacyCheckBox a(View view, n nVar, Map map, C5353f c5353f) {
        String str;
        boolean equals;
        JSONObject jSONObject;
        int i;
        MixtureTextView mixtureTextView = (MixtureTextView) view.findViewById(R.id.inter_form_privacy_desc);
        PrivacyCheckBox privacyCheckBox = (PrivacyCheckBox) view.findViewById(R.id.inter_form_check_box);
        TextView textView = (TextView) view.findViewById(R.id.inter_form_privacy_notice);
        if (mixtureTextView == null || privacyCheckBox == null || textView == null) {
            return null;
        }
        textView.setText(AbstractC5291b.a(textView.getContext(), R.string.bigo_ad_form_privacy_notice));
        if (map == null) {
            equals = true;
        } else {
            try {
                jSONObject = (JSONObject) map.get("extra");
            } catch (Exception unused) {
            }
            if (jSONObject != null && jSONObject.has(ShareConstants.WEB_DIALOG_PARAM_PRIVACY)) {
                str = jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_PRIVACY, "0");
                equals = "1".equals(str);
            }
            str = "";
            equals = "1".equals(str);
        }
        privacyCheckBox.f = equals;
        sg.bigo.ads.L0.n nVar2 = privacyCheckBox.n;
        if (nVar2 != null) {
            i iVar = (i) nVar2;
            if (equals) {
                i = R.drawable.bigo_ad_btn_background;
            } else {
                i = AbstractC5348a.f13109a ? R.drawable.bigo_ad_btn_background_white_dark : R.drawable.bigo_ad_btn_background_white;
            }
            iVar.f13116a.setBackgroundResource(i);
            iVar.f13116a.setClickable(equals);
        }
        privacyCheckBox.invalidate();
        View findViewById = view.findViewById(R.id.bigo_ad_check_box_expand);
        if (findViewById != null) {
            findViewById.setOnClickListener(new j(privacyCheckBox));
        }
        d dVar = nVar.l;
        String str2 = dVar != null ? dVar.f12470a : "";
        String str3 = dVar != null ? dVar.b : "";
        String replace = ("  " + ((Object) AbstractC4944a.a(mixtureTextView.getContext(), R.string.bigo_ad_form_privacy_content, AbstractC5291b.f13054a))).replace("{company_name}", str2);
        SpannableString spannableString = new SpannableString(replace);
        String[] strArr = {str2, "BIGO"};
        for (int i2 = 0; i2 < 2; i2++) {
            String str4 = strArr[i2];
            spannableString.setSpan(new UnderlineSpan() { // from class: sg.bigo.ads.common.form.render.FormViewHelper$5
                @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                }
            }, replace.lastIndexOf(str4), str4.length() + replace.lastIndexOf(str4), 33);
        }
        mixtureTextView.setText(spannableString);
        mixtureTextView.setClickListener(new k(c5353f, spannableString, str3));
        return privacyCheckBox;
    }
}
