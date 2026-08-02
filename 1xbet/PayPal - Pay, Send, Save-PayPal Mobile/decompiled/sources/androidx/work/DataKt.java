package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a@\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\u000b\u001a\u00020\n\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0003*\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "Lkotlin/Pair;", "", "", "pairs", "Landroidx/work/Data;", "workDataOf", "([Lkotlin/Pair;)Landroidx/work/Data;", "T", "key", "", "hasKeyWithValueOfType", "(Landroidx/work/Data;Ljava/lang/String;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataKt {
    public static final androidx.work.Data workDataOf(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        androidx.work.Data.Builder builder = new androidx.work.Data.Builder();
        for (kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair : pairArr) {
            builder.put(pair.getFirst(), pair.getSecond());
        }
        return builder.build();
    }

    public static final /* synthetic */ <T> boolean hasKeyWithValueOfType(androidx.work.Data data, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return data.hasKeyWithValueOfType(str, java.lang.Object.class);
    }
}
