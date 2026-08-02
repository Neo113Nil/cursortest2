package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class o1 extends com.google.protobuf.GeneratedMessageLite.Builder implements com.google.protobuf.MessageLiteOrBuilder {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o1() {
        super(r0);
        net.idrnd.face.iad.capture.internal.p1 p1Var;
        p1Var = net.idrnd.face.iad.capture.internal.p1.DEFAULT_INSTANCE;
    }

    public final net.idrnd.face.iad.capture.internal.o1 b(int i) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.p1) this.instance).width_ = i;
        return this;
    }

    public final net.idrnd.face.iad.capture.internal.o1 a(net.idrnd.face.iad.capture.internal.b1 b1Var) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.p1) this.instance).captureType_ = b1Var.getNumber();
        return this;
    }

    public final net.idrnd.face.iad.capture.internal.o1 a(net.idrnd.face.iad.capture.internal.y0 y0Var) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.p1) this.instance).frontCameraInfo_ = y0Var;
        return this;
    }

    public final net.idrnd.face.iad.capture.internal.o1 a(int i) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.p1) this.instance).height_ = i;
        return this;
    }

    public final net.idrnd.face.iad.capture.internal.o1 a(net.idrnd.face.iad.capture.internal.u1 u1Var) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.p1) this.instance).os_ = u1Var;
        return this;
    }

    public final void a(net.idrnd.face.iad.capture.internal.z0 z0Var) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.p1) this.instance).photoCaptureInfo_ = (net.idrnd.face.iad.capture.internal.a1) z0Var.build();
    }

    public final net.idrnd.face.iad.capture.internal.o1 a(net.idrnd.face.iad.capture.internal.w1 w1Var) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.p1) this.instance).platform_ = w1Var;
        return this;
    }

    public final net.idrnd.face.iad.capture.internal.o1 a(net.idrnd.face.iad.capture.internal.e2 e2Var) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.p1) this.instance).timestampsMs_ = e2Var;
        return this;
    }
}
