package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.tb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4102tb extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4130ub f7391a;
    public final /* synthetic */ VideoViewPosition b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4102tb(C4130ub c4130ub, VideoViewPosition videoViewPosition, String str, Continuation continuation) {
        super(2, continuation);
        this.f7391a = c4130ub;
        this.b = videoViewPosition;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4102tb(this.f7391a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4102tb) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Ej ej = this.f7391a.f7412a;
        VideoViewPosition newVideoViewPosition = this.b;
        String str = this.c;
        ej.getClass();
        Intrinsics.checkNotNullParameter(newVideoViewPosition, "videoViewPosition");
        C3591b9 c3591b9 = ej.a1;
        if (c3591b9 != null) {
            Intrinsics.checkNotNullParameter(newVideoViewPosition, "newVideoViewPosition");
            Y8[] y8Arr = {Y8.c, Y8.e, Y8.f, Y8.g};
            G8[] g8Arr = G8.f6577a;
            if (C3591b9.a(c3591b9, y8Arr, "updateVideoPlayerPosition", "updateVideoPosition", null, 8)) {
                c3591b9.j.a(newVideoViewPosition);
                ej.a(V8.j, str);
            }
        } else {
            G8[] g8Arr2 = G8.f6577a;
            B8 obj2 = new B8((Object) str);
            Intrinsics.checkNotNullParameter(obj2, "obj");
            JSONObject a2 = AbstractC3875lb.a(obj2, B8.class);
            if (a2 == null) {
                a2 = new JSONObject();
            }
            V8 v8 = V8.b;
            ej.a("VideoCommandError", a2);
        }
        return Unit.INSTANCE;
    }
}
