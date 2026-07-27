package com.ironsource;

import android.content.Context;
import com.ironsource.G8;
import com.ironsource.InterfaceC4527m4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ge implements G8, G8.a {

    /* renamed from: a, reason: collision with root package name */
    private final He f7641a;
    private final InterfaceC4716we b;
    private final InterfaceC4527m4 c;
    private int d;
    private long e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7642a = new a();
        public static final int b = -1;
        public static final int c = 0;
        public static final long d = -1;

        private a() {
        }
    }

    public Ge(He storage, InterfaceC4716we initResponseStorage, InterfaceC4527m4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initResponseStorage, "initResponseStorage");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f7641a = storage;
        this.b = initResponseStorage;
        this.c = currentTimeProvider;
        this.d = -1;
        this.e = -1L;
    }

    private final int b(Context context, He he) {
        int b = he.b(context, 0) + 1;
        he.a(context, b);
        return b;
    }

    @Override // com.ironsource.G8.a
    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = b(context, this.f7641a);
        this.e = a(context, this.f7641a);
    }

    @Override // com.ironsource.G8
    public int c() {
        return this.d;
    }

    private final long a(Context context, He he) {
        long a2 = he.a(context, -1L);
        if (this.b.a(context) || a2 != -1) {
            return a2;
        }
        long a3 = this.c.a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + a3);
        he.b(context, a3);
        return a3;
    }

    @Override // com.ironsource.G8
    public String b() {
        String d = IronSourceUtils.d();
        Intrinsics.checkNotNullExpressionValue(d, "getSessionId()");
        return d;
    }

    public /* synthetic */ Ge(He he, InterfaceC4716we interfaceC4716we, InterfaceC4527m4 interfaceC4527m4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(he, (i & 2) != 0 ? new C4734xe() : interfaceC4716we, (i & 4) != 0 ? new InterfaceC4527m4.a() : interfaceC4527m4);
    }

    @Override // com.ironsource.G8
    public long a() {
        return this.e;
    }
}
