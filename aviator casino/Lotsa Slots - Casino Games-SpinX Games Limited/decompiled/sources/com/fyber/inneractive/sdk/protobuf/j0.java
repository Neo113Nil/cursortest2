package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class j0 {
    public static void a(com.fyber.inneractive.sdk.protobuf.c0 c0Var, java.util.Map.Entry entry) {
        com.fyber.inneractive.sdk.protobuf.w0 w0Var = (com.fyber.inneractive.sdk.protobuf.w0) entry.getKey();
        if (w0Var.d) {
            switch (com.fyber.inneractive.sdk.protobuf.i0.f4195a[w0Var.c.ordinal()]) {
                case 1:
                    com.fyber.inneractive.sdk.protobuf.u2.b(w0Var.b, (java.util.List) entry.getValue(), c0Var, w0Var.e);
                    break;
                case 2:
                    com.fyber.inneractive.sdk.protobuf.u2.f(w0Var.b, (java.util.List) entry.getValue(), c0Var, w0Var.e);
                    break;
                case 3:
                    com.fyber.inneractive.sdk.protobuf.u2.h(w0Var.b, (java.util.List) entry.getValue(), c0Var, w0Var.e);
                    break;
                case 4:
                    com.fyber.inneractive.sdk.protobuf.u2.n(w0Var.b, (java.util.List) entry.getValue(), c0Var, w0Var.e);
                    break;
                case 5:
                    com.fyber.inneractive.sdk.protobuf.u2.g(w0Var.b, (java.util.List) entry.getValue(), c0Var, w0Var.e);
                    break;
                case 6:
                    com.fyber.inneractive.sdk.protobuf.u2.e(w0Var.b, (java.util.List) entry.getValue(), c0Var, w0Var.e);
                    break;
                case 7:
                    com.fyber.inneractive.sdk.protobuf.u2.d(w0Var.b, (java.util.List) entry.getValue(), c0Var, w0Var.e);
                    break;
                case 8:
                    com.fyber.inneractive.sdk.protobuf.u2.a(w0Var.b, (java.util.List) entry.getValue(), c0Var, w0Var.e);
                    break;
                case 9:
                    com.fyber.inneractive.sdk.protobuf.u2.m(w0Var.b, (java.util.List) entry.getValue(), c0Var, w0Var.e);
                    break;
                case 10:
                    com.fyber.inneractive.sdk.protobuf.u2.i(w0Var.b, (java.util.List) entry.getValue(), c0Var, w0Var.e);
                    break;
                case 11:
                    com.fyber.inneractive.sdk.protobuf.u2.j(w0Var.b, (java.util.List) entry.getValue(), c0Var, w0Var.e);
                    break;
                case 12:
                    com.fyber.inneractive.sdk.protobuf.u2.k(w0Var.b, (java.util.List) entry.getValue(), c0Var, w0Var.e);
                    break;
                case 13:
                    com.fyber.inneractive.sdk.protobuf.u2.l(w0Var.b, (java.util.List) entry.getValue(), c0Var, w0Var.e);
                    break;
                case 14:
                    com.fyber.inneractive.sdk.protobuf.u2.g(w0Var.b, (java.util.List) entry.getValue(), c0Var, w0Var.e);
                    break;
                case 15:
                    com.fyber.inneractive.sdk.protobuf.u2.a(w0Var.b, (java.util.List) entry.getValue(), c0Var);
                    break;
                case 16:
                    com.fyber.inneractive.sdk.protobuf.u2.b(w0Var.b, (java.util.List) entry.getValue(), c0Var);
                    break;
                case 17:
                    java.util.List list = (java.util.List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        com.fyber.inneractive.sdk.protobuf.u2.a(w0Var.b, (java.util.List) entry.getValue(), c0Var, com.fyber.inneractive.sdk.protobuf.p2.c.a(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    java.util.List list2 = (java.util.List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        com.fyber.inneractive.sdk.protobuf.u2.b(w0Var.b, (java.util.List) entry.getValue(), c0Var, com.fyber.inneractive.sdk.protobuf.p2.c.a(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (com.fyber.inneractive.sdk.protobuf.i0.f4195a[w0Var.c.ordinal()]) {
            case 1:
                c0Var.a(w0Var.b, ((java.lang.Double) entry.getValue()).doubleValue());
                break;
            case 2:
                c0Var.a(w0Var.b, ((java.lang.Float) entry.getValue()).floatValue());
                break;
            case 3:
                c0Var.f4181a.b(w0Var.b, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 4:
                c0Var.f4181a.b(w0Var.b, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 5:
                c0Var.f4181a.b(w0Var.b, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 6:
                c0Var.f4181a.a(w0Var.b, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 7:
                c0Var.f4181a.a(w0Var.b, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 8:
                c0Var.f4181a.a(w0Var.b, ((java.lang.Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                c0Var.f4181a.d(w0Var.b, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 10:
                c0Var.f4181a.a(w0Var.b, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 11:
                c0Var.f4181a.a(w0Var.b, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 12:
                c0Var.a(w0Var.b, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 13:
                c0Var.a(w0Var.b, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 14:
                c0Var.f4181a.b(w0Var.b, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 15:
                c0Var.f4181a.a(w0Var.b, (com.fyber.inneractive.sdk.protobuf.s) entry.getValue());
                break;
            case 16:
                int i = w0Var.b;
                c0Var.f4181a.a((java.lang.String) entry.getValue(), i);
                break;
            case 17:
                c0Var.a(w0Var.b, entry.getValue(), com.fyber.inneractive.sdk.protobuf.p2.c.a(entry.getValue().getClass()));
                break;
            case 18:
                int i2 = w0Var.b;
                java.lang.Object value = entry.getValue();
                c0Var.f4181a.a(i2, (com.fyber.inneractive.sdk.protobuf.d2) value, com.fyber.inneractive.sdk.protobuf.p2.c.a(entry.getValue().getClass()));
                break;
        }
    }

    public static java.lang.Object a(com.fyber.inneractive.sdk.protobuf.s2 s2Var, com.fyber.inneractive.sdk.protobuf.x0 x0Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var, com.fyber.inneractive.sdk.protobuf.n0 n0Var, java.lang.Object obj, com.fyber.inneractive.sdk.protobuf.o3 o3Var) {
        java.lang.Object valueOf;
        java.util.ArrayList arrayList;
        com.fyber.inneractive.sdk.protobuf.w0 w0Var = x0Var.d;
        int i = w0Var.b;
        if (w0Var.d && w0Var.e) {
            switch (com.fyber.inneractive.sdk.protobuf.i0.f4195a[w0Var.c.ordinal()]) {
                case 1:
                    arrayList = new java.util.ArrayList();
                    s2Var.j(arrayList);
                    break;
                case 2:
                    arrayList = new java.util.ArrayList();
                    s2Var.d(arrayList);
                    break;
                case 3:
                    arrayList = new java.util.ArrayList();
                    s2Var.k(arrayList);
                    break;
                case 4:
                    arrayList = new java.util.ArrayList();
                    s2Var.a(arrayList);
                    break;
                case 5:
                    arrayList = new java.util.ArrayList();
                    s2Var.o(arrayList);
                    break;
                case 6:
                    arrayList = new java.util.ArrayList();
                    s2Var.n(arrayList);
                    break;
                case 7:
                    arrayList = new java.util.ArrayList();
                    s2Var.e(arrayList);
                    break;
                case 8:
                    arrayList = new java.util.ArrayList();
                    s2Var.l(arrayList);
                    break;
                case 9:
                    arrayList = new java.util.ArrayList();
                    s2Var.i(arrayList);
                    break;
                case 10:
                    arrayList = new java.util.ArrayList();
                    s2Var.f(arrayList);
                    break;
                case 11:
                    arrayList = new java.util.ArrayList();
                    s2Var.m(arrayList);
                    break;
                case 12:
                    arrayList = new java.util.ArrayList();
                    s2Var.c(arrayList);
                    break;
                case 13:
                    arrayList = new java.util.ArrayList();
                    s2Var.g(arrayList);
                    break;
                case 14:
                    arrayList = new java.util.ArrayList();
                    s2Var.p(arrayList);
                    obj = com.fyber.inneractive.sdk.protobuf.u2.a(i, arrayList, x0Var.d.f4223a, obj, o3Var);
                    break;
                default:
                    throw new java.lang.IllegalStateException("Type cannot be packed: " + x0Var.d.c);
            }
            n0Var.c(x0Var.d, arrayList);
        } else {
            com.fyber.inneractive.sdk.protobuf.j4 j4Var = w0Var.c;
            if (j4Var == com.fyber.inneractive.sdk.protobuf.j4.ENUM) {
                int d = s2Var.d();
                if (x0Var.d.f4223a.a(d) == null) {
                    return com.fyber.inneractive.sdk.protobuf.u2.a(i, d, obj, o3Var);
                }
                valueOf = java.lang.Integer.valueOf(d);
            } else {
                switch (com.fyber.inneractive.sdk.protobuf.i0.f4195a[j4Var.ordinal()]) {
                    case 1:
                        valueOf = java.lang.Double.valueOf(s2Var.h());
                        break;
                    case 2:
                        valueOf = java.lang.Float.valueOf(s2Var.k());
                        break;
                    case 3:
                        valueOf = java.lang.Long.valueOf(s2Var.o());
                        break;
                    case 4:
                        valueOf = java.lang.Long.valueOf(s2Var.f());
                        break;
                    case 5:
                        valueOf = java.lang.Integer.valueOf(s2Var.d());
                        break;
                    case 6:
                        valueOf = java.lang.Long.valueOf(s2Var.g());
                        break;
                    case 7:
                        valueOf = java.lang.Integer.valueOf(s2Var.q());
                        break;
                    case 8:
                        valueOf = java.lang.Boolean.valueOf(s2Var.r());
                        break;
                    case 9:
                        valueOf = java.lang.Integer.valueOf(s2Var.c());
                        break;
                    case 10:
                        valueOf = java.lang.Integer.valueOf(s2Var.m());
                        break;
                    case 11:
                        valueOf = java.lang.Long.valueOf(s2Var.t());
                        break;
                    case 12:
                        valueOf = java.lang.Integer.valueOf(s2Var.j());
                        break;
                    case 13:
                        valueOf = java.lang.Long.valueOf(s2Var.l());
                        break;
                    case 14:
                        throw new java.lang.IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = s2Var.a();
                        break;
                    case 16:
                        valueOf = s2Var.n();
                        break;
                    case 17:
                        valueOf = s2Var.a(x0Var.c.getClass(), h0Var);
                        break;
                    case 18:
                        valueOf = s2Var.b(x0Var.c.getClass(), h0Var);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            com.fyber.inneractive.sdk.protobuf.w0 w0Var2 = x0Var.d;
            if (w0Var2.d) {
                n0Var.a(w0Var2, valueOf);
            } else {
                int i2 = com.fyber.inneractive.sdk.protobuf.i0.f4195a[w0Var2.c.ordinal()];
                if (i2 == 17 || i2 == 18) {
                    java.lang.Object obj2 = n0Var.f4206a.get(x0Var.d);
                    if (obj2 != null) {
                        valueOf = com.fyber.inneractive.sdk.protobuf.l1.a(obj2, valueOf);
                    }
                }
                n0Var.c(x0Var.d, valueOf);
            }
        }
        return obj;
    }
}
