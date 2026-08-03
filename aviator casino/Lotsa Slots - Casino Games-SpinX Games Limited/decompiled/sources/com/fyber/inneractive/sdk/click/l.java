package com.fyber.inneractive.sdk.click;

/* loaded from: classes3.dex */
public final class l extends com.fyber.inneractive.sdk.click.a {
    public static final com.fyber.inneractive.sdk.click.k b = new com.fyber.inneractive.sdk.click.k();

    /* renamed from: a, reason: collision with root package name */
    public boolean f3578a = false;

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(android.net.Uri uri, com.fyber.inneractive.sdk.click.r rVar) {
        return !this.f3578a;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final com.fyber.inneractive.sdk.click.b a(android.content.Context context, android.net.Uri uri, java.util.List list) {
        android.content.Intent intent;
        android.content.pm.ResolveInfo resolveInfo;
        if (this.f3578a) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT > 29) {
            java.lang.String scheme = uri.getScheme();
            if (!androidx.webkit.ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                if (this.f3578a) {
                    return null;
                }
                android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", uri);
                if (!(context instanceof android.app.Activity)) {
                    intent2.setFlags(268435456);
                }
                return a(context, intent2, uri, list);
            }
        }
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new android.content.Intent("android.intent.action.VIEW", uri), 32);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return null;
        }
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://www.fyber.com")), 32);
        java.util.TreeSet treeSet = new java.util.TreeSet(b);
        treeSet.addAll(queryIntentActivities2);
        queryIntentActivities.removeAll(treeSet);
        if (queryIntentActivities.size() <= 0 || (resolveInfo = queryIntentActivities.get(0)) == null) {
            intent = null;
        } else {
            intent = new android.content.Intent("android.intent.action.VIEW", uri);
            android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent.setClassName(activityInfo.packageName, activityInfo.name);
            if (!(context instanceof android.app.Activity)) {
                intent.setFlags(268435456);
            }
        }
        if (intent == null || this.f3578a) {
            return null;
        }
        return a(context, intent, uri, list);
    }

    public final com.fyber.inneractive.sdk.click.b a(android.content.Context context, android.content.Intent intent, android.net.Uri uri, java.util.List list) {
        if (this.f3578a) {
            return com.fyber.inneractive.sdk.click.r.a(uri.toString(), "Resolver", "The process was cancelled");
        }
        try {
            context.startActivity(intent);
            if (list != null) {
                list.add(new com.fyber.inneractive.sdk.click.j(uri.toString(), true, com.fyber.inneractive.sdk.click.a.a(intent.getData(), com.fyber.inneractive.sdk.click.q.OPEN_IN_EXTERNAL_APPLICATION), null));
            }
            return new com.fyber.inneractive.sdk.click.b(uri.toString(), com.fyber.inneractive.sdk.click.a.a(intent.getData(), com.fyber.inneractive.sdk.click.q.OPEN_IN_EXTERNAL_APPLICATION), "Resolver", null);
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed starting activity with error: %s", th.getLocalizedMessage());
            if (list != null) {
                list.add(new com.fyber.inneractive.sdk.click.j(uri.toString(), false, com.fyber.inneractive.sdk.click.q.OPEN_IN_EXTERNAL_APPLICATION, null));
            }
            return com.fyber.inneractive.sdk.click.r.a(uri.toString(), "Resolver", "failed starting resolved activity - " + th.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void a() {
        this.f3578a = true;
    }
}
