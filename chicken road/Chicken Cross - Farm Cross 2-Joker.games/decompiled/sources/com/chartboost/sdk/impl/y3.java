package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import java.util.Comparator;
import java.util.TreeSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y3 implements CacheEvictor {

    /* renamed from: a, reason: collision with root package name */
    public final long f5085a;
    public final b b;
    public final Function0 c;
    public final Lazy d;
    public long e;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2 {
        public static final a b = new a();

        public a() {
            super(2, z3.class, "compare", "compare(Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;)I", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(CacheSpan p0, CacheSpan p1) {
            int b2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            b2 = z3.b(p0, p1);
            return Integer.valueOf(b2);
        }
    }

    public interface b {
        void b(String str);
    }

    public y3(long j, b evictUrlCallback, Function0 treeSetFactory) {
        Intrinsics.checkNotNullParameter(evictUrlCallback, "evictUrlCallback");
        Intrinsics.checkNotNullParameter(treeSetFactory, "treeSetFactory");
        this.f5085a = j;
        this.b = evictUrlCallback;
        this.c = treeSetFactory;
        this.d = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.y3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y3.a(y3.this);
            }
        });
    }

    public static final TreeSet a() {
        final a aVar = a.b;
        return new TreeSet(new Comparator() { // from class: com.chartboost.sdk.impl.y3$$ExternalSyntheticLambda2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return y3.a(Function2.this, obj, obj2);
            }
        });
    }

    public final TreeSet b() {
        return (TreeSet) this.d.getValue();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onCacheInitialized() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan span) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(span, "span");
        b().add(span);
        this.e += span.length;
        a(cache, 0L);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan span) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(span, "span");
        b().remove(span);
        this.e -= span.length;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan oldSpan, CacheSpan newSpan) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(oldSpan, "oldSpan");
        Intrinsics.checkNotNullParameter(newSpan, "newSpan");
        onSpanRemoved(cache, oldSpan);
        onSpanAdded(cache, newSpan);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onStartFile(Cache cache, String key, long j, long j2) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(key, "key");
        if (j2 != -1) {
            a(cache, j2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    public static final int a(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final TreeSet a(y3 y3Var) {
        return (TreeSet) y3Var.c.invoke();
    }

    public final void a(Cache cache, long j) {
        while (this.e + j > this.f5085a && !b().isEmpty()) {
            CacheSpan cacheSpan = (CacheSpan) b().first();
            mb.a("evictCache() - " + cacheSpan.key, (Throwable) null, 2, (Object) null);
            cache.removeSpan(cacheSpan);
            b bVar = this.b;
            String key = cacheSpan.key;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            bVar.b(key);
        }
    }

    public /* synthetic */ y3(long j, b bVar, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, bVar, (i & 4) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.y3$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y3.a();
            }
        } : function0);
    }
}
