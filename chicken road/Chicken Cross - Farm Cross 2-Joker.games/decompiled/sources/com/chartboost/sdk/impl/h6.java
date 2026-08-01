package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h6 {
    public static final a d = new a(null);
    public static volatile g6 e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4789a;
    public final q6 b;
    public final j6 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g6 a() {
            return h6.e;
        }

        public a() {
        }
    }

    public h6(Context context, q6 displayMeasurement, j6 deviceFieldsWrapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        Intrinsics.checkNotNullParameter(deviceFieldsWrapper, "deviceFieldsWrapper");
        this.f4789a = context;
        this.b = displayMeasurement;
        this.c = deviceFieldsWrapper;
    }

    public final g6 b() {
        try {
            r6 b = this.b.b();
            r6 e2 = this.b.e();
            String packageName = this.f4789a.getPackageName();
            int b2 = b.b();
            int a2 = b.a();
            int b3 = e2.b();
            int a3 = e2.a();
            float c = this.b.c();
            String valueOf = String.valueOf(this.b.d());
            int a4 = this.c.a();
            String b4 = this.c.b();
            PackageManager packageManager = this.f4789a.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            Intrinsics.checkNotNull(packageName);
            g6 g6Var = new g6(b2, a2, b3, a3, c, valueOf, a4, b4, packageName, g8.getPackageVersionName(packageManager, packageName), this.c.c());
            e = g6Var;
            return g6Var;
        } catch (Exception e3) {
            mb.b("Cannot create device body", e3);
            return new g6(0, 0, 0, 0, 0.0f, null, 0, null, null, null, false, 2047, null);
        }
    }
}
