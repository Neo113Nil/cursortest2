package com.datadog.android.sessionreplay.internal.recorder.resources;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/DefaultBitmapSignatureGenerator;", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapSignatureGenerator;", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "generateSignature", "(Landroid/graphics/Bitmap;)Ljava/lang/Long;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultBitmapSignatureGenerator implements com.datadog.android.sessionreplay.internal.recorder.resources.BitmapSignatureGenerator {
    private static final com.datadog.android.sessionreplay.internal.recorder.resources.DefaultBitmapSignatureGenerator.Companion Companion = new com.datadog.android.sessionreplay.internal.recorder.resources.DefaultBitmapSignatureGenerator.Companion(null);
    private final com.datadog.android.internal.system.BuildSdkVersionProvider getHighResolutionOutputSizeshNQ4ISI;

    public DefaultBitmapSignatureGenerator(com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = buildSdkVersionProvider;
    }

    public /* synthetic */ DefaultBitmapSignatureGenerator(com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/DefaultBitmapSignatureGenerator$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.resources.BitmapSignatureGenerator
    public final java.lang.Long generateSignature(android.graphics.Bitmap bitmap) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        int i2 = 0;
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI.getIsAtLeastO() && bitmap.getConfig() == android.graphics.Bitmap.Config.HARDWARE;
        if (bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || z) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        long j = ((width + 527) * 31) + height;
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(width / 16, 1);
        int coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtLeast(height / 16, 1);
        kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, width), coerceAtLeast);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                kotlin.ranges.IntProgression step3 = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(i2, height), coerceAtLeast2);
                int first2 = step3.getFirst();
                int last2 = step3.getLast();
                int step4 = step3.getStep();
                if ((step4 > 0 && first2 <= last2) || (step4 < 0 && last2 <= first2)) {
                    while (true) {
                        i = height;
                        j = (j * 31) + bitmap.getPixel(first, first2);
                        if (first2 == last2) {
                            break;
                        }
                        first2 += step4;
                        height = i;
                    }
                } else {
                    i = height;
                }
                if (first == last) {
                    break;
                }
                first += step2;
                height = i;
                i2 = 0;
            }
        }
        return java.lang.Long.valueOf(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultBitmapSignatureGenerator() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
