package D50;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import j3.w;
import j3.y;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import z50.C10989c;

/* loaded from: classes3.dex */
public final class a implements PikazonLoaderCallback<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f6081a;

    a(c cVar) {
        this.f6081a = cVar;
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
    @SuppressLint({"UnsafeOptInUsageError"})
    public final void onLoadFailed(Exception exc) {
        y.c cVar;
        y.c cVar2;
        c cVar3 = this.f6081a;
        Integer k11 = cVar3.k();
        Integer i11 = cVar3.i();
        cVar = cVar3.f6091g;
        StringBuilder f7 = Kk.c.f("onLoadFailed storyPos=", " framePos=", k11, i11, " listener=");
        f7.append(cVar);
        f7.append(" player=");
        f7.append(cVar3);
        C10989c.a("PicPlayer", f7.toString());
        cVar2 = cVar3.f6091g;
        if (cVar2 != null) {
            cVar2.onPlayerError(new w());
        }
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
    public final void onLoadSuccessful(Drawable drawable) {
        y.c cVar;
        y.c cVar2;
        c cVar3 = this.f6081a;
        Integer k11 = cVar3.k();
        Integer i11 = cVar3.i();
        cVar = cVar3.f6091g;
        StringBuilder f7 = Kk.c.f("onLoadSuccessful storyPos=", " framePos=", k11, i11, " listener=");
        f7.append(cVar);
        f7.append(" player=");
        f7.append(cVar3);
        C10989c.a("PicPlayer", f7.toString());
        cVar2 = cVar3.f6091g;
        if (cVar2 != null) {
            cVar2.onPlaybackStateChanged(3);
        }
    }
}
