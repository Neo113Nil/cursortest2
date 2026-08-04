package com.pichillilorenzo.flutter_inappwebview_android;

import A5.o;
import A5.r;
import A5.s;
import android.os.Build;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.sentry.protocol.Device;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class PlatformUtil extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "PlatformUtil";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_platformutil";
    public InAppWebViewFlutterPlugin plugin;

    public PlatformUtil(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new s(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static String formatDate(long j, String str, Locale locale, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(new Date(j));
    }

    public static Locale getLocaleFromString(String str) {
        if (str == null) {
            return Locale.US;
        }
        String[] strArrSplit = str.split("_");
        return new Locale(strArrSplit[0], strArrSplit.length > 1 ? strArrSplit[1] : "", strArrSplit.length > 2 ? strArrSplit[2] : "");
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) {
        String str = oVar.f676a;
        str.getClass();
        if (!str.equals("formatDate")) {
            if (str.equals("getSystemVersion")) {
                rVar.success(String.valueOf(Build.VERSION.SDK_INT));
                return;
            } else {
                rVar.notImplemented();
                return;
            }
        }
        long jLongValue = ((Long) oVar.a("date")).longValue();
        String str2 = (String) oVar.a("format");
        Locale localeFromString = getLocaleFromString((String) oVar.a(Device.JsonKeys.LOCALE));
        String str3 = (String) oVar.a("timezone");
        if (str3 == null) {
            str3 = "UTC";
        }
        rVar.success(formatDate(jLongValue, str2, localeFromString, TimeZone.getTimeZone(str3)));
    }
}
