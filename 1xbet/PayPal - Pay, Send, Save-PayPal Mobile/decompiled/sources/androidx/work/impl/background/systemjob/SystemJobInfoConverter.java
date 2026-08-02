package androidx.work.impl.background.systemjob;

/* loaded from: classes3.dex */
class SystemJobInfoConverter {
    static final java.lang.String Camera2StreamConfigurationMap = androidx.work.Logger.tagWithPrefix("SystemJobInfoConverter");
    final androidx.work.Clock getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRanges;
    final android.content.ComponentName getHighSpeedVideoFpsRangesFor;

    SystemJobInfoConverter(android.content.Context context, androidx.work.Clock clock, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = clock;
        this.getHighSpeedVideoFpsRangesFor = new android.content.ComponentName(context.getApplicationContext(), (java.lang.Class<?>) androidx.work.impl.background.systemjob.SystemJobService.class);
        this.getHighSpeedVideoFpsRanges = z;
    }

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobInfoConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[androidx.work.NetworkType.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[androidx.work.NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.work.NetworkType.CONNECTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.work.NetworkType.UNMETERED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.work.NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.work.NetworkType.METERED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }
}
