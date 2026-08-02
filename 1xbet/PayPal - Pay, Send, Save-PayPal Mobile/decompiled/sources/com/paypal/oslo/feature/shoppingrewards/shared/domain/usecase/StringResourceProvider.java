package com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "stringResId", "", "getString", "(I)Ljava/lang/String;", "", "formatArgs", "getFormattedString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroid/content/Context;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StringResourceProvider {
    public static final int $stable = 8;
    private final android.content.Context getHighSpeedVideoSizes;

    @javax.inject.Inject
    public StringResourceProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = context;
    }

    public final java.lang.String getString(int stringResId) {
        java.lang.String string = this.getHighSpeedVideoSizes.getString(stringResId);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String getFormattedString(int stringResId, java.lang.Object... formatArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatArgs, "");
        java.lang.String string = this.getHighSpeedVideoSizes.getString(stringResId, java.util.Arrays.copyOf(formatArgs, formatArgs.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
