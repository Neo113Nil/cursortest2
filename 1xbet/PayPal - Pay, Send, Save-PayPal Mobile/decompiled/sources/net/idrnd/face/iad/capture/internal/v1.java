package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class v1 extends com.google.protobuf.GeneratedMessageLite.Builder implements com.google.protobuf.MessageLiteOrBuilder {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v1() {
        super(r0);
        net.idrnd.face.iad.capture.internal.w1 w1Var;
        w1Var = net.idrnd.face.iad.capture.internal.w1.DEFAULT_INSTANCE;
    }

    public final net.idrnd.face.iad.capture.internal.v1 b(java.lang.String str) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.w1) this.instance).vendor_ = str;
        return this;
    }

    public final net.idrnd.face.iad.capture.internal.v1 a(java.lang.String str) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.w1) this.instance).deviceModel_ = str;
        return this;
    }

    public final net.idrnd.face.iad.capture.internal.v1 a() {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.w1) this.instance).type_ = "Mobile";
        return this;
    }
}
