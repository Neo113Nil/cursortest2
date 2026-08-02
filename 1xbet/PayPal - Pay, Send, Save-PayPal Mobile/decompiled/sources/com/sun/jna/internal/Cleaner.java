package com.sun.jna.internal;

/* loaded from: classes5.dex */
public class Cleaner {
    private static final com.sun.jna.internal.Cleaner getHighSpeedVideoFpsRangesFor = new com.sun.jna.internal.Cleaner();
    private java.lang.Thread getHighResolutionOutputSizeshNQ4ISI;
    private com.sun.jna.internal.Cleaner.CleanerRef getHighSpeedVideoFpsRanges;
    private final java.lang.ref.ReferenceQueue<java.lang.Object> getHighSpeedVideoSizes = new java.lang.ref.ReferenceQueue<>();

    public interface Cleanable {
        void clean();
    }

    static /* synthetic */ java.lang.Thread getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.internal.Cleaner cleaner) {
        cleaner.getHighResolutionOutputSizeshNQ4ISI = null;
        return null;
    }

    public static com.sun.jna.internal.Cleaner getCleaner() {
        return getHighSpeedVideoFpsRangesFor;
    }

    private Cleaner() {
    }

    public com.sun.jna.internal.Cleaner.Cleanable register(java.lang.Object obj, java.lang.Runnable runnable) {
        com.sun.jna.internal.Cleaner.CleanerRef highResolutionOutputSizeshNQ4ISI;
        synchronized (this) {
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(new com.sun.jna.internal.Cleaner.CleanerRef(this, obj, this.getHighSpeedVideoSizes, runnable));
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    private com.sun.jna.internal.Cleaner.CleanerRef getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.internal.Cleaner.CleanerRef cleanerRef) {
        synchronized (this) {
            synchronized (this.getHighSpeedVideoSizes) {
                com.sun.jna.internal.Cleaner.CleanerRef cleanerRef2 = this.getHighSpeedVideoFpsRanges;
                if (cleanerRef2 == null) {
                    this.getHighSpeedVideoFpsRanges = cleanerRef;
                } else {
                    cleanerRef.getHighResolutionOutputSizeshNQ4ISI = cleanerRef2;
                    this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = cleanerRef;
                    this.getHighSpeedVideoFpsRanges = cleanerRef;
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    java.util.logging.Logger.getLogger(com.sun.jna.internal.Cleaner.class.getName()).log(java.util.logging.Level.FINE, "Starting CleanerThread");
                    com.sun.jna.internal.Cleaner.CleanerThread cleanerThread = new com.sun.jna.internal.Cleaner.CleanerThread();
                    this.getHighResolutionOutputSizeshNQ4ISI = cleanerThread;
                    cleanerThread.start();
                }
            }
        }
        return cleanerRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Camera2StreamConfigurationMap(com.sun.jna.internal.Cleaner.CleanerRef cleanerRef) {
        boolean z;
        boolean z2;
        synchronized (this) {
            synchronized (this.getHighSpeedVideoSizes) {
                z = true;
                if (cleanerRef == this.getHighSpeedVideoFpsRanges) {
                    this.getHighSpeedVideoFpsRanges = cleanerRef.getHighResolutionOutputSizeshNQ4ISI;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (cleanerRef.getHighSpeedVideoFpsRanges != null) {
                    cleanerRef.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI = cleanerRef.getHighResolutionOutputSizeshNQ4ISI;
                }
                if (cleanerRef.getHighResolutionOutputSizeshNQ4ISI != null) {
                    cleanerRef.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges = cleanerRef.getHighSpeedVideoFpsRanges;
                }
                if (cleanerRef.getHighSpeedVideoFpsRanges == null && cleanerRef.getHighResolutionOutputSizeshNQ4ISI == null) {
                    z = z2;
                }
                cleanerRef.getHighResolutionOutputSizeshNQ4ISI = null;
                cleanerRef.getHighSpeedVideoFpsRanges = null;
            }
        }
        return z;
    }

    static class CleanerRef extends java.lang.ref.PhantomReference<java.lang.Object> implements com.sun.jna.internal.Cleaner.Cleanable {
        private final com.sun.jna.internal.Cleaner Camera2StreamConfigurationMap;
        com.sun.jna.internal.Cleaner.CleanerRef getHighResolutionOutputSizeshNQ4ISI;
        com.sun.jna.internal.Cleaner.CleanerRef getHighSpeedVideoFpsRanges;
        private final java.lang.Runnable getHighSpeedVideoFpsRangesFor;

        public CleanerRef(com.sun.jna.internal.Cleaner cleaner, java.lang.Object obj, java.lang.ref.ReferenceQueue<? super java.lang.Object> referenceQueue, java.lang.Runnable runnable) {
            super(obj, referenceQueue);
            this.Camera2StreamConfigurationMap = cleaner;
            this.getHighSpeedVideoFpsRangesFor = runnable;
        }

        @Override // com.sun.jna.internal.Cleaner.Cleanable
        public void clean() {
            if (this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(this)) {
                this.getHighSpeedVideoFpsRangesFor.run();
            }
        }
    }

    class CleanerThread extends java.lang.Thread {
        public CleanerThread() {
            super("JNA Cleaner");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    java.lang.ref.Reference remove = com.sun.jna.internal.Cleaner.this.getHighSpeedVideoSizes.remove(30000L);
                    if (remove instanceof com.sun.jna.internal.Cleaner.CleanerRef) {
                        ((com.sun.jna.internal.Cleaner.CleanerRef) remove).clean();
                    } else if (remove == null) {
                        synchronized (com.sun.jna.internal.Cleaner.this.getHighSpeedVideoSizes) {
                            java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.sun.jna.internal.Cleaner.class.getName());
                            if (com.sun.jna.internal.Cleaner.this.getHighSpeedVideoFpsRanges == null) {
                                com.sun.jna.internal.Cleaner.getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.internal.Cleaner.this);
                                logger.log(java.util.logging.Level.FINE, "Shutting down CleanerThread");
                                return;
                            } else if (logger.isLoggable(java.util.logging.Level.FINER)) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                for (com.sun.jna.internal.Cleaner.CleanerRef cleanerRef = com.sun.jna.internal.Cleaner.this.getHighSpeedVideoFpsRanges; cleanerRef != null; cleanerRef = cleanerRef.getHighResolutionOutputSizeshNQ4ISI) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(cleanerRef.getHighSpeedVideoFpsRangesFor.toString());
                                }
                                logger.log(java.util.logging.Level.FINER, "Registered Cleaners: {0}", sb.toString());
                            }
                        }
                    } else {
                        continue;
                    }
                } catch (java.lang.InterruptedException unused) {
                    return;
                } catch (java.lang.Exception e) {
                    java.util.logging.Logger.getLogger(com.sun.jna.internal.Cleaner.class.getName()).log(java.util.logging.Level.SEVERE, (java.lang.String) null, (java.lang.Throwable) e);
                }
            }
        }
    }
}
