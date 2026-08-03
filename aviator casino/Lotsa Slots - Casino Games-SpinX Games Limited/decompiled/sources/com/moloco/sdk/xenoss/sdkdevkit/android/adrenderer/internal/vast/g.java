package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y> f7708a = new java.util.Comparator() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) obj2);
        }
    };
    public static final java.util.Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l> b = new java.util.Comparator() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g$$ExternalSyntheticLambda2
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) obj2);
        }
    };

    public static final java.util.Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y> b() {
        return f7708a;
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar2, java.lang.Integer num, java.lang.Integer num2) {
        return a(b(eVar.i(), eVar.f(), num, num2), b(eVar2.i(), eVar2.f(), num, num2));
    }

    public static final kotlin.Pair<java.lang.Integer, java.lang.Integer> d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar2, java.lang.Integer num, java.lang.Integer num2) {
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.a(kotlin.jvm.internal.Ref.IntRef.this, intRef2, (kotlin.Pair) obj);
            }
        };
        function1.invoke(b(eVar, eVar2, num, num2));
        function1.invoke(c(eVar, eVar2, num, num2));
        function1.invoke(a(eVar, eVar2));
        return kotlin.TuplesKt.to(java.lang.Integer.valueOf(intRef.element), java.lang.Integer.valueOf(intRef2.element));
    }

    public static final kotlin.Pair<java.lang.Integer, java.lang.Integer> b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar2, double d, java.lang.Long l, java.lang.Integer num, java.lang.Integer num2) {
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.b(kotlin.jvm.internal.Ref.IntRef.this, intRef2, (kotlin.Pair) obj);
            }
        };
        function1.invoke(a(qVar, qVar2, num, num2));
        function1.invoke(b(qVar, qVar2, num, num2));
        function1.invoke(a(qVar, qVar2, d, l));
        return kotlin.TuplesKt.to(java.lang.Integer.valueOf(intRef.element), java.lang.Integer.valueOf(intRef2.element));
    }

    public static final java.util.Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e> a(java.lang.Integer num, java.lang.Integer num2) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a(num, num2);
    }

    public static final java.util.Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l> a() {
        return b;
    }

    public static final java.util.Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q> a(double d, java.lang.Long l, java.lang.Integer num, java.lang.Integer num2) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.b(d, l, num, num2);
    }

    public static final int a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(yVar2);
        int b2 = b(yVar2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(yVar);
        return kotlin.jvm.internal.Intrinsics.compare(b2, b(yVar));
    }

    public static final int a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l lVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l lVar2) {
        return f7708a.compare(lVar.g(), lVar2.g());
    }

    public static /* synthetic */ kotlin.Pair a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar2, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        return d(eVar, eVar2, num, num2);
    }

    public static final kotlin.Unit a(kotlin.jvm.internal.Ref.IntRef intRef, kotlin.jvm.internal.Ref.IntRef intRef2, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "<destruct>");
        boolean booleanValue = ((java.lang.Boolean) pair.component1()).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) pair.component2()).booleanValue();
        if (booleanValue) {
            intRef.element++;
        }
        if (booleanValue2) {
            intRef2.element++;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.c;
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar2) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return java.lang.Boolean.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) obj3));
            }
        };
        java.util.Iterator<T> it = eVar.h().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((java.lang.Boolean) function1.invoke(obj2)).booleanValue()) {
                break;
            }
        }
        boolean z = obj2 != null;
        java.util.Iterator<T> it2 = eVar2.h().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            if (((java.lang.Boolean) function1.invoke(next)).booleanValue()) {
                obj = next;
                break;
            }
        }
        return kotlin.TuplesKt.to(java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(obj != null));
    }

    public static final kotlin.Unit b(kotlin.jvm.internal.Ref.IntRef intRef, kotlin.jvm.internal.Ref.IntRef intRef2, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "<destruct>");
        boolean booleanValue = ((java.lang.Boolean) pair.component1()).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) pair.component2()).booleanValue();
        if (booleanValue) {
            intRef.element++;
        }
        if (booleanValue2) {
            intRef2.element++;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar2, java.lang.Integer num, java.lang.Integer num2) {
        return a(a(eVar.i(), eVar.f(), num, num2), a(eVar2.i(), eVar2.f(), num, num2));
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar2, java.lang.Integer num, java.lang.Integer num2) {
        return a(b(qVar.j(), qVar.d(), num, num2), b(qVar2.j(), qVar2.d(), num, num2));
    }

    public static final java.lang.Double b(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
        if (num == null || num.intValue() == 0 || num2 == null || num2.intValue() == 0 || num3 == null || num3.intValue() == 0 || num4 == null || num4.intValue() == 0) {
            return null;
        }
        return java.lang.Double.valueOf((num.intValue() / num2.intValue()) - (num3.intValue() / num4.intValue()));
    }

    public static final int b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar) {
        if (yVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.a) {
            return 4;
        }
        if (yVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.c) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.c) yVar).a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.b ? 3 : 2;
        }
        if (yVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.b) {
            return 1;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar2, java.lang.Integer num, java.lang.Integer num2) {
        return a(a(qVar.j(), qVar.d(), num, num2), a(qVar2.j(), qVar2.d(), num, num2));
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar2, double d, java.lang.Long l) {
        return a(a(qVar, d, l), a(qVar2, d, l));
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> a(java.lang.Double d, java.lang.Double d2) {
        if (d == null || d2 == null) {
            return kotlin.TuplesKt.to(java.lang.Boolean.valueOf(d != null), java.lang.Boolean.valueOf(d2 != null));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(d, d2)) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            return kotlin.TuplesKt.to(bool, bool);
        }
        if (java.lang.Math.abs(d.doubleValue()) == java.lang.Math.abs(d2.doubleValue())) {
            return kotlin.TuplesKt.to(java.lang.Boolean.valueOf(d.doubleValue() < 0.0d), java.lang.Boolean.valueOf(d2.doubleValue() < 0.0d));
        }
        if (java.lang.Double.compare(java.lang.Math.abs(d.doubleValue()), java.lang.Math.abs(d2.doubleValue())) < 0) {
            return kotlin.TuplesKt.to(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
        }
        return kotlin.TuplesKt.to(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
    }

    public static final java.lang.Double a(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
        if (num == null || num.intValue() == 0 || num2 == null || num2.intValue() == 0 || num3 == null || num3.intValue() == 0 || num4 == null || num4.intValue() == 0) {
            return null;
        }
        return java.lang.Double.valueOf((num.intValue() * num2.intValue()) - (num3.intValue() * num4.intValue()));
    }

    public static final java.lang.Double a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar, double d, java.lang.Long l) {
        java.lang.Double a2 = a(qVar, l);
        if (a2 != null) {
            return java.lang.Double.valueOf(a2.doubleValue() - d);
        }
        return null;
    }

    public static final java.lang.Double a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar, java.lang.Long l) {
        java.lang.Double valueOf;
        if (l == null) {
            return null;
        }
        if (qVar.b() != null) {
            valueOf = java.lang.Double.valueOf(qVar.b().intValue());
        } else {
            valueOf = (qVar.f() == null || qVar.h() == null) ? null : java.lang.Double.valueOf((qVar.f().intValue() - qVar.h().intValue()) / 2.0d);
        }
        if (valueOf != null) {
            return java.lang.Double.valueOf((valueOf.doubleValue() / 8192) * (l.longValue() / 1000.0d));
        }
        return null;
    }
}
