package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.pf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4592pf implements InterfaceC4741y3 {
    public static final a d = new a(null);
    public static final int e = -1;
    public static final long f = -1;

    /* renamed from: a, reason: collision with root package name */
    private final Context f8481a;
    private final String b;
    private final H8 c;

    /* renamed from: com.ironsource.pf$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4592pf(Context context, String baseName, H8 sdkSharedPref) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseName, "baseName");
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.f8481a = context;
        this.b = baseName;
        this.c = sdkSharedPref;
    }

    @Override // com.ironsource.InterfaceC4741y3
    public void a(String identifier, int i) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.a(this.f8481a, new C4610qf(identifier, this.b + ".show_count_show_counter").a(), i);
    }

    @Override // com.ironsource.InterfaceC4741y3
    public Long b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Long.valueOf(this.c.b(this.f8481a, new C4610qf(identifier, this.b + ".pacing_last_show_time").a(), -1L)));
    }

    @Override // com.ironsource.InterfaceC4741y3
    public Integer c(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Integer.valueOf(this.c.b(this.f8481a, new C4610qf(identifier, this.b + ".show_count_show_counter").a(), -1)));
    }

    @Override // com.ironsource.InterfaceC4741y3
    public void a(String identifier, long j) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.a(this.f8481a, new C4610qf(identifier, this.b + ".pacing_last_show_time").a(), j);
    }

    @Override // com.ironsource.InterfaceC4741y3
    public void b(String identifier, long j) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.a(this.f8481a, new C4610qf(identifier, this.b + ".show_count_threshold").a(), j);
    }

    public /* synthetic */ C4592pf(Context context, String str, H8 h8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new Ke() : h8);
    }

    @Override // com.ironsource.InterfaceC4741y3
    public Long a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Long.valueOf(this.c.b(this.f8481a, new C4610qf(identifier, this.b + ".show_count_threshold").a(), -1L)));
    }

    private final Long a(Long l) {
        if (l != null && l.longValue() == -1) {
            return null;
        }
        return l;
    }

    private final Integer a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }
}
