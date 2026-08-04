package A1;

import java.util.ArrayList;
import p018c2.AbstractC0755a;
import p018c2.C0778y;

/* JADX INFO: renamed from: A1.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0041r0 implements InterfaceC0036o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0778y f544a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f548e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f546c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f545b = new Object();

    public C0041r0(AbstractC0755a abstractC0755a, boolean z4) {
        this.f544a = new C0778y(abstractC0755a, z4);
    }

    @Override // A1.InterfaceC0036o0
    public final Object a() {
        return this.f545b;
    }

    @Override // A1.InterfaceC0036o0
    public final R0 b() {
        return this.f544a.f10421o;
    }
}
