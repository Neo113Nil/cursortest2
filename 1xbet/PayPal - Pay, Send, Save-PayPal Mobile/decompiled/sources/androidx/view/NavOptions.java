package androidx.view;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\u0018\u00002\u00020\u0001:\u00019BQ\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0011BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0014BQ\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0018J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058G¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0018R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u001a\u0010\t\u001a\u00020\u00058GX\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b,\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00058GX\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b-\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00058GX\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b.\u0010\u0018R\u001a\u0010\f\u001a\u00020\u00058GX\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b/\u0010\u0018R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u00100\u001a\u0004\u0018\u00010\u000f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u0010#R0\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\f\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105R(\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u00100\u001a\u0004\u0018\u00010\u00018\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\b7\u00108"}, d2 = {"Landroidx/navigation/NavOptions;", "", "", "singleTop", "restoreState", "", "popUpToId", "popUpToInclusive", "popUpToSaveState", "enterAnim", "exitAnim", "popEnterAnim", "popExitAnim", "<init>", "(ZZIZZIIII)V", "", "popUpToRoute", "(ZZLjava/lang/String;ZZIIII)V", "Lkotlin/reflect/KClass;", "popUpToRouteClass", "(ZZLkotlin/reflect/KClass;ZZIIII)V", "popUpToRouteObject", "(ZZLjava/lang/Object;ZZIIII)V", "getPopUpTo", "()I", "shouldLaunchSingleTop", "()Z", "shouldRestoreState", "isPopUpToInclusive", "shouldPopUpToSaveState", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Z", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getPopUpToId", "Camera2StreamConfigurationMap", "getEnterAnim", "getExitAnim", "getPopEnterAnim", "getPopExitAnim", "p0", "Ljava/lang/String;", "getPopUpToRoute", "Lkotlin/reflect/KClass;", "getPopUpToRouteClass", "()Lkotlin/reflect/KClass;", "Ljava/lang/Object;", "getPopUpToRouteObject", "()Ljava/lang/Object;", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavOptions {
    private final int enterAnim;
    private final int exitAnim;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final int popEnterAnim;
    private final int popExitAnim;
    private final int popUpToId;
    private java.lang.String popUpToRoute;
    private kotlin.reflect.KClass<?> popUpToRouteClass;
    private java.lang.Object popUpToRouteObject;

    public NavOptions(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = z2;
        this.popUpToId = i;
        this.Camera2StreamConfigurationMap = z3;
        this.getHighSpeedVideoFpsRangesFor = z4;
        this.enterAnim = i2;
        this.exitAnim = i3;
        this.popEnterAnim = i4;
        this.popExitAnim = i5;
    }

    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final int getEnterAnim() {
        return this.enterAnim;
    }

    public final int getExitAnim() {
        return this.exitAnim;
    }

    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    @kotlin.Deprecated(message = "Use popUpToId instead.", replaceWith = @kotlin.ReplaceWith(expression = "popUpToId", imports = {}))
    /* renamed from: getPopUpTo, reason: from getter */
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final java.lang.String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    public final kotlin.reflect.KClass<?> getPopUpToRouteClass() {
        return this.popUpToRouteClass;
    }

    public final java.lang.Object getPopUpToRouteObject() {
        return this.popUpToRouteObject;
    }

    public NavOptions(boolean z, boolean z2, java.lang.String str, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        this(z, z2, androidx.view.NavDestination.INSTANCE.createRoute(str).hashCode(), z3, z4, i, i2, i3, i4);
        this.popUpToRoute = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z, boolean z2, kotlin.reflect.KClass<?> kClass, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        this(z, z2, androidx.view.serialization.RouteSerializerKt.generateHashCode(kotlinx.serialization.SerializersKt.serializer(kClass)), z3, z4, i, i2, i3, i4);
        kotlin.jvm.internal.Intrinsics.checkNotNull(kClass);
        this.popUpToRouteClass = kClass;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z, boolean z2, java.lang.Object obj, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        this(z, z2, androidx.view.serialization.RouteSerializerKt.generateHashCode(kotlinx.serialization.SerializersKt.serializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()))), z3, z4, i, i2, i3, i4);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.popUpToRouteObject = obj;
    }

    /* renamed from: shouldLaunchSingleTop, reason: from getter */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: shouldRestoreState, reason: from getter */
    public final boolean getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: isPopUpToInclusive, reason: from getter */
    public final boolean getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: shouldPopUpToSaveState, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.view.NavOptions)) {
            return false;
        }
        androidx.view.NavOptions navOptions = (androidx.view.NavOptions) other;
        return this.getHighResolutionOutputSizeshNQ4ISI == navOptions.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoSizes == navOptions.getHighSpeedVideoSizes && this.popUpToId == navOptions.popUpToId && kotlin.jvm.internal.Intrinsics.areEqual(this.popUpToRoute, navOptions.popUpToRoute) && kotlin.jvm.internal.Intrinsics.areEqual(this.popUpToRouteClass, navOptions.popUpToRouteClass) && kotlin.jvm.internal.Intrinsics.areEqual(this.popUpToRouteObject, navOptions.popUpToRouteObject) && this.Camera2StreamConfigurationMap == navOptions.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor == navOptions.getHighSpeedVideoFpsRangesFor && this.enterAnim == navOptions.enterAnim && this.exitAnim == navOptions.exitAnim && this.popEnterAnim == navOptions.popEnterAnim && this.popExitAnim == navOptions.popExitAnim;
    }

    public final int hashCode() {
        boolean getHighResolutionOutputSizeshNQ4ISI = getGetHighResolutionOutputSizeshNQ4ISI();
        boolean getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
        int i = this.popUpToId;
        java.lang.String str = this.popUpToRoute;
        int hashCode = str != null ? str.hashCode() : 0;
        kotlin.reflect.KClass<?> kClass = this.popUpToRouteClass;
        int hashCode2 = kClass != null ? kClass.hashCode() : 0;
        java.lang.Object obj = this.popUpToRouteObject;
        int hashCode3 = obj != null ? obj.hashCode() : 0;
        boolean camera2StreamConfigurationMap = getCamera2StreamConfigurationMap();
        boolean getHighSpeedVideoFpsRangesFor = getGetHighSpeedVideoFpsRangesFor();
        int i2 = this.enterAnim;
        return ((((((((((((((((((((((getHighResolutionOutputSizeshNQ4ISI ? 1 : 0) * 31) + (getHighSpeedVideoSizes ? 1 : 0)) * 31) + i) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + (camera2StreamConfigurationMap ? 1 : 0)) * 31) + (getHighSpeedVideoFpsRangesFor ? 1 : 0)) * 31) + i2) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            sb.append("launchSingleTop ");
        }
        if (this.getHighSpeedVideoSizes) {
            sb.append("restoreState ");
        }
        java.lang.String str = this.popUpToRoute;
        if ((str != null || this.popUpToId != -1) && str != null) {
            sb.append("popUpTo(");
            java.lang.String str2 = this.popUpToRoute;
            if (str2 != null) {
                sb.append(str2);
            } else {
                kotlin.reflect.KClass<?> kClass = this.popUpToRouteClass;
                if (kClass != null) {
                    sb.append(kClass);
                } else {
                    java.lang.Object obj = this.popUpToRouteObject;
                    if (obj != null) {
                        sb.append(obj);
                    } else {
                        sb.append("0x");
                        sb.append(java.lang.Integer.toHexString(this.popUpToId));
                    }
                }
            }
            if (this.Camera2StreamConfigurationMap) {
                sb.append(" inclusive");
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        if (this.enterAnim != -1 || this.exitAnim != -1 || this.popEnterAnim != -1 || this.popExitAnim != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(java.lang.Integer.toHexString(this.enterAnim));
            sb.append(" exitAnim=0x");
            sb.append(java.lang.Integer.toHexString(this.exitAnim));
            sb.append(" popEnterAnim=0x");
            sb.append(java.lang.Integer.toHexString(this.popEnterAnim));
            sb.append(" popExitAnim=0x");
            sb.append(java.lang.Integer.toHexString(this.popExitAnim));
            sb.append(")");
        }
        java.lang.String obj2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J'\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u000e\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0012J.\u0010\u000e\u001a\u00020\u0000\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0014J7\u0010\u000e\u001a\u00020\u0000\"\b\b\u0000\u0010\u0013*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0016J1\u0010\u000e\u001a\u00020\u0000\"\b\b\u0000\u0010\u0013*\u00020\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001aJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b \u0010\u001aJ\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010.\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010%R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010%R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010)R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010)"}, d2 = {"Landroidx/navigation/NavOptions$Builder;", "", "<init>", "()V", "", "singleTop", "setLaunchSingleTop", "(Z)Landroidx/navigation/NavOptions$Builder;", "restoreState", "setRestoreState", "", "destinationId", "inclusive", "saveState", "setPopUpTo", "(IZZ)Landroidx/navigation/NavOptions$Builder;", "", "route", "(Ljava/lang/String;ZZ)Landroidx/navigation/NavOptions$Builder;", "T", "(ZZ)Landroidx/navigation/NavOptions$Builder;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;ZZ)Landroidx/navigation/NavOptions$Builder;", "(Ljava/lang/Object;ZZ)Landroidx/navigation/NavOptions$Builder;", "enterAnim", "setEnterAnim", "(I)Landroidx/navigation/NavOptions$Builder;", "exitAnim", "setExitAnim", "popEnterAnim", "setPopEnterAnim", "popExitAnim", "setPopExitAnim", "Landroidx/navigation/NavOptions;", "build", "()Landroidx/navigation/NavOptions;", "getOutputStallDurationlomOqCM", "Z", "Camera2StreamConfigurationMap", "getOutputSizeshNQ4ISI", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "Lkotlin/reflect/KClass;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "Ljava/lang/Object;", "getInputFormats", "getOutputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private java.lang.Object getInputSizeshNQ4ISI;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private boolean getOutputFormats;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private kotlin.reflect.KClass<?> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private boolean getInputFormats;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRanges;

        /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private boolean getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
        private boolean Camera2StreamConfigurationMap;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private int getHighSpeedVideoSizes = -1;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private int getHighSpeedVideoSizesFor = -1;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private int getOutputMinFrameDuration = -1;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private int getOutputSizeshNQ4ISI = -1;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private int getOutputStallDurationlomOqCM = -1;

        public final androidx.navigation.NavOptions.Builder setLaunchSingleTop(boolean singleTop) {
            this.Camera2StreamConfigurationMap = singleTop;
            return this;
        }

        public final androidx.navigation.NavOptions.Builder setRestoreState(boolean restoreState) {
            this.getHighResolutionOutputSizeshNQ4ISI = restoreState;
            return this;
        }

        public static /* synthetic */ androidx.navigation.NavOptions.Builder setPopUpTo$default(androidx.navigation.NavOptions.Builder builder, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return builder.setPopUpTo(i, z, z2);
        }

        public final androidx.navigation.NavOptions.Builder setPopUpTo(int destinationId, boolean inclusive, boolean saveState) {
            this.getHighSpeedVideoSizes = destinationId;
            this.getHighSpeedVideoFpsRanges = null;
            this.getOutputFormats = inclusive;
            this.getInputFormats = saveState;
            return this;
        }

        public static /* synthetic */ androidx.navigation.NavOptions.Builder setPopUpTo$default(androidx.navigation.NavOptions.Builder builder, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return builder.setPopUpTo(str, z, z2);
        }

        public final androidx.navigation.NavOptions.Builder setPopUpTo(java.lang.String route, boolean inclusive, boolean saveState) {
            this.getHighSpeedVideoFpsRanges = route;
            this.getHighSpeedVideoSizes = -1;
            this.getOutputFormats = inclusive;
            this.getInputFormats = saveState;
            return this;
        }

        public static /* synthetic */ androidx.navigation.NavOptions.Builder setPopUpTo$default(androidx.navigation.NavOptions.Builder builder, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z2 = false;
            }
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            builder.setPopUpTo(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), z, z2);
            return builder;
        }

        public final /* synthetic */ <T> androidx.navigation.NavOptions.Builder setPopUpTo(boolean inclusive, boolean saveState) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            setPopUpTo((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), inclusive, saveState);
            return this;
        }

        public static /* synthetic */ androidx.navigation.NavOptions.Builder setPopUpTo$default(androidx.navigation.NavOptions.Builder builder, kotlin.reflect.KClass kClass, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return builder.setPopUpTo(kClass, z, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> androidx.navigation.NavOptions.Builder setPopUpTo(kotlin.reflect.KClass<T> route, boolean inclusive, boolean saveState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
            this.getHighSpeedVideoFpsRangesFor = route;
            this.getHighSpeedVideoSizes = -1;
            this.getOutputFormats = inclusive;
            this.getInputFormats = saveState;
            return this;
        }

        public static /* synthetic */ androidx.navigation.NavOptions.Builder setPopUpTo$default(androidx.navigation.NavOptions.Builder builder, java.lang.Object obj, boolean z, boolean z2, int i, java.lang.Object obj2) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return builder.setPopUpTo((androidx.navigation.NavOptions.Builder) obj, z, z2);
        }

        public final <T> androidx.navigation.NavOptions.Builder setPopUpTo(T route, boolean inclusive, boolean saveState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
            this.getInputSizeshNQ4ISI = route;
            setPopUpTo(androidx.view.serialization.RouteSerializerKt.generateHashCode(kotlinx.serialization.SerializersKt.serializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(route.getClass()))), inclusive, saveState);
            return this;
        }

        public final androidx.navigation.NavOptions.Builder setEnterAnim(int enterAnim) {
            this.getHighSpeedVideoSizesFor = enterAnim;
            return this;
        }

        public final androidx.navigation.NavOptions.Builder setExitAnim(int exitAnim) {
            this.getOutputMinFrameDuration = exitAnim;
            return this;
        }

        public final androidx.navigation.NavOptions.Builder setPopEnterAnim(int popEnterAnim) {
            this.getOutputSizeshNQ4ISI = popEnterAnim;
            return this;
        }

        public final androidx.navigation.NavOptions.Builder setPopExitAnim(int popExitAnim) {
            this.getOutputStallDurationlomOqCM = popExitAnim;
            return this;
        }

        public final androidx.view.NavOptions build() {
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            if (str != null) {
                return new androidx.view.NavOptions(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, str, this.getOutputFormats, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI, this.getOutputStallDurationlomOqCM);
            }
            kotlin.reflect.KClass<?> kClass = this.getHighSpeedVideoFpsRangesFor;
            if (kClass != null) {
                return new androidx.view.NavOptions(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, kClass, this.getOutputFormats, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI, this.getOutputStallDurationlomOqCM);
            }
            java.lang.Object obj = this.getInputSizeshNQ4ISI;
            if (obj != null) {
                boolean z = this.Camera2StreamConfigurationMap;
                boolean z2 = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                return new androidx.view.NavOptions(z, z2, obj, this.getOutputFormats, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI, this.getOutputStallDurationlomOqCM);
            }
            return new androidx.view.NavOptions(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI, this.getOutputStallDurationlomOqCM);
        }

        public final /* synthetic */ <T> androidx.navigation.NavOptions.Builder setPopUpTo(boolean z) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            setPopUpTo((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), z, false);
            return this;
        }

        public final <T> androidx.navigation.NavOptions.Builder setPopUpTo(kotlin.reflect.KClass<T> kClass, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
            return setPopUpTo$default(this, (kotlin.reflect.KClass) kClass, z, false, 4, (java.lang.Object) null);
        }

        public final androidx.navigation.NavOptions.Builder setPopUpTo(java.lang.String str, boolean z) {
            return setPopUpTo$default(this, str, z, false, 4, (java.lang.Object) null);
        }

        public final <T> androidx.navigation.NavOptions.Builder setPopUpTo(T t, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
            return setPopUpTo$default(this, (java.lang.Object) t, z, false, 4, (java.lang.Object) null);
        }

        public final androidx.navigation.NavOptions.Builder setPopUpTo(int i, boolean z) {
            return setPopUpTo$default(this, i, z, false, 4, (java.lang.Object) null);
        }
    }
}
