package com.chartboost.sdk.internal.clickthrough;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.webkit.ProxyConfig;
import com.chartboost.sdk.impl.b4;
import com.chartboost.sdk.impl.i4;
import com.chartboost.sdk.impl.ld;
import com.chartboost.sdk.impl.mb;
import com.chartboost.sdk.impl.n4;
import com.chartboost.sdk.impl.pd;
import com.chartboost.sdk.impl.ti;
import com.chartboost.sdk.impl.ui;
import com.chartboost.sdk.impl.va;
import com.chartboost.sdk.impl.wi;
import com.chartboost.sdk.internal.clickthrough.a;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public abstract class b {

    public static final class a extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            Object a2 = b.a(null, null, null, null, null, null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    /* renamed from: com.chartboost.sdk.internal.clickthrough.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0230b extends FunctionReferenceImpl implements Function1 {
        public static final C0230b b = new C0230b();

        public C0230b() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class c extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            Object a2 = b.a(null, null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class d extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            Object a2 = b.a(null, null, null, null, null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {
        public static final e b = new e();

        public e() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class f extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            Object b = b.b(null, null, null, null, null, this);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Result.m8078boximpl(b);
        }
    }

    public /* synthetic */ class g extends FunctionReferenceImpl implements Function1 {
        public static final g b = new g();

        public g() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class h extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            Object c = b.c(null, null, null, null, null, this);
            return c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c : Result.m8078boximpl(c);
        }
    }

    public /* synthetic */ class i extends FunctionReferenceImpl implements Function1 {
        public static final i b = new i();

        public i() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ Intent d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Context context, Intent intent, Continuation continuation) {
            super(2, continuation);
            this.c = context;
            this.d = intent;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.c.startActivity(b.b(this.d));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(3:20|21|(2:23|(2:25|(2:27|(1:29))(2:30|31))(2:32|33))(2:34|35))|12|13|(1:15)|16))|38|6|7|(0)(0)|12|13|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        r10 = kotlin.Result.INSTANCE;
        r9 = kotlin.Result.m8079constructorimpl(kotlin.ResultKt.createFailure(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(ui uiVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        f fVar;
        int i2;
        Throwable m8082exceptionOrNullimpl;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i3 = fVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fVar.d = i3 - Integer.MIN_VALUE;
                Object obj = fVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = fVar.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    mb.a("Attempting to open in native browser. Url: " + uiVar.b(), (Throwable) null, 2, (Object) null);
                    if (!uiVar.c()) {
                        throw a.b.b;
                    }
                    if (!b(uiVar)) {
                        throw a.d.b;
                    }
                    ui b = wi.b(uiVar);
                    if (!b(b, function1)) {
                        throw a.c.b;
                    }
                    Intent intent = (Intent) function12.invoke(function1.invoke(b.b()));
                    fVar.b = uiVar;
                    fVar.d = 1;
                    if (a(context, intent, coroutineDispatcher, fVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uiVar = (ui) fVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                ti tiVar = new ti("openInNativeBrowser");
                mb.a("Successfully opened in native browser. Url: " + uiVar.b(), (Throwable) null, 2, (Object) null);
                Object m8079constructorimpl = Result.m8079constructorimpl(tiVar);
                m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
                if (m8082exceptionOrNullimpl != null) {
                    mb.e("Failed to open in native browser. Url: " + uiVar.b() + ", Reason: " + m8082exceptionOrNullimpl, null, 2, null);
                }
                return m8079constructorimpl;
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = fVar.d;
        if (i2 != 0) {
        }
        ti tiVar2 = new ti("openInNativeBrowser");
        mb.a("Successfully opened in native browser. Url: " + uiVar.b(), (Throwable) null, 2, (Object) null);
        Object m8079constructorimpl2 = Result.m8079constructorimpl(tiVar2);
        m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl2);
        if (m8082exceptionOrNullimpl != null) {
        }
        return m8079constructorimpl2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(3:20|21|(2:23|(2:25|(1:27))(2:28|29))(2:30|31))|12|13|(1:15)|16))|34|6|7|(0)(0)|12|13|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        r10 = kotlin.Result.INSTANCE;
        r9 = kotlin.Result.m8079constructorimpl(kotlin.ResultKt.createFailure(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(ui uiVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        h hVar;
        int i2;
        Throwable m8082exceptionOrNullimpl;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i3 = hVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.d = i3 - Integer.MIN_VALUE;
                Object obj = hVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = hVar.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    mb.a("Attempting to open unsecure link. Url: " + uiVar.b(), (Throwable) null, 2, (Object) null);
                    if (!uiVar.c()) {
                        throw a.b.b;
                    }
                    if (!a(uiVar, function1)) {
                        throw a.c.b;
                    }
                    Intent intent = (Intent) function12.invoke(function1.invoke(uiVar.b()));
                    hVar.b = uiVar;
                    hVar.d = 1;
                    if (a(context, intent, coroutineDispatcher, hVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uiVar = (ui) hVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                ti tiVar = new ti("openUnsecureLink");
                mb.a("Successfully opened unsecure link. Url: " + uiVar.b(), (Throwable) null, 2, (Object) null);
                Object m8079constructorimpl = Result.m8079constructorimpl(tiVar);
                m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
                if (m8082exceptionOrNullimpl != null) {
                    mb.e("Failed to open unsecure link. Url: " + uiVar.b() + ", Reason: " + m8082exceptionOrNullimpl, null, 2, null);
                }
                return m8079constructorimpl;
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = hVar.d;
        if (i2 != 0) {
        }
        ti tiVar2 = new ti("openUnsecureLink");
        mb.a("Successfully opened unsecure link. Url: " + uiVar.b(), (Throwable) null, 2, (Object) null);
        Object m8079constructorimpl2 = Result.m8079constructorimpl(tiVar2);
        m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl2);
        if (m8082exceptionOrNullimpl != null) {
        }
        return m8079constructorimpl2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:25|26))(3:27|28|(1:30))|12|13|(2:15|(1:17)(1:18))|19|(1:21)|22))|33|6|7|(0)(0)|12|13|(0)|19|(0)|22) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m8079constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(String str, Function0 function0, Continuation continuation) {
        c cVar;
        int i2;
        Object m8079constructorimpl;
        Throwable m8082exceptionOrNullimpl;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i3 = cVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.d = i3 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = cVar2.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    ld ldVar = (ld) function0.invoke();
                    cVar2.b = str;
                    cVar2.d = 1;
                    obj = ld.a.a(ldVar, str, null, cVar2, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) cVar2.b;
                    ResultKt.throwOnFailure(obj);
                }
                m8079constructorimpl = Result.m8079constructorimpl((pd) obj);
                if (Result.m8086isSuccessimpl(m8079constructorimpl)) {
                    pd pdVar = (pd) m8079constructorimpl;
                    if (pdVar.e()) {
                        mb.a("Fired click URL in background: " + str, (Throwable) null, 2, (Object) null);
                    } else {
                        mb.b("Failed to fire click URL in background: " + str + " — HTTP " + pdVar.d(), (Throwable) null, 2, (Object) null);
                    }
                }
                m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
                if (m8082exceptionOrNullimpl != null) {
                    mb.b("Failed to fire click URL in background: " + str + " — " + m8082exceptionOrNullimpl, (Throwable) null, 2, (Object) null);
                }
                return m8079constructorimpl;
            }
        }
        cVar = new c(continuation);
        c cVar22 = cVar;
        Object obj2 = cVar22.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = cVar22.d;
        if (i2 != 0) {
        }
        m8079constructorimpl = Result.m8079constructorimpl((pd) obj2);
        if (Result.m8086isSuccessimpl(m8079constructorimpl)) {
        }
        m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
        }
        return m8079constructorimpl;
    }

    public static /* synthetic */ Object a(String str, Function0 function0, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function0 = new Function0() { // from class: com.chartboost.sdk.internal.clickthrough.b$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b.a();
                }
            };
        }
        return a(str, function0, continuation);
    }

    public static final ld a() {
        return b4.b.b().d();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(3:20|21|(2:23|(2:25|(2:27|(1:29))(2:30|31))(2:32|33))(2:34|35))|12|13|(1:15)|16))|38|6|7|(0)(0)|12|13|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        r10 = kotlin.Result.INSTANCE;
        r9 = kotlin.Result.m8079constructorimpl(kotlin.ResultKt.createFailure(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ui uiVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        d dVar;
        int i2;
        Throwable m8082exceptionOrNullimpl;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i3 = dVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.d = i3 - Integer.MIN_VALUE;
                Object obj = dVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dVar.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    mb.a("Attempting to open in embedded browser. Url: " + uiVar.b(), (Throwable) null, 2, (Object) null);
                    if (uiVar.c()) {
                        if (a(uiVar)) {
                            function1.invoke(uiVar.b());
                            ui b = wi.b(uiVar);
                            if (b(b, function1)) {
                                Intent intent = (Intent) function12.invoke(b.b());
                                dVar.b = uiVar;
                                dVar.d = 1;
                                if (a(context, intent, coroutineDispatcher, dVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                throw a.c.b;
                            }
                        } else {
                            throw a.d.b;
                        }
                    } else {
                        throw a.b.b;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uiVar = (ui) dVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                ti tiVar = new ti("openInEmbeddedBrowser");
                mb.a("Successfully opened in embedded browser. Url: " + uiVar.b(), (Throwable) null, 2, (Object) null);
                Object m8079constructorimpl = Result.m8079constructorimpl(tiVar);
                m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
                if (m8082exceptionOrNullimpl != null) {
                    mb.e("Failed to open in embedded browser. Url: " + uiVar.b() + ", Reason: " + m8082exceptionOrNullimpl, null, 2, null);
                }
                return m8079constructorimpl;
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dVar.d;
        if (i2 != 0) {
        }
        ti tiVar2 = new ti("openInEmbeddedBrowser");
        mb.a("Successfully opened in embedded browser. Url: " + uiVar.b(), (Throwable) null, 2, (Object) null);
        Object m8079constructorimpl2 = Result.m8079constructorimpl(tiVar2);
        m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl2);
        if (m8082exceptionOrNullimpl != null) {
        }
        return m8079constructorimpl2;
    }

    public static /* synthetic */ Object c(ui uiVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = n4.a();
        }
        Context context2 = context;
        if ((i2 & 4) != 0) {
            function1 = i.b;
        }
        Function1 function13 = function1;
        if ((i2 & 8) != 0) {
            function12 = new Function1() { // from class: com.chartboost.sdk.internal.clickthrough.b$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return b.c((Uri) obj2);
                }
            };
        }
        Function1 function14 = function12;
        if ((i2 & 16) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return c(uiVar, context2, function13, function14, coroutineDispatcher, continuation);
    }

    public static final Intent c(Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new Intent("android.intent.action.VIEW", it);
    }

    public static /* synthetic */ Object b(ui uiVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = n4.a();
        }
        Context context2 = context;
        if ((i2 & 4) != 0) {
            function1 = g.b;
        }
        Function1 function13 = function1;
        if ((i2 & 8) != 0) {
            function12 = new Function1() { // from class: com.chartboost.sdk.internal.clickthrough.b$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return b.b((Uri) obj2);
                }
            };
        }
        Function1 function14 = function12;
        if ((i2 & 16) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return b(uiVar, context2, function13, function14, coroutineDispatcher, continuation);
    }

    public static final Intent b(Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new Intent("android.intent.action.VIEW", it);
    }

    public static final boolean b(ui uiVar) {
        return uiVar.a() == i4.e;
    }

    public static final Intent b(Intent intent) {
        intent.setFlags(268435456);
        return intent;
    }

    public static final boolean b(ui uiVar, Function1 function1) {
        String str;
        String scheme = ((Uri) function1.invoke(uiVar.b())).getScheme();
        if (scheme != null) {
            str = scheme.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        return Intrinsics.areEqual(str, ProxyConfig.MATCH_HTTP) || Intrinsics.areEqual(str, "https");
    }

    public static /* synthetic */ Object a(ui uiVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = n4.a();
        }
        final Context context2 = context;
        if ((i2 & 4) != 0) {
            function1 = e.b;
        }
        Function1 function13 = function1;
        if ((i2 & 8) != 0) {
            function12 = new Function1() { // from class: com.chartboost.sdk.internal.clickthrough.b$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return b.a(context2, (String) obj2);
                }
            };
        }
        Function1 function14 = function12;
        if ((i2 & 16) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return a(uiVar, context2, function13, function14, coroutineDispatcher, continuation);
    }

    public static final Intent a(Context context, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return EmbeddedBrowserActivity.INSTANCE.a(context, url);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(3:20|21|(6:25|26|27|(1:29)|30|(2:32|(2:34|(1:36))(2:37|38))(2:39|40))(2:23|24))|12|13|(1:15)|16))|46|6|7|(0)(0)|12|13|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d3, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
    
        r10 = kotlin.Result.INSTANCE;
        r9 = kotlin.Result.m8079constructorimpl(kotlin.ResultKt.createFailure(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ui uiVar, Context context, va vaVar, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        a aVar;
        int i2;
        Throwable m8082exceptionOrNullimpl;
        Object m8079constructorimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i3 = aVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.d = i3 - Integer.MIN_VALUE;
                Object obj = aVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = aVar.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    mb.a("Attempting to open deep link. Url: " + uiVar.b(), (Throwable) null, 2, (Object) null);
                    if (uiVar.c()) {
                        try {
                            m8079constructorimpl = Result.m8079constructorimpl(Boxing.boxBoolean(b(uiVar, function1)));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                        }
                        Boolean boxBoolean = Boxing.boxBoolean(false);
                        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
                            m8079constructorimpl = boxBoolean;
                        }
                        if (!((Boolean) m8079constructorimpl).booleanValue()) {
                            if (vaVar.b(uiVar.b())) {
                                Intent intent = (Intent) function12.invoke(function1.invoke(uiVar.b()));
                                aVar.b = uiVar;
                                aVar.d = 1;
                                if (a(context, intent, coroutineDispatcher, aVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                throw a.C0229a.b;
                            }
                        } else {
                            throw a.c.b;
                        }
                    } else {
                        throw a.b.b;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uiVar = (ui) aVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                ti tiVar = new ti("openDeepLink");
                mb.a("Successfully opened deep link. Url: " + uiVar.b(), (Throwable) null, 2, (Object) null);
                Object m8079constructorimpl2 = Result.m8079constructorimpl(tiVar);
                m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl2);
                if (m8082exceptionOrNullimpl != null) {
                    mb.e("Failed to open deep link. Url: " + uiVar.b() + ", Reason: " + m8082exceptionOrNullimpl, null, 2, null);
                }
                return m8079constructorimpl2;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = aVar.d;
        if (i2 != 0) {
        }
        ti tiVar2 = new ti("openDeepLink");
        mb.a("Successfully opened deep link. Url: " + uiVar.b(), (Throwable) null, 2, (Object) null);
        Object m8079constructorimpl22 = Result.m8079constructorimpl(tiVar2);
        m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl22);
        if (m8082exceptionOrNullimpl != null) {
        }
        return m8079constructorimpl22;
    }

    public static /* synthetic */ Object a(ui uiVar, Context context, va vaVar, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = n4.a();
        }
        Context context2 = context;
        if ((i2 & 4) != 0) {
            vaVar = n4.b();
        }
        va vaVar2 = vaVar;
        if ((i2 & 8) != 0) {
            function1 = C0230b.b;
        }
        Function1 function13 = function1;
        if ((i2 & 16) != 0) {
            function12 = new Function1() { // from class: com.chartboost.sdk.internal.clickthrough.b$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return b.a((Uri) obj2);
                }
            };
        }
        Function1 function14 = function12;
        if ((i2 & 32) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return a(uiVar, context2, vaVar2, function13, function14, coroutineDispatcher, continuation);
    }

    public static final Intent a(Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new Intent("android.intent.action.VIEW", it);
    }

    public static final Object a(Context context, Intent intent, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        Object withContext = BuildersKt.withContext(coroutineDispatcher, new j(context, intent, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public static final boolean a(ui uiVar) {
        return uiVar.a() == i4.d;
    }

    public static final boolean a(ui uiVar, Function1 function1) {
        if (uiVar != null) {
            return Intrinsics.areEqual(((Uri) function1.invoke(uiVar.b())).getScheme(), ProxyConfig.MATCH_HTTP);
        }
        return false;
    }
}
