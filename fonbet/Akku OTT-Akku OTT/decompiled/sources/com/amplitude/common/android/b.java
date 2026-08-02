package com.amplitude.common.android;

import com.amplitude.common.a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements com.amplitude.common.a {
    public static final a Companion = new a();
    public static final b b = new b();
    public a.EnumC0038a a = a.EnumC0038a.b;

    public static final class a {
    }

    @Override // com.amplitude.common.a
    public final void a() {
        Intrinsics.checkNotNullParameter("Skip event for opt out config.", Constants.MESSAGE);
        this.a.compareTo(a.EnumC0038a.b);
    }

    @Override // com.amplitude.common.a
    public final void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.compareTo(a.EnumC0038a.d);
    }

    @Override // com.amplitude.common.a
    public final void c(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.compareTo(a.EnumC0038a.a);
    }

    @Override // com.amplitude.common.a
    public final void d(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.compareTo(a.EnumC0038a.c);
    }

    @Override // com.amplitude.common.a
    public final void e(a.EnumC0038a enumC0038a) {
        Intrinsics.checkNotNullParameter(enumC0038a, "<set-?>");
        this.a = enumC0038a;
    }
}
