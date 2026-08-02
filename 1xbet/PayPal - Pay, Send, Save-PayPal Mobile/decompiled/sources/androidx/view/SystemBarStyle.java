package androidx.view;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0015R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/activity/SystemBarStyle;", "", "", "p0", "p1", "p2", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "p3", "<init>", "(IIILkotlin/jvm/functions/Function1;)V", "isDark", "getScrim$activity", "(Z)I", "getScrimWithEnforcedContrast$activity", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "darkScrim", "getDarkScrim$activity", "()I", "nightMode", "getNightMode$activity", "detectDarkMode", "Lkotlin/jvm/functions/Function1;", "getDetectDarkMode$activity", "()Lkotlin/jvm/functions/Function1;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SystemBarStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.SystemBarStyle.Companion INSTANCE = new androidx.view.SystemBarStyle.Companion(null);
    private final int darkScrim;
    private final kotlin.jvm.functions.Function1<android.content.res.Resources, java.lang.Boolean> detectDarkMode;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;
    private final int nightMode;

    /* JADX WARN: Multi-variable type inference failed */
    private SystemBarStyle(int i, int i2, int i3, kotlin.jvm.functions.Function1<? super android.content.res.Resources, java.lang.Boolean> function1) {
        this.Camera2StreamConfigurationMap = i;
        this.darkScrim = i2;
        this.nightMode = i3;
        this.detectDarkMode = function1;
    }

    /* renamed from: getDarkScrim$activity, reason: from getter */
    public final int getDarkScrim() {
        return this.darkScrim;
    }

    /* renamed from: getNightMode$activity, reason: from getter */
    public final int getNightMode() {
        return this.nightMode;
    }

    public final kotlin.jvm.functions.Function1<android.content.res.Resources, java.lang.Boolean> getDetectDarkMode$activity() {
        return this.detectDarkMode;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/activity/SystemBarStyle$Companion;", "", "<init>", "()V", "", "lightScrim", "darkScrim", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "Landroidx/activity/SystemBarStyle;", kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "(IILkotlin/jvm/functions/Function1;)Landroidx/activity/SystemBarStyle;", "scrim", "dark", "(I)Landroidx/activity/SystemBarStyle;", "light", "(II)Landroidx/activity/SystemBarStyle;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.view.SystemBarStyle auto$default(androidx.view.SystemBarStyle.Companion companion, int i, int i2, kotlin.jvm.functions.Function1 function1, int i3, java.lang.Object obj) {
            if ((i3 & 4) != 0) {
                function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(androidx.view.SystemBarStyle.Companion.m12$r8$lambda$DHmOxO09dMvcnR0D7W6U1r_6GY((android.content.res.Resources) obj2));
                    }
                };
            }
            return companion.auto(i, i2, function1);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.SystemBarStyle auto(int lightScrim, int darkScrim, kotlin.jvm.functions.Function1<? super android.content.res.Resources, java.lang.Boolean> detectDarkMode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detectDarkMode, "");
            return new androidx.view.SystemBarStyle(lightScrim, darkScrim, 0, detectDarkMode, null);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.SystemBarStyle dark(int scrim) {
            return new androidx.view.SystemBarStyle(scrim, scrim, 2, new kotlin.jvm.functions.Function1() { // from class: androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(androidx.view.SystemBarStyle.Companion.$r8$lambda$ziobQyLM8yHaWA0oXjc6WazfbqA((android.content.res.Resources) obj));
                }
            }, null);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.SystemBarStyle light(int scrim, int darkScrim) {
            return new androidx.view.SystemBarStyle(scrim, darkScrim, 1, new kotlin.jvm.functions.Function1() { // from class: androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(androidx.view.SystemBarStyle.Companion.$r8$lambda$c5ZuH01e8cSiKvRvj_RHuspalJQ((android.content.res.Resources) obj));
                }
            }, null);
        }

        /* renamed from: $r8$lambda$-DHmOxO09dMvcnR0D7W6U1r_6GY, reason: not valid java name */
        public static /* synthetic */ boolean m12$r8$lambda$DHmOxO09dMvcnR0D7W6U1r_6GY(android.content.res.Resources resources) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
            return (resources.getConfiguration().uiMode & 48) == 32;
        }

        public static /* synthetic */ boolean $r8$lambda$c5ZuH01e8cSiKvRvj_RHuspalJQ(android.content.res.Resources resources) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
            return false;
        }

        public static /* synthetic */ boolean $r8$lambda$ziobQyLM8yHaWA0oXjc6WazfbqA(android.content.res.Resources resources) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
            return true;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.SystemBarStyle auto(int i, int i2) {
            return auto$default(this, i, i2, null, 4, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getScrim$activity(boolean isDark) {
        return isDark ? this.darkScrim : this.Camera2StreamConfigurationMap;
    }

    public final int getScrimWithEnforcedContrast$activity(boolean isDark) {
        if (this.nightMode == 0) {
            return 0;
        }
        if (isDark) {
            return this.darkScrim;
        }
        return this.Camera2StreamConfigurationMap;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.SystemBarStyle light(int i, int i2) {
        return INSTANCE.light(i, i2);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.SystemBarStyle dark(int i) {
        return INSTANCE.dark(i);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.SystemBarStyle auto(int i, int i2, kotlin.jvm.functions.Function1<? super android.content.res.Resources, java.lang.Boolean> function1) {
        return INSTANCE.auto(i, i2, function1);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.SystemBarStyle auto(int i, int i2) {
        return INSTANCE.auto(i, i2);
    }

    public /* synthetic */ SystemBarStyle(int i, int i2, int i3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, function1);
    }
}
