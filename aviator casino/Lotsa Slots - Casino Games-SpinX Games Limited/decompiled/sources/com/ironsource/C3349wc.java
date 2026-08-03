package com.ironsource;

/* renamed from: com.ironsource.wc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3349wc implements com.ironsource.Ed {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6805a;

    /* renamed from: com.ironsource.wc$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3349wc.a f6806a = new com.ironsource.C3349wc.a();
        public static final java.lang.String b = "IronSource";

        private a() {
        }
    }

    public C3349wc(java.lang.String networkInstanceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        this.f6805a = networkInstanceId;
    }

    @Override // com.ironsource.Ed
    public java.lang.String value() {
        if (this.f6805a.length() == 0) {
            return "";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.f6805a, "0") || kotlin.jvm.internal.Intrinsics.areEqual(this.f6805a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.f6805a;
    }
}
