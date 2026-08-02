package I2;

import D2.e;
import D2.g;
import D2.h;
import D2.k;
import D2.m;
import D2.o;
import D2.p;
import D2.r;
import D2.t;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0229a f11796a = new C0229a(0);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Set<Integer> f11797b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f11798c;

    /* renamed from: I2.a$a, reason: collision with other inner class name */
    public static final class C0229a {
        public /* synthetic */ C0229a(int i11) {
            this();
        }

        @NotNull
        public static g a(String str, String str2) {
            return Intrinsics.d(str, "CREATE_CANCELED") ? new e(str2) : Intrinsics.d(str, "CREATE_INTERRUPTED") ? new h(str2) : new k(str2);
        }

        @NotNull
        public static o b(String str, String str2) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            return new t(str2);
                        }
                    } else if (str.equals("GET_INTERRUPTED")) {
                        return new p(str2);
                    }
                } else if (str.equals("GET_CANCELED_TAG")) {
                    return new m(str2);
                }
            }
            return new r(str2);
        }

        private C0229a() {
        }
    }

    static {
        Integer[] elements = {7, 20};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f11797b = C7705l.j0(elements);
        f11798c = 1;
    }

    protected static void b(@NotNull ResultReceiver resultReceiver, @NotNull Intent hiddenIntent, @NotNull String typeTag) {
        Intrinsics.checkNotNullParameter(resultReceiver, "resultReceiver");
        Intrinsics.checkNotNullParameter(hiddenIntent, "hiddenIntent");
        Intrinsics.checkNotNullParameter(typeTag, "typeTag");
        hiddenIntent.putExtra("TYPE", typeTag);
        hiddenIntent.putExtra("ACTIVITY_REQUEST_CODE", f11798c);
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        Intrinsics.f(resultReceiver);
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        hiddenIntent.putExtra("RESULT_RECEIVER", resultReceiver2);
        hiddenIntent.setFlags(65536);
    }

    protected static final int c() {
        f11796a.getClass();
        return f11798c;
    }
}
