package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class p2 {
    public static final android.util.Size f = new android.util.Size(1080, 1920);

    /* renamed from: a, reason: collision with root package name */
    public final android.util.Size f6996a;
    public final net.idrnd.face.iad.capture.internal.k3 b;
    public net.idrnd.face.iad.capture.internal.l2 c;
    public final net.idrnd.face.iad.capture.internal.n2 d;
    public final net.idrnd.face.iad.capture.internal.b3 e;

    public p2(android.util.Size size, net.idrnd.face.iad.capture.internal.l2 l2Var, net.idrnd.face.iad.capture.internal.k3 k3Var, net.idrnd.face.iad.capture.internal.n2 n2Var) {
        net.idrnd.face.iad.capture.internal.b3 b3Var;
        net.idrnd.face.iad.capture.internal.m2 m2Var;
        java.lang.Integer num;
        java.lang.Integer num2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k3Var, "");
        if (size.getWidth() <= 0) {
            throw new java.lang.IllegalArgumentException("Photo resolution wight should be above 0.".toString());
        }
        if (size.getHeight() <= 0) {
            throw new java.lang.IllegalArgumentException("Photo resolution height should be above 0.".toString());
        }
        int ordinal = k3Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new net.idrnd.face.iad.capture.internal.n2[]{null, net.idrnd.face.iad.capture.internal.n2.c});
            if (!listOf.contains(n2Var)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Document IAD doesn't support the payload size except ");
                sb.append(listOf);
                sb.append(".");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            int i = n2Var == null ? -1 : net.idrnd.face.iad.capture.internal.o2.f6993a[n2Var.ordinal()];
            if (i == -1) {
                m2Var = net.idrnd.face.iad.capture.internal.m2.f6986a;
                num = 100;
                num2 = 70;
            } else {
                if (i != 1) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Payload size (");
                    sb2.append(n2Var);
                    sb2.append(") is not supported in Document IAD");
                    throw new java.lang.IllegalStateException(sb2.toString().toString());
                }
                m2Var = net.idrnd.face.iad.capture.internal.m2.b;
                num2 = null;
                num = null;
            }
            b3Var = new net.idrnd.face.iad.capture.internal.b3(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new net.idrnd.face.iad.capture.internal.p0[]{new net.idrnd.face.iad.capture.internal.p0(m2Var, num), new net.idrnd.face.iad.capture.internal.p0(m2Var, num2)}), new net.idrnd.face.iad.capture.internal.p0(m2Var, num2), null);
        } else {
            if (n2Var == null) {
                throw new java.lang.IllegalArgumentException("Face IAD must use some payload size.".toString());
            }
            int ordinal2 = n2Var.ordinal();
            if (ordinal2 == 0) {
                net.idrnd.face.iad.capture.internal.m2 m2Var2 = net.idrnd.face.iad.capture.internal.m2.f6986a;
                b3Var = new net.idrnd.face.iad.capture.internal.b3(kotlin.collections.CollectionsKt.listOf(new net.idrnd.face.iad.capture.internal.p0(m2Var2, 100)), new net.idrnd.face.iad.capture.internal.p0(m2Var2, 100), null);
            } else if (ordinal2 == 1) {
                net.idrnd.face.iad.capture.internal.m2 m2Var3 = net.idrnd.face.iad.capture.internal.m2.f6986a;
                b3Var = new net.idrnd.face.iad.capture.internal.b3(kotlin.collections.CollectionsKt.listOf(new net.idrnd.face.iad.capture.internal.p0(m2Var3, 70)), new net.idrnd.face.iad.capture.internal.p0(m2Var3, 70), new net.idrnd.face.iad.capture.internal.v(net.idrnd.face.iad.capture.internal.t.f7006a, 224, 224, 100));
            } else {
                if (ordinal2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                net.idrnd.face.iad.capture.internal.m2 m2Var4 = net.idrnd.face.iad.capture.internal.m2.b;
                b3Var = new net.idrnd.face.iad.capture.internal.b3(kotlin.collections.CollectionsKt.listOf(new net.idrnd.face.iad.capture.internal.p0(m2Var4, null)), new net.idrnd.face.iad.capture.internal.p0(m2Var4, null), null);
            }
        }
        this.e = b3Var;
        this.b = k3Var;
        this.c = l2Var;
        this.f6996a = size;
        this.d = n2Var;
    }

    public final java.lang.String toString() {
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(net.idrnd.face.iad.capture.internal.p2.class).getSimpleName();
        android.util.Size size = this.f6996a;
        net.idrnd.face.iad.capture.internal.k3 k3Var = this.b;
        net.idrnd.face.iad.capture.internal.n2 n2Var = this.d;
        net.idrnd.face.iad.capture.internal.l2 l2Var = this.c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(simpleName);
        sb.append("(photoResolution=");
        sb.append(size);
        sb.append(", productType=");
        sb.append(k3Var);
        sb.append(", payloadSize=");
        sb.append(n2Var);
        sb.append(", imageEvaluatorType=");
        sb.append(l2Var);
        sb.append(")");
        return sb.toString();
    }

    public final void c() {
        this.c = null;
    }

    public final net.idrnd.face.iad.capture.internal.k3 b() {
        return this.b;
    }

    public final net.idrnd.face.iad.capture.internal.b3 a() {
        return this.e;
    }
}
