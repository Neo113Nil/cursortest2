package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class z0 extends com.google.protobuf.GeneratedMessageLite.Builder implements com.google.protobuf.MessageLiteOrBuilder {
    public final net.idrnd.face.iad.capture.internal.z0 b() {
        net.idrnd.face.iad.capture.internal.s1 s1Var = net.idrnd.face.iad.capture.internal.s1.PORTRAIT;
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.a1) this.instance).targetOrientation_ = s1Var.getNumber();
        return this;
    }

    public final net.idrnd.face.iad.capture.internal.z0 a() {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.a1) this.instance).imageRotation_ = 0;
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z0() {
        super(r0);
        net.idrnd.face.iad.capture.internal.a1 a1Var;
        a1Var = net.idrnd.face.iad.capture.internal.a1.DEFAULT_INSTANCE;
    }
}
