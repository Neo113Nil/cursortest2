package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: p.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1520g {

    /* renamed from: a, reason: collision with root package name */
    public final c.d f15641a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f15642b;

    public AbstractC1520g(c.d dVar, ComponentName componentName) {
        this.f15641a = dVar;
        this.f15642b = componentName;
    }

    public static boolean a(Context context, String str, AbstractServiceConnectionC1527n abstractServiceConnectionC1527n) {
        abstractServiceConnectionC1527n.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC1527n, 33);
    }

    public static String b(Context context, List list, boolean z4) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z4 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final C1530q c(AbstractC1514a abstractC1514a) {
        BinderC1519f binderC1519f = new BinderC1519f(abstractC1514a);
        c.d dVar = this.f15641a;
        try {
            if (((c.b) dVar).u0(binderC1519f)) {
                return new C1530q(dVar, binderC1519f, this.f15642b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
