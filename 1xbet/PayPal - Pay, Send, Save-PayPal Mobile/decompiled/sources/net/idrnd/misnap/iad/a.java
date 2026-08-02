package net.idrnd.misnap.iad;

/* loaded from: classes17.dex */
public abstract class a {
    public static net.idrnd.misnap.iad.Result a(net.idrnd.face.iad.capture.internal.o3 o3Var) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o3Var, "");
        if (!(o3Var instanceof net.idrnd.face.iad.capture.internal.m3)) {
            if (!(o3Var instanceof net.idrnd.face.iad.capture.internal.n3)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            net.idrnd.face.iad.capture.internal.o oVar = (net.idrnd.face.iad.capture.internal.o) ((net.idrnd.face.iad.capture.internal.n3) o3Var).f6991a;
            if (oVar instanceof net.idrnd.face.iad.capture.internal.o) {
                return new net.idrnd.misnap.iad.Result.Success(new net.idrnd.misnap.iad.CaptureResult.PayloadCreated(new net.idrnd.misnap.iad.Payload(oVar.f6992a.f7015a)));
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        net.idrnd.face.iad.capture.internal.n nVar = (net.idrnd.face.iad.capture.internal.n) ((net.idrnd.face.iad.capture.internal.m3) o3Var).f6987a;
        if (nVar instanceof net.idrnd.face.iad.capture.internal.h) {
            obj = net.idrnd.misnap.iad.CaptureError.CaptureCoreClosed.INSTANCE;
        } else if (nVar instanceof net.idrnd.face.iad.capture.internal.m) {
            obj = net.idrnd.misnap.iad.CaptureError.UnknownError.INSTANCE;
        } else if (nVar instanceof net.idrnd.face.iad.capture.internal.k) {
            obj = net.idrnd.misnap.iad.CaptureError.NotReadyForCapture.INSTANCE;
        } else if (nVar instanceof net.idrnd.face.iad.capture.internal.i) {
            obj = net.idrnd.misnap.iad.CaptureError.DerKeyInvalid.INSTANCE;
        } else if (nVar instanceof net.idrnd.face.iad.capture.internal.j) {
            obj = net.idrnd.misnap.iad.CaptureError.EncryptionError.INSTANCE;
        } else {
            if (!(nVar instanceof net.idrnd.face.iad.capture.internal.l)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            obj = net.idrnd.misnap.iad.CaptureError.PhotoWithPassedTimestampDoesNotExist.INSTANCE;
        }
        return new net.idrnd.misnap.iad.Result.Failure(obj);
    }

    public static net.idrnd.misnap.iad.Result b(net.idrnd.face.iad.capture.internal.o3 o3Var) {
        net.idrnd.misnap.iad.ReadyToCapture readyToCapture;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o3Var, "");
        if (o3Var instanceof net.idrnd.face.iad.capture.internal.m3) {
            net.idrnd.face.iad.capture.internal.i3 i3Var = (net.idrnd.face.iad.capture.internal.i3) ((net.idrnd.face.iad.capture.internal.m3) o3Var).f6987a;
            if (i3Var instanceof net.idrnd.face.iad.capture.internal.g3) {
                obj = net.idrnd.misnap.iad.ProcessError.ImageSizeInvalid.INSTANCE;
            } else if (i3Var instanceof net.idrnd.face.iad.capture.internal.h3) {
                obj = net.idrnd.misnap.iad.ProcessError.ImageTimestampInvalid.INSTANCE;
            } else {
                if (!(i3Var instanceof net.idrnd.face.iad.capture.internal.f3)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                obj = net.idrnd.misnap.iad.ProcessError.CaptureCoreClosed.INSTANCE;
            }
            return new net.idrnd.misnap.iad.Result.Failure(obj);
        }
        if (!(o3Var instanceof net.idrnd.face.iad.capture.internal.n3)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        net.idrnd.face.iad.capture.internal.j3 j3Var = (net.idrnd.face.iad.capture.internal.j3) ((net.idrnd.face.iad.capture.internal.n3) o3Var).f6991a;
        if (!(j3Var instanceof net.idrnd.face.iad.capture.internal.j3)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        int ordinal = j3Var.f6976a.ordinal();
        if (ordinal == 0) {
            readyToCapture = net.idrnd.misnap.iad.ReadyToCapture.Yes;
        } else {
            if (ordinal != 1) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            readyToCapture = net.idrnd.misnap.iad.ReadyToCapture.No;
        }
        return new net.idrnd.misnap.iad.Result.Success(new net.idrnd.misnap.iad.ProcessResult.FrameProcessed(readyToCapture));
    }
}
