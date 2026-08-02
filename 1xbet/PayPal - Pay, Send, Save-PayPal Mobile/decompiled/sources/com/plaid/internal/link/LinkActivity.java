package com.plaid.internal.link;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/plaid/internal/link/LinkActivity;", "Lcom/plaid/internal/t4;", "Lcom/plaid/internal/w8;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class LinkActivity extends com.plaid.internal.AbstractActivityC0648t4 implements com.plaid.internal.w8 {
    public static final /* synthetic */ int e = 0;
    public final androidx.view.ViewModelLazy c = new androidx.view.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.plaid.internal.C0557j2.class), new com.plaid.internal.link.LinkActivity.d(), new com.plaid.internal.link.LinkActivity.h(), new com.plaid.internal.link.LinkActivity.e());
    public final androidx.view.ViewModelLazy d = new androidx.view.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.plaid.internal.C0702z4.class), new com.plaid.internal.link.LinkActivity.f(), new com.plaid.internal.link.LinkActivity.c(), new com.plaid.internal.link.LinkActivity.g());

    public final /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.plaid.internal.AbstractC0698z0, kotlin.Unit> {
        public b(com.plaid.internal.link.LinkActivity linkActivity) {
            super(1, linkActivity, com.plaid.internal.link.LinkActivity.class, "navigate", "navigate(Lcom/plaid/internal/workflow/model/Destination;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final kotlin.Unit invoke(com.plaid.internal.AbstractC0698z0 abstractC0698z0) {
            com.plaid.internal.AbstractC0698z0 abstractC0698z02 = abstractC0698z0;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractC0698z02, "");
            com.plaid.internal.link.LinkActivity linkActivity = (com.plaid.internal.link.LinkActivity) this.receiver;
            int i = com.plaid.internal.link.LinkActivity.e;
            linkActivity.a(abstractC0698z02);
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.view.ViewModelStore> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.ViewModelStore invoke() {
            return com.plaid.internal.link.LinkActivity.this.getViewModelStore();
        }
    }

    public static final class e extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.viewmodel.CreationExtras invoke() {
            return com.plaid.internal.link.LinkActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class f extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.view.ViewModelStore> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.ViewModelStore invoke() {
            return com.plaid.internal.link.LinkActivity.this.getViewModelStore();
        }
    }

    public static final class g extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.viewmodel.CreationExtras invoke() {
            return com.plaid.internal.link.LinkActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final void c(com.plaid.internal.link.LinkActivity linkActivity) {
        linkActivity.b = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    @kotlin.Deprecated(message = "Deprecated in Java")
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 3365) {
            if (i2 != -1 || intent == null) {
                com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                com.plaid.internal.C0452a6.a.a("User denied SMS permission", true);
            } else {
                java.lang.String stringExtra = intent.getStringExtra(com.google.android.gms.auth.api.phone.SmsRetriever.EXTRA_SMS_MESSAGE);
                android.content.Intent intent2 = new android.content.Intent("link_share_sms_from_consent_result_action");
                intent2.putExtra("link_shared_sms_content_extra", stringExtra);
                sendBroadcast(intent2);
            }
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope((com.plaid.internal.C0557j2) this.c.getValue()), null, null, new com.plaid.internal.link.LinkActivity.a(null), 3, null);
    }

    @Override // com.plaid.internal.AbstractActivityC0648t4, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        kotlinx.coroutines.Job launch$default;
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("OnCreate", true);
        com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "LinkActivity onCreate");
        com.plaid.internal.C0598n7.a(this);
        if (android.os.Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        setContentView(com.plaid.link.R.layout.plaid_activity_link);
        com.plaid.internal.C0557j2 c0557j2 = (com.plaid.internal.C0557j2) this.c.getValue();
        com.plaid.internal.link.LinkActivity.b bVar = new com.plaid.internal.link.LinkActivity.b(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "");
        com.plaid.internal.G2 g2 = c0557j2.b;
        if (g2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            g2 = null;
        }
        g2.f5792a.observe(this, new com.plaid.internal.C0557j2.a(bVar));
        com.plaid.internal.C0557j2 c0557j22 = (com.plaid.internal.C0557j2) this.c.getValue();
        if (c0557j22.f == null) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(c0557j22), kotlinx.coroutines.Dispatchers.getDefault(), null, new com.plaid.internal.C0566k2(c0557j22, null), 2, null);
            c0557j22.f = launch$default;
        }
        super.onCreate(bundle);
    }

    @Override // com.plaid.internal.AbstractActivityC0648t4, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("OnPause", true);
        com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "LinkActivity onPause");
        super.onPause();
    }

    @Override // com.plaid.internal.AbstractActivityC0648t4, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("OnResume", true);
        com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "LinkActivity onResume");
        super.onResume();
    }

    public static final com.plaid.internal.C0702z4 a(com.plaid.internal.link.LinkActivity linkActivity) {
        return (com.plaid.internal.C0702z4) linkActivity.d.getValue();
    }

    public final void c() {
        startActivity(new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:null")));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "LinkActivity onDestroy");
        super.onDestroy();
    }

    @Override // com.plaid.internal.w8
    public final com.plaid.internal.E3 b() {
        return new com.plaid.internal.E3(((com.plaid.internal.C0557j2) this.c.getValue()).f6448a);
    }

    @Override // com.plaid.internal.AbstractActivityC0648t4
    public final void a(android.content.Intent intent) {
        com.plaid.internal.D6 a2 = intent != null ? com.plaid.internal.C1.a(intent) : null;
        if (a2 != null) {
            com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
            com.plaid.internal.C0452a6.a.a("onIntentReady with redirectState: ".concat(java.lang.String.valueOf(a2)), true);
            com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "LinkActivity onIntentReady with redirectState: ".concat(java.lang.String.valueOf(a2)));
        }
        ((com.plaid.internal.C0557j2) this.c.getValue()).a(a2);
    }

    public final void a(com.plaid.internal.AbstractC0698z0 abstractC0698z0) {
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("Navigating to ".concat(java.lang.String.valueOf(abstractC0698z0)), true);
        try {
            if (kotlin.jvm.internal.Intrinsics.areEqual(abstractC0698z0, com.plaid.internal.AbstractC0698z0.e.f6637a)) {
                com.plaid.internal.C3 c3 = new com.plaid.internal.C3();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3, "");
                androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                androidx.fragment.app.FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                beginTransaction.replace(com.plaid.link.R.id.fragment_container, c3);
                beginTransaction.commitAllowingStateLoss();
                return;
            }
            if (abstractC0698z0 instanceof com.plaid.internal.AbstractC0698z0.i) {
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) ((com.plaid.internal.AbstractC0698z0.i.a.C0198a) ((com.plaid.internal.AbstractC0698z0.i) abstractC0698z0).a()).invoke(((com.plaid.internal.AbstractC0698z0.i) abstractC0698z0).b());
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
                androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                androidx.fragment.app.FragmentTransaction beginTransaction2 = supportFragmentManager2.beginTransaction();
                beginTransaction2.replace(com.plaid.link.R.id.fragment_container, fragment);
                beginTransaction2.commitAllowingStateLoss();
                return;
            }
            if (abstractC0698z0 instanceof com.plaid.internal.AbstractC0698z0.j) {
                com.plaid.link.Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 96171, ((com.plaid.internal.AbstractC0698z0.j) abstractC0698z0).a());
                return;
            }
            if (abstractC0698z0 instanceof com.plaid.internal.AbstractC0698z0.d) {
                com.plaid.link.Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 6148, ((com.plaid.internal.AbstractC0698z0.d) abstractC0698z0).a());
                return;
            }
            if (abstractC0698z0 instanceof com.plaid.internal.AbstractC0698z0.f) {
                java.lang.String a2 = ((com.plaid.internal.AbstractC0698z0.f) abstractC0698z0).a();
                java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", a2));
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Opening url in default browser", "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapOf, "");
                com.plaid.internal.F6.a.a("Opening url in default browser", mapOf, com.plaid.internal.J6.INFO);
                startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(a2)));
                return;
            }
            if (abstractC0698z0 instanceof com.plaid.internal.AbstractC0698z0.g) {
                a(((com.plaid.internal.AbstractC0698z0.g) abstractC0698z0).a());
                return;
            }
            if (abstractC0698z0 instanceof com.plaid.internal.AbstractC0698z0.a) {
                c();
                return;
            }
            if (abstractC0698z0 instanceof com.plaid.internal.AbstractC0698z0.k) {
                com.plaid.internal.EnumC0508d7 a3 = ((com.plaid.internal.AbstractC0698z0.k) abstractC0698z0).a();
                int i = com.plaid.internal.P7.l;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a3, "");
                com.plaid.internal.P7 p7 = new com.plaid.internal.P7();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putSerializable("smsAutofillType", a3);
                p7.setArguments(bundle);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "");
                androidx.fragment.app.FragmentManager supportFragmentManager3 = getSupportFragmentManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
                androidx.fragment.app.FragmentTransaction beginTransaction3 = supportFragmentManager3.beginTransaction();
                beginTransaction3.replace(com.plaid.link.R.id.fragment_container, p7);
                beginTransaction3.commitAllowingStateLoss();
                return;
            }
            if (abstractC0698z0 instanceof com.plaid.internal.AbstractC0698z0.h) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.LifecycleOwnerKt.getLifecycleScope(this), null, null, new com.plaid.internal.G1(this, null), 3, null);
                return;
            }
            if (abstractC0698z0 instanceof com.plaid.internal.AbstractC0698z0.b) {
                ((com.plaid.internal.C0702z4) this.d.getValue()).a(((com.plaid.internal.AbstractC0698z0.b) abstractC0698z0).a());
                return;
            }
            if (abstractC0698z0 instanceof com.plaid.internal.AbstractC0698z0.c) {
                int i2 = com.plaid.internal.U0.c;
                com.plaid.internal.U0 a4 = com.plaid.internal.U0.a.a(((com.plaid.internal.AbstractC0698z0.c) abstractC0698z0).a());
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a4, "");
                androidx.fragment.app.FragmentManager supportFragmentManager4 = getSupportFragmentManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "");
                androidx.fragment.app.FragmentTransaction beginTransaction4 = supportFragmentManager4.beginTransaction();
                beginTransaction4.replace(com.plaid.link.R.id.fragment_container, a4);
                beginTransaction4.commitAllowingStateLoss();
            }
        } catch (java.lang.Exception e2) {
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, e2, "Error occurred while trying to render: ".concat(java.lang.String.valueOf(abstractC0698z0)));
            com.plaid.link.Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 6148, com.plaid.internal.L2.b(e2, null));
        }
    }

    public final void a(com.plaid.internal.AbstractC0639s4 abstractC0639s4) {
        int i;
        com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "Opening URL within webview session");
        if (abstractC0639s4 instanceof com.plaid.internal.AbstractC0639s4.d) {
            java.lang.String str = abstractC0639s4.f6566a;
            int i2 = ((com.plaid.internal.AbstractC0639s4.d) abstractC0639s4).b;
            android.content.pm.PackageManager packageManager = getPackageManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageManager, "");
            java.util.List<android.content.pm.ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryIntentServices, "");
            if (queryIntentServices.isEmpty()) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Can't open custom tab -- custom tabs are not supported on this device", "");
                com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "Can't open custom tab -- custom tabs are not supported on this device");
                com.plaid.internal.J5 j5 = com.plaid.internal.Y6.f5982a;
                if (j5 != null) {
                    j5.a("Can't open custom tab -- custom tabs are not supported on this device");
                    return;
                }
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                android.view.WindowMetrics maximumWindowMetrics = getWindowManager().getMaximumWindowMetrics();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(maximumWindowMetrics, "");
                i = maximumWindowMetrics.getBounds().height();
            } else {
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                i = displayMetrics.heightPixels;
            }
            if (i2 != 0) {
                i = kotlin.ranges.RangesKt.coerceAtMost(i, i2);
            }
            java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Opening custom tab with url", "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapOf, "");
            com.plaid.internal.F6.a.a("Opening custom tab with url", mapOf, com.plaid.internal.J6.INFO);
            androidx.browser.customtabs.CustomTabsIntent build = new androidx.browser.customtabs.CustomTabsIntent.Builder().setInitialActivityHeightPx(i, 2).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            android.content.Intent intent = build.intent;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "");
            intent.addFlags(1073741824);
            intent.setData(android.net.Uri.parse(str));
            startActivityForResult(intent, 0);
            return;
        }
        if (abstractC0639s4 instanceof com.plaid.internal.AbstractC0639s4.c) {
            a(abstractC0639s4.f6566a);
            return;
        }
        if (abstractC0639s4 instanceof com.plaid.internal.AbstractC0639s4.b) {
            java.lang.String str2 = abstractC0639s4.f6566a;
            java.util.Map mapOf2 = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str2));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Opening url in default browser", "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapOf2, "");
            com.plaid.internal.F6.a.a("Opening url in default browser", mapOf2, com.plaid.internal.J6.INFO);
            startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str2)));
        }
    }

    public final void a(java.lang.String str) {
        android.content.pm.PackageManager packageManager = getPackageManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageManager, "");
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new android.content.Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryIntentServices, "");
        if (queryIntentServices.isEmpty()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Can't open custom tab -- custom tabs are not supported on this device", "");
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "Can't open custom tab -- custom tabs are not supported on this device");
            com.plaid.internal.J5 j5 = com.plaid.internal.Y6.f5982a;
            if (j5 != null) {
                j5.a("Can't open custom tab -- custom tabs are not supported on this device");
                return;
            }
            return;
        }
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Opening custom tab with url", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapOf, "");
        com.plaid.internal.F6.a.a("Opening custom tab with url", mapOf, com.plaid.internal.J6.INFO);
        androidx.browser.customtabs.CustomTabsIntent build = new androidx.browser.customtabs.CustomTabsIntent.Builder().build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        build.launchUrl(this, android.net.Uri.parse(str));
    }

    @Override // com.plaid.internal.w8
    public final com.plaid.internal.v8 a(com.plaid.internal.p8.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "");
        return new com.plaid.internal.v8(aVar, ((com.plaid.internal.C0557j2) this.c.getValue()).f6448a);
    }

    @Override // com.plaid.internal.w8
    public final com.plaid.internal.X7 a() {
        return new com.plaid.internal.X7(((com.plaid.internal.C0557j2) this.c.getValue()).f6448a);
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.link.LinkActivity$onBackPressed$1", f = "LinkActivity.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6481a;

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.link.LinkActivity.this.new a(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6481a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.C0557j2 c0557j2 = (com.plaid.internal.C0557j2) com.plaid.internal.link.LinkActivity.this.c.getValue();
                this.f6481a = 1;
                obj = c0557j2.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (!((java.lang.Boolean) obj).booleanValue()) {
                com.plaid.internal.link.LinkActivity.super.onBackPressed();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.link.LinkActivity.this.new a(continuation);
        }

        public a(kotlin.coroutines.Continuation<? super com.plaid.internal.link.LinkActivity.a> continuation) {
            super(2, continuation);
        }
    }

    public static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
            return new com.plaid.internal.C0657u4(((com.plaid.internal.C0557j2) com.plaid.internal.link.LinkActivity.this.c.getValue()).f6448a);
        }

        public c() {
            super(0);
        }
    }

    public static final class h extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
            com.plaid.internal.link.LinkActivity linkActivity = com.plaid.internal.link.LinkActivity.this;
            com.plaid.link.Plaid plaid = com.plaid.link.Plaid.INSTANCE;
            android.app.Application application = linkActivity.getApplication();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(application, "");
            return new com.plaid.internal.C0575l2(plaid.provideLinkTokenComponent$link_sdk_release(application));
        }

        public h() {
            super(0);
        }
    }

    @Override // com.plaid.internal.AbstractActivityC0648t4, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.plaid.internal.AbstractActivityC0648t4, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
