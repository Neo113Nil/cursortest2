package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class p4 {
    public static java.lang.Object a(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.j4 j4Var, com.fyber.inneractive.sdk.protobuf.o4 o4Var) {
        switch (com.fyber.inneractive.sdk.protobuf.e4.f4188a[j4Var.ordinal()]) {
            case 1:
                return java.lang.Double.valueOf(wVar.f());
            case 2:
                return java.lang.Float.valueOf(wVar.j());
            case 3:
                return java.lang.Long.valueOf(wVar.l());
            case 4:
                return java.lang.Long.valueOf(wVar.v());
            case 5:
                return java.lang.Integer.valueOf(wVar.k());
            case 6:
                return java.lang.Long.valueOf(wVar.i());
            case 7:
                return java.lang.Integer.valueOf(wVar.h());
            case 8:
                return java.lang.Boolean.valueOf(wVar.d());
            case 9:
                return wVar.e();
            case 10:
                return java.lang.Integer.valueOf(wVar.u());
            case 11:
                return java.lang.Integer.valueOf(wVar.n());
            case 12:
                return java.lang.Long.valueOf(wVar.o());
            case 13:
                return java.lang.Integer.valueOf(wVar.p());
            case 14:
                return java.lang.Long.valueOf(wVar.q());
            case 15:
                return o4Var.a(wVar);
            case 16:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
