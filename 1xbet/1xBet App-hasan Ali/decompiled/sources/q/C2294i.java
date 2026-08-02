package q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import b.C0497b;
import b.InterfaceC0499d;
import java.util.ArrayList;

/* renamed from: q.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2294i {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0499d f18851a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f18852b;

    public C2294i(InterfaceC0499d interfaceC0499d, ComponentName componentName) {
        this.f18851a = interfaceC0499d;
        this.f18852b = componentName;
    }

    public static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) obj;
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final m2.g b(AbstractC2286a abstractC2286a) {
        BinderC2290e binderC2290e = new BinderC2290e(abstractC2286a);
        InterfaceC0499d interfaceC0499d = this.f18851a;
        try {
            if (((C0497b) interfaceC0499d).L(binderC2290e)) {
                return new m2.g(interfaceC0499d, binderC2290e, this.f18852b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
