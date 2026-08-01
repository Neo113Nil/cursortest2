package com.inmobi.media;

import android.widget.ProgressBar;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* renamed from: com.inmobi.media.op, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3976op extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7295a;
    public int b;
    public int c;
    public long d;
    public float e;
    public ProgressBar f;
    public int g;
    public final /* synthetic */ ProgressBar h;
    public final /* synthetic */ C4004pp i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3976op(ProgressBar progressBar, C4004pp c4004pp, int i, Continuation continuation) {
        super(2, continuation);
        this.h = progressBar;
        this.i = c4004pp;
        this.j = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3976op(this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3976op) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0066 -> B:5:0x0069). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProgressBar progressBar;
        int i;
        int i2;
        float f;
        int i3;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.g;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            int progress = this.h.getProgress();
            long j2 = this.i.c.f / 10;
            progressBar = this.h;
            i = progress;
            i2 = 10;
            f = (this.j - progress) / 10.0f;
            i3 = 0;
            j = j2;
            if (i3 < i2) {
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = this.c;
            i2 = this.b;
            f = this.e;
            j = this.d;
            i = this.f7295a;
            progressBar = this.f;
            ResultKt.throwOnFailure(obj);
            i3++;
            if (i3 < i2) {
                Jp.a(progressBar, (int) (((i3 + 1) * f) + i));
                this.f = progressBar;
                this.f7295a = i;
                this.d = j;
                this.e = f;
                this.b = i2;
                this.c = i3;
                this.g = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i3++;
                if (i3 < i2) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
