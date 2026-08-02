package Zg0;

import Sc.A;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final int f35967a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f35968a;

        public a() {
            int maxMemory = (int) (Runtime.getRuntime().maxMemory() / UserVerificationMethods.USER_VERIFY_ALL);
            A.Companion companion = A.INSTANCE;
            this.f35968a = Integer.divideUnsigned(maxMemory, 8);
        }

        @NotNull
        public final j a() {
            return new j(this.f35968a);
        }
    }

    public j(int i11) {
        this.f35967a = i11;
    }

    public final int a() {
        return this.f35967a;
    }
}
