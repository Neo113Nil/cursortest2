package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class t1 extends com.google.protobuf.GeneratedMessageLite.Builder implements com.google.protobuf.MessageLiteOrBuilder {
    public final net.idrnd.face.iad.capture.internal.t1 a() {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.u1) this.instance).name_ = "Android";
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t1() {
        super(r0);
        net.idrnd.face.iad.capture.internal.u1 u1Var;
        u1Var = net.idrnd.face.iad.capture.internal.u1.DEFAULT_INSTANCE;
    }

    public final net.idrnd.face.iad.capture.internal.t1 a(java.lang.String str) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.u1) this.instance).version_ = str;
        return this;
    }
}
