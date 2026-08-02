package com.daon.sdk.face.module;

/* loaded from: classes7.dex */
public abstract class Analyzer implements com.daon.sdk.face.module.Module {
    private java.lang.Thread getHighSpeedVideoSizes;
    public java.util.concurrent.LinkedBlockingQueue<com.daon.sdk.face.YUV> queue;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private int getHighSpeedVideoFpsRanges = 0;
    private final android.os.Bundle Camera2StreamConfigurationMap = new android.os.Bundle();
    private final java.util.concurrent.locks.ReentrantLock getHighSpeedVideoFpsRangesFor = new java.util.concurrent.locks.ReentrantLock();
    private final android.os.Handler getInputFormats = new android.os.Handler(android.os.Looper.getMainLooper());

    public interface AnalyzerCallback {
        void onAnalysisComplete(java.lang.String str, android.os.Bundle bundle, com.daon.sdk.face.YUV yuv);
    }

    class a implements java.lang.Runnable {
        private final com.daon.sdk.face.module.Analyzer.AnalyzerCallback getHighSpeedVideoFpsRanges;

        a(com.daon.sdk.face.module.Analyzer.AnalyzerCallback analyzerCallback) {
            this.getHighSpeedVideoFpsRanges = analyzerCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = true;
            while (z) {
                try {
                    com.daon.sdk.face.YUV take = com.daon.sdk.face.module.Analyzer.this.queue.take();
                    com.daon.sdk.face.module.Analyzer.this.getHighSpeedVideoFpsRangesFor.lock();
                    try {
                        com.daon.sdk.face.module.Analyzer analyzer = com.daon.sdk.face.module.Analyzer.this;
                        android.os.Bundle analyze = analyzer.analyze(take, analyzer.Camera2StreamConfigurationMap);
                        if (analyze != null && analyze.size() != 0) {
                            this.getHighSpeedVideoFpsRanges.onAnalysisComplete(com.daon.sdk.face.module.Analyzer.this.getName(), analyze, take);
                        }
                        com.daon.sdk.face.module.Analyzer.this.getHighSpeedVideoFpsRangesFor.unlock();
                    } catch (java.lang.Throwable th) {
                        com.daon.sdk.face.module.Analyzer.this.getHighSpeedVideoFpsRangesFor.unlock();
                        throw th;
                    }
                } catch (java.lang.Exception unused) {
                    z = false;
                }
            }
            com.daon.sdk.face.module.Analyzer.this.onAnalysisStopped();
        }
    }

    public android.os.Bundle analyze(android.graphics.Bitmap bitmap) {
        return null;
    }

    public android.os.Bundle analyze(com.daon.sdk.face.YUV yuv) {
        return null;
    }

    public abstract android.os.Bundle analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle);

    public abstract void analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle, com.daon.sdk.face.module.Analyzer.AnalyzerCallback analyzerCallback);

    public void clear() {
        synchronized (this) {
            this.queue.clear();
        }
    }

    public void flush() {
        synchronized (this) {
            this.queue.offer(new com.daon.sdk.face.YUV(null, 0, 0));
        }
    }

    public void onAnalysisStopped() {
    }

    @Override // com.daon.sdk.face.module.Module
    public void onConfigurationChanged(android.os.Bundle bundle) {
    }

    @Override // com.daon.sdk.face.module.Module
    public void onImageSizeChanged(int i, int i2) {
    }

    protected void showModuleNotFoundMessage(final android.content.Context context) {
        context.getString(com.daon.sdk.face.R.string.module_not_found, getName());
        this.getInputFormats.post(new java.lang.Runnable() { // from class: com.daon.sdk.face.module.Analyzer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.sdk.face.module.Analyzer.$r8$lambda$BIiTXwkwn3LqOa5gOcrjtImMUBE(com.daon.sdk.face.module.Analyzer.this, context);
            }
        });
    }

    public void startAnalyzer(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle, com.daon.sdk.face.module.Analyzer.AnalyzerCallback analyzerCallback) {
        startAnalyzer(yuv, bundle, 0, 0, analyzerCallback);
    }

    @Override // com.daon.sdk.face.module.Module
    public void stop() {
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoSizes.interrupt();
            } else {
                onAnalysisStopped();
            }
            java.util.concurrent.LinkedBlockingQueue<com.daon.sdk.face.YUV> linkedBlockingQueue = this.queue;
            if (linkedBlockingQueue != null) {
                linkedBlockingQueue.clear();
            }
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            this.getHighSpeedVideoSizes = null;
        }
    }

    public void startAnalyzer(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle, int i, int i2, com.daon.sdk.face.module.Analyzer.AnalyzerCallback analyzerCallback) {
        synchronized (this) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getName());
            sb.append(".pause");
            boolean z = bundle.getBoolean(sb.toString(), false);
            boolean z2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (z2 && z) {
                return;
            }
            if (!z2) {
                this.queue = i > 0 ? new java.util.concurrent.LinkedBlockingQueue<>(i) : new java.util.concurrent.LinkedBlockingQueue<>();
                java.lang.Thread thread = new java.lang.Thread(new com.daon.sdk.face.module.Analyzer.a(analyzerCallback));
                this.getHighSpeedVideoSizes = thread;
                thread.start();
                this.getHighResolutionOutputSizeshNQ4ISI = true;
            }
            if (this.getHighSpeedVideoFpsRangesFor.tryLock()) {
                try {
                    this.Camera2StreamConfigurationMap.clear();
                    this.Camera2StreamConfigurationMap.putAll(bundle);
                    this.getHighSpeedVideoFpsRangesFor.unlock();
                } catch (java.lang.Throwable th) {
                    this.getHighSpeedVideoFpsRangesFor.unlock();
                    throw th;
                }
            }
            if (yuv == null) {
                flush();
            } else {
                if (i2 > 0) {
                    int i3 = this.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoFpsRanges = i3 + 1;
                    if (i3 % i2 != 0) {
                        return;
                    }
                }
                this.queue.offer(yuv);
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$BIiTXwkwn3LqOa5gOcrjtImMUBE(com.daon.sdk.face.module.Analyzer analyzer, android.content.Context context) {
        try {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
            builder.setMessage(context.getString(com.daon.sdk.face.R.string.module_not_found, analyzer.getName()));
            builder.setPositiveButton(com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton, new android.content.DialogInterface.OnClickListener() { // from class: com.daon.sdk.face.module.Analyzer$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            builder.create().show();
        } catch (java.lang.Exception e) {
            e.getLocalizedMessage();
        }
    }
}
