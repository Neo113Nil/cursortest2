package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005R\u0011\u0010\u0018\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/runtime/Anchor;", "", "", "loc", "<init>", "(I)V", "Landroidx/compose/runtime/SlotTable;", "slots", "toIndexFor", "(Landroidx/compose/runtime/SlotTable;)I", "Landroidx/compose/runtime/SlotWriter;", "writer", "(Landroidx/compose/runtime/SlotWriter;)I", "", "toString", "()Ljava/lang/String;", "location", com.visa.cbp.getEncExpo.warmup, "getLocation$runtime", "()I", "setLocation$runtime", "", "getValid", "()Z", "valid"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Anchor {
    public static final int $stable = 8;
    private int location;

    public Anchor(int i) {
        this.location = i;
    }

    /* renamed from: getLocation$runtime, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    public final void setLocation$runtime(int i) {
        this.location = i;
    }

    public final boolean getValid() {
        return this.location != Integer.MIN_VALUE;
    }

    public final int toIndexFor(androidx.compose.runtime.SlotTable slots) {
        return slots.anchorIndex(this);
    }

    public final int toIndexFor(androidx.compose.runtime.SlotWriter writer) {
        return writer.anchorIndex(this);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        sb.append(this.location);
        sb.append(" }");
        return sb.toString();
    }
}
