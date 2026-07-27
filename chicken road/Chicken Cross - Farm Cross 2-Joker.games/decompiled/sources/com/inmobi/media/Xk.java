package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Xk extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6955a;
    public final /* synthetic */ C3972ol b;
    public final /* synthetic */ Zk c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Bitmap.Config e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xk(C3972ol c3972ol, Zk zk, String str, Bitmap.Config config, Continuation continuation) {
        super(2, continuation);
        this.b = c3972ol;
        this.c = zk;
        this.d = str;
        this.e = config;
    }

    public static final void a(C3972ol c3972ol, Bitmap bitmap) {
        c3972ol.setImageBitmap(bitmap);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Xk xk = new Xk(this.b, this.c, this.d, this.e, continuation);
        xk.f6955a = obj;
        return xk;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Xk) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m8079constructorimpl;
        Z9 z9;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Zk zk = this.c;
        String str = this.d;
        Bitmap.Config config = this.e;
        try {
            Result.Companion companion = Result.INSTANCE;
            Picasso picasso = Ug.f6893a;
            m8079constructorimpl = Result.m8079constructorimpl(Ug.b(zk.f6996a).load(str).tag(zk.c).transform(new Pg(config)).get());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Zk zk2 = this.c;
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null && (z9 = zk2.b) != null) {
            z9.b("StaticCompanionLoader", "Companion Load Exception: " + m8082exceptionOrNullimpl.getMessage());
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = null;
        }
        final Bitmap bitmap = (Bitmap) m8079constructorimpl;
        if (bitmap == null) {
            throw new C3624cd("Companion Load Error");
        }
        final C3972ol c3972ol = this.b;
        return Boxing.boxBoolean(c3972ol.post(new Runnable() { // from class: com.inmobi.media.Xk$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Xk.a(C3972ol.this, bitmap);
            }
        }));
    }
}
