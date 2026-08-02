package c1;

import gd.InterfaceC6715d;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c1.C, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5699C implements Map.Entry<Object, Object>, InterfaceC6715d.a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f56181a;

    /* renamed from: b, reason: collision with root package name */
    private Object f56182b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C5700D<Object, Object> f56183c;

    C5699C(C5700D<Object, Object> c5700d) {
        this.f56183c = c5700d;
        Map.Entry<Object, Object> e11 = c5700d.e();
        Intrinsics.f(e11);
        this.f56181a = e11.getKey();
        Map.Entry<Object, Object> e12 = c5700d.e();
        Intrinsics.f(e12);
        this.f56182b = e12.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f56181a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f56182b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i11;
        C5700D<Object, Object> c5700d = this.f56183c;
        int h11 = c5700d.h().c().h();
        i11 = ((AbstractC5701E) c5700d).f56186c;
        if (h11 != i11) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f56182b;
        c5700d.h().put(this.f56181a, obj);
        this.f56182b = obj;
        return obj2;
    }
}
