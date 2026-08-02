package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
final class aq extends com.google.android.play.integrity.internal.ar {

    /* renamed from: a, reason: collision with root package name */
    final transient int f3847a;
    final transient int b;
    final /* synthetic */ com.google.android.play.integrity.internal.ar c;

    aq(com.google.android.play.integrity.internal.ar arVar, int i, int i2) {
        this.c = arVar;
        this.f3847a = i;
        this.b = i2;
    }

    @Override // com.google.android.play.integrity.internal.ar
    /* renamed from: f */
    public final com.google.android.play.integrity.internal.ar subList(int i, int i2) {
        com.google.android.play.integrity.internal.al.c(i, i2, this.b);
        int i3 = this.f3847a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.play.integrity.internal.al.a(i, this.b, "index");
        return this.c.get(i + this.f3847a);
    }

    @Override // com.google.android.play.integrity.internal.ar, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // com.google.android.play.integrity.internal.ao
    @javax.annotation.CheckForNull
    final java.lang.Object[] e() {
        return this.c.e();
    }

    @Override // com.google.android.play.integrity.internal.ao
    final int c() {
        return this.c.c() + this.f3847a;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final int b() {
        return this.c.c() + this.f3847a + this.b;
    }
}
