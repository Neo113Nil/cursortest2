package P1;

import A1.X;
import C0.J;
import C1.C0095a;
import android.util.Log;
import com.google.android.exoplayer2.Format$Builder;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f5208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5209g;

    public g(List list) {
        this.f5203a = 0;
        this.f5208f = list;
        this.f5209g = new F1.v[list.size()];
        this.f5205c = -9223372036854775807L;
    }

    @Override // P1.h
    public final void a(C0095a c0095a) {
        boolean z4;
        boolean z7;
        switch (this.f5203a) {
            case 0:
                if (this.f5204b) {
                    if (this.f5206d == 2) {
                        if (c0095a.d() == 0) {
                            z7 = false;
                        } else {
                            if (c0095a.t() != 32) {
                                this.f5204b = false;
                            }
                            this.f5206d--;
                            z7 = this.f5204b;
                        }
                        if (!z7) {
                        }
                    }
                    if (this.f5206d == 1) {
                        if (c0095a.d() == 0) {
                            z4 = false;
                        } else {
                            if (c0095a.t() != 0) {
                                this.f5204b = false;
                            }
                            this.f5206d--;
                            z4 = this.f5204b;
                        }
                        if (!z4) {
                        }
                    }
                    int i7 = c0095a.f1463a;
                    int iD = c0095a.d();
                    for (F1.v vVar : (F1.v[]) this.f5209g) {
                        c0095a.D(i7);
                        vVar.c(iD, c0095a);
                    }
                    this.f5207e += iD;
                }
                break;
            default:
                p151v2.a.i((F1.v) this.f5209g);
                if (this.f5204b) {
                    int iD2 = c0095a.d();
                    int i8 = this.f5207e;
                    if (i8 < 10) {
                        int iMin = Math.min(iD2, 10 - i8);
                        byte[] bArr = (byte[]) c0095a.f1465c;
                        int i9 = c0095a.f1463a;
                        C0095a c0095a2 = (C0095a) this.f5208f;
                        System.arraycopy(bArr, i9, (byte[]) c0095a2.f1465c, this.f5207e, iMin);
                        if (this.f5207e + iMin == 10) {
                            c0095a2.D(0);
                            if (73 == c0095a2.t() && 68 == c0095a2.t() && 51 == c0095a2.t()) {
                                c0095a2.E(3);
                                this.f5206d = c0095a2.s() + 10;
                            } else {
                                Log.w("Id3Reader", "Discarding invalid ID3 tag");
                                this.f5204b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iD2, this.f5206d - this.f5207e);
                    ((F1.v) this.f5209g).c(iMin2, c0095a);
                    this.f5207e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // P1.h
    public final void b() {
        switch (this.f5203a) {
            case 0:
                this.f5204b = false;
                this.f5205c = -9223372036854775807L;
                break;
            default:
                this.f5204b = false;
                this.f5205c = -9223372036854775807L;
                break;
        }
    }

    @Override // P1.h
    public final void c(F1.m mVar, J j) {
        switch (this.f5203a) {
            case 0:
                int i7 = 0;
                while (true) {
                    F1.v[] vVarArr = (F1.v[]) this.f5209g;
                    if (i7 < vVarArr.length) {
                        D d7 = (D) ((List) this.f5208f).get(i7);
                        j.a();
                        j.d();
                        F1.v vVarR = mVar.r(j.f1236c, 3);
                        Format$Builder format$Builder = new Format$Builder();
                        j.d();
                        format$Builder.f10528a = (String) j.f1238e;
                        format$Builder.f10537k = "application/dvbsubs";
                        format$Builder.f10539m = Collections.singletonList(d7.f5142b);
                        format$Builder.f10530c = d7.f5141a;
                        vVarR.a(new X(format$Builder));
                        vVarArr[i7] = vVarR;
                        i7++;
                    }
                    break;
                }
                break;
            default:
                j.a();
                j.d();
                F1.v vVarR2 = mVar.r(j.f1236c, 5);
                this.f5209g = vVarR2;
                Format$Builder format$Builder2 = new Format$Builder();
                j.d();
                format$Builder2.f10528a = (String) j.f1238e;
                format$Builder2.f10537k = "application/id3";
                vVarR2.a(new X(format$Builder2));
                break;
        }
    }

    @Override // P1.h
    public final void d() {
        int i7;
        switch (this.f5203a) {
            case 0:
                if (this.f5204b) {
                    if (this.f5205c != -9223372036854775807L) {
                        for (F1.v vVar : (F1.v[]) this.f5209g) {
                            vVar.e(this.f5205c, 1, this.f5207e, 0, null);
                        }
                    }
                    this.f5204b = false;
                }
                break;
            default:
                p151v2.a.i((F1.v) this.f5209g);
                if (this.f5204b && (i7 = this.f5206d) != 0 && this.f5207e == i7) {
                    long j = this.f5205c;
                    if (j != -9223372036854775807L) {
                        ((F1.v) this.f5209g).e(j, 1, i7, 0, null);
                    }
                    this.f5204b = false;
                    break;
                }
                break;
        }
    }

    @Override // P1.h
    public final void e(int i7, long j) {
        switch (this.f5203a) {
            case 0:
                if ((i7 & 4) != 0) {
                    this.f5204b = true;
                    if (j != -9223372036854775807L) {
                        this.f5205c = j;
                    }
                    this.f5207e = 0;
                    this.f5206d = 2;
                    break;
                }
                break;
            default:
                if ((i7 & 4) != 0) {
                    this.f5204b = true;
                    if (j != -9223372036854775807L) {
                        this.f5205c = j;
                    }
                    this.f5206d = 0;
                    this.f5207e = 0;
                    break;
                }
                break;
        }
    }

    public g() {
        this.f5203a = 1;
        this.f5208f = new C0095a(10);
        this.f5205c = -9223372036854775807L;
    }
}
