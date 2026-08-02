package com.adobe.marketing.mobile.services;

/* loaded from: classes7.dex */
public class PersistentHitQueue extends com.adobe.marketing.mobile.services.HitQueuing {
    final com.adobe.marketing.mobile.services.HitProcessing Camera2StreamConfigurationMap;
    final com.adobe.marketing.mobile.services.DataQueue getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges;
    final java.util.concurrent.ScheduledExecutorService getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes;

    public PersistentHitQueue(com.adobe.marketing.mobile.services.DataQueue dataQueue, com.adobe.marketing.mobile.services.HitProcessing hitProcessing) throws java.lang.IllegalArgumentException {
        this(dataQueue, hitProcessing, java.util.concurrent.Executors.newSingleThreadScheduledExecutor());
    }

    private PersistentHitQueue(com.adobe.marketing.mobile.services.DataQueue dataQueue, com.adobe.marketing.mobile.services.HitProcessing hitProcessing, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean(false);
        if (dataQueue == null || hitProcessing == null) {
            throw new java.lang.IllegalArgumentException("Null value is not allowed in PersistentHitQueue Constructor.");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = dataQueue;
        this.Camera2StreamConfigurationMap = hitProcessing;
        this.getHighSpeedVideoFpsRangesFor = scheduledExecutorService;
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public boolean queue(com.adobe.marketing.mobile.services.DataEntity dataEntity) {
        boolean add = this.getHighResolutionOutputSizeshNQ4ISI.add(dataEntity);
        getHighResolutionOutputSizeshNQ4ISI();
        return add;
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public void beginProcessing() {
        this.getHighSpeedVideoFpsRanges.set(false);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public void suspend() {
        this.getHighSpeedVideoFpsRanges.set(true);
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public void clear() {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public int count() {
        return this.getHighResolutionOutputSizeshNQ4ISI.count();
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public void close() {
        suspend();
        this.getHighResolutionOutputSizeshNQ4ISI.close();
        this.getHighSpeedVideoFpsRangesFor.shutdown();
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoFpsRanges.get() || !this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.execute(new java.lang.Runnable() { // from class: com.adobe.marketing.mobile.services.PersistentHitQueue$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                final com.adobe.marketing.mobile.services.PersistentHitQueue persistentHitQueue = com.adobe.marketing.mobile.services.PersistentHitQueue.this;
                final com.adobe.marketing.mobile.services.DataEntity peek = persistentHitQueue.getHighResolutionOutputSizeshNQ4ISI.peek();
                if (peek == null) {
                    persistentHitQueue.getHighSpeedVideoSizes.set(false);
                } else {
                    persistentHitQueue.Camera2StreamConfigurationMap.processHit(peek, new com.adobe.marketing.mobile.services.HitProcessingResult() { // from class: com.adobe.marketing.mobile.services.PersistentHitQueue$$ExternalSyntheticLambda2
                        @Override // com.adobe.marketing.mobile.services.HitProcessingResult
                        public final void complete(boolean z) {
                            final com.adobe.marketing.mobile.services.PersistentHitQueue persistentHitQueue2 = com.adobe.marketing.mobile.services.PersistentHitQueue.this;
                            com.adobe.marketing.mobile.services.DataEntity dataEntity = peek;
                            if (!z) {
                                persistentHitQueue2.getHighSpeedVideoFpsRangesFor.schedule(new java.lang.Runnable() { // from class: com.adobe.marketing.mobile.services.PersistentHitQueue$$ExternalSyntheticLambda1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.adobe.marketing.mobile.services.PersistentHitQueue persistentHitQueue3 = com.adobe.marketing.mobile.services.PersistentHitQueue.this;
                                        persistentHitQueue3.getHighSpeedVideoSizes.set(false);
                                        persistentHitQueue3.getHighResolutionOutputSizeshNQ4ISI();
                                    }
                                }, persistentHitQueue2.Camera2StreamConfigurationMap.retryInterval(dataEntity), java.util.concurrent.TimeUnit.SECONDS);
                            } else {
                                persistentHitQueue2.getHighResolutionOutputSizeshNQ4ISI.remove();
                                persistentHitQueue2.getHighSpeedVideoSizes.set(false);
                                persistentHitQueue2.getHighResolutionOutputSizeshNQ4ISI();
                            }
                        }
                    });
                }
            }
        });
    }
}
