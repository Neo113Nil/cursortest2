package c;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f2525a = new p();

    public final OnBackInvokedCallback a(o2.l onBackStarted, o2.l onBackProgressed, o2.a onBackInvoked, o2.a onBackCancelled) {
        kotlin.jvm.internal.j.e(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.j.e(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.j.e(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.j.e(onBackCancelled, "onBackCancelled");
        return new o(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
