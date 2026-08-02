package E5;

import a.AbstractC0603a;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzbl;
import e4.AbstractC1037k;
import e4.C1029c;
import e4.C1040n;
import f4.C1091c;
import f4.C1094f;
import java.util.ArrayList;
import java.util.Iterator;
import n3.AbstractC1464a;
import w1.F0;
import w1.V0;

/* loaded from: classes2.dex */
public interface B {
    static void b(A5.f fVar, final B b7) {
        C0201t c0201t = C0201t.f2406i;
        Object obj = null;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollPhone", c0201t, obj, 1);
        if (b7 != null) {
            final int i7 = 0;
            f02.M(new A5.b(b7) { // from class: E5.A

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ B f2258b;

                {
                    this.f2258b = b7;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v0, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    ArrayList arrayList;
                    switch (i7) {
                        case 0:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            C0197o c0197o = (C0197o) arrayList3.get(0);
                            L l7 = (L) arrayList3.get(1);
                            String str = (String) arrayList3.get(2);
                            C0199q c0199q = new C0199q(arrayList2, v02, 15);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C0195m.c(c0197o).a(new C1040n(PhoneAuthCredential.n(l7.f2297a, l7.f2298b)), str).addOnCompleteListener(new C0185c(c0199q, 23));
                                break;
                            } catch (P4.a e7) {
                                c0199q.a(e7);
                                return;
                            }
                        case 1:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            C0197o c0197o2 = (C0197o) arrayList5.get(0);
                            String str2 = (String) arrayList5.get(1);
                            String str3 = (String) arrayList5.get(2);
                            r rVar = new r(arrayList4, v02, 15);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C0195m.c(c0197o2).a((AbstractC1037k) C0195m.f2389d.get(str2), str3).addOnCompleteListener(new C0185c(rVar, 21));
                                break;
                            } catch (P4.a e8) {
                                rVar.a(e8);
                                return;
                            }
                        case 2:
                            ArrayList arrayList6 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj2).get(0);
                            C0199q c0199q2 = new C0199q(arrayList6, v02, 16);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C1094f c3 = C0195m.c(c0197o3);
                                zzad zzadVar = c3.f12935a;
                                zzadVar.getClass();
                                FirebaseAuth.getInstance(Y3.i.f(zzadVar.f11910c)).h(zzadVar, false).continueWithTask(new C1091c(c3, 1)).addOnCompleteListener(new C0185c(c0199q2, 20));
                                break;
                            } catch (P4.a e9) {
                                c0199q2.a(e9);
                                return;
                            }
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList8.get(0);
                            String str4 = (String) arrayList8.get(1);
                            r rVar2 = new r(arrayList7, v02, 16);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C1094f c4 = C0195m.c(c0197o4);
                                c4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                zzad zzadVar2 = c4.f12935a;
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(zzadVar2.f11910c));
                                firebaseAuth.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth.f11853e.zza(firebaseAuth.f11849a, zzadVar2, str4, firebaseAuth.f11858k, (f4.z) new C1029c(firebaseAuth, 0)).continueWithTask(new B4.V(17)).addOnCompleteListener(new C0185c(rVar2, 22));
                                break;
                            } catch (P4.a e10) {
                                rVar2.a(Y4.D.L(e10));
                                return;
                            }
                        default:
                            ArrayList arrayList9 = new ArrayList();
                            C0197o c0197o5 = (C0197o) ((ArrayList) obj2).get(0);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                zzbl zzblVar = C0195m.c(c0197o5).f12935a.f11906C;
                                if (zzblVar != null) {
                                    arrayList = new ArrayList();
                                    Iterator it = zzblVar.f11930a.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add((PhoneMultiFactorInfo) it.next());
                                    }
                                    Iterator it2 = zzblVar.f11931b.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add((TotpMultiFactorInfo) it2.next());
                                    }
                                } else {
                                    arrayList = new ArrayList();
                                }
                                arrayList9.add(0, AbstractC1464a.I(arrayList));
                                v02.f(arrayList9);
                                break;
                            } catch (P4.a e11) {
                                v02.f(AbstractC0603a.v0(e11));
                            }
                    }
                }
            });
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollTotp", c0201t, obj, 1);
        if (b7 != null) {
            final int i8 = 1;
            f03.M(new A5.b(b7) { // from class: E5.A

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ B f2258b;

                {
                    this.f2258b = b7;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v0, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    ArrayList arrayList;
                    switch (i8) {
                        case 0:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            C0197o c0197o = (C0197o) arrayList3.get(0);
                            L l7 = (L) arrayList3.get(1);
                            String str = (String) arrayList3.get(2);
                            C0199q c0199q = new C0199q(arrayList2, v02, 15);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C0195m.c(c0197o).a(new C1040n(PhoneAuthCredential.n(l7.f2297a, l7.f2298b)), str).addOnCompleteListener(new C0185c(c0199q, 23));
                                break;
                            } catch (P4.a e7) {
                                c0199q.a(e7);
                                return;
                            }
                        case 1:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            C0197o c0197o2 = (C0197o) arrayList5.get(0);
                            String str2 = (String) arrayList5.get(1);
                            String str3 = (String) arrayList5.get(2);
                            r rVar = new r(arrayList4, v02, 15);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C0195m.c(c0197o2).a((AbstractC1037k) C0195m.f2389d.get(str2), str3).addOnCompleteListener(new C0185c(rVar, 21));
                                break;
                            } catch (P4.a e8) {
                                rVar.a(e8);
                                return;
                            }
                        case 2:
                            ArrayList arrayList6 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj2).get(0);
                            C0199q c0199q2 = new C0199q(arrayList6, v02, 16);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C1094f c3 = C0195m.c(c0197o3);
                                zzad zzadVar = c3.f12935a;
                                zzadVar.getClass();
                                FirebaseAuth.getInstance(Y3.i.f(zzadVar.f11910c)).h(zzadVar, false).continueWithTask(new C1091c(c3, 1)).addOnCompleteListener(new C0185c(c0199q2, 20));
                                break;
                            } catch (P4.a e9) {
                                c0199q2.a(e9);
                                return;
                            }
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList8.get(0);
                            String str4 = (String) arrayList8.get(1);
                            r rVar2 = new r(arrayList7, v02, 16);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C1094f c4 = C0195m.c(c0197o4);
                                c4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                zzad zzadVar2 = c4.f12935a;
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(zzadVar2.f11910c));
                                firebaseAuth.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth.f11853e.zza(firebaseAuth.f11849a, zzadVar2, str4, firebaseAuth.f11858k, (f4.z) new C1029c(firebaseAuth, 0)).continueWithTask(new B4.V(17)).addOnCompleteListener(new C0185c(rVar2, 22));
                                break;
                            } catch (P4.a e10) {
                                rVar2.a(Y4.D.L(e10));
                                return;
                            }
                        default:
                            ArrayList arrayList9 = new ArrayList();
                            C0197o c0197o5 = (C0197o) ((ArrayList) obj2).get(0);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                zzbl zzblVar = C0195m.c(c0197o5).f12935a.f11906C;
                                if (zzblVar != null) {
                                    arrayList = new ArrayList();
                                    Iterator it = zzblVar.f11930a.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add((PhoneMultiFactorInfo) it.next());
                                    }
                                    Iterator it2 = zzblVar.f11931b.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add((TotpMultiFactorInfo) it2.next());
                                    }
                                } else {
                                    arrayList = new ArrayList();
                                }
                                arrayList9.add(0, AbstractC1464a.I(arrayList));
                                v02.f(arrayList9);
                                break;
                            } catch (P4.a e11) {
                                v02.f(AbstractC0603a.v0(e11));
                            }
                    }
                }
            });
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getSession", c0201t, obj, 1);
        if (b7 != null) {
            final int i9 = 2;
            f04.M(new A5.b(b7) { // from class: E5.A

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ B f2258b;

                {
                    this.f2258b = b7;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v0, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    ArrayList arrayList;
                    switch (i9) {
                        case 0:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            C0197o c0197o = (C0197o) arrayList3.get(0);
                            L l7 = (L) arrayList3.get(1);
                            String str = (String) arrayList3.get(2);
                            C0199q c0199q = new C0199q(arrayList2, v02, 15);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C0195m.c(c0197o).a(new C1040n(PhoneAuthCredential.n(l7.f2297a, l7.f2298b)), str).addOnCompleteListener(new C0185c(c0199q, 23));
                                break;
                            } catch (P4.a e7) {
                                c0199q.a(e7);
                                return;
                            }
                        case 1:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            C0197o c0197o2 = (C0197o) arrayList5.get(0);
                            String str2 = (String) arrayList5.get(1);
                            String str3 = (String) arrayList5.get(2);
                            r rVar = new r(arrayList4, v02, 15);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C0195m.c(c0197o2).a((AbstractC1037k) C0195m.f2389d.get(str2), str3).addOnCompleteListener(new C0185c(rVar, 21));
                                break;
                            } catch (P4.a e8) {
                                rVar.a(e8);
                                return;
                            }
                        case 2:
                            ArrayList arrayList6 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj2).get(0);
                            C0199q c0199q2 = new C0199q(arrayList6, v02, 16);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C1094f c3 = C0195m.c(c0197o3);
                                zzad zzadVar = c3.f12935a;
                                zzadVar.getClass();
                                FirebaseAuth.getInstance(Y3.i.f(zzadVar.f11910c)).h(zzadVar, false).continueWithTask(new C1091c(c3, 1)).addOnCompleteListener(new C0185c(c0199q2, 20));
                                break;
                            } catch (P4.a e9) {
                                c0199q2.a(e9);
                                return;
                            }
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList8.get(0);
                            String str4 = (String) arrayList8.get(1);
                            r rVar2 = new r(arrayList7, v02, 16);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C1094f c4 = C0195m.c(c0197o4);
                                c4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                zzad zzadVar2 = c4.f12935a;
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(zzadVar2.f11910c));
                                firebaseAuth.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth.f11853e.zza(firebaseAuth.f11849a, zzadVar2, str4, firebaseAuth.f11858k, (f4.z) new C1029c(firebaseAuth, 0)).continueWithTask(new B4.V(17)).addOnCompleteListener(new C0185c(rVar2, 22));
                                break;
                            } catch (P4.a e10) {
                                rVar2.a(Y4.D.L(e10));
                                return;
                            }
                        default:
                            ArrayList arrayList9 = new ArrayList();
                            C0197o c0197o5 = (C0197o) ((ArrayList) obj2).get(0);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                zzbl zzblVar = C0195m.c(c0197o5).f12935a.f11906C;
                                if (zzblVar != null) {
                                    arrayList = new ArrayList();
                                    Iterator it = zzblVar.f11930a.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add((PhoneMultiFactorInfo) it.next());
                                    }
                                    Iterator it2 = zzblVar.f11931b.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add((TotpMultiFactorInfo) it2.next());
                                    }
                                } else {
                                    arrayList = new ArrayList();
                                }
                                arrayList9.add(0, AbstractC1464a.I(arrayList));
                                v02.f(arrayList9);
                                break;
                            } catch (P4.a e11) {
                                v02.f(AbstractC0603a.v0(e11));
                            }
                    }
                }
            });
        } else {
            f04.M(null);
        }
        F0 f05 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.unenroll", c0201t, obj, 1);
        if (b7 != null) {
            final int i10 = 3;
            f05.M(new A5.b(b7) { // from class: E5.A

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ B f2258b;

                {
                    this.f2258b = b7;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v0, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    ArrayList arrayList;
                    switch (i10) {
                        case 0:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            C0197o c0197o = (C0197o) arrayList3.get(0);
                            L l7 = (L) arrayList3.get(1);
                            String str = (String) arrayList3.get(2);
                            C0199q c0199q = new C0199q(arrayList2, v02, 15);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C0195m.c(c0197o).a(new C1040n(PhoneAuthCredential.n(l7.f2297a, l7.f2298b)), str).addOnCompleteListener(new C0185c(c0199q, 23));
                                break;
                            } catch (P4.a e7) {
                                c0199q.a(e7);
                                return;
                            }
                        case 1:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            C0197o c0197o2 = (C0197o) arrayList5.get(0);
                            String str2 = (String) arrayList5.get(1);
                            String str3 = (String) arrayList5.get(2);
                            r rVar = new r(arrayList4, v02, 15);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C0195m.c(c0197o2).a((AbstractC1037k) C0195m.f2389d.get(str2), str3).addOnCompleteListener(new C0185c(rVar, 21));
                                break;
                            } catch (P4.a e8) {
                                rVar.a(e8);
                                return;
                            }
                        case 2:
                            ArrayList arrayList6 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj2).get(0);
                            C0199q c0199q2 = new C0199q(arrayList6, v02, 16);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C1094f c3 = C0195m.c(c0197o3);
                                zzad zzadVar = c3.f12935a;
                                zzadVar.getClass();
                                FirebaseAuth.getInstance(Y3.i.f(zzadVar.f11910c)).h(zzadVar, false).continueWithTask(new C1091c(c3, 1)).addOnCompleteListener(new C0185c(c0199q2, 20));
                                break;
                            } catch (P4.a e9) {
                                c0199q2.a(e9);
                                return;
                            }
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList8.get(0);
                            String str4 = (String) arrayList8.get(1);
                            r rVar2 = new r(arrayList7, v02, 16);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C1094f c4 = C0195m.c(c0197o4);
                                c4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                zzad zzadVar2 = c4.f12935a;
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(zzadVar2.f11910c));
                                firebaseAuth.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth.f11853e.zza(firebaseAuth.f11849a, zzadVar2, str4, firebaseAuth.f11858k, (f4.z) new C1029c(firebaseAuth, 0)).continueWithTask(new B4.V(17)).addOnCompleteListener(new C0185c(rVar2, 22));
                                break;
                            } catch (P4.a e10) {
                                rVar2.a(Y4.D.L(e10));
                                return;
                            }
                        default:
                            ArrayList arrayList9 = new ArrayList();
                            C0197o c0197o5 = (C0197o) ((ArrayList) obj2).get(0);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                zzbl zzblVar = C0195m.c(c0197o5).f12935a.f11906C;
                                if (zzblVar != null) {
                                    arrayList = new ArrayList();
                                    Iterator it = zzblVar.f11930a.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add((PhoneMultiFactorInfo) it.next());
                                    }
                                    Iterator it2 = zzblVar.f11931b.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add((TotpMultiFactorInfo) it2.next());
                                    }
                                } else {
                                    arrayList = new ArrayList();
                                }
                                arrayList9.add(0, AbstractC1464a.I(arrayList));
                                v02.f(arrayList9);
                                break;
                            } catch (P4.a e11) {
                                v02.f(AbstractC0603a.v0(e11));
                            }
                    }
                }
            });
        } else {
            f05.M(null);
        }
        F0 f06 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getEnrolledFactors", c0201t, obj, 1);
        if (b7 == null) {
            f06.M(null);
        } else {
            final int i11 = 4;
            f06.M(new A5.b(b7) { // from class: E5.A

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ B f2258b;

                {
                    this.f2258b = b7;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v0, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    ArrayList arrayList;
                    switch (i11) {
                        case 0:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            C0197o c0197o = (C0197o) arrayList3.get(0);
                            L l7 = (L) arrayList3.get(1);
                            String str = (String) arrayList3.get(2);
                            C0199q c0199q = new C0199q(arrayList2, v02, 15);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C0195m.c(c0197o).a(new C1040n(PhoneAuthCredential.n(l7.f2297a, l7.f2298b)), str).addOnCompleteListener(new C0185c(c0199q, 23));
                                break;
                            } catch (P4.a e7) {
                                c0199q.a(e7);
                                return;
                            }
                        case 1:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            C0197o c0197o2 = (C0197o) arrayList5.get(0);
                            String str2 = (String) arrayList5.get(1);
                            String str3 = (String) arrayList5.get(2);
                            r rVar = new r(arrayList4, v02, 15);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C0195m.c(c0197o2).a((AbstractC1037k) C0195m.f2389d.get(str2), str3).addOnCompleteListener(new C0185c(rVar, 21));
                                break;
                            } catch (P4.a e8) {
                                rVar.a(e8);
                                return;
                            }
                        case 2:
                            ArrayList arrayList6 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj2).get(0);
                            C0199q c0199q2 = new C0199q(arrayList6, v02, 16);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C1094f c3 = C0195m.c(c0197o3);
                                zzad zzadVar = c3.f12935a;
                                zzadVar.getClass();
                                FirebaseAuth.getInstance(Y3.i.f(zzadVar.f11910c)).h(zzadVar, false).continueWithTask(new C1091c(c3, 1)).addOnCompleteListener(new C0185c(c0199q2, 20));
                                break;
                            } catch (P4.a e9) {
                                c0199q2.a(e9);
                                return;
                            }
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList8.get(0);
                            String str4 = (String) arrayList8.get(1);
                            r rVar2 = new r(arrayList7, v02, 16);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                C1094f c4 = C0195m.c(c0197o4);
                                c4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                zzad zzadVar2 = c4.f12935a;
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(zzadVar2.f11910c));
                                firebaseAuth.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth.f11853e.zza(firebaseAuth.f11849a, zzadVar2, str4, firebaseAuth.f11858k, (f4.z) new C1029c(firebaseAuth, 0)).continueWithTask(new B4.V(17)).addOnCompleteListener(new C0185c(rVar2, 22));
                                break;
                            } catch (P4.a e10) {
                                rVar2.a(Y4.D.L(e10));
                                return;
                            }
                        default:
                            ArrayList arrayList9 = new ArrayList();
                            C0197o c0197o5 = (C0197o) ((ArrayList) obj2).get(0);
                            ((C0195m) this.f2258b).getClass();
                            try {
                                zzbl zzblVar = C0195m.c(c0197o5).f12935a.f11906C;
                                if (zzblVar != null) {
                                    arrayList = new ArrayList();
                                    Iterator it = zzblVar.f11930a.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add((PhoneMultiFactorInfo) it.next());
                                    }
                                    Iterator it2 = zzblVar.f11931b.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add((TotpMultiFactorInfo) it2.next());
                                    }
                                } else {
                                    arrayList = new ArrayList();
                                }
                                arrayList9.add(0, AbstractC1464a.I(arrayList));
                                v02.f(arrayList9);
                                break;
                            } catch (P4.a e11) {
                                v02.f(AbstractC0603a.v0(e11));
                            }
                    }
                }
            });
        }
    }
}
