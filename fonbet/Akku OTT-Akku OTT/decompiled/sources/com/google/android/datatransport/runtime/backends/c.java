package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class c extends h {
    public final Context a;
    public final com.google.android.datatransport.runtime.time.a b;
    public final com.google.android.datatransport.runtime.time.a c;
    public final String d;

    public c(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public final Context a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    @NonNull
    public final String b() {
        return this.d;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public final com.google.android.datatransport.runtime.time.a c() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public final com.google.android.datatransport.runtime.time.a d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.equals(hVar.a()) && this.b.equals(hVar.d()) && this.c.equals(hVar.c()) && this.d.equals(hVar.b());
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return androidx.concurrent.futures.a.a(sb, this.d, "}");
    }
}
