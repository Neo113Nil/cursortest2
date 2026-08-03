package androidx.compose.runtime.collection;

/* compiled from: IdentityArraySet.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a1\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0006H\u0080\b¨\u0006\u0007"}, d2 = {"fastForEach", "", "T", "", "", "block", "Lkotlin/Function1;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IdentityArraySetKt {
    public static final <T> void fastForEach(java.util.Set<? extends T> set, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (set instanceof androidx.compose.runtime.collection.IdentityArraySet) {
            androidx.compose.runtime.collection.IdentityArraySet identityArraySet = (androidx.compose.runtime.collection.IdentityArraySet) set;
            java.lang.Object[] values = identityArraySet.getValues();
            int size = identityArraySet.size();
            for (int i = 0; i < size; i++) {
                java.lang.Object obj = values[i];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                function1.invoke(obj);
            }
            return;
        }
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }
}
