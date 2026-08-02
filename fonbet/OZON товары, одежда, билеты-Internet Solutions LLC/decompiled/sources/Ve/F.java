package Ve;

import Lm0.a;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class F extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f28954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Context context, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f28954d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new F(this.f28954d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new F(this.f28954d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        S7.s a11;
        Context context = this.f28954d;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        try {
            a11 = U0.a(context);
        } catch (Exception e11) {
            a.b bVar = Lm0.a.f17149a;
            bVar.e("TinkStreamingAead::createAead catch error " + e11, new Object[0]);
            U0 u02 = U0.f30086a;
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("__androidx_security_crypto_encrypted_file_pref__", 0);
                if (sharedPreferences.contains("__androidx_security_crypto_encrypted_file_keyset__")) {
                    sharedPreferences.edit().remove("__androidx_security_crypto_encrypted_file_keyset__").apply();
                    bVar.i("Keyset __androidx_security_crypto_encrypted_file_keyset__ was deleted from SharedPreferences", new Object[0]);
                }
            } catch (Exception e12) {
                Lm0.a.f17149a.e("TinkStreamingAead::deleteKeysetFromPrefs catch error " + e12, new Object[0]);
            }
            a11 = U0.a(context);
        }
        U0.f30088c = a11;
        return Unit.f71690a;
    }
}
