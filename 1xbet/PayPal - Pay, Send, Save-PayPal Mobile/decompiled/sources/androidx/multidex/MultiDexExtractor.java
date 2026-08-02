package androidx.multidex;

/* loaded from: classes7.dex */
final class MultiDexExtractor implements java.io.Closeable {
    private final java.io.File Camera2StreamConfigurationMap;
    private final java.io.RandomAccessFile getHighResolutionOutputSizeshNQ4ISI;
    private final java.io.File getHighSpeedVideoFpsRanges;
    private final java.nio.channels.FileLock getHighSpeedVideoFpsRangesFor;
    private final java.nio.channels.FileChannel getHighSpeedVideoSizes;
    private final long getInputSizeshNQ4ISI;

    static class ExtractedDex extends java.io.File {
        public long Camera2StreamConfigurationMap;

        public ExtractedDex(java.io.File file, java.lang.String str) {
            super(file, str);
            this.Camera2StreamConfigurationMap = -1L;
        }
    }

    MultiDexExtractor(java.io.File file, java.io.File file2) throws java.io.IOException {
        file.getPath();
        file2.getPath();
        this.Camera2StreamConfigurationMap = file;
        this.getHighSpeedVideoFpsRanges = file2;
        long Camera2StreamConfigurationMap = androidx.multidex.ZipUtil.Camera2StreamConfigurationMap(file);
        this.getInputSizeshNQ4ISI = Camera2StreamConfigurationMap == -1 ? Camera2StreamConfigurationMap - 1 : Camera2StreamConfigurationMap;
        java.io.File file3 = new java.io.File(file2, "MultiDex.lock");
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file3, "rw");
        this.getHighResolutionOutputSizeshNQ4ISI = randomAccessFile;
        try {
            try {
                java.nio.channels.FileChannel channel = randomAccessFile.getChannel();
                this.getHighSpeedVideoSizes = channel;
                try {
                    file3.getPath();
                    this.getHighSpeedVideoFpsRangesFor = channel.lock();
                    file3.getPath();
                } catch (java.io.IOException e) {
                    e = e;
                    try {
                        this.getHighSpeedVideoSizes.close();
                    } catch (java.io.IOException unused) {
                    }
                    throw e;
                } catch (java.lang.Error e2) {
                    e = e2;
                    this.getHighSpeedVideoSizes.close();
                    throw e;
                } catch (java.lang.RuntimeException e3) {
                    e = e3;
                    this.getHighSpeedVideoSizes.close();
                    throw e;
                }
            } catch (java.io.IOException e4) {
                e = e4;
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.close();
                } catch (java.io.IOException unused2) {
                }
                throw e;
            }
        } catch (java.lang.Error e5) {
            e = e5;
            this.getHighResolutionOutputSizeshNQ4ISI.close();
            throw e;
        } catch (java.lang.RuntimeException e6) {
            e = e6;
            this.getHighResolutionOutputSizeshNQ4ISI.close();
            throw e;
        }
    }

    final java.util.List<? extends java.io.File> getHighSpeedVideoFpsRangesFor(android.content.Context context, java.lang.String str, boolean z) throws java.io.IOException {
        java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> highSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap.getPath();
        if (!this.getHighSpeedVideoFpsRangesFor.isValid()) {
            throw new java.lang.IllegalStateException("MultiDexExtractor was closed");
        }
        long j = 1;
        long j2 = -1;
        if (!z) {
            java.io.File file = this.Camera2StreamConfigurationMap;
            long j3 = this.getInputSizeshNQ4ISI;
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append("timestamp");
            long j4 = sharedPreferences.getLong(sb.toString(), -1L);
            long lastModified = file.lastModified();
            if (lastModified == -1) {
                lastModified--;
            }
            if (j4 == lastModified) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append("crc");
                if (sharedPreferences.getLong(sb2.toString(), -1L) == j3) {
                    try {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(this.Camera2StreamConfigurationMap.getName());
                        sb3.append(".classes");
                        java.lang.String obj = sb3.toString();
                        android.content.SharedPreferences sharedPreferences2 = context.getSharedPreferences("multidex.version", 4);
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(str);
                        sb4.append("dex.number");
                        int i = sharedPreferences2.getInt(sb4.toString(), 1);
                        highSpeedVideoFpsRangesFor = new java.util.ArrayList<>(i - 1);
                        int i2 = 2;
                        while (i2 <= i) {
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            sb5.append(obj);
                            sb5.append(i2);
                            sb5.append(".zip");
                            androidx.multidex.MultiDexExtractor.ExtractedDex extractedDex = new androidx.multidex.MultiDexExtractor.ExtractedDex(this.getHighSpeedVideoFpsRanges, sb5.toString());
                            if (!extractedDex.isFile()) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Missing extracted secondary dex file '");
                                sb6.append(extractedDex.getPath());
                                sb6.append("'");
                                throw new java.io.IOException(sb6.toString());
                            }
                            long Camera2StreamConfigurationMap = androidx.multidex.ZipUtil.Camera2StreamConfigurationMap(extractedDex);
                            if (Camera2StreamConfigurationMap == j2) {
                                Camera2StreamConfigurationMap -= j;
                            }
                            extractedDex.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap;
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            sb7.append(str);
                            sb7.append("dex.crc.");
                            sb7.append(i2);
                            long j5 = sharedPreferences2.getLong(sb7.toString(), j2);
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                            sb8.append(str);
                            sb8.append("dex.time.");
                            sb8.append(i2);
                            long j6 = sharedPreferences2.getLong(sb8.toString(), j2);
                            long lastModified2 = extractedDex.lastModified();
                            if (j6 == lastModified2) {
                                java.lang.String str2 = obj;
                                android.content.SharedPreferences sharedPreferences3 = sharedPreferences2;
                                if (j5 == extractedDex.Camera2StreamConfigurationMap) {
                                    highSpeedVideoFpsRangesFor.add(extractedDex);
                                    i2++;
                                    obj = str2;
                                    sharedPreferences2 = sharedPreferences3;
                                    j = 1;
                                    j2 = -1;
                                }
                            }
                            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Invalid extracted dex: ");
                            sb9.append(extractedDex);
                            sb9.append(" (key \"");
                            sb9.append(str);
                            sb9.append("\"), expected modification time: ");
                            sb9.append(j6);
                            sb9.append(", modification time: ");
                            sb9.append(lastModified2);
                            sb9.append(", expected crc: ");
                            sb9.append(j5);
                            sb9.append(", file crc: ");
                            sb9.append(extractedDex.Camera2StreamConfigurationMap);
                            throw new java.io.IOException(sb9.toString());
                        }
                    } catch (java.io.IOException unused) {
                        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                        long lastModified3 = this.Camera2StreamConfigurationMap.lastModified();
                        if (lastModified3 == -1) {
                            lastModified3--;
                        }
                        getHighSpeedVideoFpsRanges(context, str, lastModified3, this.getInputSizeshNQ4ISI, highSpeedVideoFpsRangesFor);
                    }
                    highSpeedVideoFpsRangesFor.size();
                    return highSpeedVideoFpsRangesFor;
                }
            }
        }
        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        long lastModified4 = this.Camera2StreamConfigurationMap.lastModified();
        if (lastModified4 == -1) {
            lastModified4--;
        }
        getHighSpeedVideoFpsRanges(context, str, lastModified4, this.getInputSizeshNQ4ISI, highSpeedVideoFpsRangesFor);
        highSpeedVideoFpsRangesFor.size();
        return highSpeedVideoFpsRangesFor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor.release();
        this.getHighSpeedVideoSizes.close();
        this.getHighResolutionOutputSizeshNQ4ISI.close();
    }

    private java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap.getName());
        sb.append(".classes");
        java.lang.String obj = sb.toString();
        java.io.File[] listFiles = this.getHighSpeedVideoFpsRanges.listFiles(new java.io.FileFilter() { // from class: androidx.multidex.MultiDexExtractor.1
            @Override // java.io.FileFilter
            public boolean accept(java.io.File file) {
                return !file.getName().equals("MultiDex.lock");
            }
        });
        if (listFiles == null) {
            this.getHighSpeedVideoFpsRanges.getPath();
        } else {
            for (java.io.File file : listFiles) {
                file.getPath();
                file.length();
                if (!file.delete()) {
                    file.getPath();
                } else {
                    file.getPath();
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(this.Camera2StreamConfigurationMap);
        try {
            java.util.zip.ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i = 2;
            while (entry != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(obj);
                sb2.append(i);
                sb2.append(".zip");
                androidx.multidex.MultiDexExtractor.ExtractedDex extractedDex = new androidx.multidex.MultiDexExtractor.ExtractedDex(this.getHighSpeedVideoFpsRanges, sb2.toString());
                arrayList.add(extractedDex);
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    java.io.InputStream inputStream = zipFile.getInputStream(entry);
                    java.io.File createTempFile = java.io.File.createTempFile("tmp-".concat(java.lang.String.valueOf(obj)), ".zip", extractedDex.getParentFile());
                    createTempFile.getPath();
                    try {
                        java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(createTempFile)));
                        try {
                            java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry("classes.dex");
                            zipEntry.setTime(entry.getTime());
                            zipOutputStream.putNextEntry(zipEntry);
                            byte[] bArr = new byte[16384];
                            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                                zipOutputStream.write(bArr, 0, read);
                            }
                            zipOutputStream.closeEntry();
                            zipOutputStream.close();
                            if (!createTempFile.setReadOnly()) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                sb3.append("Failed to mark readonly \"");
                                sb3.append(createTempFile.getAbsolutePath());
                                sb3.append("\" (tmp of \"");
                                sb3.append(extractedDex.getAbsolutePath());
                                sb3.append("\")");
                                throw new java.io.IOException(sb3.toString());
                            }
                            extractedDex.getPath();
                            if (!createTempFile.renameTo(extractedDex)) {
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                sb4.append("Failed to rename \"");
                                sb4.append(createTempFile.getAbsolutePath());
                                sb4.append("\" to \"");
                                sb4.append(extractedDex.getAbsolutePath());
                                sb4.append("\"");
                                throw new java.io.IOException(sb4.toString());
                            }
                            try {
                                long Camera2StreamConfigurationMap = androidx.multidex.ZipUtil.Camera2StreamConfigurationMap(extractedDex);
                                if (Camera2StreamConfigurationMap == -1) {
                                    Camera2StreamConfigurationMap--;
                                }
                                extractedDex.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap;
                                z = true;
                            } catch (java.io.IOException unused) {
                                extractedDex.getAbsolutePath();
                                z = false;
                            }
                            extractedDex.getAbsolutePath();
                            extractedDex.length();
                            long j = extractedDex.Camera2StreamConfigurationMap;
                            if (!z) {
                                extractedDex.delete();
                                if (extractedDex.exists()) {
                                    extractedDex.getPath();
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            zipOutputStream.close();
                            throw th;
                        }
                    } finally {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException unused2) {
                        }
                        createTempFile.delete();
                    }
                }
                if (!z) {
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    sb5.append("Could not create zip file ");
                    sb5.append(extractedDex.getAbsolutePath());
                    sb5.append(" for secondary dex (");
                    sb5.append(i);
                    sb5.append(")");
                    throw new java.io.IOException(sb5.toString());
                }
                i++;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("classes");
                sb6.append(i);
                sb6.append(".dex");
                entry = zipFile.getEntry(sb6.toString());
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (java.io.IOException unused3) {
            }
        }
    }

    private static void getHighSpeedVideoFpsRanges(android.content.Context context, java.lang.String str, long j, long j2, java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> list) {
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("timestamp");
        edit.putLong(sb.toString(), j);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append("crc");
        edit.putLong(sb2.toString(), j2);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append("dex.number");
        edit.putInt(sb3.toString(), list.size() + 1);
        int i = 2;
        for (androidx.multidex.MultiDexExtractor.ExtractedDex extractedDex : list) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("dex.crc.");
            sb4.append(i);
            edit.putLong(sb4.toString(), extractedDex.Camera2StreamConfigurationMap);
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("dex.time.");
            sb5.append(i);
            edit.putLong(sb5.toString(), extractedDex.lastModified());
            i++;
        }
        edit.commit();
    }
}
