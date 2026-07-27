package sg.bigo.ads.A0;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.URL;

/* loaded from: classes3.dex */
public abstract class b {
    public static a a(int i, String str, String str2, URL url, URL url2) {
        URL url3;
        if (i == 307 || i == 308) {
            return (str2.equalsIgnoreCase("GET") || str2.equalsIgnoreCase("HEAD")) ? new a(null, str, 0, "", i) : new a(null, str, IronSourceError.ERROR_NT_LOAD_NO_FILL, "redirect code(" + i + ") is only available for GET or HEAD method, current request method is " + str2, i);
        }
        switch (i) {
            case 300:
            case MRAID_ERROR_VALUE:
            case INVALID_IFA_STATUS_VALUE:
            case 303:
                if (TextUtils.isEmpty(str)) {
                    return new a(null, str, IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT, "empty location.", i);
                }
                try {
                    url3 = new URL(url, str);
                } catch (Exception unused) {
                    url3 = null;
                }
                if (url3 == null) {
                    return new a(null, str, IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, "location->\"" + str + "\" is not a network url.", i);
                }
                String url4 = url3.toString();
                return (url == null || !TextUtils.equals(url4, url.toString())) ? (url2 == null || !TextUtils.equals(url4, url2.toString())) ? new a(url3, str, 0, "", i) : new a(url3, str, IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED, "redirect to origin url, location is " + str + ", redirectURL is " + url4, i) : new a(url3, str, IronSourceError.ERROR_NT_LOAD_EXCEPTION, "redirect to the same url, location is " + str + ", redirectURL is " + url4, i);
            default:
                return null;
        }
    }
}
