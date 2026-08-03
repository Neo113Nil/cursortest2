package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class x2 extends com.fyber.inneractive.sdk.protobuf.d3 {
    public final /* synthetic */ com.fyber.inneractive.sdk.protobuf.e3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(com.fyber.inneractive.sdk.protobuf.e3 e3Var) {
        super(e3Var);
        this.b = e3Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.fyber.inneractive.sdk.protobuf.w2(this.b);
    }
}
