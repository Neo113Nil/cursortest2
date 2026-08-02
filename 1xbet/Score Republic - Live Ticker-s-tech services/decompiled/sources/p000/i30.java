package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i30 extends AbstractC0871xb {

    /* JADX INFO: renamed from: j */
    public final Object[] f3413j;

    /* JADX INFO: renamed from: k */
    public int f3414k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f3415l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f3416m;

    /* JADX INFO: renamed from: n */
    public final y30 f3417n;

    public i30(y30 y30Var, Object[] objArr, int i) {
        this.f3416m = i;
        this.f3413j = objArr;
        this.f3417n = y30Var;
    }

    @Override // p000.ib1
    public final void cancel() {
        this.f3415l = true;
    }

    @Override // p000.y71
    public final void clear() {
        this.f3414k = this.f3413j.length;
    }

    @Override // p000.ez0
    /* JADX INFO: renamed from: f */
    public final int mo592f(int i) {
        return 1;
    }

    @Override // p000.y71
    public final boolean isEmpty() {
        return this.f3414k == this.f3413j.length;
    }

    @Override // p000.y71
    public final Object poll() {
        int i = this.f3414k;
        Object[] objArr = this.f3413j;
        if (i == objArr.length) {
            return null;
        }
        this.f3414k = i + 1;
        Object obj = objArr[i];
        zg1.m5905p(obj, "array element is null");
        return obj;
    }

    @Override // p000.ib1
    public final void request(long j) {
        if (jb1.m2845c(j) && AbstractC0875xf.m5647b(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                switch (this.f3416m) {
                    case 0:
                        Object[] objArr = this.f3413j;
                        int length = objArr.length;
                        InterfaceC0142dl interfaceC0142dl = (InterfaceC0142dl) this.f3417n;
                        int i = this.f3414k;
                        while (true) {
                            boolean z = this.f3415l;
                            if (i != length) {
                                if (!z) {
                                    Object obj = objArr[i];
                                    if (obj == null) {
                                        interfaceC0142dl.onError(new NullPointerException(AbstractC0024an.m282e(i, "The element at index ", " is null")));
                                    } else {
                                        interfaceC0142dl.mo21d(obj);
                                        i++;
                                    }
                                }
                                break;
                            } else if (!z) {
                                interfaceC0142dl.onComplete();
                                break;
                            }
                        }
                        break;
                    default:
                        Object[] objArr2 = this.f3413j;
                        int length2 = objArr2.length;
                        y30 y30Var = this.f3417n;
                        int i2 = this.f3414k;
                        while (true) {
                            boolean z2 = this.f3415l;
                            if (i2 != length2) {
                                if (!z2) {
                                    Object obj2 = objArr2[i2];
                                    if (obj2 == null) {
                                        y30Var.onError(new NullPointerException(AbstractC0024an.m282e(i2, "The element at index ", " is null")));
                                    } else {
                                        y30Var.onNext(obj2);
                                        i2++;
                                    }
                                }
                                break;
                            } else if (!z2) {
                                y30Var.onComplete();
                                break;
                            }
                        }
                        break;
                }
            }
            switch (this.f3416m) {
                case 0:
                    Object[] objArr3 = this.f3413j;
                    int length3 = objArr3.length;
                    int i3 = this.f3414k;
                    InterfaceC0142dl interfaceC0142dl2 = (InterfaceC0142dl) this.f3417n;
                    do {
                        long j2 = 0;
                        while (true) {
                            if (j2 != j && i3 != length3) {
                                if (!this.f3415l) {
                                    Object obj3 = objArr3[i3];
                                    if (obj3 == null) {
                                        interfaceC0142dl2.onError(new NullPointerException(AbstractC0024an.m282e(i3, "The element at index ", " is null")));
                                    } else {
                                        if (interfaceC0142dl2.mo21d(obj3)) {
                                            j2++;
                                        }
                                        i3++;
                                    }
                                }
                                break;
                            } else if (i3 == length3) {
                                if (!this.f3415l) {
                                    interfaceC0142dl2.onComplete();
                                }
                                break;
                            } else {
                                j = get();
                                if (j2 == j) {
                                }
                            }
                        }
                        this.f3414k = i3;
                        j = addAndGet(-j2);
                    } while (j != 0);
                    break;
                default:
                    Object[] objArr4 = this.f3413j;
                    int length4 = objArr4.length;
                    int i4 = this.f3414k;
                    y30 y30Var2 = this.f3417n;
                    do {
                        long j3 = 0;
                        while (true) {
                            if (j3 != j && i4 != length4) {
                                if (!this.f3415l) {
                                    Object obj4 = objArr4[i4];
                                    if (obj4 == null) {
                                        y30Var2.onError(new NullPointerException(AbstractC0024an.m282e(i4, "The element at index ", " is null")));
                                    } else {
                                        y30Var2.onNext(obj4);
                                        j3++;
                                        i4++;
                                    }
                                }
                                break;
                            } else if (i4 == length4) {
                                if (!this.f3415l) {
                                    y30Var2.onComplete();
                                }
                                break;
                            } else {
                                j = get();
                                if (j3 == j) {
                                }
                            }
                        }
                        this.f3414k = i4;
                        j = addAndGet(-j3);
                    } while (j != 0);
                    break;
            }
        }
    }
}
