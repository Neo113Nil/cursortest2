package androidx.glance.layout;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.Emittable;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/glance/layout/EmittableBox;", "Landroidx/glance/EmittableWithChildren;", "()V", "contentAlignment", "Landroidx/glance/layout/Alignment;", "getContentAlignment", "()Landroidx/glance/layout/Alignment;", "setContentAlignment", "(Landroidx/glance/layout/Alignment;)V", "modifier", "Landroidx/glance/GlanceModifier;", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", "copy", "Landroidx/glance/Emittable;", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/glance/layout/EmittableBox\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1549#2:77\n1620#2,3:78\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/glance/layout/EmittableBox\n*L\n36#1:77\n36#1:78,3\n*E\n"})
/* loaded from: classes.dex */
public final class EmittableBox extends EmittableWithChildren {
    public static final int $stable = 8;
    private Alignment contentAlignment;
    private GlanceModifier modifier;

    public EmittableBox() {
        super(0, false, 3, null);
        this.modifier = GlanceModifier.INSTANCE;
        this.contentAlignment = Alignment.INSTANCE.getTopStart();
    }

    @Override // androidx.glance.Emittable
    public Emittable copy() {
        int collectionSizeOrDefault;
        EmittableBox emittableBox = new EmittableBox();
        emittableBox.setModifier(getModifier());
        emittableBox.contentAlignment = this.contentAlignment;
        List<Emittable> children = emittableBox.getChildren();
        List<Emittable> children2 = getChildren();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(children2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = children2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Emittable) it.next()).copy());
        }
        children.addAll(arrayList);
        return emittableBox;
    }

    public final Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    @Override // androidx.glance.Emittable
    public GlanceModifier getModifier() {
        return this.modifier;
    }

    public final void setContentAlignment(Alignment alignment) {
        this.contentAlignment = alignment;
    }

    @Override // androidx.glance.Emittable
    public void setModifier(GlanceModifier glanceModifier) {
        this.modifier = glanceModifier;
    }

    public String toString() {
        return "EmittableBox(modifier=" + getModifier() + ", contentAlignment=" + this.contentAlignment + "children=[\n" + childrenToString() + "\n])";
    }
}
