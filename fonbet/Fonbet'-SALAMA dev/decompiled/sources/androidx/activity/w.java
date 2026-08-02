package androidx.activity;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f8134a = new w();

    public final OnBackInvokedCallback a(Function1 function1, Function1 function12, s6.a aVar, s6.a aVar2) {
        t6.h.e(function1, "onBackStarted");
        t6.h.e(function12, "onBackProgressed");
        t6.h.e(aVar, "onBackInvoked");
        t6.h.e(aVar2, "onBackCancelled");
        return new v(function1, function12, aVar, aVar2);
    }
}
