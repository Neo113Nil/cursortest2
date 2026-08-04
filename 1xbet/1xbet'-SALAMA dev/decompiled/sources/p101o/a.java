package p101o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f15521e = new HashMap();

    @Override // p101o.f
    public final c l(Object obj) {
        return (c) this.f15521e.get(obj);
    }

    @Override // p101o.f
    public final Object m(Object obj) {
        Object objM = super.m(obj);
        this.f15521e.remove(obj);
        return objM;
    }
}
