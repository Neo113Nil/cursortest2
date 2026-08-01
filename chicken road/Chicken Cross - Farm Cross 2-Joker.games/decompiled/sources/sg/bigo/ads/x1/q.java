package sg.bigo.ads.x1;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.L6;
import com.mbridge.msdk.MBridgeConstans;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.K0.O;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f13401a;
    public final String b;
    public final String c;
    public final String d;
    public final String[] e;
    public final String[] f;
    public String g;
    public final int h;
    public final int i;
    public final int j;
    public boolean k;
    public final HashMap l = new HashMap();
    public final JSONObject m;
    public final sg.bigo.ads.U.h n;

    public q(JSONObject jSONObject, sg.bigo.ads.U.h hVar) {
        this.n = hVar;
        this.m = jSONObject;
        this.f13401a = jSONObject.optInt("type", 0);
        this.b = jSONObject.optString("value", "");
        this.c = jSONObject.optString("name", "");
        this.d = jSONObject.optString("uuid", "");
        this.h = jSONObject.optInt("expired");
        this.i = jSONObject.optInt("replace", 0);
        this.j = jSONObject.optInt("norepeat", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("reg");
        if (optJSONArray != null) {
            this.e = new String[optJSONArray.length()];
            this.f = new String[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (optJSONArray.optJSONObject(i) != null) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    this.e[i] = optJSONObject.optString("token", "");
                    this.f[i] = optJSONObject.optString("value", "");
                }
            }
        }
        this.g = jSONObject.optString("real_url");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [sg.bigo.ads.V0.h] */
    public final sg.bigo.ads.w1.a a() {
        if (TextUtils.isEmpty(this.g)) {
            c();
        }
        sg.bigo.ads.U.l lVar = null;
        lVar = null;
        lVar = null;
        if (b() && this.i == 1) {
            sg.bigo.ads.V0.i iVar = p.h.d;
            if (iVar != null) {
                String str = this.g;
                sg.bigo.ads.Q0.n nVar = iVar.f12589a;
                lVar = new sg.bigo.ads.V0.h(str, nVar != null ? nVar.f12510a.l.i : null);
            } else {
                AbstractC5496a.a("ThirdTrack", "replaceHost handle is null, replace failed");
            }
        }
        if (lVar == null) {
            lVar = new sg.bigo.ads.U.l(this.g);
        }
        return new sg.bigo.ads.w1.a(lVar);
    }

    public final boolean b() {
        return this.f13401a == 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void c() {
        char c;
        String str;
        long b;
        int i;
        sg.bigo.ads.X0.u uVar;
        String str2 = "";
        if (!TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.c)) {
            String trim = this.b.trim();
            if (this.e != null && this.f != null && this.n != null) {
                for (int i2 = 0; i2 < this.e.length; i2++) {
                    String str3 = this.f[i2];
                    switch (str3.hashCode()) {
                        case -2138759690:
                            if (str3.equals("regist_time")) {
                                c = '1';
                                break;
                            }
                            c = 65535;
                            break;
                        case -2076227591:
                            if (str3.equals("timezone")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1795462070:
                            if (str3.equals("express_id")) {
                                c = '!';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1600030548:
                            if (str3.equals("resolution")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1273393189:
                            if (str3.equals("sec_price")) {
                                c = Typography.dollar;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1229750878:
                            if (str3.equals("sec_bidder")) {
                                c = '%';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1182905495:
                            if (str3.equals("os_lang")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1174888717:
                            if (str3.equals("gps_adid")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1029004888:
                            if (str3.equals("ad_imp_indx")) {
                                c = GMTDateParser.ANY;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1007979832:
                            if (str3.equals("os_ver")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case -986522696:
                            if (str3.equals("pkg_ch")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -986522112:
                            if (str3.equals("pkg_vc")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -934795532:
                            if (str3.equals("region")) {
                                c = '0';
                                break;
                            }
                            c = 65535;
                            break;
                        case -906980142:
                            if (str3.equals("sdk_vc")) {
                                c = 23;
                                break;
                            }
                            c = 65535;
                            break;
                        case -820075192:
                            if (str3.equals("vendor")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case -793620671:
                            if (str3.equals(MBridgeConstans.APP_KEY)) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -777008198:
                            if (str3.equals("click_prop")) {
                                c = ' ';
                                break;
                            }
                            c = 65535;
                            break;
                        case -693230854:
                            if (str3.equals("first_price")) {
                                c = Typography.amp;
                                break;
                            }
                            c = 65535;
                            break;
                        case -613897138:
                            if (str3.equals("support_om")) {
                                c = 30;
                                break;
                            }
                            c = 65535;
                            break;
                        case -517414224:
                            if (str3.equals("pkg_ver")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -424587677:
                            if (str3.equals("first_bidder")) {
                                c = '\'';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3556:
                            if (str3.equals(L6.F)) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 99677:
                            if (str3.equals("dpi")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case 104582:
                            if (str3.equals("isp")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case 106905:
                            if (str3.equals("lan")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case 106911:
                            if (str3.equals(L6.s)) {
                                c = 27;
                                break;
                            }
                            c = 65535;
                            break;
                        case 107301:
                            if (str3.equals("lng")) {
                                c = 28;
                                break;
                            }
                            c = 65535;
                            break;
                        case 107855:
                            if (str3.equals("mac")) {
                                c = '.';
                                break;
                            }
                            c = 65535;
                            break;
                        case 108957:
                            if (str3.equals("net")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case 115792:
                            if (str3.equals("uid")) {
                                c = '3';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3053931:
                            if (str3.equals("city")) {
                                c = 26;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3165045:
                            if (str3.equals(L6.X0)) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3184265:
                            if (str3.equals("guid")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3197719:
                            if (str3.equals("hdid")) {
                                c = FileSystemKt.UnixPathSeparator;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3236040:
                            if (str3.equals("imei")) {
                                c = AbstractJsonLexerKt.COMMA;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3236474:
                            if (str3.equals("imsi")) {
                                c = '-';
                                break;
                            }
                            c = 65535;
                            break;
                        case 25209764:
                            if (str3.equals("device_id")) {
                                c = '4';
                                break;
                            }
                            c = 65535;
                            break;
                        case 55126294:
                            if (str3.equals("timestamp")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 92714869:
                            if (str3.equals("af_id")) {
                                c = 29;
                                break;
                            }
                            c = 65535;
                            break;
                        case 104069929:
                            if (str3.equals("model")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109757585:
                            if (str3.equals("state")) {
                                c = 25;
                                break;
                            }
                            c = 65535;
                            break;
                        case 440309782:
                            if (str3.equals("advertising_id")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 530453763:
                            if (str3.equals("click_module")) {
                                c = '#';
                                break;
                            }
                            c = 65535;
                            break;
                        case 702731954:
                            if (str3.equals("click_source")) {
                                c = '\"';
                                break;
                            }
                            c = 65535;
                            break;
                        case 957831062:
                            if (str3.equals("country")) {
                                c = 24;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1139786014:
                            if (str3.equals("pkg_name")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1139954915:
                            if (str3.equals("pkg_sver")) {
                                c = '+';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1505024451:
                            if (str3.equals("local_timestamp_ms")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1583758243:
                            if (str3.equals(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE)) {
                                c = 31;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1793985248:
                            if (str3.equals("loss_reason")) {
                                c = '(';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1845546289:
                            if (str3.equals("new_uid")) {
                                c = '2';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1939141228:
                            if (str3.equals("ad_click_indx")) {
                                c = ')';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1948386846:
                            if (str3.equals("sdk_ver")) {
                                c = 22;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            b = O.b();
                            str = String.valueOf(b);
                            break;
                        case 1:
                            b = System.currentTimeMillis();
                            str = String.valueOf(b);
                            break;
                        case 2:
                            str = ((sg.bigo.ads.X0.u) this.n).c.w;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            str = ((sg.bigo.ads.X0.u) this.n).h();
                            break;
                        case 6:
                            str = ((sg.bigo.ads.X0.u) this.n).f12615a.getAppKey();
                            break;
                        case 7:
                            str = ((sg.bigo.ads.X0.u) this.n).d;
                            break;
                        case '\b':
                            str = String.valueOf(((sg.bigo.ads.X0.u) this.n).e);
                            break;
                        case '\t':
                            i = ((sg.bigo.ads.X0.u) this.n).f;
                            str = String.valueOf(i);
                            break;
                        case '\n':
                            str = ((sg.bigo.ads.X0.u) this.n).f12615a.getChannel();
                            break;
                        case 11:
                            this.n.getClass();
                            str = "android";
                            break;
                        case '\f':
                            ((sg.bigo.ads.X0.u) this.n).getClass();
                            str = Build.VERSION.RELEASE;
                            break;
                        case '\r':
                            uVar = (sg.bigo.ads.X0.u) this.n;
                            str = uVar.g;
                            break;
                        case 14:
                            str = ((sg.bigo.ads.X0.u) this.n).h;
                            break;
                        case 15:
                            str = ((sg.bigo.ads.X0.u) this.n).i;
                            break;
                        case 16:
                            str = ((sg.bigo.ads.X0.u) this.n).j;
                            break;
                        case 17:
                            str = ((sg.bigo.ads.X0.u) this.n).k;
                            break;
                        case 18:
                            i = ((sg.bigo.ads.X0.u) this.n).l;
                            str = String.valueOf(i);
                            break;
                        case 19:
                            uVar = (sg.bigo.ads.X0.u) this.n;
                            str = uVar.g;
                            break;
                        case 20:
                            str = ((sg.bigo.ads.X0.u) this.n).i();
                            break;
                        case 21:
                            str = ((sg.bigo.ads.X0.u) this.n).j();
                            break;
                        case 22:
                            this.n.getClass();
                            str = "5.10.1";
                            break;
                        case 23:
                            this.n.getClass();
                            str = String.valueOf(51001);
                            break;
                        case 24:
                            sg.bigo.ads.X0.u uVar2 = (sg.bigo.ads.X0.u) this.n;
                            String str4 = uVar2.c.q;
                            if (TextUtils.isEmpty(str4)) {
                                str = uVar2.e();
                                break;
                            } else {
                                str = str4;
                                break;
                            }
                        case 25:
                        case 26:
                            this.n.getClass();
                            str = "";
                            break;
                        case 27:
                        case 28:
                            this.n.getClass();
                            str = String.valueOf(0);
                            break;
                        case 29:
                            str = ((sg.bigo.ads.X0.u) this.n).c();
                            break;
                        case 30:
                            str = "1";
                            break;
                        case 31:
                        case ' ':
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                            if (this.l.containsKey(str3)) {
                                str = (String) this.l.get(str3);
                                break;
                            }
                            str = "";
                            break;
                        default:
                            str = "";
                            break;
                    }
                    String str5 = this.e[i2];
                    if (str == null) {
                        str = "";
                    }
                    trim = trim.replace(str5, str);
                }
            }
            str2 = trim;
            sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
            if (str2 != null && gVar != null && gVar.B.a(8)) {
                try {
                    String replace = str2.replace("{", "%7B");
                    try {
                        str2 = replace.replace("}", "%7D");
                    } catch (Exception unused) {
                        str2 = replace;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        this.g = str2;
        JSONObject jSONObject = this.m;
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("real_url", str2);
            } catch (JSONException unused3) {
            }
        }
    }

    public final String toString() {
        return "type=" + this.f13401a + ",name=" + this.c + ",url=" + this.g;
    }
}
