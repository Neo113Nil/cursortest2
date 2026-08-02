package Ve;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ve.g2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4258g2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C4258g2> CREATOR = new C4802z1();

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.coroutines.jvm.internal.j f31072a;

    public C4258g2() {
        this.f31072a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4258g2(Function1 function1) {
        this.f31072a = (kotlin.coroutines.jvm.internal.j) function1;
    }
}
