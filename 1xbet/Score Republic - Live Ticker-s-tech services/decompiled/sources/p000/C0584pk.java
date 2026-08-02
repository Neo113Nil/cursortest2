package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: pk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0584pk implements InterfaceC0187eu {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6181j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f6182k;

    /* JADX INFO: renamed from: l */
    public Object f6183l;

    public /* synthetic */ C0584pk(int i) {
        this.f6181j = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3948a(InterfaceC0187eu interfaceC0187eu) {
        switch (this.f6181j) {
            case 0:
                if (!this.f6182k) {
                    synchronized (this) {
                        try {
                            if (!this.f6182k) {
                                C0212fi c0212fi = (C0212fi) this.f6183l;
                                if (c0212fi == null) {
                                    c0212fi = new C0212fi();
                                    int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                                    c0212fi.f2409b = iNumberOfLeadingZeros - 1;
                                    c0212fi.f2411d = (int) (0.75f * iNumberOfLeadingZeros);
                                    c0212fi.f2412e = new Object[iNumberOfLeadingZeros];
                                    this.f6183l = c0212fi;
                                }
                                c0212fi.m1821a(interfaceC0187eu);
                                return true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                interfaceC0187eu.mo480c();
                return false;
            default:
                if (!this.f6182k) {
                    synchronized (this) {
                        try {
                            if (!this.f6182k) {
                                LinkedList linkedList = (LinkedList) this.f6183l;
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                    this.f6183l = linkedList;
                                }
                                linkedList.add(interfaceC0187eu);
                                return true;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                interfaceC0187eu.mo480c();
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3949b(InterfaceC0187eu interfaceC0187eu) {
        switch (this.f6181j) {
            case 0:
                zg1.m5905p(interfaceC0187eu, "disposables is null");
                if (!this.f6182k) {
                    synchronized (this) {
                        try {
                            if (!this.f6182k) {
                                C0212fi c0212fi = (C0212fi) this.f6183l;
                                if (c0212fi != null) {
                                    Object[] objArr = (Object[]) c0212fi.f2412e;
                                    int i = c0212fi.f2409b;
                                    int iHashCode = interfaceC0187eu.hashCode() * (-1640531527);
                                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                                    Object obj = objArr[i2];
                                    if (obj != null) {
                                        if (obj.equals(interfaceC0187eu)) {
                                            c0212fi.m1811Q(i2, i, objArr);
                                        } else {
                                            while (true) {
                                                i2 = (i2 + 1) & i;
                                                Object obj2 = objArr[i2];
                                                if (obj2 != null) {
                                                    if (obj2.equals(interfaceC0187eu)) {
                                                        c0212fi.m1811Q(i2, i, objArr);
                                                    }
                                                }
                                            }
                                        }
                                        return true;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return false;
            default:
                if (!this.f6182k) {
                    synchronized (this) {
                        try {
                            if (!this.f6182k) {
                                LinkedList linkedList = (LinkedList) this.f6183l;
                                if (linkedList != null && linkedList.remove(interfaceC0187eu)) {
                                    return true;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return false;
        }
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        ArrayList arrayList = null;
        switch (this.f6181j) {
            case 0:
                if (this.f6182k) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.f6182k) {
                            this.f6182k = true;
                            C0212fi c0212fi = (C0212fi) this.f6183l;
                            this.f6183l = null;
                            if (c0212fi != null) {
                                for (Object obj : (Object[]) c0212fi.f2412e) {
                                    if (obj instanceof InterfaceC0187eu) {
                                        try {
                                            ((InterfaceC0187eu) obj).mo480c();
                                        } catch (Throwable th) {
                                            wo1.m5394u(th);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(th);
                                        }
                                    }
                                }
                                if (arrayList != null) {
                                    if (arrayList.size() != 1) {
                                        throw new C0658rk(arrayList);
                                    }
                                    throw AbstractC0671rx.m4417c((Throwable) arrayList.get(0));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                if (this.f6182k) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.f6182k) {
                            this.f6182k = true;
                            LinkedList linkedList = (LinkedList) this.f6183l;
                            this.f6183l = null;
                            if (linkedList != null) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((InterfaceC0187eu) it.next()).mo480c();
                                    } catch (Throwable th3) {
                                        wo1.m5394u(th3);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(th3);
                                    }
                                }
                                if (arrayList != null) {
                                    if (arrayList.size() != 1) {
                                        throw new C0658rk(arrayList);
                                    }
                                    throw AbstractC0671rx.m4417c((Throwable) arrayList.get(0));
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3950d(InterfaceC0187eu interfaceC0187eu) {
        switch (this.f6181j) {
            case 0:
                if (!m3949b(interfaceC0187eu)) {
                    return false;
                }
                interfaceC0187eu.mo480c();
                return true;
            default:
                if (!m3949b(interfaceC0187eu)) {
                    return false;
                }
                ((d51) interfaceC0187eu).mo480c();
                return true;
        }
    }
}
