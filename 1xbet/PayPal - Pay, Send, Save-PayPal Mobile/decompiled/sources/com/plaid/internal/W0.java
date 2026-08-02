package com.plaid.internal;

/* loaded from: classes16.dex */
public final class W0 implements com.plaid.internal.C0647t3.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0588m6.b f5959a;
    public final com.plaid.internal.C0588m6.c b;

    public W0(com.plaid.internal.C0588m6.b bVar, com.plaid.internal.C0588m6.c cVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "");
        this.f5959a = bVar;
        this.b = cVar;
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void a(com.plaid.link.event.LinkEvent linkEvent, com.plaid.internal.I2 i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkEvent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i2, "");
        this.f5959a.invoke(linkEvent, i2);
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.b.invoke();
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void a(java.util.LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "");
        this.b.invoke();
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void a(com.plaid.link.result.LinkSuccess linkSuccess) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkSuccess, "");
        this.b.invoke();
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void a(com.plaid.internal.C0447a1 c0447a1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0447a1, "");
        this.b.invoke();
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void a(com.plaid.link.result.LinkExit linkExit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkExit, "");
        this.b.invoke();
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void a(java.lang.String str, com.plaid.link.event.LinkEventMetadata linkEventMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkEventMetadata, "");
        this.b.invoke();
    }

    @Override // com.plaid.internal.C0647t3.a
    public final void b(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
