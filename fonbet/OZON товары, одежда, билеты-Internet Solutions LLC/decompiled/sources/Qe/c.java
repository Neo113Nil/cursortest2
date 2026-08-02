package Qe;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7704k<char[]> f23333a = new C7704k<>();

    /* renamed from: b, reason: collision with root package name */
    private int f23334b;

    protected final void a(@NotNull char[] array) {
        int i11;
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                int length = this.f23334b + array.length;
                i11 = C3857a.f23331a;
                if (length < i11) {
                    this.f23334b += array.length;
                    this.f23333a.addLast(array);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    protected final char[] b() {
        char[] cArr;
        synchronized (this) {
            C7704k<char[]> c7704k = this.f23333a;
            cArr = null;
            char[] removeLast = c7704k.isEmpty() ? null : c7704k.removeLast();
            if (removeLast != null) {
                this.f23334b -= removeLast.length;
                cArr = removeLast;
            }
        }
        return cArr == null ? new char[UserVerificationMethods.USER_VERIFY_PATTERN] : cArr;
    }
}
