package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class l extends a {
    public static final k b = new k();

    /* renamed from: a, reason: collision with root package name */
    public boolean f5229a = false;

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        return !this.f5229a;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final b a(Context context, Uri uri, List list) {
        Intent intent;
        ResolveInfo resolveInfo;
        if (this.f5229a) {
            return null;
        }
        if (Build.VERSION.SDK_INT > 29) {
            String scheme = uri.getScheme();
            if (!ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                if (this.f5229a) {
                    return null;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW", uri);
                if (!(context instanceof Activity)) {
                    intent2.setFlags(268435456);
                }
                return a(context, intent2, uri, list);
            }
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 32);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.fyber.com")), 32);
        TreeSet treeSet = new TreeSet(b);
        treeSet.addAll(queryIntentActivities2);
        queryIntentActivities.removeAll(treeSet);
        if (queryIntentActivities.size() <= 0 || (resolveInfo = queryIntentActivities.get(0)) == null) {
            intent = null;
        } else {
            intent = new Intent("android.intent.action.VIEW", uri);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent.setClassName(activityInfo.packageName, activityInfo.name);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
        }
        if (intent == null || this.f5229a) {
            return null;
        }
        return a(context, intent, uri, list);
    }

    public final b a(Context context, Intent intent, Uri uri, List list) {
        if (this.f5229a) {
            return r.a(uri.toString(), "Resolver", "The process was cancelled");
        }
        try {
            context.startActivity(intent);
            if (list != null) {
                list.add(new j(uri.toString(), true, a.a(intent.getData(), q.OPEN_IN_EXTERNAL_APPLICATION), null));
            }
            return new b(uri.toString(), a.a(intent.getData(), q.OPEN_IN_EXTERNAL_APPLICATION), "Resolver", null);
        } catch (Throwable th) {
            IAlog.a("failed starting activity with error: %s", th.getLocalizedMessage());
            if (list != null) {
                list.add(new j(uri.toString(), false, q.OPEN_IN_EXTERNAL_APPLICATION, null));
            }
            return r.a(uri.toString(), "Resolver", "failed starting resolved activity - " + th.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void a() {
        this.f5229a = true;
    }
}
