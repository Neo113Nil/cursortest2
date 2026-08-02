package com.plaid.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/plaid/internal/LinkRedirectActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LinkRedirectActivity extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.view.ViewModelLazy f5834a = new androidx.view.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.plaid.internal.K2.class), new com.plaid.internal.LinkRedirectActivity.b(), new com.plaid.internal.LinkRedirectActivity.a(), new com.plaid.internal.LinkRedirectActivity.c());

    public static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
            return com.plaid.internal.LinkRedirectActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.view.ViewModelStore> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.ViewModelStore invoke() {
            return com.plaid.internal.LinkRedirectActivity.this.getViewModelStore();
        }
    }

    public static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.viewmodel.CreationExtras invoke() {
            return com.plaid.internal.LinkRedirectActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.plaid.internal.K2 k2 = (com.plaid.internal.K2) this.f5834a.getValue();
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(k2), null, null, new com.plaid.internal.J2(this, com.plaid.internal.K2.a(intent.getData()), null), 3, null);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }
}
