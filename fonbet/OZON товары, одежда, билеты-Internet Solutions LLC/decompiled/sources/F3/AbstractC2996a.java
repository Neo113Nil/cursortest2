package F3;

import F3.F;
import F3.InterfaceC3018x;
import android.os.Handler;
import android.os.Looper;
import j3.AbstractC7252H;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w3.i;

/* renamed from: F3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2996a implements InterfaceC3018x {
    private Looper looper;
    private u3.P playerId;
    private AbstractC7252H timeline;
    private final ArrayList<InterfaceC3018x.c> mediaSourceCallers = new ArrayList<>(1);
    private final HashSet<InterfaceC3018x.c> enabledMediaSourceCallers = new HashSet<>(1);
    private final F.a eventDispatcher = new F.a();
    private final i.a drmEventDispatcher = new i.a();

    @Override // F3.InterfaceC3018x
    public final void addDrmEventListener(Handler handler, w3.i iVar) {
        handler.getClass();
        iVar.getClass();
        this.drmEventDispatcher.a(handler, iVar);
    }

    @Override // F3.InterfaceC3018x
    public final void addEventListener(Handler handler, F f7) {
        handler.getClass();
        f7.getClass();
        this.eventDispatcher.a(handler, f7);
    }

    protected final i.a createDrmEventDispatcher(InterfaceC3018x.b bVar) {
        return this.drmEventDispatcher.h(0, bVar);
    }

    protected final F.a createEventDispatcher(InterfaceC3018x.b bVar) {
        return this.eventDispatcher.i(0, bVar);
    }

    @Override // F3.InterfaceC3018x
    public final void disable(InterfaceC3018x.c cVar) {
        boolean isEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.remove(cVar);
        if (isEmpty || !this.enabledMediaSourceCallers.isEmpty()) {
            return;
        }
        disableInternal();
    }

    protected void disableInternal() {
    }

    @Override // F3.InterfaceC3018x
    public final void enable(InterfaceC3018x.c cVar) {
        this.looper.getClass();
        boolean isEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.add(cVar);
        if (isEmpty) {
            enableInternal();
        }
    }

    protected void enableInternal() {
    }

    protected final u3.P getPlayerId() {
        u3.P p11 = this.playerId;
        G10.a.i(p11);
        return p11;
    }

    protected final boolean isEnabled() {
        return !this.enabledMediaSourceCallers.isEmpty();
    }

    @Override // F3.InterfaceC3018x
    public final void prepareSource(InterfaceC3018x.c cVar, p3.z zVar, u3.P p11) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.looper;
        G10.a.c(looper == null || looper == myLooper);
        this.playerId = p11;
        AbstractC7252H abstractC7252H = this.timeline;
        this.mediaSourceCallers.add(cVar);
        if (this.looper == null) {
            this.looper = myLooper;
            this.enabledMediaSourceCallers.add(cVar);
            prepareSourceInternal(zVar);
        } else if (abstractC7252H != null) {
            enable(cVar);
            cVar.b(this, abstractC7252H);
        }
    }

    protected abstract void prepareSourceInternal(p3.z zVar);

    protected final void refreshSourceInfo(AbstractC7252H abstractC7252H) {
        this.timeline = abstractC7252H;
        Iterator<InterfaceC3018x.c> it = this.mediaSourceCallers.iterator();
        while (it.hasNext()) {
            it.next().b(this, abstractC7252H);
        }
    }

    @Override // F3.InterfaceC3018x
    public final void releaseSource(InterfaceC3018x.c cVar) {
        this.mediaSourceCallers.remove(cVar);
        if (!this.mediaSourceCallers.isEmpty()) {
            disable(cVar);
            return;
        }
        this.looper = null;
        this.timeline = null;
        this.playerId = null;
        this.enabledMediaSourceCallers.clear();
        releaseSourceInternal();
    }

    protected abstract void releaseSourceInternal();

    @Override // F3.InterfaceC3018x
    public final void removeDrmEventListener(w3.i iVar) {
        this.drmEventDispatcher.g(iVar);
    }

    @Override // F3.InterfaceC3018x
    public final void removeEventListener(F f7) {
        this.eventDispatcher.h(f7);
    }

    protected final i.a createDrmEventDispatcher(int i11, InterfaceC3018x.b bVar) {
        return this.drmEventDispatcher.h(i11, bVar);
    }

    protected final F.a createEventDispatcher(int i11, InterfaceC3018x.b bVar) {
        return this.eventDispatcher.i(i11, bVar);
    }
}
