package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.uh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748uh implements io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.X4 f6907a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f6908b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0505l7 f6909c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0455j9 f6910d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.L6 f6911e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f6912f;

    /* renamed from: g, reason: collision with root package name */
    public int f6913g;

    /* renamed from: h, reason: collision with root package name */
    public int f6914h;

    /* renamed from: i, reason: collision with root package name */
    public int f6915i;

    /* renamed from: j, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0722th f6916j;

    /* renamed from: k, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Z2 f6917k;

    /* renamed from: l, reason: collision with root package name */
    public final io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger f6918l;

    /* renamed from: m, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0833xo f6919m;

    /* renamed from: n, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ra f6920n;

    /* renamed from: o, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Zg f6921o;

    /* renamed from: p, reason: collision with root package name */
    public final io.appmetrica.analytics.networktasks.internal.FullUrlFormer f6922p;

    /* renamed from: q, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0846yb f6923q;

    /* renamed from: r, reason: collision with root package name */
    public final io.appmetrica.analytics.networktasks.internal.RequestDataHolder f6924r;

    /* renamed from: s, reason: collision with root package name */
    public final io.appmetrica.analytics.networktasks.internal.ResponseDataHolder f6925s;
    public final io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper t;

    /* renamed from: u, reason: collision with root package name */
    public int f6926u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6927v;

    public C0748uh(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.Zg zg, io.appmetrica.analytics.impl.C0846yb c0846yb, io.appmetrica.analytics.networktasks.internal.FullUrlFormer<io.appmetrica.analytics.impl.C0489kh> fullUrlFormer, io.appmetrica.analytics.networktasks.internal.RequestDataHolder requestDataHolder, io.appmetrica.analytics.networktasks.internal.ResponseDataHolder responseDataHolder, io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter requestBodyEncrypter) {
        this(x4, zg, c0846yb, fullUrlFormer, requestDataHolder, responseDataHolder, x4.i(), x4.p(), x4.u(), requestBodyEncrypter);
    }

    public final io.appmetrica.analytics.impl.C0455j9 a(io.appmetrica.analytics.impl.C0722th c0722th, java.util.List list, io.appmetrica.analytics.impl.C0489kh c0489kh) {
        io.appmetrica.analytics.impl.C0455j9 c0455j9 = new io.appmetrica.analytics.impl.C0455j9();
        io.appmetrica.analytics.impl.C0249b9 c0249b9 = new io.appmetrica.analytics.impl.C0249b9();
        c0249b9.f5524a = io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultIfEmpty(this.f6909c.f6334b, c0489kh.getUuid());
        c0249b9.f5525b = io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultIfEmpty(this.f6909c.f6333a, c0489kh.getDeviceId());
        this.f6913g = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(4, c0249b9) + this.f6913g;
        c0455j9.f6171b = c0249b9;
        io.appmetrica.analytics.impl.C0599on C2 = io.appmetrica.analytics.impl.C0560na.f6484I.C();
        io.appmetrica.analytics.impl.C0670rh c0670rh = new io.appmetrica.analytics.impl.C0670rh(this, c0455j9);
        synchronized (C2) {
            C2.f6605a.a(c0670rh);
        }
        c0455j9.f6170a = (io.appmetrica.analytics.impl.C0378g9[]) c0722th.f6859a.toArray(new io.appmetrica.analytics.impl.C0378g9[0]);
        c0455j9.f6172c = a(c0722th.f6861c);
        c0455j9.f6174e = (java.lang.String[]) list.toArray(new java.lang.String[0]);
        java.util.Set set = c0489kh.f6303x;
        java.lang.String[] strArr = (java.lang.String[]) set.toArray(new java.lang.String[0]);
        c0455j9.f6175f = new byte[strArr.length][];
        for (int i2 = 0; i2 < set.size(); i2++) {
            c0455j9.f6175f[i2] = io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes(strArr[i2]);
        }
        return c0455j9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final java.lang.String description() {
        return "ReportTask_" + io.appmetrica.analytics.coreutils.internal.ApiKeyUtils.createPartialApiKey(this.f6907a.f5256b.f4860b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final io.appmetrica.analytics.networktasks.internal.FullUrlFormer<?> getFullUrlFormer() {
        return this.f6922p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final io.appmetrica.analytics.networktasks.internal.RequestDataHolder getRequestDataHolder() {
        return this.f6924r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final io.appmetrica.analytics.networktasks.internal.ResponseDataHolder getResponseDataHolder() {
        return this.f6925s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig getRetryPolicyConfig() {
        return ((io.appmetrica.analytics.impl.C0489kh) this.f6907a.f5265k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final javax.net.ssl.SSLSocketFactory getSslSocketFactory() {
        ((io.appmetrica.analytics.impl.Al) io.appmetrica.analytics.impl.C0560na.f6484I.z()).getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreateTask() {
        android.database.Cursor cursor;
        int optInt;
        io.appmetrica.analytics.impl.L6 l6 = this.f6907a.f5259e;
        l6.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        l6.f4582a.lock();
        try {
            android.database.sqlite.SQLiteDatabase readableDatabase = l6.f4584c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(io.appmetrica.analytics.impl.AbstractC0736u5.f6879b, null);
                while (cursor.moveToNext()) {
                    try {
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        android.database.DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                        arrayList.add(contentValues);
                    } catch (java.lang.Throwable unused) {
                        try {
                            arrayList = new java.util.ArrayList();
                            if (!arrayList.isEmpty()) {
                            }
                        } finally {
                            io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
                            l6.f4582a.unlock();
                        }
                    }
                }
            } else {
                cursor = null;
            }
        } catch (java.lang.Throwable unused2) {
            cursor = null;
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        android.content.ContentValues contentValues2 = (android.content.ContentValues) arrayList.get(0);
        this.f6908b.clear();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : contentValues2.valueSet()) {
            this.f6908b.put(entry.getKey(), entry.getValue().toString());
        }
        java.lang.String asString = contentValues2.getAsString("report_request_parameters");
        if (android.text.TextUtils.isEmpty(asString)) {
            io.appmetrica.analytics.impl.C0505l7 c0505l7 = new io.appmetrica.analytics.impl.C0505l7();
            this.f6909c = c0505l7;
            this.f6921o.f5430c = c0505l7;
        } else {
            try {
                io.appmetrica.analytics.impl.C0505l7 c0505l72 = new io.appmetrica.analytics.impl.C0505l7(new io.appmetrica.analytics.impl.C0354fb(asString));
                this.f6909c = c0505l72;
                this.f6921o.f5430c = c0505l72;
            } catch (java.lang.Throwable unused3) {
                io.appmetrica.analytics.impl.C0505l7 c0505l73 = new io.appmetrica.analytics.impl.C0505l7();
                this.f6909c = c0505l73;
                this.f6921o.f5430c = c0505l73;
            }
        }
        io.appmetrica.analytics.impl.C0489kh config = this.f6923q.getConfig();
        java.util.List list = config.f6302w;
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) list)) {
            return false;
        }
        this.f6922p.setHosts(config.f6297q);
        if (!config.u() || io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) this.f6922p.getAllHosts())) {
            this.f6927v = true;
            return false;
        }
        this.f6912f = null;
        io.appmetrica.analytics.impl.C0722th a2 = a(config);
        this.f6916j = a2;
        if (a2.f6859a.isEmpty()) {
            return false;
        }
        io.appmetrica.analytics.impl.C0833xo c0833xo = this.f6919m;
        synchronized (c0833xo) {
            optInt = c0833xo.f7123a.a().optInt("report_request_id", -1);
        }
        int i2 = optInt + 1;
        this.f6926u = i2;
        this.f6921o.f5432e = i2;
        io.appmetrica.analytics.impl.C0455j9 a3 = a(this.f6916j, list, config);
        this.f6910d = a3;
        this.f6912f = this.f6916j.f6860b;
        this.t.prepareAndSetPostData(io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(a3));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z2) {
        java.lang.String a2;
        if (z2) {
            a(false);
        } else if (this.f6925s.getResponseCode() == 400) {
            a(true);
        }
        if (z2) {
            for (int i2 = 0; i2 < this.f6916j.f6859a.size(); i2++) {
                for (io.appmetrica.analytics.impl.C0326e9 c0326e9 : ((io.appmetrica.analytics.impl.C0378g9) this.f6916j.f6859a.get(i2)).f5983c) {
                    if (c0326e9 != null && (a2 = io.appmetrica.analytics.impl.Qf.a(c0326e9)) != null) {
                        this.f6918l.info(a2, new java.lang.Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(java.lang.Throwable th) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f6927v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f6927v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((io.appmetrica.analytics.impl.C0477k5) this.f6907a.f5270p).f6258d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((io.appmetrica.analytics.impl.C0477k5) this.f6907a.f5270p).f6258d.set(true);
        if (this.f6927v) {
            ((io.appmetrica.analytics.impl.C0477k5) this.f6907a.f5270p).f();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public C0748uh(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.Zg zg, io.appmetrica.analytics.impl.C0846yb c0846yb, io.appmetrica.analytics.networktasks.internal.FullUrlFormer fullUrlFormer, io.appmetrica.analytics.networktasks.internal.RequestDataHolder requestDataHolder, io.appmetrica.analytics.networktasks.internal.ResponseDataHolder responseDataHolder, io.appmetrica.analytics.impl.L6 l6, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger, io.appmetrica.analytics.impl.C0833xo c0833xo, io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter requestBodyEncrypter) {
        this(x4, publicLogger, l6, zg, c0833xo, c0846yb, new io.appmetrica.analytics.impl.Z2(1024000, "event value in ReportTask", publicLogger), io.appmetrica.analytics.impl.AbstractC0810x1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C0748uh(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger, io.appmetrica.analytics.impl.L6 l6, io.appmetrica.analytics.impl.Zg zg, io.appmetrica.analytics.impl.C0833xo c0833xo, io.appmetrica.analytics.impl.C0846yb c0846yb, io.appmetrica.analytics.impl.Z2 z2, io.appmetrica.analytics.impl.Qj qj, io.appmetrica.analytics.networktasks.internal.FullUrlFormer fullUrlFormer, io.appmetrica.analytics.networktasks.internal.RequestDataHolder requestDataHolder, io.appmetrica.analytics.networktasks.internal.ResponseDataHolder responseDataHolder, io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter requestBodyEncrypter) {
        this.f6908b = new java.util.LinkedHashMap();
        this.f6913g = 0;
        this.f6914h = 0;
        this.f6915i = -1;
        this.f6927v = false;
        this.t = new io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper(requestBodyEncrypter, new io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor(), requestDataHolder, responseDataHolder, new io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler());
        this.f6921o = zg;
        this.f6907a = x4;
        this.f6911e = l6;
        this.f6918l = publicLogger;
        this.f6917k = z2;
        this.f6919m = c0833xo;
        this.f6923q = c0846yb;
        this.f6920n = qj;
        this.f6924r = requestDataHolder;
        this.f6925s = responseDataHolder;
        this.f6922p = fullUrlFormer;
    }

    public static io.appmetrica.analytics.impl.Y8[] a(org.json.JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        io.appmetrica.analytics.impl.Y8[] y8Arr = new io.appmetrica.analytics.impl.Y8[length];
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        int i2 = 0;
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            try {
                io.appmetrica.analytics.impl.Y8 y8 = new io.appmetrica.analytics.impl.Y8();
                y8.f5331a = next;
                y8.f5332b = jSONObject.getString(next);
                y8Arr[i2] = y8;
            } catch (java.lang.Throwable unused) {
            }
            i2++;
        }
        return y8Arr;
    }

    public final void a(boolean z2) {
        io.appmetrica.analytics.impl.C0833xo c0833xo = this.f6919m;
        int i2 = this.f6926u;
        synchronized (c0833xo) {
            io.appmetrica.analytics.impl.C0859yo c0859yo = c0833xo.f7123a;
            c0859yo.a(c0859yo.a().put("report_request_id", i2));
        }
        io.appmetrica.analytics.impl.C0378g9[] c0378g9Arr = this.f6910d.f6170a;
        for (int i3 = 0; i3 < c0378g9Arr.length; i3++) {
            try {
                io.appmetrica.analytics.impl.C0378g9 c0378g9 = c0378g9Arr[i3];
                long longValue = ((java.lang.Long) this.f6912f.get(i3)).longValue();
                io.appmetrica.analytics.impl.Vk vk = (io.appmetrica.analytics.impl.Vk) io.appmetrica.analytics.impl.Pf.f4839b.get(c0378g9.f5982b.f5883c);
                if (vk == null) {
                    vk = io.appmetrica.analytics.impl.Vk.FOREGROUND;
                }
                this.f6911e.a(longValue, vk.f5177a, c0378g9.f5983c.length, z2);
                io.appmetrica.analytics.impl.Pf.a(c0378g9);
            } catch (java.lang.Throwable unused) {
            }
        }
        io.appmetrica.analytics.impl.L6 l6 = this.f6911e;
        long a2 = this.f6907a.f5264j.a();
        l6.f4583b.lock();
        try {
            if (io.appmetrica.analytics.impl.AbstractC0788w5.f7000a.booleanValue()) {
                l6.c();
            }
            android.database.sqlite.SQLiteDatabase writableDatabase = l6.f4584c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", io.appmetrica.analytics.impl.AbstractC0736u5.f6880c, new java.lang.String[]{java.lang.String.valueOf(a2)});
            }
        } catch (java.lang.Throwable unused2) {
        }
        l6.f4583b.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea A[LOOP:1: B:60:0x00e4->B:62:0x00ea, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.appmetrica.analytics.impl.C0722th a(io.appmetrica.analytics.impl.C0489kh c0489kh) {
        java.util.Iterator it;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        android.database.Cursor cursor = null;
        try {
            android.database.Cursor a2 = a();
            if (a2 != null) {
                org.json.JSONObject jSONObject2 = jSONObject;
                io.appmetrica.analytics.impl.C0421i0 c0421i0 = null;
                while (a2.moveToNext() && this.f6914h < 100) {
                    try {
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        io.appmetrica.analytics.coreutils.internal.db.DBUtils.cursorRowToContentValues(a2, contentValues);
                        io.appmetrica.analytics.impl.C0686s7 model = new io.appmetrica.analytics.impl.C0712t7(null, 1, null).toModel(contentValues);
                        java.lang.Long l2 = model.f6792a;
                        if (l2 != null) {
                            io.appmetrica.analytics.impl.C0660r7 c0660r7 = model.f6795d;
                            io.appmetrica.analytics.impl.C0430i9 a3 = io.appmetrica.analytics.impl.Pf.a(c0660r7.f6721a, c0660r7.f6722b, c0660r7.f6723c);
                            java.lang.String locale = c0489kh.getLocale();
                            io.appmetrica.analytics.impl.Vk vk = model.f6793b;
                            io.appmetrica.analytics.impl.C0352f9 c0352f9 = new io.appmetrica.analytics.impl.C0352f9();
                            c0352f9.f5881a = a3;
                            c0352f9.f5882b = locale;
                            if (vk != null) {
                                java.lang.Integer num = (java.lang.Integer) io.appmetrica.analytics.impl.Pf.f4838a.get(vk);
                                c0352f9.f5883c = num != null ? num.intValue() : 0;
                            }
                            int computeUInt64Size = this.f6913g + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.f6913g = computeUInt64Size;
                            int computeMessageSize = computeUInt64Size + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, c0352f9);
                            this.f6913g = computeMessageSize;
                            if (computeMessageSize >= 250880) {
                                break;
                            }
                            io.appmetrica.analytics.impl.C0696sh a4 = a(l2.longValue(), c0352f9, c0489kh, arrayList3, arrayList.size());
                            if (a4 == null) {
                                continue;
                            } else {
                                if (c0421i0 == null) {
                                    c0421i0 = a4.f6821b;
                                } else if (!c0421i0.equals(a4.f6821b)) {
                                    break;
                                }
                                arrayList2.add(l2);
                                arrayList.add(a4.f6820a);
                                if (!android.text.TextUtils.isEmpty(a4.f6821b.f6067a)) {
                                    try {
                                        jSONObject2 = new org.json.JSONObject(a4.f6821b.f6067a);
                                    } catch (java.lang.Throwable unused) {
                                    }
                                }
                                if (a4.f6822c) {
                                    break;
                                }
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        cursor = a2;
                        jSONObject = jSONObject2;
                        try {
                            arrayList3.add(th);
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                            }
                            return new io.appmetrica.analytics.impl.C0722th(arrayList, arrayList2, jSONObject);
                        } finally {
                            io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            io.appmetrica.analytics.impl.AbstractC0522lo.a(a2);
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        it = arrayList3.iterator();
        while (it.hasNext()) {
            this.f6920n.reportError("protobuf_serialization_error", (java.lang.Throwable) it.next());
        }
        return new io.appmetrica.analytics.impl.C0722th(arrayList, arrayList2, jSONObject);
    }

    public static io.appmetrica.analytics.impl.C0421i0 a(android.content.ContentValues contentValues) {
        io.appmetrica.analytics.impl.C0324e7 model = new io.appmetrica.analytics.impl.C0350f7(null, 1, null).toModel(contentValues);
        return new io.appmetrica.analytics.impl.C0421i0((java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(model.f5783g.f5703g, ""), ((java.lang.Long) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(model.f5783g.f5704h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x009b, TryCatch #4 {all -> 0x009b, blocks: (B:12:0x0026, B:13:0x002c, B:15:0x0033, B:17:0x0039, B:28:0x006c, B:30:0x0072, B:70:0x0093, B:33:0x00a7, B:35:0x00b6, B:40:0x00c2, B:41:0x00c1, B:42:0x00bc, B:43:0x00c8, B:46:0x00da, B:58:0x00e1, B:74:0x00a0, B:51:0x00f4, B:53:0x00fa, B:57:0x00ea, B:81:0x0066), top: B:11:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.appmetrica.analytics.impl.C0696sh a(long j2, io.appmetrica.analytics.impl.C0352f9 c0352f9, io.appmetrica.analytics.impl.C0489kh c0489kh, java.util.ArrayList arrayList, int i2) {
        android.database.Cursor cursor;
        io.appmetrica.analytics.impl.C0696sh c0696sh;
        io.appmetrica.analytics.impl.C0326e9 c0326e9;
        int i3;
        io.appmetrica.analytics.impl.Y8[] a2;
        io.appmetrica.analytics.impl.N8 n8;
        io.appmetrica.analytics.impl.U8 u8;
        boolean z2 = true;
        io.appmetrica.analytics.impl.C0378g9 c0378g9 = new io.appmetrica.analytics.impl.C0378g9();
        c0378g9.f5981a = j2;
        c0378g9.f5982b = c0352f9;
        io.appmetrica.analytics.impl.Vk vk = (io.appmetrica.analytics.impl.Vk) io.appmetrica.analytics.impl.Pf.f4839b.get(c0352f9.f5883c);
        if (vk == null) {
            vk = io.appmetrica.analytics.impl.Vk.FOREGROUND;
        }
        try {
            cursor = a(j2, vk);
            if (cursor != null) {
                try {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    io.appmetrica.analytics.impl.C0421i0 c0421i0 = null;
                    while (cursor.moveToNext() && this.f6914h < 100) {
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        io.appmetrica.analytics.coreutils.internal.db.DBUtils.cursorRowToContentValues(cursor, contentValues);
                        try {
                            n8 = new io.appmetrica.analytics.impl.N8(contentValues);
                            io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = n8.f4718h;
                            if (enumC0251bb != null) {
                                u8 = (io.appmetrica.analytics.impl.U8) io.appmetrica.analytics.impl.Pf.f4841d.get(enumC0251bb);
                            } else {
                                java.util.Map map = io.appmetrica.analytics.impl.Pf.f4838a;
                                u8 = null;
                            }
                            if (u8 == null) {
                                u8 = io.appmetrica.analytics.impl.U8.f5060i;
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                        }
                        try {
                            c0326e9 = u8.a(n8, c0489kh);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            arrayList.add(th);
                            c0326e9 = null;
                            if (c0326e9 == null) {
                            }
                            arrayList2.add(c0326e9);
                            this.f6914h++;
                        }
                        if (c0326e9 == null) {
                            io.appmetrica.analytics.impl.C0421i0 a3 = a(contentValues);
                            if (c0421i0 == null) {
                                if (this.f6915i < 0) {
                                    try {
                                        a2 = a(new org.json.JSONObject(a3.f6067a));
                                    } catch (java.lang.Throwable unused) {
                                    }
                                    if (a2 != null) {
                                        i3 = 0;
                                        for (io.appmetrica.analytics.impl.Y8 y8 : a2) {
                                            i3 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(7, y8);
                                        }
                                        this.f6915i = i3;
                                        this.f6913g += i3;
                                    }
                                    i3 = 0;
                                    this.f6915i = i3;
                                    this.f6913g += i3;
                                }
                                c0421i0 = a3;
                            } else if (!c0421i0.equals(a3)) {
                                break;
                            }
                            io.appmetrica.analytics.impl.Z2 z22 = this.f6917k;
                            byte[] bArr = c0326e9.f5818e;
                            z22.getClass();
                            byte[] a4 = z22.a(bArr);
                            byte[] bArr2 = c0326e9.f5818e;
                            if (bArr2 != a4) {
                                c0326e9.f5822i = ((bArr2 == null ? 0 : bArr2.length) - (a4 == null ? 0 : a4.length)) + c0326e9.f5822i;
                                c0326e9.f5818e = a4;
                            }
                            this.f6913g += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, c0326e9);
                            if (arrayList2.isEmpty() && i2 == 0) {
                                if (this.f6913g >= 1048576) {
                                    break;
                                }
                            } else if (this.f6913g >= 250880) {
                                break;
                            }
                        }
                        arrayList2.add(c0326e9);
                        this.f6914h++;
                    }
                    z2 = false;
                    if (arrayList2.size() > 0) {
                        c0378g9.f5983c = (io.appmetrica.analytics.impl.C0326e9[]) arrayList2.toArray(new io.appmetrica.analytics.impl.C0326e9[arrayList2.size()]);
                        c0696sh = new io.appmetrica.analytics.impl.C0696sh(c0378g9, c0421i0, z2);
                        return c0696sh;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    try {
                        arrayList.add(th);
                        io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
                        return null;
                    } finally {
                        io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
                    }
                }
            }
            c0696sh = null;
            return c0696sh;
        } catch (java.lang.Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    public final android.database.Cursor a() {
        android.database.Cursor cursor;
        android.database.sqlite.SQLiteDatabase readableDatabase;
        io.appmetrica.analytics.impl.L6 l6 = this.f6911e;
        java.util.LinkedHashMap linkedHashMap = this.f6908b;
        l6.f4582a.lock();
        try {
            readableDatabase = l6.f4584c.getReadableDatabase();
        } catch (java.lang.Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("sessions", null, io.appmetrica.analytics.impl.L6.a(linkedHashMap), io.appmetrica.analytics.impl.L6.a(new java.lang.String[]{java.lang.Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null);
            l6.f4582a.unlock();
            return cursor;
        }
        cursor = null;
        l6.f4582a.unlock();
        return cursor;
    }

    public final android.database.Cursor a(long j2, io.appmetrica.analytics.impl.Vk vk) {
        android.database.Cursor cursor;
        android.database.sqlite.SQLiteDatabase readableDatabase;
        io.appmetrica.analytics.impl.L6 l6 = this.f6911e;
        l6.f4582a.lock();
        try {
            readableDatabase = l6.f4584c.getReadableDatabase();
        } catch (java.lang.Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new java.lang.String[]{java.lang.Long.toString(j2), java.lang.Integer.toString(vk.f5177a)}, null, null, "number_in_session ASC", null);
            l6.f4582a.unlock();
            return cursor;
        }
        cursor = null;
        l6.f4582a.unlock();
        return cursor;
    }
}
