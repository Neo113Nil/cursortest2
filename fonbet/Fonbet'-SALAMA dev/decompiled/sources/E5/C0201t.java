package E5;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: E5.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0201t extends A5.x {

    /* renamed from: e, reason: collision with root package name */
    public static final C0201t f2402e = new C0201t(0);

    /* renamed from: f, reason: collision with root package name */
    public static final C0201t f2403f = new C0201t(1);

    /* renamed from: g, reason: collision with root package name */
    public static final C0201t f2404g = new C0201t(2);

    /* renamed from: h, reason: collision with root package name */
    public static final C0201t f2405h = new C0201t(3);

    /* renamed from: i, reason: collision with root package name */
    public static final C0201t f2406i = new C0201t(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2407d;

    public /* synthetic */ C0201t(int i7) {
        this.f2407d = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // A5.x
    public final Object f(byte b7, ByteBuffer byteBuffer) {
        D d7;
        D d8;
        switch (this.f2407d) {
            case 0:
                switch (b7) {
                    case Byte.MIN_VALUE:
                        return C0197o.a((ArrayList) e(byteBuffer));
                    case -127:
                        return C.a((ArrayList) e(byteBuffer));
                    case -126:
                        ArrayList arrayList = (ArrayList) e(byteBuffer);
                        D d9 = new D();
                        d9.f2261a = (String) arrayList.get(0);
                        d9.f2262b = (String) arrayList.get(1);
                        d7 = d9;
                        break;
                    case -125:
                        return E.a((ArrayList) e(byteBuffer));
                    case -124:
                        return F.a((ArrayList) e(byteBuffer));
                    case -123:
                        return G.a((ArrayList) e(byteBuffer));
                    case -122:
                        return H.a((ArrayList) e(byteBuffer));
                    case -121:
                        return I.a((ArrayList) e(byteBuffer));
                    case -120:
                        return J.a((ArrayList) e(byteBuffer));
                    case -119:
                        ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                        K k7 = new K();
                        String str = (String) arrayList2.get(0);
                        if (str == null) {
                            throw new IllegalStateException("Nonnull field \"id\" is null.");
                        }
                        k7.f2296a = str;
                        d7 = k7;
                        break;
                    case -118:
                        return L.a((ArrayList) e(byteBuffer));
                    case -117:
                        return M.a((ArrayList) e(byteBuffer));
                    case -116:
                        return N.a((ArrayList) e(byteBuffer));
                    case -115:
                        return O.a((ArrayList) e(byteBuffer));
                    case -114:
                        return P.a((ArrayList) e(byteBuffer));
                    case -113:
                        return Q.a((ArrayList) e(byteBuffer));
                    case -112:
                        return S.a((ArrayList) e(byteBuffer));
                    case -111:
                        return T.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b7, byteBuffer);
                }
                return d7;
            case 1:
                switch (b7) {
                    case Byte.MIN_VALUE:
                        return C0197o.a((ArrayList) e(byteBuffer));
                    case -127:
                        return C.a((ArrayList) e(byteBuffer));
                    case -126:
                        ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                        D d10 = new D();
                        d10.f2261a = (String) arrayList3.get(0);
                        d10.f2262b = (String) arrayList3.get(1);
                        d8 = d10;
                        break;
                    case -125:
                        return E.a((ArrayList) e(byteBuffer));
                    case -124:
                        return F.a((ArrayList) e(byteBuffer));
                    case -123:
                        return G.a((ArrayList) e(byteBuffer));
                    case -122:
                        return H.a((ArrayList) e(byteBuffer));
                    case -121:
                        return I.a((ArrayList) e(byteBuffer));
                    case -120:
                        return J.a((ArrayList) e(byteBuffer));
                    case -119:
                        ArrayList arrayList4 = (ArrayList) e(byteBuffer);
                        K k8 = new K();
                        String str2 = (String) arrayList4.get(0);
                        if (str2 == null) {
                            throw new IllegalStateException("Nonnull field \"id\" is null.");
                        }
                        k8.f2296a = str2;
                        d8 = k8;
                        break;
                    case -118:
                        return L.a((ArrayList) e(byteBuffer));
                    case -117:
                        return M.a((ArrayList) e(byteBuffer));
                    case -116:
                        return N.a((ArrayList) e(byteBuffer));
                    case -115:
                        return O.a((ArrayList) e(byteBuffer));
                    case -114:
                        return P.a((ArrayList) e(byteBuffer));
                    case -113:
                        return Q.a((ArrayList) e(byteBuffer));
                    case -112:
                        return S.a((ArrayList) e(byteBuffer));
                    case -111:
                        return T.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b7, byteBuffer);
                }
                return d8;
            case 2:
                switch (b7) {
                    case Byte.MIN_VALUE:
                        return F.a((ArrayList) e(byteBuffer));
                    case -127:
                        return G.a((ArrayList) e(byteBuffer));
                    case -126:
                        return L.a((ArrayList) e(byteBuffer));
                    case -125:
                        return O.a((ArrayList) e(byteBuffer));
                    case -124:
                        return P.a((ArrayList) e(byteBuffer));
                    case -123:
                        return Q.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b7, byteBuffer);
                }
            case 3:
                return b7 != Byte.MIN_VALUE ? super.f(b7, byteBuffer) : N.a((ArrayList) e(byteBuffer));
            default:
                switch (b7) {
                    case Byte.MIN_VALUE:
                        return C0197o.a((ArrayList) e(byteBuffer));
                    case -127:
                        return J.a((ArrayList) e(byteBuffer));
                    case -126:
                        ArrayList arrayList5 = (ArrayList) e(byteBuffer);
                        K k9 = new K();
                        String str3 = (String) arrayList5.get(0);
                        if (str3 == null) {
                            throw new IllegalStateException("Nonnull field \"id\" is null.");
                        }
                        k9.f2296a = str3;
                        return k9;
                    case -125:
                        return L.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b7, byteBuffer);
                }
        }
    }

    @Override // A5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        switch (this.f2407d) {
            case 0:
                if (!(obj instanceof C0197o)) {
                    if (!(obj instanceof C)) {
                        if (!(obj instanceof D)) {
                            if (!(obj instanceof E)) {
                                if (!(obj instanceof F)) {
                                    if (!(obj instanceof G)) {
                                        if (!(obj instanceof H)) {
                                            if (!(obj instanceof I)) {
                                                if (!(obj instanceof J)) {
                                                    if (!(obj instanceof K)) {
                                                        if (!(obj instanceof L)) {
                                                            if (!(obj instanceof M)) {
                                                                if (!(obj instanceof N)) {
                                                                    if (!(obj instanceof O)) {
                                                                        if (!(obj instanceof P)) {
                                                                            if (!(obj instanceof Q)) {
                                                                                if (!(obj instanceof S)) {
                                                                                    if (!(obj instanceof T)) {
                                                                                        super.k(byteArrayOutputStream, obj);
                                                                                        break;
                                                                                    } else {
                                                                                        byteArrayOutputStream.write(145);
                                                                                        k(byteArrayOutputStream, ((T) obj).b());
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    byteArrayOutputStream.write(144);
                                                                                    S s7 = (S) obj;
                                                                                    s7.getClass();
                                                                                    ArrayList arrayList = new ArrayList(4);
                                                                                    arrayList.add(s7.f2323a);
                                                                                    arrayList.add(s7.f2324b);
                                                                                    arrayList.add(s7.f2325c);
                                                                                    arrayList.add(s7.f2326d);
                                                                                    k(byteArrayOutputStream, arrayList);
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                byteArrayOutputStream.write(143);
                                                                                k(byteArrayOutputStream, ((Q) obj).b());
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            byteArrayOutputStream.write(142);
                                                                            k(byteArrayOutputStream, ((P) obj).b());
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        byteArrayOutputStream.write(141);
                                                                        k(byteArrayOutputStream, ((O) obj).b());
                                                                        break;
                                                                    }
                                                                } else {
                                                                    byteArrayOutputStream.write(140);
                                                                    k(byteArrayOutputStream, ((N) obj).b());
                                                                    break;
                                                                }
                                                            } else {
                                                                byteArrayOutputStream.write(139);
                                                                M m7 = (M) obj;
                                                                m7.getClass();
                                                                ArrayList arrayList2 = new ArrayList(3);
                                                                arrayList2.add(m7.f2299a);
                                                                arrayList2.add(m7.f2300b);
                                                                arrayList2.add(m7.f2301c);
                                                                k(byteArrayOutputStream, arrayList2);
                                                                break;
                                                            }
                                                        } else {
                                                            byteArrayOutputStream.write(138);
                                                            k(byteArrayOutputStream, ((L) obj).b());
                                                            break;
                                                        }
                                                    } else {
                                                        byteArrayOutputStream.write(137);
                                                        K k7 = (K) obj;
                                                        k7.getClass();
                                                        ArrayList arrayList3 = new ArrayList(1);
                                                        arrayList3.add(k7.f2296a);
                                                        k(byteArrayOutputStream, arrayList3);
                                                        break;
                                                    }
                                                } else {
                                                    byteArrayOutputStream.write(136);
                                                    k(byteArrayOutputStream, ((J) obj).b());
                                                    break;
                                                }
                                            } else {
                                                byteArrayOutputStream.write(135);
                                                k(byteArrayOutputStream, ((I) obj).b());
                                                break;
                                            }
                                        } else {
                                            byteArrayOutputStream.write(134);
                                            k(byteArrayOutputStream, ((H) obj).b());
                                            break;
                                        }
                                    } else {
                                        byteArrayOutputStream.write(133);
                                        k(byteArrayOutputStream, ((G) obj).b());
                                        break;
                                    }
                                } else {
                                    byteArrayOutputStream.write(132);
                                    k(byteArrayOutputStream, ((F) obj).b());
                                    break;
                                }
                            } else {
                                byteArrayOutputStream.write(131);
                                k(byteArrayOutputStream, ((E) obj).b());
                                break;
                            }
                        } else {
                            byteArrayOutputStream.write(130);
                            D d7 = (D) obj;
                            d7.getClass();
                            ArrayList arrayList4 = new ArrayList(2);
                            arrayList4.add(d7.f2261a);
                            arrayList4.add(d7.f2262b);
                            k(byteArrayOutputStream, arrayList4);
                            break;
                        }
                    } else {
                        byteArrayOutputStream.write(129);
                        C c3 = (C) obj;
                        c3.getClass();
                        ArrayList arrayList5 = new ArrayList(2);
                        int i7 = c3.f2259a;
                        arrayList5.add(i7 == 0 ? null : Integer.valueOf(t.e.e(i7)));
                        arrayList5.add(c3.f2260b);
                        k(byteArrayOutputStream, arrayList5);
                        break;
                    }
                } else {
                    byteArrayOutputStream.write(128);
                    k(byteArrayOutputStream, ((C0197o) obj).b());
                    break;
                }
            case 1:
                if (!(obj instanceof C0197o)) {
                    if (!(obj instanceof C)) {
                        if (!(obj instanceof D)) {
                            if (!(obj instanceof E)) {
                                if (!(obj instanceof F)) {
                                    if (!(obj instanceof G)) {
                                        if (!(obj instanceof H)) {
                                            if (!(obj instanceof I)) {
                                                if (!(obj instanceof J)) {
                                                    if (!(obj instanceof K)) {
                                                        if (!(obj instanceof L)) {
                                                            if (!(obj instanceof M)) {
                                                                if (!(obj instanceof N)) {
                                                                    if (!(obj instanceof O)) {
                                                                        if (!(obj instanceof P)) {
                                                                            if (!(obj instanceof Q)) {
                                                                                if (!(obj instanceof S)) {
                                                                                    if (!(obj instanceof T)) {
                                                                                        super.k(byteArrayOutputStream, obj);
                                                                                        break;
                                                                                    } else {
                                                                                        byteArrayOutputStream.write(145);
                                                                                        k(byteArrayOutputStream, ((T) obj).b());
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    byteArrayOutputStream.write(144);
                                                                                    S s8 = (S) obj;
                                                                                    s8.getClass();
                                                                                    ArrayList arrayList6 = new ArrayList(4);
                                                                                    arrayList6.add(s8.f2323a);
                                                                                    arrayList6.add(s8.f2324b);
                                                                                    arrayList6.add(s8.f2325c);
                                                                                    arrayList6.add(s8.f2326d);
                                                                                    k(byteArrayOutputStream, arrayList6);
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                byteArrayOutputStream.write(143);
                                                                                k(byteArrayOutputStream, ((Q) obj).b());
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            byteArrayOutputStream.write(142);
                                                                            k(byteArrayOutputStream, ((P) obj).b());
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        byteArrayOutputStream.write(141);
                                                                        k(byteArrayOutputStream, ((O) obj).b());
                                                                        break;
                                                                    }
                                                                } else {
                                                                    byteArrayOutputStream.write(140);
                                                                    k(byteArrayOutputStream, ((N) obj).b());
                                                                    break;
                                                                }
                                                            } else {
                                                                byteArrayOutputStream.write(139);
                                                                M m8 = (M) obj;
                                                                m8.getClass();
                                                                ArrayList arrayList7 = new ArrayList(3);
                                                                arrayList7.add(m8.f2299a);
                                                                arrayList7.add(m8.f2300b);
                                                                arrayList7.add(m8.f2301c);
                                                                k(byteArrayOutputStream, arrayList7);
                                                                break;
                                                            }
                                                        } else {
                                                            byteArrayOutputStream.write(138);
                                                            k(byteArrayOutputStream, ((L) obj).b());
                                                            break;
                                                        }
                                                    } else {
                                                        byteArrayOutputStream.write(137);
                                                        K k8 = (K) obj;
                                                        k8.getClass();
                                                        ArrayList arrayList8 = new ArrayList(1);
                                                        arrayList8.add(k8.f2296a);
                                                        k(byteArrayOutputStream, arrayList8);
                                                        break;
                                                    }
                                                } else {
                                                    byteArrayOutputStream.write(136);
                                                    k(byteArrayOutputStream, ((J) obj).b());
                                                    break;
                                                }
                                            } else {
                                                byteArrayOutputStream.write(135);
                                                k(byteArrayOutputStream, ((I) obj).b());
                                                break;
                                            }
                                        } else {
                                            byteArrayOutputStream.write(134);
                                            k(byteArrayOutputStream, ((H) obj).b());
                                            break;
                                        }
                                    } else {
                                        byteArrayOutputStream.write(133);
                                        k(byteArrayOutputStream, ((G) obj).b());
                                        break;
                                    }
                                } else {
                                    byteArrayOutputStream.write(132);
                                    k(byteArrayOutputStream, ((F) obj).b());
                                    break;
                                }
                            } else {
                                byteArrayOutputStream.write(131);
                                k(byteArrayOutputStream, ((E) obj).b());
                                break;
                            }
                        } else {
                            byteArrayOutputStream.write(130);
                            D d8 = (D) obj;
                            d8.getClass();
                            ArrayList arrayList9 = new ArrayList(2);
                            arrayList9.add(d8.f2261a);
                            arrayList9.add(d8.f2262b);
                            k(byteArrayOutputStream, arrayList9);
                            break;
                        }
                    } else {
                        byteArrayOutputStream.write(129);
                        C c4 = (C) obj;
                        c4.getClass();
                        ArrayList arrayList10 = new ArrayList(2);
                        int i8 = c4.f2259a;
                        arrayList10.add(i8 == 0 ? null : Integer.valueOf(t.e.e(i8)));
                        arrayList10.add(c4.f2260b);
                        k(byteArrayOutputStream, arrayList10);
                        break;
                    }
                } else {
                    byteArrayOutputStream.write(128);
                    k(byteArrayOutputStream, ((C0197o) obj).b());
                    break;
                }
            case 2:
                if (!(obj instanceof F)) {
                    if (!(obj instanceof G)) {
                        if (!(obj instanceof L)) {
                            if (!(obj instanceof O)) {
                                if (!(obj instanceof P)) {
                                    if (!(obj instanceof Q)) {
                                        super.k(byteArrayOutputStream, obj);
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(133);
                                        k(byteArrayOutputStream, ((Q) obj).b());
                                        break;
                                    }
                                } else {
                                    byteArrayOutputStream.write(132);
                                    k(byteArrayOutputStream, ((P) obj).b());
                                    break;
                                }
                            } else {
                                byteArrayOutputStream.write(131);
                                k(byteArrayOutputStream, ((O) obj).b());
                                break;
                            }
                        } else {
                            byteArrayOutputStream.write(130);
                            k(byteArrayOutputStream, ((L) obj).b());
                            break;
                        }
                    } else {
                        byteArrayOutputStream.write(129);
                        k(byteArrayOutputStream, ((G) obj).b());
                        break;
                    }
                } else {
                    byteArrayOutputStream.write(128);
                    k(byteArrayOutputStream, ((F) obj).b());
                    break;
                }
            case 3:
                if (!(obj instanceof N)) {
                    super.k(byteArrayOutputStream, obj);
                    break;
                } else {
                    byteArrayOutputStream.write(128);
                    k(byteArrayOutputStream, ((N) obj).b());
                    break;
                }
            default:
                if (!(obj instanceof C0197o)) {
                    if (!(obj instanceof J)) {
                        if (!(obj instanceof K)) {
                            if (!(obj instanceof L)) {
                                super.k(byteArrayOutputStream, obj);
                                break;
                            } else {
                                byteArrayOutputStream.write(131);
                                k(byteArrayOutputStream, ((L) obj).b());
                                break;
                            }
                        } else {
                            byteArrayOutputStream.write(130);
                            K k9 = (K) obj;
                            k9.getClass();
                            ArrayList arrayList11 = new ArrayList(1);
                            arrayList11.add(k9.f2296a);
                            k(byteArrayOutputStream, arrayList11);
                            break;
                        }
                    } else {
                        byteArrayOutputStream.write(129);
                        k(byteArrayOutputStream, ((J) obj).b());
                        break;
                    }
                } else {
                    byteArrayOutputStream.write(128);
                    k(byteArrayOutputStream, ((C0197o) obj).b());
                    break;
                }
        }
    }
}
