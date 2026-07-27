package androidx.activity;

import android.window.OnBackInvokedCallback;
import t4.InterfaceC1430a;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f4073a = new s();

    public final OnBackInvokedCallback a(InterfaceC1441l onBackStarted, InterfaceC1441l onBackProgressed, InterfaceC1430a onBackInvoked, InterfaceC1430a onBackCancelled) {
        kotlin.jvm.internal.i.e(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.i.e(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.i.e(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.i.e(onBackCancelled, "onBackCancelled");
        return new r(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
