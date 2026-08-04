package O4;

import G.h;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f5005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A4.b f5006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5007d;

    public a(Context context, String str, A4.b bVar) {
        Context contextCreateDeviceProtectedStorageContext = h.createDeviceProtectedStorageContext(context);
        this.f5004a = contextCreateDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f5005b = sharedPreferences;
        this.f5006c = bVar;
        this.f5007d = sharedPreferences.contains("firebase_data_collection_default_enabled") ? sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true) : a();
    }

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context = this.f5004a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public final synchronized void b(boolean z4) {
        if (this.f5007d != z4) {
            this.f5007d = z4;
            this.f5006c.a(new A4.a(new Y3.b(0)));
        }
    }
}
