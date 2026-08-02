package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class t0 extends com.google.protobuf.GeneratedMessageLite.Builder implements com.google.protobuf.MessageLiteOrBuilder {
    public final void a(java.util.ArrayList arrayList) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.w0) this.instance).a(arrayList);
    }

    public final void b(java.util.ArrayList arrayList) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.w0) this.instance).b(arrayList);
    }

    public final void a(java.lang.String str) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.w0) this.instance).applicationVersion_ = str;
    }

    public final void b(com.google.protobuf.ByteString byteString) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.w0) this.instance).photo_ = byteString;
    }

    public final void a(com.google.protobuf.ByteString byteString) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.w0) this.instance).controlPhoto_ = byteString;
    }

    public final void b() {
        net.idrnd.face.iad.capture.internal.v0 v0Var = net.idrnd.face.iad.capture.internal.v0.PHOTO;
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.w0) this.instance).qualityPhoto_ = v0Var.getNumber();
    }

    public final void a(net.idrnd.face.iad.capture.internal.i1 i1Var) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.w0) this.instance).frontCheck_ = i1Var;
    }

    public final void a(net.idrnd.face.iad.capture.internal.p1 p1Var) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.w0) this.instance).metaInfo_ = p1Var;
    }

    public final void a(net.idrnd.face.iad.capture.internal.m1 m1Var) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.w0) this.instance).photoFormat_ = m1Var;
    }

    public final void a() {
        net.idrnd.face.iad.capture.internal.u0 u0Var = net.idrnd.face.iad.capture.internal.u0.ANDROID;
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.w0) this.instance).platform_ = u0Var.getNumber();
    }

    public final void a(long j) {
        copyOnWrite();
        ((net.idrnd.face.iad.capture.internal.w0) this.instance).timestampSec_ = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t0() {
        super(r0);
        net.idrnd.face.iad.capture.internal.w0 w0Var;
        w0Var = net.idrnd.face.iad.capture.internal.w0.DEFAULT_INSTANCE;
    }
}
