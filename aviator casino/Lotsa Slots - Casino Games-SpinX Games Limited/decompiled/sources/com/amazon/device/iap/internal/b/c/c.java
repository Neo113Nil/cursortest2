package com.amazon.device.iap.internal.b.c;

/* compiled from: GetItemDataCommandBase.java */
/* loaded from: classes2.dex */
abstract class c extends com.amazon.device.iap.internal.b.i {

    /* renamed from: a, reason: collision with root package name */
    protected final java.util.Set<java.lang.String> f3472a;

    c(com.amazon.device.iap.internal.b.e eVar, java.lang.String str, java.util.Set<java.lang.String> set) {
        super(eVar, "getItem_data", str);
        this.f3472a = set;
        a("skus", set);
    }
}
