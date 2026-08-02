package com.amplitude.common.jvm;

import com.amplitude.common.a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements com.amplitude.common.a {
    public static final C0040a Companion = new C0040a();
    public static final a b;
    public a.EnumC0038a a;

    /* renamed from: com.amplitude.common.jvm.a$a, reason: collision with other inner class name */
    public static final class C0040a {
    }

    static {
        a aVar = new a();
        aVar.a = a.EnumC0038a.b;
        b = aVar;
    }

    @Override // com.amplitude.common.a
    public final void a() {
        Intrinsics.checkNotNullParameter("Skip event for opt out config.", Constants.MESSAGE);
        f(a.EnumC0038a.b);
    }

    @Override // com.amplitude.common.a
    public final void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        f(a.EnumC0038a.d);
    }

    @Override // com.amplitude.common.a
    public final void c(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        f(a.EnumC0038a.a);
    }

    @Override // com.amplitude.common.a
    public final void d(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        f(a.EnumC0038a.c);
    }

    @Override // com.amplitude.common.a
    public final void e(a.EnumC0038a enumC0038a) {
        Intrinsics.checkNotNullParameter(enumC0038a, "<set-?>");
        this.a = enumC0038a;
    }

    public final void f(a.EnumC0038a enumC0038a) {
        if (this.a.compareTo(enumC0038a) <= 0) {
            System.out.getClass();
        }
    }
}
