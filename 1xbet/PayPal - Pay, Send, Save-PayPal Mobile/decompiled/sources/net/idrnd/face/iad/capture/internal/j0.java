package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class j0 extends com.google.protobuf.GeneratedMessageLite.Builder implements com.google.protobuf.MessageLiteOrBuilder {
    public final void a(com.google.protobuf.ByteString byteString) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.k0) this.instance).key_ = byteString;
    }

    public final void b(com.google.protobuf.ByteString byteString) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.k0) this.instance).rawData_ = byteString;
    }

    public final void a(java.lang.String str) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.k0) this.instance).keyId_ = str;
    }

    public final void a() {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.k0) this.instance).scheme_ = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0() {
        super(r0);
        net.idrnd.face.iad.capture.internal.k0 k0Var;
        k0Var = net.idrnd.face.iad.capture.internal.k0.DEFAULT_INSTANCE;
    }
}
