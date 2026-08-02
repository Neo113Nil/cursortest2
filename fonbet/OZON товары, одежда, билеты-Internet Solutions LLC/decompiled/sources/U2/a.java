package U2;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class a extends AbstractC7737t implements Function0<SharedPreferences> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f27275b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(Context context) {
        super(0);
        this.f27275b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        SharedPreferences sharedPreferences = this.f27275b.getSharedPreferences("vkpns_client_sdk", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
