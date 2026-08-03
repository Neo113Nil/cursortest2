package androidx.compose.runtime.saveable;

/* compiled from: RememberSaveable.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0002\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0004\b\u0000\u0010\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0006\b\u0001\u0012\u00020\u00060\u0003H\u0002\u001aa\u0010\b\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\n\"\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0006\b\u0001\u0012\u00020\u00060\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ag\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\n\"\u0004\u0018\u00010\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0006\b\u0001\u0012\u00020\u00060\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u000fH\u0007¢\u0006\u0002\u0010\u0012\u001a\u0016\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"MaxSupportedRadix", "", "mutableStateSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/MutableState;", "T", "", "inner", "rememberSaveable", "inputs", "", "saver", com.ironsource.X3.i.W, "", com.ironsource.X3.a.f, "Lkotlin/Function0;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "stateSaver", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "requireCanBeSaved", "", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "value", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    /* renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m1729rememberSaveable(final java.lang.Object[] objArr, androidx.compose.runtime.saveable.Saver<T, ? extends java.lang.Object> saver, java.lang.String str, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.lang.Object consumeRestored;
        composer.startReplaceableGroup(441892779);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberSaveable)P(1,3,2)71@3180L23,81@3526L7,83@3552L313,93@3940L82:RememberSaveable.kt#r2ddri");
        if ((i2 & 2) != 0) {
            saver = androidx.compose.runtime.saveable.SaverKt.autoSaver();
        }
        T t = null;
        if ((i2 & 4) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(441892779, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        java.lang.String str2 = str;
        if (str2 == null || str2.length() == 0) {
            str = java.lang.Integer.toString(currentCompositeKeyHash, kotlin.text.CharsKt.checkRadix(MaxSupportedRadix));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "toString(this, checkRadix(radix))");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.runtime.saveable.SaveableStateRegistry> localSaveableStateRegistry = androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localSaveableStateRegistry);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        final androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry = (androidx.compose.runtime.saveable.SaveableStateRegistry) consume;
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            if (saveableStateRegistry != null && (consumeRestored = saveableStateRegistry.consumeRestored(str)) != null) {
                t = saver.restore(consumeRestored);
            }
            rememberedValue = new androidx.compose.runtime.saveable.SaveableHolder(saver, saveableStateRegistry, str, t == null ? function0.invoke() : t, objArr);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final androidx.compose.runtime.saveable.SaveableHolder saveableHolder = (androidx.compose.runtime.saveable.SaveableHolder) rememberedValue;
        T t2 = (T) saveableHolder.getValueIfInputsDidntChange(objArr);
        if (t2 == null) {
            t2 = function0.invoke();
        }
        final androidx.compose.runtime.saveable.Saver<T, ? extends java.lang.Object> saver2 = saver;
        final java.lang.String str3 = str;
        final java.lang.Object obj = t2;
        androidx.compose.runtime.EffectsKt.SideEffect(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                saveableHolder.update(saver2, saveableStateRegistry, str3, obj, objArr);
            }
        }, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return t2;
    }

    public static final <T> androidx.compose.runtime.MutableState<T> rememberSaveable(java.lang.Object[] objArr, androidx.compose.runtime.saveable.Saver<T, ? extends java.lang.Object> saver, java.lang.String str, kotlin.jvm.functions.Function0<? extends androidx.compose.runtime.MutableState<T>> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-202053668);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberSaveable)P(1,3,2)127@5317L106:RememberSaveable.kt#r2ddri");
        if ((i2 & 4) != 0) {
            str = null;
        }
        java.lang.String str2 = str;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-202053668, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)");
        }
        androidx.compose.runtime.MutableState<T> mutableState = (androidx.compose.runtime.MutableState) m1729rememberSaveable(java.util.Arrays.copyOf(objArr, objArr.length), mutableStateSaver(saver), str2, (kotlin.jvm.functions.Function0) function0, composer, (i & 896) | 8 | (i & 7168), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    private static final <T> androidx.compose.runtime.saveable.Saver<androidx.compose.runtime.MutableState<T>, androidx.compose.runtime.MutableState<java.lang.Object>> mutableStateSaver(final androidx.compose.runtime.saveable.Saver<T, ? extends java.lang.Object> saver) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.runtime.MutableState<T>, androidx.compose.runtime.MutableState<java.lang.Object>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final androidx.compose.runtime.MutableState<java.lang.Object> invoke(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.runtime.MutableState<T> mutableState) {
                if (!(mutableState instanceof androidx.compose.runtime.snapshots.SnapshotMutableState)) {
                    throw new java.lang.IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
                }
                java.lang.Object save = saver.save(saverScope, mutableState.getValue());
                if (save == null) {
                    return null;
                }
                androidx.compose.runtime.SnapshotMutationPolicy<T> policy = ((androidx.compose.runtime.snapshots.SnapshotMutableState) mutableState).getPolicy();
                kotlin.jvm.internal.Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return androidx.compose.runtime.SnapshotStateKt.mutableStateOf(save, policy);
            }
        }, new kotlin.jvm.functions.Function1<androidx.compose.runtime.MutableState<java.lang.Object>, androidx.compose.runtime.MutableState<T>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.runtime.MutableState<T> invoke(androidx.compose.runtime.MutableState<java.lang.Object> mutableState) {
                T t;
                if (!(mutableState instanceof androidx.compose.runtime.snapshots.SnapshotMutableState)) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                if (mutableState.getValue() != null) {
                    androidx.compose.runtime.saveable.Saver<T, java.lang.Object> saver2 = saver;
                    java.lang.Object value = mutableState.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(value);
                    t = saver2.restore(value);
                } else {
                    t = null;
                }
                androidx.compose.runtime.SnapshotMutationPolicy<T> policy = ((androidx.compose.runtime.snapshots.SnapshotMutableState) mutableState).getPolicy();
                kotlin.jvm.internal.Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$2?>");
                androidx.compose.runtime.MutableState<T> mutableStateOf = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(t, policy);
                kotlin.jvm.internal.Intrinsics.checkNotNull(mutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$2>");
                return mutableStateOf;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry, java.lang.Object obj) {
        java.lang.String str;
        if (obj == null || saveableStateRegistry.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof androidx.compose.runtime.snapshots.SnapshotMutableState) {
            androidx.compose.runtime.snapshots.SnapshotMutableState snapshotMutableState = (androidx.compose.runtime.snapshots.SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() != androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy() && snapshotMutableState.getPolicy() != androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy() && snapshotMutableState.getPolicy() != androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy()) {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            } else {
                str = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            }
        } else {
            str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new java.lang.IllegalArgumentException(str);
    }
}
