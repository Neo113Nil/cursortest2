package androidx.compose.ui.modifier;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a!\u0010\u0001\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0001\u0010\u0006\u001a-\u0010\u0001\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00032\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0001\u0010\t\u001aA\u0010\u0001\u001a\u00020\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00042\u001a\u0010\r\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\f\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0001\u0010\u000e\u001aq\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0010\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u000f0\u00072\u0016\u0010\u0011\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u000f0\u000722\u0010\u0012\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u000f0\u00070\f\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u000f0\u0007¢\u0006\u0004\b\u0001\u0010\u0013\u001a+\u0010\u0001\u001a\u00020\u00002\u001a\u0010\r\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\f\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0001\u0010\u0014\u001aC\u0010\u0001\u001a\u00020\u000022\u0010\u0012\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u000f0\u00070\f\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u000f0\u0007H\u0007¢\u0006\u0004\b\u0001\u0010\u0015"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalMap;", "modifierLocalMapOf", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "(Landroidx/compose/ui/modifier/ModifierLocal;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "Lkotlin/Pair;", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "(Lkotlin/Pair;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "key1", "key2", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "(Landroidx/compose/ui/modifier/ModifierLocal;Landroidx/compose/ui/modifier/ModifierLocal;[Landroidx/compose/ui/modifier/ModifierLocal;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "", "entry1", "entry2", "entries", "(Lkotlin/Pair;Lkotlin/Pair;[Lkotlin/Pair;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "([Landroidx/compose/ui/modifier/ModifierLocal;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "([Lkotlin/Pair;)Landroidx/compose/ui/modifier/ModifierLocalMap;"}, k = 2, mv = {2, 0, 0}, xi = 48)
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
        singleLocalMap.mo7494set$ui(pair.getFirst(), pair.getSecond());
        return singleLocalMap;
    }

    public static final androidx.compose.ui.modifier.ModifierLocalMap modifierLocalMapOf(androidx.compose.ui.modifier.ModifierLocal<?> modifierLocal, androidx.compose.ui.modifier.ModifierLocal<?> modifierLocal2, androidx.compose.ui.modifier.ModifierLocal<?>... modifierLocalArr) {
        kotlin.Pair pair = kotlin.TuplesKt.to(modifierLocal, null);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.add(kotlin.TuplesKt.to(modifierLocal2, null));
        java.util.ArrayList arrayList = new java.util.ArrayList(modifierLocalArr.length);
        for (androidx.compose.ui.modifier.ModifierLocal<?> modifierLocal3 : modifierLocalArr) {
            arrayList.add(kotlin.TuplesKt.to(modifierLocal3, null));
        }
        spreadBuilder.addSpread(arrayList.toArray(new kotlin.Pair[0]));
        return new androidx.compose.ui.modifier.MultiLocalMap(pair, (kotlin.Pair[]) spreadBuilder.toArray(new kotlin.Pair[spreadBuilder.size()]));
    }

    public static final androidx.compose.ui.modifier.ModifierLocalMap modifierLocalMapOf(kotlin.Pair<? extends androidx.compose.ui.modifier.ModifierLocal<?>, ? extends java.lang.Object> pair, kotlin.Pair<? extends androidx.compose.ui.modifier.ModifierLocal<?>, ? extends java.lang.Object> pair2, kotlin.Pair<? extends androidx.compose.ui.modifier.ModifierLocal<?>, ? extends java.lang.Object>... pairArr) {
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.add(pair2);
        spreadBuilder.addSpread(pairArr);
        return new androidx.compose.ui.modifier.MultiLocalMap(pair, (kotlin.Pair[]) spreadBuilder.toArray(new kotlin.Pair[spreadBuilder.size()]));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use a different overloaded version of this function")
    public static final /* synthetic */ androidx.compose.ui.modifier.ModifierLocalMap modifierLocalMapOf(androidx.compose.ui.modifier.ModifierLocal... modifierLocalArr) {
        int length = modifierLocalArr.length;
        if (length == 0) {
            return androidx.compose.ui.modifier.EmptyMap.INSTANCE;
        }
        if (length == 1) {
            return new androidx.compose.ui.modifier.SingleLocalMap((androidx.compose.ui.modifier.ModifierLocal) kotlin.collections.ArraysKt.first(modifierLocalArr));
        }
        kotlin.Pair pair = kotlin.TuplesKt.to(kotlin.collections.ArraysKt.first(modifierLocalArr), null);
        java.util.List drop = kotlin.collections.ArraysKt.drop(modifierLocalArr, 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(drop.size());
        int size = drop.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(kotlin.TuplesKt.to((androidx.compose.ui.modifier.ModifierLocal) drop.get(i), null));
        }
        kotlin.Pair[] pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        return new androidx.compose.ui.modifier.MultiLocalMap(pair, (kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use a different overloaded version of this function")
    public static final /* synthetic */ androidx.compose.ui.modifier.ModifierLocalMap modifierLocalMapOf(kotlin.Pair... pairArr) {
        int length = pairArr.length;
        if (length == 0) {
            return androidx.compose.ui.modifier.EmptyMap.INSTANCE;
        }
        if (length == 1) {
            return new androidx.compose.ui.modifier.MultiLocalMap((kotlin.Pair) kotlin.collections.ArraysKt.first(pairArr), new kotlin.Pair[0]);
        }
        kotlin.Pair pair = (kotlin.Pair) kotlin.collections.ArraysKt.first(pairArr);
        kotlin.Pair[] pairArr2 = (kotlin.Pair[]) kotlin.collections.ArraysKt.drop(pairArr, 1).toArray(new kotlin.Pair[0]);
        return new androidx.compose.ui.modifier.MultiLocalMap(pair, (kotlin.Pair[]) java.util.Arrays.copyOf(pairArr2, pairArr2.length));
    }
}
