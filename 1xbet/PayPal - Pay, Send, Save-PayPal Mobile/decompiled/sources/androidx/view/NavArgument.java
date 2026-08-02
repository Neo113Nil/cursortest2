package androidx.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001(B;\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\u0005\u0010!R\u001a\u0010\"\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!R\u001a\u0010#\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Landroidx/navigation/NavArgument;", "", "Landroidx/navigation/NavType;", "type", "", "isNullable", "defaultValue", "defaultValuePresent", "unknownDefaultValuePresent", "<init>", "(Landroidx/navigation/NavType;ZLjava/lang/Object;ZZ)V", "", "name", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "bundle", "", "putDefaultValue", "(Ljava/lang/String;Landroid/os/Bundle;)V", "verify", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/navigation/NavType;", "getType", "()Landroidx/navigation/NavType;", "Z", "()Z", "isDefaultValuePresent", "isDefaultValueUnknown", "isDefaultValueUnknown$navigation_common_release", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavArgument {
    private final java.lang.Object defaultValue;
    private final boolean isDefaultValuePresent;
    private final boolean isDefaultValueUnknown;
    private final boolean isNullable;
    private final androidx.view.NavType<java.lang.Object> type;

    public NavArgument(androidx.view.NavType<java.lang.Object> navType, boolean z, java.lang.Object obj, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navType, "");
        if (!navType.getIsNullableAllowed() && z) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(navType.getName());
            sb.append(" does not allow nullable values");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (!z && z2 && obj == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Argument with type ");
            sb2.append(navType.getName());
            sb2.append(" has null value but is not nullable.");
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        this.type = navType;
        this.isNullable = z;
        this.defaultValue = obj;
        this.isDefaultValuePresent = z2 || z3;
        this.isDefaultValueUnknown = z3;
    }

    public final androidx.view.NavType<java.lang.Object> getType() {
        return this.type;
    }

    /* renamed from: isNullable, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    /* renamed from: isDefaultValuePresent, reason: from getter */
    public final boolean getIsDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    /* renamed from: isDefaultValueUnknown$navigation_common_release, reason: from getter */
    public final boolean getIsDefaultValueUnknown() {
        return this.isDefaultValueUnknown;
    }

    public final java.lang.Object getDefaultValue() {
        return this.defaultValue;
    }

    public final void putDefaultValue(java.lang.String name2, android.os.Bundle bundle) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        if (!this.isDefaultValuePresent || (obj = this.defaultValue) == null) {
            return;
        }
        this.type.put(bundle, name2, obj);
    }

    public final boolean verify(java.lang.String name2, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        if (!this.isNullable) {
            android.os.Bundle m9296constructorimpl = androidx.view.SavedStateReader.m9296constructorimpl(bundle);
            if (androidx.view.SavedStateReader.m9297containsimpl(m9296constructorimpl, name2) && androidx.view.SavedStateReader.m9375isNullimpl(m9296constructorimpl, name2)) {
                return false;
            }
        }
        try {
            this.type.get(bundle, name2);
            return true;
        } catch (java.lang.IllegalStateException unused) {
            return false;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" Type: ");
        sb2.append(this.type);
        sb.append(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(" Nullable: ");
        sb3.append(this.isNullable);
        sb.append(sb3.toString());
        if (this.isDefaultValuePresent) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(" DefaultValue: ");
            sb4.append(this.defaultValue);
            sb.append(sb4.toString());
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && getClass() == other.getClass()) {
            androidx.view.NavArgument navArgument = (androidx.view.NavArgument) other;
            if (this.isNullable != navArgument.isNullable || this.isDefaultValuePresent != navArgument.isDefaultValuePresent || !kotlin.jvm.internal.Intrinsics.areEqual(this.type, navArgument.type)) {
                return false;
            }
            java.lang.Object obj = this.defaultValue;
            if (obj != null) {
                return kotlin.jvm.internal.Intrinsics.areEqual(obj, navArgument.defaultValue);
            }
            if (navArgument.defaultValue == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        boolean z = this.isNullable;
        boolean z2 = this.isDefaultValuePresent;
        java.lang.Object obj = this.defaultValue;
        return (((((hashCode * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019"}, d2 = {"Landroidx/navigation/NavArgument$Builder;", "", "<init>", "()V", "T", "Landroidx/navigation/NavType;", "type", "setType", "(Landroidx/navigation/NavType;)Landroidx/navigation/NavArgument$Builder;", "", "isNullable", "setIsNullable", "(Z)Landroidx/navigation/NavArgument$Builder;", "defaultValue", "setDefaultValue", "(Ljava/lang/Object;)Landroidx/navigation/NavArgument$Builder;", "unknownDefaultValuePresent", "setUnknownDefaultValuePresent$navigation_common_release", "Landroidx/navigation/NavArgument;", "build", "()Landroidx/navigation/NavArgument;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/navigation/NavType;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Z", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder {
        private java.lang.Object Camera2StreamConfigurationMap;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private androidx.view.NavType<java.lang.Object> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private boolean getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizes;

        public final <T> androidx.navigation.NavArgument.Builder setType(androidx.view.NavType<T> type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            this.getHighSpeedVideoFpsRanges = type;
            return this;
        }

        public final androidx.navigation.NavArgument.Builder setIsNullable(boolean isNullable) {
            this.getHighSpeedVideoSizes = isNullable;
            return this;
        }

        public final androidx.navigation.NavArgument.Builder setDefaultValue(java.lang.Object defaultValue) {
            this.Camera2StreamConfigurationMap = defaultValue;
            this.getHighSpeedVideoFpsRangesFor = true;
            return this;
        }

        public final androidx.navigation.NavArgument.Builder setUnknownDefaultValuePresent$navigation_common_release(boolean unknownDefaultValuePresent) {
            this.getHighResolutionOutputSizeshNQ4ISI = unknownDefaultValuePresent;
            return this;
        }

        public final androidx.view.NavArgument build() {
            androidx.view.NavType<java.lang.Object> navType = this.getHighSpeedVideoFpsRanges;
            if (navType == null) {
                navType = androidx.view.NavType.INSTANCE.inferFromValueType(this.Camera2StreamConfigurationMap);
                kotlin.jvm.internal.Intrinsics.checkNotNull(navType, "");
            }
            return new androidx.view.NavArgument(navType, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }
}
