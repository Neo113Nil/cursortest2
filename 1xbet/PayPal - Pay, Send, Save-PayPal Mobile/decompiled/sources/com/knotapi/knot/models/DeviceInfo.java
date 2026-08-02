package com.knotapi.knot.models;

/* loaded from: classes9.dex */
public class DeviceInfo {
    long availableMemory;
    long freeSpace;
    long totalMemory;
    long totalSpace;
    long usedSpace;
    java.lang.String manufacturer = android.os.Build.MANUFACTURER;
    java.lang.String model = android.os.Build.MODEL;
    java.lang.String deviceName = android.os.Build.DEVICE;
    int sdkVersion = android.os.Build.VERSION.SDK_INT;
    java.lang.String releaseVersion = android.os.Build.VERSION.RELEASE;
    java.lang.String hardware = android.os.Build.HARDWARE;

    public DeviceInfo(android.content.Context context) {
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        this.totalMemory = memoryInfo.totalMem;
        this.availableMemory = memoryInfo.availMem;
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getAbsolutePath());
        this.totalSpace = statFs.getTotalBytes();
        long freeBytes = statFs.getFreeBytes();
        this.freeSpace = freeBytes;
        this.usedSpace = this.totalSpace - freeBytes;
    }

    public java.lang.String toJson() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{\"manufacturer\":\"");
        sb.append(this.manufacturer);
        sb.append("\", \"model\":\"");
        sb.append(this.model);
        sb.append("\", \"deviceName\":\"");
        sb.append(this.deviceName);
        sb.append("\", \"sdkVersion\":");
        sb.append(this.sdkVersion);
        sb.append(", \"releaseVersion\":\"");
        sb.append(this.releaseVersion);
        sb.append("\", \"hardware\":\"");
        sb.append(this.hardware);
        sb.append("\", \"totalMemory\":");
        sb.append(this.totalMemory);
        sb.append(", \"availableMemory\":");
        sb.append(this.availableMemory);
        sb.append(", \"totalSpace\":");
        sb.append(this.totalSpace);
        sb.append(", \"freeSpace\":");
        sb.append(this.freeSpace);
        sb.append(", \"usedSpace\":");
        sb.append(this.usedSpace);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
