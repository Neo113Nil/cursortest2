package A0;

import O4.InterfaceC0259e;
import O4.InterfaceC0262h;
import O4.InterfaceC0267m;
import P.AbstractC0329z;
import P.C0305m0;
import a.AbstractC0444a;
import a3.BinderC0468l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.util.Pair;
import android.webkit.WebView;
import androidx.profileinstaller.ProfileInstallReceiver;
import c3.AbstractC0539a;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractC0968f8;
import com.google.android.gms.internal.ads.B3;
import com.google.android.gms.internal.ads.C0634Ld;
import com.google.android.gms.internal.ads.C0709Wb;
import com.google.android.gms.internal.ads.C1616tl;
import com.google.android.gms.internal.ads.C3;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.InterfaceC1445pt;
import com.google.android.gms.internal.ads.Jw;
import com.google.android.gms.internal.ads.Zt;
import e2.InterfaceC1935p;
import f2.C1948f;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import k4.AbstractC2036a;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p4.C2268h;
import r3.AbstractC2349a;
import t2.C2415c;
import t2.C2421i;
import t3.AbstractC2425d;
import v.AbstractC2528x;

/* loaded from: classes.dex */
public final class J0 implements H3.q, InterfaceC0262h, InterfaceC0267m, InterfaceC1445pt, Q1.d, B3, U2.f, Jw, InterfaceC1935p {

    /* renamed from: k, reason: collision with root package name */
    public Object f304k;

    public /* synthetic */ J0(Object obj) {
        this.f304k = obj;
    }

    public static void j(Y1.b bVar) {
        bVar.l("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.l("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.l("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.l("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        bVar.l("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.l("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        bVar.l("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.l("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.l("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.l("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.l("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.l("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.l("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static void p(Context context, J2.h hVar, AbstractC0539a abstractC0539a) {
        F7.a(context);
        if (((Boolean) AbstractC0968f8.f13461j.s()).booleanValue()) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                U2.c.f5860b.execute(new S2.q(context, hVar, abstractC0539a, 4));
                return;
            }
        }
        new C0709Wb(0, context, hVar.f2711a).q(abstractC0539a);
    }

    public static E2.o t(z2.j jVar, E2.i iVar, C2.b bVar, C2.c cVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(iVar.f1437a.getResources(), cVar.f820a);
        v2.e eVar = v2.e.f20402k;
        Map map = cVar.f821b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z3 = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config config = H2.e.f2284a;
        if (jVar != null && jVar.f21976g) {
            z3 = true;
        }
        return new E2.o(bitmapDrawable, iVar, eVar, bVar, str, booleanValue, z3);
    }

    public static R1.i v(Y1.b bVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new T1.a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap.put("prerequisite_id", new T1.a(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new T1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new T1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new T1.d(false, "index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
        hashSet2.add(new T1.d(false, "index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
        T1.e eVar = new T1.e("Dependency", hashMap, hashSet, hashSet2);
        T1.e a5 = T1.e.a(bVar, "Dependency");
        if (!eVar.equals(a5)) {
            return new R1.i(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a5);
        }
        HashMap hashMap2 = new HashMap(25);
        hashMap2.put("id", new T1.a(1, 1, "id", "TEXT", null, true));
        hashMap2.put("state", new T1.a(0, 1, "state", "INTEGER", null, true));
        hashMap2.put("worker_class_name", new T1.a(0, 1, "worker_class_name", "TEXT", null, true));
        hashMap2.put("input_merger_class_name", new T1.a(0, 1, "input_merger_class_name", "TEXT", null, false));
        hashMap2.put("input", new T1.a(0, 1, "input", "BLOB", null, true));
        hashMap2.put("output", new T1.a(0, 1, "output", "BLOB", null, true));
        hashMap2.put("initial_delay", new T1.a(0, 1, "initial_delay", "INTEGER", null, true));
        hashMap2.put("interval_duration", new T1.a(0, 1, "interval_duration", "INTEGER", null, true));
        hashMap2.put("flex_duration", new T1.a(0, 1, "flex_duration", "INTEGER", null, true));
        hashMap2.put("run_attempt_count", new T1.a(0, 1, "run_attempt_count", "INTEGER", null, true));
        hashMap2.put("backoff_policy", new T1.a(0, 1, "backoff_policy", "INTEGER", null, true));
        hashMap2.put("backoff_delay_duration", new T1.a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        hashMap2.put("period_start_time", new T1.a(0, 1, "period_start_time", "INTEGER", null, true));
        hashMap2.put("minimum_retention_duration", new T1.a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        hashMap2.put("schedule_requested_at", new T1.a(0, 1, "schedule_requested_at", "INTEGER", null, true));
        hashMap2.put("run_in_foreground", new T1.a(0, 1, "run_in_foreground", "INTEGER", null, true));
        hashMap2.put("out_of_quota_policy", new T1.a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        hashMap2.put("required_network_type", new T1.a(0, 1, "required_network_type", "INTEGER", null, false));
        hashMap2.put("requires_charging", new T1.a(0, 1, "requires_charging", "INTEGER", null, true));
        hashMap2.put("requires_device_idle", new T1.a(0, 1, "requires_device_idle", "INTEGER", null, true));
        hashMap2.put("requires_battery_not_low", new T1.a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        hashMap2.put("requires_storage_not_low", new T1.a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        hashMap2.put("trigger_content_update_delay", new T1.a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        hashMap2.put("trigger_max_content_delay", new T1.a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        hashMap2.put("content_uri_triggers", new T1.a(0, 1, "content_uri_triggers", "BLOB", null, false));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new T1.d(false, "index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
        hashSet4.add(new T1.d(false, "index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
        T1.e eVar2 = new T1.e("WorkSpec", hashMap2, hashSet3, hashSet4);
        T1.e a6 = T1.e.a(bVar, "WorkSpec");
        if (!eVar2.equals(a6)) {
            return new R1.i(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a6);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new T1.a(1, 1, "tag", "TEXT", null, true));
        hashMap3.put("work_spec_id", new T1.a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new T1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new T1.d(false, "index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
        T1.e eVar3 = new T1.e("WorkTag", hashMap3, hashSet5, hashSet6);
        T1.e a7 = T1.e.a(bVar, "WorkTag");
        if (!eVar3.equals(a7)) {
            return new R1.i(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a7);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new T1.a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap4.put("system_id", new T1.a(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new T1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        T1.e eVar4 = new T1.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        T1.e a8 = T1.e.a(bVar, "SystemIdInfo");
        if (!eVar4.equals(a8)) {
            return new R1.i(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a8);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new T1.a(1, 1, "name", "TEXT", null, true));
        hashMap5.put("work_spec_id", new T1.a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new T1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new T1.d(false, "index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
        T1.e eVar5 = new T1.e("WorkName", hashMap5, hashSet8, hashSet9);
        T1.e a9 = T1.e.a(bVar, "WorkName");
        if (!eVar5.equals(a9)) {
            return new R1.i(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a9);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new T1.a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap6.put("progress", new T1.a(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new T1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        T1.e eVar6 = new T1.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        T1.e a10 = T1.e.a(bVar, "WorkProgress");
        if (!eVar6.equals(a10)) {
            return new R1.i(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a10);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new T1.a(1, 1, "key", "TEXT", null, true));
        hashMap7.put("long_value", new T1.a(0, 1, "long_value", "INTEGER", null, false));
        T1.e eVar7 = new T1.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        T1.e a11 = T1.e.a(bVar, "Preference");
        if (eVar7.equals(a11)) {
            return new R1.i(true, (String) null);
        }
        return new R1.i(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a11);
    }

    @Override // O4.InterfaceC0262h
    public void a(InterfaceC0259e interfaceC0259e, O4.S s2) {
        kotlin.jvm.internal.l.f("call", interfaceC0259e);
        boolean d5 = s2.f4188a.d();
        C2268h c2268h = (C2268h) this.f304k;
        if (d5) {
            c2268h.resumeWith(s2.f4189b);
        } else {
            c2268h.resumeWith(G4.l.p(new D2.e(s2)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1445pt
    public void b(int i, long j5) {
        ((P2.g) this.f304k).f4734r.h(i, System.currentTimeMillis() - j5);
    }

    @Override // Q1.d
    public void c(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f304k).setResultCode(i);
    }

    @Override // e2.InterfaceC1935p
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) N4.b.m(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f304k).createWebView(webView));
    }

    @Override // e2.InterfaceC1935p
    public String[] d() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f304k).getSupportedFeatures();
    }

    @Override // U2.f
    public void e(JsonWriter jsonWriter) {
        Object obj = U2.g.f5868b;
        jsonWriter.name("params").beginObject();
        byte[] bArr = (byte[]) this.f304k;
        int length = bArr.length;
        String encodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(encodeToString);
        } else {
            String n5 = U2.e.n(encodeToString, "MD5");
            if (n5 != null) {
                jsonWriter.name("bodydigest").value(n5);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1445pt
    public void f(int i, long j5, String str) {
        ((P2.g) this.f304k).f4734r.j(i, System.currentTimeMillis() - j5, null, null, str);
    }

    @Override // O4.InterfaceC0267m
    public Object g(Object obj) {
        Optional ofNullable;
        ofNullable = Optional.ofNullable(((InterfaceC0267m) this.f304k).g((y4.B) obj));
        return ofNullable;
    }

    @Override // e2.InterfaceC1935p
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) N4.b.m(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f304k).getStatics());
    }

    @Override // O4.InterfaceC0262h
    public void h(InterfaceC0259e interfaceC0259e, Throwable th) {
        kotlin.jvm.internal.l.f("call", interfaceC0259e);
        ((C2268h) this.f304k).resumeWith(G4.l.p(th));
    }

    @Override // Q1.d
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // H3.q
    public Object k() {
        Constructor constructor = (Constructor) this.f304k;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e3) {
            AbstractC2349a abstractC2349a = K3.c.f2892a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        } catch (InstantiationException e5) {
            throw new RuntimeException("Failed to invoke constructor '" + K3.c.b(constructor) + "' with no args", e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("Failed to invoke constructor '" + K3.c.b(constructor) + "' with no args", e6.getCause());
        }
    }

    public long l() {
        int i = i0.p.f17294h;
        long readLong = ((Parcel) this.f304k).readLong();
        long j5 = 63 & readLong;
        return j5 < 16 ? readLong : (readLong & (-64)) | (j5 + 1);
    }

    public long m() {
        Parcel parcel = (Parcel) this.f304k;
        byte readByte = parcel.readByte();
        long j5 = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        return W0.p.a(j5, 0L) ? W0.o.f6021c : AbstractC2036a.M(parcel.readFloat(), j5);
    }

    @Override // com.google.android.gms.internal.ads.B3
    public void n(C3 c32) {
        ((C0634Ld) this.f304k).c(c32);
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
        U2.j.d("Initialized webview successfully for SDKCore.");
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.n9)).booleanValue()) {
            BinderC0468l binderC0468l = (BinderC0468l) this.f304k;
            G4.d.R(binderC0468l.f6578v, "sgs", new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(binderC0468l.f6564N.get())));
            binderC0468l.f6563M.set(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        if (r7 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014c, code lost:
    
        if (r0 != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0153, code lost:
    
        if (r7 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0138, code lost:
    
        if (java.lang.Math.abs(r10 - r1) <= 1) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0144, code lost:
    
        if (java.lang.Math.abs(r2 - r5) <= r9) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a A[RETURN] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2.c q(E2.i iVar, C2.b bVar, F2.h hVar, F2.g gVar) {
        C2.c cVar;
        ?? r9;
        boolean equals;
        C2.c cVar2;
        if (iVar.f1448n.f1403k) {
            C2.d dVar = (C2.d) ((C2421i) this.f304k).f19566c.getValue();
            if (dVar != null) {
                cVar = dVar.f822a.p(bVar);
                if (cVar == null) {
                    C2.h hVar2 = dVar.f823b;
                    synchronized (hVar2) {
                        try {
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) hVar2.f834m).get(bVar);
                            cVar2 = null;
                            if (arrayList != null) {
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        break;
                                    }
                                    C2.g gVar2 = (C2.g) arrayList.get(i);
                                    Bitmap bitmap = (Bitmap) gVar2.f829b.get();
                                    C2.c cVar3 = bitmap != null ? new C2.c(bitmap, gVar2.f830c) : null;
                                    if (cVar3 != null) {
                                        cVar2 = cVar3;
                                        break;
                                    }
                                    i++;
                                }
                                int i5 = hVar2.f833l;
                                hVar2.f833l = i5 + 1;
                                if (i5 >= 10) {
                                    hVar2.g();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    cVar = cVar2;
                }
            } else {
                cVar = null;
            }
            if (cVar != null) {
                Bitmap bitmap2 = cVar.f820a;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (!AbstractC2425d.z(config) || iVar.f1445k) {
                    Object obj = cVar.f821b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    if (!kotlin.jvm.internal.l.a(hVar, F2.h.f1535c)) {
                        String str = (String) bVar.f819l.get("coil#transformation_size");
                        if (str != null) {
                            equals = str.equals(hVar.toString());
                            if (equals) {
                                return cVar;
                            }
                        } else {
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            AbstractC0444a abstractC0444a = hVar.f1536a;
                            int i6 = abstractC0444a instanceof F2.a ? ((F2.a) abstractC0444a).f : Integer.MAX_VALUE;
                            AbstractC0444a abstractC0444a2 = hVar.f1537b;
                            int i7 = abstractC0444a2 instanceof F2.a ? ((F2.a) abstractC0444a2).f : Integer.MAX_VALUE;
                            double c5 = AbstractC2528x.c(width, height, i6, i7, gVar);
                            boolean a5 = H2.d.a(iVar);
                            if (a5) {
                                double d5 = c5 > 1.0d ? 1.0d : c5;
                                if (Math.abs(i6 - (width * d5)) > 1.0d && Math.abs(i7 - (d5 * height)) > 1.0d) {
                                    r9 = 1;
                                }
                                r9 = 1;
                                equals = r9;
                                if (equals) {
                                }
                            } else {
                                if (i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
                                    r9 = 1;
                                } else {
                                    r9 = 1;
                                    r9 = 1;
                                }
                                if (i7 != Integer.MIN_VALUE && i7 != Integer.MAX_VALUE) {
                                    r9 = r9;
                                }
                                equals = r9;
                                if (equals) {
                                }
                            }
                            if (c5 != 1.0d) {
                            }
                            if (c5 > 1.0d) {
                            }
                            equals = r9;
                            if (equals) {
                            }
                        }
                    }
                }
                equals = false;
                if (equals) {
                }
            }
        }
        return null;
    }

    public P.d1 r() {
        v1.k a5 = v1.k.a();
        if (a5.c() == 1) {
            return new S0.l(true);
        }
        C0305m0 t5 = AbstractC0329z.t(Boolean.FALSE);
        a5.h(new S0.h(t5, this));
        return t5;
    }

    public C2.b s(E2.i iVar, Object obj, E2.m mVar, C2415c c2415c) {
        String str;
        Map linkedHashMap;
        iVar.getClass();
        List list = ((C2421i) this.f304k).f.f19540c;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                str = null;
                break;
            }
            W3.h hVar = (W3.h) list.get(i);
            A2.b bVar = (A2.b) hVar.f6036k;
            if (((Class) hVar.f6037l).isAssignableFrom(obj.getClass())) {
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>", bVar);
                str = bVar.a(obj, mVar);
                if (str != null) {
                    break;
                }
            }
            i++;
        }
        if (str == null) {
            return null;
        }
        Map map = iVar.f1458x.f1476k;
        boolean isEmpty = map.isEmpty();
        X3.w wVar = X3.w.f6091k;
        if (isEmpty) {
            linkedHashMap = wVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
        }
        iVar.f.getClass();
        return linkedHashMap.isEmpty() ? new C2.b(str, wVar) : new C2.b(str, X3.z.U(linkedHashMap));
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        P2.o.f4767B.f4774g.i("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
        BinderC0468l binderC0468l = (BinderC0468l) this.f304k;
        C1616tl c1616tl = binderC0468l.f6578v;
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        AtomicInteger atomicInteger = binderC0468l.f6564N;
        G4.d.R(c1616tl, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        U2.j.g("Failed to initialize webview for loading SDKCore. ", th);
        A7 a7 = F7.n9;
        Q2.r rVar = Q2.r.f5053d;
        if (!((Boolean) rVar.f5056c.a(a7)).booleanValue() || binderC0468l.f6563M.get() || atomicInteger.getAndIncrement() >= ((Integer) rVar.f5056c.a(F7.o9)).intValue()) {
            return;
        }
        binderC0468l.w3();
    }

    public void w(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = (HashMap) this.f304k;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    hashMap2.put(str, value);
                } else {
                    int i = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = C1948f.f16992b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i < zArr.length) {
                            boolArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = C1948f.f16992b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i < bArr.length) {
                            bArr2[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = C1948f.f16992b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i < iArr.length) {
                            numArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = C1948f.f16992b;
                        Long[] lArr = new Long[jArr.length];
                        while (i < jArr.length) {
                            lArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = C1948f.f16992b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i < fArr.length) {
                            fArr2[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                        hashMap2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = C1948f.f16992b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i < dArr.length) {
                            dArr2[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                        hashMap2.put(str, dArr2);
                    }
                }
            }
        }
    }

    public void x(Zt zt) {
        S2.r rVar = (S2.r) this.f304k;
        rVar.getClass();
        String str = zt.f12538b;
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.bb)).booleanValue()) {
                rVar.f5351l = str;
            }
        }
        int i = zt.f12537a;
        switch (i) {
            case 8152:
                rVar.c("onLMDOverlayOpened", new HashMap());
                break;
            case 8153:
                rVar.c("onLMDOverlayClicked", new HashMap());
                break;
            case 8155:
                rVar.c("onLMDOverlayClose", new HashMap());
                break;
            case 8157:
                rVar.f5351l = null;
                rVar.f5352m = null;
                rVar.f5350k = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(i));
                rVar.c("onLMDOverlayFailedToOpen", hashMap);
                break;
        }
    }

    public J0(int i) {
        switch (i) {
            case 9:
                this.f304k = Build.VERSION.SDK_INT >= 28 ? new j3.i(25) : new j3.i(26);
                break;
            case 27:
                this.f304k = new HashMap();
                break;
            case 28:
                this.f304k = G4.d.l(Looper.getMainLooper());
                break;
            default:
                this.f304k = new Region();
                break;
        }
    }
}
