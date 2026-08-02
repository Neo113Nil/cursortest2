package kotlin.enums;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a(\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0010\b\u0000\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006H\u0000¢\u0006\u0004\b\u0003\u0010\t\u001a3\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\u0003\u0010\u000b"}, d2 = {"", "T", "Lkotlin/enums/EnumEntries;", "enumEntries", "()Lkotlin/enums/EnumEntries;", "E", "Lkotlin/Function0;", "", "entriesProvider", "(Lkotlin/jvm/functions/Function0;)Lkotlin/enums/EnumEntries;", "entries", "([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnumEntriesKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T extends java.lang.Enum<T>> kotlin.enums.EnumEntries<T> enumEntries() {
        throw new kotlin.NotImplementedError(null, 1, 0 == true ? 1 : 0);
    }

    public static final <E extends java.lang.Enum<E>> kotlin.enums.EnumEntries<E> enumEntries(kotlin.jvm.functions.Function0<E[]> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new kotlin.enums.EnumEntriesList(function0.invoke());
    }

    public static final <E extends java.lang.Enum<E>> kotlin.enums.EnumEntries<E> enumEntries(E[] eArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eArr, "");
        return new kotlin.enums.EnumEntriesList(eArr);
    }
}
