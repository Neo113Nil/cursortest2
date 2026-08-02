package u5;

import G4.C0282o;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: u5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1647a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16870a = C1649c.class.getName().concat(".aot-shared-library-name");

    /* renamed from: b, reason: collision with root package name */
    public static final String f16871b = C1649c.class.getName().concat(".vm-snapshot-data");

    /* renamed from: c, reason: collision with root package name */
    public static final String f16872c = C1649c.class.getName().concat(".isolate-snapshot-data");

    /* renamed from: d, reason: collision with root package name */
    public static final String f16873d = C1649c.class.getName().concat(".flutter-assets-dir");

    public static C0282o a(Context context) {
        int i7;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String str = null;
            String string = bundle == null ? null : bundle.getString(f16870a, null);
            Bundle bundle2 = applicationInfo.metaData;
            if (bundle2 != null) {
                bundle2.getString(f16871b, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            if (bundle3 != null) {
                bundle3.getString(f16872c, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String string2 = bundle4 == null ? null : bundle4.getString(f16873d, null);
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i7 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i7);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                b(xml, jSONArray, false);
                            }
                        }
                    }
                    str = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str2 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            boolean z4 = bundle6 != null ? bundle6.getBoolean("io.flutter.automatically-register-plugins", true) : true;
            C0282o c0282o = new C0282o();
            if (string == null) {
                string = "libapp.so";
            }
            c0282o.f3010b = string;
            if (string2 == null) {
                string2 = "flutter_assets";
            }
            c0282o.f3011c = string2;
            c0282o.f3013e = str2;
            if (str == null) {
                str = "";
            }
            c0282o.f3012d = str;
            c0282o.f3009a = z4;
            return c0282o;
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void b(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z4) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z4);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new IllegalStateException("Expected text");
                    }
                    String trim = xmlResourceParser.getText().trim();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new IllegalStateException("Expected end of domain tag");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    b(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }
}
