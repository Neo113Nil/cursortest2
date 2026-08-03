package androidx.compose.ui.modifier;

/* compiled from: ModifierLocalModifierNode.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u001a\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a'\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0006\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0007\u001a?\u0010\u0000\u001a\u00020\u000122\u0010\b\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\n0\t0\u0006\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000b\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0004\u0012\u0002H\u00020\t¨\u0006\r"}, d2 = {"modifierLocalMapOf", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "T", com.ironsource.X3.i.W, "Landroidx/compose/ui/modifier/ModifierLocal;", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "", "([Landroidx/compose/ui/modifier/ModifierLocal;)Landroidx/compose/ui/modifier/ModifierLocalMap;", com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Lkotlin/Pair;", "", "([Lkotlin/Pair;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "entry", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModifierLocalModifierNodeKt {
    public static final androidx.compose.ui.modifier.ModifierLocalMap modifierLocalMapOf() {
        return androidx.compose.ui.modifier.EmptyMap.INSTANCE;
    }

    public static final <T> androidx.compose.ui.modifier.ModifierLocalMap modifierLocalMapOf(androidx.compose.ui.modifier.ModifierLocal<T> modifierLocal) {
        return new androidx.compose.ui.modifier.SingleLocalMap(modifierLocal);
    }

    public static final <T> androidx.compose.ui.modifier.ModifierLocalMap modifierLocalMapOf(kotlin.Pair<? extends androidx.compose.ui.modifier.ModifierLocal<T>, ? extends T> pair) {
        androidx.compose.ui.modifier.SingleLocalMap singleLocalMap = new androidx.compose.ui.modifier.SingleLocalMap(pair.getFirst());
        singleLocalMap.mo3493set$ui_release(pair.getFirst(), pair.getSecond());
        return singleLocalMap;
    }

    public static final androidx.compose.ui.modifier.ModifierLocalMap modifierLocalMapOf(kotlin.Pair<? extends androidx.compose.ui.modifier.ModifierLocal<?>, ? extends java.lang.Object>... pairArr) {
        return new androidx.compose.ui.modifier.MultiLocalMap((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
    }

    public static final androidx.compose.ui.modifier.ModifierLocalMap modifierLocalMapOf(androidx.compose.ui.modifier.ModifierLocal<?>... modifierLocalArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(modifierLocalArr.length);
        for (androidx.compose.ui.modifier.ModifierLocal<?> modifierLocal : modifierLocalArr) {
            arrayList.add(kotlin.TuplesKt.to(modifierLocal, null));
        }
        kotlin.Pair[] pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        return new androidx.compose.ui.modifier.MultiLocalMap((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
    }
}
