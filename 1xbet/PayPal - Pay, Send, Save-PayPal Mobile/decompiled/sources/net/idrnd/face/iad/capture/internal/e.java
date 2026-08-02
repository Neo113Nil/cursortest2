package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class e extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final net.idrnd.face.iad.capture.internal.e f6963a = new net.idrnd.face.iad.capture.internal.e();

    public e() {
        super(0);
    }

    public static final void a(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((net.idrnd.face.iad.capture.internal.u2) it.next()).close();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ java.lang.Object invoke() {
        return a();
    }

    public static net.idrnd.face.iad.capture.internal.c3 a() {
        net.idrnd.face.iad.capture.internal.c3 c3Var = new net.idrnd.face.iad.capture.internal.c3();
        c3Var.c = new net.idrnd.face.iad.capture.internal.x2() { // from class: net.idrnd.face.iad.capture.internal.e$$ExternalSyntheticLambda0
            @Override // net.idrnd.face.iad.capture.internal.x2
            public final void a(java.util.List list) {
                net.idrnd.face.iad.capture.internal.e.a(list);
            }
        };
        return c3Var;
    }
}
