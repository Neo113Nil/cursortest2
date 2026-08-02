package com.facebook.login;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* renamed from: com.facebook.login.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0721c extends CustomTabsServiceConnection {
    public static CustomTabsClient a;
    public static CustomTabsSession b;
    public static final a Companion = new a();
    public static final ReentrantLock c = new ReentrantLock();

    @SourceDebugExtension({"SMAP\nCustomTabPrefetchHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomTabPrefetchHelper.kt\ncom/facebook/login/CustomTabPrefetchHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
    /* renamed from: com.facebook.login.c$a */
    public static final class a {
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient newClient) {
        CustomTabsClient customTabsClient;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(newClient, "newClient");
        newClient.warmup(0L);
        a = newClient;
        Companion.getClass();
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        if (b == null && (customTabsClient = a) != null) {
            b = customTabsClient.newSession(null);
        }
        reentrantLock.unlock();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
    }
}
