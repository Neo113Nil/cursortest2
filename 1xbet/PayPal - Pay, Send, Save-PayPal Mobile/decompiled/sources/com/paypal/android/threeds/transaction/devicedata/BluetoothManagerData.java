package com.paypal.android.threeds.transaction.devicedata;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0012\u0010\u0011J)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/android/threeds/transaction/devicedata/BluetoothManagerData;", "Lcom/paypal/android/threeds/interfaces/DeviceDataFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "", "deviceData", "deviceParamNotAvailable", "", "updateDeviceData", "(Landroid/content/Context;Ljava/util/Map;Ljava/util/Map;)V", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "updateBondedDevices", "(Landroid/bluetooth/BluetoothAdapter;Ljava/util/Map;Ljava/util/Map;)V", "updateBondedDeviceAlias", "updateBluetoothStatus", "(Landroid/bluetooth/BluetoothAdapter;Ljava/util/Map;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BluetoothManagerData implements com.paypal.android.threeds.interfaces.DeviceDataFactory {
    public static final int $stable = 0;
    public static final com.paypal.android.threeds.transaction.devicedata.BluetoothManagerData INSTANCE = new com.paypal.android.threeds.transaction.devicedata.BluetoothManagerData();

    private BluetoothManagerData() {
    }

    @Override // com.paypal.android.threeds.interfaces.DeviceDataFactory
    public final void updateDeviceData(android.content.Context context, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        if (com.paypal.android.threeds.utils.DeviceDataUtil.INSTANCE.isPermissionGranted(context, "android.permission.BLUETOOTH_CONNECT")) {
            java.lang.Object systemService = context.getSystemService("bluetooth");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
            android.bluetooth.BluetoothAdapter adapter = ((android.bluetooth.BluetoothManager) systemService).getAdapter();
            if (adapter != null) {
                com.paypal.android.threeds.transaction.devicedata.BluetoothManagerData bluetoothManagerData = INSTANCE;
                bluetoothManagerData.updateBondedDevices(adapter, deviceData, deviceParamNotAvailable);
                bluetoothManagerData.updateBondedDeviceAlias(adapter, deviceData, deviceParamNotAvailable);
                bluetoothManagerData.updateBluetoothStatus(adapter, deviceData);
                return;
            }
            return;
        }
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.BLUETOOTH_ADDRESS.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.BLUETOOTH_BONDED_DEVICE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.BLUETOOTH_BOUNDED_DEVICE_ALIAS.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.BLUETOOTH_IS_ENABLED.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NEED_PERMISSION);
    }

    public final void updateBondedDevices(android.bluetooth.BluetoothAdapter bluetoothAdapter, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothAdapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bondedDevices);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = bondedDevices.iterator();
        while (it.hasNext()) {
            java.lang.String address = ((android.bluetooth.BluetoothDevice) it.next()).getAddress();
            if (address != null) {
                arrayList.add(address);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.BLUETOOTH_BONDED_DEVICE.getCode(), arrayList2.toArray(new java.lang.String[0]));
        } else {
            deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.BLUETOOTH_BONDED_DEVICE.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
        }
    }

    public final void updateBondedDeviceAlias(android.bluetooth.BluetoothAdapter bluetoothAdapter, java.util.Map<java.lang.String, java.lang.Object> deviceData, java.util.Map<java.lang.String, java.lang.String> deviceParamNotAvailable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothAdapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceParamNotAvailable, "");
        if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 30) {
            java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
            kotlin.jvm.internal.Intrinsics.checkNotNull(bondedDevices);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = bondedDevices.iterator();
            while (it.hasNext()) {
                java.lang.String alias = ((android.bluetooth.BluetoothDevice) it.next()).getAlias();
                if (alias != null) {
                    arrayList.add(alias);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.BLUETOOTH_BOUNDED_DEVICE_ALIAS.getCode(), arrayList2.toArray(new java.lang.String[0]));
                return;
            } else {
                deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.BLUETOOTH_BOUNDED_DEVICE_ALIAS.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
                return;
            }
        }
        deviceParamNotAvailable.put(com.paypal.android.threeds.data.model.DeviceDataParam.BLUETOOTH_BOUNDED_DEVICE_ALIAS.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.PLATFORM_DOES_NOT_SUPPORT);
    }

    public final void updateBluetoothStatus(android.bluetooth.BluetoothAdapter bluetoothAdapter, java.util.Map<java.lang.String, java.lang.Object> deviceData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothAdapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.BLUETOOTH_IS_ENABLED.getCode(), java.lang.String.valueOf(bluetoothAdapter.isEnabled()));
        java.lang.String address = bluetoothAdapter.getAddress();
        if (address != null && !kotlin.text.StringsKt.isBlank(address)) {
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.BLUETOOTH_ADDRESS.getCode(), bluetoothAdapter.getAddress());
        } else {
            deviceData.put(com.paypal.android.threeds.data.model.DeviceDataParam.BLUETOOTH_ADDRESS.getCode(), com.paypal.android.threeds.utils.DeviceDataUtil.NULL_OR_BLANK);
        }
    }
}
