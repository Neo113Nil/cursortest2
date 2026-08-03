package com.fyber.inneractive.sdk.click;

/* loaded from: classes3.dex */
public final class d extends com.fyber.inneractive.sdk.click.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3572a = false;

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(android.net.Uri uri, com.fyber.inneractive.sdk.click.r rVar) {
        return "smartlink".equalsIgnoreCase(uri.getScheme()) && !this.f3572a;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final com.fyber.inneractive.sdk.click.b a(android.content.Context context, android.net.Uri uri, java.util.List list) {
        android.net.Uri uri2;
        android.net.Uri uri3;
        android.net.Uri uri4;
        if (!a(uri, (com.fyber.inneractive.sdk.click.r) null)) {
            return null;
        }
        java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue();
        java.lang.String queryParameter = uri.getQueryParameter("primaryUrl");
        java.util.List<java.lang.String> queryParameters = uri.getQueryParameters("primaryTrackingUrl");
        com.fyber.inneractive.sdk.util.k1 k1Var = com.fyber.inneractive.sdk.util.k1.Primary;
        try {
            uri2 = android.net.Uri.parse(queryParameter);
        } catch (java.lang.Exception unused) {
            uri2 = null;
        }
        if (uri2 != null) {
            priorityQueue.offer(new com.fyber.inneractive.sdk.util.l1(k1Var, uri2, queryParameters));
        }
        java.lang.String queryParameter2 = uri.getQueryParameter("fallbackUrl");
        java.util.List<java.lang.String> queryParameters2 = uri.getQueryParameters("fallbackTrackingUrl");
        com.fyber.inneractive.sdk.util.k1 k1Var2 = com.fyber.inneractive.sdk.util.k1.FallBack;
        try {
            uri3 = android.net.Uri.parse(queryParameter2);
        } catch (java.lang.Exception unused2) {
            uri3 = null;
        }
        if (uri3 != null) {
            priorityQueue.offer(new com.fyber.inneractive.sdk.util.l1(k1Var2, uri3, queryParameters2));
        }
        if (priorityQueue.size() <= 0) {
            java.lang.String uri5 = uri.toString();
            com.fyber.inneractive.sdk.click.q qVar = com.fyber.inneractive.sdk.click.q.DEEP_LINK;
            if (list != null) {
                list.add(new com.fyber.inneractive.sdk.click.j(uri5, false, qVar, null));
            }
            return com.fyber.inneractive.sdk.click.r.a(uri.toString(), "FyberDeepLink", "fyberDeepLink is not valid");
        }
        while (true) {
            com.fyber.inneractive.sdk.util.l1 l1Var = (com.fyber.inneractive.sdk.util.l1) priorityQueue.poll();
            if (l1Var == null) {
                uri4 = null;
                break;
            }
            uri4 = l1Var.b;
            java.lang.String scheme = uri4.getScheme();
            com.fyber.inneractive.sdk.click.q a2 = com.fyber.inneractive.sdk.click.a.a(uri4, (android.text.TextUtils.isEmpty(scheme) || !scheme.toLowerCase(java.util.Locale.US).startsWith(androidx.webkit.ProxyConfig.MATCH_HTTP)) ? com.fyber.inneractive.sdk.click.q.OPEN_IN_EXTERNAL_APPLICATION : com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER);
            boolean a3 = com.fyber.inneractive.sdk.util.h0.a(context, new android.content.Intent("android.intent.action.VIEW", uri4));
            java.lang.String uri6 = uri4.toString();
            if (list != null) {
                list.add(new com.fyber.inneractive.sdk.click.j(uri6, a3, a2, null));
            }
            if (a3) {
                for (java.lang.String str : l1Var.c) {
                    if (!android.text.TextUtils.isEmpty(str)) {
                        com.fyber.inneractive.sdk.util.IAlog.d("%s %s", "SMART_LINK", str);
                        com.fyber.inneractive.sdk.network.z0.b(str);
                    }
                }
            }
            if (!a3) {
                uri4 = null;
            }
            if (uri4 != null) {
                break;
            }
        }
        return uri4 != null ? new com.fyber.inneractive.sdk.click.b(uri.toString(), com.fyber.inneractive.sdk.click.a.a(uri4, com.fyber.inneractive.sdk.click.q.OPEN_IN_EXTERNAL_APPLICATION), "FyberDeepLink", null) : com.fyber.inneractive.sdk.click.r.a(uri.toString(), "FyberDeepLink", "tryHandleDeepLinkWithExternalApp has failed");
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void a() {
        this.f3572a = true;
    }
}
