package com.startapp.sdk.adsbase.periodic;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.l2;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.rf;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.w1;
import com.startapp.sdk.internal.x1;
import com.startapp.sdk.internal.z7;
import java.util.Set;
import kotlin.jvm.internal.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends x1 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f3292i = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f3293e;
    public final ib f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3294g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3295h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, l2 callback, ib prefs, long j3, long j4) {
        super(context, callback);
        j.e(context, "context");
        j.e(callback, "callback");
        j.e(prefs, "prefs");
        this.f3293e = context;
        this.f = prefs;
        this.f3294g = j3;
        this.f3295h = j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:3:0x0006, B:5:0x0012, B:7:0x001a, B:9:0x0020, B:11:0x002e, B:15:0x0038), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // com.startapp.sdk.internal.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Object systemService;
        BluetoothAdapter bluetoothAdapter;
        z7 z7Var = new z7();
        boolean z3 = false;
        try {
            systemService = this.f3293e.getSystemService("bluetooth");
        } catch (Throwable th) {
            d9.a(th);
        }
        if ((systemService instanceof BluetoothManager) && (bluetoothAdapter = ((BluetoothManager) systemService).getAdapter()) != null) {
            if ((Build.VERSION.SDK_INT < 31 ? p0.a(this.f3293e, "android.permission.BLUETOOTH") : true) && bluetoothAdapter.isEnabled()) {
                if (bluetoothAdapter != null) {
                    z3 = a(bluetoothAdapter, z7Var);
                }
                this.f4618c.postDelayed(new D1.a(this, 6, z7Var), !z3 ? this.f3294g : 0L);
            }
        }
        bluetoothAdapter = null;
        if (bluetoothAdapter != null) {
        }
        this.f4618c.postDelayed(new D1.a(this, 6, z7Var), !z3 ? this.f3294g : 0L);
    }

    public static final void a(a this$0, z7 dataBuilder) {
        j.e(this$0, "this$0");
        j.e(dataBuilder, "$dataBuilder");
        this$0.a(dataBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.BroadcastReceiver, com.startapp.sdk.adsbase.periodic.GetBluetoothAsync$startUnsafe$1] */
    public final boolean a(BluetoothAdapter bluetoothAdapter, final z7 z7Var) {
        boolean a3;
        boolean a4;
        Set<BluetoothDevice> bondedDevices;
        try {
            if (Build.VERSION.SDK_INT < 31) {
                a4 = p0.a(this.f3293e, "android.permission.BLUETOOTH");
            } else {
                a4 = p0.a(this.f3293e, "android.permission.BLUETOOTH_CONNECT");
            }
            if (a4 && (bondedDevices = bluetoothAdapter.getBondedDevices()) != null) {
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    j.b(bluetoothDevice);
                    synchronized (z7Var) {
                        z7Var.f4778a.add(bluetoothDevice);
                    }
                }
            }
        } catch (Throwable th) {
            d9.a(th);
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z3 = currentTimeMillis - ((sf) this.f.a()).getLong("lastBtDiscoveringTime", 0L) >= this.f3295h;
        if (z3) {
            rf edit = ((sf) this.f.a()).edit();
            edit.a("lastBtDiscoveringTime", Long.valueOf(currentTimeMillis));
            edit.f4299a.putLong("lastBtDiscoveringTime", currentTimeMillis);
            edit.apply();
        }
        if (!z3) {
            return false;
        }
        ?? r12 = new BroadcastReceiver() { // from class: com.startapp.sdk.adsbase.periodic.GetBluetoothAsync$startUnsafe$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                j.e(context, "context");
                j.e(intent, "intent");
                if (!"android.bluetooth.device.action.FOUND".equals(intent.getAction())) {
                    if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(intent.getAction())) {
                        a.this.a(z7Var);
                    }
                } else {
                    BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice2 != null) {
                        z7 z7Var2 = z7Var;
                        synchronized (z7Var2) {
                            z7Var2.f4779b.add(bluetoothDevice2);
                        }
                    }
                }
            }
        };
        z7Var.f4780c = r12;
        this.f3293e.registerReceiver(r12, new IntentFilter("android.bluetooth.device.action.FOUND"));
        if (Build.VERSION.SDK_INT < 31) {
            a3 = p0.a(this.f3293e, "android.permission.BLUETOOTH_ADMIN");
        } else {
            a3 = p0.a(this.f3293e, "android.permission.BLUETOOTH_SCAN");
        }
        if (a3) {
            return bluetoothAdapter.startDiscovery();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[Catch: all -> 0x005e, TryCatch #2 {all -> 0x005e, blocks: (B:20:0x003f, B:22:0x004b, B:24:0x0053, B:26:0x0057, B:28:0x0063, B:33:0x006c, B:35:0x0070, B:37:0x0083, B:42:0x0079), top: B:19:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c A[Catch: all -> 0x005e, TryCatch #2 {all -> 0x005e, blocks: (B:20:0x003f, B:22:0x004b, B:24:0x0053, B:26:0x0057, B:28:0x0063, B:33:0x006c, B:35:0x0070, B:37:0x0083, B:42:0x0079), top: B:19:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(z7 z7Var) {
        Object systemService;
        boolean a3;
        BluetoothAdapter adapter;
        w1 w1Var;
        JSONObject jSONObject;
        boolean a4;
        BluetoothAdapter bluetoothAdapter = null;
        try {
            w1Var = this.f4617b;
        } catch (Throwable th) {
            d9.a(th);
        }
        try {
            if (z7Var != null) {
                if (Build.VERSION.SDK_INT < 31) {
                    a4 = p0.a(this.f3293e, "android.permission.BLUETOOTH");
                } else {
                    a4 = p0.a(this.f3293e, "android.permission.BLUETOOTH_CONNECT");
                }
                if (a4) {
                    jSONObject = z7Var.a();
                    w1Var.a(jSONObject);
                    if (z7Var != null) {
                        try {
                            GetBluetoothAsync$startUnsafe$1 getBluetoothAsync$startUnsafe$1 = z7Var.f4780c;
                            if (getBluetoothAsync$startUnsafe$1 != null) {
                                z7Var.f4780c = null;
                                this.f3293e.unregisterReceiver(getBluetoothAsync$startUnsafe$1);
                            }
                        } catch (Throwable th2) {
                            d9.a(th2);
                        }
                    }
                    systemService = this.f3293e.getSystemService("bluetooth");
                    if ((systemService instanceof BluetoothManager) && (adapter = ((BluetoothManager) systemService).getAdapter()) != null) {
                        if ((Build.VERSION.SDK_INT >= 31 ? p0.a(this.f3293e, "android.permission.BLUETOOTH") : true) && adapter.isEnabled()) {
                            bluetoothAdapter = adapter;
                        }
                    }
                    if (bluetoothAdapter == null) {
                        if (Build.VERSION.SDK_INT < 31) {
                            a3 = p0.a(this.f3293e, "android.permission.BLUETOOTH_ADMIN");
                        } else {
                            a3 = p0.a(this.f3293e, "android.permission.BLUETOOTH_SCAN");
                        }
                        if (a3) {
                            bluetoothAdapter.cancelDiscovery();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            systemService = this.f3293e.getSystemService("bluetooth");
            if (systemService instanceof BluetoothManager) {
                if (Build.VERSION.SDK_INT >= 31 ? p0.a(this.f3293e, "android.permission.BLUETOOTH") : true) {
                    bluetoothAdapter = adapter;
                }
            }
            if (bluetoothAdapter == null) {
            }
        } catch (Throwable th3) {
            d9.a(th3);
            return;
        }
        jSONObject = null;
        w1Var.a(jSONObject);
        if (z7Var != null) {
        }
    }
}
