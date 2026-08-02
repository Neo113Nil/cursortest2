package v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1659j extends C1654e {

    /* renamed from: u0, reason: collision with root package name */
    public C1654e[] f17055u0 = new C1654e[4];

    /* renamed from: v0, reason: collision with root package name */
    public int f17056v0 = 0;

    public final void S(C1654e c1654e) {
        if (c1654e == this || c1654e == null) {
            return;
        }
        int i7 = this.f17056v0 + 1;
        C1654e[] c1654eArr = this.f17055u0;
        if (i7 > c1654eArr.length) {
            this.f17055u0 = (C1654e[]) Arrays.copyOf(c1654eArr, c1654eArr.length * 2);
        }
        C1654e[] c1654eArr2 = this.f17055u0;
        int i8 = this.f17056v0;
        c1654eArr2[i8] = c1654e;
        this.f17056v0 = i8 + 1;
    }

    public final void T(int i7, ArrayList arrayList, w.m mVar) {
        for (int i8 = 0; i8 < this.f17056v0; i8++) {
            C1654e c1654e = this.f17055u0[i8];
            ArrayList arrayList2 = mVar.f17244a;
            if (!arrayList2.contains(c1654e)) {
                arrayList2.add(c1654e);
            }
        }
        for (int i9 = 0; i9 < this.f17056v0; i9++) {
            w.g.b(this.f17055u0[i9], i7, arrayList, mVar);
        }
    }

    @Override // v.C1654e
    public void g(C1654e c1654e, HashMap hashMap) {
        super.g(c1654e, hashMap);
        C1659j c1659j = (C1659j) c1654e;
        this.f17056v0 = 0;
        int i7 = c1659j.f17056v0;
        for (int i8 = 0; i8 < i7; i8++) {
            S((C1654e) hashMap.get(c1659j.f17055u0[i8]));
        }
    }

    public void U() {
    }
}
