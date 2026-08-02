package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "T", "", "<init>", "()V", "Lkotlinx/datetime/internal/format/ConcatenatedFormatStructure;", "build", "()Lkotlinx/datetime/internal/format/ConcatenatedFormatStructure;", "Lkotlinx/datetime/internal/format/FormatStructure;", "format", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "", "Lkotlinx/datetime/internal/format/NonConcatenatedFormatStructure;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AppendableFormatStructure<T> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<kotlinx.datetime.internal.format.NonConcatenatedFormatStructure<T>> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

    public final kotlinx.datetime.internal.format.ConcatenatedFormatStructure<T> build() {
        return new kotlinx.datetime.internal.format.ConcatenatedFormatStructure<>(this.getHighSpeedVideoFpsRanges);
    }

    public final void add(kotlinx.datetime.internal.format.FormatStructure<? super T> format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        if (format instanceof kotlinx.datetime.internal.format.NonConcatenatedFormatStructure) {
            this.getHighSpeedVideoFpsRanges.add(format);
        } else {
            if (!(format instanceof kotlinx.datetime.internal.format.ConcatenatedFormatStructure)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.util.Iterator<T> it = ((kotlinx.datetime.internal.format.ConcatenatedFormatStructure) format).getFormats().iterator();
            while (it.hasNext()) {
                this.getHighSpeedVideoFpsRanges.add((kotlinx.datetime.internal.format.NonConcatenatedFormatStructure) it.next());
            }
        }
    }
}
