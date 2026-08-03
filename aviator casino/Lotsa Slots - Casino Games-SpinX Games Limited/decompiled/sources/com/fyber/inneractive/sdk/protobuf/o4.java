package com.fyber.inneractive.sdk.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class o4 {
    private static final /* synthetic */ com.fyber.inneractive.sdk.protobuf.o4[] $VALUES;
    public static final com.fyber.inneractive.sdk.protobuf.o4 LAZY;
    public static final com.fyber.inneractive.sdk.protobuf.o4 LOOSE;
    public static final com.fyber.inneractive.sdk.protobuf.o4 STRICT;

    static {
        com.fyber.inneractive.sdk.protobuf.o4 o4Var = new com.fyber.inneractive.sdk.protobuf.o4() { // from class: com.fyber.inneractive.sdk.protobuf.l4
            @Override // com.fyber.inneractive.sdk.protobuf.o4
            public final java.lang.Object a(com.fyber.inneractive.sdk.protobuf.w wVar) {
                return wVar.r();
            }
        };
        LOOSE = o4Var;
        com.fyber.inneractive.sdk.protobuf.o4 o4Var2 = new com.fyber.inneractive.sdk.protobuf.o4() { // from class: com.fyber.inneractive.sdk.protobuf.m4
            @Override // com.fyber.inneractive.sdk.protobuf.o4
            public final java.lang.Object a(com.fyber.inneractive.sdk.protobuf.w wVar) {
                return wVar.s();
            }
        };
        STRICT = o4Var2;
        com.fyber.inneractive.sdk.protobuf.o4 o4Var3 = new com.fyber.inneractive.sdk.protobuf.o4() { // from class: com.fyber.inneractive.sdk.protobuf.n4
            @Override // com.fyber.inneractive.sdk.protobuf.o4
            public final java.lang.Object a(com.fyber.inneractive.sdk.protobuf.w wVar) {
                return wVar.e();
            }
        };
        LAZY = o4Var3;
        $VALUES = new com.fyber.inneractive.sdk.protobuf.o4[]{o4Var, o4Var2, o4Var3};
    }

    public o4(java.lang.String str, int i) {
    }

    public static com.fyber.inneractive.sdk.protobuf.o4 valueOf(java.lang.String str) {
        return (com.fyber.inneractive.sdk.protobuf.o4) java.lang.Enum.valueOf(com.fyber.inneractive.sdk.protobuf.o4.class, str);
    }

    public static com.fyber.inneractive.sdk.protobuf.o4[] values() {
        return (com.fyber.inneractive.sdk.protobuf.o4[]) $VALUES.clone();
    }

    public abstract java.lang.Object a(com.fyber.inneractive.sdk.protobuf.w wVar);
}
