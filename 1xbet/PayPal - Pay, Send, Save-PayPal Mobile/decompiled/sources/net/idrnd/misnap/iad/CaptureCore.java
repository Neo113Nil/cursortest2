package net.idrnd.misnap.iad;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Lnet/idrnd/misnap/iad/CaptureCore;", "Ljava/lang/AutoCloseable;", "Landroid/content/Context;", "context", "", "derPublicKey", "Lnet/idrnd/misnap/iad/Scenario;", com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl.KEY_SCENARIO, "", "keyId", "<init>", "(Landroid/content/Context;[BLnet/idrnd/misnap/iad/Scenario;Ljava/lang/String;)V", "Lnet/idrnd/misnap/iad/PhotoParameters;", "getExpectedPhotoParameters", "()Lnet/idrnd/misnap/iad/PhotoParameters;", "Lnet/idrnd/misnap/iad/IadFrame;", "image", "Lnet/idrnd/misnap/iad/Result;", "Lnet/idrnd/misnap/iad/ProcessResult;", "Lnet/idrnd/misnap/iad/ProcessError;", "process", "(Lnet/idrnd/misnap/iad/IadFrame;)Lnet/idrnd/misnap/iad/Result;", "Lnet/idrnd/misnap/iad/Photo;", "photo", "Lnet/idrnd/misnap/iad/CaptureResult;", "Lnet/idrnd/misnap/iad/CaptureError;", "capture", "(Lnet/idrnd/misnap/iad/Photo;)Lnet/idrnd/misnap/iad/Result;", "", "close", "()V"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class CaptureCore implements java.lang.AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f7016a;
    public final net.idrnd.face.iad.capture.internal.g b;
    public final net.idrnd.face.iad.capture.internal.p2 c;

    public CaptureCore(android.content.Context context, byte[] bArr, net.idrnd.misnap.iad.Scenario scenario, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scenario, "");
        this.f7016a = new java.lang.Object();
        net.idrnd.face.iad.capture.internal.h2.a(bArr);
        net.idrnd.face.iad.capture.internal.h2.a(str);
        android.util.Size size = net.idrnd.face.iad.capture.internal.p2.f;
        net.idrnd.face.iad.capture.internal.p2 a2 = net.idrnd.face.iad.capture.internal.j2.a(scenario.getProductType(), scenario.getPayloadSize());
        this.c = a2;
        this.b = new net.idrnd.face.iad.capture.internal.g(context, a2);
    }

    public final net.idrnd.misnap.iad.Result<net.idrnd.misnap.iad.CaptureResult, net.idrnd.misnap.iad.CaptureError> capture(net.idrnd.misnap.iad.Photo photo) {
        net.idrnd.misnap.iad.Result<net.idrnd.misnap.iad.CaptureResult, net.idrnd.misnap.iad.CaptureError> a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photo, "");
        synchronized (this.f7016a) {
            a2 = net.idrnd.misnap.iad.a.a(this.b.b(photo.getJpegData(), photo.getTimestamp()));
        }
        return a2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f7016a) {
            this.b.close();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final net.idrnd.misnap.iad.PhotoParameters getExpectedPhotoParameters() {
        net.idrnd.face.iad.capture.internal.b3 b3Var = this.c.e;
        net.idrnd.face.iad.capture.internal.p0 p0Var = (net.idrnd.face.iad.capture.internal.p0) b3Var.f6957a.get(b3Var.a());
        net.idrnd.face.iad.capture.internal.m2 m2Var = p0Var.f6995a;
        java.lang.Integer num = p0Var.b;
        if (m2Var != net.idrnd.face.iad.capture.internal.m2.f6986a || num == null) {
            throw new java.lang.IllegalStateException("Capture core expects an unsupported photo parameters");
        }
        return new net.idrnd.misnap.iad.PhotoParameters(num.intValue());
    }

    public final net.idrnd.misnap.iad.Result<net.idrnd.misnap.iad.ProcessResult, net.idrnd.misnap.iad.ProcessError> process(net.idrnd.misnap.iad.IadFrame image) {
        net.idrnd.misnap.iad.Result<net.idrnd.misnap.iad.ProcessResult, net.idrnd.misnap.iad.ProcessError> b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
        synchronized (this.f7016a) {
            b = net.idrnd.misnap.iad.a.b(this.b.a(image.getYuvImage(), new net.idrnd.face.iad.capture.internal.f(image)));
        }
        return b;
    }
}
