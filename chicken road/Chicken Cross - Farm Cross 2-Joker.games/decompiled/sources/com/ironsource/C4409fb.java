package com.ironsource;

import com.ironsource.InterfaceC4427gb;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.fb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4409fb {

    /* renamed from: a, reason: collision with root package name */
    private final C4445hb f8196a;

    /* renamed from: com.ironsource.fb$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private C4409fb f8197a = new C4409fb(null);

        public final a a(String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.f8197a.a(adUnitId);
            return this;
        }

        public final a b(String placementName) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            this.f8197a.b(placementName);
            return this;
        }

        public final a a(InterfaceC4480jb listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f8197a.a(listener);
            return this;
        }

        public final C4409fb a() {
            return this.f8197a;
        }
    }

    public /* synthetic */ C4409fb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String c() {
        return this.f8196a.i();
    }

    public final String d() {
        return this.f8196a.j();
    }

    public final InterfaceC4427gb.a e() {
        return this.f8196a.k();
    }

    public final AdapterNativeAdViewBinder f() {
        return this.f8196a.l();
    }

    public final String g() {
        return this.f8196a.m();
    }

    public final void h() {
        this.f8196a.n();
    }

    private C4409fb() {
        this.f8196a = new C4445hb(C4637s7.f8524a.a(), this);
    }

    public final void a() {
        this.f8196a.f();
    }

    public final String b() {
        return this.f8196a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f8196a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        this.f8196a.b(str);
    }

    public final void a(InterfaceC4480jb interfaceC4480jb) {
        this.f8196a.a(interfaceC4480jb);
    }
}
