package sg.bigo.ads.n0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.Map;
import org.json.JSONObject;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.L0.p;
import sg.bigo.ads.R;
import sg.bigo.ads.m0.AbstractC5348a;

/* loaded from: classes3.dex */
public final class h extends AbstractC5416a {
    public h(sg.bigo.ads.O.e eVar, Map map, Context context, e eVar2) {
        super(eVar, map, context, eVar2);
    }

    @Override // sg.bigo.ads.n0.AbstractC5416a
    public final void a(int i) {
        boolean z = AbstractC5348a.f13109a;
        int i2 = z ? -12957095 : -2234903;
        int i3 = z ? -2431246 : -14275021;
        boolean z2 = false;
        if (i != 2 && i == 3) {
            i2 = -45718;
            z2 = true;
            i3 = -45718;
        }
        a(i2, i3, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014c A[EDGE_INSN: B:49:0x014c->B:50:0x014c BREAK  A[LOOP:0: B:17:0x0060->B:43:0x0145], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
    @Override // sg.bigo.ads.n0.AbstractC5416a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View b() {
        JSONObject jSONObject;
        String string;
        p pVar;
        int i;
        CharSequence[] charSequenceArr;
        View a2 = AbstractC4944a.a(this.g, AbstractC5348a.a(6), null, false);
        this.h = a2;
        if (a2 == null) {
            return null;
        }
        TextView textView = (TextView) a2.findViewById(R.id.inter_form_edit_title);
        String str = this.d;
        if (!TextUtils.isEmpty(str) && textView != null) {
            textView.setText(str);
        }
        a(1);
        RadioGroup radioGroup = (RadioGroup) this.h.findViewById(R.id.inter_form_edit_content);
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new f(this, radioGroup));
            if (this.f.length != 0) {
                String str2 = this.e;
                Map map = this.b;
                if (map != null) {
                    try {
                        jSONObject = (JSONObject) map.get("form_qa");
                    } catch (Exception unused) {
                    }
                    if (jSONObject != null) {
                        string = jSONObject.getString(str2);
                        pVar = null;
                        i = 0;
                        while (true) {
                            charSequenceArr = this.f;
                            if (i < charSequenceArr.length) {
                                break;
                            }
                            CharSequence charSequence = charSequenceArr[i];
                            boolean z = i == 0;
                            p pVar2 = new p(this.g);
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                            if (!z) {
                                marginLayoutParams.topMargin = AbstractC4963u.a(this.g, 8);
                            }
                            pVar2.setLayoutParams(marginLayoutParams);
                            pVar2.setPadding(AbstractC4963u.a(this.g, 12), AbstractC4963u.a(this.g, 10), AbstractC4963u.a(this.g, 12), AbstractC4963u.a(this.g, 11));
                            pVar2.setTextSize(13.0f);
                            if (!TextUtils.isEmpty(charSequence)) {
                                pVar2.setText(charSequence);
                            }
                            pVar2.setButtonDrawable((Drawable) null);
                            Context context = this.g;
                            StateListDrawable stateListDrawable = new StateListDrawable();
                            int i2 = AbstractC5348a.f13109a ? -15524570 : -657158;
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setShape(0);
                            gradientDrawable.setColor(i2);
                            gradientDrawable.setCornerRadius(AbstractC4963u.a(context, 4));
                            GradientDrawable gradientDrawable2 = new GradientDrawable();
                            gradientDrawable2.setShape(0);
                            gradientDrawable2.setColor(i2);
                            gradientDrawable2.setCornerRadius(AbstractC4963u.a(context, 4));
                            gradientDrawable2.setStroke(1, -16736769);
                            stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
                            stateListDrawable.addState(new int[]{android.R.attr.state_checked}, gradientDrawable2);
                            pVar2.setBackground(stateListDrawable);
                            pVar2.setOnCheckedChangeListener(new g());
                            pVar2.setTextColor(AbstractC5348a.f13109a ? -2431246 : -14275021);
                            if (!I.a((CharSequence) string) && string.equalsIgnoreCase(this.f[i])) {
                                e eVar = this.i;
                                if (eVar != null) {
                                    eVar.a(this.f13199a.d, string);
                                }
                                this.c = string;
                                pVar = pVar2;
                            }
                            X.a(pVar2, radioGroup, null, -1);
                            i++;
                        }
                        if (pVar != null) {
                            pVar.setChecked(true);
                        }
                    }
                }
                string = "";
                pVar = null;
                i = 0;
                while (true) {
                    charSequenceArr = this.f;
                    if (i < charSequenceArr.length) {
                    }
                    X.a(pVar2, radioGroup, null, -1);
                    i++;
                }
                if (pVar != null) {
                }
            }
        }
        return this.h;
    }
}
