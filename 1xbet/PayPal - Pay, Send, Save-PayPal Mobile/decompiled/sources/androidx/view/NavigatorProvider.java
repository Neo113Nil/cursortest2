package androidx.view;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\fJ'\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0011R(\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\u00040\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R%\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\u00040\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/navigation/NavigatorProvider;", "", "<init>", "()V", "Landroidx/navigation/Navigator;", "T", "Ljava/lang/Class;", "navigatorClass", "getNavigator", "(Ljava/lang/Class;)Landroidx/navigation/Navigator;", "", "name", "(Ljava/lang/String;)Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigator", "addNavigator", "(Landroidx/navigation/Navigator;)Landroidx/navigation/Navigator;", "(Ljava/lang/String;Landroidx/navigation/Navigator;)Landroidx/navigation/Navigator;", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "", "getNavigators", "()Ljava/util/Map;", "navigators", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class NavigatorProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.NavigatorProvider.Companion INSTANCE = new androidx.view.NavigatorProvider.Companion(null);
    private static final java.util.Map<java.lang.Class<?>, java.lang.String> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, androidx.view.Navigator<? extends androidx.view.NavDestination>> getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();

    public final java.util.Map<java.lang.String, androidx.view.Navigator<? extends androidx.view.NavDestination>> getNavigators() {
        return kotlin.collections.MapsKt.toMap(this.getHighSpeedVideoFpsRanges);
    }

    public final <T extends androidx.view.Navigator<?>> T getNavigator(java.lang.Class<T> navigatorClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigatorClass, "");
        return (T) getNavigator(INSTANCE.getNameForNavigator$navigation_common_release(navigatorClass));
    }

    public <T extends androidx.view.Navigator<?>> T getNavigator(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        if (!INSTANCE.validateName$navigation_common_release(name2)) {
            throw new java.lang.IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        androidx.view.Navigator<? extends androidx.view.NavDestination> navigator = this.getHighSpeedVideoFpsRanges.get(name2);
        if (navigator != null) {
            return navigator;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not find Navigator with name \"");
        sb.append(name2);
        sb.append("\". You must call NavController.addNavigator() for each navigation type.");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.view.Navigator<? extends androidx.view.NavDestination> addNavigator(androidx.view.Navigator<? extends androidx.view.NavDestination> navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return addNavigator(INSTANCE.getNameForNavigator$navigation_common_release(navigator.getClass()), navigator);
    }

    public androidx.view.Navigator<? extends androidx.view.NavDestination> addNavigator(java.lang.String name2, androidx.view.Navigator<? extends androidx.view.NavDestination> navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        if (!INSTANCE.validateName$navigation_common_release(name2)) {
            throw new java.lang.IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        androidx.view.Navigator<? extends androidx.view.NavDestination> navigator2 = this.getHighSpeedVideoFpsRanges.get(name2);
        if (kotlin.jvm.internal.Intrinsics.areEqual(navigator2, navigator)) {
            return navigator;
        }
        if (navigator2 != null && navigator2.getIsAttached()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Navigator ");
            sb.append(navigator);
            sb.append(" is replacing an already attached ");
            sb.append(navigator2);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        if (navigator.getIsAttached()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Navigator ");
            sb2.append(navigator);
            sb2.append(" is already attached to another NavController");
            throw new java.lang.IllegalStateException(sb2.toString().toString());
        }
        return this.getHighSpeedVideoFpsRanges.put(name2, navigator);
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u0001¢\u0006\u0004\b\f\u0010\rR&\u0010\u000f\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/navigation/NavigatorProvider$Companion;", "", "<init>", "()V", "", "name", "", "validateName$navigation_common_release", "(Ljava/lang/String;)Z", "Ljava/lang/Class;", "Landroidx/navigation/Navigator;", "navigatorClass", "getNameForNavigator$navigation_common_release", "(Ljava/lang/Class;)Ljava/lang/String;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public final boolean validateName$navigation_common_release(java.lang.String name2) {
            return name2 != null && name2.length() > 0;
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getNameForNavigator$navigation_common_release(java.lang.Class<? extends androidx.view.Navigator<?>> navigatorClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigatorClass, "");
            java.lang.String str = (java.lang.String) androidx.view.NavigatorProvider.getHighResolutionOutputSizeshNQ4ISI.get(navigatorClass);
            if (str == null) {
                androidx.navigation.Navigator.Name name2 = (androidx.navigation.Navigator.Name) navigatorClass.getAnnotation(androidx.navigation.Navigator.Name.class);
                str = name2 != null ? name2.value() : null;
                if (validateName$navigation_common_release(str)) {
                    androidx.view.NavigatorProvider.getHighResolutionOutputSizeshNQ4ISI.put(navigatorClass, str);
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("No @Navigator.Name annotation found for ");
                    sb.append(navigatorClass.getSimpleName());
                    throw new java.lang.IllegalArgumentException(sb.toString().toString());
                }
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            return str;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
