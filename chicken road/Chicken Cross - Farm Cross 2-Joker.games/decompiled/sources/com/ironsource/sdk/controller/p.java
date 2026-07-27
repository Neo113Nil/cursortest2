package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4491k4;
import com.ironsource.InterfaceC4415g;
import com.ironsource.InterfaceC4433h;
import com.ironsource.Qc;
import com.ironsource.Rc;
import com.ironsource.U3;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface p {

    public interface b {

        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            private final Rc f8598a;
            private final InterfaceC4415g b;

            public a(Rc configurations, InterfaceC4415g intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f8598a = configurations;
                this.b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Qc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                if (TextUtils.isEmpty(openUrl.d())) {
                    return new c.a("url is empty");
                }
                Intent a2 = this.b.a();
                a2.setData(Uri.parse(openUrl.d()));
                String c = openUrl.c();
                if (c != null && c.length() != 0) {
                    a2 = a2.setPackage(openUrl.c());
                    Intrinsics.checkNotNullExpressionValue(a2, "this.setPackage(openUrl.packageName)");
                }
                if (!(context instanceof Activity)) {
                    a2 = a2.addFlags(this.f8598a.c());
                }
                Intrinsics.checkNotNullExpressionValue(a2, "intentFactory\n          …ations.flags) else this }");
                context.startActivity(a2);
                return c.b.f8603a;
            }
        }

        /* renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        public static final class C1339b implements b {

            /* renamed from: a, reason: collision with root package name */
            private final String f8599a;

            public C1339b(String method) {
                Intrinsics.checkNotNullParameter(method, "method");
                this.f8599a = method;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Qc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                return new c.a("method " + this.f8599a + " is unsupported");
            }
        }

        public static final class c implements b {

            /* renamed from: a, reason: collision with root package name */
            private final Rc f8600a;
            private final InterfaceC4433h b;

            public c(Rc configurations, InterfaceC4433h intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f8600a = configurations;
                this.b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Qc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.b).a(this.f8600a.c()).a(openUrl.d()).b(true).c(true).a(context));
                return c.b.f8603a;
            }
        }

        public static final class d implements b {

            /* renamed from: a, reason: collision with root package name */
            private final Rc f8601a;
            private final InterfaceC4433h b;

            public d(Rc configurations, InterfaceC4433h intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f8601a = configurations;
                this.b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Qc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.b).a(this.f8601a.c()).a(openUrl.d()).a(this.f8601a.d()).b(true).a(context));
                return c.b.f8603a;
            }
        }

        c a(Context context, Qc qc);
    }

    public static abstract class c {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            private final String f8602a;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.f8602a;
            }

            public final String b() {
                return this.f8602a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f8602a, ((a) obj).f8602a);
            }

            public int hashCode() {
                return this.f8602a.hashCode();
            }

            public String toString() {
                return "Error(errorMessage=" + this.f8602a + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.f8602a = errorMessage;
            }

            public final a a(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new a(errorMessage);
            }

            public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f8602a;
                }
                return aVar.a(str);
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f8603a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    c a(Context context, Qc qc);

    public static final class a implements p {

        /* renamed from: a, reason: collision with root package name */
        private b f8597a;

        public a(String method, Rc openUrlConfigurations, InterfaceC4433h activityIntentFactory, InterfaceC4415g actionIntentFactory) {
            b aVar;
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
            Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
            Intrinsics.checkNotNullParameter(actionIntentFactory, "actionIntentFactory");
            int hashCode = method.hashCode();
            if (hashCode == -1455867212) {
                if (method.equals(U3.i.J)) {
                    aVar = new b.a(openUrlConfigurations, actionIntentFactory);
                }
                aVar = new b.C1339b(method);
            } else if (hashCode != 109770977) {
                if (hashCode == 1224424441 && method.equals(U3.i.K)) {
                    aVar = new b.d(openUrlConfigurations, activityIntentFactory);
                }
                aVar = new b.C1339b(method);
            } else {
                if (method.equals(U3.i.U)) {
                    aVar = new b.c(openUrlConfigurations, activityIntentFactory);
                }
                aVar = new b.C1339b(method);
            }
            this.f8597a = aVar;
        }

        @Override // com.ironsource.sdk.controller.p
        public c a(Context context, Qc openUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(openUrl, "openUrl");
            try {
                return this.f8597a.a(context, openUrl);
            } catch (Exception e) {
                C4491k4.d().a(e);
                String message = e.getMessage();
                String message2 = (message == null || message.length() == 0) ? "" : e.getMessage();
                Intrinsics.checkNotNull(message2);
                return new c.a(message2);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String method, Rc openUrlConfigurations) {
            this(method, openUrlConfigurations, new k.c(), new k.a());
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
        }
    }
}
