package com.vungle.ads.internal.signals;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.s3;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12127a;
    public final Json b;
    public long c;
    public long d;
    public long e;
    public int f;
    public long g;
    public c h;
    public ConcurrentHashMap i;
    public final Lazy j;
    public com.vungle.ads.internal.session.b k;

    public j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12127a = context;
        this.b = JsonKt.Json$default(null, e.f12122a, 1, null);
        this.d = System.currentTimeMillis();
        this.f = -1;
        this.i = new ConcurrentHashMap();
        this.j = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new g(context));
        e();
        this.g = c().a("vungle_signal_session_creation_time", -1L);
        f();
        this.h = new c(this.f);
        com.vungle.ads.internal.session.b bVar = new com.vungle.ads.internal.session.b(context, this.h.a(), a(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new h(context))), b(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new i(context))));
        this.k = bVar;
        this.h.a(bVar.b());
        boolean z = u.f12190a;
        t.a("SignalManager", new d(this));
        try {
            this.h.a(1 ^ (com.vungle.ads.internal.platform.e.a() ? 1 : 0));
            this.h.e(com.vungle.ads.internal.platform.e.f(context) ? 1 : 0);
            this.h.c(com.vungle.ads.internal.platform.e.d(context) ? 1 : 0);
            this.h.d(com.vungle.ads.internal.platform.e.c(context));
            this.h.b(com.vungle.ads.internal.platform.e.e(context) ? 1 : 0);
        } catch (Exception e) {
            boolean z2 = u.f12190a;
            t.b("SignalManager", com.iab.omid.library.vungle.internal.l.a("Failed to collect device signals: ").append(e.getLocalizedMessage()).toString());
        }
    }

    public final c b() {
        return this.h;
    }

    public final FilePreferences c() {
        return (FilePreferences) this.j.getValue();
    }

    public final String d() {
        return this.h.b;
    }

    public final void e() {
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        com.vungle.ads.internal.util.a.a(new f(this));
    }

    public final void f() {
        if (this.f == -1) {
            this.f = c().a("vungle_signal_session_count", 0);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.g;
        long j2 = currentTimeMillis - j;
        if (j < 0 || j2 >= 86400000) {
            this.f = 1;
            c().b("vungle_signal_session_creation_time", currentTimeMillis);
            this.g = currentTimeMillis;
        } else {
            this.f++;
        }
        c().b("vungle_signal_session_count", this.f);
        c().b();
    }

    public static final com.vungle.ads.internal.executor.a a(Lazy lazy) {
        return (com.vungle.ads.internal.executor.a) lazy.getValue();
    }

    public static final PathProvider b(Lazy lazy) {
        return (PathProvider) lazy.getValue();
    }

    public final synchronized m a(String placementId) {
        long currentTimeMillis;
        Long l;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        currentTimeMillis = System.currentTimeMillis();
        l = this.i.containsKey(placementId) ? (Long) this.i.get(placementId) : null;
        this.i.put(placementId, Long.valueOf(currentTimeMillis));
        return new m(l, currentTimeMillis);
    }

    public final void b(s3 unclosedAd) {
        Intrinsics.checkNotNullParameter(unclosedAd, "unclosedAd");
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.t()) {
            return;
        }
        this.k.b(unclosedAd);
    }

    public final void b(String str) {
        if (str == null || str.length() == 0 || this.h.d.isEmpty()) {
            return;
        }
        ((m) this.h.d.get(0)).c = str;
    }

    public final void a(s3 unclosedAd) {
        Intrinsics.checkNotNullParameter(unclosedAd, "unclosedAd");
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.t()) {
            return;
        }
        this.k.a(unclosedAd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r4.intValue() == 2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r4.intValue() == 1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, m signaledAd) {
        Configuration configuration;
        Intrinsics.checkNotNullParameter(signaledAd, "signaledAd");
        this.h.b().clear();
        this.h.b().add(signaledAd);
        int i = 0;
        m mVar = (m) this.h.b().get(0);
        if (context == null) {
            context = this.f12127a;
        }
        Resources resources = context.getResources();
        Integer valueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.orientation);
        int i2 = valueOf != null ? 2 : 1;
        if (valueOf != null) {
        }
        if (valueOf == null || valueOf.intValue() != 0) {
            i = -1;
        }
        mVar.a(i);
    }

    public final String a() {
        this.h.e = (System.currentTimeMillis() + this.e) - this.d;
        try {
            StringBuilder sb = new StringBuilder("2:");
            Json json = this.b;
            c cVar = this.h;
            KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(c.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return sb.append(json.encodeToString(serializer, cVar)).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
