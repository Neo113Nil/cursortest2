package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.zh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1013zh implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final C0459e5 f8686a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f8687b;

    /* renamed from: c, reason: collision with root package name */
    public C0849t7 f8688c;

    /* renamed from: d, reason: collision with root package name */
    public C0774q9 f8689d;

    /* renamed from: e, reason: collision with root package name */
    public final S6 f8690e;
    public List f;

    /* renamed from: g, reason: collision with root package name */
    public int f8691g;

    /* renamed from: h, reason: collision with root package name */
    public int f8692h;

    /* renamed from: i, reason: collision with root package name */
    public int f8693i;

    /* renamed from: j, reason: collision with root package name */
    public C0988yh f8694j;

    /* renamed from: k, reason: collision with root package name */
    public final C0535h3 f8695k;

    /* renamed from: l, reason: collision with root package name */
    public final PublicLogger f8696l;

    /* renamed from: m, reason: collision with root package name */
    public final zo f8697m;

    /* renamed from: n, reason: collision with root package name */
    public final Ya f8698n;

    /* renamed from: o, reason: collision with root package name */
    public final C0471eh f8699o;

    /* renamed from: p, reason: collision with root package name */
    public final FullUrlFormer f8700p;

    /* renamed from: q, reason: collision with root package name */
    public final Fb f8701q;

    /* renamed from: r, reason: collision with root package name */
    public final RequestDataHolder f8702r;

    /* renamed from: s, reason: collision with root package name */
    public final ResponseDataHolder f8703s;

    /* renamed from: t, reason: collision with root package name */
    public final SendingDataTaskHelper f8704t;

    /* renamed from: u, reason: collision with root package name */
    public int f8705u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8706v;

    public C1013zh(C0459e5 c0459e5, C0471eh c0471eh, Fb fb, FullUrlFormer<C0756ph> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this(c0459e5, c0471eh, fb, fullUrlFormer, requestDataHolder, responseDataHolder, c0459e5.i(), c0459e5.p(), c0459e5.u(), requestBodyEncrypter);
    }

    public final C0774q9 a(C0988yh c0988yh, List list, C0756ph c0756ph) {
        C0774q9 c0774q9 = new C0774q9();
        C0567i9 c0567i9 = new C0567i9();
        c0567i9.f7491a = WrapUtils.getOrDefaultIfEmpty(this.f8688c.f8334b, c0756ph.getUuid());
        c0567i9.f7492b = WrapUtils.getOrDefaultIfEmpty(this.f8688c.f8333a, c0756ph.getDeviceId());
        this.f8691g = CodedOutputByteBufferNano.computeMessageSize(4, c0567i9) + this.f8691g;
        c0774q9.f8137b = c0567i9;
        C0788qn C2 = C0878ua.f8414H.C();
        C0937wh c0937wh = new C0937wh(this, c0774q9);
        synchronized (C2) {
            C2.f8176a.a(c0937wh);
        }
        c0774q9.f8136a = (C0696n9[]) c0988yh.f8641a.toArray(new C0696n9[0]);
        c0774q9.f8138c = a(c0988yh.f8643c);
        c0774q9.f8140e = (String[]) list.toArray(new String[0]);
        Set set = c0756ph.f8090x;
        String[] strArr = (String[]) set.toArray(new String[0]);
        c0774q9.f = new byte[strArr.length][];
        for (int i3 = 0; i3 < set.size(); i3++) {
            c0774q9.f[i3] = StringUtils.getUTF8Bytes(strArr[i3]);
        }
        return c0774q9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f8686a.f7194b.f6823b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f8700p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f8702r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f8703s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0756ph) this.f8686a.f7202k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((El) C0878ua.f8414H.A()).getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreateTask() {
        Cursor cursor;
        int optInt;
        S6 s6 = this.f8686a.f7197e;
        s6.getClass();
        ArrayList arrayList = new ArrayList();
        s6.f6554a.lock();
        try {
            SQLiteDatabase readableDatabase = s6.f6556c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(B5.f5754b, null);
                while (cursor.moveToNext()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                        arrayList.add(contentValues);
                    } catch (Throwable unused) {
                        try {
                            arrayList = new ArrayList();
                            if (!arrayList.isEmpty()) {
                            }
                        } finally {
                            AbstractC0711no.a(cursor);
                            s6.f6554a.unlock();
                        }
                    }
                }
            } else {
                cursor = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        ContentValues contentValues2 = (ContentValues) arrayList.get(0);
        this.f8687b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.f8687b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C0849t7 c0849t7 = new C0849t7();
            this.f8688c = c0849t7;
            this.f8699o.f7256c = c0849t7;
        } else {
            try {
                C0849t7 c0849t72 = new C0849t7(new C0672mb(asString));
                this.f8688c = c0849t72;
                this.f8699o.f7256c = c0849t72;
            } catch (Throwable unused3) {
                C0849t7 c0849t73 = new C0849t7();
                this.f8688c = c0849t73;
                this.f8699o.f7256c = c0849t73;
            }
        }
        C0756ph config = this.f8701q.getConfig();
        List list = config.f8089w;
        if (AbstractC0711no.a((Collection) list)) {
            return false;
        }
        this.f8700p.setHosts(config.f8083q);
        if (!config.u() || AbstractC0711no.a((Collection) this.f8700p.getAllHosts())) {
            this.f8706v = true;
            return false;
        }
        this.f = null;
        C0988yh a3 = a(config);
        this.f8694j = a3;
        if (a3.f8641a.isEmpty()) {
            return false;
        }
        zo zoVar = this.f8697m;
        synchronized (zoVar) {
            optInt = zoVar.f8715a.a().optInt("report_request_id", -1);
        }
        int i3 = optInt + 1;
        this.f8705u = i3;
        this.f8699o.f7258e = i3;
        C0774q9 a4 = a(this.f8694j, list, config);
        this.f8689d = a4;
        this.f = this.f8694j.f8642b;
        this.f8704t.prepareAndSetPostData(MessageNano.toByteArray(a4));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f8704t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z3) {
        String a3;
        if (z3) {
            a(false);
        } else if (this.f8703s.getResponseCode() == 400) {
            a(true);
        }
        if (z3) {
            for (int i3 = 0; i3 < this.f8694j.f8641a.size(); i3++) {
                for (C0644l9 c0644l9 : ((C0696n9) this.f8694j.f8641a.get(i3)).f7932c) {
                    if (c0644l9 != null && (a3 = Vf.a(c0644l9)) != null) {
                        this.f8696l.info(a3, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f8704t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f8706v = true;
        this.f8686a.f7197e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f8706v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((C0795r5) this.f8686a.f7207p).f8199d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
        this.f8686a.f7197e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((C0795r5) this.f8686a.f7207p).f8199d.set(true);
        if (this.f8706v) {
            ((C0795r5) this.f8686a.f7207p).f();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public C1013zh(C0459e5 c0459e5, C0471eh c0471eh, Fb fb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, S6 s6, PublicLogger publicLogger, zo zoVar, RequestBodyEncrypter requestBodyEncrypter) {
        this(c0459e5, publicLogger, s6, c0471eh, zoVar, fb, new C0535h3(1024000, "event value in ReportTask", publicLogger), AbstractC0921w1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C1013zh(C0459e5 c0459e5, PublicLogger publicLogger, S6 s6, C0471eh c0471eh, zo zoVar, Fb fb, C0535h3 c0535h3, Vj vj, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f8687b = new LinkedHashMap();
        this.f8691g = 0;
        this.f8692h = 0;
        this.f8693i = -1;
        this.f8706v = false;
        this.f8704t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f8699o = c0471eh;
        this.f8686a = c0459e5;
        this.f8690e = s6;
        this.f8696l = publicLogger;
        this.f8695k = c0535h3;
        this.f8697m = zoVar;
        this.f8701q = fb;
        this.f8698n = vj;
        this.f8702r = requestDataHolder;
        this.f8703s = responseDataHolder;
        this.f8700p = fullUrlFormer;
    }

    public static C0489f9[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C0489f9[] c0489f9Arr = new C0489f9[length];
        Iterator<String> keys = jSONObject.keys();
        int i3 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                C0489f9 c0489f9 = new C0489f9();
                c0489f9.f7280a = next;
                c0489f9.f7281b = jSONObject.getString(next);
                c0489f9Arr[i3] = c0489f9;
            } catch (Throwable unused) {
            }
            i3++;
        }
        return c0489f9Arr;
    }

    public final void a(boolean z3) {
        boolean z4;
        zo zoVar = this.f8697m;
        int i3 = this.f8705u;
        synchronized (zoVar) {
            Ao ao = zoVar.f8715a;
            ao.a(ao.a().put("report_request_id", i3));
        }
        C0696n9[] c0696n9Arr = this.f8689d.f8136a;
        int i4 = 0;
        while (i4 < c0696n9Arr.length) {
            try {
                C0696n9 c0696n9 = c0696n9Arr[i4];
                long longValue = ((Long) this.f.get(i4)).longValue();
                EnumC0372al enumC0372al = (EnumC0372al) Uf.f6719b.get(c0696n9.f7931b.f7856c);
                if (enumC0372al == null) {
                    enumC0372al = EnumC0372al.FOREGROUND;
                }
                z4 = z3;
                try {
                    this.f8690e.a(longValue, enumC0372al.f7002a, c0696n9.f7932c.length, z4);
                    Uf.a(c0696n9);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z4 = z3;
            }
            i4++;
            z3 = z4;
        }
        S6 s6 = this.f8690e;
        long a3 = this.f8686a.f7201j.a();
        s6.f6555b.lock();
        try {
            if (D5.f5831a.booleanValue()) {
                s6.d();
            }
            SQLiteDatabase writableDatabase = s6.f6556c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", B5.f5755c, new String[]{String.valueOf(a3)});
            }
        } catch (Throwable unused3) {
        }
        s6.f6555b.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6 A[LOOP:1: B:60:0x00e0->B:62:0x00e6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0988yh a(C0756ph c0756ph) {
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor a3 = a();
            if (a3 != null) {
                JSONObject jSONObject2 = jSONObject;
                C0558i0 c0558i0 = null;
                while (a3.moveToNext() && this.f8692h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(a3, contentValues);
                        A7 model = new B7(null, 1, null).toModel(contentValues);
                        Long l3 = model.f5674a;
                        if (l3 != null) {
                            C1003z7 c1003z7 = model.f5677d;
                            C0748p9 a4 = Uf.a(c1003z7.f8660a, c1003z7.f8661b, c1003z7.f8662c);
                            String locale = c0756ph.getLocale();
                            EnumC0372al enumC0372al = model.f5675b;
                            C0670m9 c0670m9 = new C0670m9();
                            c0670m9.f7854a = a4;
                            c0670m9.f7855b = locale;
                            if (enumC0372al != null) {
                                Integer num = (Integer) Uf.f6718a.get(enumC0372al);
                                c0670m9.f7856c = num != null ? num.intValue() : 0;
                            }
                            int computeUInt64Size = this.f8691g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.f8691g = computeUInt64Size;
                            int computeMessageSize = computeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, c0670m9);
                            this.f8691g = computeMessageSize;
                            if (computeMessageSize >= 250880) {
                                break;
                            }
                            C0963xh a5 = a(l3.longValue(), c0670m9, c0756ph, arrayList3, arrayList.size());
                            if (a5 == null) {
                                continue;
                            } else {
                                if (c0558i0 == null) {
                                    c0558i0 = a5.f8617b;
                                } else if (!c0558i0.equals(a5.f8617b)) {
                                    break;
                                }
                                arrayList2.add(l3);
                                arrayList.add(a5.f8616a);
                                if (!TextUtils.isEmpty(a5.f8617b.f7467a)) {
                                    try {
                                        jSONObject2 = new JSONObject(a5.f8617b.f7467a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (a5.f8618c) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = a3;
                        jSONObject = jSONObject2;
                        try {
                            arrayList3.add(th);
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                            }
                            return new C0988yh(arrayList, arrayList2, jSONObject);
                        } finally {
                            AbstractC0711no.a(cursor);
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            AbstractC0711no.a(a3);
        } catch (Throwable th2) {
            th = th2;
        }
        it = arrayList3.iterator();
        while (it.hasNext()) {
            this.f8698n.reportError("protobuf_serialization_error", (Throwable) it.next());
        }
        return new C0988yh(arrayList, arrayList2, jSONObject);
    }

    public static C0558i0 a(ContentValues contentValues) {
        C0668m7 model = new C0694n7(null, 1, null).toModel(contentValues);
        return new C0558i0((String) WrapUtils.getOrDefault(model.f7847g.f7743g, ""), ((Long) WrapUtils.getOrDefault(model.f7847g.f7744h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:12:0x0026, B:13:0x002c, B:15:0x0033, B:17:0x0039, B:28:0x006c, B:30:0x0072, B:76:0x009b, B:34:0x00b5, B:36:0x00c4, B:41:0x00d0, B:42:0x00cf, B:43:0x00ca, B:44:0x00d6, B:47:0x00e8, B:58:0x00fa, B:59:0x00ef, B:82:0x00aa, B:52:0x0105, B:54:0x010b, B:90:0x0066), top: B:11:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0963xh a(long j3, C0670m9 c0670m9, C0756ph c0756ph, ArrayList arrayList, int i3) {
        Cursor cursor;
        boolean z3;
        C0644l9 c0644l9;
        int i4;
        C0489f9[] a3;
        S8 s8;
        C0386b9 c0386b9;
        C0696n9 c0696n9 = new C0696n9();
        c0696n9.f7930a = j3;
        c0696n9.f7931b = c0670m9;
        EnumC0372al enumC0372al = (EnumC0372al) Uf.f6719b.get(c0670m9.f7856c);
        if (enumC0372al == null) {
            enumC0372al = EnumC0372al.FOREGROUND;
        }
        C0963xh c0963xh = null;
        try {
            cursor = a(j3, enumC0372al);
            if (cursor != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C0558i0 c0558i0 = null;
                    while (cursor.moveToNext() && this.f8692h < 100) {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursor, contentValues);
                        try {
                            s8 = new S8(contentValues);
                            EnumC0569ib enumC0569ib = s8.f6573h;
                            if (enumC0569ib != null) {
                                c0386b9 = (C0386b9) Uf.f6721d.get(enumC0569ib);
                            } else {
                                Map map = Uf.f6718a;
                                c0386b9 = null;
                            }
                            if (c0386b9 == null) {
                                c0386b9 = C0386b9.f7032i;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            c0644l9 = c0386b9.a(s8, c0756ph);
                        } catch (Throwable th2) {
                            th = th2;
                            arrayList.add(th);
                            c0644l9 = null;
                            if (c0644l9 == null) {
                            }
                            arrayList2.add(c0644l9);
                            this.f8692h++;
                        }
                        if (c0644l9 == null) {
                            C0558i0 a4 = a(contentValues);
                            if (c0558i0 == null) {
                                if (this.f8693i < 0) {
                                    try {
                                        a3 = a(new JSONObject(a4.f7467a));
                                    } catch (Throwable unused) {
                                    }
                                    if (a3 != null) {
                                        i4 = 0;
                                        for (C0489f9 c0489f9 : a3) {
                                            try {
                                                i4 += CodedOutputByteBufferNano.computeMessageSize(7, c0489f9);
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                        this.f8693i = i4;
                                        this.f8691g += i4;
                                    }
                                    i4 = 0;
                                    this.f8693i = i4;
                                    this.f8691g += i4;
                                }
                                c0558i0 = a4;
                            } else if (!c0558i0.equals(a4)) {
                                z3 = true;
                                break;
                            }
                            C0535h3 c0535h3 = this.f8695k;
                            byte[] bArr = c0644l9.f7786e;
                            c0535h3.getClass();
                            byte[] a5 = c0535h3.a(bArr);
                            byte[] bArr2 = c0644l9.f7786e;
                            if (bArr2 != a5) {
                                c0644l9.f7789i = ((bArr2 == null ? 0 : bArr2.length) - (a5 == null ? 0 : a5.length)) + c0644l9.f7789i;
                                c0644l9.f7786e = a5;
                            }
                            this.f8691g += CodedOutputByteBufferNano.computeMessageSize(3, c0644l9);
                            if (arrayList2.isEmpty() && i3 == 0) {
                                if (this.f8691g >= 1048576) {
                                    break;
                                }
                            } else if (this.f8691g >= 250880) {
                                break;
                            }
                        }
                        arrayList2.add(c0644l9);
                        this.f8692h++;
                    }
                    z3 = false;
                    if (arrayList2.size() > 0) {
                        c0696n9.f7932c = (C0644l9[]) arrayList2.toArray(new C0644l9[arrayList2.size()]);
                        c0963xh = new C0963xh(c0696n9, c0558i0, z3);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        arrayList.add(th);
                        return c0963xh;
                    } finally {
                        AbstractC0711no.a(cursor);
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
        return c0963xh;
    }

    public final Cursor a() {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        S6 s6 = this.f8690e;
        LinkedHashMap linkedHashMap = this.f8687b;
        s6.f6554a.lock();
        try {
            readableDatabase = s6.f6556c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("sessions", null, S6.a(linkedHashMap), S6.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null);
            s6.f6554a.unlock();
            return cursor;
        }
        cursor = null;
        s6.f6554a.unlock();
        return cursor;
    }

    public final Cursor a(long j3, EnumC0372al enumC0372al) {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        S6 s6 = this.f8690e;
        s6.f6554a.lock();
        try {
            readableDatabase = s6.f6556c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j3), Integer.toString(enumC0372al.f7002a)}, null, null, "number_in_session ASC", null);
            s6.f6554a.unlock();
            return cursor;
        }
        cursor = null;
        s6.f6554a.unlock();
        return cursor;
    }
}
