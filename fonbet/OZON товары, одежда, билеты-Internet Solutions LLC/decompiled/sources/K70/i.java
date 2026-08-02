package K70;

import Sc.s;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.otp.sms.network.OtpKeyData;
import ru.ozon.fintech.features.otp.sms.network.OtpSmsNetworkApi;

/* loaded from: classes3.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final R30.a f15358a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f15359b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final OtpSmsNetworkApi f15360c;

    public i(@NotNull R30.a appCoroutineScopes, @NotNull SharedPreferences sharedPreferences, @NotNull OtpSmsNetworkApi networkApi) {
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(networkApi, "networkApi");
        this.f15358a = appCoroutineScopes;
        this.f15359b = sharedPreferences;
        this.f15360c = networkApi;
    }

    @Override // K70.g
    @NotNull
    public final String c() {
        String string = this.f15359b.getString("otp_key", "");
        return string == null ? "" : string;
    }

    @Override // K70.g
    public final void d() {
        SharedPreferences.Editor edit = this.f15359b.edit();
        edit.remove("otp_key");
        edit.commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // K70.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        i iVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f15357g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f15357g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f15355e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f15357g;
                if (i11 != 0) {
                    s.b(obj);
                    hVar.f15354d = this;
                    hVar.f15357g = 1;
                    obj = this.f15360c.getKey(hVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    iVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = hVar.f15354d;
                    s.b(obj);
                }
                SharedPreferences.Editor edit = iVar.f15359b.edit();
                edit.putString("otp_key", ((OtpKeyData) obj).getPrivateKey());
                edit.commit();
                return Boolean.TRUE;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f15355e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f15357g;
        if (i11 != 0) {
        }
        SharedPreferences.Editor edit2 = iVar.f15359b.edit();
        edit2.putString("otp_key", ((OtpKeyData) obj2).getPrivateKey());
        edit2.commit();
        return Boolean.TRUE;
    }
}
