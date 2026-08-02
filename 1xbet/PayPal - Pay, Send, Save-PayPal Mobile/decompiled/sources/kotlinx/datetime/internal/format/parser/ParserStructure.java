package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e"}, d2 = {"Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Output", "", "", "Lkotlinx/datetime/internal/format/parser/ParserOperation;", "operations", "followedBy", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOperations", "()Ljava/util/List;", "getFollowedBy"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ParserStructure<Output> {
    private final java.util.List<kotlinx.datetime.internal.format.parser.ParserStructure<Output>> followedBy;
    private final java.util.List<kotlinx.datetime.internal.format.parser.ParserOperation<Output>> operations;

    /* JADX WARN: Multi-variable type inference failed */
    public ParserStructure(java.util.List<? extends kotlinx.datetime.internal.format.parser.ParserOperation<? super Output>> list, java.util.List<? extends kotlinx.datetime.internal.format.parser.ParserStructure<? super Output>> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.operations = list;
        this.followedBy = list2;
    }

    public final java.util.List<kotlinx.datetime.internal.format.parser.ParserOperation<Output>> getOperations() {
        return this.operations;
    }

    public final java.util.List<kotlinx.datetime.internal.format.parser.ParserStructure<Output>> getFollowedBy() {
        return this.followedBy;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(this.operations, ", ", null, null, 0, null, null, 62, null));
        sb.append('(');
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(this.followedBy, ";", null, null, 0, null, null, 62, null));
        sb.append(')');
        return sb.toString();
    }
}
