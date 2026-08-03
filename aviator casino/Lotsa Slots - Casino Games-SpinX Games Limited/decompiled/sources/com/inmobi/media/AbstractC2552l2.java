package com.inmobi.media;

/* renamed from: com.inmobi.media.l2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2552l2 implements com.inmobi.media.InterfaceC2782tj, com.inmobi.media.InterfaceC2419g {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.AbstractC2735s1 f5306a;
    public final com.inmobi.media.A8 b;
    public final com.inmobi.media.Ic c;

    public AbstractC2552l2(com.inmobi.media.AbstractC2735s1 abstractC2735s1, com.inmobi.media.A8 adManagerComponent, com.inmobi.media.Ic stateMachine) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f5306a = abstractC2735s1;
        this.b = adManagerComponent;
        this.c = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC2419g
    public final void j() {
        this.c.a(new com.inmobi.media.C2821v5(this.b), this);
    }
}
