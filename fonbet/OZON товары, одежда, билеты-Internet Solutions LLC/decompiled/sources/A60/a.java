package A60;

import android.content.Intent;
import com.vk.id.internal.auth.AuthActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Cloneable f508c;

    public /* synthetic */ a(Object obj, Cloneable cloneable, int i11) {
        this.f506a = i11;
        this.f507b = obj;
        this.f508c = cloneable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit onNewIntent$lambda$5;
        switch (this.f506a) {
            case 0:
                return b.e((b) this.f507b, (byte[]) this.f508c);
            default:
                onNewIntent$lambda$5 = AuthActivity.onNewIntent$lambda$5((AuthActivity) this.f507b, (Intent) this.f508c);
                return onNewIntent$lambda$5;
        }
    }
}
