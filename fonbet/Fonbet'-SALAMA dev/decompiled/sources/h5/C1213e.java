package h5;

import A5.f;
import A5.s;
import android.content.Context;
import android.support.v4.media.session.t;
import w5.C1782b;
import w5.InterfaceC1783c;

/* renamed from: h5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1213e implements InterfaceC1783c {

    /* renamed from: a, reason: collision with root package name */
    public s f13602a;

    /* renamed from: b, reason: collision with root package name */
    public t f13603b;

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        Context context = c1782b.f18075a;
        f fVar = c1782b.f18077c;
        this.f13603b = new t(fVar, context);
        s sVar = new s(fVar, "com.ryanheise.just_audio.methods");
        this.f13602a = sVar;
        sVar.b(this.f13603b);
        c1782b.f18076b.f16049t.add(new C1212d(this, 0));
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        this.f13603b.Y();
        this.f13603b = null;
        this.f13602a.b(null);
    }
}
