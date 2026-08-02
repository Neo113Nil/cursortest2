package A0;

import java.util.ArrayList;

/* renamed from: A0.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038j1 implements z0.o0 {

    /* renamed from: k, reason: collision with root package name */
    public final int f518k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f519l;

    /* renamed from: m, reason: collision with root package name */
    public Float f520m = null;

    /* renamed from: n, reason: collision with root package name */
    public Float f521n = null;

    /* renamed from: o, reason: collision with root package name */
    public H0.h f522o = null;

    /* renamed from: p, reason: collision with root package name */
    public H0.h f523p = null;

    public C0038j1(int i, ArrayList arrayList) {
        this.f518k = i;
        this.f519l = arrayList;
    }

    @Override // z0.o0
    public final boolean z() {
        return this.f519l.contains(this);
    }
}
