package D1;

import androidx.compose.ui.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: D1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2813m extends e.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f5525a = p0.f(this);

    /* renamed from: b, reason: collision with root package name */
    private e.c f5526b;

    private final void M1(int i11, boolean z11) {
        e.c child$ui_release;
        int kindSet$ui_release = getKindSet$ui_release();
        setKindSet$ui_release(i11);
        if (kindSet$ui_release != i11) {
            if (getNode() == this) {
                setAggregateChildKindSet$ui_release(i11);
            }
            if (isAttached()) {
                e.c node = getNode();
                e.c cVar = this;
                while (cVar != null) {
                    i11 |= cVar.getKindSet$ui_release();
                    cVar.setKindSet$ui_release(i11);
                    if (cVar == node) {
                        break;
                    } else {
                        cVar = cVar.getParent$ui_release();
                    }
                }
                if (z11 && cVar == node) {
                    i11 = p0.g(node);
                    node.setKindSet$ui_release(i11);
                }
                int aggregateChildKindSet$ui_release = i11 | ((cVar == null || (child$ui_release = cVar.getChild$ui_release()) == null) ? 0 : child$ui_release.getAggregateChildKindSet$ui_release());
                while (cVar != null) {
                    aggregateChildKindSet$ui_release |= cVar.getKindSet$ui_release();
                    cVar.setAggregateChildKindSet$ui_release(aggregateChildKindSet$ui_release);
                    cVar = cVar.getParent$ui_release();
                }
            }
        }
    }

    @NotNull
    protected final void I1(@NotNull InterfaceC2807j interfaceC2807j) {
        e.c node = interfaceC2807j.getNode();
        if (node != interfaceC2807j) {
            e.c cVar = interfaceC2807j instanceof e.c ? (e.c) interfaceC2807j : null;
            e.c parent$ui_release = cVar != null ? cVar.getParent$ui_release() : null;
            if (node != getNode() || !Intrinsics.d(parent$ui_release, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (node.isAttached()) {
            A1.a.b("Cannot delegate to an already attached node");
            throw null;
        }
        node.setAsDelegateTo$ui_release(getNode());
        int kindSet$ui_release = getKindSet$ui_release();
        int g10 = p0.g(node);
        node.setKindSet$ui_release(g10);
        int kindSet$ui_release2 = getKindSet$ui_release();
        int i11 = g10 & 2;
        if (i11 != 0 && (kindSet$ui_release2 & 2) != 0 && !(this instanceof E)) {
            A1.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
            throw null;
        }
        node.setChild$ui_release(this.f5526b);
        this.f5526b = node;
        node.setParent$ui_release(this);
        M1(g10 | getKindSet$ui_release(), false);
        if (isAttached()) {
            if (i11 == 0 || (kindSet$ui_release & 2) != 0) {
                updateCoordinator$ui_release(getCoordinator$ui_release());
            } else {
                C2804h0 c02 = C2809k.f(this).c0();
                getNode().updateCoordinator$ui_release(null);
                c02.v();
            }
            node.markAsAttached$ui_release();
            node.runAttachLifecycle$ui_release();
            p0.a(node);
        }
    }

    public final e.c J1() {
        return this.f5526b;
    }

    public final int K1() {
        return this.f5525a;
    }

    protected final void L1(@NotNull InterfaceC2807j interfaceC2807j) {
        e.c cVar = null;
        for (e.c cVar2 = this.f5526b; cVar2 != null; cVar2 = cVar2.getChild$ui_release()) {
            if (cVar2 == interfaceC2807j) {
                if (cVar2.isAttached()) {
                    int i11 = p0.f5546b;
                    if (!cVar2.isAttached()) {
                        A1.a.b("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                    p0.b(cVar2, -1, 2);
                    cVar2.runDetachLifecycle$ui_release();
                    cVar2.markAsDetached$ui_release();
                }
                cVar2.setAsDelegateTo$ui_release(cVar2);
                cVar2.setAggregateChildKindSet$ui_release(0);
                if (cVar == null) {
                    this.f5526b = cVar2.getChild$ui_release();
                } else {
                    cVar.setChild$ui_release(cVar2.getChild$ui_release());
                }
                cVar2.setChild$ui_release(null);
                cVar2.setParent$ui_release(null);
                int kindSet$ui_release = getKindSet$ui_release();
                int g10 = p0.g(this);
                M1(g10, true);
                if (isAttached() && (kindSet$ui_release & 2) != 0 && (g10 & 2) == 0) {
                    C2804h0 c02 = C2809k.f(this).c0();
                    getNode().updateCoordinator$ui_release(null);
                    c02.v();
                    return;
                }
                return;
            }
            cVar = cVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC2807j).toString());
    }

    @Override // androidx.compose.ui.e.c
    public final void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for (e.c cVar = this.f5526b; cVar != null; cVar = cVar.getChild$ui_release()) {
            cVar.updateCoordinator$ui_release(getCoordinator$ui_release());
            if (!cVar.isAttached()) {
                cVar.markAsAttached$ui_release();
            }
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void markAsDetached$ui_release() {
        for (e.c cVar = this.f5526b; cVar != null; cVar = cVar.getChild$ui_release()) {
            cVar.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }

    @Override // androidx.compose.ui.e.c
    public final void reset$ui_release() {
        super.reset$ui_release();
        for (e.c cVar = this.f5526b; cVar != null; cVar = cVar.getChild$ui_release()) {
            cVar.reset$ui_release();
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void runAttachLifecycle$ui_release() {
        for (e.c cVar = this.f5526b; cVar != null; cVar = cVar.getChild$ui_release()) {
            cVar.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    @Override // androidx.compose.ui.e.c
    public final void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for (e.c cVar = this.f5526b; cVar != null; cVar = cVar.getChild$ui_release()) {
            cVar.runDetachLifecycle$ui_release();
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void setAsDelegateTo$ui_release(@NotNull e.c cVar) {
        super.setAsDelegateTo$ui_release(cVar);
        for (e.c cVar2 = this.f5526b; cVar2 != null; cVar2 = cVar2.getChild$ui_release()) {
            cVar2.setAsDelegateTo$ui_release(cVar);
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void updateCoordinator$ui_release(AbstractC2810k0 abstractC2810k0) {
        super.updateCoordinator$ui_release(abstractC2810k0);
        for (e.c cVar = this.f5526b; cVar != null; cVar = cVar.getChild$ui_release()) {
            cVar.updateCoordinator$ui_release(abstractC2810k0);
        }
    }
}
