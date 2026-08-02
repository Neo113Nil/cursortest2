package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public abstract class j2 {
    public static net.idrnd.face.iad.capture.internal.p2 a(net.idrnd.face.iad.capture.internal.k3 k3Var, net.idrnd.face.iad.capture.internal.n2 n2Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k3Var, "");
        if (n2Var == null || net.idrnd.face.iad.capture.internal.i2.f6974a[n2Var.ordinal()] != 1) {
            return new net.idrnd.face.iad.capture.internal.p2(net.idrnd.face.iad.capture.internal.p2.f, null, k3Var, n2Var);
        }
        throw new java.lang.IllegalStateException("Impossible situation. Create a payload size with data collecting payload size.".toString());
    }
}
