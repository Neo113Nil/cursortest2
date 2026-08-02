package com.bbflight.background_downloader;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugin.common.MethodChannel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1117w;
import kotlinx.coroutines.C1119x;
import kotlinx.coroutines.internal.C1086c;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin$handleIntent$1", f = "BDPlugin.kt", i = {0, 0, 0, 1, 1}, l = {1156, 1162}, m = "invokeSuspend", n = {"resultCompleter", "retries", FirebaseAnalytics.Param.SUCCESS, "retries", FirebaseAnalytics.Param.SUCCESS}, nl = {1158, 1163}, s = {"L$0", "I$0", "I$1", "I$0", "I$1"}, v = 2)
/* renamed from: com.bbflight.background_downloader.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0656m extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
    public int a;
    public int b;
    public Object c;
    public int d;
    public final /* synthetic */ BDPlugin e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int i;

    @DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin$handleIntent$1$1", f = "BDPlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.bbflight.background_downloader.m$a */
    public static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
        public final /* synthetic */ BDPlugin a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ C1117w d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BDPlugin bDPlugin, String str, int i, C1117w c1117w, Continuation continuation) {
            super(2, continuation);
            this.a = bDPlugin;
            this.b = str;
            this.c = i;
            this.d = c1117w;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.a, this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
            return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MethodChannel methodChannel = this.a.b;
            if (methodChannel != null) {
                methodChannel.invokeMethod("notificationTap", CollectionsKt.listOf(this.b, Boxing.boxInt(this.c)), new X(this.d));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0656m(BDPlugin bDPlugin, String str, int i, Continuation<? super C0656m> continuation) {
        super(2, continuation);
        this.e = bDPlugin;
        this.f = str;
        this.i = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0656m(this.e, this.f, this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
        return ((C0656m) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:7:0x0037). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0097 -> B:6:0x0098). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        Exception exc;
        int i2;
        boolean z2;
        ?? r2;
        BDPlugin bDPlugin = this.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            z = false;
            i = 0;
            if (i < 5) {
            }
            return Unit.INSTANCE;
        }
        if (i3 == 1) {
            r2 = this.b;
            i2 = this.a;
            try {
                ResultKt.throwOnFailure(obj);
                r2 = r2;
            } catch (Exception e) {
                exc = e;
                z2 = r2;
                exc.toString();
                z = z2;
                i = i2;
                if (!z) {
                }
                if (i < 5) {
                }
                return Unit.INSTANCE;
            }
            z = ((Boolean) obj).booleanValue();
            i = i2;
            if (!z) {
            }
            if (i < 5) {
            }
            return Unit.INSTANCE;
        }
        if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ?? r0 = this.b;
        int i4 = this.a;
        ResultKt.throwOnFailure(obj);
        z = r0;
        i = i4 + 1;
        if (i < 5 || z) {
            return Unit.INSTANCE;
        }
        try {
        } catch (Exception e2) {
            z2 = z ? 1 : 0;
            exc = e2;
            i2 = i;
            exc.toString();
            z = z2;
            i = i2;
            if (!z) {
            }
            if (i < 5) {
            }
            return Unit.INSTANCE;
        }
        if (bDPlugin.b != null && bDPlugin.d != null) {
            C1117w a2 = C1119x.a();
            C1086c c1086c = bDPlugin.d;
            if (c1086c != null) {
                C1082i.c(c1086c, null, null, new a(bDPlugin, this.f, this.i, a2, null), 3);
            }
            this.c = SpillingKt.nullOutSpilledVariable(a2);
            this.a = i;
            this.b = z ? 1 : 0;
            this.d = 1;
            Object await = a2.await(this);
            if (await != coroutine_suspended) {
                r2 = z ? 1 : 0;
                obj = await;
                i2 = i;
                z = ((Boolean) obj).booleanValue();
                i = i2;
            }
            return coroutine_suspended;
        }
        if (!z) {
            this.c = null;
            this.a = i;
            this.b = z ? 1 : 0;
            this.d = 2;
            if (kotlinx.coroutines.W.b(100 << i, this) != coroutine_suspended) {
                i4 = i;
                i = i4 + 1;
            }
            return coroutine_suspended;
        }
        if (i < 5) {
        }
        return Unit.INSTANCE;
    }
}
