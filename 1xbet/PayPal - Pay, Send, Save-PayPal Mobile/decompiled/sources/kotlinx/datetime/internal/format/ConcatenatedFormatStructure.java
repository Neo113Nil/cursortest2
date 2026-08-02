package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lkotlinx/datetime/internal/format/ConcatenatedFormatStructure;", "T", "Lkotlinx/datetime/internal/format/FormatStructure;", "", "Lkotlinx/datetime/internal/format/NonConcatenatedFormatStructure;", "formats", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Ljava/util/List;", "getFormats", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public class ConcatenatedFormatStructure<T> implements kotlinx.datetime.internal.format.FormatStructure<T> {
    private final java.util.List<kotlinx.datetime.internal.format.NonConcatenatedFormatStructure<T>> formats;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcatenatedFormatStructure(java.util.List<? extends kotlinx.datetime.internal.format.NonConcatenatedFormatStructure<? super T>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.formats = list;
    }

    public final java.util.List<kotlinx.datetime.internal.format.NonConcatenatedFormatStructure<T>> getFormats() {
        return this.formats;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConcatenatedFormatStructure(");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(this.formats, ", ", null, null, 0, null, null, 62, null));
        sb.append(')');
        return sb.toString();
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof kotlinx.datetime.internal.format.ConcatenatedFormatStructure) && kotlin.jvm.internal.Intrinsics.areEqual(this.formats, ((kotlinx.datetime.internal.format.ConcatenatedFormatStructure) other).formats);
    }

    public int hashCode() {
        return this.formats.hashCode();
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public kotlinx.datetime.internal.format.parser.ParserStructure<T> parser() {
        java.util.List<kotlinx.datetime.internal.format.NonConcatenatedFormatStructure<T>> list = this.formats;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlinx.datetime.internal.format.NonConcatenatedFormatStructure) it.next()).parser());
        }
        return kotlinx.datetime.internal.format.parser.ParserKt.concat(arrayList);
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public kotlinx.datetime.internal.format.formatter.FormatterStructure<T> formatter() {
        java.util.List<kotlinx.datetime.internal.format.NonConcatenatedFormatStructure<T>> list = this.formats;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlinx.datetime.internal.format.NonConcatenatedFormatStructure) it.next()).formatter());
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.size() == 1) {
            return (kotlinx.datetime.internal.format.formatter.FormatterStructure) kotlin.collections.CollectionsKt.single((java.util.List) arrayList2);
        }
        return new kotlinx.datetime.internal.format.formatter.ConcatenatedFormatter(arrayList2);
    }
}
