package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase_Impl;
import f2.C1945c;
import f2.C1948f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class G7 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9170a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9171b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9172c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9173d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9174e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f9175g;

    /* renamed from: h, reason: collision with root package name */
    public Object f9176h;
    public Object i;

    public G7(Sq sq, Lq lq, Xh xh, C0763ai c0763ai, C0904dq c0904dq, Ih ih, C1523ri c1523ri, C0852ci c0852ci, Qi qi) {
        this.f9170a = sq;
        this.f9171b = lq;
        this.f9172c = xh;
        this.f9173d = c0763ai;
        this.f9174e = c0904dq;
        this.f = ih;
        this.f9175g = c1523ri;
        this.f9176h = c0852ci;
        this.i = qi;
    }

    public ArrayList a() {
        R1.j jVar;
        R1.j b3 = R1.j.b("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        b3.h(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9170a;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(b3);
        try {
            int t5 = G4.d.t(g5, "required_network_type");
            int t6 = G4.d.t(g5, "requires_charging");
            int t7 = G4.d.t(g5, "requires_device_idle");
            int t8 = G4.d.t(g5, "requires_battery_not_low");
            int t9 = G4.d.t(g5, "requires_storage_not_low");
            int t10 = G4.d.t(g5, "trigger_content_update_delay");
            int t11 = G4.d.t(g5, "trigger_max_content_delay");
            int t12 = G4.d.t(g5, "content_uri_triggers");
            int t13 = G4.d.t(g5, "id");
            int t14 = G4.d.t(g5, "state");
            int t15 = G4.d.t(g5, "worker_class_name");
            int t16 = G4.d.t(g5, "input_merger_class_name");
            int t17 = G4.d.t(g5, "input");
            jVar = b3;
            try {
                int t18 = G4.d.t(g5, "output");
                int t19 = G4.d.t(g5, "initial_delay");
                int t20 = G4.d.t(g5, "interval_duration");
                int t21 = G4.d.t(g5, "flex_duration");
                int t22 = G4.d.t(g5, "run_attempt_count");
                int t23 = G4.d.t(g5, "backoff_policy");
                int t24 = G4.d.t(g5, "backoff_delay_duration");
                int t25 = G4.d.t(g5, "period_start_time");
                int t26 = G4.d.t(g5, "minimum_retention_duration");
                int t27 = G4.d.t(g5, "schedule_requested_at");
                int t28 = G4.d.t(g5, "run_in_foreground");
                int t29 = G4.d.t(g5, "out_of_quota_policy");
                int i = t18;
                ArrayList arrayList = new ArrayList(g5.getCount());
                while (g5.moveToNext()) {
                    String string = g5.getString(t13);
                    int i5 = t13;
                    String string2 = g5.getString(t15);
                    int i6 = t15;
                    C1945c c1945c = new C1945c();
                    int i7 = t5;
                    c1945c.f16982a = N4.b.E(g5.getInt(t5));
                    c1945c.f16983b = g5.getInt(t6) != 0;
                    c1945c.f16984c = g5.getInt(t7) != 0;
                    c1945c.f16985d = g5.getInt(t8) != 0;
                    c1945c.f16986e = g5.getInt(t9) != 0;
                    int i8 = t6;
                    int i9 = t7;
                    c1945c.f = g5.getLong(t10);
                    c1945c.f16987g = g5.getLong(t11);
                    c1945c.f16988h = N4.b.l(g5.getBlob(t12));
                    o2.i iVar = new o2.i(string, string2);
                    iVar.f18634b = N4.b.G(g5.getInt(t14));
                    iVar.f18636d = g5.getString(t16);
                    iVar.f18637e = C1948f.a(g5.getBlob(t17));
                    int i10 = i;
                    iVar.f = C1948f.a(g5.getBlob(i10));
                    int i11 = t17;
                    int i12 = t19;
                    iVar.f18638g = g5.getLong(i12);
                    i = i10;
                    int i13 = t20;
                    iVar.f18639h = g5.getLong(i13);
                    int i14 = t8;
                    int i15 = t21;
                    iVar.i = g5.getLong(i15);
                    int i16 = t22;
                    iVar.f18641k = g5.getInt(i16);
                    int i17 = t23;
                    iVar.f18642l = N4.b.D(g5.getInt(i17));
                    t21 = i15;
                    int i18 = t24;
                    iVar.f18643m = g5.getLong(i18);
                    int i19 = t25;
                    iVar.f18644n = g5.getLong(i19);
                    t25 = i19;
                    int i20 = t26;
                    iVar.f18645o = g5.getLong(i20);
                    int i21 = t27;
                    iVar.f18646p = g5.getLong(i21);
                    int i22 = t28;
                    iVar.f18647q = g5.getInt(i22) != 0;
                    int i23 = t29;
                    iVar.f18648r = N4.b.F(g5.getInt(i23));
                    iVar.f18640j = c1945c;
                    arrayList.add(iVar);
                    t24 = i18;
                    t8 = i14;
                    t23 = i17;
                    t29 = i23;
                    t6 = i8;
                    t19 = i12;
                    t20 = i13;
                    t22 = i16;
                    t27 = i21;
                    t15 = i6;
                    t5 = i7;
                    t28 = i22;
                    t26 = i20;
                    t17 = i11;
                    t13 = i5;
                    t7 = i9;
                }
                g5.close();
                jVar.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                g5.close();
                jVar.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = b3;
        }
    }

    public ArrayList b(int i) {
        R1.j jVar;
        R1.j b3 = R1.j.b("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        b3.h(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9170a;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(b3);
        try {
            int t5 = G4.d.t(g5, "required_network_type");
            int t6 = G4.d.t(g5, "requires_charging");
            int t7 = G4.d.t(g5, "requires_device_idle");
            int t8 = G4.d.t(g5, "requires_battery_not_low");
            int t9 = G4.d.t(g5, "requires_storage_not_low");
            int t10 = G4.d.t(g5, "trigger_content_update_delay");
            int t11 = G4.d.t(g5, "trigger_max_content_delay");
            int t12 = G4.d.t(g5, "content_uri_triggers");
            int t13 = G4.d.t(g5, "id");
            int t14 = G4.d.t(g5, "state");
            int t15 = G4.d.t(g5, "worker_class_name");
            int t16 = G4.d.t(g5, "input_merger_class_name");
            int t17 = G4.d.t(g5, "input");
            jVar = b3;
            try {
                int t18 = G4.d.t(g5, "output");
                int t19 = G4.d.t(g5, "initial_delay");
                int t20 = G4.d.t(g5, "interval_duration");
                int t21 = G4.d.t(g5, "flex_duration");
                int t22 = G4.d.t(g5, "run_attempt_count");
                int t23 = G4.d.t(g5, "backoff_policy");
                int t24 = G4.d.t(g5, "backoff_delay_duration");
                int t25 = G4.d.t(g5, "period_start_time");
                int t26 = G4.d.t(g5, "minimum_retention_duration");
                int t27 = G4.d.t(g5, "schedule_requested_at");
                int t28 = G4.d.t(g5, "run_in_foreground");
                int t29 = G4.d.t(g5, "out_of_quota_policy");
                int i5 = t18;
                ArrayList arrayList = new ArrayList(g5.getCount());
                while (g5.moveToNext()) {
                    String string = g5.getString(t13);
                    int i6 = t13;
                    String string2 = g5.getString(t15);
                    int i7 = t15;
                    C1945c c1945c = new C1945c();
                    int i8 = t5;
                    c1945c.f16982a = N4.b.E(g5.getInt(t5));
                    c1945c.f16983b = g5.getInt(t6) != 0;
                    c1945c.f16984c = g5.getInt(t7) != 0;
                    c1945c.f16985d = g5.getInt(t8) != 0;
                    c1945c.f16986e = g5.getInt(t9) != 0;
                    int i9 = t6;
                    int i10 = t7;
                    c1945c.f = g5.getLong(t10);
                    c1945c.f16987g = g5.getLong(t11);
                    c1945c.f16988h = N4.b.l(g5.getBlob(t12));
                    o2.i iVar = new o2.i(string, string2);
                    iVar.f18634b = N4.b.G(g5.getInt(t14));
                    iVar.f18636d = g5.getString(t16);
                    iVar.f18637e = C1948f.a(g5.getBlob(t17));
                    int i11 = i5;
                    iVar.f = C1948f.a(g5.getBlob(i11));
                    int i12 = t19;
                    int i13 = t17;
                    iVar.f18638g = g5.getLong(i12);
                    i5 = i11;
                    int i14 = t20;
                    iVar.f18639h = g5.getLong(i14);
                    int i15 = t8;
                    int i16 = t21;
                    iVar.i = g5.getLong(i16);
                    int i17 = t22;
                    iVar.f18641k = g5.getInt(i17);
                    int i18 = t23;
                    iVar.f18642l = N4.b.D(g5.getInt(i18));
                    t21 = i16;
                    int i19 = t24;
                    iVar.f18643m = g5.getLong(i19);
                    int i20 = t25;
                    iVar.f18644n = g5.getLong(i20);
                    t25 = i20;
                    int i21 = t26;
                    iVar.f18645o = g5.getLong(i21);
                    int i22 = t27;
                    iVar.f18646p = g5.getLong(i22);
                    int i23 = t28;
                    iVar.f18647q = g5.getInt(i23) != 0;
                    int i24 = t29;
                    iVar.f18648r = N4.b.F(g5.getInt(i24));
                    iVar.f18640j = c1945c;
                    arrayList.add(iVar);
                    t24 = i19;
                    t8 = i15;
                    t23 = i18;
                    t29 = i24;
                    t6 = i9;
                    t27 = i22;
                    t13 = i6;
                    t15 = i7;
                    t5 = i8;
                    t28 = i23;
                    t17 = i13;
                    t19 = i12;
                    t20 = i14;
                    t22 = i17;
                    t26 = i21;
                    t7 = i10;
                }
                g5.close();
                jVar.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                g5.close();
                jVar.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = b3;
        }
    }

    public ArrayList c() {
        R1.j jVar;
        int t5;
        int t6;
        int t7;
        int t8;
        int t9;
        int t10;
        int t11;
        int t12;
        int t13;
        int t14;
        int t15;
        int t16;
        int t17;
        R1.j b3 = R1.j.b("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9170a;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(b3);
        try {
            t5 = G4.d.t(g5, "required_network_type");
            t6 = G4.d.t(g5, "requires_charging");
            t7 = G4.d.t(g5, "requires_device_idle");
            t8 = G4.d.t(g5, "requires_battery_not_low");
            t9 = G4.d.t(g5, "requires_storage_not_low");
            t10 = G4.d.t(g5, "trigger_content_update_delay");
            t11 = G4.d.t(g5, "trigger_max_content_delay");
            t12 = G4.d.t(g5, "content_uri_triggers");
            t13 = G4.d.t(g5, "id");
            t14 = G4.d.t(g5, "state");
            t15 = G4.d.t(g5, "worker_class_name");
            t16 = G4.d.t(g5, "input_merger_class_name");
            t17 = G4.d.t(g5, "input");
            jVar = b3;
        } catch (Throwable th) {
            th = th;
            jVar = b3;
        }
        try {
            int t18 = G4.d.t(g5, "output");
            int t19 = G4.d.t(g5, "initial_delay");
            int t20 = G4.d.t(g5, "interval_duration");
            int t21 = G4.d.t(g5, "flex_duration");
            int t22 = G4.d.t(g5, "run_attempt_count");
            int t23 = G4.d.t(g5, "backoff_policy");
            int t24 = G4.d.t(g5, "backoff_delay_duration");
            int t25 = G4.d.t(g5, "period_start_time");
            int t26 = G4.d.t(g5, "minimum_retention_duration");
            int t27 = G4.d.t(g5, "schedule_requested_at");
            int t28 = G4.d.t(g5, "run_in_foreground");
            int t29 = G4.d.t(g5, "out_of_quota_policy");
            int i = t18;
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                String string = g5.getString(t13);
                int i5 = t13;
                String string2 = g5.getString(t15);
                int i6 = t15;
                C1945c c1945c = new C1945c();
                int i7 = t5;
                c1945c.f16982a = N4.b.E(g5.getInt(t5));
                c1945c.f16983b = g5.getInt(t6) != 0;
                c1945c.f16984c = g5.getInt(t7) != 0;
                c1945c.f16985d = g5.getInt(t8) != 0;
                c1945c.f16986e = g5.getInt(t9) != 0;
                int i8 = t6;
                int i9 = t7;
                c1945c.f = g5.getLong(t10);
                c1945c.f16987g = g5.getLong(t11);
                c1945c.f16988h = N4.b.l(g5.getBlob(t12));
                o2.i iVar = new o2.i(string, string2);
                iVar.f18634b = N4.b.G(g5.getInt(t14));
                iVar.f18636d = g5.getString(t16);
                iVar.f18637e = C1948f.a(g5.getBlob(t17));
                int i10 = i;
                iVar.f = C1948f.a(g5.getBlob(i10));
                int i11 = t17;
                int i12 = t19;
                iVar.f18638g = g5.getLong(i12);
                i = i10;
                int i13 = t20;
                iVar.f18639h = g5.getLong(i13);
                int i14 = t8;
                int i15 = t21;
                iVar.i = g5.getLong(i15);
                int i16 = t22;
                iVar.f18641k = g5.getInt(i16);
                int i17 = t23;
                iVar.f18642l = N4.b.D(g5.getInt(i17));
                t21 = i15;
                int i18 = t24;
                iVar.f18643m = g5.getLong(i18);
                int i19 = t25;
                iVar.f18644n = g5.getLong(i19);
                t25 = i19;
                int i20 = t26;
                iVar.f18645o = g5.getLong(i20);
                int i21 = t27;
                iVar.f18646p = g5.getLong(i21);
                int i22 = t28;
                iVar.f18647q = g5.getInt(i22) != 0;
                int i23 = t29;
                iVar.f18648r = N4.b.F(g5.getInt(i23));
                iVar.f18640j = c1945c;
                arrayList.add(iVar);
                t24 = i18;
                t8 = i14;
                t23 = i17;
                t29 = i23;
                t6 = i8;
                t19 = i12;
                t20 = i13;
                t22 = i16;
                t27 = i21;
                t15 = i6;
                t5 = i7;
                t28 = i22;
                t26 = i20;
                t17 = i11;
                t13 = i5;
                t7 = i9;
            }
            g5.close();
            jVar.l();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g5.close();
            jVar.l();
            throw th;
        }
    }

    public ArrayList d() {
        R1.j jVar;
        int t5;
        int t6;
        int t7;
        int t8;
        int t9;
        int t10;
        int t11;
        int t12;
        int t13;
        int t14;
        int t15;
        int t16;
        int t17;
        R1.j b3 = R1.j.b("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9170a;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(b3);
        try {
            t5 = G4.d.t(g5, "required_network_type");
            t6 = G4.d.t(g5, "requires_charging");
            t7 = G4.d.t(g5, "requires_device_idle");
            t8 = G4.d.t(g5, "requires_battery_not_low");
            t9 = G4.d.t(g5, "requires_storage_not_low");
            t10 = G4.d.t(g5, "trigger_content_update_delay");
            t11 = G4.d.t(g5, "trigger_max_content_delay");
            t12 = G4.d.t(g5, "content_uri_triggers");
            t13 = G4.d.t(g5, "id");
            t14 = G4.d.t(g5, "state");
            t15 = G4.d.t(g5, "worker_class_name");
            t16 = G4.d.t(g5, "input_merger_class_name");
            t17 = G4.d.t(g5, "input");
            jVar = b3;
        } catch (Throwable th) {
            th = th;
            jVar = b3;
        }
        try {
            int t18 = G4.d.t(g5, "output");
            int t19 = G4.d.t(g5, "initial_delay");
            int t20 = G4.d.t(g5, "interval_duration");
            int t21 = G4.d.t(g5, "flex_duration");
            int t22 = G4.d.t(g5, "run_attempt_count");
            int t23 = G4.d.t(g5, "backoff_policy");
            int t24 = G4.d.t(g5, "backoff_delay_duration");
            int t25 = G4.d.t(g5, "period_start_time");
            int t26 = G4.d.t(g5, "minimum_retention_duration");
            int t27 = G4.d.t(g5, "schedule_requested_at");
            int t28 = G4.d.t(g5, "run_in_foreground");
            int t29 = G4.d.t(g5, "out_of_quota_policy");
            int i = t18;
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                String string = g5.getString(t13);
                int i5 = t13;
                String string2 = g5.getString(t15);
                int i6 = t15;
                C1945c c1945c = new C1945c();
                int i7 = t5;
                c1945c.f16982a = N4.b.E(g5.getInt(t5));
                c1945c.f16983b = g5.getInt(t6) != 0;
                c1945c.f16984c = g5.getInt(t7) != 0;
                c1945c.f16985d = g5.getInt(t8) != 0;
                c1945c.f16986e = g5.getInt(t9) != 0;
                int i8 = t6;
                int i9 = t7;
                c1945c.f = g5.getLong(t10);
                c1945c.f16987g = g5.getLong(t11);
                c1945c.f16988h = N4.b.l(g5.getBlob(t12));
                o2.i iVar = new o2.i(string, string2);
                iVar.f18634b = N4.b.G(g5.getInt(t14));
                iVar.f18636d = g5.getString(t16);
                iVar.f18637e = C1948f.a(g5.getBlob(t17));
                int i10 = i;
                iVar.f = C1948f.a(g5.getBlob(i10));
                int i11 = t17;
                int i12 = t19;
                iVar.f18638g = g5.getLong(i12);
                i = i10;
                int i13 = t20;
                iVar.f18639h = g5.getLong(i13);
                int i14 = t8;
                int i15 = t21;
                iVar.i = g5.getLong(i15);
                int i16 = t22;
                iVar.f18641k = g5.getInt(i16);
                int i17 = t23;
                iVar.f18642l = N4.b.D(g5.getInt(i17));
                t21 = i15;
                int i18 = t24;
                iVar.f18643m = g5.getLong(i18);
                int i19 = t25;
                iVar.f18644n = g5.getLong(i19);
                t25 = i19;
                int i20 = t26;
                iVar.f18645o = g5.getLong(i20);
                int i21 = t27;
                iVar.f18646p = g5.getLong(i21);
                int i22 = t28;
                iVar.f18647q = g5.getInt(i22) != 0;
                int i23 = t29;
                iVar.f18648r = N4.b.F(g5.getInt(i23));
                iVar.f18640j = c1945c;
                arrayList.add(iVar);
                t24 = i18;
                t8 = i14;
                t23 = i17;
                t29 = i23;
                t6 = i8;
                t19 = i12;
                t20 = i13;
                t22 = i16;
                t27 = i21;
                t15 = i6;
                t5 = i7;
                t28 = i22;
                t26 = i20;
                t17 = i11;
                t13 = i5;
                t7 = i9;
            }
            g5.close();
            jVar.l();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g5.close();
            jVar.l();
            throw th;
        }
    }

    public int e(String str) {
        R1.j b3 = R1.j.b("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            b3.i(1);
        } else {
            b3.k(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9170a;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(b3);
        try {
            return g5.moveToFirst() ? N4.b.G(g5.getInt(0)) : 0;
        } finally {
            g5.close();
            b3.l();
        }
    }

    public ArrayList f() {
        R1.j b3 = R1.j.b("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        b3.i(1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9170a;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(b3);
        try {
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                arrayList.add(g5.getString(0));
            }
            return arrayList;
        } finally {
            g5.close();
            b3.l();
        }
    }

    public ArrayList g() {
        R1.j b3 = R1.j.b("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        b3.k("offline_ping_sender_work", 1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9170a;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(b3);
        try {
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                arrayList.add(g5.getString(0));
            }
            return arrayList;
        } finally {
            g5.close();
            b3.l();
        }
    }

    public o2.i h(String str) {
        R1.j jVar;
        int t5;
        int t6;
        int t7;
        int t8;
        int t9;
        int t10;
        int t11;
        int t12;
        int t13;
        int t14;
        int t15;
        int t16;
        int t17;
        o2.i iVar;
        R1.j b3 = R1.j.b("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            b3.i(1);
        } else {
            b3.k(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9170a;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(b3);
        try {
            t5 = G4.d.t(g5, "required_network_type");
            t6 = G4.d.t(g5, "requires_charging");
            t7 = G4.d.t(g5, "requires_device_idle");
            t8 = G4.d.t(g5, "requires_battery_not_low");
            t9 = G4.d.t(g5, "requires_storage_not_low");
            t10 = G4.d.t(g5, "trigger_content_update_delay");
            t11 = G4.d.t(g5, "trigger_max_content_delay");
            t12 = G4.d.t(g5, "content_uri_triggers");
            t13 = G4.d.t(g5, "id");
            t14 = G4.d.t(g5, "state");
            t15 = G4.d.t(g5, "worker_class_name");
            t16 = G4.d.t(g5, "input_merger_class_name");
            t17 = G4.d.t(g5, "input");
            jVar = b3;
        } catch (Throwable th) {
            th = th;
            jVar = b3;
        }
        try {
            int t18 = G4.d.t(g5, "output");
            int t19 = G4.d.t(g5, "initial_delay");
            int t20 = G4.d.t(g5, "interval_duration");
            int t21 = G4.d.t(g5, "flex_duration");
            int t22 = G4.d.t(g5, "run_attempt_count");
            int t23 = G4.d.t(g5, "backoff_policy");
            int t24 = G4.d.t(g5, "backoff_delay_duration");
            int t25 = G4.d.t(g5, "period_start_time");
            int t26 = G4.d.t(g5, "minimum_retention_duration");
            int t27 = G4.d.t(g5, "schedule_requested_at");
            int t28 = G4.d.t(g5, "run_in_foreground");
            int t29 = G4.d.t(g5, "out_of_quota_policy");
            if (g5.moveToFirst()) {
                String string = g5.getString(t13);
                String string2 = g5.getString(t15);
                C1945c c1945c = new C1945c();
                c1945c.f16982a = N4.b.E(g5.getInt(t5));
                c1945c.f16983b = g5.getInt(t6) != 0;
                c1945c.f16984c = g5.getInt(t7) != 0;
                c1945c.f16985d = g5.getInt(t8) != 0;
                c1945c.f16986e = g5.getInt(t9) != 0;
                c1945c.f = g5.getLong(t10);
                c1945c.f16987g = g5.getLong(t11);
                c1945c.f16988h = N4.b.l(g5.getBlob(t12));
                iVar = new o2.i(string, string2);
                iVar.f18634b = N4.b.G(g5.getInt(t14));
                iVar.f18636d = g5.getString(t16);
                iVar.f18637e = C1948f.a(g5.getBlob(t17));
                iVar.f = C1948f.a(g5.getBlob(t18));
                iVar.f18638g = g5.getLong(t19);
                iVar.f18639h = g5.getLong(t20);
                iVar.i = g5.getLong(t21);
                iVar.f18641k = g5.getInt(t22);
                iVar.f18642l = N4.b.D(g5.getInt(t23));
                iVar.f18643m = g5.getLong(t24);
                iVar.f18644n = g5.getLong(t25);
                iVar.f18645o = g5.getLong(t26);
                iVar.f18646p = g5.getLong(t27);
                iVar.f18647q = g5.getInt(t28) != 0;
                iVar.f18648r = N4.b.F(g5.getInt(t29));
                iVar.f18640j = c1945c;
            } else {
                iVar = null;
            }
            g5.close();
            jVar.l();
            return iVar;
        } catch (Throwable th2) {
            th = th2;
            g5.close();
            jVar.l();
            throw th;
        }
    }

    public void i(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9170a;
        workDatabase_Impl.b();
        o2.e eVar = (o2.e) this.f;
        Y1.f a5 = eVar.a();
        if (str == null) {
            a5.h(1);
        } else {
            a5.i(str, 1);
        }
        workDatabase_Impl.c();
        try {
            a5.f6136n.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a5);
        }
    }

    public void j(String str, long j5) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9170a;
        workDatabase_Impl.b();
        o2.e eVar = (o2.e) this.f9176h;
        Y1.f a5 = eVar.a();
        a5.f(1, j5);
        if (str == null) {
            a5.h(2);
        } else {
            a5.i(str, 2);
        }
        workDatabase_Impl.c();
        try {
            a5.f6136n.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a5);
        }
    }

    public void k(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9170a;
        workDatabase_Impl.b();
        o2.e eVar = (o2.e) this.f9175g;
        Y1.f a5 = eVar.a();
        if (str == null) {
            a5.h(1);
        } else {
            a5.i(str, 1);
        }
        workDatabase_Impl.c();
        try {
            a5.f6136n.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a5);
        }
    }

    public void l(String str, C1948f c1948f) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9170a;
        workDatabase_Impl.b();
        o2.e eVar = (o2.e) this.f9173d;
        Y1.f a5 = eVar.a();
        byte[] c5 = C1948f.c(c1948f);
        if (c5 == null) {
            a5.h(1);
        } else {
            a5.d(1, c5);
        }
        if (str == null) {
            a5.h(2);
        } else {
            a5.i(str, 2);
        }
        workDatabase_Impl.c();
        try {
            a5.r();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a5);
        }
    }

    public void m(String str, long j5) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9170a;
        workDatabase_Impl.b();
        o2.e eVar = (o2.e) this.f9174e;
        Y1.f a5 = eVar.a();
        a5.f(1, j5);
        if (str == null) {
            a5.h(2);
        } else {
            a5.i(str, 2);
        }
        workDatabase_Impl.c();
        try {
            a5.r();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a5);
        }
    }

    public void n(int i, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f9170a;
        workDatabase_Impl.b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            sb.append("?");
            if (i5 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        SQLiteStatement compileStatement = ((SQLiteDatabase) workDatabase_Impl.f5153c.z().f6123l).compileStatement(sb2);
        compileStatement.bindLong(1, N4.b.Y(i));
        int i6 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i6);
            } else {
                compileStatement.bindString(i6, str);
            }
            i6++;
        }
        workDatabase_Impl.c();
        try {
            compileStatement.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public synchronized Xw o(Sq sq) {
        try {
            if (!((AtomicBoolean) this.f9176h).getAndSet(true)) {
                if (((List) sq.f11596b.f13761l).isEmpty()) {
                    ((Xw) this.f).g(new C0858co(C0947eo.a(sq), 3));
                } else {
                    this.i = sq;
                    this.f9175g = new Tn(sq, (C0769ao) this.f9173d, (Xw) this.f);
                    ((C0769ao) this.f9173d).e((List) sq.f11596b.f13761l);
                    Lq a5 = ((Tn) this.f9175g).a();
                    while (a5 != null) {
                        q(a5);
                        a5 = ((Tn) this.f9175g).a();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Xw) this.f;
    }

    public LinkedHashMap p(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap3.get(str);
            H7 h7 = (H7) ((HashMap) this.f9172c).get(str);
            if (h7 == null) {
                h7 = H7.f9333b;
            }
            linkedHashMap3.put(str, h7.a(str3, str2));
        }
        return linkedHashMap3;
    }

    public void q(Lq lq) {
        E3.a Z4;
        synchronized (this) {
            Iterator it = lq.f10489a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Z4 = AbstractC1400ot.Z(new C0856cm(3));
                    break;
                }
                InterfaceC1259ln a5 = ((InterfaceC0896dh) this.f9172c).a((String) it.next(), lq.f10491b);
                if (a5 != null && a5.a((Sq) this.i, lq)) {
                    Z4 = AbstractC1400ot.l0(a5.b((Sq) this.i, lq), lq.f10480R, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f9171b);
                    break;
                }
            }
        }
        ((C0769ao) this.f9173d).b((Sq) this.i, lq, Z4, (C0951es) this.f9174e);
        Z4.a(new Kw(0, Z4, new C1390oj(27, this, lq, false)), (Qw) this.f9170a);
    }

    public void r(LinkedHashMap linkedHashMap, J7 j7) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse((String) this.f9173d).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (j7 != null) {
            StringBuilder sb = new StringBuilder(uri);
            String str = j7.f9864k;
            if (!TextUtils.isEmpty(str)) {
                sb.append("&it=");
                sb.append(str);
            }
            String str2 = j7.f9865l;
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&blat=");
                sb.append(str2);
            }
            uri = sb.toString();
        }
        FileOutputStream fileOutputStream2 = null;
        if (!((AtomicBoolean) this.f9176h).get()) {
            T2.L l5 = P2.o.f4767B.f4771c;
            new T2.y((Context) this.f, (String) this.f9174e, uri, null).l();
            return;
        }
        File file = (File) this.i;
        try {
            if (file == null) {
                U2.j.i("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
                return;
            }
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e3) {
                e = e3;
            }
            try {
                fileOutputStream.write(uri.getBytes());
                fileOutputStream.write(10);
                try {
                    fileOutputStream.close();
                } catch (IOException e5) {
                    U2.j.j("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                }
            } catch (IOException e6) {
                e = e6;
                fileOutputStream2 = fileOutputStream;
                U2.j.j("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e7) {
                        U2.j.j("CsiReporter: Cannot close file: sdk_csi_data.txt.", e7);
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e8) {
                        U2.j.j("CsiReporter: Cannot close file: sdk_csi_data.txt.", e8);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public G7() {
        this.f9170a = new ArrayBlockingQueue(100);
        this.f9171b = new LinkedHashMap();
        this.f9172c = new HashMap();
        this.f9175g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    }

    public G7(Qw qw, ScheduledExecutorService scheduledExecutorService, InterfaceC0896dh interfaceC0896dh, C0769ao c0769ao, C0951es c0951es) {
        this.f = new Xw();
        this.f9176h = new AtomicBoolean();
        this.f9170a = qw;
        this.f9171b = scheduledExecutorService;
        this.f9172c = interfaceC0896dh;
        this.f9173d = c0769ao;
        this.f9174e = c0951es;
    }

    public G7(WorkDatabase_Impl workDatabase_Impl) {
        this.f9170a = workDatabase_Impl;
        this.f9171b = new o2.b(workDatabase_Impl, 5);
        this.f9172c = new o2.e(workDatabase_Impl, 3);
        this.f9173d = new o2.e(workDatabase_Impl, 4);
        this.f9174e = new o2.e(workDatabase_Impl, 5);
        this.f = new o2.e(workDatabase_Impl, 6);
        this.f9175g = new o2.e(workDatabase_Impl, 7);
        this.f9176h = new o2.e(workDatabase_Impl, 8);
        this.i = new o2.e(workDatabase_Impl, 9);
        new AtomicBoolean(false);
    }
}
