package com.bbflight.background_downloader;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.preference.PreferenceManager;
import com.bbflight.background_downloader.M;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.FlutterCallbackInformation;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1117w;
import kotlinx.coroutines.C1119x;
import kotlinx.serialization.json.b;

/* loaded from: classes3.dex */
public final class M {
    public static MethodChannel a;
    public static final a Companion = new a();
    public static final kotlinx.coroutines.sync.c b = kotlinx.coroutines.sync.d.a();

    @SourceDebugExtension({"SMAP\nCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Callbacks.kt\ncom/bbflight/background_downloader/Callbacks$Companion\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,171:1\n120#2,10:172\n120#2,8:182\n129#2:191\n96#3:190\n113#4:192\n*S KotlinDebug\n*F\n+ 1 Callbacks.kt\ncom/bbflight/background_downloader/Callbacks$Companion\n*L\n42#1:172,10\n115#1:182,8\n115#1:191\n129#1:190\n119#1:192\n*E\n"})
    public static final class a {
        public static /* synthetic */ Object c(a aVar, Context context, String str, M0 m0, c1 c1Var, ContinuationImpl continuationImpl, int i) {
            if ((i & 4) != 0) {
                m0 = null;
            }
            if ((i & 8) != 0) {
                c1Var = null;
            }
            return aVar.b(context, str, m0, c1Var, continuationImpl);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
        
            if (r11 == r1) goto L28;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0033, B:20:0x0067, B:22:0x006b), top: B:7:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009d A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        /* JADX WARN: Type inference failed for: r10v0, types: [android.content.Context, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v1, types: [kotlinx.coroutines.sync.a] */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.a] */
        /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.sync.a] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(Context context, ContinuationImpl continuationImpl) {
            H h;
            int i;
            int i2;
            final Context context2;
            kotlinx.coroutines.sync.c cVar;
            MethodChannel methodChannel;
            try {
                if (continuationImpl instanceof H) {
                    h = (H) continuationImpl;
                    int i3 = h.i;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        h.i = i3 - Integer.MIN_VALUE;
                        Object obj = h.e;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = h.i;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            kotlinx.coroutines.sync.c cVar2 = M.b;
                            h.a = context;
                            h.b = cVar2;
                            i2 = 0;
                            h.d = 0;
                            h.i = 1;
                            if (cVar2.d(h) != coroutine_suspended) {
                                context2 = context;
                                cVar = cVar2;
                            }
                            return coroutine_suspended;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlinx.coroutines.sync.a aVar = h.b;
                            ResultKt.throwOnFailure(obj);
                            context = aVar;
                            return obj;
                        }
                        int i4 = h.d;
                        ?? r2 = h.b;
                        context2 = (Context) h.a;
                        ResultKt.throwOnFailure(obj);
                        i2 = i4;
                        cVar = r2;
                        methodChannel = M.a;
                        if (methodChannel == null) {
                            return methodChannel;
                        }
                        final C1117w a = C1119x.a();
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bbflight.background_downloader.G
                            @Override // java.lang.Runnable
                            public final void run() {
                                Context context3 = context2;
                                C1117w c1117w = a;
                                try {
                                    long j = PreferenceManager.getDefaultSharedPreferences(context3).getLong("com.bbflight.background_downloader.callbackDispatcherRawHandle", -1L);
                                    if (j == -1) {
                                        return;
                                    }
                                    FlutterEngine flutterEngine = new FlutterEngine(context3, (String[]) null, false);
                                    FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j);
                                    if (lookupCallbackInformation == null) {
                                        return;
                                    }
                                    String findAppBundlePath = FlutterInjector.instance().flutterLoader().findAppBundlePath();
                                    Intrinsics.checkNotNullExpressionValue(findAppBundlePath, "findAppBundlePath(...)");
                                    flutterEngine.getDartExecutor().executeDartCallback(new DartExecutor.DartCallback(context3.getAssets(), findAppBundlePath, lookupCallbackInformation));
                                    M.a aVar2 = M.Companion;
                                    MethodChannel methodChannel2 = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "com.bbflight.background_downloader.callbacks");
                                    M.a = methodChannel2;
                                    c1117w.M(methodChannel2);
                                } catch (Exception unused) {
                                    c1117w.M(null);
                                }
                            }
                        });
                        h.a = SpillingKt.nullOutSpilledVariable(context2);
                        h.b = cVar;
                        h.c = SpillingKt.nullOutSpilledVariable(a);
                        h.d = i2;
                        h.i = 2;
                        obj = a.await(h);
                        context = cVar;
                    }
                }
                if (i != 0) {
                }
                methodChannel = M.a;
                if (methodChannel == null) {
                }
            } finally {
                context.c(null);
            }
            h = new H(this, continuationImpl);
            Object obj2 = h.e;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = h.i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0136 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #1 {all -> 0x004f, blocks: (B:13:0x004a, B:14:0x0130, B:20:0x0136), top: B:12:0x004a }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
        /* JADX WARN: Type inference failed for: r19v0, types: [com.bbflight.background_downloader.M$a] */
        /* JADX WARN: Type inference failed for: r6v4, types: [kotlinx.coroutines.sync.a] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(Context context, String str, M0 m0, c1 c1Var, ContinuationImpl continuationImpl) {
            I i;
            int i2;
            String str2;
            M0 m02;
            c1 c1Var2;
            Context context2;
            Object obj;
            MethodChannel methodChannel;
            kotlinx.coroutines.sync.c cVar;
            final String str3;
            final M0 m03;
            int i3;
            kotlinx.coroutines.sync.a aVar;
            String str4;
            M0 m04;
            if (continuationImpl instanceof I) {
                i = (I) continuationImpl;
                int i4 = i.m;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    i.m = i4 - Integer.MIN_VALUE;
                    Object obj2 = i.k;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = i.m;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        i.a = SpillingKt.nullOutSpilledVariable(context);
                        str2 = str;
                        i.b = str2;
                        m02 = m0;
                        i.c = m02;
                        c1Var2 = c1Var;
                        i.d = c1Var2;
                        i.m = 1;
                        Object a = a(context, i);
                        if (a != coroutine_suspended) {
                            context2 = context;
                            obj = a;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = i.f;
                            try {
                                ResultKt.throwOnFailure(obj2);
                                str4 = (String) obj2;
                                if (str4 != null) {
                                    m04 = null;
                                } else {
                                    b.a aVar2 = kotlinx.serialization.json.b.d;
                                    aVar2.getClass();
                                    m04 = (M0) aVar2.a(M0.Companion.serializer(), str4);
                                }
                                aVar.c(null);
                                return m04;
                            } catch (Throwable th) {
                                th = th;
                                aVar.c(null);
                                throw th;
                            }
                        }
                        i3 = i.j;
                        ?? r6 = i.f;
                        methodChannel = (MethodChannel) i.e;
                        c1Var2 = (c1) i.d;
                        M0 m05 = (M0) i.c;
                        String str5 = (String) i.b;
                        Context context3 = (Context) i.a;
                        ResultKt.throwOnFailure(obj2);
                        m03 = m05;
                        str3 = str5;
                        context2 = context3;
                        cVar = r6;
                        final MethodChannel methodChannel2 = methodChannel;
                        final c1 c1Var3 = c1Var2;
                        try {
                            final C1117w a2 = C1119x.a();
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bbflight.background_downloader.F
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String b;
                                    M0 m06 = M0.this;
                                    if (m06 != null) {
                                        b.a aVar3 = kotlinx.serialization.json.b.d;
                                        aVar3.getClass();
                                        b = aVar3.b(M0.Companion.serializer(), m06);
                                    } else {
                                        b.a aVar4 = kotlinx.serialization.json.b.d;
                                        aVar4.getClass();
                                        b = aVar4.b(kotlinx.serialization.builtins.a.c(c1.Companion.serializer()), c1Var3);
                                    }
                                    methodChannel2.invokeMethod(str3, b, new Y(a2));
                                }
                            });
                            i.a = SpillingKt.nullOutSpilledVariable(context2);
                            i.b = SpillingKt.nullOutSpilledVariable(str3);
                            i.c = SpillingKt.nullOutSpilledVariable(m03);
                            i.d = SpillingKt.nullOutSpilledVariable(c1Var3);
                            i.e = SpillingKt.nullOutSpilledVariable(methodChannel2);
                            i.f = cVar;
                            i.i = SpillingKt.nullOutSpilledVariable(a2);
                            i.j = i3;
                            i.m = 3;
                            obj2 = a2.await(i);
                            if (obj2 != coroutine_suspended) {
                                aVar = cVar;
                                str4 = (String) obj2;
                                if (str4 != null) {
                                }
                                aVar.c(null);
                                return m04;
                            }
                            return coroutine_suspended;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar = cVar;
                            aVar.c(null);
                            throw th;
                        }
                    }
                    c1 c1Var4 = (c1) i.d;
                    M0 m06 = (M0) i.c;
                    String str6 = (String) i.b;
                    context2 = (Context) i.a;
                    ResultKt.throwOnFailure(obj2);
                    obj = obj2;
                    str2 = str6;
                    c1Var2 = c1Var4;
                    m02 = m06;
                    methodChannel = (MethodChannel) obj;
                    if (methodChannel != null) {
                        return null;
                    }
                    cVar = M.b;
                    i.a = SpillingKt.nullOutSpilledVariable(context2);
                    i.b = str2;
                    i.c = m02;
                    i.d = c1Var2;
                    i.e = methodChannel;
                    i.f = cVar;
                    i.j = 0;
                    i.m = 2;
                    if (cVar.d(i) != coroutine_suspended) {
                        str3 = str2;
                        m03 = m02;
                        i3 = 0;
                        final MethodChannel methodChannel22 = methodChannel;
                        final c1 c1Var32 = c1Var2;
                        final C1117w a22 = C1119x.a();
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bbflight.background_downloader.F
                            @Override // java.lang.Runnable
                            public final void run() {
                                String b;
                                M0 m062 = M0.this;
                                if (m062 != null) {
                                    b.a aVar3 = kotlinx.serialization.json.b.d;
                                    aVar3.getClass();
                                    b = aVar3.b(M0.Companion.serializer(), m062);
                                } else {
                                    b.a aVar4 = kotlinx.serialization.json.b.d;
                                    aVar4.getClass();
                                    b = aVar4.b(kotlinx.serialization.builtins.a.c(c1.Companion.serializer()), c1Var32);
                                }
                                methodChannel22.invokeMethod(str3, b, new Y(a22));
                            }
                        });
                        i.a = SpillingKt.nullOutSpilledVariable(context2);
                        i.b = SpillingKt.nullOutSpilledVariable(str3);
                        i.c = SpillingKt.nullOutSpilledVariable(m03);
                        i.d = SpillingKt.nullOutSpilledVariable(c1Var32);
                        i.e = SpillingKt.nullOutSpilledVariable(methodChannel22);
                        i.f = cVar;
                        i.i = SpillingKt.nullOutSpilledVariable(a22);
                        i.j = i3;
                        i.m = 3;
                        obj2 = a22.await(i);
                        if (obj2 != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            i = new I(this, continuationImpl);
            Object obj22 = i.k;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i2 = i.m;
            if (i2 != 0) {
            }
            methodChannel = (MethodChannel) obj;
            if (methodChannel != null) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object d(Context context, M0 m0, ContinuationImpl continuationImpl) {
            J j;
            int i;
            try {
                if (continuationImpl instanceof J) {
                    j = (J) continuationImpl;
                    int i2 = j.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        j.e = i2 - Integer.MIN_VALUE;
                        J j2 = j;
                        Object obj = j2.c;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = j2.e;
                        if (i == 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        ResultKt.throwOnFailure(obj);
                        j2.a = SpillingKt.nullOutSpilledVariable(context);
                        j2.b = SpillingKt.nullOutSpilledVariable(m0);
                        j2.e = 1;
                        Object c = c(this, context, "onAuthCallback", m0, null, j2, 8);
                        return c == coroutine_suspended ? coroutine_suspended : c;
                    }
                }
                if (i == 0) {
                }
            } catch (Exception unused) {
                return null;
            }
            j = new J(this, continuationImpl);
            J j22 = j;
            Object obj2 = j22.c;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = j22.e;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(2:11|12)(2:18|19))(3:20|21|(1:23))|13|14|15))|25|6|7|8|(0)(0)|13|14|15) */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object e(Context context, c1 c1Var, ContinuationImpl continuationImpl) {
            K k;
            int i;
            if (continuationImpl instanceof K) {
                k = (K) continuationImpl;
                int i2 = k.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    k.e = i2 - Integer.MIN_VALUE;
                    K k2 = k;
                    Object obj = k2.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = k2.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        k2.a = SpillingKt.nullOutSpilledVariable(context);
                        k2.b = SpillingKt.nullOutSpilledVariable(c1Var);
                        k2.e = 1;
                        if (c(this, context, "onTaskFinishedCallback", null, c1Var, k2, 4) == coroutine_suspended) {
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
            k = new K(this, continuationImpl);
            K k22 = k;
            Object obj2 = k22.c;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = k22.e;
            if (i != 0) {
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object f(Context context, M0 m0, ContinuationImpl continuationImpl) {
            L l;
            int i;
            try {
                if (continuationImpl instanceof L) {
                    l = (L) continuationImpl;
                    int i2 = l.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        l.e = i2 - Integer.MIN_VALUE;
                        L l2 = l;
                        Object obj = l2.c;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = l2.e;
                        if (i == 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        ResultKt.throwOnFailure(obj);
                        l2.a = SpillingKt.nullOutSpilledVariable(context);
                        l2.b = SpillingKt.nullOutSpilledVariable(m0);
                        l2.e = 1;
                        Object c = c(this, context, "onTaskStartCallback", m0, null, l2, 8);
                        return c == coroutine_suspended ? coroutine_suspended : c;
                    }
                }
                if (i == 0) {
                }
            } catch (Exception unused) {
                return null;
            }
            l = new L(this, continuationImpl);
            L l22 = l;
            Object obj2 = l22.c;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = l22.e;
        }
    }
}
