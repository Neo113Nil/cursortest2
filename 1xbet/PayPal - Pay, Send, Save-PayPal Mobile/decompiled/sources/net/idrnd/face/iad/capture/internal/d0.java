package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class d0 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final net.idrnd.face.iad.capture.internal.d0 f6961a = new net.idrnd.face.iad.capture.internal.d0();

    public d0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = (java.util.concurrent.ThreadPoolExecutor) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
        return java.lang.Boolean.valueOf(threadPoolExecutor.getActiveCount() == 0);
    }
}
