package Fh0;

import Fh0.c;
import J4.l;
import androidx.annotation.NonNull;
import ru.ozon.android.hardwareinfo.powermanager.PowerSaveState;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.push.sdk.internal.status.data.repository.database.PushDataBase_Impl;
import spay.sdk.domain.model.FraudMonInfo;

/* loaded from: classes3.dex */
final class b extends l<Gh0.a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f9474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, PushDataBase_Impl pushDataBase_Impl) {
        super(pushDataBase_Impl);
        this.f9474a = cVar;
    }

    @Override // J4.l
    protected final void bind(@NonNull O4.f fVar, @NonNull Gh0.a aVar) {
        String str;
        String str2;
        Gh0.a aVar2 = aVar;
        fVar.m0(1, aVar2.d());
        ConnectionType c11 = aVar2.c();
        this.f9474a.getClass();
        switch (c.a.f9477a[c11.ordinal()]) {
            case 1:
                str = "CONNECTION_TYPE_UNKNOWN";
                break;
            case 2:
                str = "CELLULAR_SLOW_2G";
                break;
            case 3:
                str = "CELLULAR_2G";
                break;
            case 4:
                str = "CELLULAR_3G";
                break;
            case 5:
                str = "CELLULAR_4G";
                break;
            case 6:
                str = "WIFI";
                break;
            case 7:
                str = "NO_INTERNET";
                break;
            default:
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + c11);
        }
        fVar.e0(2, str);
        fVar.e0(3, aVar2.b());
        fVar.e0(4, aVar2.e());
        fVar.m0(5, aVar2.a());
        fVar.m0(6, aVar2.g() ? 1L : 0L);
        PowerSaveState f7 = aVar2.f();
        int i11 = c.a.f9478b[f7.ordinal()];
        if (i11 == 1) {
            str2 = "DEFAULT";
        } else if (i11 == 2) {
            str2 = "PERFORMANCE";
        } else if (i11 == 3) {
            str2 = "POWER_SAVE";
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + f7);
            }
            str2 = FraudMonInfo.UNKNOWN;
        }
        fVar.e0(7, str2);
        if ((aVar2.i() == null ? null : Integer.valueOf(aVar2.i().booleanValue() ? 1 : 0)) == null) {
            fVar.C0(8);
        } else {
            fVar.m0(8, r0.intValue());
        }
        if ((aVar2.h() != null ? Integer.valueOf(aVar2.h().booleanValue() ? 1 : 0) : null) == null) {
            fVar.C0(9);
        } else {
            fVar.m0(9, r1.intValue());
        }
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR ABORT INTO `device_stats` (`id`,`net`,`cellular_operator`,`net_provider`,`battery_charge`,`energy_saving_mode`,`energy_saving_mode_android`,`vpn_enabled`,`proxy_enabled`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
    }
}
