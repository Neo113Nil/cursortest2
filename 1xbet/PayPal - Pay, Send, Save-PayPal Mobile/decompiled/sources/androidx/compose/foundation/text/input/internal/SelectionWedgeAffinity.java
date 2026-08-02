package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "startAffinity", "endAffinity", "<init>", "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V", "affinity", "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V", "component1", "()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "component2", "copy", "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "getStartAffinity", "getEndAffinity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SelectionWedgeAffinity {
    public static final int $stable = 0;
    private final androidx.compose.foundation.text.input.internal.WedgeAffinity endAffinity;
    private final androidx.compose.foundation.text.input.internal.WedgeAffinity startAffinity;

    public SelectionWedgeAffinity(androidx.compose.foundation.text.input.internal.WedgeAffinity wedgeAffinity, androidx.compose.foundation.text.input.internal.WedgeAffinity wedgeAffinity2) {
        this.startAffinity = wedgeAffinity;
        this.endAffinity = wedgeAffinity2;
    }

    public final androidx.compose.foundation.text.input.internal.WedgeAffinity getStartAffinity() {
        return this.startAffinity;
    }

    public final androidx.compose.foundation.text.input.internal.WedgeAffinity getEndAffinity() {
        return this.endAffinity;
    }

    public SelectionWedgeAffinity(androidx.compose.foundation.text.input.internal.WedgeAffinity wedgeAffinity) {
        this(wedgeAffinity, wedgeAffinity);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionWedgeAffinity(startAffinity=");
        sb.append(this.startAffinity);
        sb.append(", endAffinity=");
        sb.append(this.endAffinity);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.startAffinity.hashCode() * 31) + this.endAffinity.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity)) {
            return false;
        }
        androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity selectionWedgeAffinity = (androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity) other;
        return this.startAffinity == selectionWedgeAffinity.startAffinity && this.endAffinity == selectionWedgeAffinity.endAffinity;
    }

    public final androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity copy(androidx.compose.foundation.text.input.internal.WedgeAffinity startAffinity, androidx.compose.foundation.text.input.internal.WedgeAffinity endAffinity) {
        return new androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity(startAffinity, endAffinity);
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.foundation.text.input.internal.WedgeAffinity getEndAffinity() {
        return this.endAffinity;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.foundation.text.input.internal.WedgeAffinity getStartAffinity() {
        return this.startAffinity;
    }

    public static /* synthetic */ androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity copy$default(androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity selectionWedgeAffinity, androidx.compose.foundation.text.input.internal.WedgeAffinity wedgeAffinity, androidx.compose.foundation.text.input.internal.WedgeAffinity wedgeAffinity2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            wedgeAffinity = selectionWedgeAffinity.startAffinity;
        }
        if ((i & 2) != 0) {
            wedgeAffinity2 = selectionWedgeAffinity.endAffinity;
        }
        return selectionWedgeAffinity.copy(wedgeAffinity, wedgeAffinity2);
    }
}
