package com.tekartik.sqflite.operation;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes4.dex */
public final class c extends com.tekartik.sqflite.operation.a {
    public final a a;
    public final MethodCall b;

    public static class a implements d {
        public final MethodChannel.Result a;

        public a(MethodChannel.Result result) {
            this.a = result;
        }

        @Override // com.tekartik.sqflite.operation.d
        public final void a(Object obj, String str) {
            this.a.error("sqlite_error", str, obj);
        }

        @Override // com.tekartik.sqflite.operation.d
        public final void success(Object obj) {
            this.a.success(obj);
        }
    }

    public c(MethodCall methodCall, MethodChannel.Result result) {
        this.b = methodCall;
        this.a = new a(result);
    }

    @Override // com.tekartik.sqflite.operation.a
    public final <T> T b(String str) {
        return (T) this.b.argument(str);
    }

    @Override // com.tekartik.sqflite.operation.a
    public final String c() {
        return this.b.method;
    }

    @Override // com.tekartik.sqflite.operation.a
    public final d e() {
        return this.a;
    }

    @Override // com.tekartik.sqflite.operation.a
    public final boolean f() {
        return this.b.hasArgument("transactionId");
    }
}
