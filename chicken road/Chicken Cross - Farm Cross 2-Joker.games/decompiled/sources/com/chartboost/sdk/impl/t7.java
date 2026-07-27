package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.impl.y3;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5014a;
    public final ak b;
    public final Function1 c;
    public final Function4 d;
    public final Function2 e;
    public final DefaultHttpDataSource.Factory f;
    public final Function5 g;
    public final Function1 h;
    public final Function0 i;
    public final Function1 j;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2 {
        public static final a b = new a();

        public a() {
            super(2, f6.class, "cacheDataSourceFactory", "cacheDataSourceFactory(Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;)Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource$Factory;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CacheDataSource.Factory invoke(Cache p0, HttpDataSource.Factory p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return f6.a(p0, p1);
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public static final b b = new b();

        public b() {
            super(1, f6.class, "databaseProvider", "databaseProvider(Landroid/content/Context;)Lcom/google/android/exoplayer2/database/DatabaseProvider;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DatabaseProvider invoke(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return f6.a(p0);
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0 {
        public static final c b = new c();

        public c() {
            super(0, f6.class, "setCookieHandler", "setCookieHandler()V", 1);
        }

        public final void a() {
            f6.a();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public t7(Context context, ak videoCachePolicy, Function1 fileCachingFactory, Function4 cacheFactory, Function2 cacheDataSourceFactoryFactory, DefaultHttpDataSource.Factory httpDataSourceFactory, Function5 downloadManagerFactory, Function1 databaseProviderFactory, Function0 setCookieHandler, Function1 fakePrecacheFilesManagerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCachePolicy, "videoCachePolicy");
        Intrinsics.checkNotNullParameter(fileCachingFactory, "fileCachingFactory");
        Intrinsics.checkNotNullParameter(cacheFactory, "cacheFactory");
        Intrinsics.checkNotNullParameter(cacheDataSourceFactoryFactory, "cacheDataSourceFactoryFactory");
        Intrinsics.checkNotNullParameter(httpDataSourceFactory, "httpDataSourceFactory");
        Intrinsics.checkNotNullParameter(downloadManagerFactory, "downloadManagerFactory");
        Intrinsics.checkNotNullParameter(databaseProviderFactory, "databaseProviderFactory");
        Intrinsics.checkNotNullParameter(setCookieHandler, "setCookieHandler");
        Intrinsics.checkNotNullParameter(fakePrecacheFilesManagerFactory, "fakePrecacheFilesManagerFactory");
        this.f5014a = context;
        this.b = videoCachePolicy;
        this.c = fileCachingFactory;
        this.d = cacheFactory;
        this.e = cacheDataSourceFactoryFactory;
        this.f = httpDataSourceFactory;
        this.g = downloadManagerFactory;
        this.h = databaseProviderFactory;
        this.i = setCookieHandler;
        this.j = fakePrecacheFilesManagerFactory;
    }

    public static final y7 a(Context c2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        return new y7(c2, null, null, null, 14, null);
    }

    public final Function4 b() {
        return this.d;
    }

    public final Context c() {
        return this.f5014a;
    }

    public final Function1 d() {
        return this.h;
    }

    public final Function5 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7)) {
            return false;
        }
        t7 t7Var = (t7) obj;
        return Intrinsics.areEqual(this.f5014a, t7Var.f5014a) && Intrinsics.areEqual(this.b, t7Var.b) && Intrinsics.areEqual(this.c, t7Var.c) && Intrinsics.areEqual(this.d, t7Var.d) && Intrinsics.areEqual(this.e, t7Var.e) && Intrinsics.areEqual(this.f, t7Var.f) && Intrinsics.areEqual(this.g, t7Var.g) && Intrinsics.areEqual(this.h, t7Var.h) && Intrinsics.areEqual(this.i, t7Var.i) && Intrinsics.areEqual(this.j, t7Var.j);
    }

    public final Function1 f() {
        return this.j;
    }

    public final Function1 g() {
        return this.c;
    }

    public final DefaultHttpDataSource.Factory h() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((((((((((this.f5014a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final Function0 i() {
        return this.i;
    }

    public final ak j() {
        return this.b;
    }

    public String toString() {
        return "ExoPlayerDownloadManagerDependencies(context=" + this.f5014a + ", videoCachePolicy=" + this.b + ", fileCachingFactory=" + this.c + ", cacheFactory=" + this.d + ", cacheDataSourceFactoryFactory=" + this.e + ", httpDataSourceFactory=" + this.f + ", downloadManagerFactory=" + this.g + ", databaseProviderFactory=" + this.h + ", setCookieHandler=" + this.i + ", fakePrecacheFilesManagerFactory=" + this.j + ")";
    }

    public static final Cache a(x7 fc, ak vcp, DatabaseProvider dp, y3.b c2) {
        Intrinsics.checkNotNullParameter(fc, "fc");
        Intrinsics.checkNotNullParameter(vcp, "vcp");
        Intrinsics.checkNotNullParameter(dp, "dp");
        Intrinsics.checkNotNullParameter(c2, "c");
        return f6.a(fc, dp, vcp, c2, (CacheEvictor) null, 16, (Object) null);
    }

    public final Function2 a() {
        return this.e;
    }

    public static final DownloadManager a(Context c2, DatabaseProvider dp, Cache ca, HttpDataSource.Factory hf, DownloadManager.Listener l) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(dp, "dp");
        Intrinsics.checkNotNullParameter(ca, "ca");
        Intrinsics.checkNotNullParameter(hf, "hf");
        Intrinsics.checkNotNullParameter(l, "l");
        return f6.a(c2, dp, ca, hf, l, 0, 0, 96, null);
    }

    public static final j8 a(x7 fc) {
        Intrinsics.checkNotNullParameter(fc, "fc");
        return new j8(fc);
    }

    public /* synthetic */ t7(Context context, ak akVar, Function1 function1, Function4 function4, Function2 function2, DefaultHttpDataSource.Factory factory, Function5 function5, Function1 function12, Function0 function0, Function1 function13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? b4.b.a().getContext().getApplicationContext() : context, (i & 2) != 0 ? b4.b.b().l() : akVar, (i & 4) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.t7$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t7.a((Context) obj);
            }
        } : function1, (i & 8) != 0 ? new Function4() { // from class: com.chartboost.sdk.impl.t7$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return t7.a((x7) obj, (ak) obj2, (DatabaseProvider) obj3, (y3.b) obj4);
            }
        } : function4, (i & 16) != 0 ? a.b : function2, (i & 32) != 0 ? new DefaultHttpDataSource.Factory() : factory, (i & 64) != 0 ? new Function5() { // from class: com.chartboost.sdk.impl.t7$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return t7.a((Context) obj, (DatabaseProvider) obj2, (Cache) obj3, (HttpDataSource.Factory) obj4, (DownloadManager.Listener) obj5);
            }
        } : function5, (i & 128) != 0 ? b.b : function12, (i & 256) != 0 ? c.b : function0, (i & 512) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.t7$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t7.a((x7) obj);
            }
        } : function13);
    }
}
