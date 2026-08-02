package androidx.view.viewmodel.compose;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aI\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\n\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0007¢\u0006\u0004\b\t\u0010\r\u001a]\u0010\t\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\u0010\u001ai\u0010\u0013\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\u00120\u000e\"\u0004\b\u0000\u0010\u0001\"\u000e\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\f*\u00020\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0010"}, d2 = {"", "T", "Landroidx/lifecycle/SavedStateHandle;", "", "key", "Landroidx/compose/runtime/saveable/Saver;", "saver", "Lkotlin/Function0;", "init", "saveable", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Landroidx/compose/runtime/saveable/Saver;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "stateSaver", "Landroidx/compose/runtime/MutableState;", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Landroidx/compose/runtime/saveable/Saver;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/MutableState;", "Lkotlin/properties/PropertyDelegateProvider;", "Lkotlin/properties/ReadOnlyProperty;", "(Landroidx/lifecycle/SavedStateHandle;Landroidx/compose/runtime/saveable/Saver;Lkotlin/jvm/functions/Function0;)Lkotlin/properties/PropertyDelegateProvider;", "M", "Lkotlin/properties/ReadWriteProperty;", "saveableMutableState"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavedStateHandleSaverKt {
    public static /* synthetic */ java.lang.Object $r8$lambda$MDIs7RYytBl4ZEE1SIdEtKnXl88(java.lang.Object obj, java.lang.Object obj2, kotlin.reflect.KProperty kProperty) {
        return obj;
    }

    public static /* synthetic */ java.lang.Object saveable$default(androidx.view.SavedStateHandle savedStateHandle, java.lang.String str, androidx.compose.runtime.saveable.Saver saver, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            saver = androidx.compose.runtime.saveable.SaverKt.autoSaver();
        }
        return m9173saveable(savedStateHandle, str, saver, function0);
    }

    /* renamed from: saveable, reason: collision with other method in class */
    public static final <T> T m9173saveable(androidx.view.SavedStateHandle savedStateHandle, java.lang.String str, final androidx.compose.runtime.saveable.Saver<T, ? extends java.lang.Object> saver, kotlin.jvm.functions.Function0<? extends T> function0) {
        final T invoke;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNull(saver, "");
        android.os.Bundle bundle = (android.os.Bundle) savedStateHandle.get(str);
        if (bundle == null || (obj = bundle.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE)) == null || (invoke = saver.restore(obj)) == null) {
            invoke = function0.invoke();
        }
        savedStateHandle.setSavedStateProvider(str, new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda3
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final android.os.Bundle saveState() {
                return androidx.view.viewmodel.compose.SavedStateHandleSaverKt.$r8$lambda$8XUAkCj6jXZ9YjvEfSqJGIMV5kw(androidx.compose.runtime.saveable.Saver.this, invoke);
            }
        });
        return invoke;
    }

    public static /* synthetic */ kotlin.properties.PropertyDelegateProvider saveable$default(androidx.view.SavedStateHandle savedStateHandle, androidx.compose.runtime.saveable.Saver saver, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            saver = androidx.compose.runtime.saveable.SaverKt.autoSaver();
        }
        return saveable(savedStateHandle, saver, function0);
    }

    public static final <T> kotlin.properties.PropertyDelegateProvider<java.lang.Object, kotlin.properties.ReadOnlyProperty<java.lang.Object, T>> saveable(final androidx.view.SavedStateHandle savedStateHandle, final androidx.compose.runtime.saveable.Saver<T, ? extends java.lang.Object> saver, final kotlin.jvm.functions.Function0<? extends T> function0) {
        return new kotlin.properties.PropertyDelegateProvider() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda2
            @Override // kotlin.properties.PropertyDelegateProvider
            public final java.lang.Object provideDelegate(java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
                return androidx.view.viewmodel.compose.SavedStateHandleSaverKt.$r8$lambda$M4H8ziz96HZlcyvHR0hmVbpo2rA(androidx.view.SavedStateHandle.this, saver, function0, obj, kProperty);
            }
        };
    }

    public static /* synthetic */ kotlin.properties.PropertyDelegateProvider saveableMutableState$default(androidx.view.SavedStateHandle savedStateHandle, androidx.compose.runtime.saveable.Saver saver, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            saver = androidx.compose.runtime.saveable.SaverKt.autoSaver();
        }
        return saveableMutableState(savedStateHandle, saver, function0);
    }

    public static final <T, M extends androidx.compose.runtime.MutableState<T>> kotlin.properties.PropertyDelegateProvider<java.lang.Object, kotlin.properties.ReadWriteProperty<java.lang.Object, T>> saveableMutableState(final androidx.view.SavedStateHandle savedStateHandle, final androidx.compose.runtime.saveable.Saver<T, ? extends java.lang.Object> saver, final kotlin.jvm.functions.Function0<? extends M> function0) {
        return new kotlin.properties.PropertyDelegateProvider() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda5
            @Override // kotlin.properties.PropertyDelegateProvider
            public final java.lang.Object provideDelegate(java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
                return androidx.view.viewmodel.compose.SavedStateHandleSaverKt.$r8$lambda$FlebsKxHhbGbKq0fPH5FnC96WvU(androidx.view.SavedStateHandle.this, saver, function0, obj, kProperty);
            }
        };
    }

    public static /* synthetic */ android.os.Bundle $r8$lambda$8XUAkCj6jXZ9YjvEfSqJGIMV5kw(androidx.compose.runtime.saveable.Saver saver, java.lang.Object obj) {
        kotlin.Pair[] pairArr;
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, saver.save(new androidx.view.viewmodel.compose.SavedStateHandleSaverKt$saveable$1$1$1(androidx.view.SavedStateHandle.INSTANCE), obj)));
        if (mapOf.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(mapOf.size());
            for (java.util.Map.Entry entry : mapOf.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
        return bundleOf;
    }

    public static /* synthetic */ kotlin.properties.ReadWriteProperty $r8$lambda$FlebsKxHhbGbKq0fPH5FnC96WvU(androidx.view.SavedStateHandle savedStateHandle, androidx.compose.runtime.saveable.Saver saver, kotlin.jvm.functions.Function0 function0, java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
        java.lang.String str;
        if (obj != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getGetHighResolutionOutputSizeshNQ4ISI());
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            str = sb.toString();
        } else {
            str = "";
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(kProperty.getGetHighSpeedVideoFpsRanges());
        final androidx.compose.runtime.MutableState saveable = saveable(savedStateHandle, sb2.toString(), saver, function0);
        return new kotlin.properties.ReadWriteProperty<java.lang.Object, T>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$3$1
            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            public final T getValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property) {
                return saveable.getValue();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public final void setValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property, T value) {
                saveable.setValue(value);
            }
        };
    }

    public static /* synthetic */ kotlin.properties.ReadOnlyProperty $r8$lambda$M4H8ziz96HZlcyvHR0hmVbpo2rA(androidx.view.SavedStateHandle savedStateHandle, androidx.compose.runtime.saveable.Saver saver, kotlin.jvm.functions.Function0 function0, java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
        java.lang.String str;
        if (obj != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getGetHighResolutionOutputSizeshNQ4ISI());
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            str = sb.toString();
        } else {
            str = "";
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(kProperty.getGetHighSpeedVideoFpsRanges());
        final java.lang.Object m9173saveable = m9173saveable(savedStateHandle, sb2.toString(), (androidx.compose.runtime.saveable.Saver<java.lang.Object, ? extends java.lang.Object>) saver, (kotlin.jvm.functions.Function0<? extends java.lang.Object>) function0);
        return new kotlin.properties.ReadOnlyProperty() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda4
            @Override // kotlin.properties.ReadOnlyProperty
            public final java.lang.Object getValue(java.lang.Object obj2, kotlin.reflect.KProperty kProperty2) {
                return androidx.view.viewmodel.compose.SavedStateHandleSaverKt.$r8$lambda$MDIs7RYytBl4ZEE1SIdEtKnXl88(m9173saveable, obj2, kProperty2);
            }
        };
    }

    public static /* synthetic */ androidx.compose.runtime.MutableState $r8$lambda$Y3R3B3c_ANZ2Ujn_LwJmo3fw2M0(androidx.compose.runtime.saveable.Saver saver, androidx.compose.runtime.MutableState mutableState) {
        java.lang.Object obj;
        if (!(mutableState instanceof androidx.compose.runtime.snapshots.SnapshotMutableState)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        androidx.compose.runtime.snapshots.SnapshotMutableState snapshotMutableState = (androidx.compose.runtime.snapshots.SnapshotMutableState) mutableState;
        if (snapshotMutableState.getValue() != 0) {
            T value = snapshotMutableState.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value);
            obj = saver.restore(value);
        } else {
            obj = null;
        }
        androidx.compose.runtime.SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
        kotlin.jvm.internal.Intrinsics.checkNotNull(policy, "");
        androidx.compose.runtime.MutableState mutableStateOf = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(obj, policy);
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableStateOf, "");
        return mutableStateOf;
    }

    /* renamed from: $r8$lambda$nsNZ_P0ZzewRee-Bj8DaKl_oXkM, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.MutableState m9172$r8$lambda$nsNZ_P0ZzewReeBj8DaKl_oXkM(androidx.compose.runtime.saveable.Saver saver, androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.runtime.MutableState mutableState) {
        if (!(mutableState instanceof androidx.compose.runtime.snapshots.SnapshotMutableState)) {
            throw new java.lang.IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
        }
        androidx.compose.runtime.snapshots.SnapshotMutableState snapshotMutableState = (androidx.compose.runtime.snapshots.SnapshotMutableState) mutableState;
        java.lang.Object save = saver.save(saverScope, snapshotMutableState.getValue());
        androidx.compose.runtime.SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
        kotlin.jvm.internal.Intrinsics.checkNotNull(policy, "");
        return androidx.compose.runtime.SnapshotStateKt.mutableStateOf(save, policy);
    }

    public static final <T> androidx.compose.runtime.MutableState<T> saveable(androidx.view.SavedStateHandle savedStateHandle, java.lang.String str, final androidx.compose.runtime.saveable.Saver<T, ? extends java.lang.Object> saver, kotlin.jvm.functions.Function0<? extends androidx.compose.runtime.MutableState<T>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(saver, "");
        return (androidx.compose.runtime.MutableState) m9173saveable(savedStateHandle, str, androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.view.viewmodel.compose.SavedStateHandleSaverKt.m9172$r8$lambda$nsNZ_P0ZzewReeBj8DaKl_oXkM(androidx.compose.runtime.saveable.Saver.this, (androidx.compose.runtime.saveable.SaverScope) obj, (androidx.compose.runtime.MutableState) obj2);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.viewmodel.compose.SavedStateHandleSaverKt.$r8$lambda$Y3R3B3c_ANZ2Ujn_LwJmo3fw2M0(androidx.compose.runtime.saveable.Saver.this, (androidx.compose.runtime.MutableState) obj);
            }
        }), (kotlin.jvm.functions.Function0) function0);
    }
}
