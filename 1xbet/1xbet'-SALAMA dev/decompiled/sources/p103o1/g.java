package p103o1;

import p097n3.a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {
    @Override // p097n3.a
    public final void N(h hVar, h hVar2) {
        hVar.f15568b = hVar2;
    }

    @Override // p097n3.a
    public final void O(h hVar, Thread thread) {
        hVar.f15567a = thread;
    }

    @Override // p097n3.a
    public final boolean f(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f15574b != dVar) {
                    return false;
                }
                iVar.f15574b = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p097n3.a
    public final boolean g(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f15573a != obj) {
                    return false;
                }
                iVar.f15573a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p097n3.a
    public final boolean h(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f15575c != hVar) {
                    return false;
                }
                iVar.f15575c = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
