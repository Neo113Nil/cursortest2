package androidx.core.flagging;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/core/flagging/Flags;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Flags {
    private static final java.util.Map<java.lang.String, android.os.flagging.AconfigPackage> Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.core.flagging.Flags.Companion INSTANCE = new androidx.core.flagging.Flags.Companion(0 == true ? 1 : 0);
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0003X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0003X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011"}, d2 = {"Landroidx/core/flagging/Flags$Companion;", "", "<init>", "()V", "", com.visa.cbp.ConsumerInfo.setSignature, "flagName", "", "defaultValue", "getBooleanFlagValue", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "", "Landroid/os/flagging/AconfigPackage;", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "", "Ljava/util/Set;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ boolean getBooleanFlagValue$default(androidx.core.flagging.Flags.Companion companion, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.getBooleanFlagValue(str, str2, z);
        }

        @kotlin.jvm.JvmStatic
        public final boolean getBooleanFlagValue(java.lang.String packageName, java.lang.String flagName, boolean defaultValue) {
            android.os.flagging.AconfigPackage aconfigPackage;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flagName, "");
            if (android.os.Build.VERSION.SDK_INT < 36) {
                return defaultValue;
            }
            java.util.Map map = androidx.core.flagging.Flags.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(map);
            java.util.Set set = androidx.core.flagging.Flags.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(set);
            if (map.containsKey(packageName)) {
                aconfigPackage = (android.os.flagging.AconfigPackage) map.get(packageName);
            } else {
                if (!set.contains(packageName)) {
                    try {
                        android.os.flagging.AconfigPackage load = android.os.flagging.AconfigPackage.load(packageName);
                        map.put(packageName, load);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        aconfigPackage = load;
                    } catch (android.os.flagging.AconfigStorageReadException unused) {
                        set.add(packageName);
                    }
                }
                aconfigPackage = null;
            }
            return aconfigPackage != null ? aconfigPackage.getBooleanFlagValue(flagName, defaultValue) : defaultValue;
        }

        @kotlin.jvm.JvmStatic
        public final boolean getBooleanFlagValue(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            return getBooleanFlagValue$default(this, str, str2, false, 4, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Camera2StreamConfigurationMap = android.os.Build.VERSION.SDK_INT >= 36 ? new java.util.concurrent.ConcurrentHashMap() : null;
        getHighSpeedVideoFpsRangesFor = android.os.Build.VERSION.SDK_INT >= 36 ? new java.util.concurrent.CopyOnWriteArraySet() : null;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getBooleanFlagValue(java.lang.String str, java.lang.String str2, boolean z) {
        return INSTANCE.getBooleanFlagValue(str, str2, z);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getBooleanFlagValue(java.lang.String str, java.lang.String str2) {
        return INSTANCE.getBooleanFlagValue(str, str2);
    }
}
