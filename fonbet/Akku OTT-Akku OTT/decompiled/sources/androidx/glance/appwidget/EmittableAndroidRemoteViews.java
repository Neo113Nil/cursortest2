package androidx.glance.appwidget;

import android.widget.RemoteViews;
import androidx.glance.Emittable;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Landroidx/glance/appwidget/EmittableAndroidRemoteViews;", "Landroidx/glance/EmittableWithChildren;", "()V", "containerViewId", "", "getContainerViewId", "()I", "setContainerViewId", "(I)V", "modifier", "Landroidx/glance/GlanceModifier;", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", "remoteViews", "Landroid/widget/RemoteViews;", "getRemoteViews", "()Landroid/widget/RemoteViews;", "setRemoteViews", "(Landroid/widget/RemoteViews;)V", "copy", "Landroidx/glance/Emittable;", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidRemoteViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRemoteViews.kt\nandroidx/glance/appwidget/EmittableAndroidRemoteViews\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1549#2:93\n1620#2,3:94\n*S KotlinDebug\n*F\n+ 1 AndroidRemoteViews.kt\nandroidx/glance/appwidget/EmittableAndroidRemoteViews\n*L\n82#1:93\n82#1:94,3\n*E\n"})
/* loaded from: classes.dex */
public final class EmittableAndroidRemoteViews extends EmittableWithChildren {
    private int containerViewId;
    private GlanceModifier modifier;
    public RemoteViews remoteViews;

    public EmittableAndroidRemoteViews() {
        super(0, false, 3, null);
        this.modifier = GlanceModifier.INSTANCE;
        this.containerViewId = -1;
    }

    @Override // androidx.glance.Emittable
    public Emittable copy() {
        int collectionSizeOrDefault;
        EmittableAndroidRemoteViews emittableAndroidRemoteViews = new EmittableAndroidRemoteViews();
        emittableAndroidRemoteViews.setModifier(getModifier());
        if (this.remoteViews != null) {
            emittableAndroidRemoteViews.setRemoteViews(getRemoteViews());
        }
        emittableAndroidRemoteViews.containerViewId = this.containerViewId;
        List<Emittable> children = emittableAndroidRemoteViews.getChildren();
        List<Emittable> children2 = getChildren();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(children2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = children2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Emittable) it.next()).copy());
        }
        children.addAll(arrayList);
        return emittableAndroidRemoteViews;
    }

    public final int getContainerViewId() {
        return this.containerViewId;
    }

    @Override // androidx.glance.Emittable
    public GlanceModifier getModifier() {
        return this.modifier;
    }

    public final RemoteViews getRemoteViews() {
        RemoteViews remoteViews = this.remoteViews;
        if (remoteViews != null) {
            return remoteViews;
        }
        Intrinsics.throwUninitializedPropertyAccessException("remoteViews");
        return null;
    }

    public final void setContainerViewId(int i) {
        this.containerViewId = i;
    }

    @Override // androidx.glance.Emittable
    public void setModifier(GlanceModifier glanceModifier) {
        this.modifier = glanceModifier;
    }

    public final void setRemoteViews(RemoteViews remoteViews) {
        this.remoteViews = remoteViews;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidRemoteViews(modifier=");
        sb.append(getModifier());
        sb.append(", containerViewId=");
        sb.append(this.containerViewId);
        sb.append(", remoteViews=");
        sb.append(this.remoteViews != null ? getRemoteViews() : null);
        sb.append(", children=[\n");
        sb.append(childrenToString());
        sb.append("\n])");
        return sb.toString();
    }
}
