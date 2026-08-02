package com.datadog.android.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"T", "Lkotlin/Function0;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "allowThreadDiskReads", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "allowThreadDiskWrites"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StrictModeExtKt {
    public static final <T> T allowThreadDiskReads(kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return function0.invoke();
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static final <T> T allowThreadDiskWrites(kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        android.os.StrictMode.ThreadPolicy allowThreadDiskWrites = android.os.StrictMode.allowThreadDiskWrites();
        try {
            return function0.invoke();
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }
}
