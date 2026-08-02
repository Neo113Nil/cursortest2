package androidx.work.impl.model;

import android.app.Activity;
import android.app.PendingIntent;
import androidx.core.app.ActivityCompat;
import fman.ge.smart_auth.SmartAuthPlugin;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1;
        switch (this.a) {
            case 0:
                lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1 = ((RawWorkInfoDao_Impl) this.b).lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1((HashMap) obj);
                return lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1;
            default:
                PendingIntent pendingIntent = (PendingIntent) obj;
                Activity activity = ((SmartAuthPlugin) this.b).b;
                if (activity != null) {
                    Intrinsics.checkNotNull(activity);
                    ActivityCompat.startIntentSenderForResult(activity, pendingIntent.getIntentSender(), 11100, null, 0, 0, 0, null);
                }
                return Unit.INSTANCE;
        }
    }
}
