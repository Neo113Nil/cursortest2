package androidx.compose.ui.platform;

import Sc.InterfaceC4003e;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class T0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Class<? extends Object>[] f40738a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(Object obj) {
        if (obj instanceof c1.t) {
            c1.t tVar = (c1.t) obj;
            if (tVar.a() == S0.n1.h() || tVar.a() == S0.n1.n() || tVar.a() == S0.n1.k()) {
                T value = tVar.getValue();
                if (value == 0) {
                    return true;
                }
                return b(value);
            }
        } else {
            if ((obj instanceof InterfaceC4003e) && (obj instanceof Serializable)) {
                return false;
            }
            Class<? extends Object>[] clsArr = f40738a;
            for (int i11 = 0; i11 < 7; i11++) {
                if (clsArr[i11].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
