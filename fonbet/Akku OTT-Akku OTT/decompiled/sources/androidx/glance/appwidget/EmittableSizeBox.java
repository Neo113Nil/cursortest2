package androidx.glance.appwidget;

import androidx.compose.ui.unit.DpSize;
import androidx.glance.Emittable;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import androidx.glance.appwidget.SizeMode;
import androidx.glance.layout.SizeModifiersKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR%\u0010\n\u001a\u00020\u000bX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/glance/appwidget/EmittableSizeBox;", "Landroidx/glance/EmittableWithChildren;", "()V", "<anonymous parameter 0>", "Landroidx/glance/GlanceModifier;", "modifier", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", "size", "Landroidx/compose/ui/unit/DpSize;", "getSize-MYxV2XQ", "()J", "setSize-EaSLcWc", "(J)V", "J", "sizeMode", "Landroidx/glance/appwidget/SizeMode;", "getSizeMode", "()Landroidx/glance/appwidget/SizeMode;", "setSizeMode", "(Landroidx/glance/appwidget/SizeMode;)V", "copy", "Landroidx/glance/Emittable;", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSizeBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SizeBox.kt\nandroidx/glance/appwidget/EmittableSizeBox\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1549#2:118\n1620#2,3:119\n*S KotlinDebug\n*F\n+ 1 SizeBox.kt\nandroidx/glance/appwidget/EmittableSizeBox\n*L\n51#1:118\n51#1:119,3\n*E\n"})
/* loaded from: classes.dex */
public final class EmittableSizeBox extends EmittableWithChildren {
    private long size;
    private SizeMode sizeMode;

    public EmittableSizeBox() {
        super(0, false, 3, null);
        this.size = DpSize.INSTANCE.m1128getUnspecifiedMYxV2XQ();
        this.sizeMode = SizeMode.Single.INSTANCE;
    }

    @Override // androidx.glance.Emittable
    public Emittable copy() {
        int collectionSizeOrDefault;
        EmittableSizeBox emittableSizeBox = new EmittableSizeBox();
        emittableSizeBox.size = this.size;
        emittableSizeBox.sizeMode = this.sizeMode;
        List<Emittable> children = emittableSizeBox.getChildren();
        List<Emittable> children2 = getChildren();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(children2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = children2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Emittable) it.next()).copy());
        }
        children.addAll(arrayList);
        return emittableSizeBox;
    }

    @Override // androidx.glance.Emittable
    public GlanceModifier getModifier() {
        GlanceModifier modifier;
        Emittable emittable = (Emittable) CollectionsKt.singleOrNull((List) getChildren());
        return (emittable == null || (modifier = emittable.getModifier()) == null) ? SizeModifiersKt.fillMaxSize(GlanceModifier.INSTANCE) : modifier;
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    public final SizeMode getSizeMode() {
        return this.sizeMode;
    }

    @Override // androidx.glance.Emittable
    public void setModifier(GlanceModifier glanceModifier) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    /* renamed from: setSize-EaSLcWc, reason: not valid java name */
    public final void m1306setSizeEaSLcWc(long j) {
        this.size = j;
    }

    public final void setSizeMode(SizeMode sizeMode) {
        this.sizeMode = sizeMode;
    }

    public String toString() {
        return "EmittableSizeBox(size=" + ((Object) DpSize.m1126toStringimpl(this.size)) + ", sizeMode=" + this.sizeMode + ", children=[\n" + childrenToString() + "\n])";
    }
}
