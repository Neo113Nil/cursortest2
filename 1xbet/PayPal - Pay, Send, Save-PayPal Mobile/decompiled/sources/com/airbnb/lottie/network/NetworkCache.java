package com.airbnb.lottie.network;

/* loaded from: classes7.dex */
public class NetworkCache {
    private final com.airbnb.lottie.network.LottieNetworkCacheProvider Camera2StreamConfigurationMap;

    public NetworkCache(com.airbnb.lottie.network.LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        this.Camera2StreamConfigurationMap = lottieNetworkCacheProvider;
    }

    public void clear() {
        java.io.File highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes.exists()) {
            java.io.File[] listFiles = highSpeedVideoSizes.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (java.io.File file : listFiles) {
                    file.delete();
                }
            }
            highSpeedVideoSizes.delete();
        }
    }

    final java.io.File getHighSpeedVideoFpsRanges(java.lang.String str, java.io.InputStream inputStream, com.airbnb.lottie.network.FileExtension fileExtension) throws java.io.IOException {
        java.io.File file = new java.io.File(getHighSpeedVideoSizes(), getHighSpeedVideoSizes(str, fileExtension, true));
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    final java.io.File getHighSpeedVideoSizes() {
        java.io.File cacheDir = this.Camera2StreamConfigurationMap.getCacheDir();
        if (cacheDir.isFile()) {
            cacheDir.delete();
        }
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        return cacheDir;
    }

    static java.lang.String getHighSpeedVideoSizes(java.lang.String str, com.airbnb.lottie.network.FileExtension fileExtension, boolean z) {
        java.lang.String tempExtension = z ? fileExtension.tempExtension() : fileExtension.extension;
        java.lang.String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - tempExtension.length();
        if (replaceAll.length() > length) {
            replaceAll = getHighSpeedVideoFpsRanges(replaceAll, length);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("lottie_cache_");
        sb.append(replaceAll);
        sb.append(tempExtension);
        return sb.toString();
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, int i) {
        try {
            byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(str.getBytes());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (byte b : digest) {
                sb.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException unused) {
            return str.substring(0, i);
        }
    }

    final android.util.Pair<com.airbnb.lottie.network.FileExtension, java.io.InputStream> Camera2StreamConfigurationMap(java.lang.String str) {
        com.airbnb.lottie.network.FileExtension fileExtension;
        try {
            java.io.File file = new java.io.File(getHighSpeedVideoSizes(), getHighSpeedVideoSizes(str, com.airbnb.lottie.network.FileExtension.JSON, false));
            if (!file.exists()) {
                file = new java.io.File(getHighSpeedVideoSizes(), getHighSpeedVideoSizes(str, com.airbnb.lottie.network.FileExtension.ZIP, false));
                if (!file.exists()) {
                    file = new java.io.File(getHighSpeedVideoSizes(), getHighSpeedVideoSizes(str, com.airbnb.lottie.network.FileExtension.GZIP, false));
                    if (!file.exists()) {
                        file = null;
                    }
                }
            }
            if (file == null) {
                return null;
            }
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            if (file.getAbsolutePath().endsWith(".zip")) {
                fileExtension = com.airbnb.lottie.network.FileExtension.ZIP;
            } else if (file.getAbsolutePath().endsWith(".gz")) {
                fileExtension = com.airbnb.lottie.network.FileExtension.GZIP;
            } else {
                fileExtension = com.airbnb.lottie.network.FileExtension.JSON;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cache hit for ");
            sb.append(str);
            sb.append(" at ");
            sb.append(file.getAbsolutePath());
            com.airbnb.lottie.utils.Logger.debug(sb.toString());
            return new android.util.Pair<>(fileExtension, fileInputStream);
        } catch (java.io.FileNotFoundException unused) {
            return null;
        }
    }
}
