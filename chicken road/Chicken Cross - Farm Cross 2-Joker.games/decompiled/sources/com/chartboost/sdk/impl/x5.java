package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.w6;
import com.chartboost.sdk.internal.caching.ExpirationReason;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes4.dex */
public final class x5 implements w6 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f5069a;
    public final t3 b;
    public final m8 c;
    public final s3 d;
    public final r3 e;
    public final CoroutineDispatcher f;
    public final Function0 g;
    public final long h;
    public final Function0 i;
    public final ConcurrentHashMap j;
    public final AtomicLong k;
    public final AtomicBoolean l;
    public final Mutex m;
    public final ConcurrentHashMap n;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return x5.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                x5 x5Var = x5.this;
                this.b = 1;
                if (x5Var.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f5070a;
        public final long b;
        public final long c;
        public final File d;
        public final long e;
        public final boolean f;

        public b(long j, long j2, long j3, File file, long j4, boolean z) {
            Intrinsics.checkNotNullParameter(file, "file");
            this.f5070a = j;
            this.b = j2;
            this.c = j3;
            this.d = file;
            this.e = j4;
            this.f = z;
        }

        public final long a() {
            return this.c;
        }

        public final File b() {
            return this.d;
        }

        public final boolean c() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5070a == bVar.f5070a && this.b == bVar.b && this.c == bVar.c && Intrinsics.areEqual(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f;
        }

        public int hashCode() {
            return (((((((((Long.hashCode(this.f5070a) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.e)) * 31) + Boolean.hashCode(this.f);
        }

        public String toString() {
            return "DownloadInfo(startByte=" + this.f5070a + ", endByte=" + this.b + ", actualBytes=" + this.c + ", file=" + this.d + ", timestamp=" + this.e + ", isComplete=" + this.f + ")";
        }

        public final boolean a(long j) {
            return j == -1 ? !this.f : this.c < j;
        }

        public final boolean b(long j) {
            return j == -1 ? this.f : this.c >= j;
        }

        public /* synthetic */ b(long j, long j2, long j3, File file, long j4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, file, (i & 16) != 0 ? System.currentTimeMillis() : j4, (i & 32) != 0 ? false : z);
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public final File f5071a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(File file) {
                super(null);
                Intrinsics.checkNotNullParameter(file, "file");
                this.f5071a = file;
            }

            public final File a() {
                return this.f5071a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f5071a, ((a) obj).f5071a);
            }

            public int hashCode() {
                return this.f5071a.hashCode();
            }

            public String toString() {
                return "CacheHit(file=" + this.f5071a + ")";
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public final Exception f5072a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.f5072a = error;
            }

            public final Exception a() {
                return this.f5072a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f5072a, ((b) obj).f5072a);
            }

            public int hashCode() {
                return this.f5072a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f5072a + ")";
            }
        }

        /* renamed from: com.chartboost.sdk.impl.x5$c$c, reason: collision with other inner class name */
        public static final class C0223c extends c {

            /* renamed from: a, reason: collision with root package name */
            public final d f5073a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0223c(d state) {
                super(null);
                Intrinsics.checkNotNullParameter(state, "state");
                this.f5073a = state;
            }

            public final d a() {
                return this.f5073a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0223c) && Intrinsics.areEqual(this.f5073a, ((C0223c) obj).f5073a);
            }

            public int hashCode() {
                return this.f5073a.hashCode();
            }

            public String toString() {
                return "ProceedWithDownload(state=" + this.f5073a + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final File f5074a;
        public final File b;
        public final long c;
        public final long d;
        public final File e;
        public final File f;
        public final String g;
        public final String h;

        public d(File tempDataFile, File cacheDir, long j, long j2, File targetFile, File completeFile, String cacheKey, String key) {
            Intrinsics.checkNotNullParameter(tempDataFile, "tempDataFile");
            Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
            Intrinsics.checkNotNullParameter(targetFile, "targetFile");
            Intrinsics.checkNotNullParameter(completeFile, "completeFile");
            Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f5074a = tempDataFile;
            this.b = cacheDir;
            this.c = j;
            this.d = j2;
            this.e = targetFile;
            this.f = completeFile;
            this.g = cacheKey;
            this.h = key;
        }

        public final File a() {
            return this.b;
        }

        public final String b() {
            return this.g;
        }

        public final File c() {
            return this.f;
        }

        public final long d() {
            return this.d;
        }

        public final long e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f5074a, dVar.f5074a) && Intrinsics.areEqual(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d && Intrinsics.areEqual(this.e, dVar.e) && Intrinsics.areEqual(this.f, dVar.f) && Intrinsics.areEqual(this.g, dVar.g) && Intrinsics.areEqual(this.h, dVar.h);
        }

        public final File f() {
            return this.e;
        }

        public final File g() {
            return this.f5074a;
        }

        public int hashCode() {
            return (((((((((((((this.f5074a.hashCode() * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31) + Long.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
        }

        public String toString() {
            return "PreDownloadState(tempDataFile=" + this.f5074a + ", cacheDir=" + this.b + ", startByte=" + this.c + ", existingBytes=" + this.d + ", targetFile=" + this.e + ", completeFile=" + this.f + ", cacheKey=" + this.g + ", key=" + this.h + ")";
        }
    }

    public static final class e extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            Object a2 = x5.this.a((URL) null, (Deferred) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class f extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public long e;
        public /* synthetic */ Object f;
        public int h;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            Object a2 = x5.this.a((URL) null, 0L, (Pair) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class g extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public long j;
        public long k;
        public long l;
        public long m;
        public long n;
        public int o;
        public /* synthetic */ Object p;
        public int r;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.p = obj;
            this.r |= Integer.MIN_VALUE;
            Object a2 = x5.this.a((URL) null, 0L, (b) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class h extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(d dVar, Continuation continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.c.g().delete());
        }
    }

    public static final class i extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(d dVar, Continuation continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.c.g().delete());
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(d dVar, Continuation continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.c.g().delete());
        }
    }

    public static final class k extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(d dVar, Continuation continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new k(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.c.g().delete());
        }
    }

    public static final class l extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(d dVar, Continuation continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new l(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.c.g().delete());
        }
    }

    public static final class m extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(d dVar, Continuation continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new m(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.c.g().delete());
        }
    }

    public static final class n extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return x5.this.a(this);
        }
    }

    public static final class o extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public long g;
        public /* synthetic */ Object h;
        public int j;

        public o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            Object a2 = x5.this.a((URL) null, 0L, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class p extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ URL d;
        public final /* synthetic */ long e;
        public final /* synthetic */ b f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(URL url, long j, b bVar, Continuation continuation) {
            super(2, continuation);
            this.d = url;
            this.e = j;
            this.f = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return x5.this.new p(this.d, this.e, this.f, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r10 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            if (r10.a(r9) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                x5 x5Var = x5.this;
                this.b = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    a2 = ((Result) obj).getValue();
                    return Result.m8078boximpl(a2);
                }
                ResultKt.throwOnFailure(obj);
            }
            x5 x5Var2 = x5.this;
            URL url = this.d;
            long j = this.e;
            b bVar = this.f;
            this.b = 2;
            a2 = x5Var2.a(url, j, bVar, this);
        }
    }

    public static final class q extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object a2 = x5.this.a(null, null, 0L, 0L, null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class r extends ContinuationImpl {
        public Object b;
        public long c;
        public /* synthetic */ Object d;
        public int f;

        public r(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object b = x5.this.b(null, 0L, this);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Result.m8078boximpl(b);
        }
    }

    public x5(CoroutineScope cacheScope, t3 storage, m8 downloader, s3 policyManager, r3 notifier, CoroutineDispatcher ioDispatcher, Function0 cacheSizeBytesProvider, long j2, Function0 ttlMillisProvider) {
        Intrinsics.checkNotNullParameter(cacheScope, "cacheScope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(policyManager, "policyManager");
        Intrinsics.checkNotNullParameter(notifier, "notifier");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(cacheSizeBytesProvider, "cacheSizeBytesProvider");
        Intrinsics.checkNotNullParameter(ttlMillisProvider, "ttlMillisProvider");
        this.f5069a = cacheScope;
        this.b = storage;
        this.c = downloader;
        this.d = policyManager;
        this.e = notifier;
        this.f = ioDispatcher;
        this.g = cacheSizeBytesProvider;
        this.h = j2;
        this.i = ttlMillisProvider;
        this.j = new ConcurrentHashMap();
        this.k = new AtomicLong(0L);
        this.l = new AtomicBoolean(false);
        this.m = MutexKt.Mutex$default(false, 1, null);
        this.n = new ConcurrentHashMap();
        BuildersKt__Builders_commonKt.launch$default(cacheScope, ioDispatcher, null, new a(null), 2, null);
    }

    public final Pair b(URL url, long j2) {
        Object next;
        Pair pair;
        Object next2;
        String url2 = url.toString();
        Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
        ConcurrentHashMap concurrentHashMap = this.j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            String str = (String) entry.getKey();
            if (Intrinsics.areEqual(str, url2) || StringsKt.startsWith$default(str, url2 + "_", false, 2, (Object) null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        mb.a("Found " + linkedHashMap.size() + " related ongoing downloads for " + url2, (Throwable) null, 2, (Object) null);
        if (j2 == -1) {
            Deferred deferred = (Deferred) linkedHashMap.get(url2);
            if (deferred != null) {
                mb.a("Found ongoing complete download for complete file request", (Throwable) null, 2, (Object) null);
                Pair pair2 = TuplesKt.to(url2, deferred);
                if (pair2 != null) {
                    return pair2;
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!Intrinsics.areEqual((String) entry2.getKey(), url2)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                next2 = it.next();
                if (it.hasNext()) {
                    Long a2 = a((String) ((Map.Entry) next2).getKey());
                    long longValue = a2 != null ? a2.longValue() : 0L;
                    do {
                        Object next3 = it.next();
                        Long a3 = a((String) ((Map.Entry) next3).getKey());
                        long longValue2 = a3 != null ? a3.longValue() : 0L;
                        if (longValue < longValue2) {
                            next2 = next3;
                            longValue = longValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next2 = null;
            }
            Map.Entry entry3 = (Map.Entry) next2;
            if (entry3 == null) {
                return null;
            }
            Long a4 = a((String) entry3.getKey());
            mb.a("Found ongoing partial download of " + (a4 != null ? a4.longValue() : 0L) + " bytes for complete file request", (Throwable) null, 2, (Object) null);
            return new Pair(entry3.getKey(), entry3.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry4 : linkedHashMap.entrySet()) {
            String str2 = (String) entry4.getKey();
            if (!Intrinsics.areEqual(str2, url2)) {
                Long a5 = a(str2);
                if ((a5 != null ? a5.longValue() : 0L) >= j2) {
                }
            }
            linkedHashMap3.put(entry4.getKey(), entry4.getValue());
        }
        Deferred deferred2 = (Deferred) linkedHashMap3.get(url2);
        if (deferred2 == null || (pair = TuplesKt.to(url2, deferred2)) == null) {
            Iterator it2 = linkedHashMap3.entrySet().iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    Long a6 = a((String) ((Map.Entry) next).getKey());
                    long longValue3 = a6 != null ? a6.longValue() : Long.MAX_VALUE;
                    do {
                        Object next4 = it2.next();
                        Long a7 = a((String) ((Map.Entry) next4).getKey());
                        long longValue4 = a7 != null ? a7.longValue() : Long.MAX_VALUE;
                        if (longValue3 > longValue4) {
                            next = next4;
                            longValue3 = longValue4;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            Map.Entry entry5 = (Map.Entry) next;
            pair = entry5 != null ? new Pair(entry5.getKey(), entry5.getValue()) : null;
        }
        if (pair == null) {
            return null;
        }
        Long a8 = a((String) pair.component1());
        mb.a("Found ongoing " + (a8 == null ? CampaignEx.JSON_NATIVE_VIDEO_COMPLETE : a8 + " bytes") + " download that can satisfy " + j2 + " byte request", (Throwable) null, 2, (Object) null);
        return pair;
    }

    @Override // com.chartboost.sdk.impl.w6
    public Object a(URL url, Continuation continuation) {
        return w6.a.a(this, url, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #2 {all -> 0x00f5, blocks: (B:30:0x0072, B:32:0x007a, B:35:0x0080, B:37:0x0085), top: B:29:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080 A[Catch: all -> 0x00f5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00f5, blocks: (B:30:0x0072, B:32:0x007a, B:35:0x0080, B:37:0x0085), top: B:29:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        n nVar;
        int i2;
        Mutex mutex;
        x5 x5Var;
        Mutex mutex2;
        Throwable th;
        Exception e2;
        Object a2;
        x5 x5Var2;
        try {
            if (continuation instanceof n) {
                nVar = (n) continuation;
                int i3 = nVar.f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    nVar.f = i3 - Integer.MIN_VALUE;
                    Object obj = nVar.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = nVar.f;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (this.l.get()) {
                            return Unit.INSTANCE;
                        }
                        mutex = this.m;
                        nVar.b = this;
                        nVar.c = mutex;
                        nVar.f = 1;
                        if (mutex.lock(null, nVar) != coroutine_suspended) {
                            x5Var = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) nVar.c;
                        x5Var2 = (x5) nVar.b;
                        try {
                            try {
                                ResultKt.throwOnFailure(obj);
                                long longValue = ((Number) obj).longValue();
                                x5Var2.k.set(longValue);
                                mb.a("Cache initialized. Current size: " + longValue + " bytes.", (Throwable) null, 2, (Object) null);
                                x5Var2.l.set(true);
                            } catch (Exception e3) {
                                e2 = e3;
                                x5Var = x5Var2;
                                mb.b("Cache initialization failed: errorType=" + e2.getClass().getSimpleName() + ", message=" + e2.getMessage(), e2);
                                x5Var.l.set(false);
                                Unit unit = Unit.INSTANCE;
                                mutex2.unlock(null);
                                return unit;
                            }
                            Unit unit2 = Unit.INSTANCE;
                            mutex2.unlock(null);
                            return unit2;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    Mutex mutex3 = (Mutex) nVar.c;
                    x5Var = (x5) nVar.b;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    if (!x5Var.l.get()) {
                        Unit unit3 = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit3;
                    }
                    mb.a("Initializing DefaultDownloaderCache state...", (Throwable) null, 2, (Object) null);
                    try {
                        t3 t3Var = x5Var.b;
                        nVar.b = x5Var;
                        nVar.c = mutex;
                        nVar.f = 2;
                        a2 = t3Var.a(nVar);
                    } catch (Exception e4) {
                        mutex2 = mutex;
                        e2 = e4;
                        mb.b("Cache initialization failed: errorType=" + e2.getClass().getSimpleName() + ", message=" + e2.getMessage(), e2);
                        x5Var.l.set(false);
                        Unit unit22 = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return unit22;
                    }
                    if (a2 != coroutine_suspended) {
                        mutex2 = mutex;
                        obj = a2;
                        x5Var2 = x5Var;
                        long longValue2 = ((Number) obj).longValue();
                        x5Var2.k.set(longValue2);
                        mb.a("Cache initialized. Current size: " + longValue2 + " bytes.", (Throwable) null, 2, (Object) null);
                        x5Var2.l.set(true);
                        Unit unit222 = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return unit222;
                    }
                    return coroutine_suspended;
                }
            }
            if (!x5Var.l.get()) {
            }
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        nVar = new n(continuation);
        Object obj2 = nVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = nVar.f;
        if (i2 != 0) {
        }
    }

    public final boolean a(long j2, File file) {
        return j2 == -1 ? file.exists() && file.length() > 0 : file.exists() && file.length() >= j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x02d4, code lost:
    
        if (r0.a(r2, r10) == r4) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x03bc, code lost:
    
        if (r2.a((java.io.File) r0, r10) == r4) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.chartboost.sdk.impl.t3] */
    /* JADX WARN: Type inference failed for: r0v38, types: [com.chartboost.sdk.impl.t3] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.chartboost.sdk.impl.x5$o, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v17, types: [com.chartboost.sdk.impl.x5] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.chartboost.sdk.impl.t3] */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.chartboost.sdk.impl.x5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v55, types: [com.chartboost.sdk.impl.t3] */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.chartboost.sdk.impl.x5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v32, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.chartboost.sdk.impl.x5, java.lang.Object] */
    @Override // com.chartboost.sdk.impl.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(URL url, long j2, Continuation continuation) {
        o oVar;
        ?? r5;
        String str;
        x5 x5Var;
        String str2;
        Deferred deferred;
        String str3;
        URL url2;
        long j3;
        ?? r52;
        Deferred deferred2;
        String str4;
        String str5;
        String str6;
        File a2;
        b bVar;
        File file;
        q3 q3Var;
        x5 x5Var2;
        File file2;
        URL url3;
        x5 x5Var3;
        Deferred deferred3;
        String str7;
        x5 x5Var4;
        Deferred deferred4;
        String str8;
        x5 x5Var5;
        Deferred deferred5;
        x5 x5Var6;
        b bVar2;
        Deferred deferred6;
        Deferred deferred7;
        Object value;
        Object obj;
        x5 x5Var7;
        Object m8079constructorimpl;
        Object obj2;
        ?? r2 = "Download task await failed: cacheKey=";
        try {
            if (continuation instanceof o) {
                oVar = (o) continuation;
                int i2 = oVar.j;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    oVar.j = i2 - Integer.MIN_VALUE;
                    ?? r10 = oVar;
                    Object obj3 = r10.h;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r5 = r10.j;
                    switch (r5) {
                        case 0:
                            ResultKt.throwOnFailure(obj3);
                            r10.b = this;
                            url2 = url;
                            r10.c = url2;
                            j3 = j2;
                            r10.g = j3;
                            r10.j = 1;
                            if (a(r10) != coroutine_suspended) {
                                r52 = this;
                                String url4 = url2.toString();
                                Intrinsics.checkNotNullExpressionValue(url4, "toString(...)");
                                if (j3 != -1) {
                                    url4 = url4 + "_" + j3;
                                }
                                str = url4;
                                deferred2 = (Deferred) r52.j.get(str);
                                if (deferred2 == null) {
                                    mb.a("Download already in progress for " + str + ", awaiting result.", (Throwable) null, 2, (Object) null);
                                    r10.b = null;
                                    r10.c = null;
                                    r10.j = 2;
                                    Object a3 = r52.a(url2, deferred2, r10);
                                    if (a3 != coroutine_suspended) {
                                        return a3;
                                    }
                                } else {
                                    Pair b2 = r52.b(url2, j3);
                                    if (b2 != null) {
                                        mb.a("Found suitable ongoing download: " + b2.getFirst() + " for request " + str, (Throwable) null, 2, (Object) null);
                                        r10.b = null;
                                        r10.c = null;
                                        r10.j = 3;
                                        Object a4 = r52.a(url2, j3, b2, r10);
                                        if (a4 != coroutine_suspended) {
                                            return a4;
                                        }
                                    } else {
                                        b a5 = r52.a(url2, j3);
                                        if (j3 == -1) {
                                            a2 = r52.b.a(url2);
                                            str5 = "Download task await failed: cacheKey=";
                                            str4 = "Download task cancelled by caller: cacheKey=";
                                            str6 = "Removed download task reference for ";
                                        } else {
                                            str4 = "Download task cancelled by caller: cacheKey=";
                                            str5 = "Download task await failed: cacheKey=";
                                            str6 = "Removed download task reference for ";
                                            a2 = r52.b.a(new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), url2.getFile() + "?partial=" + j3));
                                        }
                                        if (j3 == -1) {
                                            ?? r1 = r52.b;
                                            r10.b = r52;
                                            r10.c = url2;
                                            r10.d = str;
                                            r10.e = a5;
                                            r10.f = a2;
                                            r10.g = j3;
                                            r10.j = 4;
                                            Object b3 = r1.b(url2, r10);
                                            if (b3 != coroutine_suspended) {
                                                bVar = a5;
                                                x5Var2 = r52;
                                                file2 = a2;
                                                url3 = url2;
                                                obj3 = b3;
                                                q3Var = (q3) obj3;
                                                file = file2;
                                                x5Var3 = x5Var2;
                                                url2 = url3;
                                                if (bVar == null && bVar.b(j3)) {
                                                    mb.a("Found suitable cached download for " + str + ": " + bVar.b().getName() + " (" + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
                                                    ?? r0 = x5Var3.b;
                                                    File b4 = bVar.b();
                                                    r10.b = bVar;
                                                    r10.c = null;
                                                    r10.d = null;
                                                    r10.e = null;
                                                    r10.f = null;
                                                    r10.j = 5;
                                                    if (r0.a(b4, r10) != coroutine_suspended) {
                                                        bVar2 = bVar;
                                                        Result.Companion companion = Result.INSTANCE;
                                                        return Result.m8079constructorimpl(bVar2.b());
                                                    }
                                                } else {
                                                    if (x5Var3.a(j3, file)) {
                                                        if (q3Var != null && x5Var3.d.a(q3Var)) {
                                                            mb.a("Cache hit for " + str + ", but file has expired. Will be evicted during download.", (Throwable) null, 2, (Object) null);
                                                        } else {
                                                            mb.a("Cache hit for " + str + " at " + file.getAbsolutePath(), (Throwable) null, 2, (Object) null);
                                                            ?? r02 = x5Var3.b;
                                                            r10.b = file;
                                                            r10.c = null;
                                                            r10.d = null;
                                                            r10.e = null;
                                                            r10.f = null;
                                                            r10.j = 6;
                                                            break;
                                                        }
                                                    } else {
                                                        mb.a("Cache miss for " + str + ".", (Throwable) null, 2, (Object) null);
                                                    }
                                                    deferred = BuildersKt__Builders_commonKt.async$default(x5Var3.f5069a, x5Var3.f, null, x5Var3.new p(url2, j3, bVar, null), 2, null);
                                                    deferred3 = (Deferred) x5Var3.j.putIfAbsent(str, deferred);
                                                    if (deferred3 != null) {
                                                        mb.a("Race condition detected for " + str + " download start. Cancelling redundant task and awaiting existing.", (Throwable) null, 2, (Object) null);
                                                        JobKt__JobKt.cancel$default(deferred, "Race condition resolved by existing download for " + str, null, 2, null);
                                                        r10.b = null;
                                                        r10.c = null;
                                                        r10.d = null;
                                                        r10.e = null;
                                                        r10.f = null;
                                                        r10.j = 7;
                                                        Object a6 = x5Var3.a(url2, deferred3, (Continuation) r10);
                                                        if (a6 != coroutine_suspended) {
                                                            return a6;
                                                        }
                                                    } else {
                                                        mb.a("Successfully registered download task for " + str + ". Awaiting result.", (Throwable) null, 2, (Object) null);
                                                        try {
                                                            r10.b = x5Var3;
                                                            r10.c = str;
                                                            r10.d = deferred;
                                                            r10.e = null;
                                                            r10.f = null;
                                                            r10.j = 8;
                                                            obj3 = deferred.await(r10);
                                                            if (obj3 != coroutine_suspended) {
                                                                x5Var6 = x5Var3;
                                                                str3 = str;
                                                                r5 = deferred;
                                                                try {
                                                                    value = ((Result) obj3).getValue();
                                                                    if (Result.m8086isSuccessimpl(value)) {
                                                                        try {
                                                                            ?? r22 = x5Var6.b;
                                                                            r10.b = x5Var6;
                                                                            r10.c = str3;
                                                                            r10.d = r5;
                                                                            r10.e = value;
                                                                            r10.f = value;
                                                                            r10.j = 9;
                                                                            break;
                                                                        } catch (CancellationException e2) {
                                                                            e = e2;
                                                                            x5Var5 = x5Var6;
                                                                            str8 = str6;
                                                                            deferred5 = r5;
                                                                            mb.e(str4 + str3, null, 2, null);
                                                                            deferred5.cancel(e);
                                                                            Result.Companion companion2 = Result.INSTANCE;
                                                                            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(e));
                                                                            x5Var5.j.remove(str3, deferred5);
                                                                            String str9 = str8 + str3 + ".";
                                                                            r2 = 2;
                                                                            mb.a(str9, (Throwable) null, 2, (Object) null);
                                                                            r5 = deferred5;
                                                                            r10 = x5Var5;
                                                                            return m8079constructorimpl;
                                                                        } catch (Exception e3) {
                                                                            e = e3;
                                                                            x5Var4 = x5Var6;
                                                                            str7 = str6;
                                                                            deferred4 = r5;
                                                                            mb.b(str5 + str3 + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                                                            Result.Companion companion3 = Result.INSTANCE;
                                                                            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(e));
                                                                            x5Var4.j.remove(str3, deferred4);
                                                                            String str10 = str7 + str3 + ".";
                                                                            r2 = 2;
                                                                            mb.a(str10, (Throwable) null, 2, (Object) null);
                                                                            r5 = deferred4;
                                                                            r10 = x5Var4;
                                                                            return m8079constructorimpl;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            r10 = x5Var6;
                                                                            r2 = str6;
                                                                            deferred = r5;
                                                                            x5Var = r10;
                                                                            str = str3;
                                                                            str2 = r2;
                                                                            x5Var.j.remove(str, deferred);
                                                                            mb.a(str2 + str + ".", (Throwable) null, 2, (Object) null);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    obj = value;
                                                                    x5Var7 = x5Var6;
                                                                    obj2 = r5;
                                                                    x5Var7.j.remove(str3, obj2);
                                                                    mb.a(str6 + str3 + ".", (Throwable) null, 2, (Object) null);
                                                                    return obj;
                                                                } catch (CancellationException e4) {
                                                                    e = e4;
                                                                    str8 = str6;
                                                                    deferred7 = r5;
                                                                    x5Var5 = x5Var6;
                                                                    deferred5 = deferred7;
                                                                    mb.e(str4 + str3, null, 2, null);
                                                                    deferred5.cancel(e);
                                                                    Result.Companion companion22 = Result.INSTANCE;
                                                                    m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(e));
                                                                    x5Var5.j.remove(str3, deferred5);
                                                                    String str92 = str8 + str3 + ".";
                                                                    r2 = 2;
                                                                    mb.a(str92, (Throwable) null, 2, (Object) null);
                                                                    r5 = deferred5;
                                                                    r10 = x5Var5;
                                                                    return m8079constructorimpl;
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    str7 = str6;
                                                                    deferred6 = r5;
                                                                    x5Var4 = x5Var6;
                                                                    deferred4 = deferred6;
                                                                    mb.b(str5 + str3 + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                                                    Result.Companion companion32 = Result.INSTANCE;
                                                                    m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(e));
                                                                    x5Var4.j.remove(str3, deferred4);
                                                                    String str102 = str7 + str3 + ".";
                                                                    r2 = 2;
                                                                    mb.a(str102, (Throwable) null, 2, (Object) null);
                                                                    r5 = deferred4;
                                                                    r10 = x5Var4;
                                                                    return m8079constructorimpl;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    r2 = str6;
                                                                    r5 = r5;
                                                                    r10 = x5Var6;
                                                                    deferred = r5;
                                                                    x5Var = r10;
                                                                    str = str3;
                                                                    str2 = r2;
                                                                    x5Var.j.remove(str, deferred);
                                                                    mb.a(str2 + str + ".", (Throwable) null, 2, (Object) null);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (CancellationException e6) {
                                                            e = e6;
                                                            str8 = str6;
                                                            x5Var5 = x5Var3;
                                                            str3 = str;
                                                            deferred5 = deferred;
                                                            mb.e(str4 + str3, null, 2, null);
                                                            deferred5.cancel(e);
                                                            Result.Companion companion222 = Result.INSTANCE;
                                                            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(e));
                                                            x5Var5.j.remove(str3, deferred5);
                                                            String str922 = str8 + str3 + ".";
                                                            r2 = 2;
                                                            mb.a(str922, (Throwable) null, 2, (Object) null);
                                                            r5 = deferred5;
                                                            r10 = x5Var5;
                                                            return m8079constructorimpl;
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            str7 = str6;
                                                            x5Var4 = x5Var3;
                                                            str3 = str;
                                                            deferred4 = deferred;
                                                            mb.b(str5 + str3 + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                                            Result.Companion companion322 = Result.INSTANCE;
                                                            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(e));
                                                            x5Var4.j.remove(str3, deferred4);
                                                            String str1022 = str7 + str3 + ".";
                                                            r2 = 2;
                                                            mb.a(str1022, (Throwable) null, 2, (Object) null);
                                                            r5 = deferred4;
                                                            r10 = x5Var4;
                                                            return m8079constructorimpl;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            str2 = str6;
                                                            x5Var = x5Var3;
                                                            x5Var.j.remove(str, deferred);
                                                            mb.a(str2 + str + ".", (Throwable) null, 2, (Object) null);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            bVar = a5;
                                            file = a2;
                                            q3Var = null;
                                            x5Var3 = r52;
                                            if (bVar == null) {
                                            }
                                            if (x5Var3.a(j3, file)) {
                                            }
                                            deferred = BuildersKt__Builders_commonKt.async$default(x5Var3.f5069a, x5Var3.f, null, x5Var3.new p(url2, j3, bVar, null), 2, null);
                                            deferred3 = (Deferred) x5Var3.j.putIfAbsent(str, deferred);
                                            if (deferred3 != null) {
                                            }
                                        }
                                    }
                                }
                            }
                            return coroutine_suspended;
                        case 1:
                            j3 = r10.g;
                            URL url5 = (URL) r10.c;
                            x5 x5Var8 = (x5) r10.b;
                            ResultKt.throwOnFailure(obj3);
                            url2 = url5;
                            r52 = x5Var8;
                            String url42 = url2.toString();
                            Intrinsics.checkNotNullExpressionValue(url42, "toString(...)");
                            if (j3 != -1) {
                            }
                            str = url42;
                            deferred2 = (Deferred) r52.j.get(str);
                            if (deferred2 == null) {
                            }
                            return coroutine_suspended;
                        case 2:
                            ResultKt.throwOnFailure(obj3);
                            return ((Result) obj3).getValue();
                        case 3:
                            ResultKt.throwOnFailure(obj3);
                            return ((Result) obj3).getValue();
                        case 4:
                            j3 = r10.g;
                            file2 = (File) r10.f;
                            bVar = (b) r10.e;
                            str = (String) r10.d;
                            url3 = (URL) r10.c;
                            x5Var2 = (x5) r10.b;
                            ResultKt.throwOnFailure(obj3);
                            str5 = "Download task await failed: cacheKey=";
                            str4 = "Download task cancelled by caller: cacheKey=";
                            str6 = "Removed download task reference for ";
                            q3Var = (q3) obj3;
                            file = file2;
                            x5Var3 = x5Var2;
                            url2 = url3;
                            if (bVar == null) {
                            }
                            if (x5Var3.a(j3, file)) {
                            }
                            deferred = BuildersKt__Builders_commonKt.async$default(x5Var3.f5069a, x5Var3.f, null, x5Var3.new p(url2, j3, bVar, null), 2, null);
                            deferred3 = (Deferred) x5Var3.j.putIfAbsent(str, deferred);
                            if (deferred3 != null) {
                            }
                            return coroutine_suspended;
                        case 5:
                            bVar2 = (b) r10.b;
                            ResultKt.throwOnFailure(obj3);
                            Result.Companion companion4 = Result.INSTANCE;
                            return Result.m8079constructorimpl(bVar2.b());
                        case 6:
                            file = (File) r10.b;
                            ResultKt.throwOnFailure(obj3);
                            Result.Companion companion5 = Result.INSTANCE;
                            return Result.m8079constructorimpl(file);
                        case 7:
                            ResultKt.throwOnFailure(obj3);
                            return ((Result) obj3).getValue();
                        case 8:
                            Deferred deferred8 = (Deferred) r10.d;
                            str3 = (String) r10.c;
                            x5Var6 = (x5) r10.b;
                            try {
                                ResultKt.throwOnFailure(obj3);
                                str5 = "Download task await failed: cacheKey=";
                                str4 = "Download task cancelled by caller: cacheKey=";
                                str6 = "Removed download task reference for ";
                                r5 = deferred8;
                                value = ((Result) obj3).getValue();
                                if (Result.m8086isSuccessimpl(value)) {
                                }
                                obj = value;
                                x5Var7 = x5Var6;
                                obj2 = r5;
                                x5Var7.j.remove(str3, obj2);
                                mb.a(str6 + str3 + ".", (Throwable) null, 2, (Object) null);
                                return obj;
                            } catch (CancellationException e8) {
                                e = e8;
                                str4 = "Download task cancelled by caller: cacheKey=";
                                str8 = "Removed download task reference for ";
                                deferred7 = deferred8;
                                x5Var5 = x5Var6;
                                deferred5 = deferred7;
                                mb.e(str4 + str3, null, 2, null);
                                deferred5.cancel(e);
                                Result.Companion companion2222 = Result.INSTANCE;
                                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(e));
                                x5Var5.j.remove(str3, deferred5);
                                String str9222 = str8 + str3 + ".";
                                r2 = 2;
                                mb.a(str9222, (Throwable) null, 2, (Object) null);
                                r5 = deferred5;
                                r10 = x5Var5;
                                return m8079constructorimpl;
                            } catch (Exception e9) {
                                e = e9;
                                str5 = "Download task await failed: cacheKey=";
                                str7 = "Removed download task reference for ";
                                deferred6 = deferred8;
                                x5Var4 = x5Var6;
                                deferred4 = deferred6;
                                mb.b(str5 + str3 + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                Result.Companion companion3222 = Result.INSTANCE;
                                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(e));
                                x5Var4.j.remove(str3, deferred4);
                                String str10222 = str7 + str3 + ".";
                                r2 = 2;
                                mb.a(str10222, (Throwable) null, 2, (Object) null);
                                r5 = deferred4;
                                r10 = x5Var4;
                                return m8079constructorimpl;
                            } catch (Throwable th4) {
                                th = th4;
                                r2 = "Removed download task reference for ";
                                r5 = deferred8;
                                r10 = x5Var6;
                                deferred = r5;
                                x5Var = r10;
                                str = str3;
                                str2 = r2;
                                x5Var.j.remove(str, deferred);
                                mb.a(str2 + str + ".", (Throwable) null, 2, (Object) null);
                                throw th;
                            }
                        case 9:
                            obj = r10.e;
                            r5 = (Deferred) r10.d;
                            str3 = (String) r10.c;
                            r10 = (x5) r10.b;
                            try {
                                ResultKt.throwOnFailure(obj3);
                                str6 = "Removed download task reference for ";
                                obj2 = r5;
                                x5Var7 = r10;
                                x5Var7.j.remove(str3, obj2);
                                mb.a(str6 + str3 + ".", (Throwable) null, 2, (Object) null);
                                return obj;
                            } catch (CancellationException e10) {
                                e = e10;
                                str4 = "Download task cancelled by caller: cacheKey=";
                                str8 = "Removed download task reference for ";
                                deferred5 = r5;
                                x5Var5 = r10;
                                mb.e(str4 + str3, null, 2, null);
                                deferred5.cancel(e);
                                Result.Companion companion22222 = Result.INSTANCE;
                                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(e));
                                x5Var5.j.remove(str3, deferred5);
                                String str92222 = str8 + str3 + ".";
                                r2 = 2;
                                mb.a(str92222, (Throwable) null, 2, (Object) null);
                                r5 = deferred5;
                                r10 = x5Var5;
                                return m8079constructorimpl;
                            } catch (Exception e11) {
                                e = e11;
                                str5 = "Download task await failed: cacheKey=";
                                str7 = "Removed download task reference for ";
                                deferred4 = r5;
                                x5Var4 = r10;
                                mb.b(str5 + str3 + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                Result.Companion companion32222 = Result.INSTANCE;
                                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(e));
                                x5Var4.j.remove(str3, deferred4);
                                String str102222 = str7 + str3 + ".";
                                r2 = 2;
                                mb.a(str102222, (Throwable) null, 2, (Object) null);
                                r5 = deferred4;
                                r10 = x5Var4;
                                return m8079constructorimpl;
                            } catch (Throwable th5) {
                                th = th5;
                                r2 = "Removed download task reference for ";
                                deferred = r5;
                                x5Var = r10;
                                str = str3;
                                str2 = r2;
                                x5Var.j.remove(str, deferred);
                                mb.a(str2 + str + ".", (Throwable) null, 2, (Object) null);
                                throw th;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (r5) {
            }
        } catch (Throwable th6) {
            th = th6;
        }
        oVar = new o(continuation);
        ?? r102 = oVar;
        Object obj32 = r102.h;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = r102.j;
    }

    public final Long a(String str) {
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "_", false, 2, (Object) null)) {
            return StringsKt.toLongOrNull(StringsKt.substringAfterLast$default(str, "_", (String) null, 2, (Object) null));
        }
        return null;
    }

    public final b a(URL url, long j2) {
        String url2 = url.toString();
        Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
        b bVar = (b) this.n.get(url2);
        if (bVar == null) {
            return null;
        }
        if (!bVar.b().exists()) {
            this.n.remove(url2);
            return null;
        }
        if (j2 == -1) {
            mb.a("Found cached download to resume complete file for " + url2 + ": " + bVar.a() + " bytes (complete=" + bVar.c() + ")", (Throwable) null, 2, (Object) null);
            return bVar;
        }
        if (bVar.b(j2)) {
            mb.a("Found suitable cached download for " + url2 + ": " + bVar.a() + " bytes (requested " + j2 + ")", (Throwable) null, 2, (Object) null);
            return bVar;
        }
        if (bVar.a(j2)) {
            mb.a("Found cached download to resume from for " + url2 + ": " + bVar.a() + " bytes (requested " + j2 + ")", (Throwable) null, 2, (Object) null);
            return bVar;
        }
        mb.a("Cached download exists but can't be used for " + url2 + ": " + bVar.a() + " bytes (requested " + j2 + ")", (Throwable) null, 2, (Object) null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:340:0x0964, code lost:
    
        if (r3 == r2) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x08a5, code lost:
    
        r3 = r1.getAbsolutePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x04fd, code lost:
    
        if (r14.d.a(r2) == false) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 71, insn: 0x039a: MOVE (r3 I:??[OBJECT, ARRAY]) = (r71 I:??[OBJECT, ARRAY]), block:B:524:0x039a */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0bc7 A[Catch: all -> 0x116f, TryCatch #6 {all -> 0x116f, blocks: (B:124:0x0bbc, B:127:0x0bc3, B:129:0x0bc7, B:133:0x0bda, B:138:0x0c00, B:140:0x0c12, B:141:0x0c1a, B:146:0x0c63, B:156:0x0caf, B:164:0x0cd1, B:165:0x0d40, B:167:0x0d51, B:177:0x0d0e, B:178:0x0d3c, B:180:0x0bf1, B:182:0x10e2, B:184:0x10ec, B:185:0x10f4), top: B:123:0x0bbc }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x10dd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0a9d A[Catch: CancellationException -> 0x0abb, TryCatch #21 {CancellationException -> 0x0abb, blocks: (B:203:0x0a97, B:205:0x0a9d, B:208:0x0aa7, B:231:0x0ab0), top: B:202:0x0a97 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0ab0 A[Catch: CancellationException -> 0x0abb, TRY_LEAVE, TryCatch #21 {CancellationException -> 0x0abb, blocks: (B:203:0x0a97, B:205:0x0a9d, B:208:0x0aa7, B:231:0x0ab0), top: B:202:0x0a97 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0a0d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x09a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x072e A[Catch: all -> 0x11b3, TryCatch #7 {all -> 0x11b3, blocks: (B:322:0x0726, B:324:0x072e, B:350:0x0787, B:352:0x0791, B:355:0x0799, B:357:0x07c7, B:359:0x07cd, B:361:0x07ef, B:362:0x0842, B:366:0x0817, B:367:0x0836, B:369:0x08a5, B:371:0x08ad, B:372:0x08b7), top: B:321:0x0726, inners: #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0787 A[Catch: all -> 0x11b3, TryCatch #7 {all -> 0x11b3, blocks: (B:322:0x0726, B:324:0x072e, B:350:0x0787, B:352:0x0791, B:355:0x0799, B:357:0x07c7, B:359:0x07cd, B:361:0x07ef, B:362:0x0842, B:366:0x0817, B:367:0x0836, B:369:0x08a5, B:371:0x08ad, B:372:0x08b7), top: B:321:0x0726, inners: #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0f39 A[Catch: all -> 0x019d, TryCatch #41 {all -> 0x019d, blocks: (B:13:0x00ce, B:27:0x00de, B:28:0x0fc1, B:33:0x0f31, B:35:0x0f39, B:37:0x0f5b, B:38:0x0f63, B:43:0x0fe5, B:47:0x0ff1, B:48:0x1016, B:56:0x012c, B:57:0x0e9b, B:117:0x018a, B:118:0x0c7d, B:120:0x0198, B:121:0x1146), top: B:7:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0fe5 A[Catch: all -> 0x019d, TryCatch #41 {all -> 0x019d, blocks: (B:13:0x00ce, B:27:0x00de, B:28:0x0fc1, B:33:0x0f31, B:35:0x0f39, B:37:0x0f5b, B:38:0x0f63, B:43:0x0fe5, B:47:0x0ff1, B:48:0x1016, B:56:0x012c, B:57:0x0e9b, B:117:0x018a, B:118:0x0c7d, B:120:0x0198, B:121:0x1146), top: B:7:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0551 A[Catch: all -> 0x11bc, TRY_ENTER, TryCatch #13 {all -> 0x11bc, blocks: (B:423:0x04df, B:429:0x0589, B:449:0x060b, B:451:0x0613, B:462:0x0551), top: B:422:0x04df }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x04e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0459 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0440 A[Catch: all -> 0x11c5, TRY_LEAVE, TryCatch #22 {all -> 0x11c5, blocks: (B:491:0x0431, B:496:0x04ae, B:515:0x0440), top: B:490:0x0431 }] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0e17  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0e26 A[Catch: all -> 0x0edc, TRY_LEAVE, TryCatch #40 {all -> 0x0edc, blocks: (B:68:0x0e1b, B:70:0x0e26), top: B:67:0x0e1b }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0ec7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0f24  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0dd8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00aa  */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v6, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v103, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v206 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(URL url, long j2, b bVar, Continuation continuation) {
        String str;
        g gVar;
        Throwable th;
        ?? r15;
        Mutex mutex;
        Mutex mutex2;
        Throwable th2;
        ?? r3;
        Mutex mutex3;
        Mutex mutex4;
        String str2;
        String str3;
        long j3;
        x5 x5Var;
        URL url2;
        b bVar2;
        String str4;
        long j4;
        String str5;
        String str6;
        long j5;
        Mutex mutex5;
        String str7;
        String str8;
        x5 x5Var2;
        URL url3;
        b bVar3;
        long j6;
        String str9;
        File a2;
        String str10;
        File file;
        x5 x5Var3;
        String str11;
        b bVar4;
        String str12;
        URL url4;
        Mutex mutex6;
        c aVar;
        Object obj;
        Mutex mutex7;
        long j7;
        Mutex mutex8;
        b bVar5;
        String str13;
        File file2;
        Object obj2;
        long j8;
        long j9;
        Object obj3;
        File file3;
        String str14;
        File file4;
        long j10;
        Mutex mutex9;
        Object obj4;
        File file5;
        b bVar6;
        File file6;
        x5 x5Var4;
        long j11;
        String str15;
        long j12;
        long j13;
        Mutex mutex10;
        long j14;
        Mutex mutex11;
        long j15;
        long j16;
        b bVar7;
        x5 x5Var5;
        String str16;
        File file7;
        long j17;
        Throwable th3;
        Mutex mutex12;
        d a3;
        Exception exc;
        final x5 x5Var6;
        URL url5;
        b bVar8;
        d dVar;
        Object obj5;
        CancellationException cancellationException;
        Object a4;
        Mutex mutex13;
        long j18;
        Pair pair;
        String simpleName;
        CancellationException cancellationException2;
        long j19;
        long length;
        long j20;
        Object obj6;
        String str17;
        String str18;
        String str19;
        Object obj7;
        Object obj8;
        long j21;
        long j22;
        Object m8079constructorimpl;
        Exception exc2;
        NonCancellable nonCancellable;
        h hVar;
        String str20;
        Mutex mutex14;
        Object obj9;
        d dVar2;
        Throwable m8082exceptionOrNullimpl;
        d dVar3;
        Object m8079constructorimpl2;
        Long l2;
        Mutex mutex15;
        b bVar9;
        long j23;
        long d2;
        int i2;
        Object obj10;
        File f2;
        int i3;
        b bVar10;
        URL url6;
        long j24;
        x5 x5Var7;
        File file8;
        long j25;
        long j26;
        URL url7;
        Object obj11;
        int i4;
        long j27;
        File file9;
        d dVar4;
        Mutex mutex16;
        x5 x5Var8;
        long j28;
        long j29;
        b bVar11;
        long j30;
        Object m8079constructorimpl3;
        Object obj12;
        int i5;
        b bVar12;
        d dVar5;
        File file10;
        long j31;
        URL url8;
        long j32;
        long longValue;
        Mutex mutex17;
        Mutex mutex18;
        g gVar2;
        d dVar6;
        String str21;
        x5 x5Var9;
        URL url9;
        long j33;
        d dVar7;
        try {
            try {
                try {
                    if (continuation instanceof g) {
                        gVar = (g) continuation;
                        str = "Download failed: cacheKey=";
                        int i6 = gVar.r;
                        if ((i6 & Integer.MIN_VALUE) != 0) {
                            gVar.r = i6 - Integer.MIN_VALUE;
                            Object obj13 = gVar.p;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            String str22 = ", downloadedBytes=";
                            switch (gVar.r) {
                                case 0:
                                    ResultKt.throwOnFailure(obj13);
                                    long longValue2 = ((Number) this.g.invoke()).longValue();
                                    mutex4 = this.m;
                                    gVar.b = this;
                                    gVar.c = url;
                                    gVar.d = bVar;
                                    gVar.e = mutex4;
                                    str2 = "Not enough free space on device for ";
                                    str3 = "Disk space insufficient: cacheKey=";
                                    j3 = j2;
                                    gVar.j = j3;
                                    gVar.k = longValue2;
                                    gVar.r = 1;
                                    if (mutex4.lock(null, gVar) != coroutine_suspended) {
                                        x5Var = this;
                                        url2 = url;
                                        bVar2 = bVar;
                                        str4 = "Evicting expired file ";
                                        j4 = longValue2;
                                        str5 = "Expired file ";
                                        str6 = "temp_";
                                        j5 = j4;
                                        try {
                                            String url10 = url2.toString();
                                            Intrinsics.checkNotNullExpressionValue(url10, "toString(...)");
                                            if (j3 != -1) {
                                                str7 = "toString(...)";
                                                str8 = url10;
                                            } else {
                                                str7 = "toString(...)";
                                                str8 = url10 + "_" + j3;
                                            }
                                            try {
                                                if (bVar2 != null) {
                                                    try {
                                                        if (bVar2.b(j3)) {
                                                            mb.a("File for " + str8 + " already available after acquiring lock from partial download.", (Throwable) null, 2, (Object) null);
                                                            t3 t3Var = x5Var.b;
                                                            File b2 = bVar2.b();
                                                            gVar.b = x5Var;
                                                            gVar.c = url2;
                                                            gVar.d = bVar2;
                                                            gVar.e = mutex4;
                                                            gVar.j = j3;
                                                            gVar.k = j5;
                                                            gVar.r = 2;
                                                            if (t3Var.a(b2, gVar) != coroutine_suspended) {
                                                                mutex2 = mutex4;
                                                                x5Var2 = x5Var;
                                                                url3 = url2;
                                                                bVar3 = bVar2;
                                                                j6 = j5;
                                                                aVar = new c.a(bVar3.b());
                                                                obj = coroutine_suspended;
                                                                mutex12 = mutex2;
                                                                mutex12.unlock(null);
                                                                if (!(aVar instanceof c.a)) {
                                                                    Result.Companion companion = Result.INSTANCE;
                                                                    return Result.m8079constructorimpl(((c.a) aVar).a());
                                                                }
                                                                if (aVar instanceof c.b) {
                                                                    Result.Companion companion2 = Result.INSTANCE;
                                                                    return Result.m8079constructorimpl(ResultKt.createFailure(((c.b) aVar).a()));
                                                                }
                                                                if (aVar instanceof c.C0223c) {
                                                                    a3 = ((c.C0223c) aVar).a();
                                                                    try {
                                                                        Result.Companion companion3 = Result.INSTANCE;
                                                                        File g2 = a3.g();
                                                                        long e2 = a3.e();
                                                                        File a5 = a3.a();
                                                                        gVar.b = x5Var2;
                                                                        gVar.c = url3;
                                                                        gVar.d = bVar3;
                                                                        gVar.e = a3;
                                                                        gVar.f = null;
                                                                        gVar.g = null;
                                                                        gVar.h = null;
                                                                        gVar.i = null;
                                                                        gVar.j = j3;
                                                                        gVar.k = j6;
                                                                        gVar.r = 8;
                                                                        a4 = x5Var2.a(url3, g2, j3, e2, a5, gVar);
                                                                        break;
                                                                    } catch (CancellationException e3) {
                                                                        obj5 = obj;
                                                                        dVar = a3;
                                                                        cancellationException = e3;
                                                                        try {
                                                                            throw cancellationException;
                                                                        } catch (CancellationException e4) {
                                                                            e = e4;
                                                                            cancellationException2 = e;
                                                                            nonCancellable = NonCancellable.INSTANCE;
                                                                            hVar = new h(dVar, null);
                                                                            gVar.b = cancellationException2;
                                                                            gVar.c = null;
                                                                            gVar.d = null;
                                                                            gVar.e = null;
                                                                            gVar.f = null;
                                                                            gVar.g = null;
                                                                            gVar.h = null;
                                                                            gVar.i = null;
                                                                            gVar.r = 10;
                                                                            if (BuildersKt.withContext(nonCancellable, hVar, gVar) == obj5) {
                                                                            }
                                                                        }
                                                                    } catch (Exception e5) {
                                                                        exc = e5;
                                                                        x5Var6 = x5Var2;
                                                                        url5 = url3;
                                                                        bVar8 = bVar3;
                                                                        dVar = a3;
                                                                        try {
                                                                            simpleName = exc.getClass().getSimpleName();
                                                                            if (dVar.g().exists()) {
                                                                                try {
                                                                                    j19 = j6;
                                                                                    length = dVar.g().length();
                                                                                } catch (CancellationException e6) {
                                                                                    cancellationException2 = e6;
                                                                                    obj5 = obj;
                                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                                    hVar = new h(dVar, null);
                                                                                    gVar.b = cancellationException2;
                                                                                    gVar.c = null;
                                                                                    gVar.d = null;
                                                                                    gVar.e = null;
                                                                                    gVar.f = null;
                                                                                    gVar.g = null;
                                                                                    gVar.h = null;
                                                                                    gVar.i = null;
                                                                                    gVar.r = 10;
                                                                                    if (BuildersKt.withContext(nonCancellable, hVar, gVar) == obj5) {
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                j19 = j6;
                                                                                length = 0;
                                                                            }
                                                                            String b3 = dVar.b();
                                                                            j20 = j3;
                                                                            long e7 = dVar.e();
                                                                            String message = exc.getMessage();
                                                                            obj6 = obj;
                                                                            try {
                                                                                StringBuilder append = new StringBuilder(str).append(b3).append(", startByte=").append(e7);
                                                                                str17 = str22;
                                                                                StringBuilder append2 = append.append(str17).append(length);
                                                                                str18 = ", errorType=";
                                                                                str19 = ", message=";
                                                                                mb.b(append2.append(str18).append(simpleName).append(str19).append(message).toString(), exc);
                                                                                try {
                                                                                    if (dVar.e() > 0) {
                                                                                        try {
                                                                                            if (exc instanceof IOException) {
                                                                                                mb.e("Download retry from beginning: cacheKey=" + dVar.b() + ", previousStartByte=" + dVar.e() + str18 + simpleName, null, 2, null);
                                                                                                if (dVar.g().exists()) {
                                                                                                    try {
                                                                                                        dVar.g().delete();
                                                                                                    } catch (CancellationException e8) {
                                                                                                        cancellationException2 = e8;
                                                                                                        obj5 = obj6;
                                                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                                                        hVar = new h(dVar, null);
                                                                                                        gVar.b = cancellationException2;
                                                                                                        gVar.c = null;
                                                                                                        gVar.d = null;
                                                                                                        gVar.e = null;
                                                                                                        gVar.f = null;
                                                                                                        gVar.g = null;
                                                                                                        gVar.h = null;
                                                                                                        gVar.i = null;
                                                                                                        gVar.r = 10;
                                                                                                        if (BuildersKt.withContext(nonCancellable, hVar, gVar) == obj5) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                File g3 = dVar.g();
                                                                                                File a6 = dVar.a();
                                                                                                gVar.b = x5Var6;
                                                                                                gVar.c = url5;
                                                                                                gVar.d = bVar8;
                                                                                                gVar.e = dVar;
                                                                                                gVar.f = exc;
                                                                                                gVar.g = null;
                                                                                                gVar.h = null;
                                                                                                gVar.i = null;
                                                                                                gVar.j = j20;
                                                                                                long j34 = j19;
                                                                                                gVar.k = j34;
                                                                                                gVar.r = 9;
                                                                                                Object a7 = x5Var6.a(url5, g3, j20, 0L, a6, gVar);
                                                                                                obj7 = obj6;
                                                                                                if (a7 != obj7) {
                                                                                                    obj8 = a7;
                                                                                                    a3 = dVar;
                                                                                                    j21 = j20;
                                                                                                    j22 = j34;
                                                                                                    try {
                                                                                                        if (!Result.m8085isFailureimpl(obj8)) {
                                                                                                        }
                                                                                                        m8079constructorimpl = m8079constructorimpl2;
                                                                                                        if (!Result.m8085isFailureimpl(m8079constructorimpl)) {
                                                                                                        }
                                                                                                    } catch (CancellationException e9) {
                                                                                                        cancellationException2 = e9;
                                                                                                        dVar = a3;
                                                                                                        obj5 = obj7;
                                                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                                                        hVar = new h(dVar, null);
                                                                                                        gVar.b = cancellationException2;
                                                                                                        gVar.c = null;
                                                                                                        gVar.d = null;
                                                                                                        gVar.e = null;
                                                                                                        gVar.f = null;
                                                                                                        gVar.g = null;
                                                                                                        gVar.h = null;
                                                                                                        gVar.i = null;
                                                                                                        gVar.r = 10;
                                                                                                        if (BuildersKt.withContext(nonCancellable, hVar, gVar) == obj5) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                return obj7;
                                                                                            }
                                                                                        } catch (CancellationException e10) {
                                                                                            obj7 = obj6;
                                                                                            cancellationException2 = e10;
                                                                                            obj5 = obj7;
                                                                                            nonCancellable = NonCancellable.INSTANCE;
                                                                                            hVar = new h(dVar, null);
                                                                                            gVar.b = cancellationException2;
                                                                                            gVar.c = null;
                                                                                            gVar.d = null;
                                                                                            gVar.e = null;
                                                                                            gVar.f = null;
                                                                                            gVar.g = null;
                                                                                            gVar.h = null;
                                                                                            gVar.i = null;
                                                                                            gVar.r = 10;
                                                                                            if (BuildersKt.withContext(nonCancellable, hVar, gVar) == obj5) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    Result.Companion companion4 = Result.INSTANCE;
                                                                                    m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(exc));
                                                                                    a3 = dVar;
                                                                                    j21 = j20;
                                                                                    j22 = r1;
                                                                                    if (!Result.m8085isFailureimpl(m8079constructorimpl)) {
                                                                                    }
                                                                                    return obj7;
                                                                                } catch (CancellationException e11) {
                                                                                    e = e11;
                                                                                    obj5 = obj7;
                                                                                    cancellationException2 = e;
                                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                                    hVar = new h(dVar, null);
                                                                                    gVar.b = cancellationException2;
                                                                                    gVar.c = null;
                                                                                    gVar.d = null;
                                                                                    gVar.e = null;
                                                                                    gVar.f = null;
                                                                                    gVar.g = null;
                                                                                    gVar.h = null;
                                                                                    gVar.i = null;
                                                                                    gVar.r = 10;
                                                                                    if (BuildersKt.withContext(nonCancellable, hVar, gVar) == obj5) {
                                                                                    }
                                                                                }
                                                                                long j35 = j19;
                                                                                obj7 = obj6;
                                                                            } catch (CancellationException e12) {
                                                                                e = e12;
                                                                                obj5 = obj6;
                                                                            }
                                                                        } catch (CancellationException e13) {
                                                                            e = e13;
                                                                            obj5 = obj;
                                                                        }
                                                                    }
                                                                } else {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th4) {
                                                        th2 = th4;
                                                        r3 = mutex4;
                                                        mutex3 = r3;
                                                        mutex3.unlock(null);
                                                        throw th2;
                                                    }
                                                }
                                                gVar.r = 3;
                                                obj13 = r3.b(url2, gVar);
                                                if (obj13 != coroutine_suspended) {
                                                    file = a2;
                                                    x5Var3 = x5Var;
                                                    str11 = str8;
                                                    bVar4 = bVar2;
                                                    str12 = url10;
                                                    url4 = url2;
                                                    mutex6 = mutex5;
                                                    try {
                                                        q3 q3Var = (q3) obj13;
                                                        if (j3 != -1) {
                                                            try {
                                                                if (file.exists() && file.length() >= j3) {
                                                                    if (q3Var != null) {
                                                                        str13 = str12;
                                                                        break;
                                                                    }
                                                                    mb.a("Complete file exists and satisfies partial request for " + str11, (Throwable) null, 2, (Object) null);
                                                                    t3 t3Var2 = x5Var3.b;
                                                                    gVar.b = x5Var3;
                                                                    gVar.c = url4;
                                                                    gVar.d = bVar4;
                                                                    gVar.e = mutex6;
                                                                    gVar.f = file;
                                                                    gVar.g = null;
                                                                    gVar.h = null;
                                                                    gVar.j = j3;
                                                                    gVar.k = j5;
                                                                    gVar.r = 4;
                                                                    if (t3Var2.a(file, gVar) != coroutine_suspended) {
                                                                        j7 = j5;
                                                                        mutex8 = mutex6;
                                                                        bVar5 = bVar4;
                                                                        aVar = new c.a(file);
                                                                        mutex11 = mutex8;
                                                                        obj3 = coroutine_suspended;
                                                                        j15 = j3;
                                                                        j16 = j7;
                                                                        obj = obj3;
                                                                        j6 = j16;
                                                                        j3 = j15;
                                                                        bVar3 = bVar5;
                                                                        url3 = url4;
                                                                        x5Var2 = x5Var3;
                                                                        mutex12 = mutex11;
                                                                        mutex12.unlock(null);
                                                                        if (!(aVar instanceof c.a)) {
                                                                        }
                                                                    }
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                mutex2 = mutex6;
                                                                th2 = th;
                                                                r3 = mutex2;
                                                                mutex3 = r3;
                                                                mutex3.unlock(null);
                                                                throw th2;
                                                            }
                                                        }
                                                        str13 = str12;
                                                        if (j3 != -1) {
                                                            file2 = file;
                                                            obj2 = coroutine_suspended;
                                                            j8 = j5;
                                                        } else {
                                                            file2 = file;
                                                            obj2 = coroutine_suspended;
                                                            j8 = j5;
                                                            file = x5Var3.b.a(new URL(url4.getProtocol(), url4.getHost(), url4.getPort(), url4.getFile() + "?partial=" + j3));
                                                        }
                                                        if (file.exists() || file.length() <= 0 || (j3 != -1 ? file.length() < j3 : q3Var != null && x5Var3.d.a(q3Var))) {
                                                            j9 = j8;
                                                            obj3 = obj2;
                                                            if (j3 != -1 && q3Var != null && x5Var3.d.a(q3Var)) {
                                                                mb.a(str4 + str11 + " before download.", (Throwable) null, 2, (Object) null);
                                                                long length2 = file2.length();
                                                                t3 t3Var3 = x5Var3.b;
                                                                gVar.b = x5Var3;
                                                                gVar.c = url4;
                                                                gVar.d = bVar4;
                                                                gVar.e = mutex6;
                                                                gVar.f = str11;
                                                                String str23 = str13;
                                                                gVar.g = str23;
                                                                File file11 = file2;
                                                                gVar.h = file11;
                                                                gVar.i = file;
                                                                gVar.j = j3;
                                                                File file12 = file;
                                                                b bVar13 = bVar4;
                                                                gVar.k = j9;
                                                                gVar.l = length2;
                                                                mutex7 = mutex6;
                                                                try {
                                                                    gVar.r = 6;
                                                                    obj13 = t3Var3.a(url4, gVar);
                                                                    if (obj13 != obj3) {
                                                                        obj4 = obj3;
                                                                        file5 = file11;
                                                                        bVar6 = bVar13;
                                                                        file6 = file12;
                                                                        x5Var4 = x5Var3;
                                                                        j11 = length2;
                                                                        str15 = str23;
                                                                        j12 = j3;
                                                                        mutex3 = mutex7;
                                                                        j13 = j9;
                                                                        try {
                                                                            if (!((Boolean) obj13).booleanValue()) {
                                                                                if (j11 > 0) {
                                                                                    x5Var4.k.addAndGet(-j11);
                                                                                }
                                                                                r3 r3Var = x5Var4.e;
                                                                                ExpirationReason expirationReason = ExpirationReason.TTL_EXPIRED;
                                                                                gVar.b = x5Var4;
                                                                                gVar.c = url4;
                                                                                gVar.d = bVar6;
                                                                                gVar.e = mutex3;
                                                                                gVar.f = str11;
                                                                                gVar.g = str15;
                                                                                gVar.h = file5;
                                                                                gVar.i = file6;
                                                                                gVar.j = j12;
                                                                                j10 = j13;
                                                                                gVar.k = j10;
                                                                                bVar7 = bVar6;
                                                                                gVar.r = 7;
                                                                                Object a8 = r3Var.a(url4, expirationReason, gVar);
                                                                                obj = obj4;
                                                                                if (a8 != obj) {
                                                                                    x5Var5 = x5Var4;
                                                                                    str16 = str11;
                                                                                    long j36 = j12;
                                                                                    file7 = file5;
                                                                                    j17 = j36;
                                                                                    try {
                                                                                        long j37 = j17;
                                                                                        mb.a(str5 + str16 + " evicted. New size: " + x5Var5.k.get(), (Throwable) null, 2, (Object) null);
                                                                                        str11 = str16;
                                                                                        file3 = file6;
                                                                                        mutex9 = mutex3;
                                                                                        file4 = file7;
                                                                                        str14 = str15;
                                                                                        url3 = url4;
                                                                                        bVar3 = bVar7;
                                                                                        j3 = j37;
                                                                                        x5Var2 = x5Var5;
                                                                                        mutex13 = mutex9;
                                                                                        if (!x5Var2.b.a(x5Var2.h)) {
                                                                                        }
                                                                                        mutex12 = mutex13;
                                                                                        j6 = j18;
                                                                                        mutex12.unlock(null);
                                                                                        if (!(aVar instanceof c.a)) {
                                                                                        }
                                                                                    } catch (Throwable th6) {
                                                                                        th3 = th6;
                                                                                        th2 = th3;
                                                                                        mutex3.unlock(null);
                                                                                        throw th2;
                                                                                    }
                                                                                }
                                                                                return obj;
                                                                            }
                                                                            j10 = j13;
                                                                            obj = obj4;
                                                                            file3 = file6;
                                                                            file4 = file5;
                                                                            str14 = str15;
                                                                            url3 = url4;
                                                                            bVar3 = bVar6;
                                                                            x5Var2 = x5Var4;
                                                                            mutex9 = mutex3;
                                                                            j3 = j12;
                                                                            mutex13 = mutex9;
                                                                            if (!x5Var2.b.a(x5Var2.h)) {
                                                                            }
                                                                            mutex12 = mutex13;
                                                                            j6 = j18;
                                                                            mutex12.unlock(null);
                                                                            if (!(aVar instanceof c.a)) {
                                                                            }
                                                                        } catch (Throwable th7) {
                                                                            th2 = th7;
                                                                            r3 = mutex3;
                                                                            mutex3 = r3;
                                                                            mutex3.unlock(null);
                                                                            throw th2;
                                                                        }
                                                                    }
                                                                    return obj3;
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    th2 = th;
                                                                    r3 = mutex7;
                                                                    mutex3 = r3;
                                                                    mutex3.unlock(null);
                                                                    throw th2;
                                                                }
                                                            }
                                                            obj = obj3;
                                                            file3 = file;
                                                            str14 = str13;
                                                            url3 = url4;
                                                            x5Var2 = x5Var3;
                                                            file4 = file2;
                                                            bVar3 = bVar4;
                                                            j10 = j9;
                                                            mutex9 = mutex6;
                                                            try {
                                                                mutex13 = mutex9;
                                                                try {
                                                                    if (!x5Var2.b.a(x5Var2.h)) {
                                                                        j18 = j10;
                                                                        mb.e(str3 + str11 + ", requiredBytes=" + x5Var2.h + ", currentCacheSizeBytes=" + x5Var2.k.get(), null, 2, null);
                                                                        aVar = new c.b(new IOException(str2 + str11 + ". Required: " + x5Var2.h));
                                                                    } else {
                                                                        j18 = j10;
                                                                        File a9 = x5Var2.b.a();
                                                                        if (a9 != null && a9.exists()) {
                                                                            File file13 = new File(a9, str6 + System.nanoTime() + str9 + url3.hashCode() + ".tmp");
                                                                            if (bVar3 != null && bVar3.a(j3)) {
                                                                                mb.a("Resuming download for " + str11 + " from byte " + bVar3.a(), (Throwable) null, 2, (Object) null);
                                                                                try {
                                                                                    FilesKt.copyTo$default(bVar3.b(), file13, false, 0, 6, null);
                                                                                    pair = TuplesKt.to(Boxing.boxLong(bVar3.a()), Boxing.boxLong(bVar3.a()));
                                                                                } catch (Exception e14) {
                                                                                    mb.e("Failed to copy existing data for resume, starting fresh download for " + str11, e14);
                                                                                    pair = TuplesKt.to(Boxing.boxLong(0L), Boxing.boxLong(0L));
                                                                                }
                                                                            } else {
                                                                                pair = TuplesKt.to(Boxing.boxLong(0L), Boxing.boxLong(0L));
                                                                            }
                                                                            long longValue3 = ((Number) pair.component1()).longValue();
                                                                            long longValue4 = ((Number) pair.component2()).longValue();
                                                                            mb.d("Starting download task for " + str11 + " to " + file13.getName() + " (resuming from byte " + longValue3 + ")", null, 2, null);
                                                                            c c0223c = new c.C0223c(new d(file13, a9, longValue3, longValue4, file3, file4, str11, str14));
                                                                            mutex12 = mutex13;
                                                                            j6 = j18;
                                                                            aVar = c0223c;
                                                                            mutex12.unlock(null);
                                                                            if (!(aVar instanceof c.a)) {
                                                                            }
                                                                        }
                                                                        String str24 = null;
                                                                        mb.b("Cache directory unavailable: cacheKey=" + str11 + ", cacheDir=" + str24 + ", exists=" + (a9 != null ? Boxing.boxBoolean(a9.exists()) : null), (Throwable) null, 2, (Object) null);
                                                                        aVar = new c.b(new IOException("Cache directory not available for " + str11));
                                                                    }
                                                                    mutex12 = mutex13;
                                                                    j6 = j18;
                                                                    mutex12.unlock(null);
                                                                    if (!(aVar instanceof c.a)) {
                                                                    }
                                                                } catch (Throwable th9) {
                                                                    th3 = th9;
                                                                    mutex3 = mutex13;
                                                                    th2 = th3;
                                                                    mutex3.unlock(null);
                                                                    throw th2;
                                                                }
                                                            } catch (Throwable th10) {
                                                                th3 = th10;
                                                                mutex13 = mutex9;
                                                            }
                                                        }
                                                        mb.a(str10 + str11 + " became valid after acquiring lock. Returning cached file.", (Throwable) null, 2, (Object) null);
                                                        t3 t3Var4 = x5Var3.b;
                                                        gVar.b = x5Var3;
                                                        gVar.c = url4;
                                                        gVar.d = bVar4;
                                                        gVar.e = mutex6;
                                                        gVar.f = file;
                                                        gVar.g = null;
                                                        gVar.h = null;
                                                        gVar.j = j3;
                                                        long j38 = j8;
                                                        gVar.k = j38;
                                                        gVar.r = 5;
                                                        obj3 = obj2;
                                                        if (t3Var4.a(file, gVar) != obj3) {
                                                            mutex10 = mutex6;
                                                            bVar5 = bVar4;
                                                            j14 = j38;
                                                            c aVar2 = new c.a(file);
                                                            mutex11 = mutex10;
                                                            j15 = j3;
                                                            j16 = j14;
                                                            aVar = aVar2;
                                                            obj = obj3;
                                                            j6 = j16;
                                                            j3 = j15;
                                                            bVar3 = bVar5;
                                                            url3 = url4;
                                                            x5Var2 = x5Var3;
                                                            mutex12 = mutex11;
                                                            mutex12.unlock(null);
                                                            if (!(aVar instanceof c.a)) {
                                                            }
                                                        }
                                                        return obj3;
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        mutex7 = mutex6;
                                                    }
                                                }
                                            } catch (Throwable th12) {
                                                th = th12;
                                                mutex2 = mutex5;
                                                th2 = th;
                                                r3 = mutex2;
                                                mutex3 = r3;
                                                mutex3.unlock(null);
                                                throw th2;
                                            }
                                            str9 = "_";
                                            a2 = x5Var.b.a(url2);
                                            str10 = "File for ";
                                            t3 t3Var5 = x5Var.b;
                                            gVar.b = x5Var;
                                            gVar.c = url2;
                                            gVar.d = bVar2;
                                            gVar.e = mutex4;
                                            gVar.f = str8;
                                            gVar.g = url10;
                                            gVar.h = a2;
                                            gVar.j = j3;
                                            gVar.k = j5;
                                            mutex5 = mutex4;
                                        } catch (Throwable th13) {
                                            th = th13;
                                            mutex5 = mutex4;
                                        }
                                    }
                                    return coroutine_suspended;
                                case 1:
                                    long j39 = gVar.k;
                                    long j40 = gVar.j;
                                    Mutex mutex19 = (Mutex) gVar.e;
                                    bVar2 = (b) gVar.d;
                                    URL url11 = (URL) gVar.c;
                                    x5Var = (x5) gVar.b;
                                    ResultKt.throwOnFailure(obj13);
                                    mutex4 = mutex19;
                                    url2 = url11;
                                    str4 = "Evicting expired file ";
                                    j4 = j39;
                                    str2 = "Not enough free space on device for ";
                                    str3 = "Disk space insufficient: cacheKey=";
                                    j3 = j40;
                                    str5 = "Expired file ";
                                    str6 = "temp_";
                                    j5 = j4;
                                    String url102 = url2.toString();
                                    Intrinsics.checkNotNullExpressionValue(url102, "toString(...)");
                                    if (j3 != -1) {
                                    }
                                    if (bVar2 != null) {
                                    }
                                    str9 = "_";
                                    a2 = x5Var.b.a(url2);
                                    str10 = "File for ";
                                    t3 t3Var52 = x5Var.b;
                                    gVar.b = x5Var;
                                    gVar.c = url2;
                                    gVar.d = bVar2;
                                    gVar.e = mutex4;
                                    gVar.f = str8;
                                    gVar.g = url102;
                                    gVar.h = a2;
                                    gVar.j = j3;
                                    gVar.k = j5;
                                    mutex5 = mutex4;
                                    gVar.r = 3;
                                    obj13 = t3Var52.b(url2, gVar);
                                    if (obj13 != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                case 2:
                                    j6 = gVar.k;
                                    j3 = gVar.j;
                                    mutex2 = (Mutex) gVar.e;
                                    bVar3 = (b) gVar.d;
                                    url3 = (URL) gVar.c;
                                    x5Var2 = (x5) gVar.b;
                                    try {
                                        ResultKt.throwOnFailure(obj13);
                                        str7 = "toString(...)";
                                        mutex2 = mutex2;
                                        aVar = new c.a(bVar3.b());
                                        obj = coroutine_suspended;
                                        mutex12 = mutex2;
                                        mutex12.unlock(null);
                                        if (!(aVar instanceof c.a)) {
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        th2 = th;
                                        r3 = mutex2;
                                        mutex3 = r3;
                                        mutex3.unlock(null);
                                        throw th2;
                                    }
                                    break;
                                case 3:
                                    long j41 = gVar.k;
                                    long j42 = gVar.j;
                                    File file14 = (File) gVar.h;
                                    str12 = (String) gVar.g;
                                    String str25 = (String) gVar.f;
                                    Mutex mutex20 = (Mutex) gVar.e;
                                    b bVar14 = (b) gVar.d;
                                    URL url12 = (URL) gVar.c;
                                    x5 x5Var10 = (x5) gVar.b;
                                    ResultKt.throwOnFailure(obj13);
                                    mutex6 = mutex20;
                                    str10 = "File for ";
                                    str7 = "toString(...)";
                                    str9 = "_";
                                    file = file14;
                                    bVar4 = bVar14;
                                    x5Var3 = x5Var10;
                                    str11 = str25;
                                    str2 = "Not enough free space on device for ";
                                    str3 = "Disk space insufficient: cacheKey=";
                                    j3 = j42;
                                    str5 = "Expired file ";
                                    str6 = "temp_";
                                    j5 = j41;
                                    str4 = "Evicting expired file ";
                                    url4 = url12;
                                    q3 q3Var2 = (q3) obj13;
                                    if (j3 != -1) {
                                    }
                                    str13 = str12;
                                    if (j3 != -1) {
                                    }
                                    if (file.exists()) {
                                        break;
                                    }
                                    j9 = j8;
                                    obj3 = obj2;
                                    if (j3 != -1) {
                                    }
                                    obj = obj3;
                                    file3 = file;
                                    str14 = str13;
                                    url3 = url4;
                                    x5Var2 = x5Var3;
                                    file4 = file2;
                                    bVar3 = bVar4;
                                    j10 = j9;
                                    mutex9 = mutex6;
                                    mutex13 = mutex9;
                                    if (!x5Var2.b.a(x5Var2.h)) {
                                    }
                                    mutex12 = mutex13;
                                    j6 = j18;
                                    mutex12.unlock(null);
                                    if (!(aVar instanceof c.a)) {
                                    }
                                    break;
                                case 4:
                                    j7 = gVar.k;
                                    j3 = gVar.j;
                                    file = (File) gVar.f;
                                    mutex8 = (Mutex) gVar.e;
                                    bVar5 = (b) gVar.d;
                                    url4 = (URL) gVar.c;
                                    x5Var3 = (x5) gVar.b;
                                    ResultKt.throwOnFailure(obj13);
                                    str7 = "toString(...)";
                                    aVar = new c.a(file);
                                    mutex11 = mutex8;
                                    obj3 = coroutine_suspended;
                                    j15 = j3;
                                    j16 = j7;
                                    obj = obj3;
                                    j6 = j16;
                                    j3 = j15;
                                    bVar3 = bVar5;
                                    url3 = url4;
                                    x5Var2 = x5Var3;
                                    mutex12 = mutex11;
                                    mutex12.unlock(null);
                                    if (!(aVar instanceof c.a)) {
                                    }
                                    break;
                                case 5:
                                    long j43 = gVar.k;
                                    j3 = gVar.j;
                                    file = (File) gVar.f;
                                    mutex10 = (Mutex) gVar.e;
                                    bVar5 = (b) gVar.d;
                                    url4 = (URL) gVar.c;
                                    x5Var3 = (x5) gVar.b;
                                    ResultKt.throwOnFailure(obj13);
                                    str7 = "toString(...)";
                                    j14 = j43;
                                    obj3 = coroutine_suspended;
                                    c aVar22 = new c.a(file);
                                    mutex11 = mutex10;
                                    j15 = j3;
                                    j16 = j14;
                                    aVar = aVar22;
                                    obj = obj3;
                                    j6 = j16;
                                    j3 = j15;
                                    bVar3 = bVar5;
                                    url3 = url4;
                                    x5Var2 = x5Var3;
                                    mutex12 = mutex11;
                                    mutex12.unlock(null);
                                    if (!(aVar instanceof c.a)) {
                                    }
                                    break;
                                case 6:
                                    long j44 = gVar.l;
                                    long j45 = gVar.k;
                                    long j46 = gVar.j;
                                    File file15 = (File) gVar.i;
                                    File file16 = (File) gVar.h;
                                    String str26 = (String) gVar.g;
                                    String str27 = (String) gVar.f;
                                    Mutex mutex21 = (Mutex) gVar.e;
                                    b bVar15 = (b) gVar.d;
                                    URL url13 = (URL) gVar.c;
                                    x5Var4 = (x5) gVar.b;
                                    try {
                                        ResultKt.throwOnFailure(obj13);
                                        bVar6 = bVar15;
                                        str7 = "toString(...)";
                                        obj4 = coroutine_suspended;
                                        str9 = "_";
                                        j13 = j45;
                                        file6 = file15;
                                        str5 = "Expired file ";
                                        str6 = "temp_";
                                        str15 = str26;
                                        j11 = j44;
                                        str2 = "Not enough free space on device for ";
                                        str3 = "Disk space insufficient: cacheKey=";
                                        mutex3 = mutex21;
                                        j12 = j46;
                                        file5 = file16;
                                        url4 = url13;
                                        str11 = str27;
                                        if (!((Boolean) obj13).booleanValue()) {
                                        }
                                    } catch (Throwable th15) {
                                        th = th15;
                                        mutex2 = mutex21;
                                        th2 = th;
                                        r3 = mutex2;
                                        mutex3 = r3;
                                        mutex3.unlock(null);
                                        throw th2;
                                    }
                                    break;
                                case 7:
                                    long j47 = gVar.k;
                                    j17 = gVar.j;
                                    File file17 = (File) gVar.i;
                                    File file18 = (File) gVar.h;
                                    String str28 = (String) gVar.g;
                                    String str29 = (String) gVar.f;
                                    Mutex mutex22 = (Mutex) gVar.e;
                                    b bVar16 = (b) gVar.d;
                                    URL url14 = (URL) gVar.c;
                                    x5 x5Var11 = (x5) gVar.b;
                                    ResultKt.throwOnFailure(obj13);
                                    bVar7 = bVar16;
                                    x5Var5 = x5Var11;
                                    str7 = "toString(...)";
                                    obj = coroutine_suspended;
                                    str6 = "temp_";
                                    str9 = "_";
                                    file6 = file17;
                                    str16 = str29;
                                    mutex3 = mutex22;
                                    str2 = "Not enough free space on device for ";
                                    str3 = "Disk space insufficient: cacheKey=";
                                    file7 = file18;
                                    url4 = url14;
                                    str5 = "Expired file ";
                                    str15 = str28;
                                    j10 = j47;
                                    long j372 = j17;
                                    mb.a(str5 + str16 + " evicted. New size: " + x5Var5.k.get(), (Throwable) null, 2, (Object) null);
                                    str11 = str16;
                                    file3 = file6;
                                    mutex9 = mutex3;
                                    file4 = file7;
                                    str14 = str15;
                                    url3 = url4;
                                    bVar3 = bVar7;
                                    j3 = j372;
                                    x5Var2 = x5Var5;
                                    mutex13 = mutex9;
                                    if (!x5Var2.b.a(x5Var2.h)) {
                                    }
                                    mutex12 = mutex13;
                                    j6 = j18;
                                    mutex12.unlock(null);
                                    if (!(aVar instanceof c.a)) {
                                    }
                                    break;
                                case 8:
                                    j6 = gVar.k;
                                    j3 = gVar.j;
                                    d dVar8 = (d) gVar.e;
                                    bVar3 = (b) gVar.d;
                                    url3 = (URL) gVar.c;
                                    x5Var2 = (x5) gVar.b;
                                    try {
                                        ResultKt.throwOnFailure(obj13);
                                        a3 = dVar8;
                                        str7 = "toString(...)";
                                        a4 = ((Result) obj13).getValue();
                                        obj = coroutine_suspended;
                                    } catch (CancellationException e15) {
                                        cancellationException = e15;
                                        obj = coroutine_suspended;
                                        obj5 = obj;
                                        dVar = dVar8;
                                        throw cancellationException;
                                    } catch (Exception e16) {
                                        exc2 = e16;
                                        str7 = "toString(...)";
                                        obj = coroutine_suspended;
                                        x5Var6 = x5Var2;
                                        url5 = url3;
                                        bVar8 = bVar3;
                                        dVar = dVar8;
                                        exc = exc2;
                                        simpleName = exc.getClass().getSimpleName();
                                        if (dVar.g().exists()) {
                                        }
                                        String b32 = dVar.b();
                                        j20 = j3;
                                        long e72 = dVar.e();
                                        String message2 = exc.getMessage();
                                        obj6 = obj;
                                        StringBuilder append3 = new StringBuilder(str).append(b32).append(", startByte=").append(e72);
                                        str17 = str22;
                                        StringBuilder append22 = append3.append(str17).append(length);
                                        str18 = ", errorType=";
                                        str19 = ", message=";
                                        mb.b(append22.append(str18).append(simpleName).append(str19).append(message2).toString(), exc);
                                        if (dVar.e() > 0) {
                                        }
                                        long j352 = j19;
                                        obj7 = obj6;
                                        Result.Companion companion42 = Result.INSTANCE;
                                        m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(exc));
                                        a3 = dVar;
                                        j21 = j20;
                                        j22 = j352;
                                        if (!Result.m8085isFailureimpl(m8079constructorimpl)) {
                                        }
                                        return obj7;
                                    }
                                    try {
                                        ResultKt.throwOnFailure(a4);
                                        m8079constructorimpl = Result.m8079constructorimpl(a4);
                                        obj7 = obj;
                                        x5Var6 = x5Var2;
                                        str17 = str22;
                                        url5 = url3;
                                        bVar8 = bVar3;
                                        j21 = j3;
                                        j22 = j6;
                                        str19 = ", message=";
                                        str18 = ", errorType=";
                                    } catch (CancellationException e17) {
                                        dVar8 = a3;
                                        cancellationException = e17;
                                        obj5 = obj;
                                        dVar = dVar8;
                                        throw cancellationException;
                                    } catch (Exception e18) {
                                        dVar8 = a3;
                                        exc2 = e18;
                                        x5Var6 = x5Var2;
                                        url5 = url3;
                                        bVar8 = bVar3;
                                        dVar = dVar8;
                                        exc = exc2;
                                        simpleName = exc.getClass().getSimpleName();
                                        if (dVar.g().exists()) {
                                        }
                                        String b322 = dVar.b();
                                        j20 = j3;
                                        long e722 = dVar.e();
                                        String message22 = exc.getMessage();
                                        obj6 = obj;
                                        StringBuilder append32 = new StringBuilder(str).append(b322).append(", startByte=").append(e722);
                                        str17 = str22;
                                        StringBuilder append222 = append32.append(str17).append(length);
                                        str18 = ", errorType=";
                                        str19 = ", message=";
                                        mb.b(append222.append(str18).append(simpleName).append(str19).append(message22).toString(), exc);
                                        if (dVar.e() > 0) {
                                        }
                                        long j3522 = j19;
                                        obj7 = obj6;
                                        Result.Companion companion422 = Result.INSTANCE;
                                        m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(exc));
                                        a3 = dVar;
                                        j21 = j20;
                                        j22 = j3522;
                                        if (!Result.m8085isFailureimpl(m8079constructorimpl)) {
                                        }
                                        return obj7;
                                    }
                                    if (!Result.m8085isFailureimpl(m8079constructorimpl)) {
                                        m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
                                        mb.b("Download failed after retry: cacheKey=" + a3.b() + ", requestedBytes=" + j21 + ", partialBytes=" + (a3.g().exists() ? a3.g().length() : 0L) + str18 + (m8082exceptionOrNullimpl != null ? m8082exceptionOrNullimpl.getClass().getSimpleName() : null) + str19 + (m8082exceptionOrNullimpl != null ? m8082exceptionOrNullimpl.getMessage() : null), m8082exceptionOrNullimpl);
                                        NonCancellable nonCancellable2 = NonCancellable.INSTANCE;
                                        i iVar = new i(a3, null);
                                        gVar.b = a3;
                                        gVar.c = m8082exceptionOrNullimpl;
                                        gVar.d = null;
                                        gVar.e = null;
                                        gVar.f = null;
                                        gVar.g = null;
                                        gVar.h = null;
                                        gVar.i = null;
                                        gVar.r = 11;
                                        if (BuildersKt.withContext(nonCancellable2, iVar, gVar) != obj7) {
                                            dVar3 = a3;
                                            Result.Companion companion5 = Result.INSTANCE;
                                            if (m8082exceptionOrNullimpl == null) {
                                                m8082exceptionOrNullimpl = new IOException("Download failed for " + dVar3.b());
                                            }
                                            return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
                                        }
                                    } else {
                                        str20 = ", requestedBytes=";
                                        mutex14 = x5Var6.m;
                                        gVar.b = x5Var6;
                                        gVar.c = url5;
                                        gVar.d = bVar8;
                                        gVar.e = a3;
                                        gVar.f = m8079constructorimpl;
                                        gVar.g = mutex14;
                                        gVar.h = null;
                                        gVar.i = null;
                                        gVar.j = j21;
                                        gVar.k = j22;
                                        d dVar9 = a3;
                                        gVar.r = 12;
                                        if (mutex14.lock(null, gVar) != obj7) {
                                            obj9 = m8079constructorimpl;
                                            dVar2 = dVar9;
                                            try {
                                                if (Result.m8085isFailureimpl(obj9)) {
                                                    obj9 = null;
                                                }
                                                l2 = (Long) obj9;
                                                if (l2 != null) {
                                                    Object obj14 = obj7;
                                                    mb.b("Download result null: cacheKey=" + dVar2.b() + ", tempFileExists=" + dVar2.g().exists() + ", tempFileSize=" + (dVar2.g().exists() ? dVar2.g().length() : 0L), (Throwable) null, 2, (Object) null);
                                                    NonCancellable nonCancellable3 = NonCancellable.INSTANCE;
                                                    m mVar = new m(dVar2, null);
                                                    gVar.b = dVar2;
                                                    gVar.c = mutex14;
                                                    gVar.d = null;
                                                    gVar.e = null;
                                                    gVar.f = null;
                                                    gVar.g = null;
                                                    gVar.r = 13;
                                                    if (BuildersKt.withContext(nonCancellable3, mVar, gVar) == obj14) {
                                                        return obj14;
                                                    }
                                                    mutex15 = mutex14;
                                                    Result.Companion companion6 = Result.INSTANCE;
                                                    m8079constructorimpl3 = Result.m8079constructorimpl(ResultKt.createFailure(new IOException("Download succeeded but result was null for " + dVar2.b())));
                                                    mutex15.unlock(null);
                                                    return m8079constructorimpl3;
                                                }
                                                b bVar17 = bVar8;
                                                URL url15 = url5;
                                                long longValue5 = l2.longValue();
                                                if (dVar2.e() <= 0 || longValue5 <= 0 || dVar2.g().length() >= dVar2.e() + longValue5) {
                                                    bVar9 = bVar17;
                                                    j23 = j22;
                                                    d2 = dVar2.d() + longValue5;
                                                } else {
                                                    bVar9 = bVar17;
                                                    j23 = j22;
                                                    d2 = longValue5;
                                                }
                                                if (d2 <= 0) {
                                                    Object obj15 = obj7;
                                                    Mutex mutex23 = mutex14;
                                                    try {
                                                        mb.e("Download empty: cacheKey=" + dVar2.b() + str20 + j21 + ", existingBytes=" + dVar2.d() + str17 + longValue5 + ", tempFileSize=" + (dVar2.g().exists() ? dVar2.g().length() : 0L), null, 2, null);
                                                        NonCancellable nonCancellable4 = NonCancellable.INSTANCE;
                                                        j jVar = new j(dVar2, null);
                                                        gVar.b = dVar2;
                                                        gVar.c = mutex23;
                                                        gVar.d = null;
                                                        gVar.e = null;
                                                        gVar.f = null;
                                                        gVar.g = null;
                                                        gVar.r = 14;
                                                        if (BuildersKt.withContext(nonCancellable4, jVar, gVar) == obj15) {
                                                            return obj15;
                                                        }
                                                        mutex15 = mutex23;
                                                        Result.Companion companion7 = Result.INSTANCE;
                                                        m8079constructorimpl3 = Result.m8079constructorimpl(ResultKt.createFailure(new IOException("Downloaded file for " + dVar2.b() + " is empty.")));
                                                        mutex15.unlock(null);
                                                        return m8079constructorimpl3;
                                                    } catch (Throwable th16) {
                                                        th = th16;
                                                        mutex14 = mutex23;
                                                        th = th;
                                                        r15 = mutex14;
                                                        r15.unlock(null);
                                                        throw th;
                                                    }
                                                }
                                                Object obj16 = obj7;
                                                b bVar18 = bVar9;
                                                long length3 = dVar2.g().length();
                                                if (j21 == -1 || d2 >= j21 || length3 != d2) {
                                                    str22 = str17;
                                                    i2 = 0;
                                                } else {
                                                    str22 = str17;
                                                    i2 = 1;
                                                }
                                                if (i2 != 0) {
                                                    obj10 = obj16;
                                                    mb.a("Partial request for " + j21 + " bytes returned complete file of " + d2 + " bytes (verified on disk: " + length3 + " bytes)", (Throwable) null, 2, (Object) null);
                                                    f2 = dVar2.c();
                                                } else {
                                                    obj10 = obj16;
                                                    if (j21 != -1 && d2 < j21) {
                                                        mb.a("Partial request returned fewer bytes than requested (" + d2 + " < " + j21 + ") but on-disk size (" + length3 + ") doesn't match. Storing as partial.", (Throwable) null, 2, (Object) null);
                                                    }
                                                    f2 = dVar2.f();
                                                }
                                                File file19 = f2;
                                                long j48 = d2;
                                                long j49 = j23;
                                                long j50 = (x5Var6.k.get() + longValue5) - j49;
                                                if (j50 > 0) {
                                                    int i7 = i2;
                                                    mb.a("Cache size limit check: Need to free " + j50 + " bytes for " + dVar2.b(), (Throwable) null, 2, (Object) null);
                                                    s3 s3Var = x5Var6.d;
                                                    Function0 function0 = new Function0() { // from class: com.chartboost.sdk.impl.x5$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return Long.valueOf(x5.a(x5.this));
                                                        }
                                                    };
                                                    gVar.b = x5Var6;
                                                    url7 = url15;
                                                    gVar.c = url7;
                                                    gVar.d = bVar18;
                                                    gVar.e = dVar2;
                                                    gVar.f = mutex14;
                                                    gVar.g = file19;
                                                    gVar.j = j21;
                                                    gVar.k = j49;
                                                    gVar.l = longValue5;
                                                    gVar.m = j48;
                                                    gVar.o = i7;
                                                    gVar.n = j50;
                                                    gVar.r = 15;
                                                    Object a10 = s3Var.a(function0, j50, gVar);
                                                    obj11 = obj10;
                                                    if (a10 == obj11) {
                                                        return obj11;
                                                    }
                                                    i4 = i7;
                                                    j27 = j21;
                                                    j26 = longValue5;
                                                    file9 = file19;
                                                    dVar4 = dVar2;
                                                    obj13 = a10;
                                                    mutex16 = mutex14;
                                                    x5Var8 = x5Var6;
                                                    j28 = j48;
                                                    j29 = j50;
                                                    bVar11 = bVar18;
                                                    j30 = j49;
                                                    try {
                                                        URL url16 = url7;
                                                        long j51 = j28;
                                                        longValue = ((Number) obj13).longValue();
                                                        if (longValue <= 0) {
                                                            try {
                                                                mutex18 = mutex16;
                                                                gVar2 = gVar;
                                                                try {
                                                                    x5Var8.k.addAndGet(-longValue);
                                                                    mutex17 = mutex18;
                                                                    try {
                                                                        mb.a("Freed " + longValue + " bytes via LRU. New cache size: " + x5Var8.k.get(), (Throwable) null, 2, (Object) null);
                                                                    } catch (Throwable th17) {
                                                                        th = th17;
                                                                        th = th;
                                                                        r15 = mutex17;
                                                                        r15.unlock(null);
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th18) {
                                                                    th = th18;
                                                                    th = th;
                                                                    r15 = mutex18;
                                                                    r15.unlock(null);
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th19) {
                                                                th = th19;
                                                                mutex17 = mutex16;
                                                            }
                                                        } else {
                                                            mutex17 = mutex16;
                                                            gVar2 = gVar;
                                                        }
                                                        try {
                                                            if (x5Var8.k.get() + j26 <= j30) {
                                                                mb.b("Cache space insufficient after eviction: cacheKey=" + dVar4.b() + str22 + j26 + ", currentCacheSize=" + x5Var8.k.get() + ", cacheSizeLimit=" + j30 + ", spaceNeeded=" + j29 + ", freedBytes=" + longValue, (Throwable) null, 2, (Object) null);
                                                                NonCancellable nonCancellable5 = NonCancellable.INSTANCE;
                                                                k kVar = new k(dVar4, null);
                                                                g gVar3 = gVar2;
                                                                gVar3.b = dVar4;
                                                                mutex14 = mutex17;
                                                                try {
                                                                    gVar3.c = mutex14;
                                                                    gVar3.d = null;
                                                                    gVar3.e = null;
                                                                    gVar3.f = null;
                                                                    gVar3.g = null;
                                                                    gVar3.r = 16;
                                                                    if (BuildersKt.withContext(nonCancellable5, kVar, gVar3) == obj11) {
                                                                        return obj11;
                                                                    }
                                                                    dVar6 = dVar4;
                                                                    mutex15 = mutex14;
                                                                    Result.Companion companion8 = Result.INSTANCE;
                                                                    m8079constructorimpl3 = Result.m8079constructorimpl(ResultKt.createFailure(new IOException("Cannot cache " + dVar6.b() + ". Not enough space freed after eviction.")));
                                                                    mutex15.unlock(null);
                                                                    return m8079constructorimpl3;
                                                                } catch (Throwable th20) {
                                                                    th = th20;
                                                                    th = th;
                                                                    r15 = mutex14;
                                                                    r15.unlock(null);
                                                                    throw th;
                                                                }
                                                            }
                                                            mutex14 = mutex17;
                                                            gVar = gVar2;
                                                            j25 = j27;
                                                            bVar10 = bVar11;
                                                            url6 = url16;
                                                            x5Var7 = x5Var8;
                                                            obj10 = obj11;
                                                            i3 = i4;
                                                            file8 = file9;
                                                            dVar2 = dVar4;
                                                            j24 = j51;
                                                            try {
                                                                t3 t3Var6 = x5Var7.b;
                                                                File g4 = dVar2.g();
                                                                gVar.b = x5Var7;
                                                                gVar.c = url6;
                                                                gVar.d = bVar10;
                                                                gVar.e = dVar2;
                                                                gVar.f = mutex14;
                                                                gVar.g = file8;
                                                                gVar.j = j25;
                                                                gVar.k = j26;
                                                                gVar.l = j24;
                                                                gVar.o = i3;
                                                                long j52 = j24;
                                                                gVar.r = 17;
                                                                obj13 = t3Var6.b(g4, file8, gVar);
                                                                obj12 = obj10;
                                                                if (obj13 != obj12) {
                                                                    return obj12;
                                                                }
                                                                i5 = i3;
                                                                bVar12 = bVar10;
                                                                dVar5 = dVar2;
                                                                file10 = file8;
                                                                mutex15 = mutex14;
                                                                j31 = j52;
                                                                url8 = url6;
                                                                j32 = j25;
                                                                if (((Boolean) obj13).booleanValue()) {
                                                                    mb.b("Cache finalize failed: cacheKey=" + dVar5.b() + ", tempFile=" + dVar5.g().getAbsolutePath() + ", targetFile=" + file10.getAbsolutePath() + ", tempFileExists=" + dVar5.g().exists() + ", tempFileSize=" + (dVar5.g().exists() ? dVar5.g().length() : 0L), (Throwable) null, 2, (Object) null);
                                                                    NonCancellable nonCancellable6 = NonCancellable.INSTANCE;
                                                                    l lVar = new l(dVar5, null);
                                                                    gVar.b = dVar5;
                                                                    gVar.c = mutex15;
                                                                    gVar.d = null;
                                                                    gVar.e = null;
                                                                    gVar.f = null;
                                                                    gVar.g = null;
                                                                    gVar.r = 18;
                                                                    if (BuildersKt.withContext(nonCancellable6, lVar, gVar) == obj12) {
                                                                        return obj12;
                                                                    }
                                                                    dVar7 = dVar5;
                                                                    Result.Companion companion9 = Result.INSTANCE;
                                                                    m8079constructorimpl3 = Result.m8079constructorimpl(ResultKt.createFailure(new IOException("Failed to finalize cached file for " + dVar7.b())));
                                                                    mutex15.unlock(null);
                                                                    return m8079constructorimpl3;
                                                                }
                                                                x5Var7.k.addAndGet(j26);
                                                                if (j32 != -1 && i5 == 0) {
                                                                    b bVar19 = new b(0L, j32 - 1, j31, file10, 0L, false, 16, null);
                                                                    String url17 = url8.toString();
                                                                    Intrinsics.checkNotNullExpressionValue(url17, str7);
                                                                    x5Var7.a(url17, bVar19, bVar12);
                                                                    mb.a("Successfully cached " + dVar5.b() + " (" + file10.getAbsolutePath() + ", " + j31 + " bytes total, " + j26 + " new). New cache size: " + x5Var7.k.get(), (Throwable) null, 2, (Object) null);
                                                                    Result.Companion companion10 = Result.INSTANCE;
                                                                    m8079constructorimpl3 = Result.m8079constructorimpl(file10);
                                                                    mutex15.unlock(null);
                                                                    return m8079constructorimpl3;
                                                                }
                                                                str21 = str7;
                                                                long j53 = j31;
                                                                long currentTimeMillis = System.currentTimeMillis() + ((Number) x5Var7.i.invoke()).longValue();
                                                                String url18 = url8.toString();
                                                                Intrinsics.checkNotNullExpressionValue(url18, str21);
                                                                q3 q3Var3 = new q3(url18, currentTimeMillis);
                                                                t3 t3Var7 = x5Var7.b;
                                                                gVar.b = x5Var7;
                                                                gVar.c = url8;
                                                                gVar.d = bVar12;
                                                                gVar.e = dVar5;
                                                                gVar.f = mutex15;
                                                                gVar.g = file10;
                                                                gVar.j = j26;
                                                                File file20 = file10;
                                                                x5 x5Var12 = x5Var7;
                                                                gVar.k = j53;
                                                                gVar.r = 19;
                                                                if (t3Var7.a(url8, q3Var3, gVar) == obj12) {
                                                                    return obj12;
                                                                }
                                                                x5Var9 = x5Var12;
                                                                url9 = url8;
                                                                j33 = j53;
                                                                file10 = file20;
                                                                try {
                                                                    b bVar20 = new b(0L, j33 - 1, j33, file10, 0L, true, 16, null);
                                                                    String url19 = url9.toString();
                                                                    Intrinsics.checkNotNullExpressionValue(url19, str21);
                                                                    x5Var9.a(url19, bVar20, bVar12);
                                                                    x5Var7 = x5Var9;
                                                                    j31 = j33;
                                                                    mb.a("Successfully cached " + dVar5.b() + " (" + file10.getAbsolutePath() + ", " + j31 + " bytes total, " + j26 + " new). New cache size: " + x5Var7.k.get(), (Throwable) null, 2, (Object) null);
                                                                    Result.Companion companion102 = Result.INSTANCE;
                                                                    m8079constructorimpl3 = Result.m8079constructorimpl(file10);
                                                                    mutex15.unlock(null);
                                                                    return m8079constructorimpl3;
                                                                } catch (Throwable th21) {
                                                                    th = th21;
                                                                    mutex14 = mutex15;
                                                                    r15 = mutex14;
                                                                    r15.unlock(null);
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th22) {
                                                                th = th22;
                                                                th = th;
                                                                r15 = mutex14;
                                                                r15.unlock(null);
                                                                throw th;
                                                            }
                                                        } catch (Throwable th23) {
                                                            th = th23;
                                                            mutex14 = mutex17;
                                                        }
                                                    } catch (Throwable th24) {
                                                        th = th24;
                                                        mutex14 = mutex16;
                                                    }
                                                } else {
                                                    i3 = i2;
                                                    bVar10 = bVar18;
                                                    url6 = url15;
                                                    j24 = j48;
                                                    x5Var7 = x5Var6;
                                                    file8 = file19;
                                                    j25 = j21;
                                                    j26 = longValue5;
                                                    t3 t3Var62 = x5Var7.b;
                                                    File g42 = dVar2.g();
                                                    gVar.b = x5Var7;
                                                    gVar.c = url6;
                                                    gVar.d = bVar10;
                                                    gVar.e = dVar2;
                                                    gVar.f = mutex14;
                                                    gVar.g = file8;
                                                    gVar.j = j25;
                                                    gVar.k = j26;
                                                    gVar.l = j24;
                                                    gVar.o = i3;
                                                    long j522 = j24;
                                                    gVar.r = 17;
                                                    obj13 = t3Var62.b(g42, file8, gVar);
                                                    obj12 = obj10;
                                                    if (obj13 != obj12) {
                                                    }
                                                }
                                            } catch (Throwable th25) {
                                                th = th25;
                                            }
                                        }
                                    }
                                    return obj7;
                                case 9:
                                    long j54 = gVar.k;
                                    long j55 = gVar.j;
                                    exc = (Exception) gVar.f;
                                    dVar = (d) gVar.e;
                                    bVar8 = (b) gVar.d;
                                    url5 = (URL) gVar.c;
                                    x5Var6 = (x5) gVar.b;
                                    try {
                                        ResultKt.throwOnFailure(obj13);
                                        obj8 = ((Result) obj13).getValue();
                                        str7 = "toString(...)";
                                        obj7 = coroutine_suspended;
                                        a3 = dVar;
                                        str17 = str22;
                                        j21 = j55;
                                        j22 = j54;
                                        str19 = ", message=";
                                        str18 = ", errorType=";
                                        if (!Result.m8085isFailureimpl(obj8)) {
                                            Result.Companion companion11 = Result.INSTANCE;
                                            ?? m8082exceptionOrNullimpl2 = Result.m8082exceptionOrNullimpl(obj8);
                                            if (m8082exceptionOrNullimpl2 != 0) {
                                                exc = m8082exceptionOrNullimpl2;
                                            }
                                            m8079constructorimpl2 = Result.m8079constructorimpl(ResultKt.createFailure(exc));
                                        } else {
                                            Result.Companion companion12 = Result.INSTANCE;
                                            ResultKt.throwOnFailure(obj8);
                                            m8079constructorimpl2 = Result.m8079constructorimpl(obj8);
                                        }
                                        m8079constructorimpl = m8079constructorimpl2;
                                        if (!Result.m8085isFailureimpl(m8079constructorimpl)) {
                                        }
                                        return obj7;
                                    } catch (CancellationException e19) {
                                        cancellationException2 = e19;
                                        obj5 = coroutine_suspended;
                                        nonCancellable = NonCancellable.INSTANCE;
                                        hVar = new h(dVar, null);
                                        gVar.b = cancellationException2;
                                        gVar.c = null;
                                        gVar.d = null;
                                        gVar.e = null;
                                        gVar.f = null;
                                        gVar.g = null;
                                        gVar.h = null;
                                        gVar.i = null;
                                        gVar.r = 10;
                                        if (BuildersKt.withContext(nonCancellable, hVar, gVar) == obj5) {
                                            return obj5;
                                        }
                                        throw cancellationException2;
                                    }
                                case 10:
                                    CancellationException cancellationException3 = (CancellationException) gVar.b;
                                    ResultKt.throwOnFailure(obj13);
                                    throw cancellationException3;
                                case 11:
                                    m8082exceptionOrNullimpl = (Throwable) gVar.c;
                                    dVar3 = (d) gVar.b;
                                    ResultKt.throwOnFailure(obj13);
                                    Result.Companion companion52 = Result.INSTANCE;
                                    if (m8082exceptionOrNullimpl == null) {
                                    }
                                    return Result.m8079constructorimpl(ResultKt.createFailure(m8082exceptionOrNullimpl));
                                case 12:
                                    long j56 = gVar.k;
                                    long j57 = gVar.j;
                                    Mutex mutex24 = (Mutex) gVar.g;
                                    Object obj17 = gVar.f;
                                    d dVar10 = (d) gVar.e;
                                    b bVar21 = (b) gVar.d;
                                    URL url20 = (URL) gVar.c;
                                    x5 x5Var13 = (x5) gVar.b;
                                    ResultKt.throwOnFailure(obj13);
                                    str7 = "toString(...)";
                                    obj9 = obj17;
                                    str20 = ", requestedBytes=";
                                    str17 = str22;
                                    mutex14 = mutex24;
                                    dVar2 = dVar10;
                                    bVar8 = bVar21;
                                    url5 = url20;
                                    x5Var6 = x5Var13;
                                    obj7 = coroutine_suspended;
                                    j21 = j57;
                                    j22 = j56;
                                    if (Result.m8085isFailureimpl(obj9)) {
                                    }
                                    l2 = (Long) obj9;
                                    if (l2 != null) {
                                    }
                                    break;
                                case 13:
                                    mutex15 = (Mutex) gVar.c;
                                    dVar2 = (d) gVar.b;
                                    ResultKt.throwOnFailure(obj13);
                                    Result.Companion companion62 = Result.INSTANCE;
                                    m8079constructorimpl3 = Result.m8079constructorimpl(ResultKt.createFailure(new IOException("Download succeeded but result was null for " + dVar2.b())));
                                    mutex15.unlock(null);
                                    return m8079constructorimpl3;
                                case 14:
                                    mutex15 = (Mutex) gVar.c;
                                    dVar2 = (d) gVar.b;
                                    ResultKt.throwOnFailure(obj13);
                                    Result.Companion companion72 = Result.INSTANCE;
                                    m8079constructorimpl3 = Result.m8079constructorimpl(ResultKt.createFailure(new IOException("Downloaded file for " + dVar2.b() + " is empty.")));
                                    mutex15.unlock(null);
                                    return m8079constructorimpl3;
                                case 15:
                                    long j58 = gVar.n;
                                    int i8 = gVar.o;
                                    long j59 = gVar.m;
                                    long j60 = gVar.l;
                                    long j61 = gVar.k;
                                    long j62 = gVar.j;
                                    File file21 = (File) gVar.g;
                                    i4 = i8;
                                    Mutex mutex25 = (Mutex) gVar.f;
                                    d dVar11 = (d) gVar.e;
                                    bVar11 = (b) gVar.d;
                                    URL url21 = (URL) gVar.c;
                                    x5Var8 = (x5) gVar.b;
                                    try {
                                        ResultKt.throwOnFailure(obj13);
                                        dVar4 = dVar11;
                                        str7 = "toString(...)";
                                        mutex16 = mutex25;
                                        j27 = j62;
                                        j29 = j58;
                                        file9 = file21;
                                        url7 = url21;
                                        j28 = j59;
                                        obj11 = coroutine_suspended;
                                        j26 = j60;
                                        j30 = j61;
                                        URL url162 = url7;
                                        long j512 = j28;
                                        longValue = ((Number) obj13).longValue();
                                        if (longValue <= 0) {
                                        }
                                        if (x5Var8.k.get() + j26 <= j30) {
                                        }
                                    } catch (Throwable th26) {
                                        th = th26;
                                        mutex18 = mutex25;
                                        th = th;
                                        r15 = mutex18;
                                        r15.unlock(null);
                                        throw th;
                                    }
                                    break;
                                case 16:
                                    mutex15 = (Mutex) gVar.c;
                                    dVar6 = (d) gVar.b;
                                    ResultKt.throwOnFailure(obj13);
                                    Result.Companion companion82 = Result.INSTANCE;
                                    m8079constructorimpl3 = Result.m8079constructorimpl(ResultKt.createFailure(new IOException("Cannot cache " + dVar6.b() + ". Not enough space freed after eviction.")));
                                    mutex15.unlock(null);
                                    return m8079constructorimpl3;
                                case 17:
                                    int i9 = gVar.o;
                                    long j63 = gVar.l;
                                    long j64 = gVar.k;
                                    j32 = gVar.j;
                                    File file22 = (File) gVar.g;
                                    mutex18 = (Mutex) gVar.f;
                                    d dVar12 = (d) gVar.e;
                                    i5 = i9;
                                    b bVar22 = (b) gVar.d;
                                    URL url22 = (URL) gVar.c;
                                    x5 x5Var14 = (x5) gVar.b;
                                    try {
                                        ResultKt.throwOnFailure(obj13);
                                        bVar12 = bVar22;
                                        str7 = "toString(...)";
                                        x5Var7 = x5Var14;
                                        file10 = file22;
                                        url8 = url22;
                                        dVar5 = dVar12;
                                        j31 = j63;
                                        obj12 = coroutine_suspended;
                                        j26 = j64;
                                        mutex15 = mutex18;
                                        if (((Boolean) obj13).booleanValue()) {
                                        }
                                    } catch (Throwable th27) {
                                        th = th27;
                                        th = th;
                                        r15 = mutex18;
                                        r15.unlock(null);
                                        throw th;
                                    }
                                    break;
                                case 18:
                                    mutex15 = (Mutex) gVar.c;
                                    dVar7 = (d) gVar.b;
                                    ResultKt.throwOnFailure(obj13);
                                    Result.Companion companion92 = Result.INSTANCE;
                                    m8079constructorimpl3 = Result.m8079constructorimpl(ResultKt.createFailure(new IOException("Failed to finalize cached file for " + dVar7.b())));
                                    mutex15.unlock(null);
                                    return m8079constructorimpl3;
                                case 19:
                                    j33 = gVar.k;
                                    j26 = gVar.j;
                                    file10 = (File) gVar.g;
                                    mutex15 = (Mutex) gVar.f;
                                    dVar5 = (d) gVar.e;
                                    b bVar23 = (b) gVar.d;
                                    url9 = (URL) gVar.c;
                                    x5Var9 = (x5) gVar.b;
                                    ResultKt.throwOnFailure(obj13);
                                    bVar12 = bVar23;
                                    str21 = "toString(...)";
                                    b bVar202 = new b(0L, j33 - 1, j33, file10, 0L, true, 16, null);
                                    String url192 = url9.toString();
                                    Intrinsics.checkNotNullExpressionValue(url192, str21);
                                    x5Var9.a(url192, bVar202, bVar12);
                                    x5Var7 = x5Var9;
                                    j31 = j33;
                                    mb.a("Successfully cached " + dVar5.b() + " (" + file10.getAbsolutePath() + ", " + j31 + " bytes total, " + j26 + " new). New cache size: " + x5Var7.k.get(), (Throwable) null, 2, (Object) null);
                                    Result.Companion companion1022 = Result.INSTANCE;
                                    m8079constructorimpl3 = Result.m8079constructorimpl(file10);
                                    mutex15.unlock(null);
                                    return m8079constructorimpl3;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                    } else {
                        str = "Download failed: cacheKey=";
                    }
                    switch (gVar.r) {
                    }
                } catch (Throwable th28) {
                    th2 = th28;
                    r3 = "Expired file ";
                }
            } catch (Throwable th29) {
                th = th29;
                mutex2 = mutex;
            }
        } catch (Throwable th30) {
            th = th30;
            r15 = "Expired file ";
        }
        gVar = new g(continuation);
        Object obj132 = gVar.p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        String str222 = ", downloadedBytes=";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(URL url, long j2, Continuation continuation) {
        r rVar;
        int i2;
        try {
            if (continuation instanceof r) {
                rVar = (r) continuation;
                int i3 = rVar.f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    rVar.f = i3 - Integer.MIN_VALUE;
                    r rVar2 = rVar;
                    Object obj = rVar2.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = rVar2.f;
                    if (i2 == 0) {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j3 = rVar2.c;
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    }
                    ResultKt.throwOnFailure(obj);
                    mb.a("Starting new download for " + (j2 == -1 ? "complete file" : j2 + " bytes"), (Throwable) null, 2, (Object) null);
                    b a2 = a(url, j2);
                    rVar2.b = url;
                    rVar2.c = j2;
                    rVar2.f = 1;
                    Object a3 = a(url, j2, a2, rVar2);
                    return a3 == coroutine_suspended ? coroutine_suspended : a3;
                }
            }
            if (i2 == 0) {
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            mb.b("New download failed: url=" + url + ", requestedBytes=" + (j2 == -1 ? CampaignEx.JSON_NATIVE_VIDEO_COMPLETE : String.valueOf(j2)) + ", errorType=" + e3.getClass().getSimpleName() + ", message=" + e3.getMessage(), e3);
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(e3));
        }
        rVar = new r(continuation);
        r rVar22 = rVar;
        Object obj2 = rVar22.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = rVar22.f;
    }

    public static final long a(x5 x5Var) {
        return x5Var.k.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x010c, code lost:
    
        if (r3 == r10) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(URL url, File file, long j2, long j3, File file2, Continuation continuation) {
        q qVar;
        int i2;
        File file3;
        Object a2;
        File file4 = file;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i3 = qVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qVar.f = i3 - Integer.MIN_VALUE;
                q qVar2 = qVar;
                Object obj = qVar2.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = qVar2.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (j2 == -1) {
                        if (j3 > 0) {
                            mb.a("Resuming complete download from byte " + j3, (Throwable) null, 2, (Object) null);
                            m8 m8Var = this.c;
                            qVar2.f = 1;
                            Object a3 = m8Var.a(url, file, j3, Long.MAX_VALUE, qVar2);
                            if (a3 != coroutine_suspended) {
                                return a3;
                            }
                        } else {
                            m8 m8Var2 = this.c;
                            qVar2.f = 2;
                            Object a4 = m8Var2.a(url, file4, qVar2);
                            if (a4 != coroutine_suspended) {
                                return a4;
                            }
                        }
                    } else if (1 <= j3 && j3 < j2) {
                        file3 = new File(file2, "temp_resume_" + System.nanoTime() + "_" + url.hashCode() + ".tmp");
                        qVar2.b = file4;
                        qVar2.c = file3;
                        qVar2.f = 3;
                        a2 = this.c.a(url, file3, j3, j2 - 1, qVar2);
                    } else {
                        if (j3 >= j2) {
                            mb.a("Already have sufficient bytes (" + j3 + ") for requested " + j2, (Throwable) null, 2, (Object) null);
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m8079constructorimpl(Boxing.boxLong(0L));
                        }
                        qVar2.f = 4;
                        Object a5 = this.c.a(url, file, 0L, j2 - 1, qVar2);
                        if (a5 != coroutine_suspended) {
                            return a5;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                File file5 = (File) qVar2.c;
                File file6 = (File) qVar2.b;
                ResultKt.throwOnFailure(obj);
                a2 = ((Result) obj).getValue();
                file3 = file5;
                file4 = file6;
                if (!Result.m8086isSuccessimpl(a2)) {
                    try {
                        FilesKt.appendBytes(file4, FilesKt.readBytes(file3));
                        file3.delete();
                        return a2;
                    } catch (Exception e2) {
                        file3.delete();
                        Result.Companion companion2 = Result.INSTANCE;
                        return Result.m8079constructorimpl(ResultKt.createFailure(e2));
                    }
                }
                file3.delete();
                return a2;
            }
        }
        qVar = new q(continuation);
        q qVar22 = qVar;
        Object obj2 = qVar22.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = qVar22.f;
        if (i2 != 0) {
        }
        if (!Result.m8086isSuccessimpl(a2)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, b bVar, b bVar2) {
        b bVar3 = (b) this.n.get(str);
        if (bVar.c()) {
            mb.a("Storing complete download for " + str + " (" + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
            if (bVar3 != null && !Intrinsics.areEqual(bVar3.b(), bVar.b()) && bVar3.b().exists()) {
                long length = bVar3.b().length();
                if (bVar3.b().delete()) {
                    this.k.addAndGet(-length);
                    mb.a("Cleaned up old partial file. Freed " + length + " bytes.", (Throwable) null, 2, (Object) null);
                }
            }
            this.n.put(str, bVar);
            return;
        }
        if (bVar3 != null) {
            if (bVar3.c()) {
                mb.a("Keeping existing complete download for " + str + " instead of partial (" + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
            } else if (bVar.a() > bVar3.a()) {
                mb.a("Replacing smaller partial download for " + str + " (" + bVar3.a() + " -> " + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
            } else {
                mb.a("Keeping existing larger partial download for " + str + " (" + bVar3.a() + " vs " + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
            }
            if (!Intrinsics.areEqual(bVar3 != null ? bVar3.b() : null, bVar.b()) && bVar.b().exists()) {
                long length2 = bVar.b().length();
                if (bVar.b().delete()) {
                    this.k.addAndGet(-length2);
                    mb.a("Cleaned up inferior new partial file. Freed " + length2 + " bytes.", (Throwable) null, 2, (Object) null);
                }
            }
            if (bVar2 == null) {
                b bVar4 = (b) this.n.get(str);
                if (Intrinsics.areEqual(bVar2.b(), bVar.b())) {
                    return;
                }
                if (Intrinsics.areEqual(bVar2.b(), bVar4 != null ? bVar4.b() : null) || !bVar2.b().exists()) {
                    return;
                }
                long length3 = bVar2.b().length();
                if (bVar2.b().delete()) {
                    this.k.addAndGet(-length3);
                    mb.a("Cleaned up resumed partial file. Freed " + length3 + " bytes.", (Throwable) null, 2, (Object) null);
                    return;
                }
                return;
            }
            return;
        }
        mb.a("Storing first partial download for " + str + " (" + bVar.a() + " bytes)", (Throwable) null, 2, (Object) null);
        if (bVar3 != null && !Intrinsics.areEqual(bVar3.b(), bVar.b()) && bVar3.b().exists()) {
            long length4 = bVar3.b().length();
            if (bVar3.b().delete()) {
                this.k.addAndGet(-length4);
                mb.a("Cleaned up replaced partial file. Freed " + length4 + " bytes.", (Throwable) null, 2, (Object) null);
            }
        }
        this.n.put(str, bVar);
        if (bVar2 == null) {
        }
    }

    @Override // com.chartboost.sdk.impl.w6
    public Flow a(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.e.a(url);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b A[Catch: Exception -> 0x0080, CancellationException -> 0x00c1, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x00c1, Exception -> 0x0080, blocks: (B:27:0x004a, B:28:0x005f, B:30:0x006b, B:36:0x0051), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(URL url, Deferred deferred, Continuation continuation) {
        e eVar;
        int i2;
        URL url2;
        Exception e2;
        x5 x5Var;
        Object value;
        try {
            if (continuation instanceof e) {
                eVar = (e) continuation;
                int i3 = eVar.g;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    eVar.g = i3 - Integer.MIN_VALUE;
                    Object obj = eVar.e;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = eVar.g;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        eVar.b = this;
                        eVar.c = url;
                        eVar.g = 1;
                        obj = deferred.await(eVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        x5Var = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj2 = eVar.c;
                            url2 = (URL) eVar.b;
                            try {
                                ResultKt.throwOnFailure(obj);
                                return obj2;
                            } catch (CancellationException e3) {
                                e = e3;
                                url = url2;
                                mb.e("Awaited download cancelled: url=" + url, null, 2, null);
                                Result.Companion companion = Result.INSTANCE;
                                return Result.m8079constructorimpl(ResultKt.createFailure(e));
                            } catch (Exception e4) {
                                e2 = e4;
                                mb.e("Awaited download failed: url=" + url2 + ", errorType=" + e2.getClass().getSimpleName() + ", message=" + e2.getMessage(), e2);
                                Result.Companion companion2 = Result.INSTANCE;
                                return Result.m8079constructorimpl(ResultKt.createFailure(e2));
                            }
                        }
                        url = (URL) eVar.c;
                        x5Var = (x5) eVar.b;
                        ResultKt.throwOnFailure(obj);
                    }
                    value = ((Result) obj).getValue();
                    if (Result.m8086isSuccessimpl(value)) {
                        t3 t3Var = x5Var.b;
                        eVar.b = url;
                        eVar.c = value;
                        eVar.d = value;
                        eVar.g = 2;
                        if (t3Var.a((File) value, eVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return value;
                }
            }
            if (i2 != 0) {
            }
            value = ((Result) obj).getValue();
            if (Result.m8086isSuccessimpl(value)) {
            }
            return value;
        } catch (CancellationException e5) {
            e = e5;
        } catch (Exception e6) {
            url2 = url;
            e2 = e6;
        }
        eVar = new e(continuation);
        Object obj3 = eVar.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = eVar.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(URL url, long j2, Pair pair, Continuation continuation) {
        f fVar;
        int i2;
        String str;
        URL url2;
        x5 x5Var;
        long j3;
        Exception e2;
        long j4;
        CancellationException e3;
        Object value;
        File file;
        long j5 = j2;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i3 = fVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fVar.h = i3 - Integer.MIN_VALUE;
                Object obj = fVar.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = fVar.h;
                String str2 = CampaignEx.JSON_NATIVE_VIDEO_COMPLETE;
                switch (i2) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        str = (String) pair.component1();
                        Deferred deferred = (Deferred) pair.component2();
                        mb.a("Awaiting ongoing download: " + str + " for original request of " + (j5 == -1 ? "complete file" : j5 + " bytes"), (Throwable) null, 2, (Object) null);
                        try {
                            fVar.b = this;
                            url2 = url;
                            fVar.c = url2;
                            fVar.d = str;
                            fVar.e = j5;
                            fVar.h = 1;
                            obj = deferred.await(fVar);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            x5Var = this;
                            value = ((Result) obj).getValue();
                            if (!Result.m8085isFailureimpl(value)) {
                                mb.e("Ongoing download " + str + " failed, starting new download", null, 2, null);
                                fVar.b = null;
                                fVar.c = null;
                                fVar.d = null;
                                fVar.h = 2;
                                Object b2 = x5Var.b(url2, j5, fVar);
                                if (b2 != coroutine_suspended) {
                                    return b2;
                                }
                            } else {
                                if (Result.m8085isFailureimpl(value)) {
                                    value = null;
                                }
                                File file2 = (File) value;
                                if (file2 == null) {
                                    mb.e("Ongoing download " + str + " returned null file", null, 2, null);
                                    fVar.b = null;
                                    fVar.c = null;
                                    fVar.d = null;
                                    fVar.h = 3;
                                    Object b3 = x5Var.b(url2, j5, fVar);
                                    if (b3 != coroutine_suspended) {
                                        return b3;
                                    }
                                } else {
                                    Long a2 = x5Var.a(str);
                                    if (x5Var.a(j5, file2)) {
                                        mb.a("Ongoing download (" + file2.length() + " bytes) satisfies " + (j5 == -1 ? "complete file request" : "partial request (" + j5 + " bytes)"), (Throwable) null, 2, (Object) null);
                                        t3 t3Var = x5Var.b;
                                        fVar.b = file2;
                                        fVar.c = null;
                                        fVar.d = null;
                                        fVar.h = 4;
                                        if (t3Var.a(file2, fVar) != coroutine_suspended) {
                                            file = file2;
                                            Result.Companion companion = Result.INSTANCE;
                                            return Result.m8079constructorimpl(file);
                                        }
                                    } else if (j5 == -1) {
                                        mb.a("Ongoing partial download completed, but we need complete file - starting resume download", (Throwable) null, 2, (Object) null);
                                        x5Var.a(url2, file2, file2.length(), false);
                                        fVar.b = null;
                                        fVar.c = null;
                                        fVar.d = null;
                                        fVar.h = 5;
                                        Object b4 = x5Var.b(url2, j5, fVar);
                                        if (b4 != coroutine_suspended) {
                                            return b4;
                                        }
                                    } else {
                                        mb.a("Ongoing download (" + file2.length() + " bytes) insufficient for request (" + j5 + " bytes) - starting larger download", (Throwable) null, 2, (Object) null);
                                        x5Var.a(url2, file2, file2.length(), a2 == null);
                                        fVar.b = null;
                                        fVar.c = null;
                                        fVar.d = null;
                                        fVar.h = 6;
                                        Object b5 = x5Var.b(url2, j5, fVar);
                                        if (b5 != coroutine_suspended) {
                                            return b5;
                                        }
                                    }
                                }
                            }
                            return coroutine_suspended;
                        } catch (CancellationException e4) {
                            e3 = e4;
                            j4 = -1;
                            if (j5 != j4) {
                            }
                            mb.e("Ongoing download cancelled: cacheKey=" + str + ", requestedBytes=" + str2, null, 2, null);
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m8079constructorimpl(ResultKt.createFailure(e3));
                        } catch (Exception e5) {
                            e2 = e5;
                            j3 = -1;
                            if (j5 != j3) {
                            }
                            mb.b("Ongoing download failed: cacheKey=" + str + ", requestedBytes=" + str2 + ", errorType=" + e2.getClass().getSimpleName() + ", message=" + e2.getMessage(), e2);
                            Result.Companion companion3 = Result.INSTANCE;
                            return Result.m8079constructorimpl(ResultKt.createFailure(e2));
                        }
                    case 1:
                        j5 = fVar.e;
                        str = (String) fVar.d;
                        URL url3 = (URL) fVar.c;
                        x5Var = (x5) fVar.b;
                        try {
                            ResultKt.throwOnFailure(obj);
                            url2 = url3;
                            value = ((Result) obj).getValue();
                            if (!Result.m8085isFailureimpl(value)) {
                            }
                            return coroutine_suspended;
                        } catch (CancellationException e6) {
                            e3 = e6;
                            j4 = -1;
                            if (j5 != j4) {
                                str2 = String.valueOf(j5);
                            }
                            mb.e("Ongoing download cancelled: cacheKey=" + str + ", requestedBytes=" + str2, null, 2, null);
                            Result.Companion companion22 = Result.INSTANCE;
                            return Result.m8079constructorimpl(ResultKt.createFailure(e3));
                        } catch (Exception e7) {
                            e2 = e7;
                            j3 = -1;
                            if (j5 != j3) {
                                str2 = String.valueOf(j5);
                            }
                            mb.b("Ongoing download failed: cacheKey=" + str + ", requestedBytes=" + str2 + ", errorType=" + e2.getClass().getSimpleName() + ", message=" + e2.getMessage(), e2);
                            Result.Companion companion32 = Result.INSTANCE;
                            return Result.m8079constructorimpl(ResultKt.createFailure(e2));
                        }
                    case 2:
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    case 3:
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    case 4:
                        file = (File) fVar.b;
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion4 = Result.INSTANCE;
                        return Result.m8079constructorimpl(file);
                    case 5:
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).getValue();
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = fVar.h;
        String str22 = CampaignEx.JSON_NATIVE_VIDEO_COMPLETE;
        switch (i2) {
        }
    }

    public final void a(URL url, File file, long j2, boolean z) {
        String url2 = url.toString();
        Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
        mb.a("Updating download info for " + url2 + ": " + j2 + " bytes, complete=" + z, (Throwable) null, 2, (Object) null);
        b bVar = new b(0L, j2 - 1, j2, file, System.currentTimeMillis(), z);
        b bVar2 = (b) this.n.get(url2);
        if (bVar2 != null) {
            if (bVar.c() && !bVar2.c()) {
                mb.a("Replacing partial download with complete download for " + url2, (Throwable) null, 2, (Object) null);
                if (!Intrinsics.areEqual(bVar2.b(), bVar.b()) && bVar2.b().exists()) {
                    long length = bVar2.b().length();
                    if (bVar2.b().delete()) {
                        this.k.addAndGet(-length);
                        mb.a("Cleaned up old partial file: " + bVar2.b().getName(), (Throwable) null, 2, (Object) null);
                    }
                }
                this.n.put(url2, bVar);
                this.k.addAndGet(j2);
                return;
            }
            if (bVar.a() > bVar2.a()) {
                mb.a("Replacing smaller download (" + bVar2.a() + ") with larger (" + bVar.a() + ") for " + url2, (Throwable) null, 2, (Object) null);
                if (!Intrinsics.areEqual(bVar2.b(), bVar.b()) && bVar2.b().exists()) {
                    long length2 = bVar2.b().length();
                    if (bVar2.b().delete()) {
                        this.k.addAndGet(-length2);
                        mb.a("Cleaned up old smaller file: " + bVar2.b().getName(), (Throwable) null, 2, (Object) null);
                    }
                }
                this.n.put(url2, bVar);
                this.k.addAndGet(j2 - bVar2.a());
                return;
            }
            mb.a("Keeping existing download for " + url2 + " (existing: " + bVar2.a() + ", new: " + bVar.a() + ")", (Throwable) null, 2, (Object) null);
            return;
        }
        mb.a("Storing new download info for " + url2, (Throwable) null, 2, (Object) null);
        this.n.put(url2, bVar);
        this.k.addAndGet(j2);
    }
}
