package com.ironsource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes6.dex */
public final class Mg {

    /* renamed from: a, reason: collision with root package name */
    private final List<B> f7798a;

    /* JADX WARN: Multi-variable type inference failed */
    public Mg(List<? extends B> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        this.f7798a = instances;
    }

    public final List<B> a() {
        return this.f7798a;
    }

    public final List<B> b() {
        return this.f7798a;
    }

    public final int c() {
        return this.f7798a.size();
    }

    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (B b : this.f7798a) {
            arrayList.add(a(b.h(), b.r()));
        }
        return CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mg) && Intrinsics.areEqual(this.f7798a, ((Mg) obj).f7798a);
    }

    public int hashCode() {
        return this.f7798a.hashCode();
    }

    public String toString() {
        return "WaterfallInstances(instances=" + this.f7798a + ")";
    }

    public final Mg a(List<? extends B> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        return new Mg(instances);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Mg a(Mg mg, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mg.f7798a;
        }
        return mg.a(list);
    }

    private final String a(C4561o2 c4561o2, int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), c4561o2.c()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }
}
