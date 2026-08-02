package com.paypal.oslo.feature.identity.shared.data.provider;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0016¢\u0006\u0004\b\t\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/data/provider/AndroidStringProvider;", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "resId", "", "getString", "(I)Ljava/lang/String;", "", "", "formatArgs", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidStringProvider implements com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AndroidStringProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider
    public final java.lang.String getString(int resId) {
        java.lang.String string = this.getHighSpeedVideoFpsRangesFor.getString(resId);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider
    public final java.lang.String getString(int resId, java.lang.Object... formatArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatArgs, "");
        java.lang.String string = this.getHighSpeedVideoFpsRangesFor.getString(resId, java.util.Arrays.copyOf(formatArgs, formatArgs.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
