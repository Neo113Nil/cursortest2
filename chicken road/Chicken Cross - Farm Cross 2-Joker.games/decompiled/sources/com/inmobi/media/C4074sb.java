package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import java.util.concurrent.CountDownLatch;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.sb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4074sb extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4130ub f7370a;
    public final /* synthetic */ Ref.ObjectRef b;
    public final /* synthetic */ CountDownLatch c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4074sb(C4130ub c4130ub, Ref.ObjectRef objectRef, CountDownLatch countDownLatch, Continuation continuation) {
        super(2, continuation);
        this.f7370a = c4130ub;
        this.b = objectRef;
        this.c = countDownLatch;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4074sb(this.f7370a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4074sb) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [T, org.json.JSONObject] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            HtmlVideoPlaybackState obj2 = this.f7370a.f7412a.getPlaybackState();
            if (obj2 == null) {
                obj2 = new HtmlVideoPlaybackState();
            }
            Ref.ObjectRef objectRef = this.b;
            Intrinsics.checkNotNullParameter(obj2, "obj");
            objectRef.element = AbstractC3875lb.a(obj2, HtmlVideoPlaybackState.class);
            this.c.countDown();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.c.countDown();
            throw th;
        }
    }
}
