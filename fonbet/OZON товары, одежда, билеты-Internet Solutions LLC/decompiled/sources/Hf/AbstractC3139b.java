package Hf;

/* renamed from: Hf.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3139b extends u {
    @Override // Hf.u
    public final u f() {
        return (AbstractC3139b) super.f();
    }

    @Override // Hf.u
    protected final void j(u uVar) {
        if (!(uVar instanceof AbstractC3139b)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.j(uVar);
    }

    public final AbstractC3139b m() {
        return (AbstractC3139b) super.f();
    }
}
