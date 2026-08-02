package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B9\u00120\b\u0002\u0010\t\u001a*\u0012\u0004\u0012\u00020\u0001\u0012 \u0012\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b0\u0004¢\u0006\u0004\b\n\u0010\u000bR?\u0010\t\u001a*\u0012\u0004\u0012\u00020\u0001\u0012 \u0012\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b0\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/navigation3/scene/SceneSetupNavEntryDecorator;", "", "T", "Landroidx/navigation3/runtime/NavEntryDecorator;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "movableContentMap", "<init>", "(Ljava/util/Map;)V", "Ljava/util/Map;", "getMovableContentMap", "()Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SceneSetupNavEntryDecorator<T> extends androidx.navigation3.runtime.NavEntryDecorator<T> {
    public static final int $stable = 0;
    private final java.util.Map<java.lang.Object, kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> movableContentMap;

    public final java.util.Map<java.lang.Object, kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> getMovableContentMap() {
        return this.movableContentMap;
    }

    public /* synthetic */ SceneSetupNavEntryDecorator(androidx.compose.runtime.snapshots.SnapshotStateMap snapshotStateMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.runtime.SnapshotStateKt.mutableStateMapOf() : snapshotStateMap);
    }

    public SceneSetupNavEntryDecorator(final java.util.Map<java.lang.Object, kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> map) {
        super(new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.scene.SceneSetupNavEntryDecorator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.navigation3.scene.SceneSetupNavEntryDecorator.m9235$r8$lambda$ybx_Wx9B_x82KWOsXSH66a8N7c(map, obj);
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1714993007, true, new kotlin.jvm.functions.Function3() { // from class: androidx.navigation3.scene.SceneSetupNavEntryDecorator$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.navigation3.scene.SceneSetupNavEntryDecorator.m9234$r8$lambda$G5wUTPPVGuNb1HmEVpCXh_KZpw(map, (androidx.navigation3.runtime.NavEntry) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
        this.movableContentMap = map;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A7KhiYu20ZRPtXFcpYFpxRFD2zc(androidx.navigation3.runtime.NavEntry navEntry, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-804085656, i, -1, "androidx.navigation3.scene.SceneSetupNavEntryDecorator.<init>.<anonymous>.<anonymous>.<anonymous> (SceneSetupNavEntryDecorator.kt:79)");
            }
            navEntry.Content(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$G5wUT-PPVGuNb1HmEVpCXh_KZpw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9234$r8$lambda$G5wUTPPVGuNb1HmEVpCXh_KZpw(java.util.Map map, final androidx.navigation3.runtime.NavEntry navEntry, androidx.compose.runtime.Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(navEntry) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1714993007, i, -1, "androidx.navigation3.scene.SceneSetupNavEntryDecorator.<init>.<anonymous> (SceneSetupNavEntryDecorator.kt:51)");
            }
            java.lang.Object contentKey = navEntry.getContentKey();
            if (((java.util.Set) composer.consume(androidx.navigation3.scene.SceneSetupNavEntryDecoratorKt.getLocalEntriesToExcludeFromCurrentScene())).contains(contentKey)) {
                composer.startReplaceGroup(1576267665);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1574916499);
                composer.startMovableGroup(1159182959, contentKey);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.lang.Object obj = map.get(contentKey);
                    if (obj == null) {
                        obj = androidx.compose.runtime.MovableContentKt.movableContentOf(androidx.navigation3.scene.ComposableSingletons$SceneSetupNavEntryDecoratorKt.INSTANCE.m9231getLambda$51699941$navigation3_ui());
                        map.put(contentKey, obj);
                    }
                    rememberedValue = (kotlin.jvm.functions.Function3) obj;
                    composer.updateRememberedValue(rememberedValue);
                }
                ((kotlin.jvm.functions.Function3) rememberedValue).invoke(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-804085656, true, new kotlin.jvm.functions.Function2() { // from class: androidx.navigation3.scene.SceneSetupNavEntryDecorator$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return androidx.navigation3.scene.SceneSetupNavEntryDecorator.$r8$lambda$A7KhiYu20ZRPtXFcpYFpxRFD2zc(androidx.navigation3.runtime.NavEntry.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, composer, 54), composer, 54);
                composer.endMovableGroup();
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ybx_-Wx9B_x82KWOsXSH66a8N7c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9235$r8$lambda$ybx_Wx9B_x82KWOsXSH66a8N7c(java.util.Map map, java.lang.Object obj) {
        map.remove(obj);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SceneSetupNavEntryDecorator() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
