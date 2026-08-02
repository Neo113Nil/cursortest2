package androidx.compose.runtime.saveable;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\b2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0006*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b\f\u0010\u0011\"\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"", "", "", "", "restoredValues", "Lkotlin/Function1;", "", "canBeSaved", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "SaveableStateRegistry", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/CharSequence;)Z", "K", "V", "Landroidx/collection/MutableScatterMap;", "(Ljava/util/Map;)Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalSaveableStateRegistry", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalSaveableStateRegistry", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaveableStateRegistryKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.runtime.saveable.SaveableStateRegistry> LocalSaveableStateRegistry = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.compose.runtime.saveable.SaveableStateRegistryKt.$r8$lambda$8YnCTcMKs1pb78urqqVv4jJEY38();
        }
    });

    public static /* synthetic */ androidx.compose.runtime.saveable.SaveableStateRegistry $r8$lambda$8YnCTcMKs1pb78urqqVv4jJEY38() {
        return null;
    }

    public static final androidx.compose.runtime.saveable.SaveableStateRegistry SaveableStateRegistry(java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> map, kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> function1) {
        return new androidx.compose.runtime.saveable.SaveableStateRegistryImpl(map, function1);
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.runtime.saveable.SaveableStateRegistry> getLocalSaveableStateRegistry() {
        return LocalSaveableStateRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRangesFor(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!kotlin.text.CharsKt.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> androidx.collection.MutableScatterMap<K, V> getHighSpeedVideoFpsRangesFor(java.util.Map<K, ? extends V> map) {
        androidx.collection.MutableScatterMap<K, V> mutableScatterMap = new androidx.collection.MutableScatterMap<>(map.size());
        mutableScatterMap.putAll(map);
        return mutableScatterMap;
    }
}
