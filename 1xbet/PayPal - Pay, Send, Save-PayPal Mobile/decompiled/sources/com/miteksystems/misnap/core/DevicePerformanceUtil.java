package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001f"}, d2 = {"Lcom/miteksystems/misnap/core/DevicePerformanceUtil;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "reCalculate", "Lcom/miteksystems/misnap/core/DevicePerformanceUtil$PerformanceTier;", "getCurrentDevicePerformanceTier", "(Landroid/content/Context;Z)Lcom/miteksystems/misnap/core/DevicePerformanceUtil$PerformanceTier;", "calculateCurrentDevicePerformanceTier$core_release", "(Landroid/content/Context;)Lcom/miteksystems/misnap/core/DevicePerformanceUtil$PerformanceTier;", "", "androidVersion", "avgCpuFreq", "cpuCount", "memoryClass", "", "ram", "socHash", "computeDeviceTier$core_release", "(IIIIJLjava/lang/Integer;)Lcom/miteksystems/misnap/core/DevicePerformanceUtil$PerformanceTier;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "parseCpuFreqFromLine$core_release", "(Ljava/lang/CharSequence;)I", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/miteksystems/misnap/core/DevicePerformanceUtil$PerformanceTier;", "getHighSpeedVideoFpsRanges", "", "[I", "getHighSpeedVideoFpsRangesFor", "PerformanceTier"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class DevicePerformanceUtil {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier getHighSpeedVideoFpsRanges;
    public static final com.miteksystems.misnap.core.DevicePerformanceUtil INSTANCE = new com.miteksystems.misnap.core.DevicePerformanceUtil();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final int[] getHighSpeedVideoFpsRangesFor = {-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\tR\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/miteksystems/misnap/core/DevicePerformanceUtil$PerformanceTier;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "other", "", "isGreaterThan", "(Lcom/miteksystems/misnap/core/DevicePerformanceUtil$PerformanceTier;)Z", "isLowerThan", "a", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "LOW", "MEDIUM", "HIGH"}, k = 1, mv = {1, 8, 0})
    public enum PerformanceTier {
        LOW(1),
        MEDIUM(2),
        HIGH(3);


        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        public final boolean isLowerThan(com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier other) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
            return this.value < other.value;
        }

        public final boolean isGreaterThan(com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier other) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
            return this.value > other.value;
        }

        public final int getValue() {
            return this.value;
        }

        PerformanceTier(int i) {
            this.value = i;
        }
    }

    public final /* synthetic */ int parseCpuFreqFromLine$core_release(java.lang.CharSequence value) {
        java.lang.Object m23436constructorimpl;
        if (value == null) {
            return 0;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(new kotlin.text.Regex("[0-9-]+"), value, 0, 2, null);
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Integer.valueOf(find$default != null ? java.lang.Integer.parseInt(find$default.getValue()) : 0));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
            m23436constructorimpl = 0;
        }
        return ((java.lang.Number) m23436constructorimpl).intValue();
    }

    public final com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier getCurrentDevicePerformanceTier(android.content.Context context, boolean reCalculate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (reCalculate) {
            getHighSpeedVideoFpsRanges = null;
        }
        com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier performanceTier = getHighSpeedVideoFpsRanges;
        if (performanceTier != null) {
            return performanceTier;
        }
        com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier calculateCurrentDevicePerformanceTier$core_release = calculateCurrentDevicePerformanceTier$core_release(context);
        getHighSpeedVideoFpsRanges = calculateCurrentDevicePerformanceTier$core_release;
        return calculateCurrentDevicePerformanceTier$core_release;
    }

    public final /* synthetic */ com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier computeDeviceTier$core_release(int androidVersion, int avgCpuFreq, int cpuCount, int memoryClass, long ram, java.lang.Integer socHash) {
        java.lang.Integer num;
        if (socHash != null) {
            int[] iArr = getHighSpeedVideoFpsRangesFor;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    num = null;
                    break;
                }
                int i2 = iArr[i];
                if (i2 == socHash.intValue()) {
                    num = java.lang.Integer.valueOf(i2);
                    break;
                }
                i++;
            }
            if (num != null) {
                return com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier.LOW;
            }
        }
        return (androidVersion < 25 || cpuCount <= 2 || memoryClass <= 100 || (ram != -1 && ram < 2147483648L) || ((cpuCount <= 4 && avgCpuFreq != -1 && avgCpuFreq <= 1250) || ((cpuCount <= 4 && avgCpuFreq <= 1600 && memoryClass <= 128 && androidVersion <= 25) || (cpuCount <= 4 && avgCpuFreq <= 1300 && memoryClass <= 128 && androidVersion <= 27)))) ? com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier.LOW : (cpuCount < 8 || memoryClass <= 160 || (avgCpuFreq != -1 && avgCpuFreq <= 2055) || (avgCpuFreq == -1 && cpuCount == 8 && androidVersion <= 26)) ? com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier.MEDIUM : com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier.HIGH;
    }

    public final /* synthetic */ com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier calculateCurrentDevicePerformanceTier$core_release(android.content.Context context) {
        java.lang.Integer num;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        int i = android.os.Build.VERSION.SDK_INT;
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        java.lang.Object systemService = context.getSystemService("activity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
        if (i >= 31) {
            java.lang.String str = android.os.Build.SOC_MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = str.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            num = java.lang.Integer.valueOf(upperCase.hashCode());
        } else {
            num = null;
        }
        java.lang.Integer num2 = num;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < availableProcessors; i4++) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "/sys/devices/system/cpu/cpu%d/cpufreq/scaling_cur_freq", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i4)}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(format, "r");
                i3 += INSTANCE.parseCpuFreqFromLine$core_release(randomAccessFile.readLine()) / 1000;
                i2++;
                randomAccessFile.close();
                kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
        }
        int ceil = i2 == 0 ? -1 : (int) java.lang.Math.ceil(i3 / i2);
        long j = -1;
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            j = memoryInfo.totalMem;
            kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        return computeDeviceTier$core_release(i, ceil, availableProcessors, activityManager.getMemoryClass(), j, num2);
    }

    public static /* synthetic */ com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier getCurrentDevicePerformanceTier$default(com.miteksystems.misnap.core.DevicePerformanceUtil devicePerformanceUtil, android.content.Context context, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return devicePerformanceUtil.getCurrentDevicePerformanceTier(context, z);
    }

    private DevicePerformanceUtil() {
    }
}
