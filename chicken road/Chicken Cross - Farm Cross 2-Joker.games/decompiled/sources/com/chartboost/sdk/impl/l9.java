package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.widget.ImageView;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.e4;
import com.chartboost.sdk.impl.ld;
import com.chartboost.sdk.impl.rj;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes4.dex */
public final class l9 extends j2 {
    public static final a z = new a(null);
    public final Context n;
    public final URL o;
    public final v4 p;
    public final ld q;
    public final ae r;
    public final u2 s;
    public final List t;
    public Function0 u;
    public final AtomicBoolean v;
    public final Mutex w;
    public ImageView x;
    public Bitmap y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object a2 = l9.this.a((Context) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ Context g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, Continuation continuation) {
            super(2, continuation);
            this.g = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return l9.this.new c(this.g, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00fd A[Catch: all -> 0x002c, TryCatch #1 {all -> 0x002c, blocks: (B:7:0x0021, B:8:0x00f7, B:10:0x00fd, B:12:0x0103, B:14:0x0113, B:15:0x0116, B:16:0x017f, B:21:0x011c, B:23:0x0122, B:25:0x013c, B:27:0x014c, B:28:0x014f, B:30:0x0169, B:32:0x016f, B:33:0x017c), top: B:6:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x011c A[Catch: all -> 0x002c, TryCatch #1 {all -> 0x002c, blocks: (B:7:0x0021, B:8:0x00f7, B:10:0x00fd, B:12:0x0103, B:14:0x0113, B:15:0x0116, B:16:0x017f, B:21:0x011c, B:23:0x0122, B:25:0x013c, B:27:0x014c, B:28:0x014f, B:30:0x0169, B:32:0x016f, B:33:0x017c), top: B:6:0x0021 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            l9 l9Var;
            Context context;
            Mutex mutex2;
            Throwable th;
            l9 l9Var2;
            Object obj2;
            Context context2;
            Object m8079constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    mb.a("Image load initiated: url=" + l9.this.o + ", auctionId=" + l9.this.u().c() + ", hasCompanionData=" + (l9.this.p != null), (Throwable) null, 2, (Object) null);
                    mutex = l9.this.w;
                    l9 l9Var3 = l9.this;
                    Context context3 = this.g;
                    this.b = mutex;
                    this.c = l9Var3;
                    this.d = context3;
                    this.e = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                        l9Var = l9Var3;
                        context = context3;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context2 = (Context) this.d;
                    l9Var2 = (l9) this.c;
                    mutex2 = (Mutex) this.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        obj2 = ((Result) obj).getValue();
                        if (Result.m8085isFailureimpl(obj2)) {
                            Bitmap G = l9Var2.G();
                            if (G == null) {
                                mb.b("Bitmap was null after successful load for URL: " + l9Var2.o, (Throwable) null, 2, (Object) null);
                                if (l9Var2.p != null && ((Boolean) l9Var2.H().invoke()).booleanValue()) {
                                    l9Var2.E();
                                }
                                l9Var2.b(gh.h);
                                Result.Companion companion = Result.INSTANCE;
                                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Unknown("Bitmap was null after successful load", null, 2, null)));
                                mutex = mutex2;
                                mutex2 = mutex;
                                obj2 = m8079constructorimpl;
                            } else {
                                ImageView I = l9Var2.I();
                                if (I == null) {
                                    Context applicationContext = context2.getApplicationContext();
                                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                                    I = l9Var2.a(G, applicationContext);
                                }
                                l9Var2.a(I);
                            }
                        } else {
                            if (l9Var2.p != null && ((Boolean) l9Var2.H().invoke()).booleanValue()) {
                                l9Var2.E();
                            }
                            l9Var2.b(gh.h);
                        }
                        Result m8078boximpl = Result.m8078boximpl(obj2);
                        mutex2.unlock(null);
                        return m8078boximpl;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                context = (Context) this.d;
                l9Var = (l9) this.c;
                Mutex mutex3 = (Mutex) this.b;
                ResultKt.throwOnFailure(obj);
                mutex = mutex3;
                if (l9Var.I() != null && l9Var.G() != null) {
                    mb.a("Image already loaded, skipping: url=" + l9Var.o + ", auctionId=" + l9Var.u().c(), (Throwable) null, 2, (Object) null);
                    Result.Companion companion2 = Result.INSTANCE;
                    m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
                    mutex2 = mutex;
                    obj2 = m8079constructorimpl;
                    Result m8078boximpl2 = Result.m8078boximpl(obj2);
                    mutex2.unlock(null);
                    return m8078boximpl2;
                }
                URL url = l9Var.o;
                this.b = mutex;
                this.c = l9Var;
                this.d = context;
                this.e = 2;
                Object a2 = l9Var.a(url, this);
                if (a2 != coroutine_suspended) {
                    l9Var2 = l9Var;
                    Context context4 = context;
                    mutex2 = mutex;
                    obj2 = a2;
                    context2 = context4;
                    if (Result.m8085isFailureimpl(obj2)) {
                    }
                    Result m8078boximpl22 = Result.m8078boximpl(obj2);
                    mutex2.unlock(null);
                    return m8078boximpl22;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                mutex2 = mutex;
                th = th3;
                mutex2.unlock(null);
                throw th;
            }
        }
    }

    public static final class d extends ContinuationImpl {
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object a2 = l9.this.a((URL) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public Object b;
        public Object c;
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ URL g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(URL url, Continuation continuation) {
            super(2, continuation);
            this.g = url;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = l9.this.new e(this.g, continuation);
            eVar.e = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m8079constructorimpl;
            Object a2;
            URL url;
            l9 l9Var;
            pd pdVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.d;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.e;
                    l9 l9Var2 = l9.this;
                    URL url2 = this.g;
                    Result.Companion companion = Result.INSTANCE;
                    ld ldVar = l9Var2.q;
                    String url3 = url2.toString();
                    Intrinsics.checkNotNullExpressionValue(url3, "toString(...)");
                    this.e = l9Var2;
                    this.b = url2;
                    this.c = coroutineScope;
                    this.d = 1;
                    a2 = ld.a.a(ldVar, url3, null, this, 2, null);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    url = url2;
                    l9Var = l9Var2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    URL url4 = (URL) this.b;
                    l9 l9Var3 = (l9) this.e;
                    ResultKt.throwOnFailure(obj);
                    l9Var = l9Var3;
                    url = url4;
                    a2 = obj;
                }
                pdVar = (pd) a2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
            }
            if (!pdVar.e()) {
                String c = l9Var.u().c();
                int d = pdVar.d();
                Throwable c2 = pdVar.c();
                mb.b("ImageRenderable download failed: url=" + url + ", auctionId=" + c + ", statusCode=" + d + ", errorMessage=" + (c2 != null ? c2.getMessage() : null), (Throwable) null, 2, (Object) null);
                Throwable c3 = pdVar.c();
                if (c3 == null) {
                    throw new IOException("Failed to download image: " + pdVar.d());
                }
                throw c3;
            }
            byte[] b = pdVar.b();
            if (b == null) {
                mb.b("ImageRenderable response body null: url=" + url + ", auctionId=" + l9Var.u().c() + ", statusCode=" + pdVar.d(), (Throwable) null, 2, (Object) null);
                throw new IOException("Response body was null for URL: " + url);
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(byteArrayInputStream);
                if (decodeStream == null) {
                    mb.b("ImageRenderable bitmap decode failed: url=" + url + ", auctionId=" + l9Var.u().c() + ", bytesReceived=" + b.length, (Throwable) null, 2, (Object) null);
                    throw new IOException("Failed to decode image from URL: " + url);
                }
                l9Var.a(decodeStream);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(byteArrayInputStream, null);
                int length = b.length;
                Bitmap G = l9Var.G();
                Integer boxInt = G != null ? Boxing.boxInt(G.getWidth()) : null;
                Bitmap G2 = l9Var.G();
                mb.a("ImageRenderable loaded successfully: url=" + url + ", bytesDownloaded=" + length + ", bitmapSize=" + boxInt + "x" + (G2 != null ? Boxing.boxInt(G2.getHeight()) : null), (Throwable) null, 2, (Object) null);
                m8079constructorimpl = Result.m8079constructorimpl(unit);
                URL url5 = this.g;
                l9 l9Var4 = l9.this;
                Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
                if (m8082exceptionOrNullimpl == null) {
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m8078boximpl(Result.m8079constructorimpl(Unit.INSTANCE));
                }
                mb.b("ImageRenderable load failed: url=" + url5 + ", auctionId=" + l9Var4.u().c() + ", errorType=" + m8082exceptionOrNullimpl.getClass().getSimpleName(), m8082exceptionOrNullimpl);
                Result.Companion companion4 = Result.INSTANCE;
                return Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(l9Var4.a(m8082exceptionOrNullimpl, url5))));
            } finally {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(Context context, URL imageUrl, v4 v4Var, qf renderableConfig, a0 adMarkupConfig, ld networkClient, wh trackerComponent, kh telemetryManager, u adFormat, Mediation mediation, ae openMeasurementManager, u2 cbIdentity, List vastErrorTrackingEvents) {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation, null, null, 192, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(cbIdentity, "cbIdentity");
        Intrinsics.checkNotNullParameter(vastErrorTrackingEvents, "vastErrorTrackingEvents");
        this.n = context;
        this.o = imageUrl;
        this.p = v4Var;
        this.q = networkClient;
        this.r = openMeasurementManager;
        this.s = cbIdentity;
        this.t = vastErrorTrackingEvents;
        this.u = new Function0() { // from class: com.chartboost.sdk.impl.l9$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(l9.F());
            }
        };
        this.v = new AtomicBoolean(false);
        this.w = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        if (this.v.compareAndSet(false, true)) {
            for (ii iiVar : this.t) {
                dj.f4736a.a(rj.h.b, new sj(null, ii.a(iiVar, null, null, 0, null, MapsKt.plus(iiVar.c(), TuplesKt.to("VAST_ERROR_CODE", Integer.valueOf(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION))), 0L, 47, null), this.n, this.r, this.s, null, null, null, null, null, null, null, null, null, 16353, null));
            }
        }
    }

    public static final boolean F() {
        return true;
    }

    @Override // com.chartboost.sdk.impl.j2
    public void D() {
        List<ii> i;
        v4 v4Var = this.p;
        if (v4Var != null && (i = v4Var.i()) != null) {
            for (ii iiVar : i) {
                if (Intrinsics.areEqual(iiVar.b(), "creativeView")) {
                    dj.f4736a.a(rj.g.b, new sj(null, iiVar, this.n, this.r, this.s, null, null, null, null, null, null, null, null, null, 16353, null));
                }
            }
        }
        super.D();
    }

    public final Bitmap G() {
        return this.y;
    }

    public final Function0 H() {
        return this.u;
    }

    public final ImageView I() {
        return this.x;
    }

    @Override // com.chartboost.sdk.impl.pf
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public ImageView o() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return this.x;
        }
        throw new IllegalStateException("nextAd() must be called from the main thread for ImageRenderable.");
    }

    public final void a(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.u = function0;
    }

    public final void a(ImageView imageView) {
        this.x = imageView;
    }

    public final void a(Bitmap bitmap) {
        this.y = bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.chartboost.sdk.impl.pf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Context context, Continuation continuation) {
        b bVar;
        int i;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
                Object obj = bVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    c cVar = new c(context, null);
                    bVar.d = 1;
                    obj = BuildersKt.withContext(main, cVar, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.d;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final ImageView a(Bitmap bitmap, Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(bitmap);
        return imageView;
    }

    @Override // com.chartboost.sdk.impl.pf
    public void a(boolean z2, Integer num, Integer num2, e4 e4Var) {
        List emptyList;
        tf n;
        v4 v4Var = this.p;
        if (v4Var != null) {
            String b2 = v4Var.b();
            ob a2 = rb.a(this.n, this.r, this.s, new Function1() { // from class: com.chartboost.sdk.impl.l9$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l9.a(l9.this, (pb) obj);
                }
            });
            List c2 = v4Var.c();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c2, 10));
            Iterator it = c2.iterator();
            while (it.hasNext()) {
                arrayList.add(rb.a((String) it.next(), a2));
            }
            if (e4Var == null || (emptyList = e4Var.b()) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            e4.c cVar = new e4.c(CollectionsKt.plus((Collection) emptyList, (Iterable) arrayList), b2);
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            a(b2, z2, cVar, uuid);
            if (!v().a(cVar, z2, uuid) || (n = n()) == null) {
                return;
            }
            n.f();
            return;
        }
        mb.b("Got to an ImageRenderable click without a clickthrough or companion ad data.", (Throwable) null, 2, (Object) null);
    }

    public static final Unit a(l9 l9Var, pb macroContext) {
        Intrinsics.checkNotNullParameter(macroContext, "$this$macroContext");
        macroContext.a(l9Var.t());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(URL url, Continuation continuation) {
        d dVar;
        int i;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
                Object obj = dVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    e eVar = new e(url, null);
                    dVar.d = 1;
                    obj = BuildersKt.withContext(io2, eVar, dVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dVar.d;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final ChartboostError a(Throwable th, URL url) {
        if (th instanceof ChartboostError) {
            return (ChartboostError) th;
        }
        if (th instanceof IOException) {
            return new ChartboostError.Load.AssetUnavailable(url.toString(), "Failed to load image from URL: " + url, th);
        }
        return new ChartboostError.Load.Unknown("Failed to load image from URL: " + url, th instanceof Exception ? (Exception) th : new Exception(th));
    }

    @Override // com.chartboost.sdk.impl.j2
    public void a(gh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.x = null;
        Bitmap bitmap = this.y;
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                bitmap = null;
            }
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.y = null;
        mb.a("Image stopped and resources cleaned: url=" + this.o + ", auctionId=" + u().c() + ", reason=" + reason, (Throwable) null, 2, (Object) null);
    }
}
