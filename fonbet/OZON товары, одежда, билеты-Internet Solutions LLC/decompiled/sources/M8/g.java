package M8;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class g implements Externalizable {

    /* renamed from: A, reason: collision with root package name */
    private boolean f17645A;

    /* renamed from: C, reason: collision with root package name */
    private boolean f17647C;

    /* renamed from: E, reason: collision with root package name */
    private boolean f17649E;

    /* renamed from: G, reason: collision with root package name */
    private boolean f17651G;

    /* renamed from: L, reason: collision with root package name */
    private boolean f17656L;

    /* renamed from: N, reason: collision with root package name */
    private boolean f17658N;

    /* renamed from: P, reason: collision with root package name */
    private boolean f17660P;

    /* renamed from: R, reason: collision with root package name */
    private boolean f17662R;

    /* renamed from: X, reason: collision with root package name */
    private boolean f17664X;

    /* renamed from: a, reason: collision with root package name */
    private boolean f17667a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17669c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17671e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17673g;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17675i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17677k;

    /* renamed from: m, reason: collision with root package name */
    private boolean f17679m;

    /* renamed from: o, reason: collision with root package name */
    private boolean f17681o;

    /* renamed from: q, reason: collision with root package name */
    private boolean f17683q;

    /* renamed from: s, reason: collision with root package name */
    private boolean f17686s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f17690u;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f17691u0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f17694w;

    /* renamed from: y, reason: collision with root package name */
    private boolean f17697y;

    /* renamed from: b, reason: collision with root package name */
    private i f17668b = null;

    /* renamed from: d, reason: collision with root package name */
    private i f17670d = null;

    /* renamed from: f, reason: collision with root package name */
    private i f17672f = null;

    /* renamed from: h, reason: collision with root package name */
    private i f17674h = null;

    /* renamed from: j, reason: collision with root package name */
    private i f17676j = null;

    /* renamed from: l, reason: collision with root package name */
    private i f17678l = null;

    /* renamed from: n, reason: collision with root package name */
    private i f17680n = null;

    /* renamed from: p, reason: collision with root package name */
    private i f17682p = null;

    /* renamed from: r, reason: collision with root package name */
    private i f17684r = null;

    /* renamed from: t, reason: collision with root package name */
    private i f17688t = null;

    /* renamed from: v, reason: collision with root package name */
    private i f17692v = null;

    /* renamed from: x, reason: collision with root package name */
    private i f17696x = null;

    /* renamed from: z, reason: collision with root package name */
    private i f17698z = null;

    /* renamed from: B, reason: collision with root package name */
    private i f17646B = null;

    /* renamed from: D, reason: collision with root package name */
    private i f17648D = null;

    /* renamed from: F, reason: collision with root package name */
    private i f17650F = null;

    /* renamed from: H, reason: collision with root package name */
    private i f17652H = null;

    /* renamed from: I, reason: collision with root package name */
    private String f17653I = "";

    /* renamed from: J, reason: collision with root package name */
    private int f17654J = 0;

    /* renamed from: K, reason: collision with root package name */
    private String f17655K = "";

    /* renamed from: M, reason: collision with root package name */
    private String f17657M = "";

    /* renamed from: O, reason: collision with root package name */
    private String f17659O = "";

    /* renamed from: Q, reason: collision with root package name */
    private String f17661Q = "";

    /* renamed from: S, reason: collision with root package name */
    private String f17663S = "";

    /* renamed from: Y, reason: collision with root package name */
    private String f17665Y = "";

    /* renamed from: Z, reason: collision with root package name */
    private boolean f17666Z = false;

    /* renamed from: r0, reason: collision with root package name */
    private ArrayList f17685r0 = new ArrayList();

    /* renamed from: s0, reason: collision with root package name */
    private ArrayList f17687s0 = new ArrayList();

    /* renamed from: t0, reason: collision with root package name */
    private boolean f17689t0 = false;

    /* renamed from: v0, reason: collision with root package name */
    private String f17693v0 = "";

    /* renamed from: w0, reason: collision with root package name */
    private boolean f17695w0 = false;

    public static final class a extends g {
        public final void I() {
            super.G("<ignored>");
        }

        public final void J() {
            super.H("NA");
        }
    }

    public final i A() {
        return this.f17674h;
    }

    public final i B() {
        return this.f17688t;
    }

    public final i C() {
        return this.f17696x;
    }

    public final i D() {
        return this.f17682p;
    }

    public final boolean E() {
        return this.f17691u0;
    }

    public final boolean F() {
        return this.f17662R;
    }

    public void G(String str) {
        this.f17653I = str;
    }

    public void H(String str) {
        this.f17655K = str;
    }

    public final int a() {
        return this.f17654J;
    }

    public final i b() {
        return this.f17670d;
    }

    public final i d() {
        return this.f17668b;
    }

    public final String e() {
        return this.f17653I;
    }

    public final String f() {
        return this.f17655K;
    }

    public final int g() {
        return this.f17687s0.size();
    }

    public final ArrayList h() {
        return this.f17687s0;
    }

    public final String i() {
        return this.f17693v0;
    }

    public final i j() {
        return this.f17672f;
    }

    public final String l() {
        return this.f17663S;
    }

    public final String m() {
        return this.f17665Y;
    }

    public final ArrayList n() {
        return this.f17685r0;
    }

    public final i p() {
        return this.f17684r;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            i iVar = new i();
            iVar.readExternal(objectInput);
            this.f17667a = true;
            this.f17668b = iVar;
        }
        if (objectInput.readBoolean()) {
            i iVar2 = new i();
            iVar2.readExternal(objectInput);
            this.f17669c = true;
            this.f17670d = iVar2;
        }
        if (objectInput.readBoolean()) {
            i iVar3 = new i();
            iVar3.readExternal(objectInput);
            this.f17671e = true;
            this.f17672f = iVar3;
        }
        if (objectInput.readBoolean()) {
            i iVar4 = new i();
            iVar4.readExternal(objectInput);
            this.f17673g = true;
            this.f17674h = iVar4;
        }
        if (objectInput.readBoolean()) {
            i iVar5 = new i();
            iVar5.readExternal(objectInput);
            this.f17675i = true;
            this.f17676j = iVar5;
        }
        if (objectInput.readBoolean()) {
            i iVar6 = new i();
            iVar6.readExternal(objectInput);
            this.f17677k = true;
            this.f17678l = iVar6;
        }
        if (objectInput.readBoolean()) {
            i iVar7 = new i();
            iVar7.readExternal(objectInput);
            this.f17679m = true;
            this.f17680n = iVar7;
        }
        if (objectInput.readBoolean()) {
            i iVar8 = new i();
            iVar8.readExternal(objectInput);
            this.f17681o = true;
            this.f17682p = iVar8;
        }
        if (objectInput.readBoolean()) {
            i iVar9 = new i();
            iVar9.readExternal(objectInput);
            this.f17683q = true;
            this.f17684r = iVar9;
        }
        if (objectInput.readBoolean()) {
            i iVar10 = new i();
            iVar10.readExternal(objectInput);
            this.f17686s = true;
            this.f17688t = iVar10;
        }
        if (objectInput.readBoolean()) {
            i iVar11 = new i();
            iVar11.readExternal(objectInput);
            this.f17690u = true;
            this.f17692v = iVar11;
        }
        if (objectInput.readBoolean()) {
            i iVar12 = new i();
            iVar12.readExternal(objectInput);
            this.f17694w = true;
            this.f17696x = iVar12;
        }
        if (objectInput.readBoolean()) {
            i iVar13 = new i();
            iVar13.readExternal(objectInput);
            this.f17697y = true;
            this.f17698z = iVar13;
        }
        if (objectInput.readBoolean()) {
            i iVar14 = new i();
            iVar14.readExternal(objectInput);
            this.f17645A = true;
            this.f17646B = iVar14;
        }
        if (objectInput.readBoolean()) {
            i iVar15 = new i();
            iVar15.readExternal(objectInput);
            this.f17647C = true;
            this.f17648D = iVar15;
        }
        if (objectInput.readBoolean()) {
            i iVar16 = new i();
            iVar16.readExternal(objectInput);
            this.f17649E = true;
            this.f17650F = iVar16;
        }
        if (objectInput.readBoolean()) {
            i iVar17 = new i();
            iVar17.readExternal(objectInput);
            this.f17651G = true;
            this.f17652H = iVar17;
        }
        G(objectInput.readUTF());
        this.f17654J = objectInput.readInt();
        H(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f17656L = true;
            this.f17657M = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f17658N = true;
            this.f17659O = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.f17660P = true;
            this.f17661Q = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.f17662R = true;
            this.f17663S = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.f17664X = true;
            this.f17665Y = readUTF5;
        }
        this.f17666Z = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            f fVar = new f();
            fVar.readExternal(objectInput);
            this.f17685r0.add(fVar);
        }
        int readInt2 = objectInput.readInt();
        for (int i12 = 0; i12 < readInt2; i12++) {
            f fVar2 = new f();
            fVar2.readExternal(objectInput);
            this.f17687s0.add(fVar2);
        }
        this.f17689t0 = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.f17691u0 = true;
            this.f17693v0 = readUTF6;
        }
        this.f17695w0 = objectInput.readBoolean();
    }

    public final i s() {
        return this.f17680n;
    }

    public final i u() {
        return this.f17676j;
    }

    public final boolean v() {
        return this.f17666Z;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f17667a);
        if (this.f17667a) {
            this.f17668b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17669c);
        if (this.f17669c) {
            this.f17670d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17671e);
        if (this.f17671e) {
            this.f17672f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17673g);
        if (this.f17673g) {
            this.f17674h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17675i);
        if (this.f17675i) {
            this.f17676j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17677k);
        if (this.f17677k) {
            this.f17678l.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17679m);
        if (this.f17679m) {
            this.f17680n.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17681o);
        if (this.f17681o) {
            this.f17682p.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17683q);
        if (this.f17683q) {
            this.f17684r.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17686s);
        if (this.f17686s) {
            this.f17688t.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17690u);
        if (this.f17690u) {
            this.f17692v.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17694w);
        if (this.f17694w) {
            this.f17696x.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17697y);
        if (this.f17697y) {
            this.f17698z.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17645A);
        if (this.f17645A) {
            this.f17646B.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17647C);
        if (this.f17647C) {
            this.f17648D.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17649E);
        if (this.f17649E) {
            this.f17650F.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17651G);
        if (this.f17651G) {
            this.f17652H.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.f17653I);
        objectOutput.writeInt(this.f17654J);
        objectOutput.writeUTF(this.f17655K);
        objectOutput.writeBoolean(this.f17656L);
        if (this.f17656L) {
            objectOutput.writeUTF(this.f17657M);
        }
        objectOutput.writeBoolean(this.f17658N);
        if (this.f17658N) {
            objectOutput.writeUTF(this.f17659O);
        }
        objectOutput.writeBoolean(this.f17660P);
        if (this.f17660P) {
            objectOutput.writeUTF(this.f17661Q);
        }
        objectOutput.writeBoolean(this.f17662R);
        if (this.f17662R) {
            objectOutput.writeUTF(this.f17663S);
        }
        objectOutput.writeBoolean(this.f17664X);
        if (this.f17664X) {
            objectOutput.writeUTF(this.f17665Y);
        }
        objectOutput.writeBoolean(this.f17666Z);
        ArrayList arrayList = this.f17685r0;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((f) arrayList.get(i11)).writeExternal(objectOutput);
        }
        int size2 = this.f17687s0.size();
        objectOutput.writeInt(size2);
        for (int i12 = 0; i12 < size2; i12++) {
            ((f) this.f17687s0.get(i12)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f17689t0);
        objectOutput.writeBoolean(this.f17691u0);
        if (this.f17691u0) {
            objectOutput.writeUTF(this.f17693v0);
        }
        objectOutput.writeBoolean(this.f17695w0);
    }

    public final i y() {
        return this.f17678l;
    }
}
