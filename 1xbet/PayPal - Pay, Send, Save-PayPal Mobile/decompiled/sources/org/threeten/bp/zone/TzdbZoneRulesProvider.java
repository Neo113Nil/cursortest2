package org.threeten.bp.zone;

/* loaded from: classes18.dex */
public final class TzdbZoneRulesProvider extends org.threeten.bp.zone.ZoneRulesProvider {
    private java.util.List<java.lang.String> Camera2StreamConfigurationMap;
    private final java.util.concurrent.ConcurrentNavigableMap<java.lang.String, org.threeten.bp.zone.TzdbZoneRulesProvider.Version> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.ConcurrentSkipListMap();
    private java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges = new java.util.concurrent.CopyOnWriteArraySet();

    public TzdbZoneRulesProvider() {
        if (!getHighSpeedVideoFpsRanges(org.threeten.bp.zone.ZoneRulesProvider.class.getClassLoader())) {
            throw new org.threeten.bp.zone.ZoneRulesException("No time-zone rules found for 'TZDB'");
        }
    }

    public TzdbZoneRulesProvider(java.net.URL url) {
        try {
            if (getHighSpeedVideoFpsRanges(url)) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No time-zone rules found: ");
            sb.append(url);
            throw new org.threeten.bp.zone.ZoneRulesException(sb.toString());
        } catch (java.lang.Exception e) {
            throw new org.threeten.bp.zone.ZoneRulesException("Unable to load TZDB time-zone rules: ".concat(java.lang.String.valueOf(url)), e);
        }
    }

    public TzdbZoneRulesProvider(java.io.InputStream inputStream) {
        try {
            getHighSpeedVideoFpsRangesFor(inputStream);
        } catch (java.lang.Exception e) {
            throw new org.threeten.bp.zone.ZoneRulesException("Unable to load TZDB time-zone rules", e);
        }
    }

    @Override // org.threeten.bp.zone.ZoneRulesProvider
    protected final java.util.Set<java.lang.String> provideZoneIds() {
        return new java.util.HashSet(this.Camera2StreamConfigurationMap);
    }

    @Override // org.threeten.bp.zone.ZoneRulesProvider
    protected final org.threeten.bp.zone.ZoneRules provideRules(java.lang.String str, boolean z) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "zoneId");
        org.threeten.bp.zone.ZoneRules Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.lastEntry().getValue().Camera2StreamConfigurationMap(str);
        if (Camera2StreamConfigurationMap != null) {
            return Camera2StreamConfigurationMap;
        }
        throw new org.threeten.bp.zone.ZoneRulesException("Unknown time-zone ID: ".concat(java.lang.String.valueOf(str)));
    }

    @Override // org.threeten.bp.zone.ZoneRulesProvider
    protected final java.util.NavigableMap<java.lang.String, org.threeten.bp.zone.ZoneRules> provideVersions(java.lang.String str) {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        for (org.threeten.bp.zone.TzdbZoneRulesProvider.Version version : this.getHighResolutionOutputSizeshNQ4ISI.values()) {
            org.threeten.bp.zone.ZoneRules Camera2StreamConfigurationMap = version.Camera2StreamConfigurationMap(str);
            if (Camera2StreamConfigurationMap != null) {
                treeMap.put(version.Camera2StreamConfigurationMap, Camera2StreamConfigurationMap);
            }
        }
        return treeMap;
    }

    private boolean getHighSpeedVideoFpsRanges(java.lang.ClassLoader classLoader) {
        java.net.URL url;
        java.net.URL url2 = null;
        try {
            java.util.Enumeration<java.net.URL> resources = classLoader.getResources("org/threeten/bp/TZDB.dat");
            boolean z = false;
            while (resources.hasMoreElements()) {
                url = resources.nextElement();
                try {
                    z |= getHighSpeedVideoFpsRanges(url);
                    url2 = url;
                } catch (java.lang.Exception e) {
                    e = e;
                    throw new org.threeten.bp.zone.ZoneRulesException("Unable to load TZDB time-zone rules: ".concat(java.lang.String.valueOf(url)), e);
                }
            }
            return z;
        } catch (java.lang.Exception e2) {
            e = e2;
            url = url2;
        }
    }

    private boolean getHighSpeedVideoFpsRanges(java.net.URL url) throws java.lang.ClassNotFoundException, java.io.IOException, org.threeten.bp.zone.ZoneRulesException {
        java.io.InputStream inputStream;
        if (!this.getHighSpeedVideoFpsRanges.add(url.toExternalForm())) {
            return false;
        }
        try {
            inputStream = url.openStream();
            try {
                boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                return highSpeedVideoFpsRangesFor;
            } catch (java.lang.Throwable th) {
                th = th;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private boolean getHighSpeedVideoFpsRangesFor(java.io.InputStream inputStream) throws java.io.IOException, java.io.StreamCorruptedException {
        boolean z = false;
        for (org.threeten.bp.zone.TzdbZoneRulesProvider.Version version : Camera2StreamConfigurationMap(inputStream)) {
            org.threeten.bp.zone.TzdbZoneRulesProvider.Version putIfAbsent = this.getHighResolutionOutputSizeshNQ4ISI.putIfAbsent(version.Camera2StreamConfigurationMap, version);
            if (putIfAbsent != null && !putIfAbsent.Camera2StreamConfigurationMap.equals(version.Camera2StreamConfigurationMap)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Data already loaded for TZDB time-zone rules version: ");
                sb.append(version.Camera2StreamConfigurationMap);
                throw new org.threeten.bp.zone.ZoneRulesException(sb.toString());
            }
            z = true;
        }
        return z;
    }

    private java.lang.Iterable<org.threeten.bp.zone.TzdbZoneRulesProvider.Version> Camera2StreamConfigurationMap(java.io.InputStream inputStream) throws java.io.IOException, java.io.StreamCorruptedException {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
        if (dataInputStream.readByte() != 1) {
            throw new java.io.StreamCorruptedException("File format not recognised");
        }
        if (!"TZDB".equals(dataInputStream.readUTF())) {
            throw new java.io.StreamCorruptedException("File format not recognised");
        }
        int readShort = dataInputStream.readShort();
        java.lang.String[] strArr = new java.lang.String[readShort];
        for (int i = 0; i < readShort; i++) {
            strArr[i] = dataInputStream.readUTF();
        }
        int readShort2 = dataInputStream.readShort();
        java.lang.String[] strArr2 = new java.lang.String[readShort2];
        for (int i2 = 0; i2 < readShort2; i2++) {
            strArr2[i2] = dataInputStream.readUTF();
        }
        this.Camera2StreamConfigurationMap = java.util.Arrays.asList(strArr2);
        int readShort3 = dataInputStream.readShort();
        java.lang.Object[] objArr = new java.lang.Object[readShort3];
        for (int i3 = 0; i3 < readShort3; i3++) {
            byte[] bArr = new byte[dataInputStream.readShort()];
            dataInputStream.readFully(bArr);
            objArr[i3] = bArr;
        }
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = new java.util.concurrent.atomic.AtomicReferenceArray(objArr);
        java.util.HashSet hashSet = new java.util.HashSet(readShort);
        for (int i4 = 0; i4 < readShort; i4++) {
            int readShort4 = dataInputStream.readShort();
            java.lang.String[] strArr3 = new java.lang.String[readShort4];
            short[] sArr = new short[readShort4];
            for (int i5 = 0; i5 < readShort4; i5++) {
                strArr3[i5] = strArr2[dataInputStream.readShort()];
                sArr[i5] = dataInputStream.readShort();
            }
            hashSet.add(new org.threeten.bp.zone.TzdbZoneRulesProvider.Version(strArr[i4], strArr3, sArr, atomicReferenceArray));
        }
        return hashSet;
    }

    public final java.lang.String toString() {
        return "TZDB";
    }

    static class Version {
        private final java.lang.String Camera2StreamConfigurationMap;
        private final java.lang.String[] getHighSpeedVideoFpsRanges;
        private final java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> getHighSpeedVideoFpsRangesFor;
        private final short[] getHighSpeedVideoSizes;

        Version(java.lang.String str, java.lang.String[] strArr, short[] sArr, java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray) {
            this.getHighSpeedVideoFpsRangesFor = atomicReferenceArray;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRanges = strArr;
            this.getHighSpeedVideoSizes = sArr;
        }

        final org.threeten.bp.zone.ZoneRules Camera2StreamConfigurationMap(java.lang.String str) {
            int binarySearch = java.util.Arrays.binarySearch(this.getHighSpeedVideoFpsRanges, str);
            if (binarySearch < 0) {
                return null;
            }
            try {
                short s = this.getHighSpeedVideoSizes[binarySearch];
                java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor.get(s);
                if (obj instanceof byte[]) {
                    obj = org.threeten.bp.zone.Ser.getHighSpeedVideoSizes(new java.io.DataInputStream(new java.io.ByteArrayInputStream((byte[]) obj)));
                    this.getHighSpeedVideoFpsRangesFor.set(s, obj);
                }
                return (org.threeten.bp.zone.ZoneRules) obj;
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid binary time-zone data: TZDB:");
                sb.append(str);
                sb.append(", version: ");
                sb.append(this.Camera2StreamConfigurationMap);
                throw new org.threeten.bp.zone.ZoneRulesException(sb.toString(), e);
            }
        }

        public java.lang.String toString() {
            return this.Camera2StreamConfigurationMap;
        }
    }
}
