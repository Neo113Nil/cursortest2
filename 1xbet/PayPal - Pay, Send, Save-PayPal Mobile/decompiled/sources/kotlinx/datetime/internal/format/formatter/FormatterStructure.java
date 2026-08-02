package kotlinx.datetime.internal.format.formatter;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "T", "", "obj", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "builder", "", "minusNotRequired", "", "format", "(Ljava/lang/Object;Ljava/lang/Appendable;Z)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface FormatterStructure<T> {
    void format(T obj, java.lang.Appendable builder, boolean minusNotRequired);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void format$default(kotlinx.datetime.internal.format.formatter.FormatterStructure formatterStructure, java.lang.Object obj, java.lang.Appendable appendable, boolean z, int i, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: format");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        formatterStructure.format(obj, appendable, z);
    }
}
