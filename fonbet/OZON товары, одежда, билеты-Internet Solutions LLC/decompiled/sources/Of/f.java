package Of;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.function.Supplier;

/* loaded from: classes10.dex */
public final /* synthetic */ class f implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        return new StringBuilder(UserVerificationMethods.USER_VERIFY_ALL);
    }
}
