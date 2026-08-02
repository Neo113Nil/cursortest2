package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class j1 extends com.google.protobuf.GeneratedMessageLite.Builder implements com.google.protobuf.MessageLiteOrBuilder {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j1() {
        super(r0);
        net.idrnd.face.iad.capture.internal.k1 k1Var;
        k1Var = net.idrnd.face.iad.capture.internal.k1.DEFAULT_INSTANCE;
    }

    public final net.idrnd.face.iad.capture.internal.j1 a(com.google.protobuf.ByteString byteString) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.k1) this.instance).content_ = byteString;
        return this;
    }

    public final net.idrnd.face.iad.capture.internal.j1 a(net.idrnd.face.iad.capture.internal.c1 c1Var) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.k1) this.instance).positionOnImage_ = c1Var.getNumber();
        return this;
    }

    public final net.idrnd.face.iad.capture.internal.j1 a(net.idrnd.face.iad.capture.internal.b2 b2Var) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.k1) this.instance).size_ = (net.idrnd.face.iad.capture.internal.c2) b2Var.build();
        return this;
    }

    public final net.idrnd.face.iad.capture.internal.j1 a(net.idrnd.face.iad.capture.internal.x1 x1Var) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.k1) this.instance).topLeftPointOnImage_ = (net.idrnd.face.iad.capture.internal.y1) x1Var.build();
        return this;
    }
}
