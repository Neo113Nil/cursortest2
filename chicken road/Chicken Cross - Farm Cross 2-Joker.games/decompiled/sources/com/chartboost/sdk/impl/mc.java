package com.chartboost.sdk.impl;

import com.chartboost.sdk.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mc {
    public static final a c = new a(null);
    public static boolean d = true;

    /* renamed from: a, reason: collision with root package name */
    public final wg f4877a;
    public final dg b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public mc(wg sharedPrefsHelper, dg resourcesLoader) {
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.checkNotNullParameter(resourcesLoader, "resourcesLoader");
        this.f4877a = sharedPrefsHelper;
        this.b = resourcesLoader;
    }

    public final String a() {
        String a2 = a(R.raw.omsdk_v1, "com.chartboost.sdk.omidjs");
        return a2 == null ? "" : a2;
    }

    public final String a(int i, String str) {
        try {
            if (d) {
                d = false;
                return a(str, i);
            }
            String a2 = this.f4877a.a(str);
            return a2 == null ? a(str, i) : a2;
        } catch (Exception e) {
            mb.b("OmidJS exception", e);
            return null;
        }
    }

    public final String a(String str, int i) {
        try {
            String a2 = this.b.a(i);
            if (a2 == null) {
                return null;
            }
            this.f4877a.a(str, a2);
            return a2;
        } catch (Exception e) {
            mb.b("OmidJS resource file exception", e);
            return null;
        }
    }
}
