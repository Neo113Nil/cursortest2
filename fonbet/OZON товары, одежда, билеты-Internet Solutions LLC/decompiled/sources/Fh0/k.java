package Fh0;

import Ij.C3261b;
import J4.w;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.collection.C5153w;
import java.util.ArrayList;
import kotlin.Unit;
import ru.ozon.android.hardwareinfo.powermanager.PowerSaveState;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.push.sdk.internal.status.data.repository.database.PushDataBase;
import ru.ozon.push.sdk.internal.status.data.repository.database.PushDataBase_Impl;
import spay.sdk.domain.model.FraudMonInfo;

/* loaded from: classes7.dex */
public final class k extends i {

    /* renamed from: b, reason: collision with root package name */
    private final PushDataBase f9486b;

    public k(@NonNull PushDataBase_Impl pushDataBase_Impl) {
        super(pushDataBase_Impl);
        this.f9486b = pushDataBase_Impl;
    }

    public static /* synthetic */ Unit d(k kVar, C5153w c5153w) {
        kVar.e(c5153w);
        return Unit.f71690a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void e(@NonNull C5153w<Gh0.a> c5153w) {
        String string;
        ConnectionType connectionType;
        char c11;
        PowerSaveState powerSaveState;
        int i11 = 0;
        if (c5153w.d()) {
            return;
        }
        if (c5153w.h() > 999) {
            L4.c.b(c5153w, new j(this, i11));
            return;
        }
        StringBuilder e11 = C3261b.e("SELECT `id`,`net`,`cellular_operator`,`net_provider`,`battery_charge`,`energy_saving_mode`,`energy_saving_mode_android`,`vpn_enabled`,`proxy_enabled` FROM `device_stats` WHERE `id` IN (");
        int h11 = c5153w.h();
        L4.d.a(h11, e11);
        e11.append(")");
        w j11 = w.j(h11, e11.toString());
        int i12 = 1;
        for (int i13 = 0; i13 < c5153w.h(); i13++) {
            j11.m0(i12, c5153w.e(i13));
            i12++;
        }
        Cursor b11 = L4.b.b(this.f9486b, j11, false);
        try {
            int a11 = L4.a.a(b11, "id");
            if (a11 == -1) {
                return;
            }
            while (b11.moveToNext()) {
                long j12 = b11.getLong(a11);
                if (c5153w.c(j12) >= 0) {
                    long j13 = b11.getLong(0);
                    string = b11.getString(1);
                    string.getClass();
                    switch (string) {
                        case "CELLULAR_SLOW_2G":
                            connectionType = ConnectionType.CELLULAR_SLOW_2G;
                            break;
                        case "CELLULAR_2G":
                            connectionType = ConnectionType.CELLULAR_2G;
                            break;
                        case "CELLULAR_3G":
                            connectionType = ConnectionType.CELLULAR_3G;
                            break;
                        case "CELLULAR_4G":
                            connectionType = ConnectionType.CELLULAR_4G;
                            break;
                        case "WIFI":
                            connectionType = ConnectionType.WIFI;
                            break;
                        case "NO_INTERNET":
                            connectionType = ConnectionType.NO_INTERNET;
                            break;
                        case "CONNECTION_TYPE_UNKNOWN":
                            connectionType = ConnectionType.CONNECTION_TYPE_UNKNOWN;
                            break;
                        default:
                            throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(string));
                    }
                    ConnectionType connectionType2 = connectionType;
                    String string2 = b11.getString(2);
                    String string3 = b11.getString(3);
                    int i14 = b11.getInt(4);
                    boolean z11 = b11.getInt(5) != 0;
                    String string4 = b11.getString(6);
                    string4.getClass();
                    switch (string4.hashCode()) {
                        case -2032180703:
                            if (string4.equals("DEFAULT")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 433141802:
                            if (string4.equals(FraudMonInfo.UNKNOWN)) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 672572432:
                            if (string4.equals("PERFORMANCE")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 955558039:
                            if (string4.equals("POWER_SAVE")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            powerSaveState = PowerSaveState.DEFAULT;
                            break;
                        case 1:
                            powerSaveState = PowerSaveState.UNKNOWN;
                            break;
                        case 2:
                            powerSaveState = PowerSaveState.PERFORMANCE;
                            break;
                        case 3:
                            powerSaveState = PowerSaveState.POWER_SAVE;
                            break;
                        default:
                            throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(string4));
                    }
                    PowerSaveState powerSaveState2 = powerSaveState;
                    Integer valueOf = b11.isNull(7) ? null : Integer.valueOf(b11.getInt(7));
                    Boolean valueOf2 = valueOf == null ? null : Boolean.valueOf(valueOf.intValue() != 0);
                    Integer valueOf3 = b11.isNull(8) ? null : Integer.valueOf(b11.getInt(8));
                    c5153w.f(j12, new Gh0.a(j13, connectionType2, string2, string3, i14, z11, powerSaveState2, valueOf2, valueOf3 != null ? Boolean.valueOf(valueOf3.intValue() != 0) : null));
                }
            }
        } finally {
            b11.close();
        }
    }

    @Override // Fh0.i
    public final void a(ArrayList arrayList) {
        PushDataBase pushDataBase = this.f9486b;
        pushDataBase.beginTransaction();
        try {
            super.a(arrayList);
            pushDataBase.setTransactionSuccessful();
        } finally {
            pushDataBase.endTransaction();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Fh0.i
    public final ArrayList b() {
        w wVar;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        int b16;
        int b17;
        int b18;
        int b19;
        int b21;
        int b22;
        C5153w<Gh0.a> c5153w;
        String str;
        Boolean valueOf;
        int i11;
        PushDataBase pushDataBase;
        Gh0.a aVar;
        int i12;
        int i13;
        w j11 = w.j(0, "SELECT * FROM push_status");
        PushDataBase pushDataBase2 = this.f9486b;
        pushDataBase2.assertNotSuspendingTransaction();
        pushDataBase2.beginTransaction();
        try {
            try {
                Cursor b23 = L4.b.b(pushDataBase2, j11, true);
                try {
                    b11 = L4.a.b(b23, "id");
                    b12 = L4.a.b(b23, "status");
                    b13 = L4.a.b(b23, "createTimestamp");
                    b14 = L4.a.b(b23, "sendingAttemptNumber");
                    b15 = L4.a.b(b23, "device_stats_id");
                    b16 = L4.a.b(b23, "pushServiceStartupTime");
                    b17 = L4.a.b(b23, "delivery_status");
                    b18 = L4.a.b(b23, "is_teens_mode");
                    b19 = L4.a.b(b23, "priority");
                    b21 = L4.a.b(b23, "original_priority");
                    b22 = L4.a.b(b23, "first_message_id");
                    c5153w = new C5153w<>();
                } catch (Throwable th2) {
                    th = th2;
                    wVar = j11;
                }
                while (true) {
                    wVar = j11;
                    str = null;
                    if (!b23.moveToNext()) {
                        break;
                    }
                    try {
                        Long valueOf2 = b23.isNull(b15) ? null : Long.valueOf(b23.getLong(b15));
                        if (valueOf2 != null) {
                            i12 = b19;
                            i13 = b21;
                            c5153w.f(valueOf2.longValue(), null);
                        } else {
                            i12 = b19;
                            i13 = b21;
                        }
                        j11 = wVar;
                        b19 = i12;
                        b21 = i13;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    th = th3;
                    b23.close();
                    wVar.release();
                    throw th;
                }
                int i14 = b19;
                int i15 = b21;
                b23.moveToPosition(-1);
                e(c5153w);
                ArrayList arrayList = new ArrayList(b23.getCount());
                while (b23.moveToNext()) {
                    String string = b23.getString(b11);
                    Gh0.d a11 = Eh0.a.a(b23.getInt(b12));
                    Long valueOf3 = b23.isNull(b13) ? str : Long.valueOf(b23.getLong(b13));
                    Integer valueOf4 = b23.isNull(b14) ? str : Integer.valueOf(b23.getInt(b14));
                    Long valueOf5 = b23.isNull(b15) ? str : Long.valueOf(b23.getLong(b15));
                    Long valueOf6 = b23.isNull(b16) ? str : Long.valueOf(b23.getLong(b16));
                    String string2 = b23.isNull(b17) ? str : b23.getString(b17);
                    Integer valueOf7 = b23.isNull(b18) ? str : Integer.valueOf(b23.getInt(b18));
                    if (valueOf7 == 0) {
                        valueOf = str;
                    } else {
                        valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                    }
                    int i16 = i14;
                    String string3 = b23.isNull(i16) ? str : b23.getString(i16);
                    int i17 = i15;
                    Gh0.b bVar = new Gh0.b(string, a11, valueOf3, valueOf4, valueOf5, valueOf6, string2, valueOf, string3, b23.isNull(i17) ? null : b23.getString(i17), b23.isNull(b22) ? null : b23.getString(b22));
                    int i18 = b22;
                    Long valueOf8 = b23.isNull(b15) ? null : Long.valueOf(b23.getLong(b15));
                    if (valueOf8 != null) {
                        i11 = i17;
                        pushDataBase = pushDataBase2;
                        try {
                            aVar = c5153w.b(valueOf8.longValue());
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        i11 = i17;
                        pushDataBase = pushDataBase2;
                        aVar = null;
                    }
                    arrayList.add(new Gh0.c(bVar, aVar));
                    b22 = i18;
                    pushDataBase2 = pushDataBase;
                    i15 = i11;
                    str = null;
                    i14 = i16;
                }
                PushDataBase pushDataBase3 = pushDataBase2;
                pushDataBase3.setTransactionSuccessful();
                b23.close();
                wVar.release();
                pushDataBase3.endTransaction();
                return arrayList;
            } catch (Throwable th5) {
                th = th5;
                pushDataBase2.endTransaction();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            pushDataBase2.endTransaction();
            throw th;
        }
    }

    @Override // Fh0.i
    public final void c(Ih0.c cVar) {
        PushDataBase pushDataBase = this.f9486b;
        pushDataBase.beginTransaction();
        try {
            super.c(cVar);
            pushDataBase.setTransactionSuccessful();
        } finally {
            pushDataBase.endTransaction();
        }
    }
}
