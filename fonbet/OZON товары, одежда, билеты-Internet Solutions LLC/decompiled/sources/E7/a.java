package E7;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class a extends ApiException {
    public a(int i11) {
        super(new Status(i11, String.format(Locale.getDefault(), "Install Error(%d): %s", Integer.valueOf(i11), F7.a.a(i11))));
        if (i11 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
