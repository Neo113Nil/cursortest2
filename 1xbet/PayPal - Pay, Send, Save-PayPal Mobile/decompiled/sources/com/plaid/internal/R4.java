package com.plaid.internal;

/* loaded from: classes16.dex */
public final class R4 extends android.webkit.WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.view.result.ActivityResultLauncher<java.lang.String> f5906a;
    public final androidx.view.result.ActivityResultLauncher<kotlin.Unit> b;
    public final com.plaid.internal.U7 c;
    public final com.plaid.internal.P7 d;

    public static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.webkit.PermissionRequest f5907a;
        public final /* synthetic */ java.lang.String[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(android.webkit.PermissionRequest permissionRequest, java.lang.String[] strArr) {
            super(0);
            this.f5907a = permissionRequest;
            this.b = strArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlin.Unit invoke() {
            this.f5907a.grant(this.b);
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.webkit.PermissionRequest f5908a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(android.webkit.PermissionRequest permissionRequest) {
            super(0);
            this.f5908a = permissionRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlin.Unit invoke() {
            this.f5908a.deny();
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlin.Unit invoke() {
            androidx.view.result.ActivityResultLauncher<kotlin.Unit> activityResultLauncher = com.plaid.internal.R4.this.b;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            activityResultLauncher.launch(unit);
            return unit;
        }
    }

    public R4(androidx.view.result.ActivityResultLauncher activityResultLauncher, androidx.view.result.ActivityResultLauncher activityResultLauncher2, com.plaid.internal.U7 u7, com.plaid.internal.P7 p7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "");
        this.f5906a = activityResultLauncher;
        this.b = activityResultLauncher2;
        this.c = u7;
        this.d = p7;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
        if (permissionRequest != null) {
            java.lang.String[] resources = permissionRequest.getResources();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "");
            if (kotlin.collections.ArraysKt.contains(resources, "android.webkit.resource.VIDEO_CAPTURE")) {
                java.lang.String[] strArr = (java.lang.String[]) kotlin.collections.CollectionsKt.listOf("android.webkit.resource.VIDEO_CAPTURE").toArray(new java.lang.String[0]);
                if (this.d.a()) {
                    permissionRequest.grant(strArr);
                } else {
                    this.d.a(new com.plaid.internal.R4.a(permissionRequest, strArr), new com.plaid.internal.R4.b(permissionRequest));
                }
            }
            java.lang.String[] resources2 = permissionRequest.getResources();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources2, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : resources2) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                    arrayList.add(str);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.plaid.internal.Y6.a.a("WebView requesting unsupported permission - ".concat(java.lang.String.valueOf((java.lang.String) it.next())));
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(android.webkit.WebView webView, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        if (i == 100) {
            i = 0;
        }
        super.onProgressChanged(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(android.webkit.WebView webView, android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        java.lang.String[] acceptTypes;
        if (valueCallback == null) {
            return false;
        }
        this.c.n = valueCallback;
        if (fileChooserParams == null || !fileChooserParams.isCaptureEnabled() || (acceptTypes = fileChooserParams.getAcceptTypes()) == null || !kotlin.collections.ArraysKt.contains(acceptTypes, "image/jpeg")) {
            this.f5906a.launch("*/*");
            return true;
        }
        if (webView == null) {
            return false;
        }
        if (this.d.a()) {
            this.b.launch(kotlin.Unit.INSTANCE);
        } else {
            com.plaid.internal.P7 p7 = this.d;
            com.plaid.internal.R4.c cVar = new com.plaid.internal.R4.c();
            com.plaid.internal.M4 m4 = com.plaid.internal.M4.f5844a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m4, "");
            p7.f = cVar;
            p7.g = m4;
            p7.h.launch("android.permission.CAMERA");
        }
        return true;
    }
}
