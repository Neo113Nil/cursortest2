package p149v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p154w.g;
import p154w.m;

/* JADX INFO: loaded from: classes.dex */
public class j extends e {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public e[] f17061u0 = new e[4];

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f17062v0 = 0;

    public final void S(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i7 = this.f17062v0 + 1;
        e[] eVarArr = this.f17061u0;
        if (i7 > eVarArr.length) {
            this.f17061u0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f17061u0;
        int i8 = this.f17062v0;
        eVarArr2[i8] = eVar;
        this.f17062v0 = i8 + 1;
    }

    public final void T(int i7, ArrayList arrayList, m mVar) {
        for (int i8 = 0; i8 < this.f17062v0; i8++) {
            e eVar = this.f17061u0[i8];
            ArrayList arrayList2 = mVar.f17250a;
            if (!arrayList2.contains(eVar)) {
                arrayList2.add(eVar);
            }
        }
        for (int i9 = 0; i9 < this.f17062v0; i9++) {
            g.b(this.f17061u0[i9], i7, arrayList, mVar);
        }
    }

    @Override // p149v.e
    public void g(e eVar, HashMap map) {
        super.g(eVar, map);
        j jVar = (j) eVar;
        this.f17062v0 = 0;
        int i7 = jVar.f17062v0;
        for (int i8 = 0; i8 < i7; i8++) {
            S((e) map.get(jVar.f17061u0[i8]));
        }
    }

    public void U() {
    }
}
