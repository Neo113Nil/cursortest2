package androidx.camera.extensions.internal.sessionprocessor;

import C.S;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.sessionprocessor.c;
import java.util.List;

/* loaded from: classes8.dex */
class PreviewProcessor {
    private static final String TAG = "PreviewProcessor";

    @NonNull
    private final PreviewImageProcessorImpl mPreviewImageProcessor;

    @NonNull
    private final c mCaptureResultImageMatcher = new c();
    private final Object mLock = new Object();
    private boolean mIsClosed = false;
    private boolean mIsPaused = false;

    interface OnCaptureResultCallback {
        void onCaptureResult(long j11, @NonNull List<Pair<CaptureResult.Key, Object>> list);
    }

    PreviewProcessor(@NonNull PreviewImageProcessorImpl previewImageProcessorImpl, @NonNull Surface surface, @NonNull Size size) {
        this.mPreviewImageProcessor = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(final OnCaptureResultCallback onCaptureResultCallback, d dVar, TotalCaptureResult totalCaptureResult, int i11) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed || this.mIsPaused) {
                    dVar.b();
                    S.a(TAG, "Ignore image in closed or paused state");
                    return;
                }
                try {
                    S.e eVar = S.e.f25186a;
                    if (S.b.c(eVar) && S.c.b(eVar)) {
                        this.mPreviewImageProcessor.process(dVar.get(), totalCaptureResult, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.1
                            public void onCaptureCompleted(long j11, @NonNull List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureResult(j11, list);
                            }

                            public void onCaptureProcessProgressed(int i12) {
                            }
                        }, H.c.d());
                    } else {
                        this.mPreviewImageProcessor.process(dVar.get(), totalCaptureResult);
                    }
                    dVar.b();
                } catch (Throwable th2) {
                    dVar.b();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureResultImageMatcher.b();
            this.mCaptureResultImageMatcher.c();
        }
    }

    void notifyCaptureResult(@NonNull TotalCaptureResult totalCaptureResult) {
        this.mCaptureResultImageMatcher.a(totalCaptureResult, 0);
    }

    void notifyImage(@NonNull d dVar) {
        this.mCaptureResultImageMatcher.d(dVar);
    }

    void pause() {
        synchronized (this.mLock) {
            this.mIsPaused = true;
        }
    }

    void resume() {
        synchronized (this.mLock) {
            this.mIsPaused = false;
        }
    }

    void start(@NonNull final OnCaptureResultCallback onCaptureResultCallback) {
        this.mCaptureResultImageMatcher.g(new c.a() { // from class: androidx.camera.extensions.internal.sessionprocessor.f
            @Override // androidx.camera.extensions.internal.sessionprocessor.c.a
            public final void a(d dVar, TotalCaptureResult totalCaptureResult, int i11) {
                PreviewProcessor.this.lambda$start$0(onCaptureResultCallback, dVar, totalCaptureResult, i11);
            }
        });
    }
}
