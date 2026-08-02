package androidx.glance;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.t;
import androidx.glance.GlanceModifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u001c\u0010\n\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0013\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J5\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u0002H\u000f2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u000f0\u0012H\u0016¢\u0006\u0002\u0010\u0013J5\u0010\u0014\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u0002H\u000f2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u000f0\u0012H\u0016¢\u0006\u0002\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/glance/CombinedGlanceModifier;", "Landroidx/glance/GlanceModifier;", "outer", "inner", "(Landroidx/glance/GlanceModifier;Landroidx/glance/GlanceModifier;)V", "all", "", "predicate", "Lkotlin/Function1;", "Landroidx/glance/GlanceModifier$Element;", "any", "equals", "other", "", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "hashCode", "", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CombinedGlanceModifier implements GlanceModifier {
    public static final int $stable = 0;
    private final GlanceModifier inner;
    private final GlanceModifier outer;

    public CombinedGlanceModifier(GlanceModifier glanceModifier, GlanceModifier glanceModifier2) {
        this.outer = glanceModifier;
        this.inner = glanceModifier2;
    }

    @Override // androidx.glance.GlanceModifier
    public boolean all(Function1<? super GlanceModifier.Element, Boolean> predicate) {
        return this.outer.all(predicate) && this.inner.all(predicate);
    }

    @Override // androidx.glance.GlanceModifier
    public boolean any(Function1<? super GlanceModifier.Element, Boolean> predicate) {
        return this.outer.any(predicate) || this.inner.any(predicate);
    }

    public boolean equals(Object other) {
        if (!(other instanceof CombinedGlanceModifier)) {
            return false;
        }
        CombinedGlanceModifier combinedGlanceModifier = (CombinedGlanceModifier) other;
        return Intrinsics.areEqual(this.outer, combinedGlanceModifier.outer) && Intrinsics.areEqual(this.inner, combinedGlanceModifier.inner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.glance.GlanceModifier
    public <R> R foldIn(R initial, Function2<? super R, ? super GlanceModifier.Element, ? extends R> operation) {
        return (R) this.inner.foldIn(this.outer.foldIn(initial, operation), operation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.glance.GlanceModifier
    public <R> R foldOut(R initial, Function2<? super GlanceModifier.Element, ? super R, ? extends R> operation) {
        return (R) this.outer.foldOut(this.inner.foldOut(initial, operation), operation);
    }

    public int hashCode() {
        return (this.inner.hashCode() * 31) + this.outer.hashCode();
    }

    public String toString() {
        return t.b(']', (String) foldIn("", new Function2<String, GlanceModifier.Element, String>() { // from class: androidx.glance.CombinedGlanceModifier$toString$1
            @Override // kotlin.jvm.functions.Function2
            public final String invoke(String str, GlanceModifier.Element element) {
                if (str.length() == 0) {
                    return element.toString();
                }
                return str + ", " + element;
            }
        }), new StringBuilder("["));
    }
}
