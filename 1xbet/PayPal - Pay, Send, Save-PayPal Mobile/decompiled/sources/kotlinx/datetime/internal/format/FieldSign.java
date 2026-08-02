package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/FieldSign;", "Target", "", "obj", "", "isZero", "(Ljava/lang/Object;)Z", "Lkotlinx/datetime/internal/format/Accessor;", "isNegative", "()Lkotlinx/datetime/internal/format/Accessor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface FieldSign<Target> {
    kotlinx.datetime.internal.format.Accessor<Target, java.lang.Boolean> isNegative();

    boolean isZero(Target obj);
}
