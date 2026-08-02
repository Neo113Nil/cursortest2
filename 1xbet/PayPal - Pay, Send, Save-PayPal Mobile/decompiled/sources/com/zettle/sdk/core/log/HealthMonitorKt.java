package com.zettle.sdk.core.log;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001f\u0010\r\u001a\u00020\b*\u00020\u00078GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Ljava/io/File;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/io/File;)Z", "", "Camera2StreamConfigurationMap", "(Ljava/io/File;)[Ljava/io/File;", "Lcom/zettle/sdk/commons/util/Log$Companion;", "Lcom/zettle/sdk/commons/util/Log;", "HealthMonitor$delegate", "Lkotlin/Lazy;", "getHealthMonitor", "(Lcom/zettle/sdk/commons/util/Log$Companion;)Lcom/zettle/sdk/commons/util/Log;", "HealthMonitor"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HealthMonitorKt {
    private static final kotlin.Lazy HealthMonitor$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.commons.util.Log>() { // from class: com.zettle.sdk.core.log.HealthMonitorKt$HealthMonitor$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public final com.zettle.sdk.commons.util.Log invoke() {
            return com.zettle.sdk.commons.util.Log.INSTANCE.get("HealthMonitor");
        }
    });

    public static final com.zettle.sdk.commons.util.Log getHealthMonitor(com.zettle.sdk.commons.util.Log.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return (com.zettle.sdk.commons.util.Log) HealthMonitor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.io.File[] Camera2StreamConfigurationMap(java.io.File file) {
        try {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles == null) {
                listFiles = new java.io.File[0];
            }
            if (listFiles.length > 1) {
                kotlin.collections.ArraysKt.sortWith(listFiles, new java.util.Comparator() { // from class: com.zettle.sdk.core.log.HealthMonitorKt$sortedFiles$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((java.io.File) t).lastModified()), java.lang.Long.valueOf(((java.io.File) t2).lastModified()));
                    }
                });
            }
            return listFiles;
        } catch (java.io.IOException e) {
            getHealthMonitor(com.zettle.sdk.commons.util.Log.INSTANCE).e("Failed to read record dir", e);
            return new java.io.File[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(java.io.File file) {
        try {
            return file.delete();
        } catch (java.io.IOException e) {
            getHealthMonitor(com.zettle.sdk.commons.util.Log.INSTANCE).e("Failed to delete record", e);
            return false;
        }
    }

    public static final /* synthetic */ java.lang.String access$toSymbol(com.zettle.sdk.commons.util.Log.Priority priority) {
        switch (com.zettle.sdk.core.log.HealthMonitorKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()]) {
            case 1:
                return "V";
            case 2:
                return "D";
            case 3:
                return com.visa.cbp.getEncExpo.warmup;
            case 4:
                return "W";
            case 5:
                return "E";
            case 6:
                return "A";
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.zettle.sdk.commons.util.Log.Priority.values().length];
            try {
                iArr[com.zettle.sdk.commons.util.Log.Priority.VERBOSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.zettle.sdk.commons.util.Log.Priority.DEBUG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.zettle.sdk.commons.util.Log.Priority.INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.zettle.sdk.commons.util.Log.Priority.WARN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.zettle.sdk.commons.util.Log.Priority.ERROR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.zettle.sdk.commons.util.Log.Priority.ASSERT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
