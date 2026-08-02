package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j30 extends AbstractC0871xb {

    /* JADX INFO: renamed from: j */
    public Iterator f3802j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f3803k;

    /* JADX INFO: renamed from: l */
    public boolean f3804l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f3805m;

    /* JADX INFO: renamed from: n */
    public final y30 f3806n;

    public j30(y30 y30Var, Iterator it, int i) {
        this.f3805m = i;
        this.f3802j = it;
        this.f3806n = y30Var;
    }

    @Override // p000.ib1
    public final void cancel() {
        this.f3803k = true;
    }

    @Override // p000.y71
    public final void clear() {
        this.f3802j = null;
    }

    @Override // p000.ez0
    /* JADX INFO: renamed from: f */
    public final int mo592f(int i) {
        return 1;
    }

    @Override // p000.y71
    public final boolean isEmpty() {
        Iterator it = this.f3802j;
        return it == null || !it.hasNext();
    }

    @Override // p000.y71
    public final Object poll() {
        Iterator it = this.f3802j;
        if (it == null) {
            return null;
        }
        if (!this.f3804l) {
            this.f3804l = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.f3802j.next();
        zg1.m5905p(next, "Iterator.next() returned a null value");
        return next;
    }

    @Override // p000.ib1
    public final void request(long j) {
        if (jb1.m2845c(j) && AbstractC0875xf.m5647b(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                switch (this.f3805m) {
                    case 0:
                        Iterator it = this.f3802j;
                        InterfaceC0142dl interfaceC0142dl = (InterfaceC0142dl) this.f3806n;
                        while (!this.f3803k) {
                            try {
                                Object next = it.next();
                                if (this.f3803k) {
                                    break;
                                } else if (next == null) {
                                    interfaceC0142dl.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    break;
                                } else {
                                    interfaceC0142dl.mo21d(next);
                                    if (this.f3803k) {
                                        break;
                                    } else {
                                        try {
                                            if (!it.hasNext()) {
                                                if (!this.f3803k) {
                                                    interfaceC0142dl.onComplete();
                                                }
                                                break;
                                            }
                                        } catch (Throwable th) {
                                            wo1.m5394u(th);
                                            interfaceC0142dl.onError(th);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                wo1.m5394u(th2);
                                interfaceC0142dl.onError(th2);
                            }
                        }
                        break;
                    default:
                        Iterator it2 = this.f3802j;
                        y30 y30Var = this.f3806n;
                        while (!this.f3803k) {
                            try {
                                Object next2 = it2.next();
                                if (this.f3803k) {
                                    break;
                                } else if (next2 == null) {
                                    y30Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    break;
                                } else {
                                    y30Var.onNext(next2);
                                    if (this.f3803k) {
                                        break;
                                    } else {
                                        try {
                                            if (!it2.hasNext()) {
                                                if (!this.f3803k) {
                                                    y30Var.onComplete();
                                                }
                                                break;
                                            }
                                        } catch (Throwable th3) {
                                            wo1.m5394u(th3);
                                            y30Var.onError(th3);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                wo1.m5394u(th4);
                                y30Var.onError(th4);
                                return;
                            }
                        }
                        break;
                }
            }
            switch (this.f3805m) {
                case 0:
                    Iterator it3 = this.f3802j;
                    InterfaceC0142dl interfaceC0142dl2 = (InterfaceC0142dl) this.f3806n;
                    do {
                        long j2 = 0;
                        while (true) {
                            if (j2 == j) {
                                j = get();
                                if (j2 == j) {
                                }
                            } else if (this.f3803k) {
                                break;
                            } else {
                                try {
                                    Object next3 = it3.next();
                                    if (this.f3803k) {
                                        break;
                                    } else if (next3 == null) {
                                        interfaceC0142dl2.onError(new NullPointerException("Iterator.next() returned a null value"));
                                        break;
                                    } else {
                                        boolean zMo21d = interfaceC0142dl2.mo21d(next3);
                                        if (this.f3803k) {
                                            break;
                                        } else {
                                            try {
                                                if (!it3.hasNext()) {
                                                    if (!this.f3803k) {
                                                        interfaceC0142dl2.onComplete();
                                                    }
                                                    break;
                                                } else if (zMo21d) {
                                                    j2++;
                                                }
                                            } catch (Throwable th5) {
                                                wo1.m5394u(th5);
                                                interfaceC0142dl2.onError(th5);
                                                return;
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    wo1.m5394u(th6);
                                    interfaceC0142dl2.onError(th6);
                                    return;
                                }
                            }
                        }
                        j = addAndGet(-j2);
                    } while (j != 0);
                    break;
                default:
                    Iterator it4 = this.f3802j;
                    y30 y30Var2 = this.f3806n;
                    do {
                        long j3 = 0;
                        while (true) {
                            if (j3 != j) {
                                if (!this.f3803k) {
                                    try {
                                        Object next4 = it4.next();
                                        if (!this.f3803k) {
                                            if (next4 == null) {
                                                y30Var2.onError(new NullPointerException("Iterator.next() returned a null value"));
                                            } else {
                                                y30Var2.onNext(next4);
                                                if (!this.f3803k) {
                                                    try {
                                                        if (it4.hasNext()) {
                                                            j3++;
                                                        } else if (!this.f3803k) {
                                                            y30Var2.onComplete();
                                                        }
                                                    } catch (Throwable th7) {
                                                        wo1.m5394u(th7);
                                                        y30Var2.onError(th7);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        wo1.m5394u(th8);
                                        y30Var2.onError(th8);
                                        return;
                                    }
                                }
                                break;
                            } else {
                                j = get();
                                if (j3 == j) {
                                }
                            }
                        }
                        j = addAndGet(-j3);
                    } while (j != 0);
                    break;
            }
        }
    }
}
