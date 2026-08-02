package com.paypal.oslo.feature.balance.ui.autoReload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class AutoReloadBaseScreenKt$createScheduledListItem$description$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.String> {
    public final java.lang.String Camera2StreamConfigurationMap(int i) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel) this.receiver).formatOrdinal(i);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.String invoke(java.lang.Integer num) {
        return Camera2StreamConfigurationMap(num.intValue());
    }

    AutoReloadBaseScreenKt$createScheduledListItem$description$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.class, "formatOrdinal", "formatOrdinal(I)Ljava/lang/String;", 0);
    }
}
