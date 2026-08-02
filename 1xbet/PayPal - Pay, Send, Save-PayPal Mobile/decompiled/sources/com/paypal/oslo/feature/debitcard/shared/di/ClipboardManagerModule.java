package com.paypal.oslo.feature.debitcard.shared.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/di/ClipboardManagerModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/debitcard/shared/util/ClipboardManager;", "provideClipboardManager", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/debitcard/shared/util/ClipboardManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class ClipboardManagerModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.debitcard.shared.di.ClipboardManagerModule INSTANCE = new com.paypal.oslo.feature.debitcard.shared.di.ClipboardManagerModule();

    private ClipboardManagerModule() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dagger.Provides
    public final com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager provideClipboardManager(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager(context, null, 2, 0 == true ? 1 : 0);
    }
}
