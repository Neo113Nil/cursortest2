package com.fyber.inneractive.sdk.click;

/* loaded from: classes3.dex */
public final class i extends com.fyber.inneractive.sdk.click.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3576a;
    public final boolean b;
    public boolean c = false;

    public i(boolean z, java.lang.String str) {
        this.f3576a = str;
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(android.net.Uri uri, com.fyber.inneractive.sdk.click.r rVar) {
        return !this.c && ("fybernativebrowser".equalsIgnoreCase(uri.getScheme()) || "fybernativebrowser".equalsIgnoreCase(this.f3576a) || this.b || uri.toString().contains("FYBER_OPEN_BROWSER"));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.click.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.click.b a(android.content.Context context, android.net.Uri uri, java.util.List list) {
        java.lang.String str;
        com.fyber.inneractive.sdk.util.d0 d0Var;
        java.lang.String uri2 = uri.toString();
        if (!android.text.TextUtils.isEmpty(uri2)) {
            android.net.Uri parse = android.net.Uri.parse(uri2);
            java.lang.String scheme = parse.getScheme();
            java.lang.String host = parse.getHost();
            if (scheme != null && scheme.equals("fybernativebrowser") && host != null && host.equals("navigate")) {
                str = parse.getQueryParameter("url");
                if (str != null) {
                    try {
                        uri = android.net.Uri.parse(str);
                    } catch (java.lang.Exception unused) {
                        com.fyber.inneractive.sdk.util.IAlog.a("IAJavaUtil: getValidUri: Invalid url %s", str);
                        uri = null;
                    }
                    uri2 = str;
                }
                if (!this.c) {
                    return com.fyber.inneractive.sdk.click.r.a(uri.toString(), null, "The process was cancelled");
                }
                com.fyber.inneractive.sdk.util.f0 f0Var = com.fyber.inneractive.sdk.util.f0.OPEN_EVERYTHING;
                try {
                    context.getClass();
                } catch (java.lang.Throwable unused2) {
                }
                try {
                    com.fyber.inneractive.sdk.util.IAlog.a("IAJavaUtil - valid url found: '%s' opening browser", uri2);
                    try {
                        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(uri2));
                        if (!(context instanceof android.app.Activity)) {
                            intent.setFlags(268435456);
                        }
                        context.startActivity(intent);
                        d0Var = new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.OPEN_IN_EXTERNAL_BROWSER, null);
                    } catch (android.content.ActivityNotFoundException unused3) {
                        if (com.fyber.inneractive.sdk.util.h0.a(context, uri2)) {
                            d0Var = new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.OPENED_USING_CHROME_NAVIGATE, null);
                        } else {
                            d0Var = new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new com.fyber.inneractive.sdk.util.e0("tryOpeningChromeGracefully has failed and couldn't open the url"));
                        }
                    } catch (java.lang.Throwable unused4) {
                        if (!com.fyber.inneractive.sdk.util.h0.d(uri2) && !com.fyber.inneractive.sdk.util.h0.c(uri2) && f0Var != com.fyber.inneractive.sdk.util.f0.DO_NOT_OPEN_IN_INTERNAL_BROWSER) {
                            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.class);
                            intent2.putExtra(com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.URL_EXTRA, uri2);
                            intent2.putExtra("spotId", (java.lang.String) null);
                            if (!(context instanceof android.app.Activity)) {
                                intent2.setFlags(268435456);
                            }
                            context.startActivity(intent2);
                            d0Var = new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.OPENED_IN_INTERNAL_BROWSER, null);
                        } else {
                            d0Var = new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new com.fyber.inneractive.sdk.util.e0("canOpenInExternalBrowser has decided it cant be opened and shouldUseInternalBrowser was set to true"));
                        }
                    }
                } catch (java.lang.Throwable th) {
                    com.fyber.inneractive.sdk.util.IAlog.a("IAJavaUtil - could not open a browser for url: %s", uri2);
                    d0Var = new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, th);
                }
                if (list != null) {
                    java.lang.Throwable th2 = d0Var.b;
                    if (th2 != null) {
                        list.add(new com.fyber.inneractive.sdk.click.j(uri2, false, null, th2.toString()));
                    } else {
                        list.add(new com.fyber.inneractive.sdk.click.j(uri2, true, com.fyber.inneractive.sdk.click.a.a(uri, com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER), null));
                    }
                }
                return new com.fyber.inneractive.sdk.click.b(uri.toString(), com.fyber.inneractive.sdk.click.a.a(uri, com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER), "FyberNativeBrowser", null);
            }
        }
        str = null;
        if (str != null) {
        }
        if (!this.c) {
        }
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void a() {
        this.c = true;
    }
}
