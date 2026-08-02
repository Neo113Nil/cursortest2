package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class d2 extends com.google.protobuf.GeneratedMessageLite.Builder implements com.google.protobuf.MessageLiteOrBuilder {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d2() {
        super(r0);
        net.idrnd.face.iad.capture.internal.e2 e2Var;
        e2Var = net.idrnd.face.iad.capture.internal.e2.DEFAULT_INSTANCE;
    }

    public final net.idrnd.face.iad.capture.internal.d2 d(long j) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.e2) this.instance).photo_ = j;
        return this;
    }

    public final net.idrnd.face.iad.capture.internal.d2 c(long j) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.e2) this.instance).controlPhoto_ = j;
        return this;
    }

    public final net.idrnd.face.iad.capture.internal.d2 b(long j) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.e2) this.instance).captureStart_ = j;
        return this;
    }

    public final net.idrnd.face.iad.capture.internal.d2 a(long j) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.e2) this.instance).captureEnd_ = j;
        return this;
    }
}
