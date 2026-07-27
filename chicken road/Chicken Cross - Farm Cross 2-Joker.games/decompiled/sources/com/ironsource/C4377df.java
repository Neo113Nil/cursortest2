package com.ironsource;

import com.ironsource.K8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.df, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4377df implements K8, K8.a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, C4737y> f8145a = new LinkedHashMap();
    private final C4553nc b = new C4553nc();
    private final ReadWriteLock c = new ReentrantReadWriteLock();

    /* renamed from: com.ironsource.df$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8146a;

        static {
            int[] iArr = new int[EnumC4359cf.values().length];
            try {
                iArr[EnumC4359cf.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4359cf.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4359cf.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8146a = iArr;
        }
    }

    private final void b() {
        C4341bf configuration = FeaturesManager.getInstance().getSessionHistoryConfig();
        C4553nc c4553nc = this.b;
        Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
        c4553nc.a(a(configuration));
        this.b.a(a());
    }

    @Override // com.ironsource.K8.a
    public void a(AbstractC4395ef historyRecord) {
        Intrinsics.checkNotNullParameter(historyRecord, "historyRecord");
        this.c.writeLock().lock();
        try {
            P a2 = historyRecord.a();
            String valueOf = String.valueOf(a2 != null ? a2.b() : null);
            Map<String, C4737y> map = this.f8145a;
            C4737y c4737y = map.get(valueOf);
            if (c4737y == null) {
                c4737y = new C4737y();
                map.put(valueOf, c4737y);
            }
            c4737y.a(historyRecord.a(new C4502kf()));
            this.c.writeLock().unlock();
            b();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.K8
    public JSONObject a(EnumC4556nf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.c.readLock().lock();
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, C4737y> entry : this.f8145a.entrySet()) {
                String key = entry.getKey();
                JSONObject a2 = entry.getValue().a(mode);
                if (a2.length() > 0) {
                    jSONObject.put(key, a2);
                }
            }
            return jSONObject;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.K8
    public int a(IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.c.readLock().lock();
        try {
            C4737y c4737y = this.f8145a.get(adFormat.toString());
            return c4737y != null ? c4737y.a() : 0;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.K8
    public List<String> a() {
        this.c.readLock().lock();
        try {
            Map<String, C4737y> map = this.f8145a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C4737y> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return CollectionsKt.toList(linkedHashMap.keySet());
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.K8
    public Map<String, JSONObject> a(C4341bf configuration) {
        Map<String, JSONObject> mutableMapOf;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.c.readLock().lock();
        try {
            int i = a.f8146a[configuration.a().ordinal()];
            if (i == 1) {
                mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(L6.z1, a(EnumC4556nf.FullHistory)), TuplesKt.to(L6.A1, a(EnumC4556nf.CurrentlyLoadedAds)));
            } else if (i == 2) {
                mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(L6.A1, a(EnumC4556nf.CurrentlyLoadedAds)));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                mutableMapOf = MapsKt.emptyMap();
            }
            return mutableMapOf;
        } finally {
            this.c.readLock().unlock();
        }
    }
}
