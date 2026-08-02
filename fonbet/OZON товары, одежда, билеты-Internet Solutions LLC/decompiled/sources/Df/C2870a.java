package Df;

import Cf.C2759a;
import Cf.c;
import Ef.d;
import Ef.h;
import Ef.n;
import Hf.AbstractC3139b;
import Jf.AbstractC3395a;
import Jf.b;
import Jf.e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Df.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2870a extends AbstractC3395a {

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f6682c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f6683d;

    /* renamed from: a, reason: collision with root package name */
    private final C2759a f6680a = new C2759a();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f6681b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f6684e = true;

    /* renamed from: Df.a$a, reason: collision with other inner class name */
    public static class C0138a extends b {
        /* JADX WARN: Code restructure failed: missing block: B:77:0x00ac, code lost:
        
            if (r6 == false) goto L57;
         */
        @Override // Jf.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final d a(h hVar, e eVar) {
            boolean z11;
            boolean z12;
            CharSequence n11 = hVar.n();
            StringBuilder a11 = eVar.a();
            if (a11 != null && a11.toString().contains("|") && !a11.toString().contains("\n")) {
                CharSequence subSequence = n11.subSequence(hVar.m(), n11.length());
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                boolean z13 = false;
                int i12 = 0;
                while (true) {
                    if (i11 < subSequence.length()) {
                        char charAt = subSequence.charAt(i11);
                        if (charAt == '\t' || charAt == ' ') {
                            i11++;
                        } else if (charAt == '-' || charAt == ':') {
                            if (i12 == 0 && !arrayList.isEmpty()) {
                                break;
                            }
                            if (charAt == ':') {
                                i11++;
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            boolean z14 = false;
                            while (i11 < subSequence.length() && subSequence.charAt(i11) == '-') {
                                i11++;
                                z14 = true;
                            }
                            if (!z14) {
                                break;
                            }
                            if (i11 >= subSequence.length() || subSequence.charAt(i11) != ':') {
                                z12 = false;
                            } else {
                                i11++;
                                z12 = true;
                            }
                            arrayList.add((z11 && z12) ? c.a.CENTER : z11 ? c.a.LEFT : z12 ? c.a.RIGHT : null);
                            i12 = 0;
                        } else {
                            if (charAt != '|') {
                                break;
                            }
                            i11++;
                            i12++;
                            if (i12 > 1) {
                                break;
                            }
                            z13 = true;
                        }
                    }
                }
                arrayList = null;
                if (arrayList != null && !arrayList.isEmpty()) {
                    ArrayList k11 = C2870a.k(a11);
                    if (arrayList.size() >= k11.size()) {
                        d dVar = new d(new C2870a(arrayList, k11));
                        dVar.b(hVar.m());
                        dVar.h();
                        return dVar;
                    }
                }
            }
            return null;
        }
    }

    C2870a(ArrayList arrayList, ArrayList arrayList2) {
        this.f6682c = arrayList;
        this.f6683d = arrayList2;
    }

    private c j(String str, int i11, n nVar) {
        c cVar = new c();
        ArrayList arrayList = this.f6682c;
        if (i11 < arrayList.size()) {
            cVar.o((c.a) arrayList.get(i11));
        }
        nVar.f(str.trim(), cVar);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList k(CharSequence charSequence) {
        String trim = charSequence.toString().trim();
        if (trim.startsWith("|")) {
            trim = trim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i11 < trim.length()) {
            char charAt = trim.charAt(i11);
            if (charAt == '\\') {
                int i12 = i11 + 1;
                if (i12 >= trim.length() || trim.charAt(i12) != '|') {
                    sb2.append('\\');
                } else {
                    sb2.append('|');
                    i11 = i12;
                }
            } else if (charAt != '|') {
                sb2.append(charAt);
            } else {
                arrayList.add(sb2.toString());
                sb2.setLength(0);
            }
            i11++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final void a(n nVar) {
        ArrayList arrayList = this.f6683d;
        int size = arrayList.size();
        Cf.d dVar = new Cf.d();
        C2759a c2759a = this.f6680a;
        c2759a.b(dVar);
        Cf.e eVar = new Cf.e();
        dVar.b(eVar);
        for (int i11 = 0; i11 < size; i11++) {
            c j11 = j((String) arrayList.get(i11), i11, nVar);
            j11.p();
            eVar.b(j11);
        }
        Iterator it = this.f6681b.iterator();
        Cf.b bVar = null;
        while (it.hasNext()) {
            ArrayList k11 = k((CharSequence) it.next());
            Cf.e eVar2 = new Cf.e();
            int i12 = 0;
            while (i12 < size) {
                eVar2.b(j(i12 < k11.size() ? (String) k11.get(i12) : "", i12, nVar));
                i12++;
            }
            if (bVar == null) {
                bVar = new Cf.b();
                c2759a.b(bVar);
            }
            bVar.b(eVar2);
        }
    }

    @Override // Jf.c
    public final AbstractC3139b e() {
        return this.f6680a;
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final void f(CharSequence charSequence) {
        if (this.f6684e) {
            this.f6684e = false;
        } else {
            this.f6681b.add(charSequence);
        }
    }

    @Override // Jf.c
    public final Ef.b h(h hVar) {
        if (hVar.n().toString().contains("|")) {
            return Ef.b.a(hVar.m());
        }
        return null;
    }
}
