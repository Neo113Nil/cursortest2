package org.threeten.bp.zone;

/* loaded from: classes18.dex */
public abstract class ZoneRulesProvider {
    private static final java.util.concurrent.CopyOnWriteArrayList<org.threeten.bp.zone.ZoneRulesProvider> getHighSpeedVideoSizes = new java.util.concurrent.CopyOnWriteArrayList<>();
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, org.threeten.bp.zone.ZoneRulesProvider> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.ConcurrentHashMap(512, 0.75f, 2);

    protected boolean provideRefresh() {
        return false;
    }

    protected abstract org.threeten.bp.zone.ZoneRules provideRules(java.lang.String str, boolean z);

    protected abstract java.util.NavigableMap<java.lang.String, org.threeten.bp.zone.ZoneRules> provideVersions(java.lang.String str);

    protected abstract java.util.Set<java.lang.String> provideZoneIds();

    static {
        org.threeten.bp.zone.ZoneRulesInitializer.getHighSpeedVideoFpsRangesFor();
    }

    public static java.util.Set<java.lang.String> getAvailableZoneIds() {
        return java.util.Collections.unmodifiableSet(getHighResolutionOutputSizeshNQ4ISI.keySet());
    }

    public static org.threeten.bp.zone.ZoneRules getRules(java.lang.String str, boolean z) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "zoneId");
        return Camera2StreamConfigurationMap(str).provideRules(str, z);
    }

    public static java.util.NavigableMap<java.lang.String, org.threeten.bp.zone.ZoneRules> getVersions(java.lang.String str) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "zoneId");
        return Camera2StreamConfigurationMap(str).provideVersions(str);
    }

    private static org.threeten.bp.zone.ZoneRulesProvider Camera2StreamConfigurationMap(java.lang.String str) {
        java.util.concurrent.ConcurrentMap<java.lang.String, org.threeten.bp.zone.ZoneRulesProvider> concurrentMap = getHighResolutionOutputSizeshNQ4ISI;
        org.threeten.bp.zone.ZoneRulesProvider zoneRulesProvider = concurrentMap.get(str);
        if (zoneRulesProvider != null) {
            return zoneRulesProvider;
        }
        if (concurrentMap.isEmpty()) {
            throw new org.threeten.bp.zone.ZoneRulesException("No time-zone data files registered");
        }
        throw new org.threeten.bp.zone.ZoneRulesException("Unknown time-zone ID: ".concat(java.lang.String.valueOf(str)));
    }

    public static void registerProvider(org.threeten.bp.zone.ZoneRulesProvider zoneRulesProvider) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneRulesProvider, "provider");
        for (java.lang.String str : zoneRulesProvider.provideZoneIds()) {
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "zoneId");
            if (getHighResolutionOutputSizeshNQ4ISI.putIfAbsent(str, zoneRulesProvider) != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to register zone as one already registered with that ID: ");
                sb.append(str);
                sb.append(", currently loading from provider: ");
                sb.append(zoneRulesProvider);
                throw new org.threeten.bp.zone.ZoneRulesException(sb.toString());
            }
        }
        getHighSpeedVideoSizes.add(zoneRulesProvider);
    }

    public static boolean refresh() {
        java.util.Iterator<org.threeten.bp.zone.ZoneRulesProvider> it = getHighSpeedVideoSizes.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= it.next().provideRefresh();
        }
        return z;
    }

    protected ZoneRulesProvider() {
    }
}
