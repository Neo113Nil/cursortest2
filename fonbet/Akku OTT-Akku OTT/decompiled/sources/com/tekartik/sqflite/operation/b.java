package com.tekartik.sqflite.operation;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b extends com.tekartik.sqflite.operation.a {
    public final Map<String, Object> a;
    public final a b = new a();
    public final boolean c;

    public class a implements d {
        public Object a;
        public String b;
        public String c;
        public Object d;

        @Override // com.tekartik.sqflite.operation.d
        public final void a(Object obj, String str) {
            this.b = "sqlite_error";
            this.c = str;
            this.d = obj;
        }

        @Override // com.tekartik.sqflite.operation.d
        public final void success(Object obj) {
            this.a = obj;
        }
    }

    public b(Map<String, Object> map, boolean z) {
        this.a = map;
        this.c = z;
    }

    @Override // com.tekartik.sqflite.operation.a
    public final <T> T b(String str) {
        return (T) this.a.get(str);
    }

    @Override // com.tekartik.sqflite.operation.a
    public final String c() {
        return (String) this.a.get("method");
    }

    @Override // com.tekartik.sqflite.operation.a
    public final boolean d() {
        return this.c;
    }

    @Override // com.tekartik.sqflite.operation.a
    public final d e() {
        return this.b;
    }

    @Override // com.tekartik.sqflite.operation.a
    public final boolean f() {
        return this.a.containsKey("transactionId");
    }

    public final void g(ArrayList arrayList) {
        if (this.c) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        a aVar = this.b;
        hashMap2.put("code", aVar.b);
        hashMap2.put(Constants.MESSAGE, aVar.c);
        hashMap2.put("data", aVar.d);
        hashMap.put(com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, hashMap2);
        arrayList.add(hashMap);
    }

    public final void h(ArrayList arrayList) {
        if (this.c) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.b.a);
        arrayList.add(hashMap);
    }
}
