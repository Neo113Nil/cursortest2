package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes6.dex */
public final class Ag extends Sp {
    public final Tp d;
    public Bf e;
    public final X8 f;
    public final Y9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ag(Context context, Ej adContainer, Tp mViewableAd, CoroutineScope hybridScope, Bf bf, X8 x8, Y9 y9) {
        super(adContainer);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(mViewableAd, "mViewableAd");
        Intrinsics.checkNotNullParameter(hybridScope, "hybridScope");
        this.d = mViewableAd;
        this.e = bf;
        this.f = x8;
        this.g = y9;
        CoroutineScope a2 = AbstractC4012q5.a(hybridScope);
        Intrinsics.checkNotNullParameter(context, "context");
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ag", "TAG");
            ((Z9) y9).b("Ag", "initializeOMSDK called");
        }
        int i = AbstractC3910mg.f7248a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        AbstractC3910mg.a(applicationContext);
        BuildersKt__Builders_commonKt.launch$default(a2, null, null, new C4272zg(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Ag ag, ContinuationImpl continuationImpl) {
        C4244yg c4244yg;
        int i;
        X8 x8;
        Y9 y9;
        ag.getClass();
        if (continuationImpl instanceof C4244yg) {
            c4244yg = (C4244yg) continuationImpl;
            int i2 = c4244yg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4244yg.c = i2 - Integer.MIN_VALUE;
                Object obj = c4244yg.f7503a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4244yg.c;
                Unit unit = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4051rg c4051rg = C4051rg.f7353a;
                    c4244yg.c = 1;
                    Context context = AbstractC3914mk.f7252a;
                    obj = context == null ? "" : BuildersKt.withContext(Dispatchers.getIO(), new C3995pg(context, null), c4244yg);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String str = (String) obj;
                x8 = ag.f;
                if (x8 != null) {
                    Bf bf = ag.e;
                    if (bf != null) {
                        bf.a(str, x8.f6945a, x8.b, x8.d, x8.c, x8.e);
                        unit = Unit.INSTANCE;
                    }
                }
                y9 = ag.g;
                if (y9 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ag", "TAG");
                    ((Z9) y9).a("Ag", "OmidInfo is null, cannot track ad");
                    Unit unit2 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        c4244yg = new C4244yg(ag, continuationImpl);
        Object obj2 = c4244yg.f7503a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4244yg.c;
        Unit unit3 = null;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        x8 = ag.f;
        if (x8 != null) {
        }
        y9 = ag.g;
        if (y9 != null) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.Tp
    public final View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.Tp
    public final View c() {
        Y9 y9 = this.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ag", "TAG");
            ((Z9) y9).c("Ag", "inflateView called");
        }
        return this.d.c();
    }

    @Override // com.inmobi.media.Tp
    public final boolean d() {
        Bf bf = this.e;
        return !(bf == null || bf.c == null) || this.d.d();
    }

    @Override // com.inmobi.media.Tp
    public final void e() {
        Y9 y9 = this.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ag", "TAG");
            ((Z9) y9).a("Ag", "stopTrackingForImpression");
        }
        this.d.e();
    }

    @Override // com.inmobi.media.Tp
    public final void a(View childView, FriendlyObstructionPurpose friendlyObstruction) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(friendlyObstruction, "obstructionCode");
        Bf bf = this.e;
        if (bf != null) {
            Intrinsics.checkNotNullParameter(childView, "childView");
            Intrinsics.checkNotNullParameter(friendlyObstruction, "friendlyObstruction");
            if (bf.c == null) {
                Y9 y9 = bf.b;
                if (y9 != null) {
                    ((Z9) y9).a(AbstractC3724g1.f, "Failed to addObstruction: adSession is null");
                    return;
                }
                return;
            }
            Y9 y92 = bf.b;
            if (y92 != null) {
                ((Z9) y92).a(AbstractC3724g1.f, "addObstruction");
            }
            AbstractC4012q5.a(bf.f7114a, new Z0(bf, childView, friendlyObstruction, null));
        }
    }

    @Override // com.inmobi.media.Tp
    public final void a(View childView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Bf bf = this.e;
        if (bf != null) {
            Intrinsics.checkNotNullParameter(childView, "childView");
            if (bf.c == null) {
                return;
            }
            AbstractC4012q5.a(bf.f7114a, new C3612c1(bf, childView, null));
        }
    }

    @Override // com.inmobi.media.Tp
    public final void a(Map map) {
        Y9 y9 = this.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ag", "TAG");
            ((Z9) y9).a("Ag", "startTrackingForImpression");
        }
        this.d.a(map);
    }

    @Override // com.inmobi.media.Tp
    public final void a(Context context, byte b) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d.a(context, b);
    }

    @Override // com.inmobi.media.Tp
    public final void a() {
        Y9 y9 = this.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ag", "TAG");
            ((Z9) y9).c("Ag", "destroy");
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.e = null;
        this.d.a();
    }
}
