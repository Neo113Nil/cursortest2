package com.startapp.sdk.internal;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ze extends cf {

    /* renamed from: c, reason: collision with root package name */
    public ye f4803c;

    public ze(String str, HashMap hashMap) {
        super(str, hashMap);
    }

    @Override // com.startapp.sdk.internal.hf
    public final void a(Context context, ef efVar) {
        if (this.f4803c != null) {
            throw new IllegalStateException();
        }
        ye yeVar = new ye(this, efVar);
        this.f4803c = yeVar;
        context.registerReceiver(yeVar, new IntentFilter(this.f3553a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ze.class != obj.getClass()) {
            return false;
        }
        return si.a(this.f4803c, ((ze) obj).f4803c);
    }

    public final int hashCode() {
        Object[] objArr = {this.f4803c};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }

    @Override // com.startapp.sdk.internal.hf
    public final void a(Context context) {
        ye yeVar = this.f4803c;
        if (yeVar != null) {
            context.unregisterReceiver(yeVar);
            this.f4803c = null;
            return;
        }
        throw new IllegalStateException();
    }
}
