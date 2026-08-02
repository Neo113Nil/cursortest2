package com.zettle.sdk.meta;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/meta/BluetoothInfoImpl;", "Lcom/zettle/sdk/meta/BluetoothInfo;", "<init>", "()V", "", "address", "Landroid/bluetooth/BluetoothDevice;", "device", "(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;", "", "isEnabled", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BluetoothInfoImpl implements com.zettle.sdk.meta.BluetoothInfo {
    @Override // com.zettle.sdk.meta.BluetoothInfo
    public final boolean isEnabled() {
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    @Override // com.zettle.sdk.meta.BluetoothInfo
    public final android.bluetooth.BluetoothDevice device(java.lang.String address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.getRemoteDevice(address);
        }
        return null;
    }
}
