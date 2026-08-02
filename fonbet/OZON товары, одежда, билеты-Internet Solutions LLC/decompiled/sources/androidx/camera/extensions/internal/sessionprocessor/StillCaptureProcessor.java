package androidx.camera.extensions.internal.sessionprocessor;

import C.S;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.B0;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.sessionprocessor.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
class StillCaptureProcessor {
    private static final String TAG = "StillCaptureProcessor";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    U.a mCaptureOutputSurface;

    @NonNull
    final CaptureProcessorImpl mCaptureProcessorImpl;
    private boolean mIsPostviewConfigured;

    @NonNull
    final c mCaptureResultImageMatcher = new c();
    final Object mLock = new Object();

    @NonNull
    HashMap<Integer, Pair<d, TotalCaptureResult>> mCaptureResults = new HashMap<>();
    OnCaptureResultCallback mOnCaptureResultCallback = null;
    TotalCaptureResult mSourceCaptureResult = null;
    boolean mIsClosed = false;
    long mTimeStampForOutputImage = -1;

    interface OnCaptureResultCallback {
        void onCaptureCompleted(long j11, @NonNull List<Pair<CaptureResult.Key, Object>> list);

        void onCaptureProcessProgressed(int i11);

        void onError(@NonNull Exception exc);

        void onProcessCompleted();
    }

    StillCaptureProcessor(@NonNull CaptureProcessorImpl captureProcessorImpl, @NonNull Surface surface, @NonNull Size size, B0 b02, boolean z11) {
        this.mCaptureProcessorImpl = captureProcessorImpl;
        U.a aVar = new U.a(surface, size, z11);
        this.mCaptureOutputSurface = aVar;
        captureProcessorImpl.onOutputSurface(aVar.c(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        this.mIsPostviewConfigured = b02 != null;
        if (b02 != null) {
            S.e eVar = S.e.f25187b;
            if (S.b.c(eVar) && S.c.b(eVar)) {
                x2.i.b(b02.b() == 35);
                captureProcessorImpl.onResolutionUpdate(size, b02.c());
                captureProcessorImpl.onPostviewOutputSurface(b02.d());
                return;
            }
        }
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public /* synthetic */ void lambda$process$1(boolean z11, HashMap hashMap, final OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mLock) {
            try {
                try {
                    try {
                    } catch (Exception e11) {
                        S.d(TAG, "mCaptureProcessorImpl.process exception ", e11);
                        this.mOnCaptureResultCallback = null;
                        if (onCaptureResultCallback != null) {
                            onCaptureResultCallback.onError(e11);
                        }
                        S.a(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback2 != null) {
                            onCaptureResultCallback2.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                    }
                    if (this.mIsClosed) {
                        S.a(TAG, "Ignore process() in closed state.");
                        S.a(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback3 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback3 != null) {
                            onCaptureResultCallback3.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                        clearCaptureResults();
                        return;
                    }
                    S.a(TAG, "CaptureProcessorImpl.process() begin");
                    S.e eVar = S.e.f25187b;
                    if (S.c.b(eVar) && S.b.c(eVar) && z11 && this.mIsPostviewConfigured) {
                        this.mCaptureProcessorImpl.processWithPostview(hashMap, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                            public void onCaptureCompleted(long j11, @NonNull List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureCompleted(j11, list);
                            }

                            public void onCaptureProcessProgressed(int i11) {
                                onCaptureResultCallback.onCaptureProcessProgressed(i11);
                            }
                        }, H.c.b());
                    } else {
                        S.e eVar2 = S.e.f25186a;
                        if (S.c.b(eVar2) && S.b.c(eVar2)) {
                            this.mCaptureProcessorImpl.process(hashMap, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.2
                                public void onCaptureCompleted(long j11, @NonNull List<Pair<CaptureResult.Key, Object>> list) {
                                    onCaptureResultCallback.onCaptureCompleted(j11, list);
                                }

                                public void onCaptureProcessProgressed(int i11) {
                                    onCaptureResultCallback.onCaptureProcessProgressed(i11);
                                }
                            }, H.c.b());
                        } else {
                            this.mCaptureProcessorImpl.process(hashMap);
                        }
                    }
                    S.a(TAG, "CaptureProcessorImpl.process() finish");
                    OnCaptureResultCallback onCaptureResultCallback4 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback4 != null) {
                        onCaptureResultCallback4.onProcessCompleted();
                        this.mOnCaptureResultCallback = null;
                    }
                    clearCaptureResults();
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                S.a(TAG, "CaptureProcessorImpl.process() finish");
                OnCaptureResultCallback onCaptureResultCallback5 = this.mOnCaptureResultCallback;
                if (onCaptureResultCallback5 != null) {
                    onCaptureResultCallback5.onProcessCompleted();
                    this.mOnCaptureResultCallback = null;
                }
                clearCaptureResults();
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCapture$0(List list, OnCaptureResultCallback onCaptureResultCallback, boolean z11, d dVar, TotalCaptureResult totalCaptureResult, int i11) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    dVar.b();
                    S.a(TAG, "Ignore image in closed state");
                    return;
                }
                S.a(TAG, "onImageReferenceIncoming  captureStageId=" + i11);
                this.mCaptureResults.put(Integer.valueOf(i11), new Pair<>(dVar, totalCaptureResult));
                S.a(TAG, "mCaptureResult has capture stage Id: " + this.mCaptureResults.keySet());
                if (this.mCaptureResults.keySet().containsAll(list)) {
                    process(this.mCaptureResults, onCaptureResultCallback, z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<d, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                while (it.hasNext()) {
                    ((d) it.next().first).b();
                }
                this.mCaptureResults.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void close() {
        synchronized (this.mLock) {
            S.a(TAG, "Close the StillCaptureProcessor");
            this.mIsClosed = true;
            clearCaptureResults();
            this.mCaptureResultImageMatcher.c();
            this.mCaptureResultImageMatcher.b();
            this.mCaptureOutputSurface.b();
        }
    }

    void notifyCaptureResult(@NonNull TotalCaptureResult totalCaptureResult, int i11) {
        Long l11;
        this.mCaptureResultImageMatcher.a(totalCaptureResult, i11);
        if (this.mTimeStampForOutputImage == -1 && (l11 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long longValue = l11.longValue();
            this.mTimeStampForOutputImage = longValue;
            this.mCaptureOutputSurface.d(longValue);
        }
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void notifyImage(@NonNull d dVar) {
        this.mCaptureResultImageMatcher.d(dVar);
    }

    void process(@NonNull Map<Integer, Pair<d, TotalCaptureResult>> map, @NonNull final OnCaptureResultCallback onCaptureResultCallback, final boolean z11) {
        final HashMap hashMap = new HashMap();
        synchronized (this.mLock) {
            try {
                for (Integer num : map.keySet()) {
                    Pair<d, TotalCaptureResult> pair = map.get(num);
                    hashMap.put(num, new Pair(((d) pair.first).get(), (TotalCaptureResult) pair.second));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        H.c.d().execute(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.h
            @Override // java.lang.Runnable
            public final void run() {
                StillCaptureProcessor.this.lambda$process$1(z11, hashMap, onCaptureResultCallback);
            }
        });
    }

    void startCapture(final boolean z11, @NonNull final List<Integer> list, @NonNull final OnCaptureResultCallback onCaptureResultCallback) {
        S.a(TAG, "Start the capture: enablePostview=" + z11);
        this.mTimeStampForOutputImage = -1L;
        synchronized (this.mLock) {
            x2.i.f("StillCaptureProcessor is closed. Can't invoke startCapture()", !this.mIsClosed);
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.b();
        this.mCaptureResultImageMatcher.g(new c.a() { // from class: androidx.camera.extensions.internal.sessionprocessor.i
            @Override // androidx.camera.extensions.internal.sessionprocessor.c.a
            public final void a(d dVar, TotalCaptureResult totalCaptureResult, int i11) {
                StillCaptureProcessor.this.lambda$startCapture$0(list, onCaptureResultCallback, z11, dVar, totalCaptureResult, i11);
            }
        });
    }
}
