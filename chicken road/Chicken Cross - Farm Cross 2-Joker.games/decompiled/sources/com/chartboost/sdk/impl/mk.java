package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.impl.lk;
import com.chartboost.sdk.impl.ok;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public final class mk implements lk, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final ak f4883a;
    public final s7 b;
    public final Function1 c;
    public final CoroutineDispatcher d;
    public final Lazy e;
    public final Lazy f;
    public x7 g;
    public Job h;

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
            return mk.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long i2 = mk.this.f4883a.i();
                this.b = 1;
                if (DelayKt.delay(i2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            mk.this.h = null;
            try {
                lk.a.a(mk.this, null, 0, false, 7, null);
            } catch (IllegalStateException e) {
                mb.b("Cannot start download", e);
            }
            return Unit.INSTANCE;
        }
    }

    public mk(ak policy, s7 downloadManager, Function1 fileCachingFactory, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(fileCachingFactory, "fileCachingFactory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f4883a = policy;
        this.b = downloadManager;
        this.c = fileCachingFactory;
        this.d = dispatcher;
        this.e = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.mk$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mk.a();
            }
        });
        this.f = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.mk$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mk.f();
            }
        });
    }

    public static final y7 b(Context c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return new y7(c, null, null, null, 14, null);
    }

    public static final ConcurrentHashMap f() {
        return new ConcurrentHashMap();
    }

    public final ConcurrentHashMap c() {
        return (ConcurrentHashMap) this.f.getValue();
    }

    public final void d(wj wjVar) {
        mb.a("startForcedDownload() - " + wjVar, (Throwable) null, 2, (Object) null);
        this.f4883a.a();
        this.b.a(wjVar);
    }

    public final void e() {
        Job launch$default;
        if (this.h == null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.d), null, null, new a(null), 3, null);
            this.h = launch$default;
        }
    }

    public final ConcurrentHashMap b() {
        return (ConcurrentHashMap) this.e.getValue();
    }

    public final File c(String str) {
        x7 x7Var = this.g;
        if (x7Var != null) {
            return x7Var.a(str);
        }
        return null;
    }

    public static final ConcurrentHashMap a() {
        return new ConcurrentHashMap();
    }

    public final wj b(wj wjVar) {
        b().put(wjVar.d(), wjVar);
        return wjVar;
    }

    public final wj c(wj wjVar) {
        mb.a("queueDownload() - asset: " + wjVar, (Throwable) null, 2, (Object) null);
        a(wjVar, s6.e);
        return wjVar;
    }

    @Override // com.chartboost.sdk.impl.lk
    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        mb.a("initialize()", (Throwable) null, 2, (Object) null);
        this.g = (x7) this.c.invoke(context);
        s7 s7Var = this.b;
        s7Var.a();
        s7Var.a(this);
        s7Var.b();
    }

    @Override // com.chartboost.sdk.impl.lk
    public boolean b(String videoFilename) {
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        return this.b.c(videoFilename);
    }

    public final void d() {
        s6 s6Var;
        if (this.f4883a.g()) {
            e();
            s6Var = s6.f;
        } else {
            s6Var = s6.d;
        }
        if (s6Var == s6.d) {
            this.f4883a.a();
        }
        this.b.a(s6Var);
    }

    public final void e(wj wjVar) {
        s6 s6Var;
        if (this.f4883a.g()) {
            e();
            s6Var = s6.f;
        } else {
            s6Var = s6.d;
        }
        a(wjVar, s6Var);
    }

    @Override // com.chartboost.sdk.impl.lk
    public void a(String url, String filename, boolean z, t0 t0Var) {
        wj a2;
        wj b;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filename, "filename");
        mb.a("downloadVideoFile() - url: " + url + ", filename: " + filename + ", showImmediately: " + z + ", callback: " + t0Var, (Throwable) null, 2, (Object) null);
        if (t0Var != null) {
            c().put(url, t0Var);
        }
        File c = c(filename);
        if (c == null || (a2 = a(c, url)) == null || (b = b(a2)) == null || c(b) == null) {
            mb.a("downloadVideoFile() - cache file is null", (Throwable) null, 2, (Object) null);
        }
        lk.a.a(this, filename, 0, z, 2, null);
    }

    public /* synthetic */ mk(ak akVar, s7 s7Var, Function1 function1, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(akVar, s7Var, (i & 4) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.mk$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mk.b((Context) obj);
            }
        } : function1, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final wj a(File file, String str) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        wj wjVar = new wj(str, name, file, file.getParentFile(), 0L, null, 0L, 112, null);
        file.setLastModified(wjVar.a());
        return wjVar;
    }

    @Override // com.chartboost.sdk.impl.lk
    public void a(String str, int i, boolean z) {
        wj wjVar;
        mb.a("startDownloadIfPossible() - filename " + str + ", forceDownload " + z, (Throwable) null, 2, (Object) null);
        if (str != null && (wjVar = (wj) b().get(str)) != null) {
            mb.a("startDownloadIfPossible() - asset: " + wjVar, (Throwable) null, 2, (Object) null);
            if (z) {
                d(wjVar);
                return;
            } else {
                e(wjVar);
                return;
            }
        }
        mb.a("startDownloadIfPossible() - null asset, resume next download in Download Manager index", (Throwable) null, 2, (Object) null);
        d();
    }

    public final void a(wj wjVar, s6 s6Var) {
        mb.a("sendDownloadToDownloadManager() - " + wjVar, (Throwable) null, 2, (Object) null);
        if (s6Var == s6.d) {
            this.f4883a.a();
        }
        this.b.a(wjVar, s6Var);
    }

    @Override // com.chartboost.sdk.impl.lk
    public wj a(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        return (wj) b().get(filename);
    }

    @Override // com.chartboost.sdk.impl.lk
    public int a(wj wjVar) {
        if (wjVar != null) {
            return zf.a(this.b.d(wjVar.d()));
        }
        return 0;
    }

    @Override // com.chartboost.sdk.impl.ok.a
    public void a(String url, String videoFileName, long j, t0 t0Var) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        mb.a("tempFileIsReady() - url " + url + ", videoFileName " + videoFileName, (Throwable) null, 2, (Object) null);
        if (t0Var == null) {
            t0Var = (t0) c().get(url);
        }
        if (t0Var != null) {
            t0Var.a(url);
        }
    }

    @Override // com.chartboost.sdk.impl.ok.a
    public void a(String uri, String videoFileName) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        mb.a("onSuccess() - uri " + uri + ", videoFileName " + videoFileName, (Throwable) null, 2, (Object) null);
        c().remove(uri);
        lk.a.a(this, null, 0, false, 7, null);
    }

    @Override // com.chartboost.sdk.impl.ok.a
    public void a(String uri, String videoFileName, CBError cBError) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        mb.a("onError() - uri " + uri + ", videoFileName " + videoFileName + ", error " + cBError, (Throwable) null, 2, (Object) null);
        c().remove(uri);
    }
}
