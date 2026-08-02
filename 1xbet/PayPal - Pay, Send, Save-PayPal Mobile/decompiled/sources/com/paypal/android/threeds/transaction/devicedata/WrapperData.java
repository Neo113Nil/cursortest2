package com.paypal.android.threeds.transaction.devicedata;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/android/threeds/transaction/devicedata/WrapperData;", "", "<init>", "()V", "", "getVersionSDKInt", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WrapperData {
    public static final int $stable = 0;
    public static final com.paypal.android.threeds.transaction.devicedata.WrapperData INSTANCE = new com.paypal.android.threeds.transaction.devicedata.WrapperData();

    private WrapperData() {
    }

    public final int getVersionSDKInt() {
        return android.os.Build.VERSION.SDK_INT;
    }
}
