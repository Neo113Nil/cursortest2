package F0;

import A0.h;
import A0.k;
import A0.n;
import D0.e;
import H0.f;
import H0.g;
import H0.i;
import android.app.ActivityManager;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.startapp.sdk.ads.banner.BannerCreator;
import com.startapp.sdk.ads.banner.BannerRequest;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.screenshot.impl.C1033n;
import io.appmetrica.analytics.screenshot.impl.d0;
import io.appmetrica.analytics.screenshot.impl.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x0.C1249b;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements I0.b, FunctionWithThrowable, g, BannerRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f368c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f369d;

    public /* synthetic */ b(i iVar, Object obj, k kVar, int i3) {
        this.f366a = i3;
        this.f367b = iVar;
        this.f369d = obj;
        this.f368c = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c A[SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        int i3;
        D0.d dVar;
        D0.d dVar2;
        int i4 = 5;
        int i5 = 4;
        int i6 = 3;
        D0.d dVar3 = D0.d.CACHE_FULL;
        int i7 = 2;
        int i8 = 0;
        Object obj2 = this.f369d;
        Object obj3 = this.f368c;
        Object obj4 = this.f367b;
        int i9 = 1;
        switch (this.f366a) {
            case 1:
                return d0.a((g0) obj4, (d0) obj3, (C1033n) obj2, (ActivityManager) obj);
            case 2:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                i iVar = (i) obj4;
                long simpleQueryForLong = iVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                H0.a aVar = iVar.f501d;
                long j3 = aVar.f485a;
                A0.i iVar2 = (A0.i) obj2;
                String str = iVar2.f59a;
                if (simpleQueryForLong >= j3) {
                    iVar.e(1L, dVar3, str);
                    return -1L;
                }
                k kVar = (k) obj3;
                Long b3 = i.b(sQLiteDatabase, kVar);
                if (b3 != null) {
                    insert = b3.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", kVar.f69a);
                    contentValues.put("priority", Integer.valueOf(K0.a.a(kVar.f71c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = kVar.f70b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                n nVar = iVar2.f61c;
                byte[] bArr2 = nVar.f79b;
                int length = bArr2.length;
                int i10 = aVar.f489e;
                boolean z3 = length <= i10;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar2.f62d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar2.f63e));
                contentValues2.put("payload_encoding", nVar.f78a.f10539a);
                contentValues2.put("code", iVar2.f60b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z3));
                contentValues2.put("payload", z3 ? bArr2 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z3) {
                    int ceil = (int) Math.ceil(bArr2.length / i10);
                    for (int i11 = 1; i11 <= ceil; i11++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i11 - 1) * i10, Math.min(i11 * i10, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i11));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iVar2.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 3:
                Cursor cursor2 = (Cursor) obj;
                i iVar3 = (i) obj4;
                iVar3.getClass();
                while (cursor2.moveToNext()) {
                    long j4 = cursor2.getLong(0);
                    int i12 = cursor2.getInt(7) != 0 ? i9 : 0;
                    h hVar = new h();
                    hVar.f58g = new HashMap();
                    String string = cursor2.getString(i9);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    hVar.f54b = string;
                    hVar.f57e = Long.valueOf(cursor2.getLong(i7));
                    hVar.f = Long.valueOf(cursor2.getLong(3));
                    if (i12 != 0) {
                        String string2 = cursor2.getString(4);
                        hVar.f56d = new n(string2 == null ? i.f : new C1249b(string2), cursor2.getBlob(5));
                        i3 = i9;
                    } else {
                        String string3 = cursor2.getString(4);
                        C1249b c1249b = string3 == null ? i.f : new C1249b(string3);
                        Cursor query = iVar3.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j4)}, null, null, "sequence_num");
                        try {
                            Cursor cursor3 = query;
                            ArrayList arrayList = new ArrayList();
                            int i13 = 0;
                            while (cursor3.moveToNext()) {
                                byte[] blob = cursor3.getBlob(0);
                                arrayList.add(blob);
                                i13 += blob.length;
                                i9 = i9;
                            }
                            i3 = i9;
                            byte[] bArr3 = new byte[i13];
                            int i14 = 0;
                            int i15 = 0;
                            while (i14 < arrayList.size()) {
                                byte[] bArr4 = (byte[]) arrayList.get(i14);
                                cursor = query;
                                try {
                                    int i16 = i14;
                                    System.arraycopy(bArr4, 0, bArr3, i15, bArr4.length);
                                    i15 += bArr4.length;
                                    i14 = i16 + 1;
                                    query = cursor;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query.close();
                            hVar.f56d = new n(c1249b, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        hVar.f55c = Integer.valueOf(cursor2.getInt(6));
                    }
                    ((ArrayList) obj2).add(new H0.b(j4, (k) obj3, hVar.c()));
                    i9 = i3;
                    i7 = 2;
                }
                return null;
            default:
                Cursor cursor4 = (Cursor) obj;
                i iVar4 = (i) obj4;
                iVar4.getClass();
                while (true) {
                    HashMap hashMap = (HashMap) obj3;
                    if (cursor4.moveToNext()) {
                        String string4 = cursor4.getString(i8);
                        int i17 = cursor4.getInt(1);
                        D0.d dVar4 = D0.d.REASON_UNKNOWN;
                        if (i17 != 0) {
                            if (i17 == 1) {
                                dVar4 = D0.d.MESSAGE_TOO_OLD;
                            } else if (i17 == 2) {
                                dVar = dVar3;
                                dVar2 = dVar;
                                long j5 = cursor4.getLong(2);
                                if (hashMap.containsKey(string4)) {
                                    hashMap.put(string4, new ArrayList());
                                }
                                ((List) hashMap.get(string4)).add(new e(j5, dVar));
                                dVar3 = dVar2;
                                i4 = 5;
                                i5 = 4;
                                i6 = 3;
                                i8 = 0;
                            } else if (i17 == i6) {
                                dVar4 = D0.d.PAYLOAD_TOO_BIG;
                            } else if (i17 == i5) {
                                dVar4 = D0.d.MAX_RETRIES_REACHED;
                            } else if (i17 == i4) {
                                dVar4 = D0.d.INVALID_PAYLOD;
                            } else if (i17 == 6) {
                                dVar4 = D0.d.SERVER_ERROR;
                            } else {
                                X0.a.p("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i17));
                            }
                        }
                        dVar2 = dVar3;
                        dVar = dVar4;
                        long j52 = cursor4.getLong(2);
                        if (hashMap.containsKey(string4)) {
                        }
                        ((List) hashMap.get(string4)).add(new e(j52, dVar));
                        dVar3 = dVar2;
                        i4 = 5;
                        i5 = 4;
                        i6 = 3;
                        i8 = 0;
                    } else {
                        Iterator it = hashMap.entrySet().iterator();
                        while (true) {
                            D0.a aVar2 = (D0.a) obj2;
                            if (!it.hasNext()) {
                                aVar2.f261a = (D0.h) iVar4.c(new f(iVar4.f499b.c()));
                                aVar2.f263c = new D0.c(new D0.g(iVar4.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar4.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), H0.a.f.f485a));
                                aVar2.f264d = (String) iVar4.f502e.get();
                                return new D0.b((D0.h) aVar2.f261a, Collections.unmodifiableList((ArrayList) aVar2.f262b), (D0.c) aVar2.f263c, (String) aVar2.f264d);
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i18 = D0.f.f281c;
                            new ArrayList();
                            ((ArrayList) aVar2.f262b).add(new D0.f((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
        }
    }

    @Override // I0.b
    public Object execute() {
        c cVar = (c) this.f367b;
        i iVar = (i) cVar.f373d;
        iVar.getClass();
        k kVar = (k) this.f368c;
        A0.i iVar2 = (A0.i) this.f369d;
        String t3 = X0.a.t("SQLiteEventStore");
        if (Log.isLoggable(t3, 3)) {
            Log.d(t3, "Storing event with priority=" + kVar.f71c + ", name=" + iVar2.f59a + " for destination " + kVar.f69a);
        }
        ((Long) iVar.c(new b(iVar, (Object) iVar2, kVar, 2))).getClass();
        cVar.f370a.a(kVar, 1, false);
        return null;
    }

    @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
    public void onFinished(BannerCreator bannerCreator, String str) {
        ((BannerRequest) this.f367b).lambda$loadImpl$1((BannerRequest.Callback) this.f368c, (String) this.f369d, bannerCreator, str);
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i3) {
        this.f366a = i3;
        this.f367b = obj;
        this.f368c = obj2;
        this.f369d = obj3;
    }
}
