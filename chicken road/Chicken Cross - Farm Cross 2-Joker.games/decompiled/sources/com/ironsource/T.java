package com.ironsource;

import com.ironsource.Q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class T implements Q, Q.a {

    /* renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f7900a;
    private final Map<String, P> b;

    /* JADX WARN: Multi-variable type inference failed */
    public T() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.Q
    public P a(String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f7900a.readLock().lock();
        try {
            return this.b.get(adId);
        } finally {
            this.f7900a.readLock().unlock();
        }
    }

    public T(ReadWriteLock readWriteLock) {
        Intrinsics.checkNotNullParameter(readWriteLock, "readWriteLock");
        this.f7900a = readWriteLock;
        this.b = new LinkedHashMap();
    }

    @Override // com.ironsource.Q
    public List<P> a() {
        this.f7900a.readLock().lock();
        List<P> list = CollectionsKt.toList(this.b.values());
        this.f7900a.readLock().unlock();
        return list;
    }

    public /* synthetic */ T(ReadWriteLock readWriteLock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.Q.a
    public void a(P adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f7900a.writeLock().lock();
        try {
            if (this.b.get(adInfo.c()) == null) {
                this.b.put(adInfo.c(), adInfo);
            }
        } finally {
            this.f7900a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.Q.a
    public void a(JSONObject json, EnumC4559o0 adStatus, String adId) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f7900a.writeLock().lock();
        try {
            P p = this.b.get(adId);
            if (p == null) {
                return;
            }
            String bundleId = json.optString("bundleId");
            Intrinsics.checkNotNullExpressionValue(bundleId, "bundleId");
            if (bundleId.length() > 0) {
                p.a(bundleId);
            }
            String dynamicDemandSourceId = json.optString("dynamicDemandSource");
            Intrinsics.checkNotNullExpressionValue(dynamicDemandSourceId, "dynamicDemandSourceId");
            if (dynamicDemandSourceId.length() > 0) {
                p.a(P7.b.a(dynamicDemandSourceId));
            }
            p.a(adStatus);
        } finally {
            this.f7900a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.Q.a
    public void a(EnumC4559o0 adStatus, String adId) {
        Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f7900a.writeLock().lock();
        try {
            P p = this.b.get(adId);
            if (p == null) {
                return;
            }
            p.a(adStatus);
            p.a(System.currentTimeMillis() / 1000.0d);
        } finally {
            this.f7900a.writeLock().unlock();
        }
    }
}
