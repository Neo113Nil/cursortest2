package androidx.glance.layout;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.Emittable;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.Alignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R%\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR%\u0010\u0010\u001a\u00020\u0011X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/glance/layout/EmittableRow;", "Landroidx/glance/EmittableWithChildren;", "()V", "horizontalAlignment", "Landroidx/glance/layout/Alignment$Horizontal;", "getHorizontalAlignment-PGIyAqw", "()I", "setHorizontalAlignment-uMT2-20", "(I)V", "I", "modifier", "Landroidx/glance/GlanceModifier;", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", "verticalAlignment", "Landroidx/glance/layout/Alignment$Vertical;", "getVerticalAlignment-mnfRV0w", "setVerticalAlignment-Je2gTW8", "copy", "Landroidx/glance/Emittable;", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/glance/layout/EmittableRow\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1549#2:102\n1620#2,3:103\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/glance/layout/EmittableRow\n*L\n38#1:102\n38#1:103,3\n*E\n"})
/* loaded from: classes.dex */
public final class EmittableRow extends EmittableWithChildren {
    public static final int $stable = 8;
    private int horizontalAlignment;
    private GlanceModifier modifier;
    private int verticalAlignment;

    public EmittableRow() {
        super(0, false, 3, null);
        this.modifier = GlanceModifier.INSTANCE;
        Alignment.Companion companion = Alignment.INSTANCE;
        this.horizontalAlignment = companion.m1367getStartPGIyAqw();
        this.verticalAlignment = companion.m1368getTopmnfRV0w();
    }

    @Override // androidx.glance.Emittable
    public Emittable copy() {
        int collectionSizeOrDefault;
        EmittableRow emittableRow = new EmittableRow();
        emittableRow.setModifier(getModifier());
        emittableRow.horizontalAlignment = this.horizontalAlignment;
        emittableRow.verticalAlignment = this.verticalAlignment;
        List<Emittable> children = emittableRow.getChildren();
        List<Emittable> children2 = getChildren();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(children2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = children2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Emittable) it.next()).copy());
        }
        children.addAll(arrayList);
        return emittableRow;
    }

    /* renamed from: getHorizontalAlignment-PGIyAqw, reason: not valid java name and from getter */
    public final int getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    @Override // androidx.glance.Emittable
    public GlanceModifier getModifier() {
        return this.modifier;
    }

    /* renamed from: getVerticalAlignment-mnfRV0w, reason: not valid java name and from getter */
    public final int getVerticalAlignment() {
        return this.verticalAlignment;
    }

    /* renamed from: setHorizontalAlignment-uMT2-20, reason: not valid java name */
    public final void m1408setHorizontalAlignmentuMT220(int i) {
        this.horizontalAlignment = i;
    }

    @Override // androidx.glance.Emittable
    public void setModifier(GlanceModifier glanceModifier) {
        this.modifier = glanceModifier;
    }

    /* renamed from: setVerticalAlignment-Je2gTW8, reason: not valid java name */
    public final void m1409setVerticalAlignmentJe2gTW8(int i) {
        this.verticalAlignment = i;
    }

    public String toString() {
        return "EmittableRow(modifier=" + getModifier() + ", horizontalAlignment=" + ((Object) Alignment.Horizontal.m1374toStringimpl(this.horizontalAlignment)) + ", verticalAlignment=" + ((Object) Alignment.Vertical.m1384toStringimpl(this.verticalAlignment)) + ", children=[\n" + childrenToString() + "\n])";
    }
}
