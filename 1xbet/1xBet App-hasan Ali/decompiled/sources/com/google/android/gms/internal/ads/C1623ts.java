package com.google.android.gms.internal.ads;

import Q2.InterfaceC0383s0;
import java.util.function.Predicate;

/* renamed from: com.google.android.gms.internal.ads.ts, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1623ts implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15735a;

    public /* synthetic */ C1623ts(int i) {
        this.f15735a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f15735a) {
            case 0:
                return Ih.class.isInstance((InterfaceC0383s0) obj);
            default:
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                return !str.trim().isEmpty();
        }
    }
}
