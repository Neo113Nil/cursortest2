package R5;

import android.util.Log;
import f6.C1112e;
import f6.C1113f;
import f6.C1116i;
import kotlin.jvm.functions.Function1;

/* renamed from: R5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0412h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f6168a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((C1113f) obj).f13003a instanceof C1112e) {
            Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + this.f6168a);
        }
        return C1116i.f13008a;
    }
}
