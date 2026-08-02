package org.threeten.bp.zone;

/* loaded from: classes18.dex */
public abstract class ZoneRulesInitializer {
    public static final org.threeten.bp.zone.ZoneRulesInitializer DO_NOTHING = new org.threeten.bp.zone.ZoneRulesInitializer.DoNothingZoneRulesInitializer();
    private static final java.util.concurrent.atomic.AtomicBoolean Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static final java.util.concurrent.atomic.AtomicReference<org.threeten.bp.zone.ZoneRulesInitializer> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();

    protected abstract void initializeProviders();

    public static void setInitializer(org.threeten.bp.zone.ZoneRulesInitializer zoneRulesInitializer) {
        if (Camera2StreamConfigurationMap.get()) {
            throw new java.lang.IllegalStateException("Already initialized");
        }
        if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoSizes, null, zoneRulesInitializer)) {
            throw new java.lang.IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        if (Camera2StreamConfigurationMap.getAndSet(true)) {
            throw new java.lang.IllegalStateException("Already initialized");
        }
        java.util.concurrent.atomic.AtomicReference<org.threeten.bp.zone.ZoneRulesInitializer> atomicReference = getHighSpeedVideoSizes;
        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, new org.threeten.bp.zone.ZoneRulesInitializer.ServiceLoaderZoneRulesInitializer());
        atomicReference.get().initializeProviders();
    }

    static class DoNothingZoneRulesInitializer extends org.threeten.bp.zone.ZoneRulesInitializer {
        @Override // org.threeten.bp.zone.ZoneRulesInitializer
        protected void initializeProviders() {
        }

        DoNothingZoneRulesInitializer() {
        }
    }

    static class ServiceLoaderZoneRulesInitializer extends org.threeten.bp.zone.ZoneRulesInitializer {
        ServiceLoaderZoneRulesInitializer() {
        }

        @Override // org.threeten.bp.zone.ZoneRulesInitializer
        protected void initializeProviders() {
            java.util.Iterator it = java.util.ServiceLoader.load(org.threeten.bp.zone.ZoneRulesProvider.class, org.threeten.bp.zone.ZoneRulesProvider.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    org.threeten.bp.zone.ZoneRulesProvider.registerProvider((org.threeten.bp.zone.ZoneRulesProvider) it.next());
                } catch (java.util.ServiceConfigurationError e) {
                    if (!(e.getCause() instanceof java.lang.SecurityException)) {
                        throw e;
                    }
                }
            }
        }
    }
}
