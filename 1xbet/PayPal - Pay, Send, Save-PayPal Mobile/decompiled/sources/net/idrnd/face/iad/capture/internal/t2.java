package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class t2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ net.idrnd.face.iad.capture.internal.u2 f7007a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(net.idrnd.face.iad.capture.internal.u2 u2Var) {
        super(0);
        this.f7007a = u2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this.f7007a.d.f6964a.getImageInfoTimestamp()));
    }
}
