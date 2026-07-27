package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ҭ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public class C0536 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1203 = StringFog.decrypt("GXOwxcLYpfghRYTB1tG/+B9yj9XR1bjjKg==\n", "WBfhsKO0zIw=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public final long f1204;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0439 f1205;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f1206;

    public C0536(Context context, C0439 c0439, long j) {
        this.f1206 = context;
        this.f1205 = c0439;
        this.f1204 = j;
        new C0806(context);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public JSONObject mo5493(JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject m5606 = AbstractC0647.m5606(jSONObject, false);
        if (!TextUtils.isEmpty(this.f1205.f604)) {
            m5606.put(StringFog.decrypt("fTQobkef\n", "HERYJSLmNAg=\n"), this.f1205.f604);
        } else if (!TextUtils.isEmpty(this.f1205.f603)) {
            m5606.put(StringFog.decrypt("3cDv\n", "uomL99giwhI=\n"), this.f1205.f603);
        }
        String str3 = this.f1205.f600;
        if (!TextUtils.isEmpty(str3)) {
            m5606.put(StringFog.decrypt("vy+6Qg==\n", "1lzIIZgvX1k=\n"), str3);
        }
        if (z2) {
            if (this.f1204 > 0) {
                m5606.put(StringFog.decrypt("NM2aSg==\n", "WK7uOVMPBWE=\n"), this.f1204);
            }
            m5606.put(StringFog.decrypt("+3UUPTI=\n", "mBpkTVN86m4=\n"), this.f1205.f599);
            m5606.put(StringFog.decrypt("FqLv\n", "csubDh26sN4=\n"), this.f1205.f598);
            String decrypt = StringFog.decrypt("976/\n", "gtfbInmOfyg=\n");
            C0439 c0439 = this.f1205;
            synchronized (c0439) {
                str = c0439.f602;
            }
            m5606.put(decrypt, str);
            m5606.put(StringFog.decrypt("0fM=\n", "pJBRrIfQEmo=\n"), this.f1205.f601);
            m5606.put(StringFog.decrypt("ArA=\n", "dsq+WJiy0ug=\n"), Calendar.getInstance().getTimeZone().getRawOffset() / 3600000.0d);
            m5606.put(StringFog.decrypt("/0ictdg=\n", "izjK0KqOgJ4=\n"), IronSourceAdQuality.getSDKVersion());
            String decrypt2 = StringFog.decrypt("8Q==\n", "hZoJBFADqXQ=\n");
            String str4 = AbstractC0722.f1996;
            try {
                try {
                    Class.forName(StringFog.decrypt("+ZjtnuaUDtXjxOSe45YG2P+FruX9kxPYypvhyfaI\n", "mveAsJP6Z6E=\n"));
                    str2 = AbstractC0722.f1990;
                } catch (ClassNotFoundException unused) {
                    Class.forName(StringFog.decrypt("1orJwYN5ySDGitGdiW6IL9GU0Y6GYtI3xoHPwZlvzWDUjNbBuWTJI9mE8J2LaMMs1IbPqpJ/wyDG\njMuB\n", "teWk7+oLpk4=\n"));
                    str2 = AbstractC0722.f1989;
                }
            } catch (ClassNotFoundException unused2) {
                str2 = AbstractC0722.f1988;
            }
            m5606.put(decrypt2, str2);
            m5606.put(StringFog.decrypt("PdRtz58=\n", "ULsJqvONxho=\n"), Build.MODEL);
            m5606.put(StringFog.decrypt("KQR92hVmJroxF3bd\n", "RGUTr3MHRc4=\n"), Build.MANUFACTURER);
            m5606.put(StringFog.decrypt("MT9GnKWtl50=\n", "QVMn6MPC5fA=\n"), StringFog.decrypt("fSFHCbgd9w==\n", "HE8je9d0k08=\n"));
            String decrypt3 = StringFog.decrypt("SgTs\n", "JXeaM05ItxE=\n");
            String str5 = AbstractC0540.f1235;
            m5606.put(decrypt3, Build.VERSION.RELEASE);
            AbstractC0722.m5640(this.f1206, m5606);
            Context context = this.f1206;
            try {
                if (context.checkCallingOrSelfPermission(StringFog.decrypt("jnR4vEXy+3+ff26jQ+jsOIB0Mo9p2NoCvEVLh2zSwAK7W0iL\n", "7xocziqbn1E=\n")) == 0) {
                    WifiInfo connectionInfo = ((WifiManager) context.getSystemService(StringFog.decrypt("I9PC6A==\n", "VLqkgeD+ufE=\n"))).getConnectionInfo();
                    m5606.put(AbstractC0540.f1225, connectionInfo.getSupplicantState());
                    if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                        m5606.put(AbstractC0540.f1224, connectionInfo.getRssi());
                        m5606.put(AbstractC0540.f1223, connectionInfo.getLinkSpeed());
                    }
                }
            } catch (Throwable th) {
                String str6 = AbstractC0540.f1235;
                AbstractC0544.m5511(str6, str6, StringFog.decrypt("JCRlG38wHfEFP3kTLWcV8wh2fhprf1zhDnZyAmh+CA==\n", "YVYXdA0QfJU=\n"), th, null, false);
            }
            Context context2 = this.f1206;
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService(StringFog.decrypt("Ne6vJck1nAYg6LUy\n", "VoHBS6xW6G8=\n"));
                TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService(StringFog.decrypt("E/bPRHI=\n", "Y56gKhdECEU=\n"));
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
                if (networkInfo != null) {
                    m5606.put(AbstractC0540.f1222, networkInfo.getState());
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                        m5606.put(AbstractC0540.f1221, networkInfo.getType());
                        m5606.put(AbstractC0540.f1220, networkInfo.getTypeName());
                        m5606.put(AbstractC0540.f1219, networkInfo.getSubtype());
                        m5606.put(AbstractC0540.f1218, networkInfo.getSubtypeName());
                        m5606.put(AbstractC0540.f1217, telephonyManager.getNetworkOperator());
                        m5606.put(AbstractC0540.f1216, telephonyManager.getNetworkOperatorName());
                        m5606.put(AbstractC0540.f1215, telephonyManager.getNetworkCountryIso());
                        if (z3) {
                            m5606.put(AbstractC0540.f1214, telephonyManager.getSimOperator());
                            m5606.put(AbstractC0540.f1213, telephonyManager.getSimOperatorName());
                        }
                    }
                }
            } catch (Throwable th2) {
                String str7 = AbstractC0540.f1235;
                AbstractC0544.m5511(str7, str7, StringFog.decrypt("NiZhtiZ/i+kXPX2+dDKF7xo4dvk9MYziUyB8+TEpj+MH\n", "c1QT2VRf6o0=\n"), th2, null, false);
            }
            AbstractC0540.m5501(m5606);
            AbstractC0540.m5495(m5606);
            m5606.put(StringFog.decrypt("cBUISA==\n", "HmJpPn8UmmQ=\n"), z);
            AbstractC0540.m5500(this.f1206, m5606);
            try {
                m5606.put(AbstractC0540.f1226, AbstractC0647.m5606(AbstractC0540.m5496(), false));
            } catch (JSONException unused3) {
            }
            try {
                JSONObject jSONObject2 = new JSONObject(this.f1205.f597);
                jSONObject2.remove(StringFog.decrypt("g56NZhYGrMe9mJBWHQ==\n", "4vr8OX9oxbM=\n"));
                jSONObject2.remove(StringFog.decrypt("Vg0MFPQKqpZQBQcJ9A2gjkYC\n", "I2xoZ6t5z+U=\n"));
                if (jSONObject2.length() > 0) {
                    m5606.putOpt(StringFog.decrypt("HBxGpg==\n", "cWgi0ilflVE=\n"), jSONObject2);
                }
            } catch (Exception e) {
                String str8 = f1203;
                AbstractC0544.m5511(str8, str8, StringFog.decrypt("adzkCHyBS9tIx/gALsxPy02O8gZ6wArVX8H4R3rOCtpay/gT\n", "LK6WZw6hKr8=\n"), e, null, false);
            }
        }
        return m5606;
    }
}
