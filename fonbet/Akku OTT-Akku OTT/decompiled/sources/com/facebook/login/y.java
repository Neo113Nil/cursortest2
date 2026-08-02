package com.facebook.login;

import androidx.browser.customtabs.CustomTabsClient;
import com.facebook.internal.C0709e;
import com.facebook.internal.F;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* loaded from: classes3.dex */
public final class y {
    public static final a Companion = new a();
    public static final Set<String> a = SetsKt.setOf((Object[]) new String[]{"ads_management", "create_event", "rsvp_event"});

    @SourceDebugExtension({"SMAP\nLoginManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginManager.kt\ncom/facebook/login/LoginManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1447:1\n1#2:1448\n*E\n"})
    public static final class a {
    }

    static {
        Intrinsics.checkNotNullExpressionValue(y.class.toString(), "LoginManager::class.java.toString()");
    }

    public y() {
        F.f();
        Intrinsics.checkNotNullExpressionValue(com.facebook.w.a().getSharedPreferences("com.facebook.loginManager", 0), "getApplicationContext().…ER, Context.MODE_PRIVATE)");
        if (!com.facebook.w.n || C0709e.a() == null) {
            return;
        }
        CustomTabsClient.bindCustomTabsService(com.facebook.w.a(), "com.android.chrome", new C0721c());
        CustomTabsClient.connectAndInitialize(com.facebook.w.a(), com.facebook.w.a().getPackageName());
    }
}
