package com.tekartik.sqflite.operation;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class a implements d {
    @Override // com.tekartik.sqflite.operation.d
    public final void a(Object obj, String str) {
        e().a(obj, str);
    }

    public abstract Object b(String str);

    public abstract String c();

    public boolean d() {
        return Boolean.TRUE.equals(b("noResult"));
    }

    public abstract d e();

    public abstract boolean f();

    @Override // com.tekartik.sqflite.operation.d
    public final void success(Object obj) {
        e().success(obj);
    }

    @NonNull
    public final String toString() {
        return c() + " " + ((String) b("sql")) + " " + ((List) b("arguments"));
    }
}
