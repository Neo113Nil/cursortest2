package com.inmobi.media;

import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.g8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3731g8 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7118a;
    public final /* synthetic */ C4043r8 b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3731g8(C4043r8 c4043r8, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.b = c4043r8;
        this.c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3731g8(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3731g8(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7118a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4043r8 c4043r8 = this.b;
            if (!c4043r8.f.get()) {
                c4043r8.f.set(true);
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    c4043r8.n.addListener(c4043r8.B);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(c4043r8.c, null, null, new V7(null, c4043r8), 3, null);
                }
            }
            this.b.s = System.currentTimeMillis();
            C4043r8 c4043r82 = this.b;
            ExoPlayer exoPlayer = c4043r82.n;
            ArrayList arrayList = this.c;
            Y9 y9 = c4043r82.b;
            C3783i3 c3783i3 = c4043r82.w;
            boolean isCache = c4043r82.f7345a.getIsCache();
            this.f7118a = 1;
            obj = AbstractC3579ap.a(exoPlayer, arrayList, y9, c3783i3, isCache, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.b.a((K8) obj);
        return Unit.INSTANCE;
    }
}
