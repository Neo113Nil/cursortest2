package androidx.media3.exoplayer.hls;

import N3.C3659j;
import N3.InterfaceC3665p;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.AbstractC5880y;
import g4.C6622d;
import h4.C6798d;
import j3.C7272n;
import j3.t;
import j3.u;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k4.o;
import m3.C8056I;
import u4.C9948b;
import u4.C9950d;
import u4.C9953g;
import u4.C9955i;
import u4.I;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f43905c = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: a, reason: collision with root package name */
    private k4.e f43906a = new k4.e();

    /* renamed from: b, reason: collision with root package name */
    private boolean f43907b;

    private static void a(int i11, ArrayList arrayList) {
        int[] iArr = f43905c;
        int i12 = 0;
        while (true) {
            if (i12 >= 7) {
                i12 = -1;
                break;
            } else if (iArr[i12] == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 == -1 || arrayList.contains(Integer.valueOf(i11))) {
            return;
        }
        arrayList.add(Integer.valueOf(i11));
    }

    public final b b(Uri uri, C7272n c7272n, List list, C8056I c8056i, Map map, C3659j c3659j) throws IOException {
        InterfaceC3665p interfaceC3665p;
        int i11;
        InterfaceC3665p c9948b;
        boolean z11;
        boolean z12;
        InterfaceC3665p c6798d;
        List singletonList;
        int i12;
        C7272n c7272n2 = c7272n;
        C8056I c8056i2 = c8056i;
        int b11 = Fl0.b.b(c7272n2.f69127o);
        List list2 = (List) map.get("Content-Type");
        InterfaceC3665p interfaceC3665p2 = null;
        int b12 = Fl0.b.b((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
        int c11 = Fl0.b.c(uri);
        int i13 = 7;
        ArrayList arrayList = new ArrayList(7);
        a(b11, arrayList);
        a(b12, arrayList);
        a(c11, arrayList);
        int[] iArr = f43905c;
        for (int i14 = 0; i14 < 7; i14++) {
            a(iArr[i14], arrayList);
        }
        c3659j.e();
        int i15 = 0;
        while (i15 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i15)).intValue();
            if (intValue == 0) {
                interfaceC3665p = interfaceC3665p2;
                i11 = intValue;
                c9948b = new C9948b();
            } else if (intValue == 1) {
                interfaceC3665p = interfaceC3665p2;
                i11 = intValue;
                c9948b = new C9950d();
            } else if (intValue == 2) {
                interfaceC3665p = interfaceC3665p2;
                i11 = intValue;
                c9948b = new C9953g();
            } else if (intValue != i13) {
                o.a aVar = o.a.f70474a;
                if (intValue == 8) {
                    interfaceC3665p = interfaceC3665p2;
                    i11 = intValue;
                    C8056I c8056i3 = c8056i2;
                    k4.e eVar = this.f43906a;
                    boolean z13 = this.f43907b;
                    t tVar = c7272n2.f69124l;
                    if (tVar != null) {
                        for (int i16 = 0; i16 < tVar.e(); i16++) {
                            t.a d11 = tVar.d(i16);
                            if (d11 instanceof x3.d) {
                                z12 = !((x3.d) d11).f104953c.isEmpty();
                                break;
                            }
                        }
                    }
                    z12 = false;
                    int i17 = z12 ? 4 : 0;
                    if (z13) {
                        aVar = eVar;
                    } else {
                        i17 |= 32;
                    }
                    c6798d = new C6798d(aVar, i17, c8056i3, list != null ? list : AbstractC5880y.v());
                } else if (intValue == 11) {
                    k4.e eVar2 = this.f43906a;
                    boolean z14 = this.f43907b;
                    if (list != null) {
                        i12 = 48;
                        singletonList = list;
                    } else {
                        C7272n.a aVar2 = new C7272n.a();
                        aVar2.y0("application/cea-608");
                        singletonList = Collections.singletonList(aVar2.P());
                        i12 = 16;
                    }
                    String str = c7272n2.f69123k;
                    if (TextUtils.isEmpty(str)) {
                        interfaceC3665p = interfaceC3665p2;
                    } else {
                        interfaceC3665p = interfaceC3665p2;
                        if (u.b(str, "audio/mp4a-latm") == null) {
                            i12 |= 2;
                        }
                        if (u.b(str, "video/avc") == null) {
                            i12 |= 4;
                        }
                    }
                    if (z14) {
                        aVar = eVar2;
                    }
                    i11 = intValue;
                    c6798d = new I(2, !z14 ? 1 : 0, aVar, c8056i, new C9955i(i12, singletonList));
                } else if (intValue != 13) {
                    interfaceC3665p = interfaceC3665p2;
                    i11 = intValue;
                    c9948b = null;
                } else {
                    c9948b = new x3.g(c7272n2.f69116d, c8056i2, this.f43906a, this.f43907b);
                    interfaceC3665p = interfaceC3665p2;
                    i11 = intValue;
                }
                c9948b = c6798d;
            } else {
                interfaceC3665p = interfaceC3665p2;
                i11 = intValue;
                c9948b = new C6622d(0L);
            }
            c9948b.getClass();
            try {
                z11 = c9948b.d(c3659j);
                c3659j.e();
            } catch (EOFException unused) {
                c3659j.e();
                z11 = false;
            } catch (Throwable th2) {
                c3659j.e();
                throw th2;
            }
            if (z11) {
                return new b(c9948b, c7272n2, c8056i, this.f43906a, this.f43907b);
            }
            interfaceC3665p2 = (interfaceC3665p == null && (i11 == b11 || i11 == b12 || i11 == c11 || i11 == 11)) ? c9948b : interfaceC3665p;
            i15++;
            c7272n2 = c7272n;
            c8056i2 = c8056i;
            i13 = 7;
        }
        InterfaceC3665p interfaceC3665p3 = interfaceC3665p2;
        interfaceC3665p3.getClass();
        return new b(interfaceC3665p3, c7272n, c8056i, this.f43906a, this.f43907b);
    }

    public final c c(boolean z11) {
        this.f43907b = z11;
        return this;
    }

    public final C7272n d(C7272n c7272n) {
        if (!this.f43907b || !this.f43906a.e(c7272n)) {
            return c7272n;
        }
        C7272n.a a11 = c7272n.a();
        a11.y0("application/x-media3-cues");
        a11.Y(this.f43906a.a(c7272n));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c7272n.f69127o);
        String str = c7272n.f69123k;
        sb2.append(str != null ? " ".concat(str) : "");
        a11.U(sb2.toString());
        a11.C0(Long.MAX_VALUE);
        return a11.P();
    }

    public final c e(k4.e eVar) {
        this.f43906a = eVar;
        return this;
    }
}
