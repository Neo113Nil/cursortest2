package com.inmobi.media;

/* renamed from: com.inmobi.media.rn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2731rn extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5433a;
    public int b;
    public int c;
    public long d;
    public float e;
    public android.widget.ProgressBar f;
    public int g;
    public final /* synthetic */ android.widget.ProgressBar h;
    public final /* synthetic */ com.inmobi.media.C2760sn i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2731rn(android.widget.ProgressBar progressBar, com.inmobi.media.C2760sn c2760sn, int i, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.h = progressBar;
        this.i = c2760sn;
        this.j = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2731rn(this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2731rn) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0067 -> B:5:0x006a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i;
        android.widget.ProgressBar progressBar;
        int i2;
        float f;
        long j;
        int i3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.g;
        if (i4 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int progress = this.h.getProgress();
            long j2 = this.i.c.f / 10;
            i = progress;
            progressBar = this.h;
            i2 = 0;
            f = (this.j - progress) / 10.0f;
            j = j2;
            i3 = 10;
            if (i2 < i3) {
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.c;
            i3 = this.b;
            f = this.e;
            j = this.d;
            i = this.f5433a;
            progressBar = this.f;
            kotlin.ResultKt.throwOnFailure(obj);
            i2++;
            if (i2 < i3) {
                com.inmobi.media.Mn.a(progressBar, (int) (((i2 + 1) * f) + i));
                this.f = progressBar;
                this.f5433a = i;
                this.d = j;
                this.e = f;
                this.b = i3;
                this.c = i2;
                this.g = 1;
                if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2++;
                if (i2 < i3) {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }
}
