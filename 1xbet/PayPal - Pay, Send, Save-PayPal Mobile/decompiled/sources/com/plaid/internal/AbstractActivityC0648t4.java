package com.plaid.internal;

/* renamed from: com.plaid.internal.t4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC0648t4 extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    public com.plaid.internal.AbstractActivityC0648t4.a f6577a = com.plaid.internal.AbstractActivityC0648t4.a.C0197a.f6578a;
    public boolean b;

    /* renamed from: com.plaid.internal.t4$a */
    /* loaded from: classes16.dex */
    public static abstract class a {

        /* renamed from: com.plaid.internal.t4$a$a, reason: collision with other inner class name */
        public static final class C0197a extends com.plaid.internal.AbstractActivityC0648t4.a {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.AbstractActivityC0648t4.a.C0197a f6578a = new com.plaid.internal.AbstractActivityC0648t4.a.C0197a();
        }

        /* renamed from: com.plaid.internal.t4$a$b */
        public static final class b extends com.plaid.internal.AbstractActivityC0648t4.a {

            /* renamed from: a, reason: collision with root package name */
            public final android.content.Intent f6579a;

            public b(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                this.f6579a = intent;
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.plaid.internal.AbstractActivityC0648t4.a.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6579a, ((com.plaid.internal.AbstractActivityC0648t4.a.b) obj).f6579a);
            }

            public final int hashCode() {
                return this.f6579a.hashCode();
            }

            public final java.lang.String toString() {
                android.content.Intent intent = this.f6579a;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCreate(intent=");
                sb.append(intent);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.plaid.internal.t4$a$c */
        public static final class c extends com.plaid.internal.AbstractActivityC0648t4.a {

            /* renamed from: a, reason: collision with root package name */
            public final android.content.Intent f6580a;

            public c(android.content.Intent intent) {
                this.f6580a = intent;
            }

            public final boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.plaid.internal.AbstractActivityC0648t4.a.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6580a, ((com.plaid.internal.AbstractActivityC0648t4.a.c) obj).f6580a);
            }

            public final int hashCode() {
                android.content.Intent intent = this.f6580a;
                if (intent == null) {
                    return 0;
                }
                return intent.hashCode();
            }

            public final java.lang.String toString() {
                android.content.Intent intent = this.f6580a;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnNewIntent(intent=");
                sb.append(intent);
                sb.append(")");
                return sb.toString();
            }
        }
    }

    public abstract void a(android.content.Intent intent);

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.b = bundle.getBoolean("outOfProcessActivityLaunched", false);
        }
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "");
        this.f6577a = new com.plaid.internal.AbstractActivityC0648t4.a.b(intent);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f6577a = new com.plaid.internal.AbstractActivityC0648t4.a.c(intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.plaid.internal.AbstractActivityC0648t4.a aVar = this.f6577a;
        if (this.b) {
            this.b = false;
            if (kotlin.jvm.internal.Intrinsics.areEqual(aVar, com.plaid.internal.AbstractActivityC0648t4.a.C0197a.f6578a)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("link_out_of_process_closed_redirect_uri", true);
                aVar = new com.plaid.internal.AbstractActivityC0648t4.a.c(intent);
            } else if (aVar instanceof com.plaid.internal.AbstractActivityC0648t4.a.b) {
                ((com.plaid.internal.AbstractActivityC0648t4.a.b) aVar).f6579a.putExtra("link_out_of_process_closed_redirect_uri", true);
            }
        }
        this.f6577a = com.plaid.internal.AbstractActivityC0648t4.a.C0197a.f6578a;
        if (aVar instanceof com.plaid.internal.AbstractActivityC0648t4.a.C0197a) {
            return;
        }
        if (aVar instanceof com.plaid.internal.AbstractActivityC0648t4.a.b) {
            a(((com.plaid.internal.AbstractActivityC0648t4.a.b) aVar).f6579a);
        } else if (aVar instanceof com.plaid.internal.AbstractActivityC0648t4.a.c) {
            a(((com.plaid.internal.AbstractActivityC0648t4.a.c) aVar).f6580a);
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("outOfProcessActivityLaunched", this.b);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
