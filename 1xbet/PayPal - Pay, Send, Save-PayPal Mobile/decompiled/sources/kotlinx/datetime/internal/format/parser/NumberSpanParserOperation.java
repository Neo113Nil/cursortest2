package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u00118CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013"}, d2 = {"Lkotlinx/datetime/internal/format/parser/NumberSpanParserOperation;", "Output", "Lkotlinx/datetime/internal/format/parser/ParserOperation;", "", "Lkotlinx/datetime/internal/format/parser/NumberConsumer;", "consumers", "<init>", "(Ljava/util/List;)V", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "input", "", "startIndex", "Lkotlinx/datetime/internal/format/parser/ParseResult;", "consume-FANa98k", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "consume", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getConsumers", "()Ljava/util/List;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NumberSpanParserOperation<Output> implements kotlinx.datetime.internal.format.parser.ParserOperation<Output> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;
    private final java.util.List<kotlinx.datetime.internal.format.parser.NumberConsumer<Output>> consumers;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public NumberSpanParserOperation(java.util.List<? extends kotlinx.datetime.internal.format.parser.NumberConsumer<? super Output>> list) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.consumers = list;
        java.util.Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Integer length = ((kotlinx.datetime.internal.format.parser.NumberConsumer) it.next()).getLength();
            if (length != null) {
                i3 = length.intValue();
            }
            i2 += i3;
        }
        this.getHighSpeedVideoSizes = i2;
        java.util.List<kotlinx.datetime.internal.format.parser.NumberConsumer<Output>> list2 = this.consumers;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((kotlinx.datetime.internal.format.parser.NumberConsumer) it2.next()).getLength() == null) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.getHighSpeedVideoFpsRangesFor = z;
        java.util.List<kotlinx.datetime.internal.format.parser.NumberConsumer<Output>> list3 = this.consumers;
        if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
            java.util.Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                java.lang.Integer length2 = ((kotlinx.datetime.internal.format.parser.NumberConsumer) it3.next()).getLength();
                if (length2 != null && length2.intValue() <= 0) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
            }
        }
        java.util.List<kotlinx.datetime.internal.format.parser.NumberConsumer<Output>> list4 = this.consumers;
        if ((list4 instanceof java.util.Collection) && list4.isEmpty()) {
            return;
        }
        java.util.Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            if (((kotlinx.datetime.internal.format.parser.NumberConsumer) it4.next()).getLength() == null && (i = i + 1) < 0) {
                kotlin.collections.CollectionsKt.throwCountOverflow();
            }
        }
        if (i <= 1) {
            return;
        }
        java.util.List<kotlinx.datetime.internal.format.parser.NumberConsumer<Output>> list5 = this.consumers;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list5) {
            if (((kotlinx.datetime.internal.format.parser.NumberConsumer) obj).getLength() == null) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((kotlinx.datetime.internal.format.parser.NumberConsumer) it5.next()).getWhatThisExpects());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("At most one variable-length numeric field in a row is allowed, but got several: ");
        sb.append(arrayList3);
        sb.append(". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.");
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    public final java.util.List<kotlinx.datetime.internal.format.parser.NumberConsumer<Output>> getConsumers() {
        return this.consumers;
    }

    private final java.lang.String getHighSpeedVideoSizes() {
        java.lang.String obj;
        java.util.List<kotlinx.datetime.internal.format.parser.NumberConsumer<Output>> list = this.consumers;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlinx.datetime.internal.format.parser.NumberConsumer numberConsumer = (kotlinx.datetime.internal.format.parser.NumberConsumer) it.next();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Integer length = numberConsumer.getLength();
            if (length == null) {
                obj = "at least one digit";
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(length);
                sb2.append(" digits");
                obj = sb2.toString();
            }
            sb.append(obj);
            sb.append(" for ");
            sb.append(numberConsumer.getWhatThisExpects());
            arrayList.add(sb.toString());
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (this.getHighSpeedVideoFpsRangesFor) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("a number with at least ");
            sb3.append(this.getHighSpeedVideoSizes);
            sb3.append(" digits: ");
            sb3.append(arrayList2);
            return sb3.toString();
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("a number with exactly ");
        sb4.append(this.getHighSpeedVideoSizes);
        sb4.append(" digits: ");
        sb4.append(arrayList2);
        return sb4.toString();
    }

    @Override // kotlinx.datetime.internal.format.parser.ParserOperation
    /* renamed from: consume-FANa98k, reason: not valid java name */
    public final java.lang.Object mo24171consumeFANa98k(Output storage, java.lang.CharSequence input, int startIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        if (this.getHighSpeedVideoSizes + startIndex > input.length()) {
            return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24180ErrorRg3Co2E(startIndex, new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.internal.format.parser.NumberSpanParserOperation$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return kotlinx.datetime.internal.format.parser.NumberSpanParserOperation.$r8$lambda$sHWNmXwy2nPQvQNcGTaJmOjSdNY(kotlinx.datetime.internal.format.parser.NumberSpanParserOperation.this);
                }
            });
        }
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        while (intRef.element + startIndex < input.length() && kotlinx.datetime.internal.UtilKt.isAsciiDigit(input.charAt(intRef.element + startIndex))) {
            intRef.element++;
            int i = intRef.element;
        }
        if (intRef.element < this.getHighSpeedVideoSizes) {
            return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24180ErrorRg3Co2E(startIndex, new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.internal.format.parser.NumberSpanParserOperation$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return kotlinx.datetime.internal.format.parser.NumberSpanParserOperation.$r8$lambda$G50ReBUf3F2Xx1GNEZez6ztAmuc(kotlin.jvm.internal.Ref.IntRef.this, this);
                }
            });
        }
        int size = this.consumers.size();
        final int i2 = 0;
        while (i2 < size) {
            java.lang.Integer length = this.consumers.get(i2).getLength();
            int intValue = (length != null ? length.intValue() : (intRef.element - this.getHighSpeedVideoSizes) + 1) + startIndex;
            final kotlinx.datetime.internal.format.parser.NumberConsumptionError consume = this.consumers.get(i2).consume(storage, input, startIndex, intValue);
            if (consume != null) {
                final java.lang.String obj = input.subSequence(startIndex, intValue).toString();
                return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24180ErrorRg3Co2E(startIndex, new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.internal.format.parser.NumberSpanParserOperation$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return kotlinx.datetime.internal.format.parser.NumberSpanParserOperation.$r8$lambda$9I6qCTVZfgsiqIj4otlRyqe593s(obj, this, i2, consume);
                    }
                });
            }
            i2++;
            startIndex = intValue;
        }
        return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24181OkQi1bsqg(startIndex);
    }

    public final java.lang.String toString() {
        return getHighSpeedVideoSizes();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$9I6qCTVZfgsiqIj4otlRyqe593s(java.lang.String str, kotlinx.datetime.internal.format.parser.NumberSpanParserOperation numberSpanParserOperation, int i, kotlinx.datetime.internal.format.parser.NumberConsumptionError numberConsumptionError) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can not interpret the string '");
        sb.append(str);
        sb.append("' as ");
        sb.append(numberSpanParserOperation.consumers.get(i).getWhatThisExpects());
        sb.append(": ");
        sb.append(numberConsumptionError.errorMessage());
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$G50ReBUf3F2Xx1GNEZez6ztAmuc(kotlin.jvm.internal.Ref.IntRef intRef, kotlinx.datetime.internal.format.parser.NumberSpanParserOperation numberSpanParserOperation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Only found ");
        sb.append(intRef.element);
        sb.append(" digits in a row, but need to parse ");
        sb.append(numberSpanParserOperation.getHighSpeedVideoSizes());
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$sHWNmXwy2nPQvQNcGTaJmOjSdNY(kotlinx.datetime.internal.format.parser.NumberSpanParserOperation numberSpanParserOperation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected end of input: yet to parse ");
        sb.append(numberSpanParserOperation.getHighSpeedVideoSizes());
        return sb.toString();
    }
}
