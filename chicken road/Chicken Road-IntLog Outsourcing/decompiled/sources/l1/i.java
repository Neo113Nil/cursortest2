package l1;

import android.content.Context;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f11013a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f11014b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11015c = 0;

    public static boolean a(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
