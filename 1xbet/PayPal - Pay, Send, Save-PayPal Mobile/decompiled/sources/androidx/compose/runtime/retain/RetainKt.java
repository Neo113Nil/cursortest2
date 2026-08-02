package androidx.compose.runtime.retain;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a(\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u000e\b\b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a@\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u00062\u000e\b\b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\b\u001a+\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u000b\u001aC\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\f\u001a+\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"T", "Lkotlin/Function0;", "calculation", "retain", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "typeHash", "(ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "(I[Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "Landroidx/compose/runtime/retain/RetainKeys;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/runtime/retain/RetainKeys;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RetainKt {
    private static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();

    public static final <T> T retain(int i, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(663053747, i2, -1, "androidx.compose.runtime.retain.retain (Retain.kt:186)");
        }
        T t = (T) getHighSpeedVideoFpsRanges(new androidx.compose.runtime.retain.RetainKeys(null, androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0), i), function0, composer, i2 & 112);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return t;
    }

    public static final <T> T retain(int i, java.lang.Object[] objArr, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2119413254, i2, -1, "androidx.compose.runtime.retain.retain (Retain.kt:200)");
        }
        T t = (T) getHighSpeedVideoFpsRanges(new androidx.compose.runtime.retain.RetainKeys(objArr, androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0), i), function0, composer, (i2 >> 3) & 112);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return t;
    }

    private static final <T> T getHighSpeedVideoFpsRanges(androidx.compose.runtime.retain.RetainKeys retainKeys, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(583113279, i, -1, "androidx.compose.runtime.retain.retainImpl (Retain.kt:213)");
        }
        final androidx.compose.runtime.retain.RetainedValuesStore retainedValuesStore = (androidx.compose.runtime.retain.RetainedValuesStore) composer.consume(androidx.compose.runtime.retain.LocalRetainedValuesStoreKt.getLocalRetainedValuesStore());
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(retainKeys)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            java.lang.Object obj = getHighSpeedVideoSizes;
            java.lang.Object consumeExitedValueOrDefault = retainedValuesStore.consumeExitedValueOrDefault(retainKeys, obj);
            if (consumeExitedValueOrDefault != obj) {
                rememberedValue = new androidx.compose.runtime.retain.RetainedValueHolder(retainKeys, consumeExitedValueOrDefault, retainedValuesStore, false);
            } else {
                rememberedValue = new androidx.compose.runtime.retain.RetainedValueHolder(retainKeys, function0.invoke(), retainedValuesStore, true);
            }
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.runtime.retain.RetainedValueHolder retainedValueHolder = (androidx.compose.runtime.retain.RetainedValueHolder) rememberedValue;
        if (retainedValueHolder.getOwner() == retainedValuesStore) {
            composer.startReplaceGroup(-1626131997);
        } else {
            composer.startReplaceGroup(-1614000612);
            boolean changedInstance = composer.changedInstance(retainedValueHolder);
            boolean changedInstance2 = composer.changedInstance(retainedValuesStore);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.retain.RetainKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.runtime.retain.RetainKt.$r8$lambda$fRDZK3WeXVGFDPV5GVDN5_QvoPk(androidx.compose.runtime.retain.RetainedValueHolder.this, retainedValuesStore);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
        }
        composer.endReplaceGroup();
        T t = (T) retainedValueHolder.getValue();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return t;
    }

    public static final /* synthetic */ <T> T retain(kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) retain(java.lang.Object.class.getName().hashCode(), function0, composer, (i << 3) & 112);
    }

    public static final /* synthetic */ <T> T retain(java.lang.Object[] objArr, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) retain(java.lang.Object.class.getName().hashCode(), java.util.Arrays.copyOf(objArr, objArr.length), function0, composer, (i << 3) & 896);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fRDZK3WeXVGFDPV5GVDN5_QvoPk(androidx.compose.runtime.retain.RetainedValueHolder retainedValueHolder, androidx.compose.runtime.retain.RetainedValuesStore retainedValuesStore) {
        retainedValueHolder.readoptUnder$runtime_retain(retainedValuesStore);
        return kotlin.Unit.INSTANCE;
    }
}
