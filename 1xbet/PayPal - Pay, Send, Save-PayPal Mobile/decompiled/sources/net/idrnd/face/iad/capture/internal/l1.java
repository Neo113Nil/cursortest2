package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class l1 extends com.google.protobuf.GeneratedMessageLite.Builder implements com.google.protobuf.MessageLiteOrBuilder {
    public final void a(int i) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.m1) this.instance).quality_ = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l1() {
        super(r0);
        net.idrnd.face.iad.capture.internal.m1 m1Var;
        m1Var = net.idrnd.face.iad.capture.internal.m1.DEFAULT_INSTANCE;
    }

    public final net.idrnd.face.iad.capture.internal.l1 a(net.idrnd.face.iad.capture.internal.n1 n1Var) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.m1) this.instance).type_ = n1Var.getNumber();
        return this;
    }
}
