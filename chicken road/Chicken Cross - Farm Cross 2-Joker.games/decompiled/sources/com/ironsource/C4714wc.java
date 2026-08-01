package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.wc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4714wc implements Dd {

    /* renamed from: a, reason: collision with root package name */
    private final String f8748a;

    /* renamed from: com.ironsource.wc$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8749a = new a();
        public static final String b = "IronSource";

        private a() {
        }
    }

    public C4714wc(String networkInstanceId) {
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        this.f8748a = networkInstanceId;
    }

    @Override // com.ironsource.Dd
    public String value() {
        if (this.f8748a.length() == 0) {
            return "";
        }
        if (Intrinsics.areEqual(this.f8748a, "0") || Intrinsics.areEqual(this.f8748a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.f8748a;
    }
}
