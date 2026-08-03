package com.fyber.inneractive.sdk.click;

/* loaded from: classes3.dex */
public final class h extends com.fyber.inneractive.sdk.click.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3575a = false;

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(android.net.Uri uri, com.fyber.inneractive.sdk.click.r rVar) {
        return "intent".equalsIgnoreCase(uri.getScheme()) && !this.f3575a;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final com.fyber.inneractive.sdk.click.b a(android.content.Context context, android.net.Uri uri, java.util.List list) {
        if (a(uri, (com.fyber.inneractive.sdk.click.r) null)) {
            try {
                android.content.Intent parseUri = android.content.Intent.parseUri(uri.toString(), 1);
                if (!this.f3575a && com.fyber.inneractive.sdk.util.h0.a(context, parseUri)) {
                    int i = com.fyber.inneractive.sdk.util.IAlog.f4283a;
                    com.fyber.inneractive.sdk.util.IAlog.d("%s %s", "DEEPLINK", uri.toString());
                    if (list != null) {
                        list.add(new com.fyber.inneractive.sdk.click.j(uri.toString(), true, com.fyber.inneractive.sdk.click.q.OPEN_IN_EXTERNAL_APPLICATION, null));
                    }
                    return new com.fyber.inneractive.sdk.click.b(uri.toString(), com.fyber.inneractive.sdk.click.a.a(uri, com.fyber.inneractive.sdk.click.q.OPEN_IN_EXTERNAL_APPLICATION), "IntentScheme", null);
                }
                java.lang.String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                if (this.f3575a || android.text.TextUtils.isEmpty(stringExtra)) {
                    if (list != null) {
                        list.add(new com.fyber.inneractive.sdk.click.j(uri.toString(), false, com.fyber.inneractive.sdk.click.q.OPEN_IN_EXTERNAL_APPLICATION, "tryToOpenExternalApp has failed (intent scheme)"));
                    }
                    return com.fyber.inneractive.sdk.click.r.a(uri.toString(), "IntentScheme", "tryToOpenExternalApp has failed (intent scheme)");
                }
                try {
                    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(stringExtra));
                    if (!(context instanceof android.app.Activity)) {
                        intent.setFlags(268435456);
                    }
                    context.startActivity(intent);
                    com.fyber.inneractive.sdk.util.IAlog.d("%s %s", "Intent opened successfully, url:", stringExtra);
                    if (list != null) {
                        list.add(new com.fyber.inneractive.sdk.click.j(uri.toString(), false, com.fyber.inneractive.sdk.click.q.DEEP_LINK, null));
                        list.add(new com.fyber.inneractive.sdk.click.j(stringExtra, true, com.fyber.inneractive.sdk.click.q.OPEN_IN_EXTERNAL_APPLICATION, null));
                    }
                    return new com.fyber.inneractive.sdk.click.b(uri.toString(), com.fyber.inneractive.sdk.click.a.a(uri, com.fyber.inneractive.sdk.click.q.OPEN_IN_EXTERNAL_APPLICATION), "IntentScheme", null);
                } catch (java.lang.Throwable unused) {
                    com.fyber.inneractive.sdk.util.IAlog.d("%s %s", "Intent failed, url:", stringExtra);
                }
            } catch (java.net.URISyntaxException e) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed parsing uri with error: %s", e.getLocalizedMessage());
                if (list != null) {
                    list.add(new com.fyber.inneractive.sdk.click.j(uri.toString(), false, com.fyber.inneractive.sdk.click.q.OPEN_IN_EXTERNAL_APPLICATION, null));
                }
                return new com.fyber.inneractive.sdk.click.b(uri.toString(), com.fyber.inneractive.sdk.click.q.FAILED, "IntentScheme", e);
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void a() {
        this.f3575a = true;
    }
}
