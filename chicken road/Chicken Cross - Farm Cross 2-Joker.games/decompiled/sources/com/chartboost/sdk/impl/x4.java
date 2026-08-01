package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class x4 {

    /* renamed from: a, reason: collision with root package name */
    public static final x4 f5068a = new x4();

    public final double a(Object obj) {
        String a2;
        if (!(obj instanceof eh)) {
            if (!(obj instanceof b9)) {
                return (!(obj instanceof u8) || (a2 = ((u8) obj).a()) == null || StringsKt.isBlank(a2)) ? 0.0d : 1.2d;
            }
            String a3 = ((b9) obj).a();
            return (a3 == null || StringsKt.isBlank(a3)) ? 0.0d : 1.0d;
        }
        String a4 = ((eh) obj).a();
        if (a4 == null) {
            return 0.0d;
        }
        if (StringsKt.startsWith(a4, "image", true)) {
            return 0.8d;
        }
        if (StringsKt.contains((CharSequence) a4, (CharSequence) "javascript", true)) {
            return 1.0d;
        }
        StringsKt.contains((CharSequence) a4, (CharSequence) "flash", true);
        return 0.0d;
    }

    public final double a(wf wfVar, v4 v4Var) {
        double d = wfVar.d();
        double b = wfVar.b();
        Integer j = v4Var.j();
        if (j != null) {
            double intValue = j.intValue();
            Integer d2 = v4Var.d();
            if (d2 != null) {
                double intValue2 = d2.intValue();
                float a2 = wfVar.a();
                if (d > 0.0d && b > 0.0d && intValue > 0.0d && intValue2 > 0.0d) {
                    double abs = Math.abs((d / b) - (intValue / intValue2));
                    double d3 = d * a2;
                    return abs + (d3 != 0.0d ? Math.abs(d3 - intValue) / d3 : Double.MAX_VALUE);
                }
            }
        }
        return Double.MAX_VALUE;
    }

    public final v4 a(List companionAds, wf renderingContainer) {
        Object next;
        v4 a2;
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        Intrinsics.checkNotNullParameter(renderingContainer, "renderingContainer");
        ArrayList arrayList = new ArrayList();
        Iterator it = companionAds.iterator();
        while (true) {
            Pair pair = null;
            if (!it.hasNext()) {
                break;
            }
            v4 v4Var = (v4) it.next();
            double a3 = f5068a.a(renderingContainer, v4Var);
            qj qjVar = null;
            double d = Double.NEGATIVE_INFINITY;
            for (qj qjVar2 : CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) v4Var.h(), (Iterable) v4Var.f()), (Iterable) v4Var.e())) {
                double a4 = f5068a.a(qjVar2);
                if (a4 > 0.0d) {
                    double d2 = a4 / (1.0d + a3);
                    if (d2 > d) {
                        qjVar = qjVar2;
                        d = d2;
                    }
                }
            }
            if (d != Double.NEGATIVE_INFINITY && qjVar != null && CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) v4Var.h(), (Iterable) v4Var.f()), (Iterable) v4Var.e()).contains(qjVar)) {
                a2 = v4Var.a((r37 & 1) != 0 ? v4Var.f5038a : null, (r37 & 2) != 0 ? v4Var.b : null, (r37 & 4) != 0 ? v4Var.c : null, (r37 & 8) != 0 ? v4Var.d : null, (r37 & 16) != 0 ? v4Var.e : null, (r37 & 32) != 0 ? v4Var.f : null, (r37 & 64) != 0 ? v4Var.g : null, (r37 & 128) != 0 ? v4Var.h : null, (r37 & 256) != 0 ? v4Var.i : null, (r37 & 512) != 0 ? v4Var.j : null, (r37 & 1024) != 0 ? v4Var.k : null, (r37 & 2048) != 0 ? v4Var.l : null, (r37 & 4096) != 0 ? v4Var.m : null, (r37 & 8192) != 0 ? v4Var.n : null, (r37 & 16384) != 0 ? v4Var.o : null, (r37 & 32768) != 0 ? v4Var.p : null, (r37 & 65536) != 0 ? v4Var.q : null, (r37 & 131072) != 0 ? v4Var.r : null, (r37 & 262144) != 0 ? v4Var.s : qjVar);
                pair = TuplesKt.to(a2, Double.valueOf(d));
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                double doubleValue = ((Number) ((Pair) next).getSecond()).doubleValue();
                do {
                    Object next2 = it2.next();
                    double doubleValue2 = ((Number) ((Pair) next2).getSecond()).doubleValue();
                    if (Double.compare(doubleValue, doubleValue2) < 0) {
                        next = next2;
                        doubleValue = doubleValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair2 = (Pair) next;
        if (pair2 != null) {
            return (v4) pair2.getFirst();
        }
        return null;
    }
}
