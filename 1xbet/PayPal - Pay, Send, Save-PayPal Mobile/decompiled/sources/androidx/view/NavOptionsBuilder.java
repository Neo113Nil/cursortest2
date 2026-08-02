package androidx.view;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\u000fJ:\u0010\u000b\u001a\u00020\b\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00012\u0019\b\n\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0011J>\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0010*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\u0013J:\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0010*\u00020\u00012\u0006\u0010\u000e\u001a\u00028\u00002\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\u0014J&\u0010\u0017\u001a\u00020\b2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u00020\u001f8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u001f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R*\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u0010\u000b\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048G@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\b2\u0010\u0003\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R.\u00103\u001a\u0004\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\r8\u0007@CX\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010:\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010!R\u0016\u0010;\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010!R6\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\f\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0007@CX\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR.\u0010B\u001a\u0004\u0018\u00010\u00012\b\u0010)\u001a\u0004\u0018\u00010\u00018\u0007@CX\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/navigation/NavOptionsBuilder;", "", "<init>", "()V", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/PopUpToBuilder;", "", "Lkotlin/ExtensionFunctionType;", "popUpToBuilder", "popUpTo", "(ILkotlin/jvm/functions/Function1;)V", "", "route", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "T", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/AnimBuilder;", "animBuilder", "anim", "Landroidx/navigation/NavOptions;", "build$navigation_common_release", "()Landroidx/navigation/NavOptions;", "Landroidx/navigation/NavOptions$Builder;", "getHighSpeedVideoSizes", "Landroidx/navigation/NavOptions$Builder;", "Camera2StreamConfigurationMap", "", "launchSingleTop", "Z", "getLaunchSingleTop", "()Z", "setLaunchSingleTop", "(Z)V", "restoreState", "getRestoreState", "setRestoreState", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "popUpToId", com.visa.cbp.getEncExpo.warmup, "getPopUpToId", "()I", "setPopUpToId$navigation_common_release", "(I)V", "getPopUpTo", "setPopUpTo", "getPopUpTo$annotations", "popUpToRoute", "Ljava/lang/String;", "getPopUpToRoute", "()Ljava/lang/String;", "setPopUpToRoute", "(Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "popUpToRouteClass", "Lkotlin/reflect/KClass;", "getPopUpToRouteClass", "()Lkotlin/reflect/KClass;", "setPopUpToRouteClass", "(Lkotlin/reflect/KClass;)V", "popUpToRouteObject", "Ljava/lang/Object;", "getPopUpToRouteObject", "()Ljava/lang/Object;", "setPopUpToRouteObject", "(Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
@androidx.view.NavOptionsDsl
/* loaded from: classes.dex */
public final class NavOptionsBuilder {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;
    private boolean launchSingleTop;
    private java.lang.String popUpToRoute;
    private kotlin.reflect.KClass<?> popUpToRouteClass;
    private java.lang.Object popUpToRouteObject;
    private boolean restoreState;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.navigation.NavOptions.Builder Camera2StreamConfigurationMap = new androidx.navigation.NavOptions.Builder();
    private int popUpToId = -1;

    @kotlin.Deprecated(message = "Use the popUpToId property.")
    public static /* synthetic */ void getPopUpTo$annotations() {
    }

    public final boolean getLaunchSingleTop() {
        return this.launchSingleTop;
    }

    public final void setLaunchSingleTop(boolean z) {
        this.launchSingleTop = z;
    }

    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public final void setRestoreState(boolean z) {
        this.restoreState = z;
    }

    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final void setPopUpToId$navigation_common_release(int i) {
        this.popUpToId = i;
        this.getHighSpeedVideoFpsRanges = false;
    }

    /* renamed from: getPopUpTo, reason: from getter */
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    @kotlin.Deprecated(message = "Use the popUpTo function and passing in the id.")
    public final void setPopUpTo(int i) {
        popUpTo$default(this, i, (kotlin.jvm.functions.Function1) null, 2, (java.lang.Object) null);
    }

    public final java.lang.String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    private final void setPopUpToRoute(java.lang.String str) {
        if (str != null) {
            if (kotlin.text.StringsKt.isBlank(str)) {
                throw new java.lang.IllegalArgumentException("Cannot pop up to an empty route".toString());
            }
            this.popUpToRoute = str;
            this.getHighSpeedVideoFpsRanges = false;
        }
    }

    public final kotlin.reflect.KClass<?> getPopUpToRouteClass() {
        return this.popUpToRouteClass;
    }

    private final void setPopUpToRouteClass(kotlin.reflect.KClass<?> kClass) {
        if (kClass != null) {
            this.popUpToRouteClass = kClass;
            this.getHighSpeedVideoFpsRanges = false;
        }
    }

    public final java.lang.Object getPopUpToRouteObject() {
        return this.popUpToRouteObject;
    }

    private final void setPopUpToRouteObject(java.lang.Object obj) {
        if (obj != null) {
            this.popUpToRouteObject = obj;
            this.getHighSpeedVideoFpsRanges = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(androidx.view.NavOptionsBuilder navOptionsBuilder, int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.NavOptionsBuilder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.view.NavOptionsBuilder.$r8$lambda$fK7z0I2TrEJu01JjPGCSnLzcVGg((androidx.view.PopUpToBuilder) obj2);
                }
            };
        }
        navOptionsBuilder.popUpTo(i, (kotlin.jvm.functions.Function1<? super androidx.view.PopUpToBuilder, kotlin.Unit>) function1);
    }

    public final void popUpTo(int id, kotlin.jvm.functions.Function1<? super androidx.view.PopUpToBuilder, kotlin.Unit> popUpToBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popUpToBuilder, "");
        setPopUpToId$navigation_common_release(id);
        setPopUpToRoute(null);
        androidx.view.PopUpToBuilder popUpToBuilder2 = new androidx.view.PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.getHighSpeedVideoFpsRanges = popUpToBuilder2.getInclusive();
        this.getHighSpeedVideoFpsRangesFor = popUpToBuilder2.getSaveState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(androidx.view.NavOptionsBuilder navOptionsBuilder, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.NavOptionsBuilder$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.view.NavOptionsBuilder.$r8$lambda$2MB65HSluePLwsCKNvdptzdoFZs((androidx.view.PopUpToBuilder) obj2);
                }
            };
        }
        navOptionsBuilder.popUpTo(str, (kotlin.jvm.functions.Function1<? super androidx.view.PopUpToBuilder, kotlin.Unit>) function1);
    }

    public final void popUpTo(java.lang.String route, kotlin.jvm.functions.Function1<? super androidx.view.PopUpToBuilder, kotlin.Unit> popUpToBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popUpToBuilder, "");
        setPopUpToRoute(route);
        setPopUpToId$navigation_common_release(-1);
        androidx.view.PopUpToBuilder popUpToBuilder2 = new androidx.view.PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.getHighSpeedVideoFpsRanges = popUpToBuilder2.getInclusive();
        this.getHighSpeedVideoFpsRangesFor = popUpToBuilder2.getSaveState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(androidx.view.NavOptionsBuilder navOptionsBuilder, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.view.PopUpToBuilder, kotlin.Unit>() { // from class: androidx.navigation.NavOptionsBuilder$popUpTo$3
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.view.PopUpToBuilder popUpToBuilder) {
                    invoke2(popUpToBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.view.PopUpToBuilder popUpToBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popUpToBuilder, "");
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        navOptionsBuilder.popUpTo(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), (kotlin.jvm.functions.Function1<? super androidx.view.PopUpToBuilder, kotlin.Unit>) function1);
    }

    public final /* synthetic */ <T> void popUpTo(kotlin.jvm.functions.Function1<? super androidx.view.PopUpToBuilder, kotlin.Unit> popUpToBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popUpToBuilder, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        popUpTo((kotlin.reflect.KClass) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), popUpToBuilder);
    }

    public final <T> void popUpTo(kotlin.reflect.KClass<T> route, kotlin.jvm.functions.Function1<? super androidx.view.PopUpToBuilder, kotlin.Unit> popUpToBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popUpToBuilder, "");
        setPopUpToRouteClass(route);
        setPopUpToId$navigation_common_release(-1);
        setPopUpToRoute(null);
        androidx.view.PopUpToBuilder popUpToBuilder2 = new androidx.view.PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.getHighSpeedVideoFpsRanges = popUpToBuilder2.getInclusive();
        this.getHighSpeedVideoFpsRangesFor = popUpToBuilder2.getSaveState();
    }

    public final <T> void popUpTo(T route, kotlin.jvm.functions.Function1<? super androidx.view.PopUpToBuilder, kotlin.Unit> popUpToBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popUpToBuilder, "");
        setPopUpToRouteObject(route);
        setPopUpToId$navigation_common_release(-1);
        setPopUpToRoute(null);
        androidx.view.PopUpToBuilder popUpToBuilder2 = new androidx.view.PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.getHighSpeedVideoFpsRanges = popUpToBuilder2.getInclusive();
        this.getHighSpeedVideoFpsRangesFor = popUpToBuilder2.getSaveState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popUpTo$default(androidx.view.NavOptionsBuilder navOptionsBuilder, java.lang.Object obj, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.NavOptionsBuilder$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return androidx.view.NavOptionsBuilder.$r8$lambda$2IrR8UNmMK5A1oEZuvDJvvL1bOI((androidx.view.PopUpToBuilder) obj3);
                }
            };
        }
        navOptionsBuilder.popUpTo((androidx.view.NavOptionsBuilder) obj, (kotlin.jvm.functions.Function1<? super androidx.view.PopUpToBuilder, kotlin.Unit>) function1);
    }

    public final void anim(kotlin.jvm.functions.Function1<? super androidx.view.AnimBuilder, kotlin.Unit> animBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animBuilder, "");
        androidx.view.AnimBuilder animBuilder2 = new androidx.view.AnimBuilder();
        animBuilder.invoke(animBuilder2);
        this.Camera2StreamConfigurationMap.setEnterAnim(animBuilder2.getEnter()).setExitAnim(animBuilder2.getExit()).setPopEnterAnim(animBuilder2.getPopEnter()).setPopExitAnim(animBuilder2.getPopExit());
    }

    public final androidx.view.NavOptions build$navigation_common_release() {
        androidx.navigation.NavOptions.Builder builder = this.Camera2StreamConfigurationMap;
        builder.setLaunchSingleTop(this.launchSingleTop);
        builder.setRestoreState(this.restoreState);
        java.lang.String str = this.popUpToRoute;
        if (str != null) {
            builder.setPopUpTo(str, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
        } else {
            kotlin.reflect.KClass<?> kClass = this.popUpToRouteClass;
            if (kClass != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(kClass);
                builder.setPopUpTo((kotlin.reflect.KClass) kClass, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
            } else {
                java.lang.Object obj = this.popUpToRouteObject;
                if (obj != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                    builder.setPopUpTo((androidx.navigation.NavOptions.Builder) obj, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
                } else {
                    builder.setPopUpTo(this.popUpToId, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
                }
            }
        }
        return builder.build();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2IrR8UNmMK5A1oEZuvDJvvL1bOI(androidx.view.PopUpToBuilder popUpToBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popUpToBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2MB65HSluePLwsCKNvdptzdoFZs(androidx.view.PopUpToBuilder popUpToBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popUpToBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fK7z0I2TrEJu01JjPGCSnLzcVGg(androidx.view.PopUpToBuilder popUpToBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popUpToBuilder, "");
        return kotlin.Unit.INSTANCE;
    }
}
