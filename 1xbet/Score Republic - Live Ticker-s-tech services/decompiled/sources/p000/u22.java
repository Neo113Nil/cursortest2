package p000;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u22 {

    /* JADX INFO: renamed from: a */
    public static final C0089c8 f7657a = new C0089c8(0);

    /* JADX INFO: renamed from: a */
    public static synchronized Uri m4868a() {
        C0089c8 c0089c8 = f7657a;
        Uri uri = (Uri) c0089c8.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c0089c8.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }

    /* JADX INFO: renamed from: b */
    public static String m4869b(Context context, String str) {
        if (str.contains("#")) {
            C0270h1.m2190f("The passed in package cannot already have a subpackage: ".concat(str));
            return null;
        }
        String packageName = context.getPackageName();
        return AbstractC0024an.m286i(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
    }
}
