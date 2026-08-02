package J40;

import J40.e;
import e50.InterfaceC6302a;
import j50.InterfaceC7285a;
import kotlin.jvm.internal.Intrinsics;
import u50.InterfaceC9967b;
import x40.C10656a;
import z50.InterfaceC10987a;
import z50.InterfaceC10990d;

/* loaded from: classes3.dex */
public final class d implements Jb.e<K40.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C10656a> f13964a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC10987a> f13965b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<InterfaceC7285a> f13966c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<P40.a> f13967d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<U40.a> f13968e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<p50.a> f13969f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<InterfaceC9967b> f13970g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.a<InterfaceC10990d> f13971h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a<I50.a> f13972i;

    /* renamed from: j, reason: collision with root package name */
    private final Pc.a<K40.b> f13973j;

    /* renamed from: k, reason: collision with root package name */
    private final Pc.a<InterfaceC6302a> f13974k;

    public d(Pc.a<C10656a> aVar, Pc.a<InterfaceC10987a> aVar2, Pc.a<InterfaceC7285a> aVar3, Pc.a<P40.a> aVar4, Pc.a<U40.a> aVar5, Pc.a<p50.a> aVar6, Pc.a<InterfaceC9967b> aVar7, Pc.a<InterfaceC10990d> aVar8, Pc.a<I50.a> aVar9, Pc.a<K40.b> aVar10, Pc.a<InterfaceC6302a> aVar11) {
        this.f13964a = aVar;
        this.f13965b = aVar2;
        this.f13966c = aVar3;
        this.f13967d = aVar4;
        this.f13968e = aVar5;
        this.f13969f = aVar6;
        this.f13970g = aVar7;
        this.f13971h = aVar8;
        this.f13972i = aVar9;
        this.f13973j = aVar10;
        this.f13974k = aVar11;
    }

    @Override // Pc.a
    public final Object get() {
        C10656a cbottomMapper2 = (C10656a) ((e.f) this.f13964a).get();
        InterfaceC10987a fullDisplay = (InterfaceC10987a) ((e.a) this.f13965b).get();
        InterfaceC7285a screenDisplay = (InterfaceC7285a) ((e.c) this.f13966c).get();
        P40.a modalDisplay = (P40.a) ((e.g) this.f13967d).get();
        U40.a onboardingSlidesDisplay = (U40.a) ((e.b) this.f13968e).get();
        p50.a sheetDisplay = (p50.a) ((e.i) this.f13969f).get();
        InterfaceC9967b snackbarDisplay = (InterfaceC9967b) ((e.d) this.f13970g).get();
        InterfaceC10990d storiesDisplay = (InterfaceC10990d) ((e.C0265e) this.f13971h).get();
        I50.a webViewDisplay = (I50.a) ((e.j) this.f13972i).get();
        K40.b cbottomDisplayCreator = this.f13973j.get();
        InterfaceC6302a pdfDisplay = (InterfaceC6302a) ((e.h) this.f13974k).get();
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(fullDisplay, "fullDisplay");
        Intrinsics.checkNotNullParameter(screenDisplay, "screenDisplay");
        Intrinsics.checkNotNullParameter(modalDisplay, "modalDisplay");
        Intrinsics.checkNotNullParameter(onboardingSlidesDisplay, "onboardingSlidesDisplay");
        Intrinsics.checkNotNullParameter(sheetDisplay, "sheetDisplay");
        Intrinsics.checkNotNullParameter(snackbarDisplay, "snackbarDisplay");
        Intrinsics.checkNotNullParameter(storiesDisplay, "storiesDisplay");
        Intrinsics.checkNotNullParameter(webViewDisplay, "webViewDisplay");
        Intrinsics.checkNotNullParameter(cbottomDisplayCreator, "cbottomDisplayCreator");
        Intrinsics.checkNotNullParameter(pdfDisplay, "pdfDisplay");
        return new K40.c(cbottomMapper2, fullDisplay, screenDisplay, modalDisplay, onboardingSlidesDisplay, sheetDisplay, snackbarDisplay, storiesDisplay, webViewDisplay, cbottomDisplayCreator, pdfDisplay);
    }
}
