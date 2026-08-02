package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.C0688a;
import com.facebook.D;
import com.facebook.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* renamed from: com.facebook.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0717k {
    public static final a Companion = new a();
    public static C0717k f;
    public final LocalBroadcastManager a;
    public final C0697b b;
    public C0688a c;
    public final AtomicBoolean d;
    public Date e;

    /* renamed from: com.facebook.k$a */
    public static final class a {
        @JvmStatic
        public final C0717k a() {
            C0717k c0717k;
            C0717k c0717k2 = C0717k.f;
            if (c0717k2 != null) {
                return c0717k2;
            }
            synchronized (this) {
                c0717k = C0717k.f;
                if (c0717k == null) {
                    LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(w.a());
                    Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
                    C0717k c0717k3 = new C0717k(localBroadcastManager, new C0697b());
                    C0717k.f = c0717k3;
                    c0717k = c0717k3;
                }
            }
            return c0717k;
        }
    }

    /* renamed from: com.facebook.k$b */
    public static final class b implements e {
        @Override // com.facebook.C0717k.e
        public final String a() {
            return "fb_extend_sso_token";
        }

        @Override // com.facebook.C0717k.e
        public final String b() {
            return "oauth/access_token";
        }
    }

    /* renamed from: com.facebook.k$c */
    public static final class c implements e {
        @Override // com.facebook.C0717k.e
        public final String a() {
            return "ig_refresh_token";
        }

        @Override // com.facebook.C0717k.e
        public final String b() {
            return "refresh_access_token";
        }
    }

    /* renamed from: com.facebook.k$d */
    public static final class d {
        public String a;
        public int b;
        public int c;
        public Long d;
        public String e;
    }

    /* renamed from: com.facebook.k$e */
    public interface e {
        String a();

        String b();
    }

    public C0717k(LocalBroadcastManager localBroadcastManager, C0697b accessTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(accessTokenCache, "accessTokenCache");
        this.a = localBroadcastManager;
        this.b = accessTokenCache;
        this.d = new AtomicBoolean(false);
        this.e = new Date(0L);
    }

    public final void a() {
        C0688a c0688a = this.c;
        if (c0688a == null) {
            return;
        }
        String str = c0688a.m;
        if (this.d.compareAndSet(false, true)) {
            this.e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            d dVar = new d();
            final C0700e c0700e = new C0700e(atomicBoolean, hashSet, hashSet2, hashSet3);
            final C0701f c0701f = new C0701f(dVar);
            final RunnableC0702g runnableC0702g = new RunnableC0702g(dVar, c0688a, atomicBoolean, hashSet, hashSet2, hashSet3, this);
            Companion.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            z.c cVar = z.Companion;
            cVar.getClass();
            z g = z.c.g(c0688a, "me/permissions", c0700e);
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            g.d = bundle;
            F f2 = F.a;
            g.h = f2;
            e cVar2 = Intrinsics.areEqual(str == null ? "facebook" : str, "instagram") ? new c() : new b();
            Bundle bundle2 = new Bundle();
            bundle2.putString("grant_type", cVar2.a());
            bundle2.putString("client_id", c0688a.j);
            bundle2.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            z g2 = z.c.g(c0688a, cVar2.b(), c0701f);
            Intrinsics.checkNotNullParameter(bundle2, "<set-?>");
            g2.d = bundle2;
            g2.h = f2;
            if (Intrinsics.areEqual(str, "gaming")) {
                final AtomicInteger atomicInteger = new AtomicInteger(0);
                z.b bVar = new z.b() { // from class: com.facebook.h
                    @Override // com.facebook.z.b
                    public final void a(E response) {
                        C0700e permissionsCallback = C0700e.this;
                        Intrinsics.checkNotNullParameter(permissionsCallback, "$permissionsCallback");
                        AtomicInteger completedCount = atomicInteger;
                        Intrinsics.checkNotNullParameter(completedCount, "$completedCount");
                        RunnableC0702g onAllCompleted = runnableC0702g;
                        Intrinsics.checkNotNullParameter(onAllCompleted, "$onAllCompleted");
                        Intrinsics.checkNotNullParameter(response, "response");
                        permissionsCallback.a(response);
                        if (completedCount.incrementAndGet() == 2) {
                            onAllCompleted.run();
                        }
                    }
                };
                z.b bVar2 = new z.b() { // from class: com.facebook.i
                    @Override // com.facebook.z.b
                    public final void a(E response) {
                        C0701f extendCallback = C0701f.this;
                        Intrinsics.checkNotNullParameter(extendCallback, "$extendCallback");
                        AtomicInteger completedCount = atomicInteger;
                        Intrinsics.checkNotNullParameter(completedCount, "$completedCount");
                        RunnableC0702g onAllCompleted = runnableC0702g;
                        Intrinsics.checkNotNullParameter(onAllCompleted, "$onAllCompleted");
                        Intrinsics.checkNotNullParameter(response, "response");
                        extendCallback.a(response);
                        if (completedCount.incrementAndGet() == 2) {
                            onAllCompleted.run();
                        }
                    }
                };
                g.j(bVar);
                g2.j(bVar2);
                g.d();
                g2.d();
                return;
            }
            D requests = new D(g, g2);
            D.a callback = new D.a() { // from class: com.facebook.j
                @Override // com.facebook.D.a
                public final void a(D it) {
                    RunnableC0702g onAllCompleted = RunnableC0702g.this;
                    Intrinsics.checkNotNullParameter(onAllCompleted, "$onAllCompleted");
                    Intrinsics.checkNotNullParameter(it, "it");
                    onAllCompleted.run();
                }
            };
            Intrinsics.checkNotNullParameter(callback, "callback");
            ArrayList arrayList = requests.d;
            if (!arrayList.contains(callback)) {
                arrayList.add(callback);
            }
            cVar.getClass();
            Intrinsics.checkNotNullParameter(requests, "requests");
            com.facebook.internal.F.d(requests);
            new C(requests).executeOnExecutor(w.c(), new Void[0]);
        }
    }

    public final void b(C0688a c0688a, C0688a c0688a2) {
        Intent intent = new Intent(w.a(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", c0688a);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", c0688a2);
        this.a.sendBroadcast(intent);
    }

    public final void c(C0688a accessToken, boolean z) {
        SharedPreferences sharedPreferences = this.b.a;
        C0688a c0688a = this.c;
        String str = c0688a != null ? c0688a.k : null;
        String str2 = accessToken != null ? accessToken.k : null;
        if (str != null && !Intrinsics.areEqual(str, str2)) {
            w.c().execute(new RunnableC0698c());
        }
        this.c = accessToken;
        this.d.set(false);
        this.e = new Date(0L);
        if (z) {
            if (accessToken != null) {
                Intrinsics.checkNotNullParameter(accessToken, "accessToken");
                try {
                    sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.h().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                com.facebook.internal.E.c(w.a());
            }
        }
        com.facebook.internal.E e2 = com.facebook.internal.E.a;
        if (c0688a == null ? accessToken == null : Intrinsics.areEqual(c0688a, accessToken)) {
            return;
        }
        b(c0688a, accessToken);
        Context a2 = w.a();
        C0688a.Companion.getClass();
        C0688a b2 = C0688a.b.b();
        AlarmManager alarmManager = (AlarmManager) a2.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (C0688a.b.c()) {
            if ((b2 != null ? b2.a : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(a2, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, b2.a.getTime(), PendingIntent.getBroadcast(a2, 0, intent, 67108864));
            } catch (Exception unused2) {
            }
        }
    }
}
