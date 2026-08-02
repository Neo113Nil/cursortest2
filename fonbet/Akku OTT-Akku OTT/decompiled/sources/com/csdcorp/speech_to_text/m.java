package com.csdcorp.speech_to_text;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements BluetoothProfile.ServiceListener {
    public final /* synthetic */ SpeechToTextPlugin a;

    public m(SpeechToTextPlugin speechToTextPlugin) {
        this.a = speechToTextPlugin;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile proxy) {
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        if (i == 1) {
            BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) proxy;
            SpeechToTextPlugin speechToTextPlugin = this.a;
            speechToTextPlugin.w = bluetoothHeadset;
            Objects.toString(bluetoothHeadset);
            speechToTextPlugin.getClass();
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        if (i == 1) {
            SpeechToTextPlugin speechToTextPlugin = this.a;
            speechToTextPlugin.getClass();
            speechToTextPlugin.w = null;
        }
    }
}
