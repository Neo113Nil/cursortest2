package sg.bigo.ads.p0;

import android.content.SharedPreferences;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import sg.bigo.ads.K0.I;

/* renamed from: sg.bigo.ads.p0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC5428b implements SharedPreferences.OnSharedPreferenceChangeListener {
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (I.a((CharSequence) str)) {
            return;
        }
        str.getClass();
        str.hashCode();
        switch (str) {
            case "IABTCF_PurposeConsents":
                if (sharedPreferences != null) {
                    try {
                        AbstractC5429c.f13236a = sharedPreferences.getString("IABTCF_PurposeConsents", "");
                        break;
                    } catch (Exception unused) {
                        AbstractC5429c.f13236a = "";
                        break;
                    }
                }
                break;
            case "IABTCF_PurposeLegitimateInterests":
                if (sharedPreferences != null) {
                    try {
                        AbstractC5429c.c = sharedPreferences.getString("IABTCF_PurposeLegitimateInterests", "");
                        break;
                    } catch (Exception unused2) {
                        AbstractC5429c.c = "";
                        break;
                    }
                }
                break;
            case "IABTCF_gdprApplies":
                if (sharedPreferences != null && sharedPreferences.getAll() != null) {
                    Object obj = sharedPreferences.getAll().get("IABTCF_gdprApplies");
                    if (!(obj instanceof Integer)) {
                        if (obj instanceof String) {
                            try {
                                AbstractC5429c.b = Integer.parseInt((String) obj);
                                break;
                            } catch (Exception unused3) {
                                AbstractC5429c.b = 0;
                                break;
                            }
                        }
                    } else {
                        AbstractC5429c.b = ((Integer) obj).intValue();
                        break;
                    }
                }
                break;
            case "IABTCF_TCString":
                if (sharedPreferences != null) {
                    try {
                        AbstractC5429c.e = sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "");
                        break;
                    } catch (Exception unused4) {
                        AbstractC5429c.e = "";
                        break;
                    }
                }
                break;
            case "IABTCF_VendorConsents":
                if (sharedPreferences != null) {
                    try {
                        AbstractC5429c.d = sharedPreferences.getString("IABTCF_VendorConsents", "");
                        break;
                    } catch (Exception unused5) {
                        AbstractC5429c.d = "";
                        break;
                    }
                }
                break;
            default:
                return;
        }
        AbstractC5429c.f = true;
    }
}
