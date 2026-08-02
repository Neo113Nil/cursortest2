package com.paypal.oslo.feature.bnplacquisition.data.util;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a2\u0010\u0005\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "type", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "valueOf", "(Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapperUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T extends java.lang.Enum<T>> T valueOf(java.lang.String str, T t) {
        T t2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            t2 = kotlin.Result.m23436constructorimpl(java.lang.Enum.valueOf(java.lang.Enum.class, str));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            t2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (!kotlin.Result.m23441isFailureimpl(t2)) {
            t = t2;
        }
        return t;
    }
}
