package com.paypal.oslo.feature.shaketoreport.utils;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/utils/ScreenshotConverterImpl;", "Lcom/paypal/oslo/feature/shaketoreport/domain/ScreenshotConverter;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "byteArray", "Ljava/io/File;", "convert", "([B)Ljava/io/File;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScreenshotConverterImpl implements com.paypal.oslo.feature.shaketoreport.domain.ScreenshotConverter {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ScreenshotConverterImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = context;
    }

    @Override // com.paypal.oslo.feature.shaketoreport.domain.ScreenshotConverter
    public final java.io.File convert(byte[] byteArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteArray, "");
        return com.paypal.oslo.feature.shaketoreport.utils.ScreenShotUtilKt.convertByteArrayToFile(this.getHighSpeedVideoSizes, byteArray);
    }
}
