package p019c5;

import D0.k;
import H0.d;
import J3.n;
import K3.h;
import V3.F;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import androidx.appcompat.widget.n1;
import androidx.work.impl.WorkDatabase_Impl;
import io.sentry.protocol.SentryThread;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.ProviderException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import p023d1.c;
import p023d1.g;
import p088m1.b;
import p088m1.e;
import p088m1.i;
import p113p3.f;
import p155w1.C1017n0;
import p155w1.C1050x1;
import p155w1.F0;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f10439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f10440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f10441i;

    public a(WorkDatabase_Impl workDatabase_Impl) {
        this.f10433a = workDatabase_Impl;
        this.f10434b = new b(workDatabase_Impl, 5);
        this.f10435c = new e(workDatabase_Impl, 3);
        this.f10436d = new e(workDatabase_Impl, 4);
        this.f10437e = new e(workDatabase_Impl, 5);
        this.f10438f = new e(workDatabase_Impl, 6);
        this.f10439g = new e(workDatabase_Impl, 7);
        this.f10440h = new e(workDatabase_Impl, 8);
        this.f10441i = new e(workDatabase_Impl, 9);
        new AtomicBoolean(false);
    }

    public void a(SharedPreferences sharedPreferences, H0.b bVar) {
        try {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains((String) this.f10435c)) {
                    String strB = b((String) value);
                    H0.a aVar = (H0.a) bVar.edit();
                    aVar.putString(key, strB);
                    aVar.apply();
                    sharedPreferences.edit().remove(key).apply();
                }
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            ((F0) this.f10440h).getClass();
            editorEdit.remove("FlutterSecureSAlgorithmKey");
            editorEdit.remove("FlutterSecureSAlgorithmStorage");
            editorEdit.apply();
        } catch (Exception e7) {
            Log.e("SecureStorageAndroid", "Data migration failed", e7);
        }
    }

    public String b(String str) {
        if (str == null) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        C1017n0 c1017n0 = (C1017n0) this.f10439g;
        int iX = c1017n0.x();
        byte[] bArr = new byte[iX];
        System.arraycopy(bArrDecode, 0, bArr, 0, iX);
        AlgorithmParameterSpec algorithmParameterSpecZ = c1017n0.z(bArr);
        int length = bArrDecode.length - c1017n0.x();
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrDecode, iX, bArr2, 0, length);
        Key key = (Key) c1017n0.f17813d;
        Cipher cipher = (Cipher) c1017n0.f17811b;
        cipher.init(2, key, algorithmParameterSpecZ);
        return new String(cipher.doFinal(bArr2), (Charset) this.f10433a);
    }

    public void c() {
        if (((Map) this.f10437e).containsKey("sharedPreferencesName") && !((String) ((Map) this.f10437e).get("sharedPreferencesName")).isEmpty()) {
            this.f10436d = (String) ((Map) this.f10437e).get("sharedPreferencesName");
        }
        if (((Map) this.f10437e).containsKey("preferencesKeyPrefix") && !((String) ((Map) this.f10437e).get("preferencesKeyPrefix")).isEmpty()) {
            this.f10435c = (String) ((Map) this.f10437e).get("preferencesKeyPrefix");
        }
        String str = (String) this.f10436d;
        Context context = (Context) this.f10434b;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        if (((C1017n0) this.f10439g) == null) {
            try {
                n(sharedPreferences);
            } catch (Exception e7) {
                Log.e("SecureStorageAndroid", "StorageCipher initialization failed", e7);
            }
        }
        if (!k()) {
            this.f10438f = sharedPreferences;
            return;
        }
        try {
            H0.b bVarO = o(context);
            this.f10438f = bVarO;
            a(sharedPreferences, bVarO);
        } catch (Exception e8) {
            Log.e("SecureStorageAndroid", "EncryptedSharedPreferences initialization failed", e8);
            this.f10438f = sharedPreferences;
            this.f10441i = Boolean.TRUE;
        }
    }

    public ArrayList d() throws Throwable {
        k kVar;
        k kVarC = k.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        kVarC.d(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(kVarC);
        try {
            int iJ = f.J(cursorG, "required_network_type");
            int iJ2 = f.J(cursorG, "requires_charging");
            int iJ3 = f.J(cursorG, "requires_device_idle");
            int iJ4 = f.J(cursorG, "requires_battery_not_low");
            int iJ5 = f.J(cursorG, "requires_storage_not_low");
            int iJ6 = f.J(cursorG, "trigger_content_update_delay");
            int iJ7 = f.J(cursorG, "trigger_max_content_delay");
            int iJ8 = f.J(cursorG, "content_uri_triggers");
            int iJ9 = f.J(cursorG, "id");
            int iJ10 = f.J(cursorG, SentryThread.JsonKeys.STATE);
            int iJ11 = f.J(cursorG, "worker_class_name");
            int iJ12 = f.J(cursorG, "input_merger_class_name");
            int iJ13 = f.J(cursorG, "input");
            int iJ14 = f.J(cursorG, "output");
            kVar = kVarC;
            try {
                int iJ15 = f.J(cursorG, "initial_delay");
                int iJ16 = f.J(cursorG, "interval_duration");
                int iJ17 = f.J(cursorG, "flex_duration");
                int iJ18 = f.J(cursorG, "run_attempt_count");
                int iJ19 = f.J(cursorG, "backoff_policy");
                int iJ20 = f.J(cursorG, "backoff_delay_duration");
                int iJ21 = f.J(cursorG, "period_start_time");
                int iJ22 = f.J(cursorG, "minimum_retention_duration");
                int iJ23 = f.J(cursorG, "schedule_requested_at");
                int iJ24 = f.J(cursorG, "run_in_foreground");
                int iJ25 = f.J(cursorG, "out_of_quota_policy");
                int i7 = iJ14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iJ9);
                    int i8 = iJ9;
                    String string2 = cursorG.getString(iJ11);
                    int i9 = iJ11;
                    c cVar = new c();
                    int i10 = iJ;
                    cVar.f12349a = p097n3.a.A(cursorG.getInt(iJ));
                    cVar.f12350b = cursorG.getInt(iJ2) != 0;
                    cVar.f12351c = cursorG.getInt(iJ3) != 0;
                    cVar.f12352d = cursorG.getInt(iJ4) != 0;
                    cVar.f12353e = cursorG.getInt(iJ5) != 0;
                    int i11 = iJ2;
                    int i12 = iJ3;
                    cVar.f12354f = cursorG.getLong(iJ6);
                    cVar.f12355g = cursorG.getLong(iJ7);
                    cVar.f12356h = p097n3.a.e(cursorG.getBlob(iJ8));
                    i iVar = new i(string, string2);
                    iVar.f15223b = p097n3.a.C(cursorG.getInt(iJ10));
                    iVar.f15225d = cursorG.getString(iJ12);
                    iVar.f15226e = g.a(cursorG.getBlob(iJ13));
                    int i13 = i7;
                    iVar.f15227f = g.a(cursorG.getBlob(i13));
                    int i14 = iJ13;
                    int i15 = iJ15;
                    iVar.f15228g = cursorG.getLong(i15);
                    int i16 = iJ4;
                    int i17 = iJ16;
                    iVar.f15229h = cursorG.getLong(i17);
                    int i18 = iJ17;
                    iVar.f15230i = cursorG.getLong(i18);
                    int i19 = iJ18;
                    iVar.f15231k = cursorG.getInt(i19);
                    int i20 = iJ19;
                    iVar.f15232l = p097n3.a.z(cursorG.getInt(i20));
                    int i21 = iJ20;
                    iVar.f15233m = cursorG.getLong(i21);
                    int i22 = iJ21;
                    iVar.f15234n = cursorG.getLong(i22);
                    int i23 = iJ22;
                    iVar.f15235o = cursorG.getLong(i23);
                    int i24 = iJ23;
                    iVar.f15236p = cursorG.getLong(i24);
                    int i25 = iJ24;
                    iVar.f15237q = cursorG.getInt(i25) != 0;
                    int i26 = iJ25;
                    iVar.f15238r = p097n3.a.B(cursorG.getInt(i26));
                    iVar.j = cVar;
                    arrayList.add(iVar);
                    i7 = i13;
                    iJ2 = i11;
                    iJ15 = i15;
                    iJ16 = i17;
                    iJ20 = i21;
                    iJ21 = i22;
                    iJ24 = i25;
                    iJ11 = i9;
                    iJ = i10;
                    iJ25 = i26;
                    iJ23 = i24;
                    iJ13 = i14;
                    iJ9 = i8;
                    iJ3 = i12;
                    iJ22 = i23;
                    iJ4 = i16;
                    iJ17 = i18;
                    iJ18 = i19;
                    iJ19 = i20;
                }
                cursorG.close();
                kVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                kVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = kVarC;
        }
    }

    public ArrayList e(int i7) throws Throwable {
        k kVar;
        k kVarC = k.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        kVarC.d(1, i7);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(kVarC);
        try {
            int iJ = f.J(cursorG, "required_network_type");
            int iJ2 = f.J(cursorG, "requires_charging");
            int iJ3 = f.J(cursorG, "requires_device_idle");
            int iJ4 = f.J(cursorG, "requires_battery_not_low");
            int iJ5 = f.J(cursorG, "requires_storage_not_low");
            int iJ6 = f.J(cursorG, "trigger_content_update_delay");
            int iJ7 = f.J(cursorG, "trigger_max_content_delay");
            int iJ8 = f.J(cursorG, "content_uri_triggers");
            int iJ9 = f.J(cursorG, "id");
            int iJ10 = f.J(cursorG, SentryThread.JsonKeys.STATE);
            int iJ11 = f.J(cursorG, "worker_class_name");
            int iJ12 = f.J(cursorG, "input_merger_class_name");
            int iJ13 = f.J(cursorG, "input");
            int iJ14 = f.J(cursorG, "output");
            kVar = kVarC;
            try {
                int iJ15 = f.J(cursorG, "initial_delay");
                int iJ16 = f.J(cursorG, "interval_duration");
                int iJ17 = f.J(cursorG, "flex_duration");
                int iJ18 = f.J(cursorG, "run_attempt_count");
                int iJ19 = f.J(cursorG, "backoff_policy");
                int iJ20 = f.J(cursorG, "backoff_delay_duration");
                int iJ21 = f.J(cursorG, "period_start_time");
                int iJ22 = f.J(cursorG, "minimum_retention_duration");
                int iJ23 = f.J(cursorG, "schedule_requested_at");
                int iJ24 = f.J(cursorG, "run_in_foreground");
                int iJ25 = f.J(cursorG, "out_of_quota_policy");
                int i8 = iJ14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iJ9);
                    int i9 = iJ9;
                    String string2 = cursorG.getString(iJ11);
                    int i10 = iJ11;
                    c cVar = new c();
                    int i11 = iJ;
                    cVar.f12349a = p097n3.a.A(cursorG.getInt(iJ));
                    cVar.f12350b = cursorG.getInt(iJ2) != 0;
                    cVar.f12351c = cursorG.getInt(iJ3) != 0;
                    cVar.f12352d = cursorG.getInt(iJ4) != 0;
                    cVar.f12353e = cursorG.getInt(iJ5) != 0;
                    int i12 = iJ2;
                    int i13 = iJ3;
                    cVar.f12354f = cursorG.getLong(iJ6);
                    cVar.f12355g = cursorG.getLong(iJ7);
                    cVar.f12356h = p097n3.a.e(cursorG.getBlob(iJ8));
                    i iVar = new i(string, string2);
                    iVar.f15223b = p097n3.a.C(cursorG.getInt(iJ10));
                    iVar.f15225d = cursorG.getString(iJ12);
                    iVar.f15226e = g.a(cursorG.getBlob(iJ13));
                    int i14 = i8;
                    iVar.f15227f = g.a(cursorG.getBlob(i14));
                    int i15 = iJ15;
                    int i16 = iJ13;
                    iVar.f15228g = cursorG.getLong(i15);
                    int i17 = iJ4;
                    int i18 = iJ16;
                    iVar.f15229h = cursorG.getLong(i18);
                    int i19 = iJ17;
                    iVar.f15230i = cursorG.getLong(i19);
                    int i20 = iJ18;
                    iVar.f15231k = cursorG.getInt(i20);
                    int i21 = iJ19;
                    iVar.f15232l = p097n3.a.z(cursorG.getInt(i21));
                    int i22 = iJ20;
                    iVar.f15233m = cursorG.getLong(i22);
                    int i23 = iJ21;
                    iVar.f15234n = cursorG.getLong(i23);
                    int i24 = iJ22;
                    iVar.f15235o = cursorG.getLong(i24);
                    int i25 = iJ23;
                    iVar.f15236p = cursorG.getLong(i25);
                    int i26 = iJ24;
                    iVar.f15237q = cursorG.getInt(i26) != 0;
                    int i27 = iJ25;
                    iVar.f15238r = p097n3.a.B(cursorG.getInt(i27));
                    iVar.j = cVar;
                    arrayList.add(iVar);
                    i8 = i14;
                    iJ2 = i12;
                    iJ24 = i26;
                    iJ9 = i9;
                    iJ11 = i10;
                    iJ = i11;
                    iJ25 = i27;
                    iJ13 = i16;
                    iJ15 = i15;
                    iJ16 = i18;
                    iJ20 = i22;
                    iJ21 = i23;
                    iJ23 = i25;
                    iJ3 = i13;
                    iJ22 = i24;
                    iJ4 = i17;
                    iJ17 = i19;
                    iJ18 = i20;
                    iJ19 = i21;
                }
                cursorG.close();
                kVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                kVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = kVarC;
        }
    }

    public ArrayList f() throws Throwable {
        k kVar;
        k kVarC = k.c(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(kVarC);
        try {
            int iJ = f.J(cursorG, "required_network_type");
            int iJ2 = f.J(cursorG, "requires_charging");
            int iJ3 = f.J(cursorG, "requires_device_idle");
            int iJ4 = f.J(cursorG, "requires_battery_not_low");
            int iJ5 = f.J(cursorG, "requires_storage_not_low");
            int iJ6 = f.J(cursorG, "trigger_content_update_delay");
            int iJ7 = f.J(cursorG, "trigger_max_content_delay");
            int iJ8 = f.J(cursorG, "content_uri_triggers");
            int iJ9 = f.J(cursorG, "id");
            int iJ10 = f.J(cursorG, SentryThread.JsonKeys.STATE);
            int iJ11 = f.J(cursorG, "worker_class_name");
            int iJ12 = f.J(cursorG, "input_merger_class_name");
            int iJ13 = f.J(cursorG, "input");
            int iJ14 = f.J(cursorG, "output");
            kVar = kVarC;
            try {
                int iJ15 = f.J(cursorG, "initial_delay");
                int iJ16 = f.J(cursorG, "interval_duration");
                int iJ17 = f.J(cursorG, "flex_duration");
                int iJ18 = f.J(cursorG, "run_attempt_count");
                int iJ19 = f.J(cursorG, "backoff_policy");
                int iJ20 = f.J(cursorG, "backoff_delay_duration");
                int iJ21 = f.J(cursorG, "period_start_time");
                int iJ22 = f.J(cursorG, "minimum_retention_duration");
                int iJ23 = f.J(cursorG, "schedule_requested_at");
                int iJ24 = f.J(cursorG, "run_in_foreground");
                int iJ25 = f.J(cursorG, "out_of_quota_policy");
                int i7 = iJ14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iJ9);
                    int i8 = iJ9;
                    String string2 = cursorG.getString(iJ11);
                    int i9 = iJ11;
                    c cVar = new c();
                    int i10 = iJ;
                    cVar.f12349a = p097n3.a.A(cursorG.getInt(iJ));
                    cVar.f12350b = cursorG.getInt(iJ2) != 0;
                    cVar.f12351c = cursorG.getInt(iJ3) != 0;
                    cVar.f12352d = cursorG.getInt(iJ4) != 0;
                    cVar.f12353e = cursorG.getInt(iJ5) != 0;
                    int i11 = iJ2;
                    int i12 = iJ3;
                    cVar.f12354f = cursorG.getLong(iJ6);
                    cVar.f12355g = cursorG.getLong(iJ7);
                    cVar.f12356h = p097n3.a.e(cursorG.getBlob(iJ8));
                    i iVar = new i(string, string2);
                    iVar.f15223b = p097n3.a.C(cursorG.getInt(iJ10));
                    iVar.f15225d = cursorG.getString(iJ12);
                    iVar.f15226e = g.a(cursorG.getBlob(iJ13));
                    int i13 = i7;
                    iVar.f15227f = g.a(cursorG.getBlob(i13));
                    int i14 = iJ13;
                    int i15 = iJ15;
                    iVar.f15228g = cursorG.getLong(i15);
                    int i16 = iJ4;
                    int i17 = iJ16;
                    iVar.f15229h = cursorG.getLong(i17);
                    int i18 = iJ17;
                    iVar.f15230i = cursorG.getLong(i18);
                    int i19 = iJ18;
                    iVar.f15231k = cursorG.getInt(i19);
                    int i20 = iJ19;
                    iVar.f15232l = p097n3.a.z(cursorG.getInt(i20));
                    int i21 = iJ20;
                    iVar.f15233m = cursorG.getLong(i21);
                    int i22 = iJ21;
                    iVar.f15234n = cursorG.getLong(i22);
                    int i23 = iJ22;
                    iVar.f15235o = cursorG.getLong(i23);
                    int i24 = iJ23;
                    iVar.f15236p = cursorG.getLong(i24);
                    int i25 = iJ24;
                    iVar.f15237q = cursorG.getInt(i25) != 0;
                    int i26 = iJ25;
                    iVar.f15238r = p097n3.a.B(cursorG.getInt(i26));
                    iVar.j = cVar;
                    arrayList.add(iVar);
                    i7 = i13;
                    iJ2 = i11;
                    iJ15 = i15;
                    iJ16 = i17;
                    iJ20 = i21;
                    iJ21 = i22;
                    iJ24 = i25;
                    iJ11 = i9;
                    iJ = i10;
                    iJ25 = i26;
                    iJ23 = i24;
                    iJ13 = i14;
                    iJ9 = i8;
                    iJ3 = i12;
                    iJ22 = i23;
                    iJ4 = i16;
                    iJ17 = i18;
                    iJ18 = i19;
                    iJ19 = i20;
                }
                cursorG.close();
                kVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                kVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = kVarC;
        }
    }

    public ArrayList g() {
        k kVar;
        k kVarC = k.c(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(kVarC);
        try {
            int iJ = f.J(cursorG, "required_network_type");
            int iJ2 = f.J(cursorG, "requires_charging");
            int iJ3 = f.J(cursorG, "requires_device_idle");
            int iJ4 = f.J(cursorG, "requires_battery_not_low");
            int iJ5 = f.J(cursorG, "requires_storage_not_low");
            int iJ6 = f.J(cursorG, "trigger_content_update_delay");
            int iJ7 = f.J(cursorG, "trigger_max_content_delay");
            int iJ8 = f.J(cursorG, "content_uri_triggers");
            int iJ9 = f.J(cursorG, "id");
            int iJ10 = f.J(cursorG, SentryThread.JsonKeys.STATE);
            int iJ11 = f.J(cursorG, "worker_class_name");
            int iJ12 = f.J(cursorG, "input_merger_class_name");
            int iJ13 = f.J(cursorG, "input");
            int iJ14 = f.J(cursorG, "output");
            kVar = kVarC;
            try {
                int iJ15 = f.J(cursorG, "initial_delay");
                int iJ16 = f.J(cursorG, "interval_duration");
                int iJ17 = f.J(cursorG, "flex_duration");
                int iJ18 = f.J(cursorG, "run_attempt_count");
                int iJ19 = f.J(cursorG, "backoff_policy");
                int iJ20 = f.J(cursorG, "backoff_delay_duration");
                int iJ21 = f.J(cursorG, "period_start_time");
                int iJ22 = f.J(cursorG, "minimum_retention_duration");
                int iJ23 = f.J(cursorG, "schedule_requested_at");
                int iJ24 = f.J(cursorG, "run_in_foreground");
                int iJ25 = f.J(cursorG, "out_of_quota_policy");
                int i7 = iJ14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iJ9);
                    int i8 = iJ9;
                    String string2 = cursorG.getString(iJ11);
                    int i9 = iJ11;
                    c cVar = new c();
                    int i10 = iJ;
                    cVar.f12349a = p097n3.a.A(cursorG.getInt(iJ));
                    cVar.f12350b = cursorG.getInt(iJ2) != 0;
                    cVar.f12351c = cursorG.getInt(iJ3) != 0;
                    cVar.f12352d = cursorG.getInt(iJ4) != 0;
                    cVar.f12353e = cursorG.getInt(iJ5) != 0;
                    int i11 = iJ2;
                    int i12 = iJ3;
                    cVar.f12354f = cursorG.getLong(iJ6);
                    cVar.f12355g = cursorG.getLong(iJ7);
                    cVar.f12356h = p097n3.a.e(cursorG.getBlob(iJ8));
                    i iVar = new i(string, string2);
                    iVar.f15223b = p097n3.a.C(cursorG.getInt(iJ10));
                    iVar.f15225d = cursorG.getString(iJ12);
                    iVar.f15226e = g.a(cursorG.getBlob(iJ13));
                    int i13 = i7;
                    iVar.f15227f = g.a(cursorG.getBlob(i13));
                    int i14 = iJ13;
                    int i15 = iJ15;
                    iVar.f15228g = cursorG.getLong(i15);
                    int i16 = iJ4;
                    int i17 = iJ16;
                    iVar.f15229h = cursorG.getLong(i17);
                    int i18 = iJ17;
                    iVar.f15230i = cursorG.getLong(i18);
                    int i19 = iJ18;
                    iVar.f15231k = cursorG.getInt(i19);
                    int i20 = iJ19;
                    iVar.f15232l = p097n3.a.z(cursorG.getInt(i20));
                    int i21 = iJ20;
                    iVar.f15233m = cursorG.getLong(i21);
                    int i22 = iJ21;
                    iVar.f15234n = cursorG.getLong(i22);
                    int i23 = iJ22;
                    iVar.f15235o = cursorG.getLong(i23);
                    int i24 = iJ23;
                    iVar.f15236p = cursorG.getLong(i24);
                    int i25 = iJ24;
                    iVar.f15237q = cursorG.getInt(i25) != 0;
                    int i26 = iJ25;
                    iVar.f15238r = p097n3.a.B(cursorG.getInt(i26));
                    iVar.j = cVar;
                    arrayList.add(iVar);
                    i7 = i13;
                    iJ2 = i11;
                    iJ15 = i15;
                    iJ16 = i17;
                    iJ20 = i21;
                    iJ21 = i22;
                    iJ24 = i25;
                    iJ11 = i9;
                    iJ = i10;
                    iJ25 = i26;
                    iJ23 = i24;
                    iJ13 = i14;
                    iJ9 = i8;
                    iJ3 = i12;
                    iJ22 = i23;
                    iJ4 = i16;
                    iJ17 = i18;
                    iJ18 = i19;
                    iJ19 = i20;
                }
                cursorG.close();
                kVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                kVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = kVarC;
        }
    }

    public int h(String str) {
        k kVarC = k.c(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            kVarC.e(1);
        } else {
            kVarC.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(kVarC);
        try {
            return cursorG.moveToFirst() ? p097n3.a.C(cursorG.getInt(0)) : 0;
        } finally {
            cursorG.close();
            kVarC.g();
        }
    }

    public ArrayList i() {
        k kVarC = k.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        kVarC.e(1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(kVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            kVarC.g();
            return arrayList;
        } catch (Throwable th) {
            cursorG.close();
            kVarC.g();
            throw th;
        }
    }

    public ArrayList j() {
        k kVarC = k.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        kVarC.f(1, "offline_ping_sender_work");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(kVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            kVarC.g();
            return arrayList;
        } catch (Throwable th) {
            cursorG.close();
            kVarC.g();
            throw th;
        }
    }

    public boolean k() {
        return !((Boolean) this.f10441i).booleanValue() && ((Map) this.f10437e).containsKey("encryptedSharedPreferences") && ((Map) this.f10437e).get("encryptedSharedPreferences").equals("true");
    }

    public i l(String str) {
        k kVar;
        i iVar;
        k kVarC = k.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            kVarC.e(1);
        } else {
            kVarC.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(kVarC);
        try {
            int iJ = f.J(cursorG, "required_network_type");
            int iJ2 = f.J(cursorG, "requires_charging");
            int iJ3 = f.J(cursorG, "requires_device_idle");
            int iJ4 = f.J(cursorG, "requires_battery_not_low");
            int iJ5 = f.J(cursorG, "requires_storage_not_low");
            int iJ6 = f.J(cursorG, "trigger_content_update_delay");
            int iJ7 = f.J(cursorG, "trigger_max_content_delay");
            int iJ8 = f.J(cursorG, "content_uri_triggers");
            int iJ9 = f.J(cursorG, "id");
            int iJ10 = f.J(cursorG, SentryThread.JsonKeys.STATE);
            int iJ11 = f.J(cursorG, "worker_class_name");
            int iJ12 = f.J(cursorG, "input_merger_class_name");
            int iJ13 = f.J(cursorG, "input");
            int iJ14 = f.J(cursorG, "output");
            kVar = kVarC;
            try {
                int iJ15 = f.J(cursorG, "initial_delay");
                int iJ16 = f.J(cursorG, "interval_duration");
                int iJ17 = f.J(cursorG, "flex_duration");
                int iJ18 = f.J(cursorG, "run_attempt_count");
                int iJ19 = f.J(cursorG, "backoff_policy");
                int iJ20 = f.J(cursorG, "backoff_delay_duration");
                int iJ21 = f.J(cursorG, "period_start_time");
                int iJ22 = f.J(cursorG, "minimum_retention_duration");
                int iJ23 = f.J(cursorG, "schedule_requested_at");
                int iJ24 = f.J(cursorG, "run_in_foreground");
                int iJ25 = f.J(cursorG, "out_of_quota_policy");
                if (cursorG.moveToFirst()) {
                    String string = cursorG.getString(iJ9);
                    String string2 = cursorG.getString(iJ11);
                    c cVar = new c();
                    cVar.f12349a = p097n3.a.A(cursorG.getInt(iJ));
                    cVar.f12350b = cursorG.getInt(iJ2) != 0;
                    cVar.f12351c = cursorG.getInt(iJ3) != 0;
                    cVar.f12352d = cursorG.getInt(iJ4) != 0;
                    cVar.f12353e = cursorG.getInt(iJ5) != 0;
                    cVar.f12354f = cursorG.getLong(iJ6);
                    cVar.f12355g = cursorG.getLong(iJ7);
                    cVar.f12356h = p097n3.a.e(cursorG.getBlob(iJ8));
                    iVar = new i(string, string2);
                    iVar.f15223b = p097n3.a.C(cursorG.getInt(iJ10));
                    iVar.f15225d = cursorG.getString(iJ12);
                    iVar.f15226e = g.a(cursorG.getBlob(iJ13));
                    iVar.f15227f = g.a(cursorG.getBlob(iJ14));
                    iVar.f15228g = cursorG.getLong(iJ15);
                    iVar.f15229h = cursorG.getLong(iJ16);
                    iVar.f15230i = cursorG.getLong(iJ17);
                    iVar.f15231k = cursorG.getInt(iJ18);
                    iVar.f15232l = p097n3.a.z(cursorG.getInt(iJ19));
                    iVar.f15233m = cursorG.getLong(iJ20);
                    iVar.f15234n = cursorG.getLong(iJ21);
                    iVar.f15235o = cursorG.getLong(iJ22);
                    iVar.f15236p = cursorG.getLong(iJ23);
                    iVar.f15237q = cursorG.getInt(iJ24) != 0;
                    iVar.f15238r = p097n3.a.B(cursorG.getInt(iJ25));
                    iVar.j = cVar;
                } else {
                    iVar = null;
                }
                cursorG.close();
                kVar.g();
                return iVar;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                kVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = kVarC;
        }
    }

    public void m(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        e eVar = (e) this.f10438f;
        K0.f fVarA = eVar.a();
        if (str == null) {
            fVarA.d(1);
        } else {
            fVarA.e(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.f3881d.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void n(SharedPreferences sharedPreferences) {
        this.f10440h = new F0(sharedPreferences, (Map) this.f10437e);
        boolean zK = k();
        Context context = (Context) this.f10434b;
        if (zK) {
            F0 f7 = (F0) this.f10440h;
            this.f10439g = ((p027d5.c) f7.f17380c).f12414a.j(context, ((p027d5.a) f7.f17379b).f12410a.k(context));
            return;
        }
        F0 f8 = (F0) this.f10440h;
        p027d5.a aVar = (p027d5.a) f8.f17379b;
        p027d5.c cVar = (p027d5.c) f8.f17380c;
        p027d5.a aVar2 = (p027d5.a) f8.f17381d;
        p027d5.c cVar2 = (p027d5.c) f8.f17382e;
        if (aVar == aVar2 && cVar == cVar2) {
            this.f10439g = cVar2.f12414a.j(context, aVar2.f12410a.k(context));
            return;
        }
        try {
            this.f10439g = cVar.f12414a.j(context, aVar.f12410a.k(context));
            HashMap map = new HashMap();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains((String) this.f10435c)) {
                    map.put(key, b((String) value));
                }
            }
            this.f10439g = cVar2.f12414a.j(context, aVar2.f12410a.k(context));
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            for (Map.Entry entry2 : map.entrySet()) {
                editorEdit.putString((String) entry2.getKey(), Base64.encodeToString(((C1017n0) this.f10439g).j(((String) entry2.getValue()).getBytes((Charset) this.f10433a)), 0));
            }
            editorEdit.putString("FlutterSecureSAlgorithmKey", aVar2.name());
            editorEdit.putString("FlutterSecureSAlgorithmStorage", cVar2.name());
            editorEdit.apply();
        } catch (Exception e7) {
            Log.e("SecureStorageAndroid", "re-encryption failed", e7);
            this.f10439g = cVar.f12414a.j(context, ((p027d5.a) f8.f17379b).f12410a.k(context));
        }
    }

    public H0.b o(Context context) {
        C1050x1 c1050x1C;
        C1050x1 c1050x1C2;
        context.getApplicationContext();
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings("NoPadding").setBlockModes("GCM").setKeySize(256).build();
        if (!"_androidx_security_master_key_".equals(H0.c.a(keyGenParameterSpecBuild))) {
            throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (_androidx_security_master_key_ vs " + H0.c.a(keyGenParameterSpecBuild));
        }
        if (keyGenParameterSpecBuild == null) {
            throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
        }
        Object obj = d.f3196a;
        if (keyGenParameterSpecBuild.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpecBuild.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpecBuild.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpecBuild.getBlockModes()));
        }
        if (keyGenParameterSpecBuild.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpecBuild.getPurposes());
        }
        if (!Arrays.equals(keyGenParameterSpecBuild.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpecBuild.getEncryptionPaddings()));
        }
        if (keyGenParameterSpecBuild.isUserAuthenticationRequired() && keyGenParameterSpecBuild.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
        synchronized (d.f3196a) {
            String keystoreAlias = keyGenParameterSpecBuild.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpecBuild);
                    keyGenerator.generateKey();
                } catch (ProviderException e7) {
                    throw new GeneralSecurityException(e7.getMessage(), e7);
                }
            }
        }
        String keystoreAlias2 = keyGenParameterSpecBuild.getKeystoreAlias();
        String str = (String) this.f10436d;
        int i7 = O3.a.f4998a;
        n.h(O3.c.f5003b);
        if (!N3.a.f4779b.get()) {
            n.f(new h(F.class, new K3.f[]{new K3.f(J3.c.class, 9)}, 8), true);
        }
        K3.a.a();
        Context applicationContext = context.getApplicationContext();
        n1 n1Var = new n1();
        n1Var.f8716f = J3.b.a("AES256_SIV");
        if (applicationContext == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        n1Var.f8711a = applicationContext;
        n1Var.f8712b = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        n1Var.f8713c = str;
        String strI = L.i("android-keystore://", keystoreAlias2);
        if (!strI.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        n1Var.f8714d = strI;
        P3.a aVarA = n1Var.a();
        synchronized (aVarA) {
            c1050x1C = aVarA.f5585a.c();
        }
        n1 n1Var2 = new n1();
        n1Var2.f8716f = J3.b.a("AES256_GCM");
        n1Var2.f8711a = applicationContext;
        n1Var2.f8712b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        n1Var2.f8713c = str;
        String strI2 = L.i("android-keystore://", keystoreAlias2);
        if (!strI2.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        n1Var2.f8714d = strI2;
        P3.a aVarA2 = n1Var2.a();
        synchronized (aVarA2) {
            c1050x1C2 = aVarA2.f5585a.c();
        }
        return new H0.b(str, applicationContext.getSharedPreferences(str, 0), (J3.a) c1050x1C2.N(J3.a.class), (J3.c) c1050x1C.N(J3.c.class));
    }

    public void p(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        e eVar = (e) this.f10440h;
        K0.f fVarA = eVar.a();
        fVarA.c(1, j);
        if (str == null) {
            fVarA.d(2);
        } else {
            fVarA.e(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.f3881d.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public HashMap q() {
        c();
        Map<String, ?> all = ((SharedPreferences) this.f10438f).getAll();
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getKey().contains((String) this.f10435c)) {
                String strReplaceFirst = entry.getKey().replaceFirst(((String) this.f10435c) + '_', "");
                if (k()) {
                    map.put(strReplaceFirst, (String) entry.getValue());
                } else {
                    map.put(strReplaceFirst, b((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    public void r(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        e eVar = (e) this.f10439g;
        K0.f fVarA = eVar.a();
        if (str == null) {
            fVarA.d(1);
        } else {
            fVarA.e(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.f3881d.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void s(String str, g gVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        e eVar = (e) this.f10436d;
        K0.f fVarA = eVar.a();
        byte[] bArrC = g.c(gVar);
        if (bArrC == null) {
            fVarA.d(1);
        } else {
            fVarA.b(1, bArrC);
        }
        if (str == null) {
            fVarA.d(2);
        } else {
            fVarA.e(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.k();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void t(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        e eVar = (e) this.f10437e;
        K0.f fVarA = eVar.a();
        fVarA.c(1, j);
        if (str == null) {
            fVarA.d(2);
        } else {
            fVarA.e(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.k();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void u(int i7, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            sb.append("?");
            if (i8 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String string = sb.toString();
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        SQLiteStatement sQLiteStatementCompileStatement = ((SQLiteDatabase) workDatabase_Impl.f1655c.l().f3868b).compileStatement(string);
        sQLiteStatementCompileStatement.bindLong(1, p097n3.a.U(i7));
        int i9 = 2;
        for (String str : strArr) {
            if (str == null) {
                sQLiteStatementCompileStatement.bindNull(i9);
            } else {
                sQLiteStatementCompileStatement.bindString(i9, str);
            }
            i9++;
        }
        workDatabase_Impl.c();
        try {
            sQLiteStatementCompileStatement.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public void v(String str, String str2) {
        c();
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f10438f).edit();
        if (k()) {
            editorEdit.putString(str, str2);
        } else {
            editorEdit.putString(str, Base64.encodeToString(((C1017n0) this.f10439g).j(str2.getBytes((Charset) this.f10433a)), 0));
        }
        editorEdit.apply();
    }
}
