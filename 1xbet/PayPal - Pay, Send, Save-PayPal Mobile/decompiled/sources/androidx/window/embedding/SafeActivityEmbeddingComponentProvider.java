package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\bB\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\r\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0013J\r\u0010\u0014\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0015J\r\u0010\u0016\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u001bJ\r\u0010\u001c\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u001dJ\r\u0010\u001e\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u001fJ\r\u0010 \u001a\u00020\u0011H\u0001¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010'\u001a\u00020\u0011H\u0002J\b\u0010(\u001a\u00020\u0011H\u0002J\b\u0010)\u001a\u00020\u0011H\u0002J\b\u0010*\u001a\u00020\u0011H\u0002J\b\u0010+\u001a\u00020\u0011H\u0002J\b\u0010,\u001a\u00020\u0011H\u0002J\b\u0010-\u001a\u00020\u0011H\u0002J\b\u0010.\u001a\u00020\u0011H\u0002J\b\u0010/\u001a\u00020\u0011H\u0002J\b\u00100\u001a\u00020\u0011H\u0002J\b\u00101\u001a\u00020\u0011H\u0002J\b\u00102\u001a\u00020\u0011H\u0002J\b\u00103\u001a\u00020\u0011H\u0002J\b\u00104\u001a\u00020\u0011H\u0002J\b\u00105\u001a\u00020\u0011H\u0002J\b\u00106\u001a\u00020\u0011H\u0002J\b\u00107\u001a\u00020\u0011H\u0002J\b\u00108\u001a\u00020\u0011H\u0002J\b\u00109\u001a\u00020\u0011H\u0002J\b\u0010:\u001a\u00020\u0011H\u0002J\b\u0010;\u001a\u00020\u0011H\u0002J\b\u0010<\u001a\u00020\u0011H\u0002J\b\u0010=\u001a\u00020\u0011H\u0002J\b\u0010>\u001a\u00020\u0011H\u0002J\b\u0010?\u001a\u00020\u0011H\u0002J\b\u0010@\u001a\u00020\u0011H\u0002J\b\u0010A\u001a\u00020\u0011H\u0002J\b\u0010B\u001a\u00020\u0011H\u0002J\b\u0010C\u001a\u00020\u0011H\u0002J\b\u0010D\u001a\u00020\u0011H\u0002J\b\u0010E\u001a\u00020\u0011H\u0002J\b\u0010F\u001a\u00020\u0011H\u0002J\b\u0010G\u001a\u00020\u0011H\u0002J\b\u0010H\u001a\u00020\u0011H\u0002J\b\u0010I\u001a\u00020\u0011H\u0002J\b\u0010J\u001a\u00020\u0011H\u0002J\b\u0010K\u001a\u00020\u0011H\u0002J\b\u0010L\u001a\u00020\u0011H\u0002J\b\u0010M\u001a\u00020\u0011H\u0002J\b\u0010N\u001a\u00020\u0011H\u0002J\b\u0010O\u001a\u00020\u0011H\u0002J\b\u0010P\u001a\u00020\u0011H\u0002J\b\u0010Q\u001a\u00020\u0011H\u0002J\b\u0010R\u001a\u00020\u0011H\u0002J\b\u0010S\u001a\u00020\u0011H\u0002J\b\u0010T\u001a\u00020\u0011H\u0002J\b\u0010U\u001a\u00020\u0011H\u0002J\b\u0010V\u001a\u00020\u0011H\u0002J\b\u0010W\u001a\u00020\u0011H\u0002J\b\u0010X\u001a\u00020\u0011H\u0002J\b\u0010Y\u001a\u00020\u0011H\u0002J\b\u0010Z\u001a\u00020\u0011H\u0002J\b\u0010[\u001a\u00020\u0011H\u0002J\b\u0010\\\u001a\u00020\u0011H\u0002J\b\u0010]\u001a\u00020\u0011H\u0002J\b\u0010^\u001a\u00020\u0011H\u0002J\b\u0010_\u001a\u00020\u0011H\u0002J\b\u0010`\u001a\u00020\u0011H\u0002J\b\u0010a\u001a\u00020\u0011H\u0002J\b\u0010b\u001a\u00020\u0011H\u0002J\b\u0010c\u001a\u00020\u0011H\u0002J\b\u0010d\u001a\u00020\u0011H\u0002J\b\u0010e\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010#\u001a\u0006\u0012\u0002\b\u00030$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006f"}, d2 = {"Landroidx/window/embedding/SafeActivityEmbeddingComponentProvider;", "", "loader", "Ljava/lang/ClassLoader;", "consumerAdapter", "Landroidx/window/core/ConsumerAdapter;", "windowExtensions", "Landroidx/window/extensions/WindowExtensions;", "<init>", "(Ljava/lang/ClassLoader;Landroidx/window/core/ConsumerAdapter;Landroidx/window/extensions/WindowExtensions;)V", "safeWindowExtensionsProvider", "Landroidx/window/SafeWindowExtensionsProvider;", "activityEmbeddingComponent", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "getActivityEmbeddingComponent", "()Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "canUseActivityEmbeddingComponent", "", "isActivityEmbeddingComponentAccessible", "isActivityEmbeddingComponentAccessible$window_release", "hasValidVendorApiLevel1", "hasValidVendorApiLevel1$window_release", "hasValidVendorApiLevel2", "hasValidVendorApiLevel2$window_release", "hasValidVendorApiLevel3", "hasValidVendorApiLevel3$window_release", "hasValidVendorApiLevel5", "hasValidVendorApiLevel5$window_release", "hasValidVendorApiLevel6", "hasValidVendorApiLevel6$window_release", "hasValidVendorApiLevel7", "hasValidVendorApiLevel7$window_release", "hasValidVendorApiLevel8", "hasValidVendorApiLevel8$window_release", "isOverlayFeatureValid", "activityEmbeddingComponentClass", "Ljava/lang/Class;", "getActivityEmbeddingComponentClass", "()Ljava/lang/Class;", "isActivityEmbeddingComponentValid", "isMethodSetEmbeddingRulesValid", "isMethodIsActivityEmbeddedValid", "isMethodSetSplitInfoCallbackJavaConsumerValid", "isMethodGetSplitRatioValid", "isMethodGetLayoutDirectionValid", "isClassActivityRuleValid", "isClassActivityRuleBuilderLevel1Valid", "isClassSplitInfoValid", "isClassSplitPairRuleValid", "isClassSplitPairRuleBuilderLevel1Valid", "isClassSplitPlaceholderRuleValid", "isClassSplitPlaceholderRuleBuilderLevel1Valid", "isMethodSetSplitInfoCallbackWindowConsumerValid", "isMethodClearSplitInfoCallbackValid", "isMethodSplitAttributesCalculatorValid", "isMethodGetSplitAttributesValid", "isMethodGetFinishPrimaryWithPlaceholderValid", "isMethodGetDefaultSplitAttributesValid", "isClassActivityRuleBuilderLevel2Valid", "isClassEmbeddingRuleValid", "isClassSplitAttributesValid", "isClassSplitAttributesCalculatorParamsValid", "isClassSplitTypeValid", "isClassSplitPairRuleBuilderLevel2Valid", "isClassSplitPlaceholderRuleBuilderLevel2Valid", "isMethodInvalidateTopVisibleSplitAttributesValid", "isMethodUpdateSplitAttributesValid", "isMethodSplitInfoGetTokenValid", "isActivityStackGetActivityStackTokenValid", "isMethodRegisterActivityStackCallbackValid", "isMethodUnregisterActivityStackCallbackValid", "isMethodPinUnpinTopActivityStackValid", "isMethodUpdateSplitAttributesWithTokenValid", "isMethodGetSplitInfoTokenValid", "isClassAnimationBackgroundValid", "isClassActivityStackTokenValid", "isClassWindowAttributesValid", "isClassSplitInfoTokenValid", "isMethodGetEmbeddedActivityWindowInfoValid", "isMethodSetEmbeddedActivityWindowInfoCallbackValid", "isMethodClearEmbeddedActivityWindowInfoCallbackValid", "isMethodGetDividerAttributesValid", "isMethodSetDividerAttributesValid", "isClassEmbeddedActivityWindowInfoValid", "isClassDividerAttributesValid", "isClassDividerAttributesBuilderValid", "isMethodGetAnimationParamsValid", "isMethodSetAnimationParamsValid", "isMethodIsDraggingToFullscreenAllowedValid", "isMethodSetDraggingToFullscreenAllowedValid", "isClassAnimationParamsValid", "isClassAnimationParamsBuilderValid", "isActivityStackGetTagValid", "isMethodGetActivityStackTokenValid", "isClassParentContainerInfoValid", "isMethodGetParentContainerInfoValid", "isMethodSetActivityStackAttributesCalculatorValid", "isMethodClearActivityStackAttributesCalculatorValid", "isMethodUpdateActivityStackAttributesValid", "isClassActivityStackAttributesValid", "isClassActivityStackAttributesBuilderValid", "isClassActivityStackAttributesCalculatorParamsValid", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SafeActivityEmbeddingComponentProvider {
    private final java.lang.ClassLoader Camera2StreamConfigurationMap;
    private final androidx.window.extensions.WindowExtensions getHighSpeedVideoFpsRanges;
    private final androidx.window.SafeWindowExtensionsProvider getHighSpeedVideoFpsRangesFor;
    private final androidx.window.core.ConsumerAdapter getHighSpeedVideoSizes;

    public SafeActivityEmbeddingComponentProvider(java.lang.ClassLoader classLoader, androidx.window.core.ConsumerAdapter consumerAdapter, androidx.window.extensions.WindowExtensions windowExtensions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAdapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowExtensions, "");
        this.Camera2StreamConfigurationMap = classLoader;
        this.getHighSpeedVideoSizes = consumerAdapter;
        this.getHighSpeedVideoFpsRanges = windowExtensions;
        this.getHighSpeedVideoFpsRangesFor = new androidx.window.SafeWindowExtensionsProvider(classLoader);
    }

    public final boolean isActivityEmbeddingComponentAccessible$window_release() {
        return this.getHighSpeedVideoFpsRangesFor.isWindowExtensionsValid$window_release() && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("WindowExtensions#getActivityEmbeddingComponent is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda57
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$HihvsFlouJ1RwrFWPt9Iyp9U3rY(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        });
    }

    public final boolean hasValidVendorApiLevel2$window_release() {
        return hasValidVendorApiLevel1$window_release() && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9453$r8$lambda$fGY3N7EiL7J1xDxNSH04cEN5Q(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#clearSplitInfoCallback is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$IZdi6yOVbCUIChxGFItI2jriG7E(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setSplitAttributesCalculator is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$xzdlI_NcEeBxjawUpAkGr2_kw24(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("SplitInfo#getSplitAttributes is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda60
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$i_8GeoJ40gJvkSul0dVGTqdSqnU());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("SplitPlaceholderRule#getFinishPrimaryWithPlaceholder is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9451$r8$lambda$de2ug5m788G0HubQB3rKEJZvcQ());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("SplitRule#getDefaultSplitAttributes is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9446$r8$lambda$VeAfsOBcn6ELZCYaKQ0fnB6GxE());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class ActivityRule.Builder is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9449$r8$lambda$ayomV3m1GE8fWNgZGRrhNJxeWU());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class EmbeddingRule is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9438$r8$lambda$DXUycE1lpvid4JFnKV9dOpam_8());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class SplitAttributes is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$I5rFGUoHGmHLN1uIrwQ3PwZe8Mo());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class SplitAttributesCalculatorParams is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$sIJ3U7V7ItLOTjaZy1Yf1jCwgnw());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class SplitAttributes.SplitType is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$QZQ10NGwfkhcflLXvChvUvlplHU());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class SplitPairRule.Builder is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$XqEAcIEjvtQpH6jkPYnuAN_6Xig());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class SplitPlaceholderRule.Builder is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9444$r8$lambda$TAU8Jn3Z7mKieWpx9Qx4m2Myco());
            }
        });
    }

    public final boolean hasValidVendorApiLevel3$window_release() {
        return hasValidVendorApiLevel2$window_release() && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("#invalidateTopVisibleSplitAttributes is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$ygOGGy9Hhj_ZFMpTNJVZdU4IgYE(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("#updateSplitAttributes is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$4225NzZXqFd3fE0wRDHjJmnqmV8(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("SplitInfo#getToken is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$8PQnvQVq3PZdScEpTsJ2juKd3M4());
            }
        });
    }

    public final boolean hasValidVendorApiLevel5$window_release() {
        return hasValidVendorApiLevel3$window_release() && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("ActivityStack#getActivityToken is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9439$r8$lambda$ISj8Wd3uqBYFSR3Raz7NVx61BI());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("registerActivityStackCallback is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda55
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9436$r8$lambda$4UxfmMrputVd2jgOSsUPTNuRLw(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("unregisterActivityStackCallback is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda61
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$Qo_ZJOlgabCdyFUS7XXdNNeWrBk(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("#pin(unPin)TopActivityStack is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$Ui238Hpqfg5lJCWuZBdgCZnhqQc(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("updateSplitAttributes is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda56
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9452$r8$lambda$f2w9ZFLuGI5ahi6NOdlk4TqzIc(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("SplitInfo#getSplitInfoToken is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$aWs8zkfFyRJjVQAkJ6pGG4LUIUM());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class AnimationBackground is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9447$r8$lambda$ZcdoCQ_gvZLnR9v64rMcRyQWoA());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class ActivityStack.Token is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda62
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$ojbaezeEMuLI5hhIPvwsWi0onMI());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class WindowAttributes is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9440$r8$lambda$JTy4cd9yEATsI4aqp23N1R3I5Y());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("SplitInfo.Token is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$cX9vey6aSLx7ZG27tUI2BkOurUk());
            }
        });
    }

    public final boolean hasValidVendorApiLevel6$window_release() {
        return hasValidVendorApiLevel5$window_release() && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#getEmbeddedActivityWindowInfo is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$l_jm1_Wiqx6A4HT_qgdQD3qB38w(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setEmbeddedActivityWindowInfoCallback is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$N9yKUhVxAWS8YmwoAbmXvbxFLgo(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#clearEmbeddedActivityWindowInfoCallback is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$F_nm07fcFC7y4pV0QZRh2WtIXEc(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("SplitAttributes#getDividerAttributes is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$QlVffp_OYIzDYu2KeJEEoel5Thk());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("SplitAttributes#setDividerAttributes is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$3fQLyh5T8yvNd1oYaHpGHo14aKo());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class EmbeddedActivityWindowInfo is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$kkzcH1wjhI0SoUbIXB1XsrMDIi4());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class DividerAttributes is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$Y7CXtr9E69WIogo8BI5B3mxRXus());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class DividerAttributes.Builder is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$p9FBJHdMdKphH13iERLJSrROgy8());
            }
        });
    }

    public final boolean hasValidVendorApiLevel7$window_release() {
        return hasValidVendorApiLevel6$window_release() && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("SplitAttributes#getAnimationParams is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$Vgl7iivqjFiNXUBPIBkI2tG03nI());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("SplitAttributes#setAnimationParams is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda58
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9437$r8$lambda$5S7a1iW0rCmr3mn54bTArkisEM());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("DividerAttributes#isDraggingToFullscreenAllowed is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$lEiJc7AvlhpWsBAnhVkebrjOOs4());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("DividerAttributes.Builder#setDraggingToFullscreenAllowed is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$6UDL8vWKABNOv02yGjmMmlWhio0());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class AnimationParams is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9435$r8$lambda$7EW84TrooPkcljY6cZ3w8w2p80());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class AnimationParams.Builder is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$JVyG9bZx_mQUqbUkeaJ1mXH1gSU());
            }
        });
    }

    public final boolean hasValidVendorApiLevel8$window_release() {
        return hasValidVendorApiLevel7$window_release();
    }

    /* renamed from: $r8$lambda$-7EW84TrooPkcljY6cZ3w8w2p80, reason: not valid java name */
    public static /* synthetic */ boolean m9435$r8$lambda$7EW84TrooPkcljY6cZ3w8w2p80() {
        java.lang.reflect.Field declaredField = androidx.window.extensions.embedding.AnimationParams.class.getDeclaredField("DEFAULT_ANIMATION_RESOURCES_ID");
        java.lang.reflect.Method method = androidx.window.extensions.embedding.AnimationParams.class.getMethod("getAnimationBackground", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.AnimationParams.class.getMethod("getOpenAnimationResId", new java.lang.Class[0]);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.AnimationParams.class.getMethod("getCloseAnimationResId", new java.lang.Class[0]);
        java.lang.reflect.Method method4 = androidx.window.extensions.embedding.AnimationParams.class.getMethod("getChangeAnimationResId", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(declaredField);
        if (reflectionUtils.isPublic$window_release(declaredField)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method);
            if (reflectionUtils2.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.AnimationBackground.class)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
                if (reflectionUtils3.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, java.lang.Integer.TYPE)) {
                    androidx.window.reflection.ReflectionUtils reflectionUtils4 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                    if (reflectionUtils4.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, java.lang.Integer.TYPE)) {
                        androidx.window.reflection.ReflectionUtils reflectionUtils5 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(method4);
                        if (reflectionUtils5.isPublic$window_release(method4) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method4, java.lang.Integer.TYPE)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$1KmC7jh8PCDmPdEdZCwy3UHgSDM(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("getActivityStackToken", java.lang.String.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.ActivityStack.Token.class);
    }

    public static /* synthetic */ boolean $r8$lambda$3fQLyh5T8yvNd1oYaHpGHo14aKo() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitAttributes.Builder.class.getMethod("setDividerAttributes", androidx.window.extensions.embedding.DividerAttributes.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.SplitAttributes.Builder.class);
    }

    public static /* synthetic */ boolean $r8$lambda$4225NzZXqFd3fE0wRDHjJmnqmV8(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("updateSplitAttributes", android.os.IBinder.class, androidx.window.extensions.embedding.SplitAttributes.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method);
    }

    /* renamed from: $r8$lambda$4UxfmMrputVd2jgO-SsUPTNuRLw, reason: not valid java name */
    public static /* synthetic */ boolean m9436$r8$lambda$4UxfmMrputVd2jgOSsUPTNuRLw(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("registerActivityStackCallback", java.util.concurrent.Executor.class, androidx.window.extensions.core.util.function.Consumer.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method);
    }

    /* renamed from: $r8$lambda$5S7a1iW0rCmr3mn54-bTArkisEM, reason: not valid java name */
    public static /* synthetic */ boolean m9437$r8$lambda$5S7a1iW0rCmr3mn54bTArkisEM() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitAttributes.Builder.class.getMethod("setAnimationParams", androidx.window.extensions.embedding.AnimationParams.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.SplitAttributes.Builder.class);
    }

    public static /* synthetic */ boolean $r8$lambda$6UDL8vWKABNOv02yGjmMmlWhio0() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.DividerAttributes.Builder.class.getMethod("setDraggingToFullscreenAllowed", java.lang.Boolean.TYPE);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.DividerAttributes.Builder.class);
    }

    public static /* synthetic */ boolean $r8$lambda$8PQnvQVq3PZdScEpTsJ2juKd3M4() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitInfo.class.getMethod("getToken", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, android.os.IBinder.class);
    }

    public static /* synthetic */ boolean $r8$lambda$AttXeL2DTxsCJ8kly2du9uwwQME() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.ActivityStackAttributes.class.getMethod("getRelativeBounds", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.ActivityStackAttributes.class.getMethod("getWindowAttributes", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, android.graphics.Rect.class)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, androidx.window.extensions.embedding.WindowAttributes.class)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$C07S8CKXUibXuuEEyUiE2MZLw2c() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitPairRule.Builder.class.getMethod("setSplitRatio", java.lang.Float.TYPE);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.SplitPairRule.Builder.class.getMethod("setLayoutDirection", java.lang.Integer.TYPE);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (!reflectionUtils.isPublic$window_release(method) || !androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.SplitPairRule.Builder.class)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
        return reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, androidx.window.extensions.embedding.SplitPairRule.Builder.class);
    }

    /* renamed from: $r8$lambda$DXUycE1lpvid4JFnK-V9dOpam_8, reason: not valid java name */
    public static /* synthetic */ boolean m9438$r8$lambda$DXUycE1lpvid4JFnKV9dOpam_8() {
        java.lang.reflect.Method method = androidx.window.embedding.EmbeddingRule.class.getMethod("getTag", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.String.class);
    }

    public static /* synthetic */ boolean $r8$lambda$Dqh4BkwWZso5Hc8SKGZewmRiPX0(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("isActivityEmbedded", android.app.Activity.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.Boolean.TYPE);
    }

    public static /* synthetic */ boolean $r8$lambda$FNd_U_wsnLj326SmLuWg0AWINu4() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitPlaceholderRule.class.getMethod("getPlaceholderIntent", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.SplitPlaceholderRule.class.getMethod("isSticky", new java.lang.Class[0]);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.SplitPlaceholderRule.class.getMethod("getFinishPrimaryWithSecondary", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, android.content.Intent.class)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, java.lang.Boolean.TYPE)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                if (reflectionUtils3.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, java.lang.Integer.TYPE)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$F_nm07fcFC7y4pV0QZRh2WtIXEc(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("clearEmbeddedActivityWindowInfoCallback", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method);
    }

    public static /* synthetic */ boolean $r8$lambda$HihvsFlouJ1RwrFWPt9Iyp9U3rY(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.reflect.Method method = safeActivityEmbeddingComponentProvider.getHighSpeedVideoFpsRangesFor.getWindowExtensionsClass$window_release().getMethod("getActivityEmbeddingComponent", new java.lang.Class[0]);
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, loadClass);
    }

    public static /* synthetic */ boolean $r8$lambda$I5rFGUoHGmHLN1uIrwQ3PwZe8Mo() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitAttributes.class.getMethod("getLayoutDirection", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.SplitAttributes.class.getMethod("getSplitType", new java.lang.Class[0]);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.SplitAttributes.Builder.class.getMethod("setSplitType", androidx.window.extensions.embedding.SplitAttributes.SplitType.class);
        java.lang.reflect.Method method4 = androidx.window.extensions.embedding.SplitAttributes.Builder.class.getMethod("setLayoutDirection", java.lang.Integer.TYPE);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.Integer.TYPE)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, androidx.window.extensions.embedding.SplitAttributes.SplitType.class)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                if (reflectionUtils3.isPublic$window_release(method3)) {
                    androidx.window.reflection.ReflectionUtils reflectionUtils4 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(method4);
                    if (reflectionUtils4.isPublic$window_release(method4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$IJXxFr4GaJQmKVabmjB6EQPaVqU() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.ParentContainerInfo.class.getMethod("getWindowMetrics", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.ParentContainerInfo.class.getMethod("getConfiguration", new java.lang.Class[0]);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.ParentContainerInfo.class.getMethod("getWindowLayoutInfo", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, android.view.WindowMetrics.class)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, android.content.res.Configuration.class)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                if (reflectionUtils3.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, androidx.window.extensions.layout.WindowLayoutInfo.class)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: $r8$lambda$ISj8Wd3uqBYFSR3Raz7N-Vx61BI, reason: not valid java name */
    public static /* synthetic */ boolean m9439$r8$lambda$ISj8Wd3uqBYFSR3Raz7NVx61BI() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.ActivityStack.class.getMethod("getActivityStackToken", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.ActivityStack.Token.class);
    }

    public static /* synthetic */ boolean $r8$lambda$IZdi6yOVbCUIChxGFItI2jriG7E(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("clearSplitInfoCallback", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method);
    }

    /* renamed from: $r8$lambda$JTy4cd9yEATsI4a-qp23N1R3I5Y, reason: not valid java name */
    public static /* synthetic */ boolean m9440$r8$lambda$JTy4cd9yEATsI4aqp23N1R3I5Y() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.WindowAttributes.class.getMethod("getDimAreaBehavior", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.SplitAttributes.class.getMethod("getWindowAttributes", new java.lang.Class[0]);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.SplitAttributes.Builder.class.getMethod("setWindowAttributes", androidx.window.extensions.embedding.WindowAttributes.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.Integer.TYPE)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, androidx.window.extensions.embedding.WindowAttributes.class)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                if (reflectionUtils3.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, androidx.window.extensions.embedding.SplitAttributes.Builder.class)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$JVyG9bZx_mQUqbUkeaJ1mXH1gSU() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.AnimationParams.Builder.class.getMethod("setAnimationBackground", androidx.window.extensions.embedding.AnimationBackground.class);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.AnimationParams.Builder.class.getMethod("setOpenAnimationResId", java.lang.Integer.TYPE);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.AnimationParams.Builder.class.getMethod("setCloseAnimationResId", java.lang.Integer.TYPE);
        java.lang.reflect.Method method4 = androidx.window.extensions.embedding.AnimationParams.Builder.class.getMethod("setChangeAnimationResId", java.lang.Integer.TYPE);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (!reflectionUtils.isPublic$window_release(method) || !androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.AnimationParams.Builder.class)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
        if (!reflectionUtils2.isPublic$window_release(method2) || !androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, androidx.window.extensions.embedding.AnimationParams.Builder.class)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
        if (!reflectionUtils3.isPublic$window_release(method3) || !androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, androidx.window.extensions.embedding.AnimationParams.Builder.class)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils4 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method4);
        return reflectionUtils4.isPublic$window_release(method4) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method4, androidx.window.extensions.embedding.AnimationParams.Builder.class);
    }

    public static /* synthetic */ boolean $r8$lambda$N75R7jg4C07C1hXuPBzWxR4GB34() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitPairRule.class.getMethod("getFinishPrimaryWithSecondary", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.SplitPairRule.class.getMethod("getFinishSecondaryWithPrimary", new java.lang.Class[0]);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.SplitPairRule.class.getMethod("shouldClearTop", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.Integer.TYPE)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, java.lang.Integer.TYPE)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                if (reflectionUtils3.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, java.lang.Boolean.TYPE)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$N9yKUhVxAWS8YmwoAbmXvbxFLgo(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("setEmbeddedActivityWindowInfoCallback", java.util.concurrent.Executor.class, androidx.window.extensions.core.util.function.Consumer.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method);
    }

    /* renamed from: $r8$lambda$O0LWzHE-SeaD7Glf0826Qh64UVE, reason: not valid java name */
    public static /* synthetic */ boolean m9441$r8$lambda$O0LWzHESeaD7Glf0826Qh64UVE() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitInfo.class.getMethod("getPrimaryActivityStack", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.SplitInfo.class.getMethod("getSecondaryActivityStack", new java.lang.Class[0]);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.SplitInfo.class.getMethod("getSplitRatio", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.ActivityStack.class)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, androidx.window.extensions.embedding.ActivityStack.class)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                if (reflectionUtils3.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, java.lang.Float.TYPE)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: $r8$lambda$PF4BJjmPsfE1SOJ-9edTlXwE_n4, reason: not valid java name */
    public static /* synthetic */ boolean m9442$r8$lambda$PF4BJjmPsfE1SOJ9edTlXwE_n4() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.ActivityStack.class.getMethod("getTag", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.String.class);
    }

    public static /* synthetic */ boolean $r8$lambda$QZQ10NGwfkhcflLXvChvUvlplHU() {
        java.lang.reflect.Constructor<?> declaredConstructor = androidx.window.extensions.embedding.SplitAttributes.SplitType.RatioSplitType.class.getDeclaredConstructor(java.lang.Float.TYPE);
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitAttributes.SplitType.RatioSplitType.class.getMethod("getRatio", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.SplitAttributes.SplitType.RatioSplitType.class.getMethod("splitEqually", new java.lang.Class[0]);
        java.lang.reflect.Constructor<?> declaredConstructor2 = androidx.window.extensions.embedding.SplitAttributes.SplitType.HingeSplitType.class.getDeclaredConstructor(androidx.window.extensions.embedding.SplitAttributes.SplitType.class);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.SplitAttributes.SplitType.HingeSplitType.class.getMethod("getFallbackSplitType", new java.lang.Class[0]);
        java.lang.reflect.Constructor<?> declaredConstructor3 = androidx.window.extensions.embedding.SplitAttributes.SplitType.ExpandContainersSplitType.class.getDeclaredConstructor(new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(declaredConstructor);
        if (reflectionUtils.isPublic$window_release(declaredConstructor)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method);
            if (reflectionUtils2.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.Float.TYPE)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(declaredConstructor2);
                if (reflectionUtils3.isPublic$window_release(declaredConstructor2)) {
                    androidx.window.reflection.ReflectionUtils reflectionUtils4 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
                    if (reflectionUtils4.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, androidx.window.extensions.embedding.SplitAttributes.SplitType.RatioSplitType.class)) {
                        androidx.window.reflection.ReflectionUtils reflectionUtils5 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                        if (reflectionUtils5.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, androidx.window.extensions.embedding.SplitAttributes.SplitType.class)) {
                            androidx.window.reflection.ReflectionUtils reflectionUtils6 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(declaredConstructor3);
                            if (reflectionUtils6.isPublic$window_release(declaredConstructor3)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: $r8$lambda$Qf0hwdQte8Kzx-93iCxgkWD-ye0, reason: not valid java name */
    public static /* synthetic */ boolean m9443$r8$lambda$Qf0hwdQte8Kzx93iCxgkWDye0(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("setActivityStackAttributesCalculator", androidx.window.extensions.core.util.function.Function.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method);
    }

    public static /* synthetic */ boolean $r8$lambda$QlVffp_OYIzDYu2KeJEEoel5Thk() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitAttributes.class.getMethod("getDividerAttributes", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.DividerAttributes.class);
    }

    public static /* synthetic */ boolean $r8$lambda$Qo_ZJOlgabCdyFUS7XXdNNeWrBk(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("unregisterActivityStackCallback", androidx.window.extensions.core.util.function.Consumer.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method);
    }

    /* renamed from: $r8$lambda$TAU8Jn3Z7mKieW-px9Qx4m2Myco, reason: not valid java name */
    public static /* synthetic */ boolean m9444$r8$lambda$TAU8Jn3Z7mKieWpx9Qx4m2Myco() {
        java.lang.reflect.Constructor<?> declaredConstructor = androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class.getDeclaredConstructor(android.content.Intent.class, androidx.window.extensions.core.util.function.Predicate.class, androidx.window.extensions.core.util.function.Predicate.class, androidx.window.extensions.core.util.function.Predicate.class);
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class.getMethod("setDefaultSplitAttributes", androidx.window.extensions.embedding.SplitAttributes.class);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class.getMethod("setFinishPrimaryWithPlaceholder", java.lang.Integer.TYPE);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class.getMethod("setTag", java.lang.String.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(declaredConstructor);
        if (!reflectionUtils.isPublic$window_release(declaredConstructor)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (!reflectionUtils2.isPublic$window_release(method) || !androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
        if (!reflectionUtils3.isPublic$window_release(method2) || !androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils4 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
        return reflectionUtils4.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class);
    }

    public static /* synthetic */ boolean $r8$lambda$Ui238Hpqfg5lJCWuZBdgCZnhqQc(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitPinRule.class.getMethod("isSticky", new java.lang.Class[0]);
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method2 = loadClass.getMethod("pinTopActivityStack", java.lang.Integer.TYPE, androidx.window.extensions.embedding.SplitPinRule.class);
        java.lang.Class<?> loadClass2 = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass2, "");
        java.lang.reflect.Method method3 = loadClass2.getMethod("unpinTopActivityStack", java.lang.Integer.TYPE);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.Boolean.TYPE)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, java.lang.Boolean.TYPE)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                if (reflectionUtils3.isPublic$window_release(method3)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: $r8$lambda$UunQHiZ7xd8Vgoj19b9IlY3vN-Q, reason: not valid java name */
    public static /* synthetic */ boolean m9445$r8$lambda$UunQHiZ7xd8Vgoj19b9IlY3vNQ(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> consumerClassOrNull$window_release = safeActivityEmbeddingComponentProvider.getHighSpeedVideoSizes.consumerClassOrNull$window_release();
        if (consumerClassOrNull$window_release == null) {
            return false;
        }
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("setSplitInfoCallback", consumerClassOrNull$window_release);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method);
    }

    /* renamed from: $r8$lambda$VeAfsOBcn6ELZCY-aKQ0fnB6GxE, reason: not valid java name */
    public static /* synthetic */ boolean m9446$r8$lambda$VeAfsOBcn6ELZCYaKQ0fnB6GxE() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitRule.class.getMethod("getDefaultSplitAttributes", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.SplitAttributes.class);
    }

    public static /* synthetic */ boolean $r8$lambda$Vgl7iivqjFiNXUBPIBkI2tG03nI() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitAttributes.class.getMethod("getAnimationParams", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.AnimationParams.class);
    }

    public static /* synthetic */ boolean $r8$lambda$XqEAcIEjvtQpH6jkPYnuAN_6Xig() {
        java.lang.reflect.Constructor<?> declaredConstructor = androidx.window.extensions.embedding.SplitPairRule.Builder.class.getDeclaredConstructor(androidx.window.extensions.core.util.function.Predicate.class, androidx.window.extensions.core.util.function.Predicate.class, androidx.window.extensions.core.util.function.Predicate.class);
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitPairRule.Builder.class.getMethod("setDefaultSplitAttributes", androidx.window.extensions.embedding.SplitAttributes.class);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.SplitPairRule.Builder.class.getMethod("setTag", java.lang.String.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(declaredConstructor);
        if (!reflectionUtils.isPublic$window_release(declaredConstructor)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (!reflectionUtils2.isPublic$window_release(method) || !androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.SplitPairRule.Builder.class)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
        return reflectionUtils3.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, androidx.window.extensions.embedding.SplitPairRule.Builder.class);
    }

    public static /* synthetic */ boolean $r8$lambda$Y7CXtr9E69WIogo8BI5B3mxRXus() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.DividerAttributes.class.getMethod("getDividerType", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.DividerAttributes.class.getMethod("getWidthDp", new java.lang.Class[0]);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.DividerAttributes.class.getMethod("getPrimaryMinRatio", new java.lang.Class[0]);
        java.lang.reflect.Method method4 = androidx.window.extensions.embedding.DividerAttributes.class.getMethod("getPrimaryMaxRatio", new java.lang.Class[0]);
        java.lang.reflect.Method method5 = androidx.window.extensions.embedding.DividerAttributes.class.getMethod("getDividerColor", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.Integer.TYPE)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, java.lang.Integer.TYPE)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                if (reflectionUtils3.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, java.lang.Float.TYPE)) {
                    androidx.window.reflection.ReflectionUtils reflectionUtils4 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(method4);
                    if (reflectionUtils4.isPublic$window_release(method4) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method4, java.lang.Float.TYPE)) {
                        androidx.window.reflection.ReflectionUtils reflectionUtils5 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(method5);
                        if (reflectionUtils5.isPublic$window_release(method5) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method5, java.lang.Integer.TYPE)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.window.extensions.embedding.ActivityEmbeddingComponent getActivityEmbeddingComponent() {
        boolean z;
        if (isActivityEmbeddingComponentAccessible$window_release()) {
            int extensionVersion = androidx.window.WindowSdkExtensions.INSTANCE.getInstance().getExtensionVersion();
            if (extensionVersion == 1) {
                z = hasValidVendorApiLevel1$window_release();
            } else if (extensionVersion == 2) {
                z = hasValidVendorApiLevel2$window_release();
            } else if (3 <= extensionVersion && extensionVersion < 5) {
                z = hasValidVendorApiLevel3$window_release();
            } else if (extensionVersion == 5) {
                z = hasValidVendorApiLevel5$window_release();
            } else if (extensionVersion == 6) {
                z = hasValidVendorApiLevel6$window_release();
            } else if (extensionVersion == 7) {
                z = hasValidVendorApiLevel7$window_release();
            } else if (8 <= extensionVersion && extensionVersion <= Integer.MAX_VALUE) {
                z = hasValidVendorApiLevel8$window_release();
            }
            if (z) {
                return null;
            }
            try {
                return this.getHighSpeedVideoFpsRanges.getActivityEmbeddingComponent();
            } catch (java.lang.UnsupportedOperationException unused) {
                return null;
            }
        }
        z = false;
        if (z) {
        }
    }

    public static /* synthetic */ boolean $r8$lambda$YGdU43h_XTtgU5dRNss1LCE8Cvs(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("updateActivityStackAttributes", androidx.window.extensions.embedding.ActivityStack.Token.class, androidx.window.extensions.embedding.ActivityStackAttributes.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method);
    }

    public static /* synthetic */ boolean $r8$lambda$YtU1d6dW2h7vQ99U6k3CaZKOmXI(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("setEmbeddingRules", java.util.Set.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method);
    }

    /* renamed from: $r8$lambda$az3DrU5DJ-SMa8-l43GaTtlu1f8, reason: not valid java name */
    public static /* synthetic */ boolean m9450$r8$lambda$az3DrU5DJSMa8l43GaTtlu1f8(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("clearActivityStackAttributesCalculator", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method);
    }

    /* renamed from: $r8$lambda$f2w9ZFLuGI5ahi6NOdl-k4TqzIc, reason: not valid java name */
    public static /* synthetic */ boolean m9452$r8$lambda$f2w9ZFLuGI5ahi6NOdlk4TqzIc(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("updateSplitAttributes", androidx.window.extensions.embedding.SplitInfo.Token.class, androidx.window.extensions.embedding.SplitAttributes.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method);
    }

    /* renamed from: $r8$lambda$fGY3N7EiL7J1xD-xNSH04c-EN5Q, reason: not valid java name */
    public static /* synthetic */ boolean m9453$r8$lambda$fGY3N7EiL7J1xDxNSH04cEN5Q(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("setSplitInfoCallback", androidx.window.extensions.core.util.function.Consumer.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method);
    }

    public static /* synthetic */ boolean $r8$lambda$l_jm1_Wiqx6A4HT_qgdQD3qB38w(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("getEmbeddedActivityWindowInfo", android.app.Activity.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.EmbeddedActivityWindowInfo.class);
    }

    /* renamed from: $r8$lambda$pKcC-XqD7lLSOmeFWvadWhd_rBY, reason: not valid java name */
    public static /* synthetic */ boolean m9455$r8$lambda$pKcCXqD7lLSOmeFWvadWhd_rBY(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("getParentContainerInfo", androidx.window.extensions.embedding.ActivityStack.Token.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.ParentContainerInfo.class);
    }

    public static /* synthetic */ boolean $r8$lambda$xzdlI_NcEeBxjawUpAkGr2_kw24(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("setSplitAttributesCalculator", androidx.window.extensions.core.util.function.Function.class);
        java.lang.Class<?> loadClass2 = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass2, "");
        java.lang.reflect.Method method2 = loadClass2.getMethod("clearSplitAttributesCalculator", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$ygOGGy9Hhj_ZFMpTNJVZdU4IgYE(androidx.window.embedding.SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider) {
        java.lang.Class<?> loadClass = safeActivityEmbeddingComponentProvider.Camera2StreamConfigurationMap.loadClass(androidx.window.reflection.WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.reflect.Method method = loadClass.getMethod("invalidateTopVisibleSplitAttributes", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method);
    }

    public final boolean hasValidVendorApiLevel1$window_release() {
        return androidx.window.reflection.ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setEmbeddingRules is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$YtU1d6dW2h7vQ99U6k3CaZKOmXI(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#isActivityEmbedded is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$Dqh4BkwWZso5Hc8SKGZewmRiPX0(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9445$r8$lambda$UunQHiZ7xd8Vgoj19b9IlY3vNQ(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this));
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("SplitRule#getSplitRatio is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9457$r8$lambda$xeO_JIMpmrwfj9Lmcwg5Lytxtg());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("SplitRule#getLayoutDirection is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$x_EhDx7NLODEc8IyNdkzowRg5cA());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class ActivityRule is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9448$r8$lambda$ZiByiPVqJKYSBE_x2p5f3bgHo0());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class ActivityRule.Builder is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$q9815IXugZa4ZIQoRfHbsMtOOog());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class SplitInfo is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9441$r8$lambda$O0LWzHESeaD7Glf0826Qh64UVE());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class SplitPairRule is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda59
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$N75R7jg4C07C1hXuPBzWxR4GB34());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class SplitPairRule.Builder is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$C07S8CKXUibXuuEEyUiE2MZLw2c());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class SplitPlaceholderRule is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.$r8$lambda$FNd_U_wsnLj326SmLuWg0AWINu4());
            }
        }) && androidx.window.reflection.ReflectionUtils.validateReflection$window_release("Class SplitPlaceholderRule.Builder is not valid", new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.window.embedding.SafeActivityEmbeddingComponentProvider.m9454$r8$lambda$hKpay0AIFQzkbVkkc74NPnoC0Y());
            }
        });
    }

    /* renamed from: $r8$lambda$ZiByiPVqJKYSBE_x2p5f3bgH-o0, reason: not valid java name */
    public static /* synthetic */ boolean m9448$r8$lambda$ZiByiPVqJKYSBE_x2p5f3bgHo0() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.ActivityRule.class.getMethod("shouldAlwaysExpand", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.Boolean.TYPE);
    }

    /* renamed from: $r8$lambda$xeO_J-IMpmrwfj9Lmcwg5Lytxtg, reason: not valid java name */
    public static /* synthetic */ boolean m9457$r8$lambda$xeO_JIMpmrwfj9Lmcwg5Lytxtg() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitRule.class.getMethod("getSplitRatio", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.Float.TYPE);
    }

    public static /* synthetic */ boolean $r8$lambda$x_EhDx7NLODEc8IyNdkzowRg5cA() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitRule.class.getMethod("getLayoutDirection", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.Integer.TYPE);
    }

    public static /* synthetic */ boolean $r8$lambda$q9815IXugZa4ZIQoRfHbsMtOOog() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.ActivityRule.Builder.class.getMethod("setShouldAlwaysExpand", java.lang.Boolean.TYPE);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.ActivityRule.Builder.class);
    }

    /* renamed from: $r8$lambda$hKpay0AIFQzkbVkkc74NPnoC0-Y, reason: not valid java name */
    public static /* synthetic */ boolean m9454$r8$lambda$hKpay0AIFQzkbVkkc74NPnoC0Y() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class.getMethod("setSplitRatio", java.lang.Float.TYPE);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class.getMethod("setLayoutDirection", java.lang.Integer.TYPE);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class.getMethod("setSticky", java.lang.Boolean.TYPE);
        java.lang.reflect.Method method4 = androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class.getMethod("setFinishPrimaryWithSecondary", java.lang.Integer.TYPE);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (!reflectionUtils.isPublic$window_release(method) || !androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
        if (!reflectionUtils2.isPublic$window_release(method2) || !androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
        if (!reflectionUtils3.isPublic$window_release(method3) || !androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils4 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method4);
        return reflectionUtils4.isPublic$window_release(method4) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method4, androidx.window.extensions.embedding.SplitPlaceholderRule.Builder.class);
    }

    public static /* synthetic */ boolean $r8$lambda$i_8GeoJ40gJvkSul0dVGTqdSqnU() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitInfo.class.getMethod("getSplitAttributes", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.SplitAttributes.class);
    }

    /* renamed from: $r8$lambda$de2ug5m788G0Hu-bQB3rKEJZvcQ, reason: not valid java name */
    public static /* synthetic */ boolean m9451$r8$lambda$de2ug5m788G0HubQB3rKEJZvcQ() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitPlaceholderRule.class.getMethod("getFinishPrimaryWithPlaceholder", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.Integer.TYPE);
    }

    /* renamed from: $r8$lambda$ayomV3m1GE8fWNgZGRr-hNJxeWU, reason: not valid java name */
    public static /* synthetic */ boolean m9449$r8$lambda$ayomV3m1GE8fWNgZGRrhNJxeWU() {
        java.lang.reflect.Constructor<?> declaredConstructor = androidx.window.extensions.embedding.ActivityRule.Builder.class.getDeclaredConstructor(androidx.window.extensions.core.util.function.Predicate.class, androidx.window.extensions.core.util.function.Predicate.class);
        java.lang.reflect.Method method = androidx.window.extensions.embedding.ActivityRule.Builder.class.getMethod("setTag", java.lang.String.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(declaredConstructor);
        if (!reflectionUtils.isPublic$window_release(declaredConstructor)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils2.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.ActivityRule.Builder.class);
    }

    public static /* synthetic */ boolean $r8$lambda$sIJ3U7V7ItLOTjaZy1Yf1jCwgnw() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitAttributesCalculatorParams.class.getMethod("getParentWindowMetrics", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.SplitAttributesCalculatorParams.class.getMethod("getParentConfiguration", new java.lang.Class[0]);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.SplitAttributesCalculatorParams.class.getMethod("getDefaultSplitAttributes", new java.lang.Class[0]);
        java.lang.reflect.Method method4 = androidx.window.extensions.embedding.SplitAttributesCalculatorParams.class.getMethod("areDefaultConstraintsSatisfied", new java.lang.Class[0]);
        java.lang.reflect.Method method5 = androidx.window.extensions.embedding.SplitAttributesCalculatorParams.class.getMethod("getParentWindowLayoutInfo", new java.lang.Class[0]);
        java.lang.reflect.Method method6 = androidx.window.extensions.embedding.SplitAttributesCalculatorParams.class.getMethod("getSplitRuleTag", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, android.view.WindowMetrics.class)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, android.content.res.Configuration.class)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                if (reflectionUtils3.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, androidx.window.extensions.embedding.SplitAttributes.class)) {
                    androidx.window.reflection.ReflectionUtils reflectionUtils4 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(method4);
                    if (reflectionUtils4.isPublic$window_release(method4) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method4, java.lang.Boolean.TYPE)) {
                        androidx.window.reflection.ReflectionUtils reflectionUtils5 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(method5);
                        if (reflectionUtils5.isPublic$window_release(method5) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method5, androidx.window.extensions.layout.WindowLayoutInfo.class)) {
                            androidx.window.reflection.ReflectionUtils reflectionUtils6 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(method6);
                            if (reflectionUtils6.isPublic$window_release(method6) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method6, java.lang.String.class)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$aWs8zkfFyRJjVQAkJ6pGG4LUIUM() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitInfo.class.getMethod("getSplitInfoToken", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.SplitInfo.Token.class);
    }

    /* renamed from: $r8$lambda$ZcdoCQ_g-vZLnR9v64rMcRyQWoA, reason: not valid java name */
    public static /* synthetic */ boolean m9447$r8$lambda$ZcdoCQ_gvZLnR9v64rMcRyQWoA() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.AnimationBackground.class.getMethod("createColorBackground", java.lang.Integer.TYPE);
        java.lang.reflect.Field declaredField = androidx.window.extensions.embedding.AnimationBackground.class.getDeclaredField("ANIMATION_BACKGROUND_DEFAULT");
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.AnimationBackground.ColorBackground.class.getMethod("getColor", new java.lang.Class[0]);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.SplitAttributes.class.getMethod("getAnimationBackground", new java.lang.Class[0]);
        java.lang.reflect.Method method4 = androidx.window.extensions.embedding.SplitAttributes.Builder.class.getMethod("setAnimationBackground", androidx.window.extensions.embedding.AnimationBackground.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.AnimationBackground.ColorBackground.class)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(declaredField);
            if (reflectionUtils2.isPublic$window_release(declaredField)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
                if (reflectionUtils3.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, java.lang.Integer.TYPE)) {
                    androidx.window.reflection.ReflectionUtils reflectionUtils4 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                    if (reflectionUtils4.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, androidx.window.extensions.embedding.AnimationBackground.class)) {
                        androidx.window.reflection.ReflectionUtils reflectionUtils5 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(method4);
                        if (reflectionUtils5.isPublic$window_release(method4) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method4, androidx.window.extensions.embedding.SplitAttributes.Builder.class)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$ojbaezeEMuLI5hhIPvwsWi0onMI() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.ActivityStack.Token.class.getMethod("toBundle", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.ActivityStack.Token.class.getMethod("readFromBundle", android.os.Bundle.class);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.ActivityStack.Token.class.getMethod("createFromBinder", android.os.IBinder.class);
        java.lang.reflect.Field declaredField = androidx.window.extensions.embedding.ActivityStack.Token.class.getDeclaredField("INVALID_ACTIVITY_STACK_TOKEN");
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, android.os.Bundle.class)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, androidx.window.extensions.embedding.ActivityStack.Token.class)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                if (reflectionUtils3.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, androidx.window.extensions.embedding.ActivityStack.Token.class)) {
                    androidx.window.reflection.ReflectionUtils reflectionUtils4 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(declaredField);
                    if (reflectionUtils4.isPublic$window_release(declaredField)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$cX9vey6aSLx7ZG27tUI2BkOurUk() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.SplitInfo.Token.class.getMethod("createFromBinder", android.os.IBinder.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.SplitInfo.Token.class);
    }

    public static /* synthetic */ boolean $r8$lambda$kkzcH1wjhI0SoUbIXB1XsrMDIi4() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.EmbeddedActivityWindowInfo.class.getMethod("getActivity", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.EmbeddedActivityWindowInfo.class.getMethod("isEmbedded", new java.lang.Class[0]);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.EmbeddedActivityWindowInfo.class.getMethod("getTaskBounds", new java.lang.Class[0]);
        java.lang.reflect.Method method4 = androidx.window.extensions.embedding.EmbeddedActivityWindowInfo.class.getMethod("getActivityStackBounds", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, android.app.Activity.class)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, java.lang.Boolean.TYPE)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                if (reflectionUtils3.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, android.graphics.Rect.class)) {
                    androidx.window.reflection.ReflectionUtils reflectionUtils4 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(method4);
                    if (reflectionUtils4.isPublic$window_release(method4) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method4, android.graphics.Rect.class)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$p9FBJHdMdKphH13iERLJSrROgy8() {
        java.lang.reflect.Constructor<?> declaredConstructor = androidx.window.extensions.embedding.DividerAttributes.Builder.class.getDeclaredConstructor(java.lang.Integer.TYPE);
        java.lang.reflect.Constructor<?> declaredConstructor2 = androidx.window.extensions.embedding.DividerAttributes.Builder.class.getDeclaredConstructor(androidx.window.extensions.embedding.DividerAttributes.class);
        java.lang.reflect.Method method = androidx.window.extensions.embedding.DividerAttributes.Builder.class.getMethod("setWidthDp", java.lang.Integer.TYPE);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.DividerAttributes.Builder.class.getMethod("setPrimaryMinRatio", java.lang.Float.TYPE);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.DividerAttributes.Builder.class.getMethod("setPrimaryMaxRatio", java.lang.Float.TYPE);
        java.lang.reflect.Method method4 = androidx.window.extensions.embedding.DividerAttributes.Builder.class.getMethod("setDividerColor", java.lang.Integer.TYPE);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(declaredConstructor);
        if (!reflectionUtils.isPublic$window_release(declaredConstructor)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(declaredConstructor2);
        if (!reflectionUtils2.isPublic$window_release(declaredConstructor2)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (!reflectionUtils3.isPublic$window_release(method) || !androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.DividerAttributes.Builder.class)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils4 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
        if (!reflectionUtils4.isPublic$window_release(method2) || !androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, androidx.window.extensions.embedding.DividerAttributes.Builder.class)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils5 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
        if (!reflectionUtils5.isPublic$window_release(method3) || !androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, androidx.window.extensions.embedding.DividerAttributes.Builder.class)) {
            return false;
        }
        androidx.window.reflection.ReflectionUtils reflectionUtils6 = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method4);
        return reflectionUtils6.isPublic$window_release(method4) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method4, androidx.window.extensions.embedding.DividerAttributes.Builder.class);
    }

    public static /* synthetic */ boolean $r8$lambda$lEiJc7AvlhpWsBAnhVkebrjOOs4() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.DividerAttributes.class.getMethod("isDraggingToFullscreenAllowed", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        return reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, java.lang.Boolean.TYPE);
    }

    /* renamed from: $r8$lambda$vQAYEaPr6JmkmfXgIC--h7TAYH0, reason: not valid java name */
    public static /* synthetic */ boolean m9456$r8$lambda$vQAYEaPr6JmkmfXgICh7TAYH0() {
        java.lang.reflect.Constructor<?> declaredConstructor = androidx.window.extensions.embedding.ActivityStackAttributes.Builder.class.getDeclaredConstructor(new java.lang.Class[0]);
        java.lang.reflect.Method method = androidx.window.extensions.embedding.ActivityStackAttributes.Builder.class.getMethod("setRelativeBounds", android.graphics.Rect.class);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.ActivityStackAttributes.Builder.class.getMethod("setWindowAttributes", androidx.window.extensions.embedding.WindowAttributes.class);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(declaredConstructor);
        if (reflectionUtils.isPublic$window_release(declaredConstructor)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method);
            if (reflectionUtils2.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.ActivityStackAttributes.Builder.class)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
                if (reflectionUtils3.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, androidx.window.extensions.embedding.ActivityStackAttributes.Builder.class)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$uV6Q12B7Wkvc74P9Arxj_aVBwkg() {
        java.lang.reflect.Method method = androidx.window.extensions.embedding.ActivityStackAttributesCalculatorParams.class.getMethod("getParentContainerInfo", new java.lang.Class[0]);
        java.lang.reflect.Method method2 = androidx.window.extensions.embedding.ActivityStackAttributesCalculatorParams.class.getMethod("getActivityStackTag", new java.lang.Class[0]);
        java.lang.reflect.Method method3 = androidx.window.extensions.embedding.ActivityStackAttributesCalculatorParams.class.getMethod("getLaunchOptions", new java.lang.Class[0]);
        androidx.window.reflection.ReflectionUtils reflectionUtils = androidx.window.reflection.ReflectionUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        if (reflectionUtils.isPublic$window_release(method) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method, androidx.window.extensions.embedding.ParentContainerInfo.class)) {
            androidx.window.reflection.ReflectionUtils reflectionUtils2 = androidx.window.reflection.ReflectionUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method2);
            if (reflectionUtils2.isPublic$window_release(method2) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method2, java.lang.String.class)) {
                androidx.window.reflection.ReflectionUtils reflectionUtils3 = androidx.window.reflection.ReflectionUtils.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(method3);
                if (reflectionUtils3.isPublic$window_release(method3) && androidx.window.reflection.ReflectionUtils.INSTANCE.doesReturn$window_release(method3, android.os.Bundle.class)) {
                    return true;
                }
            }
        }
        return false;
    }
}
