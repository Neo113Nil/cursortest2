package X40;

import V5.q;
import android.graphics.drawable.Drawable;
import j3.w;
import j3.y;
import kotlin.jvm.internal.Intrinsics;
import l6.h;

/* loaded from: classes3.dex */
public final class a implements h<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f34067a;

    a(c cVar) {
        this.f34067a = cVar;
    }

    @Override // l6.h
    public final boolean onLoadFailed(q qVar, Object obj, m6.h<Drawable> target, boolean z11) {
        y.c cVar;
        y.c cVar2;
        Intrinsics.checkNotNullParameter(target, "target");
        c cVar3 = this.f34067a;
        Integer g10 = cVar3.g();
        cVar = cVar3.f34075e;
        U40.c.a("PicPlayer", "onLoadFailed framePos=" + g10 + " listener=" + cVar + " player=" + cVar3);
        cVar2 = cVar3.f34075e;
        if (cVar2 != null) {
            cVar2.onPlayerError(new w());
        }
        return false;
    }

    @Override // l6.h
    public final boolean onResourceReady(Drawable drawable, Object model, m6.h<Drawable> hVar, T5.a dataSource, boolean z11) {
        y.c cVar;
        y.c cVar2;
        Drawable resource = drawable;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        c cVar3 = this.f34067a;
        Integer g10 = cVar3.g();
        cVar = cVar3.f34075e;
        U40.c.a("PicPlayer", "onResourceReady framePos=" + g10 + " listener=" + cVar + " player=" + cVar3);
        cVar2 = cVar3.f34075e;
        if (cVar2 == null) {
            return false;
        }
        cVar2.onPlaybackStateChanged(3);
        return false;
    }
}
