package com.zettle.sdk.meta;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/meta/BluetoothInfo;", "", "", "address", "Landroid/bluetooth/BluetoothDevice;", "device", "(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;", "", "isEnabled", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface BluetoothInfo {
    android.bluetooth.BluetoothDevice device(java.lang.String address);

    boolean isEnabled();
}
