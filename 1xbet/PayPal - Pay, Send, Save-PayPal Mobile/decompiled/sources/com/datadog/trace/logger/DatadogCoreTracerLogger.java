package com.datadog.trace.logger;

/* loaded from: classes3.dex */
public class DatadogCoreTracerLogger implements com.datadog.trace.logger.Logger {
    final java.lang.String Camera2StreamConfigurationMap;
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    @Override // com.datadog.trace.logger.Logger
    public boolean isDebugEnabled() {
        return false;
    }

    @Override // com.datadog.trace.logger.Logger
    public boolean isInfoEnabled() {
        return true;
    }

    @Override // com.datadog.trace.logger.Logger
    public boolean isWarnEnabled() {
        return true;
    }

    static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String replace = str2.replace("{}", "%s");
        java.util.Locale locale = java.util.Locale.US;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(replace);
        return java.lang.String.format(locale, sb.toString(), objArr);
    }

    static java.lang.String Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2) {
        return java.lang.String.format(java.util.Locale.US, "%s: %s", str, str2);
    }

    public DatadogCoreTracerLogger(java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // com.datadog.trace.logger.Logger
    public void debug(final java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.DEBUG, com.datadog.android.api.InternalLogger.Target.MAINTAINER, new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.Camera2StreamConfigurationMap(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void debug(final java.lang.String str, final java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.DEBUG, com.datadog.android.api.InternalLogger.Target.MAINTAINER, new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.getHighResolutionOutputSizeshNQ4ISI(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str, obj);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void debug(final java.lang.String str, final java.lang.Object obj, final java.lang.Object obj2) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.DEBUG, com.datadog.android.api.InternalLogger.Target.MAINTAINER, new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.getHighResolutionOutputSizeshNQ4ISI(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str, obj, obj2);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void debug(final java.lang.String str, final java.lang.Object... objArr) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.DEBUG, com.datadog.android.api.InternalLogger.Target.MAINTAINER, new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.getHighResolutionOutputSizeshNQ4ISI(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str, objArr);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void debug(final java.lang.String str, java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.DEBUG, java.util.Arrays.asList(com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY), new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.Camera2StreamConfigurationMap(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str);
            }
        }, th, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void info(final java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.Camera2StreamConfigurationMap(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void info(final java.lang.String str, final java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.getHighResolutionOutputSizeshNQ4ISI(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str, obj);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void info(final java.lang.String str, final java.lang.Object obj, final java.lang.Object obj2) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.getHighResolutionOutputSizeshNQ4ISI(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str, obj, obj2);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void info(final java.lang.String str, final java.lang.Object... objArr) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.getHighResolutionOutputSizeshNQ4ISI(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str, objArr);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void info(final java.lang.String str, java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.INFO, java.util.Arrays.asList(com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY), new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.Camera2StreamConfigurationMap(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str);
            }
        }, th, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void warn(final java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.Camera2StreamConfigurationMap(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void warn(final java.lang.String str, final java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.getHighResolutionOutputSizeshNQ4ISI(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str, obj);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void warn(final java.lang.String str, final java.lang.Object obj, final java.lang.Object obj2) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.getHighResolutionOutputSizeshNQ4ISI(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str, obj, obj2);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void warn(final java.lang.String str, final java.lang.Object... objArr) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.getHighResolutionOutputSizeshNQ4ISI(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str, objArr);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void warn(final java.lang.String str, java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.WARN, java.util.Arrays.asList(com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY), new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.Camera2StreamConfigurationMap(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str);
            }
        }, th, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void error(final java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.ERROR, java.util.Arrays.asList(com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY), new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.Camera2StreamConfigurationMap(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void error(final java.lang.String str, final java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.ERROR, java.util.Arrays.asList(com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY), new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.getHighResolutionOutputSizeshNQ4ISI(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str, obj);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void error(final java.lang.String str, final java.lang.Object obj, final java.lang.Object obj2) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.ERROR, java.util.Arrays.asList(com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY), new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda14
            private static final byte[] $$c = {35, com.google.common.base.Ascii.EM, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE};
            private static final int $$d = 111;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {33, 69, 87, -70, -1, -18, 41, -36, -1, -4, 19, -22, -17, 1, 0, -12, -2, 8, -9, -2, com.google.common.base.Ascii.FS, -41, -2, 1, -8, -2, com.google.common.base.Ascii.RS, -25, -20, 18, -17, 8, com.google.common.base.Ascii.ETB, -6, com.google.common.base.Ascii.SUB, -24, -13, 7, -1, -18, 41, -36, -1, -4, 18, -32, 8, -3, -2, com.google.common.base.Ascii.VT, -22, 2, -4, -13, com.google.common.base.Ascii.EM, -25, -20, 18, -17};
            private static final int $$b = 63;
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoFpsRanges = 1229026525;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(short s, short s2, int i) {
                int i2;
                int i3;
                int i4 = 4 - (s2 * 3);
                int i5 = 1 - (i * 2);
                byte[] bArr = $$c;
                int i6 = (s * 4) + 97;
                byte[] bArr2 = new byte[i5];
                if (bArr == null) {
                    int i7 = i6;
                    i6 = i5;
                    i3 = 0;
                    i6 += i7;
                    i4++;
                    i2 = i3;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i6;
                    if (i3 == i5) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i7 = bArr[i4];
                    i6 += i7;
                    i4++;
                    i2 = i3;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i6;
                    if (i3 == i5) {
                    }
                } else {
                    i2 = 0;
                    i3 = i2 + 1;
                    bArr2[i2] = (byte) i6;
                    if (i3 == i5) {
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            /* JADX WARN: Type inference failed for: r3v2, types: [int] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:4:0x0029). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, byte b, short s, java.lang.Object[] objArr) {
                byte b2;
                int i2 = s + 4;
                int i3 = 103 - i;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[b + 1];
                if (bArr == null) {
                    i3 = b;
                    int i4 = i2;
                    byte b3 = 0;
                    i3 = (i3 + (-i2)) - 3;
                    i2 = i4;
                    b2 = b3;
                    bArr2[b2] = (byte) i3;
                    if (b2 == b) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    int i5 = i2 + 1;
                    ?? r3 = b2 + 1;
                    i4 = i5;
                    i2 = bArr[i5];
                    b3 = r3;
                    i3 = (i3 + (-i2)) - 3;
                    i2 = i4;
                    b2 = b3;
                    bArr2[b2] = (byte) i3;
                    if (b2 == b) {
                    }
                } else {
                    b2 = 0;
                    bArr2[b2] = (byte) i3;
                    if (b2 == b) {
                    }
                }
            }

            private static void b(boolean z, int i, char[] cArr, int i2, int i3, java.lang.Object[] objArr) {
                char[] cArr2;
                int i4 = 2 % 2;
                o.getOutputStallDurationlomOqCM getoutputstalldurationlomoqcm = new o.getOutputStallDurationlomOqCM();
                char[] cArr3 = new char[i3];
                getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor = 0;
                while (getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor < i3) {
                    int i5 = $11 + 107;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRanges = cArr[getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor];
                    cArr3[getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor] = (char) (i + getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRanges);
                    int i7 = getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i7]), java.lang.Integer.valueOf(getHighSpeedVideoFpsRanges)};
                        java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1585789956);
                        if (Camera2StreamConfigurationMap2 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17807), 379 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 17 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), -1014629116, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        cArr3[i7] = ((java.lang.Character) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr2)).charValue();
                        try {
                            java.lang.Object[] objArr3 = {getoutputstalldurationlomoqcm, getoutputstalldurationlomoqcm};
                            java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1484703174);
                            if (Camera2StreamConfigurationMap3 == null) {
                                Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 32158), 89 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), -981596986, false, "d", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr3);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                if (i2 > 0) {
                    int i8 = $10 + 51;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI = i2;
                    char[] cArr4 = new char[i3];
                    java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
                    java.lang.System.arraycopy(cArr4, 0, cArr3, i3 - getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI, getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI);
                    java.lang.System.arraycopy(cArr4, getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI, cArr3, 0, i3 - getoutputstalldurationlomoqcm.getHighResolutionOutputSizeshNQ4ISI);
                }
                if (z) {
                    int i10 = $11 + 45;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr2 = new char[i3];
                        getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor = 1;
                    } else {
                        cArr2 = new char[i3];
                        getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor = 0;
                    }
                    while (getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor < i3) {
                        int i11 = $10 + 11;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            cArr2[getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor] = cArr3[(getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor * i3) / 0];
                            try {
                                java.lang.Object[] objArr4 = {getoutputstalldurationlomoqcm, getoutputstalldurationlomoqcm};
                                java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1484703174);
                                if (Camera2StreamConfigurationMap4 == null) {
                                    Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) ((android.os.Process.myTid() >> 22) + 32158), android.view.KeyEvent.getDeadChar(0, 0) + 90, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 11, -981596986, false, "d", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                                }
                                ((java.lang.reflect.Method) Camera2StreamConfigurationMap4).invoke(null, objArr4);
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        } else {
                            cArr2[getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor] = cArr3[(i3 - getoutputstalldurationlomoqcm.getHighSpeedVideoFpsRangesFor) - 1];
                            java.lang.Object[] objArr5 = {getoutputstalldurationlomoqcm, getoutputstalldurationlomoqcm};
                            java.lang.Object Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1484703174);
                            if (Camera2StreamConfigurationMap5 == null) {
                                Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (32157 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.view.View.resolveSize(0, 0) + 90, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 11, -981596986, false, "d", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) Camera2StreamConfigurationMap5).invoke(null, objArr5);
                        }
                    }
                    cArr3 = cArr2;
                }
                objArr[0] = new java.lang.String(cArr3);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                int i = 2 % 2;
                int i2 = Camera2StreamConfigurationMap + 39;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                int i3 = i2 % 2;
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                if (i3 == 0) {
                    return com.datadog.trace.logger.DatadogCoreTracerLogger.getHighResolutionOutputSizeshNQ4ISI(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str, obj, obj2);
                }
                java.lang.String str2 = str;
                java.lang.Object obj3 = obj;
                java.lang.Object obj4 = obj2;
                java.lang.String str3 = datadogCoreTracerLogger.Camera2StreamConfigurationMap;
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[1] = obj3;
                objArr[0] = obj4;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.getHighResolutionOutputSizeshNQ4ISI(str3, str2, objArr);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(30:0|1|(6:3|4|5|6|7|8)(1:149)|9|10|11|(1:13)|14|15|(1:17)|18|(3:20|(1:22)|23)|134|(10:136|51|(1:53)(1:69)|54|(1:56)(1:68)|57|(1:59)(1:67)|60|61|(1:63)(2:65|66))|25|26|27|(13:29|(1:31)(2:80|81)|32|(2:34|35)(2:78|79)|36|(1:38)(1:77)|39|40|41|(1:43)|44|45|46)(8:82|83|(2:85|86)(1:132)|87|88|89|(9:91|92|93|94|(4:96|97|98|99)(1:114)|100|101|(1:103)|105)(6:117|118|119|(1:121)|122|123)|104)|47|(1:49)(1:70)|50|51|(0)(0)|54|(0)(0)|57|(0)(0)|60|61|(0)(0)) */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x0934, code lost:
            
                if (r0.equals(((java.lang.reflect.Method) r6).invoke(null, r5)) != false) goto L101;
             */
            /* JADX WARN: Code restructure failed: missing block: B:133:0x0941, code lost:
            
                r13 = 16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x03fa, code lost:
            
                if ((!r0.contains(((java.lang.reflect.Field) r3).get(null))) != false) goto L151;
             */
            /* JADX WARN: Removed duplicated region for block: B:53:0x09a5  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x09d4  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0a02  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0a80 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0a81  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0a2c  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x09e2  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x09b7  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] getHighSpeedVideoSizes(android.content.Context context, int i, int i2, int i3) {
                int i4;
                int i5;
                int i6;
                int i7;
                java.lang.Object[] objArr;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                java.lang.String str2;
                int i20;
                int highSpeedVideoSizes;
                int i21;
                int i22;
                char[] cArr;
                int i23;
                boolean z;
                int i24;
                int highSpeedVideoSizes2;
                int i25;
                int i26;
                java.lang.Object obj3;
                int i27 = 2 % 2;
                if (context != null) {
                    try {
                        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        int i28 = ~i;
                        int i29 = i28 | lastIndexOf;
                        int i30 = (lastIndexOf * (-51)) + 5512 + ((~((i29 & 104) | (i29 ^ 104))) * 52);
                        int i31 = ~i;
                        int i32 = ~(((-105) ^ i31) | ((-105) & i31));
                        int i33 = ~(((-105) ^ lastIndexOf) | ((-105) & lastIndexOf));
                        int i34 = (i32 ^ i33) | (i33 & i32);
                        int i35 = ~((i31 ^ lastIndexOf) | (i31 & lastIndexOf));
                        int i36 = ((i34 ^ i35) | (i34 & i35)) * (-52);
                        int i37 = (i30 ^ i36) + ((i30 & i36) << 1);
                        int i38 = ~((~lastIndexOf) | i31);
                        int i39 = ~lastIndexOf;
                        int i40 = getHighResolutionOutputSizeshNQ4ISI + 101;
                        Camera2StreamConfigurationMap = i40 % 128;
                        int i41 = i40 % 2;
                        int i42 = ~((i39 & 104) | (i39 ^ 104));
                        int i43 = 52 * ((i42 & i38) | (i38 ^ i42));
                        int i44 = ((i37 | i43) << 1) - (i43 ^ i37);
                        int i45 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int i46 = (i45 & 7) + (i45 | 7);
                        int i47 = -(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                        int i48 = ((i47 | 24) << 1) - (i47 ^ 24);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        b(false, i44, new char[]{'\n', '\t', 15, 0, 19, 15, 65532, '\t', 65535, '\r', '\n', 4, 65535, 65481, 65534, '\n', '\t', 15, 0, '\t', 15, 65481, 65502}, i46, i48, objArr2);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                        int argb = android.graphics.Color.argb(0, 0, 0, 0);
                        int i49 = argb * 55;
                        int i50 = (i49 ^ (-11235)) + ((i49 & (-11235)) << 1);
                        int i51 = ~argb;
                        int i52 = ~((i51 ^ 105) | (i51 & 105));
                        int i53 = ~((i31 ^ 105) | (i31 & 105));
                        int i54 = (i50 - (~(((i52 ^ i53) | (i52 & i53)) * (-108)))) - 1;
                        int i55 = ~(i51 | i);
                        int i56 = ~(((-106) & argb) | ((-106) ^ argb));
                        int i57 = (i55 & i56) | (i55 ^ i56);
                        int i58 = ~(i31 | argb);
                        int i59 = (i54 - (~(-(-(((i57 & i58) | (i57 ^ i58)) * 54))))) - 1;
                        int i60 = ~((argb & (-106)) | ((-106) ^ argb));
                        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        int highSpeedVideoSizes3 = com.daon.face.quality.BuildConfig.getHighSpeedVideoSizes();
                        int i61 = makeMeasureSpec * (-109);
                        int i62 = (i61 & 1887) + (i61 | 1887);
                        int i63 = ~makeMeasureSpec;
                        int i64 = ((~(highSpeedVideoSizes3 | 17)) | i63) * (-220);
                        int i65 = (((i62 & i64) + (i64 | i62)) - (~(((~(makeMeasureSpec | 17)) | (~((highSpeedVideoSizes3 ^ 17) | (highSpeedVideoSizes3 & 17)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) - 1;
                        int i66 = ~((i63 ^ 17) | (i63 & 17));
                        int i67 = ~(((-18) & makeMeasureSpec) | ((-18) ^ makeMeasureSpec));
                        int i68 = ((i66 & i67) | (i66 ^ i67)) * 110;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(true, (((i60 & i) | (i ^ i60)) * 54) + i59, new char[]{65535, 7, 65506, 7, '\b', 2, '\r', 65530, 65532, 2, 5, '\t', '\t', 65498, '\r', 65534, 0, '\b'}, (i65 ^ i68) + ((i65 & i68) << 1), 18 - android.text.TextUtils.indexOf("", ""), objArr3);
                        java.lang.Object invoke = cls.getMethod((java.lang.String) objArr3[0], null).invoke(context, null);
                        int defaultSize = android.view.View.getDefaultSize(0, 0);
                        int i69 = (defaultSize * 371) + 7049;
                        int i70 = ~(((-20) & i31) | ((-20) ^ i31));
                        int i71 = ~defaultSize;
                        int i72 = ~((i71 & i) | (i71 ^ i));
                        int i73 = -(-(((i70 & i72) | (i70 ^ i72)) * (-370)));
                        int i74 = (i69 & i73) + (i69 | i73);
                        int i75 = ~defaultSize;
                        int i76 = Camera2StreamConfigurationMap + 117;
                        getHighResolutionOutputSizeshNQ4ISI = i76 % 128;
                        int i77 = i76 % 2;
                        int i78 = (~((i75 & i28) | (i75 ^ i28))) | (~(((-20) & i) | ((-20) ^ i)));
                        int i79 = ~((defaultSize & 19) | (defaultSize ^ 19));
                        int i80 = -(-((-370) * ((i78 & i79) | (i78 ^ i79))));
                        int i81 = (i74 & i80) + (i80 | i74) + (i79 * com.knotapi.knot.utilities.Constants.ID_KROGER);
                        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                        int highSpeedVideoSizes4 = com.daon.face.quality.BuildConfig.getHighSpeedVideoSizes();
                        int i82 = (maxKeyCode * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE) - 9588;
                        int i83 = ~maxKeyCode;
                        int i84 = ((~(i83 | highSpeedVideoSizes4)) | (~((i83 ^ 34) | (i83 & 34)))) * (-283);
                        int i85 = (i82 ^ i84) + ((i82 & i84) << 1);
                        int i86 = (~((-35) | maxKeyCode)) * 283;
                        int i87 = ~maxKeyCode;
                        int i88 = (i87 & (-35)) | (i87 ^ (-35));
                        int i89 = (i85 ^ i86) + ((i86 & i85) << 1) + ((~((i88 & highSpeedVideoSizes4) | (i88 ^ highSpeedVideoSizes4))) * 283);
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        b(true, 102 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{65483, '\n', '\r', 65483, 17, 11, 2, 17, 11, '\f', 0, 65483, 1, 6, '\f', 15, 1, 11, 65534, '\f', 3, 11, 65510, 11, '\f', 6, 17, 65534, 0, 6, '\t', '\r', '\r', 65502}, i81, i89, objArr4);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                        int i90 = -(-(android.os.Process.myPid() >> 22));
                        int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                        int i91 = ~scrollBarFadeDuration;
                        int i92 = ~((i91 ^ i31) | (i91 & i31));
                        int i93 = ~(((-2) ^ i28) | ((-2) & i28));
                        int i94 = (scrollBarFadeDuration * 868) + 868 + (((i92 & i93) | (i92 ^ i93)) * (-867));
                        int i95 = ~scrollBarFadeDuration;
                        int i96 = getHighResolutionOutputSizeshNQ4ISI;
                        int i97 = ((i96 | 47) << 1) - (i96 ^ 47);
                        Camera2StreamConfigurationMap = i97 % 128;
                        int i98 = i97 % 2;
                        int i99 = (~((i91 & i) | (i91 ^ i))) | (~(i95 | (-2)));
                        int i100 = ~(((-2) & i) | ((-2) ^ i));
                        int i101 = -(-((-1734) * ((i99 & i100) | (i99 ^ i100))));
                        int i102 = ((i94 | i101) << 1) - (i94 ^ i101);
                        int i103 = i95 | (-2);
                        int i104 = ~((i103 & i31) | (i103 ^ i31));
                        int i105 = i95 | 1;
                        int i106 = ~((i105 & i) | (i105 ^ i));
                        int i107 = (i104 & i106) | (i104 ^ i106);
                        int i108 = scrollBarFadeDuration | (-2);
                        int i109 = ~((i108 & i) | (i108 ^ i));
                        int i110 = (i102 - (~(((i109 & i107) | (i107 ^ i109)) * 867))) - 1;
                        int i111 = -(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i112 = i111 * (-464);
                        int i113 = ((i112 | (-4645)) << 1) - (i112 ^ (-4645));
                        int i114 = ~i111;
                        int i115 = (i ^ 5) | (i & 5);
                        int i116 = ~i115;
                        int i117 = ((i114 & i116) | (i114 ^ i116)) * (-465);
                        int i118 = (i113 ^ i117) + ((i117 & i113) << 1);
                        int i119 = ~i111;
                        int i120 = -(-(((~((i119 ^ i) | (i119 & i))) | 5) * 930));
                        int i121 = (i118 ^ i120) + ((i120 & i118) << 1);
                        int i122 = -(-(((i119 & i115) | (i115 ^ i119)) * 465));
                        int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(false, ((i90 | 107) << 1) - (i90 ^ 107), new char[]{'\n', 65533, 3, 65528, 65534}, i110, i123, objArr5);
                        int i124 = cls2.getField((java.lang.String) objArr5[0]).getInt(invoke) & 2;
                        int i125 = -i124;
                        int i126 = ((i124 & i125) | (i124 ^ i125)) >> 31;
                        int i127 = (~i126) & i;
                        int i128 = i126 & ((i & (-2)) | (i31 & 1));
                        int i129 = (i128 & i127) | (i127 ^ i128);
                        int i130 = Camera2StreamConfigurationMap;
                        int i131 = ((i130 | 85) << 1) - (i130 ^ 85);
                        getHighResolutionOutputSizeshNQ4ISI = i131 % 128;
                        int i132 = i131 % 2;
                        i4 = i129;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    i4 = i;
                }
                try {
                    java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(523151808);
                    if (Camera2StreamConfigurationMap2 == null) {
                        char edgeSlop = (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 12848);
                        int threadPriority = ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 451;
                        int indexOf = 16 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        byte b = $$a[14];
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        a(b, (byte) (b | 34), r0[4], objArr6);
                        Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(edgeSlop, threadPriority, indexOf, -2110887744, false, (java.lang.String) objArr6[0], new java.lang.Class[0]);
                    }
                    java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, null);
                    java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1348109960);
                    if (Camera2StreamConfigurationMap3 == null) {
                        char green = (char) (android.graphics.Color.green(0) + 12848);
                        int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("") + 451;
                        int myPid = 17 - (android.os.Process.myPid() >> 22);
                        byte b2 = $$a[14];
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        a(b2, (byte) (b2 | com.google.common.base.Ascii.NAK), r6[0], objArr7);
                        Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(green, keyCodeFromString, myPid, 849721464, false, (java.lang.String) objArr7[0], null);
                    }
                    if (!set.contains(((java.lang.reflect.Field) Camera2StreamConfigurationMap3).get(null))) {
                        int i133 = getHighResolutionOutputSizeshNQ4ISI + 47;
                        Camera2StreamConfigurationMap = i133 % 128;
                        int i134 = i133 % 2;
                        java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(238306405);
                        if (Camera2StreamConfigurationMap4 == null) {
                            char c = (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12847);
                            int keyRepeatTimeout = 451 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L) + 17;
                            byte b3 = $$a[14];
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            a(b3, (byte) (b3 | 34), r3[4], objArr8);
                            Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c, keyRepeatTimeout, packedPositionGroup, -1825274523, false, (java.lang.String) objArr8[0], null);
                        }
                    }
                    if (android.os.Build.VERSION.SDK_INT == 30) {
                        int i135 = getHighResolutionOutputSizeshNQ4ISI;
                        int i136 = (i135 ^ 101) + ((i135 & 101) << 1);
                        Camera2StreamConfigurationMap = i136 % 128;
                        int i137 = i136 % 2;
                        i5 = i;
                        i6 = 16;
                        int i138 = i ^ i4;
                        int i139 = -i138;
                        int i140 = ((i138 & i139) | (i138 ^ i139)) >> 31;
                        int i141 = i5 & (~i140);
                        int i142 = i4 & i140;
                        int i143 = (i141 & i142) | (i141 ^ i142);
                        i7 = getHighResolutionOutputSizeshNQ4ISI + 121;
                        int i144 = i7 % 128;
                        Camera2StreamConfigurationMap = i144;
                        if (i7 % 2 != 0) {
                            objArr = new java.lang.Object[3];
                            objArr[0] = new int[1];
                            objArr[1] = new int[1];
                            objArr[3] = new int[1];
                            i8 = 2;
                        } else {
                            objArr = new java.lang.Object[4];
                            objArr[0] = new int[1];
                            objArr[1] = new int[1];
                            i8 = 2;
                            objArr[2] = new int[1];
                        }
                        int i145 = i144 + 19;
                        getHighResolutionOutputSizeshNQ4ISI = i145 % 128;
                        i9 = i145 % i8;
                        int i146 = i ^ i143;
                        if (i9 == 0) {
                            int i147 = -i146;
                            i10 = ((i146 & i147) | (i146 ^ i147)) >>> com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i11 = (~i10) & 1;
                            i6 = 115;
                        } else {
                            i10 = (i146 | (-i146)) >> 31;
                            i11 = 0;
                        }
                        int i148 = (i10 & i6) | i11;
                        ((int[]) objArr[2])[0] = i;
                        ((int[]) objArr[1])[0] = i143;
                        i12 = i144 + 65;
                        int i149 = i12 % 128;
                        getHighResolutionOutputSizeshNQ4ISI = i149;
                        if (i12 % 2 == 0) {
                            objArr[3] = null;
                            int i150 = i3 + (((((11625992 | r1) * (-374)) - 1367190074) + (((~((~i) | 637134377)) | 625508385) * 374)) % i148);
                            int i151 = (i150 ^ 17) + ((i150 & 17) << 1);
                            i13 = ~(i150 & i151);
                            i14 = i150 | i151;
                        } else {
                            objArr[3] = null;
                            int i152 = ~i;
                            int i153 = (~((-37914416) | i152)) | 33554466;
                            int i154 = ~(i | (-549283857));
                            int i155 = (-2051276690) + ((i153 | i154) * (-713)) + (i154 * 1426) + ((~((-553643806) | i152)) * 713);
                            int i156 = (i155 & i148) + (i155 | i148);
                            int i157 = (i3 & i156) + (i3 | i156);
                            int i158 = i157 << 13;
                            i13 = ~(i157 & i158);
                            i14 = i158 | i157;
                        }
                        int i159 = i14 & i13;
                        int i160 = i159 >>> 17;
                        int i161 = (i159 | i160) & (~(i159 & i160));
                        int i162 = i161 << 5;
                        ((int[]) objArr[0])[0] = ((~i161) & i162) | ((~i162) & i161);
                        i15 = i149 + 95;
                        Camera2StreamConfigurationMap = i15 % 128;
                        if (i15 % 2 == 0) {
                            return objArr;
                        }
                        throw null;
                    }
                    if (android.os.Build.VERSION.SDK_INT > 33) {
                        int i163 = getHighResolutionOutputSizeshNQ4ISI;
                        int i164 = (i163 ^ 81) + ((i163 & 81) << 1);
                        Camera2StreamConfigurationMap = i164 % 128;
                        if (i164 % 2 == 0) {
                            int alpha = 98 % android.graphics.Color.alpha(1);
                            i20 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1));
                            highSpeedVideoSizes = com.daon.face.quality.BuildConfig.getHighSpeedVideoSizes();
                            i21 = 85 >> i20;
                            i22 = 35;
                            cArr = new char[]{4, 23, '\t', '\t', 3, 4, 14, 7, 65488, 20, 5, 65489, 7, 22, 5, 65489, 11, 16, 11, 22, 65489, 14, 14, '\r', 6, 65487, 6, 7};
                            i23 = alpha;
                            z = true;
                        } else {
                            int i165 = -android.graphics.Color.alpha(0);
                            int i166 = (i165 ^ 96) + ((i165 & 96) << 1);
                            char[] cArr2 = {4, 23, '\t', '\t', 3, 4, 14, 7, 65488, 20, 5, 65489, 7, 22, 5, 65489, 11, 16, 11, 22, 65489, 14, 14, '\r', 6, 65487, 6, 7};
                            i20 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            highSpeedVideoSizes = com.daon.face.quality.BuildConfig.getHighSpeedVideoSizes();
                            i21 = i20 * 85;
                            i22 = 12;
                            cArr = cArr2;
                            i23 = i166;
                            z = false;
                        }
                        int i167 = (i21 - (~(-(-(i22 * 85))))) - 1;
                        int i168 = ~i20;
                        int i169 = ~i22;
                        int i170 = ~((i169 & i168) | (i168 ^ i169));
                        int i171 = ~highSpeedVideoSizes;
                        int i172 = ~((i168 & i171) | (i168 ^ i171));
                        int i173 = (i172 & i170) | (i170 ^ i172);
                        int i174 = getHighResolutionOutputSizeshNQ4ISI;
                        int i175 = ((i174 | 67) << 1) - (i174 ^ 67);
                        Camera2StreamConfigurationMap = i175 % 128;
                        int i176 = i175 % 2;
                        int i177 = ~i22;
                        int i178 = ~highSpeedVideoSizes;
                        int i179 = ~((i177 & i178) | (i177 ^ i178));
                        int i180 = (i173 & i179) | (i173 ^ i179);
                        int i181 = (i20 ^ i22) | (i20 & i22);
                        int i182 = ~(i181 | highSpeedVideoSizes);
                        int i183 = (i167 - (~((-84) * ((i180 ^ i182) | (i180 & i182))))) - 1;
                        int i184 = i174 + 5;
                        Camera2StreamConfigurationMap = i184 % 128;
                        int i185 = i184 % 2;
                        int i186 = i22 ^ (-1);
                        int i187 = ~((i186 & highSpeedVideoSizes) | (i186 ^ highSpeedVideoSizes));
                        int i188 = (i187 & i20) | (i20 ^ i187);
                        int i189 = (i178 ^ i22) | (i178 & i22);
                        int i190 = ~i189;
                        int i191 = (-84) * ((i188 & i190) | (i188 ^ i190));
                        int i192 = (i183 & i191) + (i183 | i191);
                        int i193 = ~i189;
                        int i194 = ((i174 | 87) << 1) - (i174 ^ 87);
                        Camera2StreamConfigurationMap = i194 % 128;
                        if (i194 % 2 == 0) {
                            int i195 = (i192 - (~(84 / ((~(i20 | i22)) | i193)))) - 1;
                            i24 = -android.text.TextUtils.indexOf((java.lang.CharSequence) "", ';', 1, 0);
                            highSpeedVideoSizes2 = com.daon.face.quality.BuildConfig.getHighSpeedVideoSizes();
                            i26 = 38;
                            i25 = i195;
                        } else {
                            int i196 = ~i181;
                            int i197 = -(-(((i196 & i193) | (i193 ^ i196)) * 84));
                            int i198 = (i192 & i197) + (i192 | i197);
                            i24 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            highSpeedVideoSizes2 = com.daon.face.quality.BuildConfig.getHighSpeedVideoSizes();
                            i25 = i198;
                            i26 = 27;
                        }
                        int i199 = (-244) * i24;
                        int i200 = -(-(i26 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE));
                        int i201 = (i199 & i200) + (i199 | i200);
                        int i202 = ~i26;
                        int i203 = ~highSpeedVideoSizes2;
                        int i204 = ~((i203 & i202) | (i202 ^ i203));
                        int i205 = ~i26;
                        int i206 = ~((i205 ^ i24) | (i205 & i24));
                        int i207 = ((i204 & i206) | (i204 ^ i206)) * (-245);
                        int i208 = getHighResolutionOutputSizeshNQ4ISI + 85;
                        Camera2StreamConfigurationMap = i208 % 128;
                        if (i208 % 2 == 0) {
                            int i209 = ~((i205 ^ highSpeedVideoSizes2) | (highSpeedVideoSizes2 & i205));
                            int i210 = (i201 / i207) * ((-245) % i209);
                            int i211 = -((i209 & i24) | (i24 ^ i209));
                            int i212 = i210 >> ((i211 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE) + (i211 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            b(z, i23, cArr, i25, i212, objArr9);
                            obj3 = objArr9[0];
                        } else {
                            int i213 = (i201 ^ i207) + ((i207 & i201) << 1) + ((~(i202 | highSpeedVideoSizes2)) * (-245));
                            int i214 = -(-(((~((i205 ^ highSpeedVideoSizes2) | (highSpeedVideoSizes2 & i205))) | i24) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
                            int i215 = (i213 ^ i214) + ((i214 & i213) << 1);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b(z, i23, cArr, i25, i215, objArr10);
                            obj3 = objArr10[0];
                        }
                        try {
                            java.lang.Object[] objArr11 = {(java.lang.String) obj3};
                            java.lang.Object Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(355760564);
                            if (Camera2StreamConfigurationMap5 == null) {
                                char blue = (char) android.graphics.Color.blue(0);
                                int i216 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 510;
                                int absoluteGravity = 12 - android.view.Gravity.getAbsoluteGravity(0, 0);
                                byte b4 = (byte) ($$b & 5);
                                byte[] bArr = $$a;
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                a(b4, bArr[14], bArr[0], objArr12);
                                Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(blue, i216, absoluteGravity, -2009810764, false, (java.lang.String) objArr12[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap5).invoke(null, objArr11)).longValue();
                            long j = 779168224;
                            long j2 = -574;
                            long j3 = -1;
                            long j4 = j ^ j3;
                            long j5 = i;
                            long j6 = j5 ^ j3;
                            long j7 = ((longValue ^ j3) | j5) ^ j3;
                            long j8 = (j2 * j) + (j2 * longValue) + (1150 * (((j4 | j6) ^ j3) | j7)) + ((-575) * (j7 | ((j6 | longValue) ^ j3))) + (575 * (((j6 | j) ^ j3) | ((j5 | j4) ^ j3))) + 428653078;
                            int i217 = (int) (j8 >> 32);
                            int i218 = (int) java.lang.Runtime.getRuntime().totalMemory();
                            int i219 = i217 & (1843300866 + (((~((-1810750628) | i218)) | 1046990257) * (-668)) + (((-1810750628) | (~(1046990257 | i218))) * 1336) + ((i218 | (-1099436035)) * 668));
                            int i220 = (int) java.lang.Runtime.getRuntime().totalMemory();
                            int i221 = ((int) j8) & ((((~(1689350783 | i220)) | (-1807117995)) * 398) + 1915639561 + (((~((~i220) | 1689350783)) | (-1807117995)) * 398));
                            i6 = 16;
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    } else {
                        int i222 = -(-android.view.KeyEvent.getDeadChar(0, 0));
                        int i223 = (i222 & 51) + (i222 | 51);
                        char[] cArr3 = {0};
                        int i224 = 0 - (~android.view.View.MeasureSpec.getMode(0));
                        int i225 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int i226 = i225 * 569;
                        int i227 = (i226 & 569) + (i226 | 569);
                        int i228 = ~i225;
                        int i229 = ~((i228 ^ (-2)) | (i228 & (-2)));
                        int i230 = ~i;
                        int i231 = ~((i228 ^ i230) | (i228 & i230));
                        int i232 = (i229 & i231) | (i229 ^ i231);
                        int i233 = ~i;
                        int i234 = Camera2StreamConfigurationMap;
                        int i235 = (i234 ^ 93) + ((i234 & 93) << 1);
                        getHighResolutionOutputSizeshNQ4ISI = i235 % 128;
                        int i236 = i235 % 2;
                        int i237 = ~((-2) | i233);
                        int i238 = (i227 - (~((-1136) * ((i232 ^ i237) | (i232 & i237))))) - 1;
                        int i239 = ~((i228 ^ i) | (i228 & i));
                        int i240 = ~(((-2) ^ i) | ((-2) & i));
                        int i241 = (i239 ^ i240) | (i239 & i240);
                        int i242 = (i233 ^ i225) | (i233 & i225);
                        int i243 = ~((i242 ^ 1) | (i242 & 1));
                        int i244 = ((i241 ^ i243) | (i241 & i243)) * (-568);
                        int i245 = (i234 & 117) + (i234 | 117);
                        getHighResolutionOutputSizeshNQ4ISI = i245 % 128;
                        if (i245 % 2 != 0) {
                            int i246 = -i244;
                            int i247 = ((i238 | i246) << 1) - (i238 ^ i246);
                            int i248 = ~((i225 & i230) | (i230 ^ i225));
                            int i249 = ~(i230 | 1);
                            int i250 = (i248 & i249) | (i248 ^ i249);
                            int i251 = (i228 & (-2)) | (i228 ^ (-2));
                            int i252 = ~((i251 & i) | (i251 ^ i));
                            int i253 = i247 * (com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION >> ((i250 & i252) | (i250 ^ i252)));
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            b(true, i223, cArr3, i224, i253, objArr13);
                            str2 = (java.lang.String) objArr13[0];
                            i19 = 0;
                        } else {
                            int i254 = (i238 & i244) + (i238 | i244);
                            int i255 = ~((i233 ^ i225) | (i233 & i225));
                            int i256 = ~(i233 | 1);
                            int i257 = ~i225;
                            int i258 = (i257 & (-2)) | (i257 ^ (-2));
                            int i259 = (i254 - (~(((~((i258 & i) | (i258 ^ i))) | ((i255 & i256) | (i255 ^ i256))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))) - 1;
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            b(true, i223, cArr3, i224, i259, objArr14);
                            i19 = 0;
                            str2 = (java.lang.String) objArr14[0];
                        }
                        int i260 = -(android.util.TypedValue.complexToFloat(i19) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(i19) == 0.0f ? 0 : -1));
                        int i261 = (i260 ^ 101) + ((i260 & 101) << 1);
                        char[] cArr4 = {65535, 65534, 4, 4, 18, 65535, 2, 1, 65483, '\f', 15, 2, '\t'};
                        int size = android.view.View.MeasureSpec.getSize(0) + 11;
                        int size2 = android.view.View.MeasureSpec.getSize(0);
                        int highSpeedVideoSizes5 = com.daon.face.quality.BuildConfig.getHighSpeedVideoSizes();
                        int i262 = getHighResolutionOutputSizeshNQ4ISI;
                        int i263 = (i262 & 9) + (i262 | 9);
                        int i264 = i263 % 128;
                        Camera2StreamConfigurationMap = i264;
                        int i265 = i263 % 2;
                        int i266 = (size2 * (-1529)) - 9932;
                        int i267 = ~size2;
                        int i268 = i267 | (-14);
                        int i269 = ~highSpeedVideoSizes5;
                        int i270 = ~((i268 ^ i269) | (i268 & i269));
                        int i271 = ~(13 | i267 | highSpeedVideoSizes5);
                        int i272 = (i271 & i270) | (i270 ^ i271);
                        int i273 = (i264 & 97) + (i264 | 97);
                        int i274 = i273 % 128;
                        getHighResolutionOutputSizeshNQ4ISI = i274;
                        int i275 = i273 % 2;
                        int i276 = ((-14) ^ size2) | ((-14) & size2);
                        int i277 = 765 * (i272 | (~((i276 ^ highSpeedVideoSizes5) | (i276 & highSpeedVideoSizes5))));
                        int i278 = (i266 ^ i277) + ((i266 & i277) << 1);
                        int i279 = ~size2;
                        int i280 = ~((i279 ^ (-14)) | (i279 & (-14)));
                        int i281 = ~highSpeedVideoSizes5;
                        int i282 = ~((i279 ^ i281) | (i281 & i279));
                        int i283 = -(-(((i280 ^ i282) | (i282 & i280)) * 1530));
                        int i284 = i278 ^ i283;
                        int i285 = i278 & i283;
                        i6 = 1;
                        int i286 = i284 + (i285 << 1);
                        int i287 = ((i274 | 37) << 1) - (i274 ^ 37);
                        Camera2StreamConfigurationMap = i287 % 128;
                        if (i287 % 2 == 0) {
                            int i288 = ~((i279 ^ highSpeedVideoSizes5) | (i279 & highSpeedVideoSizes5));
                            int i289 = (-14) | i269;
                            int i290 = ~((i289 & size2) | (i289 ^ size2));
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            b(true, i261, cArr4, size, i286 << (765 >>> ((i288 & i290) | (i288 ^ i290))), objArr15);
                            try {
                                java.lang.Object[] objArr16 = {(java.lang.String) objArr15[0]};
                                java.lang.Object Camera2StreamConfigurationMap6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-452611245);
                                if (Camera2StreamConfigurationMap6 == null) {
                                    char argb2 = (char) (android.graphics.Color.argb(0, 0, 0, 0) + 12708);
                                    i6 = 16;
                                    int scrollBarFadeDuration2 = 287 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    try {
                                        int modifierMetaStateMask = ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 19;
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        a((byte) (-$$a[33]), r3[14], r3[0], objArr17);
                                        Camera2StreamConfigurationMap6 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(argb2, scrollBarFadeDuration2, modifierMetaStateMask, 2013622867, false, (java.lang.String) objArr17[0], new java.lang.Class[]{java.lang.String.class});
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        java.lang.Throwable cause3 = th.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th;
                                    }
                                } else {
                                    i6 = 16;
                                }
                                if (!(!str2.equals(((java.lang.reflect.Method) Camera2StreamConfigurationMap6).invoke(null, objArr16)))) {
                                }
                                i16 = 0;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                            }
                        } else {
                            i6 = 16;
                            int i291 = ~((i279 ^ highSpeedVideoSizes5) | (highSpeedVideoSizes5 & i279));
                            int i292 = ~((-14) | i269 | size2);
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            b(true, i261, cArr4, size, (((i291 & i292) | (i291 ^ i292)) * 765) + i286, objArr18);
                            try {
                                java.lang.Object[] objArr19 = {(java.lang.String) objArr18[0]};
                                java.lang.Object Camera2StreamConfigurationMap7 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-452611245);
                                if (Camera2StreamConfigurationMap7 == null) {
                                    char bitsPerPixel = (char) (12707 - android.graphics.ImageFormat.getBitsPerPixel(0));
                                    int trimmedLength = 287 - android.text.TextUtils.getTrimmedLength("");
                                    int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0) + 18;
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    a((byte) (-$$a[33]), r3[14], r3[0], objArr20);
                                    Camera2StreamConfigurationMap7 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(bitsPerPixel, trimmedLength, offsetAfter, 2013622867, false, (java.lang.String) objArr20[0], new java.lang.Class[]{java.lang.String.class});
                                }
                            } catch (java.lang.Throwable th5) {
                                java.lang.Throwable cause4 = th5.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th5;
                            }
                        }
                        i16 = 1;
                    }
                    int i293 = (~(i & 10)) & (i | 10);
                    int i294 = Camera2StreamConfigurationMap;
                    int i295 = (i294 & 41) + (i294 | 41);
                    int i296 = i295 % 128;
                    getHighResolutionOutputSizeshNQ4ISI = i296;
                    int i297 = i295 % 2;
                    int i298 = (i16 | (-i16)) >> 31;
                    int i299 = (~i298) & i;
                    int i300 = (i296 & 73) + (i296 | 73);
                    Camera2StreamConfigurationMap = i300 % 128;
                    int i301 = i298 & i293;
                    if (i300 % 2 == 0) {
                        i17 = i301 | i299;
                        i18 = i2 & 108;
                    } else {
                        i17 = (i301 & i299) | (i299 ^ i301);
                        i18 = i2 & 32;
                    }
                    int i302 = (i18 | (-i18)) >> 31;
                    int i303 = i17 & (~i302);
                    int i304 = i302 & i;
                    i5 = (i303 & i304) | (i303 ^ i304);
                    int i305 = i296 + 23;
                    Camera2StreamConfigurationMap = i305 % 128;
                    int i306 = i305 % 2;
                    int i1382 = i ^ i4;
                    int i1392 = -i1382;
                    int i1402 = ((i1382 & i1392) | (i1382 ^ i1392)) >> 31;
                    int i1412 = i5 & (~i1402);
                    int i1422 = i4 & i1402;
                    int i1432 = (i1412 & i1422) | (i1412 ^ i1422);
                    i7 = getHighResolutionOutputSizeshNQ4ISI + 121;
                    int i1442 = i7 % 128;
                    Camera2StreamConfigurationMap = i1442;
                    if (i7 % 2 != 0) {
                    }
                    int i1452 = i1442 + 19;
                    getHighResolutionOutputSizeshNQ4ISI = i1452 % 128;
                    i9 = i1452 % i8;
                    int i1462 = i ^ i1432;
                    if (i9 == 0) {
                    }
                    int i1482 = (i10 & i6) | i11;
                    ((int[]) objArr[2])[0] = i;
                    ((int[]) objArr[1])[0] = i1432;
                    i12 = i1442 + 65;
                    int i1492 = i12 % 128;
                    getHighResolutionOutputSizeshNQ4ISI = i1492;
                    if (i12 % 2 == 0) {
                    }
                    int i1592 = i14 & i13;
                    int i1602 = i1592 >>> 17;
                    int i1612 = (i1592 | i1602) & (~(i1592 & i1602));
                    int i1622 = i1612 << 5;
                    ((int[]) objArr[0])[0] = ((~i1612) & i1622) | ((~i1622) & i1612);
                    i15 = i1492 + 95;
                    Camera2StreamConfigurationMap = i15 % 128;
                    if (i15 % 2 == 0) {
                    }
                } catch (java.lang.Throwable th6) {
                    java.lang.Throwable cause5 = th6.getCause();
                    if (cause5 != null) {
                        throw cause5;
                    }
                    throw th6;
                }
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void error(final java.lang.String str, final java.lang.Object... objArr) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.ERROR, java.util.Arrays.asList(com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY), new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.getHighResolutionOutputSizeshNQ4ISI(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str, objArr);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }

    @Override // com.datadog.trace.logger.Logger
    public void error(final java.lang.String str, java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRangesFor.log(com.datadog.android.api.InternalLogger.Level.ERROR, java.util.Arrays.asList(com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY), new kotlin.jvm.functions.Function0() { // from class: com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.datadog.trace.logger.DatadogCoreTracerLogger datadogCoreTracerLogger = com.datadog.trace.logger.DatadogCoreTracerLogger.this;
                return com.datadog.trace.logger.DatadogCoreTracerLogger.Camera2StreamConfigurationMap(datadogCoreTracerLogger.Camera2StreamConfigurationMap, str);
            }
        }, th, false, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null);
    }
}
