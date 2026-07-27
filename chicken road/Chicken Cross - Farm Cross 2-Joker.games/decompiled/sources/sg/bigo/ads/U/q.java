package sg.bigo.ads.U;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static String f12566a = "";

    public static String a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("file://");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder append = new StringBuilder().append(a(context));
        String str2 = File.separator;
        return sb.append(p.a(append, str2, "video", sb2, str2).append("thumb").toString()).append(str2).append(str).toString();
    }

    public static String a(Context context) {
        String a2;
        if (AbstractC5446j.e() && !I.a((CharSequence) f12566a)) {
            return f12566a;
        }
        if (I.a((CharSequence) f12566a)) {
            if (context == null) {
                a2 = "";
            } else {
                a2 = o.a(new StringBuilder().append(context.getFilesDir()), File.separator, "sg_bigo_ad");
            }
            f12566a = a2;
        }
        File file = new File(f12566a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return f12566a;
    }

    public static boolean a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !"package.zip".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder append = new StringBuilder().append(a(context));
        String str3 = File.separator;
        return str.startsWith(sb.append(append.append(str3).append("playable_zip").toString()).append(str3).toString());
    }
}
