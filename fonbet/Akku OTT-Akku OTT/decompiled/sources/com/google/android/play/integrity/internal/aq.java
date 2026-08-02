package com.google.android.play.integrity.internal;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes4.dex */
final class aq extends ar {
    final transient int a;
    final transient int b;
    final /* synthetic */ ar c;

    public aq(ar arVar, int i, int i2) {
        this.c = arVar;
        this.a = i;
        this.b = i2;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final int b() {
        return this.c.c() + this.a + this.b;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final int c() {
        return this.c.c() + this.a;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final Object[] e() {
        return this.c.e();
    }

    @Override // com.google.android.play.integrity.internal.ar, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ar subList(int i, int i2) {
        al.c(i, i2, this.b);
        int i3 = this.a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        al.a(i, this.b, FirebaseAnalytics.Param.INDEX);
        return this.c.get(i + this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }
}
