package Fh0;

import J4.l;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ozon.android.hardwareinfo.powermanager.PowerSaveState;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.push.sdk.internal.status.data.repository.database.PushDataBase_Impl;

/* loaded from: classes7.dex */
public final class c implements Fh0.a {

    /* renamed from: a, reason: collision with root package name */
    private final PushDataBase_Impl f9475a;

    /* renamed from: b, reason: collision with root package name */
    private final l<Gh0.a> f9476b;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9477a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f9478b;

        static {
            int[] iArr = new int[PowerSaveState.values().length];
            f9478b = iArr;
            try {
                iArr[PowerSaveState.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9478b[PowerSaveState.PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9478b[PowerSaveState.POWER_SAVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9478b[PowerSaveState.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConnectionType.values().length];
            f9477a = iArr2;
            try {
                iArr2[ConnectionType.CONNECTION_TYPE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9477a[ConnectionType.CELLULAR_SLOW_2G.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9477a[ConnectionType.CELLULAR_2G.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9477a[ConnectionType.CELLULAR_3G.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9477a[ConnectionType.CELLULAR_4G.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9477a[ConnectionType.WIFI.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9477a[ConnectionType.NO_INTERNET.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public c(@NonNull PushDataBase_Impl pushDataBase_Impl) {
        this.f9475a = pushDataBase_Impl;
        this.f9476b = new b(this, pushDataBase_Impl);
    }

    public final void a(ArrayList arrayList) {
        PushDataBase_Impl pushDataBase_Impl = this.f9475a;
        pushDataBase_Impl.assertNotSuspendingTransaction();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM device_stats WHERE id IN (SELECT device_stats_id FROM push_status WHERE id in (");
        L4.d.a(arrayList.size(), sb2);
        sb2.append("))");
        O4.f compileStatement = pushDataBase_Impl.compileStatement(sb2.toString());
        Iterator it = arrayList.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            compileStatement.e0(i11, (String) it.next());
            i11++;
        }
        pushDataBase_Impl.beginTransaction();
        try {
            compileStatement.C();
            pushDataBase_Impl.setTransactionSuccessful();
        } finally {
            pushDataBase_Impl.endTransaction();
        }
    }

    public final long b(Gh0.a aVar) {
        PushDataBase_Impl pushDataBase_Impl = this.f9475a;
        pushDataBase_Impl.assertNotSuspendingTransaction();
        pushDataBase_Impl.beginTransaction();
        try {
            long insertAndReturnId = this.f9476b.insertAndReturnId(aVar);
            pushDataBase_Impl.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            pushDataBase_Impl.endTransaction();
        }
    }
}
