package com.android.volley.toolbox;

/* loaded from: classes3.dex */
public class DiskBasedCache implements com.android.volley.Cache {
    private final com.android.volley.toolbox.DiskBasedCache.FileSupplier Camera2StreamConfigurationMap;
    private long getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Map<java.lang.String, com.android.volley.toolbox.DiskBasedCache.CacheHeader> getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public interface FileSupplier {
        java.io.File get();
    }

    public DiskBasedCache(final java.io.File file, int i) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap(16, 0.75f, true);
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        this.Camera2StreamConfigurationMap = new com.android.volley.toolbox.DiskBasedCache.FileSupplier() { // from class: com.android.volley.toolbox.DiskBasedCache.1
            @Override // com.android.volley.toolbox.DiskBasedCache.FileSupplier
            public java.io.File get() {
                return file;
            }
        };
        this.getHighSpeedVideoSizes = i;
    }

    public DiskBasedCache(com.android.volley.toolbox.DiskBasedCache.FileSupplier fileSupplier, int i) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap(16, 0.75f, true);
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        this.Camera2StreamConfigurationMap = fileSupplier;
        this.getHighSpeedVideoSizes = i;
    }

    public DiskBasedCache(java.io.File file) {
        this(file, 5242880);
    }

    public DiskBasedCache(com.android.volley.toolbox.DiskBasedCache.FileSupplier fileSupplier) {
        this(fileSupplier, 5242880);
    }

    @Override // com.android.volley.Cache
    public void clear() {
        synchronized (this) {
            java.io.File[] listFiles = this.Camera2StreamConfigurationMap.get().listFiles();
            if (listFiles != null) {
                for (java.io.File file : listFiles) {
                    file.delete();
                }
            }
            this.getHighSpeedVideoFpsRangesFor.clear();
            this.getHighResolutionOutputSizeshNQ4ISI = 0L;
            com.android.volley.VolleyLog.d("Cache cleared.", new java.lang.Object[0]);
        }
    }

    @Override // com.android.volley.Cache
    public com.android.volley.Cache.Entry get(java.lang.String str) {
        synchronized (this) {
            com.android.volley.toolbox.DiskBasedCache.CacheHeader cacheHeader = this.getHighSpeedVideoFpsRangesFor.get(str);
            if (cacheHeader == null) {
                return null;
            }
            java.io.File fileForKey = getFileForKey(str);
            try {
                com.android.volley.toolbox.DiskBasedCache.CountingInputStream countingInputStream = new com.android.volley.toolbox.DiskBasedCache.CountingInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(fileForKey)), fileForKey.length());
                try {
                    com.android.volley.toolbox.DiskBasedCache.CacheHeader highSpeedVideoFpsRangesFor = com.android.volley.toolbox.DiskBasedCache.CacheHeader.getHighSpeedVideoFpsRangesFor(countingInputStream);
                    if (!android.text.TextUtils.equals(str, highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor)) {
                        com.android.volley.VolleyLog.d("%s: key=%s, found=%s", fileForKey.getAbsolutePath(), str, highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor);
                        com.android.volley.toolbox.DiskBasedCache.CacheHeader remove = this.getHighSpeedVideoFpsRangesFor.remove(str);
                        if (remove != null) {
                            this.getHighResolutionOutputSizeshNQ4ISI -= remove.getInputSizeshNQ4ISI;
                        }
                        return null;
                    }
                    byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(countingInputStream, countingInputStream.getHighSpeedVideoFpsRangesFor - countingInputStream.getHighSpeedVideoSizes);
                    com.android.volley.Cache.Entry entry = new com.android.volley.Cache.Entry();
                    entry.data = Camera2StreamConfigurationMap;
                    entry.etag = cacheHeader.getHighSpeedVideoFpsRanges;
                    entry.serverDate = cacheHeader.getHighSpeedVideoSizes;
                    entry.lastModified = cacheHeader.getHighResolutionOutputSizeshNQ4ISI;
                    entry.ttl = cacheHeader.getInputFormats;
                    entry.softTtl = cacheHeader.getOutputFormats;
                    entry.responseHeaders = com.android.volley.toolbox.HttpHeaderParser.Camera2StreamConfigurationMap(cacheHeader.Camera2StreamConfigurationMap);
                    entry.allResponseHeaders = java.util.Collections.unmodifiableList(cacheHeader.Camera2StreamConfigurationMap);
                    return entry;
                } finally {
                    countingInputStream.close();
                }
            } catch (java.io.IOException e) {
                com.android.volley.VolleyLog.d("%s: %s", fileForKey.getAbsolutePath(), e.toString());
                remove(str);
                return null;
            }
        }
    }

    @Override // com.android.volley.Cache
    public void initialize() {
        synchronized (this) {
            java.io.File file = this.Camera2StreamConfigurationMap.get();
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    com.android.volley.VolleyLog.e("Unable to create cache dir %s", file.getAbsolutePath());
                }
                return;
            }
            java.io.File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (java.io.File file2 : listFiles) {
                try {
                    long length = file2.length();
                    com.android.volley.toolbox.DiskBasedCache.CountingInputStream countingInputStream = new com.android.volley.toolbox.DiskBasedCache.CountingInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(file2)), length);
                    try {
                        com.android.volley.toolbox.DiskBasedCache.CacheHeader highSpeedVideoFpsRangesFor = com.android.volley.toolbox.DiskBasedCache.CacheHeader.getHighSpeedVideoFpsRangesFor(countingInputStream);
                        highSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI = length;
                        getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor);
                        countingInputStream.close();
                    } catch (java.lang.Throwable th) {
                        countingInputStream.close();
                        throw th;
                    }
                } catch (java.io.IOException unused) {
                    file2.delete();
                }
            }
        }
    }

    @Override // com.android.volley.Cache
    public void invalidate(java.lang.String str, boolean z) {
        synchronized (this) {
            com.android.volley.Cache.Entry entry = get(str);
            if (entry != null) {
                entry.softTtl = 0L;
                if (z) {
                    entry.ttl = 0L;
                }
                put(str, entry);
            }
        }
    }

    @Override // com.android.volley.Cache
    public void put(java.lang.String str, com.android.volley.Cache.Entry entry) {
        java.io.BufferedOutputStream bufferedOutputStream;
        com.android.volley.toolbox.DiskBasedCache.CacheHeader cacheHeader;
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI + entry.data.length <= this.getHighSpeedVideoSizes || entry.data.length <= this.getHighSpeedVideoSizes * 0.9f) {
                java.io.File fileForKey = getFileForKey(str);
                try {
                    bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(fileForKey));
                    cacheHeader = new com.android.volley.toolbox.DiskBasedCache.CacheHeader(str, entry);
                } catch (java.io.IOException unused) {
                    if (!fileForKey.delete()) {
                        com.android.volley.VolleyLog.d("Could not clean up file %s", fileForKey.getAbsolutePath());
                    }
                    if (!this.Camera2StreamConfigurationMap.get().exists()) {
                        com.android.volley.VolleyLog.d("Re-initializing cache after external clearing.", new java.lang.Object[0]);
                        this.getHighSpeedVideoFpsRangesFor.clear();
                        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
                        initialize();
                    }
                }
                if (!cacheHeader.getHighSpeedVideoFpsRangesFor(bufferedOutputStream)) {
                    bufferedOutputStream.close();
                    com.android.volley.VolleyLog.d("Failed to write header for %s", fileForKey.getAbsolutePath());
                    throw new java.io.IOException();
                }
                bufferedOutputStream.write(entry.data);
                bufferedOutputStream.close();
                cacheHeader.getInputSizeshNQ4ISI = fileForKey.length();
                getHighSpeedVideoSizes(str, cacheHeader);
                if (this.getHighResolutionOutputSizeshNQ4ISI >= this.getHighSpeedVideoSizes) {
                    if (com.android.volley.VolleyLog.DEBUG) {
                        com.android.volley.VolleyLog.v("Pruning old cache entries.", new java.lang.Object[0]);
                    }
                    long j = this.getHighResolutionOutputSizeshNQ4ISI;
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    java.util.Iterator<java.util.Map.Entry<java.lang.String, com.android.volley.toolbox.DiskBasedCache.CacheHeader>> it = this.getHighSpeedVideoFpsRangesFor.entrySet().iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        com.android.volley.toolbox.DiskBasedCache.CacheHeader value = it.next().getValue();
                        if (getFileForKey(value.getHighSpeedVideoFpsRangesFor).delete()) {
                            this.getHighResolutionOutputSizeshNQ4ISI -= value.getInputSizeshNQ4ISI;
                        } else {
                            com.android.volley.VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", value.getHighSpeedVideoFpsRangesFor, getHighResolutionOutputSizeshNQ4ISI(value.getHighSpeedVideoFpsRangesFor));
                        }
                        it.remove();
                        i++;
                        if (this.getHighResolutionOutputSizeshNQ4ISI < this.getHighSpeedVideoSizes * 0.9f) {
                            break;
                        }
                    }
                    if (com.android.volley.VolleyLog.DEBUG) {
                        com.android.volley.VolleyLog.v("pruned %d files, %d bytes, %d ms", java.lang.Integer.valueOf(i), java.lang.Long.valueOf(this.getHighResolutionOutputSizeshNQ4ISI - j), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                    }
                }
            }
        }
    }

    @Override // com.android.volley.Cache
    public void remove(java.lang.String str) {
        synchronized (this) {
            boolean delete = getFileForKey(str).delete();
            com.android.volley.toolbox.DiskBasedCache.CacheHeader remove = this.getHighSpeedVideoFpsRangesFor.remove(str);
            if (remove != null) {
                this.getHighResolutionOutputSizeshNQ4ISI -= remove.getInputSizeshNQ4ISI;
            }
            if (!delete) {
                com.android.volley.VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", str, getHighResolutionOutputSizeshNQ4ISI(str));
            }
        }
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        int length = str.length() / 2;
        int hashCode = str.substring(0, length).hashCode();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.String.valueOf(hashCode));
        sb.append(java.lang.String.valueOf(str.substring(length).hashCode()));
        return sb.toString();
    }

    public java.io.File getFileForKey(java.lang.String str) {
        return new java.io.File(this.Camera2StreamConfigurationMap.get(), getHighResolutionOutputSizeshNQ4ISI(str));
    }

    private void getHighSpeedVideoSizes(java.lang.String str, com.android.volley.toolbox.DiskBasedCache.CacheHeader cacheHeader) {
        if (!this.getHighSpeedVideoFpsRangesFor.containsKey(str)) {
            this.getHighResolutionOutputSizeshNQ4ISI += cacheHeader.getInputSizeshNQ4ISI;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI += cacheHeader.getInputSizeshNQ4ISI - this.getHighSpeedVideoFpsRangesFor.get(str).getInputSizeshNQ4ISI;
        }
        this.getHighSpeedVideoFpsRangesFor.put(str, cacheHeader);
    }

    static class CacheHeader {
        final java.util.List<com.android.volley.Header> Camera2StreamConfigurationMap;
        final long getHighResolutionOutputSizeshNQ4ISI;
        final java.lang.String getHighSpeedVideoFpsRanges;
        final java.lang.String getHighSpeedVideoFpsRangesFor;
        final long getHighSpeedVideoSizes;
        final long getInputFormats;
        long getInputSizeshNQ4ISI;
        final long getOutputFormats;

        private CacheHeader(java.lang.String str, java.lang.String str2, long j, long j2, long j3, long j4, java.util.List<com.android.volley.Header> list) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoFpsRanges = "".equals(str2) ? null : str2;
            this.getHighSpeedVideoSizes = j;
            this.getHighResolutionOutputSizeshNQ4ISI = j2;
            this.getInputFormats = j3;
            this.getOutputFormats = j4;
            this.Camera2StreamConfigurationMap = list;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        CacheHeader(java.lang.String str, com.android.volley.Cache.Entry entry) {
            this(str, r2, r3, r5, r7, r9, r14);
            java.util.List<com.android.volley.Header> highSpeedVideoFpsRanges;
            java.lang.String str2 = entry.etag;
            long j = entry.serverDate;
            long j2 = entry.lastModified;
            long j3 = entry.ttl;
            long j4 = entry.softTtl;
            if (entry.allResponseHeaders != null) {
                highSpeedVideoFpsRanges = entry.allResponseHeaders;
            } else {
                highSpeedVideoFpsRanges = com.android.volley.toolbox.HttpHeaderParser.getHighSpeedVideoFpsRanges(entry.responseHeaders);
            }
        }

        static com.android.volley.toolbox.DiskBasedCache.CacheHeader getHighSpeedVideoFpsRangesFor(com.android.volley.toolbox.DiskBasedCache.CountingInputStream countingInputStream) throws java.io.IOException {
            if (com.android.volley.toolbox.DiskBasedCache.getHighSpeedVideoFpsRangesFor((java.io.InputStream) countingInputStream) != 538247942) {
                throw new java.io.IOException();
            }
            return new com.android.volley.toolbox.DiskBasedCache.CacheHeader(com.android.volley.toolbox.DiskBasedCache.getHighSpeedVideoFpsRanges(countingInputStream), com.android.volley.toolbox.DiskBasedCache.getHighSpeedVideoFpsRanges(countingInputStream), com.android.volley.toolbox.DiskBasedCache.getHighResolutionOutputSizeshNQ4ISI(countingInputStream), com.android.volley.toolbox.DiskBasedCache.getHighResolutionOutputSizeshNQ4ISI(countingInputStream), com.android.volley.toolbox.DiskBasedCache.getHighResolutionOutputSizeshNQ4ISI(countingInputStream), com.android.volley.toolbox.DiskBasedCache.getHighResolutionOutputSizeshNQ4ISI(countingInputStream), com.android.volley.toolbox.DiskBasedCache.getHighSpeedVideoFpsRangesFor(countingInputStream));
        }

        final boolean getHighSpeedVideoFpsRangesFor(java.io.OutputStream outputStream) {
            try {
                com.android.volley.toolbox.DiskBasedCache.getHighSpeedVideoFpsRanges(outputStream, 538247942);
                com.android.volley.toolbox.DiskBasedCache.getHighSpeedVideoFpsRangesFor(outputStream, this.getHighSpeedVideoFpsRangesFor);
                java.lang.String str = this.getHighSpeedVideoFpsRanges;
                if (str == null) {
                    str = "";
                }
                com.android.volley.toolbox.DiskBasedCache.getHighSpeedVideoFpsRangesFor(outputStream, str);
                com.android.volley.toolbox.DiskBasedCache.Camera2StreamConfigurationMap(outputStream, this.getHighSpeedVideoSizes);
                com.android.volley.toolbox.DiskBasedCache.Camera2StreamConfigurationMap(outputStream, this.getHighResolutionOutputSizeshNQ4ISI);
                com.android.volley.toolbox.DiskBasedCache.Camera2StreamConfigurationMap(outputStream, this.getInputFormats);
                com.android.volley.toolbox.DiskBasedCache.Camera2StreamConfigurationMap(outputStream, this.getOutputFormats);
                com.android.volley.toolbox.DiskBasedCache.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, outputStream);
                outputStream.flush();
                return true;
            } catch (java.io.IOException e) {
                com.android.volley.VolleyLog.d("%s", e.toString());
                return false;
            }
        }
    }

    static class CountingInputStream extends java.io.FilterInputStream {
        final long getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizes;

        CountingInputStream(java.io.InputStream inputStream, long j) {
            super(inputStream);
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws java.io.IOException {
            int read = super.read();
            if (read != -1) {
                this.getHighSpeedVideoSizes++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.getHighSpeedVideoSizes += read;
            }
            return read;
        }
    }

    static void getHighSpeedVideoFpsRanges(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void Camera2StreamConfigurationMap(java.io.OutputStream outputStream, long j) throws java.io.IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void getHighSpeedVideoFpsRangesFor(java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        byte[] bytes = str.getBytes("UTF-8");
        Camera2StreamConfigurationMap(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    static java.lang.String getHighSpeedVideoFpsRanges(com.android.volley.toolbox.DiskBasedCache.CountingInputStream countingInputStream) throws java.io.IOException {
        return new java.lang.String(Camera2StreamConfigurationMap(countingInputStream, getHighResolutionOutputSizeshNQ4ISI(countingInputStream)), "UTF-8");
    }

    static void Camera2StreamConfigurationMap(java.util.List<com.android.volley.Header> list, java.io.OutputStream outputStream) throws java.io.IOException {
        if (list != null) {
            getHighSpeedVideoFpsRanges(outputStream, list.size());
            for (com.android.volley.Header header : list) {
                byte[] bytes = header.getName().getBytes("UTF-8");
                Camera2StreamConfigurationMap(outputStream, bytes.length);
                outputStream.write(bytes, 0, bytes.length);
                byte[] bytes2 = header.getValue().getBytes("UTF-8");
                Camera2StreamConfigurationMap(outputStream, bytes2.length);
                outputStream.write(bytes2, 0, bytes2.length);
            }
            return;
        }
        getHighSpeedVideoFpsRanges(outputStream, 0);
    }

    static java.util.List<com.android.volley.Header> getHighSpeedVideoFpsRangesFor(com.android.volley.toolbox.DiskBasedCache.CountingInputStream countingInputStream) throws java.io.IOException {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((java.io.InputStream) countingInputStream);
        if (highSpeedVideoFpsRangesFor < 0) {
            throw new java.io.IOException("readHeaderList size=".concat(java.lang.String.valueOf(highSpeedVideoFpsRangesFor)));
        }
        java.util.List<com.android.volley.Header> emptyList = highSpeedVideoFpsRangesFor == 0 ? java.util.Collections.emptyList() : new java.util.ArrayList<>();
        for (int i = 0; i < highSpeedVideoFpsRangesFor; i++) {
            emptyList.add(new com.android.volley.Header(new java.lang.String(Camera2StreamConfigurationMap(countingInputStream, getHighResolutionOutputSizeshNQ4ISI(countingInputStream)), "UTF-8").intern(), new java.lang.String(Camera2StreamConfigurationMap(countingInputStream, getHighResolutionOutputSizeshNQ4ISI(countingInputStream)), "UTF-8").intern()));
        }
        return emptyList;
    }

    static int getHighSpeedVideoFpsRangesFor(java.io.InputStream inputStream) throws java.io.IOException {
        int read = inputStream.read();
        if (read == -1) {
            throw new java.io.EOFException();
        }
        int read2 = inputStream.read();
        if (read2 == -1) {
            throw new java.io.EOFException();
        }
        int read3 = inputStream.read();
        if (read3 == -1) {
            throw new java.io.EOFException();
        }
        int read4 = inputStream.read();
        if (read4 != -1) {
            return (read4 << 24) | read | (read2 << 8) | (read3 << 16);
        }
        throw new java.io.EOFException();
    }

    static long getHighResolutionOutputSizeshNQ4ISI(java.io.InputStream inputStream) throws java.io.IOException {
        int read = inputStream.read();
        if (read == -1) {
            throw new java.io.EOFException();
        }
        long j = read;
        int read2 = inputStream.read();
        if (read2 == -1) {
            throw new java.io.EOFException();
        }
        long j2 = read2;
        int read3 = inputStream.read();
        if (read3 == -1) {
            throw new java.io.EOFException();
        }
        long j3 = read3;
        int read4 = inputStream.read();
        if (read4 == -1) {
            throw new java.io.EOFException();
        }
        long j4 = read4;
        int read5 = inputStream.read();
        if (read5 == -1) {
            throw new java.io.EOFException();
        }
        long j5 = read5;
        int read6 = inputStream.read();
        if (read6 == -1) {
            throw new java.io.EOFException();
        }
        long j6 = read6;
        int read7 = inputStream.read();
        if (read7 == -1) {
            throw new java.io.EOFException();
        }
        long j7 = (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((read7 & 255) << 48);
        int read8 = inputStream.read();
        if (read8 != -1) {
            return ((read8 & 255) << 56) | j7;
        }
        throw new java.io.EOFException();
    }

    private static byte[] Camera2StreamConfigurationMap(com.android.volley.toolbox.DiskBasedCache.CountingInputStream countingInputStream, long j) throws java.io.IOException {
        long j2 = countingInputStream.getHighSpeedVideoFpsRangesFor - countingInputStream.getHighSpeedVideoSizes;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new java.io.DataInputStream(countingInputStream).readFully(bArr);
                return bArr;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(j2);
        throw new java.io.IOException(sb.toString());
    }
}
