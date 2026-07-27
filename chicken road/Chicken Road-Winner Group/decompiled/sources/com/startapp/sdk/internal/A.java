package com.startapp.sdk.internal;

import android.view.inputmethod.InputMethodSubtype;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements o2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3408a;

    @Override // o2.l
    public final Object invoke(Object obj) {
        switch (this.f3408a) {
            case 0:
                return Boolean.valueOf(ea.a((InputMethodSubtype) obj));
            case 1:
                return ea.b((InputMethodSubtype) obj);
            case 2:
                return Boolean.valueOf(ea.a((String) obj));
            case 3:
                return o7.a(((Boolean) obj).booleanValue());
            case 4:
                u2.e it = (u2.e) obj;
                kotlin.jvm.internal.j.e(it, "it");
                return it.iterator();
            case 5:
                Iterable it2 = (Iterable) obj;
                kotlin.jvm.internal.j.e(it2, "it");
                return it2.iterator();
            case 6:
                return obj;
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
