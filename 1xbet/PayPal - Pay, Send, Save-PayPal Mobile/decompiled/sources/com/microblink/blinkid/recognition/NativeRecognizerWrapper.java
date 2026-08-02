package com.microblink.blinkid.recognition;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NativeRecognizerWrapper {
    public static final com.microblink.blinkid.recognition.NativeRecognizerWrapper IllIIlIIII;
    public static final /* synthetic */ com.microblink.blinkid.recognition.NativeRecognizerWrapper[] lIIIIIlIlI;
    public final com.microblink.blinkid.secured.IlIlIlIIIl IllIIIIllI;
    public volatile com.microblink.blinkid.settings.NativeLibraryInfo llIIIlllll;
    public final java.util.concurrent.atomic.AtomicReference llIIlIlIIl = new java.util.concurrent.atomic.AtomicReference(com.microblink.blinkid.secured.IIlIIIIllI.UNINITIALIZED);
    public volatile boolean IlIllIlIIl = false;
    public java.util.Timer IllIIIllII = null;
    public com.microblink.blinkid.view.recognition.lIlIIIIlIl lIlIIIIlIl = null;
    public com.microblink.blinkid.entities.recognizers.RecognizerBundle llIIlIIlll = null;
    public final java.util.concurrent.atomic.AtomicBoolean IIlIIIllIl = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final com.microblink.blinkid.secured.IIIlIIllII lIIIIIllll = new com.microblink.blinkid.secured.IIIlIIllII(this);
    public final com.microblink.blinkid.secured.lIIlIIIlII lllIIIlIlI = new com.microblink.blinkid.secured.lIIlIIIlII(this);
    public int IlIllIlllI = 0;
    public long lllIlIlIIl = 0;

    static {
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = new com.microblink.blinkid.recognition.NativeRecognizerWrapper();
        IllIIlIIII = nativeRecognizerWrapper;
        lIIIIIlIlI = new com.microblink.blinkid.recognition.NativeRecognizerWrapper[]{nativeRecognizerWrapper};
        com.microblink.blinkid.secured.lIIllllIIl.IlIllIlIIl();
    }

    public NativeRecognizerWrapper() {
        this.IllIIIIllI = null;
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = new com.microblink.blinkid.secured.IlIlIlIIIl("Recognition");
        this.IllIIIIllI = ilIlIlIIIl;
        ilIlIlIIIl.start();
    }

    private static native com.microblink.blinkid.entities.recognizers.SignedPayload buildPingData(long j, java.lang.String str, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long initNativeRecognizers(long j, long[] jArr, boolean z, java.lang.String str, java.lang.String str2);

    private static native long nativeConstruct();

    /* JADX INFO: Access modifiers changed from: private */
    public static native int recognize(long j, long j2, long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int recognizeString(long j, java.lang.String str, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void resetRecognizers(long j, boolean z);

    private static native void terminateNativeRecognizers(long j);

    private static native java.lang.String updateRecognizers(long j, long[] jArr, boolean z);

    public static com.microblink.blinkid.recognition.NativeRecognizerWrapper valueOf(java.lang.String str) {
        return (com.microblink.blinkid.recognition.NativeRecognizerWrapper) java.lang.Enum.valueOf(com.microblink.blinkid.recognition.NativeRecognizerWrapper.class, str);
    }

    public static com.microblink.blinkid.recognition.NativeRecognizerWrapper[] values() {
        return (com.microblink.blinkid.recognition.NativeRecognizerWrapper[]) lIIIIIlIlI.clone();
    }

    public final void IlIllIlIIl() {
        com.microblink.blinkid.util.Log.v(this, "Terminating native library, state was: {}", ((com.microblink.blinkid.secured.IIlIIIIllI) this.llIIlIlIIl.get()).name());
        this.llIIlIIlll = null;
        java.lang.Object obj = this.llIIlIlIIl.get();
        com.microblink.blinkid.secured.IIlIIIIllI iIlIIIIllI = com.microblink.blinkid.secured.IIlIIIIllI.UNINITIALIZED;
        if (obj != iIlIIIIllI) {
            com.microblink.blinkid.util.Log.v(this, "Calling native terminate...", new java.lang.Object[0]);
            terminateNativeRecognizers(this.lllIlIlIIl);
            this.lllIlIlIIl = 0L;
            this.llIIlIlIIl.set(iIlIIIIllI);
        }
    }

    public final void IllIIIllII() {
        com.microblink.blinkid.view.recognition.lIlIIIIlIl liliiiilil = this.lIlIIIIlIl;
        if (liliiiilil != null) {
            com.microblink.blinkid.secured.lIllIlIlII IllIIIIllI = liliiiilil.IllIIIIllI();
            if (IllIIIIllI != null) {
                com.microblink.blinkid.util.Log.d(this, "Obtained already best frame ID {} from provider. Starting recognition...", java.lang.Long.valueOf(IllIIIIllI.IllIIIIllI()));
                this.llIIlIlIIl.set(com.microblink.blinkid.secured.IIlIIIIllI.DISPATCH_READY);
                llIIlIlIIl(IllIIIIllI, this.lIlIIIIlIl.llIIIlllll(), this.lIlIIIIlIl.IllIIIllII(), this.lIlIIIIlIl.IlIllIlIIl(), this.lIlIIIIlIl.llIIlIlIIl(), false);
                return;
            }
            com.microblink.blinkid.util.Log.d(this, "Provider still does not have best frame available. Will wait for it to dispatch a frame", new java.lang.Object[0]);
        }
        com.microblink.blinkid.util.Log.d(this, "Transitioned to state READY", new java.lang.Object[0]);
        this.llIIlIlIIl.set(com.microblink.blinkid.secured.IIlIIIIllI.READY);
    }

    public static long[] llIIlIlIIl(com.microblink.blinkid.entities.recognizers.Recognizer[] recognizerArr) {
        long[] jArr = new long[recognizerArr.length];
        for (int i = 0; i < recognizerArr.length; i++) {
            com.microblink.blinkid.entities.recognizers.Recognizer recognizer = recognizerArr[i];
            if (recognizer != null) {
                jArr[i] = recognizer.getNativeContext();
            } else {
                jArr[i] = 0;
            }
        }
        return jArr;
    }

    public final void llIIlIlIIl(android.content.Context context, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle, com.microblink.blinkid.secured.llIllIlIII llilliliii) {
        int i = this.IlIllIlllI + 1;
        this.IlIllIlllI = i;
        com.microblink.blinkid.util.Log.d(this, "Active instances: {}", java.lang.Integer.valueOf(i));
        if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.llIIlIlIIl, com.microblink.blinkid.secured.IIlIIIIllI.UNINITIALIZED, com.microblink.blinkid.secured.IIlIIIIllI.PRE_INIT)) {
            com.microblink.blinkid.util.Log.w(this, "Will not initialize native recognizer because it is already initialized, state is {}", this.llIIlIlIIl);
            com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = this.IllIIIIllI;
            if (ilIlIlIIIl != null) {
                ilIlIlIIIl.llIIlIlIIl(new com.microblink.blinkid.secured.lIIlIIIIlI(this, recognizerBundle, llilliliii));
                return;
            }
            throw new java.lang.IllegalStateException("Cannot reconfigure recognizers when they are not active. Please initialize first!");
        }
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        if (this.lllIlIlIIl == 0) {
            this.lllIlIlIIl = nativeConstruct();
        }
        if (com.microblink.blinkid.hardware.MicroblinkDeviceManager.llIIlIlIIl(context) != null) {
            this.IIlIIIllIl.set(false);
            com.microblink.blinkid.util.Log.d(this, "Posting init task to RecognitionQueue...", new java.lang.Object[0]);
            this.IllIIIIllI.llIIlIlIIl(new com.microblink.blinkid.secured.IIIIlIlIII(this, context, llilliliii, recognizerBundle));
            return;
        }
        throw new java.lang.NullPointerException("Device manager was not initialised!");
    }

    public static void llIIlIlIIl(com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle, com.microblink.blinkid.secured.llIllIlIII llilliliii) {
        com.microblink.blinkid.secured.IIlIIIIllI iIlIIIIllI = (com.microblink.blinkid.secured.IIlIIIIllI) nativeRecognizerWrapper.llIIlIlIIl.get();
        if (iIlIIIIllI == com.microblink.blinkid.secured.IIlIIIIllI.UNINITIALIZED || iIlIIIIllI == com.microblink.blinkid.secured.IIlIIIIllI.PRE_INIT || iIlIIIIllI == com.microblink.blinkid.secured.IIlIIIIllI.INITIALIZING) {
            return;
        }
        java.lang.String updateRecognizers = updateRecognizers(nativeRecognizerWrapper.lllIlIlIIl, llIIlIlIIl(recognizerBundle.getRecognizers()), recognizerBundle.shouldAllowMultipleScanResultsOnSingleImage());
        nativeRecognizerWrapper.llIIlIIlll = recognizerBundle;
        if (updateRecognizers != null) {
            com.microblink.blinkid.util.Log.e(nativeRecognizerWrapper, "Failed to reconfigure native recognizers!", new java.lang.Object[0]);
            com.microblink.blinkid.util.Log.e(nativeRecognizerWrapper, "Reason: {}", updateRecognizers);
            nativeRecognizerWrapper.IlIllIlIIl();
            llilliliii.onRecognizerError(new com.microblink.blinkid.recognition.RecognizerError(updateRecognizers));
        }
    }

    public static void llIIlIlIIl(com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper, com.microblink.blinkid.secured.IIIIllIlIl iIIIllIlIl, com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback, com.microblink.blinkid.secured.lIIllllIII liilllliii) {
        if (nativeRecognizerWrapper.lllIlIlIIl == 0) {
            com.microblink.blinkid.util.Log.w(nativeRecognizerWrapper, "Reconfiguration or initialisation has failed. Cannot recognise input data!", new java.lang.Object[0]);
            return;
        }
        nativeRecognizerWrapper.llIIlIlIIl.set(com.microblink.blinkid.secured.IIlIIIIllI.WORKING);
        recognitionProcessCallback.setNativeRecognizerWrapper(nativeRecognizerWrapper);
        int llIIlIlIIl = iIIIllIlIl.llIIlIlIIl(recognitionProcessCallback);
        recognitionProcessCallback.setNativeRecognizerWrapper(null);
        nativeRecognizerWrapper.llIIlIlIIl.set(com.microblink.blinkid.secured.IIlIIIIllI.DONE);
        if (liilllliii != null) {
            com.microblink.blinkid.recognition.RecognitionSuccessType fromNativeRecognitionState = com.microblink.blinkid.recognition.RecognitionSuccessType.fromNativeRecognitionState(llIIlIlIIl);
            if (nativeRecognizerWrapper.IlIllIlIIl) {
                liilllliii.onRecognitionDoneWithTimeout(fromNativeRecognitionState);
                return;
            } else {
                liilllliii.onRecognitionDone(fromNativeRecognitionState);
                return;
            }
        }
        nativeRecognizerWrapper.IllIIIllII();
    }

    public final void llIIlIlIIl(com.microblink.blinkid.secured.lIllIlIlII lillililii, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle, com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback, com.microblink.blinkid.secured.lIIllllIII liilllliii, com.microblink.blinkid.secured.llIllIlIII llilliliii, boolean z) {
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = this.IllIIIIllI;
        if (ilIlIlIIIl != null) {
            ilIlIlIIIl.llIIlIlIIl(new com.microblink.blinkid.secured.IIIllllllI(this, z, recognizerBundle, llilliliii, lillililii, recognitionProcessCallback, liilllliii));
        } else {
            com.microblink.blinkid.util.Log.wtf(this, "Processing thread is null! Unable to perform recognition!", new java.lang.Object[0]);
        }
    }

    public final void llIIlIlIIl() {
        int i = this.IlIllIlllI - 1;
        this.IlIllIlllI = i;
        if (i > 0) {
            com.microblink.blinkid.util.Log.i(this, "Still having {} instances running, will not terminate native recognizer", java.lang.Integer.valueOf(i));
            return;
        }
        this.IIlIIIllIl.set(true);
        java.util.Timer timer = this.IllIIIllII;
        if (timer != null) {
            timer.cancel();
        }
        this.IlIllIlIIl = false;
        this.IllIIIllII = null;
        if (this.IllIIIIllI != null) {
            com.microblink.blinkid.util.Log.v(this, "Dispatching termination task. State was: {}", this.llIIlIlIIl);
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            this.IllIIIIllI.llIIlIlIIl(new com.microblink.blinkid.secured.IIlIlIlIlI(this, countDownLatch));
            com.microblink.blinkid.util.Log.i(this, "Waiting for native library to terminate...", new java.lang.Object[0]);
            try {
                countDownLatch.await();
                com.microblink.blinkid.util.Log.i(this, "Native library has terminated.", new java.lang.Object[0]);
                return;
            } catch (java.lang.InterruptedException e) {
                com.microblink.blinkid.util.Log.w(this, e, "Interrupted while waiting for native library to terminate.", new java.lang.Object[0]);
                return;
            }
        }
        com.microblink.blinkid.util.Log.w(this, "Library is already terminated or is terminating. State: {}", this.llIIlIlIIl);
    }

    public final com.microblink.blinkid.entities.recognizers.SignedPayload llIIlIlIIl(com.microblink.blinkid.secured.IlIlIlIllI ilIlIlIllI) {
        return buildPingData(this.lllIlIlIIl, ilIlIlIllI.IlIllIlIIl, com.microblink.blinkid.secured.llIlIIIIIl.llIIlIlIIl(ilIlIlIllI.llIIlIlIIl));
    }
}
