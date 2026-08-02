package com.miteksystems.misnap.controller.a;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0004\u001a\u00020\u0006*\u00020\u0005H\u0002J\u0017\u0010\u0004\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0004\u0010\nJ%\u0010\u0004\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0004\u0010\u0011J\u000f\u0010\u0004\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/miteksystems/misnap/controller/a/p;", "", "Lnet/idrnd/misnap/iad/ProcessError;", "Lcom/miteksystems/misnap/controller/a/t;", "a", "Lnet/idrnd/misnap/iad/CaptureError;", "Lcom/miteksystems/misnap/controller/a/s$a;", "Lcom/miteksystems/misnap/core/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "", "(Lcom/miteksystems/misnap/core/Frame;)V", "", "input", "", "Lcom/miteksystems/misnap/core/Frame$FrameInfo;", "info", "Lcom/miteksystems/misnap/controller/a/s;", "([B[Lcom/miteksystems/misnap/core/Frame$FrameInfo;)Lcom/miteksystems/misnap/controller/a/s;", "()V", "Lnet/idrnd/misnap/iad/CaptureCore;", "Lnet/idrnd/misnap/iad/CaptureCore;", "iadCaptureCore", "", util.h.xy.cb.b.f1091, "Z", "_isReadyToGeneratePayload", "()Z", "isReady", "<init>", "(Lnet/idrnd/misnap/iad/CaptureCore;)V", "c", "controller_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class p {

    /* renamed from: c, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.controller.a.p.Companion INSTANCE = new com.miteksystems.misnap.controller.a.p.Companion(null);
    private boolean Camera2StreamConfigurationMap;
    private final net.idrnd.misnap.iad.CaptureCore getHighSpeedVideoSizes;

    public final /* synthetic */ com.miteksystems.misnap.controller.a.s a(byte[] input, com.miteksystems.misnap.core.Frame.FrameInfo[] info) {
        com.miteksystems.misnap.core.Frame.FrameInfo frameInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
        if (!getCamera2StreamConfigurationMap()) {
            return new com.miteksystems.misnap.controller.a.s.a(com.miteksystems.misnap.controller.a.r.e.f3998a);
        }
        if (input.length == 0) {
            return new com.miteksystems.misnap.controller.a.s.a(com.miteksystems.misnap.controller.a.r.c.f3996a);
        }
        int length = info.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                frameInfo = null;
                break;
            }
            frameInfo = info[i];
            if (frameInfo instanceof com.miteksystems.misnap.core.Frame.FrameInfo.TimingFrameInfo) {
                break;
            }
            i++;
        }
        java.lang.Long valueOf = frameInfo != null ? java.lang.Long.valueOf(((com.miteksystems.misnap.core.Frame.FrameInfo.TimingFrameInfo) frameInfo).getTimestamp()) : null;
        if (valueOf == null || valueOf.longValue() <= 0) {
            return new com.miteksystems.misnap.controller.a.s.a(com.miteksystems.misnap.controller.a.r.c.f3996a);
        }
        net.idrnd.misnap.iad.Result<net.idrnd.misnap.iad.CaptureResult, net.idrnd.misnap.iad.CaptureError> capture = this.getHighSpeedVideoSizes.capture(new net.idrnd.misnap.iad.Photo(input, valueOf.longValue()));
        if (!(capture instanceof net.idrnd.misnap.iad.Result.Failure)) {
            if (!(capture instanceof net.idrnd.misnap.iad.Result.Success)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            net.idrnd.misnap.iad.CaptureResult captureResult = (net.idrnd.misnap.iad.CaptureResult) ((net.idrnd.misnap.iad.Result.Success) capture).getValue();
            if (!(captureResult instanceof net.idrnd.misnap.iad.CaptureResult.PayloadCreated)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            byte[] content = ((net.idrnd.misnap.iad.CaptureResult.PayloadCreated) captureResult).getPayload().getContent();
            return content.length == 0 ? new com.miteksystems.misnap.controller.a.s.a(com.miteksystems.misnap.controller.a.r.a.f3994a) : new com.miteksystems.misnap.controller.a.s.b(content);
        }
        net.idrnd.misnap.iad.CaptureError captureError = (net.idrnd.misnap.iad.CaptureError) ((net.idrnd.misnap.iad.Result.Failure) capture).getError();
        if (kotlin.jvm.internal.Intrinsics.areEqual(captureError, net.idrnd.misnap.iad.CaptureError.CaptureCoreClosed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(captureError, net.idrnd.misnap.iad.CaptureError.UnknownError.INSTANCE)) {
            return new com.miteksystems.misnap.controller.a.s.a(com.miteksystems.misnap.controller.a.r.b.f3995a);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(captureError, net.idrnd.misnap.iad.CaptureError.DerKeyInvalid.INSTANCE)) {
            return new com.miteksystems.misnap.controller.a.s.a(com.miteksystems.misnap.controller.a.r.d.f3997a);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(captureError, net.idrnd.misnap.iad.CaptureError.EncryptionError.INSTANCE)) {
            return new com.miteksystems.misnap.controller.a.s.a(com.miteksystems.misnap.controller.a.r.a.f3994a);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(captureError, net.idrnd.misnap.iad.CaptureError.NotReadyForCapture.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(captureError, net.idrnd.misnap.iad.CaptureError.PhotoWithPassedTimestampDoesNotExist.INSTANCE)) {
            return new com.miteksystems.misnap.controller.a.s.a(com.miteksystems.misnap.controller.a.r.e.f3998a);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/miteksystems/misnap/controller/a/p$a;", "", "<init>", "()V", "", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "([B[B)[B", "Landroid/content/Context;", "context", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "settings", "Lcom/miteksystems/misnap/controller/a/p;", "a", "(Landroid/content/Context;Lcom/miteksystems/misnap/core/MiSnapSettings;)Lcom/miteksystems/misnap/controller/a/p;"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.miteksystems.misnap.controller.a.p$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ com.miteksystems.misnap.controller.a.p a(android.content.Context context, com.miteksystems.misnap.core.MiSnapSettings settings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
            net.idrnd.misnap.iad.PayloadSize payloadSize = com.miteksystems.misnap.controller.AnalysisSettings.getAiBasedRtsPayloadSize(settings.analysis) == com.miteksystems.misnap.core.MiSnapSettings.Analysis.AiBasedRtsPayloadSize.SMALL ? net.idrnd.misnap.iad.PayloadSize.Small : net.idrnd.misnap.iad.PayloadSize.Normal;
            byte[] decode = android.util.Base64.decode(new java.lang.String(getHighSpeedVideoFpsRangesFor(new byte[]{kotlin.io.encoding.Base64.padSymbol, 4, 63, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 1, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 42, 69, 60, com.google.common.base.Ascii.RS, 10, 40, 97, 6, 66, 38, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 48, com.google.common.base.Ascii.SI, 38, 37, 1, 19, 17, 62, 107, 13, kotlin.io.encoding.Base64.padSymbol, 4, 63, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.NAK, 6, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 5, 4, 117, com.visa.cbp.getEncExpo.IResultReceiver2, com.google.common.base.Ascii.RS, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 68, 43, 59, 32, 41, 10, 33, 66, 57, 82, 1, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, 37, com.google.common.base.Ascii.RS, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 63, com.google.common.base.Ascii.SYN, 123, 68, 34, 45, 1, 37, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, com.google.common.base.Ascii.SYN, 59, 14, 13, 0, 77, 9, 62, com.google.common.base.Ascii.ESC, 3, 3, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.NAK, 57, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 45, 62, com.google.common.base.Ascii.SYN, 62, 32, 7, 7, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, 62, 9, 89, 126, 4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 17, 66, 56, 33, 85, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 19, com.google.common.base.Ascii.US, 42, 6, 71, 86, com.google.common.base.Ascii.DC4, 38, 8, 40, 3, 3, 35, 1, 43, 4, 40, 122, 7, 46, 35, 33, 0, 18, com.google.common.base.Ascii.ESC, 108, com.google.common.base.Ascii.FF, 100, com.google.common.base.Ascii.ESC, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 37, 46, 97, 5, 63, 33, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 43, 58, 47, com.google.common.base.Ascii.SYN, 45, 40, 41, 7, com.google.common.base.Ascii.ESC, 106, 56, 4, 120, 38, 19, 63, com.google.common.base.Ascii.SYN, 39, 41, 70, 34, 42, 80, 33, 76, 37, com.google.common.base.Ascii.RS, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 60, 56, 46, 35, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 2, 57, kotlin.io.encoding.Base64.padSymbol, 83, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, 8, com.google.common.base.Ascii.EM, 98, 124, 59, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 48, 13, 59, com.google.common.base.Ascii.CAN, 120, com.google.common.base.Ascii.ETB, 57, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 48, 77, 57, 76, 47, 63, 97, com.google.common.base.Ascii.FS, 58, 13, 70, 0, 66, 33, 18, 84, 63, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 58, 7, com.google.common.base.Ascii.GS, 38, 34, com.google.common.base.Ascii.US, 18, com.google.common.base.Ascii.RS, 43, 66, 117, 47, 17, 109, 115, 102, 7, 35, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 7, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ESC, 83, 36, 42, 13, 16, 16, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, com.google.common.base.Ascii.US, 9, 58, kotlin.io.encoding.Base64.padSymbol, 123, 34, kotlin.io.encoding.Base64.padSymbol, 62, 0, 62, 8, 121, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 3, 36, 35, 120, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 7, 62, 44, 58, 8, 44, 7, com.google.common.base.Ascii.DC4, 94, com.google.common.base.Ascii.VT, 10, com.google.common.base.Ascii.VT, 4, com.google.common.base.Ascii.SUB, 59, 56, 39, 38, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 37, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 0, com.google.common.base.Ascii.US, 32, com.google.common.base.Ascii.FF, 10, 38, com.google.common.base.Ascii.EM, 109, 45, 69, 7, 41, 107, com.google.common.base.Ascii.RS, 33, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 64, 35, 76, 120, 87, 44, 118, 102, com.visa.cbp.getEncExpo.IResultReceiver2, com.google.common.base.Ascii.SYN, 98, 14, 0, com.google.common.base.Ascii.SI, 3, 69, 125, 68, 58, 117, kotlin.io.encoding.Base64.padSymbol, 13, 2, 97, 100, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 44, com.google.common.base.Ascii.VT, 43, 64, 66, 82, 8, 87, 13, 36, 48, 93, 62, com.google.common.base.Ascii.ETB, 97, 36, 120, com.google.common.base.Ascii.DC4, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 3, 67, com.google.common.base.Ascii.FS, 1, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.ESC, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 36, 0, 59, 124, 56, 56, com.google.common.base.Ascii.FF, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.US, 41, 63, 41, com.google.common.base.Ascii.ESC, 2, com.google.common.base.Ascii.FS, 40, com.google.common.base.Ascii.ETB, 16, 39, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 2, kotlin.io.encoding.Base64.padSymbol, 36, 41, 73, com.google.common.base.Ascii.FS, 63, 48, 9, 35, com.google.common.base.Ascii.FF, 3}, new byte[]{com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 77, 118, 116, 72, 114, 77, 65, 114, 84, 65, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 84, 117, 99, 111, 88, 113, 114, 100, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 103, 117, 73, 103, 100, 78, 80, 80, 111, 83, 76}), kotlin.text.Charsets.US_ASCII), 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "");
            return new com.miteksystems.misnap.controller.a.p(new net.idrnd.misnap.iad.CaptureCore(context, decode, net.idrnd.misnap.iad.Scenario.INSTANCE.createFaceScenario(payloadSize), null));
        }

        private static byte[] getHighSpeedVideoFpsRangesFor(byte[] p0, byte[] p1) {
            byte[] bArr = new byte[p0.length];
            int length = p0.length;
            for (int i = 0; i < 392; i++) {
                bArr[i] = (byte) (p0[i] ^ p1[i % p1.length]);
            }
            return bArr;
        }

        private Companion() {
        }
    }

    public final void a() {
        this.getHighSpeedVideoSizes.close();
        this.Camera2StreamConfigurationMap = false;
    }

    public final /* synthetic */ void a(com.miteksystems.misnap.core.Frame frame) {
        com.miteksystems.misnap.core.Frame.FrameInfo frameInfo;
        java.lang.Object m23436constructorimpl;
        com.miteksystems.misnap.controller.a.t tVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
        if (frame.getImageFormat() != 17) {
            throw new com.miteksystems.misnap.controller.a.q(com.miteksystems.misnap.controller.a.t.d.f4004a);
        }
        com.miteksystems.misnap.core.Frame.FrameInfo[] frameInfos = frame.getFrameInfos();
        int length = frameInfos.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                frameInfo = null;
                break;
            }
            frameInfo = frameInfos[i];
            if (frameInfo instanceof com.miteksystems.misnap.core.Frame.FrameInfo.TimingFrameInfo) {
                break;
            } else {
                i++;
            }
        }
        java.lang.Long valueOf = frameInfo != null ? java.lang.Long.valueOf(((com.miteksystems.misnap.core.Frame.FrameInfo.TimingFrameInfo) frameInfo).getTimestamp()) : null;
        if (valueOf == null || valueOf.longValue() <= 0) {
            throw new com.miteksystems.misnap.controller.a.q(com.miteksystems.misnap.controller.a.t.c.f4003a);
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(new android.graphics.YuvImage(frame.getImageBytes(), 17, frame.getImageSize().getWidth(), frame.getImageSize().getHeight(), null));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
            throw new com.miteksystems.misnap.controller.a.q(com.miteksystems.misnap.controller.a.t.d.f4004a);
        }
        net.idrnd.misnap.iad.Result<net.idrnd.misnap.iad.ProcessResult, net.idrnd.misnap.iad.ProcessError> process = this.getHighSpeedVideoSizes.process(new net.idrnd.misnap.iad.IadFrame((android.graphics.YuvImage) m23436constructorimpl, valueOf.longValue(), frame.getRotationDegrees()));
        if (!(process instanceof net.idrnd.misnap.iad.Result.Failure)) {
            if (process instanceof net.idrnd.misnap.iad.Result.Success) {
                net.idrnd.misnap.iad.ProcessResult processResult = (net.idrnd.misnap.iad.ProcessResult) ((net.idrnd.misnap.iad.Result.Success) process).getValue();
                if (processResult instanceof net.idrnd.misnap.iad.ProcessResult.FrameProcessed) {
                    this.Camera2StreamConfigurationMap = ((net.idrnd.misnap.iad.ProcessResult.FrameProcessed) processResult).getReadyToCapture() == net.idrnd.misnap.iad.ReadyToCapture.Yes;
                    return;
                }
                return;
            }
            return;
        }
        net.idrnd.misnap.iad.ProcessError processError = (net.idrnd.misnap.iad.ProcessError) ((net.idrnd.misnap.iad.Result.Failure) process).getError();
        if (kotlin.jvm.internal.Intrinsics.areEqual(processError, net.idrnd.misnap.iad.ProcessError.CaptureCoreClosed.INSTANCE)) {
            tVar = com.miteksystems.misnap.controller.a.t.a.f4001a;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(processError, net.idrnd.misnap.iad.ProcessError.ImageSizeInvalid.INSTANCE)) {
            tVar = com.miteksystems.misnap.controller.a.t.b.f4002a;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(processError, net.idrnd.misnap.iad.ProcessError.ImageTimestampInvalid.INSTANCE)) {
            tVar = com.miteksystems.misnap.controller.a.t.c.f4003a;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(processError, net.idrnd.misnap.iad.ProcessError.JpegEncodingFailed.INSTANCE)) {
            tVar = com.miteksystems.misnap.controller.a.t.e.f4005a;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(processError, net.idrnd.misnap.iad.ProcessError.Nv21IsNull.INSTANCE)) {
            tVar = com.miteksystems.misnap.controller.a.t.f.f4006a;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(processError, net.idrnd.misnap.iad.ProcessError.UnknownError.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            tVar = com.miteksystems.misnap.controller.a.t.g.f4007a;
        }
        throw new com.miteksystems.misnap.controller.a.q(tVar);
    }

    /* renamed from: b, reason: from getter */
    public final boolean getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public p(net.idrnd.misnap.iad.CaptureCore captureCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureCore, "");
        this.getHighSpeedVideoSizes = captureCore;
    }
}
