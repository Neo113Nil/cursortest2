package sg.bigo.ads.n0;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Map;
import org.json.JSONObject;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.R;
import sg.bigo.ads.l0.AbstractC5291b;
import sg.bigo.ads.m0.AbstractC5348a;

/* loaded from: classes3.dex */
public final class d extends AbstractC5416a {
    public d(sg.bigo.ads.O.e eVar, Map map, Context context, e eVar2) {
        super(eVar, map, context, eVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    @Override // sg.bigo.ads.n0.AbstractC5416a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View b() {
        JSONObject jSONObject;
        String string;
        View a2 = AbstractC4944a.a(this.g, AbstractC5348a.a(2), null, false);
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
        EditText editText = (EditText) this.h.findViewById(R.id.inter_form_edit_content);
        String str2 = this.e;
        Map map = this.b;
        if (map != null) {
            try {
                jSONObject = (JSONObject) map.get("form_qa");
            } catch (Exception unused) {
            }
            if (jSONObject != null) {
                string = jSONObject.getString(str2);
                if (editText != null) {
                    editText.setTextColor(AbstractC5348a.f13109a ? -2431246 : -14275021);
                    editText.setHint(AbstractC5291b.a(this.g, R.string.bigo_ad_form_question_hint));
                    if (!I.a((CharSequence) string)) {
                        e eVar = this.i;
                        if (eVar != null) {
                            eVar.a(this.f13199a.d, string);
                        }
                        this.c = string;
                        editText.setText(string);
                    }
                    editText.addTextChangedListener(new C5417b(this, editText));
                    editText.setOnFocusChangeListener(new c(this));
                }
                return this.h;
            }
        }
        string = "";
        if (editText != null) {
        }
        return this.h;
    }
}
