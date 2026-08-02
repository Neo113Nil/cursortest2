package c5;

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
import d1.C0950c;
import d1.C0954g;
import d5.EnumC0966a;
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
import m1.C1427b;
import m1.C1430e;
import m1.i;
import n3.AbstractC1464a;
import p3.f;
import w1.C1726n0;
import w1.C1759x1;
import w1.F0;
import w1.L;

/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0820a {

    /* renamed from: a, reason: collision with root package name */
    public Object f10433a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10434b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10435c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10436d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10437e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10438f;

    /* renamed from: g, reason: collision with root package name */
    public Object f10439g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10440h;

    /* renamed from: i, reason: collision with root package name */
    public Object f10441i;

    public C0820a(WorkDatabase_Impl workDatabase_Impl) {
        this.f10433a = workDatabase_Impl;
        this.f10434b = new C1427b(workDatabase_Impl, 5);
        this.f10435c = new C1430e(workDatabase_Impl, 3);
        this.f10436d = new C1430e(workDatabase_Impl, 4);
        this.f10437e = new C1430e(workDatabase_Impl, 5);
        this.f10438f = new C1430e(workDatabase_Impl, 6);
        this.f10439g = new C1430e(workDatabase_Impl, 7);
        this.f10440h = new C1430e(workDatabase_Impl, 8);
        this.f10441i = new C1430e(workDatabase_Impl, 9);
        new AtomicBoolean(false);
    }

    public void a(SharedPreferences sharedPreferences, H0.b bVar) {
        try {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains((String) this.f10435c)) {
                    String b7 = b((String) value);
                    H0.a aVar = (H0.a) bVar.edit();
                    aVar.putString(key, b7);
                    aVar.apply();
                    sharedPreferences.edit().remove(key).apply();
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            ((F0) this.f10440h).getClass();
            edit.remove("FlutterSecureSAlgorithmKey");
            edit.remove("FlutterSecureSAlgorithmStorage");
            edit.apply();
        } catch (Exception e7) {
            Log.e("SecureStorageAndroid", "Data migration failed", e7);
        }
    }

    public String b(String str) {
        if (str == null) {
            return null;
        }
        byte[] decode = Base64.decode(str, 0);
        C1726n0 c1726n0 = (C1726n0) this.f10439g;
        int x4 = c1726n0.x();
        byte[] bArr = new byte[x4];
        System.arraycopy(decode, 0, bArr, 0, x4);
        AlgorithmParameterSpec z4 = c1726n0.z(bArr);
        int length = decode.length - c1726n0.x();
        byte[] bArr2 = new byte[length];
        System.arraycopy(decode, x4, bArr2, 0, length);
        Key key = (Key) c1726n0.f17807d;
        Cipher cipher = (Cipher) c1726n0.f17805b;
        cipher.init(2, key, z4);
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
        if (((C1726n0) this.f10439g) == null) {
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
            H0.b o7 = o(context);
            this.f10438f = o7;
            a(sharedPreferences, o7);
        } catch (Exception e8) {
            Log.e("SecureStorageAndroid", "EncryptedSharedPreferences initialization failed", e8);
            this.f10438f = sharedPreferences;
            this.f10441i = Boolean.TRUE;
        }
    }

    public ArrayList d() {
        k kVar;
        int J5;
        int J6;
        int J7;
        int J8;
        int J9;
        int J10;
        int J11;
        int J12;
        int J13;
        int J14;
        int J15;
        int J16;
        int J17;
        int J18;
        k c3 = k.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        c3.d(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor g3 = workDatabase_Impl.g(c3);
        try {
            J5 = f.J(g3, "required_network_type");
            J6 = f.J(g3, "requires_charging");
            J7 = f.J(g3, "requires_device_idle");
            J8 = f.J(g3, "requires_battery_not_low");
            J9 = f.J(g3, "requires_storage_not_low");
            J10 = f.J(g3, "trigger_content_update_delay");
            J11 = f.J(g3, "trigger_max_content_delay");
            J12 = f.J(g3, "content_uri_triggers");
            J13 = f.J(g3, "id");
            J14 = f.J(g3, SentryThread.JsonKeys.STATE);
            J15 = f.J(g3, "worker_class_name");
            J16 = f.J(g3, "input_merger_class_name");
            J17 = f.J(g3, "input");
            J18 = f.J(g3, "output");
            kVar = c3;
        } catch (Throwable th) {
            th = th;
            kVar = c3;
        }
        try {
            int J19 = f.J(g3, "initial_delay");
            int J20 = f.J(g3, "interval_duration");
            int J21 = f.J(g3, "flex_duration");
            int J22 = f.J(g3, "run_attempt_count");
            int J23 = f.J(g3, "backoff_policy");
            int J24 = f.J(g3, "backoff_delay_duration");
            int J25 = f.J(g3, "period_start_time");
            int J26 = f.J(g3, "minimum_retention_duration");
            int J27 = f.J(g3, "schedule_requested_at");
            int J28 = f.J(g3, "run_in_foreground");
            int J29 = f.J(g3, "out_of_quota_policy");
            int i7 = J18;
            ArrayList arrayList = new ArrayList(g3.getCount());
            while (g3.moveToNext()) {
                String string = g3.getString(J13);
                int i8 = J13;
                String string2 = g3.getString(J15);
                int i9 = J15;
                C0950c c0950c = new C0950c();
                int i10 = J5;
                c0950c.f12343a = AbstractC1464a.A(g3.getInt(J5));
                c0950c.f12344b = g3.getInt(J6) != 0;
                c0950c.f12345c = g3.getInt(J7) != 0;
                c0950c.f12346d = g3.getInt(J8) != 0;
                c0950c.f12347e = g3.getInt(J9) != 0;
                int i11 = J6;
                int i12 = J7;
                c0950c.f12348f = g3.getLong(J10);
                c0950c.f12349g = g3.getLong(J11);
                c0950c.f12350h = AbstractC1464a.e(g3.getBlob(J12));
                i iVar = new i(string, string2);
                iVar.f15217b = AbstractC1464a.C(g3.getInt(J14));
                iVar.f15219d = g3.getString(J16);
                iVar.f15220e = C0954g.a(g3.getBlob(J17));
                int i13 = i7;
                iVar.f15221f = C0954g.a(g3.getBlob(i13));
                int i14 = J17;
                int i15 = J19;
                iVar.f15222g = g3.getLong(i15);
                int i16 = J8;
                int i17 = J20;
                iVar.f15223h = g3.getLong(i17);
                int i18 = J21;
                iVar.f15224i = g3.getLong(i18);
                int i19 = J22;
                iVar.f15225k = g3.getInt(i19);
                int i20 = J23;
                iVar.f15226l = AbstractC1464a.z(g3.getInt(i20));
                int i21 = J24;
                iVar.f15227m = g3.getLong(i21);
                int i22 = J25;
                iVar.f15228n = g3.getLong(i22);
                int i23 = J26;
                iVar.f15229o = g3.getLong(i23);
                int i24 = J27;
                iVar.f15230p = g3.getLong(i24);
                int i25 = J28;
                iVar.f15231q = g3.getInt(i25) != 0;
                int i26 = J29;
                iVar.f15232r = AbstractC1464a.B(g3.getInt(i26));
                iVar.j = c0950c;
                arrayList.add(iVar);
                i7 = i13;
                J6 = i11;
                J19 = i15;
                J20 = i17;
                J24 = i21;
                J25 = i22;
                J28 = i25;
                J15 = i9;
                J5 = i10;
                J29 = i26;
                J27 = i24;
                J17 = i14;
                J13 = i8;
                J7 = i12;
                J26 = i23;
                J8 = i16;
                J21 = i18;
                J22 = i19;
                J23 = i20;
            }
            g3.close();
            kVar.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g3.close();
            kVar.g();
            throw th;
        }
    }

    public ArrayList e(int i7) {
        k kVar;
        int J5;
        int J6;
        int J7;
        int J8;
        int J9;
        int J10;
        int J11;
        int J12;
        int J13;
        int J14;
        int J15;
        int J16;
        int J17;
        int J18;
        k c3 = k.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        c3.d(1, i7);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor g3 = workDatabase_Impl.g(c3);
        try {
            J5 = f.J(g3, "required_network_type");
            J6 = f.J(g3, "requires_charging");
            J7 = f.J(g3, "requires_device_idle");
            J8 = f.J(g3, "requires_battery_not_low");
            J9 = f.J(g3, "requires_storage_not_low");
            J10 = f.J(g3, "trigger_content_update_delay");
            J11 = f.J(g3, "trigger_max_content_delay");
            J12 = f.J(g3, "content_uri_triggers");
            J13 = f.J(g3, "id");
            J14 = f.J(g3, SentryThread.JsonKeys.STATE);
            J15 = f.J(g3, "worker_class_name");
            J16 = f.J(g3, "input_merger_class_name");
            J17 = f.J(g3, "input");
            J18 = f.J(g3, "output");
            kVar = c3;
        } catch (Throwable th) {
            th = th;
            kVar = c3;
        }
        try {
            int J19 = f.J(g3, "initial_delay");
            int J20 = f.J(g3, "interval_duration");
            int J21 = f.J(g3, "flex_duration");
            int J22 = f.J(g3, "run_attempt_count");
            int J23 = f.J(g3, "backoff_policy");
            int J24 = f.J(g3, "backoff_delay_duration");
            int J25 = f.J(g3, "period_start_time");
            int J26 = f.J(g3, "minimum_retention_duration");
            int J27 = f.J(g3, "schedule_requested_at");
            int J28 = f.J(g3, "run_in_foreground");
            int J29 = f.J(g3, "out_of_quota_policy");
            int i8 = J18;
            ArrayList arrayList = new ArrayList(g3.getCount());
            while (g3.moveToNext()) {
                String string = g3.getString(J13);
                int i9 = J13;
                String string2 = g3.getString(J15);
                int i10 = J15;
                C0950c c0950c = new C0950c();
                int i11 = J5;
                c0950c.f12343a = AbstractC1464a.A(g3.getInt(J5));
                c0950c.f12344b = g3.getInt(J6) != 0;
                c0950c.f12345c = g3.getInt(J7) != 0;
                c0950c.f12346d = g3.getInt(J8) != 0;
                c0950c.f12347e = g3.getInt(J9) != 0;
                int i12 = J6;
                int i13 = J7;
                c0950c.f12348f = g3.getLong(J10);
                c0950c.f12349g = g3.getLong(J11);
                c0950c.f12350h = AbstractC1464a.e(g3.getBlob(J12));
                i iVar = new i(string, string2);
                iVar.f15217b = AbstractC1464a.C(g3.getInt(J14));
                iVar.f15219d = g3.getString(J16);
                iVar.f15220e = C0954g.a(g3.getBlob(J17));
                int i14 = i8;
                iVar.f15221f = C0954g.a(g3.getBlob(i14));
                int i15 = J19;
                int i16 = J17;
                iVar.f15222g = g3.getLong(i15);
                int i17 = J8;
                int i18 = J20;
                iVar.f15223h = g3.getLong(i18);
                int i19 = J21;
                iVar.f15224i = g3.getLong(i19);
                int i20 = J22;
                iVar.f15225k = g3.getInt(i20);
                int i21 = J23;
                iVar.f15226l = AbstractC1464a.z(g3.getInt(i21));
                int i22 = J24;
                iVar.f15227m = g3.getLong(i22);
                int i23 = J25;
                iVar.f15228n = g3.getLong(i23);
                int i24 = J26;
                iVar.f15229o = g3.getLong(i24);
                int i25 = J27;
                iVar.f15230p = g3.getLong(i25);
                int i26 = J28;
                iVar.f15231q = g3.getInt(i26) != 0;
                int i27 = J29;
                iVar.f15232r = AbstractC1464a.B(g3.getInt(i27));
                iVar.j = c0950c;
                arrayList.add(iVar);
                i8 = i14;
                J6 = i12;
                J28 = i26;
                J13 = i9;
                J15 = i10;
                J5 = i11;
                J29 = i27;
                J17 = i16;
                J19 = i15;
                J20 = i18;
                J24 = i22;
                J25 = i23;
                J27 = i25;
                J7 = i13;
                J26 = i24;
                J8 = i17;
                J21 = i19;
                J22 = i20;
                J23 = i21;
            }
            g3.close();
            kVar.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g3.close();
            kVar.g();
            throw th;
        }
    }

    public ArrayList f() {
        k kVar;
        k c3 = k.c(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor g3 = workDatabase_Impl.g(c3);
        try {
            int J5 = f.J(g3, "required_network_type");
            int J6 = f.J(g3, "requires_charging");
            int J7 = f.J(g3, "requires_device_idle");
            int J8 = f.J(g3, "requires_battery_not_low");
            int J9 = f.J(g3, "requires_storage_not_low");
            int J10 = f.J(g3, "trigger_content_update_delay");
            int J11 = f.J(g3, "trigger_max_content_delay");
            int J12 = f.J(g3, "content_uri_triggers");
            int J13 = f.J(g3, "id");
            int J14 = f.J(g3, SentryThread.JsonKeys.STATE);
            int J15 = f.J(g3, "worker_class_name");
            int J16 = f.J(g3, "input_merger_class_name");
            int J17 = f.J(g3, "input");
            int J18 = f.J(g3, "output");
            kVar = c3;
            try {
                int J19 = f.J(g3, "initial_delay");
                int J20 = f.J(g3, "interval_duration");
                int J21 = f.J(g3, "flex_duration");
                int J22 = f.J(g3, "run_attempt_count");
                int J23 = f.J(g3, "backoff_policy");
                int J24 = f.J(g3, "backoff_delay_duration");
                int J25 = f.J(g3, "period_start_time");
                int J26 = f.J(g3, "minimum_retention_duration");
                int J27 = f.J(g3, "schedule_requested_at");
                int J28 = f.J(g3, "run_in_foreground");
                int J29 = f.J(g3, "out_of_quota_policy");
                int i7 = J18;
                ArrayList arrayList = new ArrayList(g3.getCount());
                while (g3.moveToNext()) {
                    String string = g3.getString(J13);
                    int i8 = J13;
                    String string2 = g3.getString(J15);
                    int i9 = J15;
                    C0950c c0950c = new C0950c();
                    int i10 = J5;
                    c0950c.f12343a = AbstractC1464a.A(g3.getInt(J5));
                    c0950c.f12344b = g3.getInt(J6) != 0;
                    c0950c.f12345c = g3.getInt(J7) != 0;
                    c0950c.f12346d = g3.getInt(J8) != 0;
                    c0950c.f12347e = g3.getInt(J9) != 0;
                    int i11 = J6;
                    int i12 = J7;
                    c0950c.f12348f = g3.getLong(J10);
                    c0950c.f12349g = g3.getLong(J11);
                    c0950c.f12350h = AbstractC1464a.e(g3.getBlob(J12));
                    i iVar = new i(string, string2);
                    iVar.f15217b = AbstractC1464a.C(g3.getInt(J14));
                    iVar.f15219d = g3.getString(J16);
                    iVar.f15220e = C0954g.a(g3.getBlob(J17));
                    int i13 = i7;
                    iVar.f15221f = C0954g.a(g3.getBlob(i13));
                    int i14 = J17;
                    int i15 = J19;
                    iVar.f15222g = g3.getLong(i15);
                    int i16 = J8;
                    int i17 = J20;
                    iVar.f15223h = g3.getLong(i17);
                    int i18 = J21;
                    iVar.f15224i = g3.getLong(i18);
                    int i19 = J22;
                    iVar.f15225k = g3.getInt(i19);
                    int i20 = J23;
                    iVar.f15226l = AbstractC1464a.z(g3.getInt(i20));
                    int i21 = J24;
                    iVar.f15227m = g3.getLong(i21);
                    int i22 = J25;
                    iVar.f15228n = g3.getLong(i22);
                    int i23 = J26;
                    iVar.f15229o = g3.getLong(i23);
                    int i24 = J27;
                    iVar.f15230p = g3.getLong(i24);
                    int i25 = J28;
                    iVar.f15231q = g3.getInt(i25) != 0;
                    int i26 = J29;
                    iVar.f15232r = AbstractC1464a.B(g3.getInt(i26));
                    iVar.j = c0950c;
                    arrayList.add(iVar);
                    i7 = i13;
                    J6 = i11;
                    J19 = i15;
                    J20 = i17;
                    J24 = i21;
                    J25 = i22;
                    J28 = i25;
                    J15 = i9;
                    J5 = i10;
                    J29 = i26;
                    J27 = i24;
                    J17 = i14;
                    J13 = i8;
                    J7 = i12;
                    J26 = i23;
                    J8 = i16;
                    J21 = i18;
                    J22 = i19;
                    J23 = i20;
                }
                g3.close();
                kVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                g3.close();
                kVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = c3;
        }
    }

    public ArrayList g() {
        k kVar;
        k c3 = k.c(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor g3 = workDatabase_Impl.g(c3);
        try {
            int J5 = f.J(g3, "required_network_type");
            int J6 = f.J(g3, "requires_charging");
            int J7 = f.J(g3, "requires_device_idle");
            int J8 = f.J(g3, "requires_battery_not_low");
            int J9 = f.J(g3, "requires_storage_not_low");
            int J10 = f.J(g3, "trigger_content_update_delay");
            int J11 = f.J(g3, "trigger_max_content_delay");
            int J12 = f.J(g3, "content_uri_triggers");
            int J13 = f.J(g3, "id");
            int J14 = f.J(g3, SentryThread.JsonKeys.STATE);
            int J15 = f.J(g3, "worker_class_name");
            int J16 = f.J(g3, "input_merger_class_name");
            int J17 = f.J(g3, "input");
            int J18 = f.J(g3, "output");
            kVar = c3;
            try {
                int J19 = f.J(g3, "initial_delay");
                int J20 = f.J(g3, "interval_duration");
                int J21 = f.J(g3, "flex_duration");
                int J22 = f.J(g3, "run_attempt_count");
                int J23 = f.J(g3, "backoff_policy");
                int J24 = f.J(g3, "backoff_delay_duration");
                int J25 = f.J(g3, "period_start_time");
                int J26 = f.J(g3, "minimum_retention_duration");
                int J27 = f.J(g3, "schedule_requested_at");
                int J28 = f.J(g3, "run_in_foreground");
                int J29 = f.J(g3, "out_of_quota_policy");
                int i7 = J18;
                ArrayList arrayList = new ArrayList(g3.getCount());
                while (g3.moveToNext()) {
                    String string = g3.getString(J13);
                    int i8 = J13;
                    String string2 = g3.getString(J15);
                    int i9 = J15;
                    C0950c c0950c = new C0950c();
                    int i10 = J5;
                    c0950c.f12343a = AbstractC1464a.A(g3.getInt(J5));
                    c0950c.f12344b = g3.getInt(J6) != 0;
                    c0950c.f12345c = g3.getInt(J7) != 0;
                    c0950c.f12346d = g3.getInt(J8) != 0;
                    c0950c.f12347e = g3.getInt(J9) != 0;
                    int i11 = J6;
                    int i12 = J7;
                    c0950c.f12348f = g3.getLong(J10);
                    c0950c.f12349g = g3.getLong(J11);
                    c0950c.f12350h = AbstractC1464a.e(g3.getBlob(J12));
                    i iVar = new i(string, string2);
                    iVar.f15217b = AbstractC1464a.C(g3.getInt(J14));
                    iVar.f15219d = g3.getString(J16);
                    iVar.f15220e = C0954g.a(g3.getBlob(J17));
                    int i13 = i7;
                    iVar.f15221f = C0954g.a(g3.getBlob(i13));
                    int i14 = J17;
                    int i15 = J19;
                    iVar.f15222g = g3.getLong(i15);
                    int i16 = J8;
                    int i17 = J20;
                    iVar.f15223h = g3.getLong(i17);
                    int i18 = J21;
                    iVar.f15224i = g3.getLong(i18);
                    int i19 = J22;
                    iVar.f15225k = g3.getInt(i19);
                    int i20 = J23;
                    iVar.f15226l = AbstractC1464a.z(g3.getInt(i20));
                    int i21 = J24;
                    iVar.f15227m = g3.getLong(i21);
                    int i22 = J25;
                    iVar.f15228n = g3.getLong(i22);
                    int i23 = J26;
                    iVar.f15229o = g3.getLong(i23);
                    int i24 = J27;
                    iVar.f15230p = g3.getLong(i24);
                    int i25 = J28;
                    iVar.f15231q = g3.getInt(i25) != 0;
                    int i26 = J29;
                    iVar.f15232r = AbstractC1464a.B(g3.getInt(i26));
                    iVar.j = c0950c;
                    arrayList.add(iVar);
                    i7 = i13;
                    J6 = i11;
                    J19 = i15;
                    J20 = i17;
                    J24 = i21;
                    J25 = i22;
                    J28 = i25;
                    J15 = i9;
                    J5 = i10;
                    J29 = i26;
                    J27 = i24;
                    J17 = i14;
                    J13 = i8;
                    J7 = i12;
                    J26 = i23;
                    J8 = i16;
                    J21 = i18;
                    J22 = i19;
                    J23 = i20;
                }
                g3.close();
                kVar.g();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                g3.close();
                kVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = c3;
        }
    }

    public int h(String str) {
        k c3 = k.c(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            c3.e(1);
        } else {
            c3.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor g3 = workDatabase_Impl.g(c3);
        try {
            return g3.moveToFirst() ? AbstractC1464a.C(g3.getInt(0)) : 0;
        } finally {
            g3.close();
            c3.g();
        }
    }

    public ArrayList i() {
        k c3 = k.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        c3.e(1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor g3 = workDatabase_Impl.g(c3);
        try {
            ArrayList arrayList = new ArrayList(g3.getCount());
            while (g3.moveToNext()) {
                arrayList.add(g3.getString(0));
            }
            return arrayList;
        } finally {
            g3.close();
            c3.g();
        }
    }

    public ArrayList j() {
        k c3 = k.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        c3.f(1, "offline_ping_sender_work");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor g3 = workDatabase_Impl.g(c3);
        try {
            ArrayList arrayList = new ArrayList(g3.getCount());
            while (g3.moveToNext()) {
                arrayList.add(g3.getString(0));
            }
            return arrayList;
        } finally {
            g3.close();
            c3.g();
        }
    }

    public boolean k() {
        return !((Boolean) this.f10441i).booleanValue() && ((Map) this.f10437e).containsKey("encryptedSharedPreferences") && ((Map) this.f10437e).get("encryptedSharedPreferences").equals("true");
    }

    public i l(String str) {
        k kVar;
        int J5;
        int J6;
        int J7;
        int J8;
        int J9;
        int J10;
        int J11;
        int J12;
        int J13;
        int J14;
        int J15;
        int J16;
        int J17;
        int J18;
        i iVar;
        k c3 = k.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            c3.e(1);
        } else {
            c3.f(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        Cursor g3 = workDatabase_Impl.g(c3);
        try {
            J5 = f.J(g3, "required_network_type");
            J6 = f.J(g3, "requires_charging");
            J7 = f.J(g3, "requires_device_idle");
            J8 = f.J(g3, "requires_battery_not_low");
            J9 = f.J(g3, "requires_storage_not_low");
            J10 = f.J(g3, "trigger_content_update_delay");
            J11 = f.J(g3, "trigger_max_content_delay");
            J12 = f.J(g3, "content_uri_triggers");
            J13 = f.J(g3, "id");
            J14 = f.J(g3, SentryThread.JsonKeys.STATE);
            J15 = f.J(g3, "worker_class_name");
            J16 = f.J(g3, "input_merger_class_name");
            J17 = f.J(g3, "input");
            J18 = f.J(g3, "output");
            kVar = c3;
        } catch (Throwable th) {
            th = th;
            kVar = c3;
        }
        try {
            int J19 = f.J(g3, "initial_delay");
            int J20 = f.J(g3, "interval_duration");
            int J21 = f.J(g3, "flex_duration");
            int J22 = f.J(g3, "run_attempt_count");
            int J23 = f.J(g3, "backoff_policy");
            int J24 = f.J(g3, "backoff_delay_duration");
            int J25 = f.J(g3, "period_start_time");
            int J26 = f.J(g3, "minimum_retention_duration");
            int J27 = f.J(g3, "schedule_requested_at");
            int J28 = f.J(g3, "run_in_foreground");
            int J29 = f.J(g3, "out_of_quota_policy");
            if (g3.moveToFirst()) {
                String string = g3.getString(J13);
                String string2 = g3.getString(J15);
                C0950c c0950c = new C0950c();
                c0950c.f12343a = AbstractC1464a.A(g3.getInt(J5));
                c0950c.f12344b = g3.getInt(J6) != 0;
                c0950c.f12345c = g3.getInt(J7) != 0;
                c0950c.f12346d = g3.getInt(J8) != 0;
                c0950c.f12347e = g3.getInt(J9) != 0;
                c0950c.f12348f = g3.getLong(J10);
                c0950c.f12349g = g3.getLong(J11);
                c0950c.f12350h = AbstractC1464a.e(g3.getBlob(J12));
                iVar = new i(string, string2);
                iVar.f15217b = AbstractC1464a.C(g3.getInt(J14));
                iVar.f15219d = g3.getString(J16);
                iVar.f15220e = C0954g.a(g3.getBlob(J17));
                iVar.f15221f = C0954g.a(g3.getBlob(J18));
                iVar.f15222g = g3.getLong(J19);
                iVar.f15223h = g3.getLong(J20);
                iVar.f15224i = g3.getLong(J21);
                iVar.f15225k = g3.getInt(J22);
                iVar.f15226l = AbstractC1464a.z(g3.getInt(J23));
                iVar.f15227m = g3.getLong(J24);
                iVar.f15228n = g3.getLong(J25);
                iVar.f15229o = g3.getLong(J26);
                iVar.f15230p = g3.getLong(J27);
                iVar.f15231q = g3.getInt(J28) != 0;
                iVar.f15232r = AbstractC1464a.B(g3.getInt(J29));
                iVar.j = c0950c;
            } else {
                iVar = null;
            }
            g3.close();
            kVar.g();
            return iVar;
        } catch (Throwable th2) {
            th = th2;
            g3.close();
            kVar.g();
            throw th;
        }
    }

    public void m(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        C1430e c1430e = (C1430e) this.f10438f;
        K0.f a2 = c1430e.a();
        if (str == null) {
            a2.d(1);
        } else {
            a2.e(1, str);
        }
        workDatabase_Impl.c();
        try {
            a2.f3881d.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            c1430e.c(a2);
        }
    }

    public void n(SharedPreferences sharedPreferences) {
        this.f10440h = new F0(sharedPreferences, (Map) this.f10437e);
        boolean k7 = k();
        Context context = (Context) this.f10434b;
        if (k7) {
            F0 f02 = (F0) this.f10440h;
            this.f10439g = ((d5.c) f02.f17374c).f12408a.j(context, ((EnumC0966a) f02.f17373b).f12404a.k(context));
            return;
        }
        F0 f03 = (F0) this.f10440h;
        EnumC0966a enumC0966a = (EnumC0966a) f03.f17373b;
        d5.c cVar = (d5.c) f03.f17374c;
        EnumC0966a enumC0966a2 = (EnumC0966a) f03.f17375d;
        d5.c cVar2 = (d5.c) f03.f17376e;
        if (enumC0966a == enumC0966a2 && cVar == cVar2) {
            this.f10439g = cVar2.f12408a.j(context, enumC0966a2.f12404a.k(context));
            return;
        }
        try {
            this.f10439g = cVar.f12408a.j(context, enumC0966a.f12404a.k(context));
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains((String) this.f10435c)) {
                    hashMap.put(key, b((String) value));
                }
            }
            this.f10439g = cVar2.f12408a.j(context, enumC0966a2.f12404a.k(context));
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                edit.putString((String) entry2.getKey(), Base64.encodeToString(((C1726n0) this.f10439g).j(((String) entry2.getValue()).getBytes((Charset) this.f10433a)), 0));
            }
            edit.putString("FlutterSecureSAlgorithmKey", enumC0966a2.name());
            edit.putString("FlutterSecureSAlgorithmStorage", cVar2.name());
            edit.apply();
        } catch (Exception e7) {
            Log.e("SecureStorageAndroid", "re-encryption failed", e7);
            this.f10439g = cVar.f12408a.j(context, ((EnumC0966a) f03.f17373b).f12404a.k(context));
        }
    }

    public H0.b o(Context context) {
        C1759x1 c3;
        C1759x1 c4;
        context.getApplicationContext();
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings("NoPadding").setBlockModes("GCM").setKeySize(256).build();
        if (!"_androidx_security_master_key_".equals(H0.c.a(build))) {
            throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (_androidx_security_master_key_ vs " + H0.c.a(build));
        }
        if (build == null) {
            throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
        }
        Object obj = d.f3196a;
        if (build.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + build.getKeySize() + " bits");
        }
        if (!Arrays.equals(build.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(build.getBlockModes()));
        }
        if (build.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + build.getPurposes());
        }
        if (!Arrays.equals(build.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(build.getEncryptionPaddings()));
        }
        if (build.isUserAuthenticationRequired() && build.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
        synchronized (d.f3196a) {
            String keystoreAlias = build.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(build);
                    keyGenerator.generateKey();
                } catch (ProviderException e7) {
                    throw new GeneralSecurityException(e7.getMessage(), e7);
                }
            }
        }
        String keystoreAlias2 = build.getKeystoreAlias();
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
        String i8 = L.i("android-keystore://", keystoreAlias2);
        if (!i8.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        n1Var.f8714d = i8;
        P3.a a2 = n1Var.a();
        synchronized (a2) {
            c3 = a2.f5585a.c();
        }
        n1 n1Var2 = new n1();
        n1Var2.f8716f = J3.b.a("AES256_GCM");
        n1Var2.f8711a = applicationContext;
        n1Var2.f8712b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        n1Var2.f8713c = str;
        String i9 = L.i("android-keystore://", keystoreAlias2);
        if (!i9.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        n1Var2.f8714d = i9;
        P3.a a4 = n1Var2.a();
        synchronized (a4) {
            c4 = a4.f5585a.c();
        }
        return new H0.b(str, applicationContext.getSharedPreferences(str, 0), (J3.a) c4.N(J3.a.class), (J3.c) c3.N(J3.c.class));
    }

    public void p(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        C1430e c1430e = (C1430e) this.f10440h;
        K0.f a2 = c1430e.a();
        a2.c(1, j);
        if (str == null) {
            a2.d(2);
        } else {
            a2.e(2, str);
        }
        workDatabase_Impl.c();
        try {
            a2.f3881d.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            c1430e.c(a2);
        }
    }

    public HashMap q() {
        c();
        Map<String, ?> all = ((SharedPreferences) this.f10438f).getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getKey().contains((String) this.f10435c)) {
                String replaceFirst = entry.getKey().replaceFirst(((String) this.f10435c) + '_', "");
                if (k()) {
                    hashMap.put(replaceFirst, (String) entry.getValue());
                } else {
                    hashMap.put(replaceFirst, b((String) entry.getValue()));
                }
            }
        }
        return hashMap;
    }

    public void r(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        C1430e c1430e = (C1430e) this.f10439g;
        K0.f a2 = c1430e.a();
        if (str == null) {
            a2.d(1);
        } else {
            a2.e(1, str);
        }
        workDatabase_Impl.c();
        try {
            a2.f3881d.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            c1430e.c(a2);
        }
    }

    public void s(String str, C0954g c0954g) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        C1430e c1430e = (C1430e) this.f10436d;
        K0.f a2 = c1430e.a();
        byte[] c3 = C0954g.c(c0954g);
        if (c3 == null) {
            a2.d(1);
        } else {
            a2.b(1, c3);
        }
        if (str == null) {
            a2.d(2);
        } else {
            a2.e(2, str);
        }
        workDatabase_Impl.c();
        try {
            a2.k();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            c1430e.c(a2);
        }
    }

    public void t(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10433a;
        workDatabase_Impl.b();
        C1430e c1430e = (C1430e) this.f10437e;
        K0.f a2 = c1430e.a();
        a2.c(1, j);
        if (str == null) {
            a2.d(2);
        } else {
            a2.e(2, str);
        }
        workDatabase_Impl.c();
        try {
            a2.k();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            c1430e.c(a2);
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
        String sb2 = sb.toString();
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        SQLiteStatement compileStatement = ((SQLiteDatabase) workDatabase_Impl.f1655c.l().f3868b).compileStatement(sb2);
        compileStatement.bindLong(1, AbstractC1464a.U(i7));
        int i9 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i9);
            } else {
                compileStatement.bindString(i9, str);
            }
            i9++;
        }
        workDatabase_Impl.c();
        try {
            compileStatement.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public void v(String str, String str2) {
        c();
        SharedPreferences.Editor edit = ((SharedPreferences) this.f10438f).edit();
        if (k()) {
            edit.putString(str, str2);
        } else {
            edit.putString(str, Base64.encodeToString(((C1726n0) this.f10439g).j(str2.getBytes((Charset) this.f10433a)), 0));
        }
        edit.apply();
    }
}
