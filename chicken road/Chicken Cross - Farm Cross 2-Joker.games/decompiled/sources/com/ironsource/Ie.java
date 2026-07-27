package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ie implements He {

    /* renamed from: a, reason: collision with root package name */
    private final H8 f7703a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7704a = new a();
        public static final String b = "sessionNumber";
        public static final String c = "firstSessionTimestamp";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ie() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.Je
    public void a(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7703a.a(context, a.b, i);
    }

    @Override // com.ironsource.Je
    public int b(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f7703a.b(context, a.b, i);
    }

    public Ie(H8 sdkSharedPref) {
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.f7703a = sdkSharedPref;
    }

    @Override // com.ironsource.InterfaceC4573oe
    public long a(Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f7703a.b(context, "firstSessionTimestamp", j);
    }

    @Override // com.ironsource.InterfaceC4573oe
    public void b(Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7703a.a(context, "firstSessionTimestamp", j);
    }

    public /* synthetic */ Ie(H8 h8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Ke() : h8);
    }
}
