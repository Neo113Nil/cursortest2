package com.google.android.play.integrity.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* loaded from: classes4.dex */
final class at extends ar {
    static final ar a = new at(new Object[0], 0);
    final transient Object[] b;

    public at(Object[] objArr, int i) {
        this.b = objArr;
    }

    @Override // com.google.android.play.integrity.internal.ar, com.google.android.play.integrity.internal.ao
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final int b() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final int c() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final Object[] e() {
        return this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        al.a(i, 0, FirebaseAnalytics.Param.INDEX);
        Object obj = this.b[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
