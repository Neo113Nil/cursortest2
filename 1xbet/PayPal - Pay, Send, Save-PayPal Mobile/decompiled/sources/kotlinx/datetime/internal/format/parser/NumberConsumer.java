package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u001b\b\u0004\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H&¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0001\u0004\u0019\u001a\u001b\u001c"}, d2 = {"Lkotlinx/datetime/internal/format/parser/NumberConsumer;", "Receiver", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "input", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "consume", "(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "length", "Ljava/lang/Integer;", "getLength", "()Ljava/lang/Integer;", "whatThisExpects", "Ljava/lang/String;", "getWhatThisExpects", "()Ljava/lang/String;", "Lkotlinx/datetime/internal/format/parser/ConstantNumberConsumer;", "Lkotlinx/datetime/internal/format/parser/FractionPartConsumer;", "Lkotlinx/datetime/internal/format/parser/ReducedIntConsumer;", "Lkotlinx/datetime/internal/format/parser/UnsignedIntConsumer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class NumberConsumer<Receiver> {
    private final java.lang.Integer length;
    private final java.lang.String whatThisExpects;

    public abstract kotlinx.datetime.internal.format.parser.NumberConsumptionError consume(Receiver storage, java.lang.CharSequence input, int start, int end);

    private NumberConsumer(java.lang.Integer num, java.lang.String str) {
        this.length = num;
        this.whatThisExpects = str;
    }

    public java.lang.Integer getLength() {
        return this.length;
    }

    public final java.lang.String getWhatThisExpects() {
        return this.whatThisExpects;
    }

    public /* synthetic */ NumberConsumer(java.lang.Integer num, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str);
    }
}
