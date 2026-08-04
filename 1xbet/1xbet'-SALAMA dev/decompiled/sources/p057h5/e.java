package p057h5;

import A5.f;
import A5.s;
import android.content.Context;
import android.support.v4.media.session.t;
import p159w5.b;
import p159w5.c;

/* JADX INFO: loaded from: classes2.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f13608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f13609b;

    @Override // p159w5.c
    public final void onAttachedToEngine(b bVar) {
        Context context = bVar.f18081a;
        f fVar = bVar.f18083c;
        this.f13609b = new t(fVar, context);
        s sVar = new s(fVar, "com.ryanheise.just_audio.methods");
        this.f13608a = sVar;
        sVar.b(this.f13609b);
        bVar.f18082b.f16055t.add(new d(this, 0));
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(b bVar) {
        this.f13609b.Y();
        this.f13609b = null;
        this.f13608a.b(null);
    }
}
